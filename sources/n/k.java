package n;

import java.util.Arrays;
import kotlin.jvm.internal.j;
import n5.C0874f;
import o.C0890a;

public final class k implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ boolean f10227a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ int[] f10228b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object[] f10229c;
    public /* synthetic */ int d;

    public k(int i2) {
        if (i2 == 0) {
            this.f10228b = C0890a.f10413a;
            this.f10229c = C0890a.f10415c;
            return;
        }
        int i5 = i2 * 4;
        int i6 = 4;
        while (true) {
            if (i6 >= 32) {
                break;
            }
            int i7 = (1 << i6) - 12;
            if (i5 <= i7) {
                i5 = i7;
                break;
            }
            i6++;
        }
        int i8 = i5 / 4;
        this.f10228b = new int[i8];
        this.f10229c = new Object[i8];
    }

    public final void a(int i2, Object obj) {
        int i5 = this.d;
        if (i5 == 0 || i2 > this.f10228b[i5 - 1]) {
            if (this.f10227a && i5 >= this.f10228b.length) {
                h.a(this);
            }
            int i6 = this.d;
            if (i6 >= this.f10228b.length) {
                int i7 = (i6 + 1) * 4;
                int i8 = 4;
                while (true) {
                    if (i8 >= 32) {
                        break;
                    }
                    int i9 = (1 << i8) - 12;
                    if (i7 <= i9) {
                        i7 = i9;
                        break;
                    }
                    i8++;
                }
                int i10 = i7 / 4;
                int[] copyOf = Arrays.copyOf(this.f10228b, i10);
                j.d(copyOf, "copyOf(this, newSize)");
                this.f10228b = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f10229c, i10);
                j.d(copyOf2, "copyOf(this, newSize)");
                this.f10229c = copyOf2;
            }
            this.f10228b[i6] = i2;
            this.f10229c[i6] = obj;
            this.d = i6 + 1;
            return;
        }
        g(i2, obj);
    }

    public final void b() {
        int i2 = this.d;
        Object[] objArr = this.f10229c;
        for (int i5 = 0; i5 < i2; i5++) {
            objArr[i5] = null;
        }
        this.d = 0;
        this.f10227a = false;
    }

    /* renamed from: c */
    public final k clone() {
        Object clone = super.clone();
        j.c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) clone;
        kVar.f10228b = (int[]) this.f10228b.clone();
        kVar.f10229c = (Object[]) this.f10229c.clone();
        return kVar;
    }

    public final Object d(int i2) {
        Object obj;
        int a6 = C0890a.a(this.d, i2, this.f10228b);
        if (a6 < 0 || (obj = this.f10229c[a6]) == h.f10223b) {
            return null;
        }
        return obj;
    }

    public final Object e(int i2, Object obj) {
        Object obj2;
        int a6 = C0890a.a(this.d, i2, this.f10228b);
        if (a6 < 0 || (obj2 = this.f10229c[a6]) == h.f10223b) {
            return obj;
        }
        return obj2;
    }

    public final int f(int i2) {
        if (this.f10227a) {
            h.a(this);
        }
        return this.f10228b[i2];
    }

    public final void g(int i2, Object obj) {
        int a6 = C0890a.a(this.d, i2, this.f10228b);
        if (a6 >= 0) {
            this.f10229c[a6] = obj;
            return;
        }
        int i5 = ~a6;
        int i6 = this.d;
        if (i5 < i6) {
            Object[] objArr = this.f10229c;
            if (objArr[i5] == h.f10223b) {
                this.f10228b[i5] = i2;
                objArr[i5] = obj;
                return;
            }
        }
        if (this.f10227a && i6 >= this.f10228b.length) {
            h.a(this);
            i5 = ~C0890a.a(this.d, i2, this.f10228b);
        }
        int i7 = this.d;
        if (i7 >= this.f10228b.length) {
            int i8 = (i7 + 1) * 4;
            int i9 = 4;
            while (true) {
                if (i9 >= 32) {
                    break;
                }
                int i10 = (1 << i9) - 12;
                if (i8 <= i10) {
                    i8 = i10;
                    break;
                }
                i9++;
            }
            int i11 = i8 / 4;
            int[] copyOf = Arrays.copyOf(this.f10228b, i11);
            j.d(copyOf, "copyOf(this, newSize)");
            this.f10228b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f10229c, i11);
            j.d(copyOf2, "copyOf(this, newSize)");
            this.f10229c = copyOf2;
        }
        int i12 = this.d;
        if (i12 - i5 != 0) {
            int[] iArr = this.f10228b;
            int i13 = i5 + 1;
            C0874f.u1(i13, i5, i12, iArr, iArr);
            Object[] objArr2 = this.f10229c;
            C0874f.v1(objArr2, i13, objArr2, i5, this.d);
        }
        this.f10228b[i5] = i2;
        this.f10229c[i5] = obj;
        this.d++;
    }

    public final int h() {
        if (this.f10227a) {
            h.a(this);
        }
        return this.d;
    }

    public final Object i(int i2) {
        if (this.f10227a) {
            h.a(this);
        }
        return this.f10229c[i2];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i2 = this.d;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(f(i5));
            sb.append('=');
            Object i6 = i(i5);
            if (i6 != this) {
                sb.append(i6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        j.d(sb2, "buffer.toString()");
        return sb2;
    }

    public k() {
        this(10);
    }
}
