package n;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.j;
import n5.C0874f;
import o.C0890a;
import y5.a;

public final class f implements Collection, Set, a {

    /* renamed from: a  reason: collision with root package name */
    public int[] f10216a = C0890a.f10413a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f10217b = C0890a.f10415c;

    /* renamed from: c  reason: collision with root package name */
    public int f10218c;

    public f(int i2) {
        if (i2 > 0) {
            h.b(this, i2);
        }
    }

    public final boolean add(Object obj) {
        int i2;
        int i5;
        int i6 = this.f10218c;
        if (obj == null) {
            i5 = h.c(this, (Object) null, 0);
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            i5 = h.c(this, obj, hashCode);
        }
        if (i5 >= 0) {
            return false;
        }
        int i7 = ~i5;
        int[] iArr = this.f10216a;
        if (i6 >= iArr.length) {
            int i8 = 8;
            if (i6 >= 8) {
                i8 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i8 = 4;
            }
            Object[] objArr = this.f10217b;
            h.b(this, i8);
            if (i6 == this.f10218c) {
                int[] iArr2 = this.f10216a;
                if (iArr2.length != 0) {
                    C0874f.u1(0, 0, iArr.length, iArr, iArr2);
                    C0874f.w1(objArr, 0, this.f10217b, objArr.length, 6);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i7 < i6) {
            int[] iArr3 = this.f10216a;
            int i9 = i7 + 1;
            C0874f.u1(i9, i7, i6, iArr3, iArr3);
            Object[] objArr2 = this.f10217b;
            C0874f.v1(objArr2, i9, objArr2, i7, i6);
        }
        int i10 = this.f10218c;
        if (i6 == i10) {
            int[] iArr4 = this.f10216a;
            if (i7 < iArr4.length) {
                iArr4[i7] = i2;
                this.f10217b[i7] = obj;
                this.f10218c = i10 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean addAll(Collection collection) {
        j.e(collection, "elements");
        int size = collection.size() + this.f10218c;
        int i2 = this.f10218c;
        int[] iArr = this.f10216a;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f10217b;
            h.b(this, size);
            int i5 = this.f10218c;
            if (i5 > 0) {
                C0874f.u1(0, 0, i5, iArr, this.f10216a);
                C0874f.w1(objArr, 0, this.f10217b, this.f10218c, 6);
            }
        }
        if (this.f10218c == i2) {
            for (Object add : collection) {
                z3 |= add(add);
            }
            return z3;
        }
        throw new ConcurrentModificationException();
    }

    public final void clear() {
        if (this.f10218c != 0) {
            this.f10216a = C0890a.f10413a;
            this.f10217b = C0890a.f10415c;
            this.f10218c = 0;
        }
        if (this.f10218c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean contains(Object obj) {
        int i2;
        if (obj == null) {
            i2 = h.c(this, (Object) null, 0);
        } else {
            i2 = h.c(this, obj, obj.hashCode());
        }
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        j.e(collection, "elements");
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.f10218c == ((Set) obj).size()) {
            try {
                int i2 = this.f10218c;
                int i5 = 0;
                while (i5 < i2) {
                    if (((Set) obj).contains(this.f10217b[i5])) {
                        i5++;
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f10216a;
        int i2 = this.f10218c;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    public final boolean isEmpty() {
        if (this.f10218c <= 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C0850a(this);
    }

    public final Object k(int i2) {
        int i5 = this.f10218c;
        Object[] objArr = this.f10217b;
        Object obj = objArr[i2];
        if (i5 <= 1) {
            clear();
        } else {
            int i6 = i5 - 1;
            int[] iArr = this.f10216a;
            int i7 = 8;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    C0874f.u1(i2, i8, i5, iArr, iArr);
                    Object[] objArr2 = this.f10217b;
                    C0874f.v1(objArr2, i2, objArr2, i8, i5);
                }
                this.f10217b[i6] = null;
            } else {
                if (i5 > 8) {
                    i7 = i5 + (i5 >> 1);
                }
                h.b(this, i7);
                if (i2 > 0) {
                    C0874f.u1(0, 0, i2, iArr, this.f10216a);
                    C0874f.w1(objArr, 0, this.f10217b, i2, 6);
                }
                if (i2 < i6) {
                    int i9 = i2 + 1;
                    C0874f.u1(i2, i9, i5, iArr, this.f10216a);
                    C0874f.v1(objArr, i2, this.f10217b, i9, i5);
                }
            }
            if (i5 == this.f10218c) {
                this.f10218c = i6;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public final boolean remove(Object obj) {
        int i2;
        if (obj == null) {
            i2 = h.c(this, (Object) null, 0);
        } else {
            i2 = h.c(this, obj, obj.hashCode());
        }
        if (i2 < 0) {
            return false;
        }
        k(i2);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        j.e(collection, "elements");
        boolean z3 = false;
        for (Object remove : collection) {
            z3 |= remove(remove);
        }
        return z3;
    }

    public final boolean retainAll(Collection collection) {
        j.e(collection, "elements");
        boolean z3 = false;
        for (int i2 = this.f10218c - 1; -1 < i2; i2--) {
            if (!collection.contains(this.f10217b[i2])) {
                k(i2);
                z3 = true;
            }
        }
        return z3;
    }

    public final int size() {
        return this.f10218c;
    }

    public final Object[] toArray() {
        Object[] objArr = this.f10217b;
        int i2 = this.f10218c;
        j.e(objArr, "<this>");
        int length = objArr.length;
        if (i2 <= length) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr, 0, i2);
            j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10218c * 14);
        sb.append('{');
        int i2 = this.f10218c;
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            Object obj = this.f10217b[i5];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        j.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        int i2 = this.f10218c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        } else if (objArr.length > i2) {
            objArr[i2] = null;
        }
        C0874f.v1(this.f10217b, 0, objArr, 0, this.f10218c);
        return objArr;
    }
}
