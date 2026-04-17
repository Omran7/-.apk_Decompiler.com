package p4;

import K4.j;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import e5.C0505b;
import e5.C0509f;
import j4.C0623f0;

/* renamed from: p4.e  reason: case insensitive filesystem */
public final class C0922e extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11011a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0923f f11012b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0922e(C0923f fVar, View view, int i2) {
        super(view);
        this.f11011a = i2;
        this.f11012b = fVar;
    }

    public final void onClick(View view) {
        switch (this.f11011a) {
            case 0:
                super.onClick(view);
                C0923f fVar = this.f11012b;
                int W5 = fVar.W();
                int i2 = fVar.f11025p0;
                Context context = fVar.f11013d0;
                if (W5 < i2) {
                    a.k(MyApplication.f7090a, R.string.do_not_have_converting_requirements, context);
                    return;
                } else if (fVar.f11026q0 < 1) {
                    a.k(MyApplication.f7090a, R.string.select_amount_for_converting, context);
                    return;
                } else {
                    int i5 = fVar.f11027r0;
                    if (!fVar.f11032x0) {
                        fVar.f11032x0 = true;
                        C0505b bVar = new C0505b(context, R.layout.dialog_ok_cancle);
                        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
                        RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
                        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.confirm_converting_materials);
                        ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                        relativeLayout.setOnClickListener(new j((Object) fVar, relativeLayout, i5, (Object) bVar, 18));
                        relativeLayout2.setOnClickListener(new C0623f0(fVar, relativeLayout2, bVar, 16));
                        bVar.show();
                        return;
                    }
                    return;
                }
            case 1:
                super.onClick(view);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                int i6 = iArr[1];
                C0923f fVar2 = this.f11012b;
                v0.a(fVar2.s0, fVar2.f11013d0, i6);
                return;
            default:
                super.onClick(view);
                C0923f fVar3 = this.f11012b;
                C0269a aVar = new C0269a(fVar3.p());
                aVar.h(fVar3);
                aVar.e(false);
                return;
        }
    }
}
