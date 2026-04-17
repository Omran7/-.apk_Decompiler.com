package com.google.android.gms.common.api.internal;

public final class b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6078a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6079b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6080c;

    public /* synthetic */ b0(C0362p pVar, C0361o oVar) {
        this.f6078a = 2;
        this.f6079b = pVar;
        this.f6080c = oVar;
    }

    /* JADX WARNING: type inference failed for: r4v29, types: [com.google.android.gms.internal.common.zza] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            int r3 = r8.f6078a
            switch(r3) {
                case 0: goto L_0x0118;
                case 1: goto L_0x00b4;
                case 2: goto L_0x009b;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r3 = r8.f6079b
            W1.g r3 = (W1.g) r3
            z1.b r4 = r3.f4072b
            int r5 = r4.f12801b
            if (r5 != 0) goto L_0x0013
            r1 = r2
        L_0x0013:
            java.lang.Object r2 = r8.f6080c
            com.google.android.gms.common.api.internal.Q r2 = (com.google.android.gms.common.api.internal.Q) r2
            if (r1 == 0) goto L_0x0090
            com.google.android.gms.common.internal.B r1 = r3.f4073c
            com.google.android.gms.common.internal.I.g(r1)
            z1.b r3 = r1.f6130c
            int r4 = r3.f12801b
            if (r4 != 0) goto L_0x0071
            com.google.android.gms.common.api.internal.J r3 = r2.h
            android.os.IBinder r1 = r1.f6129b
            if (r1 != 0) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            int r0 = com.google.android.gms.common.internal.C0372a.f6167a
            java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
            android.os.IInterface r4 = r1.queryLocalInterface(r0)
            boolean r5 = r4 instanceof com.google.android.gms.common.internal.C0386o
            if (r5 == 0) goto L_0x003b
            com.google.android.gms.common.internal.o r4 = (com.google.android.gms.common.internal.C0386o) r4
        L_0x0039:
            r0 = r4
            goto L_0x0041
        L_0x003b:
            com.google.android.gms.common.internal.X r4 = new com.google.android.gms.common.internal.X
            r4.<init>(r1, r0)
            goto L_0x0039
        L_0x0041:
            r3.getClass()
            if (r0 == 0) goto L_0x005b
            java.util.Set r1 = r2.d
            if (r1 != 0) goto L_0x004b
            goto L_0x005b
        L_0x004b:
            r3.d = r0
            r3.f6044e = r1
            boolean r4 = r3.f6041a
            if (r4 == 0) goto L_0x0095
            java.lang.Object r3 = r3.f6042b
            com.google.android.gms.common.api.g r3 = (com.google.android.gms.common.api.g) r3
            r3.getRemoteService(r0, r1)
            goto L_0x0095
        L_0x005b:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GoogleApiManager"
            java.lang.String r4 = "Received null response from onSignInSuccess"
            android.util.Log.wtf(r1, r4, r0)
            z1.b r0 = new z1.b
            r1 = 4
            r0.<init>(r1)
            r3.a(r0)
            goto L_0x0095
        L_0x0071:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r4 = "Sign-in succeeded with resolve account failure: "
            java.lang.String r0 = r4.concat(r0)
            java.lang.String r4 = "SignInCoordinator"
            android.util.Log.wtf(r4, r0, r1)
            com.google.android.gms.common.api.internal.J r0 = r2.h
            r0.a(r3)
            W1.a r0 = r2.f6062f
            r0.disconnect()
            goto L_0x009a
        L_0x0090:
            com.google.android.gms.common.api.internal.J r0 = r2.h
            r0.a(r4)
        L_0x0095:
            W1.a r0 = r2.f6062f
            r0.disconnect()
        L_0x009a:
            return
        L_0x009b:
            java.lang.Object r0 = r8.f6079b
            com.google.android.gms.common.api.internal.p r0 = (com.google.android.gms.common.api.internal.C0362p) r0
            java.lang.Object r1 = r8.f6080c
            com.google.android.gms.common.api.internal.o r1 = (com.google.android.gms.common.api.internal.C0361o) r1
            java.lang.Object r0 = r0.f6109b
            if (r0 != 0) goto L_0x00ab
            r1.onNotifyListenerFailed()
            goto L_0x00ae
        L_0x00ab:
            r1.notifyListener(r0)     // Catch:{ RuntimeException -> 0x00af }
        L_0x00ae:
            return
        L_0x00af:
            r0 = move-exception
            r1.onNotifyListenerFailed()
            throw r0
        L_0x00b4:
            java.lang.Object r3 = r8.f6080c
            com.google.android.gms.common.api.internal.J r3 = (com.google.android.gms.common.api.internal.J) r3
            java.lang.Object r4 = r3.f6045f
            com.google.android.gms.common.api.internal.h r4 = (com.google.android.gms.common.api.internal.C0354h) r4
            java.util.concurrent.ConcurrentHashMap r4 = r4.f6099j
            java.lang.Object r5 = r3.f6043c
            com.google.android.gms.common.api.internal.a r5 = (com.google.android.gms.common.api.internal.C0347a) r5
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.common.api.internal.H r4 = (com.google.android.gms.common.api.internal.H) r4
            if (r4 != 0) goto L_0x00cb
            goto L_0x0117
        L_0x00cb:
            java.lang.Object r5 = r8.f6079b
            z1.b r5 = (z1.C1132b) r5
            int r6 = r5.f12801b
            if (r6 != 0) goto L_0x00d4
            r1 = r2
        L_0x00d4:
            if (r1 == 0) goto L_0x0114
            r3.f6041a = r2
            java.lang.Object r1 = r3.f6042b
            com.google.android.gms.common.api.g r1 = (com.google.android.gms.common.api.g) r1
            boolean r2 = r1.requiresSignIn()
            if (r2 == 0) goto L_0x00f4
            boolean r0 = r3.f6041a
            if (r0 == 0) goto L_0x0117
            java.lang.Object r0 = r3.d
            com.google.android.gms.common.internal.o r0 = (com.google.android.gms.common.internal.C0386o) r0
            if (r0 == 0) goto L_0x0117
            java.lang.Object r2 = r3.f6044e
            java.util.Set r2 = (java.util.Set) r2
            r1.getRemoteService(r0, r2)
            goto L_0x0117
        L_0x00f4:
            java.util.Set r2 = r1.getScopesForConnectionlessNonSignIn()     // Catch:{ SecurityException -> 0x00fc }
            r1.getRemoteService(r0, r2)     // Catch:{ SecurityException -> 0x00fc }
            goto L_0x0117
        L_0x00fc:
            r2 = move-exception
            java.lang.String r3 = "GoogleApiManager"
            java.lang.String r5 = "Failed to get service from broker. "
            android.util.Log.e(r3, r5, r2)
            java.lang.String r2 = "Failed to get service from broker."
            r1.disconnect(r2)
            z1.b r1 = new z1.b
            r2 = 10
            r1.<init>(r2)
            r4.p(r1, r0)
            goto L_0x0117
        L_0x0114:
            r4.p(r5, r0)
        L_0x0117:
            return
        L_0x0118:
            java.lang.Object r3 = r8.f6080c
            com.google.android.gms.common.api.internal.E r3 = (com.google.android.gms.common.api.internal.E) r3
            boolean r3 = r3.f6019a
            if (r3 != 0) goto L_0x0122
            goto L_0x0243
        L_0x0122:
            java.lang.Object r3 = r8.f6079b
            com.google.android.gms.common.api.internal.a0 r3 = (com.google.android.gms.common.api.internal.a0) r3
            z1.b r3 = r3.f6077b
            int r4 = r3.f12801b
            if (r4 == 0) goto L_0x0132
            android.app.PendingIntent r4 = r3.f12802c
            if (r4 == 0) goto L_0x0132
            r4 = r2
            goto L_0x0133
        L_0x0132:
            r4 = r1
        L_0x0133:
            if (r4 == 0) goto L_0x0167
            java.lang.Object r0 = r8.f6080c
            com.google.android.gms.common.api.internal.E r0 = (com.google.android.gms.common.api.internal.E) r0
            com.google.android.gms.common.api.internal.m r4 = r0.mLifecycleFragment
            android.app.Activity r0 = r0.getActivity()
            android.app.PendingIntent r3 = r3.f12802c
            com.google.android.gms.common.internal.I.g(r3)
            java.lang.Object r5 = r8.f6079b
            com.google.android.gms.common.api.internal.a0 r5 = (com.google.android.gms.common.api.internal.a0) r5
            int r5 = r5.f6076a
            int r6 = com.google.android.gms.common.api.GoogleApiActivity.f5998b
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.google.android.gms.common.api.GoogleApiActivity> r7 = com.google.android.gms.common.api.GoogleApiActivity.class
            r6.<init>(r0, r7)
            java.lang.String r0 = "pending_intent"
            r6.putExtra(r0, r3)
            java.lang.String r0 = "failing_client_id"
            r6.putExtra(r0, r5)
            java.lang.String r0 = "notify_manager"
            r6.putExtra(r0, r1)
            r4.startActivityForResult(r6, r2)
            goto L_0x0243
        L_0x0167:
            java.lang.Object r4 = r8.f6080c
            com.google.android.gms.common.api.internal.E r4 = (com.google.android.gms.common.api.internal.E) r4
            android.app.Activity r5 = r4.getActivity()
            int r6 = r3.f12801b
            z1.e r4 = r4.d
            android.content.Intent r4 = r4.a(r6, r5, r0)
            if (r4 == 0) goto L_0x0190
            java.lang.Object r0 = r8.f6080c
            com.google.android.gms.common.api.internal.E r0 = (com.google.android.gms.common.api.internal.E) r0
            android.app.Activity r1 = r0.getActivity()
            com.google.android.gms.common.api.internal.m r2 = r0.mLifecycleFragment
            int r3 = r3.f12801b
            java.lang.Object r4 = r8.f6080c
            com.google.android.gms.common.api.internal.E r4 = (com.google.android.gms.common.api.internal.E) r4
            z1.e r0 = r0.d
            r0.h(r1, r2, r3, r4)
            goto L_0x0243
        L_0x0190:
            int r4 = r3.f12801b
            r5 = 18
            if (r4 != r5) goto L_0x022f
            java.lang.Object r3 = r8.f6080c
            com.google.android.gms.common.api.internal.E r3 = (com.google.android.gms.common.api.internal.E) r3
            z1.e r4 = r3.d
            android.app.Activity r6 = r3.getActivity()
            r4.getClass()
            android.widget.ProgressBar r4 = new android.widget.ProgressBar
            r7 = 16842874(0x101007a, float:2.36939E-38)
            r4.<init>(r6, r0, r7)
            r4.setIndeterminate(r2)
            r4.setVisibility(r1)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r6)
            r1.setView(r4)
            java.lang.String r2 = com.google.android.gms.common.internal.C0394x.b(r6, r5)
            r1.setMessage(r2)
            java.lang.String r2 = ""
            r1.setPositiveButton(r2, r0)
            android.app.AlertDialog r1 = r1.create()
            java.lang.String r2 = "GooglePlayServicesUpdatingDialog"
            z1.e.f(r6, r1, r2, r3)
            java.lang.Object r2 = r8.f6080c
            com.google.android.gms.common.api.internal.E r2 = (com.google.android.gms.common.api.internal.E) r2
            android.app.Activity r3 = r2.getActivity()
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.common.api.internal.D r4 = new com.google.android.gms.common.api.internal.D
            r4.<init>(r8, r1)
            z1.e r2 = r2.d
            r2.getClass()
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r5 = "android.intent.action.PACKAGE_ADDED"
            r2.<init>(r5)
            java.lang.String r5 = "package"
            r2.addDataScheme(r5)
            S3.B r5 = new S3.B
            r5.<init>(r4)
            com.google.android.gms.internal.base.zao.zaa(r3, r5, r2)
            r5.f2607b = r3
            boolean r2 = z1.i.b(r3)
            if (r2 != 0) goto L_0x0243
            java.lang.Object r2 = r8.f6080c
            com.google.android.gms.common.api.internal.E r2 = (com.google.android.gms.common.api.internal.E) r2
            java.util.concurrent.atomic.AtomicReference r3 = r2.f6020b
            r3.set(r0)
            com.google.android.gms.common.api.internal.h r2 = r2.f6023f
            com.google.android.gms.internal.base.zau r2 = r2.f6103n
            r3 = 3
            android.os.Message r3 = r2.obtainMessage(r3)
            r2.sendMessage(r3)
            boolean r2 = r1.isShowing()
            if (r2 == 0) goto L_0x021e
            r1.dismiss()
        L_0x021e:
            monitor-enter(r5)
            android.content.Context r1 = r5.f2607b     // Catch:{ all -> 0x0227 }
            if (r1 == 0) goto L_0x0229
            r1.unregisterReceiver(r5)     // Catch:{ all -> 0x0227 }
            goto L_0x0229
        L_0x0227:
            r0 = move-exception
            goto L_0x022d
        L_0x0229:
            r5.f2607b = r0     // Catch:{ all -> 0x0227 }
            monitor-exit(r5)
            goto L_0x0243
        L_0x022d:
            monitor-exit(r5)     // Catch:{ all -> 0x0227 }
            throw r0
        L_0x022f:
            java.lang.Object r1 = r8.f6080c
            com.google.android.gms.common.api.internal.E r1 = (com.google.android.gms.common.api.internal.E) r1
            java.lang.Object r2 = r8.f6079b
            com.google.android.gms.common.api.internal.a0 r2 = (com.google.android.gms.common.api.internal.a0) r2
            int r2 = r2.f6076a
            java.util.concurrent.atomic.AtomicReference r4 = r1.f6020b
            r4.set(r0)
            com.google.android.gms.common.api.internal.h r0 = r1.f6023f
            r0.i(r3, r2)
        L_0x0243:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.b0.run():void");
    }

    public /* synthetic */ b0(Object obj, Object obj2, int i2) {
        this.f6078a = i2;
        this.f6080c = obj;
        this.f6079b = obj2;
    }
}
