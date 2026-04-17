package A4;

import R2.b;
import androidx.fragment.app.C0286s;
import com.google.android.gms.tasks.OnSuccessListener;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0429i;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.v0;
import d5.o;

public final /* synthetic */ class d implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f70a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f71b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0286s f72c;

    public /* synthetic */ d(C0286s sVar, String str, int i2) {
        this.f70a = i2;
        this.f72c = sVar;
        this.f71b = str;
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        switch (this.f70a) {
            case 0:
                j jVar = (j) this.f72c;
                jVar.getClass();
                String nickName = o.getMainStatesObject().getNickName();
                jVar.f95J0 = nickName;
                jVar.f96K0 = this.f71b;
                jVar.f122t0.setText(nickName);
                jVar.f123u0.setText(jVar.f96K0);
                if (jVar.f124v0.getVisibility() == 0) {
                    jVar.f124v0.setVisibility(8);
                }
                b.w(false);
                b.M0(R.raw.money_get);
                v0.e(jVar.f107d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_add_ad_successfully));
                Q.b(7, o.getAccountObject().getId(), (long) 1);
                return;
            default:
                C0429i iVar = (C0429i) this.f72c;
                String str = this.f71b;
                iVar.f7187D0 = str;
                I1.b.z0(str);
                iVar.f7201k0.setImageBitmap(iVar.f7188E0);
                iVar.f7188E0 = null;
                b.w(false);
                v0.e(iVar.f7194d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                b.M0(R.raw.add_new_item);
                return;
        }
    }
}
