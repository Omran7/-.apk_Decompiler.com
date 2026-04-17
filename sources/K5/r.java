package k5;

import K1.e;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.mtma.criminal.city.R;
import it.sephiroth.android.library.widget.HListView;
import k.C0737s0;
import y4.C1118e;

public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9620a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f9621b;

    /* renamed from: c  reason: collision with root package name */
    public int f9622c;
    public final /* synthetic */ Object d;

    public r(C1118e eVar, int i2, int i5) {
        this.d = eVar;
        this.f9621b = i2;
        this.f9622c = i5;
    }

    public final void run() {
        switch (this.f9620a) {
            case 0:
                ((HListView) this.d).s0(this.f9621b, this.f9622c);
                return;
            default:
                C1118e eVar = (C1118e) this.d;
                ((RelativeLayout) eVar.f12726g0.getChildAt(eVar.f12722A0)).setBackgroundResource(0);
                int i2 = eVar.f12722A0 + 1;
                eVar.f12722A0 = i2;
                if (i2 >= 12) {
                    eVar.f12722A0 = 0;
                }
                ((RelativeLayout) eVar.f12726g0.getChildAt(eVar.f12722A0)).setBackgroundResource(R.drawable.lucky_wheel_green_frame);
                int i5 = this.f9622c;
                int i6 = this.f9621b;
                if (i6 <= 250 || eVar.f12722A0 != i5 || !eVar.f12742x0) {
                    int J5 = e.J(5, 15) + i6;
                    new Handler().postDelayed(new r(eVar, J5, i5), (long) J5);
                    return;
                }
                new Handler().postDelayed(new C0737s0(this, 19), 500);
                return;
        }
    }

    public r(HListView hListView) {
        this.d = hListView;
    }
}
