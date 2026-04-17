package t4;

import android.view.View;
import androidx.fragment.app.C0269a;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import e5.C0509f;

/* renamed from: t4.d  reason: case insensitive filesystem */
public final class C1012d extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11770a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1011c f11771b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1012d(C1011c cVar, View view, int i2) {
        super(view);
        this.f11770a = i2;
        this.f11771b = cVar;
    }

    public final void onClick(View view) {
        switch (this.f11770a) {
            case 0:
                super.onClick(view);
                a.n(MyApplication.f7090a, R.string.next_version_not_allowed_buy_or_sell_estate_in_estate_market, this.f11771b.f11762e0, (String) null);
                return;
            default:
                super.onClick(view);
                C1011c cVar = this.f11771b;
                C0269a aVar = new C0269a(cVar.p());
                aVar.h(cVar);
                aVar.e(false);
                return;
        }
    }
}
