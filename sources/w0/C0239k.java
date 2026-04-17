package W0;

import B0.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.jvm.internal.j;

/* renamed from: W0.k  reason: case insensitive filesystem */
public abstract class C0239k {

    /* renamed from: a  reason: collision with root package name */
    public static final Rect f3959a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public static final RectF f3960b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    public static final RectF f3961c = new RectF();
    public static final float[] d = new float[6];

    /* renamed from: e  reason: collision with root package name */
    public static final float[] f3962e = new float[6];

    /* renamed from: f  reason: collision with root package name */
    public static int f3963f;
    public static Pair g;

    public static int a(int i2, int i5) {
        int i6 = 1;
        if (f3963f == 0) {
            int i7 = 2048;
            try {
                EGL egl = EGLContext.getEGL();
                j.c(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
                EGL10 egl10 = (EGL10) egl;
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                egl10.eglGetConfigs(eglGetDisplay, (EGLConfig[]) null, 0, iArr);
                int i8 = iArr[0];
                EGLConfig[] eGLConfigArr = new EGLConfig[i8];
                egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, i8, iArr);
                int[] iArr2 = new int[1];
                int i9 = iArr[0];
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i11], 12332, iArr2);
                    int i12 = iArr2[0];
                    if (i10 < i12) {
                        i10 = i12;
                    }
                }
                egl10.eglTerminate(eglGetDisplay);
                i7 = Math.max(i10, 2048);
            } catch (Exception unused) {
            }
            f3963f = i7;
        }
        if (f3963f > 0) {
            while (true) {
                int i13 = i5 / i6;
                int i14 = f3963f;
                if (i13 <= i14 && i2 / i6 <= i14) {
                    break;
                }
                i6 *= 2;
            }
        }
        return i6;
    }

    public static int b(int i2, int i5, int i6, int i7) {
        int i8 = 1;
        if (i5 > i7 || i2 > i6) {
            while ((i5 / 2) / i8 > i7 && (i2 / 2) / i8 > i6) {
                i8 *= 2;
            }
        }
        return i8;
    }

    public static l c(Context context, Uri uri, float[] fArr, int i2, int i5, int i6, boolean z3, int i7, int i8, int i9, int i10, boolean z4, boolean z5) {
        j.e(fArr, "cropPoints");
        int i11 = 1;
        while (true) {
            try {
                j.b(uri);
                return d(context, uri, fArr, i2, i5, i6, z3, i7, i8, i9, i10, z4, z5, i11);
            } catch (OutOfMemoryError e6) {
                int i12 = i11 * 2;
                if (i12 <= 16) {
                    i11 = i12;
                } else {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i12 + "): " + uri + "\r\n" + e6.getMessage(), e6);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0102, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0110, code lost:
        r15 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0127, code lost:
        throw new W0.C0240l(r7, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x012a, code lost:
        r15.recycle();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6 A[SYNTHETIC, Splitter:B:40:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0100 A[ExcHandler: Exception (r0v3 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:40:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010b A[Catch:{ OutOfMemoryError -> 0x010f, Exception -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static B0.l d(android.content.Context r17, android.net.Uri r18, float[] r19, int r20, int r21, int r22, boolean r23, int r24, int r25, int r26, int r27, boolean r28, boolean r29, int r30) {
        /*
            r7 = r18
            r0 = r19
            r10 = r20
            r1 = r19
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            android.graphics.Rect r8 = o(r1, r2, r3, r4, r5, r6)
            if (r26 <= 0) goto L_0x001b
            r9 = r26
            goto L_0x0020
        L_0x001b:
            int r1 = r8.width()
            r9 = r1
        L_0x0020:
            if (r27 <= 0) goto L_0x0025
            r11 = r27
            goto L_0x002a
        L_0x0025:
            int r1 = r8.height()
            r11 = r1
        L_0x002a:
            r12 = 1
            r15 = 0
            r1 = r17
            r2 = r18
            r3 = r8
            r4 = r9
            r5 = r11
            r6 = r30
            B0.l r1 = j(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0042 }
            java.lang.Object r2 = r1.f247c     // Catch:{ Exception -> 0x0042 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ Exception -> 0x0042 }
            int r1 = r1.f246b     // Catch:{ Exception -> 0x0043 }
            r13 = r1
            r14 = r2
            goto L_0x0045
        L_0x0042:
            r2 = r15
        L_0x0043:
            r14 = r2
            r13 = r12
        L_0x0045:
            if (r14 == 0) goto L_0x00a6
            if (r10 > 0) goto L_0x004d
            if (r28 != 0) goto L_0x004d
            if (r29 == 0) goto L_0x0083
        L_0x004d:
            android.graphics.Matrix r6 = new android.graphics.Matrix     // Catch:{ OutOfMemoryError -> 0x0098 }
            r6.<init>()     // Catch:{ OutOfMemoryError -> 0x0098 }
            float r1 = (float) r10     // Catch:{ OutOfMemoryError -> 0x0098 }
            r6.setRotate(r1)     // Catch:{ OutOfMemoryError -> 0x0098 }
            r1 = -1
            if (r28 == 0) goto L_0x005b
            r2 = r1
            goto L_0x005c
        L_0x005b:
            r2 = r12
        L_0x005c:
            float r2 = (float) r2     // Catch:{ OutOfMemoryError -> 0x0098 }
            if (r29 == 0) goto L_0x0060
            r12 = r1
        L_0x0060:
            float r1 = (float) r12     // Catch:{ OutOfMemoryError -> 0x0098 }
            r6.postScale(r2, r1)     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r4 = r14.getWidth()     // Catch:{ OutOfMemoryError -> 0x0098 }
            int r5 = r14.getHeight()     // Catch:{ OutOfMemoryError -> 0x0098 }
            r3 = 0
            r7 = 0
            r2 = 0
            r1 = r14
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x0098 }
            java.lang.String r2 = "createBitmap(...)"
            kotlin.jvm.internal.j.d(r1, r2)     // Catch:{ OutOfMemoryError -> 0x0098 }
            boolean r2 = r1.equals(r14)     // Catch:{ OutOfMemoryError -> 0x0098 }
            if (r2 != 0) goto L_0x0082
            r14.recycle()     // Catch:{ OutOfMemoryError -> 0x0098 }
        L_0x0082:
            r14 = r1
        L_0x0083:
            int r1 = r10 % 90
            if (r1 == 0) goto L_0x009a
            r1 = r14
            r2 = r19
            r3 = r8
            r4 = r20
            r5 = r23
            r6 = r24
            r7 = r25
            android.graphics.Bitmap r14 = g(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x0098 }
            goto L_0x009a
        L_0x0098:
            r0 = move-exception
            goto L_0x00a2
        L_0x009a:
            B0.l r0 = new B0.l
            r1 = 5
            r0.<init>((java.lang.Object) r14, (int) r13, (int) r1)
            goto L_0x011a
        L_0x00a2:
            r14.recycle()
            throw r0
        L_0x00a6:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x011b, Exception -> 0x0100 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x011b, Exception -> 0x0100 }
            int r2 = r8.width()     // Catch:{ OutOfMemoryError -> 0x011b, Exception -> 0x0100 }
            int r3 = r8.height()     // Catch:{ OutOfMemoryError -> 0x011b, Exception -> 0x0100 }
            int r2 = b(r2, r3, r9, r11)     // Catch:{ OutOfMemoryError -> 0x011b, Exception -> 0x0100 }
            int r2 = r2 * r30
            r1.inSampleSize = r2     // Catch:{ OutOfMemoryError -> 0x011b, Exception -> 0x0100 }
            android.content.ContentResolver r3 = r17.getContentResolver()     // Catch:{ OutOfMemoryError -> 0x011b, Exception -> 0x0100 }
            java.lang.String r4 = "getContentResolver(...)"
            kotlin.jvm.internal.j.d(r3, r4)     // Catch:{ OutOfMemoryError -> 0x011b, Exception -> 0x0100 }
            android.graphics.Bitmap r3 = h(r3, r7, r1)     // Catch:{ OutOfMemoryError -> 0x011b, Exception -> 0x0100 }
            if (r3 == 0) goto L_0x0113
            int r4 = r0.length     // Catch:{ all -> 0x00df }
            float[] r9 = new float[r4]     // Catch:{ all -> 0x00df }
            int r5 = r0.length     // Catch:{ all -> 0x00df }
            r6 = 0
            java.lang.System.arraycopy(r0, r6, r9, r6, r5)     // Catch:{ all -> 0x00df }
        L_0x00d2:
            if (r6 >= r4) goto L_0x00e2
            r0 = r9[r6]     // Catch:{ all -> 0x00df }
            int r5 = r1.inSampleSize     // Catch:{ all -> 0x00df }
            float r5 = (float) r5     // Catch:{ all -> 0x00df }
            float r0 = r0 / r5
            r9[r6] = r0     // Catch:{ all -> 0x00df }
            int r6 = r6 + 1
            goto L_0x00d2
        L_0x00df:
            r0 = move-exception
            r1 = r15
            goto L_0x0105
        L_0x00e2:
            r14 = 1065353216(0x3f800000, float:1.0)
            r8 = r3
            r10 = r20
            r11 = r23
            r12 = r24
            r13 = r25
            r1 = r15
            r15 = r28
            r16 = r29
            android.graphics.Bitmap r15 = f(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0104 }
            boolean r0 = kotlin.jvm.internal.j.a(r15, r3)     // Catch:{ OutOfMemoryError -> 0x0102, Exception -> 0x0100 }
            if (r0 != 0) goto L_0x0114
            r3.recycle()     // Catch:{ OutOfMemoryError -> 0x0102, Exception -> 0x0100 }
            goto L_0x0114
        L_0x0100:
            r0 = move-exception
            goto L_0x011e
        L_0x0102:
            r0 = move-exception
            goto L_0x0128
        L_0x0104:
            r0 = move-exception
        L_0x0105:
            boolean r2 = kotlin.jvm.internal.j.a(r1, r3)     // Catch:{ OutOfMemoryError -> 0x010f, Exception -> 0x0100 }
            if (r2 != 0) goto L_0x0112
            r3.recycle()     // Catch:{ OutOfMemoryError -> 0x010f, Exception -> 0x0100 }
            goto L_0x0112
        L_0x010f:
            r0 = move-exception
            r15 = r1
            goto L_0x0128
        L_0x0112:
            throw r0     // Catch:{ OutOfMemoryError -> 0x010f, Exception -> 0x0100 }
        L_0x0113:
            r1 = r15
        L_0x0114:
            B0.l r0 = new B0.l
            r1 = 5
            r0.<init>((java.lang.Object) r15, (int) r2, (int) r1)
        L_0x011a:
            return r0
        L_0x011b:
            r0 = move-exception
            r1 = r15
            goto L_0x0128
        L_0x011e:
            W0.l r1 = new W0.l
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r7, r0)
            throw r1
        L_0x0128:
            if (r15 == 0) goto L_0x012d
            r15.recycle()
        L_0x012d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.C0239k.d(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):B0.l");
    }

    public static l e(Bitmap bitmap, float[] fArr, int i2, boolean z3, int i5, int i6, boolean z4, boolean z5) {
        float[] fArr2 = fArr;
        j.e(fArr, "cropPoints");
        int i7 = 1;
        do {
            try {
                j.b(bitmap);
                return new l((Object) f(bitmap, fArr, i2, z3, i5, i6, ((float) 1) / ((float) i7), z4, z5), i7, 5);
            } catch (OutOfMemoryError e6) {
                i7 *= 2;
                if (i7 > 8) {
                    throw e6;
                }
            }
        } while (i7 > 8);
        throw e6;
    }

    public static Bitmap f(Bitmap bitmap, float[] fArr, int i2, boolean z3, int i5, int i6, float f6, boolean z4, boolean z5) {
        float f7;
        Bitmap bitmap2 = bitmap;
        int i7 = i2;
        float f8 = f6;
        Rect o6 = o(fArr, bitmap.getWidth(), bitmap.getHeight(), z3, i5, i6);
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i7, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
        if (z4) {
            f7 = -f8;
        } else {
            f7 = f8;
        }
        if (z5) {
            f8 = -f8;
        }
        matrix.postScale(f7, f8);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, o6.left, o6.top, o6.width(), o6.height(), matrix, true);
        j.d(createBitmap, "createBitmap(...)");
        if (createBitmap.equals(bitmap)) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        if (i7 % 90 != 0) {
            return g(createBitmap, fArr, o6, i2, z3, i5, i6);
        }
        return createBitmap;
    }

    public static Bitmap g(Bitmap bitmap, float[] fArr, Rect rect, int i2, boolean z3, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        if (i2 % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians((double) i2);
        if (i2 < 90 || (181 <= i2 && i2 < 270)) {
            i7 = rect.left;
        } else {
            i7 = rect.right;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= fArr.length) {
                i8 = 0;
                i9 = 0;
                i10 = 0;
                break;
            }
            float f6 = fArr[i12];
            if (f6 >= ((float) (i7 - 1)) && f6 <= ((float) (i7 + 1))) {
                int i13 = i12 + 1;
                i11 = (int) Math.abs(Math.sin(radians) * ((double) (((float) rect.bottom) - fArr[i13])));
                i9 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i13] - ((float) rect.top))));
                i10 = (int) Math.abs(((double) (fArr[i13] - ((float) rect.top))) / Math.sin(radians));
                i8 = (int) Math.abs(((double) (((float) rect.bottom) - fArr[i13])) / Math.cos(radians));
                break;
            }
            i12 += 2;
        }
        rect.set(i11, i9, i10 + i11, i8 + i9);
        if (z3) {
            k(rect, i5, i6);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (!j.a(bitmap, createBitmap)) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        v5.a.a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r5.inSampleSize *= 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        v5.a.a(r0, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap h(android.content.ContentResolver r3, android.net.Uri r4, android.graphics.BitmapFactory.Options r5) {
        /*
        L_0x0000:
            java.io.InputStream r0 = r3.openInputStream(r4)
            r1 = 0
            android.graphics.Rect r2 = f3959a     // Catch:{ OutOfMemoryError -> 0x0011 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r0, r2, r5)     // Catch:{ OutOfMemoryError -> 0x0011 }
            v5.a.a(r0, r1)
            return r3
        L_0x000f:
            r3 = move-exception
            goto L_0x003a
        L_0x0011:
            int r2 = r5.inSampleSize     // Catch:{ all -> 0x000f }
            int r2 = r2 * 2
            r5.inSampleSize = r2     // Catch:{ all -> 0x000f }
            v5.a.a(r0, r1)
            int r0 = r5.inSampleSize
            r1 = 512(0x200, float:7.175E-43)
            if (r0 > r1) goto L_0x0021
            goto L_0x0000
        L_0x0021:
            W0.l r3 = new W0.l
            java.lang.String r5 = "uri"
            kotlin.jvm.internal.j.e(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "crop: Failed to decode image: "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4)
            throw r3
        L_0x003a:
            throw r3     // Catch:{ all -> 0x003b }
        L_0x003b:
            r4 = move-exception
            v5.a.a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.C0239k.h(android.content.ContentResolver, android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        v5.a.a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static B0.l i(android.content.Context r4, android.net.Uri r5, int r6, int r7) {
        /*
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.j.e(r5, r0)
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Exception -> 0x0036 }
            kotlin.jvm.internal.j.b(r4)     // Catch:{ Exception -> 0x0036 }
            java.io.InputStream r0 = r4.openInputStream(r5)     // Catch:{ Exception -> 0x0036 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0059 }
            r1.<init>()     // Catch:{ all -> 0x0059 }
            r2 = 1
            r1.inJustDecodeBounds = r2     // Catch:{ all -> 0x0059 }
            android.graphics.Rect r2 = f3959a     // Catch:{ all -> 0x0059 }
            android.graphics.BitmapFactory.decodeStream(r0, r2, r1)     // Catch:{ all -> 0x0059 }
            r2 = 0
            r1.inJustDecodeBounds = r2     // Catch:{ all -> 0x0059 }
            r2 = 0
            v5.a.a(r0, r2)     // Catch:{ Exception -> 0x0036 }
            int r0 = r1.outWidth     // Catch:{ Exception -> 0x0036 }
            r2 = -1
            if (r0 != r2) goto L_0x0038
            int r3 = r1.outHeight     // Catch:{ Exception -> 0x0036 }
            if (r3 == r2) goto L_0x002e
            goto L_0x0038
        L_0x002e:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0036 }
            java.lang.String r6 = "File is not a picture"
            r4.<init>(r6)     // Catch:{ Exception -> 0x0036 }
            throw r4     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            r4 = move-exception
            goto L_0x0060
        L_0x0038:
            int r2 = r1.outHeight     // Catch:{ Exception -> 0x0036 }
            int r6 = b(r0, r2, r6, r7)     // Catch:{ Exception -> 0x0036 }
            int r7 = r1.outWidth     // Catch:{ Exception -> 0x0036 }
            int r0 = r1.outHeight     // Catch:{ Exception -> 0x0036 }
            int r7 = a(r7, r0)     // Catch:{ Exception -> 0x0036 }
            int r6 = java.lang.Math.max(r6, r7)     // Catch:{ Exception -> 0x0036 }
            r1.inSampleSize = r6     // Catch:{ Exception -> 0x0036 }
            android.graphics.Bitmap r4 = h(r4, r5, r1)     // Catch:{ Exception -> 0x0036 }
            B0.l r6 = new B0.l     // Catch:{ Exception -> 0x0036 }
            int r7 = r1.inSampleSize     // Catch:{ Exception -> 0x0036 }
            r0 = 5
            r6.<init>((java.lang.Object) r4, (int) r7, (int) r0)     // Catch:{ Exception -> 0x0036 }
            return r6
        L_0x0059:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005b }
        L_0x005b:
            r6 = move-exception
            v5.a.a(r0, r4)     // Catch:{ Exception -> 0x0036 }
            throw r6     // Catch:{ Exception -> 0x0036 }
        L_0x0060:
            W0.l r6 = new W0.l
            java.lang.String r4 = r4.getMessage()
            r6.<init>(r5, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.C0239k.i(android.content.Context, android.net.Uri, int, int):B0.l");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|21|(6:42|(0)|26|27|28|29)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r9 = r0.inSampleSize * 2;
        r0.inSampleSize = r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005b A[SYNTHETIC, Splitter:B:24:0x005b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static B0.l j(android.content.Context r4, android.net.Uri r5, android.graphics.Rect r6, int r7, int r8, int r9) {
        /*
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x004b }
            r0.<init>()     // Catch:{ Exception -> 0x004b }
            int r1 = r6.width()     // Catch:{ Exception -> 0x004b }
            int r2 = r6.height()     // Catch:{ Exception -> 0x004b }
            int r7 = b(r1, r2, r7, r8)     // Catch:{ Exception -> 0x004b }
            int r9 = r9 * r7
            r0.inSampleSize = r9     // Catch:{ Exception -> 0x004b }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Exception -> 0x004b }
            java.io.InputStream r4 = r4.openInputStream(r5)     // Catch:{ Exception -> 0x004b }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x002a }
            r8 = 31
            if (r7 < r8) goto L_0x002c
            kotlin.jvm.internal.j.b(r4)     // Catch:{ all -> 0x002a }
            android.graphics.BitmapRegionDecoder r7 = android.graphics.BitmapRegionDecoder.newInstance(r4)     // Catch:{ all -> 0x002a }
            goto L_0x0034
        L_0x002a:
            r6 = move-exception
            goto L_0x006f
        L_0x002c:
            kotlin.jvm.internal.j.b(r4)     // Catch:{ all -> 0x002a }
            r7 = 0
            android.graphics.BitmapRegionDecoder r7 = android.graphics.BitmapRegionDecoder.newInstance(r4, r7)     // Catch:{ all -> 0x002a }
        L_0x0034:
            r8 = 0
            B0.l r9 = new B0.l     // Catch:{ OutOfMemoryError -> 0x004f }
            kotlin.jvm.internal.j.b(r7)     // Catch:{ OutOfMemoryError -> 0x004f }
            android.graphics.Bitmap r1 = r7.decodeRegion(r6, r0)     // Catch:{ OutOfMemoryError -> 0x004f }
            int r2 = r0.inSampleSize     // Catch:{ OutOfMemoryError -> 0x004f }
            r3 = 5
            r9.<init>((java.lang.Object) r1, (int) r2, (int) r3)     // Catch:{ OutOfMemoryError -> 0x004f }
            r7.recycle()     // Catch:{ all -> 0x002a }
            v5.a.a(r4, r8)     // Catch:{ Exception -> 0x004b }
            return r9
        L_0x004b:
            r4 = move-exception
            goto L_0x0075
        L_0x004d:
            r6 = move-exception
            goto L_0x0069
        L_0x004f:
            int r9 = r0.inSampleSize     // Catch:{ all -> 0x004d }
            int r9 = r9 * 2
            r0.inSampleSize = r9     // Catch:{ all -> 0x004d }
            r1 = 512(0x200, float:7.175E-43)
            if (r9 <= r1) goto L_0x0034
            if (r7 == 0) goto L_0x005e
            r7.recycle()     // Catch:{ all -> 0x002a }
        L_0x005e:
            v5.a.a(r4, r8)     // Catch:{ Exception -> 0x004b }
            B0.l r4 = new B0.l
            r5 = 1
            r6 = 5
            r4.<init>((java.lang.Object) r8, (int) r5, (int) r6)
            return r4
        L_0x0069:
            if (r7 == 0) goto L_0x006e
            r7.recycle()     // Catch:{ all -> 0x002a }
        L_0x006e:
            throw r6     // Catch:{ all -> 0x002a }
        L_0x006f:
            throw r6     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r7 = move-exception
            v5.a.a(r4, r6)     // Catch:{ Exception -> 0x004b }
            throw r7     // Catch:{ Exception -> 0x004b }
        L_0x0075:
            W0.l r6 = new W0.l
            java.lang.String r4 = r4.getMessage()
            r6.<init>(r5, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.C0239k.j(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):B0.l");
    }

    public static void k(Rect rect, int i2, int i5) {
        if (i2 == i5 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
            } else {
                rect.right -= rect.width() - rect.height();
            }
        }
    }

    public static float l(float[] fArr) {
        j.e(fArr, "points");
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static float m(float[] fArr) {
        j.e(fArr, "points");
        return (q(fArr) + r(fArr)) / 2.0f;
    }

    public static float n(float[] fArr) {
        j.e(fArr, "points");
        return (s(fArr) + l(fArr)) / 2.0f;
    }

    public static Rect o(float[] fArr, int i2, int i5, boolean z3, int i6, int i7) {
        j.e(fArr, "cropPoints");
        Rect rect = new Rect(y2.l.b(Math.max(0.0f, q(fArr))), y2.l.b(Math.max(0.0f, s(fArr))), y2.l.b(Math.min((float) i2, r(fArr))), y2.l.b(Math.min((float) i5, l(fArr))));
        if (z3) {
            k(rect, i6, i7);
        }
        return rect;
    }

    public static float p(float[] fArr) {
        j.e(fArr, "points");
        return l(fArr) - s(fArr);
    }

    public static float q(float[] fArr) {
        j.e(fArr, "points");
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float r(float[] fArr) {
        j.e(fArr, "points");
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float s(float[] fArr) {
        j.e(fArr, "points");
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static float t(float[] fArr) {
        j.e(fArr, "points");
        return r(fArr) - q(fArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        v5.a.a(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static T1.X u(android.graphics.Bitmap r5, android.content.Context r6, android.net.Uri r7) {
        /*
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.j.e(r7, r0)
            r0 = 0
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ all -> 0x0021 }
            java.io.InputStream r6 = r6.openInputStream(r7)     // Catch:{ all -> 0x0021 }
            if (r6 == 0) goto L_0x0021
            X.g r7 = new X.g     // Catch:{ all -> 0x001a }
            r7.<init>(r6)     // Catch:{ all -> 0x001a }
            v5.a.a(r6, r0)     // Catch:{ all -> 0x0021 }
            r0 = r7
            goto L_0x0021
        L_0x001a:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x001c }
        L_0x001c:
            r1 = move-exception
            v5.a.a(r6, r7)     // Catch:{ all -> 0x0021 }
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r6 = 0
            if (r0 == 0) goto L_0x0064
            java.lang.String r7 = "Orientation"
            X.c r7 = r0.c(r7)
            r1 = 1
            if (r7 != 0) goto L_0x002f
        L_0x002d:
            r7 = r1
            goto L_0x0035
        L_0x002f:
            java.nio.ByteOrder r0 = r0.f4171f     // Catch:{ NumberFormatException -> 0x002d }
            int r7 = r7.e(r0)     // Catch:{ NumberFormatException -> 0x002d }
        L_0x0035:
            r0 = 3
            r2 = 7
            r3 = 5
            if (r7 == r0) goto L_0x004d
            if (r7 == r3) goto L_0x004a
            r0 = 6
            if (r7 == r0) goto L_0x004a
            if (r7 == r2) goto L_0x004a
            r0 = 8
            if (r7 == r0) goto L_0x0047
            r0 = r6
            goto L_0x004f
        L_0x0047:
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x004f
        L_0x004a:
            r0 = 90
            goto L_0x004f
        L_0x004d:
            r0 = 180(0xb4, float:2.52E-43)
        L_0x004f:
            r4 = 2
            if (r7 == r4) goto L_0x0057
            if (r7 != r3) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r3 = r6
            goto L_0x0058
        L_0x0057:
            r3 = r1
        L_0x0058:
            r4 = 4
            if (r7 == r4) goto L_0x005d
            if (r7 != r2) goto L_0x005e
        L_0x005d:
            r6 = r1
        L_0x005e:
            T1.X r7 = new T1.X
            r7.<init>(r0, r5, r3, r6)
            goto L_0x0069
        L_0x0064:
            T1.X r7 = new T1.X
            r7.<init>(r6, r5, r6, r6)
        L_0x0069:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.C0239k.u(android.graphics.Bitmap, android.content.Context, android.net.Uri):T1.X");
    }

    public static Bitmap v(Bitmap bitmap, int i2, int i5, G g5) {
        Bitmap bitmap2;
        j.e(g5, "options");
        if (i2 > 0 && i5 > 0) {
            try {
                G g6 = G.d;
                if (!(g5 == g6 || g5 == G.f3878c)) {
                    if (g5 == G.f3879e) {
                    }
                }
                if (g5 == G.f3879e) {
                    j.b(bitmap);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, i2, i5, false);
                } else {
                    j.b(bitmap);
                    float width = (float) bitmap.getWidth();
                    float height = (float) bitmap.getHeight();
                    float max = Math.max(width / ((float) i2), height / ((float) i5));
                    if (max <= 1.0f) {
                        if (g5 != g6) {
                            bitmap2 = null;
                        }
                    }
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                }
                if (bitmap2 != null) {
                    if (!bitmap2.equals(bitmap)) {
                        bitmap.recycle();
                    }
                    return bitmap2;
                }
            } catch (Exception e6) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e6);
            }
        }
        j.b(bitmap);
        return bitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        v5.a.a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri w(android.content.Context r3, android.graphics.Bitmap r4, android.graphics.Bitmap.CompressFormat r5, int r6, android.net.Uri r7) {
        /*
            java.lang.String r0 = "bitmap"
            kotlin.jvm.internal.j.e(r4, r0)
            java.lang.String r0 = "compressFormat"
            kotlin.jvm.internal.j.e(r5, r0)
            if (r7 != 0) goto L_0x0071
            int[] r7 = W0.C0238j.f3958a     // Catch:{ IOException -> 0x001d }
            int r0 = r5.ordinal()     // Catch:{ IOException -> 0x001d }
            r7 = r7[r0]     // Catch:{ IOException -> 0x001d }
            r0 = 1
            if (r7 == r0) goto L_0x0022
            r0 = 2
            if (r7 == r0) goto L_0x001f
            java.lang.String r7 = ".webp"
            goto L_0x0024
        L_0x001d:
            r3 = move-exception
            goto L_0x0069
        L_0x001f:
            java.lang.String r7 = ".png"
            goto L_0x0024
        L_0x0022:
            java.lang.String r7 = ".jpg"
        L_0x0024:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x001d }
            r1 = 29
            java.lang.String r2 = "cropped"
            if (r0 < r1) goto L_0x005c
            java.lang.String r0 = android.os.Environment.DIRECTORY_PICTURES     // Catch:{ Exception -> 0x003e }
            java.io.File r0 = r3.getExternalFilesDir(r0)     // Catch:{ Exception -> 0x003e }
            java.io.File r0 = java.io.File.createTempFile(r2, r7, r0)     // Catch:{ Exception -> 0x003e }
            kotlin.jvm.internal.j.b(r0)     // Catch:{ Exception -> 0x003e }
            android.net.Uri r7 = android.support.v4.media.session.a.h0(r3, r0)     // Catch:{ Exception -> 0x003e }
            goto L_0x0071
        L_0x003e:
            r0 = move-exception
            java.lang.String r1 = "AIC"
            java.lang.String r0 = r0.getMessage()     // Catch:{ IOException -> 0x001d }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x001d }
            android.util.Log.e(r1, r0)     // Catch:{ IOException -> 0x001d }
            java.io.File r0 = r3.getCacheDir()     // Catch:{ IOException -> 0x001d }
            java.io.File r7 = java.io.File.createTempFile(r2, r7, r0)     // Catch:{ IOException -> 0x001d }
            kotlin.jvm.internal.j.b(r7)     // Catch:{ IOException -> 0x001d }
            android.net.Uri r7 = android.support.v4.media.session.a.h0(r3, r7)     // Catch:{ IOException -> 0x001d }
            goto L_0x0071
        L_0x005c:
            java.io.File r0 = r3.getCacheDir()     // Catch:{ IOException -> 0x001d }
            java.io.File r7 = java.io.File.createTempFile(r2, r7, r0)     // Catch:{ IOException -> 0x001d }
            android.net.Uri r7 = android.net.Uri.fromFile(r7)     // Catch:{ IOException -> 0x001d }
            goto L_0x0071
        L_0x0069:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Failed to create temp file for output image"
            r4.<init>(r5, r3)
            throw r4
        L_0x0071:
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r0 = "wt"
            java.io.OutputStream r3 = r3.openOutputStream(r7, r0)
            kotlin.jvm.internal.j.b(r3)
            r4.compress(r5, r6, r3)     // Catch:{ all -> 0x0086 }
            r4 = 0
            v5.a.a(r3, r4)
            return r7
        L_0x0086:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r5 = move-exception
            v5.a.a(r3, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.C0239k.w(android.content.Context, android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat, int, android.net.Uri):android.net.Uri");
    }
}
