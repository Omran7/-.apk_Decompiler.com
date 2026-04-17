package okhttp3;

import com.google.android.gms.common.api.f;
import java.util.concurrent.TimeUnit;

public final class CacheControl {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10489a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10490b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10491c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10492e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10493f;
    public final boolean g;
    public final int h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10494i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f10495j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f10496k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f10497l;

    /* renamed from: m  reason: collision with root package name */
    public String f10498m;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10499a;

        /* renamed from: b  reason: collision with root package name */
        public int f10500b = -1;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10501c;
    }

    static {
        Builder builder = new Builder();
        builder.f10499a = true;
        new CacheControl(builder);
        Builder builder2 = new Builder();
        builder2.f10501c = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int i2 = f.API_PRIORITY_OTHER;
        long seconds = timeUnit.toSeconds((long) f.API_PRIORITY_OTHER);
        if (seconds <= 2147483647L) {
            i2 = (int) seconds;
        }
        builder2.f10500b = i2;
        new CacheControl(builder2);
    }

    public CacheControl(boolean z3, boolean z4, int i2, int i5, boolean z5, boolean z6, boolean z7, int i6, int i7, boolean z8, boolean z9, boolean z10, String str) {
        this.f10489a = z3;
        this.f10490b = z4;
        this.f10491c = i2;
        this.d = i5;
        this.f10492e = z5;
        this.f10493f = z6;
        this.g = z7;
        this.h = i6;
        this.f10494i = i7;
        this.f10495j = z8;
        this.f10496k = z9;
        this.f10497l = z10;
        this.f10498m = str;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 192 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.CacheControl a(okhttp3.Headers r22) {
        /*
            r0 = r22
            int r1 = r22.d()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x0158
            java.lang.String r2 = r0.b(r6)
            java.lang.String r5 = r0.e(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0032
            if (r8 == 0) goto L_0x0030
        L_0x002e:
            r7 = 0
            goto L_0x003b
        L_0x0030:
            r8 = r5
            goto L_0x003b
        L_0x0032:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0151
            goto L_0x002e
        L_0x003b:
            r2 = 0
        L_0x003c:
            int r3 = r5.length()
            if (r2 >= r3) goto L_0x0151
            java.lang.String r3 = "=,;"
            int r3 = okhttp3.internal.http.HttpHeaders.e(r2, r5, r3)
            java.lang.String r2 = r5.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r4 = r5.length()
            if (r3 == r4) goto L_0x0066
            char r4 = r5.charAt(r3)
            r0 = 44
            if (r4 == r0) goto L_0x0066
            char r0 = r5.charAt(r3)
            r4 = 59
            if (r0 != r4) goto L_0x007b
        L_0x0066:
            r4 = 1
            goto L_0x00ab
        L_0x0068:
            int r0 = r5.length()
            if (r3 >= r0) goto L_0x007e
            char r0 = r5.charAt(r3)
            r4 = 32
            if (r0 == r4) goto L_0x007b
            r4 = 9
            if (r0 == r4) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            int r3 = r3 + 1
            goto L_0x0068
        L_0x007e:
            int r0 = r5.length()
            if (r3 >= r0) goto L_0x009b
            char r0 = r5.charAt(r3)
            r4 = 34
            if (r0 != r4) goto L_0x009b
            int r3 = r3 + 1
            java.lang.String r0 = "\""
            int r0 = okhttp3.internal.http.HttpHeaders.e(r3, r5, r0)
            java.lang.String r3 = r5.substring(r3, r0)
            r4 = 1
            int r0 = r0 + r4
            goto L_0x00af
        L_0x009b:
            r4 = 1
            java.lang.String r0 = ",;"
            int r0 = okhttp3.internal.http.HttpHeaders.e(r3, r5, r0)
            java.lang.String r3 = r5.substring(r3, r0)
            java.lang.String r3 = r3.trim()
            goto L_0x00af
        L_0x00ab:
            int r3 = r3 + 1
            r0 = r3
            r3 = 0
        L_0x00af:
            java.lang.String r4 = "no-cache"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00bb
            r4 = -1
            r9 = 1
            goto L_0x014c
        L_0x00bb:
            java.lang.String r4 = "no-store"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00c7
            r4 = -1
            r10 = 1
            goto L_0x014c
        L_0x00c7:
            java.lang.String r4 = "max-age"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00d7
            r4 = -1
            int r2 = okhttp3.internal.http.HttpHeaders.c(r4, r3)
            r11 = r2
            goto L_0x014c
        L_0x00d7:
            java.lang.String r4 = "s-maxage"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00e7
            r4 = -1
            int r2 = okhttp3.internal.http.HttpHeaders.c(r4, r3)
            r12 = r2
            goto L_0x014c
        L_0x00e7:
            java.lang.String r4 = "private"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00f2
            r4 = -1
            r13 = 1
            goto L_0x014c
        L_0x00f2:
            java.lang.String r4 = "public"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00fd
            r4 = -1
            r14 = 1
            goto L_0x014c
        L_0x00fd:
            java.lang.String r4 = "must-revalidate"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x0108
            r4 = -1
            r15 = 1
            goto L_0x014c
        L_0x0108:
            java.lang.String r4 = "max-stale"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x011b
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r2 = okhttp3.internal.http.HttpHeaders.c(r2, r3)
            r16 = r2
            r4 = -1
            goto L_0x014c
        L_0x011b:
            java.lang.String r4 = "min-fresh"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x012b
            r4 = -1
            int r2 = okhttp3.internal.http.HttpHeaders.c(r4, r3)
            r17 = r2
            goto L_0x014c
        L_0x012b:
            r4 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0137
            r18 = 1
            goto L_0x014c
        L_0x0137:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0142
            r19 = 1
            goto L_0x014c
        L_0x0142:
            java.lang.String r3 = "immutable"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x014c
            r20 = 1
        L_0x014c:
            r2 = r0
            r0 = r22
            goto L_0x003c
        L_0x0151:
            r4 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x0158:
            if (r7 != 0) goto L_0x015d
            r21 = 0
            goto L_0x015f
        L_0x015d:
            r21 = r8
        L_0x015f:
            okhttp3.CacheControl r0 = new okhttp3.CacheControl
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.a(okhttp3.Headers):okhttp3.CacheControl");
    }

    public final String toString() {
        String str = this.f10498m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f10489a) {
                sb.append("no-cache, ");
            }
            if (this.f10490b) {
                sb.append("no-store, ");
            }
            int i2 = this.f10491c;
            if (i2 != -1) {
                sb.append("max-age=");
                sb.append(i2);
                sb.append(", ");
            }
            int i5 = this.d;
            if (i5 != -1) {
                sb.append("s-maxage=");
                sb.append(i5);
                sb.append(", ");
            }
            if (this.f10492e) {
                sb.append("private, ");
            }
            if (this.f10493f) {
                sb.append("public, ");
            }
            if (this.g) {
                sb.append("must-revalidate, ");
            }
            int i6 = this.h;
            if (i6 != -1) {
                sb.append("max-stale=");
                sb.append(i6);
                sb.append(", ");
            }
            int i7 = this.f10494i;
            if (i7 != -1) {
                sb.append("min-fresh=");
                sb.append(i7);
                sb.append(", ");
            }
            if (this.f10495j) {
                sb.append("only-if-cached, ");
            }
            if (this.f10496k) {
                sb.append("no-transform, ");
            }
            if (this.f10497l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f10498m = str;
        }
        return str;
    }

    public CacheControl(Builder builder) {
        this.f10489a = builder.f10499a;
        this.f10490b = false;
        this.f10491c = -1;
        this.d = -1;
        this.f10492e = false;
        this.f10493f = false;
        this.g = false;
        this.h = builder.f10500b;
        this.f10494i = -1;
        this.f10495j = builder.f10501c;
        this.f10496k = false;
        this.f10497l = false;
    }
}
