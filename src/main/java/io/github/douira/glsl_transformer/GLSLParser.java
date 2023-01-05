// Generated from java-escape by ANTLR 4.11.1
package io.github.douira.glsl_transformer;

import io.github.douira.glsl_transformer.parser.ExtendedParser;

import move.org.antlr.v4.runtime.atn.*;
import move.org.antlr.v4.runtime.dfa.DFA;
import move.org.antlr.v4.runtime.*;
import move.org.antlr.v4.runtime.misc.*;
import move.org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GLSLParser extends ExtendedParser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, UNIFORM=2, BUFFER=3, IN=4, OUT=5, INOUT=6, HIGHP=7, MEDIUMP=8, 
		LOWP=9, PRECISION=10, CONST=11, PRECISE=12, INVARIANT=13, SMOOTH=14, FLAT=15, 
		CENTROID=16, ATTRIBUTE=17, VOLATILE=18, VARYING=19, SHARED=20, LAYOUT=21, 
		DOT_LENGTH_METHOD_CALL=22, NOPERSPECTIVE=23, SAMPLE=24, PATCH=25, COHERENT=26, 
		RESTRICT=27, READONLY=28, WRITEONLY=29, SUBROUTINE=30, DEVICECOHERENT=31, 
		QUEUEFAMILYCOHERENT=32, WORKGROUPCOHERENT=33, SUBGROUPCOHERENT=34, NONPRIVATE=35, 
		ATOMIC_UINT=36, STRUCT=37, IF=38, ELSE=39, SWITCH=40, CASE=41, DEFAULT=42, 
		WHILE=43, DO=44, FOR=45, CONTINUE=46, BREAK=47, RETURN=48, DISCARD=49, 
		DEMOTE=50, UINT16CONSTANT=51, INT16CONSTANT=52, UINT32CONSTANT=53, INT32CONSTANT=54, 
		UINT64CONSTANT=55, INT64CONSTANT=56, FLOAT16CONSTANT=57, FLOAT32CONSTANT=58, 
		FLOAT64CONSTANT=59, BOOLCONSTANT=60, BOOL=61, BVEC2=62, BVEC3=63, BVEC4=64, 
		INT8=65, I8VEC2=66, I8VEC3=67, I8VEC4=68, UINT8=69, U8VEC2=70, U8VEC3=71, 
		U8VEC4=72, INT16=73, I16VEC2=74, I16VEC3=75, I16VEC4=76, UINT16=77, U16VEC2=78, 
		U16VEC3=79, U16VEC4=80, INT32=81, I32VEC2=82, I32VEC3=83, I32VEC4=84, 
		UINT32=85, U32VEC2=86, U32VEC3=87, U32VEC4=88, INT64=89, I64VEC2=90, I64VEC3=91, 
		I64VEC4=92, UINT64=93, U64VEC2=94, U64VEC3=95, U64VEC4=96, FLOAT16=97, 
		F16VEC2=98, F16VEC3=99, F16VEC4=100, F16MAT2X2=101, F16MAT2X3=102, F16MAT2X4=103, 
		F16MAT3X2=104, F16MAT3X3=105, F16MAT3X4=106, F16MAT4X2=107, F16MAT4X3=108, 
		F16MAT4X4=109, FLOAT32=110, F32VEC2=111, F32VEC3=112, F32VEC4=113, F32MAT2X2=114, 
		F32MAT2X3=115, F32MAT2X4=116, F32MAT3X2=117, F32MAT3X3=118, F32MAT3X4=119, 
		F32MAT4X2=120, F32MAT4X3=121, F32MAT4X4=122, FLOAT64=123, F64VEC2=124, 
		F64VEC3=125, F64VEC4=126, F64MAT2X2=127, F64MAT2X3=128, F64MAT2X4=129, 
		F64MAT3X2=130, F64MAT3X3=131, F64MAT3X4=132, F64MAT4X2=133, F64MAT4X3=134, 
		F64MAT4X4=135, IMAGE1D=136, IMAGE2D=137, IMAGE3D=138, UIMAGE1D=139, UIMAGE2D=140, 
		UIMAGE3D=141, IIMAGE1D=142, IIMAGE2D=143, IIMAGE3D=144, SAMPLER1D=145, 
		SAMPLER2D=146, SAMPLER3D=147, SAMPLER2DRECT=148, SAMPLER1DSHADOW=149, 
		SAMPLER2DSHADOW=150, SAMPLER2DRECTSHADOW=151, SAMPLER1DARRAY=152, SAMPLER2DARRAY=153, 
		SAMPLER1DARRAYSHADOW=154, SAMPLER2DARRAYSHADOW=155, ISAMPLER1D=156, ISAMPLER2D=157, 
		ISAMPLER2DRECT=158, ISAMPLER3D=159, ISAMPLER1DARRAY=160, ISAMPLER2DARRAY=161, 
		USAMPLER1D=162, USAMPLER2D=163, USAMPLER2DRECT=164, USAMPLER3D=165, USAMPLER1DARRAY=166, 
		USAMPLER2DARRAY=167, SAMPLER2DMS=168, ISAMPLER2DMS=169, USAMPLER2DMS=170, 
		SAMPLER2DMSARRAY=171, ISAMPLER2DMSARRAY=172, USAMPLER2DMSARRAY=173, IMAGE2DRECT=174, 
		IMAGE1DARRAY=175, IMAGE2DARRAY=176, IMAGE2DMS=177, IMAGE2DMSARRAY=178, 
		IIMAGE2DRECT=179, IIMAGE1DARRAY=180, IIMAGE2DARRAY=181, IIMAGE2DMS=182, 
		IIMAGE2DMSARRAY=183, UIMAGE2DRECT=184, UIMAGE1DARRAY=185, UIMAGE2DARRAY=186, 
		UIMAGE2DMS=187, UIMAGE2DMSARRAY=188, SAMPLERCUBESHADOW=189, SAMPLERCUBEARRAYSHADOW=190, 
		SAMPLERCUBE=191, ISAMPLERCUBE=192, USAMPLERCUBE=193, SAMPLERBUFFER=194, 
		ISAMPLERBUFFER=195, USAMPLERBUFFER=196, SAMPLERCUBEARRAY=197, ISAMPLERCUBEARRAY=198, 
		USAMPLERCUBEARRAY=199, IMAGECUBE=200, UIMAGECUBE=201, IIMAGECUBE=202, 
		IMAGEBUFFER=203, IIMAGEBUFFER=204, UIMAGEBUFFER=205, IMAGECUBEARRAY=206, 
		IIMAGECUBEARRAY=207, UIMAGECUBEARRAY=208, INC_OP=209, DEC_OP=210, VOID=211, 
		LEFT_OP=212, RIGHT_OP=213, LE_OP=214, GE_OP=215, EQ_OP=216, NE_OP=217, 
		LOGICAL_AND_OP=218, LOGICAL_XOR_OP=219, LOGICAL_OR_OP=220, MUL_ASSIGN=221, 
		DIV_ASSIGN=222, MOD_ASSIGN=223, ADD_ASSIGN=224, SUB_ASSIGN=225, LEFT_ASSIGN=226, 
		RIGHT_ASSIGN=227, AND_ASSIGN=228, XOR_ASSIGN=229, OR_ASSIGN=230, LPAREN=231, 
		RPAREN=232, LBRACE=233, RBRACE=234, SEMICOLON=235, LBRACKET=236, RBRACKET=237, 
		COMMA=238, DOT=239, PLUS_OP=240, MINUS_OP=241, LOGICAL_NOT_OP=242, BITWISE_NEG_OP=243, 
		TIMES_OP=244, DIV_OP=245, MOD_OP=246, LT_OP=247, GT_OP=248, BITWISE_AND_OP=249, 
		BITWISE_OR_OP=250, BITWISE_XOR_OP=251, QUERY_OP=252, ASSIGN_OP=253, PP_ENTER_MODE=254, 
		PP_EMPTY=255, NR=256, IDENTIFIER=257, LINE_CONTINUE=258, LINE_COMMENT=259, 
		BLOCK_COMMENT=260, WS=261, EOL=262, NR_EXTENSION=263, NR_VERSION=264, 
		NR_CUSTOM=265, NR_INCLUDE=266, NR_PRAGMA=267, NR_PRAGMA_DEBUG=268, NR_PRAGMA_OPTIMIZE=269, 
		NR_PRAGMA_INVARIANT=270, NR_ON=271, NR_OFF=272, NR_ALL=273, NR_REQUIRE=274, 
		NR_ENABLE=275, NR_WARN=276, NR_DISABLE=277, NR_COLON=278, NR_LPAREN=279, 
		NR_RPAREN=280, NR_STDGL=281, NR_CORE=282, NR_COMPATIBILITY=283, NR_ES=284, 
		NR_GLSL_110=285, NR_GLSL_120=286, NR_GLSLES_100=287, NR_GLSL_130=288, 
		NR_GLSL_140=289, NR_GLSL_150=290, NR_GLSL_330=291, NR_GLSLES_300=292, 
		NR_GLSLES_310=293, NR_GLSLES_320=294, NR_GLSL_400=295, NR_GLSL_410=296, 
		NR_GLSL_420=297, NR_GLSL_430=298, NR_GLSL_440=299, NR_GLSL_450=300, NR_GLSL_460=301, 
		NR_STRING_START=302, NR_STRING_START_ANGLE=303, NR_INTCONSTANT=304, NR_IDENTIFIER=305, 
		NR_LINE_CONTINUE=306, NR_LINE_COMMENT=307, NR_BLOCK_COMMENT=308, NR_EOL=309, 
		NR_WS=310, S_CONTENT=311, S_STRING_END=312, S_CONTENT_ANGLE=313, S_STRING_END_ANGLE=314, 
		C_LINE_COMMENT=315, C_BLOCK_COMMENT=316, C_EOL=317, C_WS=318, C_CONTENT=319, 
		PP_LINE_CONTINUE=320, PP_LINE_COMMENT=321, PP_BLOCK_COMMENT=322, PP_EOL=323, 
		PP_CONTENT=324;
	public static final int
		RULE_translationUnit = 0, RULE_versionStatement = 1, RULE_externalDeclaration = 2, 
		RULE_emptyDeclaration = 3, RULE_pragmaStatement = 4, RULE_extensionStatement = 5, 
		RULE_customDirectiveStatement = 6, RULE_includeStatement = 7, RULE_layoutDefaults = 8, 
		RULE_functionDefinition = 9, RULE_expression = 10, RULE_declaration = 11, 
		RULE_functionPrototype = 12, RULE_functionParameterList = 13, RULE_parameterDeclaration = 14, 
		RULE_attribute = 15, RULE_singleAttribute = 16, RULE_declarationMember = 17, 
		RULE_fullySpecifiedType = 18, RULE_storageQualifier = 19, RULE_layoutQualifier = 20, 
		RULE_layoutQualifierId = 21, RULE_precisionQualifier = 22, RULE_interpolationQualifier = 23, 
		RULE_invariantQualifier = 24, RULE_preciseQualifier = 25, RULE_typeQualifier = 26, 
		RULE_typeSpecifier = 27, RULE_arraySpecifier = 28, RULE_arraySpecifierSegment = 29, 
		RULE_builtinTypeSpecifierParseable = 30, RULE_builtinTypeSpecifierFixed = 31, 
		RULE_structSpecifier = 32, RULE_structBody = 33, RULE_structMember = 34, 
		RULE_structDeclarator = 35, RULE_initializer = 36, RULE_statement = 37, 
		RULE_compoundStatement = 38, RULE_declarationStatement = 39, RULE_expressionStatement = 40, 
		RULE_emptyStatement = 41, RULE_selectionStatement = 42, RULE_iterationCondition = 43, 
		RULE_switchStatement = 44, RULE_caseLabel = 45, RULE_whileStatement = 46, 
		RULE_doWhileStatement = 47, RULE_forStatement = 48, RULE_jumpStatement = 49, 
		RULE_demoteStatement = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "versionStatement", "externalDeclaration", "emptyDeclaration", 
			"pragmaStatement", "extensionStatement", "customDirectiveStatement", 
			"includeStatement", "layoutDefaults", "functionDefinition", "expression", 
			"declaration", "functionPrototype", "functionParameterList", "parameterDeclaration", 
			"attribute", "singleAttribute", "declarationMember", "fullySpecifiedType", 
			"storageQualifier", "layoutQualifier", "layoutQualifierId", "precisionQualifier", 
			"interpolationQualifier", "invariantQualifier", "preciseQualifier", "typeQualifier", 
			"typeSpecifier", "arraySpecifier", "arraySpecifierSegment", "builtinTypeSpecifierParseable", 
			"builtinTypeSpecifierFixed", "structSpecifier", "structBody", "structMember", 
			"structDeclarator", "initializer", "statement", "compoundStatement", 
			"declarationStatement", "expressionStatement", "emptyStatement", "selectionStatement", 
			"iterationCondition", "switchStatement", "caseLabel", "whileStatement", 
			"doWhileStatement", "forStatement", "jumpStatement", "demoteStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'uniform'", "'buffer'", "'in'", "'out'", "'inout'", "'highp'", 
			"'mediump'", "'lowp'", "'precision'", "'const'", "'precise'", null, "'smooth'", 
			"'flat'", "'centroid'", "'attribute'", "'volatile'", "'varying'", "'shared'", 
			"'layout'", "'.length()'", "'noperspective'", "'sample'", "'patch'", 
			"'coherent'", "'restrict'", "'readonly'", "'writeonly'", "'subroutine'", 
			"'devicecoherent'", "'queuefamilycoherent'", "'workgroupcoherent'", "'subgroupcoherent'", 
			"'nonprivate'", "'atomic_uint'", "'struct'", "'if'", "'else'", "'switch'", 
			"'case'", "'default'", "'while'", "'do'", "'for'", "'continue'", "'break'", 
			"'return'", "'discard'", "'demote'", null, null, null, null, null, null, 
			null, null, null, null, "'bool'", "'bvec2'", "'bvec3'", "'bvec4'", "'int8_t'", 
			"'i8vec2'", "'i8vec3'", "'i8vec4'", "'uint8_t'", "'u8vec2'", "'u8vec3'", 
			"'u8vec4'", "'int16_t'", "'i16vec2'", "'i16vec3'", "'i16vec4'", "'uint16_t'", 
			"'u16vec2'", "'u16vec3'", "'u16vec4'", null, null, null, null, null, 
			null, null, null, "'int64_t'", "'i64vec2'", "'i64vec3'", "'i64vec4'", 
			"'uint64_t'", "'u64vec2'", "'u64vec3'", "'u64vec4'", "'float16_t'", "'f16vec2'", 
			"'f16vec3'", "'f16vec4'", null, "'f16mat2x3'", "'f16mat2x4'", "'f16mat3x2'", 
			null, "'f16mat3x4'", "'f16mat4x2'", "'f16mat4x3'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'image1D'", "'image2D'", "'image3D'", "'uimage1D'", "'uimage2D'", "'uimage3D'", 
			"'iimage1D'", "'iimage2D'", "'iimage3D'", "'sampler1D'", "'sampler2D'", 
			"'sampler3D'", "'sampler2DRect'", "'sampler1DShadow'", "'sampler2DShadow'", 
			"'sampler2DRectShadow'", "'sampler1DArray'", "'sampler2DArray'", "'sampler1DArrayShadow'", 
			"'sampler2DArrayShadow'", "'isampler1D'", "'isampler2D'", "'isampler2DRect'", 
			"'isampler3D'", "'isampler1DArray'", "'isampler2DArray'", "'usampler1D'", 
			"'usampler2D'", "'usampler2DRect'", "'usampler3D'", "'usampler1DArray'", 
			"'usampler2DArray'", "'sampler2DMS'", "'isampler2DMS'", "'usampler2DMS'", 
			"'sampler2DMSArray'", "'isampler2DMSArray'", "'usampler2DMSArray'", "'image2DRect'", 
			"'image1DArray'", "'image2DArray'", "'image2DMS'", "'image2DMSArray'", 
			"'iimage2DRect'", "'iimage1DArray'", "'iimage2DArray'", "'iimage2DMS'", 
			"'iimage2DMSArray'", "'uimage2DRect'", "'uimage1DArray'", "'uimage2DArray'", 
			"'uimage2DMS'", "'uimage2DMSArray'", "'samplerCubeShadow'", "'samplerCubeArrayShadow'", 
			"'samplerCube'", "'isamplerCube'", "'usamplerCube'", "'samplerBuffer'", 
			"'isamplerBuffer'", "'usamplerBuffer'", "'samplerCubeArray'", "'isamplerCubeArray'", 
			"'usamplerCubeArray'", "'imageCube'", "'uimageCube'", "'iimageCube'", 
			"'imageBuffer'", "'iimageBuffer'", "'uimageBuffer'", "'imageCubeArray'", 
			"'iimageCubeArray'", "'uimageCubeArray'", "'++'", "'--'", "'void'", "'<<'", 
			"'>>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'^^'", "'||'", "'*='", 
			"'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", 
			null, null, "'{'", "'}'", "';'", "'['", "']'", "','", "'.'", "'+'", "'-'", 
			"'!'", "'~'", "'*'", "'/'", "'%'", "'<'", null, "'&'", "'|'", "'^'", 
			"'?'", "'='", null, null, "'#'", null, null, null, null, null, null, 
			"'extension'", "'version'", null, "'include'", "'pragma'", "'debug'", 
			"'optimize'", null, "'on'", "'off'", "'all'", "'require'", "'enable'", 
			"'warn'", "'disable'", null, null, null, "'STDGL'", "'core'", "'compatibility'", 
			"'es'", "'110'", "'120'", "'100'", "'130'", "'140'", "'150'", "'330'", 
			"'300'", "'310'", "'320'", "'400'", "'410'", "'420'", "'430'", "'440'", 
			"'450'", "'460'", null, null, null, null, null, null, null, null, null, 
			null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "UNIFORM", "BUFFER", "IN", "OUT", "INOUT", "HIGHP", "MEDIUMP", 
			"LOWP", "PRECISION", "CONST", "PRECISE", "INVARIANT", "SMOOTH", "FLAT", 
			"CENTROID", "ATTRIBUTE", "VOLATILE", "VARYING", "SHARED", "LAYOUT", "DOT_LENGTH_METHOD_CALL", 
			"NOPERSPECTIVE", "SAMPLE", "PATCH", "COHERENT", "RESTRICT", "READONLY", 
			"WRITEONLY", "SUBROUTINE", "DEVICECOHERENT", "QUEUEFAMILYCOHERENT", "WORKGROUPCOHERENT", 
			"SUBGROUPCOHERENT", "NONPRIVATE", "ATOMIC_UINT", "STRUCT", "IF", "ELSE", 
			"SWITCH", "CASE", "DEFAULT", "WHILE", "DO", "FOR", "CONTINUE", "BREAK", 
			"RETURN", "DISCARD", "DEMOTE", "UINT16CONSTANT", "INT16CONSTANT", "UINT32CONSTANT", 
			"INT32CONSTANT", "UINT64CONSTANT", "INT64CONSTANT", "FLOAT16CONSTANT", 
			"FLOAT32CONSTANT", "FLOAT64CONSTANT", "BOOLCONSTANT", "BOOL", "BVEC2", 
			"BVEC3", "BVEC4", "INT8", "I8VEC2", "I8VEC3", "I8VEC4", "UINT8", "U8VEC2", 
			"U8VEC3", "U8VEC4", "INT16", "I16VEC2", "I16VEC3", "I16VEC4", "UINT16", 
			"U16VEC2", "U16VEC3", "U16VEC4", "INT32", "I32VEC2", "I32VEC3", "I32VEC4", 
			"UINT32", "U32VEC2", "U32VEC3", "U32VEC4", "INT64", "I64VEC2", "I64VEC3", 
			"I64VEC4", "UINT64", "U64VEC2", "U64VEC3", "U64VEC4", "FLOAT16", "F16VEC2", 
			"F16VEC3", "F16VEC4", "F16MAT2X2", "F16MAT2X3", "F16MAT2X4", "F16MAT3X2", 
			"F16MAT3X3", "F16MAT3X4", "F16MAT4X2", "F16MAT4X3", "F16MAT4X4", "FLOAT32", 
			"F32VEC2", "F32VEC3", "F32VEC4", "F32MAT2X2", "F32MAT2X3", "F32MAT2X4", 
			"F32MAT3X2", "F32MAT3X3", "F32MAT3X4", "F32MAT4X2", "F32MAT4X3", "F32MAT4X4", 
			"FLOAT64", "F64VEC2", "F64VEC3", "F64VEC4", "F64MAT2X2", "F64MAT2X3", 
			"F64MAT2X4", "F64MAT3X2", "F64MAT3X3", "F64MAT3X4", "F64MAT4X2", "F64MAT4X3", 
			"F64MAT4X4", "IMAGE1D", "IMAGE2D", "IMAGE3D", "UIMAGE1D", "UIMAGE2D", 
			"UIMAGE3D", "IIMAGE1D", "IIMAGE2D", "IIMAGE3D", "SAMPLER1D", "SAMPLER2D", 
			"SAMPLER3D", "SAMPLER2DRECT", "SAMPLER1DSHADOW", "SAMPLER2DSHADOW", "SAMPLER2DRECTSHADOW", 
			"SAMPLER1DARRAY", "SAMPLER2DARRAY", "SAMPLER1DARRAYSHADOW", "SAMPLER2DARRAYSHADOW", 
			"ISAMPLER1D", "ISAMPLER2D", "ISAMPLER2DRECT", "ISAMPLER3D", "ISAMPLER1DARRAY", 
			"ISAMPLER2DARRAY", "USAMPLER1D", "USAMPLER2D", "USAMPLER2DRECT", "USAMPLER3D", 
			"USAMPLER1DARRAY", "USAMPLER2DARRAY", "SAMPLER2DMS", "ISAMPLER2DMS", 
			"USAMPLER2DMS", "SAMPLER2DMSARRAY", "ISAMPLER2DMSARRAY", "USAMPLER2DMSARRAY", 
			"IMAGE2DRECT", "IMAGE1DARRAY", "IMAGE2DARRAY", "IMAGE2DMS", "IMAGE2DMSARRAY", 
			"IIMAGE2DRECT", "IIMAGE1DARRAY", "IIMAGE2DARRAY", "IIMAGE2DMS", "IIMAGE2DMSARRAY", 
			"UIMAGE2DRECT", "UIMAGE1DARRAY", "UIMAGE2DARRAY", "UIMAGE2DMS", "UIMAGE2DMSARRAY", 
			"SAMPLERCUBESHADOW", "SAMPLERCUBEARRAYSHADOW", "SAMPLERCUBE", "ISAMPLERCUBE", 
			"USAMPLERCUBE", "SAMPLERBUFFER", "ISAMPLERBUFFER", "USAMPLERBUFFER", 
			"SAMPLERCUBEARRAY", "ISAMPLERCUBEARRAY", "USAMPLERCUBEARRAY", "IMAGECUBE", 
			"UIMAGECUBE", "IIMAGECUBE", "IMAGEBUFFER", "IIMAGEBUFFER", "UIMAGEBUFFER", 
			"IMAGECUBEARRAY", "IIMAGECUBEARRAY", "UIMAGECUBEARRAY", "INC_OP", "DEC_OP", 
			"VOID", "LEFT_OP", "RIGHT_OP", "LE_OP", "GE_OP", "EQ_OP", "NE_OP", "LOGICAL_AND_OP", 
			"LOGICAL_XOR_OP", "LOGICAL_OR_OP", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "LEFT_ASSIGN", "RIGHT_ASSIGN", "AND_ASSIGN", 
			"XOR_ASSIGN", "OR_ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", 
			"LBRACKET", "RBRACKET", "COMMA", "DOT", "PLUS_OP", "MINUS_OP", "LOGICAL_NOT_OP", 
			"BITWISE_NEG_OP", "TIMES_OP", "DIV_OP", "MOD_OP", "LT_OP", "GT_OP", "BITWISE_AND_OP", 
			"BITWISE_OR_OP", "BITWISE_XOR_OP", "QUERY_OP", "ASSIGN_OP", "PP_ENTER_MODE", 
			"PP_EMPTY", "NR", "IDENTIFIER", "LINE_CONTINUE", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WS", "EOL", "NR_EXTENSION", "NR_VERSION", "NR_CUSTOM", "NR_INCLUDE", 
			"NR_PRAGMA", "NR_PRAGMA_DEBUG", "NR_PRAGMA_OPTIMIZE", "NR_PRAGMA_INVARIANT", 
			"NR_ON", "NR_OFF", "NR_ALL", "NR_REQUIRE", "NR_ENABLE", "NR_WARN", "NR_DISABLE", 
			"NR_COLON", "NR_LPAREN", "NR_RPAREN", "NR_STDGL", "NR_CORE", "NR_COMPATIBILITY", 
			"NR_ES", "NR_GLSL_110", "NR_GLSL_120", "NR_GLSLES_100", "NR_GLSL_130", 
			"NR_GLSL_140", "NR_GLSL_150", "NR_GLSL_330", "NR_GLSLES_300", "NR_GLSLES_310", 
			"NR_GLSLES_320", "NR_GLSL_400", "NR_GLSL_410", "NR_GLSL_420", "NR_GLSL_430", 
			"NR_GLSL_440", "NR_GLSL_450", "NR_GLSL_460", "NR_STRING_START", "NR_STRING_START_ANGLE", 
			"NR_INTCONSTANT", "NR_IDENTIFIER", "NR_LINE_CONTINUE", "NR_LINE_COMMENT", 
			"NR_BLOCK_COMMENT", "NR_EOL", "NR_WS", "S_CONTENT", "S_STRING_END", "S_CONTENT_ANGLE", 
			"S_STRING_END_ANGLE", "C_LINE_COMMENT", "C_BLOCK_COMMENT", "C_EOL", "C_WS", 
			"C_CONTENT", "PP_LINE_CONTINUE", "PP_LINE_COMMENT", "PP_BLOCK_COMMENT", 
			"PP_EOL", "PP_CONTENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GLSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GLSLParser.EOF, 0); }
		public VersionStatementContext versionStatement() {
			return getRuleContext(VersionStatementContext.class,0);
		}
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(102);
				versionStatement();
				}
				break;
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -576460683584995329L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -1L) != 0 || (((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & -1L) != 0 || (((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & -4611679421357457409L) != 0) {
				{
				{
				setState(105);
				externalDeclaration();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VersionStatementContext extends ParserRuleContext {
		public Token version;
		public Token profile;
		public TerminalNode NR() { return getToken(GLSLParser.NR, 0); }
		public TerminalNode NR_VERSION() { return getToken(GLSLParser.NR_VERSION, 0); }
		public TerminalNode NR_EOL() { return getToken(GLSLParser.NR_EOL, 0); }
		public TerminalNode NR_GLSL_110() { return getToken(GLSLParser.NR_GLSL_110, 0); }
		public TerminalNode NR_GLSL_120() { return getToken(GLSLParser.NR_GLSL_120, 0); }
		public TerminalNode NR_GLSLES_100() { return getToken(GLSLParser.NR_GLSLES_100, 0); }
		public TerminalNode NR_GLSL_130() { return getToken(GLSLParser.NR_GLSL_130, 0); }
		public TerminalNode NR_GLSL_140() { return getToken(GLSLParser.NR_GLSL_140, 0); }
		public TerminalNode NR_GLSL_150() { return getToken(GLSLParser.NR_GLSL_150, 0); }
		public TerminalNode NR_GLSL_330() { return getToken(GLSLParser.NR_GLSL_330, 0); }
		public TerminalNode NR_GLSLES_300() { return getToken(GLSLParser.NR_GLSLES_300, 0); }
		public TerminalNode NR_GLSLES_310() { return getToken(GLSLParser.NR_GLSLES_310, 0); }
		public TerminalNode NR_GLSLES_320() { return getToken(GLSLParser.NR_GLSLES_320, 0); }
		public TerminalNode NR_GLSL_400() { return getToken(GLSLParser.NR_GLSL_400, 0); }
		public TerminalNode NR_GLSL_410() { return getToken(GLSLParser.NR_GLSL_410, 0); }
		public TerminalNode NR_GLSL_420() { return getToken(GLSLParser.NR_GLSL_420, 0); }
		public TerminalNode NR_GLSL_430() { return getToken(GLSLParser.NR_GLSL_430, 0); }
		public TerminalNode NR_GLSL_440() { return getToken(GLSLParser.NR_GLSL_440, 0); }
		public TerminalNode NR_GLSL_450() { return getToken(GLSLParser.NR_GLSL_450, 0); }
		public TerminalNode NR_GLSL_460() { return getToken(GLSLParser.NR_GLSL_460, 0); }
		public TerminalNode NR_CORE() { return getToken(GLSLParser.NR_CORE, 0); }
		public TerminalNode NR_COMPATIBILITY() { return getToken(GLSLParser.NR_COMPATIBILITY, 0); }
		public TerminalNode NR_ES() { return getToken(GLSLParser.NR_ES, 0); }
		public VersionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterVersionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitVersionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitVersionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionStatementContext versionStatement() throws RecognitionException {
		VersionStatementContext _localctx = new VersionStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_versionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(NR);
			setState(114);
			match(NR_VERSION);
			setState(115);
			((VersionStatementContext)_localctx).version = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la - 285)) & ~0x3f) == 0 && ((1L << (_la - 285)) & 131071L) != 0) ) {
				((VersionStatementContext)_localctx).version = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 282)) & ~0x3f) == 0 && ((1L << (_la - 282)) & 7L) != 0) {
				{
				setState(116);
				((VersionStatementContext)_localctx).profile = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la - 282)) & ~0x3f) == 0 && ((1L << (_la - 282)) & 7L) != 0) ) {
					((VersionStatementContext)_localctx).profile = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(119);
			match(NR_EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public PragmaStatementContext pragmaStatement() {
			return getRuleContext(PragmaStatementContext.class,0);
		}
		public ExtensionStatementContext extensionStatement() {
			return getRuleContext(ExtensionStatementContext.class,0);
		}
		public CustomDirectiveStatementContext customDirectiveStatement() {
			return getRuleContext(CustomDirectiveStatementContext.class,0);
		}
		public IncludeStatementContext includeStatement() {
			return getRuleContext(IncludeStatementContext.class,0);
		}
		public LayoutDefaultsContext layoutDefaults() {
			return getRuleContext(LayoutDefaultsContext.class,0);
		}
		public EmptyDeclarationContext emptyDeclaration() {
			return getRuleContext(EmptyDeclarationContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_externalDeclaration);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				pragmaStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				extensionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				customDirectiveStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				includeStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				layoutDefaults();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(128);
				emptyDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public EmptyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterEmptyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitEmptyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitEmptyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyDeclarationContext emptyDeclaration() throws RecognitionException {
		EmptyDeclarationContext _localctx = new EmptyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_emptyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PragmaStatementContext extends ParserRuleContext {
		public Token stdGL;
		public Token type;
		public Token state;
		public TerminalNode NR() { return getToken(GLSLParser.NR, 0); }
		public TerminalNode NR_PRAGMA() { return getToken(GLSLParser.NR_PRAGMA, 0); }
		public TerminalNode NR_EOL() { return getToken(GLSLParser.NR_EOL, 0); }
		public TerminalNode NR_LPAREN() { return getToken(GLSLParser.NR_LPAREN, 0); }
		public TerminalNode NR_RPAREN() { return getToken(GLSLParser.NR_RPAREN, 0); }
		public TerminalNode NR_IDENTIFIER() { return getToken(GLSLParser.NR_IDENTIFIER, 0); }
		public TerminalNode NR_PRAGMA_INVARIANT() { return getToken(GLSLParser.NR_PRAGMA_INVARIANT, 0); }
		public TerminalNode NR_ALL() { return getToken(GLSLParser.NR_ALL, 0); }
		public TerminalNode NR_STDGL() { return getToken(GLSLParser.NR_STDGL, 0); }
		public TerminalNode NR_PRAGMA_DEBUG() { return getToken(GLSLParser.NR_PRAGMA_DEBUG, 0); }
		public TerminalNode NR_PRAGMA_OPTIMIZE() { return getToken(GLSLParser.NR_PRAGMA_OPTIMIZE, 0); }
		public TerminalNode NR_ON() { return getToken(GLSLParser.NR_ON, 0); }
		public TerminalNode NR_OFF() { return getToken(GLSLParser.NR_OFF, 0); }
		public PragmaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterPragmaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitPragmaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitPragmaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaStatementContext pragmaStatement() throws RecognitionException {
		PragmaStatementContext _localctx = new PragmaStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pragmaStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(NR);
			setState(134);
			match(NR_PRAGMA);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NR_STDGL) {
				{
				setState(135);
				((PragmaStatementContext)_localctx).stdGL = match(NR_STDGL);
				}
			}

			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NR_IDENTIFIER:
				{
				setState(138);
				((PragmaStatementContext)_localctx).type = match(NR_IDENTIFIER);
				}
				break;
			case NR_PRAGMA_DEBUG:
			case NR_PRAGMA_OPTIMIZE:
				{
				setState(139);
				((PragmaStatementContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NR_PRAGMA_DEBUG || _la==NR_PRAGMA_OPTIMIZE) ) {
					((PragmaStatementContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(140);
				match(NR_LPAREN);
				setState(141);
				((PragmaStatementContext)_localctx).state = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NR_ON || _la==NR_OFF) ) {
					((PragmaStatementContext)_localctx).state = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(142);
				match(NR_RPAREN);
				}
				break;
			case NR_PRAGMA_INVARIANT:
				{
				setState(143);
				((PragmaStatementContext)_localctx).type = match(NR_PRAGMA_INVARIANT);
				setState(144);
				match(NR_LPAREN);
				setState(145);
				((PragmaStatementContext)_localctx).state = match(NR_ALL);
				setState(146);
				match(NR_RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(149);
			match(NR_EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtensionStatementContext extends ParserRuleContext {
		public Token extensionName;
		public Token extensionBehavior;
		public TerminalNode NR() { return getToken(GLSLParser.NR, 0); }
		public TerminalNode NR_EXTENSION() { return getToken(GLSLParser.NR_EXTENSION, 0); }
		public TerminalNode NR_EOL() { return getToken(GLSLParser.NR_EOL, 0); }
		public TerminalNode NR_IDENTIFIER() { return getToken(GLSLParser.NR_IDENTIFIER, 0); }
		public TerminalNode NR_COLON() { return getToken(GLSLParser.NR_COLON, 0); }
		public TerminalNode NR_REQUIRE() { return getToken(GLSLParser.NR_REQUIRE, 0); }
		public TerminalNode NR_ENABLE() { return getToken(GLSLParser.NR_ENABLE, 0); }
		public TerminalNode NR_WARN() { return getToken(GLSLParser.NR_WARN, 0); }
		public TerminalNode NR_DISABLE() { return getToken(GLSLParser.NR_DISABLE, 0); }
		public ExtensionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterExtensionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitExtensionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitExtensionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionStatementContext extensionStatement() throws RecognitionException {
		ExtensionStatementContext _localctx = new ExtensionStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_extensionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(NR);
			setState(152);
			match(NR_EXTENSION);
			setState(153);
			((ExtensionStatementContext)_localctx).extensionName = match(NR_IDENTIFIER);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NR_COLON) {
				{
				setState(154);
				match(NR_COLON);
				setState(155);
				((ExtensionStatementContext)_localctx).extensionBehavior = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la - 274)) & ~0x3f) == 0 && ((1L << (_la - 274)) & 15L) != 0) ) {
					((ExtensionStatementContext)_localctx).extensionBehavior = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(158);
			match(NR_EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CustomDirectiveStatementContext extends ParserRuleContext {
		public Token content;
		public TerminalNode NR() { return getToken(GLSLParser.NR, 0); }
		public TerminalNode NR_CUSTOM() { return getToken(GLSLParser.NR_CUSTOM, 0); }
		public TerminalNode C_EOL() { return getToken(GLSLParser.C_EOL, 0); }
		public TerminalNode C_CONTENT() { return getToken(GLSLParser.C_CONTENT, 0); }
		public CustomDirectiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customDirectiveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterCustomDirectiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitCustomDirectiveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitCustomDirectiveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomDirectiveStatementContext customDirectiveStatement() throws RecognitionException {
		CustomDirectiveStatementContext _localctx = new CustomDirectiveStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_customDirectiveStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(NR);
			setState(161);
			match(NR_CUSTOM);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==C_CONTENT) {
				{
				setState(162);
				((CustomDirectiveStatementContext)_localctx).content = match(C_CONTENT);
				}
			}

			setState(165);
			match(C_EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncludeStatementContext extends ParserRuleContext {
		public Token content;
		public Token angleStart;
		public TerminalNode NR() { return getToken(GLSLParser.NR, 0); }
		public TerminalNode NR_INCLUDE() { return getToken(GLSLParser.NR_INCLUDE, 0); }
		public TerminalNode NR_EOL() { return getToken(GLSLParser.NR_EOL, 0); }
		public TerminalNode NR_STRING_START() { return getToken(GLSLParser.NR_STRING_START, 0); }
		public TerminalNode S_STRING_END() { return getToken(GLSLParser.S_STRING_END, 0); }
		public TerminalNode S_STRING_END_ANGLE() { return getToken(GLSLParser.S_STRING_END_ANGLE, 0); }
		public TerminalNode NR_STRING_START_ANGLE() { return getToken(GLSLParser.NR_STRING_START_ANGLE, 0); }
		public TerminalNode S_CONTENT() { return getToken(GLSLParser.S_CONTENT, 0); }
		public TerminalNode S_CONTENT_ANGLE() { return getToken(GLSLParser.S_CONTENT_ANGLE, 0); }
		public IncludeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterIncludeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitIncludeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitIncludeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeStatementContext includeStatement() throws RecognitionException {
		IncludeStatementContext _localctx = new IncludeStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_includeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NR);
			setState(168);
			match(NR_INCLUDE);
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NR_STRING_START:
				{
				setState(169);
				match(NR_STRING_START);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==S_CONTENT) {
					{
					setState(170);
					((IncludeStatementContext)_localctx).content = match(S_CONTENT);
					}
				}

				setState(173);
				match(S_STRING_END);
				}
				break;
			case NR_STRING_START_ANGLE:
				{
				setState(174);
				((IncludeStatementContext)_localctx).angleStart = match(NR_STRING_START_ANGLE);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==S_CONTENT_ANGLE) {
					{
					setState(175);
					((IncludeStatementContext)_localctx).content = match(S_CONTENT_ANGLE);
					}
				}

				setState(178);
				match(S_STRING_END_ANGLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(181);
			match(NR_EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LayoutDefaultsContext extends ParserRuleContext {
		public Token layoutMode;
		public LayoutQualifierContext layoutQualifier() {
			return getRuleContext(LayoutQualifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public TerminalNode UNIFORM() { return getToken(GLSLParser.UNIFORM, 0); }
		public TerminalNode IN() { return getToken(GLSLParser.IN, 0); }
		public TerminalNode OUT() { return getToken(GLSLParser.OUT, 0); }
		public TerminalNode BUFFER() { return getToken(GLSLParser.BUFFER, 0); }
		public LayoutDefaultsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutDefaults; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLayoutDefaults(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLayoutDefaults(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitLayoutDefaults(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutDefaultsContext layoutDefaults() throws RecognitionException {
		LayoutDefaultsContext _localctx = new LayoutDefaultsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_layoutDefaults);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			layoutQualifier();
			setState(184);
			((LayoutDefaultsContext)_localctx).layoutMode = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0) ) {
				((LayoutDefaultsContext)_localctx).layoutMode = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(185);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			functionPrototype();
			setState(188);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LEFT_OP() { return getToken(GLSLParser.LEFT_OP, 0); }
		public TerminalNode RIGHT_OP() { return getToken(GLSLParser.RIGHT_OP, 0); }
		public ShiftExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReferenceExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public ReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS_OP() { return getToken(GLSLParser.PLUS_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(GLSLParser.MINUS_OP, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT_OP() { return getToken(GLSLParser.LT_OP, 0); }
		public TerminalNode GT_OP() { return getToken(GLSLParser.GT_OP, 0); }
		public TerminalNode LE_OP() { return getToken(GLSLParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(GLSLParser.GE_OP, 0); }
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExclusiveOrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICAL_XOR_OP() { return getToken(GLSLParser.LOGICAL_XOR_OP, 0); }
		public LogicalExclusiveOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLogicalExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLogicalExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitLogicalExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ExpressionContext {
		public ExpressionContext condition;
		public ExpressionContext trueAlternative;
		public ExpressionContext falseAlternative;
		public TerminalNode QUERY_OP() { return getToken(GLSLParser.QUERY_OP, 0); }
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SequenceExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode COMMA() { return getToken(GLSLParser.COMMA, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SequenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterSequenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitSequenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitSequenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN_OP() { return getToken(GLSLParser.ASSIGN_OP, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(GLSLParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(GLSLParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(GLSLParser.MOD_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(GLSLParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(GLSLParser.SUB_ASSIGN, 0); }
		public TerminalNode LEFT_ASSIGN() { return getToken(GLSLParser.LEFT_ASSIGN, 0); }
		public TerminalNode RIGHT_ASSIGN() { return getToken(GLSLParser.RIGHT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(GLSLParser.AND_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(GLSLParser.XOR_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(GLSLParser.OR_ASSIGN, 0); }
		public AssignmentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LengthAccessExpressionContext extends ExpressionContext {
		public ExpressionContext operand;
		public TerminalNode DOT_LENGTH_METHOD_CALL() { return getToken(GLSLParser.DOT_LENGTH_METHOD_CALL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LengthAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLengthAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLengthAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitLengthAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TIMES_OP() { return getToken(GLSLParser.TIMES_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(GLSLParser.DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(GLSLParser.MOD_OP, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupingExpressionContext extends ExpressionContext {
		public ExpressionContext value;
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterGroupingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitGroupingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitGroupingExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public TerminalNode LBRACKET() { return getToken(GLSLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(GLSLParser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterArrayAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitArrayAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitArrayAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrefixExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext operand;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INC_OP() { return getToken(GLSLParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(GLSLParser.DEC_OP, 0); }
		public TerminalNode PLUS_OP() { return getToken(GLSLParser.PLUS_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(GLSLParser.MINUS_OP, 0); }
		public TerminalNode LOGICAL_NOT_OP() { return getToken(GLSLParser.LOGICAL_NOT_OP, 0); }
		public TerminalNode BITWISE_NEG_OP() { return getToken(GLSLParser.BITWISE_NEG_OP, 0); }
		public PrefixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitPrefixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitPrefixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseInclusiveOrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISE_OR_OP() { return getToken(GLSLParser.BITWISE_OR_OP, 0); }
		public BitwiseInclusiveOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterBitwiseInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitBitwiseInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitBitwiseInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalInclusiveOrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICAL_OR_OP() { return getToken(GLSLParser.LOGICAL_OR_OP, 0); }
		public LogicalInclusiveOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLogicalInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLogicalInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitLogicalInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseAndExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISE_AND_OP() { return getToken(GLSLParser.BITWISE_AND_OP, 0); }
		public BitwiseAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterBitwiseAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitBitwiseAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitBitwiseAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ_OP() { return getToken(GLSLParser.EQ_OP, 0); }
		public TerminalNode NE_OP() { return getToken(GLSLParser.NE_OP, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICAL_AND_OP() { return getToken(GLSLParser.LOGICAL_AND_OP, 0); }
		public LogicalAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> parameters = new ArrayList<ExpressionContext>();
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode VOID() { return getToken(GLSLParser.VOID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseExclusiveOrExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BITWISE_XOR_OP() { return getToken(GLSLParser.BITWISE_XOR_OP, 0); }
		public BitwiseExclusiveOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterBitwiseExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitBitwiseExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitBitwiseExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessExpressionContext extends ExpressionContext {
		public ExpressionContext operand;
		public Token member;
		public TerminalNode DOT() { return getToken(GLSLParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public MemberAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterMemberAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitMemberAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitMemberAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public TerminalNode INT16CONSTANT() { return getToken(GLSLParser.INT16CONSTANT, 0); }
		public TerminalNode UINT16CONSTANT() { return getToken(GLSLParser.UINT16CONSTANT, 0); }
		public TerminalNode INT32CONSTANT() { return getToken(GLSLParser.INT32CONSTANT, 0); }
		public TerminalNode UINT32CONSTANT() { return getToken(GLSLParser.UINT32CONSTANT, 0); }
		public TerminalNode INT64CONSTANT() { return getToken(GLSLParser.INT64CONSTANT, 0); }
		public TerminalNode UINT64CONSTANT() { return getToken(GLSLParser.UINT64CONSTANT, 0); }
		public TerminalNode FLOAT16CONSTANT() { return getToken(GLSLParser.FLOAT16CONSTANT, 0); }
		public TerminalNode FLOAT32CONSTANT() { return getToken(GLSLParser.FLOAT32CONSTANT, 0); }
		public TerminalNode FLOAT64CONSTANT() { return getToken(GLSLParser.FLOAT64CONSTANT, 0); }
		public TerminalNode BOOLCONSTANT() { return getToken(GLSLParser.BOOLCONSTANT, 0); }
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ExpressionContext {
		public ExpressionContext operand;
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INC_OP() { return getToken(GLSLParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(GLSLParser.DEC_OP, 0); }
		public PostfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(191);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2303591209400008704L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				_localctx = new GroupingExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(LPAREN);
				setState(194);
				((GroupingExpressionContext)_localctx).value = expression(0);
				setState(195);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(197);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(198);
					typeSpecifier();
					}
					break;
				}
				setState(201);
				match(LPAREN);
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					}
					break;
				case 2:
					{
					setState(203);
					match(VOID);
					}
					break;
				case 3:
					{
					setState(204);
					((FunctionCallExpressionContext)_localctx).expression = expression(0);
					((FunctionCallExpressionContext)_localctx).parameters.add(((FunctionCallExpressionContext)_localctx).expression);
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(205);
						match(COMMA);
						setState(206);
						((FunctionCallExpressionContext)_localctx).expression = expression(0);
						((FunctionCallExpressionContext)_localctx).parameters.add(((FunctionCallExpressionContext)_localctx).expression);
						}
						}
						setState(211);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(214);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new PrefixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				((PrefixExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & 32212254723L) != 0) ) {
					((PrefixExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(216);
				((PrefixExpressionContext)_localctx).operand = expression(15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(276);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MultiplicativeExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(219);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(220);
						((MultiplicativeExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la - 244)) & ~0x3f) == 0 && ((1L << (_la - 244)) & 7L) != 0) ) {
							((MultiplicativeExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(221);
						((MultiplicativeExpressionContext)_localctx).right = expression(15);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AdditiveExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(223);
						((AdditiveExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OP || _la==MINUS_OP) ) {
							((AdditiveExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						((AdditiveExpressionContext)_localctx).right = expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ShiftExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ShiftExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(225);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(226);
						((ShiftExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LEFT_OP || _la==RIGHT_OP) ) {
							((ShiftExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						((ShiftExpressionContext)_localctx).right = expression(13);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(228);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(229);
						((RelationalExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la - 214)) & ~0x3f) == 0 && ((1L << (_la - 214)) & 25769803779L) != 0) ) {
							((RelationalExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						((RelationalExpressionContext)_localctx).right = expression(12);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((EqualityExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(232);
						((EqualityExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ_OP || _la==NE_OP) ) {
							((EqualityExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						((EqualityExpressionContext)_localctx).right = expression(11);
						}
						break;
					case 6:
						{
						_localctx = new BitwiseAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseAndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(234);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(235);
						((BitwiseAndExpressionContext)_localctx).op = match(BITWISE_AND_OP);
						setState(236);
						((BitwiseAndExpressionContext)_localctx).right = expression(10);
						}
						break;
					case 7:
						{
						_localctx = new BitwiseExclusiveOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseExclusiveOrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(237);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(238);
						((BitwiseExclusiveOrExpressionContext)_localctx).op = match(BITWISE_XOR_OP);
						setState(239);
						((BitwiseExclusiveOrExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 8:
						{
						_localctx = new BitwiseInclusiveOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((BitwiseInclusiveOrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(241);
						((BitwiseInclusiveOrExpressionContext)_localctx).op = match(BITWISE_OR_OP);
						setState(242);
						((BitwiseInclusiveOrExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 9:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalAndExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(244);
						((LogicalAndExpressionContext)_localctx).op = match(LOGICAL_AND_OP);
						setState(245);
						((LogicalAndExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 10:
						{
						_localctx = new LogicalExclusiveOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalExclusiveOrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(247);
						((LogicalExclusiveOrExpressionContext)_localctx).op = match(LOGICAL_XOR_OP);
						setState(248);
						((LogicalExclusiveOrExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 11:
						{
						_localctx = new LogicalInclusiveOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LogicalInclusiveOrExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(250);
						((LogicalInclusiveOrExpressionContext)_localctx).op = match(LOGICAL_OR_OP);
						setState(251);
						((LogicalInclusiveOrExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(253);
						match(QUERY_OP);
						setState(254);
						((ConditionalExpressionContext)_localctx).trueAlternative = expression(0);
						setState(255);
						match(COLON);
						setState(256);
						((ConditionalExpressionContext)_localctx).falseAlternative = expression(3);
						}
						break;
					case 13:
						{
						_localctx = new AssignmentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((AssignmentExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(259);
						((AssignmentExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & 4294968319L) != 0) ) {
							((AssignmentExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(260);
						((AssignmentExpressionContext)_localctx).right = expression(2);
						}
						break;
					case 14:
						{
						_localctx = new SequenceExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((SequenceExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(262);
						match(COMMA);
						setState(263);
						((SequenceExpressionContext)_localctx).right = expression(2);
						}
						break;
					case 15:
						{
						_localctx = new ArrayAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ArrayAccessExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(265);
						match(LBRACKET);
						setState(266);
						((ArrayAccessExpressionContext)_localctx).right = expression(0);
						setState(267);
						match(RBRACKET);
						}
						break;
					case 16:
						{
						_localctx = new LengthAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((LengthAccessExpressionContext)_localctx).operand = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(270);
						match(DOT_LENGTH_METHOD_CALL);
						}
						break;
					case 17:
						{
						_localctx = new MemberAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MemberAccessExpressionContext)_localctx).operand = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(272);
						match(DOT);
						setState(273);
						((MemberAccessExpressionContext)_localctx).member = match(IDENTIFIER);
						}
						break;
					case 18:
						{
						_localctx = new PostfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((PostfixExpressionContext)_localctx).operand = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(274);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(275);
						((PostfixExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC_OP || _la==DEC_OP) ) {
							((PostfixExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrecisionDeclarationContext extends DeclarationContext {
		public TerminalNode PRECISION() { return getToken(GLSLParser.PRECISION, 0); }
		public PrecisionQualifierContext precisionQualifier() {
			return getRuleContext(PrecisionQualifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public PrecisionDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterPrecisionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitPrecisionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitPrecisionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAndInitDeclarationContext extends DeclarationContext {
		public DeclarationMemberContext declarationMember;
		public List<DeclarationMemberContext> declarationMembers = new ArrayList<DeclarationMemberContext>();
		public FullySpecifiedTypeContext fullySpecifiedType() {
			return getRuleContext(FullySpecifiedTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public List<DeclarationMemberContext> declarationMember() {
			return getRuleContexts(DeclarationMemberContext.class);
		}
		public DeclarationMemberContext declarationMember(int i) {
			return getRuleContext(DeclarationMemberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public TypeAndInitDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterTypeAndInitDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitTypeAndInitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitTypeAndInitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBlockDeclarationContext extends DeclarationContext {
		public Token blockName;
		public Token variableName;
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GLSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GLSLParser.IDENTIFIER, i);
		}
		public ArraySpecifierContext arraySpecifier() {
			return getRuleContext(ArraySpecifierContext.class,0);
		}
		public InterfaceBlockDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterInterfaceBlockDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitInterfaceBlockDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitInterfaceBlockDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends DeclarationContext {
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public FunctionDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends DeclarationContext {
		public Token IDENTIFIER;
		public List<Token> variableNames = new ArrayList<Token>();
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GLSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GLSLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public VariableDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaration);
		int _la;
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				functionPrototype();
				setState(282);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new InterfaceBlockDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				typeQualifier();
				setState(285);
				((InterfaceBlockDeclarationContext)_localctx).blockName = match(IDENTIFIER);
				setState(286);
				structBody();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(287);
					((InterfaceBlockDeclarationContext)_localctx).variableName = match(IDENTIFIER);
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACKET) {
						{
						setState(288);
						arraySpecifier();
						}
					}

					}
				}

				setState(293);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new VariableDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				typeQualifier();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(296);
					((VariableDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((VariableDeclarationContext)_localctx).variableNames.add(((VariableDeclarationContext)_localctx).IDENTIFIER);
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(297);
						match(COMMA);
						setState(298);
						((VariableDeclarationContext)_localctx).IDENTIFIER = match(IDENTIFIER);
						((VariableDeclarationContext)_localctx).variableNames.add(((VariableDeclarationContext)_localctx).IDENTIFIER);
						}
						}
						setState(303);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(306);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new PrecisionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(PRECISION);
				setState(309);
				precisionQualifier();
				setState(310);
				typeSpecifier();
				setState(311);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new TypeAndInitDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(313);
				fullySpecifiedType();
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(314);
					((TypeAndInitDeclarationContext)_localctx).declarationMember = declarationMember();
					((TypeAndInitDeclarationContext)_localctx).declarationMembers.add(((TypeAndInitDeclarationContext)_localctx).declarationMember);
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(315);
						match(COMMA);
						setState(316);
						((TypeAndInitDeclarationContext)_localctx).declarationMember = declarationMember();
						((TypeAndInitDeclarationContext)_localctx).declarationMembers.add(((TypeAndInitDeclarationContext)_localctx).declarationMember);
						}
						}
						setState(321);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(324);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionPrototypeContext extends ParserRuleContext {
		public FullySpecifiedTypeContext fullySpecifiedType() {
			return getRuleContext(FullySpecifiedTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public FunctionParameterListContext functionParameterList() {
			return getRuleContext(FunctionParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public FunctionPrototypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionPrototype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunctionPrototype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunctionPrototype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitFunctionPrototype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionPrototypeContext functionPrototype() throws RecognitionException {
		FunctionPrototypeContext _localctx = new FunctionPrototypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionPrototype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(328);
				attribute();
				}
			}

			setState(331);
			fullySpecifiedType();
			setState(332);
			match(IDENTIFIER);
			setState(333);
			match(LPAREN);
			setState(334);
			functionParameterList();
			setState(335);
			match(RPAREN);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(336);
				attribute();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration;
		public List<ParameterDeclarationContext> parameters = new ArrayList<ParameterDeclarationContext>();
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public FunctionParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFunctionParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFunctionParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitFunctionParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterListContext functionParameterList() throws RecognitionException {
		FunctionParameterListContext _localctx = new FunctionParameterListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -576460683584995585L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -1L) != 0 || (((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & -1L) != 0 || (((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & -9223372036854611969L) != 0) {
				{
				setState(339);
				((FunctionParameterListContext)_localctx).parameterDeclaration = parameterDeclaration();
				((FunctionParameterListContext)_localctx).parameters.add(((FunctionParameterListContext)_localctx).parameterDeclaration);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(340);
					match(COMMA);
					setState(341);
					((FunctionParameterListContext)_localctx).parameterDeclaration = parameterDeclaration();
					((FunctionParameterListContext)_localctx).parameters.add(((FunctionParameterListContext)_localctx).parameterDeclaration);
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public Token parameterName;
		public FullySpecifiedTypeContext fullySpecifiedType() {
			return getRuleContext(FullySpecifiedTypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public ArraySpecifierContext arraySpecifier() {
			return getRuleContext(ArraySpecifierContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			fullySpecifiedType();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(350);
				((ParameterDeclarationContext)_localctx).parameterName = match(IDENTIFIER);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(351);
					arraySpecifier();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public SingleAttributeContext singleAttribute;
		public List<SingleAttributeContext> attributes = new ArrayList<SingleAttributeContext>();
		public List<TerminalNode> LBRACKET() { return getTokens(GLSLParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(GLSLParser.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(GLSLParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(GLSLParser.RBRACKET, i);
		}
		public List<SingleAttributeContext> singleAttribute() {
			return getRuleContexts(SingleAttributeContext.class);
		}
		public SingleAttributeContext singleAttribute(int i) {
			return getRuleContext(SingleAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(LBRACKET);
			setState(357);
			match(LBRACKET);
			setState(358);
			((AttributeContext)_localctx).singleAttribute = singleAttribute();
			((AttributeContext)_localctx).attributes.add(((AttributeContext)_localctx).singleAttribute);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(359);
				match(COMMA);
				setState(360);
				((AttributeContext)_localctx).singleAttribute = singleAttribute();
				((AttributeContext)_localctx).attributes.add(((AttributeContext)_localctx).singleAttribute);
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(RBRACKET);
			setState(367);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleAttributeContext extends ParserRuleContext {
		public Token prefix;
		public Token name;
		public ExpressionContext content;
		public List<TerminalNode> IDENTIFIER() { return getTokens(GLSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GLSLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(GLSLParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(GLSLParser.COLON, i);
		}
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterSingleAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitSingleAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitSingleAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleAttributeContext singleAttribute() throws RecognitionException {
		SingleAttributeContext _localctx = new SingleAttributeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_singleAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(369);
				((SingleAttributeContext)_localctx).prefix = match(IDENTIFIER);
				setState(370);
				match(COLON);
				setState(371);
				match(COLON);
				}
				break;
			}
			setState(374);
			((SingleAttributeContext)_localctx).name = match(IDENTIFIER);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(375);
				match(LPAREN);
				setState(376);
				((SingleAttributeContext)_localctx).content = expression(0);
				setState(377);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationMemberContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public ArraySpecifierContext arraySpecifier() {
			return getRuleContext(ArraySpecifierContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(GLSLParser.ASSIGN_OP, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DeclarationMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterDeclarationMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitDeclarationMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitDeclarationMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationMemberContext declarationMember() throws RecognitionException {
		DeclarationMemberContext _localctx = new DeclarationMemberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarationMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(IDENTIFIER);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(382);
				arraySpecifier();
				}
			}

			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN_OP) {
				{
				setState(385);
				match(ASSIGN_OP);
				setState(386);
				initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FullySpecifiedTypeContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FullySpecifiedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullySpecifiedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterFullySpecifiedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitFullySpecifiedType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitFullySpecifiedType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullySpecifiedTypeContext fullySpecifiedType() throws RecognitionException {
		FullySpecifiedTypeContext _localctx = new FullySpecifiedTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fullySpecifiedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 68715281404L) != 0) {
				{
				setState(389);
				typeQualifier();
				}
			}

			setState(392);
			typeSpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StorageQualifierContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<Token> typeNames = new ArrayList<Token>();
		public TerminalNode CONST() { return getToken(GLSLParser.CONST, 0); }
		public TerminalNode IN() { return getToken(GLSLParser.IN, 0); }
		public TerminalNode OUT() { return getToken(GLSLParser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(GLSLParser.INOUT, 0); }
		public TerminalNode CENTROID() { return getToken(GLSLParser.CENTROID, 0); }
		public TerminalNode PATCH() { return getToken(GLSLParser.PATCH, 0); }
		public TerminalNode SAMPLE() { return getToken(GLSLParser.SAMPLE, 0); }
		public TerminalNode UNIFORM() { return getToken(GLSLParser.UNIFORM, 0); }
		public TerminalNode VARYING() { return getToken(GLSLParser.VARYING, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(GLSLParser.ATTRIBUTE, 0); }
		public TerminalNode BUFFER() { return getToken(GLSLParser.BUFFER, 0); }
		public TerminalNode SHARED() { return getToken(GLSLParser.SHARED, 0); }
		public TerminalNode RESTRICT() { return getToken(GLSLParser.RESTRICT, 0); }
		public TerminalNode VOLATILE() { return getToken(GLSLParser.VOLATILE, 0); }
		public TerminalNode COHERENT() { return getToken(GLSLParser.COHERENT, 0); }
		public TerminalNode READONLY() { return getToken(GLSLParser.READONLY, 0); }
		public TerminalNode WRITEONLY() { return getToken(GLSLParser.WRITEONLY, 0); }
		public TerminalNode SUBROUTINE() { return getToken(GLSLParser.SUBROUTINE, 0); }
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(GLSLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(GLSLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public TerminalNode DEVICECOHERENT() { return getToken(GLSLParser.DEVICECOHERENT, 0); }
		public TerminalNode QUEUEFAMILYCOHERENT() { return getToken(GLSLParser.QUEUEFAMILYCOHERENT, 0); }
		public TerminalNode WORKGROUPCOHERENT() { return getToken(GLSLParser.WORKGROUPCOHERENT, 0); }
		public TerminalNode SUBGROUPCOHERENT() { return getToken(GLSLParser.SUBGROUPCOHERENT, 0); }
		public TerminalNode NONPRIVATE() { return getToken(GLSLParser.NONPRIVATE, 0); }
		public StorageQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStorageQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStorageQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitStorageQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageQualifierContext storageQualifier() throws RecognitionException {
		StorageQualifierContext _localctx = new StorageQualifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_storageQualifier);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(CONST);
				}
				break;
			case IN:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(IN);
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				match(OUT);
				}
				break;
			case INOUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(397);
				match(INOUT);
				}
				break;
			case CENTROID:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				match(CENTROID);
				}
				break;
			case PATCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(399);
				match(PATCH);
				}
				break;
			case SAMPLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(400);
				match(SAMPLE);
				}
				break;
			case UNIFORM:
				enterOuterAlt(_localctx, 8);
				{
				setState(401);
				match(UNIFORM);
				}
				break;
			case VARYING:
				enterOuterAlt(_localctx, 9);
				{
				setState(402);
				match(VARYING);
				}
				break;
			case ATTRIBUTE:
				enterOuterAlt(_localctx, 10);
				{
				setState(403);
				match(ATTRIBUTE);
				}
				break;
			case BUFFER:
				enterOuterAlt(_localctx, 11);
				{
				setState(404);
				match(BUFFER);
				}
				break;
			case SHARED:
				enterOuterAlt(_localctx, 12);
				{
				setState(405);
				match(SHARED);
				}
				break;
			case RESTRICT:
				enterOuterAlt(_localctx, 13);
				{
				setState(406);
				match(RESTRICT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 14);
				{
				setState(407);
				match(VOLATILE);
				}
				break;
			case COHERENT:
				enterOuterAlt(_localctx, 15);
				{
				setState(408);
				match(COHERENT);
				}
				break;
			case READONLY:
				enterOuterAlt(_localctx, 16);
				{
				setState(409);
				match(READONLY);
				}
				break;
			case WRITEONLY:
				enterOuterAlt(_localctx, 17);
				{
				setState(410);
				match(WRITEONLY);
				}
				break;
			case SUBROUTINE:
				enterOuterAlt(_localctx, 18);
				{
				setState(411);
				match(SUBROUTINE);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(412);
					match(LPAREN);
					setState(413);
					((StorageQualifierContext)_localctx).IDENTIFIER = match(IDENTIFIER);
					((StorageQualifierContext)_localctx).typeNames.add(((StorageQualifierContext)_localctx).IDENTIFIER);
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(414);
						match(COMMA);
						setState(415);
						((StorageQualifierContext)_localctx).IDENTIFIER = match(IDENTIFIER);
						((StorageQualifierContext)_localctx).typeNames.add(((StorageQualifierContext)_localctx).IDENTIFIER);
						}
						}
						setState(420);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(421);
					match(RPAREN);
					}
				}

				}
				break;
			case DEVICECOHERENT:
				enterOuterAlt(_localctx, 19);
				{
				setState(424);
				match(DEVICECOHERENT);
				}
				break;
			case QUEUEFAMILYCOHERENT:
				enterOuterAlt(_localctx, 20);
				{
				setState(425);
				match(QUEUEFAMILYCOHERENT);
				}
				break;
			case WORKGROUPCOHERENT:
				enterOuterAlt(_localctx, 21);
				{
				setState(426);
				match(WORKGROUPCOHERENT);
				}
				break;
			case SUBGROUPCOHERENT:
				enterOuterAlt(_localctx, 22);
				{
				setState(427);
				match(SUBGROUPCOHERENT);
				}
				break;
			case NONPRIVATE:
				enterOuterAlt(_localctx, 23);
				{
				setState(428);
				match(NONPRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LayoutQualifierContext extends ParserRuleContext {
		public LayoutQualifierIdContext layoutQualifierId;
		public List<LayoutQualifierIdContext> layoutQualifiers = new ArrayList<LayoutQualifierIdContext>();
		public TerminalNode LAYOUT() { return getToken(GLSLParser.LAYOUT, 0); }
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public List<LayoutQualifierIdContext> layoutQualifierId() {
			return getRuleContexts(LayoutQualifierIdContext.class);
		}
		public LayoutQualifierIdContext layoutQualifierId(int i) {
			return getRuleContext(LayoutQualifierIdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public LayoutQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterLayoutQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitLayoutQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitLayoutQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutQualifierContext layoutQualifier() throws RecognitionException {
		LayoutQualifierContext _localctx = new LayoutQualifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_layoutQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(LAYOUT);
			setState(432);
			match(LPAREN);
			setState(433);
			((LayoutQualifierContext)_localctx).layoutQualifierId = layoutQualifierId();
			((LayoutQualifierContext)_localctx).layoutQualifiers.add(((LayoutQualifierContext)_localctx).layoutQualifierId);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(434);
				match(COMMA);
				setState(435);
				((LayoutQualifierContext)_localctx).layoutQualifierId = layoutQualifierId();
				((LayoutQualifierContext)_localctx).layoutQualifiers.add(((LayoutQualifierContext)_localctx).layoutQualifierId);
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LayoutQualifierIdContext extends ParserRuleContext {
		public LayoutQualifierIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutQualifierId; }
	 
		public LayoutQualifierIdContext() { }
		public void copyFrom(LayoutQualifierIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SharedLayoutQualifierContext extends LayoutQualifierIdContext {
		public TerminalNode SHARED() { return getToken(GLSLParser.SHARED, 0); }
		public SharedLayoutQualifierContext(LayoutQualifierIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterSharedLayoutQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitSharedLayoutQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitSharedLayoutQualifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedLayoutQualifierContext extends LayoutQualifierIdContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(GLSLParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedLayoutQualifierContext(LayoutQualifierIdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterNamedLayoutQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitNamedLayoutQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitNamedLayoutQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutQualifierIdContext layoutQualifierId() throws RecognitionException {
		LayoutQualifierIdContext _localctx = new LayoutQualifierIdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_layoutQualifierId);
		int _la;
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new NamedLayoutQualifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(IDENTIFIER);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN_OP) {
					{
					setState(444);
					match(ASSIGN_OP);
					setState(445);
					expression(0);
					}
				}

				}
				break;
			case SHARED:
				_localctx = new SharedLayoutQualifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(SHARED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrecisionQualifierContext extends ParserRuleContext {
		public TerminalNode HIGHP() { return getToken(GLSLParser.HIGHP, 0); }
		public TerminalNode MEDIUMP() { return getToken(GLSLParser.MEDIUMP, 0); }
		public TerminalNode LOWP() { return getToken(GLSLParser.LOWP, 0); }
		public PrecisionQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precisionQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterPrecisionQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitPrecisionQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitPrecisionQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecisionQualifierContext precisionQualifier() throws RecognitionException {
		PrecisionQualifierContext _localctx = new PrecisionQualifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_precisionQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationQualifierContext extends ParserRuleContext {
		public TerminalNode SMOOTH() { return getToken(GLSLParser.SMOOTH, 0); }
		public TerminalNode FLAT() { return getToken(GLSLParser.FLAT, 0); }
		public TerminalNode NOPERSPECTIVE() { return getToken(GLSLParser.NOPERSPECTIVE, 0); }
		public InterpolationQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterInterpolationQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitInterpolationQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitInterpolationQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationQualifierContext interpolationQualifier() throws RecognitionException {
		InterpolationQualifierContext _localctx = new InterpolationQualifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_interpolationQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 8437760L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InvariantQualifierContext extends ParserRuleContext {
		public TerminalNode INVARIANT() { return getToken(GLSLParser.INVARIANT, 0); }
		public InvariantQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariantQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterInvariantQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitInvariantQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitInvariantQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantQualifierContext invariantQualifier() throws RecognitionException {
		InvariantQualifierContext _localctx = new InvariantQualifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_invariantQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(INVARIANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PreciseQualifierContext extends ParserRuleContext {
		public TerminalNode PRECISE() { return getToken(GLSLParser.PRECISE, 0); }
		public PreciseQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preciseQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterPreciseQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitPreciseQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitPreciseQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreciseQualifierContext preciseQualifier() throws RecognitionException {
		PreciseQualifierContext _localctx = new PreciseQualifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_preciseQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(PRECISE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeQualifierContext extends ParserRuleContext {
		public List<StorageQualifierContext> storageQualifier() {
			return getRuleContexts(StorageQualifierContext.class);
		}
		public StorageQualifierContext storageQualifier(int i) {
			return getRuleContext(StorageQualifierContext.class,i);
		}
		public List<LayoutQualifierContext> layoutQualifier() {
			return getRuleContexts(LayoutQualifierContext.class);
		}
		public LayoutQualifierContext layoutQualifier(int i) {
			return getRuleContext(LayoutQualifierContext.class,i);
		}
		public List<PrecisionQualifierContext> precisionQualifier() {
			return getRuleContexts(PrecisionQualifierContext.class);
		}
		public PrecisionQualifierContext precisionQualifier(int i) {
			return getRuleContext(PrecisionQualifierContext.class,i);
		}
		public List<InterpolationQualifierContext> interpolationQualifier() {
			return getRuleContexts(InterpolationQualifierContext.class);
		}
		public InterpolationQualifierContext interpolationQualifier(int i) {
			return getRuleContext(InterpolationQualifierContext.class,i);
		}
		public List<InvariantQualifierContext> invariantQualifier() {
			return getRuleContexts(InvariantQualifierContext.class);
		}
		public InvariantQualifierContext invariantQualifier(int i) {
			return getRuleContext(InvariantQualifierContext.class,i);
		}
		public List<PreciseQualifierContext> preciseQualifier() {
			return getRuleContexts(PreciseQualifierContext.class);
		}
		public PreciseQualifierContext preciseQualifier(int i) {
			return getRuleContext(PreciseQualifierContext.class,i);
		}
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(465);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNIFORM:
				case BUFFER:
				case IN:
				case OUT:
				case INOUT:
				case CONST:
				case CENTROID:
				case ATTRIBUTE:
				case VOLATILE:
				case VARYING:
				case SHARED:
				case SAMPLE:
				case PATCH:
				case COHERENT:
				case RESTRICT:
				case READONLY:
				case WRITEONLY:
				case SUBROUTINE:
				case DEVICECOHERENT:
				case QUEUEFAMILYCOHERENT:
				case WORKGROUPCOHERENT:
				case SUBGROUPCOHERENT:
				case NONPRIVATE:
					{
					setState(459);
					storageQualifier();
					}
					break;
				case LAYOUT:
					{
					setState(460);
					layoutQualifier();
					}
					break;
				case HIGHP:
				case MEDIUMP:
				case LOWP:
					{
					setState(461);
					precisionQualifier();
					}
					break;
				case SMOOTH:
				case FLAT:
				case NOPERSPECTIVE:
					{
					setState(462);
					interpolationQualifier();
					}
					break;
				case INVARIANT:
					{
					setState(463);
					invariantQualifier();
					}
					break;
				case PRECISE:
					{
					setState(464);
					preciseQualifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(467); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 68715281404L) != 0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public BuiltinTypeSpecifierFixedContext builtinTypeSpecifierFixed() {
			return getRuleContext(BuiltinTypeSpecifierFixedContext.class,0);
		}
		public BuiltinTypeSpecifierParseableContext builtinTypeSpecifierParseable() {
			return getRuleContext(BuiltinTypeSpecifierParseableContext.class,0);
		}
		public StructSpecifierContext structSpecifier() {
			return getRuleContext(StructSpecifierContext.class,0);
		}
		public ArraySpecifierContext arraySpecifier() {
			return getRuleContext(ArraySpecifierContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(469);
				match(IDENTIFIER);
				}
				break;
			case ATOMIC_UINT:
			case IMAGE1D:
			case IMAGE2D:
			case IMAGE3D:
			case UIMAGE1D:
			case UIMAGE2D:
			case UIMAGE3D:
			case IIMAGE1D:
			case IIMAGE2D:
			case IIMAGE3D:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLER2DRECT:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLER2DRECTSHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER2DRECT:
			case ISAMPLER3D:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER2DRECT:
			case USAMPLER3D:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case IMAGE2DRECT:
			case IMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DRECT:
			case IIMAGE1DARRAY:
			case IIMAGE2DARRAY:
			case IIMAGE2DMS:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DRECT:
			case UIMAGE1DARRAY:
			case UIMAGE2DARRAY:
			case UIMAGE2DMS:
			case UIMAGE2DMSARRAY:
			case SAMPLERCUBESHADOW:
			case SAMPLERCUBEARRAYSHADOW:
			case SAMPLERCUBE:
			case ISAMPLERCUBE:
			case USAMPLERCUBE:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLERCUBEARRAY:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case IMAGECUBE:
			case UIMAGECUBE:
			case IIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case VOID:
				{
				setState(470);
				builtinTypeSpecifierFixed();
				}
				break;
			case BOOL:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case INT8:
			case I8VEC2:
			case I8VEC3:
			case I8VEC4:
			case UINT8:
			case U8VEC2:
			case U8VEC3:
			case U8VEC4:
			case INT16:
			case I16VEC2:
			case I16VEC3:
			case I16VEC4:
			case UINT16:
			case U16VEC2:
			case U16VEC3:
			case U16VEC4:
			case INT32:
			case I32VEC2:
			case I32VEC3:
			case I32VEC4:
			case UINT32:
			case U32VEC2:
			case U32VEC3:
			case U32VEC4:
			case INT64:
			case I64VEC2:
			case I64VEC3:
			case I64VEC4:
			case UINT64:
			case U64VEC2:
			case U64VEC3:
			case U64VEC4:
			case FLOAT16:
			case F16VEC2:
			case F16VEC3:
			case F16VEC4:
			case F16MAT2X2:
			case F16MAT2X3:
			case F16MAT2X4:
			case F16MAT3X2:
			case F16MAT3X3:
			case F16MAT3X4:
			case F16MAT4X2:
			case F16MAT4X3:
			case F16MAT4X4:
			case FLOAT32:
			case F32VEC2:
			case F32VEC3:
			case F32VEC4:
			case F32MAT2X2:
			case F32MAT2X3:
			case F32MAT2X4:
			case F32MAT3X2:
			case F32MAT3X3:
			case F32MAT3X4:
			case F32MAT4X2:
			case F32MAT4X3:
			case F32MAT4X4:
			case FLOAT64:
			case F64VEC2:
			case F64VEC3:
			case F64VEC4:
			case F64MAT2X2:
			case F64MAT2X3:
			case F64MAT2X4:
			case F64MAT3X2:
			case F64MAT3X3:
			case F64MAT3X4:
			case F64MAT4X2:
			case F64MAT4X3:
			case F64MAT4X4:
				{
				setState(471);
				builtinTypeSpecifierParseable();
				}
				break;
			case STRUCT:
				{
				setState(472);
				structSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(475);
				arraySpecifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArraySpecifierContext extends ParserRuleContext {
		public List<ArraySpecifierSegmentContext> arraySpecifierSegment() {
			return getRuleContexts(ArraySpecifierSegmentContext.class);
		}
		public ArraySpecifierSegmentContext arraySpecifierSegment(int i) {
			return getRuleContext(ArraySpecifierSegmentContext.class,i);
		}
		public ArraySpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterArraySpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitArraySpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitArraySpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySpecifierContext arraySpecifier() throws RecognitionException {
		ArraySpecifierContext _localctx = new ArraySpecifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arraySpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(478);
				arraySpecifierSegment();
				}
				}
				setState(481); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArraySpecifierSegmentContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(GLSLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(GLSLParser.RBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArraySpecifierSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySpecifierSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterArraySpecifierSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitArraySpecifierSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitArraySpecifierSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySpecifierSegmentContext arraySpecifierSegment() throws RecognitionException {
		ArraySpecifierSegmentContext _localctx = new ArraySpecifierSegmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arraySpecifierSegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(483);
			match(LBRACKET);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & -32765L) != 0 || (((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & -1L) != 0 || (((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & 281474976710655L) != 0 || (((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & 67116545L) != 0) {
				{
				setState(484);
				expression(0);
				}
			}

			setState(487);
			match(RBRACKET);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltinTypeSpecifierParseableContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(GLSLParser.BOOL, 0); }
		public TerminalNode BVEC2() { return getToken(GLSLParser.BVEC2, 0); }
		public TerminalNode BVEC3() { return getToken(GLSLParser.BVEC3, 0); }
		public TerminalNode BVEC4() { return getToken(GLSLParser.BVEC4, 0); }
		public TerminalNode FLOAT16() { return getToken(GLSLParser.FLOAT16, 0); }
		public TerminalNode F16VEC2() { return getToken(GLSLParser.F16VEC2, 0); }
		public TerminalNode F16VEC3() { return getToken(GLSLParser.F16VEC3, 0); }
		public TerminalNode F16VEC4() { return getToken(GLSLParser.F16VEC4, 0); }
		public TerminalNode F16MAT2X2() { return getToken(GLSLParser.F16MAT2X2, 0); }
		public TerminalNode F16MAT2X3() { return getToken(GLSLParser.F16MAT2X3, 0); }
		public TerminalNode F16MAT2X4() { return getToken(GLSLParser.F16MAT2X4, 0); }
		public TerminalNode F16MAT3X2() { return getToken(GLSLParser.F16MAT3X2, 0); }
		public TerminalNode F16MAT3X3() { return getToken(GLSLParser.F16MAT3X3, 0); }
		public TerminalNode F16MAT3X4() { return getToken(GLSLParser.F16MAT3X4, 0); }
		public TerminalNode F16MAT4X2() { return getToken(GLSLParser.F16MAT4X2, 0); }
		public TerminalNode F16MAT4X3() { return getToken(GLSLParser.F16MAT4X3, 0); }
		public TerminalNode F16MAT4X4() { return getToken(GLSLParser.F16MAT4X4, 0); }
		public TerminalNode FLOAT32() { return getToken(GLSLParser.FLOAT32, 0); }
		public TerminalNode F32VEC2() { return getToken(GLSLParser.F32VEC2, 0); }
		public TerminalNode F32VEC3() { return getToken(GLSLParser.F32VEC3, 0); }
		public TerminalNode F32VEC4() { return getToken(GLSLParser.F32VEC4, 0); }
		public TerminalNode F32MAT2X2() { return getToken(GLSLParser.F32MAT2X2, 0); }
		public TerminalNode F32MAT2X3() { return getToken(GLSLParser.F32MAT2X3, 0); }
		public TerminalNode F32MAT2X4() { return getToken(GLSLParser.F32MAT2X4, 0); }
		public TerminalNode F32MAT3X2() { return getToken(GLSLParser.F32MAT3X2, 0); }
		public TerminalNode F32MAT3X3() { return getToken(GLSLParser.F32MAT3X3, 0); }
		public TerminalNode F32MAT3X4() { return getToken(GLSLParser.F32MAT3X4, 0); }
		public TerminalNode F32MAT4X2() { return getToken(GLSLParser.F32MAT4X2, 0); }
		public TerminalNode F32MAT4X3() { return getToken(GLSLParser.F32MAT4X3, 0); }
		public TerminalNode F32MAT4X4() { return getToken(GLSLParser.F32MAT4X4, 0); }
		public TerminalNode FLOAT64() { return getToken(GLSLParser.FLOAT64, 0); }
		public TerminalNode F64VEC2() { return getToken(GLSLParser.F64VEC2, 0); }
		public TerminalNode F64VEC3() { return getToken(GLSLParser.F64VEC3, 0); }
		public TerminalNode F64VEC4() { return getToken(GLSLParser.F64VEC4, 0); }
		public TerminalNode F64MAT2X2() { return getToken(GLSLParser.F64MAT2X2, 0); }
		public TerminalNode F64MAT2X3() { return getToken(GLSLParser.F64MAT2X3, 0); }
		public TerminalNode F64MAT2X4() { return getToken(GLSLParser.F64MAT2X4, 0); }
		public TerminalNode F64MAT3X2() { return getToken(GLSLParser.F64MAT3X2, 0); }
		public TerminalNode F64MAT3X3() { return getToken(GLSLParser.F64MAT3X3, 0); }
		public TerminalNode F64MAT3X4() { return getToken(GLSLParser.F64MAT3X4, 0); }
		public TerminalNode F64MAT4X2() { return getToken(GLSLParser.F64MAT4X2, 0); }
		public TerminalNode F64MAT4X3() { return getToken(GLSLParser.F64MAT4X3, 0); }
		public TerminalNode F64MAT4X4() { return getToken(GLSLParser.F64MAT4X4, 0); }
		public TerminalNode INT8() { return getToken(GLSLParser.INT8, 0); }
		public TerminalNode I8VEC2() { return getToken(GLSLParser.I8VEC2, 0); }
		public TerminalNode I8VEC3() { return getToken(GLSLParser.I8VEC3, 0); }
		public TerminalNode I8VEC4() { return getToken(GLSLParser.I8VEC4, 0); }
		public TerminalNode UINT8() { return getToken(GLSLParser.UINT8, 0); }
		public TerminalNode U8VEC2() { return getToken(GLSLParser.U8VEC2, 0); }
		public TerminalNode U8VEC3() { return getToken(GLSLParser.U8VEC3, 0); }
		public TerminalNode U8VEC4() { return getToken(GLSLParser.U8VEC4, 0); }
		public TerminalNode INT16() { return getToken(GLSLParser.INT16, 0); }
		public TerminalNode I16VEC2() { return getToken(GLSLParser.I16VEC2, 0); }
		public TerminalNode I16VEC3() { return getToken(GLSLParser.I16VEC3, 0); }
		public TerminalNode I16VEC4() { return getToken(GLSLParser.I16VEC4, 0); }
		public TerminalNode UINT16() { return getToken(GLSLParser.UINT16, 0); }
		public TerminalNode U16VEC2() { return getToken(GLSLParser.U16VEC2, 0); }
		public TerminalNode U16VEC3() { return getToken(GLSLParser.U16VEC3, 0); }
		public TerminalNode U16VEC4() { return getToken(GLSLParser.U16VEC4, 0); }
		public TerminalNode INT32() { return getToken(GLSLParser.INT32, 0); }
		public TerminalNode I32VEC2() { return getToken(GLSLParser.I32VEC2, 0); }
		public TerminalNode I32VEC3() { return getToken(GLSLParser.I32VEC3, 0); }
		public TerminalNode I32VEC4() { return getToken(GLSLParser.I32VEC4, 0); }
		public TerminalNode UINT32() { return getToken(GLSLParser.UINT32, 0); }
		public TerminalNode U32VEC2() { return getToken(GLSLParser.U32VEC2, 0); }
		public TerminalNode U32VEC3() { return getToken(GLSLParser.U32VEC3, 0); }
		public TerminalNode U32VEC4() { return getToken(GLSLParser.U32VEC4, 0); }
		public TerminalNode INT64() { return getToken(GLSLParser.INT64, 0); }
		public TerminalNode I64VEC2() { return getToken(GLSLParser.I64VEC2, 0); }
		public TerminalNode I64VEC3() { return getToken(GLSLParser.I64VEC3, 0); }
		public TerminalNode I64VEC4() { return getToken(GLSLParser.I64VEC4, 0); }
		public TerminalNode UINT64() { return getToken(GLSLParser.UINT64, 0); }
		public TerminalNode U64VEC2() { return getToken(GLSLParser.U64VEC2, 0); }
		public TerminalNode U64VEC3() { return getToken(GLSLParser.U64VEC3, 0); }
		public TerminalNode U64VEC4() { return getToken(GLSLParser.U64VEC4, 0); }
		public BuiltinTypeSpecifierParseableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinTypeSpecifierParseable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterBuiltinTypeSpecifierParseable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitBuiltinTypeSpecifierParseable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitBuiltinTypeSpecifierParseable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltinTypeSpecifierParseableContext builtinTypeSpecifierParseable() throws RecognitionException {
		BuiltinTypeSpecifierParseableContext _localctx = new BuiltinTypeSpecifierParseableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_builtinTypeSpecifierParseable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_la = _input.LA(1);
			if ( !((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & -1L) != 0 || (((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 2047L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltinTypeSpecifierFixedContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(GLSLParser.VOID, 0); }
		public TerminalNode ATOMIC_UINT() { return getToken(GLSLParser.ATOMIC_UINT, 0); }
		public TerminalNode SAMPLER2D() { return getToken(GLSLParser.SAMPLER2D, 0); }
		public TerminalNode SAMPLER3D() { return getToken(GLSLParser.SAMPLER3D, 0); }
		public TerminalNode SAMPLERCUBE() { return getToken(GLSLParser.SAMPLERCUBE, 0); }
		public TerminalNode SAMPLER2DSHADOW() { return getToken(GLSLParser.SAMPLER2DSHADOW, 0); }
		public TerminalNode SAMPLERCUBESHADOW() { return getToken(GLSLParser.SAMPLERCUBESHADOW, 0); }
		public TerminalNode SAMPLER2DARRAY() { return getToken(GLSLParser.SAMPLER2DARRAY, 0); }
		public TerminalNode SAMPLER2DARRAYSHADOW() { return getToken(GLSLParser.SAMPLER2DARRAYSHADOW, 0); }
		public TerminalNode SAMPLERCUBEARRAY() { return getToken(GLSLParser.SAMPLERCUBEARRAY, 0); }
		public TerminalNode SAMPLERCUBEARRAYSHADOW() { return getToken(GLSLParser.SAMPLERCUBEARRAYSHADOW, 0); }
		public TerminalNode ISAMPLER2D() { return getToken(GLSLParser.ISAMPLER2D, 0); }
		public TerminalNode ISAMPLER3D() { return getToken(GLSLParser.ISAMPLER3D, 0); }
		public TerminalNode ISAMPLERCUBE() { return getToken(GLSLParser.ISAMPLERCUBE, 0); }
		public TerminalNode ISAMPLER2DARRAY() { return getToken(GLSLParser.ISAMPLER2DARRAY, 0); }
		public TerminalNode ISAMPLERCUBEARRAY() { return getToken(GLSLParser.ISAMPLERCUBEARRAY, 0); }
		public TerminalNode USAMPLER2D() { return getToken(GLSLParser.USAMPLER2D, 0); }
		public TerminalNode USAMPLER3D() { return getToken(GLSLParser.USAMPLER3D, 0); }
		public TerminalNode USAMPLERCUBE() { return getToken(GLSLParser.USAMPLERCUBE, 0); }
		public TerminalNode USAMPLER2DARRAY() { return getToken(GLSLParser.USAMPLER2DARRAY, 0); }
		public TerminalNode USAMPLERCUBEARRAY() { return getToken(GLSLParser.USAMPLERCUBEARRAY, 0); }
		public TerminalNode SAMPLER1D() { return getToken(GLSLParser.SAMPLER1D, 0); }
		public TerminalNode SAMPLER1DSHADOW() { return getToken(GLSLParser.SAMPLER1DSHADOW, 0); }
		public TerminalNode SAMPLER1DARRAY() { return getToken(GLSLParser.SAMPLER1DARRAY, 0); }
		public TerminalNode SAMPLER1DARRAYSHADOW() { return getToken(GLSLParser.SAMPLER1DARRAYSHADOW, 0); }
		public TerminalNode ISAMPLER1D() { return getToken(GLSLParser.ISAMPLER1D, 0); }
		public TerminalNode ISAMPLER1DARRAY() { return getToken(GLSLParser.ISAMPLER1DARRAY, 0); }
		public TerminalNode USAMPLER1D() { return getToken(GLSLParser.USAMPLER1D, 0); }
		public TerminalNode USAMPLER1DARRAY() { return getToken(GLSLParser.USAMPLER1DARRAY, 0); }
		public TerminalNode SAMPLER2DRECT() { return getToken(GLSLParser.SAMPLER2DRECT, 0); }
		public TerminalNode SAMPLER2DRECTSHADOW() { return getToken(GLSLParser.SAMPLER2DRECTSHADOW, 0); }
		public TerminalNode ISAMPLER2DRECT() { return getToken(GLSLParser.ISAMPLER2DRECT, 0); }
		public TerminalNode USAMPLER2DRECT() { return getToken(GLSLParser.USAMPLER2DRECT, 0); }
		public TerminalNode SAMPLERBUFFER() { return getToken(GLSLParser.SAMPLERBUFFER, 0); }
		public TerminalNode ISAMPLERBUFFER() { return getToken(GLSLParser.ISAMPLERBUFFER, 0); }
		public TerminalNode USAMPLERBUFFER() { return getToken(GLSLParser.USAMPLERBUFFER, 0); }
		public TerminalNode SAMPLER2DMS() { return getToken(GLSLParser.SAMPLER2DMS, 0); }
		public TerminalNode ISAMPLER2DMS() { return getToken(GLSLParser.ISAMPLER2DMS, 0); }
		public TerminalNode USAMPLER2DMS() { return getToken(GLSLParser.USAMPLER2DMS, 0); }
		public TerminalNode SAMPLER2DMSARRAY() { return getToken(GLSLParser.SAMPLER2DMSARRAY, 0); }
		public TerminalNode ISAMPLER2DMSARRAY() { return getToken(GLSLParser.ISAMPLER2DMSARRAY, 0); }
		public TerminalNode USAMPLER2DMSARRAY() { return getToken(GLSLParser.USAMPLER2DMSARRAY, 0); }
		public TerminalNode IMAGE2D() { return getToken(GLSLParser.IMAGE2D, 0); }
		public TerminalNode IIMAGE2D() { return getToken(GLSLParser.IIMAGE2D, 0); }
		public TerminalNode UIMAGE2D() { return getToken(GLSLParser.UIMAGE2D, 0); }
		public TerminalNode IMAGE3D() { return getToken(GLSLParser.IMAGE3D, 0); }
		public TerminalNode IIMAGE3D() { return getToken(GLSLParser.IIMAGE3D, 0); }
		public TerminalNode UIMAGE3D() { return getToken(GLSLParser.UIMAGE3D, 0); }
		public TerminalNode IMAGECUBE() { return getToken(GLSLParser.IMAGECUBE, 0); }
		public TerminalNode IIMAGECUBE() { return getToken(GLSLParser.IIMAGECUBE, 0); }
		public TerminalNode UIMAGECUBE() { return getToken(GLSLParser.UIMAGECUBE, 0); }
		public TerminalNode IMAGEBUFFER() { return getToken(GLSLParser.IMAGEBUFFER, 0); }
		public TerminalNode IIMAGEBUFFER() { return getToken(GLSLParser.IIMAGEBUFFER, 0); }
		public TerminalNode UIMAGEBUFFER() { return getToken(GLSLParser.UIMAGEBUFFER, 0); }
		public TerminalNode IMAGE1D() { return getToken(GLSLParser.IMAGE1D, 0); }
		public TerminalNode IIMAGE1D() { return getToken(GLSLParser.IIMAGE1D, 0); }
		public TerminalNode UIMAGE1D() { return getToken(GLSLParser.UIMAGE1D, 0); }
		public TerminalNode IMAGE1DARRAY() { return getToken(GLSLParser.IMAGE1DARRAY, 0); }
		public TerminalNode IIMAGE1DARRAY() { return getToken(GLSLParser.IIMAGE1DARRAY, 0); }
		public TerminalNode UIMAGE1DARRAY() { return getToken(GLSLParser.UIMAGE1DARRAY, 0); }
		public TerminalNode IMAGE2DRECT() { return getToken(GLSLParser.IMAGE2DRECT, 0); }
		public TerminalNode IIMAGE2DRECT() { return getToken(GLSLParser.IIMAGE2DRECT, 0); }
		public TerminalNode UIMAGE2DRECT() { return getToken(GLSLParser.UIMAGE2DRECT, 0); }
		public TerminalNode IMAGE2DARRAY() { return getToken(GLSLParser.IMAGE2DARRAY, 0); }
		public TerminalNode IIMAGE2DARRAY() { return getToken(GLSLParser.IIMAGE2DARRAY, 0); }
		public TerminalNode UIMAGE2DARRAY() { return getToken(GLSLParser.UIMAGE2DARRAY, 0); }
		public TerminalNode IMAGECUBEARRAY() { return getToken(GLSLParser.IMAGECUBEARRAY, 0); }
		public TerminalNode IIMAGECUBEARRAY() { return getToken(GLSLParser.IIMAGECUBEARRAY, 0); }
		public TerminalNode UIMAGECUBEARRAY() { return getToken(GLSLParser.UIMAGECUBEARRAY, 0); }
		public TerminalNode IMAGE2DMS() { return getToken(GLSLParser.IMAGE2DMS, 0); }
		public TerminalNode IIMAGE2DMS() { return getToken(GLSLParser.IIMAGE2DMS, 0); }
		public TerminalNode UIMAGE2DMS() { return getToken(GLSLParser.UIMAGE2DMS, 0); }
		public TerminalNode IMAGE2DMSARRAY() { return getToken(GLSLParser.IMAGE2DMSARRAY, 0); }
		public TerminalNode IIMAGE2DMSARRAY() { return getToken(GLSLParser.IIMAGE2DMSARRAY, 0); }
		public TerminalNode UIMAGE2DMSARRAY() { return getToken(GLSLParser.UIMAGE2DMSARRAY, 0); }
		public BuiltinTypeSpecifierFixedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinTypeSpecifierFixed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterBuiltinTypeSpecifierFixed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitBuiltinTypeSpecifierFixed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitBuiltinTypeSpecifierFixed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltinTypeSpecifierFixedContext builtinTypeSpecifierFixed() throws RecognitionException {
		BuiltinTypeSpecifierFixedContext _localctx = new BuiltinTypeSpecifierFixedContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_builtinTypeSpecifierFixed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if ( !(_la==ATOMIC_UINT || (((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & -1L) != 0 || (((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & 2559L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructSpecifierContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(GLSLParser.STRUCT, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public StructSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStructSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStructSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitStructSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructSpecifierContext structSpecifier() throws RecognitionException {
		StructSpecifierContext _localctx = new StructSpecifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_structSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(STRUCT);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(494);
				match(IDENTIFIER);
				}
			}

			setState(497);
			structBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(GLSLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GLSLParser.RBRACE, 0); }
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(LBRACE);
			setState(501); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(500);
				structMember();
				}
				}
				setState(503); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -576460683584995585L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -1L) != 0 || (((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & -1L) != 0 || (((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & -9223372036854611969L) != 0 );
			setState(505);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructMemberContext extends ParserRuleContext {
		public StructDeclaratorContext structDeclarator;
		public List<StructDeclaratorContext> structDeclarators = new ArrayList<StructDeclaratorContext>();
		public FullySpecifiedTypeContext fullySpecifiedType() {
			return getRuleContext(FullySpecifiedTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}
		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStructMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStructMember(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitStructMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_structMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			fullySpecifiedType();
			setState(508);
			((StructMemberContext)_localctx).structDeclarator = structDeclarator();
			((StructMemberContext)_localctx).structDeclarators.add(((StructMemberContext)_localctx).structDeclarator);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(509);
				match(COMMA);
				setState(510);
				((StructMemberContext)_localctx).structDeclarator = structDeclarator();
				((StructMemberContext)_localctx).structDeclarators.add(((StructMemberContext)_localctx).structDeclarator);
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public ArraySpecifierContext arraySpecifier() {
			return getRuleContext(ArraySpecifierContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStructDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(IDENTIFIER);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(519);
				arraySpecifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public InitializerContext initializer;
		public List<InitializerContext> initializers = new ArrayList<InitializerContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(GLSLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GLSLParser.RBRACE, 0); }
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GLSLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GLSLParser.COMMA, i);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_initializer);
		int _la;
		try {
			int _alt;
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATOMIC_UINT:
			case STRUCT:
			case UINT16CONSTANT:
			case INT16CONSTANT:
			case UINT32CONSTANT:
			case INT32CONSTANT:
			case UINT64CONSTANT:
			case INT64CONSTANT:
			case FLOAT16CONSTANT:
			case FLOAT32CONSTANT:
			case FLOAT64CONSTANT:
			case BOOLCONSTANT:
			case BOOL:
			case BVEC2:
			case BVEC3:
			case BVEC4:
			case INT8:
			case I8VEC2:
			case I8VEC3:
			case I8VEC4:
			case UINT8:
			case U8VEC2:
			case U8VEC3:
			case U8VEC4:
			case INT16:
			case I16VEC2:
			case I16VEC3:
			case I16VEC4:
			case UINT16:
			case U16VEC2:
			case U16VEC3:
			case U16VEC4:
			case INT32:
			case I32VEC2:
			case I32VEC3:
			case I32VEC4:
			case UINT32:
			case U32VEC2:
			case U32VEC3:
			case U32VEC4:
			case INT64:
			case I64VEC2:
			case I64VEC3:
			case I64VEC4:
			case UINT64:
			case U64VEC2:
			case U64VEC3:
			case U64VEC4:
			case FLOAT16:
			case F16VEC2:
			case F16VEC3:
			case F16VEC4:
			case F16MAT2X2:
			case F16MAT2X3:
			case F16MAT2X4:
			case F16MAT3X2:
			case F16MAT3X3:
			case F16MAT3X4:
			case F16MAT4X2:
			case F16MAT4X3:
			case F16MAT4X4:
			case FLOAT32:
			case F32VEC2:
			case F32VEC3:
			case F32VEC4:
			case F32MAT2X2:
			case F32MAT2X3:
			case F32MAT2X4:
			case F32MAT3X2:
			case F32MAT3X3:
			case F32MAT3X4:
			case F32MAT4X2:
			case F32MAT4X3:
			case F32MAT4X4:
			case FLOAT64:
			case F64VEC2:
			case F64VEC3:
			case F64VEC4:
			case F64MAT2X2:
			case F64MAT2X3:
			case F64MAT2X4:
			case F64MAT3X2:
			case F64MAT3X3:
			case F64MAT3X4:
			case F64MAT4X2:
			case F64MAT4X3:
			case F64MAT4X4:
			case IMAGE1D:
			case IMAGE2D:
			case IMAGE3D:
			case UIMAGE1D:
			case UIMAGE2D:
			case UIMAGE3D:
			case IIMAGE1D:
			case IIMAGE2D:
			case IIMAGE3D:
			case SAMPLER1D:
			case SAMPLER2D:
			case SAMPLER3D:
			case SAMPLER2DRECT:
			case SAMPLER1DSHADOW:
			case SAMPLER2DSHADOW:
			case SAMPLER2DRECTSHADOW:
			case SAMPLER1DARRAY:
			case SAMPLER2DARRAY:
			case SAMPLER1DARRAYSHADOW:
			case SAMPLER2DARRAYSHADOW:
			case ISAMPLER1D:
			case ISAMPLER2D:
			case ISAMPLER2DRECT:
			case ISAMPLER3D:
			case ISAMPLER1DARRAY:
			case ISAMPLER2DARRAY:
			case USAMPLER1D:
			case USAMPLER2D:
			case USAMPLER2DRECT:
			case USAMPLER3D:
			case USAMPLER1DARRAY:
			case USAMPLER2DARRAY:
			case SAMPLER2DMS:
			case ISAMPLER2DMS:
			case USAMPLER2DMS:
			case SAMPLER2DMSARRAY:
			case ISAMPLER2DMSARRAY:
			case USAMPLER2DMSARRAY:
			case IMAGE2DRECT:
			case IMAGE1DARRAY:
			case IMAGE2DARRAY:
			case IMAGE2DMS:
			case IMAGE2DMSARRAY:
			case IIMAGE2DRECT:
			case IIMAGE1DARRAY:
			case IIMAGE2DARRAY:
			case IIMAGE2DMS:
			case IIMAGE2DMSARRAY:
			case UIMAGE2DRECT:
			case UIMAGE1DARRAY:
			case UIMAGE2DARRAY:
			case UIMAGE2DMS:
			case UIMAGE2DMSARRAY:
			case SAMPLERCUBESHADOW:
			case SAMPLERCUBEARRAYSHADOW:
			case SAMPLERCUBE:
			case ISAMPLERCUBE:
			case USAMPLERCUBE:
			case SAMPLERBUFFER:
			case ISAMPLERBUFFER:
			case USAMPLERBUFFER:
			case SAMPLERCUBEARRAY:
			case ISAMPLERCUBEARRAY:
			case USAMPLERCUBEARRAY:
			case IMAGECUBE:
			case UIMAGECUBE:
			case IIMAGECUBE:
			case IMAGEBUFFER:
			case IIMAGEBUFFER:
			case UIMAGEBUFFER:
			case IMAGECUBEARRAY:
			case IIMAGECUBEARRAY:
			case UIMAGECUBEARRAY:
			case INC_OP:
			case DEC_OP:
			case VOID:
			case LPAREN:
			case PLUS_OP:
			case MINUS_OP:
			case LOGICAL_NOT_OP:
			case BITWISE_NEG_OP:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				expression(0);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(LBRACE);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & -32765L) != 0 || (((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & -1L) != 0 || (((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & 281474976710655L) != 0 || (((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & 67116549L) != 0) {
					{
					setState(524);
					((InitializerContext)_localctx).initializer = initializer();
					((InitializerContext)_localctx).initializers.add(((InitializerContext)_localctx).initializer);
					setState(529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
					while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(525);
							match(COMMA);
							setState(526);
							((InitializerContext)_localctx).initializer = initializer();
							((InitializerContext)_localctx).initializers.add(((InitializerContext)_localctx).initializer);
							}
							} 
						}
						setState(531);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
					}
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(532);
						match(COMMA);
						}
					}

					}
				}

				setState(537);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public CaseLabelContext caseLabel() {
			return getRuleContext(CaseLabelContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public DemoteStatementContext demoteStatement() {
			return getRuleContext(DemoteStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_statement);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				declarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				emptyStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(544);
				selectionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(545);
				switchStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(546);
				caseLabel();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(547);
				forStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(548);
				whileStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(549);
				doWhileStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(550);
				jumpStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(551);
				demoteStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(GLSLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(GLSLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(LBRACE);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & -137440002049L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & -1L) != 0 || (((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & -1L) != 0 || (((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & -9222309221427314689L) != 0) {
				{
				{
				setState(555);
				statement();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			expression(0);
			setState(566);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionStatementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public StatementContext ifTrue;
		public StatementContext ifFalse;
		public TerminalNode IF() { return getToken(GLSLParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(GLSLParser.ELSE, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_selectionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(570);
				attribute();
				}
			}

			setState(573);
			match(IF);
			setState(574);
			match(LPAREN);
			setState(575);
			((SelectionStatementContext)_localctx).condition = expression(0);
			setState(576);
			match(RPAREN);
			setState(577);
			((SelectionStatementContext)_localctx).ifTrue = statement();
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(578);
				match(ELSE);
				setState(579);
				((SelectionStatementContext)_localctx).ifFalse = statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IterationConditionContext extends ParserRuleContext {
		public Token name;
		public FullySpecifiedTypeContext fullySpecifiedType() {
			return getRuleContext(FullySpecifiedTypeContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(GLSLParser.ASSIGN_OP, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public IterationConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterIterationCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitIterationCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitIterationCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationConditionContext iterationCondition() throws RecognitionException {
		IterationConditionContext _localctx = new IterationConditionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_iterationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			fullySpecifiedType();
			setState(583);
			((IterationConditionContext)_localctx).name = match(IDENTIFIER);
			setState(584);
			match(ASSIGN_OP);
			setState(585);
			initializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public TerminalNode SWITCH() { return getToken(GLSLParser.SWITCH, 0); }
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(587);
				attribute();
				}
			}

			setState(590);
			match(SWITCH);
			setState(591);
			match(LPAREN);
			setState(592);
			((SwitchStatementContext)_localctx).condition = expression(0);
			setState(593);
			match(RPAREN);
			setState(594);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseLabelContext extends ParserRuleContext {
		public CaseLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLabel; }
	 
		public CaseLabelContext() { }
		public void copyFrom(CaseLabelContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultCaseLabelContext extends CaseLabelContext {
		public TerminalNode DEFAULT() { return getToken(GLSLParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public DefaultCaseLabelContext(CaseLabelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterDefaultCaseLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitDefaultCaseLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitDefaultCaseLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValuedCaseLabelContext extends CaseLabelContext {
		public TerminalNode CASE() { return getToken(GLSLParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public ValuedCaseLabelContext(CaseLabelContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterValuedCaseLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitValuedCaseLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitValuedCaseLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseLabelContext caseLabel() throws RecognitionException {
		CaseLabelContext _localctx = new CaseLabelContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_caseLabel);
		try {
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				_localctx = new ValuedCaseLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				match(CASE);
				setState(597);
				expression(0);
				setState(598);
				match(COLON);
				}
				break;
			case DEFAULT:
				_localctx = new DefaultCaseLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(DEFAULT);
				setState(601);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public IterationConditionContext initCondition;
		public StatementContext loopBody;
		public TerminalNode WHILE() { return getToken(GLSLParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IterationConditionContext iterationCondition() {
			return getRuleContext(IterationConditionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(604);
				attribute();
				}
			}

			setState(607);
			match(WHILE);
			setState(608);
			match(LPAREN);
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(609);
				((WhileStatementContext)_localctx).condition = expression(0);
				}
				break;
			case 2:
				{
				setState(610);
				((WhileStatementContext)_localctx).initCondition = iterationCondition();
				}
				break;
			}
			setState(613);
			match(RPAREN);
			setState(614);
			((WhileStatementContext)_localctx).loopBody = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext loopBody;
		public ExpressionContext condition;
		public TerminalNode DO() { return getToken(GLSLParser.DO, 0); }
		public TerminalNode WHILE() { return getToken(GLSLParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(616);
				attribute();
				}
			}

			setState(619);
			match(DO);
			setState(620);
			((DoWhileStatementContext)_localctx).loopBody = statement();
			setState(621);
			match(WHILE);
			setState(622);
			match(LPAREN);
			setState(623);
			((DoWhileStatementContext)_localctx).condition = expression(0);
			setState(624);
			match(RPAREN);
			setState(625);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public IterationConditionContext initCondition;
		public ExpressionContext incrementer;
		public StatementContext loopBody;
		public TerminalNode FOR() { return getToken(GLSLParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IterationConditionContext iterationCondition() {
			return getRuleContext(IterationConditionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(627);
				attribute();
				}
			}

			setState(630);
			match(FOR);
			setState(631);
			match(LPAREN);
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(632);
				emptyStatement();
				}
				break;
			case 2:
				{
				setState(633);
				expressionStatement();
				}
				break;
			case 3:
				{
				setState(634);
				declarationStatement();
				}
				break;
			}
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(637);
				((ForStatementContext)_localctx).condition = expression(0);
				}
				break;
			case 2:
				{
				setState(638);
				((ForStatementContext)_localctx).initCondition = iterationCondition();
				}
				break;
			}
			setState(641);
			match(SEMICOLON);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & -32765L) != 0 || (((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & -1L) != 0 || (((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & 281474976710655L) != 0 || (((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & 67116545L) != 0) {
				{
				setState(642);
				((ForStatementContext)_localctx).incrementer = expression(0);
				}
			}

			setState(645);
			match(RPAREN);
			setState(646);
			((ForStatementContext)_localctx).loopBody = statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DiscardStatementContext extends JumpStatementContext {
		public TerminalNode DISCARD() { return getToken(GLSLParser.DISCARD, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public DiscardStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterDiscardStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitDiscardStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitDiscardStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends JumpStatementContext {
		public TerminalNode BREAK() { return getToken(GLSLParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public BreakStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends JumpStatementContext {
		public TerminalNode CONTINUE() { return getToken(GLSLParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public ContinueStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends JumpStatementContext {
		public TerminalNode RETURN() { return getToken(GLSLParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_jumpStatement);
		int _la;
		try {
			setState(659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				match(CONTINUE);
				setState(649);
				match(SEMICOLON);
				}
				break;
			case BREAK:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(650);
				match(BREAK);
				setState(651);
				match(SEMICOLON);
				}
				break;
			case RETURN:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				match(RETURN);
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & -32765L) != 0 || (((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & -1L) != 0 || (((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & 281474976710655L) != 0 || (((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & 67116545L) != 0) {
					{
					setState(653);
					expression(0);
					}
				}

				setState(656);
				match(SEMICOLON);
				}
				break;
			case DISCARD:
				_localctx = new DiscardStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(657);
				match(DISCARD);
				setState(658);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DemoteStatementContext extends ParserRuleContext {
		public TerminalNode DEMOTE() { return getToken(GLSLParser.DEMOTE, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public DemoteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_demoteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).enterDemoteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GLSLParserListener ) ((GLSLParserListener)listener).exitDemoteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GLSLParserVisitor ) return ((GLSLParserVisitor<? extends T>)visitor).visitDemoteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DemoteStatementContext demoteStatement() throws RecognitionException {
		DemoteStatementContext _localctx = new DemoteStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_demoteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(DEMOTE);
			setState(662);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		case 14:
			return precpred(_ctx, 20);
		case 15:
			return precpred(_ctx, 19);
		case 16:
			return precpred(_ctx, 17);
		case 17:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0144\u0299\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u0001\u0000\u0003\u0000h\b\u0000\u0001\u0000\u0005\u0000"+
		"k\b\u0000\n\u0000\f\u0000n\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001v\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0082\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0089\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0094\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u009d\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00a4\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ac\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00b1\b\u0007\u0001\u0007\u0003\u0007"+
		"\u00b4\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c8\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00d0\b\n\n\n\f\n\u00d3\t\n\u0003\n\u00d5\b"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00da\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u0115\b\n\n\n\f\n\u0118\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0122"+
		"\b\u000b\u0003\u000b\u0124\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u012c\b\u000b\n\u000b"+
		"\f\u000b\u012f\t\u000b\u0003\u000b\u0131\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u013e\b\u000b\n\u000b"+
		"\f\u000b\u0141\t\u000b\u0003\u000b\u0143\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0147\b\u000b\u0001\f\u0003\f\u014a\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0152\b\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0157\b\r\n\r\f\r\u015a\t\r\u0003\r\u015c\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0161\b\u000e\u0003\u000e\u0163\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u016a"+
		"\b\u000f\n\u000f\f\u000f\u016d\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0175\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u017c\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u0180\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0184\b\u0011\u0001\u0012\u0003\u0012\u0187\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u01a1\b\u0013\n\u0013\f\u0013\u01a4\t\u0013\u0001\u0013\u0003\u0013"+
		"\u01a7\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u01ae\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u01b5\b\u0014\n\u0014\f\u0014\u01b8\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01bf"+
		"\b\u0015\u0001\u0015\u0003\u0015\u01c2\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0004\u001a\u01d2\b\u001a\u000b\u001a\f\u001a\u01d3\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01da\b\u001b\u0001\u001b\u0003"+
		"\u001b\u01dd\b\u001b\u0001\u001c\u0004\u001c\u01e0\b\u001c\u000b\u001c"+
		"\f\u001c\u01e1\u0001\u001d\u0001\u001d\u0003\u001d\u01e6\b\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0003 \u01f0\b \u0001 \u0001 \u0001!\u0001!\u0004!\u01f6\b!\u000b"+
		"!\f!\u01f7\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0200"+
		"\b\"\n\"\f\"\u0203\t\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u0209\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0005$\u0210\b$\n$\f$\u0213\t$\u0001$\u0003"+
		"$\u0216\b$\u0003$\u0218\b$\u0001$\u0003$\u021b\b$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u0229\b%\u0001&\u0001&\u0005&\u022d\b&\n&\f&\u0230\t&\u0001&\u0001&"+
		"\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001*\u0003*\u023c"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0245\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001,\u0003,\u024d\b,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u025b\b-\u0001.\u0003.\u025e\b.\u0001.\u0001.\u0001.\u0001.\u0003.\u0264"+
		"\b.\u0001.\u0001.\u0001.\u0001/\u0003/\u026a\b/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u00010\u00030\u0275\b0\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u027c\b0\u00010\u00010\u00030\u0280\b0\u00010\u0001"+
		"0\u00030\u0284\b0\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00031\u028f\b1\u00011\u00011\u00011\u00031\u0294\b1\u00012\u0001"+
		"2\u00012\u00012\u0000\u0001\u00143\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bd\u0000\u0013\u0001\u0000\u011d\u012d\u0001\u0000\u011a"+
		"\u011c\u0001\u0000\u010c\u010d\u0001\u0000\u010f\u0110\u0001\u0000\u0112"+
		"\u0115\u0001\u0000\u0002\u0005\u0001\u00003<\u0002\u0000\u00d1\u00d2\u00f0"+
		"\u00f3\u0001\u0000\u00f4\u00f6\u0001\u0000\u00f0\u00f1\u0001\u0000\u00d4"+
		"\u00d5\u0002\u0000\u00d6\u00d7\u00f7\u00f8\u0001\u0000\u00d8\u00d9\u0002"+
		"\u0000\u00dd\u00e6\u00fd\u00fd\u0001\u0000\u00d1\u00d2\u0001\u0000\u0007"+
		"\t\u0002\u0000\u000e\u000f\u0017\u0017\u0001\u0000=\u0087\u0003\u0000"+
		"$$\u0088\u00d0\u00d3\u00d3\u02f3\u0000g\u0001\u0000\u0000\u0000\u0002"+
		"q\u0001\u0000\u0000\u0000\u0004\u0081\u0001\u0000\u0000\u0000\u0006\u0083"+
		"\u0001\u0000\u0000\u0000\b\u0085\u0001\u0000\u0000\u0000\n\u0097\u0001"+
		"\u0000\u0000\u0000\f\u00a0\u0001\u0000\u0000\u0000\u000e\u00a7\u0001\u0000"+
		"\u0000\u0000\u0010\u00b7\u0001\u0000\u0000\u0000\u0012\u00bb\u0001\u0000"+
		"\u0000\u0000\u0014\u00d9\u0001\u0000\u0000\u0000\u0016\u0146\u0001\u0000"+
		"\u0000\u0000\u0018\u0149\u0001\u0000\u0000\u0000\u001a\u015b\u0001\u0000"+
		"\u0000\u0000\u001c\u015d\u0001\u0000\u0000\u0000\u001e\u0164\u0001\u0000"+
		"\u0000\u0000 \u0174\u0001\u0000\u0000\u0000\"\u017d\u0001\u0000\u0000"+
		"\u0000$\u0186\u0001\u0000\u0000\u0000&\u01ad\u0001\u0000\u0000\u0000("+
		"\u01af\u0001\u0000\u0000\u0000*\u01c1\u0001\u0000\u0000\u0000,\u01c3\u0001"+
		"\u0000\u0000\u0000.\u01c5\u0001\u0000\u0000\u00000\u01c7\u0001\u0000\u0000"+
		"\u00002\u01c9\u0001\u0000\u0000\u00004\u01d1\u0001\u0000\u0000\u00006"+
		"\u01d9\u0001\u0000\u0000\u00008\u01df\u0001\u0000\u0000\u0000:\u01e3\u0001"+
		"\u0000\u0000\u0000<\u01e9\u0001\u0000\u0000\u0000>\u01eb\u0001\u0000\u0000"+
		"\u0000@\u01ed\u0001\u0000\u0000\u0000B\u01f3\u0001\u0000\u0000\u0000D"+
		"\u01fb\u0001\u0000\u0000\u0000F\u0206\u0001\u0000\u0000\u0000H\u021a\u0001"+
		"\u0000\u0000\u0000J\u0228\u0001\u0000\u0000\u0000L\u022a\u0001\u0000\u0000"+
		"\u0000N\u0233\u0001\u0000\u0000\u0000P\u0235\u0001\u0000\u0000\u0000R"+
		"\u0238\u0001\u0000\u0000\u0000T\u023b\u0001\u0000\u0000\u0000V\u0246\u0001"+
		"\u0000\u0000\u0000X\u024c\u0001\u0000\u0000\u0000Z\u025a\u0001\u0000\u0000"+
		"\u0000\\\u025d\u0001\u0000\u0000\u0000^\u0269\u0001\u0000\u0000\u0000"+
		"`\u0274\u0001\u0000\u0000\u0000b\u0293\u0001\u0000\u0000\u0000d\u0295"+
		"\u0001\u0000\u0000\u0000fh\u0003\u0002\u0001\u0000gf\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hl\u0001\u0000\u0000\u0000ik\u0003\u0004"+
		"\u0002\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000op\u0005\u0000\u0000\u0001p\u0001\u0001\u0000"+
		"\u0000\u0000qr\u0005\u0100\u0000\u0000rs\u0005\u0108\u0000\u0000su\u0007"+
		"\u0000\u0000\u0000tv\u0007\u0001\u0000\u0000ut\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0005\u0135\u0000"+
		"\u0000x\u0003\u0001\u0000\u0000\u0000y\u0082\u0003\u0012\t\u0000z\u0082"+
		"\u0003\u0016\u000b\u0000{\u0082\u0003\b\u0004\u0000|\u0082\u0003\n\u0005"+
		"\u0000}\u0082\u0003\f\u0006\u0000~\u0082\u0003\u000e\u0007\u0000\u007f"+
		"\u0082\u0003\u0010\b\u0000\u0080\u0082\u0003\u0006\u0003\u0000\u0081y"+
		"\u0001\u0000\u0000\u0000\u0081z\u0001\u0000\u0000\u0000\u0081{\u0001\u0000"+
		"\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000\u0000"+
		"\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0005\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005\u00eb\u0000\u0000\u0084\u0007\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005\u0100\u0000\u0000\u0086\u0088\u0005\u010b\u0000\u0000\u0087"+
		"\u0089\u0005\u0119\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u0093\u0001\u0000\u0000\u0000\u008a"+
		"\u0094\u0005\u0131\u0000\u0000\u008b\u008c\u0007\u0002\u0000\u0000\u008c"+
		"\u008d\u0005\u0117\u0000\u0000\u008d\u008e\u0007\u0003\u0000\u0000\u008e"+
		"\u0094\u0005\u0118\u0000\u0000\u008f\u0090\u0005\u010e\u0000\u0000\u0090"+
		"\u0091\u0005\u0117\u0000\u0000\u0091\u0092\u0005\u0111\u0000\u0000\u0092"+
		"\u0094\u0005\u0118\u0000\u0000\u0093\u008a\u0001\u0000\u0000\u0000\u0093"+
		"\u008b\u0001\u0000\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0135\u0000\u0000\u0096"+
		"\t\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0100\u0000\u0000\u0098\u0099"+
		"\u0005\u0107\u0000\u0000\u0099\u009c\u0005\u0131\u0000\u0000\u009a\u009b"+
		"\u0005\u0116\u0000\u0000\u009b\u009d\u0007\u0004\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0135\u0000\u0000\u009f\u000b"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0100\u0000\u0000\u00a1\u00a3"+
		"\u0005\u0109\u0000\u0000\u00a2\u00a4\u0005\u013f\u0000\u0000\u00a3\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u013d\u0000\u0000\u00a6\r\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u0100\u0000\u0000\u00a8\u00b3\u0005"+
		"\u010a\u0000\u0000\u00a9\u00ab\u0005\u012e\u0000\u0000\u00aa\u00ac\u0005"+
		"\u0137\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b4\u0005"+
		"\u0138\u0000\u0000\u00ae\u00b0\u0005\u012f\u0000\u0000\u00af\u00b1\u0005"+
		"\u0139\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0005"+
		"\u013a\u0000\u0000\u00b3\u00a9\u0001\u0000\u0000\u0000\u00b3\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0135\u0000\u0000\u00b6\u000f\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003"+
		"(\u0014\u0000\u00b8\u00b9\u0007\u0005\u0000\u0000\u00b9\u00ba\u0005\u00eb"+
		"\u0000\u0000\u00ba\u0011\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003\u0018"+
		"\f\u0000\u00bc\u00bd\u0003L&\u0000\u00bd\u0013\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0006\n\uffff\uffff\u0000\u00bf\u00da\u0005\u0101\u0000\u0000"+
		"\u00c0\u00da\u0007\u0006\u0000\u0000\u00c1\u00c2\u0005\u00e7\u0000\u0000"+
		"\u00c2\u00c3\u0003\u0014\n\u0000\u00c3\u00c4\u0005\u00e8\u0000\u0000\u00c4"+
		"\u00da\u0001\u0000\u0000\u0000\u00c5\u00c8\u0005\u0101\u0000\u0000\u00c6"+
		"\u00c8\u00036\u001b\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00d4"+
		"\u0005\u00e7\u0000\u0000\u00ca\u00d5\u0001\u0000\u0000\u0000\u00cb\u00d5"+
		"\u0005\u00d3\u0000\u0000\u00cc\u00d1\u0003\u0014\n\u0000\u00cd\u00ce\u0005"+
		"\u00ee\u0000\u0000\u00ce\u00d0\u0003\u0014\n\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00ca\u0001\u0000"+
		"\u0000\u0000\u00d4\u00cb\u0001\u0000\u0000\u0000\u00d4\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00da\u0005\u00e8"+
		"\u0000\u0000\u00d7\u00d8\u0007\u0007\u0000\u0000\u00d8\u00da\u0003\u0014"+
		"\n\u000f\u00d9\u00be\u0001\u0000\u0000\u0000\u00d9\u00c0\u0001\u0000\u0000"+
		"\u0000\u00d9\u00c1\u0001\u0000\u0000\u0000\u00d9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u0116\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\n\u000e\u0000\u0000\u00dc\u00dd\u0007\b\u0000\u0000"+
		"\u00dd\u0115\u0003\u0014\n\u000f\u00de\u00df\n\r\u0000\u0000\u00df\u00e0"+
		"\u0007\t\u0000\u0000\u00e0\u0115\u0003\u0014\n\u000e\u00e1\u00e2\n\f\u0000"+
		"\u0000\u00e2\u00e3\u0007\n\u0000\u0000\u00e3\u0115\u0003\u0014\n\r\u00e4"+
		"\u00e5\n\u000b\u0000\u0000\u00e5\u00e6\u0007\u000b\u0000\u0000\u00e6\u0115"+
		"\u0003\u0014\n\f\u00e7\u00e8\n\n\u0000\u0000\u00e8\u00e9\u0007\f\u0000"+
		"\u0000\u00e9\u0115\u0003\u0014\n\u000b\u00ea\u00eb\n\t\u0000\u0000\u00eb"+
		"\u00ec\u0005\u00f9\u0000\u0000\u00ec\u0115\u0003\u0014\n\n\u00ed\u00ee"+
		"\n\b\u0000\u0000\u00ee\u00ef\u0005\u00fb\u0000\u0000\u00ef\u0115\u0003"+
		"\u0014\n\t\u00f0\u00f1\n\u0007\u0000\u0000\u00f1\u00f2\u0005\u00fa\u0000"+
		"\u0000\u00f2\u0115\u0003\u0014\n\b\u00f3\u00f4\n\u0006\u0000\u0000\u00f4"+
		"\u00f5\u0005\u00da\u0000\u0000\u00f5\u0115\u0003\u0014\n\u0007\u00f6\u00f7"+
		"\n\u0005\u0000\u0000\u00f7\u00f8\u0005\u00db\u0000\u0000\u00f8\u0115\u0003"+
		"\u0014\n\u0006\u00f9\u00fa\n\u0004\u0000\u0000\u00fa\u00fb\u0005\u00dc"+
		"\u0000\u0000\u00fb\u0115\u0003\u0014\n\u0005\u00fc\u00fd\n\u0003\u0000"+
		"\u0000\u00fd\u00fe\u0005\u00fc\u0000\u0000\u00fe\u00ff\u0003\u0014\n\u0000"+
		"\u00ff\u0100\u0005\u0001\u0000\u0000\u0100\u0101\u0003\u0014\n\u0003\u0101"+
		"\u0115\u0001\u0000\u0000\u0000\u0102\u0103\n\u0002\u0000\u0000\u0103\u0104"+
		"\u0007\r\u0000\u0000\u0104\u0115\u0003\u0014\n\u0002\u0105\u0106\n\u0001"+
		"\u0000\u0000\u0106\u0107\u0005\u00ee\u0000\u0000\u0107\u0115\u0003\u0014"+
		"\n\u0002\u0108\u0109\n\u0014\u0000\u0000\u0109\u010a\u0005\u00ec\u0000"+
		"\u0000\u010a\u010b\u0003\u0014\n\u0000\u010b\u010c\u0005\u00ed\u0000\u0000"+
		"\u010c\u0115\u0001\u0000\u0000\u0000\u010d\u010e\n\u0013\u0000\u0000\u010e"+
		"\u0115\u0005\u0016\u0000\u0000\u010f\u0110\n\u0011\u0000\u0000\u0110\u0111"+
		"\u0005\u00ef\u0000\u0000\u0111\u0115\u0005\u0101\u0000\u0000\u0112\u0113"+
		"\n\u0010\u0000\u0000\u0113\u0115\u0007\u000e\u0000\u0000\u0114\u00db\u0001"+
		"\u0000\u0000\u0000\u0114\u00de\u0001\u0000\u0000\u0000\u0114\u00e1\u0001"+
		"\u0000\u0000\u0000\u0114\u00e4\u0001\u0000\u0000\u0000\u0114\u00e7\u0001"+
		"\u0000\u0000\u0000\u0114\u00ea\u0001\u0000\u0000\u0000\u0114\u00ed\u0001"+
		"\u0000\u0000\u0000\u0114\u00f0\u0001\u0000\u0000\u0000\u0114\u00f3\u0001"+
		"\u0000\u0000\u0000\u0114\u00f6\u0001\u0000\u0000\u0000\u0114\u00f9\u0001"+
		"\u0000\u0000\u0000\u0114\u00fc\u0001\u0000\u0000\u0000\u0114\u0102\u0001"+
		"\u0000\u0000\u0000\u0114\u0105\u0001\u0000\u0000\u0000\u0114\u0108\u0001"+
		"\u0000\u0000\u0000\u0114\u010d\u0001\u0000\u0000\u0000\u0114\u010f\u0001"+
		"\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0118\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0015\u0001\u0000\u0000\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0003\u0018\f\u0000\u011a\u011b\u0005\u00eb"+
		"\u0000\u0000\u011b\u0147\u0001\u0000\u0000\u0000\u011c\u011d\u00034\u001a"+
		"\u0000\u011d\u011e\u0005\u0101\u0000\u0000\u011e\u0123\u0003B!\u0000\u011f"+
		"\u0121\u0005\u0101\u0000\u0000\u0120\u0122\u00038\u001c\u0000\u0121\u0120"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0124"+
		"\u0001\u0000\u0000\u0000\u0123\u011f\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126"+
		"\u0005\u00eb\u0000\u0000\u0126\u0147\u0001\u0000\u0000\u0000\u0127\u0130"+
		"\u00034\u001a\u0000\u0128\u012d\u0005\u0101\u0000\u0000\u0129\u012a\u0005"+
		"\u00ee\u0000\u0000\u012a\u012c\u0005\u0101\u0000\u0000\u012b\u0129\u0001"+
		"\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0131\u0001"+
		"\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0128\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0005\u00eb\u0000\u0000\u0133\u0147\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005\n\u0000\u0000\u0135\u0136\u0003,"+
		"\u0016\u0000\u0136\u0137\u00036\u001b\u0000\u0137\u0138\u0005\u00eb\u0000"+
		"\u0000\u0138\u0147\u0001\u0000\u0000\u0000\u0139\u0142\u0003$\u0012\u0000"+
		"\u013a\u013f\u0003\"\u0011\u0000\u013b\u013c\u0005\u00ee\u0000\u0000\u013c"+
		"\u013e\u0003\"\u0011\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u0141"+
		"\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f"+
		"\u0001\u0000\u0000\u0000\u0142\u013a\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0005\u00eb\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0119"+
		"\u0001\u0000\u0000\u0000\u0146\u011c\u0001\u0000\u0000\u0000\u0146\u0127"+
		"\u0001\u0000\u0000\u0000\u0146\u0134\u0001\u0000\u0000\u0000\u0146\u0139"+
		"\u0001\u0000\u0000\u0000\u0147\u0017\u0001\u0000\u0000\u0000\u0148\u014a"+
		"\u0003\u001e\u000f\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c"+
		"\u0003$\u0012\u0000\u014c\u014d\u0005\u0101\u0000\u0000\u014d\u014e\u0005"+
		"\u00e7\u0000\u0000\u014e\u014f\u0003\u001a\r\u0000\u014f\u0151\u0005\u00e8"+
		"\u0000\u0000\u0150\u0152\u0003\u001e\u000f\u0000\u0151\u0150\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0019\u0001\u0000"+
		"\u0000\u0000\u0153\u0158\u0003\u001c\u000e\u0000\u0154\u0155\u0005\u00ee"+
		"\u0000\u0000\u0155\u0157\u0003\u001c\u000e\u0000\u0156\u0154\u0001\u0000"+
		"\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000"+
		"\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u0153\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u001b\u0001\u0000"+
		"\u0000\u0000\u015d\u0162\u0003$\u0012\u0000\u015e\u0160\u0005\u0101\u0000"+
		"\u0000\u015f\u0161\u00038\u001c\u0000\u0160\u015f\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000"+
		"\u0162\u015e\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000"+
		"\u0163\u001d\u0001\u0000\u0000\u0000\u0164\u0165\u0005\u00ec\u0000\u0000"+
		"\u0165\u0166\u0005\u00ec\u0000\u0000\u0166\u016b\u0003 \u0010\u0000\u0167"+
		"\u0168\u0005\u00ee\u0000\u0000\u0168\u016a\u0003 \u0010\u0000\u0169\u0167"+
		"\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e"+
		"\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0005\u00ed\u0000\u0000\u016f\u0170\u0005\u00ed\u0000\u0000\u0170\u001f"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u0101\u0000\u0000\u0172\u0173"+
		"\u0005\u0001\u0000\u0000\u0173\u0175\u0005\u0001\u0000\u0000\u0174\u0171"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176\u017b\u0005\u0101\u0000\u0000\u0177\u0178"+
		"\u0005\u00e7\u0000\u0000\u0178\u0179\u0003\u0014\n\u0000\u0179\u017a\u0005"+
		"\u00e8\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0177\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c!\u0001\u0000"+
		"\u0000\u0000\u017d\u017f\u0005\u0101\u0000\u0000\u017e\u0180\u00038\u001c"+
		"\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"+
		"\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u00fd\u0000"+
		"\u0000\u0182\u0184\u0003H$\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183"+
		"\u0184\u0001\u0000\u0000\u0000\u0184#\u0001\u0000\u0000\u0000\u0185\u0187"+
		"\u00034\u001a\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0003"+
		"6\u001b\u0000\u0189%\u0001\u0000\u0000\u0000\u018a\u01ae\u0005\u000b\u0000"+
		"\u0000\u018b\u01ae\u0005\u0004\u0000\u0000\u018c\u01ae\u0005\u0005\u0000"+
		"\u0000\u018d\u01ae\u0005\u0006\u0000\u0000\u018e\u01ae\u0005\u0010\u0000"+
		"\u0000\u018f\u01ae\u0005\u0019\u0000\u0000\u0190\u01ae\u0005\u0018\u0000"+
		"\u0000\u0191\u01ae\u0005\u0002\u0000\u0000\u0192\u01ae\u0005\u0013\u0000"+
		"\u0000\u0193\u01ae\u0005\u0011\u0000\u0000\u0194\u01ae\u0005\u0003\u0000"+
		"\u0000\u0195\u01ae\u0005\u0014\u0000\u0000\u0196\u01ae\u0005\u001b\u0000"+
		"\u0000\u0197\u01ae\u0005\u0012\u0000\u0000\u0198\u01ae\u0005\u001a\u0000"+
		"\u0000\u0199\u01ae\u0005\u001c\u0000\u0000\u019a\u01ae\u0005\u001d\u0000"+
		"\u0000\u019b\u01a6\u0005\u001e\u0000\u0000\u019c\u019d\u0005\u00e7\u0000"+
		"\u0000\u019d\u01a2\u0005\u0101\u0000\u0000\u019e\u019f\u0005\u00ee\u0000"+
		"\u0000\u019f\u01a1\u0005\u0101\u0000\u0000\u01a0\u019e\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a4\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a7\u0005\u00e8\u0000"+
		"\u0000\u01a6\u019c\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a7\u01ae\u0001\u0000\u0000\u0000\u01a8\u01ae\u0005\u001f\u0000"+
		"\u0000\u01a9\u01ae\u0005 \u0000\u0000\u01aa\u01ae\u0005!\u0000\u0000\u01ab"+
		"\u01ae\u0005\"\u0000\u0000\u01ac\u01ae\u0005#\u0000\u0000\u01ad\u018a"+
		"\u0001\u0000\u0000\u0000\u01ad\u018b\u0001\u0000\u0000\u0000\u01ad\u018c"+
		"\u0001\u0000\u0000\u0000\u01ad\u018d\u0001\u0000\u0000\u0000\u01ad\u018e"+
		"\u0001\u0000\u0000\u0000\u01ad\u018f\u0001\u0000\u0000\u0000\u01ad\u0190"+
		"\u0001\u0000\u0000\u0000\u01ad\u0191\u0001\u0000\u0000\u0000\u01ad\u0192"+
		"\u0001\u0000\u0000\u0000\u01ad\u0193\u0001\u0000\u0000\u0000\u01ad\u0194"+
		"\u0001\u0000\u0000\u0000\u01ad\u0195\u0001\u0000\u0000\u0000\u01ad\u0196"+
		"\u0001\u0000\u0000\u0000\u01ad\u0197\u0001\u0000\u0000\u0000\u01ad\u0198"+
		"\u0001\u0000\u0000\u0000\u01ad\u0199\u0001\u0000\u0000\u0000\u01ad\u019a"+
		"\u0001\u0000\u0000\u0000\u01ad\u019b\u0001\u0000\u0000\u0000\u01ad\u01a8"+
		"\u0001\u0000\u0000\u0000\u01ad\u01a9\u0001\u0000\u0000\u0000\u01ad\u01aa"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ae\'\u0001\u0000\u0000\u0000\u01af\u01b0\u0005"+
		"\u0015\u0000\u0000\u01b0\u01b1\u0005\u00e7\u0000\u0000\u01b1\u01b6\u0003"+
		"*\u0015\u0000\u01b2\u01b3\u0005\u00ee\u0000\u0000\u01b3\u01b5\u0003*\u0015"+
		"\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0005\u00e8\u0000\u0000\u01ba)\u0001\u0000\u0000\u0000"+
		"\u01bb\u01be\u0005\u0101\u0000\u0000\u01bc\u01bd\u0005\u00fd\u0000\u0000"+
		"\u01bd\u01bf\u0003\u0014\n\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c2\u0005\u0014\u0000\u0000\u01c1\u01bb\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c2+\u0001\u0000\u0000\u0000\u01c3\u01c4"+
		"\u0007\u000f\u0000\u0000\u01c4-\u0001\u0000\u0000\u0000\u01c5\u01c6\u0007"+
		"\u0010\u0000\u0000\u01c6/\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005\r"+
		"\u0000\u0000\u01c81\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\f\u0000"+
		"\u0000\u01ca3\u0001\u0000\u0000\u0000\u01cb\u01d2\u0003&\u0013\u0000\u01cc"+
		"\u01d2\u0003(\u0014\u0000\u01cd\u01d2\u0003,\u0016\u0000\u01ce\u01d2\u0003"+
		".\u0017\u0000\u01cf\u01d2\u00030\u0018\u0000\u01d0\u01d2\u00032\u0019"+
		"\u0000\u01d1\u01cb\u0001\u0000\u0000\u0000\u01d1\u01cc\u0001\u0000\u0000"+
		"\u0000\u01d1\u01cd\u0001\u0000\u0000\u0000\u01d1\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d45\u0001\u0000\u0000\u0000"+
		"\u01d5\u01da\u0005\u0101\u0000\u0000\u01d6\u01da\u0003>\u001f\u0000\u01d7"+
		"\u01da\u0003<\u001e\u0000\u01d8\u01da\u0003@ \u0000\u01d9\u01d5\u0001"+
		"\u0000\u0000\u0000\u01d9\u01d6\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01da\u01dc\u0001"+
		"\u0000\u0000\u0000\u01db\u01dd\u00038\u001c\u0000\u01dc\u01db\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd7\u0001\u0000\u0000"+
		"\u0000\u01de\u01e0\u0003:\u001d\u0000\u01df\u01de\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e29\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e5\u0005\u00ec\u0000\u0000\u01e4\u01e6\u0003\u0014\n\u0000\u01e5\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005\u00ed\u0000\u0000\u01e8;\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0007\u0011\u0000\u0000\u01ea=\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ec\u0007\u0012\u0000\u0000\u01ec?\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ef\u0005%\u0000\u0000\u01ee\u01f0\u0005\u0101\u0000\u0000"+
		"\u01ef\u01ee\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0003B!\u0000\u01f2A"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f5\u0005\u00e9\u0000\u0000\u01f4\u01f6"+
		"\u0003D\"\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005"+
		"\u00ea\u0000\u0000\u01faC\u0001\u0000\u0000\u0000\u01fb\u01fc\u0003$\u0012"+
		"\u0000\u01fc\u0201\u0003F#\u0000\u01fd\u01fe\u0005\u00ee\u0000\u0000\u01fe"+
		"\u0200\u0003F#\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0203\u0001"+
		"\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0201\u0202\u0001"+
		"\u0000\u0000\u0000\u0202\u0204\u0001\u0000\u0000\u0000\u0203\u0201\u0001"+
		"\u0000\u0000\u0000\u0204\u0205\u0005\u00eb\u0000\u0000\u0205E\u0001\u0000"+
		"\u0000\u0000\u0206\u0208\u0005\u0101\u0000\u0000\u0207\u0209\u00038\u001c"+
		"\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000"+
		"\u0000\u0209G\u0001\u0000\u0000\u0000\u020a\u021b\u0003\u0014\n\u0000"+
		"\u020b\u0217\u0005\u00e9\u0000\u0000\u020c\u0211\u0003H$\u0000\u020d\u020e"+
		"\u0005\u00ee\u0000\u0000\u020e\u0210\u0003H$\u0000\u020f\u020d\u0001\u0000"+
		"\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000"+
		"\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0215\u0001\u0000"+
		"\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0216\u0005\u00ee"+
		"\u0000\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000"+
		"\u0000\u0000\u0216\u0218\u0001\u0000\u0000\u0000\u0217\u020c\u0001\u0000"+
		"\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000"+
		"\u0000\u0000\u0219\u021b\u0005\u00ea\u0000\u0000\u021a\u020a\u0001\u0000"+
		"\u0000\u0000\u021a\u020b\u0001\u0000\u0000\u0000\u021bI\u0001\u0000\u0000"+
		"\u0000\u021c\u0229\u0003L&\u0000\u021d\u0229\u0003N\'\u0000\u021e\u0229"+
		"\u0003P(\u0000\u021f\u0229\u0003R)\u0000\u0220\u0229\u0003T*\u0000\u0221"+
		"\u0229\u0003X,\u0000\u0222\u0229\u0003Z-\u0000\u0223\u0229\u0003`0\u0000"+
		"\u0224\u0229\u0003\\.\u0000\u0225\u0229\u0003^/\u0000\u0226\u0229\u0003"+
		"b1\u0000\u0227\u0229\u0003d2\u0000\u0228\u021c\u0001\u0000\u0000\u0000"+
		"\u0228\u021d\u0001\u0000\u0000\u0000\u0228\u021e\u0001\u0000\u0000\u0000"+
		"\u0228\u021f\u0001\u0000\u0000\u0000\u0228\u0220\u0001\u0000\u0000\u0000"+
		"\u0228\u0221\u0001\u0000\u0000\u0000\u0228\u0222\u0001\u0000\u0000\u0000"+
		"\u0228\u0223\u0001\u0000\u0000\u0000\u0228\u0224\u0001\u0000\u0000\u0000"+
		"\u0228\u0225\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000"+
		"\u0228\u0227\u0001\u0000\u0000\u0000\u0229K\u0001\u0000\u0000\u0000\u022a"+
		"\u022e\u0005\u00e9\u0000\u0000\u022b\u022d\u0003J%\u0000\u022c\u022b\u0001"+
		"\u0000\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u022c\u0001"+
		"\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0231\u0001"+
		"\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0231\u0232\u0005"+
		"\u00ea\u0000\u0000\u0232M\u0001\u0000\u0000\u0000\u0233\u0234\u0003\u0016"+
		"\u000b\u0000\u0234O\u0001\u0000\u0000\u0000\u0235\u0236\u0003\u0014\n"+
		"\u0000\u0236\u0237\u0005\u00eb\u0000\u0000\u0237Q\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0005\u00eb\u0000\u0000\u0239S\u0001\u0000\u0000\u0000\u023a"+
		"\u023c\u0003\u001e\u000f\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023b"+
		"\u023c\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d"+
		"\u023e\u0005&\u0000\u0000\u023e\u023f\u0005\u00e7\u0000\u0000\u023f\u0240"+
		"\u0003\u0014\n\u0000\u0240\u0241\u0005\u00e8\u0000\u0000\u0241\u0244\u0003"+
		"J%\u0000\u0242\u0243\u0005\'\u0000\u0000\u0243\u0245\u0003J%\u0000\u0244"+
		"\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245"+
		"U\u0001\u0000\u0000\u0000\u0246\u0247\u0003$\u0012\u0000\u0247\u0248\u0005"+
		"\u0101\u0000\u0000\u0248\u0249\u0005\u00fd\u0000\u0000\u0249\u024a\u0003"+
		"H$\u0000\u024aW\u0001\u0000\u0000\u0000\u024b\u024d\u0003\u001e\u000f"+
		"\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000"+
		"\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u024f\u0005(\u0000\u0000"+
		"\u024f\u0250\u0005\u00e7\u0000\u0000\u0250\u0251\u0003\u0014\n\u0000\u0251"+
		"\u0252\u0005\u00e8\u0000\u0000\u0252\u0253\u0003L&\u0000\u0253Y\u0001"+
		"\u0000\u0000\u0000\u0254\u0255\u0005)\u0000\u0000\u0255\u0256\u0003\u0014"+
		"\n\u0000\u0256\u0257\u0005\u0001\u0000\u0000\u0257\u025b\u0001\u0000\u0000"+
		"\u0000\u0258\u0259\u0005*\u0000\u0000\u0259\u025b\u0005\u0001\u0000\u0000"+
		"\u025a\u0254\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000"+
		"\u025b[\u0001\u0000\u0000\u0000\u025c\u025e\u0003\u001e\u000f\u0000\u025d"+
		"\u025c\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e"+
		"\u025f\u0001\u0000\u0000\u0000\u025f\u0260\u0005+\u0000\u0000\u0260\u0263"+
		"\u0005\u00e7\u0000\u0000\u0261\u0264\u0003\u0014\n\u0000\u0262\u0264\u0003"+
		"V+\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0263\u0262\u0001\u0000\u0000"+
		"\u0000\u0264\u0265\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u00e8\u0000"+
		"\u0000\u0266\u0267\u0003J%\u0000\u0267]\u0001\u0000\u0000\u0000\u0268"+
		"\u026a\u0003\u001e\u000f\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u0269"+
		"\u026a\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b"+
		"\u026c\u0005,\u0000\u0000\u026c\u026d\u0003J%\u0000\u026d\u026e\u0005"+
		"+\u0000\u0000\u026e\u026f\u0005\u00e7\u0000\u0000\u026f\u0270\u0003\u0014"+
		"\n\u0000\u0270\u0271\u0005\u00e8\u0000\u0000\u0271\u0272\u0005\u00eb\u0000"+
		"\u0000\u0272_\u0001\u0000\u0000\u0000\u0273\u0275\u0003\u001e\u000f\u0000"+
		"\u0274\u0273\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000"+
		"\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0005-\u0000\u0000\u0277"+
		"\u027b\u0005\u00e7\u0000\u0000\u0278\u027c\u0003R)\u0000\u0279\u027c\u0003"+
		"P(\u0000\u027a\u027c\u0003N\'\u0000\u027b\u0278\u0001\u0000\u0000\u0000"+
		"\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027a\u0001\u0000\u0000\u0000"+
		"\u027c\u027f\u0001\u0000\u0000\u0000\u027d\u0280\u0003\u0014\n\u0000\u027e"+
		"\u0280\u0003V+\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u027f\u027e\u0001"+
		"\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0281\u0001"+
		"\u0000\u0000\u0000\u0281\u0283\u0005\u00eb\u0000\u0000\u0282\u0284\u0003"+
		"\u0014\n\u0000\u0283\u0282\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000"+
		"\u0000\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0286\u0005\u00e8"+
		"\u0000\u0000\u0286\u0287\u0003J%\u0000\u0287a\u0001\u0000\u0000\u0000"+
		"\u0288\u0289\u0005.\u0000\u0000\u0289\u0294\u0005\u00eb\u0000\u0000\u028a"+
		"\u028b\u0005/\u0000\u0000\u028b\u0294\u0005\u00eb\u0000\u0000\u028c\u028e"+
		"\u00050\u0000\u0000\u028d\u028f\u0003\u0014\n\u0000\u028e\u028d\u0001"+
		"\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u0001"+
		"\u0000\u0000\u0000\u0290\u0294\u0005\u00eb\u0000\u0000\u0291\u0292\u0005"+
		"1\u0000\u0000\u0292\u0294\u0005\u00eb\u0000\u0000\u0293\u0288\u0001\u0000"+
		"\u0000\u0000\u0293\u028a\u0001\u0000\u0000\u0000\u0293\u028c\u0001\u0000"+
		"\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0294c\u0001\u0000\u0000"+
		"\u0000\u0295\u0296\u00052\u0000\u0000\u0296\u0297\u0005\u00eb\u0000\u0000"+
		"\u0297e\u0001\u0000\u0000\u0000Gglu\u0081\u0088\u0093\u009c\u00a3\u00ab"+
		"\u00b0\u00b3\u00c7\u00d1\u00d4\u00d9\u0114\u0116\u0121\u0123\u012d\u0130"+
		"\u013f\u0142\u0146\u0149\u0151\u0158\u015b\u0160\u0162\u016b\u0174\u017b"+
		"\u017f\u0183\u0186\u01a2\u01a6\u01ad\u01b6\u01be\u01c1\u01d1\u01d3\u01d9"+
		"\u01dc\u01e1\u01e5\u01ef\u01f7\u0201\u0208\u0211\u0215\u0217\u021a\u0228"+
		"\u022e\u023b\u0244\u024c\u025a\u025d\u0263\u0269\u0274\u027b\u027f\u0283"+
		"\u028e\u0293";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}