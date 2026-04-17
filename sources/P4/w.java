package P4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.utils.U;
import d5.o;
import e5.C0505b;

public final class w extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f2290d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2291e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f2292f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f2293g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f2294h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f2295i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f2296j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f2297k0;

    /* renamed from: l0  reason: collision with root package name */
    public ImageView f2298l0;

    /* renamed from: m0  reason: collision with root package name */
    public ImageView f2299m0;

    /* renamed from: n0  reason: collision with root package name */
    public ImageView f2300n0;

    /* renamed from: o0  reason: collision with root package name */
    public EditText f2301o0;

    /* renamed from: p0  reason: collision with root package name */
    public EditText f2302p0;

    /* renamed from: q0  reason: collision with root package name */
    public RelativeLayout f2303q0;

    /* renamed from: r0  reason: collision with root package name */
    public RelativeLayout f2304r0;
    public RelativeLayout s0;

    /* renamed from: t0  reason: collision with root package name */
    public LinearLayout f2305t0;

    /* renamed from: u0  reason: collision with root package name */
    public ConstraintLayout f2306u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f2307v0 = false;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f2308w0 = false;

    public w(Context context) {
        this.f2290d0 = context;
    }

    public static void V(w wVar) {
        if (!wVar.f2308w0) {
            wVar.f2308w0 = true;
            C0505b bVar = new C0505b(wVar.f2290d0, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_text);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_title)).setText(R.string.button_verify);
            textView.setText(R.string.verify_email_note);
            textView.setGravity(6);
            relativeLayout.setOnClickListener(new t(wVar, relativeLayout, bVar, 3));
            relativeLayout2.setOnClickListener(new t(wVar, relativeLayout2, bVar, 0));
            bVar.show();
        }
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_verify_email, viewGroup, false);
        this.f2291e0 = inflate;
        this.f2292f0 = (TextView) inflate.findViewById(R.id.fragment_verify_email_nickname_value);
        this.f2293g0 = (TextView) this.f2291e0.findViewById(R.id.fragment_verify_email_username_value);
        this.f2294h0 = (TextView) this.f2291e0.findViewById(R.id.fragment_verify_email_email_value);
        this.f2301o0 = (EditText) this.f2291e0.findViewById(R.id.fragment_verify_email_new_email);
        this.f2302p0 = (EditText) this.f2291e0.findViewById(R.id.fragment_verify_email_password);
        this.f2303q0 = (RelativeLayout) this.f2291e0.findViewById(R.id.fragment_verify_email_change_button);
        this.f2298l0 = (ImageView) this.f2291e0.findViewById(R.id.fragment_verify_email_change_button_image);
        this.f2295i0 = (TextView) this.f2291e0.findViewById(R.id.fragment_verify_email_reset_button);
        this.f2304r0 = (RelativeLayout) this.f2291e0.findViewById(R.id.fragment_verify_email_verify_button);
        this.f2299m0 = (ImageView) this.f2291e0.findViewById(R.id.fragment_verify_email_verify_button_image);
        this.f2305t0 = (LinearLayout) this.f2291e0.findViewById(R.id.fragment_verify_email_reward_layout);
        this.f2296j0 = (TextView) this.f2291e0.findViewById(R.id.fragment_verify_email_reward_title);
        this.f2297k0 = (TextView) this.f2291e0.findViewById(R.id.fragment_verify_email_check_value);
        this.f2300n0 = (ImageView) this.f2291e0.findViewById(R.id.fragment_verify_email_verify_button_alert);
        this.s0 = (RelativeLayout) this.f2291e0.findViewById(R.id.fragment_verify_email_back_button);
        this.f2306u0 = (ConstraintLayout) this.f2291e0.findViewById(R.id.fragment_verify_email_note_layout);
        W();
        RelativeLayout relativeLayout = this.f2303q0;
        relativeLayout.setOnClickListener(new v(this, relativeLayout, 1));
        TextView textView = this.f2295i0;
        textView.setOnClickListener(new v(this, textView, 2));
        RelativeLayout relativeLayout2 = this.f2304r0;
        relativeLayout2.setOnClickListener(new v(this, relativeLayout2, 3));
        RelativeLayout relativeLayout3 = this.s0;
        relativeLayout3.setOnClickListener(new v(this, relativeLayout3, 0));
        return this.f2291e0;
    }

    public final void W() {
        this.f2292f0.setText(o.getMainStatesObject().getNickName());
        this.f2293g0.setText(o.getAccountObject().getUserName());
        this.f2294h0.setText(o.getAccountObject().getEmail());
        if (o.getAccountObject().isCanChangeEmail()) {
            this.f2298l0.setImageResource(R.drawable.button_blue);
            this.f2295i0.setVisibility(0);
        } else {
            this.f2298l0.setImageResource(R.drawable.button_gray);
            this.f2295i0.setVisibility(8);
        }
        if (o.getAccountObject().isEmailVerified()) {
            this.f2299m0.setImageResource(R.drawable.button_verify_gray);
            this.f2300n0.setVisibility(8);
            this.f2306u0.setVisibility(8);
        } else {
            this.f2299m0.setImageResource(R.drawable.button_verify);
            this.f2300n0.setVisibility(0);
            this.f2306u0.setVisibility(0);
        }
        if (o.getAccountObject().isGotVerifiedReward()) {
            if (o.getAccountObject().isEmailVerified()) {
                this.f2296j0.setText(R.string.email_verified);
            } else {
                this.f2296j0.setText(R.string.email_not_verified);
            }
            this.f2305t0.setVisibility(8);
            return;
        }
        this.f2305t0.setVisibility(0);
        this.f2296j0.setText(R.string.verify_email_statement);
        this.f2297k0.setText(U.a(5000));
    }
}
