package X4;

import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.StartActivity;

public final class h extends C0286s {

    /* renamed from: t0  reason: collision with root package name */
    public static final /* synthetic */ int f4217t0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final StartActivity f4218d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f4219e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f4220f0;

    /* renamed from: g0  reason: collision with root package name */
    public EditText f4221g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f4222h0;

    /* renamed from: i0  reason: collision with root package name */
    public CheckBox f4223i0;

    /* renamed from: j0  reason: collision with root package name */
    public CheckBox f4224j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f4225k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f4226l0;

    /* renamed from: m0  reason: collision with root package name */
    public CheckBox f4227m0;

    /* renamed from: n0  reason: collision with root package name */
    public RelativeLayout f4228n0;

    /* renamed from: o0  reason: collision with root package name */
    public ImageView f4229o0;

    /* renamed from: p0  reason: collision with root package name */
    public LinearLayout f4230p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f4231q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public String f4232r0 = "";
    public int s0 = -1;

    public h(StartActivity startActivity, int i2) {
        this.f4218d0 = startActivity;
        this.f4219e0 = i2;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_sign_up, viewGroup, false);
        this.f4220f0 = inflate;
        this.f4221g0 = (EditText) inflate.findViewById(R.id.fragment_sign_up_nick_name);
        this.f4222h0 = (TextView) this.f4220f0.findViewById(R.id.fragment_sign_up_gender_text_view);
        this.f4223i0 = (CheckBox) this.f4220f0.findViewById(R.id.fragment_sign_up_gender_male_check_box);
        this.f4224j0 = (CheckBox) this.f4220f0.findViewById(R.id.fragment_sign_up_gender_female_check_box);
        this.f4225k0 = (TextView) this.f4220f0.findViewById(R.id.fragment_sign_up_privacy_policy_text_button);
        this.f4226l0 = (TextView) this.f4220f0.findViewById(R.id.fragment_sign_up_terms_of_service_text_button);
        this.f4227m0 = (CheckBox) this.f4220f0.findViewById(R.id.fragment_sign_up_privacy_accept_checkBox);
        this.f4228n0 = (RelativeLayout) this.f4220f0.findViewById(R.id.fragment_sign_up_sign_up_button);
        this.f4230p0 = (LinearLayout) this.f4220f0.findViewById(R.id.fragment_sign_up_progress_bar);
        this.f4229o0 = (ImageView) this.f4220f0.findViewById(R.id.fragment_sign_up_close_button);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f4218d0, R.anim.from_top_to_position);
        loadAnimation.setDuration(750);
        this.f4220f0.setAnimation(loadAnimation);
        this.f4221g0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(12)});
        this.f4223i0.setOnCheckedChangeListener(new f(this, 0));
        this.f4224j0.setOnCheckedChangeListener(new f(this, 1));
        this.f4227m0.setOnCheckedChangeListener(new f(this, 2));
        RelativeLayout relativeLayout = this.f4228n0;
        relativeLayout.setOnClickListener(new g(this, relativeLayout, 0));
        TextView textView = this.f4225k0;
        textView.setOnClickListener(new g(this, textView, 1));
        TextView textView2 = this.f4226l0;
        textView2.setOnClickListener(new g(this, textView2, 2));
        ImageView imageView = this.f4229o0;
        imageView.setOnClickListener(new g(this, imageView, 3));
        return this.f4220f0;
    }
}
