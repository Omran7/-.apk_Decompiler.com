package V4;

import B0.H;
import F3.h;
import R2.b;
import Y4.D;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0451v;
import d5.o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class e implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3797a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f3798b;

    public /* synthetic */ e(h hVar, int i2) {
        this.f3797a = i2;
        this.f3798b = hVar;
    }

    public final void onComplete(Task task) {
        boolean z3;
        boolean z4;
        switch (this.f3797a) {
            case 0:
                Iterator it2 = ((List) task.getResult()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Task task2 = (Task) it2.next();
                        if (task2.isSuccessful() && !((Boolean) task2.getResult()).booleanValue()) {
                            z3 = false;
                        }
                    } else {
                        z3 = true;
                    }
                }
                b.w(false);
                h hVar = this.f3798b;
                if (z3) {
                    h.Y(hVar);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.unknown_error_try_again, hVar.f3831d0, (String) null);
                return;
            default:
                boolean booleanValue = ((Boolean) ((Task) ((List) task.getResult()).get(0)).getResult()).booleanValue();
                h hVar2 = this.f3798b;
                if (!booleanValue) {
                    h.W(hVar2);
                    b.w(false);
                    c.x0(hVar2.f3831d0);
                    return;
                } else if (!((Boolean) ((Task) ((List) task.getResult()).get(1)).getResult()).booleanValue()) {
                    h.W(hVar2);
                    b.w(false);
                    c.s0(hVar2.f3831d0, MyApplication.f7090a.getApplicationContext().getString(R.string.do_not_have_enough_palladium), (String) null);
                    return;
                } else if (!((Boolean) ((Task) ((List) task.getResult()).get(2)).getResult()).booleanValue()) {
                    h.W(hVar2);
                    b.w(false);
                    c.s0(hVar2.f3831d0, MyApplication.f7090a.getApplicationContext().getString(R.string.do_not_have_enough_emblems), (String) null);
                    return;
                } else if (!hVar2.f3829b1) {
                    hVar2.f3829b1 = true;
                    if (K1.e.J(1, 100) <= I1.b.g0(hVar2.f3822T0) + (o.getUpgradeObject().getLuckyLine() * 2)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    D d = hVar2.f3820R0;
                    int i2 = d.f4294b;
                    int i5 = d.f4293a;
                    int i6 = d.f4298i;
                    H h = new H(hVar2, z4, 3);
                    int i7 = (i6 * 4) + D.s(i5, 0, 1).f4292D;
                    HashMap hashMap = new HashMap();
                    hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                    hashMap.put("playerId", o.getAccountObject().getId());
                    hashMap.put("weaponType", Integer.valueOf(i2));
                    hashMap.put("weaponId", Integer.valueOf(i5));
                    hashMap.put("weaponLevel", Integer.valueOf(i6));
                    hashMap.put("palladiumId", 3001);
                    hashMap.put("palladiumNeeded", Integer.valueOf(i7));
                    hashMap.put("emblemNeeded", Integer.valueOf(i7 * 5));
                    hashMap.put("cashNeeded", Long.valueOf(((long) i7) * 50000));
                    hashMap.put("isUpgradeSuccess", Boolean.valueOf(z4));
                    h.b().a("upgradeWeapon").q(hashMap).addOnCompleteListener(new C0451v(h, 13));
                    return;
                } else {
                    return;
                }
        }
    }
}
