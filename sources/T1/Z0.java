package T1;

import S3.m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;

public final class Z0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3181a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3182b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3183c;
    public final /* synthetic */ boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3184e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f3185f;

    public Z0(m mVar, boolean z3, Uri uri, String str, String str2) {
        this.f3181a = 2;
        this.d = z3;
        this.f3184e = uri;
        this.f3182b = str;
        this.f3183c = str2;
        this.f3185f = mVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: T1.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f2 A[SYNTHETIC, Splitter:B:113:0x01f2] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x023e A[Catch:{ RuntimeException -> 0x0228 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0240 A[Catch:{ RuntimeException -> 0x0228 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r1 = r21
            int r0 = r1.f3181a
            switch(r0) {
                case 0: goto L_0x0318;
                case 1: goto L_0x02e5;
                case 2: goto L_0x0145;
                case 3: goto L_0x00f8;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.f3184e
            com.google.firebase.iid.FirebaseInstanceIdReceiver r0 = (com.google.firebase.iid.FirebaseInstanceIdReceiver) r0
            java.lang.Object r2 = r1.f3182b
            android.content.Intent r2 = (android.content.Intent) r2
            java.lang.Object r3 = r1.f3183c
            android.content.Context r3 = (android.content.Context) r3
            boolean r4 = r1.d
            java.lang.Object r5 = r1.f3185f
            android.content.BroadcastReceiver$PendingResult r5 = (android.content.BroadcastReceiver.PendingResult) r5
            r0.getClass()
            java.lang.String r0 = "wrapped_intent"
            android.os.Parcelable r0 = r2.getParcelableExtra(r0)     // Catch:{ all -> 0x002a }
            boolean r6 = r0 instanceof android.content.Intent     // Catch:{ all -> 0x002a }
            r7 = 0
            if (r6 == 0) goto L_0x002d
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ all -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            goto L_0x00f2
        L_0x002d:
            r0 = r7
        L_0x002e:
            if (r0 == 0) goto L_0x0036
            int r0 = com.google.firebase.iid.FirebaseInstanceIdReceiver.a(r0)     // Catch:{ all -> 0x002a }
            goto L_0x00e3
        L_0x0036:
            android.os.Bundle r0 = r2.getExtras()     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0040
            r0 = 500(0x1f4, float:7.0E-43)
            goto L_0x00e3
        L_0x0040:
            y1.a r0 = new y1.a     // Catch:{ all -> 0x002a }
            r0.<init>(r2)     // Catch:{ all -> 0x002a }
            java.util.concurrent.CountDownLatch r8 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x002a }
            r9 = 1
            r8.<init>(r9)     // Catch:{ all -> 0x002a }
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceIdReceiver> r10 = com.google.firebase.iid.FirebaseInstanceIdReceiver.class
            monitor-enter(r10)     // Catch:{ all -> 0x002a }
            java.lang.ref.SoftReference r11 = com.google.firebase.iid.FirebaseInstanceIdReceiver.f6899b     // Catch:{ all -> 0x0059 }
            if (r11 == 0) goto L_0x005c
            java.lang.Object r7 = r11.get()     // Catch:{ all -> 0x0059 }
            java.util.concurrent.Executor r7 = (java.util.concurrent.Executor) r7     // Catch:{ all -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r0 = move-exception
            goto L_0x00f0
        L_0x005c:
            if (r7 != 0) goto L_0x008c
            com.google.android.gms.internal.cloudmessaging.zze.zza()     // Catch:{ all -> 0x0059 }
            H1.a r7 = new H1.a     // Catch:{ all -> 0x0059 }
            java.lang.String r11 = "pscm-ack-executor"
            r7.<init>(r11)     // Catch:{ all -> 0x0059 }
            java.util.concurrent.ThreadPoolExecutor r14 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ all -> 0x0059 }
            java.util.concurrent.TimeUnit r16 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0059 }
            java.util.concurrent.LinkedBlockingQueue r17 = new java.util.concurrent.LinkedBlockingQueue     // Catch:{ all -> 0x0059 }
            r17.<init>()     // Catch:{ all -> 0x0059 }
            r18 = 60
            r12 = 1
            r13 = 1
            r11 = r14
            r6 = r14
            r14 = r18
            r18 = r7
            r11.<init>(r12, r13, r14, r16, r17, r18)     // Catch:{ all -> 0x0059 }
            r6.allowCoreThreadTimeOut(r9)     // Catch:{ all -> 0x0059 }
            java.util.concurrent.ExecutorService r7 = java.util.concurrent.Executors.unconfigurableExecutorService(r6)     // Catch:{ all -> 0x0059 }
            java.lang.ref.SoftReference r6 = new java.lang.ref.SoftReference     // Catch:{ all -> 0x0059 }
            r6.<init>(r7)     // Catch:{ all -> 0x0059 }
            com.google.firebase.iid.FirebaseInstanceIdReceiver.f6899b = r6     // Catch:{ all -> 0x0059 }
        L_0x008c:
            monitor-exit(r10)     // Catch:{ all -> 0x0059 }
            H.j r6 = new H.j     // Catch:{ all -> 0x002a }
            r9 = 20
            r6.<init>((java.lang.Object) r3, (java.lang.Object) r0, (java.lang.Object) r8, (int) r9)     // Catch:{ all -> 0x002a }
            r7.execute(r6)     // Catch:{ all -> 0x002a }
            S3.l r0 = new S3.l     // Catch:{ ExecutionException -> 0x00af, InterruptedException -> 0x00ad }
            r0.<init>((android.content.Context) r3)     // Catch:{ ExecutionException -> 0x00af, InterruptedException -> 0x00ad }
            com.google.android.gms.tasks.Task r0 = r0.b(r2)     // Catch:{ ExecutionException -> 0x00af, InterruptedException -> 0x00ad }
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch:{ ExecutionException -> 0x00af, InterruptedException -> 0x00ad }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ ExecutionException -> 0x00af, InterruptedException -> 0x00ad }
            int r0 = r0.intValue()     // Catch:{ ExecutionException -> 0x00af, InterruptedException -> 0x00ad }
            r20 = r0
            goto L_0x00b9
        L_0x00ad:
            r0 = move-exception
            goto L_0x00b0
        L_0x00af:
            r0 = move-exception
        L_0x00b0:
            java.lang.String r2 = "FirebaseMessaging"
            java.lang.String r3 = "Failed to send message to service."
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x002a }
            r20 = 500(0x1f4, float:7.0E-43)
        L_0x00b9:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00d1 }
            r2 = 1
            long r2 = r0.toMillis(r2)     // Catch:{ InterruptedException -> 0x00d1 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x00d1 }
            boolean r0 = r8.await(r2, r0)     // Catch:{ InterruptedException -> 0x00d1 }
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "CloudMessagingReceiver"
            java.lang.String r2 = "Message ack timed out"
            android.util.Log.w(r0, r2)     // Catch:{ InterruptedException -> 0x00d1 }
            goto L_0x00e1
        L_0x00d1:
            r0 = move-exception
            java.lang.String r2 = "CloudMessagingReceiver"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x002a }
            java.lang.String r3 = "Message ack failed: "
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x002a }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x002a }
        L_0x00e1:
            r0 = r20
        L_0x00e3:
            if (r4 == 0) goto L_0x00ea
            if (r5 == 0) goto L_0x00ea
            r5.setResultCode(r0)     // Catch:{ all -> 0x002a }
        L_0x00ea:
            if (r5 == 0) goto L_0x00ef
            r5.finish()
        L_0x00ef:
            return
        L_0x00f0:
            monitor-exit(r10)     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x002a }
        L_0x00f2:
            if (r5 == 0) goto L_0x00f7
            r5.finish()
        L_0x00f7:
            throw r0
        L_0x00f8:
            java.lang.Object r0 = r1.f3185f
            T1.w1 r0 = (T1.C0219w1) r0
            T1.J r2 = r0.d
            java.lang.Object r3 = r0.f398a
            T1.u0 r3 = (T1.C0212u0) r3
            java.lang.String r4 = "Failed to send default event parameters to service"
            if (r2 != 0) goto L_0x0111
            T1.Z r0 = r3.f3496r
            T1.C0212u0.k(r0)
            T1.X r0 = r0.f3172f
            r0.a(r4)
            goto L_0x0144
        L_0x0111:
            T1.g r5 = r3.f3494p
            T1.G r6 = T1.H.f2923l1
            r7 = 0
            boolean r5 = r5.B(r7, r6)
            java.lang.Object r6 = r1.f3184e
            T1.Z1 r6 = (T1.Z1) r6
            if (r5 == 0) goto L_0x012e
            boolean r3 = r1.d
            if (r3 == 0) goto L_0x0125
            goto L_0x012a
        L_0x0125:
            java.lang.Object r3 = r1.f3182b
            r7 = r3
            T1.u r7 = (T1.C0211u) r7
        L_0x012a:
            r0.v(r2, r7, r6)
            goto L_0x0144
        L_0x012e:
            java.lang.Object r5 = r1.f3183c     // Catch:{ RemoteException -> 0x0139 }
            android.os.Bundle r5 = (android.os.Bundle) r5     // Catch:{ RemoteException -> 0x0139 }
            r2.u(r6, r5)     // Catch:{ RemoteException -> 0x0139 }
            r0.E()     // Catch:{ RemoteException -> 0x0139 }
            goto L_0x0144
        L_0x0139:
            r0 = move-exception
            T1.Z r2 = r3.f3496r
            T1.C0212u0.k(r2)
            T1.X r2 = r2.f3172f
            r2.b(r0, r4)
        L_0x0144:
            return
        L_0x0145:
            java.lang.String r0 = "gclid="
            java.lang.Object r2 = r1.f3185f
            S3.m r2 = (S3.m) r2
            java.lang.Object r3 = r2.f2686b
            r4 = r3
            T1.b1 r4 = (T1.C0157b1) r4
            java.lang.Object r3 = r4.f398a
            T1.u0 r3 = (T1.C0212u0) r3
            r4.o()
            java.lang.Object r5 = r1.f3183c
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r1.f3184e
            android.net.Uri r5 = (android.net.Uri) r5
            T1.Y1 r6 = r3.f3499u     // Catch:{ RuntimeException -> 0x02cb }
            T1.Z r8 = r3.f3496r
            T1.C0212u0.i(r6)     // Catch:{ RuntimeException -> 0x02cb }
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ RuntimeException -> 0x02c7 }
            java.lang.String r10 = "_cis"
            java.lang.String r11 = "Activity created with data 'referrer' without required params"
            java.lang.String r12 = "utm_medium"
            java.lang.String r13 = "utm_source"
            java.lang.String r14 = "utm_campaign"
            java.lang.String r15 = "gclid"
            if (r9 == 0) goto L_0x017b
        L_0x0179:
            r6 = 0
            goto L_0x01e2
        L_0x017b:
            boolean r9 = r7.contains(r15)     // Catch:{ RuntimeException -> 0x02c7 }
            if (r9 != 0) goto L_0x01cd
            java.lang.String r9 = "gbraid"
            boolean r9 = r7.contains(r9)     // Catch:{ RuntimeException -> 0x01ca }
            if (r9 != 0) goto L_0x01cd
            boolean r9 = r7.contains(r14)     // Catch:{ RuntimeException -> 0x01ca }
            if (r9 != 0) goto L_0x01cd
            boolean r9 = r7.contains(r13)     // Catch:{ RuntimeException -> 0x01ca }
            if (r9 != 0) goto L_0x01cd
            boolean r9 = r7.contains(r12)     // Catch:{ RuntimeException -> 0x01ca }
            if (r9 != 0) goto L_0x01cd
            java.lang.String r9 = "utm_id"
            boolean r9 = r7.contains(r9)     // Catch:{ RuntimeException -> 0x01ca }
            if (r9 != 0) goto L_0x01cd
            java.lang.String r9 = "dclid"
            boolean r9 = r7.contains(r9)     // Catch:{ RuntimeException -> 0x01ca }
            if (r9 != 0) goto L_0x01cd
            java.lang.String r9 = "srsltid"
            boolean r9 = r7.contains(r9)     // Catch:{ RuntimeException -> 0x01ca }
            if (r9 != 0) goto L_0x01cd
            java.lang.String r9 = "sfmc_id"
            boolean r9 = r7.contains(r9)     // Catch:{ RuntimeException -> 0x01ca }
            if (r9 != 0) goto L_0x01cd
            java.lang.Object r6 = r6.f398a     // Catch:{ RuntimeException -> 0x01ca }
            T1.u0 r6 = (T1.C0212u0) r6     // Catch:{ RuntimeException -> 0x01ca }
            T1.Z r6 = r6.f3496r     // Catch:{ RuntimeException -> 0x01ca }
            T1.C0212u0.k(r6)     // Catch:{ RuntimeException -> 0x01ca }
            T1.X r6 = r6.f3179v     // Catch:{ RuntimeException -> 0x01ca }
            r6.a(r11)     // Catch:{ RuntimeException -> 0x01ca }
            goto L_0x0179
        L_0x01ca:
            r0 = move-exception
            goto L_0x02d0
        L_0x01cd:
            java.lang.String r9 = "https://google.com/search?"
            java.lang.String r9 = r9.concat(r7)     // Catch:{ RuntimeException -> 0x02c7 }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ RuntimeException -> 0x02c7 }
            android.os.Bundle r6 = r6.z0(r9)     // Catch:{ RuntimeException -> 0x02c7 }
            if (r6 == 0) goto L_0x01e2
            java.lang.String r9 = "referrer"
            r6.putString(r10, r9)     // Catch:{ RuntimeException -> 0x01ca }
        L_0x01e2:
            java.lang.Object r9 = r1.f3182b
            java.lang.String r9 = (java.lang.String) r9
            r17 = r2
            boolean r2 = r1.d
            java.lang.String r1 = "_cmp"
            r18 = r11
            T1.s0 r11 = r4.f3239A
            if (r2 == 0) goto L_0x0236
            T1.Y1 r2 = r3.f3499u     // Catch:{ RuntimeException -> 0x0228 }
            T1.C0212u0.i(r2)     // Catch:{ RuntimeException -> 0x0228 }
            android.os.Bundle r2 = r2.z0(r5)     // Catch:{ RuntimeException -> 0x0228 }
            if (r2 == 0) goto L_0x0236
            java.lang.String r5 = "intent"
            r2.putString(r10, r5)     // Catch:{ RuntimeException -> 0x0228 }
            boolean r5 = r2.containsKey(r15)     // Catch:{ RuntimeException -> 0x0228 }
            if (r5 != 0) goto L_0x022d
            if (r6 == 0) goto L_0x022d
            boolean r5 = r6.containsKey(r15)     // Catch:{ RuntimeException -> 0x0228 }
            if (r5 == 0) goto L_0x022d
            java.lang.String r5 = "_cer"
            java.lang.String r10 = r6.getString(r15)     // Catch:{ RuntimeException -> 0x0228 }
            r19 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0228 }
            r12.<init>(r0)     // Catch:{ RuntimeException -> 0x0228 }
            r12.append(r10)     // Catch:{ RuntimeException -> 0x0228 }
            java.lang.String r0 = r12.toString()     // Catch:{ RuntimeException -> 0x0228 }
            r2.putString(r5, r0)     // Catch:{ RuntimeException -> 0x0228 }
            goto L_0x022f
        L_0x0228:
            r0 = move-exception
        L_0x0229:
            r2 = r17
            goto L_0x02d0
        L_0x022d:
            r19 = r12
        L_0x022f:
            r4.z(r9, r1, r2)     // Catch:{ RuntimeException -> 0x0228 }
            r11.b(r2, r9)     // Catch:{ RuntimeException -> 0x0228 }
            goto L_0x0238
        L_0x0236:
            r19 = r12
        L_0x0238:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ RuntimeException -> 0x0228 }
            if (r0 == 0) goto L_0x0240
            goto L_0x02e4
        L_0x0240:
            T1.C0212u0.k(r8)     // Catch:{ RuntimeException -> 0x0228 }
            T1.X r0 = r8.f3179v
            java.lang.String r2 = "Activity created with referrer"
            r0.b(r7, r2)     // Catch:{ RuntimeException -> 0x0228 }
            T1.g r2 = r3.f3494p     // Catch:{ RuntimeException -> 0x0228 }
            T1.G r5 = T1.H.f2854F0     // Catch:{ RuntimeException -> 0x0228 }
            r10 = 0
            boolean r2 = r2.B(r10, r5)     // Catch:{ RuntimeException -> 0x0228 }
            r10 = 1
            java.lang.String r12 = "_ldl"
            java.lang.String r5 = "auto"
            if (r2 == 0) goto L_0x027e
            if (r6 == 0) goto L_0x0263
            r4.z(r9, r1, r6)     // Catch:{ RuntimeException -> 0x0228 }
            r11.b(r6, r9)     // Catch:{ RuntimeException -> 0x0228 }
            goto L_0x026b
        L_0x0263:
            T1.C0212u0.k(r8)     // Catch:{ RuntimeException -> 0x0228 }
            java.lang.String r1 = "Referrer does not contain valid parameters"
            r0.b(r7, r1)     // Catch:{ RuntimeException -> 0x0228 }
        L_0x026b:
            G1.b r0 = r3.f3501w     // Catch:{ RuntimeException -> 0x0228 }
            r0.getClass()     // Catch:{ RuntimeException -> 0x0228 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ RuntimeException -> 0x0228 }
            r6 = r12
            r2 = 0
            r7 = r2
            r8 = r10
            r9 = r0
            r4.I(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x0228 }
            goto L_0x02e4
        L_0x027e:
            boolean r1 = r7.contains(r15)     // Catch:{ RuntimeException -> 0x0228 }
            if (r1 == 0) goto L_0x02be
            boolean r1 = r7.contains(r14)     // Catch:{ RuntimeException -> 0x0228 }
            if (r1 != 0) goto L_0x02a8
            boolean r1 = r7.contains(r13)     // Catch:{ RuntimeException -> 0x0228 }
            if (r1 != 0) goto L_0x02a8
            r1 = r19
            boolean r1 = r7.contains(r1)     // Catch:{ RuntimeException -> 0x0228 }
            if (r1 != 0) goto L_0x02a8
            java.lang.String r1 = "utm_term"
            boolean r1 = r7.contains(r1)     // Catch:{ RuntimeException -> 0x0228 }
            if (r1 != 0) goto L_0x02a8
            java.lang.String r1 = "utm_content"
            boolean r1 = r7.contains(r1)     // Catch:{ RuntimeException -> 0x0228 }
            if (r1 == 0) goto L_0x02be
        L_0x02a8:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ RuntimeException -> 0x0228 }
            if (r0 != 0) goto L_0x02e4
            G1.b r0 = r3.f3501w     // Catch:{ RuntimeException -> 0x0228 }
            r0.getClass()     // Catch:{ RuntimeException -> 0x0228 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ RuntimeException -> 0x0228 }
            r6 = r12
            r8 = r10
            r9 = r0
            r4.I(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x0228 }
            goto L_0x02e4
        L_0x02be:
            T1.C0212u0.k(r8)     // Catch:{ RuntimeException -> 0x0228 }
            r1 = r18
            r0.a(r1)     // Catch:{ RuntimeException -> 0x0228 }
            goto L_0x02e4
        L_0x02c7:
            r0 = move-exception
            r17 = r2
            goto L_0x02d0
        L_0x02cb:
            r0 = move-exception
            r17 = r2
            goto L_0x0229
        L_0x02d0:
            java.lang.Object r1 = r2.f2686b
            T1.b1 r1 = (T1.C0157b1) r1
            java.lang.Object r1 = r1.f398a
            T1.u0 r1 = (T1.C0212u0) r1
            T1.Z r1 = r1.f3496r
            T1.C0212u0.k(r1)
            java.lang.String r2 = "Throwable caught in handleReferrerForOnActivityCreated"
            T1.X r1 = r1.f3172f
            r1.b(r0, r2)
        L_0x02e4:
            return
        L_0x02e5:
            java.lang.Object r0 = r1.f3185f
            T1.b1 r0 = (T1.C0157b1) r0
            java.lang.Object r0 = r0.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.w1 r0 = r0.r()
            r0.o()
            r0.p()
            r2 = 0
            T1.Z1 r7 = r0.C(r2)
            T1.o1 r9 = new T1.o1
            java.lang.Object r2 = r1.f3184e
            r4 = r2
            java.util.concurrent.atomic.AtomicReference r4 = (java.util.concurrent.atomic.AtomicReference) r4
            java.lang.Object r2 = r1.f3183c
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = r1.d
            java.lang.Object r2 = r1.f3182b
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            r2 = r9
            r3 = r0
            r2.<init>((T1.C0219w1) r3, (java.util.concurrent.atomic.AtomicReference) r4, (java.lang.String) r5, (java.lang.String) r6, (T1.Z1) r7, (boolean) r8)
            r0.F(r9)
            return
        L_0x0318:
            java.lang.Object r0 = r1.f3185f
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            T1.u0 r0 = r0.f6266a
            T1.w1 r0 = r0.r()
            r0.o()
            r0.p()
            r2 = 0
            T1.Z1 r6 = r0.C(r2)
            T1.o1 r9 = new T1.o1
            boolean r7 = r1.d
            java.lang.Object r2 = r1.f3184e
            r8 = r2
            com.google.android.gms.internal.measurement.zzcy r8 = (com.google.android.gms.internal.measurement.zzcy) r8
            java.lang.Object r2 = r1.f3182b
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r1.f3183c
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            r2 = r9
            r3 = r0
            r2.<init>((T1.C0219w1) r3, (java.lang.String) r4, (java.lang.String) r5, (T1.Z1) r6, (boolean) r7, (com.google.android.gms.internal.measurement.zzcy) r8)
            r0.F(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.Z0.run():void");
    }

    public Z0(C0219w1 w1Var, Z1 z12, boolean z3, C0211u uVar, Bundle bundle) {
        this.f3181a = 3;
        this.f3184e = z12;
        this.d = z3;
        this.f3182b = uVar;
        this.f3183c = bundle;
        this.f3185f = w1Var;
    }

    public /* synthetic */ Z0(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z3, BroadcastReceiver.PendingResult pendingResult) {
        this.f3181a = 4;
        this.f3184e = firebaseInstanceIdReceiver;
        this.f3182b = intent;
        this.f3183c = context;
        this.d = z3;
        this.f3185f = pendingResult;
    }

    public /* synthetic */ Z0(Object obj, Object obj2, String str, String str2, boolean z3, int i2) {
        this.f3181a = i2;
        this.f3184e = obj2;
        this.f3182b = str;
        this.f3183c = str2;
        this.d = z3;
        this.f3185f = obj;
    }
}
