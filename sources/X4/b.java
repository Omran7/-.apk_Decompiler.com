package X4;

import P4.d;
import android.view.View;
import com.mtma.criminal.city.activities.StartActivity;

public final class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4191a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f4192b;

    public /* synthetic */ b(c cVar, int i2) {
        this.f4191a = i2;
        this.f4192b = cVar;
    }

    public final void onClick(View view) {
        switch (this.f4191a) {
            case 0:
                c cVar = this.f4192b;
                StartActivity startActivity = (StartActivity) cVar.l();
                if (startActivity != null) {
                    startActivity.s(new d(cVar.f4194d0));
                    return;
                }
                return;
            default:
                c cVar2 = this.f4192b;
                StartActivity startActivity2 = (StartActivity) cVar2.l();
                if (startActivity2 != null) {
                    startActivity2.s(new j(cVar2.f4194d0));
                    return;
                }
                return;
        }
    }
}
