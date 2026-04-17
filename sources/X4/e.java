package X4;

import P4.d;
import V4.b;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.StartActivity;
import e5.C0509f;

public final class e extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4211a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f4212b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(d dVar, View view, int i2) {
        super(view);
        this.f4211a = i2;
        this.f4212b = dVar;
    }

    public final void onClick(View view) {
        switch (this.f4211a) {
            case 0:
                super.onClick(view);
                d dVar = this.f4212b;
                String g = a.g((EditText) dVar.f2198j0);
                dVar.f2201m0 = g;
                if (TextUtils.isEmpty(g)) {
                    ((EditText) dVar.f2198j0).setError(dVar.r(R.string.enter_your_email_or_phone_number));
                    ((EditText) dVar.f2198j0).requestFocus();
                    return;
                }
                ((LinearLayout) dVar.f2199k0).setVisibility(0);
                android.support.v4.media.session.a.i0(new b(this, 2));
                return;
            default:
                super.onClick(view);
                d dVar2 = this.f4212b;
                StartActivity startActivity = (StartActivity) dVar2.l();
                if (startActivity != null) {
                    startActivity.s(new c((StartActivity) dVar2.f2197i0));
                    return;
                }
                return;
        }
    }
}
