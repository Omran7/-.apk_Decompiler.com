package o4;

import android.view.View;
import androidx.fragment.app.C0269a;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e5.C0509f;

/* renamed from: o4.b  reason: case insensitive filesystem */
public final class C0897b extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10446a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f10447b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0897b(e eVar, View view, int i2) {
        super(view);
        this.f10446a = i2;
        this.f10447b = eVar;
    }

    public final void onClick(View view) {
        switch (this.f10446a) {
            case 0:
                super.onClick(view);
                a.p(MyApplication.f7090a, R.string.next_version_bank_loan, this.f10447b.f10453d0, (String) null);
                return;
            case 1:
                super.onClick(view);
                e eVar = this.f10447b;
                C0269a aVar = new C0269a(eVar.p());
                aVar.h(eVar);
                aVar.e(false);
                return;
            case 2:
                super.onClick(view);
                e eVar2 = this.f10447b;
                String replace = eVar2.f10463n0.getText().toString().trim().replace(",", "");
                long parseLong = Long.parseLong(replace);
                boolean isEmpty = replace.isEmpty();
                MainActivity mainActivity = eVar2.f10453d0;
                if (isEmpty || parseLong == 0) {
                    v0.e(mainActivity, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_select_cash_value_first));
                    return;
                } else if (replace.length() > 17) {
                    v0.e(mainActivity, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_number_too_long));
                    return;
                } else {
                    long parseLong2 = Long.parseLong(replace);
                    if (parseLong2 > o.getMoneyObject().getCash()) {
                        v0.e(mainActivity, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_not_enough_cash));
                        return;
                    } else {
                        e.V(eVar2, 0, parseLong2);
                        return;
                    }
                }
            default:
                super.onClick(view);
                e eVar3 = this.f10447b;
                String replace2 = eVar3.f10464o0.getText().toString().trim().replace(",", "");
                long parseLong3 = Long.parseLong(replace2);
                boolean isEmpty2 = replace2.isEmpty();
                MainActivity mainActivity2 = eVar3.f10453d0;
                if (isEmpty2 || parseLong3 == 0) {
                    v0.e(mainActivity2, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_select_cash_value_first));
                    return;
                } else if (replace2.length() > 17) {
                    v0.e(mainActivity2, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_number_too_long));
                    return;
                } else {
                    long parseLong4 = Long.parseLong(replace2);
                    if (parseLong4 > o.getMoneyObject().getBankCash()) {
                        v0.e(mainActivity2, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_not_enough_cash));
                        return;
                    } else {
                        e.V(eVar3, 1, parseLong4);
                        return;
                    }
                }
        }
    }
}
