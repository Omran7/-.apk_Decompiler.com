package com.mtma.criminal.city.activities;

import B2.a;
import K1.e;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import e3.m;
import e5.C0505b;
import f3.C0528e;
import i3.C0590f;
import i3.C0592h;

public final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7087a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ StartActivity f7088b;

    public /* synthetic */ w(StartActivity startActivity, int i2) {
        this.f7087a = i2;
        this.f7088b = startActivity;
    }

    public final void run() {
        String str;
        StartActivity startActivity = this.f7088b;
        switch (this.f7087a) {
            case 0:
                if (startActivity.f7043X) {
                    int i2 = startActivity.f7042W;
                    int i5 = startActivity.f7034O;
                    int i6 = i5 - ((i2 * i5) / 100);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.setMargins(0, 0, i6, 0);
                    layoutParams.addRule(15, -1);
                    layoutParams.addRule(20, -1);
                    startActivity.f7031L.setLayoutParams(layoutParams);
                    startActivity.f7031L.setPaddingRelative(e.m(1.0d), 2, -i6, e.m(1.0d));
                    if (startActivity.f7031L.getVisibility() != 8) {
                        startActivity.f7031L.setVisibility(0);
                    }
                    int i7 = startActivity.f7042W;
                    if (i7 == 20) {
                        if (startActivity.f7035P) {
                            startActivity.f7030K.setText(R.string.check_logged_in);
                            if (FirebaseAuth.getInstance().f6866f != null) {
                                if (startActivity.f7044Y == null) {
                                    startActivity.f7044Y = FirebaseAuth.getInstance();
                                }
                                if (startActivity.f7045Z == null) {
                                    x xVar = new x(startActivity);
                                    startActivity.f7045Z = xVar;
                                    FirebaseAuth firebaseAuth = startActivity.f7044Y;
                                    firebaseAuth.d.add(xVar);
                                    firebaseAuth.f6879u.execute(new a(firebaseAuth, xVar, 25, false));
                                }
                            } else {
                                C0592h.b().e().E("Users").q("deviceId").i(e.u()).d(new r(startActivity));
                            }
                            startActivity.f7042W++;
                        } else if (!android.support.v4.media.session.a.k0()) {
                            startActivity.f7043X = false;
                            startActivity.q();
                        }
                        startActivity.t();
                        return;
                    } else if (i7 == 40) {
                        if (startActivity.f7036Q) {
                            startActivity.f7030K.setText(R.string.set_player_data);
                            C0590f f6 = C0592h.b().f("Users");
                            m mVar = FirebaseAuth.getInstance().f6866f;
                            if (mVar == null) {
                                str = null;
                            } else {
                                str = ((C0528e) mVar).f7921b.f7913a;
                            }
                            f6.E(str).d(new t(startActivity, 0));
                            startActivity.f7042W++;
                        } else if (!android.support.v4.media.session.a.k0()) {
                            startActivity.f7043X = false;
                            startActivity.q();
                        }
                        startActivity.t();
                        return;
                    } else if (i7 == 60) {
                        if (startActivity.f7038S) {
                            startActivity.f7030K.setText(R.string.connect_to_server);
                            if (c.Z()) {
                                c.s(false, new r(startActivity));
                            } else if (StartActivity.f7027d0 == null) {
                                C0505b bVar = new C0505b(startActivity.f7028I, R.layout.dialog_ok_cancle);
                                StartActivity.f7027d0 = bVar;
                                TextView textView = (TextView) StartActivity.f7027d0.findViewById(R.id.dialog_ok_cancel_title);
                                RelativeLayout relativeLayout = (RelativeLayout) StartActivity.f7027d0.findViewById(R.id.dialog_ok_cancel_confirm_button);
                                RelativeLayout relativeLayout2 = (RelativeLayout) StartActivity.f7027d0.findViewById(R.id.dialog_ok_cancel_cancel_button);
                                ((LinearLayout) StartActivity.f7027d0.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                                textView.setText(R.string.alert);
                                textView.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.maximum_word_color, startActivity.f7028I.getTheme()));
                                ((TextView) StartActivity.f7027d0.findViewById(R.id.dialog_ok_cancel_cancel_button_text)).setText(R.string.button_exit);
                                ((TextView) StartActivity.f7027d0.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_enable);
                                ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.dialog_content_enable_auto_time);
                                relativeLayout2.setOnClickListener(new s(startActivity, relativeLayout2, 0));
                                relativeLayout.setOnClickListener(new s(startActivity, relativeLayout, 1));
                                StartActivity.f7027d0.show();
                            }
                            startActivity.f7042W++;
                        } else if (!android.support.v4.media.session.a.k0()) {
                            startActivity.f7043X = false;
                            startActivity.q();
                        }
                        startActivity.t();
                        return;
                    } else if (i7 == 80) {
                        if (startActivity.f7037R && startActivity.f7039T) {
                            startActivity.f7030K.setText(R.string.check_server_configuration);
                            startActivity.f7042W++;
                        } else if (!android.support.v4.media.session.a.k0()) {
                            startActivity.f7043X = false;
                            startActivity.q();
                        }
                        startActivity.t();
                        return;
                    } else if (i7 == 100) {
                        if (android.support.v4.media.session.a.k0()) {
                            startActivity.r();
                            return;
                        }
                        startActivity.f7043X = false;
                        startActivity.q();
                        return;
                    } else if (startActivity.f7033N.isShown()) {
                        startActivity.f7042W++;
                        startActivity.t();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                boolean z3 = StartActivity.f7025b0;
                startActivity.p();
                return;
        }
    }
}
