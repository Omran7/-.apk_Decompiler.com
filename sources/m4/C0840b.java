package m4;

import I1.b;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.mtma.criminal.city.activities.MainActivity;
import it.sephiroth.android.library.widget.HListView;
import java.util.Calendar;
import java.util.TimeZone;
import k.C0737s0;

/* renamed from: m4.b  reason: case insensitive filesystem */
public final class C0840b extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f10166d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f10167e0;

    /* renamed from: f0  reason: collision with root package name */
    public final long f10168f0;

    /* renamed from: g0  reason: collision with root package name */
    public final long f10169g0;

    /* renamed from: h0  reason: collision with root package name */
    public View f10170h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f10171i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f10172j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f10173k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f10174l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextView f10175m0;

    /* renamed from: n0  reason: collision with root package name */
    public TextView f10176n0;

    /* renamed from: o0  reason: collision with root package name */
    public ImageView f10177o0;

    /* renamed from: p0  reason: collision with root package name */
    public HListView f10178p0;

    /* renamed from: q0  reason: collision with root package name */
    public ConstraintLayout f10179q0;

    /* renamed from: r0  reason: collision with root package name */
    public RelativeLayout f10180r0;
    public RelativeLayout s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f10181t0;

    /* renamed from: u0  reason: collision with root package name */
    public Handler f10182u0;

    /* renamed from: v0  reason: collision with root package name */
    public C0737s0 f10183v0;

    public C0840b(MainActivity mainActivity, int i2, long j6, long j7) {
        this.f10166d0 = mainActivity;
        this.f10167e0 = i2;
        this.f10168f0 = j6;
        this.f10169g0 = j7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0104, code lost:
        if (r2 != 2) goto L_0x0122;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View C(android.view.LayoutInflater r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            r0 = 2131492938(0x7f0c004a, float:1.8609342E38)
            r1 = 0
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r6.f10170h0 = r7
            r8 = 2131296783(0x7f09020f, float:1.8211492E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f10171i0 = r7
            android.view.View r7 = r6.f10170h0
            r8 = 2131296774(0x7f090206, float:1.8211474E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f10172j0 = r7
            android.view.View r7 = r6.f10170h0
            r8 = 2131296782(0x7f09020e, float:1.821149E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f10173k0 = r7
            android.view.View r7 = r6.f10170h0
            r8 = 2131296772(0x7f090204, float:1.821147E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f10174l0 = r7
            android.view.View r7 = r6.f10170h0
            r8 = 2131296777(0x7f090209, float:1.821148E38)
            android.view.View r7 = r7.findViewById(r8)
            it.sephiroth.android.library.widget.HListView r7 = (it.sephiroth.android.library.widget.HListView) r7
            r6.f10178p0 = r7
            android.view.View r7 = r6.f10170h0
            r8 = 2131296778(0x7f09020a, float:1.8211482E38)
            android.view.View r7 = r7.findViewById(r8)
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r6.f10179q0 = r7
            android.view.View r7 = r6.f10170h0
            r8 = 2131296771(0x7f090203, float:1.8211468E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f10175m0 = r7
            android.view.View r7 = r6.f10170h0
            r8 = 2131296781(0x7f09020d, float:1.8211488E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f10176n0 = r7
            android.view.View r7 = r6.f10170h0
            r8 = 2131296780(0x7f09020c, float:1.8211486E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f10177o0 = r7
            android.view.View r7 = r6.f10170h0
            r8 = 2131296779(0x7f09020b, float:1.8211484E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r6.f10180r0 = r7
            android.view.View r7 = r6.f10170h0
            r8 = 2131296769(0x7f090201, float:1.8211464E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r6.s0 = r7
            android.os.Handler r7 = new android.os.Handler
            r7.<init>()
            r6.f10182u0 = r7
            k.s0 r7 = new k.s0
            r8 = 9
            r7.<init>(r6, r8)
            r6.f10183v0 = r7
            it.sephiroth.android.library.widget.HListView r7 = r6.f10178p0
            android.view.ViewTreeObserver r7 = r7.getViewTreeObserver()
            K4.e r8 = new K4.e
            r0 = 9
            r8.<init>(r6, r0)
            r7.addOnGlobalLayoutListener(r8)
            android.widget.TextView r7 = r6.f10171i0
            r8 = 2
            r0 = 1
            int r2 = r6.f10167e0
            if (r2 == 0) goto L_0x00cf
            if (r2 == r0) goto L_0x00cb
            if (r2 == r8) goto L_0x00c7
            r3 = 2131886116(0x7f120024, float:1.9406802E38)
            goto L_0x00d2
        L_0x00c7:
            r3 = 2131886117(0x7f120025, float:1.9406804E38)
            goto L_0x00d2
        L_0x00cb:
            r3 = 2131886124(0x7f12002c, float:1.9406818E38)
            goto L_0x00d2
        L_0x00cf:
            r3 = 2131886118(0x7f120026, float:1.9406806E38)
        L_0x00d2:
            r7.setText(r3)
            android.widget.TextView r7 = r6.f10172j0
            r3 = 0
            if (r2 == 0) goto L_0x00ee
            if (r2 == r0) goto L_0x00e0
            if (r2 == r8) goto L_0x00ee
            r4 = r3
            goto L_0x00fb
        L_0x00e0:
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            r5 = 2131886122(0x7f12002a, float:1.9406814E38)
            java.lang.String r4 = r4.getString(r5)
            goto L_0x00fb
        L_0x00ee:
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            r5 = 2131886131(0x7f120033, float:1.9406832E38)
            java.lang.String r4 = r4.getString(r5)
        L_0x00fb:
            r7.setText(r4)
            android.widget.TextView r7 = r6.f10174l0
            if (r2 == 0) goto L_0x0115
            if (r2 == r0) goto L_0x0107
            if (r2 == r8) goto L_0x0115
            goto L_0x0122
        L_0x0107:
            com.mtma.criminal.city.app.MyApplication r8 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r8 = r8.getApplicationContext()
            r3 = 2131886123(0x7f12002b, float:1.9406816E38)
            java.lang.String r3 = r8.getString(r3)
            goto L_0x0122
        L_0x0115:
            com.mtma.criminal.city.app.MyApplication r8 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r8 = r8.getApplicationContext()
            r3 = 2131886132(0x7f120034, float:1.9406834E38)
            java.lang.String r3 = r8.getString(r3)
        L_0x0122:
            r7.setText(r3)
            if (r2 != r0) goto L_0x015d
            long r7 = com.bumptech.glide.c.f5744o
            boolean r7 = I1.b.l0(r2, r7)
            if (r7 == 0) goto L_0x015d
            R2.b.w(r0)
            i3.h r7 = i3.C0592h.d()
            i3.f r7 = r7.e()
            java.lang.String r8 = "activitiesTempData"
            i3.f r7 = com.google.android.gms.internal.measurement.a.x(r7, r8)
            java.lang.String r8 = I1.b.y(r2)
            i3.f r7 = r7.E(r8)
            d5.a r8 = d5.o.getAccountObject()
            java.lang.String r8 = r8.getId()
            i3.f r7 = r7.E(r8)
            k.m r8 = new k.m
            r3 = 5
            r8.<init>(r6, r3)
            r7.d(r8)
        L_0x015d:
            if (r2 != r0) goto L_0x018c
            long r7 = com.bumptech.glide.c.f5744o
            r2 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r2
            long r2 = r6.f10169g0
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x018c
            android.widget.RelativeLayout r7 = r6.f10180r0
            r7.setVisibility(r1)
            android.widget.ImageView r7 = r6.f10177o0
            r8 = 2131165392(0x7f0700d0, float:1.7945E38)
            r7.setImageResource(r8)
            android.widget.TextView r7 = r6.f10176n0
            com.mtma.criminal.city.app.MyApplication r8 = com.mtma.criminal.city.app.MyApplication.f7090a
            r0 = 2131886304(0x7f1200e0, float:1.9407183E38)
            com.google.android.gms.internal.measurement.a.o(r8, r0, r7)
            android.widget.RelativeLayout r7 = r6.f10180r0
            m4.a r8 = new m4.a
            r0 = 0
            r8.<init>(r6, r7, r0)
            r7.setOnClickListener(r8)
        L_0x018c:
            android.widget.RelativeLayout r7 = r6.s0
            m4.a r8 = new m4.a
            r0 = 1
            r8.<init>(r6, r7, r0)
            r7.setOnClickListener(r8)
            android.view.View r7 = r6.f10170h0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.C0840b.C(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public final void H() {
        this.f5157L = true;
        this.f10182u0.removeCallbacks(this.f10183v0);
    }

    public final void I() {
        this.f5157L = true;
        V();
    }

    public final void V() {
        String str;
        if (b.l0(this.f10167e0, c.f5744o)) {
            TextView textView = this.f10173k0;
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            instance.setTimeInMillis(this.f10169g0);
            long timeInMillis = (instance.getTimeInMillis() / 1000) - c.f5744o;
            if (timeInMillis <= 0) {
                str = "00:00:00";
            } else {
                str = String.format("%02d:%02d:%02d", new Object[]{Long.valueOf(timeInMillis / 3600), Long.valueOf((timeInMillis % 3600) / 60), Long.valueOf(timeInMillis % 60)});
            }
            textView.setText(str);
            this.f10182u0.postDelayed(this.f10183v0, 1000);
        }
    }
}
