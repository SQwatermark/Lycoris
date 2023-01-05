package net.coderbot.iris.pipeline;

import net.coderbot.iris.Iris;
import net.minecraftforge.fml.loading.FMLEnvironment;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Static class that deals with printing the patched_shader folder.
 */
public class PatchedShaderPrinter {
	private static boolean outputLocationCleared = false;
	private static int programCounter = 0;
	public static final boolean prettyPrintShaders = !FMLEnvironment.production
			|| System.getProperty("iris.prettyPrintShaders", "false").equals("true");

	public static void resetPrintState() {
		outputLocationCleared = false;
		programCounter = 0;
	}

	public static void debugPatchedShaders(String name, String vertex, String geometry, String fragment, String json) {
		if (prettyPrintShaders) {
			final Path debugOutDir = Paths.get("patched_shaders");
			if (!outputLocationCleared) {
				try {
					if (Files.exists(debugOutDir)) {
						try (Stream<Path> stream = Files.list(debugOutDir)) {
							stream.forEach(path -> {
								try {
									Files.delete(path);
								} catch (IOException e) {
									throw new RuntimeException(e);
								}
							});
						}
					}

					Files.createDirectories(debugOutDir);
				} catch (IOException e) {
					Iris.logger.warn("Failed to initialize debug patched shader source location", e);
				}
				outputLocationCleared = true;
			}

			try {
				programCounter++;
				String prefix = String.format("%03d_", programCounter);
				if (vertex != null) {
					Files.write(debugOutDir.resolve(prefix + name + ".vsh"), vertex.getBytes(StandardCharsets.UTF_8));
				}
				if (geometry != null) {
					Files.write(debugOutDir.resolve(prefix + name + ".gsh"), geometry.getBytes(StandardCharsets.UTF_8));
				}
				if (fragment != null) {
					Files.write(debugOutDir.resolve(prefix + name + ".fsh"), fragment.getBytes(StandardCharsets.UTF_8));
				}
				if (json != null) {
					Files.write(debugOutDir.resolve(prefix + name + ".json"), json.getBytes(StandardCharsets.UTF_8));
				}
			} catch (IOException e) {
				Iris.logger.warn("Failed to write debug patched shader source", e);
			}
		}
	}

	public static void debugPatchedShaders(String name, String vertex, String geometry, String fragment) {
		debugPatchedShaders(name, vertex, geometry, fragment, null);
	}
}
