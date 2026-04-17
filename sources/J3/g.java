package j3;

public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8832a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8833b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8834c;

    public /* synthetic */ g(Object obj, Object obj2, int i2) {
        this.f8832a = i2;
        this.f8833b = obj;
        this.f8834c = obj2;
    }

    /* JADX WARNING: type inference failed for: r2v33, types: [S3.y, java.lang.Exception] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f8832a
            switch(r0) {
                case 0: goto L_0x02af;
                case 1: goto L_0x0278;
                case 2: goto L_0x023d;
                case 3: goto L_0x022e;
                case 4: goto L_0x021e;
                case 5: goto L_0x0205;
                case 6: goto L_0x01f5;
                case 7: goto L_0x01dc;
                case 8: goto L_0x01b6;
                case 9: goto L_0x0172;
                case 10: goto L_0x0156;
                case 11: goto L_0x0131;
                case 12: goto L_0x011d;
                case 13: goto L_0x0104;
                case 14: goto L_0x00e1;
                case 15: goto L_0x00a5;
                case 16: goto L_0x0063;
                case 17: goto L_0x005a;
                case 18: goto L_0x004e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.reflect.Method r0 = z.C1124d.d     // Catch:{ RuntimeException -> 0x001b, all -> 0x0019 }
            java.lang.Object r1 = r8.f8834c
            java.lang.Object r2 = r8.f8833b
            if (r0 == 0) goto L_0x001d
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ RuntimeException -> 0x001b, all -> 0x0019 }
            java.lang.String r4 = "AppCompat recreation"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3, r4}     // Catch:{ RuntimeException -> 0x001b, all -> 0x0019 }
            r0.invoke(r2, r1)     // Catch:{ RuntimeException -> 0x001b, all -> 0x0019 }
            goto L_0x004d
        L_0x0019:
            r0 = move-exception
            goto L_0x0029
        L_0x001b:
            r0 = move-exception
            goto L_0x0031
        L_0x001d:
            java.lang.reflect.Method r0 = z.C1124d.f12755e     // Catch:{ RuntimeException -> 0x001b, all -> 0x0019 }
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ RuntimeException -> 0x001b, all -> 0x0019 }
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}     // Catch:{ RuntimeException -> 0x001b, all -> 0x0019 }
            r0.invoke(r2, r1)     // Catch:{ RuntimeException -> 0x001b, all -> 0x0019 }
            goto L_0x004d
        L_0x0029:
            java.lang.String r1 = "ActivityRecreator"
            java.lang.String r2 = "Exception while invoking performStopActivity"
            android.util.Log.e(r1, r2, r0)
            goto L_0x004d
        L_0x0031:
            java.lang.Class r1 = r0.getClass()
            java.lang.Class<java.lang.RuntimeException> r2 = java.lang.RuntimeException.class
            if (r1 != r2) goto L_0x004d
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "Unable to stop"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            throw r0
        L_0x004d:
            return
        L_0x004e:
            java.lang.Object r0 = r8.f8833b
            android.app.Application r0 = (android.app.Application) r0
            java.lang.Object r1 = r8.f8834c
            z.c r1 = (z.C1123c) r1
            r0.unregisterActivityLifecycleCallbacks(r1)
            return
        L_0x005a:
            java.lang.Object r0 = r8.f8833b
            z.c r0 = (z.C1123c) r0
            java.lang.Object r1 = r8.f8834c
            r0.f12747a = r1
            return
        L_0x0063:
            java.lang.Object r0 = r8.f8833b
            y1.j r0 = (y1.j) r0
            java.lang.Object r1 = r8.f8834c
            y1.k r1 = (y1.k) r1
            int r1 = r1.f12672a
            java.lang.String r2 = "Timing out request: "
            monitor-enter(r0)
            android.util.SparseArray r3 = r0.f12670e     // Catch:{ all -> 0x00a0 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x00a0 }
            y1.k r3 = (y1.k) r3     // Catch:{ all -> 0x00a0 }
            if (r3 == 0) goto L_0x009e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            r4.<init>(r2)     // Catch:{ all -> 0x00a0 }
            r4.append(r1)     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = "MessengerIpcClient"
            android.util.Log.w(r4, r2)     // Catch:{ all -> 0x00a0 }
            android.util.SparseArray r2 = r0.f12670e     // Catch:{ all -> 0x00a0 }
            r2.remove(r1)     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = "Timed out waiting for response"
            S3.y r2 = new S3.y     // Catch:{ all -> 0x00a0 }
            r4 = 0
            r2.<init>(r1, r4)     // Catch:{ all -> 0x00a0 }
            r3.b(r2)     // Catch:{ all -> 0x00a0 }
            r0.c()     // Catch:{ all -> 0x00a0 }
        L_0x009e:
            monitor-exit(r0)
            goto L_0x00a2
        L_0x00a0:
            r1 = move-exception
            goto L_0x00a3
        L_0x00a2:
            return
        L_0x00a3:
            monitor-exit(r0)     // Catch:{ all -> 0x00a0 }
            throw r1
        L_0x00a5:
            java.lang.Object r0 = r8.f8833b
            y1.j r0 = (y1.j) r0
            java.lang.Object r1 = r8.f8834c
            android.os.IBinder r1 = (android.os.IBinder) r1
            monitor-enter(r0)
            r2 = 0
            if (r1 != 0) goto L_0x00ba
            java.lang.String r1 = "Null service connection"
            r0.a(r2, r1)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00de
        L_0x00b8:
            r1 = move-exception
            goto L_0x00df
        L_0x00ba:
            m0.a0 r3 = new m0.a0     // Catch:{ RemoteException -> 0x00d5 }
            r3.<init>((android.os.IBinder) r1)     // Catch:{ RemoteException -> 0x00d5 }
            r0.f12669c = r3     // Catch:{ RemoteException -> 0x00d5 }
            r1 = 2
            r0.f12667a = r1     // Catch:{ all -> 0x00b8 }
            y1.l r1 = r0.f12671f     // Catch:{ all -> 0x00b8 }
            java.lang.Object r1 = r1.f12679c     // Catch:{ all -> 0x00b8 }
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1     // Catch:{ all -> 0x00b8 }
            y1.i r2 = new y1.i     // Catch:{ all -> 0x00b8 }
            r3 = 0
            r2.<init>(r0, r3)     // Catch:{ all -> 0x00b8 }
            r1.execute(r2)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            goto L_0x00de
        L_0x00d5:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x00b8 }
            r0.a(r2, r1)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
        L_0x00de:
            return
        L_0x00df:
            monitor-exit(r0)     // Catch:{ all -> 0x00b8 }
            throw r1
        L_0x00e1:
            java.lang.Object r0 = r8.f8833b
            w0.a r0 = (w0.C1054a) r0
            java.lang.Object r1 = r8.f8834c
            w0.c r1 = (w0.C1056c) r1
            com.google.android.gms.common.api.internal.J r2 = r0.f12337e
            java.lang.Object r2 = r2.f6043c
            q4.a r2 = (q4.C0937a) r2
            if (r2 == 0) goto L_0x00fc
            com.google.android.gms.common.api.internal.J r0 = r0.f12337e
            java.lang.Object r0 = r0.f6043c
            q4.a r0 = (q4.C0937a) r0
            r2 = 0
            r0.b(r1, r2)
            goto L_0x0103
        L_0x00fc:
            java.lang.String r0 = "BillingClient"
            java.lang.String r1 = "No valid listener is set in BroadcastManager"
            com.google.android.gms.internal.play_billing.zze.zzl(r0, r1)
        L_0x0103:
            return
        L_0x0104:
            java.lang.Object r0 = r8.f8833b
            w0.a r0 = (w0.C1054a) r0
            w0.c r1 = w0.C1073t.f12399j
            r2 = 24
            r3 = 7
            r0.t(r2, r3, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r2 = r8.f8834c
            q4.a r2 = (q4.C0937a) r2
            r2.a(r1, r0)
            return
        L_0x011d:
            java.lang.Object r0 = r8.f8833b
            w0.a r0 = (w0.C1054a) r0
            w0.c r1 = w0.C1073t.f12399j
            r2 = 24
            r3 = 4
            r0.t(r2, r3, r1)
            java.lang.Object r0 = r8.f8834c
            m0.a0 r0 = (m0.a0) r0
            r0.p(r1)
            return
        L_0x0131:
            java.lang.Object r0 = r8.f8833b
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            boolean r1 = r0.isDone()
            if (r1 != 0) goto L_0x0155
            boolean r1 = r0.isCancelled()
            if (r1 != 0) goto L_0x0155
            r1 = 1
            r0.cancel(r1)
            java.lang.String r0 = "BillingClient"
            java.lang.String r1 = "Async task is taking too long, cancel it!"
            com.google.android.gms.internal.play_billing.zze.zzl(r0, r1)
            java.lang.Object r0 = r8.f8834c
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0155
            r0.run()
        L_0x0155:
            return
        L_0x0156:
            java.lang.Object r0 = r8.f8833b
            w0.a r0 = (w0.C1054a) r0
            r0.getClass()
            w0.c r1 = w0.C1073t.f12399j
            r2 = 24
            r3 = 9
            r0.t(r2, r3, r1)
            com.google.android.gms.internal.play_billing.zzco r0 = com.google.android.gms.internal.play_billing.zzco.zzl()
            java.lang.Object r2 = r8.f8834c
            q4.b r2 = (q4.C0938b) r2
            r2.b(r1, r0)
            return
        L_0x0172:
            java.lang.Object r0 = r8.f8833b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x017a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01b5
            java.lang.Object r1 = r0.next()
            s3.d r1 = (s3.C0966d) r1
            java.lang.Object r2 = r8.f8834c
            m0.a0 r2 = (m0.a0) r2
            java.lang.Object r3 = r2.f9926c
            c1.i r3 = (c1.i) r3
            boolean r3 = r3.y()
            if (r3 == 0) goto L_0x01b1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Raising "
            r3.<init>(r4)
            java.lang.String r4 = r1.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            java.lang.Object r2 = r2.f9926c
            c1.i r2 = (c1.i) r2
            r2.d(r3, r5, r4)
        L_0x01b1:
            r1.a()
            goto L_0x017a
        L_0x01b5:
            return
        L_0x01b6:
            r0 = 0
            R2.b.w(r0)
            j4.G r0 = new j4.G
            java.lang.Object r1 = r8.f8834c
            r7 = r1
            q4.a r7 = (q4.C0937a) r7
            q4.e r1 = r7.f11103a
            android.content.Context r2 = r1.f11109d0
            java.util.ArrayList r3 = r1.f11118m0
            w0.a r5 = r1.f11119n0
            java.lang.Object r4 = r8.f8833b
            r6 = r4
            java.util.HashMap r6 = (java.util.HashMap) r6
            int r4 = r1.f11110e0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            q4.e r1 = r7.f11103a
            android.widget.ListView r1 = r1.f11113h0
            r1.setAdapter(r0)
            return
        L_0x01dc:
            java.lang.Object r0 = r8.f8833b
            q3.k r0 = (q3.k) r0
            com.google.android.gms.tasks.TaskCompletionSource r0 = r0.f11099a
            java.lang.Object r1 = r8.f8834c
            i3.d r1 = (i3.C0588d) r1
            if (r1 == 0) goto L_0x01f0
            i3.e r1 = r1.c()
            r0.setException(r1)
            goto L_0x01f4
        L_0x01f0:
            r1 = 0
            r0.setResult(r1)
        L_0x01f4:
            return
        L_0x01f5:
            java.lang.Object r0 = r8.f8833b
            n3.l r0 = (n3.l) r0
            i3.p r0 = r0.f10289b
            java.lang.Object r1 = r8.f8834c
            i3.d r1 = (i3.C0588d) r1
            r2 = 0
            r3 = 0
            r0.l(r1, r2, r3)
            return
        L_0x0205:
            n3.D r0 = new n3.D
            java.lang.Object r1 = r8.f8833b
            n3.l r1 = (n3.l) r1
            androidx.fragment.app.D r2 = r1.f10290c
            n3.g r1 = r1.f10288a
            s3.g r1 = s3.C0969g.a(r1)
            java.lang.Object r3 = r8.f8834c
            n3.m r3 = (n3.m) r3
            r0.<init>(r3, r2, r1)
            r3.m(r0)
            return
        L_0x021e:
            java.lang.Object r0 = r8.f8833b
            n3.l r0 = (n3.l) r0
            i3.p r0 = r0.f10289b
            java.lang.Object r1 = r8.f8834c
            i3.c r1 = (i3.C0587c) r1
            r2 = 0
            r3 = 1
            r0.l(r2, r3, r1)
            return
        L_0x022e:
            java.lang.Object r0 = r8.f8834c
            m3.a r0 = (m3.C0837a) r0
            r1 = 0
            r0.h = r1
            java.lang.Object r0 = r8.f8833b
            l3.b r0 = (l3.C0783b) r0
            r0.run()
            return
        L_0x023d:
            java.lang.Object r0 = r8.f8833b
            w3.e r0 = (w3.C1084e) r0
            java.lang.Throwable r1 = r0.getCause()
            r2 = 0
            java.lang.Object r3 = r8.f8834c
            X4.d r3 = (X4.d) r3
            if (r1 == 0) goto L_0x0263
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.io.EOFException
            if (r1 == 0) goto L_0x0263
            java.lang.Object r0 = r3.f4210c
            l3.t r0 = (l3.t) r0
            c1.i r0 = r0.f9743j
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r2 = 0
            java.lang.String r4 = "WebSocket reached EOF."
            r0.d(r4, r2, r1)
            goto L_0x0270
        L_0x0263:
            java.lang.Object r1 = r3.f4210c
            l3.t r1 = (l3.t) r1
            c1.i r1 = r1.f9743j
            java.lang.String r4 = "WebSocket error."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.d(r4, r0, r2)
        L_0x0270:
            java.lang.Object r0 = r3.f4210c
            l3.t r0 = (l3.t) r0
            l3.t.a(r0)
            return
        L_0x0278:
            java.lang.Object r0 = r8.f8834c
            X4.d r0 = (X4.d) r0
            java.lang.Object r0 = r0.f4210c
            l3.t r0 = (l3.t) r0
            boolean r1 = r0.f9739c
            if (r1 != 0) goto L_0x02ae
            r0.e()
            m3.b r1 = r0.f9740e
            java.lang.Object r2 = r8.f8833b
            java.lang.String r2 = (java.lang.String) r2
            if (r1 == 0) goto L_0x0293
            r0.b(r2)
            goto L_0x02ae
        L_0x0293:
            int r1 = r2.length()
            r3 = 6
            if (r1 > r3) goto L_0x02a5
            int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x02a5 }
            if (r1 <= 0) goto L_0x02a3
            r0.d(r1)     // Catch:{ NumberFormatException -> 0x02a5 }
        L_0x02a3:
            r2 = 0
            goto L_0x02a9
        L_0x02a5:
            r1 = 1
            r0.d(r1)
        L_0x02a9:
            if (r2 == 0) goto L_0x02ae
            r0.b(r2)
        L_0x02ae:
            return
        L_0x02af:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Object r1 = r8.f8833b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.f8834c
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.g.run():void");
    }

    public /* synthetic */ g(Object obj, Object obj2, int i2, boolean z3) {
        this.f8832a = i2;
        this.f8834c = obj;
        this.f8833b = obj2;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i2) {
        this.f8832a = i2;
        this.f8833b = obj;
        this.f8834c = obj2;
    }
}
