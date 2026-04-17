package T4;

import H4.e;
import R2.b;
import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0505b;
import e5.C0509f;

public final class c extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3583a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f3584b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f3585c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, View view, C0505b bVar, int i2) {
        super(view);
        this.f3583a = i2;
        this.f3585c = dVar;
        this.f3584b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f3583a) {
            case 0:
                super.onClick(view);
                d dVar = this.f3585c;
                int i2 = dVar.f3601r0;
                Context context = dVar.f3587d0;
                if (i2 == -1) {
                    a.m(MyApplication.f7090a, R.string.select_background_first, context, view);
                    return;
                }
                int museumBackgroundIdSelected = o.getStockObject().getMuseumBackgroundIdSelected();
                C0505b bVar = this.f3584b;
                if (i2 == museumBackgroundIdSelected) {
                    bVar.dismiss();
                    dVar.s0 = false;
                    a.k(MyApplication.f7090a, R.string.toast_no_change_happened, context);
                    return;
                }
                bVar.dismiss();
                dVar.s0 = false;
                b.w(true);
                dVar.f3599p0.E("museumBackgroundIdSelected").I(Integer.valueOf(dVar.f3601r0)).addOnSuccessListener(new e(dVar, 7));
                return;
            default:
                super.onClick(view);
                this.f3584b.dismiss();
                this.f3585c.s0 = false;
                return;
        }
    }
}
