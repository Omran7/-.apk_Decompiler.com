package V4;

import B0.C0004c;
import I1.b;
import android.os.Handler;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;

public final class f implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f3800b;

    public /* synthetic */ f(h hVar, int i2) {
        this.f3799a = i2;
        this.f3800b = hVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        String str;
        switch (this.f3799a) {
            case 0:
                if (z3) {
                    v0.e(this.f3800b.f3831d0, MyApplication.f7090a.getApplicationContext().getString(R.string.do_not_have_president_stone));
                    new Handler().postDelayed(new C0004c((Object) this, 13), 250);
                    return;
                }
                return;
            default:
                h hVar = this.f3800b;
                if (z3) {
                    hVar.f3823U0 = 100;
                } else {
                    hVar.f3823U0 = b.g0(hVar.f3822T0);
                }
                TextView textView = hVar.f3847u0;
                double d = (double) hVar.f3823U0;
                if (d < 0.0d) {
                    str = "0%";
                } else {
                    str = d + "%";
                }
                textView.setText(str);
                return;
        }
    }
}
