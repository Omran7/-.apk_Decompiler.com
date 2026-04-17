package j4;

import K4.k;
import K4.l;
import Y4.C0248e;
import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.fragments.gangBase.v;
import e5.C0505b;
import e5.C0509f;
import f.C0518i;
import o3.d;

/* renamed from: j4.u  reason: case insensitive filesystem */
public final class C0644u extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9102a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0248e f9103b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0645v f9104c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0644u(C0645v vVar, ViewGroup viewGroup, C0248e eVar, int i2) {
        super(viewGroup);
        this.f9102a = i2;
        this.f9104c = vVar;
        this.f9103b = eVar;
    }

    public final void onClick(View view) {
        C0286s sVar;
        switch (this.f9102a) {
            case 0:
                super.onClick(view);
                C0645v vVar = this.f9104c;
                int i2 = vVar.f9110b;
                Context context = vVar.f9109a;
                if (i2 != 1) {
                    C0645v vVar2 = vVar;
                    if (i2 == 0 && !vVar2.g) {
                        vVar2.g = true;
                        C0505b bVar = new C0505b(context, R.layout.dialog_ok_cancle);
                        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
                        RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
                        ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.confirm_contact_request);
                        C0505b bVar2 = bVar;
                        relativeLayout.setOnClickListener(new C0642s(vVar2, relativeLayout, this.f9103b, bVar, 1));
                        relativeLayout2.setOnClickListener(new C0643t(vVar2, relativeLayout2, bVar2, 1));
                        bVar2.show();
                        return;
                    }
                    return;
                } else if (!vVar.f9111c) {
                    vVar.f9111c = true;
                    C0505b bVar3 = new C0505b(context, R.layout.dialog_with_edit_field);
                    EditText editText = (EditText) bVar3.findViewById(R.id.dialog_with_edit_field_edit_text);
                    RelativeLayout relativeLayout3 = (RelativeLayout) bVar3.findViewById(R.id.dialog_with_edit_field_ok_button);
                    RelativeLayout relativeLayout4 = (RelativeLayout) bVar3.findViewById(R.id.dialog_with_edit_field_cancel_button);
                    ((TextView) bVar3.findViewById(R.id.dialog_with_edit_field_title)).setText(R.string.add_friend_name);
                    ((TextView) bVar3.findViewById(R.id.dialog_with_edit_field_description)).setText(R.string.add_friend_name_description);
                    ((TextView) bVar3.findViewById(R.id.dialog_with_edit_field_ok_button_text)).setText(R.string.button_ok);
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(15)});
                    relativeLayout3.setOnClickListener(new l(vVar, relativeLayout3, editText, this.f9103b, bVar3, 4));
                    relativeLayout4.setOnClickListener(new C0643t(vVar, relativeLayout4, bVar3, 2));
                    bVar3.show();
                    return;
                } else {
                    return;
                }
            case 1:
                super.onClick(view);
                C0645v vVar3 = this.f9104c;
                int i5 = vVar3.f9110b;
                Context context2 = vVar3.f9109a;
                C0248e eVar = this.f9103b;
                if (i5 == 1) {
                    if (!vVar3.d) {
                        vVar3.d = true;
                        C0505b bVar4 = new C0505b(context2, R.layout.dialog_ok_cancle);
                        RelativeLayout relativeLayout5 = (RelativeLayout) bVar4.findViewById(R.id.dialog_ok_cancel_confirm_button);
                        RelativeLayout relativeLayout6 = (RelativeLayout) bVar4.findViewById(R.id.dialog_ok_cancel_cancel_button);
                        ((LinearLayout) bVar4.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                        ((TextView) bVar4.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                        ((TextView) bVar4.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.confirm_unfriend_player);
                        relativeLayout5.setOnClickListener(new C0642s(vVar3, relativeLayout5, eVar, bVar4, 2));
                        relativeLayout6.setOnClickListener(new C0643t(vVar3, relativeLayout6, bVar4, 3));
                        bVar4.show();
                        return;
                    }
                    return;
                } else if (i5 != 2) {
                    C0645v vVar4 = vVar3;
                    if (i5 == 0 && !vVar4.f9113f) {
                        vVar4.f9113f = true;
                        C0505b bVar5 = new C0505b(context2, R.layout.dialog_ok_cancle);
                        RelativeLayout relativeLayout7 = (RelativeLayout) bVar5.findViewById(R.id.dialog_ok_cancel_confirm_button);
                        RelativeLayout relativeLayout8 = (RelativeLayout) bVar5.findViewById(R.id.dialog_ok_cancel_cancel_button);
                        ((LinearLayout) bVar5.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                        ((TextView) bVar5.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                        ((TextView) bVar5.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.confirm_remove_contact_request);
                        relativeLayout7.setOnClickListener(new C0642s(vVar4, relativeLayout7, eVar, bVar5, 0));
                        relativeLayout8.setOnClickListener(new C0643t(vVar4, relativeLayout8, bVar5, 0));
                        bVar5.show();
                        return;
                    }
                    return;
                } else if (!vVar3.f9112e) {
                    vVar3.f9112e = true;
                    C0505b bVar6 = new C0505b(context2, R.layout.dialog_ok_cancle);
                    RelativeLayout relativeLayout9 = (RelativeLayout) bVar6.findViewById(R.id.dialog_ok_cancel_confirm_button);
                    RelativeLayout relativeLayout10 = (RelativeLayout) bVar6.findViewById(R.id.dialog_ok_cancel_cancel_button);
                    ((LinearLayout) bVar6.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                    ((TextView) bVar6.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                    ((TextView) bVar6.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.confirm_unblock_player);
                    relativeLayout9.setOnClickListener(new C0642s(vVar3, relativeLayout9, eVar, bVar6, 3));
                    relativeLayout10.setOnClickListener(new C0643t(vVar3, relativeLayout10, bVar6, 4));
                    bVar6.show();
                    return;
                } else {
                    return;
                }
            default:
                super.onClick(view);
                C0248e eVar2 = this.f9103b;
                int i6 = eVar2.f4345i;
                C0645v vVar5 = this.f9104c;
                if (i6 == 2) {
                    sVar = new v(vVar5.f9109a, eVar2.f4340a);
                } else {
                    sVar = new k(vVar5.f9109a, eVar2.f4340a);
                }
                I l6 = ((C0518i) view.getContext()).l();
                C0269a b6 = d.b(l6, l6);
                b6.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
                a.j(b6, false);
                return;
        }
    }
}
