package p4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.activities.MainActivity;

/* renamed from: p4.a  reason: case insensitive filesystem */
public final class C0918a extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f10994d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Context f10995e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f10996f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f10997g0;

    /* renamed from: h0  reason: collision with root package name */
    public ViewGroup f10998h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f10999i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f11000j0;

    public /* synthetic */ C0918a(int i2, int i5, Context context) {
        this.f10994d0 = i5;
        this.f10995e0 = context;
        this.f11000j0 = i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c9, code lost:
        com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View C(android.view.LayoutInflater r23, android.view.ViewGroup r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            int r3 = r0.f10994d0
            switch(r3) {
                case 0: goto L_0x0be6;
                case 1: goto L_0x08ef;
                case 2: goto L_0x07bf;
                default: goto L_0x000b;
            }
        L_0x000b:
            r3 = 2131492971(0x7f0c006b, float:1.8609409E38)
            r4 = 0
            android.view.View r1 = r1.inflate(r3, r2, r4)
            r0.f10996f0 = r1
            r2 = 2131297252(0x7f0903e4, float:1.8212444E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f10997g0 = r1
            android.view.View r1 = r0.f10996f0
            r2 = 2131297253(0x7f0903e5, float:1.8212446E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f10998h0 = r1
            android.view.View r1 = r0.f10996f0
            r2 = 2131297251(0x7f0903e3, float:1.8212442E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r0.f10999i0 = r1
            android.widget.TextView r1 = r0.f10997g0
            int r2 = r0.f11000j0
            int r3 = I1.b.D(r2)
            r1.setText(r3)
            java.util.ArrayList r1 = I1.b.A(r2)
            if (r1 == 0) goto L_0x07b1
            r3 = r4
        L_0x004c:
            int r5 = r1.size()
            if (r3 >= r5) goto L_0x07b1
            android.content.Context r5 = r0.f10995e0
            com.mtma.criminal.city.activities.MainActivity r5 = (com.mtma.criminal.city.activities.MainActivity) r5
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r5)
            r7 = 2131493054(0x7f0c00be, float:1.8609577E38)
            r8 = 0
            android.view.View r6 = r6.inflate(r7, r8, r4)
            r7 = 2131298144(0x7f090760, float:1.8214253E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r9 = 2131298143(0x7f09075f, float:1.821425E38)
            android.view.View r9 = r6.findViewById(r9)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            java.lang.Object r10 = r1.get(r3)
            Y4.c r10 = (Y4.C0246c) r10
            int r10 = r10.f4333a
            r7.setText(r10)
            java.lang.Object r7 = r1.get(r3)
            Y4.c r7 = (Y4.C0246c) r7
            int r7 = r7.d
            r10 = 1
            r15 = 9
            r8 = 8
            r11 = 2
            r13 = 5
            r12 = 4
            switch(r2) {
                case 0: goto L_0x0634;
                case 1: goto L_0x0574;
                case 2: goto L_0x04e5;
                case 3: goto L_0x0459;
                case 4: goto L_0x03d9;
                case 5: goto L_0x0348;
                case 6: goto L_0x02b9;
                case 7: goto L_0x021c;
                case 8: goto L_0x01a7;
                case 9: goto L_0x011c;
                case 10: goto L_0x0095;
                default: goto L_0x0092;
            }
        L_0x0092:
            r14 = 0
            goto L_0x06cf
        L_0x0095:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r7 != 0) goto L_0x00b2
            r7 = 10050(0x2742, float:1.4083E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10051(0x2743, float:1.4084E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10052(0x2744, float:1.4086E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x00b2:
            if (r7 != r10) goto L_0x00bf
            r7 = 20010(0x4e2a, float:2.804E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x00bf:
            if (r7 != r12) goto L_0x00ce
            r7 = 321(0x141, float:4.5E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 322(0x142, float:4.51E-43)
        L_0x00c9:
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            goto L_0x06cf
        L_0x00ce:
            if (r7 != r13) goto L_0x00db
            r7 = 419(0x1a3, float:5.87E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x00db:
            if (r7 != r11) goto L_0x00e8
            r7 = 34
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x00e8:
            if (r7 != r8) goto L_0x00f5
            r7 = 120(0x78, float:1.68E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x00f5:
            if (r7 != r15) goto L_0x010d
            r7 = 528(0x210, float:7.4E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 529(0x211, float:7.41E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 530(0x212, float:7.43E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x010d:
            r8 = 10
            if (r7 != r8) goto L_0x06cf
            r7 = 610(0x262, float:8.55E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x011c:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r7 != 0) goto L_0x0137
            r7 = 10046(0x273e, float:1.4077E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10047(0x273f, float:1.4079E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10048(0x2740, float:1.408E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10049(0x2741, float:1.4082E-41)
            goto L_0x00c9
        L_0x0137:
            if (r7 != r12) goto L_0x0142
            r7 = 319(0x13f, float:4.47E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 320(0x140, float:4.48E-43)
            goto L_0x00c9
        L_0x0142:
            if (r7 != r13) goto L_0x014e
            r7 = 417(0x1a1, float:5.84E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 418(0x1a2, float:5.86E-43)
            goto L_0x00c9
        L_0x014e:
            if (r7 != r11) goto L_0x015a
            r7 = 32
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 33
            goto L_0x00c9
        L_0x015a:
            if (r7 != r8) goto L_0x0172
            r7 = 117(0x75, float:1.64E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 118(0x76, float:1.65E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 119(0x77, float:1.67E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0172:
            r8 = 3
            if (r7 != r8) goto L_0x0180
            r7 = 203(0xcb, float:2.84E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0180:
            if (r7 != r15) goto L_0x0198
            r7 = 525(0x20d, float:7.36E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 526(0x20e, float:7.37E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 527(0x20f, float:7.38E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0198:
            r8 = 10
            if (r7 != r8) goto L_0x06cf
            r7 = 609(0x261, float:8.53E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x01a7:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r7 != 0) goto L_0x01c3
            r7 = 10042(0x273a, float:1.4072E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10043(0x273b, float:1.4073E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10044(0x273c, float:1.4075E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10045(0x273d, float:1.4076E-41)
            goto L_0x00c9
        L_0x01c3:
            if (r7 != r12) goto L_0x01cf
            r7 = 317(0x13d, float:4.44E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 318(0x13e, float:4.46E-43)
            goto L_0x00c9
        L_0x01cf:
            if (r7 != r13) goto L_0x01dc
            r7 = 416(0x1a0, float:5.83E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x01dc:
            if (r7 != r11) goto L_0x01e8
            r7 = 30
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 31
            goto L_0x00c9
        L_0x01e8:
            if (r7 != r8) goto L_0x01f5
            r7 = 116(0x74, float:1.63E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x01f5:
            if (r7 != r15) goto L_0x020d
            r7 = 522(0x20a, float:7.31E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 523(0x20b, float:7.33E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 524(0x20c, float:7.34E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x020d:
            r8 = 10
            if (r7 != r8) goto L_0x06cf
            r7 = 608(0x260, float:8.52E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x021c:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r7 != 0) goto L_0x0238
            r7 = 10038(0x2736, float:1.4066E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10039(0x2737, float:1.4068E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10040(0x2738, float:1.4069E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10041(0x2739, float:1.407E-41)
            goto L_0x00c9
        L_0x0238:
            if (r7 != r10) goto L_0x0245
            r7 = 20009(0x4e29, float:2.8039E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0245:
            if (r7 != r12) goto L_0x0251
            r7 = 315(0x13b, float:4.41E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 316(0x13c, float:4.43E-43)
            goto L_0x00c9
        L_0x0251:
            if (r7 != r13) goto L_0x025d
            r7 = 414(0x19e, float:5.8E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 415(0x19f, float:5.82E-43)
            goto L_0x00c9
        L_0x025d:
            if (r7 != r11) goto L_0x0269
            r7 = 28
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 29
            goto L_0x00c9
        L_0x0269:
            if (r7 != r8) goto L_0x0275
            r7 = 114(0x72, float:1.6E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 115(0x73, float:1.61E-43)
            goto L_0x00c9
        L_0x0275:
            if (r7 != r15) goto L_0x028d
            r7 = 519(0x207, float:7.27E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 520(0x208, float:7.29E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 521(0x209, float:7.3E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x028d:
            r8 = 10
            if (r7 != r8) goto L_0x029c
            r7 = 607(0x25f, float:8.5E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x029c:
            r8 = 11
            if (r7 != r8) goto L_0x02ab
            r7 = 704(0x2c0, float:9.87E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x02ab:
            r8 = 12
            if (r7 != r8) goto L_0x06cf
            r7 = 801(0x321, float:1.122E-42)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 802(0x322, float:1.124E-42)
            goto L_0x00c9
        L_0x02b9:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r7 != 0) goto L_0x02d5
            r7 = 10034(0x2732, float:1.406E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10035(0x2733, float:1.4062E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10036(0x2734, float:1.4063E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10037(0x2735, float:1.4065E-41)
            goto L_0x00c9
        L_0x02d5:
            if (r7 != r10) goto L_0x02e2
            r7 = 20008(0x4e28, float:2.8037E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x02e2:
            if (r7 != r12) goto L_0x02ee
            r7 = 313(0x139, float:4.39E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 314(0x13a, float:4.4E-43)
            goto L_0x00c9
        L_0x02ee:
            if (r7 != r13) goto L_0x02fa
            r7 = 412(0x19c, float:5.77E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 413(0x19d, float:5.79E-43)
            goto L_0x00c9
        L_0x02fa:
            if (r7 != r11) goto L_0x0306
            r7 = 26
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 27
            goto L_0x00c9
        L_0x0306:
            if (r7 != r8) goto L_0x0312
            r7 = 112(0x70, float:1.57E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 113(0x71, float:1.58E-43)
            goto L_0x00c9
        L_0x0312:
            if (r7 != r15) goto L_0x032a
            r7 = 516(0x204, float:7.23E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 517(0x205, float:7.24E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 518(0x206, float:7.26E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x032a:
            r8 = 10
            if (r7 != r8) goto L_0x0339
            r7 = 606(0x25e, float:8.49E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0339:
            r8 = 11
            if (r7 != r8) goto L_0x06cf
            r7 = 703(0x2bf, float:9.85E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0348:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r7 != 0) goto L_0x0364
            r7 = 10030(0x272e, float:1.4055E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10031(0x272f, float:1.4056E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10032(0x2730, float:1.4058E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10033(0x2731, float:1.4059E-41)
            goto L_0x00c9
        L_0x0364:
            if (r7 != r10) goto L_0x0371
            r7 = 20007(0x4e27, float:2.8036E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0371:
            if (r7 != r12) goto L_0x037d
            r7 = 311(0x137, float:4.36E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 312(0x138, float:4.37E-43)
            goto L_0x00c9
        L_0x037d:
            if (r7 != r13) goto L_0x038a
            r7 = 411(0x19b, float:5.76E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x038a:
            if (r7 != r11) goto L_0x0396
            r7 = 24
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 25
            goto L_0x00c9
        L_0x0396:
            if (r7 != r8) goto L_0x03a3
            r7 = 111(0x6f, float:1.56E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x03a3:
            if (r7 != r15) goto L_0x03bb
            r7 = 513(0x201, float:7.19E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 514(0x202, float:7.2E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 515(0x203, float:7.22E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x03bb:
            r8 = 10
            if (r7 != r8) goto L_0x03ca
            r7 = 605(0x25d, float:8.48E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x03ca:
            r8 = 11
            if (r7 != r8) goto L_0x06cf
            r7 = 702(0x2be, float:9.84E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x03d9:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r7 != 0) goto L_0x03f5
            r7 = 10026(0x272a, float:1.405E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10027(0x272b, float:1.4051E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10028(0x272c, float:1.4052E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10029(0x272d, float:1.4054E-41)
            goto L_0x00c9
        L_0x03f5:
            if (r7 != r10) goto L_0x0402
            r7 = 20006(0x4e26, float:2.8034E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0402:
            if (r7 != r12) goto L_0x040e
            r7 = 309(0x135, float:4.33E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 310(0x136, float:4.34E-43)
            goto L_0x00c9
        L_0x040e:
            if (r7 != r13) goto L_0x041a
            r7 = 409(0x199, float:5.73E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 410(0x19a, float:5.75E-43)
            goto L_0x00c9
        L_0x041a:
            if (r7 != r11) goto L_0x0426
            r7 = 22
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 23
            goto L_0x00c9
        L_0x0426:
            if (r7 != r8) goto L_0x0432
            r7 = 109(0x6d, float:1.53E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 110(0x6e, float:1.54E-43)
            goto L_0x00c9
        L_0x0432:
            if (r7 != r15) goto L_0x044a
            r7 = 510(0x1fe, float:7.15E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 511(0x1ff, float:7.16E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 512(0x200, float:7.175E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x044a:
            r8 = 10
            if (r7 != r8) goto L_0x06cf
            r7 = 604(0x25c, float:8.46E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0459:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r7 != 0) goto L_0x0475
            r7 = 10022(0x2726, float:1.4044E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10023(0x2727, float:1.4045E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10024(0x2728, float:1.4047E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10025(0x2729, float:1.4048E-41)
            goto L_0x00c9
        L_0x0475:
            if (r7 != r10) goto L_0x0482
            r7 = 20005(0x4e25, float:2.8033E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0482:
            if (r7 != r12) goto L_0x048e
            r7 = 307(0x133, float:4.3E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 308(0x134, float:4.32E-43)
            goto L_0x00c9
        L_0x048e:
            if (r7 != r13) goto L_0x049a
            r7 = 407(0x197, float:5.7E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 408(0x198, float:5.72E-43)
            goto L_0x00c9
        L_0x049a:
            if (r7 != r11) goto L_0x04b2
            r7 = 19
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 20
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 21
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x04b2:
            if (r7 != r8) goto L_0x04be
            r7 = 107(0x6b, float:1.5E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 108(0x6c, float:1.51E-43)
            goto L_0x00c9
        L_0x04be:
            if (r7 != r15) goto L_0x04d6
            r7 = 507(0x1fb, float:7.1E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 508(0x1fc, float:7.12E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 509(0x1fd, float:7.13E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x04d6:
            r8 = 10
            if (r7 != r8) goto L_0x06cf
            r7 = 603(0x25b, float:8.45E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x04e5:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r7 != 0) goto L_0x0501
            r7 = 10018(0x2722, float:1.4038E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10019(0x2723, float:1.404E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10020(0x2724, float:1.4041E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10021(0x2725, float:1.4042E-41)
            goto L_0x00c9
        L_0x0501:
            if (r7 != r10) goto L_0x050e
            r7 = 20004(0x4e24, float:2.8032E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x050e:
            if (r7 != r12) goto L_0x051a
            r7 = 305(0x131, float:4.27E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 306(0x132, float:4.29E-43)
            goto L_0x00c9
        L_0x051a:
            if (r7 != r13) goto L_0x0526
            r7 = 405(0x195, float:5.68E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 406(0x196, float:5.69E-43)
            goto L_0x00c9
        L_0x0526:
            if (r7 != r11) goto L_0x0532
            r7 = 17
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 18
            goto L_0x00c9
        L_0x0532:
            if (r7 != r8) goto L_0x053e
            r7 = 105(0x69, float:1.47E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 106(0x6a, float:1.49E-43)
            goto L_0x00c9
        L_0x053e:
            if (r7 != r15) goto L_0x0556
            r7 = 504(0x1f8, float:7.06E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 505(0x1f9, float:7.08E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 506(0x1fa, float:7.09E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0556:
            r8 = 10
            if (r7 != r8) goto L_0x0565
            r7 = 602(0x25a, float:8.44E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0565:
            r8 = 11
            if (r7 != r8) goto L_0x06cf
            r7 = 701(0x2bd, float:9.82E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0574:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r7 != 0) goto L_0x059c
            r7 = 10013(0x271d, float:1.4031E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10014(0x271e, float:1.4033E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10015(0x271f, float:1.4034E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10016(0x2720, float:1.4035E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10017(0x2721, float:1.4037E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x059c:
            if (r7 != r10) goto L_0x05a9
            r7 = 20003(0x4e23, float:2.803E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x05a9:
            r15 = 3
            if (r7 != r15) goto L_0x05b7
            r7 = 202(0xca, float:2.83E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x05b7:
            if (r7 != r12) goto L_0x05c3
            r7 = 303(0x12f, float:4.25E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 304(0x130, float:4.26E-43)
            goto L_0x00c9
        L_0x05c3:
            if (r7 != r13) goto L_0x05db
            r7 = 402(0x192, float:5.63E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 403(0x193, float:5.65E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 404(0x194, float:5.66E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x05db:
            if (r7 != r11) goto L_0x05f3
            r7 = 14
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 15
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 16
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x05f3:
            if (r7 != r8) goto L_0x060b
            r7 = 102(0x66, float:1.43E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 103(0x67, float:1.44E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 104(0x68, float:1.46E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x060b:
            r8 = 9
            if (r7 != r8) goto L_0x0625
            r7 = 501(0x1f5, float:7.02E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 502(0x1f6, float:7.03E-43)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 503(0x1f7, float:7.05E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0625:
            r8 = 10
            if (r7 != r8) goto L_0x06cf
            r7 = 601(0x259, float:8.42E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0634:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            if (r7 != 0) goto L_0x067c
            r7 = 10001(0x2711, float:1.4014E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10002(0x2712, float:1.4016E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10003(0x2713, float:1.4017E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10004(0x2714, float:1.4019E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10005(0x2715, float:1.402E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10006(0x2716, float:1.4021E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10007(0x2717, float:1.4023E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10008(0x2718, float:1.4024E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10009(0x2719, float:1.4026E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10010(0x271a, float:1.4027E-41)
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 10011(0x271b, float:1.4028E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 10012(0x271c, float:1.403E-41)
            goto L_0x00c9
        L_0x067c:
            if (r7 != r10) goto L_0x0688
            r7 = 20001(0x4e21, float:2.8027E-41)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 20002(0x4e22, float:2.8029E-41)
            goto L_0x00c9
        L_0x0688:
            r15 = 3
            if (r7 != r15) goto L_0x0695
            r7 = 201(0xc9, float:2.82E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x0695:
            if (r7 != r12) goto L_0x06a1
            r7 = 301(0x12d, float:4.22E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r8 = 302(0x12e, float:4.23E-43)
            goto L_0x00c9
        L_0x06a1:
            if (r7 != r13) goto L_0x06ad
            r7 = 401(0x191, float:5.62E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x06ad:
            if (r7 != r11) goto L_0x06c4
            r11 = 11
            Y4.D r7 = Y4.D.s(r11, r4, r10)
            r8 = 12
            com.google.android.gms.internal.measurement.a.s(r14, r7, r8, r4, r10)
            r7 = 13
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
            goto L_0x06cf
        L_0x06c4:
            if (r7 != r8) goto L_0x06cf
            r7 = 101(0x65, float:1.42E-43)
            Y4.D r7 = Y4.D.s(r7, r4, r10)
            r14.add(r7)
        L_0x06cf:
            r7 = r4
        L_0x06d0:
            int r8 = r14.size()
            if (r7 >= r8) goto L_0x07a5
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r5)
            r10 = 2131493053(0x7f0c00bd, float:1.8609575E38)
            r11 = 0
            android.view.View r8 = r8.inflate(r10, r11, r4)
            r10 = 2131298142(0x7f09075e, float:1.8214249E38)
            android.view.View r10 = r8.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r12 = 2131298140(0x7f09075c, float:1.8214245E38)
            android.view.View r12 = r8.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131298141(0x7f09075d, float:1.8214247E38)
            android.view.View r13 = r8.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            java.lang.Object r15 = r14.get(r7)
            Y4.D r15 = (Y4.D) r15
            int r15 = r15.f4295c
            r10.setText(r15)
            java.lang.Object r10 = r14.get(r7)
            Y4.D r10 = (Y4.D) r10
            r23 = r5
            long r4 = r10.f4297f
            java.lang.String r4 = com.mtma.criminal.city.utils.U.a(r4)
            r12.setText(r4)
            java.lang.Object r4 = r14.get(r7)
            Y4.D r4 = (Y4.D) r4
            boolean r4 = r4.f4306q
            if (r4 == 0) goto L_0x0790
            java.lang.Object r4 = r14.get(r7)
            Y4.D r4 = (Y4.D) r4
            int r4 = r4.f4308s
            r5 = -1
            if (r4 == r5) goto L_0x075f
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.Object r5 = r14.get(r7)
            Y4.D r5 = (Y4.D) r5
            int r5 = r5.y()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r10 = r14.get(r7)
            Y4.D r10 = (Y4.D) r10
            int r10 = r10.x()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r10}
            r10 = 2131887503(0x7f12058f, float:1.9409615E38)
            java.lang.String r4 = r4.getString(r10, r5)
            r13.setText(r4)
            goto L_0x079b
        L_0x075f:
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            java.lang.Object r5 = r14.get(r7)
            Y4.D r5 = (Y4.D) r5
            int r5 = r5.z()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r10 = r14.get(r7)
            Y4.D r10 = (Y4.D) r10
            int r10 = r10.A()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r10}
            r10 = 2131886187(0x7f12006b, float:1.9406946E38)
            java.lang.String r4 = r4.getString(r10, r5)
            r13.setText(r4)
            goto L_0x079b
        L_0x0790:
            java.lang.Object r4 = r14.get(r7)
            Y4.D r4 = (Y4.D) r4
            int r4 = r4.f4296e
            r13.setText(r4)
        L_0x079b:
            r9.addView(r8)
            int r7 = r7 + 1
            r5 = r23
            r4 = 0
            goto L_0x06d0
        L_0x07a5:
            android.view.ViewGroup r4 = r0.f10998h0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r4.addView(r6)
            int r3 = r3 + 1
            r4 = 0
            goto L_0x004c
        L_0x07b1:
            android.widget.RelativeLayout r1 = r0.f10999i0
            j4.w r2 = new j4.w
            r3 = 5
            r2.<init>(r0, r1, r3)
            r1.setOnClickListener(r2)
            android.view.View r1 = r0.f10996f0
            return r1
        L_0x07bf:
            r3 = 2131492944(0x7f0c0050, float:1.8609354E38)
            r4 = 0
            android.view.View r1 = r1.inflate(r3, r2, r4)
            r0.f10996f0 = r1
            r2 = 2131296860(0x7f09025c, float:1.8211649E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f10997g0 = r1
            android.view.View r1 = r0.f10996f0
            r2 = 2131296855(0x7f090257, float:1.8211638E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ListView r1 = (android.widget.ListView) r1
            r0.f10998h0 = r1
            android.view.View r1 = r0.f10996f0
            r2 = 2131296849(0x7f090251, float:1.8211626E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r0.f10999i0 = r1
            d5.j r1 = d5.o.getLocationObject()
            int r1 = r1.getCurrentCity()
            r2 = 1
            r3 = 6
            r4 = 5
            r5 = 7
            r6 = 10
            switch(r1) {
                case 0: goto L_0x0849;
                case 1: goto L_0x0840;
                case 2: goto L_0x0837;
                case 3: goto L_0x082e;
                case 4: goto L_0x0825;
                case 5: goto L_0x081c;
                case 6: goto L_0x0837;
                case 7: goto L_0x0813;
                case 8: goto L_0x080a;
                case 9: goto L_0x0801;
                case 10: goto L_0x082e;
                default: goto L_0x07ff;
            }
        L_0x07ff:
            r1 = 0
            goto L_0x0852
        L_0x0801:
            int[] r1 = new int[]{r2, r3, r5, r6}
            java.util.ArrayList r1 = I1.b.O(r1)
            goto L_0x0852
        L_0x080a:
            int[] r1 = new int[]{r2, r4, r5, r6}
            java.util.ArrayList r1 = I1.b.O(r1)
            goto L_0x0852
        L_0x0813:
            int[] r1 = new int[]{r4}
            java.util.ArrayList r1 = I1.b.O(r1)
            goto L_0x0852
        L_0x081c:
            int[] r1 = new int[]{r4, r6}
            java.util.ArrayList r1 = I1.b.O(r1)
            goto L_0x0852
        L_0x0825:
            int[] r1 = new int[]{r4, r3, r5, r6}
            java.util.ArrayList r1 = I1.b.O(r1)
            goto L_0x0852
        L_0x082e:
            int[] r1 = new int[]{r4, r5, r6}
            java.util.ArrayList r1 = I1.b.O(r1)
            goto L_0x0852
        L_0x0837:
            int[] r1 = new int[]{r4, r3, r6}
            java.util.ArrayList r1 = I1.b.O(r1)
            goto L_0x0852
        L_0x0840:
            int[] r1 = new int[]{r3, r5, r6}
            java.util.ArrayList r1 = I1.b.O(r1)
            goto L_0x0852
        L_0x0849:
            r1 = 4
            int[] r1 = new int[]{r1, r3, r5, r6}
            java.util.ArrayList r1 = I1.b.O(r1)
        L_0x0852:
            int r3 = r0.f11000j0
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r3 = r1.intValue()
            android.widget.TextView r4 = r0.f10997g0
            switch(r3) {
                case 0: goto L_0x088d;
                case 1: goto L_0x0889;
                case 2: goto L_0x0885;
                case 3: goto L_0x0881;
                case 4: goto L_0x087d;
                case 5: goto L_0x0879;
                case 6: goto L_0x0863;
                case 7: goto L_0x0863;
                case 8: goto L_0x0875;
                case 9: goto L_0x0871;
                case 10: goto L_0x086d;
                case 11: goto L_0x0869;
                case 12: goto L_0x0865;
                default: goto L_0x0863;
            }
        L_0x0863:
            r3 = -1
            goto L_0x0890
        L_0x0865:
            r3 = 2131887654(0x7f120626, float:1.9409921E38)
            goto L_0x0890
        L_0x0869:
            r3 = 2131887645(0x7f12061d, float:1.9409903E38)
            goto L_0x0890
        L_0x086d:
            r3 = 2131887647(0x7f12061f, float:1.9409907E38)
            goto L_0x0890
        L_0x0871:
            r3 = 2131887652(0x7f120624, float:1.9409917E38)
            goto L_0x0890
        L_0x0875:
            r3 = 2131887658(0x7f12062a, float:1.940993E38)
            goto L_0x0890
        L_0x0879:
            r3 = 2131887641(0x7f120619, float:1.9409895E38)
            goto L_0x0890
        L_0x087d:
            r3 = 2131887639(0x7f120617, float:1.940989E38)
            goto L_0x0890
        L_0x0881:
            r3 = 2131887649(0x7f120621, float:1.9409911E38)
            goto L_0x0890
        L_0x0885:
            r3 = 2131887642(0x7f12061a, float:1.9409897E38)
            goto L_0x0890
        L_0x0889:
            r3 = 2131887636(0x7f120614, float:1.9409885E38)
            goto L_0x0890
        L_0x088d:
            r3 = 2131887643(0x7f12061b, float:1.9409899E38)
        L_0x0890:
            r4.setText(r3)
            R2.b.w(r2)
            k.m r2 = new k.m
            r3 = 26
            r2.<init>(r0, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            d5.a r4 = d5.o.getAccountObject()
            int r4 = r4.getCurrentOpenedServer()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "serverNumber"
            r3.put(r5, r4)
            d5.j r4 = d5.o.getLocationObject()
            int r4 = r4.getCurrentCity()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "cityNumber"
            r3.put(r5, r4)
            java.lang.String r4 = "materialType"
            r3.put(r4, r1)
            F3.h r1 = F3.h.b()
            java.lang.String r4 = "getDataFromMarket"
            B0.h r1 = r1.a(r4)
            com.google.android.gms.tasks.Task r1 = r1.q(r3)
            com.mtma.criminal.city.utils.v r3 = new com.mtma.criminal.city.utils.v
            r4 = 2
            r3.<init>(r2, r4)
            r1.addOnCompleteListener(r3)
            android.widget.RelativeLayout r1 = r0.f10999i0
            j4.w r2 = new j4.w
            r3 = 18
            r2.<init>(r0, r1, r3)
            r1.setOnClickListener(r2)
            android.view.View r1 = r0.f10996f0
            return r1
        L_0x08ef:
            r3 = 2131492944(0x7f0c0050, float:1.8609354E38)
            r7 = 0
            android.view.View r1 = r1.inflate(r3, r2, r7)
            r0.f10996f0 = r1
            r2 = 2131296860(0x7f09025c, float:1.8211649E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f10997g0 = r1
            android.view.View r1 = r0.f10996f0
            r2 = 2131296855(0x7f090257, float:1.8211638E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ListView r1 = (android.widget.ListView) r1
            r0.f10998h0 = r1
            android.view.View r1 = r0.f10996f0
            r2 = 2131296849(0x7f090251, float:1.8211626E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r0.f10999i0 = r1
            int r1 = r0.f11000j0
            android.content.Context r5 = r0.f10995e0
            r12 = 2131887644(0x7f12061c, float:1.94099E38)
            r13 = 2131887650(0x7f120622, float:1.9409913E38)
            r14 = 2131887641(0x7f120619, float:1.9409895E38)
            r15 = 2131165901(0x7f0702cd, float:1.7946032E38)
            r7 = 2131887655(0x7f120627, float:1.9409923E38)
            r2 = 2131887649(0x7f120621, float:1.9409911E38)
            r3 = 2131887647(0x7f12061f, float:1.9409907E38)
            r4 = 2131166018(0x7f070342, float:1.794627E38)
            r6 = 2131887651(0x7f120623, float:1.9409915E38)
            r8 = 2131887636(0x7f120614, float:1.9409885E38)
            r9 = 2131165922(0x7f0702e2, float:1.7946075E38)
            r10 = 2131887643(0x7f12061b, float:1.9409899E38)
            r11 = -1
            if (r1 != r11) goto L_0x0a1a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            Y4.d r11 = new Y4.d
            r11.<init>(r10, r9)
            r1.add(r11)
            Y4.d r9 = new Y4.d
            r10 = 2131165834(0x7f07028a, float:1.7945896E38)
            r9.<init>(r8, r10)
            r1.add(r9)
            Y4.d r8 = new Y4.d
            r8.<init>(r6, r4)
            r1.add(r8)
            Y4.d r4 = new Y4.d
            r6 = 2131165924(0x7f0702e4, float:1.7946079E38)
            r4.<init>(r3, r6)
            r1.add(r4)
            Y4.d r3 = new Y4.d
            r4 = 2131165966(0x7f07030e, float:1.7946164E38)
            r3.<init>(r2, r4)
            r1.add(r3)
            Y4.d r2 = new Y4.d
            r3 = 2131166056(0x7f070368, float:1.7946347E38)
            r2.<init>(r7, r3)
            r1.add(r2)
            Y4.d r2 = new Y4.d
            r3 = 2131887640(0x7f120618, float:1.9409893E38)
            r2.<init>(r3, r15)
            r1.add(r2)
            Y4.d r2 = new Y4.d
            r3 = 2131165902(0x7f0702ce, float:1.7946034E38)
            r2.<init>(r14, r3)
            r1.add(r2)
            Y4.d r2 = new Y4.d
            r3 = 2131165969(0x7f070311, float:1.794617E38)
            r2.<init>(r13, r3)
            r1.add(r2)
            Y4.d r2 = new Y4.d
            r3 = 2131165923(0x7f0702e3, float:1.7946077E38)
            r2.<init>(r12, r3)
            r1.add(r2)
            Y4.d r2 = new Y4.d
            r3 = 2131166019(0x7f070343, float:1.7946272E38)
            r4 = 2131887652(0x7f120624, float:1.9409917E38)
            r2.<init>(r4, r3)
            r1.add(r2)
            Y4.d r2 = new Y4.d
            r3 = 2131166057(0x7f070369, float:1.7946349E38)
            r4 = 2131887656(0x7f120628, float:1.9409925E38)
            r2.<init>(r4, r3)
            r1.add(r2)
            Y4.d r2 = new Y4.d
            r3 = 2131165857(0x7f0702a1, float:1.7945943E38)
            r4 = 2131887638(0x7f120616, float:1.9409889E38)
            r2.<init>(r4, r3)
            r1.add(r2)
            Y4.d r2 = new Y4.d
            r3 = 2131165943(0x7f0702f7, float:1.7946117E38)
            r4 = 2131887658(0x7f12062a, float:1.940993E38)
            r2.<init>(r4, r3)
            r1.add(r2)
            Y4.d r2 = new Y4.d
            r3 = 2131165835(0x7f07028b, float:1.7945898E38)
            r4 = 2131887637(0x7f120615, float:1.9409887E38)
            r2.<init>(r4, r3)
            r1.add(r2)
            Y4.d r2 = new Y4.d
            r3 = 2131165967(0x7f07030f, float:1.7946166E38)
            r4 = 2131887648(0x7f120620, float:1.940991E38)
            r2.<init>(r4, r3)
            r1.add(r2)
            j4.p r2 = new j4.p
            r8 = 1
            r9 = 0
            r4 = r2
            r6 = r1
            r1 = 0
            r7 = r1
            r4.<init>((android.content.Context) r5, (java.util.ArrayList) r6, (int) r7, (int) r8, (byte) r9)
            r1 = 2131887378(0x7f120512, float:1.9409361E38)
            goto L_0x0bcb
        L_0x0a1a:
            r16 = 2131887648(0x7f120620, float:1.940991E38)
            r17 = 2131887637(0x7f120615, float:1.9409887E38)
            r18 = 2131887658(0x7f12062a, float:1.940993E38)
            r19 = 2131887638(0x7f120616, float:1.9409889E38)
            r20 = 2131887656(0x7f120628, float:1.9409925E38)
            r21 = 2131887652(0x7f120624, float:1.9409917E38)
            switch(r1) {
                case 0: goto L_0x0a55;
                case 1: goto L_0x0a53;
                case 2: goto L_0x0a51;
                case 3: goto L_0x0a56;
                case 4: goto L_0x0a4f;
                case 5: goto L_0x0a4d;
                case 6: goto L_0x0a49;
                case 7: goto L_0x0a47;
                case 8: goto L_0x0a45;
                case 9: goto L_0x0a43;
                case 10: goto L_0x0a40;
                case 11: goto L_0x0a3d;
                case 12: goto L_0x0a3a;
                case 13: goto L_0x0a37;
                case 14: goto L_0x0a34;
                case 15: goto L_0x0a31;
                default: goto L_0x0a2f;
            }
        L_0x0a2f:
            r3 = r11
            goto L_0x0a56
        L_0x0a31:
            r3 = r16
            goto L_0x0a56
        L_0x0a34:
            r3 = r17
            goto L_0x0a56
        L_0x0a37:
            r3 = r18
            goto L_0x0a56
        L_0x0a3a:
            r3 = r19
            goto L_0x0a56
        L_0x0a3d:
            r3 = r20
            goto L_0x0a56
        L_0x0a40:
            r3 = r21
            goto L_0x0a56
        L_0x0a43:
            r3 = r12
            goto L_0x0a56
        L_0x0a45:
            r3 = r13
            goto L_0x0a56
        L_0x0a47:
            r3 = r14
            goto L_0x0a56
        L_0x0a49:
            r3 = 2131887639(0x7f120617, float:1.940989E38)
            goto L_0x0a56
        L_0x0a4d:
            r3 = r7
            goto L_0x0a56
        L_0x0a4f:
            r3 = r2
            goto L_0x0a56
        L_0x0a51:
            r3 = r6
            goto L_0x0a56
        L_0x0a53:
            r3 = r8
            goto L_0x0a56
        L_0x0a55:
            r3 = r10
        L_0x0a56:
            if (r1 == 0) goto L_0x0b66
            r2 = 2
            if (r1 == r2) goto L_0x0b3c
            r2 = 10
            if (r1 == r2) goto L_0x0ac4
            r2 = 15
            if (r1 == r2) goto L_0x0aaf
            r2 = 6
            if (r1 == r2) goto L_0x0a8f
            r2 = 7
            if (r1 == r2) goto L_0x0a6c
            r2 = 0
            goto L_0x0bc3
        L_0x0a6c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            Y4.d r4 = new Y4.d
            r6 = 2131887335(0x7f1204e7, float:1.9409274E38)
            r7 = 2131165855(0x7f07029f, float:1.7945939E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131887336(0x7f1204e8, float:1.9409276E38)
            r7 = 2131165859(0x7f0702a3, float:1.7945947E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            goto L_0x0bc3
        L_0x0a8f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            Y4.d r4 = new Y4.d
            r6 = 2131887334(0x7f1204e6, float:1.9409272E38)
            r4.<init>(r6, r15)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131887333(0x7f1204e5, float:1.940927E38)
            r7 = 2131165858(0x7f0702a2, float:1.7945945E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            goto L_0x0bc3
        L_0x0aaf:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            Y4.d r4 = new Y4.d
            r6 = 2131888999(0x7f120b67, float:1.941265E38)
            r7 = 2131165967(0x7f07030f, float:1.7946166E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            goto L_0x0bc3
        L_0x0ac4:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            Y4.d r4 = new Y4.d
            r6 = 2131886634(0x7f12022a, float:1.9407852E38)
            r7 = 2131166019(0x7f070343, float:1.7946272E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131886635(0x7f12022b, float:1.9407854E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131886640(0x7f120230, float:1.9407865E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131886641(0x7f120231, float:1.9407867E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131886632(0x7f120228, float:1.9407848E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131886633(0x7f120229, float:1.940785E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131886642(0x7f120232, float:1.9407869E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131886643(0x7f120233, float:1.940787E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131886636(0x7f12022c, float:1.9407856E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131886639(0x7f12022f, float:1.9407863E38)
            r4.<init>(r6, r7)
            r2.add(r4)
            goto L_0x0bc3
        L_0x0b3c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            Y4.d r6 = new Y4.d
            r7 = 2131888915(0x7f120b13, float:1.9412479E38)
            r6.<init>(r7, r4)
            r2.add(r6)
            Y4.d r6 = new Y4.d
            r7 = 2131888916(0x7f120b14, float:1.941248E38)
            r8 = 2131165854(0x7f07029e, float:1.7945937E38)
            r6.<init>(r7, r8)
            r2.add(r6)
            Y4.d r6 = new Y4.d
            r7 = 2131888917(0x7f120b15, float:1.9412483E38)
            r6.<init>(r7, r4)
            r2.add(r6)
            goto L_0x0bc3
        L_0x0b66:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            Y4.d r4 = new Y4.d
            r6 = 2131887513(0x7f120599, float:1.9409635E38)
            r4.<init>(r6, r9)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131887506(0x7f120592, float:1.940962E38)
            r4.<init>(r6, r9)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131887512(0x7f120598, float:1.9409633E38)
            r4.<init>(r6, r9)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131887510(0x7f120596, float:1.940963E38)
            r4.<init>(r6, r9)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131887509(0x7f120595, float:1.9409627E38)
            r4.<init>(r6, r9)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131887511(0x7f120597, float:1.9409631E38)
            r4.<init>(r6, r9)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131887508(0x7f120594, float:1.9409625E38)
            r4.<init>(r6, r9)
            r2.add(r4)
            Y4.d r4 = new Y4.d
            r6 = 2131887507(0x7f120593, float:1.9409623E38)
            r4.<init>(r6, r9)
            r2.add(r4)
        L_0x0bc3:
            j4.p r4 = new j4.p
            r6 = 0
            r4.<init>(r5, r2, r1, r6)
            r1 = r3
            r2 = r4
        L_0x0bcb:
            android.widget.TextView r3 = r0.f10997g0
            r3.setText(r1)
            android.view.ViewGroup r1 = r0.f10998h0
            android.widget.ListView r1 = (android.widget.ListView) r1
            r1.setAdapter(r2)
            android.widget.RelativeLayout r1 = r0.f10999i0
            j4.w r2 = new j4.w
            r3 = 15
            r2.<init>(r0, r1, r3)
            r1.setOnClickListener(r2)
            android.view.View r1 = r0.f10996f0
            return r1
        L_0x0be6:
            r3 = 2131492944(0x7f0c0050, float:1.8609354E38)
            r4 = 0
            android.view.View r1 = r1.inflate(r3, r2, r4)
            r0.f10996f0 = r1
            r2 = 2131296860(0x7f09025c, float:1.8211649E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f10997g0 = r1
            android.view.View r1 = r0.f10996f0
            r2 = 2131296855(0x7f090257, float:1.8211638E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ListView r1 = (android.widget.ListView) r1
            r0.f10998h0 = r1
            android.view.View r1 = r0.f10996f0
            r2 = 2131296849(0x7f090251, float:1.8211626E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r0.f10999i0 = r1
            android.widget.TextView r1 = r0.f10997g0
            r2 = 3
            r3 = 2
            r5 = 1
            int r6 = r0.f11000j0
            if (r6 == 0) goto L_0x0c32
            if (r6 == r5) goto L_0x0c2e
            if (r6 == r3) goto L_0x0c2a
            if (r6 == r2) goto L_0x0c26
            r7 = -1
            goto L_0x0c35
        L_0x0c26:
            r7 = 2131886226(0x7f120092, float:1.9407025E38)
            goto L_0x0c35
        L_0x0c2a:
            r7 = 2131886220(0x7f12008c, float:1.9407013E38)
            goto L_0x0c35
        L_0x0c2e:
            r7 = 2131886216(0x7f120088, float:1.9407005E38)
            goto L_0x0c35
        L_0x0c32:
            r7 = 2131886221(0x7f12008d, float:1.9407015E38)
        L_0x0c35:
            r1.setText(r7)
            if (r6 == 0) goto L_0x0c8f
            if (r6 == r5) goto L_0x0c78
            if (r6 == r3) goto L_0x0c67
            if (r6 == r2) goto L_0x0c42
            r1 = 0
            goto L_0x0cb6
        L_0x0c42:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 5001(0x1389, float:7.008E-42)
            Y4.D r2 = Y4.D.s(r2, r4, r5)
            r3 = 5002(0x138a, float:7.009E-42)
            com.google.android.gms.internal.measurement.a.s(r1, r2, r3, r4, r5)
            r2 = 5003(0x138b, float:7.01E-42)
            Y4.D r2 = Y4.D.s(r2, r4, r5)
            r3 = 5004(0x138c, float:7.012E-42)
            com.google.android.gms.internal.measurement.a.s(r1, r2, r3, r4, r5)
            r2 = 5005(0x138d, float:7.013E-42)
            Y4.D r2 = Y4.D.s(r2, r4, r5)
            r1.add(r2)
            goto L_0x0cb6
        L_0x0c67:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 30017(0x7541, float:4.2063E-41)
            Y4.D r2 = Y4.D.s(r2, r4, r5)
            r3 = 30018(0x7542, float:4.2064E-41)
            com.google.android.gms.internal.measurement.a.s(r1, r2, r3, r4, r5)
            goto L_0x0cb6
        L_0x0c78:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            Y4.D r2 = new Y4.D
            r3 = 2131165318(0x7f070086, float:1.794485E38)
            r4 = 2131886218(0x7f12008a, float:1.9407009E38)
            r5 = 2131886217(0x7f120089, float:1.9407007E38)
            r2.<init>(r4, r5, r3)
            r1.add(r2)
            goto L_0x0cb6
        L_0x0c8f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            Y4.D r2 = new Y4.D
            r3 = 2131165323(0x7f07008b, float:1.794486E38)
            r4 = 2131886225(0x7f120091, float:1.9407023E38)
            r5 = 2131886224(0x7f120090, float:1.940702E38)
            r2.<init>(r4, r5, r3)
            r1.add(r2)
            Y4.D r2 = new Y4.D
            r3 = 2131165322(0x7f07008a, float:1.7944858E38)
            r4 = 2131886223(0x7f12008f, float:1.9407019E38)
            r5 = 2131886222(0x7f12008e, float:1.9407017E38)
            r2.<init>(r4, r5, r3)
            r1.add(r2)
        L_0x0cb6:
            j4.q r2 = new j4.q
            android.content.Context r3 = r0.f10995e0
            r4 = 1
            r2.<init>(r3, r1, r6, r4)
            android.view.ViewGroup r1 = r0.f10998h0
            android.widget.ListView r1 = (android.widget.ListView) r1
            r1.setAdapter(r2)
            android.widget.RelativeLayout r1 = r0.f10999i0
            j4.w r2 = new j4.w
            r3 = 6
            r2.<init>(r0, r1, r3)
            r1.setOnClickListener(r2)
            android.view.View r1 = r0.f10996f0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.C0918a.C(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public C0918a(MainActivity mainActivity) {
        this.f10994d0 = 1;
        this.f11000j0 = -1;
        this.f10995e0 = mainActivity;
    }
}
