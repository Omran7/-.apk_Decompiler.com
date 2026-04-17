package T1;

import C0.a;
import com.google.android.gms.common.internal.I;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* renamed from: T1.c0  reason: case insensitive filesystem */
public final class C0159c0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3262a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final URL f3263b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f3264c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3265e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f3266f;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ a f3267p;

    public C0159c0(C0162d0 d0Var, String str, URL url, byte[] bArr, Map map, C0156b0 b0Var) {
        this.f3267p = d0Var;
        I.d(str);
        I.g(url);
        this.f3263b = url;
        this.f3264c = bArr;
        this.f3265e = b0Var;
        this.d = str;
        this.f3266f = map;
    }

    public void a(int i2, IOException iOException, byte[] bArr, Map map) {
        C0203r0 r0Var = ((C0212u0) ((C0169f1) this.f3267p).f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new C0166e1(this, i2, iOException, bArr, map));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: java.io.OutputStream} */
    /* JADX WARNING: type inference failed for: r6v21 */
    /* JADX WARNING: type inference failed for: r6v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0123, code lost:
        r8 = null;
        r7 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x027b A[SYNTHETIC, Splitter:B:144:0x027b] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006e A[Catch:{ IOException -> 0x00c5, all -> 0x006e, IOException -> 0x0071, all -> 0x006e }, ExcHandler: all (r6v24 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:7:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02a7 A[SYNTHETIC, Splitter:B:163:0x02a7] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x02dd A[SYNTHETIC, Splitter:B:173:0x02dd] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010b A[SYNTHETIC, Splitter:B:56:0x010b] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013c A[SYNTHETIC, Splitter:B:78:0x013c] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x015d A[SYNTHETIC, Splitter:B:88:0x015d] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.f3262a
            switch(r0) {
                case 0: goto L_0x0179;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r1 = r14.d
            C0.a r2 = r14.f3267p
            T1.f1 r2 = (T1.C0169f1) r2
            java.lang.Object r3 = r2.f398a
            T1.u0 r3 = (T1.C0212u0) r3
            java.lang.Object r2 = r2.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            T1.r0 r3 = r3.f3497s
            T1.C0212u0.k(r3)
            r3.s()
            r3 = 0
            r4 = 0
            java.net.URL r5 = r14.f3263b     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
            java.net.URLConnection r5 = r5.openConnection()     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
            boolean r6 = r5 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
            if (r6 == 0) goto L_0x012f
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
            r5.setDefaultUseCaches(r3)     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
            r2.getClass()     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
            r6 = 60000(0xea60, float:8.4078E-41)
            r5.setConnectTimeout(r6)     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
            r6 = 61000(0xee48, float:8.5479E-41)
            r5.setReadTimeout(r6)     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
            r5.setInstanceFollowRedirects(r3)     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
            r6 = 1
            r5.setDoInput(r6)     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
            java.util.Map r7 = r14.f3266f     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.util.HashMap r7 = (java.util.HashMap) r7     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            if (r7 == 0) goto L_0x0074
            java.util.Set r7 = r7.entrySet()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
        L_0x0052:
            boolean r8 = r7.hasNext()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            if (r8 == 0) goto L_0x0074
            java.lang.Object r8 = r7.next()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.lang.Object r9 = r8.getKey()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            r5.addRequestProperty(r9, r8)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            goto L_0x0052
        L_0x006e:
            r6 = move-exception
            goto L_0x0123
        L_0x0071:
            r6 = move-exception
            goto L_0x0126
        L_0x0074:
            byte[] r7 = r14.f3264c     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            if (r7 == 0) goto L_0x00d3
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00c5, all -> 0x006e }
            r8.<init>()     // Catch:{ IOException -> 0x00c5, all -> 0x006e }
            java.util.zip.GZIPOutputStream r9 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x00c5, all -> 0x006e }
            r9.<init>(r8)     // Catch:{ IOException -> 0x00c5, all -> 0x006e }
            r9.write(r7)     // Catch:{ IOException -> 0x00c5, all -> 0x006e }
            r9.close()     // Catch:{ IOException -> 0x00c5, all -> 0x006e }
            r8.close()     // Catch:{ IOException -> 0x00c5, all -> 0x006e }
            byte[] r7 = r8.toByteArray()     // Catch:{ IOException -> 0x00c5, all -> 0x006e }
            T1.Z r8 = r2.f3496r     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            T1.C0212u0.k(r8)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            T1.X r8 = r8.f3180w     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.lang.String r9 = "Uploading data. size"
            int r10 = r7.length     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            r8.b(r11, r9)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            r5.setDoOutput(r6)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r8 = "gzip"
            r5.addRequestProperty(r6, r8)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            r5.setFixedLengthStreamingMode(r10)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            r5.connect()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.io.OutputStream r6 = r5.getOutputStream()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            r6.write(r7)     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            r6.close()     // Catch:{ IOException -> 0x00bd, all -> 0x00bb }
            goto L_0x00d3
        L_0x00bb:
            r7 = move-exception
            goto L_0x00bf
        L_0x00bd:
            r7 = move-exception
            goto L_0x00c2
        L_0x00bf:
            r8 = r4
            goto L_0x013a
        L_0x00c2:
            r8 = r4
            goto L_0x015b
        L_0x00c5:
            r6 = move-exception
            T1.Z r7 = r2.f3496r     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            T1.C0212u0.k(r7)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            T1.X r7 = r7.f3172f     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.lang.String r8 = "Failed to gzip post request content"
            r7.b(r6, r8)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            throw r6     // Catch:{ IOException -> 0x0071, all -> 0x006e }
        L_0x00d3:
            int r6 = r5.getResponseCode()     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            java.util.Map r7 = r5.getHeaderFields()     // Catch:{ IOException -> 0x011e, all -> 0x0119 }
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0107 }
            r8.<init>()     // Catch:{ all -> 0x0107 }
            java.io.InputStream r9 = r5.getInputStream()     // Catch:{ all -> 0x0107 }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ all -> 0x00f2 }
        L_0x00e8:
            int r11 = r9.read(r10)     // Catch:{ all -> 0x00f2 }
            if (r11 <= 0) goto L_0x00f4
            r8.write(r10, r3, r11)     // Catch:{ all -> 0x00f2 }
            goto L_0x00e8
        L_0x00f2:
            r3 = move-exception
            goto L_0x0109
        L_0x00f4:
            byte[] r3 = r8.toByteArray()     // Catch:{ all -> 0x00f2 }
            r9.close()     // Catch:{ IOException -> 0x0105, all -> 0x0103 }
            r5.disconnect()
            r14.a(r6, r4, r3, r7)
            goto L_0x0178
        L_0x0103:
            r3 = move-exception
            goto L_0x010f
        L_0x0105:
            r3 = move-exception
            goto L_0x0114
        L_0x0107:
            r3 = move-exception
            r9 = r4
        L_0x0109:
            if (r9 == 0) goto L_0x010e
            r9.close()     // Catch:{ IOException -> 0x0105, all -> 0x0103 }
        L_0x010e:
            throw r3     // Catch:{ IOException -> 0x0105, all -> 0x0103 }
        L_0x010f:
            r8 = r7
            r7 = r3
            r3 = r6
            r6 = r4
            goto L_0x013a
        L_0x0114:
            r8 = r7
            r7 = r3
            r3 = r6
            r6 = r4
            goto L_0x015b
        L_0x0119:
            r7 = move-exception
            r8 = r4
            r3 = r6
        L_0x011c:
            r6 = r8
            goto L_0x013a
        L_0x011e:
            r7 = move-exception
            r8 = r4
            r3 = r6
        L_0x0121:
            r6 = r8
            goto L_0x015b
        L_0x0123:
            r8 = r4
            r7 = r6
            goto L_0x011c
        L_0x0126:
            r8 = r4
            r7 = r6
            goto L_0x0121
        L_0x0129:
            r5 = move-exception
            r7 = r5
            goto L_0x0137
        L_0x012c:
            r5 = move-exception
            r7 = r5
            goto L_0x0158
        L_0x012f:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
            java.lang.String r6 = "Failed to obtain HTTP connection"
            r5.<init>(r6)     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
            throw r5     // Catch:{ IOException -> 0x012c, all -> 0x0129 }
        L_0x0137:
            r5 = r4
            r6 = r5
            r8 = r6
        L_0x013a:
            if (r6 == 0) goto L_0x014f
            r6.close()     // Catch:{ IOException -> 0x0140 }
            goto L_0x014f
        L_0x0140:
            r6 = move-exception
            T1.Z r2 = r2.f3496r
            T1.C0212u0.k(r2)
            T1.Y r1 = T1.Z.w(r1)
            T1.X r2 = r2.f3172f
            r2.c(r0, r1, r6)
        L_0x014f:
            if (r5 == 0) goto L_0x0154
            r5.disconnect()
        L_0x0154:
            r14.a(r3, r4, r4, r8)
            throw r7
        L_0x0158:
            r5 = r4
            r6 = r5
            r8 = r6
        L_0x015b:
            if (r6 == 0) goto L_0x0170
            r6.close()     // Catch:{ IOException -> 0x0161 }
            goto L_0x0170
        L_0x0161:
            r6 = move-exception
            T1.Z r2 = r2.f3496r
            T1.C0212u0.k(r2)
            T1.Y r1 = T1.Z.w(r1)
            T1.X r2 = r2.f3172f
            r2.c(r0, r1, r6)
        L_0x0170:
            if (r5 == 0) goto L_0x0175
            r5.disconnect()
        L_0x0175:
            r14.a(r3, r7, r4, r8)
        L_0x0178:
            return
        L_0x0179:
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r1 = r14.d
            C0.a r2 = r14.f3267p
            T1.d0 r2 = (T1.C0162d0) r2
            java.lang.Object r3 = r2.f398a
            T1.u0 r3 = (T1.C0212u0) r3
            java.lang.Object r4 = r2.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            T1.r0 r3 = r3.f3497s
            T1.C0212u0.k(r3)
            r3.s()
            r3 = 0
            r5 = 0
            java.net.URL r6 = r14.f3263b     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
            boolean r7 = r6 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
            if (r7 == 0) goto L_0x029a
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
            r6.setDefaultUseCaches(r3)     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
            r4.getClass()     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
            r7 = 60000(0xea60, float:8.4078E-41)
            r6.setConnectTimeout(r7)     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
            r7 = 61000(0xee48, float:8.5479E-41)
            r6.setReadTimeout(r7)     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
            r6.setInstanceFollowRedirects(r3)     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
            r7 = 1
            r6.setDoInput(r7)     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
            java.util.Map r8 = r14.f3266f     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            if (r8 == 0) goto L_0x01e6
            java.util.Set r8 = r8.entrySet()     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
        L_0x01c4:
            boolean r9 = r8.hasNext()     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            if (r9 == 0) goto L_0x01e6
            java.lang.Object r9 = r8.next()     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            java.lang.Object r10 = r9.getKey()     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            r6.addRequestProperty(r10, r9)     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            goto L_0x01c4
        L_0x01e0:
            r2 = move-exception
            goto L_0x028f
        L_0x01e3:
            r2 = move-exception
            goto L_0x0292
        L_0x01e6:
            byte[] r8 = r14.f3264c     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            if (r8 == 0) goto L_0x0230
            T1.T1 r2 = r2.f2982b     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            T1.d0 r2 = r2.f3065p     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            T1.T1.L(r2)     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            byte[] r2 = r2.t(r8)     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            T1.Z r8 = r4.f3496r     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            T1.C0212u0.k(r8)     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            T1.X r8 = r8.f3180w     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            java.lang.String r9 = "Uploading data. size"
            int r10 = r2.length     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            r8.b(r11, r9)     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            r6.setDoOutput(r7)     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            java.lang.String r7 = "Content-Encoding"
            java.lang.String r8 = "gzip"
            r6.addRequestProperty(r7, r8)     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            r6.setFixedLengthStreamingMode(r10)     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            r6.connect()     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            java.io.OutputStream r7 = r6.getOutputStream()     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            r7.write(r2)     // Catch:{ IOException -> 0x0223, all -> 0x0221 }
            r7.close()     // Catch:{ IOException -> 0x0223, all -> 0x0221 }
            goto L_0x0230
        L_0x0221:
            r2 = move-exception
            goto L_0x0225
        L_0x0223:
            r2 = move-exception
            goto L_0x022a
        L_0x0225:
            r8 = r3
            r11 = r5
            r5 = r7
            goto L_0x02a5
        L_0x022a:
            r10 = r2
            r9 = r3
            r12 = r5
            r5 = r7
            goto L_0x02db
        L_0x0230:
            int r10 = r6.getResponseCode()     // Catch:{ IOException -> 0x01e3, all -> 0x01e0 }
            java.util.Map r13 = r6.getHeaderFields()     // Catch:{ IOException -> 0x028b, all -> 0x0287 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0277 }
            r2.<init>()     // Catch:{ all -> 0x0277 }
            java.io.InputStream r7 = r6.getInputStream()     // Catch:{ all -> 0x0277 }
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch:{ all -> 0x024f }
        L_0x0245:
            int r9 = r7.read(r8)     // Catch:{ all -> 0x024f }
            if (r9 <= 0) goto L_0x0251
            r2.write(r8, r3, r9)     // Catch:{ all -> 0x024f }
            goto L_0x0245
        L_0x024f:
            r2 = move-exception
            goto L_0x0279
        L_0x0251:
            byte[] r12 = r2.toByteArray()     // Catch:{ all -> 0x024f }
            r7.close()     // Catch:{ IOException -> 0x0275, all -> 0x0273 }
            r6.disconnect()
            T1.r0 r0 = r4.f3497s
            T1.C0212u0.k(r0)
            T1.W r1 = new T1.W
            java.lang.String r8 = r14.d
            java.lang.Object r2 = r14.f3265e
            r9 = r2
            T1.b0 r9 = (T1.C0156b0) r9
            r11 = 0
            r7 = r1
            r7.<init>((java.lang.String) r8, (T1.C0156b0) r9, (int) r10, (java.io.IOException) r11, (byte[]) r12, (java.util.Map) r13)
        L_0x026e:
            r0.y(r1)
            goto L_0x030a
        L_0x0273:
            r2 = move-exception
            goto L_0x027f
        L_0x0275:
            r2 = move-exception
            goto L_0x0282
        L_0x0277:
            r2 = move-exception
            r7 = r5
        L_0x0279:
            if (r7 == 0) goto L_0x027e
            r7.close()     // Catch:{ IOException -> 0x0275, all -> 0x0273 }
        L_0x027e:
            throw r2     // Catch:{ IOException -> 0x0275, all -> 0x0273 }
        L_0x027f:
            r8 = r10
            r11 = r13
            goto L_0x02a5
        L_0x0282:
            r9 = r10
            r12 = r13
        L_0x0284:
            r10 = r2
            goto L_0x02db
        L_0x0287:
            r2 = move-exception
            r11 = r5
            r8 = r10
            goto L_0x02a5
        L_0x028b:
            r2 = move-exception
            r12 = r5
            r9 = r10
            goto L_0x0284
        L_0x028f:
            r8 = r3
            r11 = r5
            goto L_0x02a5
        L_0x0292:
            r10 = r2
            r9 = r3
            r12 = r5
            goto L_0x02db
        L_0x0296:
            r2 = move-exception
            goto L_0x02a2
        L_0x0298:
            r2 = move-exception
            goto L_0x02d7
        L_0x029a:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
            java.lang.String r6 = "Failed to obtain HTTP connection"
            r2.<init>(r6)     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
            throw r2     // Catch:{ IOException -> 0x0298, all -> 0x0296 }
        L_0x02a2:
            r8 = r3
            r6 = r5
            r11 = r6
        L_0x02a5:
            if (r5 == 0) goto L_0x02ba
            r5.close()     // Catch:{ IOException -> 0x02ab }
            goto L_0x02ba
        L_0x02ab:
            r3 = move-exception
            T1.Z r5 = r4.f3496r
            T1.C0212u0.k(r5)
            T1.Y r1 = T1.Z.w(r1)
            T1.X r5 = r5.f3172f
            r5.c(r0, r1, r3)
        L_0x02ba:
            if (r6 == 0) goto L_0x02bf
            r6.disconnect()
        L_0x02bf:
            T1.r0 r0 = r4.f3497s
            T1.C0212u0.k(r0)
            T1.W r1 = new T1.W
            java.lang.Object r3 = r14.f3265e
            r7 = r3
            T1.b0 r7 = (T1.C0156b0) r7
            r9 = 0
            java.lang.String r6 = r14.d
            r10 = 0
            r5 = r1
            r5.<init>((java.lang.String) r6, (T1.C0156b0) r7, (int) r8, (java.io.IOException) r9, (byte[]) r10, (java.util.Map) r11)
            r0.y(r1)
            throw r2
        L_0x02d7:
            r10 = r2
            r9 = r3
            r6 = r5
            r12 = r6
        L_0x02db:
            if (r5 == 0) goto L_0x02f0
            r5.close()     // Catch:{ IOException -> 0x02e1 }
            goto L_0x02f0
        L_0x02e1:
            r2 = move-exception
            T1.Z r3 = r4.f3496r
            T1.C0212u0.k(r3)
            T1.Y r1 = T1.Z.w(r1)
            T1.X r3 = r3.f3172f
            r3.c(r0, r1, r2)
        L_0x02f0:
            if (r6 == 0) goto L_0x02f5
            r6.disconnect()
        L_0x02f5:
            T1.r0 r0 = r4.f3497s
            T1.C0212u0.k(r0)
            T1.W r1 = new T1.W
            java.lang.String r7 = r14.d
            java.lang.Object r2 = r14.f3265e
            r8 = r2
            T1.b0 r8 = (T1.C0156b0) r8
            r11 = 0
            r6 = r1
            r6.<init>((java.lang.String) r7, (T1.C0156b0) r8, (int) r9, (java.io.IOException) r10, (byte[]) r11, (java.util.Map) r12)
            goto L_0x026e
        L_0x030a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0159c0.run():void");
    }

    public C0159c0(C0169f1 f1Var, String str, URL url, byte[] bArr, HashMap hashMap, C0163d1 d1Var) {
        this.f3267p = f1Var;
        I.d(str);
        this.f3263b = url;
        this.f3264c = bArr;
        this.f3265e = d1Var;
        this.d = str;
        this.f3266f = hashMap;
    }
}
