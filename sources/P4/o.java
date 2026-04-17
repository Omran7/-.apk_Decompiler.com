package P4;

import A2.f;
import M4.e;
import R2.b;
import Y4.D;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import e5.C0505b;
import e5.C0509f;
import j4.C0639o;

public final class o extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2261a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2262b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0505b f2263c;
    public final /* synthetic */ Object d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f2264e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f2265f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(s sVar, RelativeLayout relativeLayout, EditText editText, RadioGroup radioGroup, int i2, C0505b bVar) {
        super(relativeLayout);
        this.f2265f = sVar;
        this.d = editText;
        this.f2264e = radioGroup;
        this.f2262b = i2;
        this.f2263c = bVar;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        switch (this.f2261a) {
            case 0:
                super.onClick(view);
                String g = a.g((EditText) this.d);
                boolean isEmpty = g.isEmpty();
                s sVar = (s) this.f2265f;
                if (isEmpty) {
                    a.m(MyApplication.f7090a, R.string.empty_search_value, sVar.f2272d0, view);
                    return;
                }
                RadioGroup radioGroup = (RadioGroup) this.f2264e;
                View findViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                boolean equals = findViewById.getTag().equals("name");
                String str3 = "gangs/gangsData";
                int i2 = 10;
                int i5 = this.f2262b;
                if (!equals) {
                    if (findViewById.getTag().equals("id")) {
                        if (i5 == 2) {
                            str2 = "accountObject/id";
                        } else if (i5 == 3) {
                            str = "id";
                            i2 = 6;
                            s.V(sVar, new e(sVar.f2272d0, str3, str, g, i2));
                            this.f2263c.dismiss();
                            sVar.f2281m0 = false;
                            return;
                        }
                    }
                    str3 = "";
                    str = str3;
                    i2 = 0;
                    s.V(sVar, new e(sVar.f2272d0, str3, str, g, i2));
                    this.f2263c.dismiss();
                    sVar.f2281m0 = false;
                    return;
                } else if (i5 == 2) {
                    str2 = "mainStatesObject/nickName";
                } else {
                    if (i5 == 3) {
                        str = "name";
                        i2 = 6;
                        s.V(sVar, new e(sVar.f2272d0, str3, str, g, i2));
                        this.f2263c.dismiss();
                        sVar.f2281m0 = false;
                        return;
                    }
                    str3 = "";
                    str = str3;
                    i2 = 0;
                    s.V(sVar, new e(sVar.f2272d0, str3, str, g, i2));
                    this.f2263c.dismiss();
                    sVar.f2281m0 = false;
                    return;
                }
                str = str2;
                str3 = "players";
                s.V(sVar, new e(sVar.f2272d0, str3, str, g, i2));
                this.f2263c.dismiss();
                sVar.f2281m0 = false;
                return;
            default:
                super.onClick(view);
                C0639o oVar = (C0639o) this.f2265f;
                oVar.getClass();
                b.w(true);
                String id = d5.o.getAccountObject().getId();
                String z3 = android.support.v4.media.session.a.z();
                D d6 = (D) this.d;
                int i6 = d6.f4293a;
                int i7 = d6.f4294b;
                int i8 = d6.f4298i;
                int i9 = this.f2262b;
                android.support.v4.media.session.a.B0(i6, i7, i8, -i9, new f((Object) oVar, i9, (Object) d6, 10), id, z3, false);
                this.f2263c.dismiss();
                oVar.f9067c = false;
                C0505b bVar = (C0505b) this.f2264e;
                if (bVar.isShowing()) {
                    bVar.dismiss();
                    oVar.d = false;
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(C0639o oVar, RelativeLayout relativeLayout, D d6, int i2, C0505b bVar, C0505b bVar2) {
        super(relativeLayout);
        this.f2265f = oVar;
        this.d = d6;
        this.f2262b = i2;
        this.f2263c = bVar;
        this.f2264e = bVar2;
    }
}
