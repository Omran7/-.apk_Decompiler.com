package u4;

import K1.e;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.H;
import com.mtma.criminal.city.utils.J;
import d5.k;
import d5.o;

/* renamed from: u4.c  reason: case insensitive filesystem */
public final /* synthetic */ class C1034c implements J {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f11868a;

    public /* synthetic */ C1034c(g gVar) {
        this.f11868a = gVar;
    }

    public void h(boolean z3, k kVar) {
        g gVar = this.f11868a;
        gVar.getClass();
        e.b(o.getAccountObject().getId(), 300, MyApplication.f7090a.getApplicationContext().getString(R.string.fight_reason_for_prison, new Object[]{gVar.f11908f1.getMainStatesObject().getNickName()}), (H) null);
        int i2 = gVar.f11917k1;
        String str = gVar.f11905e0;
        if (i2 == 0) {
            c.k0(str, new b5.k(20, o.getAccountObject().getId(), o.getMainStatesObject().getNickName()));
        } else if (i2 == 2) {
            c.k0(str, new b5.k(19, o.getAccountObject().getId(), o.getMainStatesObject().getNickName()));
        }
    }
}
