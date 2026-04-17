package X4;

import B4.b;
import B4.f;
import H4.g;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.I;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.StartActivity;
import com.mtma.criminal.city.app.MyApplication;
import e3.E;
import e3.m;
import i3.C0590f;
import i3.C0592h;

public final class c extends C0286s {

    /* renamed from: r0  reason: collision with root package name */
    public static final /* synthetic */ int f4193r0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final StartActivity f4194d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f4195e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f4196f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f4197g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f4198h0;

    /* renamed from: i0  reason: collision with root package name */
    public EditText f4199i0;

    /* renamed from: j0  reason: collision with root package name */
    public EditText f4200j0;

    /* renamed from: k0  reason: collision with root package name */
    public ImageView f4201k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f4202l0;

    /* renamed from: m0  reason: collision with root package name */
    public LinearLayout f4203m0;

    /* renamed from: n0  reason: collision with root package name */
    public C0590f f4204n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f4205o0 = false;

    /* renamed from: p0  reason: collision with root package name */
    public String f4206p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    public String f4207q0 = "";

    public c(StartActivity startActivity) {
        this.f4194d0 = startActivity;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_login, viewGroup, false);
        this.f4195e0 = inflate;
        this.f4196f0 = (TextView) inflate.findViewById(R.id.fragment_login_server_name);
        this.f4197g0 = (TextView) this.f4195e0.findViewById(R.id.fragment_login_server_number);
        this.f4199i0 = (EditText) this.f4195e0.findViewById(R.id.fragment_login_email_field);
        this.f4200j0 = (EditText) this.f4195e0.findViewById(R.id.fragment_login_password_field);
        this.f4201k0 = (ImageView) this.f4195e0.findViewById(R.id.fragment_login_close_button);
        this.f4202l0 = (RelativeLayout) this.f4195e0.findViewById(R.id.fragment_login_login_button);
        this.f4203m0 = (LinearLayout) this.f4195e0.findViewById(R.id.fragment_login_progress_bar);
        this.f4198h0 = (TextView) this.f4195e0.findViewById(R.id.fragment_login_forget_password_button);
        StartActivity startActivity = this.f4194d0;
        Animation loadAnimation = AnimationUtils.loadAnimation(startActivity, R.anim.from_top_to_position);
        loadAnimation.setDuration(750);
        this.f4195e0.setAnimation(loadAnimation);
        this.f4204n0 = C0592h.b().f("Users");
        String string = MyApplication.f7090a.getApplicationContext().getString(R.string.server_name_with_two_dots, new Object[]{d.E0("server_name", "تجريبي")});
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(startActivity.getResources().getColor(R.color.minimum_word_color, startActivity.getTheme())), string.indexOf(":") + 1, string.length(), 33);
        this.f4196f0.setText(spannableString);
        String string2 = MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_two_dots, new Object[]{Integer.valueOf(d.v0(1, "server_number"))});
        SpannableString spannableString2 = new SpannableString(string2);
        spannableString2.setSpan(new ForegroundColorSpan(startActivity.getResources().getColor(R.color.minimum_word_color, startActivity.getTheme())), string2.indexOf(":") + 1, string2.length(), 33);
        this.f4197g0.setText(spannableString2);
        RelativeLayout relativeLayout = this.f4202l0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 21));
        TextView textView = this.f4198h0;
        textView.setOnTouchListener(new b(textView, 5));
        this.f4198h0.setOnClickListener(new b(this, 0));
        ImageView imageView = this.f4201k0;
        imageView.setOnTouchListener(new b(imageView, 5));
        this.f4201k0.setOnClickListener(new b(this, 1));
        return this.f4195e0;
    }

    public final void V(String str, String str2) {
        FirebaseAuth instance = FirebaseAuth.getInstance();
        instance.getClass();
        I.d(str);
        I.d(str2);
        String str3 = instance.f6867i;
        new E(instance, str, false, (m) null, str2, str3).Q0(instance, str3, instance.f6870l).addOnSuccessListener(new g(this, str2, 4)).addOnFailureListener(new a(this, str));
    }
}
