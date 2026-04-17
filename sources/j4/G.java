package j4;

import A4.i;
import R2.b;
import Y4.h;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.utils.U;
import e5.C0505b;
import i3.C0592h;
import java.util.ArrayList;
import java.util.HashMap;
import w0.C1054a;

public final class G extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8874a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8875b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8876c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f8877e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f8878f;

    public G(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.d = false;
        this.f8875b = context;
        this.f8876c = 2;
    }

    public static void a(G g, h hVar) {
        if (!g.d) {
            g.d = true;
            C0505b bVar = new C0505b(g.f8875b, R.layout.dialog_money_icon);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_money_icon_cost);
            TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_money_icon_description);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_money_icon_ok_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_money_icon_cancel_button);
            b.c((LinearLayout) bVar.findViewById(R.id.dialog_money_icon_money_layout), 3);
            ((ImageView) bVar.findViewById(R.id.dialog_money_icon_cost_image)).setImageResource(R.drawable.cash_icon);
            int i2 = g.f8876c;
            if (i2 == 0 || i2 == 2) {
                textView.setText(U.a(hVar.h));
                textView2.setText(R.string.confirm_buy_estate);
            } else if (i2 == 1) {
                textView.setText(U.a(hVar.h / 2));
                textView2.setText(R.string.confirm_sell_estate);
            }
            relativeLayout.setOnClickListener(new i(g, relativeLayout, hVar, bVar, 6));
            relativeLayout2.setOnClickListener(new A4.h(g, relativeLayout2, bVar, 17));
            bVar.show();
        }
    }

    public void b(h hVar) {
        ArrayList arrayList;
        int i2 = 0;
        while (true) {
            arrayList = (ArrayList) this.f8877e;
            if (i2 >= arrayList.size()) {
                break;
            } else if (hVar.f4354a.equals(((h) arrayList.get(i2)).f4354a)) {
                arrayList.remove(i2);
                arrayList.add(i2, hVar);
                break;
            } else {
                i2++;
            }
        }
        arrayList.sort(new H4.i(9));
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            if (((h) arrayList.get(i6)).f4360j) {
                arrayList.remove(arrayList.get(i6));
                arrayList.add(0, (h) arrayList.get(i6));
                i5++;
            }
            if (((h) arrayList.get(i6)).f4361k) {
                arrayList.remove(arrayList.get(i6));
                arrayList.add(i5, (h) arrayList.get(i6));
            }
        }
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: java.io.BufferedInputStream} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v28 */
    /* JADX WARNING: type inference failed for: r2v39 */
    /* JADX WARNING: type inference failed for: r2v40 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x03bd A[SYNTHETIC, Splitter:B:103:0x03bd] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x036e A[SYNTHETIC, Splitter:B:86:0x036e] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0388 A[SYNTHETIC, Splitter:B:91:0x0388] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x03a3 A[SYNTHETIC, Splitter:B:98:0x03a3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r23, android.view.View r24, android.view.ViewGroup r25) {
        /*
            r22 = this;
            r1 = r22
            r0 = r25
            int r2 = r1.f8876c
            r3 = 2
            android.content.Context r4 = r1.f8875b
            r6 = 0
            int r7 = r1.f8874a
            switch(r7) {
                case 0: goto L_0x00c7;
                default: goto L_0x000f;
            }
        L_0x000f:
            if (r24 != 0) goto L_0x001d
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r7 = 2131493034(0x7f0c00aa, float:1.8609537E38)
            android.view.View r0 = r4.inflate(r7, r0, r6)
            goto L_0x001f
        L_0x001d:
            r0 = r24
        L_0x001f:
            r4 = 2131297999(0x7f0906cf, float:1.8213959E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r7 = 2131298004(0x7f0906d4, float:1.8213969E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131298000(0x7f0906d0, float:1.821396E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131298001(0x7f0906d1, float:1.8213963E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131298003(0x7f0906d3, float:1.8213967E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r11 = 2131298005(0x7f0906d5, float:1.821397E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r12 = 2131298006(0x7f0906d6, float:1.8213973E38)
            android.view.View r12 = r0.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            java.lang.Object r13 = r22.getItem(r23)
            Y4.t r13 = (Y4.t) r13
            int r14 = r13.d
            r11.setImageResource(r14)
            java.lang.String r11 = r13.f4431c
            long r14 = r13.f4430b
            int r5 = r13.f4429a
            r6 = 2131886419(0x7f120153, float:1.9407416E38)
            if (r2 != r3) goto L_0x008d
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r7.setText(r2)
            java.lang.String r2 = com.mtma.criminal.city.utils.U.a(r14)
            r8.setText(r2)
            r9.setText(r6)
            r12.setText(r11)
            r2 = 0
            r10.setVisibility(r2)
            goto L_0x00bd
        L_0x008d:
            r3 = 1
            if (r2 != r3) goto L_0x00a3
            java.lang.String r2 = r13.f4433f
            r7.setText(r2)
            java.lang.String r2 = com.mtma.criminal.city.utils.U.a(r14)
            r8.setText(r2)
            r9.setText(r6)
            r12.setText(r11)
            goto L_0x00bd
        L_0x00a3:
            java.lang.String r2 = r13.f4433f
            r7.setText(r2)
            long r2 = (long) r5
            java.lang.String r2 = com.mtma.criminal.city.utils.U.a(r2)
            r8.setText(r2)
            r2 = 2131887493(0x7f120585, float:1.9409595E38)
            r9.setText(r2)
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r12.setText(r2)
        L_0x00bd:
            j4.f0 r2 = new j4.f0
            r3 = 5
            r2.<init>(r1, r4, r13, r3)
            r4.setOnClickListener(r2)
            return r0
        L_0x00c7:
            if (r24 != 0) goto L_0x00d7
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r4)
            r6 = 2131493010(0x7f0c0092, float:1.8609488E38)
            r7 = 0
            android.view.View r0 = r5.inflate(r6, r0, r7)
            r5 = r0
            goto L_0x00d9
        L_0x00d7:
            r5 = r24
        L_0x00d9:
            r0 = 2131297793(0x7f090601, float:1.821354E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r6 = 2131297786(0x7f0905fa, float:1.8213527E38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131297788(0x7f0905fc, float:1.821353E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131297784(0x7f0905f8, float:1.8213523E38)
            android.view.View r8 = r5.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131297785(0x7f0905f9, float:1.8213525E38)
            android.view.View r9 = r5.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131297798(0x7f090606, float:1.8213551E38)
            android.view.View r10 = r5.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131297789(0x7f0905fd, float:1.8213533E38)
            android.view.View r11 = r5.findViewById(r11)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r12 = 2131297796(0x7f090604, float:1.8213547E38)
            android.view.View r12 = r5.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r13 = 2131297799(0x7f090607, float:1.8213553E38)
            android.view.View r13 = r5.findViewById(r13)
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            r14 = 2131297801(0x7f090609, float:1.8213557E38)
            android.view.View r14 = r5.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r15 = 2131297800(0x7f090608, float:1.8213555E38)
            android.view.View r15 = r5.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r15 = 2131297780(0x7f0905f4, float:1.8213515E38)
            android.view.View r15 = r5.findViewById(r15)
            android.widget.RelativeLayout r15 = (android.widget.RelativeLayout) r15
            r3 = 2131297782(0x7f0905f6, float:1.8213519E38)
            android.view.View r3 = r5.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1 = 2131297781(0x7f0905f5, float:1.8213517E38)
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r24 = r13
            r13 = 2131297794(0x7f090602, float:1.8213543E38)
            android.view.View r13 = r5.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r16 = r4
            r4 = 2131297795(0x7f090603, float:1.8213545E38)
            android.view.View r4 = r5.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r25 = r12
            r12 = 2131297791(0x7f0905ff, float:1.8213537E38)
            android.view.View r12 = r5.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r17 = r3
            r3 = 2131297792(0x7f090600, float:1.8213539E38)
            android.view.View r3 = r5.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r18 = r22.getItem(r23)
            r19 = r5
            r5 = r18
            Y4.h r5 = (Y4.h) r5
            r18 = r3
            int r3 = r5.f4358f
            r11.setImageResource(r3)
            int r3 = r5.d
            r0.setText(r3)
            int r0 = r5.g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.setText(r0)
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a
            android.content.Context r0 = r0.getApplicationContext()
            int r3 = r5.f4356c
            long r20 = com.bumptech.glide.d.i0(r3)
            java.lang.String r7 = com.mtma.criminal.city.utils.U.b(r20)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r20 = r11
            r11 = 2131887280(0x7f1204b0, float:1.9409163E38)
            java.lang.String r0 = r0.getString(r11, r7)
            r10.setText(r0)
            long r10 = r5.h
            r0 = 2131886253(0x7f1200ad, float:1.940708E38)
            r7 = 8
            if (r2 != 0) goto L_0x01ec
            r21 = r3
            r3 = 0
            r6.setVisibility(r3)
            r15.setVisibility(r7)
            int r1 = r5.f4357e
            r6.setText(r1)
            r14.setText(r0)
            r0 = 2131887183(0x7f12044f, float:1.9408966E38)
            r8.setText(r0)
            java.lang.String r0 = com.mtma.criminal.city.utils.U.b(r10)
            r9.setText(r0)
        L_0x01e9:
            r2 = 0
            goto L_0x02d8
        L_0x01ec:
            r21 = r3
            r0 = 2131887257(0x7f120499, float:1.9409116E38)
            r3 = 1
            if (r2 != r3) goto L_0x029b
            r6.setVisibility(r7)
            r2 = 0
            r15.setVisibility(r2)
            r13.setVisibility(r2)
            r4.setVisibility(r2)
            r8.setText(r0)
            r2 = 2
            long r10 = r10 / r2
            java.lang.String r0 = com.mtma.criminal.city.utils.U.b(r10)
            r9.setText(r0)
            java.lang.String r0 = r5.f4355b
            boolean r0 = com.google.android.gms.internal.measurement.a.t(r0)
            java.lang.String r2 = "SpouseName"
            if (r0 == 0) goto L_0x0224
            d5.k r0 = d5.o.getMainStatesObject()
            java.lang.String r0 = r0.getNickName()
            r4.setText(r0)
            goto L_0x0227
        L_0x0224:
            r4.setText(r2)
        L_0x0227:
            boolean r0 = r5.f4360j
            if (r0 == 0) goto L_0x0232
            r0 = 2131886270(0x7f1200be, float:1.9407114E38)
            r14.setText(r0)
            goto L_0x0238
        L_0x0232:
            r0 = 2131886298(0x7f1200da, float:1.940717E38)
            r14.setText(r0)
        L_0x0238:
            boolean r0 = r5.f4360j
            r3 = 2131165371(0x7f0700bb, float:1.7944957E38)
            if (r0 != 0) goto L_0x0243
            boolean r0 = r5.f4361k
            if (r0 == 0) goto L_0x0246
        L_0x0243:
            r0 = r18
            goto L_0x0263
        L_0x0246:
            java.lang.String r0 = r5.f4354a
            java.lang.String r2 = "--defaultEstate"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0254
            r1.setImageResource(r3)
            goto L_0x025a
        L_0x0254:
            r0 = 2131165393(0x7f0700d1, float:1.7945002E38)
            r1.setImageResource(r0)
        L_0x025a:
            r12.setVisibility(r7)
            r0 = r18
            r0.setVisibility(r7)
            goto L_0x01e9
        L_0x0263:
            r1.setImageResource(r3)
            r1 = 0
            r12.setVisibility(r1)
            r0.setVisibility(r1)
            boolean r1 = r5.f4360j
            boolean r3 = r5.f4361k
            if (r1 == 0) goto L_0x028c
            if (r3 == 0) goto L_0x028c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SpouseName / "
            r1.<init>(r2)
            d5.k r2 = d5.o.getMainStatesObject()
            java.lang.String r2 = r2.getNickName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            goto L_0x0296
        L_0x028c:
            if (r1 == 0) goto L_0x0296
            d5.k r1 = d5.o.getMainStatesObject()
            java.lang.String r2 = r1.getNickName()
        L_0x0296:
            r0.setText(r2)
            goto L_0x01e9
        L_0x029b:
            r3 = r18
            r0 = 2
            if (r2 != r0) goto L_0x01e9
            r6.setVisibility(r7)
            r12.setVisibility(r7)
            r3.setVisibility(r7)
            r2 = 0
            r15.setVisibility(r2)
            r13.setVisibility(r2)
            r4.setVisibility(r2)
            r0 = 2131887257(0x7f120499, float:1.9409116E38)
            r8.setText(r0)
            java.lang.String r0 = com.mtma.criminal.city.utils.U.b(r10)
            r9.setText(r0)
            r2 = 0
            r4.setText(r2)
            r0 = 2131886253(0x7f1200ad, float:1.940708E38)
            r14.setText(r0)
            r0 = 2131165393(0x7f0700d1, float:1.7945002E38)
            r1.setImageResource(r0)
            r0 = 2131886265(0x7f1200b9, float:1.9407104E38)
            r3 = r17
            r3.setText(r0)
        L_0x02d8:
            r0 = 16
            r1 = r21
            if (r1 != r0) goto L_0x03f6
            r12 = r25
            r1 = 0
            r12.setVisibility(r1)
            java.lang.String r0 = r5.f4365o
            java.lang.String r1 = "no_private_domain_image"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02f6
            r0 = 2131165617(0x7f0701b1, float:1.7945456E38)
            r12.setImageResource(r0)
            goto L_0x03eb
        L_0x02f6:
            java.lang.String r0 = r5.f4355b
            java.lang.String r1 = r5.f4354a
            java.lang.String r3 = " when closing InputStream: "
            java.lang.String r4 = " when closing BufferedInputStream: "
            java.lang.String r6 = "Exception from try-catch block inside "
            java.lang.String r7 = "b"
            java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x0369, all -> 0x0365 }
            java.lang.String r0 = I1.b.Y(r0, r1)     // Catch:{ Exception -> 0x0369, all -> 0x0365 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0369, all -> 0x0365 }
            android.net.Uri r0 = android.net.Uri.fromFile(r8)     // Catch:{ Exception -> 0x0369, all -> 0x0365 }
            com.mtma.criminal.city.app.MyApplication r1 = com.mtma.criminal.city.app.MyApplication.f7090a     // Catch:{ Exception -> 0x0369, all -> 0x0365 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ Exception -> 0x0369, all -> 0x0365 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x0369, all -> 0x0365 }
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch:{ Exception -> 0x0369, all -> 0x0365 }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0363, all -> 0x0360 }
            r8.<init>(r1)     // Catch:{ Exception -> 0x0363, all -> 0x0360 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ Exception -> 0x03a1, all -> 0x035b }
            r8.close()     // Catch:{ IOException -> 0x032a }
            goto L_0x033e
        L_0x032a:
            r0 = move-exception
            r8 = r0
            java.lang.StringBuilder r0 = h0.C0552a.t(r6, r7, r4)
            java.lang.String r4 = r8.getMessage()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r7, r0)
        L_0x033e:
            if (r1 == 0) goto L_0x0358
            r1.close()     // Catch:{ IOException -> 0x0344 }
            goto L_0x0358
        L_0x0344:
            r0 = move-exception
            r1 = r0
        L_0x0346:
            java.lang.StringBuilder r0 = h0.C0552a.t(r6, r7, r3)
            java.lang.String r1 = r1.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r7, r0)
        L_0x0358:
            r7 = r2
            goto L_0x03c4
        L_0x035b:
            r0 = move-exception
            r5 = r1
            r2 = r8
        L_0x035e:
            r1 = r0
            goto L_0x036c
        L_0x0360:
            r0 = move-exception
            r5 = r1
            goto L_0x035e
        L_0x0363:
            r8 = r2
            goto L_0x03a1
        L_0x0365:
            r0 = move-exception
            r1 = r0
            r5 = r2
            goto L_0x036c
        L_0x0369:
            r1 = r2
            r8 = r1
            goto L_0x03a1
        L_0x036c:
            if (r2 == 0) goto L_0x0386
            r2.close()     // Catch:{ IOException -> 0x0372 }
            goto L_0x0386
        L_0x0372:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = h0.C0552a.t(r6, r7, r4)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r7, r0)
        L_0x0386:
            if (r5 == 0) goto L_0x03a0
            r5.close()     // Catch:{ IOException -> 0x038c }
            goto L_0x03a0
        L_0x038c:
            r0 = move-exception
            r2 = r0
            java.lang.StringBuilder r0 = h0.C0552a.t(r6, r7, r3)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r7, r0)
        L_0x03a0:
            throw r1
        L_0x03a1:
            if (r8 == 0) goto L_0x03bb
            r8.close()     // Catch:{ IOException -> 0x03a7 }
            goto L_0x03bb
        L_0x03a7:
            r0 = move-exception
            r8 = r0
            java.lang.StringBuilder r0 = h0.C0552a.t(r6, r7, r4)
            java.lang.String r4 = r8.getMessage()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r7, r0)
        L_0x03bb:
            if (r1 == 0) goto L_0x0358
            r1.close()     // Catch:{ IOException -> 0x03c1 }
            goto L_0x0358
        L_0x03c1:
            r0 = move-exception
            r1 = r0
            goto L_0x0346
        L_0x03c4:
            r12.setImageBitmap(r7)
            com.bumptech.glide.l r0 = com.bumptech.glide.b.c(r16)
            java.lang.String r1 = r5.f4365o
            r0.getClass()
            com.bumptech.glide.j r2 = new com.bumptech.glide.j
            android.content.Context r3 = r0.f5795b
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            com.bumptech.glide.b r6 = r0.f5794a
            r2.<init>(r6, r0, r4, r3)
            com.bumptech.glide.j r0 = r2.C(r1)
            r0.A(r12)
            java.lang.String r0 = r5.f4355b
            java.lang.String r1 = r5.f4354a
            java.lang.String r2 = r5.f4365o
            I1.b.A0(r0, r1, r2)
        L_0x03eb:
            I4.e r0 = new I4.e
            r11 = r20
            r0.<init>(r11)
            r11.setOnClickListener(r0)
            goto L_0x03fb
        L_0x03f6:
            r12 = r25
            r12.setVisibility(r7)
        L_0x03fb:
            j4.E r0 = new j4.E
            r2 = 0
            r1 = r22
            r13 = r24
            r0.<init>(r1, r13, r5, r2)
            r13.setOnClickListener(r0)
            j4.E r0 = new j4.E
            r2 = 1
            r0.<init>(r1, r15, r5, r2)
            r15.setOnClickListener(r0)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.G.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public G(Context context, ArrayList arrayList, int i2, C1054a aVar, HashMap hashMap) {
        super(context, 0, arrayList);
        this.d = false;
        this.f8875b = context;
        this.f8876c = i2;
        this.f8877e = aVar;
        this.f8878f = hashMap;
    }

    public G(Context context, ArrayList arrayList, int i2) {
        super(context, 0, arrayList);
        this.d = false;
        this.f8875b = context;
        this.f8877e = arrayList;
        this.f8876c = i2;
        this.f8878f = a.v(a.c(C0592h.b().e(), "players"), "estateObject");
    }
}
