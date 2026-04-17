package K4;

import A4.g;
import A4.h;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.datepicker.k;
import com.mtma.criminal.city.R;
import e5.C0505b;
import f.C0514e;
import i.C0571a;
import k.C0692V0;

public final class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1579a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1580b;

    public /* synthetic */ m(Object obj, int i2) {
        this.f1579a = i2;
        this.f1580b = obj;
    }

    public final void onClick(View view) {
        j.m mVar;
        Object obj = this.f1580b;
        switch (this.f1579a) {
            case 0:
                o oVar = (o) obj;
                if (!oVar.f1597r0) {
                    oVar.f1597r0 = true;
                    C0505b bVar = new C0505b(oVar.f1583d0, R.layout.dialog_type_text);
                    EditText editText = (EditText) bVar.findViewById(R.id.dialog_type_text_edit_text);
                    ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_type_text_close_button);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_type_text_ok_button);
                    String trim = oVar.f1585f0.getText().toString().trim();
                    ((TextView) bVar.findViewById(R.id.dialog_type_text_title)).setText(R.string.bio);
                    ((TextView) bVar.findViewById(R.id.dialog_type_text_description)).setText(R.string.bio_maximum_letters_number);
                    ((TextView) bVar.findViewById(R.id.dialog_type_text_button_text)).setText(R.string.button_update);
                    editText.setText(trim);
                    editText.requestFocus();
                    editText.setSelection(trim.length());
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
                    editText.addTextChangedListener(new g(1, editText));
                    imageView.setOnClickListener(new h(this, imageView, bVar, 2));
                    relativeLayout.setOnClickListener(new l(this, relativeLayout, editText, trim, bVar, 0));
                    bVar.show();
                    return;
                }
                return;
            case 1:
                k kVar = (k) obj;
                int i2 = kVar.f6416h0;
                if (i2 == 2) {
                    kVar.W(1);
                    return;
                } else if (i2 == 1) {
                    kVar.W(2);
                    return;
                } else {
                    return;
                }
            case 2:
                C0514e eVar = (C0514e) obj;
                Button button = eVar.f7764f;
                eVar.f7778v.obtainMessage(1, eVar.f7761b).sendToTarget();
                return;
            case 3:
                ((C0571a) obj).a();
                return;
            default:
                C0692V0 v02 = ((Toolbar) obj).f4809U;
                if (v02 == null) {
                    mVar = null;
                } else {
                    mVar = v02.f9238b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
