package B0;

import F0.C0015e;
import T1.C0165e0;
import T1.T1;

/* renamed from: B0.c  reason: case insensitive filesystem */
public final class C0004c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f211a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f212b;

    public C0004c(C0165e0 e0Var, boolean z3) {
        this.f211a = 5;
        this.f212b = e0Var;
    }

    /* JADX WARNING: type inference failed for: r5v16, types: [T1.c, T1.O1] */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0402, code lost:
        if (r5.v0() >= 242600) goto L_0x0404;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            r0 = 0
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            int r6 = r15.f211a
            switch(r6) {
                case 0: goto L_0x0568;
                case 1: goto L_0x0548;
                case 2: goto L_0x0538;
                case 3: goto L_0x04a8;
                case 4: goto L_0x049a;
                case 5: goto L_0x048e;
                case 6: goto L_0x0477;
                case 7: goto L_0x045b;
                case 8: goto L_0x037e;
                case 9: goto L_0x026b;
                case 10: goto L_0x0227;
                case 11: goto L_0x0208;
                case 12: goto L_0x0200;
                case 13: goto L_0x01f4;
                case 14: goto L_0x01e6;
                case 15: goto L_0x01b0;
                case 16: goto L_0x019f;
                case 17: goto L_0x0193;
                case 18: goto L_0x018b;
                case 19: goto L_0x016a;
                case 20: goto L_0x0160;
                case 21: goto L_0x0158;
                case 22: goto L_0x013c;
                case 23: goto L_0x012c;
                case 24: goto L_0x00fc;
                case 25: goto L_0x00cb;
                case 26: goto L_0x00a7;
                case 27: goto L_0x008c;
                case 28: goto L_0x0028;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r15.f212b
            K4.j r0 = (K4.j) r0
            java.lang.Object r1 = r0.d
            j4.b r1 = (j4.C0614b) r1
            int r0 = r0.f1527b
            java.lang.String r0 = j4.C0614b.a(r1, r0)
            java.lang.String r1 = "game_music"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0024
            R2.b.L0()
        L_0x0024:
            R2.b.w(r5)
            return
        L_0x0028:
            java.lang.Object r0 = r15.f212b
            e5.c r0 = (e5.C0506c) r0
            c5.e r1 = r0.f7692w
            float r2 = r1.f5712b
            float r2 = r2 * r2
            float r3 = r1.f5713c
            float r3 = r3 * r3
            float r3 = r3 + r2
            r2 = 0
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x003b
            goto L_0x0069
        L_0x003b:
            r4 = 1270791200(0x4bbebc20, float:2.5E7)
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0054
            float r4 = r4 / r3
            double r2 = (double) r4
            double r2 = java.lang.Math.sqrt(r2)
            float r2 = (float) r2
            float r3 = r1.f5712b
            float r3 = r3 * r2
            r1.f5712b = r3
            float r3 = r1.f5713c
            float r3 = r3 * r2
            r1.f5713c = r3
            goto L_0x0069
        L_0x0054:
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0069
            float r2 = r2 / r3
            double r2 = (double) r2
            double r2 = java.lang.Math.sqrt(r2)
            float r2 = (float) r2
            float r3 = r1.f5712b
            float r3 = r3 * r2
            r1.f5712b = r3
            float r3 = r1.f5713c
            float r3 = r3 * r2
            r1.f5713c = r3
        L_0x0069:
            float r2 = r1.f5712b
            r3 = 1028443341(0x3d4ccccd, float:0.05)
            float r4 = r2 * r3
            float r5 = r1.f5713c
            float r3 = r3 * r5
            float r2 = r2 - r4
            r1.f5712b = r2
            float r5 = r5 - r3
            r1.f5713c = r5
            c5.e r1 = r0.f7691v
            float r2 = r1.f5712b
            float r2 = r2 + r4
            r1.f5712b = r2
            float r2 = r1.f5713c
            float r2 = r2 + r3
            r1.f5713c = r2
            r0.a()
            r0.invalidate()
            return
        L_0x008c:
            java.lang.Object r0 = r15.f212b
            com.google.firebase.auth.FirebaseAuth r0 = (com.google.firebase.auth.FirebaseAuth) r0
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.d
            java.util.Iterator r1 = r1.iterator()
        L_0x0096:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a6
            java.lang.Object r2 = r1.next()
            e3.f r2 = (e3.C0498f) r2
            r2.a(r0)
            goto L_0x0096
        L_0x00a6:
            return
        L_0x00a7:
            java.lang.Object r0 = r15.f212b
            com.google.android.gms.common.api.internal.y r0 = (com.google.android.gms.common.api.internal.C0370y) r0
            r0.f6114c = r5
            java.lang.Object r1 = r0.f6115e
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            U.e r2 = r1.f6300M
            if (r2 == 0) goto L_0x00c1
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x00c1
            int r1 = r0.f6113b
            r0.c(r1)
            goto L_0x00ca
        L_0x00c1:
            int r2 = r1.f6299L
            if (r2 != r3) goto L_0x00ca
            int r0 = r0.f6113b
            r1.C(r0)
        L_0x00ca:
            return
        L_0x00cb:
            java.lang.Object r0 = r15.f212b
            K4.h r0 = (K4.h) r0
            java.lang.Object r1 = r0.f1523c
            com.mtma.criminal.city.utils.K r1 = (com.mtma.criminal.city.utils.K) r1
            java.lang.Object r1 = r1.f7360b
            c1.i r1 = (c1.i) r1
            java.lang.Object r1 = r1.f5606c
            i3.f r1 = (i3.C0590f) r1
            java.lang.String r2 = "mainStatesObject/nickName"
            S3.r r1 = r1.q(r2)
            java.lang.Object r0 = r0.f1523c
            com.mtma.criminal.city.utils.K r0 = (com.mtma.criminal.city.utils.K) r0
            java.lang.Object r0 = r0.f7360b
            c1.i r0 = (c1.i) r0
            java.lang.Object r0 = r0.f5605b
            java.lang.String r0 = (java.lang.String) r0
            S3.r r0 = r1.i(r0)
            com.mtma.criminal.city.fragments.gangBase.I r1 = new com.mtma.criminal.city.fragments.gangBase.I
            r2 = 9
            r1.<init>(r15, r2)
            r0.d(r1)
            return
        L_0x00fc:
            java.lang.Object r0 = r15.f212b
            K4.h r0 = (K4.h) r0
            java.lang.Object r1 = r0.f1523c
            com.mtma.criminal.city.utils.K r1 = (com.mtma.criminal.city.utils.K) r1
            java.lang.Object r1 = r1.f7360b
            c1.i r1 = (c1.i) r1
            java.lang.Object r1 = r1.f5606c
            i3.f r1 = (i3.C0590f) r1
            java.lang.String r2 = "mainStatesObject/nickName"
            S3.r r1 = r1.q(r2)
            java.lang.Object r0 = r0.f1523c
            com.mtma.criminal.city.utils.K r0 = (com.mtma.criminal.city.utils.K) r0
            java.lang.Object r0 = r0.f7360b
            c1.i r0 = (c1.i) r0
            java.lang.Object r0 = r0.f5605b
            java.lang.String r0 = (java.lang.String) r0
            S3.r r0 = r1.i(r0)
            com.mtma.criminal.city.fragments.gangBase.I r1 = new com.mtma.criminal.city.fragments.gangBase.I
            r2 = 5
            r1.<init>(r15, r2)
            r0.d(r1)
            return
        L_0x012c:
            java.lang.Object r0 = r15.f212b
            com.google.android.gms.common.api.internal.Q r0 = (com.google.android.gms.common.api.internal.Q) r0
            com.google.android.gms.common.api.internal.J r0 = r0.h
            z1.b r1 = new z1.b
            r2 = 4
            r1.<init>(r2)
            r0.a(r1)
            return
        L_0x013c:
            java.lang.Object r0 = r15.f212b
            T1.A r0 = (T1.A) r0
            java.lang.Object r0 = r0.f2796b
            com.google.android.gms.common.api.internal.H r0 = (com.google.android.gms.common.api.internal.H) r0
            com.google.android.gms.common.api.g r0 = r0.f6029b
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = " disconnecting because it was signed out."
            java.lang.String r1 = r1.concat(r2)
            r0.disconnect(r1)
            return
        L_0x0158:
            java.lang.Object r0 = r15.f212b
            com.google.android.gms.common.api.internal.H r0 = (com.google.android.gms.common.api.internal.H) r0
            r0.g()
            return
        L_0x0160:
            java.lang.Object r0 = r15.f212b
            com.bumptech.glide.l r0 = (com.bumptech.glide.l) r0
            com.bumptech.glide.manager.g r1 = r0.f5796c
            r1.b(r0)
            return
        L_0x016a:
            java.lang.Object r0 = r15.f212b
            androidx.lifecycle.y r0 = (androidx.lifecycle.y) r0
            java.lang.Object r0 = r0.f5287a
            monitor-enter(r0)
            java.lang.Object r1 = r15.f212b     // Catch:{ all -> 0x0188 }
            androidx.lifecycle.y r1 = (androidx.lifecycle.y) r1     // Catch:{ all -> 0x0188 }
            java.lang.Object r1 = r1.f5291f     // Catch:{ all -> 0x0188 }
            java.lang.Object r2 = r15.f212b     // Catch:{ all -> 0x0188 }
            androidx.lifecycle.y r2 = (androidx.lifecycle.y) r2     // Catch:{ all -> 0x0188 }
            java.lang.Object r3 = androidx.lifecycle.y.f5286k     // Catch:{ all -> 0x0188 }
            r2.f5291f = r3     // Catch:{ all -> 0x0188 }
            monitor-exit(r0)     // Catch:{ all -> 0x0188 }
            java.lang.Object r0 = r15.f212b
            androidx.lifecycle.y r0 = (androidx.lifecycle.y) r0
            r0.i(r1)
            return
        L_0x0188:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0188 }
            throw r1
        L_0x018b:
            java.lang.Object r0 = r15.f212b
            androidx.fragment.app.I r0 = (androidx.fragment.app.I) r0
            r0.x(r4)
            return
        L_0x0193:
            java.lang.Object r0 = r15.f212b
            androidx.fragment.app.l r0 = (androidx.fragment.app.C0280l) r0
            androidx.fragment.app.j r1 = r0.f5118e0
            android.app.Dialog r0 = r0.f5126m0
            r1.onDismiss(r0)
            return
        L_0x019f:
            java.lang.Object r0 = r15.f212b
            androidx.fragment.app.e r0 = (androidx.fragment.app.C0273e) r0
            android.view.ViewGroup r1 = r0.f5105b
            android.view.View r2 = r0.f5106c
            r1.endViewTransition(r2)
            androidx.fragment.app.f r0 = r0.d
            r0.d()
            return
        L_0x01b0:
            java.lang.Object r0 = r15.f212b
            X1.a r0 = (X1.a) r0
            java.lang.Object r1 = r0.f4178a
            monitor-enter(r1)
            boolean r2 = r0.b()     // Catch:{ all -> 0x01bf }
            if (r2 != 0) goto L_0x01c1
            monitor-exit(r1)     // Catch:{ all -> 0x01bf }
            goto L_0x01e3
        L_0x01bf:
            r0 = move-exception
            goto L_0x01e4
        L_0x01c1:
            java.lang.String r2 = "WakeLock"
            java.lang.String r3 = r0.f4184j     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01bf }
            java.lang.String r5 = " ** IS FORCE-RELEASED ON TIMEOUT **"
            java.lang.String r3 = r3.concat(r5)     // Catch:{ all -> 0x01bf }
            android.util.Log.e(r2, r3)     // Catch:{ all -> 0x01bf }
            r0.d()     // Catch:{ all -> 0x01bf }
            boolean r2 = r0.b()     // Catch:{ all -> 0x01bf }
            if (r2 != 0) goto L_0x01dd
            monitor-exit(r1)     // Catch:{ all -> 0x01bf }
            goto L_0x01e3
        L_0x01dd:
            r0.f4180c = r4     // Catch:{ all -> 0x01bf }
            r0.e()     // Catch:{ all -> 0x01bf }
            monitor-exit(r1)     // Catch:{ all -> 0x01bf }
        L_0x01e3:
            return
        L_0x01e4:
            monitor-exit(r1)     // Catch:{ all -> 0x01bf }
            throw r0
        L_0x01e6:
            java.lang.Object r0 = r15.f212b
            android.widget.TextView r0 = (android.widget.TextView) r0
            boolean r1 = r0.isShown()
            if (r1 == 0) goto L_0x01f3
            W4.g.Z(r0)
        L_0x01f3:
            return
        L_0x01f4:
            java.lang.Object r0 = r15.f212b
            V4.f r0 = (V4.f) r0
            V4.h r0 = r0.f3800b
            android.widget.CheckBox r0 = r0.f3846t0
            r0.setChecked(r5)
            return
        L_0x0200:
            java.lang.Object r0 = r15.f212b
            U.e r0 = (U.e) r0
            r0.n(r5)
            return
        L_0x0208:
            java.lang.Object r0 = r15.f212b
            I3.j r0 = (I3.j) r0
            java.lang.Object r0 = r0.f1186b
            T1.u0 r0 = (T1.C0212u0) r0
            T1.g1 r1 = r0.f3479G
            T1.C0212u0.h(r1)
            T1.g1 r0 = r0.f3479G
            T1.G r1 = T1.H.f2850D
            java.lang.Object r1 = r1.a(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.t(r1)
            return
        L_0x0227:
            java.lang.Object r0 = r15.f212b
            T1.u0 r0 = (T1.C0212u0) r0
            T1.Y1 r1 = r0.f3499u
            T1.C0212u0.i(r1)
            r1.o()
            long r1 = r1.w0()
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x025e
            T1.b1 r0 = r0.f3503y
            T1.C0212u0.j(r0)
            r0.o()
            T1.V0 r1 = r0.f3252u
            if (r1 == 0) goto L_0x024c
            r1.a()
        L_0x024c:
            java.lang.Thread r1 = new java.lang.Thread
            T1.C0212u0.j(r0)
            T1.T0 r2 = new T1.T0
            r3 = 3
            r2.<init>(r0, r3)
            r1.<init>(r2)
            r1.start()
            goto L_0x026a
        L_0x025e:
            T1.Z r0 = r0.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r1 = "registerTrigger called but app not eligible"
            T1.X r0 = r0.f3175r
            r0.a(r1)
        L_0x026a:
            return
        L_0x026b:
            java.lang.Object r3 = r15.f212b
            T1.T1 r3 = (T1.T1) r3
            T1.r0 r5 = r3.f()
            r5.o()
            T1.j0 r5 = new T1.j0
            r5.<init>((T1.T1) r3)
            r3.f3069t = r5
            T1.n r5 = new T1.n
            r5.<init>(r3)
            r5.q()
            r3.f3062c = r5
            T1.g r5 = r3.h0()
            T1.n0 r6 = r3.f3060a
            com.google.android.gms.common.internal.I.g(r6)
            r5.d = r6
            T1.y1 r5 = new T1.y1
            r5.<init>(r3)
            r5.q()
            r3.f3067r = r5
            T1.c r5 = new T1.c
            r5.<init>(r3)
            r5.q()
            r3.f3064f = r5
            T1.d0 r5 = new T1.d0
            r5.<init>(r3, r4)
            r5.q()
            r3.f3066q = r5
            T1.J1 r5 = new T1.J1
            r5.<init>(r3)
            r5.q()
            r3.f3063e = r5
            T1.e0 r5 = new T1.e0
            r5.<init>(r3)
            r3.d = r5
            int r5 = r3.f3042A
            int r6 = r3.f3043B
            if (r5 == r6) goto L_0x02de
            T1.Z r5 = r3.c()
            int r6 = r3.f3042A
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r7 = r3.f3043B
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "Not all upload components initialized"
            T1.X r5 = r5.f3172f
            r5.c(r8, r6, r7)
        L_0x02de:
            java.util.concurrent.atomic.AtomicBoolean r5 = r3.f3071v
            r5.set(r4)
            T1.Z r4 = r3.c()
            java.lang.String r5 = "UploadController is now fully initialized"
            T1.X r4 = r4.f3180w
            r4.a(r5)
            T1.r0 r4 = r3.f()
            r4.o()
            T1.n r4 = r3.f3062c
            T1.T1.L(r4)
            r4.G()
            T1.n r4 = r3.f3062c
            T1.T1.L(r4)
            r4.o()
            r4.p()
            boolean r5 = r4.Z()
            if (r5 == 0) goto L_0x035a
            T1.G r5 = T1.H.f2946u0
            java.lang.Object r6 = r5.a(r2)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x031f
            goto L_0x035a
        L_0x031f:
            android.database.sqlite.SQLiteDatabase r6 = r4.k0()
            java.lang.Object r4 = r4.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            G1.b r7 = r4.f3501w
            r7.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.Object r2 = r5.a(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String[] r2 = new java.lang.String[]{r7, r2}
            java.lang.String r5 = "trigger_uris"
            java.lang.String r7 = "abs(timestamp_millis - ?) > cast(? as integer)"
            int r2 = r6.delete(r5, r7, r2)
            if (r2 <= 0) goto L_0x035a
            T1.Z r4 = r4.f3496r
            T1.C0212u0.k(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            T1.X r4 = r4.f3180w
            java.lang.String r5 = "Deleted stale trigger uris. rowsDeleted"
            r4.b(r2, r5)
        L_0x035a:
            T1.y1 r2 = r3.f3067r
            T1.g0 r2 = r2.f3547q
            long r4 = r2.a()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x037a
            T1.y1 r0 = r3.f3067r
            T1.g0 r0 = r0.f3547q
            G1.a r1 = r3.g()
            G1.b r1 = (G1.b) r1
            r1.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            r0.b(r1)
        L_0x037a:
            r3.F()
            return
        L_0x037e:
            java.lang.Object r0 = r15.f212b
            T1.B1 r0 = (T1.B1) r0
            java.lang.Object r1 = r0.d
            I3.h r1 = (I3.h) r1
            java.lang.Object r1 = r1.f1180c
            T1.E1 r1 = (T1.E1) r1
            r1.o()
            java.lang.Object r6 = r1.f398a
            T1.u0 r6 = (T1.C0212u0) r6
            T1.Z r7 = r6.f3496r
            T1.C0212u0.k(r7)
            java.lang.String r8 = "Application going to the background"
            T1.X r7 = r7.f3179v
            r7.a(r8)
            T1.h0 r7 = r6.f3495q
            T1.C0212u0.i(r7)
            T1.f0 r7 = r7.f3313C
            r7.a(r4)
            r1.o()
            r1.d = r4
            T1.g r7 = r6.f3494p
            boolean r8 = r7.C()
            if (r8 != 0) goto L_0x03c0
            long r8 = r0.f2810c
            T1.D1 r1 = r1.f2828f
            r1.a(r5, r5, r8)
            T1.C1 r1 = r1.f2823c
            r1.a()
        L_0x03c0:
            T1.Z r1 = r6.f3496r
            T1.C0212u0.k(r1)
            long r8 = r0.f2809b
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.String r5 = "Application backgrounded at: timestamp_millis"
            T1.X r8 = r1.f3178u
            r8.b(r0, r5)
            T1.b1 r0 = r6.f3503y
            T1.C0212u0.j(r0)
            r0.o()
            r0.p()
            java.lang.Object r0 = r0.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.w1 r5 = r0.r()
            r5.o()
            r5.p()
            boolean r8 = r5.B()
            if (r8 != 0) goto L_0x03f2
            goto L_0x0404
        L_0x03f2:
            java.lang.Object r5 = r5.f398a
            T1.u0 r5 = (T1.C0212u0) r5
            T1.Y1 r5 = r5.f3499u
            T1.C0212u0.i(r5)
            int r5 = r5.v0()
            r8 = 242600(0x3b3a8, float:3.39955E-40)
            if (r5 < r8) goto L_0x041a
        L_0x0404:
            T1.w1 r0 = r0.r()
            r0.o()
            r0.p()
            T1.Z1 r4 = r0.C(r4)
            T1.s1 r5 = new T1.s1
            r5.<init>(r0, r4, r3)
            r0.F(r5)
        L_0x041a:
            T1.G r0 = T1.H.f2878S0
            boolean r0 = r7.B(r2, r0)
            if (r0 == 0) goto L_0x045a
            T1.Y1 r0 = r6.f3499u
            T1.C0212u0.i(r0)
            android.content.Context r2 = r6.f3489a
            java.lang.String r3 = r2.getPackageName()
            java.lang.String r4 = r7.f3293c
            boolean r0 = r0.e0(r3, r4)
            if (r0 == 0) goto L_0x0438
            r2 = 1000(0x3e8, double:4.94E-321)
            goto L_0x0442
        L_0x0438:
            java.lang.String r0 = r2.getPackageName()
            T1.G r2 = T1.H.f2852E
            long r2 = r7.w(r0, r2)
        L_0x0442:
            T1.C0212u0.k(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            T1.X r1 = r1.f3180w
            java.lang.String r4 = "[sgtm] Scheduling batch upload with minimum latency in millis"
            r1.b(r0, r4)
            T1.g1 r0 = r6.f3479G
            T1.C0212u0.h(r0)
            T1.g1 r0 = r6.f3479G
            r0.t(r2)
        L_0x045a:
            return
        L_0x045b:
            java.lang.Object r0 = r15.f212b
            B2.a r0 = (B2.a) r0
            java.lang.Object r0 = r0.f343c
            T1.v1 r0 = (T1.C0216v1) r0
            T1.w1 r0 = r0.f3518c
            java.lang.Object r1 = r0.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            T1.r0 r1 = r1.f3497s
            T1.C0212u0.k(r1)
            T1.n1 r2 = new T1.n1
            r2.<init>(r0, r3)
            r1.y(r2)
            return
        L_0x0477:
            java.lang.Object r0 = r15.f212b
            T1.v1 r0 = (T1.C0216v1) r0
            T1.w1 r0 = r0.f3518c
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Object r2 = r0.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            android.content.Context r2 = r2.f3489a
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementService"
            r1.<init>(r2, r3)
            T1.C0219w1.H(r0, r1)
            return
        L_0x048e:
            java.lang.Object r0 = r15.f212b
            T1.e0 r0 = (T1.C0165e0) r0
            java.lang.Object r0 = r0.d
            T1.T1 r0 = (T1.T1) r0
            r0.F()
            return
        L_0x049a:
            java.lang.Object r0 = r15.f212b
            Q4.a r0 = (Q4.a) r0
            android.widget.ListView r1 = r0.f2439i0
            int r0 = r0.f2436f0
            r2 = 500(0x1f4, float:7.0E-43)
            r1.smoothScrollToPositionFromTop(r0, r5, r2)
            return
        L_0x04a8:
            java.lang.Object r2 = r15.f212b
            Q.g r2 = (Q.g) r2
            boolean r3 = r2.f2329x
            if (r3 != 0) goto L_0x04b2
            goto L_0x052f
        L_0x04b2:
            boolean r3 = r2.f2327v
            Q.a r4 = r2.f2316a
            if (r3 == 0) goto L_0x04ca
            r2.f2327v = r5
            long r6 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r4.f2312e = r6
            r8 = -1
            r4.g = r8
            r4.f2313f = r6
            r3 = 1056964608(0x3f000000, float:0.5)
            r4.h = r3
        L_0x04ca:
            long r6 = r4.g
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x04df
            long r6 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r8 = r4.g
            int r3 = r4.f2314i
            long r10 = (long) r3
            long r8 = r8 + r10
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x04df
            goto L_0x04e5
        L_0x04df:
            boolean r3 = r2.e()
            if (r3 != 0) goto L_0x04e8
        L_0x04e5:
            r2.f2329x = r5
            goto L_0x052f
        L_0x04e8:
            boolean r3 = r2.f2328w
            android.widget.ListView r6 = r2.f2318c
            if (r3 == 0) goto L_0x0503
            r2.f2328w = r5
            long r9 = android.os.SystemClock.uptimeMillis()
            r13 = 0
            r14 = 0
            r11 = 3
            r12 = 0
            r7 = r9
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r7, r9, r11, r12, r13, r14)
            r6.onTouchEvent(r3)
            r3.recycle()
        L_0x0503:
            long r7 = r4.f2313f
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0530
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r3 = r4.a(r0)
            r5 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r5 = r5 * r3
            float r5 = r5 * r3
            r7 = 1082130432(0x40800000, float:4.0)
            float r3 = r3 * r7
            float r3 = r3 + r5
            long r7 = r4.f2313f
            long r7 = r0 - r7
            r4.f2313f = r0
            float r0 = (float) r7
            float r0 = r0 * r3
            float r1 = r4.d
            float r0 = r0 * r1
            int r0 = (int) r0
            k.t0 r1 = r2.f2331z
            r1.scrollListBy(r0)
            java.util.WeakHashMap r0 = K.O.f1352a
            r6.postOnAnimation(r15)
        L_0x052f:
            return
        L_0x0530:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot compute scroll delta before calling start()"
            r0.<init>(r1)
            throw r0
        L_0x0538:
            java.lang.Object r0 = r15.f212b
            O4.b r0 = (O4.b) r0
            android.widget.ListView r0 = r0.f2117i0
            int r1 = com.bumptech.glide.c.x()
            r2 = 750(0x2ee, float:1.051E-42)
            r0.smoothScrollToPositionFromTop(r1, r5, r2)
            return
        L_0x0548:
            java.lang.Object r0 = r15.f212b
            H4.h r0 = (H4.h) r0
            e5.e r0 = r0.f1051v0
            boolean r1 = r0.isShowing()
            if (r1 != 0) goto L_0x0567
            android.view.View r1 = r0.f7698c
            android.os.IBinder r2 = r1.getWindowToken()
            if (r2 == 0) goto L_0x0567
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r5)
            r0.setBackgroundDrawable(r2)
            r0.showAtLocation(r1, r5, r5, r5)
        L_0x0567:
            return
        L_0x0568:
            java.lang.Object r0 = r15.f212b
            S3.z r0 = (S3.z) r0
            r0.getClass()
        L_0x056f:
            java.lang.Object r1 = r0.d     // Catch:{ InterruptedException -> 0x057d }
            java.lang.ref.ReferenceQueue r1 = (java.lang.ref.ReferenceQueue) r1     // Catch:{ InterruptedException -> 0x057d }
            java.lang.ref.Reference r1 = r1.remove()     // Catch:{ InterruptedException -> 0x057d }
            B0.d r1 = (B0.C0005d) r1     // Catch:{ InterruptedException -> 0x057d }
            r0.o(r1)     // Catch:{ InterruptedException -> 0x057d }
            goto L_0x056f
        L_0x057d:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x056f
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0004c.run():void");
    }

    public C0004c(T1 t12, C0015e eVar) {
        this.f211a = 9;
        this.f212b = t12;
    }

    public /* synthetic */ C0004c(Object obj, int i2) {
        this.f211a = i2;
        this.f212b = obj;
    }
}
