package V4;

import B4.f;
import J.a;
import K1.e;
import P4.d;
import S3.t;
import X4.c;
import X4.g;
import X4.h;
import android.content.Context;
import android.icu.util.TimeZone;
import android.util.Patterns;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.activities.StartActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import i3.C0590f;
import i3.C0592h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public final /* synthetic */ class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3790a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3791b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f3790a = i2;
        this.f3791b = obj;
    }

    public final void accept(Object obj) {
        Object obj2 = this.f3791b;
        Boolean bool = (Boolean) obj;
        switch (this.f3790a) {
            case 0:
                h hVar = (h) obj2;
                hVar.getClass();
                boolean booleanValue = bool.booleanValue();
                Context context = hVar.f3831d0;
                if (booleanValue) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.upgrading_flash);
                    hVar.O0.startAnimation(loadAnimation);
                    hVar.f3818P0.startAnimation(loadAnimation);
                    hVar.O0.setVisibility(0);
                    hVar.f3818P0.setVisibility(0);
                    ArrayList arrayList = hVar.f3830c1;
                    arrayList.clear();
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "moneyObject", "cash").d(new c(hVar, taskCompletionSource, 3));
                    arrayList.add(taskCompletionSource.getTask());
                    TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                    com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "stockObject", "itemsInStock").E(e.y(13)).d(new c(hVar, taskCompletionSource2, 0));
                    arrayList.add(taskCompletionSource2.getTask());
                    TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                    com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "upgradeObject").d(new c(hVar, taskCompletionSource3, 1));
                    arrayList.add(taskCompletionSource3.getTask());
                    Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new e(hVar, 1));
                    return;
                }
                R2.b.w(false);
                com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.no_internet_connection, context, (String) null);
                return;
            case 1:
                f fVar = (f) obj2;
                fVar.getClass();
                boolean booleanValue2 = bool.booleanValue();
                c cVar = (c) fVar.f356b;
                if (!booleanValue2) {
                    cVar.f4203m0.setVisibility(8);
                    v0.e(cVar.f4194d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_internet_connection));
                    return;
                } else if (!cVar.f4205o0) {
                    cVar.f4205o0 = true;
                    if (Patterns.EMAIL_ADDRESS.matcher(cVar.f4206p0).matches() || cVar.f4206p0.contains("@")) {
                        cVar.V(cVar.f4206p0, cVar.f4207q0);
                        return;
                    } else {
                        cVar.f4204n0.q("userName").i(cVar.f4206p0).d(new t(cVar, 10));
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                X4.e eVar = (X4.e) obj2;
                eVar.getClass();
                boolean booleanValue3 = bool.booleanValue();
                d dVar = eVar.f4212b;
                if (!booleanValue3) {
                    ((LinearLayout) dVar.f2199k0).setVisibility(8);
                    v0.e((StartActivity) dVar.f2197i0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_internet_connection));
                    return;
                } else if (!dVar.f2196h0) {
                    dVar.f2196h0 = true;
                    if (Patterns.EMAIL_ADDRESS.matcher((String) dVar.f2201m0).matches() || ((String) dVar.f2201m0).contains("@")) {
                        String str = (String) dVar.f2201m0;
                        ((C0590f) dVar.f2200l0).q("email").i(str).d(new X4.d(dVar, str, 0));
                        return;
                    }
                    ((C0590f) dVar.f2200l0).q("userName").i((String) dVar.f2201m0).d(new t(dVar, 13));
                    return;
                } else {
                    return;
                }
            case 3:
                g gVar = (g) obj2;
                gVar.getClass();
                boolean booleanValue4 = bool.booleanValue();
                h hVar2 = gVar.f4216b;
                if (!booleanValue4) {
                    hVar2.f4230p0.setVisibility(8);
                    v0.e(hVar2.f4218d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_internet_connection));
                    return;
                } else if (!hVar2.f4231q0) {
                    hVar2.f4231q0 = true;
                    HashMap hashMap = new HashMap();
                    hashMap.put("serverNumber", Integer.valueOf(hVar2.f4219e0));
                    hashMap.put("nickName", hVar2.f4232r0);
                    hashMap.put("gender", Integer.valueOf(hVar2.s0));
                    hashMap.put("deviceId", e.u());
                    hashMap.put("invitedBy", "not_invited_by_any_players");
                    hashMap.put("timeZoneId", TimeZone.getDefault().getID());
                    F3.h.b().a("createNewAccount").q(hashMap).addOnCompleteListener(new H4.d((Object) hVar2, 12));
                    return;
                } else {
                    return;
                }
            default:
                int i2 = MainActivity.L0;
                MainActivity mainActivity = (MainActivity) obj2;
                mainActivity.getClass();
                if (bool.booleanValue()) {
                    com.bumptech.glide.c.s(false, new F3.e((Object) mainActivity, 8));
                    return;
                }
                R2.b.w(true);
                mainActivity.v();
                return;
        }
    }
}
