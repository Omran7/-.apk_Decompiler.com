package j4;

import R2.b;
import R4.d;
import Y4.D;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class y0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9132a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f9133b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ A0 f9134c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(A0 a02, ViewGroup viewGroup, D d, int i2) {
        super(viewGroup);
        this.f9132a = i2;
        this.f9134c = a02;
        this.f9133b = d;
    }

    public final void onClick(View view) {
        switch (this.f9132a) {
            case 0:
                super.onClick(view);
                A0 a02 = this.f9134c;
                int i2 = a02.f8840b;
                D d = this.f9133b;
                if (i2 != 2 || !d.equals(D.a())) {
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    v0.a(d, a02.f8839a, iArr[1]);
                    return;
                }
                A0.a(a02);
                return;
            default:
                super.onClick(view);
                D d6 = this.f9133b;
                boolean z3 = d6.f4302m;
                A0 a03 = this.f9134c;
                if (z3) {
                    d dVar = new d(a03.f8839a);
                    I l6 = ((C0518i) a03.f8839a).l();
                    C0269a b6 = o3.d.b(l6, l6);
                    b6.f(R.id.activity_main_body_frame_layout, dVar, (String) null, 1);
                    a.j(b6, false);
                    return;
                } else if (d6.f4301l) {
                    if (d6.f4294b == 9) {
                        if (!a03.d) {
                            a03.d = true;
                            C0505b bVar = new C0505b(a03.f8839a, R.layout.dialog_sell_specialties);
                            EditText editText = (EditText) bVar.findViewById(R.id.dialog_sell_specialties_edit_text);
                            SeekBar seekBar = (SeekBar) bVar.findViewById(R.id.dialog_sell_specialties_seekbar_view);
                            TextView textView = (TextView) bVar.findViewById(R.id.dialog_sell_specialties_original_cost);
                            TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_sell_specialties_real_cost);
                            ((ImageView) bVar.findViewById(R.id.dialog_sell_specialties_image)).setImageResource(d6.d);
                            textView.setText(U.a(d6.f4297f));
                            textView2.setText(U.a(d6.g));
                            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                            editText.setText("1");
                            seekBar.setProgress((int) ((1.0d / ((double) d6.h)) * 100.0d));
                            seekBar.setOnSeekBarChangeListener(new C0636m(editText, d6, 3));
                            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
                            EditText editText2 = editText;
                            A0 a04 = a03;
                            ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_sell_specialties_close_button);
                            EditText editText3 = editText2;
                            TextView textView3 = textView2;
                            SeekBar seekBar2 = seekBar;
                            TextView textView4 = textView;
                            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_sell_specialties_sell_button);
                            editText2.addTextChangedListener(new z0(a04, d6, editText3, seekBar2, textView4, textView3));
                            relativeLayout.setOnClickListener(new u0(a04, relativeLayout, editText3, d6, bVar, 0));
                            imageView.setOnClickListener(new v0(a03, imageView, bVar, 0));
                            bVar.show();
                            return;
                        }
                        return;
                    } else if (!a03.d) {
                        a03.d = true;
                        C0505b bVar2 = new C0505b(a03.f8839a, R.layout.dialog_sell_item);
                        TextView textView5 = (TextView) bVar2.findViewById(R.id.dialog_sell_item_total_cost);
                        ImageView imageView2 = (ImageView) bVar2.findViewById(R.id.dialog_sell_item_image);
                        ConstraintLayout constraintLayout = (ConstraintLayout) bVar2.findViewById(R.id.dialog_sell_item_level_layout);
                        TextView textView6 = (TextView) bVar2.findViewById(R.id.dialog_sell_item_level);
                        EditText editText4 = (EditText) bVar2.findViewById(R.id.dialog_sell_item_edit_text);
                        SeekBar seekBar3 = (SeekBar) bVar2.findViewById(R.id.dialog_sell_item_seekbar_view);
                        ImageView imageView3 = (ImageView) bVar2.findViewById(R.id.dialog_sell_item_close_button);
                        RelativeLayout relativeLayout2 = (RelativeLayout) bVar2.findViewById(R.id.dialog_sell_item_ok_button);
                        b.c((LinearLayout) bVar2.findViewById(R.id.dialog_sell_item_cost_layout), 3);
                        if (d6.f4298i > 0) {
                            constraintLayout.setVisibility(0);
                            textView6.setText(String.valueOf(d6.f4298i));
                        }
                        textView5.setText(U.a(d6.f4297f / 2));
                        imageView2.setImageResource(d6.d);
                        RelativeLayout relativeLayout3 = relativeLayout2;
                        editText4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                        editText4.setText("1");
                        seekBar3.setProgress((int) ((1.0d / ((double) d6.h)) * 100.0d));
                        seekBar3.setOnSeekBarChangeListener(new C0636m(editText4, d6, 2));
                        editText4.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
                        A0 a05 = a03;
                        ImageView imageView4 = imageView3;
                        EditText editText5 = editText4;
                        editText5.addTextChangedListener(new C0638n(a05, d6, editText4, seekBar3, textView5, 1));
                        relativeLayout3.setOnClickListener(new u0(a05, relativeLayout3, editText5, d6, bVar2, 2));
                        imageView4.setOnClickListener(new v0(a03, imageView4, bVar2, 3));
                        bVar2.show();
                        return;
                    } else {
                        return;
                    }
                } else if (d6.f4304o) {
                    a.k(MyApplication.f7090a, R.string.already_used_in_arming, a03.f8839a);
                    return;
                } else {
                    v0.e(a03.f8839a, a03.getContext().getString(R.string.can_not_sell_item));
                    return;
                }
        }
    }
}
