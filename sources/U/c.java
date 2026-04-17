package U;

import L.j;
import T1.B;
import android.graphics.Rect;
import java.util.Comparator;

public final class c implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f3648a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final Rect f3649b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3650c;
    public final B d;

    public c(boolean z3, B b6) {
        this.f3650c = z3;
        this.d = b6;
    }

    public final int compare(Object obj, Object obj2) {
        this.d.getClass();
        Rect rect = this.f3648a;
        ((j) obj).f(rect);
        Rect rect2 = this.f3649b;
        ((j) obj2).f(rect2);
        int i2 = rect.top;
        int i5 = rect2.top;
        if (i2 < i5) {
            return -1;
        }
        if (i2 > i5) {
            return 1;
        }
        int i6 = rect.left;
        int i7 = rect2.left;
        boolean z3 = this.f3650c;
        if (i6 < i7) {
            if (z3) {
                return 1;
            }
            return -1;
        } else if (i6 <= i7) {
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            if (i8 < i9) {
                return -1;
            }
            if (i8 > i9) {
                return 1;
            }
            int i10 = rect.right;
            int i11 = rect2.right;
            if (i10 < i11) {
                if (z3) {
                    return 1;
                }
                return -1;
            } else if (i10 <= i11) {
                return 0;
            } else {
                if (z3) {
                    return -1;
                }
                return 1;
            }
        } else if (z3) {
            return -1;
        } else {
            return 1;
        }
    }
}
