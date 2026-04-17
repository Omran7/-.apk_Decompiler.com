package I4;

import K1.e;
import R2.b;
import android.os.CountDownTimer;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import n4.f;
import x4.C1105h;

public final class c extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1195a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0286s f1196b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(C0286s sVar, long j6, int i2) {
        super(j6, 1000);
        this.f1195a = i2;
        this.f1196b = sVar;
    }

    public final void onFinish() {
        switch (this.f1195a) {
            case 0:
                ((f) this.f1196b).f1203g0.setText(e.L("HH:mm:ss", 0));
                return;
            case 1:
                ((f) this.f1196b).X(0);
                return;
            default:
                ((C1105h) this.f1196b).f12596g0.setText(e.L("HH:mm:ss", 0));
                return;
        }
    }

    public final void onTick(long j6) {
        switch (this.f1195a) {
            case 0:
                f fVar = (f) this.f1196b;
                fVar.f1203g0.setText(e.L("HH:mm:ss", j6 / 1000));
                int i2 = fVar.f1213q0;
                if (((long) i2) < 30) {
                    fVar.f1213q0 = i2 + 1;
                    return;
                }
                b.M0(R.raw.prison_steal);
                fVar.f1213q0 = 0;
                return;
            case 1:
                f fVar2 = (f) this.f1196b;
                fVar2.X(j6);
                int i5 = fVar2.f10388q0;
                if (((long) i5) < 30) {
                    fVar2.f10388q0 = i5 + 1;
                    return;
                }
                b.M0(R.raw.plane_take_off);
                fVar2.f10388q0 = 0;
                return;
            default:
                C1105h hVar = (C1105h) this.f1196b;
                hVar.f12596g0.setText(e.L("HH:mm:ss", j6 / 1000));
                int i6 = hVar.f12605p0;
                if (((long) i6) < 30) {
                    hVar.f12605p0 = i6 + 1;
                    return;
                }
                b.M0(R.raw.hospital_dripping);
                hVar.f12605p0 = 0;
                return;
        }
    }
}
