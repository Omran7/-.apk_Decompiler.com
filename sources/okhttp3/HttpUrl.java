package okhttp3;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.Util;

public final class HttpUrl {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f10561j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f10562a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10563b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10564c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10565e;

    /* renamed from: f  reason: collision with root package name */
    public final List f10566f;
    public final List g;
    public final String h;

    /* renamed from: i  reason: collision with root package name */
    public final String f10567i;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f10568a;

        /* renamed from: b  reason: collision with root package name */
        public String f10569b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f10570c = "";
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public int f10571e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList f10572f;
        public ArrayList g;
        public String h;

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f10572f = arrayList;
            arrayList.add("");
        }

        public final HttpUrl a() {
            if (this.f10568a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.d != null) {
                return new HttpUrl(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0238, code lost:
            if (r1 <= 65535) goto L_0x023f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x020f  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x0262  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0278  */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x038b  */
        /* JADX WARNING: Removed duplicated region for block: B:193:0x0208 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0137  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01ec  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(okhttp3.HttpUrl r26, java.lang.String r27) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                r9 = r27
                int r2 = r27.length()
                r10 = 0
                int r8 = okhttp3.internal.Util.s(r10, r2, r9)
                int r2 = r27.length()
                int r11 = okhttp3.internal.Util.t(r8, r2, r9)
                int r2 = r11 - r8
                r12 = 2
                r13 = 58
                r14 = -1
                if (r2 >= r12) goto L_0x0021
            L_0x001f:
                r15 = r14
                goto L_0x0062
            L_0x0021:
                char r2 = r9.charAt(r8)
                r3 = 90
                r4 = 65
                r5 = 122(0x7a, float:1.71E-43)
                r6 = 97
                if (r2 < r6) goto L_0x0031
                if (r2 <= r5) goto L_0x0036
            L_0x0031:
                if (r2 < r4) goto L_0x001f
                if (r2 <= r3) goto L_0x0036
                goto L_0x001f
            L_0x0036:
                int r2 = r8 + 1
            L_0x0038:
                if (r2 >= r11) goto L_0x001f
                char r7 = r9.charAt(r2)
                if (r7 < r6) goto L_0x0042
                if (r7 <= r5) goto L_0x005f
            L_0x0042:
                if (r7 < r4) goto L_0x0046
                if (r7 <= r3) goto L_0x005f
            L_0x0046:
                r15 = 48
                if (r7 < r15) goto L_0x004e
                r15 = 57
                if (r7 <= r15) goto L_0x005f
            L_0x004e:
                r15 = 43
                if (r7 == r15) goto L_0x005f
                r15 = 45
                if (r7 == r15) goto L_0x005f
                r15 = 46
                if (r7 != r15) goto L_0x005b
                goto L_0x005f
            L_0x005b:
                if (r7 != r13) goto L_0x001f
                r15 = r2
                goto L_0x0062
            L_0x005f:
                int r2 = r2 + 1
                goto L_0x0038
            L_0x0062:
                if (r15 == r14) goto L_0x00ab
                r3 = 1
                java.lang.String r5 = "https:"
                r6 = 0
                r7 = 6
                r2 = r27
                r4 = r8
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x0079
                java.lang.String r2 = "https"
                r0.f10568a = r2
                int r8 = r8 + 6
                goto L_0x00b1
            L_0x0079:
                r3 = 1
                java.lang.String r5 = "http:"
                r6 = 0
                r7 = 5
                r2 = r27
                r4 = r8
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x008e
                java.lang.String r2 = "http"
                r0.f10568a = r2
                int r8 = r8 + 5
                goto L_0x00b1
            L_0x008e:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Expected URL scheme 'http' or 'https' but was '"
                r2.<init>(r3)
                java.lang.String r3 = r9.substring(r10, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00ab:
                if (r1 == 0) goto L_0x03a8
                java.lang.String r2 = r1.f10562a
                r0.f10568a = r2
            L_0x00b1:
                r2 = r8
                r3 = r10
            L_0x00b3:
                r15 = 47
                r7 = 92
                if (r2 >= r11) goto L_0x00c6
                char r4 = r9.charAt(r2)
                if (r4 == r7) goto L_0x00c1
                if (r4 != r15) goto L_0x00c6
            L_0x00c1:
                int r3 = r3 + 1
                int r2 = r2 + 1
                goto L_0x00b3
            L_0x00c6:
                java.util.ArrayList r6 = r0.f10572f
                r16 = 1
                r5 = 63
                r4 = 35
                if (r3 >= r12) goto L_0x0129
                if (r1 == 0) goto L_0x0129
                java.lang.String r2 = r1.f10562a
                java.lang.String r12 = r0.f10568a
                boolean r2 = r2.equals(r12)
                if (r2 != 0) goto L_0x00dd
                goto L_0x0129
            L_0x00dd:
                java.lang.String r2 = r26.f()
                r0.f10569b = r2
                java.lang.String r2 = r26.c()
                r0.f10570c = r2
                java.lang.String r2 = r1.d
                r0.d = r2
                int r2 = r1.f10565e
                r0.f10571e = r2
                r6.clear()
                java.util.ArrayList r2 = r26.d()
                r6.addAll(r2)
                if (r8 == r11) goto L_0x0103
                char r2 = r9.charAt(r8)
                if (r2 != r4) goto L_0x0125
            L_0x0103:
                java.lang.String r17 = r26.e()
                if (r17 == 0) goto L_0x0122
                int r19 = r17.length()
                r21 = 1
                r22 = 0
                r18 = 0
                java.lang.String r20 = " \"'<>#"
                r23 = 1
                r24 = 1
                java.lang.String r1 = okhttp3.HttpUrl.a(r17, r18, r19, r20, r21, r22, r23, r24)
                java.util.ArrayList r1 = okhttp3.HttpUrl.j(r1)
                goto L_0x0123
            L_0x0122:
                r1 = 0
            L_0x0123:
                r0.g = r1
            L_0x0125:
                r21 = r6
                goto L_0x0279
            L_0x0129:
                int r8 = r8 + r3
                r12 = r8
                r17 = r10
                r18 = r17
            L_0x012f:
                java.lang.String r1 = "@/\\?#"
                int r8 = okhttp3.internal.Util.j(r9, r12, r11, r1)
                if (r8 == r11) goto L_0x013c
                char r1 = r9.charAt(r8)
                goto L_0x013d
            L_0x013c:
                r1 = r14
            L_0x013d:
                if (r1 == r14) goto L_0x01e6
                if (r1 == r4) goto L_0x01e6
                if (r1 == r15) goto L_0x01e6
                if (r1 == r7) goto L_0x01e6
                if (r1 == r5) goto L_0x01e6
                r2 = 64
                if (r1 == r2) goto L_0x014f
                r21 = r6
                goto L_0x01da
            L_0x014f:
                java.lang.String r3 = "%40"
                if (r17 != 0) goto L_0x01ac
                int r2 = okhttp3.internal.Util.i(r9, r12, r8, r13)
                r19 = 0
                r20 = 0
                java.lang.String r21 = " \"':;<=>@[]^`{}|/\\?#"
                r22 = 1
                r23 = 1
                r1 = r27
                r26 = r2
                r2 = r12
                r12 = r3
                r3 = r26
                r4 = r21
                r5 = r22
                r21 = r6
                r6 = r19
                r7 = r20
                r15 = r8
                r8 = r23
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8)
                if (r18 == 0) goto L_0x0190
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f10569b
                r2.append(r3)
                r2.append(r12)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x0190:
                r0.f10569b = r1
                r1 = r26
                if (r1 == r15) goto L_0x01a9
                int r2 = r1 + 1
                r6 = 0
                r7 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r8 = 1
                r1 = r27
                r3 = r15
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8)
                r0.f10570c = r1
                r17 = r16
            L_0x01a9:
                r18 = r16
                goto L_0x01d8
            L_0x01ac:
                r1 = r3
                r21 = r6
                r15 = r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r2 = r0.f10570c
                r8.append(r2)
                r8.append(r1)
                r6 = 0
                r7 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r5 = 1
                r20 = 1
                r1 = r27
                r2 = r12
                r3 = r15
                r12 = r8
                r8 = r20
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8)
                r12.append(r1)
                java.lang.String r1 = r12.toString()
                r0.f10570c = r1
            L_0x01d8:
                int r12 = r15 + 1
            L_0x01da:
                r6 = r21
                r4 = 35
                r5 = 63
                r7 = 92
                r15 = 47
                goto L_0x012f
            L_0x01e6:
                r21 = r6
                r15 = r8
                r8 = r12
            L_0x01ea:
                if (r8 >= r15) goto L_0x0208
                char r1 = r9.charAt(r8)
                if (r1 == r13) goto L_0x0206
                r2 = 91
                if (r1 == r2) goto L_0x01f7
                goto L_0x0203
            L_0x01f7:
                int r8 = r8 + 1
                if (r8 >= r15) goto L_0x0203
                char r1 = r9.charAt(r8)
                r2 = 93
                if (r1 != r2) goto L_0x01f7
            L_0x0203:
                int r8 = r8 + 1
                goto L_0x01ea
            L_0x0206:
                r13 = r8
                goto L_0x0209
            L_0x0208:
                r13 = r15
            L_0x0209:
                int r8 = r13 + 1
                r7 = 34
                if (r8 >= r15) goto L_0x0262
                java.lang.String r1 = okhttp3.HttpUrl.g(r12, r13, r9, r10)
                java.lang.String r1 = okhttp3.internal.Util.c(r1)
                r0.d = r1
                java.lang.String r4 = ""
                r17 = 1
                r5 = 0
                r6 = 0
                r18 = 0
                r1 = r27
                r2 = r8
                r3 = r15
                r10 = r7
                r7 = r18
                r10 = r8
                r8 = r17
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ NumberFormatException -> 0x023b }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x023b }
                if (r1 <= 0) goto L_0x023b
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r1 > r2) goto L_0x023b
                goto L_0x023f
            L_0x023b:
                r1 = r14
                goto L_0x023f
            L_0x023d:
                r10 = r8
                goto L_0x023b
            L_0x023f:
                r0.f10571e = r1
                if (r1 == r14) goto L_0x0245
                r10 = 0
                goto L_0x0274
            L_0x0245:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Invalid URL port: \""
                r2.<init>(r3)
                java.lang.String r3 = r9.substring(r10, r15)
                r2.append(r3)
                r3 = 34
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0262:
                java.lang.String r1 = okhttp3.HttpUrl.g(r12, r13, r9, r10)
                java.lang.String r1 = okhttp3.internal.Util.c(r1)
                r0.d = r1
                java.lang.String r1 = r0.f10568a
                int r1 = okhttp3.HttpUrl.b(r1)
                r0.f10571e = r1
            L_0x0274:
                java.lang.String r1 = r0.d
                if (r1 == 0) goto L_0x038b
                r8 = r15
            L_0x0279:
                java.lang.String r1 = "?#"
                int r12 = okhttp3.internal.Util.j(r9, r8, r11, r1)
                if (r8 != r12) goto L_0x0283
                goto L_0x0348
            L_0x0283:
                char r1 = r9.charAt(r8)
                java.lang.String r13 = ""
                r2 = 47
                if (r1 == r2) goto L_0x0291
                r2 = 92
                if (r1 != r2) goto L_0x0294
            L_0x0291:
                r14 = r21
                goto L_0x02a0
            L_0x0294:
                int r1 = r21.size()
                int r1 = r1 + -1
                r14 = r21
                r14.set(r1, r13)
                goto L_0x02a8
            L_0x02a0:
                r14.clear()
                r14.add(r13)
                int r8 = r8 + 1
            L_0x02a8:
                r2 = r8
            L_0x02a9:
                if (r2 >= r12) goto L_0x0348
                java.lang.String r1 = "/\\"
                int r15 = okhttp3.internal.Util.j(r9, r2, r12, r1)
                if (r15 >= r12) goto L_0x02b6
                r17 = r16
                goto L_0x02b8
            L_0x02b6:
                r17 = r10
            L_0x02b8:
                r6 = 0
                r7 = 0
                java.lang.String r4 = " \"<>^`{}|/\\?#"
                r5 = 1
                r8 = 1
                r1 = r27
                r3 = r15
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8)
                java.lang.String r2 = "."
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0341
                java.lang.String r2 = "%2e"
                boolean r2 = r1.equalsIgnoreCase(r2)
                if (r2 == 0) goto L_0x02d6
                goto L_0x0341
            L_0x02d6:
                java.lang.String r2 = ".."
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x031c
                java.lang.String r2 = "%2e."
                boolean r2 = r1.equalsIgnoreCase(r2)
                if (r2 != 0) goto L_0x031c
                java.lang.String r2 = ".%2e"
                boolean r2 = r1.equalsIgnoreCase(r2)
                if (r2 != 0) goto L_0x031c
                java.lang.String r2 = "%2e%2e"
                boolean r2 = r1.equalsIgnoreCase(r2)
                if (r2 == 0) goto L_0x02f7
                goto L_0x031c
            L_0x02f7:
                int r2 = r14.size()
                int r2 = r2 + -1
                java.lang.Object r2 = r14.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0313
                int r2 = r14.size()
                int r2 = r2 + -1
                r14.set(r2, r1)
                goto L_0x0316
            L_0x0313:
                r14.add(r1)
            L_0x0316:
                if (r17 == 0) goto L_0x0341
                r14.add(r13)
                goto L_0x0341
            L_0x031c:
                int r1 = r14.size()
                int r1 = r1 + -1
                java.lang.Object r1 = r14.remove(r1)
                java.lang.String r1 = (java.lang.String) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x033e
                boolean r1 = r14.isEmpty()
                if (r1 != 0) goto L_0x033e
                int r1 = r14.size()
                int r1 = r1 + -1
                r14.set(r1, r13)
                goto L_0x0341
            L_0x033e:
                r14.add(r13)
            L_0x0341:
                if (r17 == 0) goto L_0x0345
                int r15 = r15 + 1
            L_0x0345:
                r2 = r15
                goto L_0x02a9
            L_0x0348:
                if (r12 >= r11) goto L_0x036f
                char r1 = r9.charAt(r12)
                r2 = 63
                if (r1 != r2) goto L_0x036f
                r10 = 35
                int r13 = okhttp3.internal.Util.i(r9, r12, r11, r10)
                int r2 = r12 + 1
                r6 = 0
                r7 = 1
                java.lang.String r4 = " \"'<>#"
                r5 = 1
                r8 = 1
                r1 = r27
                r3 = r13
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8)
                java.util.ArrayList r1 = okhttp3.HttpUrl.j(r1)
                r0.g = r1
                r12 = r13
                goto L_0x0371
            L_0x036f:
                r10 = 35
            L_0x0371:
                if (r12 >= r11) goto L_0x038a
                char r1 = r9.charAt(r12)
                if (r1 != r10) goto L_0x038a
                int r2 = r12 + 1
                r6 = 0
                r7 = 0
                java.lang.String r4 = ""
                r5 = 1
                r8 = 0
                r1 = r27
                r3 = r11
                java.lang.String r1 = okhttp3.HttpUrl.a(r1, r2, r3, r4, r5, r6, r7, r8)
                r0.h = r1
            L_0x038a:
                return
            L_0x038b:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Invalid URL host: \""
                r2.<init>(r3)
                java.lang.String r3 = r9.substring(r12, r13)
                r2.append(r3)
                r3 = 34
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x03a8:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.b(okhttp3.HttpUrl, java.lang.String):void");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f10568a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f10569b.isEmpty() || !this.f10570c.isEmpty()) {
                sb.append(this.f10569b);
                if (!this.f10570c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f10570c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            int i2 = this.f10571e;
            if (!(i2 == -1 && this.f10568a == null)) {
                if (i2 == -1) {
                    i2 = HttpUrl.b(this.f10568a);
                }
                String str3 = this.f10568a;
                if (str3 == null || i2 != HttpUrl.b(str3)) {
                    sb.append(':');
                    sb.append(i2);
                }
            }
            ArrayList arrayList = this.f10572f;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                sb.append('/');
                sb.append((String) arrayList.get(i5));
            }
            if (this.g != null) {
                sb.append('?');
                ArrayList arrayList2 = this.g;
                int size2 = arrayList2.size();
                for (int i6 = 0; i6 < size2; i6 += 2) {
                    String str4 = (String) arrayList2.get(i6);
                    String str5 = (String) arrayList2.get(i6 + 1);
                    if (i6 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                }
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }
    }

    public HttpUrl(Builder builder) {
        List list;
        this.f10562a = builder.f10568a;
        String str = builder.f10569b;
        this.f10563b = g(0, str.length(), str, false);
        String str2 = builder.f10570c;
        this.f10564c = g(0, str2.length(), str2, false);
        this.d = builder.d;
        int i2 = builder.f10571e;
        this.f10565e = i2 == -1 ? b(builder.f10568a) : i2;
        this.f10566f = h(builder.f10572f, false);
        ArrayList arrayList = builder.g;
        String str3 = null;
        if (arrayList != null) {
            list = h(arrayList, true);
        } else {
            list = null;
        }
        this.g = list;
        String str4 = builder.h;
        this.h = str4 != null ? g(0, str4.length(), str4, false) : str3;
        this.f10567i = builder.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: N5.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: N5.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: N5.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: N5.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: N5.d} */
    /* JADX WARNING: type inference failed for: r4v1, types: [N5.d, java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r17
        L_0x0008:
            if (r3 >= r1) goto L_0x00cc
            int r4 = r0.codePointAt(r3)
            r5 = 43
            r6 = 37
            r7 = -1
            r8 = 128(0x80, float:1.794E-43)
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 32
            if (r4 < r10) goto L_0x003e
            if (r4 == r9) goto L_0x003e
            if (r4 < r8) goto L_0x0021
            if (r23 != 0) goto L_0x003e
        L_0x0021:
            int r11 = r2.indexOf(r4)
            if (r11 != r7) goto L_0x003e
            if (r4 != r6) goto L_0x0033
            if (r20 == 0) goto L_0x003e
            if (r21 == 0) goto L_0x0033
            boolean r11 = i(r3, r1, r0)
            if (r11 == 0) goto L_0x003e
        L_0x0033:
            if (r4 != r5) goto L_0x0038
            if (r22 == 0) goto L_0x0038
            goto L_0x003e
        L_0x0038:
            int r4 = java.lang.Character.charCount(r4)
            int r3 = r3 + r4
            goto L_0x0008
        L_0x003e:
            N5.d r4 = new N5.d
            r4.<init>()
            r11 = r17
            r4.C(r11, r3, r0)
            r11 = 0
        L_0x0049:
            if (r3 >= r1) goto L_0x00c7
            int r12 = r0.codePointAt(r3)
            if (r20 == 0) goto L_0x0062
            r13 = 9
            if (r12 == r13) goto L_0x00c1
            r13 = 10
            if (r12 == r13) goto L_0x00c1
            r13 = 12
            if (r12 == r13) goto L_0x00c1
            r13 = 13
            if (r12 != r13) goto L_0x0062
            goto L_0x00c1
        L_0x0062:
            if (r12 != r5) goto L_0x0076
            if (r22 == 0) goto L_0x0076
            if (r20 == 0) goto L_0x006b
            java.lang.String r13 = "+"
            goto L_0x006d
        L_0x006b:
            java.lang.String r13 = "%2B"
        L_0x006d:
            int r14 = r13.length()
            r15 = 0
            r4.C(r15, r14, r13)
            goto L_0x00c1
        L_0x0076:
            if (r12 < r10) goto L_0x0095
            if (r12 == r9) goto L_0x0095
            if (r12 < r8) goto L_0x007e
            if (r23 != 0) goto L_0x0095
        L_0x007e:
            int r13 = r2.indexOf(r12)
            if (r13 != r7) goto L_0x0095
            if (r12 != r6) goto L_0x0091
            if (r20 == 0) goto L_0x0095
            if (r21 == 0) goto L_0x0091
            boolean r13 = i(r3, r1, r0)
            if (r13 != 0) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r4.D(r12)
            goto L_0x00c1
        L_0x0095:
            if (r11 != 0) goto L_0x009c
            N5.d r11 = new N5.d
            r11.<init>()
        L_0x009c:
            r11.D(r12)
        L_0x009f:
            boolean r13 = r11.d()
            if (r13 != 0) goto L_0x00c1
            byte r13 = r11.m()
            r14 = r13 & 255(0xff, float:3.57E-43)
            r4.A(r6)
            char[] r15 = f10561j
            int r14 = r14 >> 4
            r14 = r14 & 15
            char r14 = r15[r14]
            r4.A(r14)
            r13 = r13 & 15
            char r13 = r15[r13]
            r4.A(r13)
            goto L_0x009f
        L_0x00c1:
            int r12 = java.lang.Character.charCount(r12)
            int r3 = r3 + r12
            goto L_0x0049
        L_0x00c7:
            java.lang.String r0 = r4.u()
            return r0
        L_0x00cc:
            r11 = r17
            java.lang.String r0 = r16.substring(r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean):java.lang.String");
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [N5.d, java.lang.Object] */
    public static String g(int i2, int i5, String str, boolean z3) {
        int i6;
        int i7 = i2;
        while (i7 < i5) {
            char charAt = str.charAt(i7);
            if (charAt == '%' || (charAt == '+' && z3)) {
                ? obj = new Object();
                obj.C(i2, i7, str);
                while (i7 < i5) {
                    int codePointAt = str.codePointAt(i7);
                    if (codePointAt == 37 && (i6 = i7 + 2) < i5) {
                        int g5 = Util.g(str.charAt(i7 + 1));
                        int g6 = Util.g(str.charAt(i6));
                        if (!(g5 == -1 || g6 == -1)) {
                            obj.A((g5 << 4) + g6);
                            i7 = i6;
                            i7 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z3) {
                        obj.A(32);
                        i7 += Character.charCount(codePointAt);
                    }
                    obj.D(codePointAt);
                    i7 += Character.charCount(codePointAt);
                }
                return obj.u();
            }
            i7++;
        }
        return str.substring(i2, i5);
    }

    public static List h(ArrayList arrayList, boolean z3) {
        String str;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) arrayList.get(i2);
            if (str2 != null) {
                str = g(0, str2.length(), str2, z3);
            } else {
                str = null;
            }
            arrayList2.add(str);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean i(int i2, int i5, String str) {
        int i6 = i2 + 2;
        if (i6 >= i5 || str.charAt(i2) != '%' || Util.g(str.charAt(i2 + 1)) == -1 || Util.g(str.charAt(i6)) == -1) {
            return false;
        }
        return true;
    }

    public static ArrayList j(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public final String c() {
        if (this.f10564c.isEmpty()) {
            return "";
        }
        String str = this.f10567i;
        return str.substring(str.indexOf(58, this.f10562a.length() + 3) + 1, str.indexOf(64));
    }

    public final ArrayList d() {
        String str = this.f10567i;
        int indexOf = str.indexOf(47, this.f10562a.length() + 3);
        int j6 = Util.j(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < j6) {
            int i2 = indexOf + 1;
            int i5 = Util.i(str, i2, j6, '/');
            arrayList.add(str.substring(i2, i5));
            indexOf = i5;
        }
        return arrayList;
    }

    public final String e() {
        if (this.g == null) {
            return null;
        }
        String str = this.f10567i;
        int indexOf = str.indexOf(63) + 1;
        return str.substring(indexOf, Util.i(str, indexOf, str.length(), '#'));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HttpUrl) || !((HttpUrl) obj).f10567i.equals(this.f10567i)) {
            return false;
        }
        return true;
    }

    public final String f() {
        if (this.f10563b.isEmpty()) {
            return "";
        }
        int length = this.f10562a.length() + 3;
        String str = this.f10567i;
        return str.substring(length, Util.j(str, length, str.length(), ":@"));
    }

    public final int hashCode() {
        return this.f10567i.hashCode();
    }

    public final URI k() {
        ArrayList arrayList;
        Builder builder = new Builder();
        String str = this.f10562a;
        builder.f10568a = str;
        builder.f10569b = f();
        builder.f10570c = c();
        builder.d = this.d;
        int b6 = b(str);
        int i2 = this.f10565e;
        if (i2 == b6) {
            i2 = -1;
        }
        builder.f10571e = i2;
        ArrayList arrayList2 = builder.f10572f;
        arrayList2.clear();
        arrayList2.addAll(d());
        String e6 = e();
        String str2 = null;
        if (e6 != null) {
            arrayList = j(a(e6, 0, e6.length(), " \"'<>#", true, false, true, true));
        } else {
            arrayList = null;
        }
        builder.g = arrayList;
        if (this.h != null) {
            String str3 = this.f10567i;
            str2 = str3.substring(str3.indexOf(35) + 1);
        }
        builder.h = str2;
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            String str4 = (String) arrayList2.get(i5);
            arrayList2.set(i5, a(str4, 0, str4.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList3 = builder.g;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i6 = 0; i6 < size2; i6++) {
                String str5 = (String) builder.g.get(i6);
                if (str5 != null) {
                    builder.g.set(i6, a(str5, 0, str5.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str6 = builder.h;
        if (str6 != null) {
            builder.h = a(str6, 0, str6.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String builder2 = builder.toString();
        try {
            return new URI(builder2);
        } catch (URISyntaxException e7) {
            try {
                return URI.create(builder2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final String toString() {
        return this.f10567i;
    }
}
