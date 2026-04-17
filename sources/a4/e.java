package A4;

import W4.g;
import W4.h;
import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import d5.o;
import e5.C0505b;
import e5.C0509f;

public final class e extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f73a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f74b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(j jVar, View view, int i2) {
        super(view);
        this.f73a = i2;
        this.f74b = jVar;
    }

    public final void onClick(View view) {
        j jVar = this.f74b;
        switch (this.f73a) {
            case 0:
                super.onClick(view);
                if (o.getLocationObject().getCurrentCity() != 0 || o.getLocationObject().getCurrentPlace() != 0) {
                    a.n(MyApplication.f7090a, R.string.can_not_access_to_office_work_outside_main_city, jVar.f107d0, (String) null);
                    return;
                } else if (o.getWorkObject().getJobType() == -1) {
                    jVar.W(new h(jVar.f107d0));
                    return;
                } else {
                    jVar.W(new g(jVar.f107d0));
                    return;
                }
            case 1:
                super.onClick(view);
                jVar.W(new B4.g(jVar.f107d0));
                return;
            case 2:
                super.onClick(view);
                Context context = jVar.f107d0;
                jVar.W(new C4.a(1));
                return;
            case 3:
                super.onClick(view);
                C0269a aVar = new C0269a(jVar.p());
                aVar.h(jVar);
                aVar.e(false);
                return;
            case 4:
                super.onClick(view);
                boolean isBannedFromNews = o.getAccountObject().isBannedFromNews();
                j jVar2 = this.f74b;
                if (isBannedFromNews || o.getAccountObject().isBannedFromNewsFromSystem()) {
                    a.n(MyApplication.f7090a, R.string.can_not_send_message_cause_banned_from_using_it, jVar2.f107d0, (String) null);
                    return;
                } else if (!jVar2.f106W0) {
                    jVar2.f106W0 = true;
                    C0505b bVar = new C0505b(jVar2.f107d0, R.layout.dialog_type_text);
                    EditText editText = (EditText) bVar.findViewById(R.id.dialog_type_text_edit_text);
                    ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_type_text_close_button);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_type_text_ok_button);
                    TextView textView = (TextView) bVar.findViewById(R.id.dialog_type_text_cost_value);
                    textView.setVisibility(0);
                    ((ImageView) bVar.findViewById(R.id.dialog_type_text_cost_icon)).setVisibility(0);
                    ((TextView) bVar.findViewById(R.id.dialog_type_text_title)).setText(R.string.add_ad_title);
                    ((TextView) bVar.findViewById(R.id.dialog_type_text_description)).setText(jVar2.s(R.string.ad_maximum_letters_number, 50, 3));
                    ((TextView) bVar.findViewById(R.id.dialog_type_text_button_text)).setText(R.string.button_publish);
                    textView.setText(U.a(20000));
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50)});
                    editText.addTextChangedListener(new g(0, editText));
                    imageView.setOnClickListener(new h(jVar2, imageView, bVar, 0));
                    relativeLayout.setOnClickListener(new i(jVar2, relativeLayout, editText, bVar, 0));
                    bVar.show();
                    return;
                } else {
                    return;
                }
            case 5:
                super.onClick(view);
                Context context2 = jVar.f107d0;
                jVar.W(new C4.a(0));
                return;
            default:
                super.onClick(view);
                jVar.W(new E4.e(jVar.f107d0));
                return;
        }
    }

    public e(j jVar) {
        this.f73a = 5;
        this.f74b = jVar;
    }
}
