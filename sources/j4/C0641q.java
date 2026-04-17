package j4;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.mtma.criminal.city.activities.MainActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j4.q  reason: case insensitive filesystem */
public final class C0641q extends ArrayAdapter {
    public static int d;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9076a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f9077b;

    /* renamed from: c  reason: collision with root package name */
    public int f9078c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0641q(Context context, List list, int i2, int i5) {
        super(context, 0, list);
        this.f9076a = i5;
        this.f9077b = context;
        this.f9078c = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x05d2, code lost:
        r3 = com.mtma.criminal.city.R.drawable.gold_icon;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            r1 = r21
            int r2 = r6.f9076a
            switch(r2) {
                case 0: goto L_0x09de;
                case 1: goto L_0x089f;
                case 2: goto L_0x081a;
                case 3: goto L_0x07a1;
                case 4: goto L_0x0062;
                default: goto L_0x000b;
            }
        L_0x000b:
            if (r20 != 0) goto L_0x001c
            android.content.Context r2 = r6.f9077b
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131493013(0x7f0c0095, float:1.8609494E38)
            r4 = 0
            android.view.View r1 = r2.inflate(r3, r1, r4)
            goto L_0x001e
        L_0x001c:
            r1 = r20
        L_0x001e:
            r2 = 2131297815(0x7f090617, float:1.8213586E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r3 = 2131297814(0x7f090616, float:1.8213584E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r4 = 2131297816(0x7f090618, float:1.8213588E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Object r5 = r18.getItem(r19)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setText(r5)
            int r4 = r6.f9078c
            if (r0 != r4) goto L_0x0051
            r4 = 2131165372(0x7f0700bc, float:1.794496E38)
            r3.setImageResource(r4)
            goto L_0x0057
        L_0x0051:
            r4 = 2131165342(0x7f07009e, float:1.7944898E38)
            r3.setImageResource(r4)
        L_0x0057:
            j4.i r3 = new j4.i
            r4 = 10
            r3.<init>(r6, r2, r0, r4)
            r2.setOnClickListener(r3)
            return r1
        L_0x0062:
            r2 = 0
            if (r20 != 0) goto L_0x0073
            android.content.Context r3 = r6.f9077b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131493038(0x7f0c00ae, float:1.8609545E38)
            android.view.View r1 = r3.inflate(r4, r1, r2)
            goto L_0x0075
        L_0x0073:
            r1 = r20
        L_0x0075:
            r3 = 2131298026(0x7f0906ea, float:1.8214014E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131298021(0x7f0906e5, float:1.8214003E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131298022(0x7f0906e6, float:1.8214005E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r7 = 2131298024(0x7f0906e8, float:1.821401E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131298025(0x7f0906e9, float:1.8214012E38)
            android.view.View r8 = r1.findViewById(r8)
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            java.lang.Object r0 = r18.getItem(r19)
            b5.k r0 = (b5.k) r0
            java.lang.Object r9 = r0.getUnixTimeInMilli()
            java.lang.String r9 = com.bumptech.glide.c.z(r9)
            r3.setText(r9)
            r11 = 1
            int r12 = r6.f9078c
            if (r12 != 0) goto L_0x061f
            int r12 = r0.getType()
            int r13 = r0.getIdInteger()
            int r14 = r0.getLevel()
            int r15 = r0.getCount()
            long r16 = r0.getMoney()
            java.lang.String r3 = r0.getName()
            r9 = 2131887605(0x7f1205f5, float:1.9409822E38)
            java.lang.String r10 = " "
            switch(r12) {
                case 0: goto L_0x057d;
                case 1: goto L_0x0534;
                case 2: goto L_0x0503;
                case 3: goto L_0x04d2;
                case 4: goto L_0x04af;
                case 5: goto L_0x0498;
                case 6: goto L_0x0477;
                case 7: goto L_0x0460;
                case 8: goto L_0x0449;
                case 9: goto L_0x0403;
                case 10: goto L_0x03bd;
                case 11: goto L_0x03a6;
                case 12: goto L_0x0393;
                case 13: goto L_0x0380;
                case 14: goto L_0x0355;
                case 15: goto L_0x0342;
                case 16: goto L_0x032b;
                case 17: goto L_0x0318;
                case 18: goto L_0x0305;
                case 19: goto L_0x02f2;
                case 20: goto L_0x02df;
                case 21: goto L_0x02c8;
                case 22: goto L_0x02b1;
                case 23: goto L_0x0280;
                case 24: goto L_0x0255;
                case 25: goto L_0x023e;
                case 26: goto L_0x01eb;
                case 27: goto L_0x01d8;
                case 28: goto L_0x01c5;
                case 29: goto L_0x01b2;
                case 30: goto L_0x0191;
                case 31: goto L_0x017e;
                case 32: goto L_0x016b;
                case 33: goto L_0x0158;
                case 34: goto L_0x0145;
                case 35: goto L_0x012e;
                case 36: goto L_0x0117;
                case 37: goto L_0x0100;
                case 38: goto L_0x00db;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            r10 = 0
            goto L_0x05a8
        L_0x00db:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            int r9 = com.bumptech.glide.c.V(r13)
            java.lang.String r3 = r3.getString(r9)
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r10}
            r10 = 2131888184(0x7f120838, float:1.9410996E38)
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0100:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r10 = com.mtma.criminal.city.utils.U.a(r16)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r10}
            r10 = 2131888187(0x7f12083b, float:1.9411002E38)
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0117:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r10 = com.mtma.criminal.city.utils.U.a(r16)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r10}
            r10 = 2131888178(0x7f120832, float:1.9410984E38)
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x012e:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r10 = com.mtma.criminal.city.utils.U.a(r16)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r10}
            r10 = 2131888177(0x7f120831, float:1.9410982E38)
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0145:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888186(0x7f12083a, float:1.9411E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0158:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888185(0x7f120839, float:1.9410998E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x016b:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888183(0x7f120837, float:1.9410994E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x017e:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888180(0x7f120834, float:1.9410988E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0191:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            int r10 = com.bumptech.glide.d.n0(r14)
            java.lang.String r9 = r9.getString(r10)
            com.mtma.criminal.city.app.MyApplication r10 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r10 = r10.getApplicationContext()
            r12 = 2131888176(0x7f120830, float:1.941098E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r9}
            java.lang.String r10 = r10.getString(r12, r3)
            goto L_0x05a8
        L_0x01b2:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888179(0x7f120833, float:1.9410986E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x01c5:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888182(0x7f120836, float:1.9410992E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x01d8:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888181(0x7f120835, float:1.941099E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x01eb:
            switch(r14) {
                case 1: goto L_0x021a;
                case 2: goto L_0x020c;
                case 3: goto L_0x01fe;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01f0;
                case 6: goto L_0x01f0;
                case 7: goto L_0x01f0;
                case 8: goto L_0x01f0;
                case 9: goto L_0x01f0;
                case 10: goto L_0x01f0;
                default: goto L_0x01ee;
            }
        L_0x01ee:
            r10 = 0
            goto L_0x0227
        L_0x01f0:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            r9 = 2131886125(0x7f12002d, float:1.940682E38)
            java.lang.String r10 = r3.getString(r9)
            goto L_0x0227
        L_0x01fe:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            r9 = 2131886127(0x7f12002f, float:1.9406824E38)
            java.lang.String r10 = r3.getString(r9)
            goto L_0x0227
        L_0x020c:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            r9 = 2131886128(0x7f120030, float:1.9406826E38)
            java.lang.String r10 = r3.getString(r9)
            goto L_0x0227
        L_0x021a:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            r9 = 2131886126(0x7f12002e, float:1.9406822E38)
            java.lang.String r10 = r3.getString(r9)
        L_0x0227:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10}
            r10 = 2131888161(0x7f120821, float:1.941095E38)
            java.lang.String r10 = r3.getString(r10, r9)
            goto L_0x05a8
        L_0x023e:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.Long r10 = java.lang.Long.valueOf(r16)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r10}
            r10 = 2131888162(0x7f120822, float:1.9410952E38)
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0255:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            Y4.D r10 = Y4.D.s(r13, r2, r11)
            int r10 = r10.f4295c
            java.lang.String r9 = r9.getString(r10)
            com.mtma.criminal.city.app.MyApplication r10 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r10 = r10.getApplicationContext()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            java.lang.String r13 = com.mtma.criminal.city.utils.U.a(r16)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r12, r9, r13}
            r9 = 2131888165(0x7f120825, float:1.9410958E38)
            java.lang.String r10 = r10.getString(r9, r3)
            goto L_0x05a8
        L_0x0280:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.util.ArrayList r9 = android.support.v4.media.session.a.w()
            java.lang.Object r9 = r9.get(r13)
            Y4.d r9 = (Y4.C0247d) r9
            int r9 = r9.f4337a
            java.lang.String r3 = r3.getString(r9)
            long r9 = android.support.v4.media.session.a.Y(r13)
            com.mtma.criminal.city.app.MyApplication r12 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r12 = r12.getApplicationContext()
            java.lang.String r9 = com.mtma.criminal.city.utils.U.a(r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r9}
            r9 = 2131888166(0x7f120826, float:1.941096E38)
            java.lang.String r10 = r12.getString(r9, r3)
            goto L_0x05a8
        L_0x02b1:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r9 = com.mtma.criminal.city.utils.U.a(r16)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            r10 = 2131888192(0x7f120840, float:1.9411012E38)
            java.lang.String r10 = r3.getString(r10, r9)
            goto L_0x05a8
        L_0x02c8:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r9 = com.mtma.criminal.city.utils.U.a(r16)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            r10 = 2131888193(0x7f120841, float:1.9411014E38)
            java.lang.String r10 = r3.getString(r10, r9)
            goto L_0x05a8
        L_0x02df:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888172(0x7f12082c, float:1.9410972E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x02f2:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888170(0x7f12082a, float:1.9410968E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0305:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888175(0x7f12082f, float:1.9410978E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0318:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888171(0x7f12082b, float:1.941097E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x032b:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r10 = com.mtma.criminal.city.utils.U.a(r16)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r10}
            r10 = 2131888174(0x7f12082e, float:1.9410976E38)
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0342:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888173(0x7f12082d, float:1.9410974E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0355:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            Y4.D r10 = Y4.D.s(r13, r2, r11)
            int r10 = r10.f4295c
            java.lang.String r9 = r9.getString(r10)
            com.mtma.criminal.city.app.MyApplication r10 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r10 = r10.getApplicationContext()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            java.lang.String r13 = com.mtma.criminal.city.utils.U.a(r16)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r12, r9, r13}
            r9 = 2131888164(0x7f120824, float:1.9410956E38)
            java.lang.String r10 = r10.getString(r9, r3)
            goto L_0x05a8
        L_0x0380:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888188(0x7f12083c, float:1.9411004E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0393:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888189(0x7f12083d, float:1.9411006E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x03a6:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r10 = com.mtma.criminal.city.utils.U.a(r16)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r10}
            r10 = 2131888163(0x7f120823, float:1.9410954E38)
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x03bd:
            com.mtma.criminal.city.app.MyApplication r12 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r12 = r12.getApplicationContext()
            Y4.D r13 = Y4.D.s(r13, r2, r11)
            int r13 = r13.f4295c
            java.lang.String r12 = r12.getString(r13)
            if (r14 <= 0) goto L_0x03ec
            java.lang.StringBuilder r10 = q.C0928e.b(r12, r10)
            com.mtma.criminal.city.app.MyApplication r12 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r12 = r12.getApplicationContext()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r9 = r12.getString(r9, r13)
            r10.append(r9)
            java.lang.String r12 = r10.toString()
        L_0x03ec:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r3 = new java.lang.Object[]{r10, r12, r3}
            r10 = 2131888195(0x7f120843, float:1.9411018E38)
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0403:
            com.mtma.criminal.city.app.MyApplication r12 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r12 = r12.getApplicationContext()
            Y4.D r13 = Y4.D.s(r13, r2, r11)
            int r13 = r13.f4295c
            java.lang.String r12 = r12.getString(r13)
            if (r14 <= 0) goto L_0x0432
            java.lang.StringBuilder r10 = q.C0928e.b(r12, r10)
            com.mtma.criminal.city.app.MyApplication r12 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r12 = r12.getApplicationContext()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r9 = r12.getString(r9, r13)
            r10.append(r9)
            java.lang.String r12 = r10.toString()
        L_0x0432:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r3 = new java.lang.Object[]{r10, r12, r3}
            r10 = 2131888198(0x7f120846, float:1.9411025E38)
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0449:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r10 = com.mtma.criminal.city.utils.U.a(r16)
            java.lang.Object[] r3 = new java.lang.Object[]{r10, r3}
            r10 = 2131888194(0x7f120842, float:1.9411016E38)
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0460:
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r10 = com.mtma.criminal.city.utils.U.a(r16)
            java.lang.Object[] r3 = new java.lang.Object[]{r10, r3}
            r10 = 2131888197(0x7f120845, float:1.9411023E38)
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0477:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            int r9 = com.bumptech.glide.c.I(r13, r14)
            java.lang.String r3 = r3.getString(r9)
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888196(0x7f120844, float:1.941102E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x0498:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r9 = com.mtma.criminal.city.utils.U.a(r16)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            r10 = 2131888199(0x7f120847, float:1.9411027E38)
            java.lang.String r10 = r3.getString(r10, r9)
            goto L_0x05a8
        L_0x04af:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            Y4.D r9 = Y4.D.s(r13, r2, r11)
            int r9 = r9.f4295c
            java.lang.String r3 = r3.getString(r9)
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            r10 = 2131888191(0x7f12083f, float:1.941101E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r10 = r9.getString(r10, r3)
            goto L_0x05a8
        L_0x04d2:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.util.ArrayList r9 = com.bumptech.glide.d.m0()
            java.lang.Object r9 = r9.get(r13)
            Y4.h r9 = (Y4.h) r9
            int r9 = r9.d
            java.lang.String r3 = r3.getString(r9)
            long r9 = com.bumptech.glide.d.i0(r13)
            java.lang.String r9 = com.mtma.criminal.city.utils.U.a(r9)
            com.mtma.criminal.city.app.MyApplication r10 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r10 = r10.getApplicationContext()
            r12 = 2131888167(0x7f120827, float:1.9410962E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r3}
            java.lang.String r10 = r10.getString(r12, r3)
            goto L_0x05a8
        L_0x0503:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.util.ArrayList r9 = com.bumptech.glide.d.m0()
            java.lang.Object r9 = r9.get(r13)
            Y4.h r9 = (Y4.h) r9
            int r9 = r9.d
            java.lang.String r3 = r3.getString(r9)
            long r9 = com.bumptech.glide.d.i0(r13)
            java.lang.String r9 = com.mtma.criminal.city.utils.U.a(r9)
            com.mtma.criminal.city.app.MyApplication r10 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r10 = r10.getApplicationContext()
            r12 = 2131888169(0x7f120829, float:1.9410966E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r3}
            java.lang.String r10 = r10.getString(r12, r3)
            goto L_0x05a8
        L_0x0534:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.util.ArrayList r9 = com.bumptech.glide.d.m0()
            java.lang.Object r9 = r9.get(r13)
            Y4.h r9 = (Y4.h) r9
            int r9 = r9.d
            java.lang.String r3 = r3.getString(r9)
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.util.ArrayList r10 = com.bumptech.glide.d.l0(r13)
            switch(r13) {
                case 1: goto L_0x055d;
                case 2: goto L_0x055d;
                case 3: goto L_0x055d;
                case 4: goto L_0x055b;
                case 5: goto L_0x055b;
                case 6: goto L_0x055b;
                case 7: goto L_0x055b;
                case 8: goto L_0x055b;
                case 9: goto L_0x055b;
                case 10: goto L_0x055b;
                case 11: goto L_0x055b;
                case 12: goto L_0x055b;
                case 13: goto L_0x055b;
                case 14: goto L_0x0559;
                case 15: goto L_0x0559;
                case 16: goto L_0x0559;
                default: goto L_0x0557;
            }
        L_0x0557:
            r12 = r2
            goto L_0x055e
        L_0x0559:
            r12 = 3
            goto L_0x055e
        L_0x055b:
            r12 = 2
            goto L_0x055e
        L_0x055d:
            r12 = r11
        L_0x055e:
            int r14 = r14 + r12
            java.lang.Object r10 = r10.get(r14)
            Y4.g r10 = (Y4.g) r10
            int r10 = r10.f4349a
            java.lang.String r9 = r9.getString(r10)
            com.mtma.criminal.city.app.MyApplication r10 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r10 = r10.getApplicationContext()
            r12 = 2131888168(0x7f120828, float:1.9410964E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r3}
            java.lang.String r10 = r10.getString(r12, r3)
            goto L_0x05a8
        L_0x057d:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.util.ArrayList r9 = com.mtma.criminal.city.utils.Q.f7375a
            java.lang.Object r9 = r9.get(r13)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.String r3 = r3.getString(r9)
            com.mtma.criminal.city.app.MyApplication r9 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r10}
            r10 = 2131888190(0x7f12083e, float:1.9411008E38)
            java.lang.String r10 = r9.getString(r10, r3)
        L_0x05a8:
            r4.setText(r10)
            int r3 = r0.getType()
            int r4 = r0.getIdInteger()
            int r9 = r0.getLevel()
            if (r3 == 0) goto L_0x05e5
            r9 = 14
            if (r3 == r9) goto L_0x05e1
            r9 = 16
            if (r3 == r9) goto L_0x05e1
            r9 = 4
            if (r3 == r9) goto L_0x05da
            r9 = 5
            if (r3 == r9) goto L_0x05d6
            switch(r3) {
                case 7: goto L_0x05e1;
                case 8: goto L_0x05e1;
                case 9: goto L_0x05da;
                case 10: goto L_0x05da;
                case 11: goto L_0x05e1;
                default: goto L_0x05ca;
            }
        L_0x05ca:
            switch(r3) {
                case 21: goto L_0x05d2;
                case 22: goto L_0x05e1;
                case 23: goto L_0x05d6;
                case 24: goto L_0x05e1;
                default: goto L_0x05cd;
            }
        L_0x05cd:
            switch(r3) {
                case 35: goto L_0x05e1;
                case 36: goto L_0x05d2;
                case 37: goto L_0x05e1;
                default: goto L_0x05d0;
            }
        L_0x05d0:
            r3 = r2
            goto L_0x05e9
        L_0x05d2:
            r3 = 2131165707(0x7f07020b, float:1.7945639E38)
            goto L_0x05e9
        L_0x05d6:
            r3 = 2131165419(0x7f0700eb, float:1.7945055E38)
            goto L_0x05e9
        L_0x05da:
            Y4.D r3 = Y4.D.s(r4, r2, r11)
            int r3 = r3.d
            goto L_0x05e9
        L_0x05e1:
            r3 = 2131165413(0x7f0700e5, float:1.7945042E38)
            goto L_0x05e9
        L_0x05e5:
            int r3 = com.mtma.criminal.city.utils.Q.d(r4, r9)
        L_0x05e9:
            r5.setImageResource(r3)
            int r3 = r0.getType()
            r4 = 9
            r5 = 8
            if (r3 == r4) goto L_0x0604
            int r3 = r0.getType()
            r4 = 10
            if (r3 != r4) goto L_0x05ff
            goto L_0x0604
        L_0x05ff:
            r8.setVisibility(r5)
            goto L_0x07a0
        L_0x0604:
            int r3 = r0.getLevel()
            if (r3 <= 0) goto L_0x061a
            r8.setVisibility(r2)
            int r0 = r0.getLevel()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.setText(r0)
            goto L_0x07a0
        L_0x061a:
            r8.setVisibility(r5)
            goto L_0x07a0
        L_0x061f:
            if (r12 != r11) goto L_0x07a0
            int r3 = r0.getType()
            int r7 = r0.getIdInteger()
            int r8 = r0.getLevel()
            r0.getCount()
            long r9 = r0.getMoney()
            java.lang.String r11 = r0.getName()
            switch(r3) {
                case 0: goto L_0x076c;
                case 1: goto L_0x075a;
                case 2: goto L_0x073a;
                case 3: goto L_0x0728;
                case 4: goto L_0x0716;
                case 5: goto L_0x0704;
                case 6: goto L_0x06ed;
                case 7: goto L_0x06d6;
                case 8: goto L_0x06bf;
                case 9: goto L_0x06a8;
                case 10: goto L_0x0683;
                case 11: goto L_0x063e;
                default: goto L_0x063b;
            }
        L_0x063b:
            r10 = 0
            goto L_0x077d
        L_0x063e:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            switch(r7) {
                case 1: goto L_0x0661;
                case 2: goto L_0x065d;
                case 3: goto L_0x0659;
                case 4: goto L_0x0655;
                case 5: goto L_0x0651;
                case 6: goto L_0x064d;
                case 7: goto L_0x0649;
                default: goto L_0x0647;
            }
        L_0x0647:
            r8 = r2
            goto L_0x0664
        L_0x0649:
            r8 = 2131887385(0x7f120519, float:1.9409376E38)
            goto L_0x0664
        L_0x064d:
            r8 = 2131887386(0x7f12051a, float:1.9409378E38)
            goto L_0x0664
        L_0x0651:
            r8 = 2131887382(0x7f120516, float:1.940937E38)
            goto L_0x0664
        L_0x0655:
            r8 = 2131887383(0x7f120517, float:1.9409372E38)
            goto L_0x0664
        L_0x0659:
            r8 = 2131887387(0x7f12051b, float:1.940938E38)
            goto L_0x0664
        L_0x065d:
            r8 = 2131887389(0x7f12051d, float:1.9409384E38)
            goto L_0x0664
        L_0x0661:
            r8 = 2131887384(0x7f120518, float:1.9409374E38)
        L_0x0664:
            java.lang.String r3 = r3.getString(r8)
            com.mtma.criminal.city.app.MyApplication r8 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r8 = r8.getApplicationContext()
            int r7 = android.support.v4.media.session.a.W(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r7}
            r7 = 2131887404(0x7f12052c, float:1.9409414E38)
            java.lang.String r10 = r8.getString(r7, r3)
            goto L_0x077d
        L_0x0683:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            int r7 = com.bumptech.glide.c.V(r7)
            java.lang.String r3 = r3.getString(r7)
            com.mtma.criminal.city.app.MyApplication r7 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r3 = new java.lang.Object[]{r11, r3, r8}
            r8 = 2131887406(0x7f12052e, float:1.9409418E38)
            java.lang.String r10 = r7.getString(r8, r3)
            goto L_0x077d
        L_0x06a8:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r7 = new java.lang.Object[]{r11, r7}
            r8 = 2131887402(0x7f12052a, float:1.940941E38)
            java.lang.String r10 = r3.getString(r8, r7)
            goto L_0x077d
        L_0x06bf:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r7 = com.mtma.criminal.city.utils.U.a(r9)
            java.lang.Object[] r7 = new java.lang.Object[]{r11, r7}
            r8 = 2131887408(0x7f120530, float:1.9409422E38)
            java.lang.String r10 = r3.getString(r8, r7)
            goto L_0x077d
        L_0x06d6:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r7 = com.mtma.criminal.city.utils.U.a(r9)
            java.lang.Object[] r7 = new java.lang.Object[]{r11, r7}
            r8 = 2131887399(0x7f120527, float:1.9409404E38)
            java.lang.String r10 = r3.getString(r8, r7)
            goto L_0x077d
        L_0x06ed:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r7 = com.mtma.criminal.city.utils.U.a(r9)
            java.lang.Object[] r7 = new java.lang.Object[]{r11, r7}
            r8 = 2131887398(0x7f120526, float:1.9409402E38)
            java.lang.String r10 = r3.getString(r8, r7)
            goto L_0x077d
        L_0x0704:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            r7 = 2131887407(0x7f12052f, float:1.940942E38)
            java.lang.Object[] r8 = new java.lang.Object[]{r11}
            java.lang.String r10 = r3.getString(r7, r8)
            goto L_0x077d
        L_0x0716:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            r7 = 2131887403(0x7f12052b, float:1.9409412E38)
            java.lang.Object[] r8 = new java.lang.Object[]{r11}
            java.lang.String r10 = r3.getString(r7, r8)
            goto L_0x077d
        L_0x0728:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            r7 = 2131887400(0x7f120528, float:1.9409406E38)
            java.lang.Object[] r8 = new java.lang.Object[]{r11}
            java.lang.String r10 = r3.getString(r7, r8)
            goto L_0x077d
        L_0x073a:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            int r7 = com.bumptech.glide.d.n0(r8)
            java.lang.String r3 = r3.getString(r7)
            com.mtma.criminal.city.app.MyApplication r7 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r7 = r7.getApplicationContext()
            r8 = 2131887397(0x7f120525, float:1.94094E38)
            java.lang.Object[] r3 = new java.lang.Object[]{r11, r3}
            java.lang.String r10 = r7.getString(r8, r3)
            goto L_0x077d
        L_0x075a:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            r7 = 2131887405(0x7f12052d, float:1.9409416E38)
            java.lang.Object[] r8 = new java.lang.Object[]{r11}
            java.lang.String r10 = r3.getString(r7, r8)
            goto L_0x077d
        L_0x076c:
            com.mtma.criminal.city.app.MyApplication r3 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r3 = r3.getApplicationContext()
            r7 = 2131887401(0x7f120529, float:1.9409408E38)
            java.lang.Object[] r8 = new java.lang.Object[]{r11}
            java.lang.String r10 = r3.getString(r7, r8)
        L_0x077d:
            r4.setText(r10)
            int r3 = r0.getType()
            r0.getIdInteger()
            r0.getLevel()
            switch(r3) {
                case 6: goto L_0x079a;
                case 7: goto L_0x0796;
                case 8: goto L_0x079a;
                case 9: goto L_0x0792;
                case 10: goto L_0x078d;
                case 11: goto L_0x078e;
                default: goto L_0x078d;
            }
        L_0x078d:
            goto L_0x079d
        L_0x078e:
            r2 = 2131165682(0x7f0701f2, float:1.7945588E38)
            goto L_0x079d
        L_0x0792:
            r2 = 2131165670(0x7f0701e6, float:1.7945564E38)
            goto L_0x079d
        L_0x0796:
            r2 = 2131165707(0x7f07020b, float:1.7945639E38)
            goto L_0x079d
        L_0x079a:
            r2 = 2131165413(0x7f0700e5, float:1.7945042E38)
        L_0x079d:
            r5.setImageResource(r2)
        L_0x07a0:
            return r1
        L_0x07a1:
            if (r20 != 0) goto L_0x07b3
            android.content.Context r2 = r6.f9077b
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131493009(0x7f0c0091, float:1.8609486E38)
            r4 = 0
            android.view.View r1 = r2.inflate(r3, r1, r4)
            r7 = r1
            goto L_0x07b5
        L_0x07b3:
            r7 = r20
        L_0x07b5:
            r1 = 2131297778(0x7f0905f2, float:1.821351E38)
            android.view.View r1 = r7.findViewById(r1)
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r1 = 2131297779(0x7f0905f3, float:1.8213513E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r0 = r18.getItem(r19)
            r4 = r0
            Y4.c r4 = (Y4.C0246c) r4
            int r0 = r4.f4335c
            r8.setImageResource(r0)
            int r0 = r4.f4334b
            if (r0 >= 0) goto L_0x07f2
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r2 = r2.getApplicationContext()
            int r0 = java.lang.Math.abs(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r3 = 2131888209(0x7f120851, float:1.9411047E38)
            java.lang.String r0 = r2.getString(r3, r0)
            goto L_0x0807
        L_0x07f2:
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r3 = 2131888212(0x7f120854, float:1.9411053E38)
            java.lang.String r0 = r2.getString(r3, r0)
        L_0x0807:
            r1.setText(r0)
            A4.i r9 = new A4.i
            r5 = 8
            r0 = r9
            r1 = r18
            r2 = r8
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r8.setOnClickListener(r9)
            return r7
        L_0x081a:
            r2 = 0
            if (r20 != 0) goto L_0x082b
            android.content.Context r3 = r6.f9077b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131493028(0x7f0c00a4, float:1.8609525E38)
            android.view.View r1 = r3.inflate(r4, r1, r2)
            goto L_0x082d
        L_0x082b:
            r1 = r20
        L_0x082d:
            r3 = 2131297965(0x7f0906ad, float:1.821389E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r4 = 2131297968(0x7f0906b0, float:1.8213896E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131297963(0x7f0906ab, float:1.8213886E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r7 = 2131297964(0x7f0906ac, float:1.8213888E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r8 = 2131297967(0x7f0906af, float:1.8213894E38)
            android.view.View r8 = r1.findViewById(r8)
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r9 = 2131297966(0x7f0906ae, float:1.8213892E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.Object r0 = r18.getItem(r19)
            Y4.D r0 = (Y4.D) r0
            int r10 = r0.f4295c
            r4.setText(r10)
            int r4 = r0.d
            r7.setImageResource(r4)
            int r4 = r0.f4298i
            if (r4 != 0) goto L_0x087d
            r4 = 8
            r8.setVisibility(r4)
            goto L_0x0889
        L_0x087d:
            r8.setVisibility(r2)
            int r4 = r0.f4298i
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r9.setText(r4)
        L_0x0889:
            boolean r4 = r0.f4302m
            if (r4 == 0) goto L_0x0891
            r5.setVisibility(r2)
            goto L_0x0895
        L_0x0891:
            r2 = 4
            r5.setVisibility(r2)
        L_0x0895:
            j4.f0 r2 = new j4.f0
            r4 = 1
            r2.<init>(r6, r3, r0, r4)
            r3.setOnClickListener(r2)
            return r1
        L_0x089f:
            android.content.Context r2 = r6.f9077b
            r3 = 0
            if (r20 != 0) goto L_0x08b0
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r2)
            r5 = 2131493003(0x7f0c008b, float:1.8609474E38)
            android.view.View r1 = r4.inflate(r5, r1, r3)
            goto L_0x08b2
        L_0x08b0:
            r1 = r20
        L_0x08b2:
            r4 = 2131297737(0x7f0905c9, float:1.8213427E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 2131297738(0x7f0905ca, float:1.821343E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7 = 2131297732(0x7f0905c4, float:1.8213417E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131297735(0x7f0905c7, float:1.8213423E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131297734(0x7f0905c6, float:1.8213421E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.GridView r9 = (android.widget.GridView) r9
            r10 = 2131297733(0x7f0905c5, float:1.821342E38)
            android.view.View r10 = r1.findViewById(r10)
            androidx.constraintlayout.widget.ConstraintLayout r10 = (androidx.constraintlayout.widget.ConstraintLayout) r10
            r11 = 2131297731(0x7f0905c3, float:1.8213415E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.RelativeLayout r11 = (android.widget.RelativeLayout) r11
            java.lang.Object r12 = r18.getItem(r19)
            Y4.D r12 = (Y4.D) r12
            int r13 = r12.f4295c
            r5.setText(r13)
            int r5 = r12.d
            r4.setImageResource(r5)
            int r4 = r12.f4294b
            r5 = 15
            r13 = 8
            if (r4 != r5) goto L_0x0977
            r7.setVisibility(r13)
            r10.setVisibility(r3)
            com.mtma.criminal.city.app.MyApplication r4 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r4 = r4.getApplicationContext()
            int r5 = r12.f4314y
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r7 = 2131888212(0x7f120854, float:1.9411053E38)
            java.lang.String r4 = r4.getString(r7, r5)
            r8.setText(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x092e:
            java.util.ArrayList r5 = r12.f4315z
            int r5 = r5.size()
            if (r3 >= r5) goto L_0x096d
            java.util.ArrayList r5 = r12.f4289A
            java.lang.Object r5 = r5.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.ArrayList r7 = r12.f4315z
            java.lang.Object r7 = r7.get(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r7 = K1.e.R(r7)
            java.util.ArrayList r8 = r12.f4315z
            java.lang.Object r8 = r8.get(r3)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r8 = K1.e.M(r8)
            Y4.c r10 = new Y4.c
            r10.<init>(r7, r5, r8)
            r4.add(r10)
            int r3 = r3 + 1
            goto L_0x092e
        L_0x096d:
            j4.q r3 = new j4.q
            r5 = 3
            r3.<init>((android.content.Context) r2, (java.util.ArrayList) r4, (int) r5)
            r9.setAdapter(r3)
            goto L_0x09d4
        L_0x0977:
            r7.setVisibility(r3)
            r10.setVisibility(r13)
            boolean r2 = r12.f4306q
            if (r2 == 0) goto L_0x09cf
            boolean r2 = r12.f4307r
            if (r2 == 0) goto L_0x09aa
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r2 = r2.getApplicationContext()
            int r3 = r12.y()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r12.x()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            r4 = 2131887503(0x7f12058f, float:1.9409615E38)
            java.lang.String r2 = r2.getString(r4, r3)
            r7.setText(r2)
            goto L_0x09d4
        L_0x09aa:
            com.mtma.criminal.city.app.MyApplication r2 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r2 = r2.getApplicationContext()
            int r3 = r12.z()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = r12.A()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            r4 = 2131886187(0x7f12006b, float:1.9406946E38)
            java.lang.String r2 = r2.getString(r4, r3)
            r7.setText(r2)
            goto L_0x09d4
        L_0x09cf:
            int r2 = r12.f4296e
            r7.setText(r2)
        L_0x09d4:
            j4.i r2 = new j4.i
            r3 = 4
            r2.<init>(r6, r11, r0, r3)
            r11.setOnClickListener(r2)
            return r1
        L_0x09de:
            r2 = 0
            if (r20 != 0) goto L_0x09ef
            android.content.Context r3 = r6.f9077b
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131493001(0x7f0c0089, float:1.860947E38)
            android.view.View r1 = r3.inflate(r4, r1, r2)
            goto L_0x09f1
        L_0x09ef:
            r1 = r20
        L_0x09f1:
            r3 = 2131297720(0x7f0905b8, float:1.8213393E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3
            r4 = 2131297730(0x7f0905c2, float:1.8213413E38)
            android.view.View r4 = r1.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131297722(0x7f0905ba, float:1.8213397E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7 = 2131297721(0x7f0905b9, float:1.8213395E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r8 = 2131297725(0x7f0905bd, float:1.8213403E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r9 = 2131297727(0x7f0905bf, float:1.8213407E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r10 = 2131297728(0x7f0905c0, float:1.821341E38)
            android.view.View r10 = r1.findViewById(r10)
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            java.lang.Object r11 = r18.getItem(r19)
            Y4.d r11 = (Y4.C0247d) r11
            int r12 = r11.f4337a
            r4.setText(r12)
            int r4 = r11.f4338b
            r8.setImageResource(r4)
            int r4 = r11.f4339c
            r8 = -1
            r12 = 8
            if (r4 != r8) goto L_0x0a4e
            r9.setVisibility(r12)
            r9.setImageResource(r2)
            goto L_0x0a56
        L_0x0a4e:
            r9.setVisibility(r2)
            int r4 = r11.f4339c
            r9.setImageResource(r4)
        L_0x0a56:
            int r4 = d
            if (r4 != 0) goto L_0x0a61
            r4 = 2131886274(0x7f1200c2, float:1.9407122E38)
            r5.setText(r4)
            goto L_0x0a67
        L_0x0a61:
            r4 = 2131886272(0x7f1200c0, float:1.9407118E38)
            r5.setText(r4)
        L_0x0a67:
            int r4 = d
            if (r4 != 0) goto L_0x0a79
            int r4 = r6.f9078c
            if (r0 <= r4) goto L_0x0a79
            r10.setVisibility(r2)
            r2 = 2131165371(0x7f0700bb, float:1.7944957E38)
            r7.setImageResource(r2)
            goto L_0x0a82
        L_0x0a79:
            r10.setVisibility(r12)
            r2 = 2131165341(0x7f07009d, float:1.7944896E38)
            r7.setImageResource(r2)
        L_0x0a82:
            j4.i r2 = new j4.i
            r4 = 1
            r2.<init>(r6, r3, r0, r4)
            r3.setOnClickListener(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.C0641q.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0641q(Context context, List list) {
        super(context, 0, list);
        this.f9076a = 5;
        this.f9078c = 0;
        this.f9077b = context;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0641q(Context context, ArrayList arrayList, int i2) {
        super(context, 0, arrayList);
        this.f9076a = i2;
        switch (i2) {
            case 3:
                super(context, 0, arrayList);
                this.f9078c = -1;
                this.f9077b = context;
                return;
            default:
                this.f9077b = context;
                d = 1;
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0641q(MainActivity mainActivity, ArrayList arrayList, int i2) {
        super(mainActivity, 0, arrayList);
        this.f9076a = 0;
        this.f9077b = mainActivity;
        this.f9078c = i2;
        d = 0;
    }
}
