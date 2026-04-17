package n;

import com.google.android.gms.internal.measurement.a;
import java.util.Arrays;
import kotlin.jvm.internal.j;
import n5.C0874f;
import o.C0890a;

public final class g implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ boolean f10219a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ long[] f10220b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object[] f10221c;
    public /* synthetic */ int d;

    public g(int i2) {
        if (i2 == 0) {
            this.f10220b = C0890a.f10414b;
            this.f10221c = C0890a.f10415c;
            return;
        }
        int i5 = i2 * 8;
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
        int i8 = i5 / 8;
        this.f10220b = new long[i8];
        this.f10221c = new Object[i8];
    }

    public final void a() {
        int i2 = this.d;
        Object[] objArr = this.f10221c;
        for (int i5 = 0; i5 < i2; i5++) {
            objArr[i5] = null;
        }
        this.d = 0;
        this.f10219a = false;
    }

    public final Object b(long j6) {
        Object obj;
        int b6 = C0890a.b(this.f10220b, this.d, j6);
        if (b6 < 0 || (obj = this.f10221c[b6]) == h.f10222a) {
            return null;
        }
        return obj;
    }

    public final long c(int i2) {
        int i5;
        if (i2 < 0 || i2 >= (i5 = this.d)) {
            throw new IllegalArgumentException(a.f(i2, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f10219a) {
            long[] jArr = this.f10220b;
            Object[] objArr = this.f10221c;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != h.f10222a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f10219a = false;
            this.d = i6;
        }
        return this.f10220b[i2];
    }

    public final Object clone() {
        Object clone = super.clone();
        j.c(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        g gVar = (g) clone;
        gVar.f10220b = (long[]) this.f10220b.clone();
        gVar.f10221c = (Object[]) this.f10221c.clone();
        return gVar;
    }

    public final void d(Object obj, long j6) {
        int b6 = C0890a.b(this.f10220b, this.d, j6);
        if (b6 >= 0) {
            this.f10221c[b6] = obj;
            return;
        }
        int i2 = ~b6;
        int i5 = this.d;
        Object obj2 = h.f10222a;
        if (i2 < i5) {
            Object[] objArr = this.f10221c;
            if (objArr[i2] == obj2) {
                this.f10220b[i2] = j6;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f10219a) {
            long[] jArr = this.f10220b;
            if (i5 >= jArr.length) {
                Object[] objArr2 = this.f10221c;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    Object obj3 = objArr2[i7];
                    if (obj3 != obj2) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr2[i6] = obj3;
                            objArr2[i7] = null;
                        }
                        i6++;
                    }
                }
                this.f10219a = false;
                this.d = i6;
                i2 = ~C0890a.b(this.f10220b, i6, j6);
            }
        }
        int i8 = this.d;
        if (i8 >= this.f10220b.length) {
            int i9 = (i8 + 1) * 8;
            int i10 = 4;
            while (true) {
                if (i10 >= 32) {
                    break;
                }
                int i11 = (1 << i10) - 12;
                if (i9 <= i11) {
                    i9 = i11;
                    break;
                }
                i10++;
            }
            int i12 = i9 / 8;
            long[] copyOf = Arrays.copyOf(this.f10220b, i12);
            j.d(copyOf, "copyOf(this, newSize)");
            this.f10220b = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f10221c, i12);
            j.d(copyOf2, "copyOf(this, newSize)");
            this.f10221c = copyOf2;
        }
        int i13 = this.d - i2;
        if (i13 != 0) {
            long[] jArr2 = this.f10220b;
            int i14 = i2 + 1;
            j.e(jArr2, "<this>");
            System.arraycopy(jArr2, i2, jArr2, i14, i13);
            Object[] objArr3 = this.f10221c;
            C0874f.v1(objArr3, i14, objArr3, i2, this.d);
        }
        this.f10220b[i2] = j6;
        this.f10221c[i2] = obj;
        this.d++;
    }

    public final int e() {
        if (this.f10219a) {
            int i2 = this.d;
            long[] jArr = this.f10220b;
            Object[] objArr = this.f10221c;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                Object obj = objArr[i6];
                if (obj != h.f10222a) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f10219a = false;
            this.d = i5;
        }
        return this.d;
    }

    public final Object f(int i2) {
        int i5;
        if (i2 < 0 || i2 >= (i5 = this.d)) {
            throw new IllegalArgumentException(a.f(i2, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f10219a) {
            long[] jArr = this.f10220b;
            Object[] objArr = this.f10221c;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != h.f10222a) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.f10219a = false;
            this.d = i6;
        }
        return this.f10221c[i2];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i2 = this.d;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(c(i5));
            sb.append('=');
            Object f6 = f(i5);
            if (f6 != sb) {
                sb.append(f6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        j.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public g() {
        this(10);
    }
}
