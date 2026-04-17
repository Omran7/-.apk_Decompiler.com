package S3;

import java.util.concurrent.Callable;

/* renamed from: S3.j  reason: case insensitive filesystem */
public final /* synthetic */ class C0149j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2676a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2677b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2678c;

    public /* synthetic */ C0149j(Object obj, Object obj2, int i2) {
        this.f2676a = i2;
        this.f2677b = obj;
        this.f2678c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r9 = this;
            int r0 = r9.f2676a
            switch(r0) {
                case 0: goto L_0x0061;
                case 1: goto L_0x0033;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.f2677b
            d3.c r0 = (d3.C0467c) r0
            r0.getClass()
            java.lang.Object r1 = r9.f2678c
            I5.u r1 = (I5.u) r1
            r1.getClass()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "playIntegrityToken"
            java.lang.String r1 = r1.f1280b
            r2.put(r3, r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)
            F3.k r2 = r0.f7528c
            r3 = 3
            Z2.h r0 = r0.f7530f
            Z2.a r0 = r2.g(r1, r3, r0)
            return r0
        L_0x0033:
            java.lang.Object r0 = r9.f2677b
            Y2.a r0 = (Y2.a) r0
            r0.getClass()
            java.lang.Object r1 = r9.f2678c
            I5.u r1 = (I5.u) r1
            r1.getClass()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "debugToken"
            java.lang.String r1 = r1.f1280b
            r2.put(r3, r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)
            F3.k r2 = r0.f4270a
            r3 = 2
            Z2.h r0 = r0.d
            Z2.a r0 = r2.g(r1, r3, r0)
            return r0
        L_0x0061:
            java.lang.Object r0 = r9.f2677b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r1 = r9.f2678c
            android.content.Intent r1 = (android.content.Intent) r1
            S3.z r2 = S3.z.w()
            r2.getClass()
            java.lang.String r3 = "FirebaseMessaging"
            r4 = 3
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x0080
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r5 = "Starting service"
            android.util.Log.d(r3, r5)
        L_0x0080:
            java.lang.Object r3 = r2.f2713e
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            r3.offer(r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.google.firebase.MESSAGING_EVENT"
            r1.<init>(r3)
            java.lang.String r3 = r0.getPackageName()
            r1.setPackage(r3)
            java.lang.String r3 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            monitor-enter(r2)
            java.lang.Object r5 = r2.f2711b     // Catch:{ all -> 0x00e3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00e3 }
            if (r5 == 0) goto L_0x00a1
            monitor-exit(r2)
            goto L_0x011a
        L_0x00a1:
            android.content.pm.PackageManager r5 = r0.getPackageManager()     // Catch:{ all -> 0x00e3 }
            r6 = 0
            android.content.pm.ResolveInfo r5 = r5.resolveService(r1, r6)     // Catch:{ all -> 0x00e3 }
            r6 = 0
            if (r5 == 0) goto L_0x0111
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch:{ all -> 0x00e3 }
            if (r5 != 0) goto L_0x00b2
            goto L_0x0111
        L_0x00b2:
            java.lang.String r7 = r0.getPackageName()     // Catch:{ all -> 0x00e3 }
            java.lang.String r8 = r5.packageName     // Catch:{ all -> 0x00e3 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x00e3 }
            if (r7 == 0) goto L_0x00f1
            java.lang.String r7 = r5.name     // Catch:{ all -> 0x00e3 }
            if (r7 != 0) goto L_0x00c3
            goto L_0x00f1
        L_0x00c3:
            java.lang.String r3 = "."
            boolean r3 = r7.startsWith(r3)     // Catch:{ all -> 0x00e3 }
            if (r3 == 0) goto L_0x00e6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            r3.<init>()     // Catch:{ all -> 0x00e3 }
            java.lang.String r6 = r0.getPackageName()     // Catch:{ all -> 0x00e3 }
            r3.append(r6)     // Catch:{ all -> 0x00e3 }
            java.lang.String r5 = r5.name     // Catch:{ all -> 0x00e3 }
            r3.append(r5)     // Catch:{ all -> 0x00e3 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e3 }
            r2.f2711b = r3     // Catch:{ all -> 0x00e3 }
            goto L_0x00ea
        L_0x00e3:
            r0 = move-exception
            goto L_0x0182
        L_0x00e6:
            java.lang.String r3 = r5.name     // Catch:{ all -> 0x00e3 }
            r2.f2711b = r3     // Catch:{ all -> 0x00e3 }
        L_0x00ea:
            java.lang.Object r3 = r2.f2711b     // Catch:{ all -> 0x00e3 }
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00e3 }
            monitor-exit(r2)
            goto L_0x011a
        L_0x00f1:
            java.lang.String r7 = "FirebaseMessaging"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e3 }
            r8.<init>(r3)     // Catch:{ all -> 0x00e3 }
            java.lang.String r3 = r5.packageName     // Catch:{ all -> 0x00e3 }
            r8.append(r3)     // Catch:{ all -> 0x00e3 }
            java.lang.String r3 = "/"
            r8.append(r3)     // Catch:{ all -> 0x00e3 }
            java.lang.String r3 = r5.name     // Catch:{ all -> 0x00e3 }
            r8.append(r3)     // Catch:{ all -> 0x00e3 }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x00e3 }
            android.util.Log.e(r7, r3)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r2)
        L_0x010f:
            r5 = r6
            goto L_0x011a
        L_0x0111:
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r5 = "Failed to resolve target intent service, skipping classname enforcement"
            android.util.Log.e(r3, r5)     // Catch:{ all -> 0x00e3 }
            monitor-exit(r2)
            goto L_0x010f
        L_0x011a:
            if (r5 == 0) goto L_0x0136
            java.lang.String r3 = "FirebaseMessaging"
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x012f
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r4 = "Restricting intent to a specific service: "
            java.lang.String r4 = r4.concat(r5)
            android.util.Log.d(r3, r4)
        L_0x012f:
            java.lang.String r3 = r0.getPackageName()
            r1.setClassName(r3, r5)
        L_0x0136:
            boolean r2 = r2.y(r0)     // Catch:{ SecurityException -> 0x0143, IllegalStateException -> 0x0141 }
            if (r2 == 0) goto L_0x0145
            android.content.ComponentName r0 = S3.I.c(r0, r1)     // Catch:{ SecurityException -> 0x0143, IllegalStateException -> 0x0141 }
            goto L_0x0150
        L_0x0141:
            r0 = move-exception
            goto L_0x015e
        L_0x0143:
            r0 = move-exception
            goto L_0x0174
        L_0x0145:
            android.content.ComponentName r0 = r0.startService(r1)     // Catch:{ SecurityException -> 0x0143, IllegalStateException -> 0x0141 }
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r2 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r1, r2)     // Catch:{ SecurityException -> 0x0143, IllegalStateException -> 0x0141 }
        L_0x0150:
            if (r0 != 0) goto L_0x015c
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r0, r1)     // Catch:{ SecurityException -> 0x0143, IllegalStateException -> 0x0141 }
            r0 = 404(0x194, float:5.66E-43)
            goto L_0x017d
        L_0x015c:
            r0 = -1
            goto L_0x017d
        L_0x015e:
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to start service while in background: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.e(r1, r0)
            r0 = 402(0x192, float:5.63E-43)
            goto L_0x017d
        L_0x0174:
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r2 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r1, r2, r0)
            r0 = 401(0x191, float:5.62E-43)
        L_0x017d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0182:
            monitor-exit(r2)     // Catch:{ all -> 0x00e3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.C0149j.call():java.lang.Object");
    }
}
