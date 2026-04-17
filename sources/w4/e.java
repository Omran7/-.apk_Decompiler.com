package W4;

import R2.b;
import Y4.E;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.OnSuccessListener;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import d5.v;
import java.util.Iterator;

public final class e implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4097a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f4098b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f4099c;

    public /* synthetic */ e(g gVar, v vVar, int i2) {
        this.f4097a = i2;
        this.f4099c = gVar;
        this.f4098b = vVar;
    }

    public final void onSuccess(Object obj) {
        switch (this.f4097a) {
            case 0:
                Void voidR = (Void) obj;
                o.setWorkObject(this.f4098b);
                o.getWorkObject().setJobStartTimeInMilli(Long.valueOf(c.f5744o * 1000));
                o.getWorkObject().setJobGotSalaryTimeInMilli(Long.valueOf(c.f5744o * 1000));
                g gVar = this.f4099c;
                gVar.f4108h0.removeViewsInLayout(gVar.f4111k0, 2);
                gVar.f4115o0 = 0.0d;
                int jobType = o.getWorkObject().getJobType();
                gVar.f4111k0 = jobType;
                gVar.f4113m0 = false;
                gVar.Y(jobType - 1);
                gVar.W((E) gVar.f4114n0.get(gVar.f4111k0));
                int i2 = -1;
                gVar.a0(gVar.r(R.string.success_promotion), -1, false);
                if (gVar.f4111k0 < gVar.f4114n0.size() - 1) {
                    gVar.X(gVar.f4111k0 + 1);
                } else {
                    String id = o.getAccountObject().getId();
                    switch (gVar.f4105e0) {
                        case 0:
                            i2 = 11;
                            break;
                        case 1:
                            i2 = 12;
                            break;
                        case 2:
                            i2 = 13;
                            break;
                        case 3:
                            i2 = 14;
                            break;
                        case 4:
                            i2 = 15;
                            break;
                        case 5:
                            i2 = 16;
                            break;
                        case zzaky.zzf.zzf /*6*/:
                            i2 = 17;
                            break;
                        case zzaky.zzf.zzg /*7*/:
                            i2 = 18;
                            break;
                        case 8:
                            i2 = 19;
                            break;
                    }
                    Q.b(i2, id, (long) 1);
                }
                Iterator it2 = gVar.p().f5000c.v().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C0286s sVar = (C0286s) it2.next();
                        if (sVar instanceof K4.o) {
                            ((K4.o) sVar).c0();
                        }
                    }
                }
                b.w(false);
                return;
            default:
                Void voidR2 = (Void) obj;
                o.setWorkObject(this.f4098b);
                o.getWorkObject().setJobStartTimeInMilli(Long.valueOf(c.f5744o * 1000));
                o.getWorkObject().setJobGotSalaryTimeInMilli(Long.valueOf(c.f5744o * 1000));
                int jobType2 = o.getWorkObject().getJobType();
                g gVar2 = this.f4099c;
                gVar2.f4111k0 = jobType2;
                gVar2.f4115o0 = 0.0d;
                gVar2.f4113m0 = false;
                gVar2.f4108h0.removeViewAt(0);
                gVar2.W((E) gVar2.f4114n0.get(0));
                gVar2.X(1);
                b.M0(R.raw.add_new_item);
                v0.e(gVar2.f4104d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                Q.b(8, o.getAccountObject().getId(), (long) 1);
                Q.h(10, o.getAccountObject().getId());
                Iterator it3 = gVar2.p().f5000c.v().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        C0286s sVar2 = (C0286s) it3.next();
                        if (sVar2 instanceof K4.o) {
                            ((K4.o) sVar2).c0();
                        }
                    }
                }
                b.w(false);
                return;
        }
    }
}
