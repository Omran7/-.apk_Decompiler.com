package j4;

import android.content.Context;
import android.widget.ArrayAdapter;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import f.C0518i;
import i3.C0590f;
import i3.C0592h;
import java.util.ArrayList;
import java.util.List;
import o3.d;

public final class M0 extends ArrayAdapter {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f8918k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8919a;

    /* renamed from: b  reason: collision with root package name */
    public final List f8920b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8921c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f8922e;

    /* renamed from: f  reason: collision with root package name */
    public C0590f f8923f;
    public final int g;
    public boolean h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8924i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8925j;

    public M0(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.g = 0;
        this.h = false;
        this.f8924i = false;
        this.f8925j = false;
        this.f8919a = context;
        this.f8920b = arrayList;
        b();
    }

    public static void a(M0 m02, C0286s sVar) {
        I l6 = ((C0518i) m02.f8919a).l();
        C0269a b6 = d.b(l6, l6);
        b6.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
        a.j(b6, false);
    }

    public final void b() {
        this.f8923f = a.v(a.c(C0592h.b().e(), "players"), "stockObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x021e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r22, android.view.View r23, android.view.ViewGroup r24) {
        /*
            r21 = this;
            r6 = r21
            r3 = r22
            android.content.Context r0 = r6.f8919a
            r1 = 0
            if (r23 != 0) goto L_0x0018
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r4 = 2131493052(0x7f0c00bc, float:1.8609573E38)
            r5 = r24
            android.view.View r2 = r2.inflate(r4, r5, r1)
            r7 = r2
            goto L_0x001a
        L_0x0018:
            r7 = r23
        L_0x001a:
            r2 = 2131298137(0x7f090759, float:1.8214239E38)
            android.view.View r2 = r7.findViewById(r2)
            r8 = r2
            android.widget.RelativeLayout r8 = (android.widget.RelativeLayout) r8
            r2 = 2131298139(0x7f09075b, float:1.8214243E38)
            android.view.View r2 = r7.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r4 = 2131298138(0x7f09075a, float:1.821424E38)
            android.view.View r4 = r7.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 2131298133(0x7f090755, float:1.821423E38)
            android.view.View r5 = r7.findViewById(r5)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r9 = 2131298135(0x7f090757, float:1.8214235E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r9 = 2131298134(0x7f090756, float:1.8214233E38)
            android.view.View r9 = r7.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r10 = 2131298132(0x7f090754, float:1.8214229E38)
            android.view.View r10 = r7.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131298127(0x7f09074f, float:1.8214218E38)
            android.view.View r11 = r7.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r12 = 2131298126(0x7f09074e, float:1.8214216E38)
            android.view.View r12 = r7.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131298124(0x7f09074c, float:1.8214212E38)
            android.view.View r13 = r7.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 2131298125(0x7f09074d, float:1.8214214E38)
            android.view.View r14 = r7.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r15 = 2131298130(0x7f090752, float:1.8214224E38)
            android.view.View r15 = r7.findViewById(r15)
            androidx.constraintlayout.widget.ConstraintLayout r15 = (androidx.constraintlayout.widget.ConstraintLayout) r15
            r1 = 2131298129(0x7f090751, float:1.8214222E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r23 = r8
            r8 = 2131298131(0x7f090753, float:1.8214226E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r24 = r1
            r1 = 2131298128(0x7f090750, float:1.821422E38)
            android.view.View r1 = r7.findViewById(r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            java.lang.Object r16 = r21.getItem(r22)
            r17 = r7
            r7 = r16
            Y4.D r7 = (Y4.D) r7
            r16 = r1
            int r1 = r7.f4295c
            r10.setText(r1)
            int r1 = r7.d
            r11.setImageResource(r1)
            r1 = 4
            r5.setVisibility(r1)
            r5 = 2131165371(0x7f0700bb, float:1.7944957E38)
            r9.setImageResource(r5)
            int r5 = r6.g
            r9 = 1
            r1 = 2131888201(0x7f120849, float:1.941103E38)
            r11 = 8
            if (r5 != 0) goto L_0x00fb
            r14.setVisibility(r11)
            int r14 = r21.getCount()
            int r14 = r14 - r9
            if (r3 != r14) goto L_0x00e3
            r1 = 2131886339(0x7f120103, float:1.9407254E38)
            r13.setText(r1)
        L_0x00e0:
            r1 = r15
            goto L_0x0185
        L_0x00e3:
            com.mtma.criminal.city.app.MyApplication r14 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r14 = r14.getApplicationContext()
            int r18 = r3 + 1
            java.lang.Integer r18 = java.lang.Integer.valueOf(r18)
            java.lang.Object[] r11 = new java.lang.Object[]{r18}
            java.lang.String r1 = r14.getString(r1, r11)
            r13.setText(r1)
            goto L_0x00e0
        L_0x00fb:
            r11 = 2
            if (r5 != r11) goto L_0x015a
            int r11 = r21.getCount()
            int r11 = r11 - r9
            if (r3 != r11) goto L_0x0114
            r11 = 8
            r14.setVisibility(r11)
            r12.setVisibility(r11)
            r1 = 2131886340(0x7f120104, float:1.9407256E38)
            r13.setText(r1)
            goto L_0x00e0
        L_0x0114:
            r9 = 0
            r11 = 8
            r14.setVisibility(r9)
            r12.setVisibility(r9)
            int r9 = r7.h
            if (r9 != 0) goto L_0x013f
            r12.setVisibility(r11)
            r14.setVisibility(r11)
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            int r11 = r3 + 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.String r1 = r9.getString(r1, r11)
            r13.setText(r1)
            goto L_0x00e0
        L_0x013f:
            r1 = 0
            r12.setVisibility(r1)
            r14.setVisibility(r1)
            r1 = r15
            long r14 = r7.f4297f
            java.lang.String r9 = com.mtma.criminal.city.utils.U.a(r14)
            r13.setText(r9)
            int r9 = r7.h
            java.lang.String r9 = K1.e.l0(r9)
            r12.setText(r9)
            goto L_0x0185
        L_0x015a:
            r1 = r15
            r9 = 5
            if (r5 == r9) goto L_0x0168
            r9 = 3
            if (r5 != r9) goto L_0x0162
            goto L_0x0168
        L_0x0162:
            r9 = 8
            r14.setVisibility(r9)
            goto L_0x0185
        L_0x0168:
            int r9 = r7.f4294b
            r11 = 9
            if (r9 != r11) goto L_0x0178
            long r14 = r7.f4297f
            java.lang.String r9 = com.mtma.criminal.city.utils.U.a(r14)
            r13.setText(r9)
            goto L_0x0185
        L_0x0178:
            long r14 = r7.f4297f
            r19 = 2
            long r14 = r14 / r19
            java.lang.String r9 = com.mtma.criminal.city.utils.U.a(r14)
            r13.setText(r9)
        L_0x0185:
            r9 = 2131165393(0x7f0700d1, float:1.7945002E38)
            if (r5 != 0) goto L_0x018e
            boolean r11 = r7.f4305p
            if (r11 != 0) goto L_0x01a0
        L_0x018e:
            r11 = 2
            if (r5 != r11) goto L_0x01aa
            int r11 = r21.getCount()
            r13 = 1
            int r11 = r11 - r13
            if (r3 == r11) goto L_0x01aa
            int r11 = r7.d
            r13 = 2131166862(0x7f07068e, float:1.7947981E38)
            if (r11 == r13) goto L_0x01aa
        L_0x01a0:
            r11 = 2131886306(0x7f1200e2, float:1.9407187E38)
            r2.setText(r11)
            r4.setImageResource(r9)
            goto L_0x01d1
        L_0x01aa:
            r11 = 2131165341(0x7f07009d, float:1.7944896E38)
            r13 = 5
            if (r5 != r13) goto L_0x01c8
            boolean r13 = r7.f4302m
            if (r13 == 0) goto L_0x01be
            r11 = 2131886293(0x7f1200d5, float:1.940716E38)
            r2.setText(r11)
            r4.setImageResource(r9)
            goto L_0x01d1
        L_0x01be:
            r9 = 2131886314(0x7f1200ea, float:1.9407203E38)
            r2.setText(r9)
            r4.setImageResource(r11)
            goto L_0x01d1
        L_0x01c8:
            r9 = 2131886240(0x7f1200a0, float:1.9407053E38)
            r2.setText(r9)
            r4.setImageResource(r11)
        L_0x01d1:
            if (r5 == 0) goto L_0x01d9
            r2 = 2
            if (r5 != r2) goto L_0x01d7
            goto L_0x01d9
        L_0x01d7:
            r0 = 1
            goto L_0x0200
        L_0x01d9:
            int r2 = r21.getCount()
            r4 = 1
            int r2 = r2 - r4
            if (r3 != r2) goto L_0x01f0
            r2 = 0
            r8.setVisibility(r2)
            android.content.res.Resources r2 = r0.getResources()
            r4 = 2131034927(0x7f05032f, float:1.7680385E38)
            com.google.android.gms.internal.measurement.a.i(r0, r2, r4, r10)
            goto L_0x01d7
        L_0x01f0:
            r2 = 8
            r8.setVisibility(r2)
            android.content.res.Resources r2 = r0.getResources()
            r4 = 2131034940(0x7f05033c, float:1.7680412E38)
            com.google.android.gms.internal.measurement.a.i(r0, r2, r4, r10)
            goto L_0x01d7
        L_0x0200:
            if (r5 == r0) goto L_0x020b
            r0 = 4
            if (r5 == r0) goto L_0x020b
            r0 = 5
            if (r5 == r0) goto L_0x020b
            r0 = 3
            if (r5 != r0) goto L_0x0214
        L_0x020b:
            int r0 = r7.h
            java.lang.String r0 = K1.e.l0(r0)
            r12.setText(r0)
        L_0x0214:
            int r0 = r7.f4298i
            if (r0 != 0) goto L_0x021e
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x022d
        L_0x021e:
            r0 = 0
            r1.setVisibility(r0)
            int r0 = r7.f4298i
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = r24
            r1.setText(r0)
        L_0x022d:
            j4.f0 r0 = new j4.f0
            r1 = 14
            r2 = r16
            r0.<init>(r6, r2, r7, r1)
            r2.setOnClickListener(r0)
            K4.j r8 = new K4.j
            r5 = 17
            r0 = r8
            r1 = r21
            r2 = r23
            r3 = r22
            r4 = r7
            r0.<init>((java.lang.Object) r1, (android.widget.RelativeLayout) r2, (int) r3, (java.lang.Object) r4, (int) r5)
            r2.setOnClickListener(r8)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.M0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public M0(Context context, List list, int i2) {
        super(context, 0, list);
        this.h = false;
        this.f8924i = false;
        this.f8925j = false;
        this.f8919a = context;
        this.f8920b = list;
        this.g = i2;
        b();
    }

    public M0(Context context, List list, int i2, int i5) {
        super(context, 0, list);
        this.h = false;
        this.f8924i = false;
        this.f8925j = false;
        this.f8919a = context;
        this.f8920b = list;
        this.g = i2;
        this.f8921c = i5;
        b();
    }

    public M0(Context context, List list, String str, String str2) {
        super(context, 0, list);
        this.h = false;
        this.f8924i = false;
        this.f8925j = false;
        this.f8919a = context;
        this.f8920b = list;
        this.g = 5;
        this.d = str;
        this.f8922e = str2;
        b();
    }
}
