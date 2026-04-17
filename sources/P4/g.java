package P4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import d5.o;

public final class g extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f2207d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2208e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f2209f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f2210g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f2211h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f2212i0;

    /* renamed from: j0  reason: collision with root package name */
    public EditText f2213j0;

    /* renamed from: k0  reason: collision with root package name */
    public EditText f2214k0;

    /* renamed from: l0  reason: collision with root package name */
    public EditText f2215l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f2216m0;

    /* renamed from: n0  reason: collision with root package name */
    public RelativeLayout f2217n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f2218o0 = false;

    public g(Context context) {
        this.f2207d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_password, viewGroup, false);
        this.f2208e0 = inflate;
        this.f2209f0 = (TextView) inflate.findViewById(R.id.fragment_change_password_nickname_value);
        this.f2210g0 = (TextView) this.f2208e0.findViewById(R.id.fragment_change_password_username_value);
        this.f2211h0 = (TextView) this.f2208e0.findViewById(R.id.fragment_change_password_email_value);
        this.f2213j0 = (EditText) this.f2208e0.findViewById(R.id.fragment_change_password_old_password);
        this.f2214k0 = (EditText) this.f2208e0.findViewById(R.id.fragment_change_password_new_password);
        this.f2215l0 = (EditText) this.f2208e0.findViewById(R.id.fragment_change_password_confirm_password);
        this.f2216m0 = (RelativeLayout) this.f2208e0.findViewById(R.id.fragment_change_password_change_button);
        this.f2212i0 = (TextView) this.f2208e0.findViewById(R.id.fragment_change_password_reset_button);
        this.f2217n0 = (RelativeLayout) this.f2208e0.findViewById(R.id.fragment_change_password_back_button);
        this.f2209f0.setText(o.getMainStatesObject().getNickName());
        this.f2210g0.setText(o.getAccountObject().getUserName());
        this.f2211h0.setText(o.getAccountObject().getEmail());
        RelativeLayout relativeLayout = this.f2216m0;
        relativeLayout.setOnClickListener(new e(this, relativeLayout, 0));
        TextView textView = this.f2212i0;
        textView.setOnClickListener(new e(this, textView, 1));
        RelativeLayout relativeLayout2 = this.f2217n0;
        relativeLayout2.setOnClickListener(new e(this, relativeLayout2, 2));
        return this.f2208e0;
    }
}
