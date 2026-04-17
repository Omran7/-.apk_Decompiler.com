package J;

import kotlin.jvm.internal.j;
import q.C0925b;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f1289a;

    /* renamed from: b  reason: collision with root package name */
    public int f1290b;

    public b(int i2) {
        if (i2 > 0) {
            this.f1289a = new Object[i2];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
        int i2 = this.f1290b;
        if (i2 <= 0) {
            return null;
        }
        int i5 = i2 - 1;
        Object[] objArr = this.f1289a;
        Object obj = objArr[i5];
        j.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i5] = null;
        this.f1290b--;
        return obj;
    }

    public void b(C0925b bVar) {
        int i2 = this.f1290b;
        Object[] objArr = this.f1289a;
        if (i2 < objArr.length) {
            objArr[i2] = bVar;
            this.f1290b = i2 + 1;
        }
    }

    public boolean c(Object obj) {
        Object[] objArr;
        boolean z3;
        j.e(obj, "instance");
        int i2 = this.f1290b;
        int i5 = 0;
        while (true) {
            objArr = this.f1289a;
            if (i5 >= i2) {
                z3 = false;
                break;
            } else if (objArr[i5] == obj) {
                z3 = true;
                break;
            } else {
                i5++;
            }
        }
        if (!z3) {
            int i6 = this.f1290b;
            if (i6 >= objArr.length) {
                return false;
            }
            objArr[i6] = obj;
            this.f1290b = i6 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public b() {
        this.f1289a = new Object[256];
    }
}
