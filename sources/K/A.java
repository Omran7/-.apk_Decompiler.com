package K;

import T1.C;
import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public int f1342a;

    /* renamed from: b  reason: collision with root package name */
    public int f1343b;

    /* renamed from: c  reason: collision with root package name */
    public int f1344c;
    public Object d;

    public A() {
        if (C.f2811b == null) {
            C.f2811b = new C(23);
        }
    }

    public int a(int i2) {
        if (i2 < this.f1344c) {
            return ((ByteBuffer) this.d).getShort(this.f1343b + i2);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object obj2;
        C0062b bVar;
        if (Build.VERSION.SDK_INT >= this.f1343b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f1343b) {
            obj2 = b(view);
        } else {
            obj2 = view.getTag(this.f1342a);
            if (!((Class) this.d).isInstance(obj2)) {
                obj2 = null;
            }
        }
        if (e(obj2, obj)) {
            View.AccessibilityDelegate c3 = O.c(view);
            if (c3 == null) {
                bVar = null;
            } else if (c3 instanceof C0061a) {
                bVar = ((C0061a) c3).f1363a;
            } else {
                bVar = new C0062b(c3);
            }
            if (bVar == null) {
                bVar = new C0062b();
            }
            O.l(view, bVar);
            view.setTag(this.f1342a, obj);
            O.g(view, this.f1344c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
