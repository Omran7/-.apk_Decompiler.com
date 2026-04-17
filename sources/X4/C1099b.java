package x4;

import R2.b;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import j4.C0623f0;

/* renamed from: x4.b  reason: case insensitive filesystem */
public final class C1099b extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12558a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1101d f12559b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1099b(C1101d dVar, View view, int i2) {
        super(view);
        this.f12558a = i2;
        this.f12559b = dVar;
    }

    public final void onClick(View view) {
        switch (this.f12558a) {
            case 0:
                super.onClick(view);
                C1101d dVar = this.f12559b;
                dVar.getClass();
                long o02 = d.o0() - o.getMainStatesObject().getHealthCurrent();
                int i2 = (o02 > 0 ? 1 : (o02 == 0 ? 0 : -1));
                MainActivity mainActivity = dVar.f12563d0;
                if (i2 <= 0) {
                    a.p(MyApplication.f7090a, R.string.full_health, mainActivity, (String) null);
                    return;
                } else if (!dVar.f12576q0) {
                    dVar.f12576q0 = true;
                    C0505b bVar = new C0505b(mainActivity, R.layout.dialog_money_icon);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_money_icon_ok_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_money_icon_cancel_button);
                    ((TextView) bVar.findViewById(R.id.dialog_money_icon_description)).setText(dVar.s(R.string.cash_to_restore_health, Long.valueOf(o02)));
                    ((ImageView) bVar.findViewById(R.id.dialog_money_icon_cost_image)).setImageResource(R.drawable.cash_icon);
                    ((TextView) bVar.findViewById(R.id.dialog_money_icon_cost)).setText(U.a(o02));
                    b.c((LinearLayout) bVar.findViewById(R.id.dialog_money_icon_money_layout), 3);
                    relativeLayout.setOnClickListener(new C1100c(dVar, relativeLayout, o02, bVar));
                    relativeLayout2.setOnClickListener(new C0623f0(dVar, relativeLayout2, bVar, 17));
                    bVar.show();
                    return;
                } else {
                    return;
                }
            default:
                super.onClick(view);
                C1101d dVar2 = this.f12559b;
                C0269a aVar = new C0269a(dVar2.p());
                aVar.h(dVar2);
                aVar.e(false);
                return;
        }
    }
}
