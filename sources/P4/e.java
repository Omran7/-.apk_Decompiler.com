package P4;

import B4.d;
import R2.b;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.a;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import e3.C0496d;
import e3.m;
import e5.C0505b;
import e5.C0509f;
import f3.C0528e;

public final class e extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2202a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f2203b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, View view, int i2) {
        super(view);
        this.f2202a = i2;
        this.f2203b = gVar;
    }

    public final void onClick(View view) {
        switch (this.f2202a) {
            case 0:
                super.onClick(view);
                g gVar = this.f2203b;
                String g = a.g(gVar.f2213j0);
                String g5 = a.g(gVar.f2214k0);
                String g6 = a.g(gVar.f2215l0);
                boolean isEmpty = g.isEmpty();
                Context context = gVar.f2207d0;
                if (isEmpty) {
                    a.k(MyApplication.f7090a, R.string.add_password_fist, context);
                    return;
                } else if (g5.isEmpty()) {
                    a.k(MyApplication.f7090a, R.string.insert_new_password, context);
                    return;
                } else if (g5.equals(g)) {
                    a.k(MyApplication.f7090a, R.string.can_not_use_old_password, context);
                    return;
                } else if (g5.length() < 6) {
                    a.k(MyApplication.f7090a, R.string.password_can_not_be_less_than_6, context);
                    return;
                } else if (!g5.equals(g6)) {
                    a.k(MyApplication.f7090a, R.string.new_password_not_match, context);
                    return;
                } else {
                    b.w(true);
                    m mVar = FirebaseAuth.getInstance().f6866f;
                    if (mVar != null) {
                        String str = ((C0528e) mVar).f7921b.f7916e;
                        I.d(str);
                        I.d(g);
                        mVar.x(new C0496d(str, g, (String) null, (String) null, false)).addOnCompleteListener(new d((Object) gVar, (Object) mVar, (Object) g5, 3));
                        return;
                    }
                    b.w(false);
                    a.n(MyApplication.f7090a, R.string.unknown_error, context, (String) null);
                    return;
                }
            case 1:
                super.onClick(view);
                g gVar2 = this.f2203b;
                if (!gVar2.f2218o0) {
                    gVar2.f2218o0 = true;
                    C0505b bVar = new C0505b(gVar2.f2207d0, R.layout.dialog_ok_cancle);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
                    ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_title)).setText(R.string.reset_password_title);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.reset_password_statement);
                    relativeLayout.setOnClickListener(new f(gVar2, relativeLayout, bVar, 0));
                    relativeLayout2.setOnClickListener(new f(gVar2, relativeLayout2, bVar, 1));
                    bVar.show();
                    return;
                }
                return;
            default:
                super.onClick(view);
                g gVar3 = this.f2203b;
                C0269a aVar = new C0269a(gVar3.p());
                aVar.h(gVar3);
                aVar.e(false);
                return;
        }
    }
}
