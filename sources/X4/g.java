package X4;

import V4.b;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.StartActivity;
import com.mtma.criminal.city.activities.WebViewActivity;
import e5.C0509f;

public final class g extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4215a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f4216b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, View view, int i2) {
        super(view);
        this.f4215a = i2;
        this.f4216b = hVar;
    }

    public final void onClick(View view) {
        switch (this.f4215a) {
            case 0:
                super.onClick(view);
                h hVar = this.f4216b;
                String g = a.g(hVar.f4221g0);
                hVar.f4232r0 = g;
                if (TextUtils.isEmpty(g)) {
                    hVar.f4221g0.setError(hVar.r(R.string.enter_your_nick_name_first));
                    hVar.f4221g0.requestFocus();
                    return;
                } else if (!hVar.f4223i0.isChecked() && !hVar.f4224j0.isChecked()) {
                    hVar.f4222h0.setError(hVar.r(R.string.enter_your_gender_first));
                    hVar.f4222h0.requestFocus();
                    return;
                } else if (!hVar.f4227m0.isChecked()) {
                    hVar.f4227m0.setError(hVar.r(R.string.accept_privacy_policy_first));
                    hVar.f4227m0.requestFocus();
                    return;
                } else {
                    hVar.f4230p0.setVisibility(0);
                    android.support.v4.media.session.a.i0(new b(this, 3));
                    return;
                }
            case 1:
                h hVar2 = this.f4216b;
                Intent intent = new Intent(hVar2.f4218d0, WebViewActivity.class);
                intent.putExtra("url", "https://www.criminalcitygame.com/privacy-policy");
                hVar2.U(intent);
                return;
            case 2:
                h hVar3 = this.f4216b;
                Intent intent2 = new Intent(hVar3.f4218d0, WebViewActivity.class);
                intent2.putExtra("url", "https://www.criminalcitygame.com/terms-of-services");
                hVar3.U(intent2);
                return;
            default:
                h hVar4 = this.f4216b;
                StartActivity startActivity = (StartActivity) hVar4.l();
                if (startActivity != null) {
                    startActivity.s(new j(hVar4.f4218d0));
                    return;
                }
                return;
        }
    }
}
