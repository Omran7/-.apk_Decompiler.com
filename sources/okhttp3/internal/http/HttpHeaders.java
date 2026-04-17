package okhttp3.internal.http;

import N5.g;
import com.google.android.gms.common.api.f;
import okhttp3.Response;

public final class HttpHeaders {
    static {
        g.k("\"\\");
        g.k("\t ,=");
    }

    private HttpHeaders() {
    }

    public static long a(Response response) {
        String a6 = response.f10653f.a("Content-Length");
        if (a6 == null) {
            return -1;
        }
        try {
            return Long.parseLong(a6);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean b(Response response) {
        if (response.f10649a.f10638b.equals("HEAD")) {
            return false;
        }
        int i2 = response.f10651c;
        if (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && a(response) == -1 && !"chunked".equalsIgnoreCase(response.d("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static int c(int i2, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return f.API_PRIORITY_OTHER;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x021e, code lost:
        if (okhttp3.internal.Util.f10696q.matcher(r0).matches() == false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x024f, code lost:
        if (r12 != false) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x035f, code lost:
        if (r0 == null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        r3 = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0345 A[LOOP:10: B:218:0x0342->B:220:0x0345, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(okhttp3.CookieJar r32, okhttp3.HttpUrl r33, okhttp3.Headers r34) {
        /*
            r1 = r33
            r0 = r34
            r2 = 1
            okhttp3.CookieJar r3 = okhttp3.CookieJar.f10548a
            r4 = r32
            if (r4 != r3) goto L_0x000c
            return
        L_0x000c:
            java.util.regex.Pattern r3 = okhttp3.Cookie.f10538j
            java.lang.String r3 = "Set-Cookie"
            int r5 = r34.d()
            r7 = 0
            r8 = r7
            r9 = 0
        L_0x0017:
            if (r8 >= r5) goto L_0x0034
            java.lang.String r10 = r0.b(r8)
            boolean r10 = r3.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0032
            if (r9 != 0) goto L_0x002b
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 2
            r9.<init>(r10)
        L_0x002b:
            java.lang.String r10 = r0.e(r8)
            r9.add(r10)
        L_0x0032:
            int r8 = r8 + r2
            goto L_0x0017
        L_0x0034:
            if (r9 == 0) goto L_0x003c
            java.util.List r0 = java.util.Collections.unmodifiableList(r9)
        L_0x003a:
            r3 = r0
            goto L_0x0041
        L_0x003c:
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x003a
        L_0x0041:
            int r5 = r3.size()
            r8 = r7
            r9 = 0
        L_0x0047:
            if (r8 >= r5) goto L_0x03de
            java.lang.Object r0 = r3.get(r8)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            long r11 = java.lang.System.currentTimeMillis()
            int r13 = r10.length()
            r14 = 59
            int r0 = okhttp3.internal.Util.i(r10, r7, r13, r14)
            r15 = 61
            int r6 = okhttp3.internal.Util.i(r10, r7, r0, r15)
            if (r6 != r0) goto L_0x006e
            r27 = r3
            r28 = r5
            r5 = r7
        L_0x006b:
            r0 = 0
            goto L_0x03c5
        L_0x006e:
            int r15 = okhttp3.internal.Util.s(r7, r6, r10)
            int r7 = okhttp3.internal.Util.t(r15, r6, r10)
            java.lang.String r7 = r10.substring(r15, r7)
            boolean r15 = r7.isEmpty()
            if (r15 != 0) goto L_0x03c1
            int r15 = r7.length()
            r14 = 0
        L_0x0085:
            if (r14 >= r15) goto L_0x009e
            char r2 = r7.charAt(r14)
            r27 = r3
            r3 = 31
            if (r2 <= r3) goto L_0x0095
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 < r3) goto L_0x0097
        L_0x0095:
            r2 = 1
            goto L_0x009c
        L_0x0097:
            r2 = 1
            int r14 = r14 + r2
            r3 = r27
            goto L_0x0085
        L_0x009c:
            r3 = -1
            goto L_0x00a3
        L_0x009e:
            r27 = r3
            r2 = 1
            r3 = -1
            r14 = -1
        L_0x00a3:
            if (r14 == r3) goto L_0x00a7
        L_0x00a5:
            goto L_0x03bc
        L_0x00a7:
            int r6 = r6 + r2
            int r2 = okhttp3.internal.Util.s(r6, r0, r10)
            int r3 = okhttp3.internal.Util.t(r2, r0, r10)
            java.lang.String r2 = r10.substring(r2, r3)
            int r3 = r2.length()
            r6 = 0
        L_0x00b9:
            if (r6 >= r3) goto L_0x00cf
            char r14 = r2.charAt(r6)
            r15 = 31
            if (r14 <= r15) goto L_0x00c7
            r15 = 127(0x7f, float:1.78E-43)
            if (r14 < r15) goto L_0x00c9
        L_0x00c7:
            r14 = 1
            goto L_0x00cc
        L_0x00c9:
            r14 = 1
            int r6 = r6 + r14
            goto L_0x00b9
        L_0x00cc:
            r3 = r6
        L_0x00cd:
            r6 = -1
            goto L_0x00d2
        L_0x00cf:
            r14 = 1
            r3 = -1
            goto L_0x00cd
        L_0x00d2:
            if (r3 == r6) goto L_0x00da
            r28 = r5
        L_0x00d6:
            r0 = 0
            r5 = 0
            goto L_0x03c5
        L_0x00da:
            int r0 = r0 + r14
            r17 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r21 = r17
            r3 = 0
            r6 = 0
            r19 = -1
            r23 = 0
            r24 = 0
            r25 = 1
            r26 = 0
        L_0x00ee:
            r28 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r30 = -9223372036854775808
            if (r0 >= r13) goto L_0x01c1
            r14 = 59
            int r15 = okhttp3.internal.Util.i(r10, r0, r13, r14)
            r14 = 61
            int r4 = okhttp3.internal.Util.i(r10, r0, r15, r14)
            int r0 = okhttp3.internal.Util.s(r0, r4, r10)
            int r14 = okhttp3.internal.Util.t(r0, r4, r10)
            java.lang.String r0 = r10.substring(r0, r14)
            if (r4 >= r15) goto L_0x0120
            r14 = 1
            int r4 = r4 + r14
            int r4 = okhttp3.internal.Util.s(r4, r15, r10)
            int r14 = okhttp3.internal.Util.t(r4, r15, r10)
            java.lang.String r4 = r10.substring(r4, r14)
            goto L_0x0122
        L_0x0120:
            java.lang.String r4 = ""
        L_0x0122:
            java.lang.String r14 = "expires"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x0137
            int r0 = r4.length()     // Catch:{ IllegalArgumentException -> 0x01a2 }
            long r21 = okhttp3.Cookie.b(r0, r4)     // Catch:{ IllegalArgumentException -> 0x01a2 }
        L_0x0132:
            r4 = 1
            r26 = 1
            goto L_0x01bb
        L_0x0137:
            java.lang.String r14 = "max-age"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x0167
            long r19 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x014f }
            r28 = 0
            int r0 = (r19 > r28 ? 1 : (r19 == r28 ? 0 : -1))
            if (r0 > 0) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r30 = r19
        L_0x014c:
            r19 = r30
            goto L_0x0132
        L_0x014f:
            r0 = move-exception
            r14 = r0
            java.lang.String r0 = "-?\\d+"
            boolean r0 = r4.matches(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x0166
            java.lang.String r0 = "-"
            boolean r0 = r4.startsWith(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x0163
            r28 = r30
        L_0x0163:
            r19 = r28
            goto L_0x0132
        L_0x0166:
            throw r14     // Catch:{  }
        L_0x0167:
            java.lang.String r14 = "domain"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x0199
            java.lang.String r0 = "."
            boolean r14 = r4.endsWith(r0)     // Catch:{ IllegalArgumentException -> 0x01a2 }
            if (r14 != 0) goto L_0x0193
            boolean r0 = r4.startsWith(r0)     // Catch:{ IllegalArgumentException -> 0x01a2 }
            if (r0 == 0) goto L_0x0182
            r14 = 1
            java.lang.String r4 = r4.substring(r14)     // Catch:{ IllegalArgumentException -> 0x01a2 }
        L_0x0182:
            java.lang.String r0 = okhttp3.internal.Util.c(r4)     // Catch:{ IllegalArgumentException -> 0x01a2 }
            if (r0 == 0) goto L_0x018d
            r3 = r0
            r4 = 1
            r25 = 0
            goto L_0x01bb
        L_0x018d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01a2 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x01a2 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x01a2 }
        L_0x0193:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01a2 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x01a2 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x01a2 }
        L_0x0199:
            java.lang.String r14 = "path"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x01a4
            r6 = r4
        L_0x01a2:
            r4 = 1
            goto L_0x01bb
        L_0x01a4:
            java.lang.String r4 = "secure"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x01b0
            r4 = 1
            r23 = 1
            goto L_0x01bb
        L_0x01b0:
            java.lang.String r4 = "httponly"
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L_0x01a2
            r4 = 1
            r24 = 1
        L_0x01bb:
            int r0 = r15 + 1
            r4 = r32
            goto L_0x00ee
        L_0x01c1:
            int r0 = (r19 > r30 ? 1 : (r19 == r30 ? 0 : -1))
            if (r0 != 0) goto L_0x01c8
            r19 = r30
            goto L_0x01ee
        L_0x01c8:
            r13 = -1
            int r0 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01ec
            r13 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x01db
            r13 = 1000(0x3e8, double:4.94E-321)
            long r28 = r19 * r13
        L_0x01db:
            long r28 = r11 + r28
            int r0 = (r28 > r11 ? 1 : (r28 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x01e9
            int r0 = (r28 > r17 ? 1 : (r28 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e6
            goto L_0x01e9
        L_0x01e6:
            r19 = r28
            goto L_0x01ee
        L_0x01e9:
            r19 = r17
            goto L_0x01ee
        L_0x01ec:
            r19 = r21
        L_0x01ee:
            java.lang.String r0 = r1.d
            r4 = 46
            if (r3 != 0) goto L_0x01f6
            r3 = r0
            goto L_0x0220
        L_0x01f6:
            boolean r10 = r0.equals(r3)
            if (r10 == 0) goto L_0x01fd
            goto L_0x0220
        L_0x01fd:
            boolean r10 = r0.endsWith(r3)
            if (r10 == 0) goto L_0x03bc
            int r10 = r0.length()
            int r11 = r3.length()
            int r10 = r10 - r11
            r11 = 1
            int r10 = r10 - r11
            char r10 = r0.charAt(r10)
            if (r10 != r4) goto L_0x03bc
            java.util.regex.Pattern r10 = okhttp3.internal.Util.f10696q
            java.util.regex.Matcher r10 = r10.matcher(r0)
            boolean r10 = r10.matches()
            if (r10 != 0) goto L_0x03bc
        L_0x0220:
            int r0 = r0.length()
            int r10 = r3.length()
            if (r0 == r10) goto L_0x036f
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r10 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.h
            r10.getClass()
            java.lang.String r0 = java.net.IDN.toUnicode(r3)
            java.lang.String r11 = "\\."
            java.lang.String[] r11 = r0.split(r11)
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f10934a
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0277
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f10934a
            r12 = 0
            r13 = 1
            boolean r0 = r0.compareAndSet(r12, r13)
            if (r0 == 0) goto L_0x0277
            r12 = 0
        L_0x024c:
            r10.b()     // Catch:{ InterruptedIOException -> 0x0268, IOException -> 0x025b }
            if (r12 == 0) goto L_0x0284
        L_0x0251:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0284
        L_0x0259:
            r0 = move-exception
            goto L_0x026d
        L_0x025b:
            r0 = move-exception
            r13 = r0
            okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.f10930a     // Catch:{ all -> 0x0259 }
            java.lang.String r14 = "Failed to read public suffix list"
            r15 = 5
            r0.l(r15, r14, r13)     // Catch:{ all -> 0x0259 }
            if (r12 == 0) goto L_0x0284
            goto L_0x0251
        L_0x0268:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0259 }
            r12 = 1
            goto L_0x024c
        L_0x026d:
            if (r12 == 0) goto L_0x0276
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0276:
            throw r0
        L_0x0277:
            java.util.concurrent.CountDownLatch r0 = r10.f10935b     // Catch:{ InterruptedException -> 0x027d }
            r0.await()     // Catch:{ InterruptedException -> 0x027d }
            goto L_0x0284
        L_0x027d:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0284:
            monitor-enter(r10)
            byte[] r0 = r10.f10936c     // Catch:{ all -> 0x0363 }
            if (r0 == 0) goto L_0x0365
            monitor-exit(r10)     // Catch:{ all -> 0x0363 }
            int r0 = r11.length
            byte[][] r12 = new byte[r0][]
            r13 = 0
        L_0x028e:
            int r14 = r11.length
            if (r13 >= r14) goto L_0x029e
            r14 = r11[r13]
            java.nio.charset.Charset r15 = okhttp3.internal.Util.f10688i
            byte[] r14 = r14.getBytes(r15)
            r12[r13] = r14
            r14 = 1
            int r13 = r13 + r14
            goto L_0x028e
        L_0x029e:
            r14 = 1
            r13 = 0
        L_0x02a0:
            if (r13 >= r0) goto L_0x02ad
            byte[] r15 = r10.f10936c
            java.lang.String r15 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(r15, r12, r13)
            if (r15 == 0) goto L_0x02ab
            goto L_0x02ae
        L_0x02ab:
            int r13 = r13 + r14
            goto L_0x02a0
        L_0x02ad:
            r15 = 0
        L_0x02ae:
            if (r0 <= r14) goto L_0x02cc
            java.lang.Object r13 = r12.clone()
            byte[][] r13 = (byte[][]) r13
            r28 = r5
            r4 = 0
        L_0x02b9:
            int r5 = r13.length
            int r5 = r5 - r14
            if (r4 >= r5) goto L_0x02ce
            byte[] r5 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f10932e
            r13[r4] = r5
            byte[] r5 = r10.f10936c
            java.lang.String r5 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(r5, r13, r4)
            if (r5 == 0) goto L_0x02ca
            goto L_0x02cf
        L_0x02ca:
            int r4 = r4 + r14
            goto L_0x02b9
        L_0x02cc:
            r28 = r5
        L_0x02ce:
            r5 = 0
        L_0x02cf:
            if (r5 == 0) goto L_0x02e1
            r4 = 0
        L_0x02d2:
            int r13 = r0 + -1
            if (r4 >= r13) goto L_0x02e1
            byte[] r13 = r10.d
            java.lang.String r13 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(r13, r12, r4)
            if (r13 == 0) goto L_0x02df
            goto L_0x02e2
        L_0x02df:
            int r4 = r4 + r14
            goto L_0x02d2
        L_0x02e1:
            r13 = 0
        L_0x02e2:
            if (r13 == 0) goto L_0x02f1
            java.lang.String r0 = "!"
            java.lang.String r0 = r0.concat(r13)
            java.lang.String r4 = "\\."
            java.lang.String[] r0 = r0.split(r4)
            goto L_0x0314
        L_0x02f1:
            if (r15 != 0) goto L_0x02f8
            if (r5 != 0) goto L_0x02f8
            java.lang.String[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.g
            goto L_0x0314
        L_0x02f8:
            if (r15 == 0) goto L_0x0301
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r15.split(r0)
            goto L_0x0303
        L_0x0301:
            java.lang.String[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f10933f
        L_0x0303:
            if (r5 == 0) goto L_0x030c
            java.lang.String r4 = "\\."
            java.lang.String[] r4 = r5.split(r4)
            goto L_0x030e
        L_0x030c:
            java.lang.String[] r4 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f10933f
        L_0x030e:
            int r5 = r0.length
            int r10 = r4.length
            if (r5 <= r10) goto L_0x0313
            goto L_0x0314
        L_0x0313:
            r0 = r4
        L_0x0314:
            int r4 = r11.length
            int r5 = r0.length
            r10 = 33
            if (r4 != r5) goto L_0x0325
            r4 = 0
            r5 = r0[r4]
            char r5 = r5.charAt(r4)
            if (r5 == r10) goto L_0x0326
            r0 = 0
            goto L_0x035f
        L_0x0325:
            r4 = 0
        L_0x0326:
            r5 = r0[r4]
            char r5 = r5.charAt(r4)
            if (r5 != r10) goto L_0x0332
            int r4 = r11.length
            int r0 = r0.length
        L_0x0330:
            int r4 = r4 - r0
            goto L_0x0337
        L_0x0332:
            int r4 = r11.length
            int r0 = r0.length
            r5 = 1
            int r0 = r0 + r5
            goto L_0x0330
        L_0x0337:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "\\."
            java.lang.String[] r5 = r3.split(r5)
        L_0x0342:
            int r10 = r5.length
            if (r4 >= r10) goto L_0x0352
            r10 = r5[r4]
            r0.append(r10)
            r10 = 46
            r0.append(r10)
            r11 = 1
            int r4 = r4 + r11
            goto L_0x0342
        L_0x0352:
            r11 = 1
            int r4 = r0.length()
            int r4 = r4 - r11
            r0.deleteCharAt(r4)
            java.lang.String r0 = r0.toString()
        L_0x035f:
            if (r0 != 0) goto L_0x0371
            goto L_0x00d6
        L_0x0363:
            r0 = move-exception
            goto L_0x036d
        L_0x0365:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0363 }
            java.lang.String r1 = "Unable to load publicsuffixes.gz resource from the classpath."
            r0.<init>(r1)     // Catch:{ all -> 0x0363 }
            throw r0     // Catch:{ all -> 0x0363 }
        L_0x036d:
            monitor-exit(r10)     // Catch:{ all -> 0x0363 }
            throw r0
        L_0x036f:
            r28 = r5
        L_0x0371:
            if (r6 == 0) goto L_0x0380
            java.lang.String r0 = "/"
            boolean r0 = r6.startsWith(r0)
            if (r0 != 0) goto L_0x037c
            goto L_0x0380
        L_0x037c:
            r22 = r6
            r5 = 0
            goto L_0x03ae
        L_0x0380:
            java.lang.String r0 = r1.f10562a
            int r0 = r0.length()
            int r0 = r0 + 3
            java.lang.String r4 = r1.f10567i
            r5 = 47
            int r0 = r4.indexOf(r5, r0)
            int r6 = r4.length()
            java.lang.String r10 = "?#"
            int r6 = okhttp3.internal.Util.j(r4, r0, r6, r10)
            java.lang.String r0 = r4.substring(r0, r6)
            int r4 = r0.lastIndexOf(r5)
            r5 = 0
            if (r4 == 0) goto L_0x03aa
            java.lang.String r0 = r0.substring(r5, r4)
            goto L_0x03ac
        L_0x03aa:
            java.lang.String r0 = "/"
        L_0x03ac:
            r22 = r0
        L_0x03ae:
            okhttp3.Cookie r0 = new okhttp3.Cookie
            r16 = r0
            r17 = r7
            r18 = r2
            r21 = r3
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26)
            goto L_0x03c5
        L_0x03bc:
            r28 = r5
            r5 = 0
            goto L_0x006b
        L_0x03c1:
            r27 = r3
            goto L_0x00a5
        L_0x03c5:
            if (r0 != 0) goto L_0x03c9
        L_0x03c7:
            r2 = 1
            goto L_0x03d4
        L_0x03c9:
            if (r9 != 0) goto L_0x03d0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x03d0:
            r9.add(r0)
            goto L_0x03c7
        L_0x03d4:
            int r8 = r8 + r2
            r4 = r32
            r7 = r5
            r3 = r27
            r5 = r28
            goto L_0x0047
        L_0x03de:
            if (r9 == 0) goto L_0x03e5
            java.util.List r0 = java.util.Collections.unmodifiableList(r9)
            goto L_0x03e9
        L_0x03e5:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x03e9:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03f0
            return
        L_0x03f0:
            r32.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.d(okhttp3.CookieJar, okhttp3.HttpUrl, okhttp3.Headers):void");
    }

    public static int e(int i2, String str, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }
}
