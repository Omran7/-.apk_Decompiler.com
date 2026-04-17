package T1;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import java.util.Iterator;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f3439a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3440b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3441c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3442e;

    /* renamed from: f  reason: collision with root package name */
    public final C0211u f3443f;

    public r(C0212u0 u0Var, String str, String str2, String str3, long j6, long j7, Bundle bundle) {
        C0211u uVar;
        I.d(str2);
        I.d(str3);
        this.f3439a = str2;
        this.f3440b = str3;
        this.f3441c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j6;
        this.f3442e = j7;
        if (j7 != 0 && j7 > j6) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3175r.b(Z.w(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            uVar = new C0211u(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                if (next == null) {
                    Z z4 = u0Var.f3496r;
                    C0212u0.k(z4);
                    z4.f3172f.a("Param name can't be null");
                    it2.remove();
                } else {
                    Y1 y12 = u0Var.f3499u;
                    C0212u0.i(y12);
                    Object v6 = y12.v(bundle2.get(next), next);
                    if (v6 == null) {
                        Z z5 = u0Var.f3496r;
                        C0212u0.k(z5);
                        z5.f3175r.b(u0Var.f3500v.e(next), "Param value can't be null");
                        it2.remove();
                    } else {
                        Y1 y13 = u0Var.f3499u;
                        C0212u0.i(y13);
                        y13.J(bundle2, next, v6);
                    }
                }
            }
            uVar = new C0211u(bundle2);
        }
        this.f3443f = uVar;
    }

    public final r a(C0212u0 u0Var, long j6) {
        return new r(u0Var, this.f3441c, this.f3439a, this.f3440b, this.d, j6, this.f3443f);
    }

    public final String toString() {
        String uVar = this.f3443f.toString();
        return "Event{appId='" + this.f3439a + "', name='" + this.f3440b + "', params=" + uVar + "}";
    }

    public r(C0212u0 u0Var, String str, String str2, String str3, long j6, long j7, C0211u uVar) {
        I.d(str2);
        I.d(str3);
        I.g(uVar);
        this.f3439a = str2;
        this.f3440b = str3;
        this.f3441c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j6;
        this.f3442e = j7;
        if (j7 != 0 && j7 > j6) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3175r.c("Event created with reverse previous/current timestamps. appId, name", Z.w(str2), Z.w(str3));
        }
        this.f3443f = uVar;
    }
}
