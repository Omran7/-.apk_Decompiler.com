package X4;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.StartActivity;
import com.mtma.criminal.city.app.MyApplication;

public final class j extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final StartActivity f4235d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f4236e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f4237f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f4238g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f4239h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f4240i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f4241j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f4242k0;

    public j(StartActivity startActivity) {
        this.f4235d0 = startActivity;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_welcome, viewGroup, false);
        this.f4236e0 = inflate;
        this.f4237f0 = (TextView) inflate.findViewById(R.id.fragment_welcome_server_name);
        this.f4238g0 = (TextView) this.f4236e0.findViewById(R.id.fragment_welcome_server_number);
        this.f4239h0 = (RelativeLayout) this.f4236e0.findViewById(R.id.fragment_welcome_start_button);
        this.f4240i0 = (RelativeLayout) this.f4236e0.findViewById(R.id.fragment_welcome_login_button);
        this.f4241j0 = (RelativeLayout) this.f4236e0.findViewById(R.id.fragment_welcome_gmail_button);
        StartActivity startActivity = this.f4235d0;
        Animation loadAnimation = AnimationUtils.loadAnimation(startActivity, R.anim.from_top_to_position);
        loadAnimation.setDuration(750);
        this.f4236e0.setAnimation(loadAnimation);
        String string = MyApplication.f7090a.getApplicationContext().getString(R.string.server_name_with_two_dots, new Object[]{d.E0("server_name", "تجريبي")});
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(startActivity.getResources().getColor(R.color.minimum_word_color, startActivity.getTheme())), string.indexOf(":") + 1, string.length(), 33);
        this.f4237f0.setText(spannableString);
        this.f4242k0 = d.v0(1, "server_number");
        String string2 = MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_two_dots, new Object[]{Integer.valueOf(this.f4242k0)});
        SpannableString spannableString2 = new SpannableString(string2);
        spannableString2.setSpan(new ForegroundColorSpan(startActivity.getResources().getColor(R.color.minimum_word_color, startActivity.getTheme())), string2.indexOf(":") + 1, string2.length(), 33);
        this.f4238g0.setText(spannableString2);
        RelativeLayout relativeLayout = this.f4239h0;
        relativeLayout.setOnClickListener(new i(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f4240i0;
        relativeLayout2.setOnClickListener(new i(this, relativeLayout2, 1));
        RelativeLayout relativeLayout3 = this.f4241j0;
        relativeLayout3.setOnClickListener(new i(this, relativeLayout3, 2));
        return this.f4236e0;
    }
}
