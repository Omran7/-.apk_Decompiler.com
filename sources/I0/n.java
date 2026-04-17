package I0;

import C0.g;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.measurement.a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import x1.i;
import z0.C1128d;

public final class n implements C1128d {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f1119a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1120b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(m mVar, g gVar) {
        boolean z3;
        byte[] bArr;
        try {
            int m6 = mVar.m();
            if ((m6 & 65496) == 65496 || m6 == 19789 || m6 == 18761) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + m6);
                }
                return -1;
            }
            int g = g(mVar);
            if (g == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) gVar.c(g, byte[].class);
            int h = h(mVar, bArr, g);
            gVar.g(bArr);
            return h;
        } catch (l unused) {
            return -1;
        } catch (Throwable th) {
            gVar.g(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bumptech.glide.load.ImageHeaderParser$ImageType f(I0.m r8) {
        /*
            int r0 = r8.m()     // Catch:{ l -> 0x0102 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG     // Catch:{ l -> 0x0102 }
            return r8
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r8.h()     // Catch:{ l -> 0x0102 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF     // Catch:{ l -> 0x0102 }
            return r8
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r8.h()     // Catch:{ l -> 0x0102 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r8.a(r0)     // Catch:{ l -> 0x0102 }
            short r8 = r8.h()     // Catch:{ l -> 0x0039 }
            r0 = 3
            if (r8 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A     // Catch:{ l -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG     // Catch:{ l -> 0x0039 }
        L_0x0038:
            return r8
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG     // Catch:{ l -> 0x0102 }
            return r8
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            r2 = 4
            if (r0 == r1) goto L_0x00a1
            int r1 = r8.m()     // Catch:{ l -> 0x0102 }
            int r1 = r1 << 16
            int r4 = r8.m()     // Catch:{ l -> 0x0102 }
            r1 = r1 | r4
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            if (r1 == r4) goto L_0x0056
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ l -> 0x0102 }
            goto L_0x00a0
        L_0x0056:
            int r1 = r8.m()     // Catch:{ l -> 0x0102 }
            int r1 = r1 << 16
            int r4 = r8.m()     // Catch:{ l -> 0x0102 }
            r1 = r1 | r4
            r4 = 1635150195(0x61766973, float:2.8409359E20)
            if (r1 != r4) goto L_0x0069
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF     // Catch:{ l -> 0x0102 }
            goto L_0x00a0
        L_0x0069:
            r5 = 1
            r6 = 0
            r7 = 1635150182(0x61766966, float:2.8409336E20)
            if (r1 != r7) goto L_0x0072
            r1 = r5
            goto L_0x0073
        L_0x0072:
            r1 = r6
        L_0x0073:
            r8.a(r2)     // Catch:{ l -> 0x0102 }
            int r0 = r0 + -16
            int r2 = r0 % 4
            if (r2 != 0) goto L_0x0099
        L_0x007c:
            r2 = 5
            if (r6 >= r2) goto L_0x0099
            if (r0 <= 0) goto L_0x0099
            int r2 = r8.m()     // Catch:{ l -> 0x0102 }
            int r2 = r2 << 16
            int r3 = r8.m()     // Catch:{ l -> 0x0102 }
            r2 = r2 | r3
            if (r2 != r4) goto L_0x0091
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF     // Catch:{ l -> 0x0102 }
            goto L_0x00a0
        L_0x0091:
            if (r2 != r7) goto L_0x0094
            r1 = r5
        L_0x0094:
            int r6 = r6 + 1
            int r0 = r0 + -4
            goto L_0x007c
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.AVIF     // Catch:{ l -> 0x0102 }
            goto L_0x00a0
        L_0x009e:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ l -> 0x0102 }
        L_0x00a0:
            return r8
        L_0x00a1:
            r8.a(r2)     // Catch:{ l -> 0x0102 }
            int r0 = r8.m()     // Catch:{ l -> 0x0102 }
            int r0 = r0 << 16
            int r1 = r8.m()     // Catch:{ l -> 0x0102 }
            r0 = r0 | r1
            r1 = 1464156752(0x57454250, float:2.16888601E14)
            if (r0 == r1) goto L_0x00b7
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ l -> 0x0102 }
            return r8
        L_0x00b7:
            int r0 = r8.m()     // Catch:{ l -> 0x0102 }
            int r0 = r0 << 16
            int r1 = r8.m()     // Catch:{ l -> 0x0102 }
            r0 = r0 | r1
            r1 = r0 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r1 == r4) goto L_0x00cc
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN     // Catch:{ l -> 0x0102 }
            return r8
        L_0x00cc:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 88
            if (r0 != r1) goto L_0x00ea
            r8.a(r2)     // Catch:{ l -> 0x0102 }
            short r8 = r8.h()     // Catch:{ l -> 0x0102 }
            r0 = r8 & 2
            if (r0 == 0) goto L_0x00e0
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_WEBP     // Catch:{ l -> 0x0102 }
            return r8
        L_0x00e0:
            r8 = r8 & 16
            if (r8 == 0) goto L_0x00e7
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A     // Catch:{ l -> 0x0102 }
            return r8
        L_0x00e7:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ l -> 0x0102 }
            return r8
        L_0x00ea:
            r1 = 76
            if (r0 != r1) goto L_0x00ff
            r8.a(r2)     // Catch:{ l -> 0x0102 }
            short r8 = r8.h()     // Catch:{ l -> 0x0102 }
            r8 = r8 & 8
            if (r8 == 0) goto L_0x00fc
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A     // Catch:{ l -> 0x0102 }
            goto L_0x00fe
        L_0x00fc:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ l -> 0x0102 }
        L_0x00fe:
            return r8
        L_0x00ff:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ l -> 0x0102 }
            return r8
        L_0x0102:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.n.f(I0.m):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public static int g(m mVar) {
        short h;
        int m6;
        long j6;
        long a6;
        do {
            short h6 = mVar.h();
            if (h6 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + h6);
                }
                return -1;
            }
            h = mVar.h();
            if (h == 218) {
                return -1;
            }
            if (h == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            m6 = mVar.m() - 2;
            if (h == 225) {
                return m6;
            }
            j6 = (long) m6;
            a6 = mVar.a(j6);
        } while (a6 == j6);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder h7 = a.h("Unable to skip enough data, type: ", h, ", wanted to skip: ", m6, ", but actually skipped: ");
            h7.append(a6);
            Log.d("DfltImageHeaderParser", h7.toString());
        }
        return -1;
    }

    public static int h(m mVar, byte[] bArr, int i2) {
        boolean z3;
        ByteOrder byteOrder;
        int i5;
        int i6;
        byte[] bArr2 = bArr;
        int i7 = i2;
        int g = mVar.g(bArr, i2);
        if (g != i7) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i7 + ", actually read: " + g);
            }
            return -1;
        }
        short s6 = 1;
        int i8 = 0;
        byte[] bArr3 = f1119a;
        if (bArr2 == null || i7 <= bArr3.length) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            int i9 = 0;
            while (true) {
                if (i9 >= bArr3.length) {
                    break;
                } else if (bArr2[i9] != bArr3[i9]) {
                    z3 = false;
                    break;
                } else {
                    i9++;
                }
            }
        }
        if (z3) {
            k kVar = new k(bArr2, i7);
            short a6 = kVar.a(6);
            if (a6 == 18761) {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            } else if (a6 != 19789) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + a6);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.BIG_ENDIAN;
            }
            ByteBuffer byteBuffer = kVar.f1118a;
            byteBuffer.order(byteOrder);
            if (byteBuffer.remaining() - 10 >= 4) {
                i5 = byteBuffer.getInt(10);
            } else {
                i5 = -1;
            }
            short a7 = kVar.a(i5 + 6);
            while (i8 < a7) {
                int i10 = (i8 * 12) + i5 + 8;
                short a8 = kVar.a(i10);
                if (a8 == 274) {
                    short a9 = kVar.a(i10 + 2);
                    if (a9 >= s6 && a9 <= 12) {
                        int i11 = i10 + 4;
                        if (byteBuffer.remaining() - i11 >= 4) {
                            i6 = byteBuffer.getInt(i11);
                        } else {
                            i6 = -1;
                        }
                        if (i6 >= 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                StringBuilder h = a.h("Got tagIndex=", i8, " tagType=", a8, " formatCode=");
                                h.append(a9);
                                h.append(" componentCount=");
                                h.append(i6);
                                Log.d("DfltImageHeaderParser", h.toString());
                            }
                            int i12 = i6 + f1120b[a9];
                            if (i12 <= 4) {
                                int i13 = i10 + 8;
                                if (i13 < 0 || i13 > byteBuffer.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i13 + " tagType=" + a8);
                                    }
                                } else if (i12 >= 0 && i12 + i13 <= byteBuffer.remaining()) {
                                    return kVar.a(i13);
                                } else {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a8);
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a9);
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Negative tiff component count");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Got invalid format code = " + a9);
                    }
                }
                i8++;
                s6 = 1;
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
        }
        return -1;
    }

    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        U0.g.c(byteBuffer, "Argument must not be null");
        return f(new j(byteBuffer, 0));
    }

    public final int b(InputStream inputStream, g gVar) {
        i iVar = new i((Object) inputStream, 13);
        U0.g.c(gVar, "Argument must not be null");
        return e(iVar, gVar);
    }

    public final int c(ByteBuffer byteBuffer, g gVar) {
        j jVar = new j(byteBuffer, 0);
        U0.g.c(gVar, "Argument must not be null");
        return e(jVar, gVar);
    }

    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return f(new i((Object) inputStream, 13));
    }
}
