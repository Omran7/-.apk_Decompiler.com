package P4;

import B4.d;
import R2.b;
import R2.i;
import android.content.Context;
import android.util.Patterns;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import com.google.android.gms.internal.measurement.a;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e3.C0499g;
import e3.m;
import e5.C0505b;
import e5.C0509f;
import f3.C0528e;
import f3.t;

public final class v extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2288a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f2289b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, View view, int i2) {
        super(view);
        this.f2288a = i2;
        this.f2289b = wVar;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [e3.g, f3.t] */
    /* JADX WARNING: type inference failed for: r1v11, types: [e3.g, f3.t] */
    public final void onClick(View view) {
        switch (this.f2288a) {
            case 0:
                super.onClick(view);
                w wVar = this.f2289b;
                C0269a aVar = new C0269a(wVar.p());
                aVar.h(wVar);
                aVar.e(false);
                return;
            case 1:
                super.onClick(view);
                boolean isEmailVerified = o.getAccountObject().isEmailVerified();
                w wVar2 = this.f2289b;
                if (!isEmailVerified || o.getAccountObject().isCanChangeEmail()) {
                    String g = a.g(wVar2.f2301o0);
                    String g5 = a.g(wVar2.f2302p0);
                    boolean isEmpty = g.isEmpty();
                    Context context = wVar2.f2290d0;
                    if (isEmpty) {
                        a.k(MyApplication.f7090a, R.string.add_new_email_address, context);
                        return;
                    } else if (g5.isEmpty()) {
                        a.k(MyApplication.f7090a, R.string.add_password_fist, context);
                        return;
                    } else if (g.equals(o.getAccountObject().getEmail())) {
                        a.k(MyApplication.f7090a, R.string.can_not_use_same_email, context);
                        return;
                    } else if (!Patterns.EMAIL_ADDRESS.matcher(g).matches()) {
                        a.k(MyApplication.f7090a, R.string.enter_valid_email_address, context);
                        return;
                    } else {
                        b.w(true);
                        m mVar = FirebaseAuth.getInstance().f6866f;
                        mVar.getClass();
                        FirebaseAuth instance = FirebaseAuth.getInstance(i.f(((C0528e) mVar).f7922c));
                        instance.getClass();
                        instance.f6865e.zza(instance.f6862a, mVar, (t) new C0499g(instance, 0)).addOnCompleteListener(new d((Object) wVar2, (Object) g, (Object) g5, 4));
                        return;
                    }
                } else {
                    a.n(MyApplication.f7090a, R.string.can_not_change_verified_email, wVar2.f2290d0, (String) null);
                    return;
                }
            case 2:
                super.onClick(view);
                w wVar3 = this.f2289b;
                if (!wVar3.f2307v0) {
                    wVar3.f2307v0 = true;
                    C0505b bVar = new C0505b(wVar3.f2290d0, R.layout.dialog_ok_cancle);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
                    ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_title)).setText(R.string.reset_password_title);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.reset_password_statement);
                    relativeLayout.setOnClickListener(new t(wVar3, relativeLayout, bVar, 1));
                    relativeLayout2.setOnClickListener(new t(wVar3, relativeLayout2, bVar, 2));
                    bVar.show();
                    return;
                }
                return;
            default:
                super.onClick(view);
                if (o.getAccountObject().isEmailVerified()) {
                    a.n(MyApplication.f7090a, R.string.can_not_change_verified_email, this.f2289b.f2290d0, (String) null);
                    return;
                }
                b.w(true);
                if (FirebaseAuth.getInstance().f6866f != null) {
                    m mVar2 = FirebaseAuth.getInstance().f6866f;
                    mVar2.getClass();
                    FirebaseAuth instance2 = FirebaseAuth.getInstance(i.f(((C0528e) mVar2).f7922c));
                    instance2.getClass();
                    instance2.f6865e.zza(instance2.f6862a, mVar2, (t) new C0499g(instance2, 0)).addOnCompleteListener(new H4.d((Object) this, 9));
                    return;
                }
                return;
        }
    }
}
