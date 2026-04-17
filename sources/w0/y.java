package W0;

import android.graphics.Rect;
import android.net.Uri;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f4052a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f4053b;

    /* renamed from: c  reason: collision with root package name */
    public final Exception f4054c;
    public final float[] d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f4055e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f4056f;

    /* renamed from: p  reason: collision with root package name */
    public final int f4057p;

    /* renamed from: q  reason: collision with root package name */
    public final int f4058q;

    public y(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i2, int i5) {
        this.f4052a = uri;
        this.f4053b = uri2;
        this.f4054c = exc;
        this.d = fArr;
        this.f4055e = rect;
        this.f4056f = rect2;
        this.f4057p = i2;
        this.f4058q = i5;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.String, java.io.InputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
        if (r2 == null) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.j.e(r8, r0)
            r0 = 0
            android.net.Uri r1 = r7.f4053b
            if (r1 == 0) goto L_0x00d7
            java.lang.String r2 = r1.getPath()
            r3 = 0
            if (r2 == 0) goto L_0x0024
            java.lang.String r4 = "file://"
            r5 = 2
            int r2 = F5.i.T0(r5, r2, r4, r3)
            if (r2 < 0) goto L_0x0024
            java.lang.String r8 = r1.getPath()
            kotlin.jvm.internal.j.b(r8)
        L_0x0021:
            r0 = r8
            goto L_0x00d7
        L_0x0024:
            java.lang.String r2 = r1.getScheme()
            java.lang.String r4 = "content"
            boolean r2 = kotlin.jvm.internal.j.a(r2, r4)
            if (r2 == 0) goto L_0x0041
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            android.content.ContentResolver r4 = r8.getContentResolver()
            java.lang.String r4 = r4.getType(r1)
            java.lang.String r2 = r2.getExtensionFromMimeType(r4)
            goto L_0x005a
        L_0x0041:
            java.lang.String r2 = r1.getPath()
            if (r2 == 0) goto L_0x0059
            java.io.File r4 = new java.io.File
            r4.<init>(r2)
            android.net.Uri r2 = android.net.Uri.fromFile(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r2)
            goto L_0x005a
        L_0x0059:
            r2 = r0
        L_0x005a:
            if (r2 != 0) goto L_0x005e
            java.lang.String r2 = ""
        L_0x005e:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = "yyyyMMdd_HHmmss"
            java.util.Locale r6 = java.util.Locale.getDefault()
            r4.<init>(r5, r6)
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            java.lang.String r4 = r4.format(r5)
            java.lang.String r5 = "temp_file_"
            java.lang.String r6 = "."
            java.lang.String r2 = h0.C0552a.p(r5, r4, r6, r2)
            java.io.File r4 = new java.io.File
            java.io.File r5 = r8.getCacheDir()
            r4.<init>(r5, r2)
            r4.createNewFile()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ Exception -> 0x00b1 }
            java.io.InputStream r0 = r8.openInputStream(r1)     // Catch:{ Exception -> 0x00b1 }
            if (r0 == 0) goto L_0x00a3
            r8 = 8192(0x2000, float:1.14794E-41)
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x00b1 }
        L_0x0099:
            int r1 = r0.read(r8)     // Catch:{ Exception -> 0x00b1 }
            if (r1 <= 0) goto L_0x00a3
            r2.write(r8, r3, r1)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x0099
        L_0x00a3:
            r2.flush()     // Catch:{ Exception -> 0x00b1 }
            if (r0 == 0) goto L_0x00ab
            r0.close()
        L_0x00ab:
            r2.close()
            goto L_0x00c3
        L_0x00af:
            r8 = move-exception
            goto L_0x00cc
        L_0x00b1:
            r8 = move-exception
            goto L_0x00b8
        L_0x00b3:
            r8 = move-exception
            r2 = r0
            goto L_0x00cc
        L_0x00b6:
            r8 = move-exception
            r2 = r0
        L_0x00b8:
            r8.printStackTrace()     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x00c0
            r0.close()
        L_0x00c0:
            if (r2 == 0) goto L_0x00c3
            goto L_0x00ab
        L_0x00c3:
            java.lang.String r8 = r4.getPath()
            kotlin.jvm.internal.j.b(r8)
            goto L_0x0021
        L_0x00cc:
            if (r0 == 0) goto L_0x00d1
            r0.close()
        L_0x00d1:
            if (r2 == 0) goto L_0x00d6
            r2.close()
        L_0x00d6:
            throw r8
        L_0x00d7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.y.a(android.content.Context):java.lang.String");
    }
}
