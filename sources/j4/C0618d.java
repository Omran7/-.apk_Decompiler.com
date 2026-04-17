package j4;

import Y4.C0245b;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.utils.v0;
import e5.C0505b;
import e5.C0509f;

/* renamed from: j4.d  reason: case insensitive filesystem */
public final class C0618d extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8989a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0245b f8990b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8991c;
    public final /* synthetic */ C0626h d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0618d(C0626h hVar, RelativeLayout relativeLayout, C0245b bVar, int i2, int i5) {
        super(relativeLayout);
        this.f8989a = i5;
        this.d = hVar;
        this.f8990b = bVar;
        this.f8991c = i2;
    }

    public final void onClick(View view) {
        switch (this.f8989a) {
            case 0:
                super.onClick(view);
                boolean t6 = a.t(this.f8990b.f4328a);
                C0626h hVar = this.d;
                if (t6) {
                    Context context = hVar.f9018b;
                    v0.e(context, context.getString(R.string.can_not_send_private_message_to_yourself));
                    return;
                } else if (!hVar.f9019c) {
                    hVar.f9019c = true;
                    C0505b bVar = new C0505b(hVar.f9018b, R.layout.dialog_type_text);
                    EditText editText = (EditText) bVar.findViewById(R.id.dialog_type_text_edit_text);
                    ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_type_text_close_button);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_type_text_ok_button);
                    ((TextView) bVar.findViewById(R.id.dialog_type_text_title)).setText(R.string.send_private_message_title_to_admin);
                    ((TextView) bVar.findViewById(R.id.dialog_type_text_button_text)).setText(R.string.button_send);
                    editText.setHint(R.string.hint_type_here);
                    editText.addTextChangedListener(new C0620e(hVar, editText, 0));
                    imageView.setOnClickListener(new C0622f(hVar, imageView, bVar, 0));
                    relativeLayout.setOnClickListener(new C0616c(hVar, relativeLayout, editText, bVar, this.f8991c, 1));
                    bVar.show();
                    return;
                } else {
                    return;
                }
            default:
                super.onClick(view);
                boolean t7 = a.t(this.f8990b.f4328a);
                C0626h hVar2 = this.d;
                if (t7) {
                    Context context2 = hVar2.f9018b;
                    v0.e(context2, context2.getString(R.string.can_not_report_about_yourself));
                    return;
                } else if (d.I0()) {
                    Context context3 = hVar2.f9018b;
                    c.s0(context3, context3.getString(R.string.can_not_report_admin_when_you_are_admin_too), hVar2.f9018b.getString(R.string.alert));
                    return;
                } else if (!hVar2.f9019c) {
                    hVar2.f9019c = true;
                    C0505b bVar2 = new C0505b(hVar2.f9018b, R.layout.dialog_type_text);
                    EditText editText2 = (EditText) bVar2.findViewById(R.id.dialog_type_text_edit_text);
                    ImageView imageView2 = (ImageView) bVar2.findViewById(R.id.dialog_type_text_close_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar2.findViewById(R.id.dialog_type_text_ok_button);
                    ((TextView) bVar2.findViewById(R.id.dialog_type_text_title)).setText(R.string.send_private_message_title_to_system);
                    ((TextView) bVar2.findViewById(R.id.dialog_type_text_button_text)).setText(R.string.button_report);
                    editText2.setHint(R.string.hint_type_here);
                    editText2.addTextChangedListener(new C0620e(hVar2, editText2, 1));
                    imageView2.setOnClickListener(new C0622f(hVar2, imageView2, bVar2, 1));
                    relativeLayout2.setOnClickListener(new C0616c(hVar2, relativeLayout2, editText2, bVar2, this.f8991c, 0));
                    bVar2.show();
                    return;
                } else {
                    return;
                }
        }
    }
}
