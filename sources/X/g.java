package X;

import R2.b;
import android.content.res.AssetManager;
import android.util.Log;
import com.google.android.gms.internal.measurement.a;
import h0.C0552a;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public final class g {

    /* renamed from: A  reason: collision with root package name */
    public static final byte[] f4137A = {82, 73, 70, 70};

    /* renamed from: B  reason: collision with root package name */
    public static final byte[] f4138B = {87, 69, 66, 80};

    /* renamed from: C  reason: collision with root package name */
    public static final byte[] f4139C = {69, 88, 73, 70};

    /* renamed from: D  reason: collision with root package name */
    public static final String[] f4140D = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f4141E = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] F = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: G  reason: collision with root package name */
    public static final d f4142G = new d("StripOffsets", 273, 3);

    /* renamed from: H  reason: collision with root package name */
    public static final d[][] f4143H;

    /* renamed from: I  reason: collision with root package name */
    public static final d[] f4144I;

    /* renamed from: J  reason: collision with root package name */
    public static final HashMap[] f4145J = new HashMap[10];

    /* renamed from: K  reason: collision with root package name */
    public static final HashMap[] f4146K = new HashMap[10];

    /* renamed from: L  reason: collision with root package name */
    public static final HashSet f4147L = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: M  reason: collision with root package name */
    public static final HashMap f4148M = new HashMap();

    /* renamed from: N  reason: collision with root package name */
    public static final Charset f4149N;

    /* renamed from: O  reason: collision with root package name */
    public static final byte[] f4150O;

    /* renamed from: P  reason: collision with root package name */
    public static final byte[] f4151P;

    /* renamed from: l  reason: collision with root package name */
    public static final boolean f4152l = Log.isLoggable("ExifInterface", 3);

    /* renamed from: m  reason: collision with root package name */
    public static final List f4153m = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: n  reason: collision with root package name */
    public static final List f4154n = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f4155o = {8, 8, 8};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f4156p = {8};

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f4157q = {-1, -40, -1};

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f4158r = {102, 116, 121, 112};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f4159s = {109, 105, 102, 49};

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f4160t = {104, 101, 105, 99};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f4161u = {79, 76, 89, 77, 80, 0};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f4162v = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f4163w = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f4164x = {101, 88, 73, 102};

    /* renamed from: y  reason: collision with root package name */
    public static final byte[] f4165y = {73, 72, 68, 82};

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f4166z = {73, 69, 78, 68};

    /* renamed from: a  reason: collision with root package name */
    public final FileDescriptor f4167a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager.AssetInputStream f4168b;

    /* renamed from: c  reason: collision with root package name */
    public int f4169c;
    public final HashMap[] d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f4170e;

    /* renamed from: f  reason: collision with root package name */
    public ByteOrder f4171f = ByteOrder.BIG_ENDIAN;
    public boolean g;
    public int h;

    /* renamed from: i  reason: collision with root package name */
    public int f4172i;

    /* renamed from: j  reason: collision with root package name */
    public int f4173j;

    /* renamed from: k  reason: collision with root package name */
    public int f4174k;

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        d dVar = r15;
        d dVar2 = new d("NewSubfileType", 254, 4);
        d dVar3 = r15;
        d dVar4 = new d("SubfileType", 255, 4);
        d dVar5 = r15;
        d dVar6 = new d("ImageWidth", 256, 3, 4);
        d dVar7 = r2;
        d dVar8 = new d("ImageLength", 257, 3, 4);
        d dVar9 = r2;
        d dVar10 = new d("BitsPerSample", 258, 3);
        d dVar11 = r2;
        d dVar12 = new d("Compression", 259, 3);
        d dVar13 = r2;
        d dVar14 = new d("PhotometricInterpretation", 262, 3);
        d dVar15 = r2;
        d dVar16 = new d("ImageDescription", 270, 2);
        d dVar17 = r2;
        d dVar18 = new d("Make", 271, 2);
        d dVar19 = r2;
        d dVar20 = new d("Model", 272, 2);
        d dVar21 = r2;
        d dVar22 = new d("StripOffsets", 273, 3, 4);
        d dVar23 = r1;
        d dVar24 = new d("Orientation", 274, 3);
        d dVar25 = r1;
        d dVar26 = new d("SamplesPerPixel", 277, 3);
        d dVar27 = r1;
        d dVar28 = new d("RowsPerStrip", 278, 3, 4);
        d dVar29 = r1;
        d dVar30 = new d("StripByteCounts", 279, 3, 4);
        d dVar31 = r1;
        d dVar32 = new d("XResolution", 282, 5);
        d dVar33 = r1;
        d dVar34 = new d("YResolution", 283, 5);
        d dVar35 = r1;
        d dVar36 = new d("PlanarConfiguration", 284, 3);
        d dVar37 = r1;
        d dVar38 = new d("ResolutionUnit", 296, 3);
        d dVar39 = r1;
        d dVar40 = new d("TransferFunction", 301, 3);
        d dVar41 = r1;
        d dVar42 = new d("Software", 305, 2);
        d dVar43 = r1;
        d dVar44 = new d("DateTime", 306, 2);
        d dVar45 = r1;
        d dVar46 = new d("Artist", 315, 2);
        d dVar47 = r1;
        d dVar48 = new d("WhitePoint", 318, 5);
        d dVar49 = r1;
        d dVar50 = new d("PrimaryChromaticities", 319, 5);
        d dVar51 = r1;
        d dVar52 = new d("SubIFDPointer", 330, 4);
        d dVar53 = r1;
        d dVar54 = new d("JPEGInterchangeFormat", 513, 4);
        d dVar55 = r1;
        d dVar56 = new d("JPEGInterchangeFormatLength", 514, 4);
        d dVar57 = r1;
        d dVar58 = new d("YCbCrCoefficients", 529, 5);
        d dVar59 = r1;
        d dVar60 = new d("YCbCrSubSampling", 530, 3);
        d dVar61 = r1;
        d dVar62 = new d("YCbCrPositioning", 531, 3);
        d dVar63 = r1;
        d dVar64 = new d("ReferenceBlackWhite", 532, 5);
        d dVar65 = r1;
        d dVar66 = new d("Copyright", 33432, 2);
        d dVar67 = r1;
        d dVar68 = new d("ExifIFDPointer", 34665, 4);
        d dVar69 = r1;
        d dVar70 = new d("GPSInfoIFDPointer", 34853, 4);
        d dVar71 = r1;
        d dVar72 = new d("SensorTopBorder", 4, 4);
        d dVar73 = r1;
        d dVar74 = new d("SensorLeftBorder", 5, 4);
        d dVar75 = r1;
        d dVar76 = new d("SensorBottomBorder", 6, 4);
        d dVar77 = r1;
        d dVar78 = new d("SensorRightBorder", 7, 4);
        d dVar79 = r1;
        d dVar80 = new d("ISO", 23, 3);
        d dVar81 = r1;
        d dVar82 = new d("JpgFromRaw", 46, 7);
        d dVar83 = r1;
        d dVar84 = new d("Xmp", 700, 1);
        d[] dVarArr = {dVar, dVar3, dVar5, dVar7, dVar9, dVar11, dVar13, dVar15, dVar17, dVar19, dVar21, dVar23, dVar25, dVar27, dVar29, dVar31, dVar33, dVar35, dVar37, dVar39, dVar41, dVar43, dVar45, dVar47, dVar49, dVar51, dVar53, dVar55, dVar57, dVar59, dVar61, dVar63, dVar65, dVar67, dVar69, dVar71, dVar73, dVar75, dVar77, dVar79, dVar81, dVar83};
        d dVar85 = r1;
        d dVar86 = new d("ExposureTime", 33434, 5);
        d dVar87 = r1;
        d dVar88 = new d("FNumber", 33437, 5);
        d dVar89 = r1;
        d dVar90 = new d("ExposureProgram", 34850, 3);
        d dVar91 = r1;
        d dVar92 = new d("SpectralSensitivity", 34852, 2);
        d dVar93 = r1;
        d dVar94 = new d("PhotographicSensitivity", 34855, 3);
        d dVar95 = r1;
        d dVar96 = new d("OECF", 34856, 7);
        d dVar97 = r1;
        d dVar98 = new d("SensitivityType", 34864, 3);
        d dVar99 = r1;
        d dVar100 = new d("StandardOutputSensitivity", 34865, 4);
        d dVar101 = r1;
        d dVar102 = new d("RecommendedExposureIndex", 34866, 4);
        d dVar103 = r1;
        d dVar104 = new d("ISOSpeed", 34867, 4);
        d dVar105 = r1;
        d dVar106 = new d("ISOSpeedLatitudeyyy", 34868, 4);
        d dVar107 = r1;
        d dVar108 = new d("ISOSpeedLatitudezzz", 34869, 4);
        d dVar109 = r1;
        d dVar110 = new d("ExifVersion", 36864, 2);
        d dVar111 = r1;
        d dVar112 = new d("DateTimeOriginal", 36867, 2);
        d dVar113 = r1;
        d dVar114 = new d("DateTimeDigitized", 36868, 2);
        d dVar115 = r1;
        d dVar116 = new d("OffsetTime", 36880, 2);
        d dVar117 = r1;
        d dVar118 = new d("OffsetTimeOriginal", 36881, 2);
        d dVar119 = r1;
        d dVar120 = new d("OffsetTimeDigitized", 36882, 2);
        d dVar121 = r1;
        d dVar122 = new d("ComponentsConfiguration", 37121, 7);
        d dVar123 = r1;
        d dVar124 = new d("CompressedBitsPerPixel", 37122, 5);
        d dVar125 = r1;
        d dVar126 = new d("ShutterSpeedValue", 37377, 10);
        d dVar127 = r1;
        d dVar128 = new d("ApertureValue", 37378, 5);
        d dVar129 = r1;
        d dVar130 = new d("BrightnessValue", 37379, 10);
        d dVar131 = r1;
        d dVar132 = new d("ExposureBiasValue", 37380, 10);
        d dVar133 = r1;
        d dVar134 = new d("MaxApertureValue", 37381, 5);
        d dVar135 = r1;
        d dVar136 = new d("SubjectDistance", 37382, 5);
        d dVar137 = r1;
        d dVar138 = new d("MeteringMode", 37383, 3);
        d dVar139 = r1;
        d dVar140 = new d("LightSource", 37384, 3);
        d dVar141 = r1;
        d dVar142 = new d("Flash", 37385, 3);
        d dVar143 = r1;
        d dVar144 = new d("FocalLength", 37386, 5);
        d dVar145 = r1;
        d dVar146 = new d("SubjectArea", 37396, 3);
        d dVar147 = r1;
        d dVar148 = new d("MakerNote", 37500, 7);
        d dVar149 = r1;
        d dVar150 = new d("UserComment", 37510, 7);
        d dVar151 = r1;
        d dVar152 = new d("SubSecTime", 37520, 2);
        d dVar153 = r1;
        d dVar154 = new d("SubSecTimeOriginal", 37521, 2);
        d dVar155 = r1;
        d dVar156 = new d("SubSecTimeDigitized", 37522, 2);
        d dVar157 = r1;
        d dVar158 = new d("FlashpixVersion", 40960, 7);
        d dVar159 = r1;
        d dVar160 = new d("ColorSpace", 40961, 3);
        d dVar161 = r1;
        d dVar162 = new d("PixelXDimension", 40962, 3, 4);
        d dVar163 = r1;
        d dVar164 = new d("PixelYDimension", 40963, 3, 4);
        d dVar165 = r1;
        d dVar166 = new d("RelatedSoundFile", 40964, 2);
        d dVar167 = r1;
        d dVar168 = new d("InteroperabilityIFDPointer", 40965, 4);
        d dVar169 = r1;
        d dVar170 = new d("FlashEnergy", 41483, 5);
        d dVar171 = r1;
        d dVar172 = new d("SpatialFrequencyResponse", 41484, 7);
        d dVar173 = r1;
        d dVar174 = new d("FocalPlaneXResolution", 41486, 5);
        d dVar175 = r1;
        d dVar176 = new d("FocalPlaneYResolution", 41487, 5);
        d dVar177 = r1;
        d dVar178 = new d("FocalPlaneResolutionUnit", 41488, 3);
        d dVar179 = r1;
        d dVar180 = new d("SubjectLocation", 41492, 3);
        d dVar181 = r1;
        d dVar182 = new d("ExposureIndex", 41493, 5);
        d dVar183 = r1;
        d dVar184 = new d("SensingMethod", 41495, 3);
        d dVar185 = r1;
        d dVar186 = new d("FileSource", 41728, 7);
        d dVar187 = r1;
        d dVar188 = new d("SceneType", 41729, 7);
        d dVar189 = r1;
        d dVar190 = new d("CFAPattern", 41730, 7);
        d dVar191 = r1;
        d dVar192 = new d("CustomRendered", 41985, 3);
        d dVar193 = r1;
        d dVar194 = new d("ExposureMode", 41986, 3);
        d dVar195 = r1;
        d dVar196 = new d("WhiteBalance", 41987, 3);
        d dVar197 = r1;
        d dVar198 = new d("DigitalZoomRatio", 41988, 5);
        d dVar199 = r1;
        d dVar200 = new d("FocalLengthIn35mmFilm", 41989, 3);
        d dVar201 = r1;
        d dVar202 = new d("SceneCaptureType", 41990, 3);
        d dVar203 = r1;
        d dVar204 = new d("GainControl", 41991, 3);
        d dVar205 = r1;
        d dVar206 = new d("Contrast", 41992, 3);
        d dVar207 = r1;
        d dVar208 = new d("Saturation", 41993, 3);
        d dVar209 = r1;
        d dVar210 = new d("Sharpness", 41994, 3);
        d dVar211 = r1;
        d dVar212 = new d("DeviceSettingDescription", 41995, 7);
        d dVar213 = r1;
        d dVar214 = new d("SubjectDistanceRange", 41996, 3);
        d dVar215 = r1;
        d dVar216 = new d("ImageUniqueID", 42016, 2);
        d dVar217 = r1;
        d dVar218 = new d("CameraOwnerName", 42032, 2);
        d dVar219 = r1;
        d dVar220 = new d("BodySerialNumber", 42033, 2);
        d dVar221 = r1;
        d dVar222 = new d("LensSpecification", 42034, 5);
        d dVar223 = r1;
        d dVar224 = new d("LensMake", 42035, 2);
        d dVar225 = r1;
        d dVar226 = new d("LensModel", 42036, 2);
        d dVar227 = r1;
        d dVar228 = new d("Gamma", 42240, 5);
        d dVar229 = r1;
        d dVar230 = new d("DNGVersion", 50706, 1);
        d dVar231 = r1;
        d dVar232 = new d("DefaultCropSize", 50720, 3, 4);
        d dVar233 = r1;
        d dVar234 = new d("GPSVersionID", 0, 1);
        d dVar235 = r1;
        d dVar236 = new d("GPSLatitudeRef", 1, 2);
        d dVar237 = r1;
        d dVar238 = new d("GPSLatitude", 2, 5, 10);
        d dVar239 = r1;
        d dVar240 = new d("GPSLongitudeRef", 3, 2);
        d dVar241 = r1;
        d dVar242 = new d("GPSLongitude", 4, 5, 10);
        d dVar243 = r1;
        d dVar244 = new d("GPSAltitudeRef", 5, 1);
        d dVar245 = r1;
        d dVar246 = new d("GPSAltitude", 6, 5);
        d dVar247 = r1;
        d dVar248 = new d("GPSTimeStamp", 7, 5);
        d dVar249 = r1;
        d dVar250 = new d("GPSSatellites", 8, 2);
        d dVar251 = r1;
        d dVar252 = new d("GPSStatus", 9, 2);
        d dVar253 = r1;
        d dVar254 = new d("GPSMeasureMode", 10, 2);
        d dVar255 = r1;
        d dVar256 = new d("GPSDOP", 11, 5);
        d dVar257 = r1;
        d dVar258 = new d("GPSSpeedRef", 12, 2);
        d dVar259 = r1;
        d dVar260 = new d("GPSSpeed", 13, 5);
        d dVar261 = r1;
        d dVar262 = new d("GPSTrackRef", 14, 2);
        d dVar263 = r1;
        d dVar264 = new d("GPSTrack", 15, 5);
        d dVar265 = r1;
        d dVar266 = new d("GPSImgDirectionRef", 16, 2);
        d dVar267 = r1;
        d dVar268 = new d("GPSImgDirection", 17, 5);
        d dVar269 = r1;
        d dVar270 = new d("GPSMapDatum", 18, 2);
        d dVar271 = r1;
        d dVar272 = new d("GPSDestLatitudeRef", 19, 2);
        d dVar273 = r1;
        d dVar274 = new d("GPSDestLatitude", 20, 5);
        d dVar275 = r1;
        d dVar276 = new d("GPSDestLongitudeRef", 21, 2);
        d dVar277 = r1;
        d dVar278 = new d("GPSDestLongitude", 22, 5);
        d dVar279 = r1;
        d dVar280 = new d("GPSDestBearingRef", 23, 2);
        d dVar281 = r1;
        d dVar282 = new d("GPSDestBearing", 24, 5);
        d dVar283 = r1;
        d dVar284 = new d("GPSDestDistanceRef", 25, 2);
        d dVar285 = r1;
        d dVar286 = new d("GPSDestDistance", 26, 5);
        d dVar287 = r1;
        d dVar288 = new d("GPSProcessingMethod", 27, 7);
        d dVar289 = r1;
        d dVar290 = new d("GPSAreaInformation", 28, 7);
        d dVar291 = r1;
        d dVar292 = new d("GPSDateStamp", 29, 2);
        d dVar293 = r1;
        d dVar294 = new d("GPSDifferential", 30, 3);
        d dVar295 = r1;
        d dVar296 = new d("GPSHPositioningError", 31, 5);
        d[] dVarArr2 = {dVar233, dVar235, dVar237, dVar239, dVar241, dVar243, dVar245, dVar247, dVar249, dVar251, dVar253, dVar255, dVar257, dVar259, dVar261, dVar263, dVar265, dVar267, dVar269, dVar271, dVar273, dVar275, dVar277, dVar279, dVar281, dVar283, dVar285, dVar287, dVar289, dVar291, dVar293, dVar295};
        d[] dVarArr3 = {new d("InteroperabilityIndex", 1, 2)};
        d dVar297 = r1;
        d dVar298 = new d("NewSubfileType", 254, 4);
        d dVar299 = r1;
        d dVar300 = new d("SubfileType", 255, 4);
        d dVar301 = r1;
        d dVar302 = new d("ThumbnailImageWidth", 256, 3, 4);
        d dVar303 = r1;
        d dVar304 = new d("ThumbnailImageLength", 257, 3, 4);
        d dVar305 = r1;
        d dVar306 = new d("BitsPerSample", 258, 3);
        d dVar307 = r1;
        d dVar308 = new d("Compression", 259, 3);
        d dVar309 = r1;
        d dVar310 = new d("PhotometricInterpretation", 262, 3);
        d dVar311 = r1;
        d dVar312 = new d("ImageDescription", 270, 2);
        d dVar313 = r1;
        d dVar314 = new d("Make", 271, 2);
        d dVar315 = r0;
        d dVar316 = new d("Model", 272, 2);
        d dVar317 = r0;
        d dVar318 = new d("StripOffsets", 273, 3, 4);
        d dVar319 = r0;
        d dVar320 = new d("ThumbnailOrientation", 274, 3);
        d dVar321 = r0;
        d dVar322 = new d("SamplesPerPixel", 277, 3);
        d dVar323 = r0;
        d dVar324 = new d("RowsPerStrip", 278, 3, 4);
        d dVar325 = r0;
        d dVar326 = new d("StripByteCounts", 279, 3, 4);
        d dVar327 = r0;
        d dVar328 = new d("XResolution", 282, 5);
        d dVar329 = r0;
        d dVar330 = new d("YResolution", 283, 5);
        d dVar331 = r0;
        d dVar332 = new d("PlanarConfiguration", 284, 3);
        d dVar333 = r0;
        d dVar334 = new d("ResolutionUnit", 296, 3);
        d dVar335 = r0;
        d dVar336 = new d("TransferFunction", 301, 3);
        d dVar337 = r0;
        d dVar338 = new d("Software", 305, 2);
        d dVar339 = r0;
        d dVar340 = new d("DateTime", 306, 2);
        d dVar341 = r0;
        d dVar342 = new d("Artist", 315, 2);
        d dVar343 = r0;
        d dVar344 = new d("WhitePoint", 318, 5);
        d dVar345 = r0;
        d dVar346 = new d("PrimaryChromaticities", 319, 5);
        d dVar347 = r0;
        d dVar348 = new d("SubIFDPointer", 330, 4);
        d dVar349 = r0;
        d dVar350 = new d("JPEGInterchangeFormat", 513, 4);
        d dVar351 = r0;
        d dVar352 = new d("JPEGInterchangeFormatLength", 514, 4);
        d dVar353 = r0;
        d dVar354 = new d("YCbCrCoefficients", 529, 5);
        d dVar355 = r0;
        d dVar356 = new d("YCbCrSubSampling", 530, 3);
        d dVar357 = r0;
        d dVar358 = new d("YCbCrPositioning", 531, 3);
        d dVar359 = r0;
        d dVar360 = new d("ReferenceBlackWhite", 532, 5);
        d dVar361 = r0;
        d dVar362 = new d("Copyright", 33432, 2);
        d dVar363 = r0;
        d dVar364 = new d("ExifIFDPointer", 34665, 4);
        d dVar365 = r0;
        String str = "GPSInfoIFDPointer";
        d dVar366 = new d(str, 34853, 4);
        d dVar367 = r0;
        d dVar368 = new d("DNGVersion", 50706, 1);
        d dVar369 = r0;
        d dVar370 = new d("DefaultCropSize", 50720, 3, 4);
        f4143H = new d[][]{dVarArr, new d[]{dVar85, dVar87, dVar89, dVar91, dVar93, dVar95, dVar97, dVar99, dVar101, dVar103, dVar105, dVar107, dVar109, dVar111, dVar113, dVar115, dVar117, dVar119, dVar121, dVar123, dVar125, dVar127, dVar129, dVar131, dVar133, dVar135, dVar137, dVar139, dVar141, dVar143, dVar145, dVar147, dVar149, dVar151, dVar153, dVar155, dVar157, dVar159, dVar161, dVar163, dVar165, dVar167, dVar169, dVar171, dVar173, dVar175, dVar177, dVar179, dVar181, dVar183, dVar185, dVar187, dVar189, dVar191, dVar193, dVar195, dVar197, dVar199, dVar201, dVar203, dVar205, dVar207, dVar209, dVar211, dVar213, dVar215, dVar217, dVar219, dVar221, dVar223, dVar225, dVar227, dVar229, dVar231}, dVarArr2, dVarArr3, new d[]{dVar297, dVar299, dVar301, dVar303, dVar305, dVar307, dVar309, dVar311, dVar313, dVar315, dVar317, dVar319, dVar321, dVar323, dVar325, dVar327, dVar329, dVar331, dVar333, dVar335, dVar337, dVar339, dVar341, dVar343, dVar345, dVar347, dVar349, dVar351, dVar353, dVar355, dVar357, dVar359, dVar361, dVar363, dVar365, dVar367, dVar369}, dVarArr, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        f4144I = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d(str, 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        Charset forName = Charset.forName("US-ASCII");
        f4149N = forName;
        f4150O = "Exif\u0000\u0000".getBytes(forName);
        f4151P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            d[][] dVarArr4 = f4143H;
            if (i2 < dVarArr4.length) {
                f4145J[i2] = new HashMap();
                f4146K[i2] = new HashMap();
                for (d dVar371 : dVarArr4[i2]) {
                    f4145J[i2].put(Integer.valueOf(dVar371.f4132a), dVar371);
                    f4146K[i2].put(dVar371.f4133b, dVar371);
                }
                i2++;
            } else {
                HashMap hashMap = f4148M;
                d[] dVarArr5 = f4144I;
                hashMap.put(Integer.valueOf(dVarArr5[0].f4132a), 5);
                hashMap.put(Integer.valueOf(dVarArr5[1].f4132a), 1);
                hashMap.put(Integer.valueOf(dVarArr5[2].f4132a), 2);
                hashMap.put(Integer.valueOf(dVarArr5[3].f4132a), 3);
                hashMap.put(Integer.valueOf(dVarArr5[4].f4132a), 7);
                hashMap.put(Integer.valueOf(dVarArr5[5].f4132a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(java.io.InputStream r10) {
        /*
            r9 = this;
            r9.<init>()
            X.d[][] r0 = f4143H
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r9.d = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r2 = r0.length
            r1.<init>(r2)
            r9.f4170e = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.f4171f = r1
            boolean r1 = r10 instanceof android.content.res.AssetManager.AssetInputStream
            r2 = 0
            boolean r3 = f4152l
            java.lang.String r4 = "ExifInterface"
            if (r1 == 0) goto L_0x0027
            r1 = r10
            android.content.res.AssetManager$AssetInputStream r1 = (android.content.res.AssetManager.AssetInputStream) r1
            r9.f4168b = r1
            r9.f4167a = r2
            goto L_0x004d
        L_0x0027:
            boolean r1 = r10 instanceof java.io.FileInputStream
            if (r1 == 0) goto L_0x0049
            r1 = r10
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1
            java.io.FileDescriptor r5 = r1.getFD()
            int r6 = android.system.OsConstants.SEEK_CUR     // Catch:{ Exception -> 0x0042 }
            r7 = 0
            X.h.c(r5, r7, r6)     // Catch:{ Exception -> 0x0042 }
            r9.f4168b = r2
            java.io.FileDescriptor r1 = r1.getFD()
            r9.f4167a = r1
            goto L_0x004d
        L_0x0042:
            if (r3 == 0) goto L_0x0049
            java.lang.String r1 = "The file descriptor for the given input is not seekable"
            android.util.Log.d(r4, r1)
        L_0x0049:
            r9.f4168b = r2
            r9.f4167a = r2
        L_0x004d:
            r1 = 0
            r2 = r1
        L_0x004f:
            int r5 = r0.length     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            if (r2 >= r5) goto L_0x0067
            java.util.HashMap[] r5 = r9.d     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            r6.<init>()     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            r5[r2] = r6     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            int r2 = r2 + 1
            goto L_0x004f
        L_0x005e:
            r10 = move-exception
            goto L_0x00de
        L_0x0061:
            r10 = move-exception
            goto L_0x00d6
        L_0x0064:
            r10 = move-exception
            goto L_0x00d6
        L_0x0067:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            r2 = 5000(0x1388, float:7.006E-42)
            r0.<init>(r10, r2)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            int r10 = r9.f(r0)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            r9.f4169c = r10     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            r2 = 14
            r5 = 13
            r6 = 9
            r7 = 4
            if (r10 == r7) goto L_0x00af
            if (r10 == r6) goto L_0x00af
            if (r10 == r5) goto L_0x00af
            if (r10 != r2) goto L_0x0084
            goto L_0x00af
        L_0x0084:
            X.f r10 = new X.f     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            r10.<init>((java.io.InputStream) r0)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            int r0 = r9.f4169c     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            r1 = 12
            if (r0 != r1) goto L_0x0093
            r9.d(r10)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            goto L_0x00a5
        L_0x0093:
            r1 = 7
            if (r0 != r1) goto L_0x009a
            r9.g(r10)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            goto L_0x00a5
        L_0x009a:
            r1 = 10
            if (r0 != r1) goto L_0x00a2
            r9.k(r10)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            goto L_0x00a5
        L_0x00a2:
            r9.j(r10)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
        L_0x00a5:
            int r0 = r9.h     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            r10.d(r0)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            r9.u(r10)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            goto L_0x00cd
        L_0x00af:
            X.b r10 = new X.b     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            r10.<init>((java.io.InputStream) r0)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            int r0 = r9.f4169c     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            if (r0 != r7) goto L_0x00bc
            r9.e(r10, r1, r1)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            goto L_0x00cd
        L_0x00bc:
            if (r0 != r5) goto L_0x00c2
            r9.h(r10)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            goto L_0x00cd
        L_0x00c2:
            if (r0 != r6) goto L_0x00c8
            r9.i(r10)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
            goto L_0x00cd
        L_0x00c8:
            if (r0 != r2) goto L_0x00cd
            r9.l(r10)     // Catch:{ IOException -> 0x0064, UnsupportedOperationException -> 0x0061 }
        L_0x00cd:
            r9.a()
            if (r3 == 0) goto L_0x00ed
        L_0x00d2:
            r9.p()
            goto L_0x00ed
        L_0x00d6:
            if (r3 == 0) goto L_0x00e7
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r4, r0, r10)     // Catch:{ all -> 0x005e }
            goto L_0x00e7
        L_0x00de:
            r9.a()
            if (r3 == 0) goto L_0x00e6
            r9.p()
        L_0x00e6:
            throw r10
        L_0x00e7:
            r9.a()
            if (r3 == 0) goto L_0x00ed
            goto L_0x00d2
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.g.<init>(java.io.InputStream):void");
    }

    public static ByteOrder q(b bVar) {
        short readShort = bVar.readShort();
        boolean z3 = f4152l;
        if (readShort == 18761) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    public final void a() {
        String b6 = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.d;
        if (b6 != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b6.concat("\u0000").getBytes(f4149N);
            hashMap.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", c.a(0, this.f4171f));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", c.a(0, this.f4171f));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", c.a(0, this.f4171f));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", c.a(0, this.f4171f));
        }
    }

    public final String b(String str) {
        c c3 = c(str);
        if (c3 != null) {
            if (!f4147L.contains(str)) {
                return c3.f(this.f4171f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = c3.f4129a;
                if (i2 == 5 || i2 == 10) {
                    e[] eVarArr = (e[]) c3.g(this.f4171f);
                    if (eVarArr == null || eVarArr.length != 3) {
                        Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                        return null;
                    }
                    e eVar = eVarArr[0];
                    Integer valueOf = Integer.valueOf((int) (((float) eVar.f4135a) / ((float) eVar.f4136b)));
                    e eVar2 = eVarArr[1];
                    Integer valueOf2 = Integer.valueOf((int) (((float) eVar2.f4135a) / ((float) eVar2.f4136b)));
                    e eVar3 = eVarArr[2];
                    return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) eVar3.f4135a) / ((float) eVar3.f4136b)))});
                }
                Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i2);
                return null;
            }
            try {
                return Double.toString(c3.d(this.f4171f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f4152l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < f4143H.length; i2++) {
            c cVar = (c) this.d[i2].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:48|49|50) */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0125, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0126, code lost:
        r2.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0129, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0048, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x011e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(X.f r14) {
        /*
            r13 = this;
            java.lang.String r0 = "yes"
            java.lang.String r1 = "Heif meta: "
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L_0x012a
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            X.a r3 = new X.a     // Catch:{ RuntimeException -> 0x011e }
            r3.<init>(r14)     // Catch:{ RuntimeException -> 0x011e }
            X.i.a(r2, r3)     // Catch:{ RuntimeException -> 0x011e }
            r3 = 33
            java.lang.String r3 = r2.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x011e }
            r4 = 34
            java.lang.String r4 = r2.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x011e }
            r5 = 26
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x011e }
            r6 = 17
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch:{ RuntimeException -> 0x011e }
            boolean r5 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x011e }
            if (r5 == 0) goto L_0x004b
            r0 = 29
            java.lang.String r0 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x011e }
            r5 = 30
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x011e }
            r6 = 31
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch:{ RuntimeException -> 0x011e }
            goto L_0x0067
        L_0x0048:
            r14 = move-exception
            goto L_0x0126
        L_0x004b:
            boolean r0 = r0.equals(r6)     // Catch:{ RuntimeException -> 0x011e }
            if (r0 == 0) goto L_0x0064
            r0 = 18
            java.lang.String r0 = r2.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x011e }
            r5 = 19
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x011e }
            r6 = 24
            java.lang.String r6 = r2.extractMetadata(r6)     // Catch:{ RuntimeException -> 0x011e }
            goto L_0x0067
        L_0x0064:
            r0 = 0
            r5 = r0
            r6 = r5
        L_0x0067:
            java.util.HashMap[] r7 = r13.d
            r8 = 0
            if (r0 == 0) goto L_0x007d
            r9 = r7[r8]     // Catch:{ RuntimeException -> 0x011e }
            java.lang.String r10 = "ImageWidth"
            int r11 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x011e }
            java.nio.ByteOrder r12 = r13.f4171f     // Catch:{ RuntimeException -> 0x011e }
            X.c r11 = X.c.c(r11, r12)     // Catch:{ RuntimeException -> 0x011e }
            r9.put(r10, r11)     // Catch:{ RuntimeException -> 0x011e }
        L_0x007d:
            if (r5 == 0) goto L_0x0090
            r9 = r7[r8]     // Catch:{ RuntimeException -> 0x011e }
            java.lang.String r10 = "ImageLength"
            int r11 = java.lang.Integer.parseInt(r5)     // Catch:{ RuntimeException -> 0x011e }
            java.nio.ByteOrder r12 = r13.f4171f     // Catch:{ RuntimeException -> 0x011e }
            X.c r11 = X.c.c(r11, r12)     // Catch:{ RuntimeException -> 0x011e }
            r9.put(r10, r11)     // Catch:{ RuntimeException -> 0x011e }
        L_0x0090:
            r9 = 6
            if (r6 == 0) goto L_0x00b8
            int r10 = java.lang.Integer.parseInt(r6)     // Catch:{ RuntimeException -> 0x011e }
            r11 = 90
            if (r10 == r11) goto L_0x00aa
            r11 = 180(0xb4, float:2.52E-43)
            if (r10 == r11) goto L_0x00a8
            r11 = 270(0x10e, float:3.78E-43)
            if (r10 == r11) goto L_0x00a5
            r10 = 1
            goto L_0x00ab
        L_0x00a5:
            r10 = 8
            goto L_0x00ab
        L_0x00a8:
            r10 = 3
            goto L_0x00ab
        L_0x00aa:
            r10 = r9
        L_0x00ab:
            r7 = r7[r8]     // Catch:{ RuntimeException -> 0x011e }
            java.lang.String r11 = "Orientation"
            java.nio.ByteOrder r12 = r13.f4171f     // Catch:{ RuntimeException -> 0x011e }
            X.c r10 = X.c.c(r10, r12)     // Catch:{ RuntimeException -> 0x011e }
            r7.put(r11, r10)     // Catch:{ RuntimeException -> 0x011e }
        L_0x00b8:
            if (r3 == 0) goto L_0x00f5
            if (r4 == 0) goto L_0x00f5
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x011e }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x011e }
            if (r4 <= r9) goto L_0x00ed
            long r10 = (long) r3     // Catch:{ RuntimeException -> 0x011e }
            r14.d(r10)     // Catch:{ RuntimeException -> 0x011e }
            byte[] r7 = new byte[r9]     // Catch:{ RuntimeException -> 0x011e }
            r14.readFully(r7)     // Catch:{ RuntimeException -> 0x011e }
            int r3 = r3 + r9
            int r4 = r4 + -6
            byte[] r9 = f4150O     // Catch:{ RuntimeException -> 0x011e }
            boolean r7 = java.util.Arrays.equals(r7, r9)     // Catch:{ RuntimeException -> 0x011e }
            if (r7 == 0) goto L_0x00e5
            byte[] r4 = new byte[r4]     // Catch:{ RuntimeException -> 0x011e }
            r14.readFully(r4)     // Catch:{ RuntimeException -> 0x011e }
            r13.h = r3     // Catch:{ RuntimeException -> 0x011e }
            r13.r(r4, r8)     // Catch:{ RuntimeException -> 0x011e }
            goto L_0x00f5
        L_0x00e5:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ RuntimeException -> 0x011e }
            java.lang.String r0 = "Invalid identifier"
            r14.<init>(r0)     // Catch:{ RuntimeException -> 0x011e }
            throw r14     // Catch:{ RuntimeException -> 0x011e }
        L_0x00ed:
            java.io.IOException r14 = new java.io.IOException     // Catch:{ RuntimeException -> 0x011e }
            java.lang.String r0 = "Invalid exif length"
            r14.<init>(r0)     // Catch:{ RuntimeException -> 0x011e }
            throw r14     // Catch:{ RuntimeException -> 0x011e }
        L_0x00f5:
            boolean r14 = f4152l     // Catch:{ RuntimeException -> 0x011e }
            if (r14 == 0) goto L_0x011a
            java.lang.String r14 = "ExifInterface"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x011e }
            r3.<init>(r1)     // Catch:{ RuntimeException -> 0x011e }
            r3.append(r0)     // Catch:{ RuntimeException -> 0x011e }
            java.lang.String r0 = "x"
            r3.append(r0)     // Catch:{ RuntimeException -> 0x011e }
            r3.append(r5)     // Catch:{ RuntimeException -> 0x011e }
            java.lang.String r0 = ", rotation "
            r3.append(r0)     // Catch:{ RuntimeException -> 0x011e }
            r3.append(r6)     // Catch:{ RuntimeException -> 0x011e }
            java.lang.String r0 = r3.toString()     // Catch:{ RuntimeException -> 0x011e }
            android.util.Log.d(r14, r0)     // Catch:{ RuntimeException -> 0x011e }
        L_0x011a:
            r2.release()
            return
        L_0x011e:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r14.<init>(r0)     // Catch:{ all -> 0x0048 }
            throw r14     // Catch:{ all -> 0x0048 }
        L_0x0126:
            r2.release()
            throw r14
        L_0x012a:
            java.lang.UnsupportedOperationException r14 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.g.d(X.f):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(X.b r23, int r24, int r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r25
            java.lang.String r3 = "ExifInterface"
            boolean r4 = f4152l
            if (r4 == 0) goto L_0x001d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "getJpegAttributes starting with: "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            android.util.Log.d(r3, r5)
        L_0x001d:
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f4127c = r5
            byte r5 = r23.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r5 != r7) goto L_0x01ce
            byte r8 = r23.readByte()
            r9 = -40
            if (r8 != r9) goto L_0x01b6
            r5 = 2
            r6 = r5
        L_0x0034:
            byte r8 = r23.readByte()
            if (r8 != r7) goto L_0x019c
            byte r8 = r23.readByte()
            if (r4 == 0) goto L_0x0057
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Found JPEG segment indicator: "
            r9.<init>(r10)
            r10 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r3, r9)
        L_0x0057:
            r9 = -39
            if (r8 == r9) goto L_0x0197
            r9 = -38
            if (r8 != r9) goto L_0x0061
            goto L_0x0197
        L_0x0061:
            int r9 = r23.readUnsignedShort()
            int r10 = r9 + -2
            r11 = 4
            int r6 = r6 + r11
            if (r4 == 0) goto L_0x008f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "JPEG segment: "
            r12.<init>(r13)
            r13 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r13 = java.lang.Integer.toHexString(r13)
            r12.append(r13)
            java.lang.String r13 = " (length: "
            r12.append(r13)
            r12.append(r9)
            java.lang.String r13 = ")"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.d(r3, r12)
        L_0x008f:
            java.lang.String r12 = "Invalid length"
            if (r10 < 0) goto L_0x0191
            java.util.HashMap[] r13 = r0.d
            r14 = 0
            r15 = -31
            if (r8 == r15) goto L_0x010d
            r15 = -2
            r7 = 1
            if (r8 == r15) goto L_0x00e1
            switch(r8) {
                case -64: goto L_0x00ac;
                case -63: goto L_0x00ac;
                case -62: goto L_0x00ac;
                case -61: goto L_0x00ac;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            switch(r8) {
                case -59: goto L_0x00ac;
                case -58: goto L_0x00ac;
                case -57: goto L_0x00ac;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            switch(r8) {
                case -55: goto L_0x00ac;
                case -54: goto L_0x00ac;
                case -53: goto L_0x00ac;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            switch(r8) {
                case -51: goto L_0x00ac;
                case -50: goto L_0x00ac;
                case -49: goto L_0x00ac;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            goto L_0x0181
        L_0x00ac:
            r1.c(r7)
            r7 = r13[r2]
            if (r2 == r11) goto L_0x00b6
            java.lang.String r8 = "ImageLength"
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r8 = "ThumbnailImageLength"
        L_0x00b8:
            int r10 = r23.readUnsignedShort()
            long r14 = (long) r10
            java.nio.ByteOrder r10 = r0.f4171f
            X.c r10 = X.c.a(r14, r10)
            r7.put(r8, r10)
            r7 = r13[r2]
            if (r2 == r11) goto L_0x00cd
            java.lang.String r8 = "ImageWidth"
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r8 = "ThumbnailImageWidth"
        L_0x00cf:
            int r10 = r23.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r13 = r0.f4171f
            X.c r10 = X.c.a(r10, r13)
            r7.put(r8, r10)
            int r10 = r9 + -7
            goto L_0x0181
        L_0x00e1:
            byte[] r8 = new byte[r10]
            r1.readFully(r8)
            java.lang.String r9 = "UserComment"
            java.lang.String r10 = r0.b(r9)
            if (r10 != 0) goto L_0x010a
            r7 = r13[r7]
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = f4149N
            r10.<init>(r8, r11)
            java.lang.String r8 = "\u0000"
            java.lang.String r8 = r10.concat(r8)
            byte[] r8 = r8.getBytes(r11)
            X.c r10 = new X.c
            int r11 = r8.length
            r10.<init>(r8, r5, r11)
            r7.put(r9, r10)
        L_0x010a:
            r10 = r14
            goto L_0x0181
        L_0x010d:
            byte[] r7 = new byte[r10]
            r1.readFully(r7)
            int r8 = r6 + r10
            byte[] r9 = f4150O
            if (r9 != 0) goto L_0x0119
            goto L_0x0127
        L_0x0119:
            int r11 = r9.length
            if (r10 >= r11) goto L_0x011d
            goto L_0x0127
        L_0x011d:
            r11 = r14
        L_0x011e:
            int r15 = r9.length
            if (r11 >= r15) goto L_0x0169
            byte r15 = r7[r11]
            byte r5 = r9[r11]
            if (r15 == r5) goto L_0x0164
        L_0x0127:
            byte[] r5 = f4151P
            if (r5 != 0) goto L_0x012c
            goto L_0x017f
        L_0x012c:
            int r9 = r5.length
            if (r10 >= r9) goto L_0x0130
            goto L_0x017f
        L_0x0130:
            r9 = r14
        L_0x0131:
            int r11 = r5.length
            if (r9 >= r11) goto L_0x013e
            byte r11 = r7[r9]
            byte r15 = r5[r9]
            if (r11 == r15) goto L_0x013b
            goto L_0x017f
        L_0x013b:
            int r9 = r9 + 1
            goto L_0x0131
        L_0x013e:
            int r9 = r5.length
            int r6 = r6 + r9
            int r5 = r5.length
            byte[] r5 = java.util.Arrays.copyOfRange(r7, r5, r10)
            java.lang.String r7 = "Xmp"
            java.lang.String r9 = r0.b(r7)
            if (r9 != 0) goto L_0x017f
            r9 = r13[r14]
            X.c r10 = new X.c
            int r11 = r5.length
            long r14 = (long) r6
            r20 = 1
            r16 = r10
            r17 = r14
            r19 = r5
            r21 = r11
            r16.<init>(r17, r19, r20, r21)
            r9.put(r7, r10)
            goto L_0x017f
        L_0x0164:
            int r11 = r11 + 1
            r5 = 2
            r14 = 0
            goto L_0x011e
        L_0x0169:
            int r5 = r9.length
            byte[] r5 = java.util.Arrays.copyOfRange(r7, r5, r10)
            int r6 = r24 + r6
            int r7 = r9.length
            int r6 = r6 + r7
            r0.h = r6
            r0.r(r5, r2)
            X.b r6 = new X.b
            r6.<init>((byte[]) r5)
            r0.u(r6)
        L_0x017f:
            r6 = r8
            r10 = 0
        L_0x0181:
            if (r10 < 0) goto L_0x018b
            r1.c(r10)
            int r6 = r6 + r10
            r5 = 2
            r7 = -1
            goto L_0x0034
        L_0x018b:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L_0x0191:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r12)
            throw r1
        L_0x0197:
            java.nio.ByteOrder r2 = r0.f4171f
            r1.f4127c = r2
            return
        L_0x019c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid marker:"
            r2.<init>(r3)
            r3 = r8 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01b6:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01ce:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.g.e(X.b, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bb, code lost:
        if (r8 == null) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x012b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b4 A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00f5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f7 A[SYNTHETIC, Splitter:B:89:0x00f7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(java.io.BufferedInputStream r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = 5000(0x1388, float:7.006E-42)
            r0.mark(r2)
            byte[] r3 = new byte[r2]
            r0.read(r3)
            r18.reset()
            r4 = 0
            r0 = r4
        L_0x0013:
            byte[] r5 = f4157q
            int r6 = r5.length
            r7 = 4
            if (r0 >= r6) goto L_0x0181
            byte r6 = r3[r0]
            byte r5 = r5[r0]
            if (r6 == r5) goto L_0x017d
            java.lang.String r0 = "FUJIFILMCCD-RAW"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()
            byte[] r0 = r0.getBytes(r5)
            r5 = r4
        L_0x002a:
            int r6 = r0.length
            if (r5 >= r6) goto L_0x017a
            byte r6 = r3[r5]
            byte r8 = r0[r5]
            if (r6 == r8) goto L_0x0176
            X.b r8 = new X.b     // Catch:{ Exception -> 0x00ae, all -> 0x00aa }
            r8.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00ae, all -> 0x00aa }
            int r0 = r8.readInt()     // Catch:{ Exception -> 0x0066 }
            long r9 = (long) r0     // Catch:{ Exception -> 0x0066 }
            byte[] r0 = new byte[r7]     // Catch:{ Exception -> 0x0066 }
            r8.readFully(r0)     // Catch:{ Exception -> 0x0066 }
            byte[] r11 = f4158r     // Catch:{ Exception -> 0x0066 }
            boolean r0 = java.util.Arrays.equals(r0, r11)     // Catch:{ Exception -> 0x0066 }
            if (r0 != 0) goto L_0x004f
        L_0x004a:
            r8.close()
            goto L_0x00be
        L_0x004f:
            r11 = 1
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r13 = 8
            if (r0 != 0) goto L_0x0068
            long r9 = r8.readLong()     // Catch:{ Exception -> 0x0066 }
            r15 = 16
            int r0 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0069
            goto L_0x004a
        L_0x0062:
            r0 = move-exception
            r6 = r8
            goto L_0x0170
        L_0x0066:
            r0 = move-exception
            goto L_0x00b0
        L_0x0068:
            r15 = r13
        L_0x0069:
            long r5 = (long) r2     // Catch:{ Exception -> 0x0066 }
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x006f
            r9 = r5
        L_0x006f:
            long r9 = r9 - r15
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            goto L_0x004a
        L_0x0075:
            byte[] r0 = new byte[r7]     // Catch:{ Exception -> 0x0066 }
            r5 = 0
            r2 = r4
            r13 = r2
        L_0x007b:
            r14 = 4
            long r14 = r9 / r14
            int r14 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x004a
            r8.readFully(r0)     // Catch:{ EOFException -> 0x004a }
            int r14 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r14 != 0) goto L_0x008b
            goto L_0x00a8
        L_0x008b:
            byte[] r14 = f4159s     // Catch:{ Exception -> 0x0066 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x0066 }
            if (r14 == 0) goto L_0x0095
            r2 = 1
            goto L_0x009e
        L_0x0095:
            byte[] r14 = f4160t     // Catch:{ Exception -> 0x0066 }
            boolean r14 = java.util.Arrays.equals(r0, r14)     // Catch:{ Exception -> 0x0066 }
            if (r14 == 0) goto L_0x009e
            r13 = 1
        L_0x009e:
            if (r2 == 0) goto L_0x00a8
            if (r13 == 0) goto L_0x00a8
            r8.close()
            r0 = 12
            return r0
        L_0x00a8:
            long r5 = r5 + r11
            goto L_0x007b
        L_0x00aa:
            r0 = move-exception
            r6 = 0
            goto L_0x0170
        L_0x00ae:
            r0 = move-exception
            r8 = 0
        L_0x00b0:
            boolean r2 = f4152l     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x00bb
            java.lang.String r2 = "ExifInterface"
            java.lang.String r5 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r5, r0)     // Catch:{ all -> 0x0062 }
        L_0x00bb:
            if (r8 == 0) goto L_0x00be
            goto L_0x004a
        L_0x00be:
            X.b r2 = new X.b     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x00e5, all -> 0x00e2 }
            java.nio.ByteOrder r0 = q(r2)     // Catch:{ Exception -> 0x00ed, all -> 0x00df }
            r1.f4171f = r0     // Catch:{ Exception -> 0x00ed, all -> 0x00df }
            r2.f4127c = r0     // Catch:{ Exception -> 0x00ed, all -> 0x00df }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x00ed, all -> 0x00df }
            r5 = 20306(0x4f52, float:2.8455E-41)
            if (r0 == r5) goto L_0x00da
            r5 = 21330(0x5352, float:2.989E-41)
            if (r0 != r5) goto L_0x00d8
            goto L_0x00da
        L_0x00d8:
            r0 = r4
            goto L_0x00db
        L_0x00da:
            r0 = 1
        L_0x00db:
            r2.close()
            goto L_0x00f3
        L_0x00df:
            r0 = move-exception
            r6 = r2
            goto L_0x00e7
        L_0x00e2:
            r0 = move-exception
            r6 = 0
            goto L_0x00e7
        L_0x00e5:
            r2 = 0
            goto L_0x00ed
        L_0x00e7:
            if (r6 == 0) goto L_0x00ec
            r6.close()
        L_0x00ec:
            throw r0
        L_0x00ed:
            if (r2 == 0) goto L_0x00f2
            r2.close()
        L_0x00f2:
            r0 = r4
        L_0x00f3:
            if (r0 == 0) goto L_0x00f7
            r0 = 7
            return r0
        L_0x00f7:
            X.b r2 = new X.b     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            r2.<init>((byte[]) r3)     // Catch:{ Exception -> 0x011b, all -> 0x0118 }
            java.nio.ByteOrder r0 = q(r2)     // Catch:{ Exception -> 0x0116, all -> 0x0113 }
            r1.f4171f = r0     // Catch:{ Exception -> 0x0116, all -> 0x0113 }
            r2.f4127c = r0     // Catch:{ Exception -> 0x0116, all -> 0x0113 }
            short r0 = r2.readShort()     // Catch:{ Exception -> 0x0116, all -> 0x0113 }
            r5 = 85
            if (r0 != r5) goto L_0x010e
            r0 = 1
            goto L_0x010f
        L_0x010e:
            r0 = r4
        L_0x010f:
            r2.close()
            goto L_0x0129
        L_0x0113:
            r0 = move-exception
            r6 = r2
            goto L_0x011d
        L_0x0116:
            r6 = r2
            goto L_0x0123
        L_0x0118:
            r0 = move-exception
            r6 = 0
            goto L_0x011d
        L_0x011b:
            r6 = 0
            goto L_0x0123
        L_0x011d:
            if (r6 == 0) goto L_0x0122
            r6.close()
        L_0x0122:
            throw r0
        L_0x0123:
            if (r6 == 0) goto L_0x0128
            r6.close()
        L_0x0128:
            r0 = r4
        L_0x0129:
            if (r0 == 0) goto L_0x012e
            r0 = 10
            return r0
        L_0x012e:
            r0 = r4
        L_0x012f:
            byte[] r2 = f4163w
            int r5 = r2.length
            if (r0 >= r5) goto L_0x013f
            byte r5 = r3[r0]
            byte r2 = r2[r0]
            if (r5 == r2) goto L_0x013c
            r0 = r4
            goto L_0x0140
        L_0x013c:
            int r0 = r0 + 1
            goto L_0x012f
        L_0x013f:
            r0 = 1
        L_0x0140:
            if (r0 == 0) goto L_0x0145
            r0 = 13
            return r0
        L_0x0145:
            r0 = r4
        L_0x0146:
            byte[] r2 = f4137A
            int r5 = r2.length
            if (r0 >= r5) goto L_0x0156
            byte r5 = r3[r0]
            byte r2 = r2[r0]
            if (r5 == r2) goto L_0x0153
        L_0x0151:
            r5 = r4
            goto L_0x016a
        L_0x0153:
            int r0 = r0 + 1
            goto L_0x0146
        L_0x0156:
            r0 = r4
        L_0x0157:
            byte[] r5 = f4138B
            int r6 = r5.length
            if (r0 >= r6) goto L_0x0169
            int r6 = r2.length
            int r6 = r6 + r0
            int r6 = r6 + r7
            byte r6 = r3[r6]
            byte r5 = r5[r0]
            if (r6 == r5) goto L_0x0166
            goto L_0x0151
        L_0x0166:
            int r0 = r0 + 1
            goto L_0x0157
        L_0x0169:
            r5 = 1
        L_0x016a:
            if (r5 == 0) goto L_0x016f
            r0 = 14
            return r0
        L_0x016f:
            return r4
        L_0x0170:
            if (r6 == 0) goto L_0x0175
            r6.close()
        L_0x0175:
            throw r0
        L_0x0176:
            int r5 = r5 + 1
            goto L_0x002a
        L_0x017a:
            r0 = 9
            return r0
        L_0x017d:
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0181:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.g.f(java.io.BufferedInputStream):int");
    }

    public final void g(f fVar) {
        int i2;
        int i5;
        j(fVar);
        HashMap[] hashMapArr = this.d;
        c cVar = (c) hashMapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.d);
            fVar2.f4127c = this.f4171f;
            byte[] bArr = f4161u;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.d(0);
            byte[] bArr3 = f4162v;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.d(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.d(12);
            }
            s(fVar2, 6);
            c cVar2 = (c) hashMapArr[7].get("PreviewImageStart");
            c cVar3 = (c) hashMapArr[7].get("PreviewImageLength");
            if (!(cVar2 == null || cVar3 == null)) {
                hashMapArr[5].put("JPEGInterchangeFormat", cVar2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) hashMapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f4171f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i6 = iArr[2];
                int i7 = iArr[0];
                if (i6 > i7 && (i2 = iArr[3]) > (i5 = iArr[1])) {
                    int i8 = (i6 - i7) + 1;
                    int i9 = (i2 - i5) + 1;
                    if (i8 < i9) {
                        int i10 = i8 + i9;
                        i9 = i10 - i9;
                        i8 = i10 - i9;
                    }
                    c c3 = c.c(i8, this.f4171f);
                    c c6 = c.c(i9, this.f4171f);
                    hashMapArr[0].put("ImageWidth", c3);
                    hashMapArr[0].put("ImageLength", c6);
                }
            }
        }
    }

    public final void h(b bVar) {
        if (f4152l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f4127c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f4163w;
        bVar.c(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i2 = length + 8;
                if (i2 == 16) {
                    if (!Arrays.equals(bArr2, f4165y)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                }
                if (!Arrays.equals(bArr2, f4166z)) {
                    if (Arrays.equals(bArr2, f4164x)) {
                        byte[] bArr3 = new byte[readInt];
                        bVar.readFully(bArr3);
                        int readInt2 = bVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr2);
                        crc32.update(bArr3);
                        if (((int) crc32.getValue()) == readInt2) {
                            this.h = i2;
                            r(bArr3, 0);
                            x();
                            u(new b(bArr3));
                            return;
                        }
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                    int i5 = readInt + 4;
                    bVar.c(i5);
                    length = i2 + i5;
                } else {
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) {
        boolean z3 = f4152l;
        if (z3) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.c(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i5 = ByteBuffer.wrap(bArr2).getInt();
        int i6 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i5];
        bVar.c(i2 - bVar.f4126b);
        bVar.readFully(bArr4);
        e(new b(bArr4), i2, 5);
        bVar.c(i6 - bVar.f4126b);
        bVar.f4127c = ByteOrder.BIG_ENDIAN;
        int readInt = bVar.readInt();
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i7 = 0; i7 < readInt; i7++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f4142G.f4132a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                c c3 = c.c(readShort, this.f4171f);
                c c6 = c.c(readShort2, this.f4171f);
                HashMap[] hashMapArr = this.d;
                hashMapArr[0].put("ImageLength", c3);
                hashMapArr[0].put("ImageWidth", c6);
                if (z3) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.c(readUnsignedShort2);
        }
    }

    public final void j(f fVar) {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f4169c == 8) {
            HashMap[] hashMapArr = this.d;
            c cVar = (c) hashMapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.d);
                fVar2.f4127c = this.f4171f;
                fVar2.c(6);
                s(fVar2, 9);
                c cVar2 = (c) hashMapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    hashMapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) {
        if (f4152l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] hashMapArr = this.d;
        c cVar = (c) hashMapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.d), (int) cVar.f4131c, 5);
        }
        c cVar2 = (c) hashMapArr[0].get("ISO");
        c cVar3 = (c) hashMapArr[1].get("PhotographicSensitivity");
        if (cVar2 != null && cVar3 == null) {
            hashMapArr[1].put("PhotographicSensitivity", cVar2);
        }
    }

    public final void l(b bVar) {
        if (f4152l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f4127c = ByteOrder.LITTLE_ENDIAN;
        bVar.c(f4137A.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f4138B;
        bVar.c(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i2 = length + 8;
                if (Arrays.equals(f4139C, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.h = i2;
                    r(bArr3, 0);
                    u(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i2 + readInt2;
                if (length != readInt) {
                    if (length <= readInt) {
                        bVar.c(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int e6 = cVar.e(this.f4171f);
            int e7 = cVar2.e(this.f4171f);
            if (this.f4169c == 7) {
                e6 += this.f4172i;
            }
            if (e6 > 0 && e7 > 0 && this.f4168b == null && this.f4167a == null) {
                bVar.c(e6);
                bVar.readFully(new byte[e7]);
            }
            if (f4152l) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e6 + ", length: " + e7);
            }
        }
    }

    public final boolean n(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        int e6 = cVar.e(this.f4171f);
        int e7 = cVar2.e(this.f4171f);
        if (e6 > 512 || e7 > 512) {
            return false;
        }
        return true;
    }

    public final void o(f fVar) {
        ByteOrder q6 = q(fVar);
        this.f4171f = q6;
        fVar.f4127c = q6;
        int readUnsignedShort = fVar.readUnsignedShort();
        int i2 = this.f4169c;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = fVar.readInt();
            if (readInt >= 8) {
                int i5 = readInt - 8;
                if (i5 > 0) {
                    fVar.c(i5);
                    return;
                }
                return;
            }
            throw new IOException(a.f(readInt, "Invalid first Ifd offset: "));
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    public final void p() {
        int i2 = 0;
        while (true) {
            HashMap[] hashMapArr = this.d;
            if (i2 < hashMapArr.length) {
                StringBuilder s6 = C0552a.s(i2, "The size of tag group[", "]: ");
                s6.append(hashMapArr[i2].size());
                Log.d("ExifInterface", s6.toString());
                for (Map.Entry entry : hashMapArr[i2].entrySet()) {
                    c cVar = (c) entry.getValue();
                    Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f4171f) + "'");
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void r(byte[] bArr, int i2) {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(X.f r29, int r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            int r3 = r1.f4126b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.HashSet r4 = r0.f4170e
            r4.add(r3)
            short r3 = r29.readShort()
            boolean r5 = f4152l
            java.lang.String r6 = "ExifInterface"
            if (r5 == 0) goto L_0x002c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "numberOfDirectoryEntry: "
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r6, r7)
        L_0x002c:
            if (r3 > 0) goto L_0x002f
            return
        L_0x002f:
            r8 = 0
        L_0x0030:
            java.util.HashMap[] r9 = r0.d
            if (r8 >= r3) goto L_0x033b
            int r13 = r29.readUnsignedShort()
            int r14 = r29.readUnsignedShort()
            int r15 = r29.readInt()
            int r7 = r1.f4126b
            long r10 = (long) r7
            r18 = 4
            long r10 = r10 + r18
            java.util.HashMap[] r7 = f4145J
            r7 = r7[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            java.lang.Object r7 = r7.get(r12)
            X.d r7 = (X.d) r7
            if (r5 == 0) goto L_0x0084
            java.lang.Integer r12 = java.lang.Integer.valueOf(r30)
            r21 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r22 = r8
            if (r7 == 0) goto L_0x006a
            java.lang.String r8 = r7.f4133b
        L_0x0067:
            r23 = r4
            goto L_0x006c
        L_0x006a:
            r8 = 0
            goto L_0x0067
        L_0x006c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r24 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r3 = new java.lang.Object[]{r12, r3, r8, r4, r9}
            java.lang.String r4 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            android.util.Log.d(r6, r3)
            goto L_0x008c
        L_0x0084:
            r21 = r3
            r23 = r4
            r22 = r8
            r24 = r9
        L_0x008c:
            r8 = 3
            r9 = 7
            if (r7 != 0) goto L_0x00a5
            if (r5 == 0) goto L_0x013f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r4 = "Skip the tag entry since tag number is not defined: "
            r12.<init>(r4)
            r12.append(r13)
            java.lang.String r4 = r12.toString()
            android.util.Log.d(r6, r4)
            goto L_0x013f
        L_0x00a5:
            if (r14 <= 0) goto L_0x012c
            int[] r4 = f4141E
            int r12 = r4.length
            if (r14 < r12) goto L_0x00ae
            goto L_0x012c
        L_0x00ae:
            int r12 = r7.f4134c
            if (r12 == r9) goto L_0x00c7
            if (r14 != r9) goto L_0x00b5
            goto L_0x00c7
        L_0x00b5:
            if (r12 == r14) goto L_0x00c7
            int r9 = r7.d
            if (r9 != r14) goto L_0x00bc
            goto L_0x00c7
        L_0x00bc:
            r3 = 4
            if (r12 == r3) goto L_0x00c5
            if (r9 != r3) goto L_0x00c2
            goto L_0x00c5
        L_0x00c2:
            r3 = 9
            goto L_0x00c9
        L_0x00c5:
            if (r14 != r8) goto L_0x00c2
        L_0x00c7:
            r3 = 7
            goto L_0x00ff
        L_0x00c9:
            if (r12 == r3) goto L_0x00cd
            if (r9 != r3) goto L_0x00d2
        L_0x00cd:
            r3 = 8
            if (r14 != r3) goto L_0x00d2
            goto L_0x00c7
        L_0x00d2:
            r3 = 12
            if (r12 == r3) goto L_0x00d8
            if (r9 != r3) goto L_0x00dd
        L_0x00d8:
            r3 = 11
            if (r14 != r3) goto L_0x00dd
            goto L_0x00c7
        L_0x00dd:
            if (r5 == 0) goto L_0x013f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Skip the tag entry since data format ("
            r3.<init>(r4)
            java.lang.String[] r4 = f4140D
            r4 = r4[r14]
            r3.append(r4)
            java.lang.String r4 = ") is unexpected for tag: "
            r3.append(r4)
            java.lang.String r4 = r7.f4133b
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r6, r3)
            goto L_0x013f
        L_0x00ff:
            if (r14 != r3) goto L_0x0102
            r14 = r12
        L_0x0102:
            long r8 = (long) r15
            r4 = r4[r14]
            long r3 = (long) r4
            long r3 = r3 * r8
            r8 = 0
            int r26 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r26 < 0) goto L_0x0117
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0115
            goto L_0x0117
        L_0x0115:
            r8 = 1
            goto L_0x0142
        L_0x0117:
            if (r5 == 0) goto L_0x012a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r8.<init>(r9)
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r6, r8)
        L_0x012a:
            r8 = 0
            goto L_0x0142
        L_0x012c:
            if (r5 == 0) goto L_0x013f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.<init>(r4)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r6, r3)
        L_0x013f:
            r3 = 0
            goto L_0x012a
        L_0x0142:
            if (r8 != 0) goto L_0x014b
            r1.d(r10)
            r12 = r23
            goto L_0x0333
        L_0x014b:
            int r8 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            java.lang.String r9 = "Compression"
            if (r8 <= 0) goto L_0x01c9
            int r8 = r29.readInt()
            if (r5 == 0) goto L_0x016b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r26 = r10
            java.lang.String r10 = "seek to data offset: "
            r12.<init>(r10)
            r12.append(r8)
            java.lang.String r10 = r12.toString()
            android.util.Log.d(r6, r10)
            goto L_0x016d
        L_0x016b:
            r26 = r10
        L_0x016d:
            int r10 = r0.f4169c
            r11 = 7
            if (r10 != r11) goto L_0x017e
            java.lang.String r10 = r7.f4133b
            java.lang.String r11 = "MakerNote"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x0183
            r0.f4172i = r8
        L_0x017e:
            r25 = r14
            r19 = r15
            goto L_0x01c4
        L_0x0183:
            r10 = 6
            if (r2 != r10) goto L_0x017e
            java.lang.String r11 = r7.f4133b
            java.lang.String r12 = "ThumbnailImage"
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x017e
            r0.f4173j = r8
            r0.f4174k = r15
            java.nio.ByteOrder r11 = r0.f4171f
            X.c r10 = X.c.c(r10, r11)
            int r11 = r0.f4173j
            long r11 = (long) r11
            r19 = r15
            java.nio.ByteOrder r15 = r0.f4171f
            X.c r11 = X.c.a(r11, r15)
            int r12 = r0.f4174k
            r25 = r14
            long r14 = (long) r12
            java.nio.ByteOrder r12 = r0.f4171f
            X.c r12 = X.c.a(r14, r12)
            r14 = 4
            r15 = r24[r14]
            r15.put(r9, r10)
            r10 = r24[r14]
            java.lang.String r15 = "JPEGInterchangeFormat"
            r10.put(r15, r11)
            r10 = r24[r14]
            java.lang.String r11 = "JPEGInterchangeFormatLength"
            r10.put(r11, r12)
        L_0x01c4:
            long r10 = (long) r8
            r1.d(r10)
            goto L_0x01cf
        L_0x01c9:
            r26 = r10
            r25 = r14
            r19 = r15
        L_0x01cf:
            java.util.HashMap r8 = f4148M
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            java.lang.Object r8 = r8.get(r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r5 == 0) goto L_0x01f6
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "nextIfdType: "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r11 = " byteCount: "
            r10.append(r11)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r6, r10)
        L_0x01f6:
            if (r8 == 0) goto L_0x02b9
            r14 = r25
            r10 = 3
            if (r14 == r10) goto L_0x0226
            r3 = 4
            if (r14 == r3) goto L_0x021a
            r3 = 8
            if (r14 == r3) goto L_0x0215
            r3 = 9
            if (r14 == r3) goto L_0x020f
            r3 = 13
            if (r14 == r3) goto L_0x020f
            r3 = -1
            goto L_0x022b
        L_0x020f:
            int r3 = r29.readInt()
        L_0x0213:
            long r3 = (long) r3
            goto L_0x022b
        L_0x0215:
            short r3 = r29.readShort()
            goto L_0x0213
        L_0x021a:
            int r3 = r29.readInt()
            long r3 = (long) r3
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r9
            goto L_0x022b
        L_0x0226:
            int r3 = r29.readUnsignedShort()
            goto L_0x0213
        L_0x022b:
            if (r5 == 0) goto L_0x0240
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            java.lang.String r7 = r7.f4133b
            java.lang.Object[] r7 = new java.lang.Object[]{r9, r7}
            java.lang.String r9 = "Offset: %d, tagName: %s"
            java.lang.String r7 = java.lang.String.format(r9, r7)
            android.util.Log.d(r6, r7)
        L_0x0240:
            r9 = 0
            int r7 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            int r9 = r1.f4128e
            java.lang.String r10 = ")"
            r11 = -1
            if (r7 <= 0) goto L_0x0253
            if (r9 == r11) goto L_0x0256
            long r12 = (long) r9
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x0253
            goto L_0x0256
        L_0x0253:
            r12 = r23
            goto L_0x028f
        L_0x0256:
            int r7 = (int) r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12 = r23
            boolean r7 = r12.contains(r7)
            if (r7 != 0) goto L_0x0270
            r1.d(r3)
            int r3 = r8.intValue()
            r0.s(r1, r3)
        L_0x026d:
            r10 = r26
            goto L_0x02b4
        L_0x0270:
            if (r5 == 0) goto L_0x026d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Skip jump into the IFD since it has already been read: IfdType "
            r7.<init>(r9)
            r7.append(r8)
            java.lang.String r8 = " (at "
            r7.append(r8)
            r7.append(r3)
            r7.append(r10)
            java.lang.String r3 = r7.toString()
            android.util.Log.d(r6, r3)
            goto L_0x026d
        L_0x028f:
            if (r5 == 0) goto L_0x026d
            java.lang.String r7 = "Skip jump into the IFD since its offset is invalid: "
            java.lang.String r3 = h0.C0552a.m(r7, r3)
            if (r9 == r11) goto L_0x02b0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = " (total length: "
            r4.append(r3)
            r4.append(r9)
            r4.append(r10)
            java.lang.String r3 = r4.toString()
        L_0x02b0:
            android.util.Log.d(r6, r3)
            goto L_0x026d
        L_0x02b4:
            r1.d(r10)
            goto L_0x0333
        L_0x02b9:
            r12 = r23
            r14 = r25
            r10 = r26
            int r13 = r1.f4126b
            int r15 = r0.h
            int r13 = r13 + r15
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            X.c r4 = new X.c
            r23 = r9
            long r8 = (long) r13
            r13 = r19
            r15 = r4
            r16 = r8
            r18 = r3
            r19 = r14
            r20 = r13
            r15.<init>(r16, r18, r19, r20)
            r3 = r24[r2]
            java.lang.String r8 = r7.f4133b
            r3.put(r8, r4)
            java.lang.String r3 = r7.f4133b
            java.lang.String r7 = "DNGVersion"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x02f1
            r7 = 3
            r0.f4169c = r7
        L_0x02f1:
            java.lang.String r7 = "Make"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0305
            java.lang.String r7 = "Model"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x0302
            goto L_0x0305
        L_0x0302:
            r7 = r23
            goto L_0x0314
        L_0x0305:
            java.nio.ByteOrder r7 = r0.f4171f
            java.lang.String r7 = r4.f(r7)
            java.lang.String r8 = "PENTAX"
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x0325
            goto L_0x0302
        L_0x0314:
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x0329
            java.nio.ByteOrder r3 = r0.f4171f
            int r3 = r4.e(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r4) goto L_0x0329
        L_0x0325:
            r3 = 8
            r0.f4169c = r3
        L_0x0329:
            int r3 = r1.f4126b
            long r3 = (long) r3
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0333
            r1.d(r10)
        L_0x0333:
            int r8 = r22 + 1
            short r8 = (short) r8
            r4 = r12
            r3 = r21
            goto L_0x0030
        L_0x033b:
            r12 = r4
            r24 = r9
            int r2 = r29.readInt()
            if (r5 == 0) goto L_0x0355
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "nextIfdOffset: %d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            android.util.Log.d(r6, r3)
        L_0x0355:
            long r3 = (long) r2
            r7 = 0
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0397
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r7 = r12.contains(r7)
            if (r7 != 0) goto L_0x0383
            r1.d(r3)
            r2 = 4
            r3 = r24[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0376
            r0.s(r1, r2)
            goto L_0x03aa
        L_0x0376:
            r2 = 5
            r3 = r24[r2]
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x03aa
            r0.s(r1, r2)
            goto L_0x03aa
        L_0x0383:
            if (r5 == 0) goto L_0x03aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r6, r1)
            goto L_0x03aa
        L_0x0397:
            if (r5 == 0) goto L_0x03aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r6, r1)
        L_0x03aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.g.s(X.f, int):void");
    }

    public final void t(int i2, String str, String str2) {
        HashMap[] hashMapArr = this.d;
        if (!hashMapArr[i2].isEmpty() && hashMapArr[i2].get(str) != null) {
            HashMap hashMap = hashMapArr[i2];
            hashMap.put(str2, hashMap.get(str));
            hashMapArr[i2].remove(str);
        }
    }

    public final void u(b bVar) {
        c cVar;
        int e6;
        b bVar2 = bVar;
        HashMap hashMap = this.d[4];
        c cVar2 = (c) hashMap.get("Compression");
        if (cVar2 != null) {
            int e7 = cVar2.e(this.f4171f);
            if (e7 != 1) {
                if (e7 == 6) {
                    m(bVar2, hashMap);
                    return;
                } else if (e7 != 7) {
                    return;
                }
            }
            c cVar3 = (c) hashMap.get("BitsPerSample");
            if (cVar3 != null) {
                int[] iArr = (int[]) cVar3.g(this.f4171f);
                int[] iArr2 = f4155o;
                if (Arrays.equals(iArr2, iArr) || (this.f4169c == 3 && (cVar = (c) hashMap.get("PhotometricInterpretation")) != null && (((e6 = cVar.e(this.f4171f)) == 1 && Arrays.equals(iArr, f4156p)) || (e6 == 6 && Arrays.equals(iArr, iArr2))))) {
                    c cVar4 = (c) hashMap.get("StripOffsets");
                    c cVar5 = (c) hashMap.get("StripByteCounts");
                    if (cVar4 != null && cVar5 != null) {
                        long[] l6 = b.l(cVar4.g(this.f4171f));
                        long[] l7 = b.l(cVar5.g(this.f4171f));
                        if (l6 == null || l6.length == 0) {
                            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                            return;
                        } else if (l7 == null || l7.length == 0) {
                            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                            return;
                        } else if (l6.length != l7.length) {
                            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                            return;
                        } else {
                            long j6 = 0;
                            for (long j7 : l7) {
                                j6 += j7;
                            }
                            byte[] bArr = new byte[((int) j6)];
                            this.g = true;
                            int i2 = 0;
                            int i5 = 0;
                            int i6 = 0;
                            while (i2 < l6.length) {
                                int i7 = (int) l6[i2];
                                int i8 = (int) l7[i2];
                                if (i2 < l6.length - 1 && ((long) (i7 + i8)) != l6[i2 + 1]) {
                                    this.g = false;
                                }
                                int i9 = i7 - i5;
                                if (i9 < 0) {
                                    Log.d("ExifInterface", "Invalid strip offset value");
                                    return;
                                }
                                try {
                                    bVar2.c(i9);
                                    int i10 = i5 + i9;
                                    byte[] bArr2 = new byte[i8];
                                    try {
                                        bVar2.readFully(bArr2);
                                        i5 = i10 + i8;
                                        System.arraycopy(bArr2, 0, bArr, i6, i8);
                                        i6 += i8;
                                        i2++;
                                    } catch (EOFException unused) {
                                        Log.d("ExifInterface", "Failed to read " + i8 + " bytes.");
                                        return;
                                    }
                                } catch (EOFException unused2) {
                                    Log.d("ExifInterface", "Failed to skip " + i9 + " bytes.");
                                    return;
                                }
                            }
                            if (this.g) {
                                long j8 = l6[0];
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            if (f4152l) {
                Log.d("ExifInterface", "Unsupported data type value");
                return;
            }
            return;
        }
        m(bVar2, hashMap);
    }

    public final void v(int i2, int i5) {
        HashMap[] hashMapArr = this.d;
        boolean isEmpty = hashMapArr[i2].isEmpty();
        boolean z3 = f4152l;
        if (!isEmpty && !hashMapArr[i5].isEmpty()) {
            c cVar = (c) hashMapArr[i2].get("ImageLength");
            c cVar2 = (c) hashMapArr[i2].get("ImageWidth");
            c cVar3 = (c) hashMapArr[i5].get("ImageLength");
            c cVar4 = (c) hashMapArr[i5].get("ImageWidth");
            if (cVar == null || cVar2 == null) {
                if (z3) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (cVar3 != null && cVar4 != null) {
                int e6 = cVar.e(this.f4171f);
                int e7 = cVar2.e(this.f4171f);
                int e8 = cVar3.e(this.f4171f);
                int e9 = cVar4.e(this.f4171f);
                if (e6 < e8 && e7 < e9) {
                    HashMap hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i5];
                    hashMapArr[i5] = hashMap;
                }
            } else if (z3) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (z3) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void w(f fVar, int i2) {
        c cVar;
        c cVar2;
        HashMap[] hashMapArr = this.d;
        c cVar3 = (c) hashMapArr[i2].get("DefaultCropSize");
        c cVar4 = (c) hashMapArr[i2].get("SensorTopBorder");
        c cVar5 = (c) hashMapArr[i2].get("SensorLeftBorder");
        c cVar6 = (c) hashMapArr[i2].get("SensorBottomBorder");
        c cVar7 = (c) hashMapArr[i2].get("SensorRightBorder");
        if (cVar3 != null) {
            if (cVar3.f4129a == 5) {
                e[] eVarArr = (e[]) cVar3.g(this.f4171f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVar2 = c.b(eVarArr[0], this.f4171f);
                cVar = c.b(eVarArr[1], this.f4171f);
            } else {
                int[] iArr = (int[]) cVar3.g(this.f4171f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVar2 = c.c(iArr[0], this.f4171f);
                cVar = c.c(iArr[1], this.f4171f);
            }
            hashMapArr[i2].put("ImageWidth", cVar2);
            hashMapArr[i2].put("ImageLength", cVar);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            c cVar8 = (c) hashMapArr[i2].get("ImageLength");
            c cVar9 = (c) hashMapArr[i2].get("ImageWidth");
            if (cVar8 == null || cVar9 == null) {
                c cVar10 = (c) hashMapArr[i2].get("JPEGInterchangeFormat");
                c cVar11 = (c) hashMapArr[i2].get("JPEGInterchangeFormatLength");
                if (cVar10 != null && cVar11 != null) {
                    int e6 = cVar10.e(this.f4171f);
                    int e7 = cVar10.e(this.f4171f);
                    fVar.d((long) e6);
                    byte[] bArr = new byte[e7];
                    fVar.readFully(bArr);
                    e(new b(bArr), e6, i2);
                }
            }
        } else {
            int e8 = cVar4.e(this.f4171f);
            int e9 = cVar6.e(this.f4171f);
            int e10 = cVar7.e(this.f4171f);
            int e11 = cVar5.e(this.f4171f);
            if (e9 > e8 && e10 > e11) {
                c c3 = c.c(e9 - e8, this.f4171f);
                c c6 = c.c(e10 - e11, this.f4171f);
                hashMapArr[i2].put("ImageLength", c3);
                hashMapArr[i2].put("ImageWidth", c6);
            }
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] hashMapArr = this.d;
        c cVar = (c) hashMapArr[1].get("PixelXDimension");
        c cVar2 = (c) hashMapArr[1].get("PixelYDimension");
        if (!(cVar == null || cVar2 == null)) {
            hashMapArr[0].put("ImageWidth", cVar);
            hashMapArr[0].put("ImageLength", cVar2);
        }
        if (hashMapArr[4].isEmpty() && n(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!n(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
