package com.mtma.criminal.city.fragments.gangBase;

import A4.h;
import K4.l;
import P4.n;
import R2.b;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import e5.C0505b;
import e5.C0509f;
import java.util.ArrayList;

public final class x extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7322a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y f7323b;

    public /* synthetic */ x(y yVar, int i2) {
        this.f7322a = i2;
        this.f7323b = yVar;
    }

    public final void onClick(View view) {
        switch (this.f7322a) {
            case 0:
                super.onClick(view);
                y yVar = this.f7323b;
                int i2 = yVar.f7331k0;
                ArrayList arrayList = yVar.f7332l0;
                if (i2 != arrayList.indexOf(yVar.f7326f0)) {
                    yVar.f7331k0 = arrayList.indexOf(yVar.f7326f0);
                    yVar.W();
                    yVar.V(new A(yVar.f7324d0, 0), true);
                    return;
                }
                return;
            case 1:
                super.onClick(view);
                y yVar2 = this.f7323b;
                int i5 = yVar2.f7331k0;
                ArrayList arrayList2 = yVar2.f7332l0;
                if (i5 != arrayList2.indexOf(yVar2.f7327g0)) {
                    yVar2.f7331k0 = arrayList2.indexOf(yVar2.f7327g0);
                    yVar2.W();
                    yVar2.V(new A(yVar2.f7324d0, 1), true);
                    return;
                }
                return;
            case 2:
                super.onClick(view);
                y yVar3 = this.f7323b;
                C0269a aVar = new C0269a(yVar3.p());
                aVar.f(R.id.activity_main_body_frame_layout, new C0423c(yVar3.f7324d0), (String) null, 1);
                aVar.e(false);
                b.N0();
                return;
            case 3:
                super.onClick(view);
                y yVar4 = this.f7323b;
                if (!yVar4.f7335o0) {
                    yVar4.f7335o0 = true;
                    C0505b bVar = new C0505b(yVar4.f7324d0, R.layout.dialog_search);
                    RadioGroup radioGroup = (RadioGroup) bVar.findViewById(R.id.dialog_search_radio_group);
                    EditText editText = (EditText) bVar.findViewById(R.id.dialog_search_edit_text);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_search_search_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_search_cancel_button);
                    a.o(MyApplication.f7090a, R.string.search_about_gangs_title, (TextView) bVar.findViewById(R.id.dialog_search_title));
                    ((RadioButton) bVar.findViewById(R.id.dialog_search_id_radio_button)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_id));
                    radioGroup.setOnCheckedChangeListener(new n(radioGroup, editText, 1));
                    relativeLayout.setOnClickListener(new l(yVar4, relativeLayout, editText, radioGroup, bVar, 1));
                    relativeLayout2.setOnClickListener(new h(yVar4, relativeLayout2, bVar, 10));
                    bVar.show();
                    return;
                }
                return;
            default:
                super.onClick(view);
                y yVar5 = this.f7323b;
                C0269a aVar2 = new C0269a(yVar5.p());
                aVar2.h(yVar5);
                aVar2.e(false);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(y yVar, View view, int i2) {
        super(view);
        this.f7322a = i2;
        this.f7323b = yVar;
    }
}
