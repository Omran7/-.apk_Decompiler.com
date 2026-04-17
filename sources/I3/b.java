package I3;

import R2.i;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;

public final /* synthetic */ class b implements Continuation, SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseInstanceId f1163a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1164b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1165c;

    public b(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f1163a = firebaseInstanceId;
        this.f1164b = str;
        this.f1165c = str2;
    }

    public Task then(Object obj) {
        String str;
        FirebaseInstanceId firebaseInstanceId = this.f1163a;
        String str2 = this.f1164b;
        String str3 = this.f1165c;
        String str4 = (String) obj;
        h hVar = FirebaseInstanceId.f6890j;
        i iVar = firebaseInstanceId.f6894b;
        iVar.b();
        if ("[DEFAULT]".equals(iVar.f2491b)) {
            str = "";
        } else {
            str = iVar.g();
        }
        String a6 = firebaseInstanceId.f6895c.a();
        synchronized (hVar) {
            String a7 = i.a(System.currentTimeMillis(), str4, a6);
            if (a7 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) hVar.f1179b).edit();
                edit.putString(h.f(str, str2, str3), a7);
                edit.commit();
            }
        }
        return Tasks.forResult(new d(str4));
    }

    public b(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.f1163a = firebaseInstanceId;
        this.f1164b = str;
        this.f1165c = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object then(com.google.android.gms.tasks.Task r11) {
        /*
            r10 = this;
            com.google.firebase.iid.FirebaseInstanceId r1 = r10.f1163a
            java.lang.String r11 = r10.f1164b
            java.lang.String r7 = r10.f1165c
            r1.getClass()
            I3.h r0 = com.google.firebase.iid.FirebaseInstanceId.f6890j     // Catch:{ InterruptedException -> 0x00cc }
            R2.i r2 = r1.f6894b     // Catch:{ InterruptedException -> 0x00cc }
            java.lang.String r2 = r2.g()     // Catch:{ InterruptedException -> 0x00cc }
            r0.L(r2)     // Catch:{ InterruptedException -> 0x00cc }
            L3.e r0 = r1.f6897f     // Catch:{ InterruptedException -> 0x00cc }
            L3.d r0 = (L3.d) r0     // Catch:{ InterruptedException -> 0x00cc }
            com.google.android.gms.tasks.Task r0 = r0.c()     // Catch:{ InterruptedException -> 0x00cc }
            java.lang.Object r0 = com.google.firebase.iid.FirebaseInstanceId.a(r0)     // Catch:{ InterruptedException -> 0x00cc }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ InterruptedException -> 0x00cc }
            I3.i r5 = r1.g(r11, r7)
            boolean r0 = r1.j(r5)
            if (r0 != 0) goto L_0x003a
            I3.d r11 = new I3.d
            java.lang.String r0 = r5.f1182a
            r11.<init>(r0)
            com.google.android.gms.tasks.Task r11 = com.google.android.gms.tasks.Tasks.forResult(r11)
            goto L_0x00c9
        L_0x003a:
            I3.h r8 = r1.f6896e
            F3.k r9 = new F3.k
            r6 = 2
            r0 = r9
            r3 = r11
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            monitor-enter(r8)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0081 }
            r0.<init>(r11, r7)     // Catch:{ all -> 0x0081 }
            java.lang.Object r11 = r8.f1180c     // Catch:{ all -> 0x0081 }
            n.e r11 = (n.e) r11     // Catch:{ all -> 0x0081 }
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0081 }
            com.google.android.gms.tasks.Task r11 = (com.google.android.gms.tasks.Task) r11     // Catch:{ all -> 0x0081 }
            r1 = 3
            if (r11 == 0) goto L_0x0085
            java.lang.String r2 = "FirebaseInstanceId"
            boolean r1 = android.util.Log.isLoggable(r2, r1)     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x0083
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0081 }
            int r1 = r0.length()     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            int r1 = r1 + 29
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "Joining ongoing request for: "
            r2.append(r1)     // Catch:{ all -> 0x0081 }
            r2.append(r0)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0081 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x0081 }
            goto L_0x0083
        L_0x0081:
            r11 = move-exception
            goto L_0x00ca
        L_0x0083:
            monitor-exit(r8)
            goto L_0x00c9
        L_0x0085:
            java.lang.String r11 = "FirebaseInstanceId"
            boolean r11 = android.util.Log.isLoggable(r11, r1)     // Catch:{ all -> 0x0081 }
            if (r11 == 0) goto L_0x00ad
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0081 }
            int r1 = r11.length()     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0081 }
            int r1 = r1 + 24
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "Making new request for: "
            r2.append(r1)     // Catch:{ all -> 0x0081 }
            r2.append(r11)     // Catch:{ all -> 0x0081 }
            java.lang.String r11 = "FirebaseInstanceId"
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0081 }
            android.util.Log.d(r11, r1)     // Catch:{ all -> 0x0081 }
        L_0x00ad:
            com.google.android.gms.tasks.Task r11 = r9.q()     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r8.f1179b     // Catch:{ all -> 0x0081 }
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1     // Catch:{ all -> 0x0081 }
            I3.h r2 = new I3.h     // Catch:{ all -> 0x0081 }
            r3 = 11
            r4 = 0
            r2.<init>(r8, r0, r3, r4)     // Catch:{ all -> 0x0081 }
            com.google.android.gms.tasks.Task r11 = r11.continueWithTask(r1, r2)     // Catch:{ all -> 0x0081 }
            java.lang.Object r1 = r8.f1180c     // Catch:{ all -> 0x0081 }
            n.e r1 = (n.e) r1     // Catch:{ all -> 0x0081 }
            r1.put(r0, r11)     // Catch:{ all -> 0x0081 }
            monitor-exit(r8)
        L_0x00c9:
            return r11
        L_0x00ca:
            monitor-exit(r8)     // Catch:{ all -> 0x0081 }
            throw r11
        L_0x00cc:
            r11 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.b.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
