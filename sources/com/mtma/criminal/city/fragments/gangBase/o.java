package com.mtma.criminal.city.fragments.gangBase;

import A4.h;
import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import e5.C0505b;

public final class o extends C0286s {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f7228y0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7229d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f7230e0 = d5.o.getGangObject().getPosition();

    /* renamed from: f0  reason: collision with root package name */
    public View f7231f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f7232g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f7233h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f7234i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f7235j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f7236k0;

    /* renamed from: l0  reason: collision with root package name */
    public EditText f7237l0;

    /* renamed from: m0  reason: collision with root package name */
    public EditText f7238m0;

    /* renamed from: n0  reason: collision with root package name */
    public EditText f7239n0;

    /* renamed from: o0  reason: collision with root package name */
    public SeekBar f7240o0;

    /* renamed from: p0  reason: collision with root package name */
    public SeekBar f7241p0;

    /* renamed from: q0  reason: collision with root package name */
    public SeekBar f7242q0;

    /* renamed from: r0  reason: collision with root package name */
    public RelativeLayout f7243r0;
    public RelativeLayout s0;

    /* renamed from: t0  reason: collision with root package name */
    public RelativeLayout f7244t0;

    /* renamed from: u0  reason: collision with root package name */
    public RelativeLayout f7245u0;

    /* renamed from: v0  reason: collision with root package name */
    public Long f7246v0;

    /* renamed from: w0  reason: collision with root package name */
    public Long f7247w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f7248x0 = false;

    public o(Context context, long j6, long j7) {
        this.f7229d0 = context;
        this.f7246v0 = Long.valueOf(j6);
        this.f7247w0 = Long.valueOf(j7);
    }

    public static void V(o oVar, int i2, long j6) {
        if (!oVar.f7248x0) {
            oVar.f7248x0 = true;
            C0505b bVar = new C0505b(oVar.f7229d0, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_text);
            TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text);
            LinearLayout linearLayout = (LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            if (i2 == 0) {
                a.o(MyApplication.f7090a, R.string.dialog_confirm_gang_deposit_cash, textView);
            } else if (i2 == 1) {
                a.o(MyApplication.f7090a, R.string.dialog_confirm_gang_deposit_gold, textView);
            } else if (i2 == 2) {
                a.o(MyApplication.f7090a, R.string.dialog_confirm_gang_withdrawal_cash, textView);
            }
            textView2.setText(R.string.button_ok);
            linearLayout.setVisibility(0);
            relativeLayout.setOnClickListener(new n(oVar, relativeLayout, i2, j6, bVar, 0));
            relativeLayout2.setOnClickListener(new h(oVar, relativeLayout2, bVar, 8));
            bVar.show();
        }
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gang_donate, viewGroup, false);
        this.f7231f0 = inflate;
        this.f7232g0 = (TextView) inflate.findViewById(R.id.fragment_gang_donate_current_cash);
        this.f7233h0 = (TextView) this.f7231f0.findViewById(R.id.fragment_gang_donate_current_gold);
        this.f7243r0 = (RelativeLayout) this.f7231f0.findViewById(R.id.fragment_gang_donate_deposit_cash_button);
        this.s0 = (RelativeLayout) this.f7231f0.findViewById(R.id.fragment_gang_donate_deposit_gold_button);
        this.f7234i0 = (TextView) this.f7231f0.findViewById(R.id.fragment_gang_donate_deposit_cash_value);
        this.f7235j0 = (TextView) this.f7231f0.findViewById(R.id.fragment_gang_donate_deposit_gold_value);
        this.f7237l0 = (EditText) this.f7231f0.findViewById(R.id.fragment_gang_donate_deposit_cash_edit_text);
        this.f7240o0 = (SeekBar) this.f7231f0.findViewById(R.id.fragment_gang_donate_deposit_cash_seekbar);
        this.f7238m0 = (EditText) this.f7231f0.findViewById(R.id.fragment_gang_donate_deposit_gold_edit_text);
        this.f7241p0 = (SeekBar) this.f7231f0.findViewById(R.id.fragment_gang_donate_deposit_gold_seekbar);
        this.f7245u0 = (RelativeLayout) this.f7231f0.findViewById(R.id.fragment_gang_donate_back_button);
        if (d5.o.getGangObject().getPosition() == 0) {
            ((ConstraintLayout) this.f7231f0.findViewById(R.id.fragment_gang_donate_withdrawal_layout)).setVisibility(0);
            this.f7236k0 = (TextView) this.f7231f0.findViewById(R.id.fragment_gang_donate_withdrawal_cash_value);
            this.f7239n0 = (EditText) this.f7231f0.findViewById(R.id.fragment_gang_donate_withdrawal_cash_edit_text);
            this.f7242q0 = (SeekBar) this.f7231f0.findViewById(R.id.fragment_gang_donate_withdrawal_cash_seekbar);
            this.f7244t0 = (RelativeLayout) this.f7231f0.findViewById(R.id.fragment_gang_donate_withdrawal_cash_button);
            this.f7242q0.setOnSeekBarChangeListener(new l(this, 2));
            this.f7239n0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(13)});
            this.f7239n0.addTextChangedListener(new m(this, 2));
            RelativeLayout relativeLayout = this.f7244t0;
            relativeLayout.setOnClickListener(new C0430j(this, relativeLayout, 1));
        }
        this.f7232g0.setText(U.a(this.f7246v0.longValue()));
        this.f7233h0.setText(U.a(this.f7247w0.longValue()));
        this.f7240o0.setOnSeekBarChangeListener(new l(this, 0));
        this.f7237l0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(13)});
        this.f7237l0.addTextChangedListener(new m(this, 0));
        this.f7241p0.setOnSeekBarChangeListener(new l(this, 1));
        this.f7238m0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        this.f7238m0.addTextChangedListener(new m(this, 1));
        RelativeLayout relativeLayout2 = this.f7243r0;
        relativeLayout2.setOnClickListener(new C0430j(this, relativeLayout2, 3));
        RelativeLayout relativeLayout3 = this.s0;
        relativeLayout3.setOnClickListener(new C0430j(this, relativeLayout3, 0));
        RelativeLayout relativeLayout4 = this.f7245u0;
        relativeLayout4.setOnClickListener(new C0430j(this, relativeLayout4, 2));
        return this.f7231f0;
    }
}
