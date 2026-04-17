package X4;

import android.view.View;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.StartActivity;
import com.mtma.criminal.city.app.MyApplication;
import e5.C0509f;

public final class i extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4233a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f4234b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, View view, int i2) {
        super(view);
        this.f4233a = i2;
        this.f4234b = jVar;
    }

    public final void onClick(View view) {
        switch (this.f4233a) {
            case 0:
                super.onClick(view);
                j jVar = this.f4234b;
                StartActivity startActivity = (StartActivity) jVar.l();
                if (startActivity != null) {
                    startActivity.s(new h(jVar.f4235d0, jVar.f4242k0));
                    return;
                }
                return;
            case 1:
                super.onClick(view);
                j jVar2 = this.f4234b;
                StartActivity startActivity2 = (StartActivity) jVar2.l();
                if (startActivity2 != null) {
                    startActivity2.s(new c(jVar2.f4235d0));
                    return;
                }
                return;
            default:
                super.onClick(view);
                c.s0(this.f4234b.f4235d0, MyApplication.f7090a.getApplicationContext().getString(R.string.next_version_login_with_gmail), (String) null);
                return;
        }
    }
}
