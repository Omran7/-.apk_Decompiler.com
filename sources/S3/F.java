package S3;

import I3.e;
import J2.o;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n.j;

public final class F {

    /* renamed from: i  reason: collision with root package name */
    public static final long f2619i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f2620j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2621a;

    /* renamed from: b  reason: collision with root package name */
    public final e f2622b;

    /* renamed from: c  reason: collision with root package name */
    public final o f2623c;
    public final FirebaseMessaging d;

    /* renamed from: e  reason: collision with root package name */
    public final n.e f2624e = new j(0);

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2625f;
    public boolean g = false;
    public final D h;

    /* JADX WARNING: type inference failed for: r0v0, types: [n.e, n.j] */
    public F(FirebaseMessaging firebaseMessaging, e eVar, D d6, o oVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.f2622b = eVar;
        this.h = d6;
        this.f2623c = oVar;
        this.f2621a = context;
        this.f2625f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) {
        try {
            Tasks.await(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e6) {
            Throwable cause = e6.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e6);
            }
        } catch (InterruptedException | TimeoutException e7) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e7);
        }
    }

    public final void b(String str) {
        String a6 = this.d.a();
        o oVar = this.f2623c;
        oVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(oVar.n(oVar.s(a6, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a6 = this.d.a();
        o oVar = this.f2623c;
        oVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(oVar.n(oVar.s(a6, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z3) {
        this.g = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r8 = r0.f2610b;
        r9 = r8.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r9 == 83) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r9 == 85) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r8.equals("U") == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        if (r8.equals("S") == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        r8 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        r10 = r0.f2609a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r8 == 0) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0057, code lost:
        if (r8 == 1) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0061, code lost:
        android.util.Log.d("FirebaseMessaging", "Unknown topic operation" + r0 + ".");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        c(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0081, code lost:
        android.util.Log.d("FirebaseMessaging", "Unsubscribe from topic: " + r10 + " succeeded.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        b(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        android.util.Log.d("FirebaseMessaging", "Subscribe to topic: " + r10 + " succeeded.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        r1 = r11.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b3, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r2 = r1.f2613a;
        r3 = r0.f2611c;
        r4 = (java.util.ArrayDeque) r2.f771e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bc, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c5, code lost:
        if (((java.util.ArrayDeque) r2.f771e).remove(r3) == false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c7, code lost:
        ((java.util.concurrent.ScheduledThreadPoolExecutor) r2.f772f).execute(new A4.a(r2, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d4, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d5, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d6, code lost:
        r2 = r11.f2624e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r0 = r0.f2611c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e1, code lost:
        if (r11.f2624e.containsKey(r0) != false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e8, code lost:
        r1 = (java.util.ArrayDeque) r11.f2624e.get(r0);
        r3 = (com.google.android.gms.tasks.TaskCompletionSource) r1.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f6, code lost:
        if (r3 == null) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f8, code lost:
        r3.setResult(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0100, code lost:
        if (r1.isEmpty() == false) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0102, code lost:
        r11.f2624e.remove(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0107, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x010b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x011c, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r0.getMessage()) != false) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x013b, code lost:
        if (r0.getMessage() == null) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x013d, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0143, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0144, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic operation failed: " + r0.getMessage() + ". Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x015e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r11 = this;
        L_0x0000:
            monitor-enter(r11)
            S3.D r0 = r11.h     // Catch:{ all -> 0x001b }
            S3.C r0 = r0.a()     // Catch:{ all -> 0x001b }
            r1 = 3
            r2 = 1
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x001b }
            goto L_0x001e
        L_0x001b:
            r0 = move-exception
            goto L_0x015f
        L_0x001e:
            monitor-exit(r11)     // Catch:{ all -> 0x001b }
            return r2
        L_0x0020:
            monitor-exit(r11)     // Catch:{ all -> 0x001b }
            java.lang.String r3 = "FirebaseMessaging"
            java.lang.String r4 = "Unknown topic operation"
            java.lang.String r5 = "Subscribe to topic: "
            java.lang.String r6 = "Unsubscribe from topic: "
            r7 = 0
            java.lang.String r8 = r0.f2610b     // Catch:{ IOException -> 0x0043 }
            int r9 = r8.hashCode()     // Catch:{ IOException -> 0x0043 }
            r10 = 83
            if (r9 == r10) goto L_0x0046
            r10 = 85
            if (r9 == r10) goto L_0x0039
            goto L_0x0050
        L_0x0039:
            java.lang.String r9 = "U"
            boolean r8 = r8.equals(r9)     // Catch:{ IOException -> 0x0043 }
            if (r8 == 0) goto L_0x0050
            r8 = r2
            goto L_0x0051
        L_0x0043:
            r0 = move-exception
            goto L_0x0112
        L_0x0046:
            java.lang.String r9 = "S"
            boolean r8 = r8.equals(r9)     // Catch:{ IOException -> 0x0043 }
            if (r8 == 0) goto L_0x0050
            r8 = r7
            goto L_0x0051
        L_0x0050:
            r8 = -1
        L_0x0051:
            java.lang.String r9 = " succeeded."
            java.lang.String r10 = r0.f2609a
            if (r8 == 0) goto L_0x0094
            if (r8 == r2) goto L_0x0076
            java.lang.String r2 = "FirebaseMessaging"
            boolean r1 = android.util.Log.isLoggable(r2, r1)     // Catch:{ IOException -> 0x0043 }
            if (r1 == 0) goto L_0x00b1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0043 }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0043 }
            r1.append(r0)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r2 = "."
            r1.append(r2)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0043 }
            android.util.Log.d(r3, r1)     // Catch:{ IOException -> 0x0043 }
            goto L_0x00b1
        L_0x0076:
            r11.c(r10)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r2 = "FirebaseMessaging"
            boolean r1 = android.util.Log.isLoggable(r2, r1)     // Catch:{ IOException -> 0x0043 }
            if (r1 == 0) goto L_0x00b1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0043 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0043 }
            r1.append(r10)     // Catch:{ IOException -> 0x0043 }
            r1.append(r9)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0043 }
            android.util.Log.d(r3, r1)     // Catch:{ IOException -> 0x0043 }
            goto L_0x00b1
        L_0x0094:
            r11.b(r10)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r2 = "FirebaseMessaging"
            boolean r1 = android.util.Log.isLoggable(r2, r1)     // Catch:{ IOException -> 0x0043 }
            if (r1 == 0) goto L_0x00b1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0043 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0043 }
            r1.append(r10)     // Catch:{ IOException -> 0x0043 }
            r1.append(r9)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0043 }
            android.util.Log.d(r3, r1)     // Catch:{ IOException -> 0x0043 }
        L_0x00b1:
            S3.D r1 = r11.h
            monitor-enter(r1)
            F3.k r2 = r1.f2613a     // Catch:{ all -> 0x010f }
            java.lang.String r3 = r0.f2611c     // Catch:{ all -> 0x010f }
            java.lang.Object r4 = r2.f771e     // Catch:{ all -> 0x010f }
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4     // Catch:{ all -> 0x010f }
            monitor-enter(r4)     // Catch:{ all -> 0x010f }
            java.lang.Object r5 = r2.f771e     // Catch:{ all -> 0x010c }
            java.util.ArrayDeque r5 = (java.util.ArrayDeque) r5     // Catch:{ all -> 0x010c }
            boolean r3 = r5.remove(r3)     // Catch:{ all -> 0x010c }
            if (r3 == 0) goto L_0x00d4
            A4.a r3 = new A4.a     // Catch:{ all -> 0x010c }
            r5 = 2
            r3.<init>(r2, r5)     // Catch:{ all -> 0x010c }
            java.lang.Object r2 = r2.f772f     // Catch:{ all -> 0x010c }
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = (java.util.concurrent.ScheduledThreadPoolExecutor) r2     // Catch:{ all -> 0x010c }
            r2.execute(r3)     // Catch:{ all -> 0x010c }
        L_0x00d4:
            monitor-exit(r4)     // Catch:{ all -> 0x010c }
            monitor-exit(r1)
            n.e r2 = r11.f2624e
            monitor-enter(r2)
            java.lang.String r0 = r0.f2611c     // Catch:{ all -> 0x00e6 }
            n.e r1 = r11.f2624e     // Catch:{ all -> 0x00e6 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x00e6 }
            if (r1 != 0) goto L_0x00e8
            monitor-exit(r2)     // Catch:{ all -> 0x00e6 }
            goto L_0x0000
        L_0x00e6:
            r0 = move-exception
            goto L_0x010a
        L_0x00e8:
            n.e r1 = r11.f2624e     // Catch:{ all -> 0x00e6 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x00e6 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x00e6 }
            java.lang.Object r3 = r1.poll()     // Catch:{ all -> 0x00e6 }
            com.google.android.gms.tasks.TaskCompletionSource r3 = (com.google.android.gms.tasks.TaskCompletionSource) r3     // Catch:{ all -> 0x00e6 }
            if (r3 == 0) goto L_0x00fc
            r4 = 0
            r3.setResult(r4)     // Catch:{ all -> 0x00e6 }
        L_0x00fc:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00e6 }
            if (r1 == 0) goto L_0x0107
            n.e r1 = r11.f2624e     // Catch:{ all -> 0x00e6 }
            r1.remove(r0)     // Catch:{ all -> 0x00e6 }
        L_0x0107:
            monitor-exit(r2)     // Catch:{ all -> 0x00e6 }
            goto L_0x0000
        L_0x010a:
            monitor-exit(r2)     // Catch:{ all -> 0x00e6 }
            throw r0
        L_0x010c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010c }
            throw r0     // Catch:{ all -> 0x010f }
        L_0x010f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x010f }
            throw r0
        L_0x0112:
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r2 = r0.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0144
            java.lang.String r1 = "INTERNAL_SERVER_ERROR"
            java.lang.String r2 = r0.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0144
            java.lang.String r1 = "TOO_MANY_SUBSCRIBERS"
            java.lang.String r2 = r0.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0137
            goto L_0x0144
        L_0x0137:
            java.lang.String r1 = r0.getMessage()
            if (r1 != 0) goto L_0x0143
            java.lang.String r0 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r3, r0)
            goto L_0x015e
        L_0x0143:
            throw r0
        L_0x0144:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Topic operation failed: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = ". Will retry Topic operation."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r3, r0)
        L_0x015e:
            return r7
        L_0x015f:
            monitor-exit(r11)     // Catch:{ all -> 0x001b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.F.e():boolean");
    }

    public final void f(long j6) {
        long min = Math.min(Math.max(30, 2 * j6), f2619i);
        this.f2625f.schedule(new H(this, this.f2621a, this.f2622b, min), j6, TimeUnit.SECONDS);
        d(true);
    }
}
