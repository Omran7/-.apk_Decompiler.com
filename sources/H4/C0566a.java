package h4;

import androidx.emoji2.text.v;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* renamed from: h4.a  reason: case insensitive filesystem */
public class C0566a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final StringReader f8153a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8154b = false;

    /* renamed from: c  reason: collision with root package name */
    public final char[] f8155c = new char[1024];
    public int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f8156e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f8157f = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f8158p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f8159q = 0;

    /* renamed from: r  reason: collision with root package name */
    public long f8160r;

    /* renamed from: s  reason: collision with root package name */
    public int f8161s;

    /* renamed from: t  reason: collision with root package name */
    public String f8162t;

    /* renamed from: u  reason: collision with root package name */
    public int[] f8163u;

    /* renamed from: v  reason: collision with root package name */
    public int f8164v;

    /* renamed from: w  reason: collision with root package name */
    public String[] f8165w;

    /* renamed from: x  reason: collision with root package name */
    public int[] f8166x;

    static {
        v.f4967b = new v(18);
    }

    public C0566a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f8163u = iArr;
        this.f8164v = 1;
        iArr[0] = 6;
        this.f8165w = new String[32];
        this.f8166x = new int[32];
        this.f8153a = stringReader;
    }

    public final String A() {
        String str;
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        if (i2 == 10) {
            str = B();
        } else if (i2 == 8) {
            str = z('\'');
        } else if (i2 == 9) {
            str = z('\"');
        } else if (i2 == 11) {
            str = this.f8162t;
            this.f8162t = null;
        } else if (i2 == 15) {
            str = Long.toString(this.f8160r);
        } else if (i2 == 16) {
            str = new String(this.f8155c, this.d, this.f8161s);
            this.d += this.f8161s;
        } else {
            throw new IllegalStateException("Expected a string but was " + a.y(C()) + r());
        }
        this.f8159q = 0;
        int[] iArr = this.f8166x;
        int i5 = this.f8164v - 1;
        iArr[i5] = iArr[i5] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        j();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String B() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = r1
        L_0x0003:
            int r3 = r7.d
            int r4 = r3 + r2
            int r5 = r7.f8156e
            char[] r6 = r7.f8155c
            if (r4 >= r5) goto L_0x004e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005a
            r4 = 10
            if (r3 == r4) goto L_0x005a
            r4 = 12
            if (r3 == r4) goto L_0x005a
            r4 = 13
            if (r3 == r4) goto L_0x005a
            r4 = 32
            if (r3 == r4) goto L_0x005a
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005a
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005a
            r4 = 58
            if (r3 == r4) goto L_0x005a
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005a;
                case 92: goto L_0x004a;
                case 93: goto L_0x005a;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r7.j()
            goto L_0x005a
        L_0x004e:
            int r3 = r6.length
            if (r2 >= r3) goto L_0x005c
            int r3 = r2 + 1
            boolean r3 = r7.n(r3)
            if (r3 == 0) goto L_0x005a
            goto L_0x0003
        L_0x005a:
            r1 = r2
            goto L_0x007a
        L_0x005c:
            if (r0 != 0) goto L_0x0069
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L_0x0069:
            int r3 = r7.d
            r0.append(r6, r3, r2)
            int r3 = r7.d
            int r3 = r3 + r2
            r7.d = r3
            r2 = 1
            boolean r2 = r7.n(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007a:
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = new java.lang.String
            int r2 = r7.d
            r0.<init>(r6, r2, r1)
            goto L_0x008d
        L_0x0084:
            int r2 = r7.d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L_0x008d:
            int r2 = r7.d
            int r2 = r2 + r1
            r7.d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.C0566a.B():java.lang.String");
    }

    public final int C() {
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        switch (i2) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case zzaky.zzf.zzf:
                return 8;
            case zzaky.zzf.zzg:
                return 9;
            case 8:
            case 9:
            case 10:
            case ModuleDescriptor.MODULE_VERSION:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void D(int i2) {
        int i5 = this.f8164v;
        int[] iArr = this.f8163u;
        if (i5 == iArr.length) {
            int i6 = i5 * 2;
            this.f8163u = Arrays.copyOf(iArr, i6);
            this.f8166x = Arrays.copyOf(this.f8166x, i6);
            this.f8165w = (String[]) Arrays.copyOf(this.f8165w, i6);
        }
        int[] iArr2 = this.f8163u;
        int i7 = this.f8164v;
        this.f8164v = i7 + 1;
        iArr2[i7] = i2;
    }

    public final char E() {
        int i2;
        if (this.d != this.f8156e || n(1)) {
            int i5 = this.d;
            int i6 = i5 + 1;
            this.d = i6;
            char[] cArr = this.f8155c;
            char c3 = cArr[i5];
            if (c3 == 10) {
                this.f8157f++;
                this.f8158p = i6;
            } else if (!(c3 == '\"' || c3 == '\'' || c3 == '/' || c3 == '\\')) {
                if (c3 == 'b') {
                    return 8;
                }
                if (c3 == 'f') {
                    return 12;
                }
                if (c3 == 'n') {
                    return 10;
                }
                if (c3 == 'r') {
                    return 13;
                }
                if (c3 == 't') {
                    return 9;
                }
                if (c3 != 'u') {
                    J("Invalid escape sequence");
                    throw null;
                } else if (i5 + 5 <= this.f8156e || n(4)) {
                    int i7 = this.d;
                    int i8 = i7 + 4;
                    char c6 = 0;
                    while (i7 < i8) {
                        char c7 = cArr[i7];
                        char c8 = (char) (c6 << 4);
                        if (c7 >= '0' && c7 <= '9') {
                            i2 = c7 - '0';
                        } else if (c7 >= 'a' && c7 <= 'f') {
                            i2 = c7 - 'W';
                        } else if (c7 < 'A' || c7 > 'F') {
                            throw new NumberFormatException("\\u".concat(new String(cArr, this.d, 4)));
                        } else {
                            i2 = c7 - '7';
                        }
                        c6 = (char) (i2 + c8);
                        i7++;
                    }
                    this.d += 4;
                    return c6;
                } else {
                    J("Unterminated escape sequence");
                    throw null;
                }
            }
            return c3;
        }
        J("Unterminated escape sequence");
        throw null;
    }

    public final void F(char c3) {
        do {
            int i2 = this.d;
            int i5 = this.f8156e;
            while (i2 < i5) {
                int i6 = i2 + 1;
                char c6 = this.f8155c[i2];
                if (c6 == c3) {
                    this.d = i6;
                    return;
                } else if (c6 == '\\') {
                    this.d = i6;
                    E();
                    i2 = this.d;
                    i5 = this.f8156e;
                } else {
                    if (c6 == 10) {
                        this.f8157f++;
                        this.f8158p = i6;
                    }
                    i2 = i6;
                }
            }
            this.d = i2;
        } while (n(1));
        J("Unterminated string");
        throw null;
    }

    public final void G() {
        char c3;
        do {
            if (this.d < this.f8156e || n(1)) {
                int i2 = this.d;
                int i5 = i2 + 1;
                this.d = i5;
                c3 = this.f8155c[i2];
                if (c3 == 10) {
                    this.f8157f++;
                    this.f8158p = i5;
                    return;
                }
            } else {
                return;
            }
        } while (c3 != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        j();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.d
            int r2 = r1 + r0
            int r3 = r4.f8156e
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f8155c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.j()
        L_0x004b:
            int r1 = r4.d
            int r1 = r1 + r0
            r4.d = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.d = r1
            r0 = 1
            boolean r0 = r4.n(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.C0566a.H():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r7.f8159q = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I() {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r7.f8159q
            if (r2 != 0) goto L_0x000a
            int r2 = r7.k()
        L_0x000a:
            r3 = 39
            r4 = 34
            java.lang.String r5 = "<skipped>"
            r6 = 1
            switch(r2) {
                case 1: goto L_0x006f;
                case 2: goto L_0x005f;
                case 3: goto L_0x0059;
                case 4: goto L_0x0051;
                case 5: goto L_0x0014;
                case 6: goto L_0x0014;
                case 7: goto L_0x0014;
                case 8: goto L_0x004d;
                case 9: goto L_0x0049;
                case 10: goto L_0x0045;
                case 11: goto L_0x0014;
                case 12: goto L_0x0038;
                case 13: goto L_0x002b;
                case 14: goto L_0x001e;
                case 15: goto L_0x0014;
                case 16: goto L_0x0016;
                case 17: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0074
        L_0x0015:
            return
        L_0x0016:
            int r2 = r7.d
            int r3 = r7.f8161s
            int r2 = r2 + r3
            r7.d = r2
            goto L_0x0074
        L_0x001e:
            r7.H()
            if (r1 != 0) goto L_0x0074
            java.lang.String[] r2 = r7.f8165w
            int r3 = r7.f8164v
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0074
        L_0x002b:
            r7.F(r4)
            if (r1 != 0) goto L_0x0074
            java.lang.String[] r2 = r7.f8165w
            int r3 = r7.f8164v
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0074
        L_0x0038:
            r7.F(r3)
            if (r1 != 0) goto L_0x0074
            java.lang.String[] r2 = r7.f8165w
            int r3 = r7.f8164v
            int r3 = r3 - r6
            r2[r3] = r5
            goto L_0x0074
        L_0x0045:
            r7.H()
            goto L_0x0074
        L_0x0049:
            r7.F(r4)
            goto L_0x0074
        L_0x004d:
            r7.F(r3)
            goto L_0x0074
        L_0x0051:
            int r2 = r7.f8164v
            int r2 = r2 - r6
            r7.f8164v = r2
        L_0x0056:
            int r1 = r1 + -1
            goto L_0x0074
        L_0x0059:
            r7.D(r6)
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x0074
        L_0x005f:
            if (r1 != 0) goto L_0x0069
            java.lang.String[] r2 = r7.f8165w
            int r3 = r7.f8164v
            int r3 = r3 - r6
            r4 = 0
            r2[r3] = r4
        L_0x0069:
            int r2 = r7.f8164v
            int r2 = r2 - r6
            r7.f8164v = r2
            goto L_0x0056
        L_0x006f:
            r2 = 3
            r7.D(r2)
            goto L_0x005c
        L_0x0074:
            r7.f8159q = r0
            if (r1 > 0) goto L_0x0002
            int[] r0 = r7.f8166x
            int r1 = r7.f8164v
            int r1 = r1 - r6
            r2 = r0[r1]
            int r2 = r2 + r6
            r0[r1] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.C0566a.I():void");
    }

    public final void J(String str) {
        throw new IOException(str + r());
    }

    public final void c() {
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        if (i2 == 3) {
            D(1);
            this.f8166x[this.f8164v - 1] = 0;
            this.f8159q = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + a.y(C()) + r());
    }

    public final void close() {
        this.f8159q = 0;
        this.f8163u[0] = 8;
        this.f8164v = 1;
        this.f8153a.close();
    }

    public final void d() {
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        if (i2 == 1) {
            D(3);
            this.f8159q = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + a.y(C()) + r());
    }

    public final void j() {
        if (!this.f8154b) {
            J("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0199, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0210, code lost:
        if (q(r1) != false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0213, code lost:
        if (r6 != 2) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0215, code lost:
        if (r11 == false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x021b, code lost:
        if (r7 != Long.MIN_VALUE) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x021d, code lost:
        if (r15 == 0) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0220, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0224, code lost:
        if (r7 != 0) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0226, code lost:
        if (r15 != 0) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0228, code lost:
        if (r15 == 0) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x022b, code lost:
        r7 = -r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x022c, code lost:
        r0.f8160r = r7;
        r0.d += r9;
        r10 = 15;
        r0.f8159q = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0238, code lost:
        if (r6 == r1) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x023b, code lost:
        if (r6 == 4) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x023e, code lost:
        if (r6 != 7) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0240, code lost:
        r0.f8161s = r9;
        r10 = 16;
        r0.f8159q = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0157 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int k() {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = r0.f8163u
            int r2 = r0.f8164v
            r3 = 1
            int r2 = r2 - r3
            r4 = r1[r2]
            char[] r5 = r0.f8155c
            r6 = 0
            r11 = 39
            r12 = 6
            r13 = 93
            r14 = 59
            r15 = 44
            r7 = 3
            r10 = 4
            r8 = 5
            r9 = 2
            if (r4 != r3) goto L_0x0021
            r1[r2] = r9
        L_0x001e:
            r1 = 0
            goto L_0x00de
        L_0x0021:
            if (r4 != r9) goto L_0x003a
            int r1 = r0.x(r3)
            if (r1 == r15) goto L_0x001e
            if (r1 == r14) goto L_0x0036
            if (r1 != r13) goto L_0x0030
            r0.f8159q = r10
            return r10
        L_0x0030:
            java.lang.String r1 = "Unterminated array"
            r0.J(r1)
            throw r6
        L_0x0036:
            r19.j()
            goto L_0x001e
        L_0x003a:
            r9 = 125(0x7d, float:1.75E-43)
            if (r4 == r7) goto L_0x02ce
            if (r4 != r8) goto L_0x0043
            r3 = r10
            goto L_0x02cf
        L_0x0043:
            if (r4 != r10) goto L_0x0074
            r1[r2] = r8
            int r1 = r0.x(r3)
            r2 = 58
            if (r1 == r2) goto L_0x001e
            r2 = 61
            if (r1 != r2) goto L_0x006e
            r19.j()
            int r1 = r0.d
            int r2 = r0.f8156e
            if (r1 < r2) goto L_0x0062
            boolean r1 = r0.n(r3)
            if (r1 == 0) goto L_0x001e
        L_0x0062:
            int r1 = r0.d
            char r2 = r5[r1]
            r9 = 62
            if (r2 != r9) goto L_0x001e
            int r1 = r1 + r3
            r0.d = r1
            goto L_0x001e
        L_0x006e:
            java.lang.String r1 = "Expected ':'"
            r0.J(r1)
            throw r6
        L_0x0074:
            if (r4 != r12) goto L_0x00c0
            boolean r1 = r0.f8154b
            if (r1 == 0) goto L_0x00b6
            r0.x(r3)
            int r1 = r0.d
            int r2 = r1 + -1
            r0.d = r2
            int r1 = r1 + 4
            int r2 = r0.f8156e
            if (r1 <= r2) goto L_0x0090
            boolean r1 = r0.n(r8)
            if (r1 != 0) goto L_0x0090
            goto L_0x00b6
        L_0x0090:
            int r1 = r0.d
            char r2 = r5[r1]
            r6 = 41
            if (r2 != r6) goto L_0x00b6
            int r2 = r1 + 1
            char r2 = r5[r2]
            if (r2 != r13) goto L_0x00b6
            int r2 = r1 + 2
            char r2 = r5[r2]
            if (r2 != r9) goto L_0x00b6
            int r2 = r1 + 3
            char r2 = r5[r2]
            if (r2 != r11) goto L_0x00b6
            int r2 = r1 + 4
            char r2 = r5[r2]
            r6 = 10
            if (r2 == r6) goto L_0x00b3
            goto L_0x00b6
        L_0x00b3:
            int r1 = r1 + r8
            r0.d = r1
        L_0x00b6:
            int[] r1 = r0.f8163u
            int r2 = r0.f8164v
            int r2 = r2 - r3
            r6 = 7
            r1[r2] = r6
            goto L_0x001e
        L_0x00c0:
            r6 = 7
            if (r4 != r6) goto L_0x00d9
            r1 = 0
            int r2 = r0.x(r1)
            r6 = -1
            if (r2 != r6) goto L_0x00d0
            r1 = 17
            r0.f8159q = r1
            return r1
        L_0x00d0:
            r19.j()
            int r2 = r0.d
            int r2 = r2 - r3
            r0.d = r2
            goto L_0x00de
        L_0x00d9:
            r1 = 0
            r2 = 8
            if (r4 == r2) goto L_0x02c6
        L_0x00de:
            int r2 = r0.x(r3)
            r6 = 34
            if (r2 == r6) goto L_0x02c1
            if (r2 == r11) goto L_0x02b9
            if (r2 == r15) goto L_0x029f
            if (r2 == r14) goto L_0x029f
            r6 = 91
            if (r2 == r6) goto L_0x029b
            if (r2 == r13) goto L_0x0294
            r4 = 123(0x7b, float:1.72E-43)
            if (r2 == r4) goto L_0x0290
            int r2 = r0.d
            int r2 = r2 - r3
            r0.d = r2
            char r2 = r5[r2]
            r4 = 116(0x74, float:1.63E-43)
            if (r2 == r4) goto L_0x0126
            r4 = 84
            if (r2 != r4) goto L_0x0106
            goto L_0x0126
        L_0x0106:
            r4 = 102(0x66, float:1.43E-43)
            if (r2 == r4) goto L_0x0120
            r4 = 70
            if (r2 != r4) goto L_0x010f
            goto L_0x0120
        L_0x010f:
            r4 = 110(0x6e, float:1.54E-43)
            if (r2 == r4) goto L_0x011a
            r4 = 78
            if (r2 != r4) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r6 = r1
            goto L_0x0179
        L_0x011a:
            java.lang.String r2 = "null"
            java.lang.String r4 = "NULL"
            r6 = 7
            goto L_0x012b
        L_0x0120:
            java.lang.String r2 = "false"
            java.lang.String r4 = "FALSE"
            r6 = r12
            goto L_0x012b
        L_0x0126:
            java.lang.String r2 = "true"
            java.lang.String r4 = "TRUE"
            r6 = r8
        L_0x012b:
            int r9 = r2.length()
            r11 = r3
        L_0x0130:
            if (r11 >= r9) goto L_0x0157
            int r13 = r0.d
            int r13 = r13 + r11
            int r14 = r0.f8156e
            if (r13 < r14) goto L_0x0142
            int r13 = r11 + 1
            boolean r13 = r0.n(r13)
            if (r13 != 0) goto L_0x0142
            goto L_0x0118
        L_0x0142:
            int r13 = r0.d
            int r13 = r13 + r11
            char r13 = r5[r13]
            char r14 = r2.charAt(r11)
            if (r13 == r14) goto L_0x0154
            char r14 = r4.charAt(r11)
            if (r13 == r14) goto L_0x0154
            goto L_0x0118
        L_0x0154:
            int r11 = r11 + 1
            goto L_0x0130
        L_0x0157:
            int r2 = r0.d
            int r2 = r2 + r9
            int r4 = r0.f8156e
            if (r2 < r4) goto L_0x0166
            int r2 = r9 + 1
            boolean r2 = r0.n(r2)
            if (r2 == 0) goto L_0x0172
        L_0x0166:
            int r2 = r0.d
            int r2 = r2 + r9
            char r2 = r5[r2]
            boolean r2 = r0.q(r2)
            if (r2 == 0) goto L_0x0172
            goto L_0x0118
        L_0x0172:
            int r2 = r0.d
            int r2 = r2 + r9
            r0.d = r2
            r0.f8159q = r6
        L_0x0179:
            if (r6 == 0) goto L_0x017c
            return r6
        L_0x017c:
            int r2 = r0.d
            int r4 = r0.f8156e
            r13 = 0
            r6 = r1
            r9 = r6
            r15 = r9
            r11 = r3
            r7 = r13
        L_0x0187:
            int r1 = r2 + r9
            if (r1 != r4) goto L_0x01a2
            int r1 = r5.length
            if (r9 != r1) goto L_0x0191
        L_0x018e:
            r10 = 0
            goto L_0x0274
        L_0x0191:
            int r1 = r9 + 1
            boolean r1 = r0.n(r1)
            if (r1 != 0) goto L_0x019c
        L_0x0199:
            r1 = 2
            goto L_0x0213
        L_0x019c:
            int r1 = r0.d
            int r2 = r0.f8156e
            r4 = r2
            r2 = r1
        L_0x01a2:
            int r1 = r2 + r9
            char r1 = r5[r1]
            r10 = 43
            if (r1 == r10) goto L_0x0266
            r10 = 69
            if (r1 == r10) goto L_0x025b
            r10 = 101(0x65, float:1.42E-43)
            if (r1 == r10) goto L_0x025b
            r10 = 45
            if (r1 == r10) goto L_0x024e
            r10 = 46
            if (r1 == r10) goto L_0x0247
            r10 = 48
            if (r1 < r10) goto L_0x020c
            r10 = 57
            if (r1 <= r10) goto L_0x01c3
            goto L_0x020c
        L_0x01c3:
            if (r6 == r3) goto L_0x01c7
            if (r6 != 0) goto L_0x01ca
        L_0x01c7:
            r16 = r4
            goto L_0x0205
        L_0x01ca:
            r10 = 2
            if (r6 != r10) goto L_0x01f5
            int r10 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x01d2
            goto L_0x018e
        L_0x01d2:
            r17 = 10
            long r17 = r17 * r7
            int r1 = r1 + -48
            r16 = r4
            long r3 = (long) r1
            long r17 = r17 - r3
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x01ef
            if (r1 != 0) goto L_0x01ed
            int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x01ed
            goto L_0x01ef
        L_0x01ed:
            r1 = 0
            goto L_0x01f0
        L_0x01ef:
            r1 = 1
        L_0x01f0:
            r11 = r11 & r1
            r7 = r17
            goto L_0x026c
        L_0x01f5:
            r16 = r4
            r1 = 3
            if (r6 != r1) goto L_0x01fd
            r6 = 4
            goto L_0x026c
        L_0x01fd:
            r1 = 5
            if (r6 == r1) goto L_0x0202
            if (r6 != r12) goto L_0x026c
        L_0x0202:
            r6 = 7
            goto L_0x026c
        L_0x0205:
            int r1 = r1 + -48
            int r1 = -r1
            long r7 = (long) r1
            r6 = 2
            goto L_0x026c
        L_0x020c:
            boolean r1 = r0.q(r1)
            if (r1 != 0) goto L_0x018e
            goto L_0x0199
        L_0x0213:
            if (r6 != r1) goto L_0x0238
            if (r11 == 0) goto L_0x0220
            r1 = -9223372036854775808
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0222
            if (r15 == 0) goto L_0x0220
            goto L_0x0222
        L_0x0220:
            r1 = 2
            goto L_0x0238
        L_0x0222:
            int r1 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x0228
            if (r15 != 0) goto L_0x0220
        L_0x0228:
            if (r15 == 0) goto L_0x022b
            goto L_0x022c
        L_0x022b:
            long r7 = -r7
        L_0x022c:
            r0.f8160r = r7
            int r1 = r0.d
            int r1 = r1 + r9
            r0.d = r1
            r10 = 15
            r0.f8159q = r10
            goto L_0x0274
        L_0x0238:
            if (r6 == r1) goto L_0x0240
            r1 = 4
            if (r6 == r1) goto L_0x0240
            r1 = 7
            if (r6 != r1) goto L_0x018e
        L_0x0240:
            r0.f8161s = r9
            r10 = 16
            r0.f8159q = r10
            goto L_0x0274
        L_0x0247:
            r16 = r4
            r1 = 2
            if (r6 != r1) goto L_0x018e
            r6 = 3
            goto L_0x026c
        L_0x024e:
            r16 = r4
            r1 = 2
            if (r6 != 0) goto L_0x0256
            r6 = 1
            r15 = 1
            goto L_0x026c
        L_0x0256:
            r3 = 5
            if (r6 != r3) goto L_0x018e
        L_0x0259:
            r6 = r12
            goto L_0x026c
        L_0x025b:
            r16 = r4
            r1 = 2
            r3 = 5
            if (r6 == r1) goto L_0x0264
            r1 = 4
            if (r6 != r1) goto L_0x018e
        L_0x0264:
            r6 = r3
            goto L_0x026c
        L_0x0266:
            r16 = r4
            r3 = 5
            if (r6 != r3) goto L_0x018e
            goto L_0x0259
        L_0x026c:
            int r9 = r9 + 1
            r4 = r16
            r3 = 1
            r10 = 4
            goto L_0x0187
        L_0x0274:
            if (r10 == 0) goto L_0x0277
            return r10
        L_0x0277:
            int r1 = r0.d
            char r1 = r5[r1]
            boolean r1 = r0.q(r1)
            if (r1 == 0) goto L_0x0289
            r19.j()
            r1 = 10
            r0.f8159q = r1
            return r1
        L_0x0289:
            java.lang.String r1 = "Expected value"
            r0.J(r1)
            r1 = 0
            throw r1
        L_0x0290:
            r1 = r3
            r0.f8159q = r1
            return r1
        L_0x0294:
            r1 = r3
            if (r4 != r1) goto L_0x02a0
            r2 = 4
            r0.f8159q = r2
            return r2
        L_0x029b:
            r2 = r7
            r0.f8159q = r2
            return r2
        L_0x029f:
            r1 = r3
        L_0x02a0:
            if (r4 == r1) goto L_0x02ad
            r2 = 2
            if (r4 != r2) goto L_0x02a6
            goto L_0x02ad
        L_0x02a6:
            java.lang.String r1 = "Unexpected value"
            r0.J(r1)
            r1 = 0
            throw r1
        L_0x02ad:
            r19.j()
            int r2 = r0.d
            int r2 = r2 - r1
            r0.d = r2
            r1 = 7
            r0.f8159q = r1
            return r1
        L_0x02b9:
            r19.j()
            r1 = 8
            r0.f8159q = r1
            return r1
        L_0x02c1:
            r1 = 9
            r0.f8159q = r1
            return r1
        L_0x02c6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02ce:
            r3 = 4
        L_0x02cf:
            r1[r2] = r3
            r1 = 5
            if (r4 != r1) goto L_0x02ed
            r1 = 1
            int r2 = r0.x(r1)
            if (r2 == r15) goto L_0x02ed
            if (r2 == r14) goto L_0x02ea
            if (r2 != r9) goto L_0x02e3
            r1 = 2
            r0.f8159q = r1
            return r1
        L_0x02e3:
            java.lang.String r1 = "Unterminated object"
            r0.J(r1)
            r1 = 0
            throw r1
        L_0x02ea:
            r19.j()
        L_0x02ed:
            r1 = 1
            int r2 = r0.x(r1)
            r3 = 34
            if (r2 == r3) goto L_0x0329
            if (r2 == r11) goto L_0x0321
            java.lang.String r3 = "Expected name"
            if (r2 == r9) goto L_0x0315
            r19.j()
            int r4 = r0.d
            int r4 = r4 - r1
            r0.d = r4
            char r1 = (char) r2
            boolean r1 = r0.q(r1)
            if (r1 == 0) goto L_0x0310
            r1 = 14
            r0.f8159q = r1
            return r1
        L_0x0310:
            r0.J(r3)
            r1 = 0
            throw r1
        L_0x0315:
            r1 = 0
            r2 = 5
            if (r4 == r2) goto L_0x031d
            r2 = 2
            r0.f8159q = r2
            return r2
        L_0x031d:
            r0.J(r3)
            throw r1
        L_0x0321:
            r19.j()
            r1 = 12
            r0.f8159q = r1
            return r1
        L_0x0329:
            r1 = 13
            r0.f8159q = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.C0566a.k():int");
    }

    public final void l() {
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        if (i2 == 4) {
            int i5 = this.f8164v;
            this.f8164v = i5 - 1;
            int[] iArr = this.f8166x;
            int i6 = i5 - 2;
            iArr[i6] = iArr[i6] + 1;
            this.f8159q = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + a.y(C()) + r());
    }

    public final void m() {
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        if (i2 == 2) {
            int i5 = this.f8164v;
            int i6 = i5 - 1;
            this.f8164v = i6;
            this.f8165w[i6] = null;
            int[] iArr = this.f8166x;
            int i7 = i5 - 2;
            iArr[i7] = iArr[i7] + 1;
            this.f8159q = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + a.y(C()) + r());
    }

    public final boolean n(int i2) {
        int i5;
        int i6;
        int i7 = this.f8158p;
        int i8 = this.d;
        this.f8158p = i7 - i8;
        int i9 = this.f8156e;
        char[] cArr = this.f8155c;
        if (i9 != i8) {
            int i10 = i9 - i8;
            this.f8156e = i10;
            System.arraycopy(cArr, i8, cArr, 0, i10);
        } else {
            this.f8156e = 0;
        }
        this.d = 0;
        do {
            int i11 = this.f8156e;
            int read = this.f8153a.read(cArr, i11, cArr.length - i11);
            if (read == -1) {
                return false;
            }
            i5 = this.f8156e + read;
            this.f8156e = i5;
            if (this.f8157f == 0 && (i6 = this.f8158p) == 0 && i5 > 0 && cArr[0] == 65279) {
                this.d++;
                this.f8158p = i6 + 1;
                i2++;
                continue;
            }
        } while (i5 < i2);
        return true;
    }

    public final String o(boolean z3) {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i5 = this.f8164v;
            if (i2 >= i5) {
                return sb.toString();
            }
            int i6 = this.f8163u[i2];
            if (i6 == 1 || i6 == 2) {
                int i7 = this.f8166x[i2];
                if (z3 && i7 > 0 && i2 == i5 - 1) {
                    i7--;
                }
                sb.append('[');
                sb.append(i7);
                sb.append(']');
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                sb.append('.');
                String str = this.f8165w[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    public final boolean p() {
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        if (i2 == 2 || i2 == 4 || i2 == 17) {
            return false;
        }
        return true;
    }

    public final boolean q(char c3) {
        if (c3 == 9 || c3 == 10 || c3 == 12 || c3 == 13 || c3 == ' ') {
            return false;
        }
        if (c3 != '#') {
            if (c3 == ',') {
                return false;
            }
            if (!(c3 == '/' || c3 == '=')) {
                if (c3 == '{' || c3 == '}' || c3 == ':') {
                    return false;
                }
                if (c3 != ';') {
                    switch (c3) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j();
        return false;
    }

    public final String r() {
        StringBuilder h = a.h(" at line ", this.f8157f + 1, " column ", (this.d - this.f8158p) + 1, " path ");
        h.append(o(false));
        return h.toString();
    }

    public final boolean s() {
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        if (i2 == 5) {
            this.f8159q = 0;
            int[] iArr = this.f8166x;
            int i5 = this.f8164v - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        } else if (i2 == 6) {
            this.f8159q = 0;
            int[] iArr2 = this.f8166x;
            int i6 = this.f8164v - 1;
            iArr2[i6] = iArr2[i6] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + a.y(C()) + r());
        }
    }

    public final double t() {
        char c3;
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        if (i2 == 15) {
            this.f8159q = 0;
            int[] iArr = this.f8166x;
            int i5 = this.f8164v - 1;
            iArr[i5] = iArr[i5] + 1;
            return (double) this.f8160r;
        }
        if (i2 == 16) {
            this.f8162t = new String(this.f8155c, this.d, this.f8161s);
            this.d += this.f8161s;
        } else if (i2 == 8 || i2 == 9) {
            if (i2 == 8) {
                c3 = '\'';
            } else {
                c3 = '\"';
            }
            this.f8162t = z(c3);
        } else if (i2 == 10) {
            this.f8162t = B();
        } else if (i2 != 11) {
            throw new IllegalStateException("Expected a double but was " + a.y(C()) + r());
        }
        this.f8159q = 11;
        double parseDouble = Double.parseDouble(this.f8162t);
        if (this.f8154b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f8162t = null;
            this.f8159q = 0;
            int[] iArr2 = this.f8166x;
            int i6 = this.f8164v - 1;
            iArr2[i6] = iArr2[i6] + 1;
            return parseDouble;
        }
        throw new IOException("JSON forbids NaN and infinities: " + parseDouble + r());
    }

    public final String toString() {
        return C0566a.class.getSimpleName() + r();
    }

    public final int u() {
        char c3;
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        if (i2 == 15) {
            long j6 = this.f8160r;
            int i5 = (int) j6;
            if (j6 == ((long) i5)) {
                this.f8159q = 0;
                int[] iArr = this.f8166x;
                int i6 = this.f8164v - 1;
                iArr[i6] = iArr[i6] + 1;
                return i5;
            }
            throw new NumberFormatException("Expected an int but was " + this.f8160r + r());
        }
        if (i2 == 16) {
            this.f8162t = new String(this.f8155c, this.d, this.f8161s);
            this.d += this.f8161s;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                this.f8162t = B();
            } else {
                if (i2 == 8) {
                    c3 = '\'';
                } else {
                    c3 = '\"';
                }
                this.f8162t = z(c3);
            }
            try {
                int parseInt = Integer.parseInt(this.f8162t);
                this.f8159q = 0;
                int[] iArr2 = this.f8166x;
                int i7 = this.f8164v - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + a.y(C()) + r());
        }
        this.f8159q = 11;
        double parseDouble = Double.parseDouble(this.f8162t);
        int i8 = (int) parseDouble;
        if (((double) i8) == parseDouble) {
            this.f8162t = null;
            this.f8159q = 0;
            int[] iArr3 = this.f8166x;
            int i9 = this.f8164v - 1;
            iArr3[i9] = iArr3[i9] + 1;
            return i8;
        }
        throw new NumberFormatException("Expected an int but was " + this.f8162t + r());
    }

    public final long v() {
        char c3;
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        if (i2 == 15) {
            this.f8159q = 0;
            int[] iArr = this.f8166x;
            int i5 = this.f8164v - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f8160r;
        }
        if (i2 == 16) {
            this.f8162t = new String(this.f8155c, this.d, this.f8161s);
            this.d += this.f8161s;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                this.f8162t = B();
            } else {
                if (i2 == 8) {
                    c3 = '\'';
                } else {
                    c3 = '\"';
                }
                this.f8162t = z(c3);
            }
            try {
                long parseLong = Long.parseLong(this.f8162t);
                this.f8159q = 0;
                int[] iArr2 = this.f8166x;
                int i6 = this.f8164v - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + a.y(C()) + r());
        }
        this.f8159q = 11;
        double parseDouble = Double.parseDouble(this.f8162t);
        long j6 = (long) parseDouble;
        if (((double) j6) == parseDouble) {
            this.f8162t = null;
            this.f8159q = 0;
            int[] iArr3 = this.f8166x;
            int i7 = this.f8164v - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return j6;
        }
        throw new NumberFormatException("Expected a long but was " + this.f8162t + r());
    }

    public final String w() {
        String str;
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        if (i2 == 14) {
            str = B();
        } else if (i2 == 12) {
            str = z('\'');
        } else if (i2 == 13) {
            str = z('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + a.y(C()) + r());
        }
        this.f8159q = 0;
        this.f8165w[this.f8164v - 1] = str;
        return str;
    }

    public final int x(boolean z3) {
        int i2 = this.d;
        int i5 = this.f8156e;
        while (true) {
            if (i2 == i5) {
                this.d = i2;
                if (n(1)) {
                    i2 = this.d;
                    i5 = this.f8156e;
                } else if (!z3) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + r());
                }
            }
            int i6 = i2 + 1;
            char[] cArr = this.f8155c;
            char c3 = cArr[i2];
            if (c3 == 10) {
                this.f8157f++;
                this.f8158p = i6;
            } else if (!(c3 == ' ' || c3 == 13 || c3 == 9)) {
                if (c3 == '/') {
                    this.d = i6;
                    if (i6 == i5) {
                        this.d = i2;
                        boolean n2 = n(2);
                        this.d++;
                        if (!n2) {
                            return c3;
                        }
                    }
                    j();
                    int i7 = this.d;
                    char c6 = cArr[i7];
                    if (c6 == '*') {
                        this.d = i7 + 1;
                        while (true) {
                            if (this.d + 2 <= this.f8156e || n(2)) {
                                int i8 = this.d;
                                if (cArr[i8] != 10) {
                                    int i9 = 0;
                                    while (i9 < 2) {
                                        if (cArr[this.d + i9] == "*/".charAt(i9)) {
                                            i9++;
                                        }
                                    }
                                    i2 = this.d + 2;
                                    i5 = this.f8156e;
                                    break;
                                }
                                this.f8157f++;
                                this.f8158p = i8 + 1;
                                this.d++;
                            } else {
                                J("Unterminated comment");
                                throw null;
                            }
                        }
                    } else if (c6 != '/') {
                        return c3;
                    } else {
                        this.d = i7 + 1;
                        G();
                        i2 = this.d;
                        i5 = this.f8156e;
                    }
                } else if (c3 == '#') {
                    this.d = i6;
                    j();
                    G();
                    i2 = this.d;
                    i5 = this.f8156e;
                } else {
                    this.d = i6;
                    return c3;
                }
            }
            i2 = i6;
        }
    }

    public final void y() {
        int i2 = this.f8159q;
        if (i2 == 0) {
            i2 = k();
        }
        if (i2 == 7) {
            this.f8159q = 0;
            int[] iArr = this.f8166x;
            int i5 = this.f8164v - 1;
            iArr[i5] = iArr[i5] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + a.y(C()) + r());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r10.d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r1 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r1.append(r5, r3, r2 - r3);
        r10.d = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String z(char r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r10.d
            int r3 = r10.f8156e
        L_0x0006:
            r4 = r3
            r3 = r2
        L_0x0008:
            char[] r5 = r10.f8155c
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L_0x005b
            int r8 = r2 + 1
            char r2 = r5[r2]
            if (r2 != r11) goto L_0x0029
            r10.d = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L_0x0021
            java.lang.String r11 = new java.lang.String
            r11.<init>(r5, r3, r8)
            return r11
        L_0x0021:
            r1.append(r5, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L_0x0029:
            r9 = 92
            if (r2 != r9) goto L_0x004e
            r10.d = r8
            int r8 = r8 - r3
            int r2 = r8 + -1
            if (r1 != 0) goto L_0x003f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L_0x003f:
            r1.append(r5, r3, r2)
            char r2 = r10.E()
            r1.append(r2)
            int r2 = r10.d
            int r3 = r10.f8156e
            goto L_0x0006
        L_0x004e:
            r5 = 10
            if (r2 != r5) goto L_0x0059
            int r2 = r10.f8157f
            int r2 = r2 + r6
            r10.f8157f = r2
            r10.f8158p = r8
        L_0x0059:
            r2 = r8
            goto L_0x0008
        L_0x005b:
            if (r1 != 0) goto L_0x006b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L_0x006b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r10.d = r2
            boolean r2 = r10.n(r6)
            if (r2 == 0) goto L_0x0079
            goto L_0x0002
        L_0x0079:
            java.lang.String r11 = "Unterminated string"
            r10.J(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.C0566a.z(char):java.lang.String");
    }
}
