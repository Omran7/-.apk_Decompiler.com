package K4;

import J.a;
import R2.b;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import i3.C0592h;

public final /* synthetic */ class p implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f1598a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f1599b;

    public /* synthetic */ p(v vVar, long j6) {
        this.f1598a = vVar;
        this.f1599b = j6;
    }

    public final void accept(Object obj) {
        v vVar = this.f1598a;
        vVar.getClass();
        if (((Boolean) obj).booleanValue()) {
            com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "locationObject", "currentPlace").d(new u((Object) vVar, this.f1599b, 0));
            return;
        }
        b.w(false);
        c.s0(vVar.f1626d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_internet_connection), (String) null);
    }
}
