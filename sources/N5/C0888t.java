package n5;

import com.google.android.gms.internal.measurement.a;
import h0.C0552a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.j;

/* renamed from: n5.t  reason: case insensitive filesystem */
public final class C0888t extends C0871c implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f10405a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10406b;

    /* renamed from: c  reason: collision with root package name */
    public int f10407c;
    public int d;

    public C0888t(Object[] objArr, int i2) {
        this.f10405a = objArr;
        if (i2 < 0) {
            throw new IllegalArgumentException(a.f(i2, "ring buffer filled size should not be negative but it is ").toString());
        } else if (i2 <= objArr.length) {
            this.f10406b = objArr.length;
            this.d = i2;
        } else {
            StringBuilder s6 = C0552a.s(i2, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            s6.append(objArr.length);
            throw new IllegalArgumentException(s6.toString().toString());
        }
    }

    public final Object get(int i2) {
        int k6 = k();
        if (i2 < 0 || i2 >= k6) {
            throw new IndexOutOfBoundsException(C0552a.l("index: ", i2, k6, ", size: "));
        }
        return this.f10405a[(this.f10407c + i2) % this.f10406b];
    }

    public final Iterator iterator() {
        return new C0887s(this);
    }

    public final int k() {
        return this.d;
    }

    public final void t() {
        if (20 <= this.d) {
            int i2 = this.f10407c;
            int i5 = this.f10406b;
            int i6 = (i2 + 20) % i5;
            Object[] objArr = this.f10405a;
            if (i2 > i6) {
                C0874f.x1(objArr, i2, i5);
                C0874f.x1(objArr, 0, i6);
            } else {
                C0874f.x1(objArr, i2, i6);
            }
            this.f10407c = i6;
            this.d -= 20;
            return;
        }
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.d).toString());
    }

    public final Object[] toArray() {
        return toArray(new Object[k()]);
    }

    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        j.e(objArr, "array");
        int length = objArr.length;
        int i2 = this.d;
        if (length < i2) {
            objArr = Arrays.copyOf(objArr, i2);
            j.d(objArr, "copyOf(...)");
        }
        int i5 = this.d;
        int i6 = this.f10407c;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            objArr2 = this.f10405a;
            if (i8 < i5 && i6 < this.f10406b) {
                objArr[i8] = objArr2[i6];
                i8++;
                i6++;
            }
        }
        while (i8 < i5) {
            objArr[i8] = objArr2[i7];
            i8++;
            i7++;
        }
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }
}
