package P4;

import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import e5.C0504a;

public final class l extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f2248d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2249e0;

    /* renamed from: f0  reason: collision with root package name */
    public EditText f2250f0;

    /* renamed from: g0  reason: collision with root package name */
    public EditText f2251g0;

    /* renamed from: h0  reason: collision with root package name */
    public EditText f2252h0;

    /* renamed from: i0  reason: collision with root package name */
    public EditText f2253i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f2254j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f2255k0;

    public l(Context context) {
        this.f2248d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_save_acccount, viewGroup, false);
        this.f2249e0 = inflate;
        this.f2250f0 = (EditText) inflate.findViewById(R.id.fragment_save_account_email);
        this.f2251g0 = (EditText) this.f2249e0.findViewById(R.id.fragment_save_account_username);
        this.f2252h0 = (EditText) this.f2249e0.findViewById(R.id.fragment_save_account_password);
        this.f2253i0 = (EditText) this.f2249e0.findViewById(R.id.fragment_save_account_confirm_password);
        this.f2254j0 = (RelativeLayout) this.f2249e0.findViewById(R.id.fragment_save_account_save_button);
        this.f2255k0 = (RelativeLayout) this.f2249e0.findViewById(R.id.fragment_save_account_back_button);
        this.f2250f0.setFilters(new InputFilter[]{new C0504a(0)});
        this.f2251g0.setFilters(new InputFilter[]{new C0504a(1)});
        RelativeLayout relativeLayout = this.f2254j0;
        relativeLayout.setOnClickListener(new k(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f2255k0;
        relativeLayout2.setOnClickListener(new k(this, relativeLayout2, 1));
        return this.f2249e0;
    }
}
