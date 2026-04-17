package n5;

import com.bumptech.glide.c;
import h0.C0552a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
import y5.a;

/* renamed from: n5.e  reason: case insensitive filesystem */
public final class C0873e extends AbstractList implements List, a {
    public static final Object[] d = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public int f10394a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f10395b = d;

    /* renamed from: c  reason: collision with root package name */
    public int f10396c;

    public final void add(int i2, Object obj) {
        int i5;
        int i6 = this.f10396c;
        if (i2 < 0 || i2 > i6) {
            throw new IndexOutOfBoundsException(C0552a.l("index: ", i2, i6, ", size: "));
        } else if (i2 == i6) {
            addLast(obj);
        } else if (i2 == 0) {
            addFirst(obj);
        } else {
            z();
            t(this.f10396c + 1);
            int y6 = y(this.f10394a + i2);
            int i7 = this.f10396c;
            if (i2 < ((i7 + 1) >> 1)) {
                if (y6 == 0) {
                    Object[] objArr = this.f10395b;
                    j.e(objArr, "<this>");
                    y6 = objArr.length;
                }
                int i8 = y6 - 1;
                int i9 = this.f10394a;
                if (i9 == 0) {
                    Object[] objArr2 = this.f10395b;
                    j.e(objArr2, "<this>");
                    i5 = objArr2.length - 1;
                } else {
                    i5 = i9 - 1;
                }
                int i10 = this.f10394a;
                if (i8 >= i10) {
                    Object[] objArr3 = this.f10395b;
                    objArr3[i5] = objArr3[i10];
                    C0874f.v1(objArr3, i10, objArr3, i10 + 1, i8 + 1);
                } else {
                    Object[] objArr4 = this.f10395b;
                    C0874f.v1(objArr4, i10 - 1, objArr4, i10, objArr4.length);
                    Object[] objArr5 = this.f10395b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    C0874f.v1(objArr5, 0, objArr5, 1, i8 + 1);
                }
                this.f10395b[i8] = obj;
                this.f10394a = i5;
            } else {
                int y7 = y(this.f10394a + i7);
                if (y6 < y7) {
                    Object[] objArr6 = this.f10395b;
                    C0874f.v1(objArr6, y6 + 1, objArr6, y6, y7);
                } else {
                    Object[] objArr7 = this.f10395b;
                    C0874f.v1(objArr7, 1, objArr7, 0, y7);
                    Object[] objArr8 = this.f10395b;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    C0874f.v1(objArr8, y6 + 1, objArr8, y6, objArr8.length - 1);
                }
                this.f10395b[y6] = obj;
            }
            this.f10396c++;
        }
    }

    public final boolean addAll(int i2, Collection collection) {
        j.e(collection, "elements");
        int i5 = this.f10396c;
        if (i2 < 0 || i2 > i5) {
            throw new IndexOutOfBoundsException(C0552a.l("index: ", i2, i5, ", size: "));
        } else if (collection.isEmpty()) {
            return false;
        } else {
            if (i2 == this.f10396c) {
                return addAll(collection);
            }
            z();
            t(collection.size() + this.f10396c);
            int y6 = y(this.f10394a + this.f10396c);
            int y7 = y(this.f10394a + i2);
            int size = collection.size();
            if (i2 < ((this.f10396c + 1) >> 1)) {
                int i6 = this.f10394a;
                int i7 = i6 - size;
                if (y7 < i6) {
                    Object[] objArr = this.f10395b;
                    C0874f.v1(objArr, i7, objArr, i6, objArr.length);
                    if (size >= y7) {
                        Object[] objArr2 = this.f10395b;
                        C0874f.v1(objArr2, objArr2.length - size, objArr2, 0, y7);
                    } else {
                        Object[] objArr3 = this.f10395b;
                        C0874f.v1(objArr3, objArr3.length - size, objArr3, 0, size);
                        Object[] objArr4 = this.f10395b;
                        C0874f.v1(objArr4, 0, objArr4, size, y7);
                    }
                } else if (i7 >= 0) {
                    Object[] objArr5 = this.f10395b;
                    C0874f.v1(objArr5, i7, objArr5, i6, y7);
                } else {
                    Object[] objArr6 = this.f10395b;
                    i7 += objArr6.length;
                    int i8 = y7 - i6;
                    int length = objArr6.length - i7;
                    if (length >= i8) {
                        C0874f.v1(objArr6, i7, objArr6, i6, y7);
                    } else {
                        C0874f.v1(objArr6, i7, objArr6, i6, i6 + length);
                        Object[] objArr7 = this.f10395b;
                        C0874f.v1(objArr7, 0, objArr7, this.f10394a + length, y7);
                    }
                }
                this.f10394a = i7;
                k(w(y7 - size), collection);
            } else {
                int i9 = y7 + size;
                if (y7 < y6) {
                    int i10 = size + y6;
                    Object[] objArr8 = this.f10395b;
                    if (i10 <= objArr8.length) {
                        C0874f.v1(objArr8, i9, objArr8, y7, y6);
                    } else if (i9 >= objArr8.length) {
                        C0874f.v1(objArr8, i9 - objArr8.length, objArr8, y7, y6);
                    } else {
                        int length2 = y6 - (i10 - objArr8.length);
                        C0874f.v1(objArr8, 0, objArr8, length2, y6);
                        Object[] objArr9 = this.f10395b;
                        C0874f.v1(objArr9, i9, objArr9, y7, length2);
                    }
                } else {
                    Object[] objArr10 = this.f10395b;
                    C0874f.v1(objArr10, size, objArr10, 0, y6);
                    Object[] objArr11 = this.f10395b;
                    if (i9 >= objArr11.length) {
                        C0874f.v1(objArr11, i9 - objArr11.length, objArr11, y7, objArr11.length);
                    } else {
                        C0874f.v1(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                        Object[] objArr12 = this.f10395b;
                        C0874f.v1(objArr12, i9, objArr12, y7, objArr12.length - size);
                    }
                }
                k(y7, collection);
            }
            return true;
        }
    }

    public final void addFirst(Object obj) {
        z();
        t(this.f10396c + 1);
        int i2 = this.f10394a;
        if (i2 == 0) {
            Object[] objArr = this.f10395b;
            j.e(objArr, "<this>");
            i2 = objArr.length;
        }
        int i5 = i2 - 1;
        this.f10394a = i5;
        this.f10395b[i5] = obj;
        this.f10396c++;
    }

    public final void addLast(Object obj) {
        z();
        t(this.f10396c + 1);
        this.f10395b[y(this.f10394a + this.f10396c)] = obj;
        this.f10396c++;
    }

    public final void clear() {
        if (!isEmpty()) {
            z();
            x(this.f10394a, y(this.f10394a + this.f10396c));
        }
        this.f10394a = 0;
        this.f10396c = 0;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final Object get(int i2) {
        int i5 = this.f10396c;
        if (i2 >= 0 && i2 < i5) {
            return this.f10395b[y(this.f10394a + i2)];
        }
        throw new IndexOutOfBoundsException(C0552a.l("index: ", i2, i5, ", size: "));
    }

    public final int indexOf(Object obj) {
        int i2;
        int y6 = y(this.f10394a + this.f10396c);
        int i5 = this.f10394a;
        if (i5 < y6) {
            while (i5 < y6) {
                if (j.a(obj, this.f10395b[i5])) {
                    i2 = this.f10394a;
                } else {
                    i5++;
                }
            }
            return -1;
        } else if (i5 < y6) {
            return -1;
        } else {
            int length = this.f10395b.length;
            while (true) {
                if (i5 >= length) {
                    int i6 = 0;
                    while (i6 < y6) {
                        if (j.a(obj, this.f10395b[i6])) {
                            i5 = i6 + this.f10395b.length;
                            i2 = this.f10394a;
                        } else {
                            i6++;
                        }
                    }
                    return -1;
                } else if (j.a(obj, this.f10395b[i5])) {
                    i2 = this.f10394a;
                    break;
                } else {
                    i5++;
                }
            }
        }
        return i5 - i2;
    }

    public final boolean isEmpty() {
        if (this.f10396c == 0) {
            return true;
        }
        return false;
    }

    public final void k(int i2, Collection collection) {
        Iterator it2 = collection.iterator();
        int length = this.f10395b.length;
        while (i2 < length && it2.hasNext()) {
            this.f10395b[i2] = it2.next();
            i2++;
        }
        int i5 = this.f10394a;
        for (int i6 = 0; i6 < i5 && it2.hasNext(); i6++) {
            this.f10395b[i6] = it2.next();
        }
        this.f10396c = collection.size() + this.f10396c;
    }

    public final int lastIndexOf(Object obj) {
        int i2;
        int i5;
        int y6 = y(this.f10394a + this.f10396c);
        int i6 = this.f10394a;
        if (i6 < y6) {
            i2 = y6 - 1;
            if (i6 <= i2) {
                while (!j.a(obj, this.f10395b[i2])) {
                    if (i2 != i6) {
                        i2--;
                    }
                }
                i5 = this.f10394a;
            }
            return -1;
        }
        if (i6 > y6) {
            int i7 = y6 - 1;
            while (true) {
                if (-1 >= i7) {
                    Object[] objArr = this.f10395b;
                    j.e(objArr, "<this>");
                    int length = objArr.length - 1;
                    int i8 = this.f10394a;
                    if (i8 <= length) {
                        while (!j.a(obj, this.f10395b[i2])) {
                            if (i2 != i8) {
                                length = i2 - 1;
                            }
                        }
                        i5 = this.f10394a;
                    }
                } else if (j.a(obj, this.f10395b[i7])) {
                    i2 = i7 + this.f10395b.length;
                    i5 = this.f10394a;
                    break;
                } else {
                    i7--;
                }
            }
        }
        return -1;
        return i2 - i5;
    }

    public final Object remove(int i2) {
        int i5 = this.f10396c;
        if (i2 < 0 || i2 >= i5) {
            throw new IndexOutOfBoundsException(C0552a.l("index: ", i2, i5, ", size: "));
        } else if (i2 == i5 - 1) {
            return removeLast();
        } else {
            if (i2 == 0) {
                return removeFirst();
            }
            z();
            int y6 = y(this.f10394a + i2);
            Object[] objArr = this.f10395b;
            Object obj = objArr[y6];
            int i6 = this.f10396c;
            if (i2 < (i6 >> 1)) {
                int i7 = this.f10394a;
                if (y6 >= i7) {
                    C0874f.v1(objArr, i7 + 1, objArr, i7, y6);
                } else {
                    C0874f.v1(objArr, 1, objArr, 0, y6);
                    Object[] objArr2 = this.f10395b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i8 = this.f10394a;
                    C0874f.v1(objArr2, i8 + 1, objArr2, i8, objArr2.length - 1);
                }
                Object[] objArr3 = this.f10395b;
                int i9 = this.f10394a;
                objArr3[i9] = null;
                this.f10394a = v(i9);
            } else {
                int y7 = y((i6 - 1) + this.f10394a);
                if (y6 <= y7) {
                    Object[] objArr4 = this.f10395b;
                    C0874f.v1(objArr4, y6, objArr4, y6 + 1, y7 + 1);
                } else {
                    Object[] objArr5 = this.f10395b;
                    C0874f.v1(objArr5, y6, objArr5, y6 + 1, objArr5.length);
                    Object[] objArr6 = this.f10395b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    C0874f.v1(objArr6, 0, objArr6, 1, y7 + 1);
                }
                this.f10395b[y7] = null;
            }
            this.f10396c--;
            return obj;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection r11) {
        /*
            r10 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.j.e(r11, r0)
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x008f
            java.lang.Object[] r0 = r10.f10395b
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x008f
        L_0x0013:
            int r0 = r10.f10394a
            int r2 = r10.f10396c
            int r0 = r0 + r2
            int r0 = r10.y(r0)
            int r2 = r10.f10394a
            r3 = 1
            if (r2 >= r0) goto L_0x0040
            r4 = r2
        L_0x0022:
            if (r2 >= r0) goto L_0x003a
            java.lang.Object[] r5 = r10.f10395b
            r5 = r5[r2]
            boolean r6 = r11.contains(r5)
            if (r6 != 0) goto L_0x0036
            java.lang.Object[] r6 = r10.f10395b
            int r7 = r4 + 1
            r6[r4] = r5
            r4 = r7
            goto L_0x0037
        L_0x0036:
            r1 = r3
        L_0x0037:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x003a:
            java.lang.Object[] r11 = r10.f10395b
            n5.C0874f.x1(r11, r4, r0)
            goto L_0x0081
        L_0x0040:
            java.lang.Object[] r4 = r10.f10395b
            int r4 = r4.length
            r6 = r1
            r5 = r2
        L_0x0045:
            r7 = 0
            if (r2 >= r4) goto L_0x0060
            java.lang.Object[] r8 = r10.f10395b
            r9 = r8[r2]
            r8[r2] = r7
            boolean r7 = r11.contains(r9)
            if (r7 != 0) goto L_0x005c
            java.lang.Object[] r7 = r10.f10395b
            int r8 = r5 + 1
            r7[r5] = r9
            r5 = r8
            goto L_0x005d
        L_0x005c:
            r6 = r3
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0060:
            int r2 = r10.y(r5)
            r4 = r2
        L_0x0065:
            if (r1 >= r0) goto L_0x0080
            java.lang.Object[] r2 = r10.f10395b
            r5 = r2[r1]
            r2[r1] = r7
            boolean r2 = r11.contains(r5)
            if (r2 != 0) goto L_0x007c
            java.lang.Object[] r2 = r10.f10395b
            r2[r4] = r5
            int r4 = r10.v(r4)
            goto L_0x007d
        L_0x007c:
            r6 = r3
        L_0x007d:
            int r1 = r1 + 1
            goto L_0x0065
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r1 == 0) goto L_0x008f
            r10.z()
            int r11 = r10.f10394a
            int r4 = r4 - r11
            int r11 = r10.w(r4)
            r10.f10396c = r11
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.C0873e.removeAll(java.util.Collection):boolean");
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            z();
            Object[] objArr = this.f10395b;
            int i2 = this.f10394a;
            Object obj = objArr[i2];
            objArr[i2] = null;
            this.f10394a = v(i2);
            this.f10396c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            z();
            int y6 = y((this.f10396c - 1) + this.f10394a);
            Object[] objArr = this.f10395b;
            Object obj = objArr[y6];
            objArr[y6] = null;
            this.f10396c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final void removeRange(int i2, int i5) {
        c.g(i2, i5, this.f10396c);
        int i6 = i5 - i2;
        if (i6 != 0) {
            if (i6 == this.f10396c) {
                clear();
            } else if (i6 == 1) {
                remove(i2);
            } else {
                z();
                if (i2 < this.f10396c - i5) {
                    int y6 = y((i2 - 1) + this.f10394a);
                    int y7 = y((i5 - 1) + this.f10394a);
                    while (i2 > 0) {
                        int i7 = y6 + 1;
                        int min = Math.min(i2, Math.min(i7, y7 + 1));
                        Object[] objArr = this.f10395b;
                        int i8 = y7 - min;
                        int i9 = y6 - min;
                        C0874f.v1(objArr, i8 + 1, objArr, i9 + 1, i7);
                        y6 = w(i9);
                        y7 = w(i8);
                        i2 -= min;
                    }
                    int y8 = y(this.f10394a + i6);
                    x(this.f10394a, y8);
                    this.f10394a = y8;
                } else {
                    int y9 = y(this.f10394a + i5);
                    int y10 = y(this.f10394a + i2);
                    int i10 = this.f10396c;
                    while (true) {
                        i10 -= i5;
                        if (i10 <= 0) {
                            break;
                        }
                        Object[] objArr2 = this.f10395b;
                        i5 = Math.min(i10, Math.min(objArr2.length - y9, objArr2.length - y10));
                        Object[] objArr3 = this.f10395b;
                        int i11 = y9 + i5;
                        C0874f.v1(objArr3, y10, objArr3, y9, i11);
                        y9 = y(i11);
                        y10 = y(y10 + i5);
                    }
                    int y11 = y(this.f10394a + this.f10396c);
                    x(w(y11 - i6), y11);
                }
                this.f10396c -= i6;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection r11) {
        /*
            r10 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.j.e(r11, r0)
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x008f
            java.lang.Object[] r0 = r10.f10395b
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x008f
        L_0x0013:
            int r0 = r10.f10394a
            int r2 = r10.f10396c
            int r0 = r0 + r2
            int r0 = r10.y(r0)
            int r2 = r10.f10394a
            r3 = 1
            if (r2 >= r0) goto L_0x0040
            r4 = r2
        L_0x0022:
            if (r2 >= r0) goto L_0x003a
            java.lang.Object[] r5 = r10.f10395b
            r5 = r5[r2]
            boolean r6 = r11.contains(r5)
            if (r6 == 0) goto L_0x0036
            java.lang.Object[] r6 = r10.f10395b
            int r7 = r4 + 1
            r6[r4] = r5
            r4 = r7
            goto L_0x0037
        L_0x0036:
            r1 = r3
        L_0x0037:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x003a:
            java.lang.Object[] r11 = r10.f10395b
            n5.C0874f.x1(r11, r4, r0)
            goto L_0x0081
        L_0x0040:
            java.lang.Object[] r4 = r10.f10395b
            int r4 = r4.length
            r6 = r1
            r5 = r2
        L_0x0045:
            r7 = 0
            if (r2 >= r4) goto L_0x0060
            java.lang.Object[] r8 = r10.f10395b
            r9 = r8[r2]
            r8[r2] = r7
            boolean r7 = r11.contains(r9)
            if (r7 == 0) goto L_0x005c
            java.lang.Object[] r7 = r10.f10395b
            int r8 = r5 + 1
            r7[r5] = r9
            r5 = r8
            goto L_0x005d
        L_0x005c:
            r6 = r3
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0060:
            int r2 = r10.y(r5)
            r4 = r2
        L_0x0065:
            if (r1 >= r0) goto L_0x0080
            java.lang.Object[] r2 = r10.f10395b
            r5 = r2[r1]
            r2[r1] = r7
            boolean r2 = r11.contains(r5)
            if (r2 == 0) goto L_0x007c
            java.lang.Object[] r2 = r10.f10395b
            r2[r4] = r5
            int r4 = r10.v(r4)
            goto L_0x007d
        L_0x007c:
            r6 = r3
        L_0x007d:
            int r1 = r1 + 1
            goto L_0x0065
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r1 == 0) goto L_0x008f
            r10.z()
            int r11 = r10.f10394a
            int r4 = r4 - r11
            int r11 = r10.w(r4)
            r10.f10396c = r11
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.C0873e.retainAll(java.util.Collection):boolean");
    }

    public final Object set(int i2, Object obj) {
        int i5 = this.f10396c;
        if (i2 < 0 || i2 >= i5) {
            throw new IndexOutOfBoundsException(C0552a.l("index: ", i2, i5, ", size: "));
        }
        int y6 = y(this.f10394a + i2);
        Object[] objArr = this.f10395b;
        Object obj2 = objArr[y6];
        objArr[y6] = obj;
        return obj2;
    }

    public final int size() {
        return this.f10396c;
    }

    public final void t(int i2) {
        if (i2 >= 0) {
            Object[] objArr = this.f10395b;
            if (i2 > objArr.length) {
                if (objArr == d) {
                    if (i2 < 10) {
                        i2 = 10;
                    }
                    this.f10395b = new Object[i2];
                    return;
                }
                int length = objArr.length;
                int i5 = length + (length >> 1);
                if (i5 - i2 < 0) {
                    i5 = i2;
                }
                if (i5 - 2147483639 > 0) {
                    if (i2 > 2147483639) {
                        i5 = Integer.MAX_VALUE;
                    } else {
                        i5 = 2147483639;
                    }
                }
                Object[] objArr2 = new Object[i5];
                C0874f.v1(objArr, 0, objArr2, this.f10394a, objArr.length);
                Object[] objArr3 = this.f10395b;
                int length2 = objArr3.length;
                int i6 = this.f10394a;
                C0874f.v1(objArr3, length2 - i6, objArr2, 0, i6);
                this.f10394a = 0;
                this.f10395b = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final Object[] toArray() {
        return toArray(new Object[this.f10396c]);
    }

    public final int v(int i2) {
        Object[] objArr = this.f10395b;
        j.e(objArr, "<this>");
        if (i2 == objArr.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    public final int w(int i2) {
        if (i2 < 0) {
            return i2 + this.f10395b.length;
        }
        return i2;
    }

    public final void x(int i2, int i5) {
        if (i2 < i5) {
            C0874f.x1(this.f10395b, i2, i5);
            return;
        }
        Object[] objArr = this.f10395b;
        C0874f.x1(objArr, i2, objArr.length);
        C0874f.x1(this.f10395b, 0, i5);
    }

    public final int y(int i2) {
        Object[] objArr = this.f10395b;
        if (i2 >= objArr.length) {
            return i2 - objArr.length;
        }
        return i2;
    }

    public final void z() {
        this.modCount++;
    }

    public final Object[] toArray(Object[] objArr) {
        j.e(objArr, "array");
        int length = objArr.length;
        int i2 = this.f10396c;
        if (length < i2) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int y6 = y(this.f10394a + this.f10396c);
        int i5 = this.f10394a;
        if (i5 < y6) {
            C0874f.w1(this.f10395b, i5, objArr, y6, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f10395b;
            C0874f.v1(objArr2, 0, objArr, this.f10394a, objArr2.length);
            Object[] objArr3 = this.f10395b;
            C0874f.v1(objArr3, objArr3.length - this.f10394a, objArr, 0, y6);
        }
        int i6 = this.f10396c;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        j.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        z();
        t(collection.size() + this.f10396c);
        k(y(this.f10394a + this.f10396c), collection);
        return true;
    }
}
