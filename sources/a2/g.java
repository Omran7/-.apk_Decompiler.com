package A2;

import I1.b;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public abstract class g extends a implements Set {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f31c = 0;

    /* renamed from: b  reason: collision with root package name */
    public transient d f32b;

    public static int y(int i2) {
        int max = Math.max(i2, 2);
        boolean z3 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z3 = false;
        }
        if (z3) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static g z(int i2, Object... objArr) {
        if (i2 == 0) {
            return o.f50s;
        }
        if (i2 != 1) {
            int y6 = y(i2);
            Object[] objArr2 = new Object[y6];
            int i5 = y6 - 1;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < i2) {
                Object obj = objArr[i6];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int F02 = b.F0(hashCode);
                    while (true) {
                        int i9 = F02 & i5;
                        Object obj2 = objArr2[i9];
                        if (obj2 == null) {
                            objArr[i8] = obj;
                            objArr2[i9] = obj;
                            i7 += hashCode;
                            i8++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            F02++;
                        }
                    }
                    i6++;
                } else {
                    StringBuilder sb = new StringBuilder(20);
                    sb.append("at index ");
                    sb.append(i6);
                    throw new NullPointerException(sb.toString());
                }
            }
            Arrays.fill(objArr, i8, i2, (Object) null);
            if (i8 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                return new r(obj3);
            } else if (y(i8) < y6 / 2) {
                return z(i8, objArr);
            } else {
                int length = objArr.length;
                if (i8 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i8);
                }
                return new o(objArr, i7, objArr2, i5, i8);
            }
        } else {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new r(obj4);
        }
    }

    public d A() {
        Object[] array = toArray(a.f18a);
        b bVar = d.f24b;
        return d.x(array.length, array);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof g) && (this instanceof o)) {
            g gVar = (g) obj;
            gVar.getClass();
            if ((gVar instanceof o) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        int i2;
        int i5 = 0;
        for (Object next : this) {
            if (next != null) {
                i2 = next.hashCode();
            } else {
                i2 = 0;
            }
            i5 = ~(~(i5 + i2));
        }
        return i5;
    }

    public d x() {
        d dVar = this.f32b;
        if (dVar != null) {
            return dVar;
        }
        d A6 = A();
        this.f32b = A6;
        return A6;
    }
}
