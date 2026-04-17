package com.mtma.criminal.city.activities;

import A4.h;
import F4.a;
import I4.f;
import K1.e;
import R2.b;
import X4.d;
import Y4.p;
import android.app.AppOpsManager;
import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.activity.C;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.v;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.D;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.bumptech.glide.manager.n;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.TimeChangeReceiver;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.views.GameGridView;
import d5.o;
import e5.C0505b;
import f.C0518i;
import i3.C0590f;
import i3.C0592h;
import j4.C0612a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import l4.C0794b;
import l4.C0795c;
import l4.i;
import n3.C0859D;
import n3.m;
import x4.C1105h;

public class MainActivity extends C0518i {
    public static final /* synthetic */ int L0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public C0794b f6971A0;

    /* renamed from: B0  reason: collision with root package name */
    public C0795c f6972B0;

    /* renamed from: C0  reason: collision with root package name */
    public C0505b f6973C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f6974D0 = false;

    /* renamed from: E0  reason: collision with root package name */
    public C0612a f6975E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f6976F0 = true;

    /* renamed from: G0  reason: collision with root package name */
    public Handler f6977G0;

    /* renamed from: H0  reason: collision with root package name */
    public a f6978H0;

    /* renamed from: I  reason: collision with root package name */
    public MainActivity f6979I;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f6980I0 = false;

    /* renamed from: J  reason: collision with root package name */
    public SharedPreferences f6981J;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f6982J0 = true;

    /* renamed from: K  reason: collision with root package name */
    public SharedPreferences.Editor f6983K;

    /* renamed from: K0  reason: collision with root package name */
    public final TimeChangeReceiver f6984K0 = new TimeChangeReceiver();

    /* renamed from: L  reason: collision with root package name */
    public b f6985L;

    /* renamed from: M  reason: collision with root package name */
    public RelativeLayout f6986M;

    /* renamed from: N  reason: collision with root package name */
    public RelativeLayout f6987N;

    /* renamed from: O  reason: collision with root package name */
    public RelativeLayout f6988O;

    /* renamed from: P  reason: collision with root package name */
    public RelativeLayout f6989P;

    /* renamed from: Q  reason: collision with root package name */
    public RelativeLayout f6990Q;

    /* renamed from: R  reason: collision with root package name */
    public GameGridView f6991R;

    /* renamed from: S  reason: collision with root package name */
    public ImageView f6992S;

    /* renamed from: T  reason: collision with root package name */
    public ImageView f6993T;

    /* renamed from: U  reason: collision with root package name */
    public LinearLayout f6994U;

    /* renamed from: V  reason: collision with root package name */
    public FirebaseAuth f6995V;

    /* renamed from: W  reason: collision with root package name */
    public C0590f f6996W;

    /* renamed from: X  reason: collision with root package name */
    public C0590f f6997X;

    /* renamed from: Y  reason: collision with root package name */
    public C0590f f6998Y;

    /* renamed from: Z  reason: collision with root package name */
    public C0590f f6999Z;

    /* renamed from: a0  reason: collision with root package name */
    public C0590f f7000a0;

    /* renamed from: b0  reason: collision with root package name */
    public C0590f f7001b0;

    /* renamed from: c0  reason: collision with root package name */
    public C0590f f7002c0;

    /* renamed from: d0  reason: collision with root package name */
    public C0590f f7003d0;

    /* renamed from: e0  reason: collision with root package name */
    public C0590f f7004e0;

    /* renamed from: f0  reason: collision with root package name */
    public C0590f f7005f0;

    /* renamed from: g0  reason: collision with root package name */
    public C0590f f7006g0;

    /* renamed from: h0  reason: collision with root package name */
    public C0590f f7007h0;

    /* renamed from: i0  reason: collision with root package name */
    public C0590f f7008i0;

    /* renamed from: j0  reason: collision with root package name */
    public C0590f f7009j0;

    /* renamed from: k0  reason: collision with root package name */
    public c f7010k0;

    /* renamed from: l0  reason: collision with root package name */
    public e f7011l0;

    /* renamed from: m0  reason: collision with root package name */
    public d f7012m0;

    /* renamed from: n0  reason: collision with root package name */
    public g f7013n0;

    /* renamed from: o0  reason: collision with root package name */
    public D f7014o0;

    /* renamed from: p0  reason: collision with root package name */
    public e f7015p0;

    /* renamed from: q0  reason: collision with root package name */
    public p f7016q0;

    /* renamed from: r0  reason: collision with root package name */
    public o f7017r0;
    public g s0;

    /* renamed from: t0  reason: collision with root package name */
    public i f7018t0;

    /* renamed from: u0  reason: collision with root package name */
    public e f7019u0;

    /* renamed from: v0  reason: collision with root package name */
    public e f7020v0;

    /* renamed from: w0  reason: collision with root package name */
    public g f7021w0;

    /* renamed from: x0  reason: collision with root package name */
    public h f7022x0;

    /* renamed from: y0  reason: collision with root package name */
    public v f7023y0;

    /* renamed from: z0  reason: collision with root package name */
    public i f7024z0;

    public static void p(MainActivity mainActivity) {
        ArrayList arrayList;
        mainActivity.getClass();
        ArrayList<Integer> herbIdsList = o.getHerbObject().getHerbIdsList();
        ArrayList<Long> herbUsingStartTimeList = o.getHerbObject().getHerbUsingStartTimeList();
        if (herbIdsList.size() != herbUsingStartTimeList.size()) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < herbIdsList.size(); i2++) {
                long longValue = herbUsingStartTimeList.get(i2).longValue() + b.T(herbIdsList.get(i2).intValue());
                if (longValue > c.f5744o) {
                    arrayList2.add(0, new p(b.O(herbIdsList.get(i2).intValue(), false), b.P(herbIdsList.get(i2).intValue(), false), longValue));
                } else {
                    c.s(false, new D(15));
                }
                long longValue2 = herbUsingStartTimeList.get(i2).longValue() + b.K(herbIdsList.get(i2).intValue());
                if (longValue2 > c.f5744o) {
                    int intValue = herbIdsList.get(i2).intValue();
                    switch (intValue) {
                        case 2005:
                        case 2006:
                        case 2007:
                            break;
                        default:
                            switch (intValue) {
                                case 2031:
                                case 2032:
                                case 2033:
                                    break;
                                default:
                                    arrayList2.add(0, new p(b.O(herbIdsList.get(i2).intValue(), true), b.P(herbIdsList.get(i2).intValue(), true), longValue2));
                                    break;
                            }
                    }
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            mainActivity.f6975E0 = new C0612a(mainActivity.f6979I, arrayList, 3);
            mainActivity.f6991R.setNumColumns(arrayList.size());
            mainActivity.f6991R.setAdapter(mainActivity.f6975E0);
            if (arrayList.isEmpty()) {
                mainActivity.f6988O.setVisibility(4);
                mainActivity.f6988O.clearAnimation();
                mainActivity.f6991R.setVisibility(8);
                mainActivity.f6991R.clearAnimation();
                mainActivity.f6975E0.clear();
            } else if (!mainActivity.f6980I0) {
                mainActivity.f6980I0 = true;
                mainActivity.y();
            }
        }
    }

    public static void s() {
        long j6 = (long) 1;
        Q.b(5, o.getAccountObject().getId(), j6);
        if (o.getWorkObject().getJobType() != -1) {
            Q.b(10, o.getAccountObject().getId(), j6);
        }
        if (!o.getGangObject().getId().equals("not_in_gang")) {
            Q.b(132, o.getAccountObject().getId(), j6);
        }
        Q.b(0, o.getAccountObject().getId(), (long) o.getMainStatesObject().getLevel());
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(com.bumptech.glide.d.Z0(context, PreferenceManager.getDefaultSharedPreferences(context).getString("Locale.Helper.Selected.Language", Locale.getDefault().getLanguage())));
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        C0286s z3 = l().z(R.id.activity_main_body_frame_layout);
        if ((z3 instanceof F4.b) && motionEvent.getAction() == 1 && (view = z3.f5159N) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.fragment_phone_dialog_dialog_layout);
            int[] iArr = new int[2];
            constraintLayout.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i5 = iArr[1];
            int width = constraintLayout.getWidth();
            int height = constraintLayout.getHeight();
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (rawX < ((float) i2) || rawX > ((float) (i2 + width)) || rawY < ((float) i5) || rawY > ((float) (i5 + height))) {
                ((F4.b) z3).V();
            }
        }
        if (this.f6991R.getVisibility() == 0 && motionEvent.getAction() == 1) {
            int[] iArr2 = new int[2];
            this.f6991R.getLocationOnScreen(iArr2);
            int i6 = iArr2[0];
            int i7 = iArr2[1];
            int width2 = this.f6991R.getWidth();
            int height2 = this.f6991R.getHeight();
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (rawX2 < ((float) i6) || rawX2 > ((float) (i6 + width2)) || rawY2 < ((float) i7) || rawY2 > ((float) (i7 + height2))) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this.f6979I, R.anim.herb_rotaion);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f6979I, R.anim.from_end_to_position);
                loadAnimation2.setDuration(500);
                loadAnimation.setInterpolator(new U.d(1));
                this.f6988O.clearAnimation();
                this.f6988O.startAnimation(loadAnimation);
                loadAnimation2.setAnimationListener(new a(this, 1));
                loadAnimation2.setInterpolator(new U.d(1));
                this.f6991R.clearAnimation();
                this.f6991R.setAnimation(loadAnimation2);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void onActivityResult(int i2, int i5, Intent intent) {
        super.onActivityResult(i2, i5, intent);
        if (i2 != 2222) {
            return;
        }
        if (((AppOpsManager) getSystemService("appops")).checkOpNoThrow("android:get_usage_stats", Process.myUid(), getPackageName()) == 0) {
            NetworkStatsManager networkStatsManager = (NetworkStatsManager) getSystemService("netstats");
            int myUid = Process.myUid();
            try {
                NetworkStats querySummary = networkStatsManager.querySummary(1, "", System.currentTimeMillis() - 86400000, System.currentTimeMillis());
                NetworkStats.Bucket bucket = new NetworkStats.Bucket();
                long j6 = 0;
                long j7 = 0;
                while (querySummary.hasNextBucket()) {
                    querySummary.getNextBucket(bucket);
                    if (bucket.getUid() == myUid) {
                        j6 += bucket.getRxBytes();
                        j7 += bucket.getTxBytes();
                    }
                }
                querySummary.close();
                long j8 = (j6 + j7) / 1048576;
                if (j8 > 150) {
                    c.s0(this.f6979I, "the usage : the usage : " + j8 + " mg", (String) null);
                    new Handler().postDelayed(new a(this, 1), 10000);
                }
            } catch (Exception e6) {
                Log.e("MainActivity", "Exception: " + e6.getMessage());
            }
        } else {
            startActivityForResult(new Intent("android.settings.USAGE_ACCESS_SETTINGS"), 2222);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        this.f6979I = this;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.f6981J = defaultSharedPreferences;
        this.f6983K = defaultSharedPreferences.edit();
        this.f6977G0 = new Handler();
        this.f6978H0 = new a(this, 2);
        this.f6991R = (GameGridView) findViewById(R.id.activity_main_herbs_grid_view);
        this.f6986M = (RelativeLayout) findViewById(R.id.activity_main_buy_gold_button);
        this.f6988O = (RelativeLayout) findViewById(R.id.activity_main_herbs_button);
        this.f6989P = (RelativeLayout) findViewById(R.id.activity_main_phone_button);
        this.f6990Q = (RelativeLayout) findViewById(R.id.activity_main_prizes_button);
        this.f6987N = (RelativeLayout) findViewById(R.id.activity_main_activities_button);
        this.f6992S = (ImageView) findViewById(R.id.activity_main_phone_alert);
        this.f6993T = (ImageView) findViewById(R.id.activity_main_prizes_alert);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.activity_main_programming_helping_button);
        this.f6994U = (LinearLayout) findViewById(R.id.activity_main_progress_bar_layout);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f6979I, R.anim.from_end_to_position);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f6979I, R.anim.from_start_to_position);
        ((LinearLayout) findViewById(R.id.activity_main_right_layout)).setAnimation(loadAnimation);
        ((LinearLayout) findViewById(R.id.activity_main_left_layout)).setAnimation(loadAnimation2);
        this.f7024z0 = new i(this.f6979I);
        I l6 = l();
        C0269a b6 = o3.d.b(l6, l6);
        b6.f(R.id.activity_main_top_bar_frame_layout, this.f7024z0, (String) null, 1);
        b6.e(false);
        this.f6971A0 = new C0794b(this.f6979I);
        I l7 = l();
        C0269a b7 = o3.d.b(l7, l7);
        b7.f(R.id.activity_main_bottom_bar_frame_layout, this.f6971A0, (String) null, 1);
        b7.e(false);
        q();
        u(o.getLocationObject().getCurrentCity());
        x();
        b bVar = new b(this);
        this.f6985L = bVar;
        this.f6981J.registerOnSharedPreferenceChangeListener(bVar);
        w();
        RelativeLayout relativeLayout2 = this.f6986M;
        relativeLayout2.setOnClickListener(new j(this, relativeLayout2, 0));
        RelativeLayout relativeLayout3 = this.f6987N;
        relativeLayout3.setOnClickListener(new j(this, relativeLayout3, 4));
        this.f6988O.setOnClickListener(new j(this));
        RelativeLayout relativeLayout4 = this.f6989P;
        relativeLayout4.setOnClickListener(new j(this, relativeLayout4, 2));
        RelativeLayout relativeLayout5 = this.f6990Q;
        relativeLayout5.setOnClickListener(new j(this, relativeLayout5, 3));
        i().a(this, new C(this));
    }

    public final void onDestroy() {
        super.onDestroy();
        b.U0();
        MediaPlayer mediaPlayer = b.f2473b;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            b.f2473b.release();
            b.f2473b = null;
        }
        b bVar = this.f6985L;
        if (bVar != null) {
            this.f6981J.unregisterOnSharedPreferenceChangeListener(bVar);
            this.f6985L = null;
            this.f6981J = null;
            this.f6983K = null;
        }
    }

    public final void onPause() {
        super.onPause();
        this.f6982J0 = false;
        b.U0();
        MediaPlayer mediaPlayer = b.f2473b;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            b.f2473b.release();
            b.f2473b = null;
        }
        c.B0();
        com.bumptech.glide.d.f5753b = false;
        com.bumptech.glide.d.f5754c = true;
        t();
        unregisterReceiver(this.f6984K0);
    }

    public final void onResume() {
        super.onResume();
        if (this.f6976F0) {
            if (!e.u().equals(o.getAccountObject().getDeviceId())) {
                c.q0(this.f6979I);
            }
            s();
        } else {
            b.w(true);
            android.support.v4.media.session.a.i0(new V4.b(this, 4));
        }
        this.f6979I = this;
        this.f6982J0 = true;
        this.f6976F0 = false;
        com.bumptech.glide.d.f5753b = true;
        com.bumptech.glide.d.f5754c = false;
        e.p0();
        ((ConnectivityManager) this.f6979I.getSystemService("connectivity")).registerNetworkCallback(new NetworkRequest.Builder().build(), new n(this, 1));
        b.L0();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.DATE_CHANGED");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        registerReceiver(this.f6984K0, intentFilter);
    }

    /* JADX WARNING: type inference failed for: r0v82, types: [com.mtma.criminal.city.activities.p, java.lang.Object, i3.a] */
    /* JADX WARNING: type inference failed for: r0v83, types: [com.mtma.criminal.city.activities.o, java.lang.Object, i3.q] */
    public final void q() {
        this.f6995V = FirebaseAuth.getInstance();
        this.f6996W = C0592h.b().e().E("AppInfo");
        C0590f E6 = C0592h.b().e().E("Hackers").E(o.getAccountObject().getFirebaseId());
        this.f6997X = com.google.android.gms.internal.measurement.a.v(E6.E("ServerNumber-" + o.getAccountObject().getCurrentOpenedServer()), "basicData");
        this.f6998Y = com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "serverData");
        this.f7007h0 = com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "accountObject");
        this.f7005f0 = com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "armingObject");
        this.f7002c0 = com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "herbObject");
        this.f7000a0 = com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "locationObject");
        this.f7003d0 = com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "medalsObject", "allMedalsDetails");
        this.f7004e0 = com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "notificationObject");
        this.f7006g0 = com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "gangObject");
        this.f7008i0 = com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "skillsObject");
        this.f6999Z = com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "stockObject", "itemsInStock");
        this.f7009j0 = C0592h.b().e().E(b.Z()).E("activities").E("goldBullionChase");
        this.f7001b0 = com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "players"), "contactsObject");
        if (this.f7010k0 == null) {
            c cVar = new c(this);
            this.f7010k0 = cVar;
            FirebaseAuth firebaseAuth = this.f6995V;
            firebaseAuth.d.add(cVar);
            firebaseAuth.f6879u.execute(new B2.a(firebaseAuth, cVar, 25, false));
        }
        if (this.f7014o0 == null) {
            D d = new D(12);
            this.f7014o0 = d;
            this.f6999Z.b(d);
        }
        if (this.f7015p0 == null) {
            e eVar = new e(this, 3);
            this.f7015p0 = eVar;
            this.f7000a0.b(eVar);
        }
        if (this.s0 == null) {
            g gVar = new g(this, 2);
            this.s0 = gVar;
            this.f7004e0.b(gVar);
        }
        if (this.f7017r0 == null) {
            ? obj = new Object();
            this.f7017r0 = obj;
            C0590f fVar = this.f7003d0;
            fVar.c(new C0859D((m) fVar.f2694b, obj, fVar.l()));
        }
        if (this.f7016q0 == null) {
            ? obj2 = new Object();
            this.f7016q0 = obj2;
            this.f7001b0.b(obj2);
        }
        if (this.f7011l0 == null) {
            e eVar2 = new e(this, 1);
            this.f7011l0 = eVar2;
            this.f6996W.b(eVar2);
        }
        this.f6997X.E("hackingAttemptsNumber").d(new e(this, 2));
        if (this.f7018t0 == null) {
            i iVar = new i(this);
            this.f7018t0 = iVar;
            this.f7002c0.b(iVar);
        }
        if (this.f7019u0 == null) {
            e eVar3 = new e(this, 4);
            this.f7019u0 = eVar3;
            this.f7005f0.b(eVar3);
        }
        if (this.f7020v0 == null) {
            e eVar4 = new e(this, 0);
            this.f7020v0 = eVar4;
            this.f7006g0.b(eVar4);
        }
        if (this.f7022x0 == null) {
            h hVar = new h(this);
            this.f7022x0 = hVar;
            this.f7008i0.b(hVar);
        }
        if (this.f7021w0 == null) {
            g gVar2 = new g(this, 0);
            this.f7021w0 = gVar2;
            this.f7007h0.b(gVar2);
        }
        if (this.f7023y0 == null) {
            v vVar = new v(12);
            this.f7023y0 = vVar;
            this.f7009j0.b(vVar);
        }
        if (this.f7013n0 == null) {
            g gVar3 = new g(this, 3);
            this.f7013n0 = gVar3;
            this.f6998Y.b(gVar3);
        }
    }

    public final void r(C0286s sVar) {
        try {
            I l6 = l();
            for (C0286s sVar2 : l6.f5000c.v()) {
                if (sVar.getClass().equals(sVar2.getClass())) {
                    return;
                }
            }
            if (!l6.f4991G) {
                C0269a aVar = new C0269a(l6);
                aVar.i(R.id.activity_main_body_frame_layout, sVar);
                aVar.e(false);
            } else {
                I l7 = ((C0518i) getApplicationContext()).l();
                l7.getClass();
                C0269a aVar2 = new C0269a(l7);
                aVar2.i(R.id.activity_main_body_frame_layout, sVar);
                aVar2.e(false);
            }
            b.N0();
        } catch (Exception e6) {
            this.f6979I = this;
            r(sVar);
            Log.e("MainActivity", "Exception from try-catch block inside MainActivity in addToBodyFragment method." + e6);
        }
    }

    public final void t() {
        c cVar = this.f7010k0;
        if (cVar != null) {
            this.f6995V.d.remove(cVar);
            this.f6995V = null;
            this.f7010k0 = null;
        }
        e eVar = this.f7011l0;
        if (eVar != null) {
            this.f6996W.u(eVar);
            this.f6996W = null;
            this.f7011l0 = null;
        }
        d dVar = this.f7012m0;
        if (dVar != null) {
            this.f6997X.u(dVar);
            this.f6997X = null;
            this.f7012m0 = null;
        }
        g gVar = this.f7013n0;
        if (gVar != null) {
            this.f6998Y.u(gVar);
            this.f6998Y = null;
            this.f7013n0 = null;
        }
        D d = this.f7014o0;
        if (d != null) {
            this.f6999Z.u(d);
            this.f6999Z = null;
            this.f7014o0 = null;
        }
        e eVar2 = this.f7015p0;
        if (eVar2 != null) {
            this.f7000a0.u(eVar2);
            this.f7000a0 = null;
            this.f7015p0 = null;
        }
        p pVar = this.f7016q0;
        if (pVar != null) {
            this.f7001b0.u(pVar);
            this.f7001b0 = null;
            this.f7016q0 = null;
        }
        i iVar = this.f7018t0;
        if (iVar != null) {
            this.f7002c0.u(iVar);
            this.f7002c0 = null;
            this.f7018t0 = null;
        }
        o oVar = this.f7017r0;
        if (oVar != null) {
            C0590f fVar = this.f7003d0;
            fVar.v(new C0859D((m) fVar.f2694b, oVar, fVar.l()));
            this.f7003d0 = null;
            this.f7017r0 = null;
        }
        g gVar2 = this.s0;
        if (gVar2 != null) {
            this.f7004e0.u(gVar2);
            this.f7004e0 = null;
            this.s0 = null;
        }
        e eVar3 = this.f7019u0;
        if (eVar3 != null) {
            this.f7005f0.u(eVar3);
            this.f7005f0 = null;
            this.f7019u0 = null;
        }
        e eVar4 = this.f7020v0;
        if (eVar4 != null) {
            this.f7006g0.u(eVar4);
            this.f7006g0 = null;
            this.f7020v0 = null;
        }
        h hVar = this.f7022x0;
        if (hVar != null) {
            this.f7008i0.u(hVar);
            this.f7008i0 = null;
            this.f7022x0 = null;
        }
        g gVar3 = this.f7021w0;
        if (gVar3 != null) {
            this.f7007h0.u(gVar3);
            this.f7007h0 = null;
            this.f7021w0 = null;
        }
        v vVar = this.f7023y0;
        if (vVar != null) {
            this.f7009j0.u(vVar);
            this.f7009j0 = null;
            this.f7023y0 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [androidx.fragment.app.s, l4.c] */
    public final void u(int i2) {
        C0795c cVar = this.f6972B0;
        if (cVar == null || cVar.f9765e0 != o.getLocationObject().getCurrentCity()) {
            Iterator it2 = l().f5000c.v().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C0286s sVar = (C0286s) it2.next();
                if (sVar instanceof C0795c) {
                    I l6 = l();
                    l6.getClass();
                    C0269a aVar = new C0269a(l6);
                    aVar.h(sVar);
                    aVar.e(false);
                    this.f6972B0 = null;
                    break;
                }
            }
            MainActivity mainActivity = this.f6979I;
            ? sVar2 = new C0286s();
            sVar2.f9764d0 = mainActivity;
            sVar2.f9765e0 = i2;
            this.f6972B0 = sVar2;
            I l7 = l();
            C0269a b6 = o3.d.b(l7, l7);
            b6.i(R.id.activity_city_structure_frame_layout, this.f6972B0);
            b6.e(false);
        }
    }

    public final void v() {
        if (this.f6974D0) {
            ((ConstraintLayout) this.f6973C0.findViewById(R.id.dialog_network_dialog_layout)).setVisibility(0);
            return;
        }
        this.f6974D0 = true;
        this.f6973C0 = null;
        C0505b bVar = new C0505b(this.f6979I, R.layout.dialog_network);
        this.f6973C0 = bVar;
        RelativeLayout relativeLayout = (RelativeLayout) this.f6973C0.findViewById(R.id.dialog_network_connect_button);
        relativeLayout.setOnClickListener(new h(this, relativeLayout, (ConstraintLayout) bVar.findViewById(R.id.dialog_network_dialog_layout), 6));
        this.f6973C0.show();
    }

    public final void w() {
        if (o.getNotificationObject().isHasUnReadNotification() || o.getNotificationObject().isHasUnReadPrivateMessage() || o.getNotificationObject().isHasUnReadSupportMessage()) {
            this.f6992S.setVisibility(0);
        } else {
            this.f6992S.setVisibility(8);
        }
        if (o.getNotificationObject().isHasUnCollectedPrize()) {
            this.f6993T.setVisibility(0);
        } else {
            this.f6993T.setVisibility(8);
        }
        for (C0286s sVar : l().f5000c.v()) {
            if ((sVar instanceof C1105h) && o.getLocationObject().getCurrentPlace() == 1) {
                ((C1105h) sVar).Y();
            } else if ((sVar instanceof f) && o.getLocationObject().getCurrentPlace() == 2) {
                ((f) sVar).Y();
            } else if ((sVar instanceof n4.f) && o.getLocationObject().getCurrentPlace() == 3) {
                ((n4.f) sVar).Z();
            } else if (sVar instanceof F4.b) {
                F4.b bVar = (F4.b) sVar;
                ((Y4.v) bVar.f793j0.get(0)).f4442c = o.getNotificationObject().isHasUnReadNotification();
                ((Y4.v) bVar.f793j0.get(1)).f4442c = o.getNotificationObject().isHasUnReadPrivateMessage();
                ((Y4.v) bVar.f793j0.get(2)).f4442c = o.getNotificationObject().isHasUnReadSupportMessage();
                bVar.f794k0.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0121, code lost:
        if ((r4 instanceof x4.C1105h) == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0123, code lost:
        r4 = (x4.C1105h) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0127, code lost:
        if (r4.f12607r0 == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r4.f12607r0 = false;
        r4.X();
        r4.Y();
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0111 A[Catch:{ Exception -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0132 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r7 = this;
            d5.j r0 = d5.o.getLocationObject()     // Catch:{ Exception -> 0x0043 }
            int r0 = r0.getCurrentPlace()     // Catch:{ Exception -> 0x0043 }
            java.lang.String r1 = "game_music"
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x00fd
            r4 = 2
            if (r0 == r4) goto L_0x00b6
            r4 = 3
            if (r0 == r4) goto L_0x006d
            androidx.fragment.app.I r0 = r7.l()     // Catch:{ Exception -> 0x0043 }
            S3.z r0 = r0.f5000c     // Catch:{ Exception -> 0x0043 }
            java.util.List r0 = r0.v()     // Catch:{ Exception -> 0x0043 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0043 }
        L_0x0022:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x0043 }
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x0043 }
            androidx.fragment.app.s r4 = (androidx.fragment.app.C0286s) r4     // Catch:{ Exception -> 0x0043 }
            boolean r5 = r4 instanceof x4.C1105h     // Catch:{ Exception -> 0x0043 }
            if (r5 != 0) goto L_0x0046
            boolean r5 = r4 instanceof x4.C1102e     // Catch:{ Exception -> 0x0043 }
            if (r5 != 0) goto L_0x0046
            boolean r5 = r4 instanceof I4.f     // Catch:{ Exception -> 0x0043 }
            if (r5 != 0) goto L_0x0046
            boolean r5 = r4 instanceof I4.i     // Catch:{ Exception -> 0x0043 }
            if (r5 != 0) goto L_0x0046
            boolean r5 = r4 instanceof n4.f     // Catch:{ Exception -> 0x0043 }
            if (r5 == 0) goto L_0x0022
            goto L_0x0046
        L_0x0043:
            r0 = move-exception
            goto L_0x016a
        L_0x0046:
            androidx.fragment.app.I r5 = r7.l()     // Catch:{ Exception -> 0x0043 }
            r5.getClass()     // Catch:{ Exception -> 0x0043 }
            androidx.fragment.app.a r6 = new androidx.fragment.app.a     // Catch:{ Exception -> 0x0043 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0043 }
            r6.h(r4)     // Catch:{ Exception -> 0x0043 }
            r6.e(r2)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0022
        L_0x0059:
            R2.b.w(r2)     // Catch:{ Exception -> 0x0043 }
            com.mtma.criminal.city.activities.MainActivity r0 = r7.f6979I     // Catch:{ Exception -> 0x0043 }
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)     // Catch:{ Exception -> 0x0043 }
            boolean r0 = r0.getBoolean(r1, r3)     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x014b
            R2.b.L0()     // Catch:{ Exception -> 0x0043 }
            goto L_0x014b
        L_0x006d:
            androidx.fragment.app.I r0 = r7.l()     // Catch:{ Exception -> 0x0043 }
            S3.z r0 = r0.f5000c     // Catch:{ Exception -> 0x0043 }
            java.util.List r0 = r0.v()     // Catch:{ Exception -> 0x0043 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0043 }
        L_0x007b:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x0043 }
            if (r4 == 0) goto L_0x009b
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x0043 }
            androidx.fragment.app.s r4 = (androidx.fragment.app.C0286s) r4     // Catch:{ Exception -> 0x0043 }
            boolean r5 = r4 instanceof n4.f     // Catch:{ Exception -> 0x0043 }
            if (r5 == 0) goto L_0x007b
            n4.f r4 = (n4.f) r4     // Catch:{ Exception -> 0x0043 }
            boolean r0 = r4.s0     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x014b
            r4.s0 = r2     // Catch:{ Exception -> 0x0043 }
            r4.Y()     // Catch:{ Exception -> 0x0043 }
            r4.Z()     // Catch:{ Exception -> 0x0043 }
            goto L_0x014b
        L_0x009b:
            com.mtma.criminal.city.activities.MainActivity r0 = r7.f6979I     // Catch:{ Exception -> 0x0043 }
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)     // Catch:{ Exception -> 0x0043 }
            boolean r0 = r0.getBoolean(r1, r3)     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x00aa
            R2.b.U0()     // Catch:{ Exception -> 0x0043 }
        L_0x00aa:
            n4.f r0 = new n4.f     // Catch:{ Exception -> 0x0043 }
            com.mtma.criminal.city.activities.MainActivity r1 = r7.f6979I     // Catch:{ Exception -> 0x0043 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0043 }
            r7.r(r0)     // Catch:{ Exception -> 0x0043 }
            goto L_0x014b
        L_0x00b6:
            androidx.fragment.app.I r0 = r7.l()     // Catch:{ Exception -> 0x0043 }
            S3.z r0 = r0.f5000c     // Catch:{ Exception -> 0x0043 }
            java.util.List r0 = r0.v()     // Catch:{ Exception -> 0x0043 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0043 }
        L_0x00c4:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x0043 }
            if (r4 == 0) goto L_0x00e3
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x0043 }
            androidx.fragment.app.s r4 = (androidx.fragment.app.C0286s) r4     // Catch:{ Exception -> 0x0043 }
            boolean r5 = r4 instanceof I4.f     // Catch:{ Exception -> 0x0043 }
            if (r5 == 0) goto L_0x00c4
            I4.f r4 = (I4.f) r4     // Catch:{ Exception -> 0x0043 }
            boolean r0 = r4.f1215t0     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x014b
            r4.f1215t0 = r2     // Catch:{ Exception -> 0x0043 }
            r4.X()     // Catch:{ Exception -> 0x0043 }
            r4.Y()     // Catch:{ Exception -> 0x0043 }
            goto L_0x014b
        L_0x00e3:
            com.mtma.criminal.city.activities.MainActivity r0 = r7.f6979I     // Catch:{ Exception -> 0x0043 }
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)     // Catch:{ Exception -> 0x0043 }
            boolean r0 = r0.getBoolean(r1, r3)     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x00f2
            R2.b.U0()     // Catch:{ Exception -> 0x0043 }
        L_0x00f2:
            I4.f r0 = new I4.f     // Catch:{ Exception -> 0x0043 }
            com.mtma.criminal.city.activities.MainActivity r1 = r7.f6979I     // Catch:{ Exception -> 0x0043 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0043 }
            r7.r(r0)     // Catch:{ Exception -> 0x0043 }
            goto L_0x014b
        L_0x00fd:
            androidx.fragment.app.I r0 = r7.l()     // Catch:{ Exception -> 0x0043 }
            S3.z r0 = r0.f5000c     // Catch:{ Exception -> 0x0043 }
            java.util.List r0 = r0.v()     // Catch:{ Exception -> 0x0043 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0043 }
        L_0x010b:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x0043 }
            if (r4 == 0) goto L_0x0132
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x0043 }
            androidx.fragment.app.s r4 = (androidx.fragment.app.C0286s) r4     // Catch:{ Exception -> 0x0043 }
            boolean r5 = r4 instanceof x4.C1105h     // Catch:{ Exception -> 0x0043 }
            if (r5 != 0) goto L_0x011f
            boolean r5 = r4 instanceof u4.g     // Catch:{ Exception -> 0x0043 }
            if (r5 == 0) goto L_0x010b
        L_0x011f:
            boolean r0 = r4 instanceof x4.C1105h     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x014b
            x4.h r4 = (x4.C1105h) r4     // Catch:{ Exception -> 0x0043 }
            boolean r0 = r4.f12607r0     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x014b
            r4.f12607r0 = r2     // Catch:{ Exception -> 0x0043 }
            r4.X()     // Catch:{ Exception -> 0x0043 }
            r4.Y()     // Catch:{ Exception -> 0x0043 }
            goto L_0x014b
        L_0x0132:
            com.mtma.criminal.city.activities.MainActivity r0 = r7.f6979I     // Catch:{ Exception -> 0x0043 }
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)     // Catch:{ Exception -> 0x0043 }
            boolean r0 = r0.getBoolean(r1, r3)     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x0141
            R2.b.U0()     // Catch:{ Exception -> 0x0043 }
        L_0x0141:
            x4.h r0 = new x4.h     // Catch:{ Exception -> 0x0043 }
            com.mtma.criminal.city.activities.MainActivity r1 = r7.f6979I     // Catch:{ Exception -> 0x0043 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0043 }
            r7.r(r0)     // Catch:{ Exception -> 0x0043 }
        L_0x014b:
            d5.j r0 = d5.o.getLocationObject()     // Catch:{ Exception -> 0x0043 }
            int r0 = r0.getCurrentPlace()     // Catch:{ Exception -> 0x0043 }
            int r1 = com.bumptech.glide.c.N()     // Catch:{ Exception -> 0x0043 }
            if (r0 == r1) goto L_0x0171
            int r0 = com.bumptech.glide.c.N()     // Catch:{ Exception -> 0x0043 }
            if (r0 != 0) goto L_0x0171
            D2.l r0 = new D2.l     // Catch:{ Exception -> 0x0043 }
            r1 = 26
            r0.<init>(r1)     // Catch:{ Exception -> 0x0043 }
            com.bumptech.glide.c.D0(r0)     // Catch:{ Exception -> 0x0043 }
            goto L_0x0171
        L_0x016a:
            java.lang.String r1 = "Exception from try-catch block inside MainActivity in updateCurrentPlace method."
            java.lang.String r2 = "MainActivity"
            h0.C0552a.x(r0, r1, r2)
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mtma.criminal.city.activities.MainActivity.x():void");
    }

    public final void y() {
        if (this.f6980I0) {
            this.f6977G0.postDelayed(this.f6978H0, 1000);
        }
        if (this.f6975E0 != null) {
            for (int i2 = 0; i2 < this.f6975E0.getCount(); i2++) {
                if (c.T(((p) this.f6975E0.getItem(i2)).f4413c) == 0) {
                    C0612a aVar = this.f6975E0;
                    aVar.remove((p) aVar.getItem(i2));
                    GameGridView gameGridView = this.f6991R;
                    gameGridView.setNumColumns(gameGridView.f7496a - 1);
                    this.f6991R.requestLayout();
                    c.s(false, new D(15));
                }
            }
            this.f6975E0.notifyDataSetChanged();
            if (this.f6975E0.isEmpty()) {
                this.f6988O.setVisibility(4);
                this.f6988O.clearAnimation();
                this.f6991R.setVisibility(8);
                this.f6991R.clearAnimation();
                this.f6975E0.clear();
            }
        }
    }
}
