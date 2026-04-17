package com.mtma.criminal.city.activities;

import K1.e;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.a;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import e5.C0505b;
import f.C0518i;
import h0.C0552a;
import i3.C0592h;
import java.util.List;

public class StartActivity extends C0518i {

    /* renamed from: b0  reason: collision with root package name */
    public static boolean f7025b0 = false;

    /* renamed from: c0  reason: collision with root package name */
    public static boolean f7026c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public static C0505b f7027d0;

    /* renamed from: I  reason: collision with root package name */
    public StartActivity f7028I;

    /* renamed from: J  reason: collision with root package name */
    public TextView f7029J;

    /* renamed from: K  reason: collision with root package name */
    public TextView f7030K;

    /* renamed from: L  reason: collision with root package name */
    public ImageView f7031L;

    /* renamed from: M  reason: collision with root package name */
    public ImageView f7032M;

    /* renamed from: N  reason: collision with root package name */
    public LinearLayout f7033N;

    /* renamed from: O  reason: collision with root package name */
    public int f7034O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f7035P = false;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f7036Q = false;

    /* renamed from: R  reason: collision with root package name */
    public boolean f7037R = false;

    /* renamed from: S  reason: collision with root package name */
    public boolean f7038S = false;

    /* renamed from: T  reason: collision with root package name */
    public boolean f7039T = false;

    /* renamed from: U  reason: collision with root package name */
    public Handler f7040U;

    /* renamed from: V  reason: collision with root package name */
    public w f7041V;

    /* renamed from: W  reason: collision with root package name */
    public int f7042W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f7043X;

    /* renamed from: Y  reason: collision with root package name */
    public FirebaseAuth f7044Y;

    /* renamed from: Z  reason: collision with root package name */
    public x f7045Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f7046a0 = false;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_start);
        this.f7029J = (TextView) findViewById(R.id.activity_start_version);
        this.f7033N = (LinearLayout) findViewById(R.id.activity_start_progress_layout);
        this.f7030K = (TextView) findViewById(R.id.activity_start_progress_bar_text);
        this.f7031L = (ImageView) findViewById(R.id.activity_start_full_progress_bar);
        this.f7032M = (ImageView) findViewById(R.id.activity_start_full_fake_progress_bar);
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
        List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
        if (activeAdmins != null) {
            boolean z3 = false;
            for (ComponentName packageName : activeAdmins) {
                if (devicePolicyManager.isDeviceOwnerApp(packageName.getPackageName())) {
                    z3 = true;
                }
            }
            if (z3) {
                C0592h.b().e().E("WorkProfileDetection").E(e.u()).I(e.u());
            }
        }
    }

    public final void onPause() {
        super.onPause();
        this.f7043X = false;
        this.f7035P = false;
        this.f7036Q = false;
        this.f7037R = false;
        this.f7038S = false;
        this.f7039T = false;
        if (!this.f7046a0) {
            c.B0();
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f7034O != 0) {
            this.f7042W = 0;
            this.f7043X = true;
            t();
            this.f7030K.setText(R.string.check_updates);
            p();
            C0505b bVar = f7027d0;
            if (bVar != null) {
                bVar.dismiss();
                f7027d0 = null;
                return;
            }
            return;
        }
        this.f7028I = this;
        this.f7042W = 0;
        this.f7043X = true;
        this.f7032M.getViewTreeObserver().addOnGlobalLayoutListener(new K4.e(this, 3));
        this.f7040U = new Handler();
        this.f7041V = new w(this, 0);
    }

    public final void p() {
        if (!MyApplication.f7091b) {
            new Handler().postDelayed(new w(this, 1), 250);
        } else if (MyApplication.f7092c) {
            a.i0(new q(this, 0));
        } else {
            a.i0(new q(this, 1));
        }
    }

    public final void q() {
        if (!f7025b0) {
            f7025b0 = true;
            C0505b bVar = new C0505b(this.f7028I, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
            textView.setText(R.string.try_connect_again);
            textView.setTextSize(14.0f);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button_text)).setText(R.string.button_exit);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.no_internet_connection);
            relativeLayout.setOnClickListener(new u(this, relativeLayout, bVar, 0));
            relativeLayout2.setOnClickListener(new u(this, relativeLayout2, bVar, 1));
            bVar.show();
        }
    }

    public final void r() {
        this.f7046a0 = true;
        finish();
        startActivity(new Intent(this.f7028I, MainActivity.class));
    }

    public final void s(C0286s sVar) {
        for (C0286s sVar2 : l().f5000c.v()) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f7028I, R.anim.from_position_to_bottom);
            loadAnimation.setDuration(750);
            loadAnimation.setAnimationListener(new v(this, sVar2));
            sVar2.f5159N.setAnimation(loadAnimation);
        }
        try {
            I l6 = l();
            if (!l6.f4991G) {
                C0269a aVar = new C0269a(l6);
                aVar.f(R.id.activity_start_frame_layout, sVar, (String) null, 1);
                aVar.e(false);
            } else {
                I l7 = ((C0518i) getApplicationContext()).l();
                l7.getClass();
                C0269a aVar2 = new C0269a(l7);
                aVar2.f(R.id.activity_start_frame_layout, sVar, (String) null, 1);
                aVar2.e(false);
            }
            if (this.f7033N.isShown()) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f7028I, R.anim.from_position_to_bottom);
                loadAnimation2.setDuration(350);
                this.f7033N.setAnimation(loadAnimation2);
                this.f7033N.setVisibility(8);
                this.f7043X = false;
            }
        } catch (Exception e6) {
            C0552a.x(e6, "Exception from try-catch block inside StartActivity in replaceFrameLayout method.", "StartActivity");
        }
    }

    public final void t() {
        this.f7040U.postDelayed(this.f7041V, 30);
    }
}
