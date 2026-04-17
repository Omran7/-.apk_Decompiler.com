package H;

import I3.h;
import K.i0;
import R2.b;
import android.animation.ValueAnimator;
import android.view.View;
import c1.i;
import i3.C0590f;
import java.util.ArrayList;
import k5.C0769f;
import k5.C0773j;
import n3.C0866g;
import n3.C0867h;
import n3.F;
import n3.m;
import q3.f;
import q3.k;
import v3.s;

public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f984a;

    /* renamed from: b  reason: collision with root package name */
    public Object f985b;

    /* renamed from: c  reason: collision with root package name */
    public Object f986c;
    public Object d;

    public /* synthetic */ j(int i2) {
        this.f984a = i2;
    }

    private final void a() {
        C0590f fVar = (C0590f) this.d;
        m mVar = (m) fVar.f2694b;
        k kVar = (k) ((f) this.f986c).f11091b;
        i iVar = mVar.f10304i;
        boolean y6 = iVar.y();
        C0866g gVar = (C0866g) fVar.f2695c;
        if (y6) {
            iVar.d("set: " + gVar, (Throwable) null, new Object[0]);
        }
        i iVar2 = mVar.f10306k;
        boolean y7 = iVar2.y();
        s sVar = (s) this.f985b;
        if (y7) {
            iVar2.d("set: " + gVar + " " + sVar, (Throwable) null, new Object[0]);
        }
        s I02 = b.I0(sVar, new F(mVar.f10309n.h(gVar, new ArrayList())), b.A(mVar.f10300b));
        long j6 = mVar.f10307l;
        mVar.f10307l = 1 + j6;
        mVar.k(mVar.f10309n.g(gVar, sVar, I02, j6, true, true));
        mVar.f10301c.e("p", gVar.k(), sVar.o(true), (String) null, new C0867h(mVar, gVar, j6, kVar, 1));
        mVar.n(mVar.a(gVar));
    }

    private final void b() {
        C0773j jVar = (C0773j) this.d;
        jVar.f9558l0 = -1;
        ((View) this.f985b).setPressed(false);
        jVar.setPressed(false);
        if (!jVar.f9586s) {
            ((C0769f) this.f986c).run();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: com.google.android.gms.internal.measurement.zzc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v13 */
    /* JADX WARNING: type inference failed for: r7v26 */
    /* JADX WARNING: type inference failed for: r7v27 */
    /* JADX WARNING: type inference failed for: r7v28 */
    /* JADX WARNING: type inference failed for: r7v29 */
    /* JADX WARNING: type inference failed for: r7v30 */
    /* JADX WARNING: type inference failed for: r7v31 */
    /* JADX WARNING: type inference failed for: r7v32 */
    /* JADX WARNING: Code restructure failed: missing block: B:291:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0641  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0647  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0774  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r1 = r29
            r0 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            int r8 = r1.f984a
            switch(r8) {
                case 0: goto L_0x078b;
                case 1: goto L_0x0778;
                case 2: goto L_0x0548;
                case 3: goto L_0x0525;
                case 4: goto L_0x03bd;
                case 5: goto L_0x03a6;
                case 6: goto L_0x0383;
                case 7: goto L_0x0347;
                case 8: goto L_0x0286;
                case 9: goto L_0x01f5;
                case 10: goto L_0x01d8;
                case 11: goto L_0x01aa;
                case 12: goto L_0x0188;
                case 13: goto L_0x014e;
                case 14: goto L_0x00df;
                case 15: goto L_0x00bc;
                case 16: goto L_0x00b8;
                case 17: goto L_0x00b4;
                case 18: goto L_0x00a4;
                case 19: goto L_0x0094;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.Object r0 = r1.f986c
            y1.a r0 = (y1.C1108a) r0
            java.lang.String r2 = "google.message_id"
            android.content.Intent r3 = r0.f12648a
            java.lang.String r2 = r3.getStringExtra(r2)
            if (r2 != 0) goto L_0x0022
            java.lang.String r2 = "message_id"
            java.lang.String r2 = r3.getStringExtra(r2)
        L_0x0022:
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x002d
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r7)
            goto L_0x0082
        L_0x002d:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "google.message_id"
            android.content.Intent r8 = r0.f12648a
            java.lang.String r3 = r8.getStringExtra(r3)
            if (r3 != 0) goto L_0x0042
            java.lang.String r3 = "message_id"
            java.lang.String r3 = r8.getStringExtra(r3)
        L_0x0042:
            java.lang.String r8 = "google.message_id"
            r2.putString(r8, r3)
            android.content.Intent r0 = r0.f12648a
            java.lang.String r3 = "google.product_id"
            boolean r8 = r0.hasExtra(r3)
            if (r8 == 0) goto L_0x0059
            int r0 = r0.getIntExtra(r3, r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x0059:
            if (r7 == 0) goto L_0x0064
            java.lang.String r0 = "google.product_id"
            int r3 = r7.intValue()
            r2.putInt(r0, r3)
        L_0x0064:
            java.lang.String r0 = "supports_message_handled"
            r2.putBoolean(r0, r6)
            java.lang.Object r0 = r1.f985b
            android.content.Context r0 = (android.content.Context) r0
            y1.l r3 = y1.l.a(r0)
            y1.k r0 = new y1.k
            monitor-enter(r3)
            int r7 = r3.f12677a     // Catch:{ all -> 0x0091 }
            int r8 = r7 + 1
            r3.f12677a = r8     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            r0.<init>(r7, r4, r2, r5)
            com.google.android.gms.tasks.Task r0 = r3.b(r0)
        L_0x0082:
            y1.h r2 = y1.h.f12662b
            I3.c r3 = new I3.c
            java.lang.Object r4 = r1.d
            java.util.concurrent.CountDownLatch r4 = (java.util.concurrent.CountDownLatch) r4
            r3.<init>(r4, r6)
            r0.addOnCompleteListener((java.util.concurrent.Executor) r2, r3)
            return
        L_0x0091:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0091 }
            throw r0
        L_0x0094:
            java.lang.Object r0 = r1.f986c
            I5.u r0 = (I5.u) r0
            java.lang.Object r2 = r1.d
            m0.a0 r2 = (m0.a0) r2
            java.lang.Object r3 = r1.f985b
            w0.o r3 = (w0.C1068o) r3
            r3.w(r0, r2)
            return
        L_0x00a4:
            java.lang.Object r0 = r1.f986c
            j4.p0 r0 = (j4.p0) r0
            java.lang.Object r2 = r1.d
            q4.a r2 = (q4.C0937a) r2
            java.lang.Object r3 = r1.f985b
            w0.o r3 = (w0.C1068o) r3
            r3.x(r0, r2)
            return
        L_0x00b4:
            r29.b()
            return
        L_0x00b8:
            r29.a()
            return
        L_0x00bc:
            android.util.Property r0 = android.view.View.ALPHA
            float[] r2 = new float[r6]
            r3 = 0
            r2[r5] = r3
            java.lang.Object r3 = r1.f985b
            android.view.View r3 = (android.view.View) r3
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r3, r0, r2)
            r0.setRepeatCount(r5)
            r2 = 2500(0x9c4, double:1.235E-320)
            r0.setDuration(r2)
            r0.start()
            K.W r2 = new K.W
            r2.<init>((java.lang.Object) r1, (int) r4)
            r0.addListener(r2)
            return
        L_0x00df:
            W3.a r0 = new W3.a
            java.lang.Object r2 = r1.f985b
            com.google.firebase.storage.f r2 = (com.google.firebase.storage.f) r2
            B0.h r3 = r2.j()
            com.google.firebase.storage.c r4 = r2.f6923b
            R2.i r4 = r4.f6915a
            r0.<init>(r3, r4)
            java.lang.Object r3 = r1.d
            V3.e r3 = (V3.e) r3
            r3.b(r0)
            boolean r3 = r0.k()
            if (r3 == 0) goto L_0x0132
            org.json.JSONObject r3 = r0.h()
            java.lang.String r4 = "downloadTokens"
            java.lang.String r3 = r3.optString(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0132
            java.lang.String r4 = ","
            r6 = -1
            java.lang.String[] r3 = r3.split(r4, r6)
            r3 = r3[r5]
            B0.h r2 = r2.j()
            java.lang.Object r2 = r2.f229c
            android.net.Uri r2 = (android.net.Uri) r2
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.lang.String r4 = "alt"
            java.lang.String r5 = "media"
            r2.appendQueryParameter(r4, r5)
            java.lang.String r4 = "token"
            r2.appendQueryParameter(r4, r3)
            android.net.Uri r7 = r2.build()
        L_0x0132:
            java.lang.Object r2 = r1.f986c
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2
            java.lang.Exception r3 = r0.f4076a
            boolean r4 = r0.k()
            if (r4 == 0) goto L_0x0144
            if (r3 != 0) goto L_0x0144
            r2.setResult(r7)
            goto L_0x014d
        L_0x0144:
            int r0 = r0.f4079e
            com.google.firebase.storage.e r0 = com.google.firebase.storage.e.b(r3, r0)
            r2.setException(r0)
        L_0x014d:
            return
        L_0x014e:
            java.lang.Object r5 = r1.d
            A2.f r5 = (A2.f) r5
            int r6 = r5.f29b
            java.lang.Object r8 = r1.f985b
            com.google.android.gms.common.api.internal.l r8 = (com.google.android.gms.common.api.internal.C0358l) r8
            if (r6 <= 0) goto L_0x016b
            java.lang.Object r6 = r5.d
            android.os.Bundle r6 = (android.os.Bundle) r6
            if (r6 == 0) goto L_0x0168
            java.lang.Object r7 = r1.f986c
            java.lang.String r7 = (java.lang.String) r7
            android.os.Bundle r7 = r6.getBundle(r7)
        L_0x0168:
            r8.onCreate(r7)
        L_0x016b:
            int r6 = r5.f29b
            if (r6 < r4) goto L_0x0172
            r8.onStart()
        L_0x0172:
            int r4 = r5.f29b
            if (r4 < r3) goto L_0x0179
            r8.onResume()
        L_0x0179:
            int r3 = r5.f29b
            if (r3 < r2) goto L_0x0180
            r8.onStop()
        L_0x0180:
            int r2 = r5.f29b
            if (r2 < r0) goto L_0x0187
            r8.onDestroy()
        L_0x0187:
            return
        L_0x0188:
            java.lang.Object r0 = r1.f985b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r2 = r1.f986c
            androidx.fragment.app.U r2 = (androidx.fragment.app.U) r2
            boolean r3 = r0.contains(r2)
            if (r3 == 0) goto L_0x01a9
            r0.remove(r2)
            java.lang.Object r0 = r1.d
            androidx.fragment.app.h r0 = (androidx.fragment.app.C0276h) r0
            r0.getClass()
            androidx.fragment.app.s r0 = r2.f5066c
            android.view.View r0 = r0.f5159N
            int r2 = r2.f5064a
            h0.C0552a.a(r0, r2)
        L_0x01a9:
            return
        L_0x01aa:
            r0 = r5
            r2 = r0
        L_0x01ac:
            java.lang.Object r4 = r1.f985b
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            int r7 = r4.getChildCount()
            if (r0 >= r7) goto L_0x01c3
            android.view.View r4 = r4.getChildAt(r0)
            if (r0 >= r3) goto L_0x01c3
            int r4 = r4.getHeight()
            int r2 = r2 + r4
            int r0 = r0 + r6
            goto L_0x01ac
        L_0x01c3:
            java.lang.Object r0 = r1.f986c
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            r3.height = r2
            r0.setLayoutParams(r3)
            java.lang.Object r0 = r1.d
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setVisibility(r5)
            return
        L_0x01d8:
            java.lang.Object r0 = r1.f986c
            T1.Z r0 = (T1.Z) r0
            java.lang.String r2 = "AppMeasurementJobService processed last upload request."
            T1.X r0 = r0.f3180w
            r0.a(r2)
            java.lang.Object r0 = r1.f985b
            S3.t r0 = (S3.t) r0
            java.lang.Object r0 = r0.f2700b
            android.app.Service r0 = (android.app.Service) r0
            T1.z1 r0 = (T1.C0228z1) r0
            java.lang.Object r2 = r1.d
            android.app.job.JobParameters r2 = (android.app.job.JobParameters) r2
            r0.c(r2)
            return
        L_0x01f5:
            java.lang.String r2 = "Failed to get app instance id"
            java.lang.Object r0 = r1.f986c
            r3 = r0
            com.google.android.gms.internal.measurement.zzcy r3 = (com.google.android.gms.internal.measurement.zzcy) r3
            java.lang.Object r0 = r1.d
            T1.w1 r0 = (T1.C0219w1) r0
            java.lang.Object r4 = r0.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            T1.h0 r5 = r4.f3495q     // Catch:{ RemoteException -> 0x0238 }
            T1.C0212u0.i(r5)     // Catch:{ RemoteException -> 0x0238 }
            T1.J0 r5 = r5.v()     // Catch:{ RemoteException -> 0x0238 }
            T1.I0 r6 = T1.I0.ANALYTICS_STORAGE     // Catch:{ RemoteException -> 0x0238 }
            boolean r5 = r5.k(r6)     // Catch:{ RemoteException -> 0x0238 }
            T1.h0 r6 = r4.f3495q
            T1.Z r8 = r4.f3496r
            if (r5 != 0) goto L_0x023a
            T1.C0212u0.k(r8)     // Catch:{ RemoteException -> 0x0238 }
            T1.X r0 = r8.f3177t     // Catch:{ RemoteException -> 0x0238 }
            java.lang.String r5 = "Analytics storage consent denied; will not get app instance id"
            r0.a(r5)     // Catch:{ RemoteException -> 0x0238 }
            T1.b1 r0 = r4.f3503y     // Catch:{ RemoteException -> 0x0238 }
            T1.C0212u0.j(r0)     // Catch:{ RemoteException -> 0x0238 }
            java.util.concurrent.atomic.AtomicReference r0 = r0.f3247p     // Catch:{ RemoteException -> 0x0238 }
            r0.set(r7)     // Catch:{ RemoteException -> 0x0238 }
            T1.C0212u0.i(r6)     // Catch:{ RemoteException -> 0x0238 }
            S3.r r0 = r6.f3323q     // Catch:{ RemoteException -> 0x0238 }
            r0.D(r7)     // Catch:{ RemoteException -> 0x0238 }
            goto L_0x0246
        L_0x0236:
            r0 = move-exception
            goto L_0x027d
        L_0x0238:
            r0 = move-exception
            goto L_0x026f
        L_0x023a:
            T1.J r5 = r0.d     // Catch:{ RemoteException -> 0x0238 }
            if (r5 != 0) goto L_0x024f
            T1.C0212u0.k(r8)     // Catch:{ RemoteException -> 0x0238 }
            T1.X r0 = r8.f3172f     // Catch:{ RemoteException -> 0x0238 }
            r0.a(r2)     // Catch:{ RemoteException -> 0x0238 }
        L_0x0246:
            T1.Y1 r0 = r4.f3499u
        L_0x0248:
            T1.C0212u0.i(r0)
            r0.Q(r7, r3)
            goto L_0x027c
        L_0x024f:
            java.lang.Object r8 = r1.f985b     // Catch:{ RemoteException -> 0x0238 }
            T1.Z1 r8 = (T1.Z1) r8     // Catch:{ RemoteException -> 0x0238 }
            java.lang.String r7 = r5.g(r8)     // Catch:{ RemoteException -> 0x0238 }
            if (r7 == 0) goto L_0x026b
            T1.b1 r5 = r4.f3503y     // Catch:{ RemoteException -> 0x0238 }
            T1.C0212u0.j(r5)     // Catch:{ RemoteException -> 0x0238 }
            java.util.concurrent.atomic.AtomicReference r5 = r5.f3247p     // Catch:{ RemoteException -> 0x0238 }
            r5.set(r7)     // Catch:{ RemoteException -> 0x0238 }
            T1.C0212u0.i(r6)     // Catch:{ RemoteException -> 0x0238 }
            S3.r r5 = r6.f3323q     // Catch:{ RemoteException -> 0x0238 }
            r5.D(r7)     // Catch:{ RemoteException -> 0x0238 }
        L_0x026b:
            r0.E()     // Catch:{ RemoteException -> 0x0238 }
            goto L_0x0279
        L_0x026f:
            T1.Z r5 = r4.f3496r     // Catch:{ all -> 0x0236 }
            T1.C0212u0.k(r5)     // Catch:{ all -> 0x0236 }
            T1.X r5 = r5.f3172f     // Catch:{ all -> 0x0236 }
            r5.b(r0, r2)     // Catch:{ all -> 0x0236 }
        L_0x0279:
            T1.Y1 r0 = r4.f3499u
            goto L_0x0248
        L_0x027c:
            return
        L_0x027d:
            T1.Y1 r2 = r4.f3499u
            T1.C0212u0.i(r2)
            r2.Q(r7, r3)
            throw r0
        L_0x0286:
            java.lang.Object r0 = r1.f985b
            r2 = r0
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            monitor-enter(r2)
            java.lang.Object r0 = r1.d     // Catch:{ RemoteException -> 0x02d6 }
            T1.w1 r0 = (T1.C0219w1) r0     // Catch:{ RemoteException -> 0x02d6 }
            java.lang.Object r3 = r0.f398a     // Catch:{ RemoteException -> 0x02d6 }
            T1.u0 r3 = (T1.C0212u0) r3     // Catch:{ RemoteException -> 0x02d6 }
            T1.h0 r4 = r3.f3495q     // Catch:{ RemoteException -> 0x02d6 }
            T1.C0212u0.i(r4)     // Catch:{ RemoteException -> 0x02d6 }
            T1.J0 r4 = r4.v()     // Catch:{ RemoteException -> 0x02d6 }
            T1.I0 r5 = T1.I0.ANALYTICS_STORAGE     // Catch:{ RemoteException -> 0x02d6 }
            boolean r4 = r4.k(r5)     // Catch:{ RemoteException -> 0x02d6 }
            if (r4 != 0) goto L_0x02d8
            T1.Z r4 = r3.f3496r     // Catch:{ RemoteException -> 0x02d6 }
            T1.C0212u0.k(r4)     // Catch:{ RemoteException -> 0x02d6 }
            T1.X r4 = r4.f3177t     // Catch:{ RemoteException -> 0x02d6 }
            java.lang.String r5 = "Analytics storage consent denied; will not get app instance id"
            r4.a(r5)     // Catch:{ RemoteException -> 0x02d6 }
            java.lang.Object r0 = r0.f398a     // Catch:{ RemoteException -> 0x02d6 }
            T1.u0 r0 = (T1.C0212u0) r0     // Catch:{ RemoteException -> 0x02d6 }
            T1.b1 r0 = r0.f3503y     // Catch:{ RemoteException -> 0x02d6 }
            T1.C0212u0.j(r0)     // Catch:{ RemoteException -> 0x02d6 }
            java.util.concurrent.atomic.AtomicReference r0 = r0.f3247p     // Catch:{ RemoteException -> 0x02d6 }
            r0.set(r7)     // Catch:{ RemoteException -> 0x02d6 }
            T1.h0 r0 = r3.f3495q     // Catch:{ RemoteException -> 0x02d6 }
            T1.C0212u0.i(r0)     // Catch:{ RemoteException -> 0x02d6 }
            S3.r r0 = r0.f3323q     // Catch:{ RemoteException -> 0x02d6 }
            r0.D(r7)     // Catch:{ RemoteException -> 0x02d6 }
            r2.set(r7)     // Catch:{ RemoteException -> 0x02d6 }
            r2.notify()     // Catch:{ all -> 0x02d1 }
        L_0x02cf:
            monitor-exit(r2)     // Catch:{ all -> 0x02d1 }
            goto L_0x033c
        L_0x02d1:
            r0 = move-exception
            goto L_0x0345
        L_0x02d4:
            r0 = move-exception
            goto L_0x033d
        L_0x02d6:
            r0 = move-exception
            goto L_0x0322
        L_0x02d8:
            T1.J r4 = r0.d     // Catch:{ RemoteException -> 0x02d6 }
            if (r4 != 0) goto L_0x02ec
            T1.Z r0 = r3.f3496r     // Catch:{ RemoteException -> 0x02d6 }
            T1.C0212u0.k(r0)     // Catch:{ RemoteException -> 0x02d6 }
            T1.X r0 = r0.f3172f     // Catch:{ RemoteException -> 0x02d6 }
            java.lang.String r3 = "Failed to get app instance id"
            r0.a(r3)     // Catch:{ RemoteException -> 0x02d6 }
            r2.notify()     // Catch:{ all -> 0x02d1 }
            goto L_0x02cf
        L_0x02ec:
            java.lang.Object r5 = r1.f986c     // Catch:{ RemoteException -> 0x02d6 }
            T1.Z1 r5 = (T1.Z1) r5     // Catch:{ RemoteException -> 0x02d6 }
            java.lang.String r4 = r4.g(r5)     // Catch:{ RemoteException -> 0x02d6 }
            r2.set(r4)     // Catch:{ RemoteException -> 0x02d6 }
            java.lang.Object r4 = r2.get()     // Catch:{ RemoteException -> 0x02d6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ RemoteException -> 0x02d6 }
            if (r4 == 0) goto L_0x0317
            java.lang.Object r5 = r0.f398a     // Catch:{ RemoteException -> 0x02d6 }
            T1.u0 r5 = (T1.C0212u0) r5     // Catch:{ RemoteException -> 0x02d6 }
            T1.b1 r5 = r5.f3503y     // Catch:{ RemoteException -> 0x02d6 }
            T1.C0212u0.j(r5)     // Catch:{ RemoteException -> 0x02d6 }
            java.util.concurrent.atomic.AtomicReference r5 = r5.f3247p     // Catch:{ RemoteException -> 0x02d6 }
            r5.set(r4)     // Catch:{ RemoteException -> 0x02d6 }
            T1.h0 r3 = r3.f3495q     // Catch:{ RemoteException -> 0x02d6 }
            T1.C0212u0.i(r3)     // Catch:{ RemoteException -> 0x02d6 }
            S3.r r3 = r3.f3323q     // Catch:{ RemoteException -> 0x02d6 }
            r3.D(r4)     // Catch:{ RemoteException -> 0x02d6 }
        L_0x0317:
            r0.E()     // Catch:{ RemoteException -> 0x02d6 }
            java.lang.Object r0 = r1.f985b     // Catch:{ all -> 0x02d1 }
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch:{ all -> 0x02d1 }
        L_0x031e:
            r0.notify()     // Catch:{ all -> 0x02d1 }
            goto L_0x033b
        L_0x0322:
            java.lang.Object r3 = r1.d     // Catch:{ all -> 0x02d4 }
            T1.w1 r3 = (T1.C0219w1) r3     // Catch:{ all -> 0x02d4 }
            java.lang.Object r3 = r3.f398a     // Catch:{ all -> 0x02d4 }
            T1.u0 r3 = (T1.C0212u0) r3     // Catch:{ all -> 0x02d4 }
            T1.Z r3 = r3.f3496r     // Catch:{ all -> 0x02d4 }
            T1.C0212u0.k(r3)     // Catch:{ all -> 0x02d4 }
            T1.X r3 = r3.f3172f     // Catch:{ all -> 0x02d4 }
            java.lang.String r4 = "Failed to get app instance id"
            r3.b(r0, r4)     // Catch:{ all -> 0x02d4 }
            java.lang.Object r0 = r1.f985b     // Catch:{ all -> 0x02d1 }
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0     // Catch:{ all -> 0x02d1 }
            goto L_0x031e
        L_0x033b:
            monitor-exit(r2)     // Catch:{ all -> 0x02d1 }
        L_0x033c:
            return
        L_0x033d:
            java.lang.Object r3 = r1.f985b     // Catch:{ all -> 0x02d1 }
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3     // Catch:{ all -> 0x02d1 }
            r3.notify()     // Catch:{ all -> 0x02d1 }
            throw r0     // Catch:{ all -> 0x02d1 }
        L_0x0345:
            monitor-exit(r2)     // Catch:{ all -> 0x02d1 }
            throw r0
        L_0x0347:
            java.lang.Object r0 = r1.f986c
            T1.Z1 r0 = (T1.Z1) r0
            java.lang.Object r2 = r1.d
            T1.d r2 = (T1.C0161d) r2
            java.lang.Object r3 = r1.f985b
            T1.w1 r3 = (T1.C0219w1) r3
            T1.J r4 = r3.d
            java.lang.Object r5 = r3.f398a
            T1.u0 r5 = (T1.C0212u0) r5
            if (r4 != 0) goto L_0x0368
            T1.Z r0 = r5.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r2 = "[sgtm] Discarding data. Failed to update batch upload status."
            T1.X r0 = r0.f3172f
            r0.a(r2)
            goto L_0x0382
        L_0x0368:
            r4.t(r0, r2)     // Catch:{ RemoteException -> 0x036f }
            r3.E()     // Catch:{ RemoteException -> 0x036f }
            goto L_0x0382
        L_0x036f:
            r0 = move-exception
            T1.Z r3 = r5.f3496r
            T1.C0212u0.k(r3)
            long r4 = r2.f3268a
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "[sgtm] Failed to update batch upload status, rowId, exception"
            T1.X r3 = r3.f3172f
            r3.c(r4, r2, r0)
        L_0x0382:
            return
        L_0x0383:
            java.lang.Object r0 = r1.d
            T1.D0 r0 = (T1.D0) r0
            T1.T1 r2 = r0.f2818a
            r2.j()
            java.lang.Object r2 = r1.f985b
            T1.W1 r2 = (T1.W1) r2
            java.lang.Object r3 = r2.v()
            java.lang.Object r4 = r1.f986c
            T1.Z1 r4 = (T1.Z1) r4
            T1.T1 r0 = r0.f2818a
            if (r3 != 0) goto L_0x03a2
            java.lang.String r2 = r2.f3140b
            r0.Q(r2, r4)
            goto L_0x03a5
        L_0x03a2:
            r0.W(r2, r4)
        L_0x03a5:
            return
        L_0x03a6:
            java.lang.Object r0 = r1.d
            T1.D0 r0 = (T1.D0) r0
            T1.T1 r2 = r0.f2818a
            r2.j()
            java.lang.Object r2 = r1.f985b
            T1.v r2 = (T1.C0214v) r2
            java.lang.Object r3 = r1.f986c
            java.lang.String r3 = (java.lang.String) r3
            T1.T1 r0 = r0.f2818a
            r0.r(r2, r3)
            return
        L_0x03bd:
            java.lang.Object r0 = r1.d
            T1.D0 r0 = (T1.D0) r0
            r0.getClass()
            java.lang.Object r2 = r1.f985b
            T1.v r2 = (T1.C0214v) r2
            java.lang.String r3 = r2.f3508a
            java.lang.String r4 = "_cmp"
            boolean r3 = r4.equals(r3)
            T1.T1 r4 = r0.f2818a
            if (r3 == 0) goto L_0x0413
            T1.u r10 = r2.f3509b
            if (r10 == 0) goto L_0x0413
            android.os.Bundle r3 = r10.f3472a
            int r5 = r3.size()
            if (r5 != 0) goto L_0x03e1
            goto L_0x0413
        L_0x03e1:
            java.lang.String r5 = "_cis"
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "referrer broadcast"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x03f7
            java.lang.String r5 = "referrer API"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0413
        L_0x03f7:
            T1.Z r3 = r4.c()
            java.lang.String r5 = r2.toString()
            java.lang.String r8 = "Event has been filtered "
            T1.X r3 = r3.f3178u
            r3.b(r5, r8)
            T1.v r3 = new T1.v
            java.lang.String r11 = r2.f3510c
            long r12 = r2.d
            java.lang.String r9 = "_cmpx"
            r8 = r3
            r8.<init>(r9, r10, r11, r12)
            r2 = r3
        L_0x0413:
            java.lang.String r3 = r2.f3508a
            T1.G r5 = T1.H.f2929n1
            java.lang.Object r5 = r5.a(r7)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.Object r8 = r1.f986c
            T1.Z1 r8 = (T1.Z1) r8
            if (r5 != 0) goto L_0x0457
            T1.n0 r5 = r4.f3060a
            T1.T1.L(r5)
            java.lang.String r9 = r8.f3201a
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x0435
            goto L_0x0452
        L_0x0435:
            n.e r5 = r5.f3404q
            java.lang.Object r5 = r5.get(r9)
            com.google.android.gms.internal.measurement.zzgo r5 = (com.google.android.gms.internal.measurement.zzgo) r5
            if (r5 != 0) goto L_0x0440
            goto L_0x0452
        L_0x0440:
            int r5 = r5.zza()
            if (r5 == 0) goto L_0x0452
            T1.Z r5 = r4.c()
            java.lang.String r10 = "EES config found for"
            T1.X r5 = r5.f3180w
            r5.b(r9, r10)
            goto L_0x0457
        L_0x0452:
            r0.C(r2, r8)
            goto L_0x0524
        L_0x0457:
            T1.n0 r5 = r4.f3060a
            T1.d0 r9 = r4.f3065p
            T1.T1.L(r5)
            java.lang.String r10 = r8.f3201a
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto L_0x0467
            goto L_0x0470
        L_0x0467:
            T1.m0 r5 = r5.f3406s
            java.lang.Object r5 = r5.get(r10)
            r7 = r5
            com.google.android.gms.internal.measurement.zzc r7 = (com.google.android.gms.internal.measurement.zzc) r7
        L_0x0470:
            if (r7 == 0) goto L_0x0514
            T1.T1.L(r9)     // Catch:{ zzd -> 0x04f8 }
            T1.u r5 = r2.f3509b     // Catch:{ zzd -> 0x04f8 }
            android.os.Bundle r5 = r5.v()     // Catch:{ zzd -> 0x04f8 }
            java.util.HashMap r5 = T1.C0162d0.Z(r5, r6)     // Catch:{ zzd -> 0x04f8 }
            java.lang.String[] r6 = T1.K0.f2976c     // Catch:{ zzd -> 0x04f8 }
            java.lang.String[] r10 = T1.K0.f2974a     // Catch:{ zzd -> 0x04f8 }
            java.lang.String r6 = T1.K0.e(r3, r6, r10)     // Catch:{ zzd -> 0x04f8 }
            if (r6 == 0) goto L_0x048a
            goto L_0x048b
        L_0x048a:
            r6 = r3
        L_0x048b:
            com.google.android.gms.internal.measurement.zzaa r10 = new com.google.android.gms.internal.measurement.zzaa     // Catch:{ zzd -> 0x04f8 }
            long r11 = r2.d     // Catch:{ zzd -> 0x04f8 }
            r10.<init>(r6, r11, r5)     // Catch:{ zzd -> 0x04f8 }
            boolean r5 = r7.zze(r10)     // Catch:{ zzd -> 0x04f8 }
            if (r5 != 0) goto L_0x0499
            goto L_0x0505
        L_0x0499:
            boolean r5 = r7.zzg()
            if (r5 == 0) goto L_0x04bd
            T1.Z r2 = r4.c()
            java.lang.String r5 = "EES edited event"
            T1.X r2 = r2.f3180w
            r2.b(r3, r5)
            T1.T1.L(r9)
            com.google.android.gms.internal.measurement.zzab r2 = r7.zza()
            com.google.android.gms.internal.measurement.zzaa r2 = r2.zzb()
            T1.v r2 = T1.C0162d0.R(r2)
            r0.C(r2, r8)
            goto L_0x04c0
        L_0x04bd:
            r0.C(r2, r8)
        L_0x04c0:
            boolean r2 = r7.zzf()
            if (r2 == 0) goto L_0x0524
            com.google.android.gms.internal.measurement.zzab r2 = r7.zza()
            java.util.List r2 = r2.zzc()
            java.util.Iterator r2 = r2.iterator()
        L_0x04d2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0524
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.zzaa r3 = (com.google.android.gms.internal.measurement.zzaa) r3
            T1.Z r5 = r4.c()
            java.lang.String r6 = r3.zze()
            java.lang.String r7 = "EES logging created event"
            T1.X r5 = r5.f3180w
            r5.b(r6, r7)
            T1.T1.L(r9)
            T1.v r3 = T1.C0162d0.R(r3)
            r0.C(r3, r8)
            goto L_0x04d2
        L_0x04f8:
            T1.Z r5 = r4.c()
            java.lang.String r6 = r8.f3202b
            java.lang.String r7 = "EES error. appId, eventName"
            T1.X r5 = r5.f3172f
            r5.c(r7, r6, r3)
        L_0x0505:
            T1.Z r4 = r4.c()
            java.lang.String r5 = "EES was not applied to event"
            T1.X r4 = r4.f3180w
            r4.b(r3, r5)
            r0.C(r2, r8)
            goto L_0x0524
        L_0x0514:
            T1.Z r3 = r4.c()
            T1.X r3 = r3.f3180w
            java.lang.String r4 = r8.f3201a
            java.lang.String r5 = "EES not loaded for"
            r3.b(r4, r5)
            r0.C(r2, r8)
        L_0x0524:
            return
        L_0x0525:
            java.lang.Object r0 = r1.d
            T1.D0 r0 = (T1.D0) r0
            T1.T1 r2 = r0.f2818a
            r2.j()
            java.lang.Object r2 = r1.f985b
            T1.e r2 = (T1.C0164e) r2
            T1.W1 r3 = r2.f3273c
            java.lang.Object r3 = r3.v()
            java.lang.Object r4 = r1.f986c
            T1.Z1 r4 = (T1.Z1) r4
            T1.T1 r0 = r0.f2818a
            if (r3 != 0) goto L_0x0544
            r0.P(r2, r4)
            goto L_0x0547
        L_0x0544:
            r0.U(r2, r4)
        L_0x0547:
            return
        L_0x0548:
            java.lang.Object r5 = r1.f985b
            T1.D0 r5 = (T1.D0) r5
            T1.T1 r5 = r5.f2818a
            r5.j()
            java.lang.Object r8 = r1.f986c
            T1.Z1 r8 = (T1.Z1) r8
            java.lang.String r8 = r8.f3201a
            com.google.android.gms.common.internal.I.g(r8)
            T1.g r9 = r5.h0()
            T1.G r10 = T1.H.f2872P0
            boolean r9 = r9.B(r7, r10)
            if (r9 != 0) goto L_0x0568
            goto L_0x076f
        L_0x0568:
            T1.r0 r9 = r5.f()
            r9.o()
            r5.k()
            T1.n r11 = r5.f3062c
            T1.T1.L(r11)
            java.lang.Object r9 = r1.d
            T1.d r9 = (T1.C0161d) r9
            long r13 = r9.f3268a
            java.lang.Object r12 = r11.f398a
            r15 = r12
            T1.u0 r15 = (T1.C0212u0) r15
            T1.g r12 = r15.f3494p
            boolean r12 = r12.B(r7, r10)
            if (r12 != 0) goto L_0x058f
            r0 = r7
            r27 = r13
            goto L_0x0645
        L_0x058f:
            r11.o()
            r11.p()
            android.database.sqlite.SQLiteDatabase r16 = r11.k0()     // Catch:{ SQLiteException -> 0x062a, all -> 0x0627 }
            java.lang.String r17 = "upload_queue"
            java.lang.String r18 = "rowId"
            java.lang.String r19 = "app_id"
            java.lang.String r20 = "measurement_batch"
            java.lang.String r21 = "upload_uri"
            java.lang.String r22 = "upload_headers"
            java.lang.String r23 = "upload_type"
            java.lang.String r24 = "retry_count"
            java.lang.String r25 = "creation_timestamp"
            java.lang.String r26 = "associated_row_id"
            java.lang.String r27 = "last_upload_timestamp"
            java.lang.String[] r18 = new java.lang.String[]{r18, r19, r20, r21, r22, r23, r24, r25, r26, r27}     // Catch:{ SQLiteException -> 0x062a, all -> 0x0627 }
            java.lang.String r19 = "rowId=?"
            java.lang.String r12 = java.lang.String.valueOf(r13)     // Catch:{ SQLiteException -> 0x062a, all -> 0x0627 }
            java.lang.String[] r20 = new java.lang.String[]{r12}     // Catch:{ SQLiteException -> 0x062a, all -> 0x0627 }
            java.lang.String r24 = "1"
            r22 = 0
            r23 = 0
            r21 = 0
            android.database.Cursor r12 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ SQLiteException -> 0x062a, all -> 0x0627 }
            boolean r16 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x061c, all -> 0x0619 }
            if (r16 != 0) goto L_0x05d3
            r27 = r13
            goto L_0x063f
        L_0x05d3:
            java.lang.String r16 = r12.getString(r6)     // Catch:{ SQLiteException -> 0x061c, all -> 0x0619 }
            com.google.android.gms.common.internal.I.g(r16)     // Catch:{ SQLiteException -> 0x061c, all -> 0x0619 }
            byte[] r4 = r12.getBlob(r4)     // Catch:{ SQLiteException -> 0x061c, all -> 0x0619 }
            java.lang.String r17 = r12.getString(r3)     // Catch:{ SQLiteException -> 0x061c, all -> 0x0619 }
            java.lang.String r18 = r12.getString(r2)     // Catch:{ SQLiteException -> 0x061c, all -> 0x0619 }
            int r0 = r12.getInt(r0)     // Catch:{ SQLiteException -> 0x061c, all -> 0x0619 }
            r3 = 6
            int r19 = r12.getInt(r3)     // Catch:{ SQLiteException -> 0x061c, all -> 0x0619 }
            r3 = 7
            long r20 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x061c, all -> 0x0619 }
            r3 = 8
            long r22 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x061c, all -> 0x0619 }
            r3 = 9
            long r24 = r12.getLong(r3)     // Catch:{ SQLiteException -> 0x061c, all -> 0x0619 }
            r3 = r12
            r12 = r16
            r27 = r13
            r2 = r15
            r15 = r4
            r16 = r17
            r17 = r18
            r18 = r0
            T1.U1 r0 = r11.R(r12, r13, r15, r16, r17, r18, r19, r20, r22, r24)     // Catch:{ SQLiteException -> 0x0617, all -> 0x0615 }
            r3.close()
            goto L_0x0645
        L_0x0615:
            r0 = move-exception
            goto L_0x0622
        L_0x0617:
            r0 = move-exception
            goto L_0x0625
        L_0x0619:
            r0 = move-exception
            r3 = r12
            goto L_0x0622
        L_0x061c:
            r0 = move-exception
            r3 = r12
            r27 = r13
            r2 = r15
            goto L_0x0625
        L_0x0622:
            r7 = r3
            goto L_0x0772
        L_0x0625:
            r12 = r3
            goto L_0x062f
        L_0x0627:
            r0 = move-exception
            goto L_0x0772
        L_0x062a:
            r0 = move-exception
            r27 = r13
            r2 = r15
            r12 = r7
        L_0x062f:
            T1.Z r2 = r2.f3496r     // Catch:{ all -> 0x0770 }
            T1.C0212u0.k(r2)     // Catch:{ all -> 0x0770 }
            T1.X r2 = r2.f3172f     // Catch:{ all -> 0x0770 }
            java.lang.String r3 = "Error to querying MeasurementBatch from upload_queue. rowId"
            java.lang.Long r4 = java.lang.Long.valueOf(r27)     // Catch:{ all -> 0x0770 }
            r2.c(r3, r4, r0)     // Catch:{ all -> 0x0770 }
        L_0x063f:
            if (r12 == 0) goto L_0x0644
            r12.close()
        L_0x0644:
            r0 = r7
        L_0x0645:
            if (r0 != 0) goto L_0x0658
            T1.Z r0 = r5.c()
            java.lang.Long r2 = java.lang.Long.valueOf(r27)
            java.lang.String r3 = "[sgtm] Queued batch doesn't exist. appId, rowId"
            T1.X r0 = r0.f3175r
            r0.c(r3, r8, r2)
            goto L_0x076f
        L_0x0658:
            java.util.HashMap r2 = r5.f3054N
            java.lang.String r0 = r0.f3081c
            int r3 = r9.f3269b
            if (r3 != r6) goto L_0x0715
            boolean r3 = r2.containsKey(r0)
            if (r3 == 0) goto L_0x0669
            r2.remove(r0)
        L_0x0669:
            T1.n r0 = r5.f3062c
            T1.T1.L(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r27)
            r0.C(r2)
            T1.Z r0 = r5.c()
            java.lang.String r3 = "[sgtm] queued batch deleted after successful client upload. appId, rowId"
            T1.X r0 = r0.f3180w
            r0.c(r3, r8, r2)
            long r2 = r9.f3270c
            r11 = 0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x076f
            T1.n r0 = r5.f3062c
            T1.T1.L(r0)
            java.lang.Object r4 = r0.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            T1.g r9 = r4.f3494p
            T1.Z r11 = r4.f3496r
            boolean r7 = r9.B(r7, r10)
            if (r7 != 0) goto L_0x069c
            goto L_0x06f3
        L_0x069c:
            r0.o()
            r0.p()
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            android.content.ContentValues r9 = new android.content.ContentValues
            r9.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r10 = "upload_type"
            r9.put(r10, r6)
            G1.b r4 = r4.f3501w
            r4.getClass()
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            java.lang.String r6 = "creation_timestamp"
            r9.put(r6, r4)
            android.database.sqlite.SQLiteDatabase r0 = r0.k0()     // Catch:{ SQLiteException -> 0x06f1 }
            java.lang.String r4 = "upload_queue"
            java.lang.String r6 = "rowid=? AND app_id=? AND upload_type=?"
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch:{ SQLiteException -> 0x06f1 }
            r12 = 4
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x06f1 }
            java.lang.String[] r10 = new java.lang.String[]{r10, r8, r12}     // Catch:{ SQLiteException -> 0x06f1 }
            int r0 = r0.update(r4, r9, r6, r10)     // Catch:{ SQLiteException -> 0x06f1 }
            long r9 = (long) r0     // Catch:{ SQLiteException -> 0x06f1 }
            r12 = 1
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x06f3
            T1.C0212u0.k(r11)     // Catch:{ SQLiteException -> 0x06f1 }
            T1.X r0 = r11.f3175r     // Catch:{ SQLiteException -> 0x06f1 }
            java.lang.String r4 = "Google Signal pending batch not updated. appId, rowId"
            r0.c(r4, r8, r7)     // Catch:{ SQLiteException -> 0x06f1 }
            goto L_0x06f3
        L_0x06f1:
            r0 = move-exception
            goto L_0x0706
        L_0x06f3:
            T1.Z r0 = r5.c()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "[sgtm] queued Google Signal batch updated. appId, signalRowId"
            T1.X r0 = r0.f3180w
            r0.c(r3, r8, r2)
            r5.Z(r8)
            goto L_0x076f
        L_0x0706:
            T1.C0212u0.k(r11)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Failed to update google Signal pending batch. appid, rowId"
            T1.X r4 = r11.f3172f
            r4.d(r3, r8, r2, r0)
            throw r0
        L_0x0715:
            r4 = 3
            if (r3 != r4) goto L_0x0756
            java.lang.Object r3 = r2.get(r0)
            T1.S1 r3 = (T1.S1) r3
            if (r3 != 0) goto L_0x0729
            T1.S1 r3 = new T1.S1
            r3.<init>(r5)
            r2.put(r0, r3)
            goto L_0x0734
        L_0x0729:
            int r2 = r3.f3037b
            int r2 = r2 + r6
            r3.f3037b = r2
            long r6 = r3.a()
            r3.f3038c = r6
        L_0x0734:
            long r2 = r3.f3038c
            G1.a r4 = r5.g()
            G1.b r4 = (G1.b) r4
            r4.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r6
            T1.Z r4 = r5.c()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds"
            T1.X r4 = r4.f3180w
            r4.d(r3, r8, r0, r2)
        L_0x0756:
            T1.n r0 = r5.f3062c
            T1.T1.L(r0)
            long r2 = r9.f3268a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.F(r2)
            T1.Z r0 = r5.c()
            java.lang.String r3 = "[sgtm] increased batch retry count after failed client upload. appId, rowId"
            T1.X r0 = r0.f3180w
            r0.c(r3, r8, r2)
        L_0x076f:
            return
        L_0x0770:
            r0 = move-exception
            r7 = r12
        L_0x0772:
            if (r7 == 0) goto L_0x0777
            r7.close()
        L_0x0777:
            throw r0
        L_0x0778:
            java.lang.Object r0 = r1.f986c
            I3.h r0 = (I3.h) r0
            java.lang.Object r2 = r1.f985b
            android.view.View r2 = (android.view.View) r2
            K.d0.h(r2, r0)
            java.lang.Object r0 = r1.d
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            r0.start()
            return
        L_0x078b:
            java.lang.Object r0 = r1.f985b     // Catch:{ Exception -> 0x0793 }
            H.d r0 = (H.d) r0     // Catch:{ Exception -> 0x0793 }
            java.lang.Object r7 = r0.call()     // Catch:{ Exception -> 0x0793 }
        L_0x0793:
            B2.a r0 = new B2.a
            java.lang.Object r2 = r1.f986c
            H.e r2 = (H.e) r2
            r3 = 4
            r0.<init>((java.lang.Object) r2, (java.lang.Object) r7, (int) r3)
            java.lang.Object r2 = r1.d
            android.os.Handler r2 = (android.os.Handler) r2
            r2.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H.j.run():void");
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i2) {
        this.f984a = i2;
        this.f985b = obj;
        this.f986c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i2, boolean z3) {
        this.f984a = i2;
        this.f985b = obj2;
        this.f986c = obj3;
        this.d = obj;
    }

    public j(View view, i0 i0Var, h hVar, ValueAnimator valueAnimator) {
        this.f984a = 1;
        this.f985b = view;
        this.f986c = hVar;
        this.d = valueAnimator;
    }
}
