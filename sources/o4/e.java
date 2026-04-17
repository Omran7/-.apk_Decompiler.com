package o4;

import R2.b;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.fragments.gangBase.n;
import com.mtma.criminal.city.utils.U;
import e5.C0505b;
import i3.C0592h;
import j4.C0623f0;
import java.util.TreeMap;

public final class e extends C0286s {

    /* renamed from: x0  reason: collision with root package name */
    public static final /* synthetic */ int f10452x0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f10453d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f10454e0;

    /* renamed from: f0  reason: collision with root package name */
    public RelativeLayout f10455f0;

    /* renamed from: g0  reason: collision with root package name */
    public RelativeLayout f10456g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f10457h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f10458i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f10459j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f10460k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f10461l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextView f10462m0;

    /* renamed from: n0  reason: collision with root package name */
    public TextView f10463n0;

    /* renamed from: o0  reason: collision with root package name */
    public TextView f10464o0;

    /* renamed from: p0  reason: collision with root package name */
    public TextView f10465p0;

    /* renamed from: q0  reason: collision with root package name */
    public EditText f10466q0;

    /* renamed from: r0  reason: collision with root package name */
    public EditText f10467r0;
    public SeekBar s0;

    /* renamed from: t0  reason: collision with root package name */
    public SeekBar f10468t0;

    /* renamed from: u0  reason: collision with root package name */
    public LinearLayout f10469u0;

    /* renamed from: v0  reason: collision with root package name */
    public LinearLayout f10470v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f10471w0 = false;

    public e(MainActivity mainActivity) {
        this.f10453d0 = mainActivity;
    }

    public static void V(e eVar, int i2, long j6) {
        if (!eVar.f10471w0) {
            eVar.f10471w0 = true;
            C0505b bVar = new C0505b(eVar.f10453d0, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_text);
            TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text);
            LinearLayout linearLayout = (LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            if (i2 == 0) {
                TreeMap treeMap = U.f7378a;
                long ceil = (long) Math.ceil(((double) j6) * (0.05d - (K1.e.S(19) * 0.05d)));
                if (ceil < 0) {
                    ceil = 0;
                }
                textView.setText(eVar.s(R.string.confirm_deposit_cash, U.a(ceil)));
            } else {
                textView.setText(R.string.confirm_withdrawal_cash);
            }
            textView2.setText(R.string.button_ok);
            linearLayout.setVisibility(0);
            relativeLayout.setOnClickListener(new n(eVar, relativeLayout, i2, j6, bVar, 1));
            relativeLayout2.setOnClickListener(new C0623f0(eVar, relativeLayout2, bVar, 15));
            bVar.show();
        }
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bank, viewGroup, false);
        this.f10454e0 = inflate;
        this.f10455f0 = (RelativeLayout) inflate.findViewById(R.id.fragment_bank_loan_button);
        this.f10456g0 = (RelativeLayout) this.f10454e0.findViewById(R.id.fragment_bank_back_button);
        this.f10457h0 = (RelativeLayout) this.f10454e0.findViewById(R.id.fragment_bank_deposit_button);
        this.f10458i0 = (RelativeLayout) this.f10454e0.findViewById(R.id.fragment_bank_withdrawal_button);
        this.f10460k0 = (TextView) this.f10454e0.findViewById(R.id.fragment_bank_cash_inside_bank);
        this.f10459j0 = (TextView) this.f10454e0.findViewById(R.id.fragment_bank_cash_outside_bank);
        this.f10461l0 = (TextView) this.f10454e0.findViewById(R.id.fragment_bank_gold);
        this.f10462m0 = (TextView) this.f10454e0.findViewById(R.id.fragment_bank_check);
        this.f10463n0 = (TextView) this.f10454e0.findViewById(R.id.fragment_bank_deposit_value);
        this.f10464o0 = (TextView) this.f10454e0.findViewById(R.id.fragment_bank_withdrawal_value);
        this.f10465p0 = (TextView) this.f10454e0.findViewById(R.id.fragment_bank_deposit_tax);
        this.f10469u0 = (LinearLayout) this.f10454e0.findViewById(R.id.fragment_bank_deposit_container);
        this.f10470v0 = (LinearLayout) this.f10454e0.findViewById(R.id.fragment_bank_withdrawal_container);
        MainActivity mainActivity = this.f10453d0;
        View inflate2 = LayoutInflater.from(mainActivity).inflate(R.layout.item_seekbar, (ViewGroup) null);
        this.f10466q0 = (EditText) inflate2.findViewById(R.id.item_seekbar_edit_text);
        this.s0 = (SeekBar) inflate2.findViewById(R.id.item_seekbar_seekbar_view);
        this.f10469u0.addView(inflate2);
        View inflate3 = LayoutInflater.from(mainActivity).inflate(R.layout.item_seekbar, (ViewGroup) null);
        this.f10467r0 = (EditText) inflate3.findViewById(R.id.item_seekbar_edit_text);
        this.f10468t0 = (SeekBar) inflate3.findViewById(R.id.item_seekbar_seekbar_view);
        this.f10470v0.addView(inflate3);
        b.w(true);
        a.v(a.c(C0592h.b().e(), "players"), "moneyObject").d(new C0896a(this));
        this.s0.setOnSeekBarChangeListener(new c(this, 0));
        this.f10466q0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(13)});
        this.f10466q0.addTextChangedListener(new d(this, 0));
        this.f10468t0.setOnSeekBarChangeListener(new c(this, 1));
        this.f10467r0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(13)});
        this.f10467r0.addTextChangedListener(new d(this, 1));
        RelativeLayout relativeLayout = this.f10457h0;
        relativeLayout.setOnClickListener(new C0897b(this, relativeLayout, 2));
        RelativeLayout relativeLayout2 = this.f10458i0;
        relativeLayout2.setOnClickListener(new C0897b(this, relativeLayout2, 3));
        RelativeLayout relativeLayout3 = this.f10455f0;
        relativeLayout3.setOnClickListener(new C0897b(this, relativeLayout3, 0));
        RelativeLayout relativeLayout4 = this.f10456g0;
        relativeLayout4.setOnClickListener(new C0897b(this, relativeLayout4, 1));
        return this.f10454e0;
    }
}
