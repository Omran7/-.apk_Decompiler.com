package j4;

import A2.f;
import J.a;
import R2.b;
import Y4.D;
import Y4.k;
import android.widget.ArrayAdapter;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import i3.C0592h;

public final /* synthetic */ class K implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8902a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8903b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayAdapter f8904c;
    public final /* synthetic */ Object d;

    public /* synthetic */ K(ArrayAdapter arrayAdapter, int i2, Object obj, int i5) {
        this.f8902a = i5;
        this.f8904c = arrayAdapter;
        this.f8903b = i2;
        this.d = obj;
    }

    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f8902a) {
            case 0:
                C0626h hVar = (C0626h) this.f8904c;
                hVar.getClass();
                if (bool.booleanValue()) {
                    android.support.v4.media.session.a.O(new Q(hVar, this.f8903b, (k) this.d));
                    return;
                }
                b.w(false);
                c.s0(hVar.f9018b, MyApplication.f7090a.getApplicationContext().getString(R.string.no_internet_connection), (String) null);
                return;
            case 1:
                C0621e0 e0Var = (C0621e0) this.f8904c;
                e0Var.getClass();
                if (bool.booleanValue()) {
                    android.support.v4.media.session.a.O(new C0619d0(e0Var, this.f8903b, (D) this.d));
                    return;
                }
                b.w(false);
                c.s0(e0Var.f8999a, MyApplication.f7090a.getApplicationContext().getString(R.string.no_internet_connection), (String) null);
                return;
            case 2:
                C0626h hVar2 = (C0626h) this.f8904c;
                hVar2.getClass();
                if (bool.booleanValue()) {
                    int currentCity = o.getLocationObject().getCurrentCity();
                    D d6 = (D) this.d;
                    int i2 = this.f8903b;
                    if (currentCity == 0) {
                        android.support.v4.media.session.a.O(new C0631j0(hVar2, i2, d6, 0));
                        return;
                    }
                    android.support.v4.media.session.a.N(o.getAccountObject().getId(), new C0631j0(hVar2, i2, d6, 1));
                    return;
                }
                b.w(false);
                c.s0(hVar2.f9018b, MyApplication.f7090a.getApplicationContext().getString(R.string.no_internet_connection), (String) null);
                return;
            default:
                M0 m02 = (M0) this.f8904c;
                m02.getClass();
                if (bool.booleanValue()) {
                    com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "locationObject").d(new f((Object) m02, this.f8903b, (Object) (D) this.d, 17));
                    return;
                }
                b.w(false);
                c.s0(m02.f8919a, MyApplication.f7090a.getApplicationContext().getString(R.string.no_internet_connection), (String) null);
                return;
        }
    }
}
