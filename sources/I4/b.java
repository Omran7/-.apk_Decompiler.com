package I4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mtma.criminal.city.R;
import e5.C0505b;
import e5.C0509f;
import r4.j;

public final class b extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1193a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f1194b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(f fVar, View view, int i2) {
        super(view);
        this.f1193a = i2;
        this.f1194b = fVar;
    }

    public final void onClick(View view) {
        switch (this.f1193a) {
            case 0:
                super.onClick(view);
                f fVar = this.f1194b;
                f.V(fVar, new i(fVar.f1200d0));
                return;
            case 1:
                super.onClick(view);
                f fVar2 = this.f1194b;
                if (!fVar2.s0) {
                    fVar2.s0 = true;
                    C0505b bVar = new C0505b(fVar2.f1200d0, R.layout.dialog_ok_cancle);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.escape_description);
                    ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                    relativeLayout.setOnClickListener(new d(fVar2, relativeLayout, bVar, 0));
                    relativeLayout2.setOnClickListener(new d(fVar2, relativeLayout2, bVar, 1));
                    bVar.show();
                    return;
                }
                return;
            case 2:
                super.onClick(view);
                f fVar3 = this.f1194b;
                f.V(fVar3, new Q4.b(fVar3.f1200d0));
                return;
            case 3:
                super.onClick(view);
                f fVar4 = this.f1194b;
                f.V(fVar4, new F4.b(fVar4.f1200d0));
                return;
            case 4:
                super.onClick(view);
                f fVar5 = this.f1194b;
                f.V(fVar5, new j(fVar5.f1200d0));
                return;
            default:
                super.onClick(view);
                f fVar6 = this.f1194b;
                f.V(fVar6, new A4.j(fVar6.f1200d0));
                return;
        }
    }
}
