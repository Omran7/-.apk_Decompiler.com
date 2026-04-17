package q4;

import R2.b;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11105a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f11106b;

    public /* synthetic */ c(e eVar, int i2) {
        this.f11105a = i2;
        this.f11106b = eVar;
    }

    public final void run() {
        switch (this.f11105a) {
            case 0:
                b.w(false);
                a.n(MyApplication.f7090a, R.string.purchase_pending, this.f11106b.f11109d0, (String) null);
                return;
            default:
                b.w(false);
                a.n(MyApplication.f7090a, R.string.purchase_failed, this.f11106b.f11109d0, (String) null);
                return;
        }
    }
}
