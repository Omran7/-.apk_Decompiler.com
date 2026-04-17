package n;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.j;
import o.C0890a;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f10222a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f10223b = new Object();

    public static final void a(k kVar) {
        int i2 = kVar.d;
        int[] iArr = kVar.f10228b;
        Object[] objArr = kVar.f10229c;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj = objArr[i6];
            if (obj != f10223b) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        kVar.f10227a = false;
        kVar.d = i5;
    }

    public static final void b(f fVar, int i2) {
        j.e(fVar, "<this>");
        fVar.f10216a = new int[i2];
        fVar.f10217b = new Object[i2];
    }

    public static final int c(f fVar, Object obj, int i2) {
        j.e(fVar, "<this>");
        int i5 = fVar.f10218c;
        if (i5 == 0) {
            return -1;
        }
        try {
            int a6 = C0890a.a(fVar.f10218c, i2, fVar.f10216a);
            if (a6 < 0 || j.a(obj, fVar.f10217b[a6])) {
                return a6;
            }
            int i6 = a6 + 1;
            while (i6 < i5 && fVar.f10216a[i6] == i2) {
                if (j.a(obj, fVar.f10217b[i6])) {
                    return i6;
                }
                i6++;
            }
            int i7 = a6 - 1;
            while (i7 >= 0 && fVar.f10216a[i7] == i2) {
                if (j.a(obj, fVar.f10217b[i7])) {
                    return i7;
                }
                i7--;
            }
            return ~i6;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
