package net.coderbot.iris;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import net.coderbot.iris.config.IrisConfig;
import net.coderbot.iris.gl.shader.StandardMacros;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.ClickEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TextComponent;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.maven.artifact.versioning.ArtifactVersion;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class UpdateChecker {
	private final ArtifactVersion currentVersion;
	private CompletableFuture<UpdateInfo> info;
	private boolean shouldShowUpdateMessage;
	private boolean usedIrisInstaller;

	public UpdateChecker(ArtifactVersion currentVersion) {
		this.currentVersion = currentVersion;
		if (Objects.equals(System.getProperty("iris.installer", "false"), "true")) {
			usedIrisInstaller = true;
		}
	}

	public void checkForUpdates(IrisConfig irisConfig) {
		if (irisConfig.shouldDisableUpdateMessage()) {
			shouldShowUpdateMessage = false;
			return;
		}

		this.info = CompletableFuture.supplyAsync(() -> {
			return null;
		});
	}

	@Nullable
	public UpdateInfo getUpdateInfo() {
		if (info != null && info.isDone()) {
			try {
				return info.get();
			} catch (InterruptedException | ExecutionException e) {
				throw new RuntimeException(e);
			}
		}

		return null;
	}

	public Optional<Component> getUpdateMessage() {
		if (shouldShowUpdateMessage) {
			UpdateInfo info = getUpdateInfo();

			if (info == null) {
				return Optional.empty();
			}

			String languageCode = Minecraft.getInstance().options.languageCode.toLowerCase(Locale.ROOT);
			String originalText = info.updateInfo.containsKey(languageCode) ? info.updateInfo.get(languageCode) : info.updateInfo.get("en_us");
			String[] textParts = originalText.split("\\{link}");
			if (textParts.length > 1) {
				MutableComponent component1 = new TextComponent(textParts[0]);
				MutableComponent component2 = new TextComponent(textParts[1]);
				MutableComponent link = new TextComponent(usedIrisInstaller ? "the Iris Installer" : info.modHost).withStyle(arg -> arg.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, usedIrisInstaller ? info.installer : info.modDownload)).withUnderlined(true));
				return Optional.of(component1.append(link).append(component2));
			} else {
				MutableComponent link = new TextComponent(usedIrisInstaller ? "the Iris Installer" : info.modHost).withStyle(arg -> arg.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, usedIrisInstaller ? info.installer : info.modDownload)).withUnderlined(true));
				return Optional.of(new TextComponent(textParts[0]).append(link));
			}
		} else {
			return Optional.empty();
		}
	}

	public Optional<String> getUpdateLink() {
		if (shouldShowUpdateMessage) {
			UpdateInfo info = getUpdateInfo();

			return Optional.of(usedIrisInstaller ? info.installer : info.modDownload);
		} else {
			return Optional.empty();
		}
	}

	static class UpdateInfo {
		public String semanticVersion;
		public Map<String, String> updateInfo;
		public String modHost;
		public String modDownload;
		public String installer;
	}
}
