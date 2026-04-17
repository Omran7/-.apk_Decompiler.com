package B;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f158a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f159b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f160c;

    public /* synthetic */ m(Object obj, Object obj2, int i2) {
        this.f158a = i2;
        this.f159b = obj;
        this.f160c = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x023e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            int r3 = r10.f158a
            switch(r3) {
                case 0: goto L_0x02de;
                case 1: goto L_0x02d2;
                case 2: goto L_0x02b8;
                case 3: goto L_0x02a3;
                case 4: goto L_0x0248;
                case 5: goto L_0x01a0;
                case 6: goto L_0x011d;
                case 7: goto L_0x0108;
                case 8: goto L_0x00dd;
                case 9: goto L_0x00c6;
                case 10: goto L_0x00a1;
                case 11: goto L_0x007f;
                case 12: goto L_0x0067;
                case 13: goto L_0x004e;
                case 14: goto L_0x0032;
                case 15: goto L_0x0024;
                case 16: goto L_0x0016;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r0 = r10.f160c
            P3.b r0 = (P3.b) r0
            java.lang.String r0 = r0.f2184a
            java.lang.Object r1 = r10.f159b
            n3.A r1 = (n3.C0856A) r1
            r1.a(r0)
            return
        L_0x0016:
            java.lang.Object r0 = r10.f160c
            Z2.c r0 = (Z2.c) r0
            java.lang.String r0 = r0.f4483a
            java.lang.Object r1 = r10.f159b
            n3.A r1 = (n3.C0856A) r1
            r1.a(r0)
            return
        L_0x0024:
            int r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.f5929a
            java.lang.Object r0 = r10.f159b
            com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService r0 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService) r0
            java.lang.Object r2 = r10.f160c
            android.app.job.JobParameters r2 = (android.app.job.JobParameters) r2
            r0.jobFinished(r2, r1)
            return
        L_0x0032:
            java.lang.Object r0 = r10.f160c
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Object r1 = r10.f159b
            h3.k r1 = (h3.k) r1
            java.util.concurrent.Semaphore r2 = r1.f8143b
            r0.run()     // Catch:{ all -> 0x0046 }
            r2.release()
            r1.a()
            return
        L_0x0046:
            r0 = move-exception
            r2.release()
            r1.a()
            throw r0
        L_0x004e:
            java.lang.Object r0 = r10.f159b
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            java.lang.Object r1 = r10.f160c
            com.mtma.criminal.city.utils.K r1 = (com.mtma.criminal.city.utils.K) r1
            java.lang.Object r1 = r1.f7360b
            h3.i r1 = (h3.C0565i) r1
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0062 }
            r1.x(r0)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r0 = move-exception
            r1.y(r0)
        L_0x0066:
            return
        L_0x0067:
            java.lang.Object r0 = r10.f159b
            h3.a r0 = (h3.C0557a) r0
            int r1 = r0.f8119c
            android.os.Process.setThreadPriority(r1)
            android.os.StrictMode$ThreadPolicy r0 = r0.d
            if (r0 == 0) goto L_0x0077
            android.os.StrictMode.setThreadPolicy(r0)
        L_0x0077:
            java.lang.Object r0 = r10.f160c
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x007f:
            java.lang.Object r0 = r10.f159b
            g3.m r0 = (g3.m) r0
            java.lang.Object r1 = r10.f160c
            K3.b r1 = (K3.b) r1
            monitor-enter(r0)
            java.util.Set r2 = r0.f8038b     // Catch:{ all -> 0x0092 }
            if (r2 != 0) goto L_0x0094
            java.util.Set r2 = r0.f8037a     // Catch:{ all -> 0x0092 }
            r2.add(r1)     // Catch:{ all -> 0x0092 }
            goto L_0x009d
        L_0x0092:
            r1 = move-exception
            goto L_0x009f
        L_0x0094:
            java.util.Set r2 = r0.f8038b     // Catch:{ all -> 0x0092 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0092 }
            r2.add(r1)     // Catch:{ all -> 0x0092 }
        L_0x009d:
            monitor-exit(r0)
            return
        L_0x009f:
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            throw r1
        L_0x00a1:
            java.lang.Object r0 = r10.f159b
            g3.n r0 = (g3.n) r0
            java.lang.Object r1 = r10.f160c
            K3.b r1 = (K3.b) r1
            K3.b r3 = r0.f8041b
            S3.n r4 = g3.n.d
            if (r3 != r4) goto L_0x00be
            monitor-enter(r0)
            K3.a r3 = r0.f8040a     // Catch:{ all -> 0x00bb }
            r0.f8040a = r2     // Catch:{ all -> 0x00bb }
            r0.f8041b = r1     // Catch:{ all -> 0x00bb }
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            r3.g(r1)
            return
        L_0x00bb:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00bb }
            throw r1
        L_0x00be:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "provide() can be called only once."
            r0.<init>(r1)
            throw r0
        L_0x00c6:
            java.lang.Object r0 = r10.f160c
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Object r1 = r10.f159b
            f.m r1 = (f.m) r1
            r1.getClass()
            r0.run()     // Catch:{ all -> 0x00d8 }
            r1.a()
            return
        L_0x00d8:
            r0 = move-exception
            r1.a()
            throw r0
        L_0x00dd:
            java.lang.Object r0 = r10.f159b
            com.google.firebase.storage.o r0 = (com.google.firebase.storage.o) r0
            java.lang.Object r1 = r10.f160c
            r0.getClass()
            com.google.android.gms.common.internal.I.g(r1)
            java.lang.Object r2 = r0.d
            com.google.firebase.storage.k r2 = (com.google.firebase.storage.k) r2
            java.lang.Object r2 = r2.f6934a
            monitor-enter(r2)
            java.lang.Object r3 = r0.f6949c     // Catch:{ all -> 0x0105 }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x0105 }
            r3.remove(r1)     // Catch:{ all -> 0x0105 }
            java.lang.Object r0 = r0.f6948b     // Catch:{ all -> 0x0105 }
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0     // Catch:{ all -> 0x0105 }
            r0.remove(r1)     // Catch:{ all -> 0x0105 }
            V3.c r0 = V3.c.f3766c     // Catch:{ all -> 0x0105 }
            r0.a(r1)     // Catch:{ all -> 0x0105 }
            monitor-exit(r2)     // Catch:{ all -> 0x0105 }
            return
        L_0x0105:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0105 }
            throw r0
        L_0x0108:
            java.lang.Object r0 = r10.f159b
            androidx.activity.o r0 = (androidx.activity.o) r0
            java.lang.Object r1 = r10.f160c
            androidx.activity.B r1 = (androidx.activity.B) r1
            int r2 = androidx.activity.o.f4641B
            androidx.activity.h r2 = new androidx.activity.h
            r2.<init>(r1, r0)
            androidx.lifecycle.u r0 = r0.f12758a
            r0.a(r2)
            return
        L_0x011d:
            java.lang.Object r0 = r10.f159b
            Z2.e r0 = (Z2.e) r0
            Z2.i r0 = r0.f4491e
            r0.getClass()
            java.lang.Object r1 = r10.f160c
            Z2.b r1 = (Z2.b) r1
            boolean r3 = r1 instanceof Z2.b
            java.lang.String r4 = "com.google.firebase.appcheck.TOKEN_TYPE"
            java.lang.String r5 = "com.google.firebase.appcheck.APP_CHECK_TOKEN"
            g3.l r0 = r0.f4508a
            if (r3 == 0) goto L_0x0186
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1.getClass()
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0160 }
            r3.<init>()     // Catch:{ JSONException -> 0x0160 }
            java.lang.String r6 = "token"
            java.lang.String r7 = r1.f4480a     // Catch:{ JSONException -> 0x0160 }
            r3.put(r6, r7)     // Catch:{ JSONException -> 0x0160 }
            java.lang.String r6 = "receivedAt"
            long r7 = r1.f4481b     // Catch:{ JSONException -> 0x0160 }
            r3.put(r6, r7)     // Catch:{ JSONException -> 0x0160 }
            java.lang.String r6 = "expiresIn"
            long r7 = r1.f4482c     // Catch:{ JSONException -> 0x0160 }
            r3.put(r6, r7)     // Catch:{ JSONException -> 0x0160 }
            java.lang.String r2 = r3.toString()     // Catch:{ JSONException -> 0x0160 }
            goto L_0x0178
        L_0x0160:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Could not serialize token: "
            r3.<init>(r6)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "Z2.b"
            android.util.Log.e(r3, r1)
        L_0x0178:
            android.content.SharedPreferences$Editor r0 = r0.putString(r5, r2)
            java.lang.String r1 = "DEFAULT_APP_CHECK_TOKEN"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r1)
            r0.apply()
            goto L_0x019f
        L_0x0186:
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r1.f4480a
            android.content.SharedPreferences$Editor r0 = r0.putString(r5, r1)
            java.lang.String r1 = "UNKNOWN_APP_CHECK_TOKEN"
            android.content.SharedPreferences$Editor r0 = r0.putString(r4, r1)
            r0.apply()
        L_0x019f:
            return
        L_0x01a0:
            java.lang.Object r1 = r10.f159b
            Z2.e r1 = (Z2.e) r1
            r1.getClass()
            a3.a r3 = Z2.i.f4507b
            java.lang.String r3 = r3.f4562b
            Z2.i r4 = r1.f4491e
            g3.l r4 = r4.f4508a
            java.lang.Object r5 = r4.get()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r6 = "com.google.firebase.appcheck.TOKEN_TYPE"
            java.lang.String r5 = r5.getString(r6, r2)
            java.lang.Object r7 = r4.get()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            java.lang.String r8 = "com.google.firebase.appcheck.APP_CHECK_TOKEN"
            java.lang.String r7 = r7.getString(r8, r2)
            if (r5 == 0) goto L_0x01ee
            if (r7 != 0) goto L_0x01cc
            goto L_0x01ee
        L_0x01cc:
            if (r5 == 0) goto L_0x0208
            java.lang.String r9 = "DEFAULT_APP_CHECK_TOKEN"
            boolean r9 = r5.equals(r9)     // Catch:{ IllegalArgumentException -> 0x01f5 }
            if (r9 == 0) goto L_0x01d8
            r9 = r0
            goto L_0x01e1
        L_0x01d8:
            java.lang.String r9 = "UNKNOWN_APP_CHECK_TOKEN"
            boolean r9 = r5.equals(r9)     // Catch:{ IllegalArgumentException -> 0x01f5 }
            if (r9 == 0) goto L_0x01fc
            r9 = 2
        L_0x01e1:
            int r9 = q.C0928e.c(r9)     // Catch:{ IllegalArgumentException -> 0x01f5 }
            if (r9 == 0) goto L_0x01f7
            if (r9 == r0) goto L_0x01f0
            java.lang.String r0 = "Reached unreachable section in #retrieveAppCheckToken()"
            android.util.Log.e(r3, r0, r2)
        L_0x01ee:
            r0 = r2
            goto L_0x023c
        L_0x01f0:
            Z2.b r0 = Z2.b.b(r7)     // Catch:{ IllegalArgumentException -> 0x01f5 }
            goto L_0x023c
        L_0x01f5:
            r0 = move-exception
            goto L_0x0210
        L_0x01f7:
            Z2.b r0 = Z2.b.c(r7)     // Catch:{ IllegalArgumentException -> 0x01f5 }
            goto L_0x023c
        L_0x01fc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x01f5 }
            java.lang.String r7 = "No enum constant com.google.firebase.appcheck.internal.StorageHelper.TokenType."
            java.lang.String r7 = r7.concat(r5)     // Catch:{ IllegalArgumentException -> 0x01f5 }
            r0.<init>(r7)     // Catch:{ IllegalArgumentException -> 0x01f5 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x01f5 }
        L_0x0208:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ IllegalArgumentException -> 0x01f5 }
            java.lang.String r7 = "Name is null"
            r0.<init>(r7)     // Catch:{ IllegalArgumentException -> 0x01f5 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x01f5 }
        L_0x0210:
            java.lang.String r7 = "Failed to parse TokenType of stored token  with type ["
            java.lang.String r9 = "] with exception: "
            java.lang.StringBuilder r5 = h0.C0552a.t(r7, r5, r9)
            java.lang.String r0 = r0.getMessage()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.e(r3, r0, r2)
            java.lang.Object r0 = r4.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r8)
            android.content.SharedPreferences$Editor r0 = r0.remove(r6)
            r0.apply()
            goto L_0x01ee
        L_0x023c:
            if (r0 == 0) goto L_0x0240
            r1.f4497m = r0
        L_0x0240:
            java.lang.Object r0 = r10.f160c
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            r0.setResult(r2)
            return
        L_0x0248:
            java.lang.Object r0 = r10.f159b
            R2.i r0 = (R2.i) r0
            r0.b()
            java.lang.String r3 = r0.g()
            android.content.Context r0 = r0.f2490a
            com.google.android.gms.common.internal.I.g(r0)
            com.google.android.gms.common.internal.I.d(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "com.google.firebase.appcheck.debug.store."
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r1)
            java.lang.String r1 = "com.google.firebase.appcheck.debug.DEBUG_SECRET"
            java.lang.String r2 = r0.getString(r1, r2)
            if (r2 != 0) goto L_0x0288
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            r0.apply()
        L_0x0288:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Enter this debug secret into the allow list in the Firebase Console for your project: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Y2.a"
            android.util.Log.d(r1, r0)
            java.lang.Object r0 = r10.f160c
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            r0.setResult(r2)
            return
        L_0x02a3:
            java.lang.Object r0 = r10.f160c
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            java.lang.Object r1 = r10.f159b
            S3.s r1 = (S3.s) r1
            android.graphics.Bitmap r1 = r1.c()     // Catch:{ Exception -> 0x02b3 }
            r0.setResult(r1)     // Catch:{ Exception -> 0x02b3 }
            goto L_0x02b7
        L_0x02b3:
            r1 = move-exception
            r0.setException(r1)
        L_0x02b7:
            return
        L_0x02b8:
            java.lang.Object r0 = r10.f160c
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0
            U3.c r1 = com.google.firebase.messaging.FirebaseMessaging.f6901l
            java.lang.Object r1 = r10.f159b
            com.google.firebase.messaging.FirebaseMessaging r1 = (com.google.firebase.messaging.FirebaseMessaging) r1
            r1.getClass()
            java.lang.String r1 = r1.a()     // Catch:{ Exception -> 0x02cd }
            r0.setResult(r1)     // Catch:{ Exception -> 0x02cd }
            goto L_0x02d1
        L_0x02cd:
            r1 = move-exception
            r0.setException(r1)
        L_0x02d1:
            return
        L_0x02d2:
            java.lang.Object r0 = r10.f159b
            S3.m r0 = (S3.m) r0
            java.lang.Object r1 = r10.f160c
            android.content.Intent r1 = (android.content.Intent) r1
            r0.a(r1)
            return
        L_0x02de:
            java.lang.Object r0 = r10.f159b
            B.b r0 = (B.b) r0
            java.lang.Object r1 = r10.f160c
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            r0.h(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B.m.run():void");
    }
}
