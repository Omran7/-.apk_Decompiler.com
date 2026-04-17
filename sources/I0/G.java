package I0;

import B0.D;
import C0.b;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import h0.C0552a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import s2.e;
import z0.h;
import z0.i;
import z0.k;

public final class G implements k {
    public static final h d = new h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new k());

    /* renamed from: e  reason: collision with root package name */
    public static final h f1095e = new h("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new j());

    /* renamed from: f  reason: collision with root package name */
    public static final e f1096f = new e(8);
    public static final List g = Collections.unmodifiableList(Arrays.asList(new String[]{"TP1A", "TD1A.220804.031"}));

    /* renamed from: a  reason: collision with root package name */
    public final F f1097a;

    /* renamed from: b  reason: collision with root package name */
    public final b f1098b;

    /* renamed from: c  reason: collision with root package name */
    public final e f1099c = f1096f;

    public G(b bVar, F f6) {
        this.f1098b = bVar;
        this.f1097a = f6;
    }

    public final D a(Object obj, int i2, int i5, i iVar) {
        int i6;
        long longValue = ((Long) iVar.c(d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar.c(f1095e);
            if (num == null) {
                num = 2;
            }
            o oVar = (o) iVar.c(o.g);
            if (oVar == null) {
                oVar = o.f1124f;
            }
            o oVar2 = oVar;
            this.f1099c.getClass();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f1097a.k(mediaMetadataRetriever, obj);
                Bitmap c3 = c(obj, mediaMetadataRetriever, longValue, num.intValue(), i2, i5, oVar2);
                if (i6 < 29) {
                    mediaMetadataRetriever.release();
                }
                return C0057d.e(this.f1098b, c3);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    mediaMetadataRetriever.release();
                } else {
                    mediaMetadataRetriever.release();
                }
            }
        } else {
            throw new IllegalArgumentException(C0552a.m("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", longValue));
        }
    }

    public final boolean b(Object obj, i iVar) {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r4 == null) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a A[Catch:{ all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x018d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap c(java.lang.Object r15, android.media.MediaMetadataRetriever r16, long r17, int r19, int r20, int r21, I0.o r22) {
        /*
            r14 = this;
            r7 = r16
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r0 = android.os.Build.DEVICE
            r8 = 3
            r9 = 0
            java.lang.String r10 = "VideoDecoder"
            if (r0 == 0) goto L_0x0026
            java.lang.String r4 = ".+_cheets|cheets_.+"
            boolean r0 = r0.matches(r4)
            if (r0 == 0) goto L_0x0026
            r0 = 12
            java.lang.String r0 = r7.extractMetadata(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r4 = "video/webm"
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0028
        L_0x0026:
            r11 = r14
            goto L_0x007b
        L_0x0028:
            android.media.MediaExtractor r4 = new android.media.MediaExtractor     // Catch:{ all -> 0x0061 }
            r4.<init>()     // Catch:{ all -> 0x0061 }
            r11 = r14
            I0.F r0 = r11.f1097a     // Catch:{ all -> 0x005b }
            r5 = r15
            r0.m(r4, r15)     // Catch:{ all -> 0x005b }
            int r0 = r4.getTrackCount()     // Catch:{ all -> 0x005b }
            r5 = 0
        L_0x0039:
            if (r5 >= r0) goto L_0x005d
            android.media.MediaFormat r6 = r4.getTrackFormat(r5)     // Catch:{ all -> 0x005b }
            java.lang.String r12 = "mime"
            java.lang.String r6 = r6.getString(r12)     // Catch:{ all -> 0x005b }
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r6 = r12.equals(r6)     // Catch:{ all -> 0x005b }
            if (r6 != 0) goto L_0x0050
            int r5 = r5 + 1
            goto L_0x0039
        L_0x0050:
            r4.release()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot decode VP8 video on CrOS."
            r0.<init>(r1)
            throw r0
        L_0x005b:
            r0 = move-exception
            goto L_0x0064
        L_0x005d:
            r4.release()
            goto L_0x007b
        L_0x0061:
            r0 = move-exception
            r11 = r14
            r4 = r9
        L_0x0064:
            boolean r5 = android.util.Log.isLoggable(r10, r8)     // Catch:{ all -> 0x0070 }
            if (r5 == 0) goto L_0x0072
            java.lang.String r5 = "Exception trying to extract track info for a webm video on CrOS."
            android.util.Log.d(r10, r5, r0)     // Catch:{ all -> 0x0070 }
            goto L_0x0072
        L_0x0070:
            r0 = move-exception
            goto L_0x0075
        L_0x0072:
            if (r4 == 0) goto L_0x007b
            goto L_0x005d
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r4.release()
        L_0x007a:
            throw r0
        L_0x007b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 27
            r12 = 24
            if (r0 < r4) goto L_0x00db
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x00db
            if (r2 == r0) goto L_0x00db
            I0.o r0 = I0.o.f1123e
            if (r3 == r0) goto L_0x00db
            r0 = 18
            java.lang.String r0 = r7.extractMetadata(r0)     // Catch:{ all -> 0x00cf }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x00cf }
            r4 = 19
            java.lang.String r4 = r7.extractMetadata(r4)     // Catch:{ all -> 0x00cf }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = r7.extractMetadata(r12)     // Catch:{ all -> 0x00cf }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ all -> 0x00cf }
            r6 = 90
            if (r5 == r6) goto L_0x00b1
            r6 = 270(0x10e, float:3.78E-43)
            if (r5 != r6) goto L_0x00b4
        L_0x00b1:
            r13 = r4
            r4 = r0
            r0 = r13
        L_0x00b4:
            float r1 = r3.b(r0, r4, r1, r2)     // Catch:{ all -> 0x00cf }
            float r0 = (float) r0     // Catch:{ all -> 0x00cf }
            float r0 = r0 * r1
            int r5 = java.lang.Math.round(r0)     // Catch:{ all -> 0x00cf }
            float r0 = (float) r4     // Catch:{ all -> 0x00cf }
            float r1 = r1 * r0
            int r6 = java.lang.Math.round(r1)     // Catch:{ all -> 0x00cf }
            r1 = r16
            r2 = r17
            r4 = r19
            android.graphics.Bitmap r9 = r1.getScaledFrameAtTime(r2, r4, r5, r6)     // Catch:{ all -> 0x00cf }
            goto L_0x00db
        L_0x00cf:
            r0 = move-exception
            boolean r1 = android.util.Log.isLoggable(r10, r8)
            if (r1 == 0) goto L_0x00db
            java.lang.String r1 = "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame"
            android.util.Log.d(r10, r1, r0)
        L_0x00db:
            if (r9 != 0) goto L_0x00e1
            android.graphics.Bitmap r9 = r16.getFrameAtTime(r17, r19)
        L_0x00e1:
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "Pixel"
            boolean r0 = r0.startsWith(r1)
            r1 = 33
            if (r0 == 0) goto L_0x010c
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 != r1) goto L_0x010c
            java.util.List r0 = g
            java.util.Iterator r0 = r0.iterator()
        L_0x00f7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x018b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = android.os.Build.ID
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x00f7
            goto L_0x0114
        L_0x010c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L_0x018b
            if (r0 >= r1) goto L_0x018b
        L_0x0114:
            r0 = 36
            java.lang.String r0 = r7.extractMetadata(r0)     // Catch:{ NumberFormatException -> 0x0180 }
            r1 = 35
            java.lang.String r1 = r7.extractMetadata(r1)     // Catch:{ NumberFormatException -> 0x0180 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0180 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0180 }
            r2 = 7
            r3 = 6
            if (r0 == r2) goto L_0x012e
            if (r0 != r3) goto L_0x018b
        L_0x012e:
            if (r1 != r3) goto L_0x018b
            java.lang.String r0 = r7.extractMetadata(r12)     // Catch:{ NumberFormatException -> 0x0180 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0180 }
            int r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x0180 }
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 != r1) goto L_0x018b
            boolean r0 = android.util.Log.isLoggable(r10, r8)
            if (r0 == 0) goto L_0x014b
            java.lang.String r0 = "Applying HDR 180 deg thumbnail correction"
            android.util.Log.d(r10, r0)
        L_0x014b:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r9.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r9.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r2
            r2 = 1127481344(0x43340000, float:180.0)
            r0.postRotate(r2, r1, r3)
            int r1 = r9.getWidth()
            int r2 = r9.getHeight()
            r3 = 0
            r4 = 1
            r5 = 0
            r15 = r9
            r16 = r5
            r17 = r3
            r18 = r1
            r19 = r2
            r20 = r0
            r21 = r4
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x018b
        L_0x0180:
            boolean r0 = android.util.Log.isLoggable(r10, r8)
            if (r0 == 0) goto L_0x018b
            java.lang.String r0 = "Exception trying to extract HDR transfer function or rotation"
            android.util.Log.d(r10, r0)
        L_0x018b:
            if (r9 == 0) goto L_0x018e
            return r9
        L_0x018e:
            G5.w r0 = new G5.w
            java.lang.String r1 = "MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.G.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, I0.o):android.graphics.Bitmap");
    }
}
