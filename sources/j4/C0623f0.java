package j4;

import H4.h;
import K1.e;
import K4.j;
import K4.k;
import K4.l;
import K4.o;
import R2.b;
import Y4.B;
import Y4.D;
import Y4.r;
import Y4.t;
import Y4.u;
import Y4.z;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.emoji2.text.v;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.internal.play_billing.zzbe;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.t0;
import com.mtma.criminal.city.utils.v0;
import e5.C0505b;
import e5.C0509f;
import f.C0518i;
import java.util.ArrayList;
import java.util.HashMap;
import m0.a0;
import o3.d;
import p4.C0923f;
import w0.C1054a;
import w0.C1055b;
import w0.C1059f;
import x4.C1101d;

/* renamed from: j4.f0  reason: case insensitive filesystem */
public final class C0623f0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9007a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9008b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9009c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0623f0(Object obj, View view, Object obj2, int i2) {
        super(view);
        this.f9007a = i2;
        this.f9009c = obj;
        this.f9008b = obj2;
    }

    public final void onClick(View view) {
        C0286s sVar;
        int bagFreeSpace;
        int bagFreeSpace2;
        String str;
        C0286s sVar2;
        C0286s sVar3;
        View view2 = view;
        Object obj = this.f9009c;
        Object obj2 = this.f9008b;
        switch (this.f9007a) {
            case 0:
                super.onClick(view);
                u uVar = (u) obj2;
                C0612a aVar = (C0612a) obj;
                if (a.t(uVar.f4434a)) {
                    sVar = new o(aVar.f8970b);
                } else {
                    sVar = new k(aVar.f8970b, uVar.f4434a);
                }
                I l6 = ((C0518i) view.getContext()).l();
                C0269a b6 = d.b(l6, l6);
                b6.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
                a.j(b6, false);
                return;
            case 1:
                super.onClick(view);
                D d = (D) obj2;
                C0641q qVar = (C0641q) obj;
                if (d.f4302m) {
                    d.f4302m = false;
                    qVar.f9078c--;
                    b.M0(R.raw.unlock_item);
                } else if (qVar.f9078c < d5.o.getStockObject().getLockerSpace()) {
                    d.f4302m = true;
                    qVar.f9078c++;
                    b.M0(R.raw.lock_item);
                } else {
                    v0.e(qVar.f9077b, qVar.getContext().getString(R.string.toast_reach_to_maximum_value));
                }
                qVar.notifyDataSetChanged();
                return;
            case 2:
                super.onClick(view);
                if (d5.o.getLocationObject().getCurrentCity() == 0) {
                    bagFreeSpace = d5.o.getStockObject().getStockFreeSpace();
                } else {
                    bagFreeSpace = d5.o.getStockObject().getBagFreeSpace();
                }
                long j6 = (long) bagFreeSpace;
                D d6 = (D) obj2;
                C0626h hVar = (C0626h) obj;
                if (d6.h == 0) {
                    a.n(MyApplication.f7090a, R.string.no_item_available, hVar.f9018b, (String) null);
                    return;
                } else if (d6.f4297f > d5.o.getMoneyObject().getCash()) {
                    a.n(MyApplication.f7090a, R.string.you_do_not_have_enough_money, hVar.f9018b, (String) null);
                    return;
                } else if (j6 < 1) {
                    if (d5.o.getLocationObject().getCurrentCity() == 0) {
                        a.n(MyApplication.f7090a, R.string.no_free_space_in_stock, hVar.f9018b, (String) null);
                        return;
                    }
                    a.n(MyApplication.f7090a, R.string.no_free_space_in_bag, hVar.f9018b, (String) null);
                    return;
                } else if (!hVar.f9019c) {
                    hVar.f9019c = true;
                    C0505b bVar = new C0505b(hVar.f9018b, R.layout.dialog_buy_item);
                    TextView textView = (TextView) bVar.findViewById(R.id.dialog_buy_item_total_cost);
                    TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_buy_item_description);
                    EditText editText = (EditText) bVar.findViewById(R.id.dialog_buy_item_edit_text);
                    SeekBar seekBar = (SeekBar) bVar.findViewById(R.id.dialog_buy_item_seekbar_view);
                    ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_buy_item_close_button);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_buy_item_buy_button);
                    ((ImageView) bVar.findViewById(R.id.dialog_buy_item_type_cost_image)).setImageResource(R.drawable.cash_icon);
                    textView.setText(U.a(d6.f4297f));
                    ((TextView) bVar.findViewById(R.id.dialog_buy_item_name)).setText(d6.f4295c);
                    ((ImageView) bVar.findViewById(R.id.dialog_buy_item_image)).setImageResource(d6.d);
                    editText.setText("1");
                    if (d6.f4306q) {
                        textView2.setTextSize(14.0f);
                        if (d6.f4308s != -1) {
                            textView2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gun_description, new Object[]{Integer.valueOf(d6.y()), Integer.valueOf(d6.x())}));
                        } else {
                            textView2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.armor_description, new Object[]{Integer.valueOf(d6.z()), Integer.valueOf(d6.A())}));
                        }
                    } else {
                        textView2.setText(d6.f4296e);
                    }
                    if (d5.o.getLocationObject().getCurrentCity() == 0) {
                        bagFreeSpace2 = d5.o.getStockObject().getStockFreeSpace();
                    } else {
                        bagFreeSpace2 = d5.o.getStockObject().getBagFreeSpace();
                    }
                    long j7 = (long) bagFreeSpace2;
                    seekBar.setOnSeekBarChangeListener(new C0627h0(editText, j7, d6));
                    editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
                    ImageView imageView2 = imageView;
                    SeekBar seekBar2 = seekBar;
                    C0626h hVar2 = hVar;
                    EditText editText2 = editText;
                    editText.addTextChangedListener(new C0629i0(hVar2, d6, editText2, seekBar2, j7, textView));
                    relativeLayout.setOnClickListener(new l(hVar2, relativeLayout, editText2, d6, bVar, 7));
                    imageView2.setOnClickListener(new C0623f0(hVar, imageView2, bVar, 3));
                    bVar.show();
                    return;
                } else {
                    return;
                }
            case 3:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((C0626h) obj).f9019c = false;
                return;
            case 4:
                super.onClick(view);
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                int i2 = iArr[0];
                int i5 = iArr[1];
                r rVar = (r) obj2;
                int i6 = rVar.f4419c;
                ArrayList arrayList = Q.f7375a;
                if (i6 == 1) {
                    str = MyApplication.f7090a.getApplicationContext().getString(rVar.f4420e);
                } else {
                    str = MyApplication.f7090a.getApplicationContext().getString(rVar.f4420e, new Object[]{Integer.valueOf(rVar.f4419c)});
                }
                Context context = ((C0614b) obj).f8975b;
                int height = view.getHeight();
                if (!v0.f7482a) {
                    v0.f7482a = true;
                    v0.f7483b.postDelayed(v0.f7484c, 350);
                    View inflate = LayoutInflater.from(context).inflate(R.layout.toast_medal_description, (ViewGroup) null, false);
                    ((TextView) inflate.findViewById(R.id.toast_medal_description_text)).setText(str);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 80);
                    layoutParams.bottomMargin = (Resources.getSystem().getDisplayMetrics().heightPixels - i5) + height;
                    layoutParams.leftMargin = i2 - e.m(27.0d);
                    inflate.setLayoutParams(layoutParams);
                    ViewGroup viewGroup = (ViewGroup) ((C0518i) context).getWindow().getDecorView().getRootView();
                    viewGroup.addView(inflate);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(inflate, View.ALPHA, new float[]{0.0f});
                    ofFloat.setRepeatCount(0);
                    ofFloat.setDuration(3000);
                    ofFloat.start();
                    ofFloat.addListener(new t0(viewGroup, inflate, 3));
                    return;
                }
                return;
            case 5:
                super.onClick(view);
                G g = (G) obj;
                int i7 = g.f8876c;
                t tVar = (t) obj2;
                Context context2 = g.f8875b;
                if (i7 == 2) {
                    if (tVar.f4429a > d5.o.getMoneyObject().getGold()) {
                        c.y0(context2);
                        return;
                    }
                    int i8 = tVar.f4429a;
                    if (!g.d) {
                        g.d = true;
                        C0505b bVar2 = new C0505b(context2, R.layout.dialog_ok_cancle);
                        RelativeLayout relativeLayout2 = (RelativeLayout) bVar2.findViewById(R.id.dialog_ok_cancel_confirm_button);
                        RelativeLayout relativeLayout3 = (RelativeLayout) bVar2.findViewById(R.id.dialog_ok_cancel_cancel_button);
                        ((TextView) bVar2.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.confirm_buy_cash);
                        ((TextView) bVar2.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                        ((LinearLayout) bVar2.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                        relativeLayout2.setOnClickListener(new j((ArrayAdapter) g, relativeLayout2, (Object) bVar2, i8, 10));
                        relativeLayout3.setOnClickListener(new C0623f0(g, relativeLayout3, bVar2, 6));
                        bVar2.show();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    C1059f fVar = (C1059f) ((HashMap) g.f8878f).get(tVar.f4432e);
                    if (fVar != null) {
                        b.w(true);
                        ArrayList arrayList2 = new ArrayList();
                        a0 a0Var = new a0(18);
                        a0Var.f9925b = fVar;
                        if (fVar.a() != null) {
                            fVar.a().getClass();
                            String str2 = fVar.a().f12361b;
                            if (str2 != null) {
                                a0Var.f9926c = str2;
                            }
                        }
                        zzbe.zzc((C1059f) a0Var.f9925b, "ProductDetails is required for constructing ProductDetailsParams.");
                        if (((C1059f) a0Var.f9925b).h != null) {
                            zzbe.zzc((String) a0Var.f9926c, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                        }
                        arrayList2.add(new C1055b(a0Var));
                        a0 a0Var2 = new a0(17);
                        a0Var2.f9925b = new v(27);
                        a0Var2.f9926c = new ArrayList(arrayList2);
                        ((C1054a) g.f8877e).c((Activity) g.getContext(), a0Var2.e());
                        return;
                    }
                    c.s0(context2, MyApplication.f7090a.getApplicationContext().getString(R.string.purchase_not_available_at_the_moment), (String) null);
                    return;
                } else {
                    C1059f fVar2 = (C1059f) ((HashMap) g.f8878f).get(tVar.f4432e);
                    if (fVar2 != null) {
                        b.w(true);
                        ArrayList arrayList3 = new ArrayList();
                        a0 a0Var3 = new a0(18);
                        a0Var3.f9925b = fVar2;
                        if (fVar2.a() != null) {
                            fVar2.a().getClass();
                            String str3 = fVar2.a().f12361b;
                            if (str3 != null) {
                                a0Var3.f9926c = str3;
                            }
                        }
                        zzbe.zzc((C1059f) a0Var3.f9925b, "ProductDetails is required for constructing ProductDetailsParams.");
                        if (((C1059f) a0Var3.f9925b).h != null) {
                            zzbe.zzc((String) a0Var3.f9926c, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                        }
                        arrayList3.add(new C1055b(a0Var3));
                        a0 a0Var4 = new a0(17);
                        a0Var4.f9925b = new v(27);
                        a0Var4.f9926c = new ArrayList(arrayList3);
                        ((C1054a) g.f8877e).c((Activity) g.getContext(), a0Var4.e());
                        return;
                    }
                    c.s0(context2, MyApplication.f7090a.getApplicationContext().getString(R.string.purchase_not_available_at_the_moment), (String) null);
                    return;
                }
            case zzaky.zzf.zzf:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((G) obj).d = false;
                return;
            case zzaky.zzf.zzg:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((C0637m0) obj).f9054c = false;
                return;
            case 8:
                super.onClick(view);
                h hVar3 = new h(((C0626h) obj).f9018b, ((b5.l) obj2).getPlayerId());
                I l7 = ((C0518i) view.getContext()).l();
                C0269a b7 = d.b(l7, l7);
                b7.f(R.id.activity_main_body_frame_layout, hVar3, (String) null, 1);
                a.j(b7, false);
                return;
            case 9:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((C0626h) obj).f9019c = false;
                return;
            case 10:
                super.onClick(view);
                n0 n0Var = (n0) obj;
                int i9 = n0Var.f9062c;
                z zVar = (z) obj2;
                Context context3 = n0Var.f9060a;
                if (i9 == 3) {
                    sVar2 = new com.mtma.criminal.city.fragments.gangBase.v(context3, zVar.f4451a);
                } else if (a.t(zVar.f4451a)) {
                    sVar2 = new o(context3);
                } else {
                    sVar2 = new k(context3, zVar.f4451a);
                }
                I l8 = ((C0518i) view.getContext()).l();
                C0269a b8 = d.b(l8, l8);
                b8.f(R.id.activity_main_body_frame_layout, sVar2, (String) null, 1);
                a.j(b8, false);
                return;
            case ModuleDescriptor.MODULE_VERSION:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((C0615b0) obj).d = false;
                return;
            case 12:
                super.onClick(view);
                B b9 = (B) obj2;
                C0614b bVar3 = (C0614b) obj;
                if (a.t(b9.f4279a)) {
                    sVar3 = new o(bVar3.f8975b);
                } else {
                    sVar3 = new k(bVar3.f8975b, b9.f4279a);
                }
                I l9 = ((C0518i) view.getContext()).l();
                C0269a b10 = d.b(l9, l9);
                b10.f(R.id.activity_main_body_frame_layout, sVar3, (String) null, 1);
                a.j(b10, false);
                return;
            case 13:
                super.onClick(view);
                int[] iArr2 = new int[2];
                view2.getLocationInWindow(iArr2);
                v0.a((D) obj2, ((Z) obj).f8965b, iArr2[1]);
                return;
            case 14:
                super.onClick(view);
                M0 m02 = (M0) obj;
                int i10 = m02.g;
                D d7 = (D) obj2;
                if ((i10 == 0 && d7.f4305p) || i10 == 1 || ((i10 == 2 && d7.f4293a != -1) || i10 == 3)) {
                    int[] iArr3 = new int[2];
                    view2.getLocationInWindow(iArr3);
                    v0.a(d7, m02.f8919a, iArr3[1]);
                    return;
                }
                return;
            case 15:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((o4.e) obj).f10471w0 = false;
                return;
            case 16:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((C0923f) obj).f11032x0 = false;
                return;
            default:
                super.onClick(view);
                ((C0505b) obj2).dismiss();
                ((C1101d) obj).f12576q0 = false;
                return;
        }
    }
}
