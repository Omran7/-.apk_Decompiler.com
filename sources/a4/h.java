package A4;

import K1.e;
import K4.k;
import K4.m;
import K4.o;
import K4.v;
import P4.d;
import R2.b;
import W4.g;
import Y4.C0244a;
import Y4.C0245b;
import Y4.C0246c;
import Y4.D;
import Y4.l;
import Y4.p;
import Y4.s;
import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
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
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.activities.StartActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0429i;
import com.mtma.criminal.city.fragments.gangBase.y;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.t0;
import com.mtma.criminal.city.utils.v0;
import e5.C0505b;
import e5.C0509f;
import f.C0518i;
import j4.C0612a;
import j4.C0614b;
import j4.C0615b0;
import j4.C0617c0;
import j4.C0621e0;
import j4.C0626h;
import j4.C0630j;
import j4.C0640p;
import j4.G;
import j4.H;
import j4.M;
import j4.N;
import j4.O;
import j4.r;
import java.util.ArrayList;
import v4.C1052a;

public final class h extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f79a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f80b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f81c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, View view, Object obj2, int i2) {
        super(view);
        this.f79a = i2;
        this.f81c = obj;
        this.f80b = obj2;
    }

    public final void onClick(View view) {
        C0286s sVar;
        C0286s sVar2;
        C0286s sVar3;
        C0286s sVar4;
        LinearLayout linearLayout;
        int i2;
        RelativeLayout relativeLayout;
        int i5;
        View view2 = view;
        Object obj = this.f81c;
        Object obj2 = this.f80b;
        switch (this.f79a) {
            case 0:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((j) obj).f106W0 = false;
                return;
            case 1:
                super.onClick(view);
                C0286s sVar5 = (C0286s) obj2;
                o oVar = (o) obj;
                if ((sVar5 instanceof W4.h) || (sVar5 instanceof g)) {
                    if (d5.o.getLocationObject().getCurrentCity() == 0 && d5.o.getLocationObject().getCurrentPlace() == 0) {
                        o.V(oVar, sVar5);
                        return;
                    }
                    a.n(MyApplication.f7090a, R.string.can_not_access_to_office_work_outside_main_city, oVar.f1583d0, (String) null);
                    return;
                } else if (!(sVar5 instanceof y) && !(sVar5 instanceof C0429i)) {
                    o.V(oVar, sVar5);
                    return;
                } else if (d5.o.getLocationObject().getCurrentCity() == 0 && d5.o.getLocationObject().getCurrentPlace() == 0) {
                    o.V(oVar, sVar5);
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.dialog_can_not_access_to_gang_building_outside_main_city, oVar.f1583d0, (String) null);
                    return;
                }
            case 2:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((o) ((m) obj).f1580b).f1597r0 = false;
                return;
            case 3:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((v) obj).f1625N0 = false;
                return;
            case 4:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((d) obj).f2196h0 = false;
                return;
            case 5:
                super.onClick(view);
                g gVar = (g) obj;
                if (gVar.f4113m0) {
                    b.w(true);
                    c.s(false, new K(new I3.h((Object) gVar, (Object) (View) obj2, 28), 16));
                    return;
                }
                gVar.a0(gVar.r(R.string.can_not_get_salary_twice), -1, false);
                return;
            case zzaky.zzf.zzf /*6*/:
                super.onClick(view);
                ((ConstraintLayout) obj2).setVisibility(8);
                int i6 = MainActivity.L0;
                MainActivity mainActivity = (MainActivity) obj;
                mainActivity.getClass();
                new Handler().postDelayed(new com.mtma.criminal.city.activities.a(mainActivity, 0), 1000);
                return;
            case zzaky.zzf.zzg /*7*/:
                super.onClick(view);
                StartActivity startActivity = (StartActivity) obj;
                ((ClipboardManager) startActivity.f7028I.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Beta Version Code", (String) obj2));
                b.M0(R.raw.add_new_item);
                v0.d(startActivity.f7028I, view2, MyApplication.f7090a.getApplicationContext().getString(R.string.invited_code_copied_successfully));
                return;
            case 8:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((com.mtma.criminal.city.fragments.gangBase.o) obj).f7248x0 = false;
                return;
            case 9:
                super.onClick(view);
                e.c(((com.mtma.criminal.city.fragments.gangBase.v) obj).f7285d0, (String) obj2, MyApplication.f7090a.getApplicationContext().getString(R.string.gang_name), MyApplication.f7090a.getApplicationContext().getString(R.string.gang_name_copied_successfully));
                return;
            case 10:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((y) obj).f7335o0 = false;
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                super.onClick(view);
                C0244a aVar = (C0244a) obj2;
                C0614b bVar = (C0614b) obj;
                if (a.t(aVar.f4323a)) {
                    sVar = new o(bVar.f8975b);
                } else {
                    sVar = new k(bVar.f8975b, aVar.f4323a);
                }
                I l6 = ((C0518i) view.getContext()).l();
                C0269a b6 = o3.d.b(l6, l6);
                b6.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
                a.j(b6, false);
                return;
            case 12:
                super.onClick(view);
                C0245b bVar2 = (C0245b) obj2;
                C0626h hVar = (C0626h) obj;
                if (a.t(bVar2.f4328a)) {
                    sVar2 = new o(hVar.f9018b);
                } else {
                    sVar2 = new k(hVar.f9018b, bVar2.f4328a);
                }
                I l7 = ((C0518i) view.getContext()).l();
                C0269a b7 = o3.d.b(l7, l7);
                b7.f(R.id.activity_main_body_frame_layout, sVar2, (String) null, 1);
                a.j(b7, false);
                return;
            case 13:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((C0630j) obj).f9033c = false;
                return;
            case 14:
                super.onClick(view);
                s sVar6 = (s) obj2;
                r rVar = (r) obj;
                if (!sVar6.h) {
                    if (a.t(sVar6.f4422a)) {
                        sVar3 = new o(rVar.f9083b);
                    } else {
                        sVar3 = new k(rVar.f9083b, sVar6.f4422a);
                    }
                    I l8 = ((C0518i) view.getContext()).l();
                    C0269a b8 = o3.d.b(l8, l8);
                    b8.f(R.id.activity_main_body_frame_layout, sVar3, (String) null, 1);
                    a.j(b8, false);
                    return;
                } else if (sVar6.f4422a.equals("@System")) {
                    c.s0(rVar.f9083b, MyApplication.f7090a.getApplicationContext().getString(R.string.message_from, new Object[]{MyApplication.f7090a.getApplicationContext().getString(R.string.system)}), (String) null);
                    return;
                } else if (sVar6.f4422a.equals("@System_Administration")) {
                    c.s0(rVar.f9083b, MyApplication.f7090a.getApplicationContext().getString(R.string.message_from, new Object[]{MyApplication.f7090a.getApplicationContext().getString(R.string.system_administration)}), (String) null);
                    return;
                } else {
                    return;
                }
            case 15:
                super.onClick(view);
                int[] iArr = new int[2];
                view2.getLocationInWindow(iArr);
                D d = (D) obj2;
                v0.a(d, ((C0640p) obj).f9072b, iArr[1]);
                return;
            case 16:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((j4.D) obj).f8859e = false;
                return;
            case 17:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((G) obj).d = false;
                return;
            case 18:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((H) obj).d = false;
                return;
            case 19:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((C0626h) obj).f9019c = false;
                return;
            case 20:
                super.onClick(view);
                I l9 = ((C0518i) view.getContext()).l();
                C0269a b9 = o3.d.b(l9, l9);
                D d6 = (D) obj2;
                b9.f(R.id.activity_main_body_frame_layout, new C1052a(d6.f4294b, d6.f4293a, ((C0614b) obj).f8975b), (String) null, 1);
                a.j(b9, false);
                return;
            case 21:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((C0626h) obj).f9019c = false;
                return;
            case 22:
                super.onClick(view);
                l lVar = (l) obj2;
                C0614b bVar3 = (C0614b) obj;
                if (a.t(lVar.f4385a)) {
                    sVar4 = new o(bVar3.f8975b);
                } else {
                    sVar4 = new k(bVar3.f8975b, lVar.f4385a);
                }
                I l10 = ((C0518i) view.getContext()).l();
                C0269a b10 = o3.d.b(l10, l10);
                b10.f(R.id.activity_main_body_frame_layout, sVar4, (String) null, 1);
                a.j(b10, false);
                return;
            case 23:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((H) obj).d = false;
                return;
            case 24:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((C0615b0) obj).d = false;
                return;
            case 25:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((C0617c0) obj).g = false;
                return;
            case 26:
                super.onClick(view);
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr2);
                D d7 = (D) obj2;
                v0.a(d7, ((C0612a) obj).f8970b, iArr2[1]);
                return;
            case 27:
                super.onClick(view);
                int[] iArr3 = new int[2];
                view2.getLocationOnScreen(iArr3);
                int i7 = iArr3[0];
                int i8 = iArr3[1];
                MainActivity mainActivity2 = ((C0612a) obj).f8970b;
                int i9 = ((p) obj2).f4411a;
                if (!v0.f7482a) {
                    v0.f7482a = true;
                    v0.f7483b.postDelayed(v0.f7484c, 350);
                    View inflate = LayoutInflater.from(mainActivity2).inflate(R.layout.toast_herb_description, (ViewGroup) null, false);
                    ((TextView) inflate.findViewById(R.id.toast_herb_description_text)).setText(i9);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 80);
                    ViewGroup viewGroup = (ViewGroup) mainActivity2.getWindow().getDecorView().getRootView();
                    viewGroup.addView(inflate);
                    layoutParams.bottomMargin = (Resources.getSystem().getDisplayMetrics().heightPixels - i8) - e.m(80.0d);
                    layoutParams.leftMargin = i7 - e.m(80.0d);
                    inflate.setLayoutParams(layoutParams);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(inflate, View.ALPHA, new float[]{0.0f});
                    ofFloat.setRepeatCount(0);
                    ofFloat.setDuration(5000);
                    ofFloat.start();
                    ofFloat.addListener(new t0(viewGroup, inflate, 1));
                    return;
                }
                return;
            case 28:
                super.onClick(view);
                C0621e0 e0Var = (C0621e0) obj;
                int i10 = e0Var.g;
                D d8 = (D) obj2;
                Context context = e0Var.f8999a;
                if (i10 == 0 && d8.f4305p) {
                    int[] iArr4 = new int[2];
                    view2.getLocationInWindow(iArr4);
                    v0.a(d8, context, iArr4[1]);
                    return;
                } else if (i10 != 1) {
                    D d9 = d8;
                    if (i10 == 2 || i10 == 3) {
                        int[] iArr5 = new int[2];
                        view2.getLocationInWindow(iArr5);
                        v0.a(d9, context, iArr5[1]);
                        return;
                    }
                    return;
                } else if (d5.o.getMoneyObject().getCash() < d8.f4297f) {
                    c.x0(context);
                    return;
                } else if (a.t(e0Var.f9001c)) {
                    a.n(MyApplication.f7090a, R.string.can_not_buy_from_your_stall, context, (String) null);
                    return;
                } else if (!e0Var.h) {
                    e0Var.h = true;
                    C0505b bVar4 = new C0505b(context, R.layout.dialog_buy_item);
                    ConstraintLayout constraintLayout = (ConstraintLayout) bVar4.findViewById(R.id.dialog_buy_item_main_layout);
                    TextView textView = (TextView) bVar4.findViewById(R.id.dialog_buy_item_total_cost);
                    TextView textView2 = (TextView) bVar4.findViewById(R.id.dialog_buy_item_description);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) bVar4.findViewById(R.id.dialog_buy_item_special_equipment_layout);
                    TextView textView3 = (TextView) bVar4.findViewById(R.id.dialog_buy_item_special_equipment_happiness);
                    GridView gridView = (GridView) bVar4.findViewById(R.id.dialog_buy_item_special_equipment_skill_grid_view);
                    EditText editText = (EditText) bVar4.findViewById(R.id.dialog_buy_item_edit_text);
                    LinearLayout linearLayout2 = (LinearLayout) bVar4.findViewById(R.id.dialog_buy_item_cost_layout);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar4.findViewById(R.id.dialog_buy_item_buy_button);
                    TextView textView4 = (TextView) bVar4.findViewById(R.id.dialog_buy_item_level);
                    ImageView imageView = (ImageView) bVar4.findViewById(R.id.dialog_buy_item_close_button);
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) bVar4.findViewById(R.id.dialog_buy_item_level_layout);
                    C0505b bVar5 = bVar4;
                    ((TextView) bVar4.findViewById(R.id.dialog_buy_item_name)).setText(d8.f4295c);
                    ((ImageView) bVar4.findViewById(R.id.dialog_buy_item_image)).setImageResource(d8.d);
                    SeekBar seekBar = (SeekBar) bVar4.findViewById(R.id.dialog_buy_item_seekbar_view);
                    textView.setText(U.a(d8.f4297f));
                    ((ImageView) bVar4.findViewById(R.id.dialog_buy_item_type_cost_image)).setImageResource(R.drawable.cash_icon);
                    if (d8.f4298i > 0) {
                        constraintLayout3.setVisibility(0);
                        textView4.setText(String.valueOf(d8.f4298i));
                    }
                    if (d8.f4306q) {
                        textView2.setTextSize(14.0f);
                        if (d8.f4308s != -1) {
                            textView2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gun_description, new Object[]{Integer.valueOf(d8.y()), Integer.valueOf(d8.x())}));
                        } else {
                            textView2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.armor_description, new Object[]{Integer.valueOf(d8.z()), Integer.valueOf(d8.A())}));
                        }
                        linearLayout = linearLayout2;
                        relativeLayout = relativeLayout2;
                        i2 = 3;
                    } else if (d8.f4294b == 15) {
                        constraintLayout2.setVisibility(0);
                        textView3.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_plus_sign, new Object[]{Integer.valueOf(d8.f4314y)}));
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < d8.f4315z.size(); i11++) {
                            arrayList.add(new C0246c(e.R(((Integer) d8.f4315z.get(i11)).intValue()), ((Integer) d8.f4289A.get(i11)).intValue(), e.M(((Integer) d8.f4315z.get(i11)).intValue())));
                        }
                        linearLayout = linearLayout2;
                        i2 = 3;
                        constraintLayout.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new M(e0Var, constraintLayout, arrayList, gridView, 1));
                        relativeLayout = relativeLayout2;
                    } else {
                        linearLayout = linearLayout2;
                        relativeLayout = relativeLayout2;
                        i2 = 3;
                        textView2.setText(d8.f4296e);
                    }
                    b.c(linearLayout, i2);
                    editText.setText("1");
                    seekBar.setProgress((int) ((1.0d / ((double) (d5.o.getMoneyObject().getCash() / d8.f4297f))) * 100.0d));
                    long cash = d5.o.getMoneyObject().getCash();
                    int i12 = d8.h;
                    if (cash < ((long) i12) * d8.f4297f) {
                        i5 = (int) (d5.o.getMoneyObject().getCash() / d8.f4297f);
                    } else {
                        i5 = i12;
                    }
                    seekBar.setOnSeekBarChangeListener(new N(editText, i5, 1));
                    C0621e0 e0Var2 = e0Var;
                    EditText editText2 = editText;
                    editText.addTextChangedListener(new O(e0Var2, i5, editText2, seekBar, d8, textView, 1));
                    relativeLayout.setOnClickListener(new K4.l(e0Var2, relativeLayout, editText2, d8, bVar5, 6));
                    ImageView imageView2 = imageView;
                    C0505b bVar6 = bVar5;
                    imageView2.setOnClickListener(new h(e0Var, imageView2, bVar6, 29));
                    bVar6.show();
                    return;
                } else {
                    return;
                }
            default:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((C0621e0) obj).h = false;
                return;
        }
    }
}
