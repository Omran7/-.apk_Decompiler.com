package j4;

import A4.h;
import K1.e;
import R2.b;
import Y4.C0246c;
import Y4.D;
import Y4.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import f.C0518i;
import java.util.ArrayList;
import o3.d;

public final class L extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8908a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f8909b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0626h f8910c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(C0626h hVar, ViewGroup viewGroup, k kVar, int i2) {
        super(viewGroup);
        this.f8908a = i2;
        this.f8910c = hVar;
        this.f8909b = kVar;
    }

    public final void onClick(View view) {
        C0286s sVar;
        switch (this.f8908a) {
            case 0:
                super.onClick(view);
                k kVar = this.f8909b;
                boolean t6 = a.t(kVar.f4376b);
                C0626h hVar = this.f8910c;
                if (t6) {
                    a.n(MyApplication.f7090a, R.string.can_not_buy_from_your_stall, hVar.f9018b, (String) null);
                    return;
                } else if (o.getMoneyObject().getCash() < kVar.f4384m) {
                    c.x0(hVar.f9018b);
                    return;
                } else if (!hVar.f9019c) {
                    hVar.f9019c = true;
                    C0505b bVar = new C0505b(hVar.f9018b, R.layout.dialog_buy_item);
                    ConstraintLayout constraintLayout = (ConstraintLayout) bVar.findViewById(R.id.dialog_buy_item_main_layout);
                    TextView textView = (TextView) bVar.findViewById(R.id.dialog_buy_item_total_cost);
                    TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_buy_item_description);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) bVar.findViewById(R.id.dialog_buy_item_special_equipment_layout);
                    ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_buy_item_close_button);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_buy_item_buy_button);
                    TextView textView3 = (TextView) bVar.findViewById(R.id.dialog_buy_item_level);
                    SeekBar seekBar = (SeekBar) bVar.findViewById(R.id.dialog_buy_item_seekbar_view);
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) bVar.findViewById(R.id.dialog_buy_item_level_layout);
                    C0505b bVar2 = bVar;
                    int i2 = kVar.f4381j;
                    EditText editText = (EditText) bVar.findViewById(R.id.dialog_buy_item_edit_text);
                    int i5 = kVar.f4383l;
                    LinearLayout linearLayout = (LinearLayout) bVar.findViewById(R.id.dialog_buy_item_cost_layout);
                    D s6 = D.s(i2, kVar.f4382k, i5);
                    TextView textView4 = (TextView) bVar.findViewById(R.id.dialog_buy_item_special_equipment_happiness);
                    GridView gridView = (GridView) bVar.findViewById(R.id.dialog_buy_item_special_equipment_skill_grid_view);
                    s6.f4297f = kVar.f4384m;
                    ((TextView) bVar.findViewById(R.id.dialog_buy_item_name)).setText(s6.f4295c);
                    ((ImageView) bVar.findViewById(R.id.dialog_buy_item_image)).setImageResource(s6.d);
                    textView.setText(U.a(s6.f4297f));
                    ((ImageView) bVar.findViewById(R.id.dialog_buy_item_type_cost_image)).setImageResource(R.drawable.cash_icon);
                    if (s6.f4298i > 0) {
                        constraintLayout3.setVisibility(0);
                        textView3.setText(String.valueOf(s6.f4298i));
                    }
                    if (s6.f4306q) {
                        textView2.setTextSize(14.0f);
                        if (s6.f4308s != -1) {
                            textView2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gun_description, new Object[]{Integer.valueOf(s6.y()), Integer.valueOf(s6.x())}));
                        } else {
                            textView2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.armor_description, new Object[]{Integer.valueOf(s6.z()), Integer.valueOf(s6.A())}));
                        }
                    } else if (s6.f4294b == 15) {
                        constraintLayout2.setVisibility(0);
                        textView4.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_plus_sign, new Object[]{Integer.valueOf(s6.f4314y)}));
                        ArrayList arrayList = new ArrayList();
                        for (int i6 = 0; i6 < s6.f4315z.size(); i6++) {
                            arrayList.add(new C0246c(e.R(((Integer) s6.f4315z.get(i6)).intValue()), ((Integer) s6.f4289A.get(i6)).intValue(), e.M(((Integer) s6.f4315z.get(i6)).intValue())));
                        }
                        constraintLayout.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new M(hVar, constraintLayout, arrayList, gridView, 0));
                    } else {
                        textView2.setText(s6.f4296e);
                    }
                    b.c(linearLayout, 3);
                    EditText editText2 = editText;
                    editText2.setText("1");
                    SeekBar seekBar2 = seekBar;
                    seekBar2.setProgress((int) ((1.0d / ((double) (o.getMoneyObject().getCash() / s6.f4297f))) * 100.0d));
                    long cash = o.getMoneyObject().getCash();
                    int i7 = s6.h;
                    if (cash < ((long) i7) * s6.f4297f) {
                        i7 = (int) (o.getMoneyObject().getCash() / s6.f4297f);
                    }
                    int i8 = i7;
                    seekBar2.setOnSeekBarChangeListener(new N(editText2, i8, 0));
                    C0626h hVar2 = hVar;
                    editText2.addTextChangedListener(new O(hVar, i8, editText2, seekBar2, s6, textView, 0));
                    EditText editText3 = editText2;
                    relativeLayout.setOnClickListener(new P(hVar2, relativeLayout, editText3, s6, kVar, bVar2));
                    ImageView imageView2 = imageView;
                    C0505b bVar3 = bVar2;
                    imageView2.setOnClickListener(new h(hVar2, imageView2, bVar3, 21));
                    bVar3.show();
                    return;
                } else {
                    return;
                }
            default:
                super.onClick(view);
                k kVar2 = this.f8909b;
                boolean t7 = a.t(kVar2.f4376b);
                C0626h hVar3 = this.f8910c;
                if (t7) {
                    sVar = new K4.o(hVar3.f9018b);
                } else {
                    sVar = new K4.k(hVar3.f9018b, kVar2.f4376b);
                }
                I l6 = ((C0518i) view.getContext()).l();
                C0269a b6 = d.b(l6, l6);
                b6.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
                a.j(b6, false);
                return;
        }
    }
}
