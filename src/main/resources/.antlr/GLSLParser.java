// Generated from /Users/christopher/Documents/dev/glsl-transformer/glsl-transformer/src/main/antlr/GLSLParser.g4 by ANTLR 4.9.2

import io.github.douira.glsl_transformer.parser.ExtendedParser;

import move.org.antlr.v4.runtime.atn.*;
import move.org.antlr.v4.runtime.dfa.DFA;
import move.org.antlr.v4.runtime.*;
import move.org.antlr.v4.runtime.misc.*;
import move.org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GLSLParser extends ExtendedParser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "GLSLParser.g4"; }

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
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (UNIFORM - 2)) | (1L << (BUFFER - 2)) | (1L << (IN - 2)) | (1L << (OUT - 2)) | (1L << (INOUT - 2)) | (1L << (HIGHP - 2)) | (1L << (MEDIUMP - 2)) | (1L << (LOWP - 2)) | (1L << (PRECISION - 2)) | (1L << (CONST - 2)) | (1L << (PRECISE - 2)) | (1L << (INVARIANT - 2)) | (1L << (SMOOTH - 2)) | (1L << (FLAT - 2)) | (1L << (CENTROID - 2)) | (1L << (ATTRIBUTE - 2)) | (1L << (VOLATILE - 2)) | (1L << (VARYING - 2)) | (1L << (SHARED - 2)) | (1L << (LAYOUT - 2)) | (1L << (NOPERSPECTIVE - 2)) | (1L << (SAMPLE - 2)) | (1L << (PATCH - 2)) | (1L << (COHERENT - 2)) | (1L << (RESTRICT - 2)) | (1L << (READONLY - 2)) | (1L << (WRITEONLY - 2)) | (1L << (SUBROUTINE - 2)) | (1L << (DEVICECOHERENT - 2)) | (1L << (QUEUEFAMILYCOHERENT - 2)) | (1L << (WORKGROUPCOHERENT - 2)) | (1L << (SUBGROUPCOHERENT - 2)) | (1L << (NONPRIVATE - 2)) | (1L << (ATOMIC_UINT - 2)) | (1L << (STRUCT - 2)) | (1L << (BOOL - 2)) | (1L << (BVEC2 - 2)) | (1L << (BVEC3 - 2)) | (1L << (BVEC4 - 2)) | (1L << (INT8 - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (I8VEC2 - 66)) | (1L << (I8VEC3 - 66)) | (1L << (I8VEC4 - 66)) | (1L << (UINT8 - 66)) | (1L << (U8VEC2 - 66)) | (1L << (U8VEC3 - 66)) | (1L << (U8VEC4 - 66)) | (1L << (INT16 - 66)) | (1L << (I16VEC2 - 66)) | (1L << (I16VEC3 - 66)) | (1L << (I16VEC4 - 66)) | (1L << (UINT16 - 66)) | (1L << (U16VEC2 - 66)) | (1L << (U16VEC3 - 66)) | (1L << (U16VEC4 - 66)) | (1L << (INT32 - 66)) | (1L << (I32VEC2 - 66)) | (1L << (I32VEC3 - 66)) | (1L << (I32VEC4 - 66)) | (1L << (UINT32 - 66)) | (1L << (U32VEC2 - 66)) | (1L << (U32VEC3 - 66)) | (1L << (U32VEC4 - 66)) | (1L << (INT64 - 66)) | (1L << (I64VEC2 - 66)) | (1L << (I64VEC3 - 66)) | (1L << (I64VEC4 - 66)) | (1L << (UINT64 - 66)) | (1L << (U64VEC2 - 66)) | (1L << (U64VEC3 - 66)) | (1L << (U64VEC4 - 66)) | (1L << (FLOAT16 - 66)) | (1L << (F16VEC2 - 66)) | (1L << (F16VEC3 - 66)) | (1L << (F16VEC4 - 66)) | (1L << (F16MAT2X2 - 66)) | (1L << (F16MAT2X3 - 66)) | (1L << (F16MAT2X4 - 66)) | (1L << (F16MAT3X2 - 66)) | (1L << (F16MAT3X3 - 66)) | (1L << (F16MAT3X4 - 66)) | (1L << (F16MAT4X2 - 66)) | (1L << (F16MAT4X3 - 66)) | (1L << (F16MAT4X4 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (F32VEC2 - 66)) | (1L << (F32VEC3 - 66)) | (1L << (F32VEC4 - 66)) | (1L << (F32MAT2X2 - 66)) | (1L << (F32MAT2X3 - 66)) | (1L << (F32MAT2X4 - 66)) | (1L << (F32MAT3X2 - 66)) | (1L << (F32MAT3X3 - 66)) | (1L << (F32MAT3X4 - 66)) | (1L << (F32MAT4X2 - 66)) | (1L << (F32MAT4X3 - 66)) | (1L << (F32MAT4X4 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (F64VEC2 - 66)) | (1L << (F64VEC3 - 66)) | (1L << (F64VEC4 - 66)) | (1L << (F64MAT2X2 - 66)) | (1L << (F64MAT2X3 - 66)) | (1L << (F64MAT2X4 - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (F64MAT3X2 - 130)) | (1L << (F64MAT3X3 - 130)) | (1L << (F64MAT3X4 - 130)) | (1L << (F64MAT4X2 - 130)) | (1L << (F64MAT4X3 - 130)) | (1L << (F64MAT4X4 - 130)) | (1L << (IMAGE1D - 130)) | (1L << (IMAGE2D - 130)) | (1L << (IMAGE3D - 130)) | (1L << (UIMAGE1D - 130)) | (1L << (UIMAGE2D - 130)) | (1L << (UIMAGE3D - 130)) | (1L << (IIMAGE1D - 130)) | (1L << (IIMAGE2D - 130)) | (1L << (IIMAGE3D - 130)) | (1L << (SAMPLER1D - 130)) | (1L << (SAMPLER2D - 130)) | (1L << (SAMPLER3D - 130)) | (1L << (SAMPLER2DRECT - 130)) | (1L << (SAMPLER1DSHADOW - 130)) | (1L << (SAMPLER2DSHADOW - 130)) | (1L << (SAMPLER2DRECTSHADOW - 130)) | (1L << (SAMPLER1DARRAY - 130)) | (1L << (SAMPLER2DARRAY - 130)) | (1L << (SAMPLER1DARRAYSHADOW - 130)) | (1L << (SAMPLER2DARRAYSHADOW - 130)) | (1L << (ISAMPLER1D - 130)) | (1L << (ISAMPLER2D - 130)) | (1L << (ISAMPLER2DRECT - 130)) | (1L << (ISAMPLER3D - 130)) | (1L << (ISAMPLER1DARRAY - 130)) | (1L << (ISAMPLER2DARRAY - 130)) | (1L << (USAMPLER1D - 130)) | (1L << (USAMPLER2D - 130)) | (1L << (USAMPLER2DRECT - 130)) | (1L << (USAMPLER3D - 130)) | (1L << (USAMPLER1DARRAY - 130)) | (1L << (USAMPLER2DARRAY - 130)) | (1L << (SAMPLER2DMS - 130)) | (1L << (ISAMPLER2DMS - 130)) | (1L << (USAMPLER2DMS - 130)) | (1L << (SAMPLER2DMSARRAY - 130)) | (1L << (ISAMPLER2DMSARRAY - 130)) | (1L << (USAMPLER2DMSARRAY - 130)) | (1L << (IMAGE2DRECT - 130)) | (1L << (IMAGE1DARRAY - 130)) | (1L << (IMAGE2DARRAY - 130)) | (1L << (IMAGE2DMS - 130)) | (1L << (IMAGE2DMSARRAY - 130)) | (1L << (IIMAGE2DRECT - 130)) | (1L << (IIMAGE1DARRAY - 130)) | (1L << (IIMAGE2DARRAY - 130)) | (1L << (IIMAGE2DMS - 130)) | (1L << (IIMAGE2DMSARRAY - 130)) | (1L << (UIMAGE2DRECT - 130)) | (1L << (UIMAGE1DARRAY - 130)) | (1L << (UIMAGE2DARRAY - 130)) | (1L << (UIMAGE2DMS - 130)) | (1L << (UIMAGE2DMSARRAY - 130)) | (1L << (SAMPLERCUBESHADOW - 130)) | (1L << (SAMPLERCUBEARRAYSHADOW - 130)) | (1L << (SAMPLERCUBE - 130)) | (1L << (ISAMPLERCUBE - 130)) | (1L << (USAMPLERCUBE - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SAMPLERBUFFER - 194)) | (1L << (ISAMPLERBUFFER - 194)) | (1L << (USAMPLERBUFFER - 194)) | (1L << (SAMPLERCUBEARRAY - 194)) | (1L << (ISAMPLERCUBEARRAY - 194)) | (1L << (USAMPLERCUBEARRAY - 194)) | (1L << (IMAGECUBE - 194)) | (1L << (UIMAGECUBE - 194)) | (1L << (IIMAGECUBE - 194)) | (1L << (IMAGEBUFFER - 194)) | (1L << (IIMAGEBUFFER - 194)) | (1L << (UIMAGEBUFFER - 194)) | (1L << (IMAGECUBEARRAY - 194)) | (1L << (IIMAGECUBEARRAY - 194)) | (1L << (UIMAGECUBEARRAY - 194)) | (1L << (VOID - 194)) | (1L << (SEMICOLON - 194)) | (1L << (LBRACKET - 194)) | (1L << (NR - 194)) | (1L << (IDENTIFIER - 194)))) != 0)) {
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
			if ( !(((((_la - 285)) & ~0x3f) == 0 && ((1L << (_la - 285)) & ((1L << (NR_GLSL_110 - 285)) | (1L << (NR_GLSL_120 - 285)) | (1L << (NR_GLSLES_100 - 285)) | (1L << (NR_GLSL_130 - 285)) | (1L << (NR_GLSL_140 - 285)) | (1L << (NR_GLSL_150 - 285)) | (1L << (NR_GLSL_330 - 285)) | (1L << (NR_GLSLES_300 - 285)) | (1L << (NR_GLSLES_310 - 285)) | (1L << (NR_GLSLES_320 - 285)) | (1L << (NR_GLSL_400 - 285)) | (1L << (NR_GLSL_410 - 285)) | (1L << (NR_GLSL_420 - 285)) | (1L << (NR_GLSL_430 - 285)) | (1L << (NR_GLSL_440 - 285)) | (1L << (NR_GLSL_450 - 285)) | (1L << (NR_GLSL_460 - 285)))) != 0)) ) {
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
			if (((((_la - 282)) & ~0x3f) == 0 && ((1L << (_la - 282)) & ((1L << (NR_CORE - 282)) | (1L << (NR_COMPATIBILITY - 282)) | (1L << (NR_ES - 282)))) != 0)) {
				{
				setState(116);
				((VersionStatementContext)_localctx).profile = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 282)) & ~0x3f) == 0 && ((1L << (_la - 282)) & ((1L << (NR_CORE - 282)) | (1L << (NR_COMPATIBILITY - 282)) | (1L << (NR_ES - 282)))) != 0)) ) {
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

	public static class EmptyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public EmptyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyDeclaration; }
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
				if ( !(((((_la - 274)) & ~0x3f) == 0 && ((1L << (_la - 274)) & ((1L << (NR_REQUIRE - 274)) | (1L << (NR_ENABLE - 274)) | (1L << (NR_WARN - 274)) | (1L << (NR_DISABLE - 274)))) != 0)) ) {
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIFORM) | (1L << BUFFER) | (1L << IN) | (1L << OUT))) != 0)) ) {
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
	}
	public static class ReferenceExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public ReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
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
	}
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
	}
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
	}
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
	}
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
	}
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
	}
	public static class LengthAccessExpressionContext extends ExpressionContext {
		public ExpressionContext operand;
		public TerminalNode DOT_LENGTH_METHOD_CALL() { return getToken(GLSLParser.DOT_LENGTH_METHOD_CALL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LengthAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
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
	}
	public static class GroupingExpressionContext extends ExpressionContext {
		public ExpressionContext value;
		public TerminalNode LPAREN() { return getToken(GLSLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GLSLParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
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
	}
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
	}
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
	}
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
	}
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
	}
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
	}
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
	}
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
	}
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
	}
	public static class MemberAccessExpressionContext extends ExpressionContext {
		public ExpressionContext operand;
		public Token member;
		public TerminalNode DOT() { return getToken(GLSLParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public MemberAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
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
	}
	public static class PostfixExpressionContext extends ExpressionContext {
		public ExpressionContext operand;
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INC_OP() { return getToken(GLSLParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(GLSLParser.DEC_OP, 0); }
		public PostfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UINT16CONSTANT) | (1L << INT16CONSTANT) | (1L << UINT32CONSTANT) | (1L << INT32CONSTANT) | (1L << UINT64CONSTANT) | (1L << INT64CONSTANT) | (1L << FLOAT16CONSTANT) | (1L << FLOAT32CONSTANT) | (1L << FLOAT64CONSTANT) | (1L << BOOLCONSTANT))) != 0)) ) {
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
				if ( !(((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (INC_OP - 209)) | (1L << (DEC_OP - 209)) | (1L << (PLUS_OP - 209)) | (1L << (MINUS_OP - 209)) | (1L << (LOGICAL_NOT_OP - 209)) | (1L << (BITWISE_NEG_OP - 209)))) != 0)) ) {
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
			while ( _alt!=2 && _alt!=move.org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
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
						if ( !(((((_la - 244)) & ~0x3f) == 0 && ((1L << (_la - 244)) & ((1L << (TIMES_OP - 244)) | (1L << (DIV_OP - 244)) | (1L << (MOD_OP - 244)))) != 0)) ) {
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
						if ( !(((((_la - 214)) & ~0x3f) == 0 && ((1L << (_la - 214)) & ((1L << (LE_OP - 214)) | (1L << (GE_OP - 214)) | (1L << (LT_OP - 214)) | (1L << (GT_OP - 214)))) != 0)) ) {
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
						if ( !(((((_la - 221)) & ~0x3f) == 0 && ((1L << (_la - 221)) & ((1L << (MUL_ASSIGN - 221)) | (1L << (DIV_ASSIGN - 221)) | (1L << (MOD_ASSIGN - 221)) | (1L << (ADD_ASSIGN - 221)) | (1L << (SUB_ASSIGN - 221)) | (1L << (LEFT_ASSIGN - 221)) | (1L << (RIGHT_ASSIGN - 221)) | (1L << (AND_ASSIGN - 221)) | (1L << (XOR_ASSIGN - 221)) | (1L << (OR_ASSIGN - 221)) | (1L << (ASSIGN_OP - 221)))) != 0)) ) {
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
	}
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
	}
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
	}
	public static class FunctionDeclarationContext extends DeclarationContext {
		public FunctionPrototypeContext functionPrototype() {
			return getRuleContext(FunctionPrototypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public FunctionDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
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
			if (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (UNIFORM - 2)) | (1L << (BUFFER - 2)) | (1L << (IN - 2)) | (1L << (OUT - 2)) | (1L << (INOUT - 2)) | (1L << (HIGHP - 2)) | (1L << (MEDIUMP - 2)) | (1L << (LOWP - 2)) | (1L << (CONST - 2)) | (1L << (PRECISE - 2)) | (1L << (INVARIANT - 2)) | (1L << (SMOOTH - 2)) | (1L << (FLAT - 2)) | (1L << (CENTROID - 2)) | (1L << (ATTRIBUTE - 2)) | (1L << (VOLATILE - 2)) | (1L << (VARYING - 2)) | (1L << (SHARED - 2)) | (1L << (LAYOUT - 2)) | (1L << (NOPERSPECTIVE - 2)) | (1L << (SAMPLE - 2)) | (1L << (PATCH - 2)) | (1L << (COHERENT - 2)) | (1L << (RESTRICT - 2)) | (1L << (READONLY - 2)) | (1L << (WRITEONLY - 2)) | (1L << (SUBROUTINE - 2)) | (1L << (DEVICECOHERENT - 2)) | (1L << (QUEUEFAMILYCOHERENT - 2)) | (1L << (WORKGROUPCOHERENT - 2)) | (1L << (SUBGROUPCOHERENT - 2)) | (1L << (NONPRIVATE - 2)) | (1L << (ATOMIC_UINT - 2)) | (1L << (STRUCT - 2)) | (1L << (BOOL - 2)) | (1L << (BVEC2 - 2)) | (1L << (BVEC3 - 2)) | (1L << (BVEC4 - 2)) | (1L << (INT8 - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (I8VEC2 - 66)) | (1L << (I8VEC3 - 66)) | (1L << (I8VEC4 - 66)) | (1L << (UINT8 - 66)) | (1L << (U8VEC2 - 66)) | (1L << (U8VEC3 - 66)) | (1L << (U8VEC4 - 66)) | (1L << (INT16 - 66)) | (1L << (I16VEC2 - 66)) | (1L << (I16VEC3 - 66)) | (1L << (I16VEC4 - 66)) | (1L << (UINT16 - 66)) | (1L << (U16VEC2 - 66)) | (1L << (U16VEC3 - 66)) | (1L << (U16VEC4 - 66)) | (1L << (INT32 - 66)) | (1L << (I32VEC2 - 66)) | (1L << (I32VEC3 - 66)) | (1L << (I32VEC4 - 66)) | (1L << (UINT32 - 66)) | (1L << (U32VEC2 - 66)) | (1L << (U32VEC3 - 66)) | (1L << (U32VEC4 - 66)) | (1L << (INT64 - 66)) | (1L << (I64VEC2 - 66)) | (1L << (I64VEC3 - 66)) | (1L << (I64VEC4 - 66)) | (1L << (UINT64 - 66)) | (1L << (U64VEC2 - 66)) | (1L << (U64VEC3 - 66)) | (1L << (U64VEC4 - 66)) | (1L << (FLOAT16 - 66)) | (1L << (F16VEC2 - 66)) | (1L << (F16VEC3 - 66)) | (1L << (F16VEC4 - 66)) | (1L << (F16MAT2X2 - 66)) | (1L << (F16MAT2X3 - 66)) | (1L << (F16MAT2X4 - 66)) | (1L << (F16MAT3X2 - 66)) | (1L << (F16MAT3X3 - 66)) | (1L << (F16MAT3X4 - 66)) | (1L << (F16MAT4X2 - 66)) | (1L << (F16MAT4X3 - 66)) | (1L << (F16MAT4X4 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (F32VEC2 - 66)) | (1L << (F32VEC3 - 66)) | (1L << (F32VEC4 - 66)) | (1L << (F32MAT2X2 - 66)) | (1L << (F32MAT2X3 - 66)) | (1L << (F32MAT2X4 - 66)) | (1L << (F32MAT3X2 - 66)) | (1L << (F32MAT3X3 - 66)) | (1L << (F32MAT3X4 - 66)) | (1L << (F32MAT4X2 - 66)) | (1L << (F32MAT4X3 - 66)) | (1L << (F32MAT4X4 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (F64VEC2 - 66)) | (1L << (F64VEC3 - 66)) | (1L << (F64VEC4 - 66)) | (1L << (F64MAT2X2 - 66)) | (1L << (F64MAT2X3 - 66)) | (1L << (F64MAT2X4 - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (F64MAT3X2 - 130)) | (1L << (F64MAT3X3 - 130)) | (1L << (F64MAT3X4 - 130)) | (1L << (F64MAT4X2 - 130)) | (1L << (F64MAT4X3 - 130)) | (1L << (F64MAT4X4 - 130)) | (1L << (IMAGE1D - 130)) | (1L << (IMAGE2D - 130)) | (1L << (IMAGE3D - 130)) | (1L << (UIMAGE1D - 130)) | (1L << (UIMAGE2D - 130)) | (1L << (UIMAGE3D - 130)) | (1L << (IIMAGE1D - 130)) | (1L << (IIMAGE2D - 130)) | (1L << (IIMAGE3D - 130)) | (1L << (SAMPLER1D - 130)) | (1L << (SAMPLER2D - 130)) | (1L << (SAMPLER3D - 130)) | (1L << (SAMPLER2DRECT - 130)) | (1L << (SAMPLER1DSHADOW - 130)) | (1L << (SAMPLER2DSHADOW - 130)) | (1L << (SAMPLER2DRECTSHADOW - 130)) | (1L << (SAMPLER1DARRAY - 130)) | (1L << (SAMPLER2DARRAY - 130)) | (1L << (SAMPLER1DARRAYSHADOW - 130)) | (1L << (SAMPLER2DARRAYSHADOW - 130)) | (1L << (ISAMPLER1D - 130)) | (1L << (ISAMPLER2D - 130)) | (1L << (ISAMPLER2DRECT - 130)) | (1L << (ISAMPLER3D - 130)) | (1L << (ISAMPLER1DARRAY - 130)) | (1L << (ISAMPLER2DARRAY - 130)) | (1L << (USAMPLER1D - 130)) | (1L << (USAMPLER2D - 130)) | (1L << (USAMPLER2DRECT - 130)) | (1L << (USAMPLER3D - 130)) | (1L << (USAMPLER1DARRAY - 130)) | (1L << (USAMPLER2DARRAY - 130)) | (1L << (SAMPLER2DMS - 130)) | (1L << (ISAMPLER2DMS - 130)) | (1L << (USAMPLER2DMS - 130)) | (1L << (SAMPLER2DMSARRAY - 130)) | (1L << (ISAMPLER2DMSARRAY - 130)) | (1L << (USAMPLER2DMSARRAY - 130)) | (1L << (IMAGE2DRECT - 130)) | (1L << (IMAGE1DARRAY - 130)) | (1L << (IMAGE2DARRAY - 130)) | (1L << (IMAGE2DMS - 130)) | (1L << (IMAGE2DMSARRAY - 130)) | (1L << (IIMAGE2DRECT - 130)) | (1L << (IIMAGE1DARRAY - 130)) | (1L << (IIMAGE2DARRAY - 130)) | (1L << (IIMAGE2DMS - 130)) | (1L << (IIMAGE2DMSARRAY - 130)) | (1L << (UIMAGE2DRECT - 130)) | (1L << (UIMAGE1DARRAY - 130)) | (1L << (UIMAGE2DARRAY - 130)) | (1L << (UIMAGE2DMS - 130)) | (1L << (UIMAGE2DMSARRAY - 130)) | (1L << (SAMPLERCUBESHADOW - 130)) | (1L << (SAMPLERCUBEARRAYSHADOW - 130)) | (1L << (SAMPLERCUBE - 130)) | (1L << (ISAMPLERCUBE - 130)) | (1L << (USAMPLERCUBE - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SAMPLERBUFFER - 194)) | (1L << (ISAMPLERBUFFER - 194)) | (1L << (USAMPLERBUFFER - 194)) | (1L << (SAMPLERCUBEARRAY - 194)) | (1L << (ISAMPLERCUBEARRAY - 194)) | (1L << (USAMPLERCUBEARRAY - 194)) | (1L << (IMAGECUBE - 194)) | (1L << (UIMAGECUBE - 194)) | (1L << (IIMAGECUBE - 194)) | (1L << (IMAGEBUFFER - 194)) | (1L << (IIMAGEBUFFER - 194)) | (1L << (UIMAGEBUFFER - 194)) | (1L << (IMAGECUBEARRAY - 194)) | (1L << (IIMAGECUBEARRAY - 194)) | (1L << (UIMAGECUBEARRAY - 194)) | (1L << (VOID - 194)) | (1L << (IDENTIFIER - 194)))) != 0)) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIFORM) | (1L << BUFFER) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << HIGHP) | (1L << MEDIUMP) | (1L << LOWP) | (1L << CONST) | (1L << PRECISE) | (1L << INVARIANT) | (1L << SMOOTH) | (1L << FLAT) | (1L << CENTROID) | (1L << ATTRIBUTE) | (1L << VOLATILE) | (1L << VARYING) | (1L << SHARED) | (1L << LAYOUT) | (1L << NOPERSPECTIVE) | (1L << SAMPLE) | (1L << PATCH) | (1L << COHERENT) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << SUBROUTINE) | (1L << DEVICECOHERENT) | (1L << QUEUEFAMILYCOHERENT) | (1L << WORKGROUPCOHERENT) | (1L << SUBGROUPCOHERENT) | (1L << NONPRIVATE))) != 0)) {
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
	public static class SharedLayoutQualifierContext extends LayoutQualifierIdContext {
		public TerminalNode SHARED() { return getToken(GLSLParser.SHARED, 0); }
		public SharedLayoutQualifierContext(LayoutQualifierIdContext ctx) { copyFrom(ctx); }
	}
	public static class NamedLayoutQualifierContext extends LayoutQualifierIdContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN_OP() { return getToken(GLSLParser.ASSIGN_OP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedLayoutQualifierContext(LayoutQualifierIdContext ctx) { copyFrom(ctx); }
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

	public static class PrecisionQualifierContext extends ParserRuleContext {
		public TerminalNode HIGHP() { return getToken(GLSLParser.HIGHP, 0); }
		public TerminalNode MEDIUMP() { return getToken(GLSLParser.MEDIUMP, 0); }
		public TerminalNode LOWP() { return getToken(GLSLParser.LOWP, 0); }
		public PrecisionQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precisionQualifier; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HIGHP) | (1L << MEDIUMP) | (1L << LOWP))) != 0)) ) {
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

	public static class InterpolationQualifierContext extends ParserRuleContext {
		public TerminalNode SMOOTH() { return getToken(GLSLParser.SMOOTH, 0); }
		public TerminalNode FLAT() { return getToken(GLSLParser.FLAT, 0); }
		public TerminalNode NOPERSPECTIVE() { return getToken(GLSLParser.NOPERSPECTIVE, 0); }
		public InterpolationQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationQualifier; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SMOOTH) | (1L << FLAT) | (1L << NOPERSPECTIVE))) != 0)) ) {
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

	public static class InvariantQualifierContext extends ParserRuleContext {
		public TerminalNode INVARIANT() { return getToken(GLSLParser.INVARIANT, 0); }
		public InvariantQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariantQualifier; }
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

	public static class PreciseQualifierContext extends ParserRuleContext {
		public TerminalNode PRECISE() { return getToken(GLSLParser.PRECISE, 0); }
		public PreciseQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preciseQualifier; }
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UNIFORM) | (1L << BUFFER) | (1L << IN) | (1L << OUT) | (1L << INOUT) | (1L << HIGHP) | (1L << MEDIUMP) | (1L << LOWP) | (1L << CONST) | (1L << PRECISE) | (1L << INVARIANT) | (1L << SMOOTH) | (1L << FLAT) | (1L << CENTROID) | (1L << ATTRIBUTE) | (1L << VOLATILE) | (1L << VARYING) | (1L << SHARED) | (1L << LAYOUT) | (1L << NOPERSPECTIVE) | (1L << SAMPLE) | (1L << PATCH) | (1L << COHERENT) | (1L << RESTRICT) | (1L << READONLY) | (1L << WRITEONLY) | (1L << SUBROUTINE) | (1L << DEVICECOHERENT) | (1L << QUEUEFAMILYCOHERENT) | (1L << WORKGROUPCOHERENT) | (1L << SUBGROUPCOHERENT) | (1L << NONPRIVATE))) != 0) );
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
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ATOMIC_UINT - 36)) | (1L << (STRUCT - 36)) | (1L << (UINT16CONSTANT - 36)) | (1L << (INT16CONSTANT - 36)) | (1L << (UINT32CONSTANT - 36)) | (1L << (INT32CONSTANT - 36)) | (1L << (UINT64CONSTANT - 36)) | (1L << (INT64CONSTANT - 36)) | (1L << (FLOAT16CONSTANT - 36)) | (1L << (FLOAT32CONSTANT - 36)) | (1L << (FLOAT64CONSTANT - 36)) | (1L << (BOOLCONSTANT - 36)) | (1L << (BOOL - 36)) | (1L << (BVEC2 - 36)) | (1L << (BVEC3 - 36)) | (1L << (BVEC4 - 36)) | (1L << (INT8 - 36)) | (1L << (I8VEC2 - 36)) | (1L << (I8VEC3 - 36)) | (1L << (I8VEC4 - 36)) | (1L << (UINT8 - 36)) | (1L << (U8VEC2 - 36)) | (1L << (U8VEC3 - 36)) | (1L << (U8VEC4 - 36)) | (1L << (INT16 - 36)) | (1L << (I16VEC2 - 36)) | (1L << (I16VEC3 - 36)) | (1L << (I16VEC4 - 36)) | (1L << (UINT16 - 36)) | (1L << (U16VEC2 - 36)) | (1L << (U16VEC3 - 36)) | (1L << (U16VEC4 - 36)) | (1L << (INT32 - 36)) | (1L << (I32VEC2 - 36)) | (1L << (I32VEC3 - 36)) | (1L << (I32VEC4 - 36)) | (1L << (UINT32 - 36)) | (1L << (U32VEC2 - 36)) | (1L << (U32VEC3 - 36)) | (1L << (U32VEC4 - 36)) | (1L << (INT64 - 36)) | (1L << (I64VEC2 - 36)) | (1L << (I64VEC3 - 36)) | (1L << (I64VEC4 - 36)) | (1L << (UINT64 - 36)) | (1L << (U64VEC2 - 36)) | (1L << (U64VEC3 - 36)) | (1L << (U64VEC4 - 36)) | (1L << (FLOAT16 - 36)) | (1L << (F16VEC2 - 36)) | (1L << (F16VEC3 - 36)))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (F16VEC4 - 100)) | (1L << (F16MAT2X2 - 100)) | (1L << (F16MAT2X3 - 100)) | (1L << (F16MAT2X4 - 100)) | (1L << (F16MAT3X2 - 100)) | (1L << (F16MAT3X3 - 100)) | (1L << (F16MAT3X4 - 100)) | (1L << (F16MAT4X2 - 100)) | (1L << (F16MAT4X3 - 100)) | (1L << (F16MAT4X4 - 100)) | (1L << (FLOAT32 - 100)) | (1L << (F32VEC2 - 100)) | (1L << (F32VEC3 - 100)) | (1L << (F32VEC4 - 100)) | (1L << (F32MAT2X2 - 100)) | (1L << (F32MAT2X3 - 100)) | (1L << (F32MAT2X4 - 100)) | (1L << (F32MAT3X2 - 100)) | (1L << (F32MAT3X3 - 100)) | (1L << (F32MAT3X4 - 100)) | (1L << (F32MAT4X2 - 100)) | (1L << (F32MAT4X3 - 100)) | (1L << (F32MAT4X4 - 100)) | (1L << (FLOAT64 - 100)) | (1L << (F64VEC2 - 100)) | (1L << (F64VEC3 - 100)) | (1L << (F64VEC4 - 100)) | (1L << (F64MAT2X2 - 100)) | (1L << (F64MAT2X3 - 100)) | (1L << (F64MAT2X4 - 100)) | (1L << (F64MAT3X2 - 100)) | (1L << (F64MAT3X3 - 100)) | (1L << (F64MAT3X4 - 100)) | (1L << (F64MAT4X2 - 100)) | (1L << (F64MAT4X3 - 100)) | (1L << (F64MAT4X4 - 100)) | (1L << (IMAGE1D - 100)) | (1L << (IMAGE2D - 100)) | (1L << (IMAGE3D - 100)) | (1L << (UIMAGE1D - 100)) | (1L << (UIMAGE2D - 100)) | (1L << (UIMAGE3D - 100)) | (1L << (IIMAGE1D - 100)) | (1L << (IIMAGE2D - 100)) | (1L << (IIMAGE3D - 100)) | (1L << (SAMPLER1D - 100)) | (1L << (SAMPLER2D - 100)) | (1L << (SAMPLER3D - 100)) | (1L << (SAMPLER2DRECT - 100)) | (1L << (SAMPLER1DSHADOW - 100)) | (1L << (SAMPLER2DSHADOW - 100)) | (1L << (SAMPLER2DRECTSHADOW - 100)) | (1L << (SAMPLER1DARRAY - 100)) | (1L << (SAMPLER2DARRAY - 100)) | (1L << (SAMPLER1DARRAYSHADOW - 100)) | (1L << (SAMPLER2DARRAYSHADOW - 100)) | (1L << (ISAMPLER1D - 100)) | (1L << (ISAMPLER2D - 100)) | (1L << (ISAMPLER2DRECT - 100)) | (1L << (ISAMPLER3D - 100)) | (1L << (ISAMPLER1DARRAY - 100)) | (1L << (ISAMPLER2DARRAY - 100)) | (1L << (USAMPLER1D - 100)) | (1L << (USAMPLER2D - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (USAMPLER2DRECT - 164)) | (1L << (USAMPLER3D - 164)) | (1L << (USAMPLER1DARRAY - 164)) | (1L << (USAMPLER2DARRAY - 164)) | (1L << (SAMPLER2DMS - 164)) | (1L << (ISAMPLER2DMS - 164)) | (1L << (USAMPLER2DMS - 164)) | (1L << (SAMPLER2DMSARRAY - 164)) | (1L << (ISAMPLER2DMSARRAY - 164)) | (1L << (USAMPLER2DMSARRAY - 164)) | (1L << (IMAGE2DRECT - 164)) | (1L << (IMAGE1DARRAY - 164)) | (1L << (IMAGE2DARRAY - 164)) | (1L << (IMAGE2DMS - 164)) | (1L << (IMAGE2DMSARRAY - 164)) | (1L << (IIMAGE2DRECT - 164)) | (1L << (IIMAGE1DARRAY - 164)) | (1L << (IIMAGE2DARRAY - 164)) | (1L << (IIMAGE2DMS - 164)) | (1L << (IIMAGE2DMSARRAY - 164)) | (1L << (UIMAGE2DRECT - 164)) | (1L << (UIMAGE1DARRAY - 164)) | (1L << (UIMAGE2DARRAY - 164)) | (1L << (UIMAGE2DMS - 164)) | (1L << (UIMAGE2DMSARRAY - 164)) | (1L << (SAMPLERCUBESHADOW - 164)) | (1L << (SAMPLERCUBEARRAYSHADOW - 164)) | (1L << (SAMPLERCUBE - 164)) | (1L << (ISAMPLERCUBE - 164)) | (1L << (USAMPLERCUBE - 164)) | (1L << (SAMPLERBUFFER - 164)) | (1L << (ISAMPLERBUFFER - 164)) | (1L << (USAMPLERBUFFER - 164)) | (1L << (SAMPLERCUBEARRAY - 164)) | (1L << (ISAMPLERCUBEARRAY - 164)) | (1L << (USAMPLERCUBEARRAY - 164)) | (1L << (IMAGECUBE - 164)) | (1L << (UIMAGECUBE - 164)) | (1L << (IIMAGECUBE - 164)) | (1L << (IMAGEBUFFER - 164)) | (1L << (IIMAGEBUFFER - 164)) | (1L << (UIMAGEBUFFER - 164)) | (1L << (IMAGECUBEARRAY - 164)) | (1L << (IIMAGECUBEARRAY - 164)) | (1L << (UIMAGECUBEARRAY - 164)) | (1L << (INC_OP - 164)) | (1L << (DEC_OP - 164)) | (1L << (VOID - 164)))) != 0) || ((((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & ((1L << (LPAREN - 231)) | (1L << (PLUS_OP - 231)) | (1L << (MINUS_OP - 231)) | (1L << (LOGICAL_NOT_OP - 231)) | (1L << (BITWISE_NEG_OP - 231)) | (1L << (IDENTIFIER - 231)))) != 0)) {
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
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (BOOL - 61)) | (1L << (BVEC2 - 61)) | (1L << (BVEC3 - 61)) | (1L << (BVEC4 - 61)) | (1L << (INT8 - 61)) | (1L << (I8VEC2 - 61)) | (1L << (I8VEC3 - 61)) | (1L << (I8VEC4 - 61)) | (1L << (UINT8 - 61)) | (1L << (U8VEC2 - 61)) | (1L << (U8VEC3 - 61)) | (1L << (U8VEC4 - 61)) | (1L << (INT16 - 61)) | (1L << (I16VEC2 - 61)) | (1L << (I16VEC3 - 61)) | (1L << (I16VEC4 - 61)) | (1L << (UINT16 - 61)) | (1L << (U16VEC2 - 61)) | (1L << (U16VEC3 - 61)) | (1L << (U16VEC4 - 61)) | (1L << (INT32 - 61)) | (1L << (I32VEC2 - 61)) | (1L << (I32VEC3 - 61)) | (1L << (I32VEC4 - 61)) | (1L << (UINT32 - 61)) | (1L << (U32VEC2 - 61)) | (1L << (U32VEC3 - 61)) | (1L << (U32VEC4 - 61)) | (1L << (INT64 - 61)) | (1L << (I64VEC2 - 61)) | (1L << (I64VEC3 - 61)) | (1L << (I64VEC4 - 61)) | (1L << (UINT64 - 61)) | (1L << (U64VEC2 - 61)) | (1L << (U64VEC3 - 61)) | (1L << (U64VEC4 - 61)) | (1L << (FLOAT16 - 61)) | (1L << (F16VEC2 - 61)) | (1L << (F16VEC3 - 61)) | (1L << (F16VEC4 - 61)) | (1L << (F16MAT2X2 - 61)) | (1L << (F16MAT2X3 - 61)) | (1L << (F16MAT2X4 - 61)) | (1L << (F16MAT3X2 - 61)) | (1L << (F16MAT3X3 - 61)) | (1L << (F16MAT3X4 - 61)) | (1L << (F16MAT4X2 - 61)) | (1L << (F16MAT4X3 - 61)) | (1L << (F16MAT4X4 - 61)) | (1L << (FLOAT32 - 61)) | (1L << (F32VEC2 - 61)) | (1L << (F32VEC3 - 61)) | (1L << (F32VEC4 - 61)) | (1L << (F32MAT2X2 - 61)) | (1L << (F32MAT2X3 - 61)) | (1L << (F32MAT2X4 - 61)) | (1L << (F32MAT3X2 - 61)) | (1L << (F32MAT3X3 - 61)) | (1L << (F32MAT3X4 - 61)) | (1L << (F32MAT4X2 - 61)) | (1L << (F32MAT4X3 - 61)) | (1L << (F32MAT4X4 - 61)) | (1L << (FLOAT64 - 61)) | (1L << (F64VEC2 - 61)))) != 0) || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (F64VEC3 - 125)) | (1L << (F64VEC4 - 125)) | (1L << (F64MAT2X2 - 125)) | (1L << (F64MAT2X3 - 125)) | (1L << (F64MAT2X4 - 125)) | (1L << (F64MAT3X2 - 125)) | (1L << (F64MAT3X3 - 125)) | (1L << (F64MAT3X4 - 125)) | (1L << (F64MAT4X2 - 125)) | (1L << (F64MAT4X3 - 125)) | (1L << (F64MAT4X4 - 125)))) != 0)) ) {
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
			if ( !(_la==ATOMIC_UINT || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (IMAGE1D - 136)) | (1L << (IMAGE2D - 136)) | (1L << (IMAGE3D - 136)) | (1L << (UIMAGE1D - 136)) | (1L << (UIMAGE2D - 136)) | (1L << (UIMAGE3D - 136)) | (1L << (IIMAGE1D - 136)) | (1L << (IIMAGE2D - 136)) | (1L << (IIMAGE3D - 136)) | (1L << (SAMPLER1D - 136)) | (1L << (SAMPLER2D - 136)) | (1L << (SAMPLER3D - 136)) | (1L << (SAMPLER2DRECT - 136)) | (1L << (SAMPLER1DSHADOW - 136)) | (1L << (SAMPLER2DSHADOW - 136)) | (1L << (SAMPLER2DRECTSHADOW - 136)) | (1L << (SAMPLER1DARRAY - 136)) | (1L << (SAMPLER2DARRAY - 136)) | (1L << (SAMPLER1DARRAYSHADOW - 136)) | (1L << (SAMPLER2DARRAYSHADOW - 136)) | (1L << (ISAMPLER1D - 136)) | (1L << (ISAMPLER2D - 136)) | (1L << (ISAMPLER2DRECT - 136)) | (1L << (ISAMPLER3D - 136)) | (1L << (ISAMPLER1DARRAY - 136)) | (1L << (ISAMPLER2DARRAY - 136)) | (1L << (USAMPLER1D - 136)) | (1L << (USAMPLER2D - 136)) | (1L << (USAMPLER2DRECT - 136)) | (1L << (USAMPLER3D - 136)) | (1L << (USAMPLER1DARRAY - 136)) | (1L << (USAMPLER2DARRAY - 136)) | (1L << (SAMPLER2DMS - 136)) | (1L << (ISAMPLER2DMS - 136)) | (1L << (USAMPLER2DMS - 136)) | (1L << (SAMPLER2DMSARRAY - 136)) | (1L << (ISAMPLER2DMSARRAY - 136)) | (1L << (USAMPLER2DMSARRAY - 136)) | (1L << (IMAGE2DRECT - 136)) | (1L << (IMAGE1DARRAY - 136)) | (1L << (IMAGE2DARRAY - 136)) | (1L << (IMAGE2DMS - 136)) | (1L << (IMAGE2DMSARRAY - 136)) | (1L << (IIMAGE2DRECT - 136)) | (1L << (IIMAGE1DARRAY - 136)) | (1L << (IIMAGE2DARRAY - 136)) | (1L << (IIMAGE2DMS - 136)) | (1L << (IIMAGE2DMSARRAY - 136)) | (1L << (UIMAGE2DRECT - 136)) | (1L << (UIMAGE1DARRAY - 136)) | (1L << (UIMAGE2DARRAY - 136)) | (1L << (UIMAGE2DMS - 136)) | (1L << (UIMAGE2DMSARRAY - 136)) | (1L << (SAMPLERCUBESHADOW - 136)) | (1L << (SAMPLERCUBEARRAYSHADOW - 136)) | (1L << (SAMPLERCUBE - 136)) | (1L << (ISAMPLERCUBE - 136)) | (1L << (USAMPLERCUBE - 136)) | (1L << (SAMPLERBUFFER - 136)) | (1L << (ISAMPLERBUFFER - 136)) | (1L << (USAMPLERBUFFER - 136)) | (1L << (SAMPLERCUBEARRAY - 136)) | (1L << (ISAMPLERCUBEARRAY - 136)) | (1L << (USAMPLERCUBEARRAY - 136)))) != 0) || ((((_la - 200)) & ~0x3f) == 0 && ((1L << (_la - 200)) & ((1L << (IMAGECUBE - 200)) | (1L << (UIMAGECUBE - 200)) | (1L << (IIMAGECUBE - 200)) | (1L << (IMAGEBUFFER - 200)) | (1L << (IIMAGEBUFFER - 200)) | (1L << (UIMAGEBUFFER - 200)) | (1L << (IMAGECUBEARRAY - 200)) | (1L << (IIMAGECUBEARRAY - 200)) | (1L << (UIMAGECUBEARRAY - 200)) | (1L << (VOID - 200)))) != 0)) ) {
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
			} while ( ((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (UNIFORM - 2)) | (1L << (BUFFER - 2)) | (1L << (IN - 2)) | (1L << (OUT - 2)) | (1L << (INOUT - 2)) | (1L << (HIGHP - 2)) | (1L << (MEDIUMP - 2)) | (1L << (LOWP - 2)) | (1L << (CONST - 2)) | (1L << (PRECISE - 2)) | (1L << (INVARIANT - 2)) | (1L << (SMOOTH - 2)) | (1L << (FLAT - 2)) | (1L << (CENTROID - 2)) | (1L << (ATTRIBUTE - 2)) | (1L << (VOLATILE - 2)) | (1L << (VARYING - 2)) | (1L << (SHARED - 2)) | (1L << (LAYOUT - 2)) | (1L << (NOPERSPECTIVE - 2)) | (1L << (SAMPLE - 2)) | (1L << (PATCH - 2)) | (1L << (COHERENT - 2)) | (1L << (RESTRICT - 2)) | (1L << (READONLY - 2)) | (1L << (WRITEONLY - 2)) | (1L << (SUBROUTINE - 2)) | (1L << (DEVICECOHERENT - 2)) | (1L << (QUEUEFAMILYCOHERENT - 2)) | (1L << (WORKGROUPCOHERENT - 2)) | (1L << (SUBGROUPCOHERENT - 2)) | (1L << (NONPRIVATE - 2)) | (1L << (ATOMIC_UINT - 2)) | (1L << (STRUCT - 2)) | (1L << (BOOL - 2)) | (1L << (BVEC2 - 2)) | (1L << (BVEC3 - 2)) | (1L << (BVEC4 - 2)) | (1L << (INT8 - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (I8VEC2 - 66)) | (1L << (I8VEC3 - 66)) | (1L << (I8VEC4 - 66)) | (1L << (UINT8 - 66)) | (1L << (U8VEC2 - 66)) | (1L << (U8VEC3 - 66)) | (1L << (U8VEC4 - 66)) | (1L << (INT16 - 66)) | (1L << (I16VEC2 - 66)) | (1L << (I16VEC3 - 66)) | (1L << (I16VEC4 - 66)) | (1L << (UINT16 - 66)) | (1L << (U16VEC2 - 66)) | (1L << (U16VEC3 - 66)) | (1L << (U16VEC4 - 66)) | (1L << (INT32 - 66)) | (1L << (I32VEC2 - 66)) | (1L << (I32VEC3 - 66)) | (1L << (I32VEC4 - 66)) | (1L << (UINT32 - 66)) | (1L << (U32VEC2 - 66)) | (1L << (U32VEC3 - 66)) | (1L << (U32VEC4 - 66)) | (1L << (INT64 - 66)) | (1L << (I64VEC2 - 66)) | (1L << (I64VEC3 - 66)) | (1L << (I64VEC4 - 66)) | (1L << (UINT64 - 66)) | (1L << (U64VEC2 - 66)) | (1L << (U64VEC3 - 66)) | (1L << (U64VEC4 - 66)) | (1L << (FLOAT16 - 66)) | (1L << (F16VEC2 - 66)) | (1L << (F16VEC3 - 66)) | (1L << (F16VEC4 - 66)) | (1L << (F16MAT2X2 - 66)) | (1L << (F16MAT2X3 - 66)) | (1L << (F16MAT2X4 - 66)) | (1L << (F16MAT3X2 - 66)) | (1L << (F16MAT3X3 - 66)) | (1L << (F16MAT3X4 - 66)) | (1L << (F16MAT4X2 - 66)) | (1L << (F16MAT4X3 - 66)) | (1L << (F16MAT4X4 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (F32VEC2 - 66)) | (1L << (F32VEC3 - 66)) | (1L << (F32VEC4 - 66)) | (1L << (F32MAT2X2 - 66)) | (1L << (F32MAT2X3 - 66)) | (1L << (F32MAT2X4 - 66)) | (1L << (F32MAT3X2 - 66)) | (1L << (F32MAT3X3 - 66)) | (1L << (F32MAT3X4 - 66)) | (1L << (F32MAT4X2 - 66)) | (1L << (F32MAT4X3 - 66)) | (1L << (F32MAT4X4 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (F64VEC2 - 66)) | (1L << (F64VEC3 - 66)) | (1L << (F64VEC4 - 66)) | (1L << (F64MAT2X2 - 66)) | (1L << (F64MAT2X3 - 66)) | (1L << (F64MAT2X4 - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (F64MAT3X2 - 130)) | (1L << (F64MAT3X3 - 130)) | (1L << (F64MAT3X4 - 130)) | (1L << (F64MAT4X2 - 130)) | (1L << (F64MAT4X3 - 130)) | (1L << (F64MAT4X4 - 130)) | (1L << (IMAGE1D - 130)) | (1L << (IMAGE2D - 130)) | (1L << (IMAGE3D - 130)) | (1L << (UIMAGE1D - 130)) | (1L << (UIMAGE2D - 130)) | (1L << (UIMAGE3D - 130)) | (1L << (IIMAGE1D - 130)) | (1L << (IIMAGE2D - 130)) | (1L << (IIMAGE3D - 130)) | (1L << (SAMPLER1D - 130)) | (1L << (SAMPLER2D - 130)) | (1L << (SAMPLER3D - 130)) | (1L << (SAMPLER2DRECT - 130)) | (1L << (SAMPLER1DSHADOW - 130)) | (1L << (SAMPLER2DSHADOW - 130)) | (1L << (SAMPLER2DRECTSHADOW - 130)) | (1L << (SAMPLER1DARRAY - 130)) | (1L << (SAMPLER2DARRAY - 130)) | (1L << (SAMPLER1DARRAYSHADOW - 130)) | (1L << (SAMPLER2DARRAYSHADOW - 130)) | (1L << (ISAMPLER1D - 130)) | (1L << (ISAMPLER2D - 130)) | (1L << (ISAMPLER2DRECT - 130)) | (1L << (ISAMPLER3D - 130)) | (1L << (ISAMPLER1DARRAY - 130)) | (1L << (ISAMPLER2DARRAY - 130)) | (1L << (USAMPLER1D - 130)) | (1L << (USAMPLER2D - 130)) | (1L << (USAMPLER2DRECT - 130)) | (1L << (USAMPLER3D - 130)) | (1L << (USAMPLER1DARRAY - 130)) | (1L << (USAMPLER2DARRAY - 130)) | (1L << (SAMPLER2DMS - 130)) | (1L << (ISAMPLER2DMS - 130)) | (1L << (USAMPLER2DMS - 130)) | (1L << (SAMPLER2DMSARRAY - 130)) | (1L << (ISAMPLER2DMSARRAY - 130)) | (1L << (USAMPLER2DMSARRAY - 130)) | (1L << (IMAGE2DRECT - 130)) | (1L << (IMAGE1DARRAY - 130)) | (1L << (IMAGE2DARRAY - 130)) | (1L << (IMAGE2DMS - 130)) | (1L << (IMAGE2DMSARRAY - 130)) | (1L << (IIMAGE2DRECT - 130)) | (1L << (IIMAGE1DARRAY - 130)) | (1L << (IIMAGE2DARRAY - 130)) | (1L << (IIMAGE2DMS - 130)) | (1L << (IIMAGE2DMSARRAY - 130)) | (1L << (UIMAGE2DRECT - 130)) | (1L << (UIMAGE1DARRAY - 130)) | (1L << (UIMAGE2DARRAY - 130)) | (1L << (UIMAGE2DMS - 130)) | (1L << (UIMAGE2DMSARRAY - 130)) | (1L << (SAMPLERCUBESHADOW - 130)) | (1L << (SAMPLERCUBEARRAYSHADOW - 130)) | (1L << (SAMPLERCUBE - 130)) | (1L << (ISAMPLERCUBE - 130)) | (1L << (USAMPLERCUBE - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SAMPLERBUFFER - 194)) | (1L << (ISAMPLERBUFFER - 194)) | (1L << (USAMPLERBUFFER - 194)) | (1L << (SAMPLERCUBEARRAY - 194)) | (1L << (ISAMPLERCUBEARRAY - 194)) | (1L << (USAMPLERCUBEARRAY - 194)) | (1L << (IMAGECUBE - 194)) | (1L << (UIMAGECUBE - 194)) | (1L << (IIMAGECUBE - 194)) | (1L << (IMAGEBUFFER - 194)) | (1L << (IIMAGEBUFFER - 194)) | (1L << (UIMAGEBUFFER - 194)) | (1L << (IMAGECUBEARRAY - 194)) | (1L << (IIMAGECUBEARRAY - 194)) | (1L << (UIMAGECUBEARRAY - 194)) | (1L << (VOID - 194)) | (1L << (IDENTIFIER - 194)))) != 0) );
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

	public static class StructDeclaratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GLSLParser.IDENTIFIER, 0); }
		public ArraySpecifierContext arraySpecifier() {
			return getRuleContext(ArraySpecifierContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
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
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ATOMIC_UINT - 36)) | (1L << (STRUCT - 36)) | (1L << (UINT16CONSTANT - 36)) | (1L << (INT16CONSTANT - 36)) | (1L << (UINT32CONSTANT - 36)) | (1L << (INT32CONSTANT - 36)) | (1L << (UINT64CONSTANT - 36)) | (1L << (INT64CONSTANT - 36)) | (1L << (FLOAT16CONSTANT - 36)) | (1L << (FLOAT32CONSTANT - 36)) | (1L << (FLOAT64CONSTANT - 36)) | (1L << (BOOLCONSTANT - 36)) | (1L << (BOOL - 36)) | (1L << (BVEC2 - 36)) | (1L << (BVEC3 - 36)) | (1L << (BVEC4 - 36)) | (1L << (INT8 - 36)) | (1L << (I8VEC2 - 36)) | (1L << (I8VEC3 - 36)) | (1L << (I8VEC4 - 36)) | (1L << (UINT8 - 36)) | (1L << (U8VEC2 - 36)) | (1L << (U8VEC3 - 36)) | (1L << (U8VEC4 - 36)) | (1L << (INT16 - 36)) | (1L << (I16VEC2 - 36)) | (1L << (I16VEC3 - 36)) | (1L << (I16VEC4 - 36)) | (1L << (UINT16 - 36)) | (1L << (U16VEC2 - 36)) | (1L << (U16VEC3 - 36)) | (1L << (U16VEC4 - 36)) | (1L << (INT32 - 36)) | (1L << (I32VEC2 - 36)) | (1L << (I32VEC3 - 36)) | (1L << (I32VEC4 - 36)) | (1L << (UINT32 - 36)) | (1L << (U32VEC2 - 36)) | (1L << (U32VEC3 - 36)) | (1L << (U32VEC4 - 36)) | (1L << (INT64 - 36)) | (1L << (I64VEC2 - 36)) | (1L << (I64VEC3 - 36)) | (1L << (I64VEC4 - 36)) | (1L << (UINT64 - 36)) | (1L << (U64VEC2 - 36)) | (1L << (U64VEC3 - 36)) | (1L << (U64VEC4 - 36)) | (1L << (FLOAT16 - 36)) | (1L << (F16VEC2 - 36)) | (1L << (F16VEC3 - 36)))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (F16VEC4 - 100)) | (1L << (F16MAT2X2 - 100)) | (1L << (F16MAT2X3 - 100)) | (1L << (F16MAT2X4 - 100)) | (1L << (F16MAT3X2 - 100)) | (1L << (F16MAT3X3 - 100)) | (1L << (F16MAT3X4 - 100)) | (1L << (F16MAT4X2 - 100)) | (1L << (F16MAT4X3 - 100)) | (1L << (F16MAT4X4 - 100)) | (1L << (FLOAT32 - 100)) | (1L << (F32VEC2 - 100)) | (1L << (F32VEC3 - 100)) | (1L << (F32VEC4 - 100)) | (1L << (F32MAT2X2 - 100)) | (1L << (F32MAT2X3 - 100)) | (1L << (F32MAT2X4 - 100)) | (1L << (F32MAT3X2 - 100)) | (1L << (F32MAT3X3 - 100)) | (1L << (F32MAT3X4 - 100)) | (1L << (F32MAT4X2 - 100)) | (1L << (F32MAT4X3 - 100)) | (1L << (F32MAT4X4 - 100)) | (1L << (FLOAT64 - 100)) | (1L << (F64VEC2 - 100)) | (1L << (F64VEC3 - 100)) | (1L << (F64VEC4 - 100)) | (1L << (F64MAT2X2 - 100)) | (1L << (F64MAT2X3 - 100)) | (1L << (F64MAT2X4 - 100)) | (1L << (F64MAT3X2 - 100)) | (1L << (F64MAT3X3 - 100)) | (1L << (F64MAT3X4 - 100)) | (1L << (F64MAT4X2 - 100)) | (1L << (F64MAT4X3 - 100)) | (1L << (F64MAT4X4 - 100)) | (1L << (IMAGE1D - 100)) | (1L << (IMAGE2D - 100)) | (1L << (IMAGE3D - 100)) | (1L << (UIMAGE1D - 100)) | (1L << (UIMAGE2D - 100)) | (1L << (UIMAGE3D - 100)) | (1L << (IIMAGE1D - 100)) | (1L << (IIMAGE2D - 100)) | (1L << (IIMAGE3D - 100)) | (1L << (SAMPLER1D - 100)) | (1L << (SAMPLER2D - 100)) | (1L << (SAMPLER3D - 100)) | (1L << (SAMPLER2DRECT - 100)) | (1L << (SAMPLER1DSHADOW - 100)) | (1L << (SAMPLER2DSHADOW - 100)) | (1L << (SAMPLER2DRECTSHADOW - 100)) | (1L << (SAMPLER1DARRAY - 100)) | (1L << (SAMPLER2DARRAY - 100)) | (1L << (SAMPLER1DARRAYSHADOW - 100)) | (1L << (SAMPLER2DARRAYSHADOW - 100)) | (1L << (ISAMPLER1D - 100)) | (1L << (ISAMPLER2D - 100)) | (1L << (ISAMPLER2DRECT - 100)) | (1L << (ISAMPLER3D - 100)) | (1L << (ISAMPLER1DARRAY - 100)) | (1L << (ISAMPLER2DARRAY - 100)) | (1L << (USAMPLER1D - 100)) | (1L << (USAMPLER2D - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (USAMPLER2DRECT - 164)) | (1L << (USAMPLER3D - 164)) | (1L << (USAMPLER1DARRAY - 164)) | (1L << (USAMPLER2DARRAY - 164)) | (1L << (SAMPLER2DMS - 164)) | (1L << (ISAMPLER2DMS - 164)) | (1L << (USAMPLER2DMS - 164)) | (1L << (SAMPLER2DMSARRAY - 164)) | (1L << (ISAMPLER2DMSARRAY - 164)) | (1L << (USAMPLER2DMSARRAY - 164)) | (1L << (IMAGE2DRECT - 164)) | (1L << (IMAGE1DARRAY - 164)) | (1L << (IMAGE2DARRAY - 164)) | (1L << (IMAGE2DMS - 164)) | (1L << (IMAGE2DMSARRAY - 164)) | (1L << (IIMAGE2DRECT - 164)) | (1L << (IIMAGE1DARRAY - 164)) | (1L << (IIMAGE2DARRAY - 164)) | (1L << (IIMAGE2DMS - 164)) | (1L << (IIMAGE2DMSARRAY - 164)) | (1L << (UIMAGE2DRECT - 164)) | (1L << (UIMAGE1DARRAY - 164)) | (1L << (UIMAGE2DARRAY - 164)) | (1L << (UIMAGE2DMS - 164)) | (1L << (UIMAGE2DMSARRAY - 164)) | (1L << (SAMPLERCUBESHADOW - 164)) | (1L << (SAMPLERCUBEARRAYSHADOW - 164)) | (1L << (SAMPLERCUBE - 164)) | (1L << (ISAMPLERCUBE - 164)) | (1L << (USAMPLERCUBE - 164)) | (1L << (SAMPLERBUFFER - 164)) | (1L << (ISAMPLERBUFFER - 164)) | (1L << (USAMPLERBUFFER - 164)) | (1L << (SAMPLERCUBEARRAY - 164)) | (1L << (ISAMPLERCUBEARRAY - 164)) | (1L << (USAMPLERCUBEARRAY - 164)) | (1L << (IMAGECUBE - 164)) | (1L << (UIMAGECUBE - 164)) | (1L << (IIMAGECUBE - 164)) | (1L << (IMAGEBUFFER - 164)) | (1L << (IIMAGEBUFFER - 164)) | (1L << (UIMAGEBUFFER - 164)) | (1L << (IMAGECUBEARRAY - 164)) | (1L << (IIMAGECUBEARRAY - 164)) | (1L << (UIMAGECUBEARRAY - 164)) | (1L << (INC_OP - 164)) | (1L << (DEC_OP - 164)) | (1L << (VOID - 164)))) != 0) || ((((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & ((1L << (LPAREN - 231)) | (1L << (LBRACE - 231)) | (1L << (PLUS_OP - 231)) | (1L << (MINUS_OP - 231)) | (1L << (LOGICAL_NOT_OP - 231)) | (1L << (BITWISE_NEG_OP - 231)) | (1L << (IDENTIFIER - 231)))) != 0)) {
					{
					setState(524);
					((InitializerContext)_localctx).initializer = initializer();
					((InitializerContext)_localctx).initializers.add(((InitializerContext)_localctx).initializer);
					setState(529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
					while ( _alt!=2 && _alt!=move.org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
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
			while (((((_la - 2)) & ~0x3f) == 0 && ((1L << (_la - 2)) & ((1L << (UNIFORM - 2)) | (1L << (BUFFER - 2)) | (1L << (IN - 2)) | (1L << (OUT - 2)) | (1L << (INOUT - 2)) | (1L << (HIGHP - 2)) | (1L << (MEDIUMP - 2)) | (1L << (LOWP - 2)) | (1L << (PRECISION - 2)) | (1L << (CONST - 2)) | (1L << (PRECISE - 2)) | (1L << (INVARIANT - 2)) | (1L << (SMOOTH - 2)) | (1L << (FLAT - 2)) | (1L << (CENTROID - 2)) | (1L << (ATTRIBUTE - 2)) | (1L << (VOLATILE - 2)) | (1L << (VARYING - 2)) | (1L << (SHARED - 2)) | (1L << (LAYOUT - 2)) | (1L << (NOPERSPECTIVE - 2)) | (1L << (SAMPLE - 2)) | (1L << (PATCH - 2)) | (1L << (COHERENT - 2)) | (1L << (RESTRICT - 2)) | (1L << (READONLY - 2)) | (1L << (WRITEONLY - 2)) | (1L << (SUBROUTINE - 2)) | (1L << (DEVICECOHERENT - 2)) | (1L << (QUEUEFAMILYCOHERENT - 2)) | (1L << (WORKGROUPCOHERENT - 2)) | (1L << (SUBGROUPCOHERENT - 2)) | (1L << (NONPRIVATE - 2)) | (1L << (ATOMIC_UINT - 2)) | (1L << (STRUCT - 2)) | (1L << (IF - 2)) | (1L << (SWITCH - 2)) | (1L << (CASE - 2)) | (1L << (DEFAULT - 2)) | (1L << (WHILE - 2)) | (1L << (DO - 2)) | (1L << (FOR - 2)) | (1L << (CONTINUE - 2)) | (1L << (BREAK - 2)) | (1L << (RETURN - 2)) | (1L << (DISCARD - 2)) | (1L << (DEMOTE - 2)) | (1L << (UINT16CONSTANT - 2)) | (1L << (INT16CONSTANT - 2)) | (1L << (UINT32CONSTANT - 2)) | (1L << (INT32CONSTANT - 2)) | (1L << (UINT64CONSTANT - 2)) | (1L << (INT64CONSTANT - 2)) | (1L << (FLOAT16CONSTANT - 2)) | (1L << (FLOAT32CONSTANT - 2)) | (1L << (FLOAT64CONSTANT - 2)) | (1L << (BOOLCONSTANT - 2)) | (1L << (BOOL - 2)) | (1L << (BVEC2 - 2)) | (1L << (BVEC3 - 2)) | (1L << (BVEC4 - 2)) | (1L << (INT8 - 2)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (I8VEC2 - 66)) | (1L << (I8VEC3 - 66)) | (1L << (I8VEC4 - 66)) | (1L << (UINT8 - 66)) | (1L << (U8VEC2 - 66)) | (1L << (U8VEC3 - 66)) | (1L << (U8VEC4 - 66)) | (1L << (INT16 - 66)) | (1L << (I16VEC2 - 66)) | (1L << (I16VEC3 - 66)) | (1L << (I16VEC4 - 66)) | (1L << (UINT16 - 66)) | (1L << (U16VEC2 - 66)) | (1L << (U16VEC3 - 66)) | (1L << (U16VEC4 - 66)) | (1L << (INT32 - 66)) | (1L << (I32VEC2 - 66)) | (1L << (I32VEC3 - 66)) | (1L << (I32VEC4 - 66)) | (1L << (UINT32 - 66)) | (1L << (U32VEC2 - 66)) | (1L << (U32VEC3 - 66)) | (1L << (U32VEC4 - 66)) | (1L << (INT64 - 66)) | (1L << (I64VEC2 - 66)) | (1L << (I64VEC3 - 66)) | (1L << (I64VEC4 - 66)) | (1L << (UINT64 - 66)) | (1L << (U64VEC2 - 66)) | (1L << (U64VEC3 - 66)) | (1L << (U64VEC4 - 66)) | (1L << (FLOAT16 - 66)) | (1L << (F16VEC2 - 66)) | (1L << (F16VEC3 - 66)) | (1L << (F16VEC4 - 66)) | (1L << (F16MAT2X2 - 66)) | (1L << (F16MAT2X3 - 66)) | (1L << (F16MAT2X4 - 66)) | (1L << (F16MAT3X2 - 66)) | (1L << (F16MAT3X3 - 66)) | (1L << (F16MAT3X4 - 66)) | (1L << (F16MAT4X2 - 66)) | (1L << (F16MAT4X3 - 66)) | (1L << (F16MAT4X4 - 66)) | (1L << (FLOAT32 - 66)) | (1L << (F32VEC2 - 66)) | (1L << (F32VEC3 - 66)) | (1L << (F32VEC4 - 66)) | (1L << (F32MAT2X2 - 66)) | (1L << (F32MAT2X3 - 66)) | (1L << (F32MAT2X4 - 66)) | (1L << (F32MAT3X2 - 66)) | (1L << (F32MAT3X3 - 66)) | (1L << (F32MAT3X4 - 66)) | (1L << (F32MAT4X2 - 66)) | (1L << (F32MAT4X3 - 66)) | (1L << (F32MAT4X4 - 66)) | (1L << (FLOAT64 - 66)) | (1L << (F64VEC2 - 66)) | (1L << (F64VEC3 - 66)) | (1L << (F64VEC4 - 66)) | (1L << (F64MAT2X2 - 66)) | (1L << (F64MAT2X3 - 66)) | (1L << (F64MAT2X4 - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (F64MAT3X2 - 130)) | (1L << (F64MAT3X3 - 130)) | (1L << (F64MAT3X4 - 130)) | (1L << (F64MAT4X2 - 130)) | (1L << (F64MAT4X3 - 130)) | (1L << (F64MAT4X4 - 130)) | (1L << (IMAGE1D - 130)) | (1L << (IMAGE2D - 130)) | (1L << (IMAGE3D - 130)) | (1L << (UIMAGE1D - 130)) | (1L << (UIMAGE2D - 130)) | (1L << (UIMAGE3D - 130)) | (1L << (IIMAGE1D - 130)) | (1L << (IIMAGE2D - 130)) | (1L << (IIMAGE3D - 130)) | (1L << (SAMPLER1D - 130)) | (1L << (SAMPLER2D - 130)) | (1L << (SAMPLER3D - 130)) | (1L << (SAMPLER2DRECT - 130)) | (1L << (SAMPLER1DSHADOW - 130)) | (1L << (SAMPLER2DSHADOW - 130)) | (1L << (SAMPLER2DRECTSHADOW - 130)) | (1L << (SAMPLER1DARRAY - 130)) | (1L << (SAMPLER2DARRAY - 130)) | (1L << (SAMPLER1DARRAYSHADOW - 130)) | (1L << (SAMPLER2DARRAYSHADOW - 130)) | (1L << (ISAMPLER1D - 130)) | (1L << (ISAMPLER2D - 130)) | (1L << (ISAMPLER2DRECT - 130)) | (1L << (ISAMPLER3D - 130)) | (1L << (ISAMPLER1DARRAY - 130)) | (1L << (ISAMPLER2DARRAY - 130)) | (1L << (USAMPLER1D - 130)) | (1L << (USAMPLER2D - 130)) | (1L << (USAMPLER2DRECT - 130)) | (1L << (USAMPLER3D - 130)) | (1L << (USAMPLER1DARRAY - 130)) | (1L << (USAMPLER2DARRAY - 130)) | (1L << (SAMPLER2DMS - 130)) | (1L << (ISAMPLER2DMS - 130)) | (1L << (USAMPLER2DMS - 130)) | (1L << (SAMPLER2DMSARRAY - 130)) | (1L << (ISAMPLER2DMSARRAY - 130)) | (1L << (USAMPLER2DMSARRAY - 130)) | (1L << (IMAGE2DRECT - 130)) | (1L << (IMAGE1DARRAY - 130)) | (1L << (IMAGE2DARRAY - 130)) | (1L << (IMAGE2DMS - 130)) | (1L << (IMAGE2DMSARRAY - 130)) | (1L << (IIMAGE2DRECT - 130)) | (1L << (IIMAGE1DARRAY - 130)) | (1L << (IIMAGE2DARRAY - 130)) | (1L << (IIMAGE2DMS - 130)) | (1L << (IIMAGE2DMSARRAY - 130)) | (1L << (UIMAGE2DRECT - 130)) | (1L << (UIMAGE1DARRAY - 130)) | (1L << (UIMAGE2DARRAY - 130)) | (1L << (UIMAGE2DMS - 130)) | (1L << (UIMAGE2DMSARRAY - 130)) | (1L << (SAMPLERCUBESHADOW - 130)) | (1L << (SAMPLERCUBEARRAYSHADOW - 130)) | (1L << (SAMPLERCUBE - 130)) | (1L << (ISAMPLERCUBE - 130)) | (1L << (USAMPLERCUBE - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (SAMPLERBUFFER - 194)) | (1L << (ISAMPLERBUFFER - 194)) | (1L << (USAMPLERBUFFER - 194)) | (1L << (SAMPLERCUBEARRAY - 194)) | (1L << (ISAMPLERCUBEARRAY - 194)) | (1L << (USAMPLERCUBEARRAY - 194)) | (1L << (IMAGECUBE - 194)) | (1L << (UIMAGECUBE - 194)) | (1L << (IIMAGECUBE - 194)) | (1L << (IMAGEBUFFER - 194)) | (1L << (IIMAGEBUFFER - 194)) | (1L << (UIMAGEBUFFER - 194)) | (1L << (IMAGECUBEARRAY - 194)) | (1L << (IIMAGECUBEARRAY - 194)) | (1L << (UIMAGECUBEARRAY - 194)) | (1L << (INC_OP - 194)) | (1L << (DEC_OP - 194)) | (1L << (VOID - 194)) | (1L << (LPAREN - 194)) | (1L << (LBRACE - 194)) | (1L << (SEMICOLON - 194)) | (1L << (LBRACKET - 194)) | (1L << (PLUS_OP - 194)) | (1L << (MINUS_OP - 194)) | (1L << (LOGICAL_NOT_OP - 194)) | (1L << (BITWISE_NEG_OP - 194)) | (1L << (IDENTIFIER - 194)))) != 0)) {
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

	public static class DeclarationStatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
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
	public static class DefaultCaseLabelContext extends CaseLabelContext {
		public TerminalNode DEFAULT() { return getToken(GLSLParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public DefaultCaseLabelContext(CaseLabelContext ctx) { copyFrom(ctx); }
	}
	public static class ValuedCaseLabelContext extends CaseLabelContext {
		public TerminalNode CASE() { return getToken(GLSLParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(GLSLParser.COLON, 0); }
		public ValuedCaseLabelContext(CaseLabelContext ctx) { copyFrom(ctx); }
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
			if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ATOMIC_UINT - 36)) | (1L << (STRUCT - 36)) | (1L << (UINT16CONSTANT - 36)) | (1L << (INT16CONSTANT - 36)) | (1L << (UINT32CONSTANT - 36)) | (1L << (INT32CONSTANT - 36)) | (1L << (UINT64CONSTANT - 36)) | (1L << (INT64CONSTANT - 36)) | (1L << (FLOAT16CONSTANT - 36)) | (1L << (FLOAT32CONSTANT - 36)) | (1L << (FLOAT64CONSTANT - 36)) | (1L << (BOOLCONSTANT - 36)) | (1L << (BOOL - 36)) | (1L << (BVEC2 - 36)) | (1L << (BVEC3 - 36)) | (1L << (BVEC4 - 36)) | (1L << (INT8 - 36)) | (1L << (I8VEC2 - 36)) | (1L << (I8VEC3 - 36)) | (1L << (I8VEC4 - 36)) | (1L << (UINT8 - 36)) | (1L << (U8VEC2 - 36)) | (1L << (U8VEC3 - 36)) | (1L << (U8VEC4 - 36)) | (1L << (INT16 - 36)) | (1L << (I16VEC2 - 36)) | (1L << (I16VEC3 - 36)) | (1L << (I16VEC4 - 36)) | (1L << (UINT16 - 36)) | (1L << (U16VEC2 - 36)) | (1L << (U16VEC3 - 36)) | (1L << (U16VEC4 - 36)) | (1L << (INT32 - 36)) | (1L << (I32VEC2 - 36)) | (1L << (I32VEC3 - 36)) | (1L << (I32VEC4 - 36)) | (1L << (UINT32 - 36)) | (1L << (U32VEC2 - 36)) | (1L << (U32VEC3 - 36)) | (1L << (U32VEC4 - 36)) | (1L << (INT64 - 36)) | (1L << (I64VEC2 - 36)) | (1L << (I64VEC3 - 36)) | (1L << (I64VEC4 - 36)) | (1L << (UINT64 - 36)) | (1L << (U64VEC2 - 36)) | (1L << (U64VEC3 - 36)) | (1L << (U64VEC4 - 36)) | (1L << (FLOAT16 - 36)) | (1L << (F16VEC2 - 36)) | (1L << (F16VEC3 - 36)))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (F16VEC4 - 100)) | (1L << (F16MAT2X2 - 100)) | (1L << (F16MAT2X3 - 100)) | (1L << (F16MAT2X4 - 100)) | (1L << (F16MAT3X2 - 100)) | (1L << (F16MAT3X3 - 100)) | (1L << (F16MAT3X4 - 100)) | (1L << (F16MAT4X2 - 100)) | (1L << (F16MAT4X3 - 100)) | (1L << (F16MAT4X4 - 100)) | (1L << (FLOAT32 - 100)) | (1L << (F32VEC2 - 100)) | (1L << (F32VEC3 - 100)) | (1L << (F32VEC4 - 100)) | (1L << (F32MAT2X2 - 100)) | (1L << (F32MAT2X3 - 100)) | (1L << (F32MAT2X4 - 100)) | (1L << (F32MAT3X2 - 100)) | (1L << (F32MAT3X3 - 100)) | (1L << (F32MAT3X4 - 100)) | (1L << (F32MAT4X2 - 100)) | (1L << (F32MAT4X3 - 100)) | (1L << (F32MAT4X4 - 100)) | (1L << (FLOAT64 - 100)) | (1L << (F64VEC2 - 100)) | (1L << (F64VEC3 - 100)) | (1L << (F64VEC4 - 100)) | (1L << (F64MAT2X2 - 100)) | (1L << (F64MAT2X3 - 100)) | (1L << (F64MAT2X4 - 100)) | (1L << (F64MAT3X2 - 100)) | (1L << (F64MAT3X3 - 100)) | (1L << (F64MAT3X4 - 100)) | (1L << (F64MAT4X2 - 100)) | (1L << (F64MAT4X3 - 100)) | (1L << (F64MAT4X4 - 100)) | (1L << (IMAGE1D - 100)) | (1L << (IMAGE2D - 100)) | (1L << (IMAGE3D - 100)) | (1L << (UIMAGE1D - 100)) | (1L << (UIMAGE2D - 100)) | (1L << (UIMAGE3D - 100)) | (1L << (IIMAGE1D - 100)) | (1L << (IIMAGE2D - 100)) | (1L << (IIMAGE3D - 100)) | (1L << (SAMPLER1D - 100)) | (1L << (SAMPLER2D - 100)) | (1L << (SAMPLER3D - 100)) | (1L << (SAMPLER2DRECT - 100)) | (1L << (SAMPLER1DSHADOW - 100)) | (1L << (SAMPLER2DSHADOW - 100)) | (1L << (SAMPLER2DRECTSHADOW - 100)) | (1L << (SAMPLER1DARRAY - 100)) | (1L << (SAMPLER2DARRAY - 100)) | (1L << (SAMPLER1DARRAYSHADOW - 100)) | (1L << (SAMPLER2DARRAYSHADOW - 100)) | (1L << (ISAMPLER1D - 100)) | (1L << (ISAMPLER2D - 100)) | (1L << (ISAMPLER2DRECT - 100)) | (1L << (ISAMPLER3D - 100)) | (1L << (ISAMPLER1DARRAY - 100)) | (1L << (ISAMPLER2DARRAY - 100)) | (1L << (USAMPLER1D - 100)) | (1L << (USAMPLER2D - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (USAMPLER2DRECT - 164)) | (1L << (USAMPLER3D - 164)) | (1L << (USAMPLER1DARRAY - 164)) | (1L << (USAMPLER2DARRAY - 164)) | (1L << (SAMPLER2DMS - 164)) | (1L << (ISAMPLER2DMS - 164)) | (1L << (USAMPLER2DMS - 164)) | (1L << (SAMPLER2DMSARRAY - 164)) | (1L << (ISAMPLER2DMSARRAY - 164)) | (1L << (USAMPLER2DMSARRAY - 164)) | (1L << (IMAGE2DRECT - 164)) | (1L << (IMAGE1DARRAY - 164)) | (1L << (IMAGE2DARRAY - 164)) | (1L << (IMAGE2DMS - 164)) | (1L << (IMAGE2DMSARRAY - 164)) | (1L << (IIMAGE2DRECT - 164)) | (1L << (IIMAGE1DARRAY - 164)) | (1L << (IIMAGE2DARRAY - 164)) | (1L << (IIMAGE2DMS - 164)) | (1L << (IIMAGE2DMSARRAY - 164)) | (1L << (UIMAGE2DRECT - 164)) | (1L << (UIMAGE1DARRAY - 164)) | (1L << (UIMAGE2DARRAY - 164)) | (1L << (UIMAGE2DMS - 164)) | (1L << (UIMAGE2DMSARRAY - 164)) | (1L << (SAMPLERCUBESHADOW - 164)) | (1L << (SAMPLERCUBEARRAYSHADOW - 164)) | (1L << (SAMPLERCUBE - 164)) | (1L << (ISAMPLERCUBE - 164)) | (1L << (USAMPLERCUBE - 164)) | (1L << (SAMPLERBUFFER - 164)) | (1L << (ISAMPLERBUFFER - 164)) | (1L << (USAMPLERBUFFER - 164)) | (1L << (SAMPLERCUBEARRAY - 164)) | (1L << (ISAMPLERCUBEARRAY - 164)) | (1L << (USAMPLERCUBEARRAY - 164)) | (1L << (IMAGECUBE - 164)) | (1L << (UIMAGECUBE - 164)) | (1L << (IIMAGECUBE - 164)) | (1L << (IMAGEBUFFER - 164)) | (1L << (IIMAGEBUFFER - 164)) | (1L << (UIMAGEBUFFER - 164)) | (1L << (IMAGECUBEARRAY - 164)) | (1L << (IIMAGECUBEARRAY - 164)) | (1L << (UIMAGECUBEARRAY - 164)) | (1L << (INC_OP - 164)) | (1L << (DEC_OP - 164)) | (1L << (VOID - 164)))) != 0) || ((((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & ((1L << (LPAREN - 231)) | (1L << (PLUS_OP - 231)) | (1L << (MINUS_OP - 231)) | (1L << (LOGICAL_NOT_OP - 231)) | (1L << (BITWISE_NEG_OP - 231)) | (1L << (IDENTIFIER - 231)))) != 0)) {
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
	public static class DiscardStatementContext extends JumpStatementContext {
		public TerminalNode DISCARD() { return getToken(GLSLParser.DISCARD, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public DiscardStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class BreakStatementContext extends JumpStatementContext {
		public TerminalNode BREAK() { return getToken(GLSLParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public BreakStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ContinueStatementContext extends JumpStatementContext {
		public TerminalNode CONTINUE() { return getToken(GLSLParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public ContinueStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStatementContext extends JumpStatementContext {
		public TerminalNode RETURN() { return getToken(GLSLParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(JumpStatementContext ctx) { copyFrom(ctx); }
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
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (ATOMIC_UINT - 36)) | (1L << (STRUCT - 36)) | (1L << (UINT16CONSTANT - 36)) | (1L << (INT16CONSTANT - 36)) | (1L << (UINT32CONSTANT - 36)) | (1L << (INT32CONSTANT - 36)) | (1L << (UINT64CONSTANT - 36)) | (1L << (INT64CONSTANT - 36)) | (1L << (FLOAT16CONSTANT - 36)) | (1L << (FLOAT32CONSTANT - 36)) | (1L << (FLOAT64CONSTANT - 36)) | (1L << (BOOLCONSTANT - 36)) | (1L << (BOOL - 36)) | (1L << (BVEC2 - 36)) | (1L << (BVEC3 - 36)) | (1L << (BVEC4 - 36)) | (1L << (INT8 - 36)) | (1L << (I8VEC2 - 36)) | (1L << (I8VEC3 - 36)) | (1L << (I8VEC4 - 36)) | (1L << (UINT8 - 36)) | (1L << (U8VEC2 - 36)) | (1L << (U8VEC3 - 36)) | (1L << (U8VEC4 - 36)) | (1L << (INT16 - 36)) | (1L << (I16VEC2 - 36)) | (1L << (I16VEC3 - 36)) | (1L << (I16VEC4 - 36)) | (1L << (UINT16 - 36)) | (1L << (U16VEC2 - 36)) | (1L << (U16VEC3 - 36)) | (1L << (U16VEC4 - 36)) | (1L << (INT32 - 36)) | (1L << (I32VEC2 - 36)) | (1L << (I32VEC3 - 36)) | (1L << (I32VEC4 - 36)) | (1L << (UINT32 - 36)) | (1L << (U32VEC2 - 36)) | (1L << (U32VEC3 - 36)) | (1L << (U32VEC4 - 36)) | (1L << (INT64 - 36)) | (1L << (I64VEC2 - 36)) | (1L << (I64VEC3 - 36)) | (1L << (I64VEC4 - 36)) | (1L << (UINT64 - 36)) | (1L << (U64VEC2 - 36)) | (1L << (U64VEC3 - 36)) | (1L << (U64VEC4 - 36)) | (1L << (FLOAT16 - 36)) | (1L << (F16VEC2 - 36)) | (1L << (F16VEC3 - 36)))) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (F16VEC4 - 100)) | (1L << (F16MAT2X2 - 100)) | (1L << (F16MAT2X3 - 100)) | (1L << (F16MAT2X4 - 100)) | (1L << (F16MAT3X2 - 100)) | (1L << (F16MAT3X3 - 100)) | (1L << (F16MAT3X4 - 100)) | (1L << (F16MAT4X2 - 100)) | (1L << (F16MAT4X3 - 100)) | (1L << (F16MAT4X4 - 100)) | (1L << (FLOAT32 - 100)) | (1L << (F32VEC2 - 100)) | (1L << (F32VEC3 - 100)) | (1L << (F32VEC4 - 100)) | (1L << (F32MAT2X2 - 100)) | (1L << (F32MAT2X3 - 100)) | (1L << (F32MAT2X4 - 100)) | (1L << (F32MAT3X2 - 100)) | (1L << (F32MAT3X3 - 100)) | (1L << (F32MAT3X4 - 100)) | (1L << (F32MAT4X2 - 100)) | (1L << (F32MAT4X3 - 100)) | (1L << (F32MAT4X4 - 100)) | (1L << (FLOAT64 - 100)) | (1L << (F64VEC2 - 100)) | (1L << (F64VEC3 - 100)) | (1L << (F64VEC4 - 100)) | (1L << (F64MAT2X2 - 100)) | (1L << (F64MAT2X3 - 100)) | (1L << (F64MAT2X4 - 100)) | (1L << (F64MAT3X2 - 100)) | (1L << (F64MAT3X3 - 100)) | (1L << (F64MAT3X4 - 100)) | (1L << (F64MAT4X2 - 100)) | (1L << (F64MAT4X3 - 100)) | (1L << (F64MAT4X4 - 100)) | (1L << (IMAGE1D - 100)) | (1L << (IMAGE2D - 100)) | (1L << (IMAGE3D - 100)) | (1L << (UIMAGE1D - 100)) | (1L << (UIMAGE2D - 100)) | (1L << (UIMAGE3D - 100)) | (1L << (IIMAGE1D - 100)) | (1L << (IIMAGE2D - 100)) | (1L << (IIMAGE3D - 100)) | (1L << (SAMPLER1D - 100)) | (1L << (SAMPLER2D - 100)) | (1L << (SAMPLER3D - 100)) | (1L << (SAMPLER2DRECT - 100)) | (1L << (SAMPLER1DSHADOW - 100)) | (1L << (SAMPLER2DSHADOW - 100)) | (1L << (SAMPLER2DRECTSHADOW - 100)) | (1L << (SAMPLER1DARRAY - 100)) | (1L << (SAMPLER2DARRAY - 100)) | (1L << (SAMPLER1DARRAYSHADOW - 100)) | (1L << (SAMPLER2DARRAYSHADOW - 100)) | (1L << (ISAMPLER1D - 100)) | (1L << (ISAMPLER2D - 100)) | (1L << (ISAMPLER2DRECT - 100)) | (1L << (ISAMPLER3D - 100)) | (1L << (ISAMPLER1DARRAY - 100)) | (1L << (ISAMPLER2DARRAY - 100)) | (1L << (USAMPLER1D - 100)) | (1L << (USAMPLER2D - 100)))) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & ((1L << (USAMPLER2DRECT - 164)) | (1L << (USAMPLER3D - 164)) | (1L << (USAMPLER1DARRAY - 164)) | (1L << (USAMPLER2DARRAY - 164)) | (1L << (SAMPLER2DMS - 164)) | (1L << (ISAMPLER2DMS - 164)) | (1L << (USAMPLER2DMS - 164)) | (1L << (SAMPLER2DMSARRAY - 164)) | (1L << (ISAMPLER2DMSARRAY - 164)) | (1L << (USAMPLER2DMSARRAY - 164)) | (1L << (IMAGE2DRECT - 164)) | (1L << (IMAGE1DARRAY - 164)) | (1L << (IMAGE2DARRAY - 164)) | (1L << (IMAGE2DMS - 164)) | (1L << (IMAGE2DMSARRAY - 164)) | (1L << (IIMAGE2DRECT - 164)) | (1L << (IIMAGE1DARRAY - 164)) | (1L << (IIMAGE2DARRAY - 164)) | (1L << (IIMAGE2DMS - 164)) | (1L << (IIMAGE2DMSARRAY - 164)) | (1L << (UIMAGE2DRECT - 164)) | (1L << (UIMAGE1DARRAY - 164)) | (1L << (UIMAGE2DARRAY - 164)) | (1L << (UIMAGE2DMS - 164)) | (1L << (UIMAGE2DMSARRAY - 164)) | (1L << (SAMPLERCUBESHADOW - 164)) | (1L << (SAMPLERCUBEARRAYSHADOW - 164)) | (1L << (SAMPLERCUBE - 164)) | (1L << (ISAMPLERCUBE - 164)) | (1L << (USAMPLERCUBE - 164)) | (1L << (SAMPLERBUFFER - 164)) | (1L << (ISAMPLERBUFFER - 164)) | (1L << (USAMPLERBUFFER - 164)) | (1L << (SAMPLERCUBEARRAY - 164)) | (1L << (ISAMPLERCUBEARRAY - 164)) | (1L << (USAMPLERCUBEARRAY - 164)) | (1L << (IMAGECUBE - 164)) | (1L << (UIMAGECUBE - 164)) | (1L << (IIMAGECUBE - 164)) | (1L << (IMAGEBUFFER - 164)) | (1L << (IIMAGEBUFFER - 164)) | (1L << (UIMAGEBUFFER - 164)) | (1L << (IMAGECUBEARRAY - 164)) | (1L << (IIMAGECUBEARRAY - 164)) | (1L << (UIMAGECUBEARRAY - 164)) | (1L << (INC_OP - 164)) | (1L << (DEC_OP - 164)) | (1L << (VOID - 164)))) != 0) || ((((_la - 231)) & ~0x3f) == 0 && ((1L << (_la - 231)) & ((1L << (LPAREN - 231)) | (1L << (PLUS_OP - 231)) | (1L << (MINUS_OP - 231)) | (1L << (LOGICAL_NOT_OP - 231)) | (1L << (BITWISE_NEG_OP - 231)) | (1L << (IDENTIFIER - 231)))) != 0)) {
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

	public static class DemoteStatementContext extends ParserRuleContext {
		public TerminalNode DEMOTE() { return getToken(GLSLParser.DEMOTE, 0); }
		public TerminalNode SEMICOLON() { return getToken(GLSLParser.SEMICOLON, 0); }
		public DemoteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_demoteStatement; }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0146\u029b\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\5\2j\n\2\3\2\7\2m\n\2\f\2\16\2p\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5"+
		"\3x\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0084\n\4\3\5\3\5"+
		"\3\6\3\6\3\6\5\6\u008b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0096"+
		"\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u009f\n\7\3\7\3\7\3\b\3\b\3\b\5\b"+
		"\u00a6\n\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00ae\n\t\3\t\3\t\3\t\5\t\u00b3"+
		"\n\t\3\t\5\t\u00b6\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ca\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u00d2\n\f\f\f\16\f\u00d5\13\f\5\f\u00d7\n\f\3\f\3\f\3\f\5\f\u00dc\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u0117\n\f\f\f\16\f\u011a\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u0124\n\r\5\r\u0126\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u012e\n\r\f\r\16\r\u0131\13\r\5\r\u0133\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u0140\n\r\f\r\16\r\u0143\13\r\5\r\u0145\n\r\3\r"+
		"\3\r\5\r\u0149\n\r\3\16\5\16\u014c\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0154\n\16\3\17\3\17\3\17\7\17\u0159\n\17\f\17\16\17\u015c\13\17"+
		"\5\17\u015e\n\17\3\20\3\20\3\20\5\20\u0163\n\20\5\20\u0165\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\7\21\u016c\n\21\f\21\16\21\u016f\13\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\5\22\u0177\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u017e"+
		"\n\22\3\23\3\23\5\23\u0182\n\23\3\23\3\23\5\23\u0186\n\23\3\24\5\24\u0189"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01a3\n\25"+
		"\f\25\16\25\u01a6\13\25\3\25\5\25\u01a9\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u01b0\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u01b7\n\26\f\26\16\26\u01ba"+
		"\13\26\3\26\3\26\3\27\3\27\3\27\5\27\u01c1\n\27\3\27\5\27\u01c4\n\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\6"+
		"\34\u01d4\n\34\r\34\16\34\u01d5\3\35\3\35\3\35\3\35\5\35\u01dc\n\35\3"+
		"\35\5\35\u01df\n\35\3\36\6\36\u01e2\n\36\r\36\16\36\u01e3\3\37\3\37\5"+
		"\37\u01e8\n\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\5\"\u01f2\n\"\3\"\3\"\3#"+
		"\3#\6#\u01f8\n#\r#\16#\u01f9\3#\3#\3$\3$\3$\3$\7$\u0202\n$\f$\16$\u0205"+
		"\13$\3$\3$\3%\3%\5%\u020b\n%\3&\3&\3&\3&\3&\7&\u0212\n&\f&\16&\u0215\13"+
		"&\3&\5&\u0218\n&\5&\u021a\n&\3&\5&\u021d\n&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u022b\n\'\3(\3(\7(\u022f\n(\f(\16(\u0232\13"+
		"(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\5,\u023e\n,\3,\3,\3,\3,\3,\3,\3,\5,\u0247"+
		"\n,\3-\3-\3-\3-\3-\3.\5.\u024f\n.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/"+
		"\5/\u025d\n/\3\60\5\60\u0260\n\60\3\60\3\60\3\60\3\60\5\60\u0266\n\60"+
		"\3\60\3\60\3\60\3\61\5\61\u026c\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\5\62\u0277\n\62\3\62\3\62\3\62\3\62\3\62\5\62\u027e\n\62\3"+
		"\62\3\62\5\62\u0282\n\62\3\62\3\62\5\62\u0286\n\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u0291\n\63\3\63\3\63\3\63\5\63\u0296\n"+
		"\63\3\64\3\64\3\64\3\64\2\3\26\65\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdf\2\25\3\2\u011f\u012f"+
		"\3\2\u011c\u011e\3\2\u010e\u010f\3\2\u0111\u0112\3\2\u0114\u0117\3\2\4"+
		"\7\3\2\65>\4\2\u00d3\u00d4\u00f2\u00f5\3\2\u00f6\u00f8\3\2\u00f2\u00f3"+
		"\3\2\u00d6\u00d7\4\2\u00d8\u00d9\u00f9\u00fa\3\2\u00da\u00db\4\2\u00df"+
		"\u00e8\u00ff\u00ff\3\2\u00d3\u00d4\3\2\t\13\4\2\20\21\31\31\3\2?\u0089"+
		"\5\2&&\u008a\u00d2\u00d5\u00d5\2\u02f5\2i\3\2\2\2\4s\3\2\2\2\6\u0083\3"+
		"\2\2\2\b\u0085\3\2\2\2\n\u0087\3\2\2\2\f\u0099\3\2\2\2\16\u00a2\3\2\2"+
		"\2\20\u00a9\3\2\2\2\22\u00b9\3\2\2\2\24\u00bd\3\2\2\2\26\u00db\3\2\2\2"+
		"\30\u0148\3\2\2\2\32\u014b\3\2\2\2\34\u015d\3\2\2\2\36\u015f\3\2\2\2 "+
		"\u0166\3\2\2\2\"\u0176\3\2\2\2$\u017f\3\2\2\2&\u0188\3\2\2\2(\u01af\3"+
		"\2\2\2*\u01b1\3\2\2\2,\u01c3\3\2\2\2.\u01c5\3\2\2\2\60\u01c7\3\2\2\2\62"+
		"\u01c9\3\2\2\2\64\u01cb\3\2\2\2\66\u01d3\3\2\2\28\u01db\3\2\2\2:\u01e1"+
		"\3\2\2\2<\u01e5\3\2\2\2>\u01eb\3\2\2\2@\u01ed\3\2\2\2B\u01ef\3\2\2\2D"+
		"\u01f5\3\2\2\2F\u01fd\3\2\2\2H\u0208\3\2\2\2J\u021c\3\2\2\2L\u022a\3\2"+
		"\2\2N\u022c\3\2\2\2P\u0235\3\2\2\2R\u0237\3\2\2\2T\u023a\3\2\2\2V\u023d"+
		"\3\2\2\2X\u0248\3\2\2\2Z\u024e\3\2\2\2\\\u025c\3\2\2\2^\u025f\3\2\2\2"+
		"`\u026b\3\2\2\2b\u0276\3\2\2\2d\u0295\3\2\2\2f\u0297\3\2\2\2hj\5\4\3\2"+
		"ih\3\2\2\2ij\3\2\2\2jn\3\2\2\2km\5\6\4\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\2\2\3r\3\3\2\2\2st\7\u0102\2\2tu\7"+
		"\u010a\2\2uw\t\2\2\2vx\t\3\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\u0137"+
		"\2\2z\5\3\2\2\2{\u0084\5\24\13\2|\u0084\5\30\r\2}\u0084\5\n\6\2~\u0084"+
		"\5\f\7\2\177\u0084\5\16\b\2\u0080\u0084\5\20\t\2\u0081\u0084\5\22\n\2"+
		"\u0082\u0084\5\b\5\2\u0083{\3\2\2\2\u0083|\3\2\2\2\u0083}\3\2\2\2\u0083"+
		"~\3\2\2\2\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0082\3\2\2\2\u0084\7\3\2\2\2\u0085\u0086\7\u00ed\2\2\u0086\t\3\2\2\2"+
		"\u0087\u0088\7\u0102\2\2\u0088\u008a\7\u010d\2\2\u0089\u008b\7\u011b\2"+
		"\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0095\3\2\2\2\u008c\u0096"+
		"\7\u0133\2\2\u008d\u008e\t\4\2\2\u008e\u008f\7\u0119\2\2\u008f\u0090\t"+
		"\5\2\2\u0090\u0096\7\u011a\2\2\u0091\u0092\7\u0110\2\2\u0092\u0093\7\u0119"+
		"\2\2\u0093\u0094\7\u0113\2\2\u0094\u0096\7\u011a\2\2\u0095\u008c\3\2\2"+
		"\2\u0095\u008d\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\7\u0137\2\2\u0098\13\3\2\2\2\u0099\u009a\7\u0102\2\2\u009a\u009b\7\u0109"+
		"\2\2\u009b\u009e\7\u0133\2\2\u009c\u009d\7\u0118\2\2\u009d\u009f\t\6\2"+
		"\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\7\u0137\2\2\u00a1\r\3\2\2\2\u00a2\u00a3\7\u0102\2\2\u00a3\u00a5\7\u010b"+
		"\2\2\u00a4\u00a6\7\u0141\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\7\u013f\2\2\u00a8\17\3\2\2\2\u00a9\u00aa\7"+
		"\u0102\2\2\u00aa\u00b5\7\u010c\2\2\u00ab\u00ad\7\u0130\2\2\u00ac\u00ae"+
		"\7\u0139\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2"+
		"\2\u00af\u00b6\7\u013a\2\2\u00b0\u00b2\7\u0131\2\2\u00b1\u00b3\7\u013b"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b6\7\u013c\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b8\7\u0137\2\2\u00b8\21\3\2\2\2\u00b9\u00ba\5*\26\2"+
		"\u00ba\u00bb\t\7\2\2\u00bb\u00bc\7\u00ed\2\2\u00bc\23\3\2\2\2\u00bd\u00be"+
		"\5\32\16\2\u00be\u00bf\5N(\2\u00bf\25\3\2\2\2\u00c0\u00c1\b\f\1\2\u00c1"+
		"\u00dc\7\u0103\2\2\u00c2\u00dc\t\b\2\2\u00c3\u00c4\7\u00e9\2\2\u00c4\u00c5"+
		"\5\26\f\2\u00c5\u00c6\7\u00ea\2\2\u00c6\u00dc\3\2\2\2\u00c7\u00ca\7\u0103"+
		"\2\2\u00c8\u00ca\58\35\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00d6\7\u00e9\2\2\u00cc\u00d7\3\2\2\2\u00cd\u00d7"+
		"\7\u00d5\2\2\u00ce\u00d3\5\26\f\2\u00cf\u00d0\7\u00f0\2\2\u00d0\u00d2"+
		"\5\26\f\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00cc"+
		"\3\2\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00dc\7\u00ea\2\2\u00d9\u00da\t\t\2\2\u00da\u00dc\5\26\f\21\u00db\u00c0"+
		"\3\2\2\2\u00db\u00c2\3\2\2\2\u00db\u00c3\3\2\2\2\u00db\u00c9\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u0118\3\2\2\2\u00dd\u00de\f\20\2\2\u00de\u00df\t"+
		"\n\2\2\u00df\u0117\5\26\f\21\u00e0\u00e1\f\17\2\2\u00e1\u00e2\t\13\2\2"+
		"\u00e2\u0117\5\26\f\20\u00e3\u00e4\f\16\2\2\u00e4\u00e5\t\f\2\2\u00e5"+
		"\u0117\5\26\f\17\u00e6\u00e7\f\r\2\2\u00e7\u00e8\t\r\2\2\u00e8\u0117\5"+
		"\26\f\16\u00e9\u00ea\f\f\2\2\u00ea\u00eb\t\16\2\2\u00eb\u0117\5\26\f\r"+
		"\u00ec\u00ed\f\13\2\2\u00ed\u00ee\7\u00fb\2\2\u00ee\u0117\5\26\f\f\u00ef"+
		"\u00f0\f\n\2\2\u00f0\u00f1\7\u00fd\2\2\u00f1\u0117\5\26\f\13\u00f2\u00f3"+
		"\f\t\2\2\u00f3\u00f4\7\u00fc\2\2\u00f4\u0117\5\26\f\n\u00f5\u00f6\f\b"+
		"\2\2\u00f6\u00f7\7\u00dc\2\2\u00f7\u0117\5\26\f\t\u00f8\u00f9\f\7\2\2"+
		"\u00f9\u00fa\7\u00dd\2\2\u00fa\u0117\5\26\f\b\u00fb\u00fc\f\6\2\2\u00fc"+
		"\u00fd\7\u00de\2\2\u00fd\u0117\5\26\f\7\u00fe\u00ff\f\5\2\2\u00ff\u0100"+
		"\7\u00fe\2\2\u0100\u0101\5\26\f\2\u0101\u0102\7\3\2\2\u0102\u0103\5\26"+
		"\f\5\u0103\u0117\3\2\2\2\u0104\u0105\f\4\2\2\u0105\u0106\t\17\2\2\u0106"+
		"\u0117\5\26\f\4\u0107\u0108\f\3\2\2\u0108\u0109\7\u00f0\2\2\u0109\u0117"+
		"\5\26\f\4\u010a\u010b\f\26\2\2\u010b\u010c\7\u00ee\2\2\u010c\u010d\5\26"+
		"\f\2\u010d\u010e\7\u00ef\2\2\u010e\u0117\3\2\2\2\u010f\u0110\f\25\2\2"+
		"\u0110\u0117\7\30\2\2\u0111\u0112\f\23\2\2\u0112\u0113\7\u00f1\2\2\u0113"+
		"\u0117\7\u0103\2\2\u0114\u0115\f\22\2\2\u0115\u0117\t\20\2\2\u0116\u00dd"+
		"\3\2\2\2\u0116\u00e0\3\2\2\2\u0116\u00e3\3\2\2\2\u0116\u00e6\3\2\2\2\u0116"+
		"\u00e9\3\2\2\2\u0116\u00ec\3\2\2\2\u0116\u00ef\3\2\2\2\u0116\u00f2\3\2"+
		"\2\2\u0116\u00f5\3\2\2\2\u0116\u00f8\3\2\2\2\u0116\u00fb\3\2\2\2\u0116"+
		"\u00fe\3\2\2\2\u0116\u0104\3\2\2\2\u0116\u0107\3\2\2\2\u0116\u010a\3\2"+
		"\2\2\u0116\u010f\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\27\3\2\2"+
		"\2\u011a\u0118\3\2\2\2\u011b\u011c\5\32\16\2\u011c\u011d\7\u00ed\2\2\u011d"+
		"\u0149\3\2\2\2\u011e\u011f\5\66\34\2\u011f\u0120\7\u0103\2\2\u0120\u0125"+
		"\5D#\2\u0121\u0123\7\u0103\2\2\u0122\u0124\5:\36\2\u0123\u0122\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0121\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7\u00ed\2\2\u0128\u0149\3\2\2"+
		"\2\u0129\u0132\5\66\34\2\u012a\u012f\7\u0103\2\2\u012b\u012c\7\u00f0\2"+
		"\2\u012c\u012e\7\u0103\2\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0132\u012a\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\7\u00ed\2\2\u0135\u0149\3\2\2\2\u0136\u0137\7\f\2\2\u0137\u0138"+
		"\5.\30\2\u0138\u0139\58\35\2\u0139\u013a\7\u00ed\2\2\u013a\u0149\3\2\2"+
		"\2\u013b\u0144\5&\24\2\u013c\u0141\5$\23\2\u013d\u013e\7\u00f0\2\2\u013e"+
		"\u0140\5$\23\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u013c\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\u00ed"+
		"\2\2\u0147\u0149\3\2\2\2\u0148\u011b\3\2\2\2\u0148\u011e\3\2\2\2\u0148"+
		"\u0129\3\2\2\2\u0148\u0136\3\2\2\2\u0148\u013b\3\2\2\2\u0149\31\3\2\2"+
		"\2\u014a\u014c\5 \21\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014e\5&\24\2\u014e\u014f\7\u0103\2\2\u014f\u0150\7\u00e9"+
		"\2\2\u0150\u0151\5\34\17\2\u0151\u0153\7\u00ea\2\2\u0152\u0154\5 \21\2"+
		"\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\33\3\2\2\2\u0155\u015a"+
		"\5\36\20\2\u0156\u0157\7\u00f0\2\2\u0157\u0159\5\36\20\2\u0158\u0156\3"+
		"\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0155\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\35\3\2\2\2\u015f\u0164\5&\24\2\u0160\u0162\7\u0103\2\2\u0161"+
		"\u0163\5:\36\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2"+
		"\2\2\u0164\u0160\3\2\2\2\u0164\u0165\3\2\2\2\u0165\37\3\2\2\2\u0166\u0167"+
		"\7\u00ee\2\2\u0167\u0168\7\u00ee\2\2\u0168\u016d\5\"\22\2\u0169\u016a"+
		"\7\u00f0\2\2\u016a\u016c\5\"\22\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0171\7\u00ef\2\2\u0171\u0172\7\u00ef\2\2\u0172!"+
		"\3\2\2\2\u0173\u0174\7\u0103\2\2\u0174\u0175\7\3\2\2\u0175\u0177\7\3\2"+
		"\2\u0176\u0173\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017d"+
		"\7\u0103\2\2\u0179\u017a\7\u00e9\2\2\u017a\u017b\5\26\f\2\u017b\u017c"+
		"\7\u00ea\2\2\u017c\u017e\3\2\2\2\u017d\u0179\3\2\2\2\u017d\u017e\3\2\2"+
		"\2\u017e#\3\2\2\2\u017f\u0181\7\u0103\2\2\u0180\u0182\5:\36\2\u0181\u0180"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0184\7\u00ff\2"+
		"\2\u0184\u0186\5J&\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186%\3"+
		"\2\2\2\u0187\u0189\5\66\34\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\58\35\2\u018b\'\3\2\2\2\u018c\u01b0\7\r\2\2"+
		"\u018d\u01b0\7\6\2\2\u018e\u01b0\7\7\2\2\u018f\u01b0\7\b\2\2\u0190\u01b0"+
		"\7\22\2\2\u0191\u01b0\7\33\2\2\u0192\u01b0\7\32\2\2\u0193\u01b0\7\4\2"+
		"\2\u0194\u01b0\7\25\2\2\u0195\u01b0\7\23\2\2\u0196\u01b0\7\5\2\2\u0197"+
		"\u01b0\7\26\2\2\u0198\u01b0\7\35\2\2\u0199\u01b0\7\24\2\2\u019a\u01b0"+
		"\7\34\2\2\u019b\u01b0\7\36\2\2\u019c\u01b0\7\37\2\2\u019d\u01a8\7 \2\2"+
		"\u019e\u019f\7\u00e9\2\2\u019f\u01a4\7\u0103\2\2\u01a0\u01a1\7\u00f0\2"+
		"\2\u01a1\u01a3\7\u0103\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a7\u01a9\7\u00ea\2\2\u01a8\u019e\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01b0\3\2\2\2\u01aa\u01b0\7!\2\2\u01ab\u01b0\7\"\2\2\u01ac\u01b0\7#\2"+
		"\2\u01ad\u01b0\7$\2\2\u01ae\u01b0\7%\2\2\u01af\u018c\3\2\2\2\u01af\u018d"+
		"\3\2\2\2\u01af\u018e\3\2\2\2\u01af\u018f\3\2\2\2\u01af\u0190\3\2\2\2\u01af"+
		"\u0191\3\2\2\2\u01af\u0192\3\2\2\2\u01af\u0193\3\2\2\2\u01af\u0194\3\2"+
		"\2\2\u01af\u0195\3\2\2\2\u01af\u0196\3\2\2\2\u01af\u0197\3\2\2\2\u01af"+
		"\u0198\3\2\2\2\u01af\u0199\3\2\2\2\u01af\u019a\3\2\2\2\u01af\u019b\3\2"+
		"\2\2\u01af\u019c\3\2\2\2\u01af\u019d\3\2\2\2\u01af\u01aa\3\2\2\2\u01af"+
		"\u01ab\3\2\2\2\u01af\u01ac\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2"+
		"\2\2\u01b0)\3\2\2\2\u01b1\u01b2\7\27\2\2\u01b2\u01b3\7\u00e9\2\2\u01b3"+
		"\u01b8\5,\27\2\u01b4\u01b5\7\u00f0\2\2\u01b5\u01b7\5,\27\2\u01b6\u01b4"+
		"\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7\u00ea\2\2\u01bc+\3\2"+
		"\2\2\u01bd\u01c0\7\u0103\2\2\u01be\u01bf\7\u00ff\2\2\u01bf\u01c1\5\26"+
		"\f\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2"+
		"\u01c4\7\26\2\2\u01c3\u01bd\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4-\3\2\2\2"+
		"\u01c5\u01c6\t\21\2\2\u01c6/\3\2\2\2\u01c7\u01c8\t\22\2\2\u01c8\61\3\2"+
		"\2\2\u01c9\u01ca\7\17\2\2\u01ca\63\3\2\2\2\u01cb\u01cc\7\16\2\2\u01cc"+
		"\65\3\2\2\2\u01cd\u01d4\5(\25\2\u01ce\u01d4\5*\26\2\u01cf\u01d4\5.\30"+
		"\2\u01d0\u01d4\5\60\31\2\u01d1\u01d4\5\62\32\2\u01d2\u01d4\5\64\33\2\u01d3"+
		"\u01cd\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d3\u01cf\3\2\2\2\u01d3\u01d0\3\2"+
		"\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\67\3\2\2\2\u01d7\u01dc\7\u0103"+
		"\2\2\u01d8\u01dc\5@!\2\u01d9\u01dc\5> \2\u01da\u01dc\5B\"\2\u01db\u01d7"+
		"\3\2\2\2\u01db\u01d8\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dc"+
		"\u01de\3\2\2\2\u01dd\u01df\5:\36\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df9\3\2\2\2\u01e0\u01e2\5<\37\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4;\3\2\2\2\u01e5"+
		"\u01e7\7\u00ee\2\2\u01e6\u01e8\5\26\f\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\7\u00ef\2\2\u01ea=\3\2\2\2\u01eb"+
		"\u01ec\t\23\2\2\u01ec?\3\2\2\2\u01ed\u01ee\t\24\2\2\u01eeA\3\2\2\2\u01ef"+
		"\u01f1\7\'\2\2\u01f0\u01f2\7\u0103\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\5D#\2\u01f4C\3\2\2\2\u01f5\u01f7"+
		"\7\u00eb\2\2\u01f6\u01f8\5F$\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2"+
		"\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc"+
		"\7\u00ec\2\2\u01fcE\3\2\2\2\u01fd\u01fe\5&\24\2\u01fe\u0203\5H%\2\u01ff"+
		"\u0200\7\u00f0\2\2\u0200\u0202\5H%\2\u0201\u01ff\3\2\2\2\u0202\u0205\3"+
		"\2\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0206\u0207\7\u00ed\2\2\u0207G\3\2\2\2\u0208\u020a\7\u0103"+
		"\2\2\u0209\u020b\5:\36\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b"+
		"I\3\2\2\2\u020c\u021d\5\26\f\2\u020d\u0219\7\u00eb\2\2\u020e\u0213\5J"+
		"&\2\u020f\u0210\7\u00f0\2\2\u0210\u0212\5J&\2\u0211\u020f\3\2\2\2\u0212"+
		"\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0217\3\2"+
		"\2\2\u0215\u0213\3\2\2\2\u0216\u0218\7\u00f0\2\2\u0217\u0216\3\2\2\2\u0217"+
		"\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u020e\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021b\3\2\2\2\u021b\u021d\7\u00ec\2\2\u021c\u020c\3\2\2\2\u021c"+
		"\u020d\3\2\2\2\u021dK\3\2\2\2\u021e\u022b\5N(\2\u021f\u022b\5P)\2\u0220"+
		"\u022b\5R*\2\u0221\u022b\5T+\2\u0222\u022b\5V,\2\u0223\u022b\5Z.\2\u0224"+
		"\u022b\5\\/\2\u0225\u022b\5b\62\2\u0226\u022b\5^\60\2\u0227\u022b\5`\61"+
		"\2\u0228\u022b\5d\63\2\u0229\u022b\5f\64\2\u022a\u021e\3\2\2\2\u022a\u021f"+
		"\3\2\2\2\u022a\u0220\3\2\2\2\u022a\u0221\3\2\2\2\u022a\u0222\3\2\2\2\u022a"+
		"\u0223\3\2\2\2\u022a\u0224\3\2\2\2\u022a\u0225\3\2\2\2\u022a\u0226\3\2"+
		"\2\2\u022a\u0227\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u0229\3\2\2\2\u022b"+
		"M\3\2\2\2\u022c\u0230\7\u00eb\2\2\u022d\u022f\5L\'\2\u022e\u022d\3\2\2"+
		"\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233"+
		"\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234\7\u00ec\2\2\u0234O\3\2\2\2\u0235"+
		"\u0236\5\30\r\2\u0236Q\3\2\2\2\u0237\u0238\5\26\f\2\u0238\u0239\7\u00ed"+
		"\2\2\u0239S\3\2\2\2\u023a\u023b\7\u00ed\2\2\u023bU\3\2\2\2\u023c\u023e"+
		"\5 \21\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u0240\7(\2\2\u0240\u0241\7\u00e9\2\2\u0241\u0242\5\26\f\2\u0242\u0243"+
		"\7\u00ea\2\2\u0243\u0246\5L\'\2\u0244\u0245\7)\2\2\u0245\u0247\5L\'\2"+
		"\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247W\3\2\2\2\u0248\u0249\5"+
		"&\24\2\u0249\u024a\7\u0103\2\2\u024a\u024b\7\u00ff\2\2\u024b\u024c\5J"+
		"&\2\u024cY\3\2\2\2\u024d\u024f\5 \21\2\u024e\u024d\3\2\2\2\u024e\u024f"+
		"\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\7*\2\2\u0251\u0252\7\u00e9\2"+
		"\2\u0252\u0253\5\26\f\2\u0253\u0254\7\u00ea\2\2\u0254\u0255\5N(\2\u0255"+
		"[\3\2\2\2\u0256\u0257\7+\2\2\u0257\u0258\5\26\f\2\u0258\u0259\7\3\2\2"+
		"\u0259\u025d\3\2\2\2\u025a\u025b\7,\2\2\u025b\u025d\7\3\2\2\u025c\u0256"+
		"\3\2\2\2\u025c\u025a\3\2\2\2\u025d]\3\2\2\2\u025e\u0260\5 \21\2\u025f"+
		"\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\7-"+
		"\2\2\u0262\u0265\7\u00e9\2\2\u0263\u0266\5\26\f\2\u0264\u0266\5X-\2\u0265"+
		"\u0263\3\2\2\2\u0265\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0268\7\u00ea"+
		"\2\2\u0268\u0269\5L\'\2\u0269_\3\2\2\2\u026a\u026c\5 \21\2\u026b\u026a"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\7.\2\2\u026e"+
		"\u026f\5L\'\2\u026f\u0270\7-\2\2\u0270\u0271\7\u00e9\2\2\u0271\u0272\5"+
		"\26\f\2\u0272\u0273\7\u00ea\2\2\u0273\u0274\7\u00ed\2\2\u0274a\3\2\2\2"+
		"\u0275\u0277\5 \21\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u0279\7/\2\2\u0279\u027d\7\u00e9\2\2\u027a\u027e\5T+\2"+
		"\u027b\u027e\5R*\2\u027c\u027e\5P)\2\u027d\u027a\3\2\2\2\u027d\u027b\3"+
		"\2\2\2\u027d\u027c\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u0282\5\26\f\2\u0280"+
		"\u0282\5X-\2\u0281\u027f\3\2\2\2\u0281\u0280\3\2\2\2\u0281\u0282\3\2\2"+
		"\2\u0282\u0283\3\2\2\2\u0283\u0285\7\u00ed\2\2\u0284\u0286\5\26\f\2\u0285"+
		"\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\7\u00ea"+
		"\2\2\u0288\u0289\5L\'\2\u0289c\3\2\2\2\u028a\u028b\7\60\2\2\u028b\u0296"+
		"\7\u00ed\2\2\u028c\u028d\7\61\2\2\u028d\u0296\7\u00ed\2\2\u028e\u0290"+
		"\7\62\2\2\u028f\u0291\5\26\f\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2"+
		"\u0291\u0292\3\2\2\2\u0292\u0296\7\u00ed\2\2\u0293\u0294\7\63\2\2\u0294"+
		"\u0296\7\u00ed\2\2\u0295\u028a\3\2\2\2\u0295\u028c\3\2\2\2\u0295\u028e"+
		"\3\2\2\2\u0295\u0293\3\2\2\2\u0296e\3\2\2\2\u0297\u0298\7\64\2\2\u0298"+
		"\u0299\7\u00ed\2\2\u0299g\3\2\2\2Iinw\u0083\u008a\u0095\u009e\u00a5\u00ad"+
		"\u00b2\u00b5\u00c9\u00d3\u00d6\u00db\u0116\u0118\u0123\u0125\u012f\u0132"+
		"\u0141\u0144\u0148\u014b\u0153\u015a\u015d\u0162\u0164\u016d\u0176\u017d"+
		"\u0181\u0185\u0188\u01a4\u01a8\u01af\u01b8\u01c0\u01c3\u01d3\u01d5\u01db"+
		"\u01de\u01e3\u01e7\u01f1\u01f9\u0203\u020a\u0213\u0217\u0219\u021c\u022a"+
		"\u0230\u023d\u0246\u024e\u025c\u025f\u0265\u026b\u0276\u027d\u0281\u0285"+
		"\u0290\u0295";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}