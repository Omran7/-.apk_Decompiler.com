package n;

import com.google.android.gms.internal.measurement.a;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import n5.C0874f;
import o.C0890a;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public int[] f10224a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f10225b;

    /* renamed from: c  reason: collision with root package name */
    public int f10226c;

    public j(int i2) {
        int[] iArr;
        Object[] objArr;
        if (i2 == 0) {
            iArr = C0890a.f10413a;
        } else {
            iArr = new int[i2];
        }
        this.f10224a = iArr;
        if (i2 == 0) {
            objArr = C0890a.f10415c;
        } else {
            objArr = new Object[(i2 << 1)];
        }
        this.f10225b = objArr;
    }

    public final int a(Object obj) {
        int i2 = this.f10226c * 2;
        Object[] objArr = this.f10225b;
        if (obj == null) {
            for (int i5 = 1; i5 < i2; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i2; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final void b(int i2) {
        int i5 = this.f10226c;
        int[] iArr = this.f10224a;
        if (iArr.length < i2) {
            int[] copyOf = Arrays.copyOf(iArr, i2);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f10224a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f10225b, i2 * 2);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f10225b = copyOf2;
        }
        if (this.f10226c != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(int i2, Object obj) {
        int i5 = this.f10226c;
        if (i5 == 0) {
            return -1;
        }
        int a6 = C0890a.a(i5, i2, this.f10224a);
        if (a6 < 0 || kotlin.jvm.internal.j.a(obj, this.f10225b[a6 << 1])) {
            return a6;
        }
        int i6 = a6 + 1;
        while (i6 < i5 && this.f10224a[i6] == i2) {
            if (kotlin.jvm.internal.j.a(obj, this.f10225b[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        int i7 = a6 - 1;
        while (i7 >= 0 && this.f10224a[i7] == i2) {
            if (kotlin.jvm.internal.j.a(obj, this.f10225b[i7 << 1])) {
                return i7;
            }
            i7--;
        }
        return ~i6;
    }

    public void clear() {
        if (this.f10226c > 0) {
            this.f10224a = C0890a.f10413a;
            this.f10225b = C0890a.f10415c;
            this.f10226c = 0;
        }
        if (this.f10226c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i2 = this.f10226c;
        if (i2 == 0) {
            return -1;
        }
        int a6 = C0890a.a(i2, 0, this.f10224a);
        if (a6 < 0 || this.f10225b[a6 << 1] == null) {
            return a6;
        }
        int i5 = a6 + 1;
        while (i5 < i2 && this.f10224a[i5] == 0) {
            if (this.f10225b[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        int i6 = a6 - 1;
        while (i6 >= 0 && this.f10224a[i6] == 0) {
            if (this.f10225b[i6 << 1] == null) {
                return i6;
            }
            i6--;
        }
        return ~i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof j) {
                int i2 = this.f10226c;
                if (i2 != ((j) obj).f10226c) {
                    return false;
                }
                j jVar = (j) obj;
                for (int i5 = 0; i5 < i2; i5++) {
                    Object f6 = f(i5);
                    Object j6 = j(i5);
                    Object obj2 = jVar.get(f6);
                    if (j6 == null) {
                        if (obj2 != null || !jVar.containsKey(f6)) {
                            return false;
                        }
                    } else if (!j6.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f10226c != ((Map) obj).size()) {
                return false;
            } else {
                int i6 = this.f10226c;
                for (int i7 = 0; i7 < i6; i7++) {
                    Object f7 = f(i7);
                    Object j7 = j(i7);
                    Object obj3 = ((Map) obj).get(f7);
                    if (j7 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(f7)) {
                            return false;
                        }
                    } else if (!j7.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i2) {
        if (i2 >= 0 && i2 < this.f10226c) {
            return this.f10225b[i2 << 1];
        }
        throw new IllegalArgumentException(a.f(i2, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public void g(e eVar) {
        int i2 = eVar.f10226c;
        b(this.f10226c + i2);
        if (this.f10226c != 0) {
            for (int i5 = 0; i5 < i2; i5++) {
                put(eVar.f(i5), eVar.j(i5));
            }
        } else if (i2 > 0) {
            C0874f.u1(0, 0, i2, eVar.f10224a, this.f10224a);
            C0874f.v1(eVar.f10225b, 0, this.f10225b, 0, i2 << 1);
            this.f10226c = i2;
        }
    }

    public Object get(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return this.f10225b[(d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return this.f10225b[(d << 1) + 1];
        }
        return obj2;
    }

    public Object h(int i2) {
        int i5;
        if (i2 < 0 || i2 >= (i5 = this.f10226c)) {
            throw new IllegalArgumentException(a.f(i2, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f10225b;
        int i6 = i2 << 1;
        Object obj = objArr[i6 + 1];
        if (i5 <= 1) {
            clear();
        } else {
            int i7 = i5 - 1;
            int[] iArr = this.f10224a;
            int i8 = 8;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i2 < i7) {
                    int i9 = i2 + 1;
                    C0874f.u1(i2, i9, i5, iArr, iArr);
                    Object[] objArr2 = this.f10225b;
                    C0874f.v1(objArr2, i6, objArr2, i9 << 1, i5 << 1);
                }
                Object[] objArr3 = this.f10225b;
                int i10 = i7 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                if (i5 > 8) {
                    i8 = i5 + (i5 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i8);
                kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
                this.f10224a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f10225b, i8 << 1);
                kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
                this.f10225b = copyOf2;
                if (i5 == this.f10226c) {
                    if (i2 > 0) {
                        C0874f.u1(0, 0, i2, iArr, this.f10224a);
                        C0874f.v1(objArr, 0, this.f10225b, 0, i6);
                    }
                    if (i2 < i7) {
                        int i11 = i2 + 1;
                        C0874f.u1(i2, i11, i5, iArr, this.f10224a);
                        C0874f.v1(objArr, i6, this.f10225b, i11 << 1, i5 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i5 == this.f10226c) {
                this.f10226c = i7;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public int hashCode() {
        int i2;
        int[] iArr = this.f10224a;
        Object[] objArr = this.f10225b;
        int i5 = this.f10226c;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            Object obj = objArr[i6];
            int i9 = iArr[i7];
            if (obj != null) {
                i2 = obj.hashCode();
            } else {
                i2 = 0;
            }
            i8 += i2 ^ i9;
            i7++;
            i6 += 2;
        }
        return i8;
    }

    public Object i(int i2, Object obj) {
        if (i2 < 0 || i2 >= this.f10226c) {
            throw new IllegalArgumentException(a.f(i2, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i5 = (i2 << 1) + 1;
        Object[] objArr = this.f10225b;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        if (this.f10226c <= 0) {
            return true;
        }
        return false;
    }

    public final Object j(int i2) {
        if (i2 >= 0 && i2 < this.f10226c) {
            return this.f10225b[(i2 << 1) + 1];
        }
        throw new IllegalArgumentException(a.f(i2, "Expected index to be within 0..size()-1, but was ").toString());
    }

    public Object put(Object obj, Object obj2) {
        int i2;
        int i5;
        int i6 = this.f10226c;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        if (obj != null) {
            i5 = c(i2, obj);
        } else {
            i5 = e();
        }
        if (i5 >= 0) {
            int i7 = (i5 << 1) + 1;
            Object[] objArr = this.f10225b;
            Object obj3 = objArr[i7];
            objArr[i7] = obj2;
            return obj3;
        }
        int i8 = ~i5;
        int[] iArr = this.f10224a;
        if (i6 >= iArr.length) {
            int i9 = 8;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i9 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i9);
            kotlin.jvm.internal.j.d(copyOf, "copyOf(this, newSize)");
            this.f10224a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f10225b, i9 << 1);
            kotlin.jvm.internal.j.d(copyOf2, "copyOf(this, newSize)");
            this.f10225b = copyOf2;
            if (i6 != this.f10226c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i8 < i6) {
            int[] iArr2 = this.f10224a;
            int i10 = i8 + 1;
            C0874f.u1(i10, i8, i6, iArr2, iArr2);
            Object[] objArr2 = this.f10225b;
            C0874f.v1(objArr2, i10 << 1, objArr2, i8 << 1, this.f10226c << 1);
        }
        int i11 = this.f10226c;
        if (i6 == i11) {
            int[] iArr3 = this.f10224a;
            if (i8 < iArr3.length) {
                iArr3[i8] = i2;
                Object[] objArr3 = this.f10225b;
                int i12 = i8 << 1;
                objArr3[i12] = obj;
                objArr3[i12 + 1] = obj2;
                this.f10226c = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int d = d(obj);
        if (d >= 0) {
            return h(d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d = d(obj);
        if (d >= 0) {
            return i(d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f10226c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10226c * 28);
        sb.append('{');
        int i2 = this.f10226c;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object f6 = f(i5);
            if (f6 != sb) {
                sb.append(f6);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j6 = j(i5);
            if (j6 != sb) {
                sb.append(j6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        kotlin.jvm.internal.j.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int d = d(obj);
        if (d < 0 || !kotlin.jvm.internal.j.a(obj2, j(d))) {
            return false;
        }
        h(d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d = d(obj);
        if (d < 0 || !kotlin.jvm.internal.j.a(obj2, j(d))) {
            return false;
        }
        i(d, obj3);
        return true;
    }
}
