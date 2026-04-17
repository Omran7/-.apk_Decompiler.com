package C;

import android.graphics.Insets;

public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final g f373e = new g(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f374a;

    /* renamed from: b  reason: collision with root package name */
    public final int f375b;

    /* renamed from: c  reason: collision with root package name */
    public final int f376c;
    public final int d;

    public g(int i2, int i5, int i6, int i7) {
        this.f374a = i2;
        this.f375b = i5;
        this.f376c = i6;
        this.d = i7;
    }

    public static g a(g gVar, g gVar2) {
        return b(Math.max(gVar.f374a, gVar2.f374a), Math.max(gVar.f375b, gVar2.f375b), Math.max(gVar.f376c, gVar2.f376c), Math.max(gVar.d, gVar2.d));
    }

    public static g b(int i2, int i5, int i6, int i7) {
        if (i2 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            return f373e;
        }
        return new g(i2, i5, i6, i7);
    }

    public static g c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return f.a(this.f374a, this.f375b, this.f376c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.d == gVar.d && this.f374a == gVar.f374a && this.f376c == gVar.f376c && this.f375b == gVar.f375b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f374a * 31) + this.f375b) * 31) + this.f376c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f374a + ", top=" + this.f375b + ", right=" + this.f376c + ", bottom=" + this.d + '}';
    }
}
