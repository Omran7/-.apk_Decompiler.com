package T1;

import android.os.Bundle;
import java.util.List;

/* renamed from: T1.z0  reason: case insensitive filesystem */
public final class C0227z0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3552a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3553b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3554c;
    public final /* synthetic */ long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3555e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f3556f;

    public /* synthetic */ C0227z0(Object obj, Object obj2, Object obj3, Object obj4, long j6, int i2) {
        this.f3552a = i2;
        this.f3553b = obj2;
        this.f3554c = obj3;
        this.f3555e = obj4;
        this.d = j6;
        this.f3556f = obj;
    }

    public final void run() {
        switch (this.f3552a) {
            case 0:
                String str = (String) this.f3554c;
                D0 d02 = (D0) this.f3556f;
                String str2 = (String) this.f3553b;
                if (str2 == null) {
                    T1 t12 = d02.f2818a;
                    t12.f().o();
                    String str3 = t12.f3056P;
                    if (str3 == null || str3.equals(str)) {
                        t12.f3056P = str;
                        t12.f3055O = null;
                        return;
                    }
                    return;
                }
                C0181j1 j1Var = new C0181j1(this.d, (String) this.f3555e, str2);
                T1 t13 = d02.f2818a;
                t13.f().o();
                String str4 = t13.f3056P;
                if (str4 != null) {
                    str4.equals(str);
                }
                t13.f3056P = str;
                t13.f3055O = j1Var;
                return;
            case 1:
                Object obj = this.f3555e;
                ((C0157b1) this.f3556f).J(this.d, obj, (String) this.f3553b, (String) this.f3554c);
                return;
            default:
                Bundle bundle = (Bundle) this.f3553b;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                C0190m1 m1Var = (C0190m1) this.f3556f;
                Y1 y12 = ((C0212u0) m1Var.f398a).f3499u;
                C0212u0.i(y12);
                m1Var.t((C0181j1) this.f3554c, (C0181j1) this.f3555e, this.d, true, y12.s("screen_view", bundle, (List) null, false));
                return;
        }
    }
}
