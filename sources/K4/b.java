package K4;

import H4.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0592h;
import i3.q;
import x1.i;

public final class b implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1503a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f1504b;

    public /* synthetic */ b(k kVar, int i2) {
        this.f1503a = i2;
        this.f1504b = kVar;
    }

    public final void B(C0588d dVar) {
        int i2 = this.f1503a;
    }

    public final void u(C0587c cVar) {
        switch (this.f1503a) {
            case 0:
                boolean b6 = cVar.b();
                k kVar = this.f1504b;
                if (b6) {
                    R2.b.w(false);
                    a.n(MyApplication.f7090a, R.string.dialog_already_other_player_has_gang_request_from_same_gang, kVar.f1553d0, (String) null);
                    return;
                }
                a.x(C0592h.d().e(), "players").E(kVar.f1554e0).E("contactsObject").E("requestsMap").E(R2.b.V(2, o.getGangObject().getId())).I(2);
                kVar.f1544Q0.E("notificationObject").E("hasUnSeenContactRequest").I(Boolean.TRUE).addOnCompleteListener(new d((Object) this, 1));
                return;
            default:
                if (cVar.b()) {
                    R2.b.w(false);
                    a.n(MyApplication.f7090a, R.string.marriage_request_already_sent, this.f1504b.f1553d0, (String) null);
                    return;
                }
                android.support.v4.media.session.a.B0(11, 2, 0, -1, new i((Object) this, 20), o.getAccountObject().getId(), "count", false);
                return;
        }
    }

    private final void a(C0588d dVar) {
    }

    private final void b(C0588d dVar) {
    }
}
