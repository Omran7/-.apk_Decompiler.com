package j4;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

/* renamed from: j4.c0  reason: case insensitive filesystem */
public final class C0617c0 extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8984a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8985b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8986c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f8987e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8988f;
    public boolean g = false;

    public C0617c0(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.f8984a = context;
        this.f8988f = 1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
        /*
            r16 = this;
            r6 = r16
            r0 = 0
            if (r18 != 0) goto L_0x0016
            android.content.Context r1 = r6.f8984a
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131493021(0x7f0c009d, float:1.860951E38)
            r3 = r19
            android.view.View r1 = r1.inflate(r2, r3, r0)
            r7 = r1
            goto L_0x0018
        L_0x0016:
            r7 = r18
        L_0x0018:
            r1 = 2131297922(0x7f090682, float:1.8213803E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 2131297921(0x7f090681, float:1.82138E38)
            android.view.View r2 = r7.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131297913(0x7f090679, float:1.8213784E38)
            android.view.View r3 = r7.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131297916(0x7f09067c, float:1.821379E38)
            android.view.View r4 = r7.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 2131297918(0x7f09067e, float:1.8213794E38)
            android.view.View r5 = r7.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r8 = 2131297919(0x7f09067f, float:1.8213797E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131297925(0x7f090685, float:1.8213809E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131297912(0x7f090678, float:1.8213782E38)
            android.view.View r10 = r7.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131297915(0x7f09067b, float:1.8213788E38)
            android.view.View r11 = r7.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r11 = 2131297923(0x7f090683, float:1.8213805E38)
            android.view.View r11 = r7.findViewById(r11)
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            r12 = 2131297926(0x7f090686, float:1.821381E38)
            android.view.View r12 = r7.findViewById(r12)
            androidx.constraintlayout.widget.ConstraintLayout r12 = (androidx.constraintlayout.widget.ConstraintLayout) r12
            r13 = 2131297920(0x7f090680, float:1.8213799E38)
            android.view.View r13 = r7.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r14 = 2131297917(0x7f09067d, float:1.8213792E38)
            android.view.View r14 = r7.findViewById(r14)
            android.widget.RelativeLayout r14 = (android.widget.RelativeLayout) r14
            java.lang.Object r15 = r16.getItem(r17)
            Y4.C r15 = (Y4.C) r15
            int r0 = r15.f4286b
            r1.setText(r0)
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r0 = r0.getApplicationContext()
            int r1 = r15.f4285a
            int r1 = com.bumptech.glide.c.B(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r18 = r7
            int r7 = r15.f4287c
            java.lang.String r0 = r0.getString(r7, r1)
            r3.setText(r0)
            int r0 = r15.d
            r4.setImageResource(r0)
            r0 = 1
            int r1 = r6.f8988f
            if (r1 != r0) goto L_0x00d0
            r0 = 0
            r13.setVisibility(r0)
            int r0 = r15.f4288e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.setText(r0)
            goto L_0x015d
        L_0x00d0:
            r0 = 0
            if (r1 != 0) goto L_0x015d
            r1 = 4
            r12.setVisibility(r1)
            r11.setVisibility(r0)
            r13.setVisibility(r0)
            d5.g r0 = d5.o.getGangObject()
            int r0 = r0.getPosition()
            if (r0 != 0) goto L_0x011c
            int r0 = r15.f4288e
            int r3 = r6.f8985b
            switch(r3) {
                case 2: goto L_0x00fd;
                case 3: goto L_0x00fc;
                case 4: goto L_0x00f9;
                case 5: goto L_0x00f6;
                case 6: goto L_0x00f3;
                case 7: goto L_0x00f0;
                default: goto L_0x00ee;
            }
        L_0x00ee:
            r1 = 2
            goto L_0x00fd
        L_0x00f0:
            r1 = 16
            goto L_0x00fd
        L_0x00f3:
            r1 = 15
            goto L_0x00fd
        L_0x00f6:
            r1 = 10
            goto L_0x00fd
        L_0x00f9:
            r1 = 8
            goto L_0x00fd
        L_0x00fc:
            r1 = 6
        L_0x00fd:
            if (r0 >= r1) goto L_0x011c
            long r3 = r6.f8987e
            long r0 = com.bumptech.glide.c.M(r0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x011c
            long r0 = r6.d
            int r3 = r15.f4288e
            long r3 = com.bumptech.glide.c.L(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x011c
            r0 = 2131165341(0x7f07009d, float:1.7944896E38)
            r5.setImageResource(r0)
            goto L_0x0122
        L_0x011c:
            r0 = 2131165371(0x7f0700bb, float:1.7944957E38)
            r5.setImageResource(r0)
        L_0x0122:
            int r0 = r15.f4288e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.setText(r0)
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            r1 = 2131886285(0x7f1200cd, float:1.9407145E38)
            com.google.android.gms.internal.measurement.a.o(r0, r1, r8)
            int r0 = r15.f4288e
            long r0 = com.bumptech.glide.c.M(r0)
            java.lang.String r0 = com.mtma.criminal.city.utils.U.a(r0)
            r9.setText(r0)
            int r0 = r15.f4288e
            long r0 = com.bumptech.glide.c.L(r0)
            java.lang.String r0 = com.mtma.criminal.city.utils.U.a(r0)
            r10.setText(r0)
            K4.j r7 = new K4.j
            r5 = 7
            r0 = r7
            r1 = r16
            r2 = r14
            r3 = r15
            r4 = r17
            r0.<init>((android.widget.ArrayAdapter) r1, (android.widget.RelativeLayout) r2, (java.lang.Object) r3, (int) r4, (int) r5)
            r14.setOnClickListener(r7)
        L_0x015d:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C0617c0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C0617c0(Context context, ArrayList arrayList, int i2, long j6, long j7, long j8) {
        super(context, 0, arrayList);
        this.f8984a = context;
        this.f8985b = i2;
        this.f8987e = j6;
        this.d = j7;
        this.f8986c = j8;
        this.f8988f = 0;
    }
}
