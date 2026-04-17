package P4;

import F3.h;
import R2.b;
import android.util.Patterns;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0509f;
import java.util.HashMap;

public final class k extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2246a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f2247b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, View view, int i2) {
        super(view);
        this.f2246a = i2;
        this.f2247b = lVar;
    }

    public final void onClick(View view) {
        switch (this.f2246a) {
            case 0:
                super.onClick(view);
                l lVar = this.f2247b;
                String g = a.g(lVar.f2250f0);
                String g5 = a.g(lVar.f2251g0);
                String g6 = a.g(lVar.f2252h0);
                String g7 = a.g(lVar.f2253i0);
                if (g.isEmpty()) {
                    lVar.f2250f0.setError(MyApplication.f7090a.getApplicationContext().getString(R.string.enter_email_first));
                    lVar.f2250f0.requestFocus();
                    return;
                } else if (!Patterns.EMAIL_ADDRESS.matcher(g).matches()) {
                    lVar.f2250f0.setError(MyApplication.f7090a.getApplicationContext().getString(R.string.enter_valid_email_first));
                    lVar.f2250f0.requestFocus();
                    return;
                } else if (g5.isEmpty()) {
                    lVar.f2251g0.setError(MyApplication.f7090a.getApplicationContext().getString(R.string.enter_username_first));
                    lVar.f2251g0.requestFocus();
                    return;
                } else if (g5.length() < 4) {
                    lVar.f2251g0.setError(MyApplication.f7090a.getApplicationContext().getString(R.string.username_can_not_be_less_than_4));
                    lVar.f2251g0.requestFocus();
                    return;
                } else if (g6.isEmpty()) {
                    lVar.f2252h0.setError(MyApplication.f7090a.getApplicationContext().getString(R.string.enter_your_password));
                    lVar.f2252h0.requestFocus();
                    return;
                } else if (g6.length() < 6) {
                    lVar.f2252h0.setError(MyApplication.f7090a.getApplicationContext().getString(R.string.password_can_not_be_less_than_6));
                    lVar.f2252h0.requestFocus();
                    return;
                } else if (!g6.equals(g7)) {
                    lVar.f2253i0.setError(MyApplication.f7090a.getApplicationContext().getString(R.string.password_not_match));
                    lVar.f2253i0.requestFocus();
                    return;
                } else {
                    b.w(true);
                    HashMap hashMap = new HashMap();
                    hashMap.put("userAuthId", o.getAccountObject().getFirebaseId());
                    hashMap.put("email", g);
                    hashMap.put("userName", g5);
                    hashMap.put("password", g6);
                    h.b().a("saveAccountData").q(hashMap).addOnCompleteListener(new E4.b(lVar, g, g6, g5, 2));
                    return;
                }
            default:
                super.onClick(view);
                l lVar2 = this.f2247b;
                C0269a aVar = new C0269a(lVar2.p());
                aVar.h(lVar2);
                aVar.e(false);
                return;
        }
    }
}
