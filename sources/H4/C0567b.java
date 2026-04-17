package h4;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: h4.b  reason: case insensitive filesystem */
public class C0567b implements Closeable, Flushable {

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f8167r = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f8168s = new String[128];

    /* renamed from: t  reason: collision with root package name */
    public static final String[] f8169t;

    /* renamed from: a  reason: collision with root package name */
    public final Writer f8170a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f8171b;

    /* renamed from: c  reason: collision with root package name */
    public int f8172c = 0;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8173e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8174f;

    /* renamed from: p  reason: collision with root package name */
    public String f8175p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8176q;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f8168s[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = f8168s;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f8169t = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C0567b(Writer writer) {
        int[] iArr = new int[32];
        this.f8171b = iArr;
        if (iArr.length == 0) {
            this.f8171b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f8171b;
        int i2 = this.f8172c;
        this.f8172c = i2 + 1;
        iArr2[i2] = 6;
        this.d = ":";
        this.f8176q = true;
        Objects.requireNonNull(writer, "out == null");
        this.f8170a = writer;
    }

    public final void c() {
        int q6 = q();
        if (q6 != 1) {
            Writer writer = this.f8170a;
            if (q6 == 2) {
                writer.append(',');
                o();
            } else if (q6 != 4) {
                if (q6 != 6) {
                    if (q6 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    } else if (!this.f8173e) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                this.f8171b[this.f8172c - 1] = 7;
            } else {
                writer.append(this.d);
                this.f8171b[this.f8172c - 1] = 5;
            }
        } else {
            this.f8171b[this.f8172c - 1] = 2;
            o();
        }
    }

    public void close() {
        this.f8170a.close();
        int i2 = this.f8172c;
        if (i2 > 1 || (i2 == 1 && this.f8171b[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f8172c = 0;
    }

    public void d() {
        x();
        c();
        int i2 = this.f8172c;
        int[] iArr = this.f8171b;
        if (i2 == iArr.length) {
            this.f8171b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f8171b;
        int i5 = this.f8172c;
        this.f8172c = i5 + 1;
        iArr2[i5] = 1;
        this.f8170a.write(91);
    }

    public void flush() {
        if (this.f8172c != 0) {
            this.f8170a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void j() {
        x();
        c();
        int i2 = this.f8172c;
        int[] iArr = this.f8171b;
        if (i2 == iArr.length) {
            this.f8171b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f8171b;
        int i5 = this.f8172c;
        this.f8172c = i5 + 1;
        iArr2[i5] = 3;
        this.f8170a.write(123);
    }

    public final void k(int i2, int i5, char c3) {
        int q6 = q();
        if (q6 != i5 && q6 != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f8175p == null) {
            this.f8172c--;
            if (q6 == i5) {
                o();
            }
            this.f8170a.write(c3);
        } else {
            throw new IllegalStateException("Dangling name: " + this.f8175p);
        }
    }

    public void l() {
        k(1, 2, ']');
    }

    public void m() {
        k(3, 5, '}');
    }

    public void n(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f8175p != null) {
            throw new IllegalStateException();
        } else if (this.f8172c != 0) {
            this.f8175p = str;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public C0567b p() {
        if (this.f8175p != null) {
            if (this.f8176q) {
                x();
            } else {
                this.f8175p = null;
                return this;
            }
        }
        c();
        this.f8170a.write("null");
        return this;
    }

    public final int q() {
        int i2 = this.f8172c;
        if (i2 != 0) {
            return this.f8171b[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void r(String str) {
        String[] strArr;
        String str2;
        if (this.f8174f) {
            strArr = f8169t;
        } else {
            strArr = f8168s;
        }
        Writer writer = this.f8170a;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i5) {
                writer.write(str, i2, i5 - i2);
            }
            writer.write(str2);
            i2 = i5 + 1;
        }
        if (i2 < length) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }

    public void s(double d6) {
        x();
        if (this.f8173e || (!Double.isNaN(d6) && !Double.isInfinite(d6))) {
            c();
            this.f8170a.append(Double.toString(d6));
            return;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d6);
    }

    public void t(long j6) {
        x();
        c();
        this.f8170a.write(Long.toString(j6));
    }

    public void u(Number number) {
        if (number == null) {
            p();
            return;
        }
        x();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!(cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class || f8167r.matcher(obj).matches())) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f8173e) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        c();
        this.f8170a.append(obj);
    }

    public void v(String str) {
        if (str == null) {
            p();
            return;
        }
        x();
        c();
        r(str);
    }

    public void w(boolean z3) {
        String str;
        x();
        c();
        if (z3) {
            str = "true";
        } else {
            str = "false";
        }
        this.f8170a.write(str);
    }

    public final void x() {
        if (this.f8175p != null) {
            int q6 = q();
            if (q6 == 5) {
                this.f8170a.write(44);
            } else if (q6 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            o();
            this.f8171b[this.f8172c - 1] = 4;
            r(this.f8175p);
            this.f8175p = null;
        }
    }

    public final void o() {
    }
}
