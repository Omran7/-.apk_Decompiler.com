package j4;

import K1.e;
import K4.l;
import R2.b;
import X4.d;
import Y4.D;
import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.v0;
import e5.C0505b;
import e5.C0509f;
import f.C0518i;

/* renamed from: j4.l  reason: case insensitive filesystem */
public final class C0634l extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9043a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f9044b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0639o f9045c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0634l(C0639o oVar, RelativeLayout relativeLayout, D d, int i2) {
        super(relativeLayout);
        this.f9043a = i2;
        this.f9045c = oVar;
        this.f9044b = d;
    }

    public final void onClick(View view) {
        switch (this.f9043a) {
            case 0:
                super.onClick(view);
                D d = this.f9044b;
                boolean z3 = d.f4304o;
                C0639o oVar = this.f9045c;
                if (z3) {
                    a.k(MyApplication.f7090a, R.string.already_used_in_arming, oVar.f9065a);
                    return;
                }
                oVar.getClass();
                d dVar = new d(oVar, d, 22);
                int i2 = d.f4293a;
                int i5 = d.f4294b;
                Context context = oVar.f9065a;
                if (i5 == 3) {
                    android.support.v4.media.session.a.H0(context, i2);
                    return;
                } else if (i5 == 7) {
                    e.w0(context, d);
                    return;
                } else if (i5 == 0 || i5 == 1 || i5 == 14 || i5 == 15 || i5 == 16) {
                    android.support.v4.media.session.a.F0(context, d, dVar);
                    return;
                } else if (i5 == 11) {
                    e.u0(context, d);
                    return;
                } else if (i5 == 10) {
                    b.Z0(context, d);
                    return;
                } else if (i5 == 18) {
                    b.b1(context, d);
                    return;
                } else {
                    return;
                }
            default:
                super.onClick(view);
                D d6 = this.f9044b;
                boolean z4 = d6.f4302m;
                C0639o oVar2 = this.f9045c;
                if (z4) {
                    R4.d dVar2 = new R4.d(oVar2.f9065a);
                    I l6 = ((C0518i) oVar2.f9065a).l();
                    C0269a b6 = o3.d.b(l6, l6);
                    b6.f(R.id.activity_main_body_frame_layout, dVar2, (String) null, 1);
                    a.j(b6, false);
                    return;
                } else if (!d6.f4301l) {
                    v0.e(oVar2.f9065a, oVar2.getContext().getString(R.string.can_not_sell_arming_item));
                    return;
                } else if (!oVar2.d) {
                    oVar2.d = true;
                    C0505b bVar = new C0505b(oVar2.f9065a, R.layout.dialog_sell_item);
                    TextView textView = (TextView) bVar.findViewById(R.id.dialog_sell_item_total_cost);
                    EditText editText = (EditText) bVar.findViewById(R.id.dialog_sell_item_edit_text);
                    SeekBar seekBar = (SeekBar) bVar.findViewById(R.id.dialog_sell_item_seekbar_view);
                    ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_sell_item_close_button);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_sell_item_ok_button);
                    TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_sell_item_level);
                    ConstraintLayout constraintLayout = (ConstraintLayout) bVar.findViewById(R.id.dialog_sell_item_level_layout);
                    textView.setText(U.a(d6.f4297f / 2));
                    ((ImageView) bVar.findViewById(R.id.dialog_sell_item_image)).setImageResource(d6.d);
                    if (d6.f4298i > 0) {
                        constraintLayout.setVisibility(0);
                        textView2.setText(String.valueOf(d6.f4298i));
                    }
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                    editText.setText("1");
                    seekBar.setProgress((int) ((1.0d / ((double) d6.h)) * 100.0d));
                    seekBar.setOnSeekBarChangeListener(new C0636m(editText, d6, 0));
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
                    C0639o oVar3 = oVar2;
                    EditText editText2 = editText;
                    editText.addTextChangedListener(new C0638n(oVar3, d6, editText2, seekBar, textView, 0));
                    relativeLayout.setOnClickListener(new l(oVar3, relativeLayout, editText2, d6, bVar, 3));
                    imageView.setOnClickListener(new C0632k(oVar2, imageView, bVar, 1));
                    bVar.show();
                    return;
                } else {
                    return;
                }
        }
    }
}
