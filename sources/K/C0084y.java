package K;

import android.text.TextUtils;
import android.view.View;

/* renamed from: K.y  reason: case insensitive filesystem */
public final class C0084y extends A {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f1438e;

    public C0084y(int i2, Class cls, int i5, int i6, int i7) {
        this.f1438e = i7;
        this.f1342a = i2;
        this.d = cls;
        this.f1344c = i5;
        this.f1343b = i6;
    }

    public final Object b(View view) {
        switch (this.f1438e) {
            case 0:
                return Boolean.valueOf(H.d(view));
            case 1:
                return H.b(view);
            default:
                return Boolean.valueOf(H.c(view));
        }
    }

    public final void c(View view, Object obj) {
        switch (this.f1438e) {
            case 0:
                H.j(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                H.h(view, (CharSequence) obj);
                return;
            default:
                H.g(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    public final boolean e(Object obj, Object obj2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        switch (this.f1438e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z7 = false;
                if (bool == null || !bool.booleanValue()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (bool2 == null || !bool2.booleanValue()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z3 == z4) {
                    z7 = true;
                }
                return !z7;
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z8 = false;
                if (bool3 == null || !bool3.booleanValue()) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (bool4 == null || !bool4.booleanValue()) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (z5 == z6) {
                    z8 = true;
                }
                return !z8;
        }
    }
}
