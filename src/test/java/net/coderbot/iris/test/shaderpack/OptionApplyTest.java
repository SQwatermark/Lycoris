package net.coderbot.iris.test.shaderpack;

import com.google.common.collect.ImmutableMap;
import net.coderbot.iris.shaderpack.DimensionId;
import net.coderbot.iris.shaderpack.ProgramSource;
import net.coderbot.iris.shaderpack.ShaderPack;
import net.coderbot.iris.shaderpack.include.AbsolutePackPath;
import net.coderbot.iris.shaderpack.option.OptionAnnotatedSource;
import net.coderbot.iris.shaderpack.option.OptionSet;
import net.coderbot.iris.shaderpack.option.OptionValues;
import net.coderbot.iris.test.IrisTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class OptionApplyTest {
	@Test
	void testOptions() {
		ShaderPack shaderPack;

		// ensure that we can actually load the shader pack
		try {
			shaderPack = new ShaderPack("Option Apply Test", IrisTests.getTestShaderPackPath("options"));
		} catch (Exception e) {
			Assertions.fail("Couldn't load test shader pack options", e);
			return;
		}

		ProgramSource basic = shaderPack
				.getProgramSet(DimensionId.OVERWORLD)
				.getGbuffersBasic()
				.orElseThrow(RuntimeException::new);

		String basicVsh = basic.getVertexSource().orElseThrow(RuntimeException::new);
		String basicFsh = basic.getFragmentSource().orElseThrow(RuntimeException::new);

		OptionAnnotatedSource basicVshAnnotated = new OptionAnnotatedSource(basicVsh);
		OptionAnnotatedSource basicFshAnnotated = new OptionAnnotatedSource(basicFsh);

		// TODO: Separate includes will need more complex boolean define reference behavior
		OptionSet basicVshSet = basicVshAnnotated.getOptionSet(
				AbsolutePackPath.fromAbsolutePath("/basic.vsh"),
				basicVshAnnotated.getBooleanDefineReferences().keySet());
		OptionSet basicFshSet = basicFshAnnotated.getOptionSet(
				AbsolutePackPath.fromAbsolutePath("/basic.fsh"),
				basicFshAnnotated.getBooleanDefineReferences().keySet());

		OptionSet.Builder setBuilder = OptionSet.builder();

		setBuilder.addAll(basicVshSet);
		setBuilder.addAll(basicFshSet);

		OptionSet options = setBuilder.build();

		Map<String, String> changes = ImmutableMap.of(
				"SHADOWS", "false",
				"ambientOcclusionLevel", "0.0",
				"shadowDistance", "64",
				"ANNOYING_STUFF", "true",
				"GODRAYS", "16"
		);

		OptionValues values = new OptionValues(options, changes);

		System.out.println(basicVshAnnotated.apply(values));
		System.out.println(basicFshAnnotated.apply(values));

		System.out.println(options);
	}

	@Test
	void testWeirdDefine() {
		// TODO: Fix OptionAnnotatedSource so that this test doesn't fail
		testTrivial(
				"#define NAME fine // [fine notfine]",
				ImmutableMap.of("NAME", "notfine"),
				"#define NAME notfine // [fine notfine]\n"
		);
	}

	@Test
	void testWeirdDefine2() {
		// TODO: Fix OptionAnnotatedSource so that this test doesn't fail
		testTrivial(
				"#define MODE_DEFAULT MODE_D // [MODE_A MODE_D]",
				ImmutableMap.of("MODE_DEFAULT", "MODE_A"),
				"#define MODE_DEFAULT MODE_A // [MODE_A MODE_D]\n"
		);
	}

	private void testTrivial(String base, ImmutableMap<String, String> changes, String expected) {
		OptionAnnotatedSource source = new OptionAnnotatedSource(base);
		OptionSet options = source.getOptionSet(
				AbsolutePackPath.fromAbsolutePath("/<hardcoded>"),
				source.getBooleanDefineReferences().keySet());
		OptionValues values = new OptionValues(options, changes);

		Assertions.assertEquals(expected, source.apply(values));
	}
}
