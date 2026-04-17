package R;

import T4.d;
import T4.f;
import android.content.Context;
import android.support.v4.media.session.a;
import androidx.credentials.playservices.HiddenActivity;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0426f;
import com.mtma.criminal.city.fragments.gangBase.C0429i;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import f.C0518i;
import j4.M0;
import r4.j;

public final /* synthetic */ class b implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2450a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2451b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f2450a = i2;
        this.f2451b = obj;
    }

    public final void onSuccess(Object obj) {
        Object obj2 = this.f2451b;
        switch (this.f2450a) {
            case 0:
                int i2 = HiddenActivity.f4917c;
                ((d) obj2).invoke(obj);
                return;
            case 1:
                int i5 = HiddenActivity.f4917c;
                ((d) obj2).invoke(obj);
                return;
            case 2:
                int i6 = HiddenActivity.f4917c;
                ((d) obj2).invoke(obj);
                return;
            case 3:
                int i7 = HiddenActivity.f4917c;
                ((d) obj2).invoke(obj);
                return;
            case 4:
                ((TaskCompletionSource) obj2).setResult(obj);
                return;
            case 5:
                Void voidR = (Void) obj;
                C0429i iVar = ((C0426f) obj2).f7178c;
                iVar.f7187D0 = "removed_gang_pic";
                I1.b.u(iVar.f7201k0, o.getGangObject().getId(), "removed_gang_pic");
                R2.b.w(false);
                v0.e(iVar.f7194d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                R2.b.M0(R.raw.add_new_item);
                return;
            case zzaky.zzf.zzf /*6*/:
                Void voidR2 = (Void) obj;
                Context context = ((M0) ((K) obj2).f7360b).f8919a;
                C0518i iVar2 = (C0518i) context;
                for (C0286s sVar : iVar2.l().f5000c.v()) {
                    if ((sVar instanceof d) || (sVar instanceof f)) {
                        I l6 = iVar2.l();
                        l6.getClass();
                        C0269a aVar = new C0269a(l6);
                        aVar.h(sVar);
                        aVar.e(false);
                    }
                }
                d dVar = new d(context);
                I l7 = iVar2.l();
                l7.getClass();
                C0269a aVar2 = new C0269a(l7);
                aVar2.i(R.id.fragment_store_frame_layout, dVar);
                aVar2.c();
                aVar2.e(false);
                R2.b.N0();
                return;
            default:
                Void voidR3 = (Void) obj;
                j jVar = (j) obj2;
                jVar.f11251j0.setText("");
                R2.b.w(false);
                if (com.bumptech.glide.d.I0() && jVar.f11258q0 == jVar.f11259r0.indexOf(jVar.f11247f0)) {
                    Q.b(6, o.getAccountObject().getId(), (long) 1);
                    a.C0(0, 3, 1, o.getAccountObject().getId());
                    return;
                }
                return;
        }
    }
}
