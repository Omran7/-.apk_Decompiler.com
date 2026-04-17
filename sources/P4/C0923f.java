package p4;

import Y4.D;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import j4.C0640p;
import java.util.ArrayList;

/* renamed from: p4.f  reason: case insensitive filesystem */
public final class C0923f extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f11013d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f11014e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f11015f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f11016g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f11017h0;

    /* renamed from: i0  reason: collision with root package name */
    public ImageView f11018i0;

    /* renamed from: j0  reason: collision with root package name */
    public ImageView f11019j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f11020k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f11021l0;

    /* renamed from: m0  reason: collision with root package name */
    public SeekBar f11022m0;

    /* renamed from: n0  reason: collision with root package name */
    public ListView f11023n0;

    /* renamed from: o0  reason: collision with root package name */
    public RelativeLayout f11024o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f11025p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f11026q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f11027r0;
    public D s0;

    /* renamed from: t0  reason: collision with root package name */
    public ArrayList f11028t0;

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayList f11029u0 = new ArrayList();

    /* renamed from: v0  reason: collision with root package name */
    public C0640p f11030v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f11031w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f11032x0 = false;

    public C0923f(int i2, int i5, Context context) {
        this.f11013d0 = context;
        this.f11014e0 = i2;
        this.f11015f0 = i5;
    }

    public static void V(C0923f fVar) {
        if (fVar.W() < fVar.f11025p0) {
            fVar.f11026q0 = 0;
            fVar.f11027r0 = 0;
            fVar.f11018i0.setImageResource(R.drawable.button_gray);
            fVar.f11021l0.setText(R.string.zero);
            fVar.f11022m0.setProgress(0);
            return;
        }
        fVar.f11026q0 = c.P(fVar.f11014e0, fVar.f11015f0, fVar.W());
        int W5 = fVar.W();
        int i2 = fVar.f11025p0;
        fVar.f11027r0 = (W5 / i2) * i2;
        fVar.f11018i0.setImageResource(R.drawable.button_blue);
        fVar.f11021l0.setText(String.valueOf(fVar.f11026q0));
        fVar.f11022m0.setProgress(100);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x028d, code lost:
        if (r13 == 1) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0293, code lost:
        if (r13 == 0) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x029a, code lost:
        if (r13 != 1) goto L_0x02ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0206 A[LOOP:0: B:58:0x01fe->B:60:0x0206, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View C(android.view.LayoutInflater r12, android.view.ViewGroup r13) {
        /*
            r11 = this;
            r0 = 2131492947(0x7f0c0053, float:1.860936E38)
            r1 = 0
            android.view.View r12 = r12.inflate(r0, r13, r1)
            r11.f11016g0 = r12
            r13 = 2131296873(0x7f090269, float:1.8211675E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.f11020k0 = r12
            android.view.View r12 = r11.f11016g0
            r13 = 2131296867(0x7f090263, float:1.8211663E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r11.f11019j0 = r12
            android.view.View r12 = r11.f11016g0
            r13 = 2131296866(0x7f090262, float:1.821166E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.f11021l0 = r12
            android.view.View r12 = r11.f11016g0
            r13 = 2131296872(0x7f090268, float:1.8211673E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.SeekBar r12 = (android.widget.SeekBar) r12
            r11.f11022m0 = r12
            android.view.View r12 = r11.f11016g0
            r13 = 2131296864(0x7f090260, float:1.8211657E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r11.f11018i0 = r12
            android.view.View r12 = r11.f11016g0
            r13 = 2131296863(0x7f09025f, float:1.8211655E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.RelativeLayout r12 = (android.widget.RelativeLayout) r12
            r11.f11017h0 = r12
            android.view.View r12 = r11.f11016g0
            r13 = 2131296868(0x7f090264, float:1.8211665E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.ListView r12 = (android.widget.ListView) r12
            r11.f11023n0 = r12
            android.view.View r12 = r11.f11016g0
            r13 = 2131296861(0x7f09025d, float:1.821165E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.RelativeLayout r12 = (android.widget.RelativeLayout) r12
            r11.f11024o0 = r12
            r12 = 1
            int r13 = r11.f11015f0
            int r0 = r11.f11014e0
            r2 = 2
            if (r0 != r2) goto L_0x0082
            if (r13 != 0) goto L_0x007d
            r3 = 500(0x1f4, float:7.0E-43)
            goto L_0x0083
        L_0x007d:
            if (r13 != r12) goto L_0x0082
            r3 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0083
        L_0x0082:
            r3 = r12
        L_0x0083:
            r11.f11025p0 = r3
            r3 = 0
            r4 = 3
            r5 = 4
            if (r0 != 0) goto L_0x0099
            Y4.D r6 = new Y4.D
            r7 = 2131887492(0x7f120584, float:1.9409593E38)
            r8 = 2131166507(0x7f07052b, float:1.7947261E38)
            r9 = 2131887491(0x7f120583, float:1.940959E38)
            r6.<init>(r9, r7, r8)
            goto L_0x00ee
        L_0x0099:
            if (r0 != r12) goto L_0x00aa
            Y4.D r6 = new Y4.D
            r7 = 2131886434(0x7f120162, float:1.9407447E38)
            r8 = 2131166511(0x7f07052f, float:1.794727E38)
            r9 = 2131886436(0x7f120164, float:1.940745E38)
            r6.<init>(r9, r7, r8)
            goto L_0x00ee
        L_0x00aa:
            if (r0 != r2) goto L_0x00be
            if (r13 != 0) goto L_0x00b5
            r6 = 30017(0x7541, float:4.2063E-41)
            Y4.D r6 = Y4.D.s(r6, r1, r12)
            goto L_0x00ee
        L_0x00b5:
            if (r13 != r12) goto L_0x00ed
            r6 = 30018(0x7542, float:4.2064E-41)
            Y4.D r6 = Y4.D.s(r6, r1, r12)
            goto L_0x00ee
        L_0x00be:
            if (r0 != r4) goto L_0x00ed
            if (r13 != 0) goto L_0x00c9
            r6 = 5001(0x1389, float:7.008E-42)
            Y4.D r6 = Y4.D.s(r6, r1, r12)
            goto L_0x00ee
        L_0x00c9:
            if (r13 != r12) goto L_0x00d2
            r6 = 5002(0x138a, float:7.009E-42)
            Y4.D r6 = Y4.D.s(r6, r1, r12)
            goto L_0x00ee
        L_0x00d2:
            if (r13 != r2) goto L_0x00db
            r6 = 5003(0x138b, float:7.01E-42)
            Y4.D r6 = Y4.D.s(r6, r1, r12)
            goto L_0x00ee
        L_0x00db:
            if (r13 != r4) goto L_0x00e4
            r6 = 5004(0x138c, float:7.012E-42)
            Y4.D r6 = Y4.D.s(r6, r1, r12)
            goto L_0x00ee
        L_0x00e4:
            if (r13 != r5) goto L_0x00ed
            r6 = 5005(0x138d, float:7.013E-42)
            Y4.D r6 = Y4.D.s(r6, r1, r12)
            goto L_0x00ee
        L_0x00ed:
            r6 = r3
        L_0x00ee:
            r11.s0 = r6
            if (r0 != 0) goto L_0x013e
            if (r13 != 0) goto L_0x012c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 301(0x12d, float:4.22E-43)
            r8 = 303(0x12f, float:4.25E-43)
            r9 = 305(0x131, float:4.27E-43)
            r10 = 307(0x133, float:4.3E-43)
            o3.d.h(r7, r6, r8, r9, r10)
            r7 = 309(0x135, float:4.33E-43)
            r8 = 311(0x137, float:4.36E-43)
            r9 = 313(0x139, float:4.39E-43)
            r10 = 315(0x13b, float:4.41E-43)
            o3.d.h(r7, r6, r8, r9, r10)
            r7 = 317(0x13d, float:4.44E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            r7 = 319(0x13f, float:4.47E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            r7 = 321(0x141, float:4.5E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            goto L_0x01fb
        L_0x012c:
            if (r13 != r12) goto L_0x01fa
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 4001(0xfa1, float:5.607E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            goto L_0x01fb
        L_0x013e:
            if (r0 != r12) goto L_0x017a
            if (r13 != 0) goto L_0x01fa
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 302(0x12e, float:4.23E-43)
            r8 = 304(0x130, float:4.26E-43)
            r9 = 306(0x132, float:4.29E-43)
            r10 = 308(0x134, float:4.32E-43)
            o3.d.h(r7, r6, r8, r9, r10)
            r7 = 310(0x136, float:4.34E-43)
            r8 = 312(0x138, float:4.37E-43)
            r9 = 314(0x13a, float:4.4E-43)
            r10 = 316(0x13c, float:4.43E-43)
            o3.d.h(r7, r6, r8, r9, r10)
            r7 = 318(0x13e, float:4.46E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            r7 = 320(0x140, float:4.48E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            r7 = 322(0x142, float:4.51E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            goto L_0x01fb
        L_0x017a:
            if (r0 != r2) goto L_0x019f
            if (r13 != 0) goto L_0x018e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 4002(0xfa2, float:5.608E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            goto L_0x01fb
        L_0x018e:
            if (r13 != r12) goto L_0x01fa
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 4003(0xfa3, float:5.61E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            goto L_0x01fb
        L_0x019f:
            if (r0 != r4) goto L_0x01fa
            r6 = 403(0x193, float:5.65E-43)
            r7 = 414(0x19e, float:5.8E-43)
            r8 = 407(0x197, float:5.7E-43)
            if (r13 != 0) goto L_0x01b5
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = 412(0x19c, float:5.77E-43)
            o3.d.h(r8, r9, r7, r6, r10)
            r6 = r9
            goto L_0x01fb
        L_0x01b5:
            r9 = 415(0x19f, float:5.82E-43)
            if (r13 != r12) goto L_0x01c8
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 411(0x19b, float:5.76E-43)
            r8 = 405(0x195, float:5.68E-43)
            r10 = 410(0x19a, float:5.75E-43)
            o3.d.h(r7, r6, r9, r8, r10)
            goto L_0x01fb
        L_0x01c8:
            if (r13 != r2) goto L_0x01d7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 418(0x1a2, float:5.86E-43)
            r10 = 402(0x192, float:5.63E-43)
            o3.d.h(r8, r6, r7, r9, r10)
            goto L_0x01fb
        L_0x01d7:
            if (r13 != r4) goto L_0x01e9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 406(0x196, float:5.69E-43)
            r9 = 409(0x199, float:5.73E-43)
            r10 = 413(0x19d, float:5.79E-43)
            o3.d.h(r8, r7, r9, r10, r6)
            r6 = r7
            goto L_0x01fb
        L_0x01e9:
            if (r13 != r5) goto L_0x01fa
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r8 = 401(0x191, float:5.62E-43)
            r9 = 416(0x1a0, float:5.83E-43)
            r10 = 417(0x1a1, float:5.84E-43)
            o3.d.h(r8, r6, r9, r10, r7)
            goto L_0x01fb
        L_0x01fa:
            r6 = r3
        L_0x01fb:
            r11.f11028t0 = r6
            r6 = r1
        L_0x01fe:
            java.util.ArrayList r7 = r11.f11028t0
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x021e
            java.util.ArrayList r7 = r11.f11029u0
            java.util.ArrayList r8 = r11.f11028t0
            java.lang.Object r8 = r8.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            Y4.D r8 = Y4.D.s(r8, r1, r1)
            r7.add(r8)
            int r6 = r6 + 1
            goto L_0x01fe
        L_0x021e:
            android.widget.TextView r1 = r11.f11020k0
            if (r0 != 0) goto L_0x022e
            if (r13 != 0) goto L_0x0228
            r6 = 2131886225(0x7f120091, float:1.9407023E38)
            goto L_0x025e
        L_0x0228:
            if (r13 != r12) goto L_0x025d
            r6 = 2131886223(0x7f12008f, float:1.9407019E38)
            goto L_0x025e
        L_0x022e:
            if (r0 != r12) goto L_0x0236
            if (r13 != 0) goto L_0x025d
            r6 = 2131886218(0x7f12008a, float:1.9407009E38)
            goto L_0x025e
        L_0x0236:
            if (r0 != r2) goto L_0x0242
            if (r13 != 0) goto L_0x023d
            int r6 = i4.C0597b.f8522k0
            goto L_0x025e
        L_0x023d:
            if (r13 != r12) goto L_0x025d
            int r6 = i4.C0597b.f8549o0
            goto L_0x025e
        L_0x0242:
            if (r0 != r4) goto L_0x025d
            if (r13 != 0) goto L_0x0249
            int r6 = i4.C0597b.a7
            goto L_0x025e
        L_0x0249:
            if (r13 != r12) goto L_0x024e
            int r6 = i4.C0597b.d7
            goto L_0x025e
        L_0x024e:
            if (r13 != r2) goto L_0x0253
            int r6 = i4.C0597b.g7
            goto L_0x025e
        L_0x0253:
            if (r13 != r4) goto L_0x0258
            int r6 = i4.C0597b.j7
            goto L_0x025e
        L_0x0258:
            if (r13 != r5) goto L_0x025d
            int r6 = i4.C0597b.m7
            goto L_0x025e
        L_0x025d:
            r6 = -1
        L_0x025e:
            r1.setText(r6)
            android.widget.ImageView r1 = r11.f11019j0
            Y4.D r6 = r11.s0
            int r6 = r6.d
            r1.setImageResource(r6)
            R2.b.w(r12)
            i3.h r1 = i3.C0592h.b()
            i3.f r1 = r1.e()
            java.lang.String r6 = "players"
            i3.f r1 = com.google.android.gms.internal.measurement.a.c(r1, r6)
            java.lang.String r6 = "stockObject"
            java.lang.String r7 = "itemsInStock"
            i3.f r1 = com.google.android.gms.internal.measurement.a.d(r1, r6, r7)
            java.lang.String r6 = "pieces"
            java.lang.String r7 = "flowers"
            if (r0 != 0) goto L_0x0291
            if (r13 != 0) goto L_0x028d
        L_0x028b:
            r3 = r7
            goto L_0x02ab
        L_0x028d:
            if (r13 != r12) goto L_0x02ab
        L_0x028f:
            r3 = r6
            goto L_0x02ab
        L_0x0291:
            if (r0 != r12) goto L_0x0296
            if (r13 != 0) goto L_0x02ab
            goto L_0x028b
        L_0x0296:
            if (r0 != r2) goto L_0x029d
            if (r13 == 0) goto L_0x028f
            if (r13 != r12) goto L_0x02ab
            goto L_0x028f
        L_0x029d:
            if (r0 != r4) goto L_0x02ab
            if (r13 == 0) goto L_0x02a9
            if (r13 == r12) goto L_0x02a9
            if (r13 == r2) goto L_0x02a9
            if (r13 == r4) goto L_0x02a9
            if (r13 != r5) goto L_0x02ab
        L_0x02a9:
            java.lang.String r3 = "food"
        L_0x02ab:
            i3.f r12 = r1.E(r3)
            k.m r13 = new k.m
            r0 = 10
            r13.<init>(r11, r0)
            r12.d(r13)
            android.widget.ImageView r12 = r11.f11019j0
            p4.e r13 = new p4.e
            r0 = 1
            r13.<init>(r11, r12, r0)
            r12.setOnClickListener(r13)
            android.widget.RelativeLayout r12 = r11.f11017h0
            p4.e r13 = new p4.e
            r0 = 0
            r13.<init>(r11, r12, r0)
            r12.setOnClickListener(r13)
            android.widget.RelativeLayout r12 = r11.f11024o0
            p4.e r13 = new p4.e
            r0 = 2
            r13.<init>(r11, r12, r0)
            r12.setOnClickListener(r13)
            android.view.View r12 = r11.f11016g0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.C0923f.C(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public final int W() {
        ArrayList arrayList = this.f11029u0;
        int i2 = ((D) arrayList.get(0)).h;
        for (int i5 = 1; i5 < arrayList.size(); i5++) {
            if (((D) arrayList.get(i5)).h == 0) {
                return 0;
            }
            if (((D) arrayList.get(i5)).h < i2) {
                i2 = ((D) arrayList.get(i5)).h;
            }
        }
        return i2;
    }
}
