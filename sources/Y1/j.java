package y1;

import F1.a;
import M0.g;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m0.a0;

public final class j implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public int f12667a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Messenger f12668b = new Messenger(new zzf(Looper.getMainLooper(), new g(this, 2)));

    /* renamed from: c  reason: collision with root package name */
    public a0 f12669c;
    public final ArrayDeque d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray f12670e = new SparseArray();

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f12671f;

    public /* synthetic */ j(l lVar) {
        this.f12671f = lVar;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 112 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(int r1, java.lang.String r2) {
        /*
            r0 = this;
            monitor-enter(r0)
            r1 = 0
            r0.b(r2, r1)     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)
            return
        L_0x0007:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r1
        L_0x0009:
            r1 = move-exception
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.j.a(int, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [S3.y, java.lang.Exception] */
    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.f12667a;
            if (i2 == 0) {
                throw new IllegalStateException();
            } else if (i2 == 1 || i2 == 2) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f12667a = 4;
                a.b().c((Context) this.f12671f.f12678b, this);
                ? exc = new Exception(str, securityException);
                Iterator it2 = this.d.iterator();
                while (it2.hasNext()) {
                    ((k) it2.next()).b(exc);
                }
                this.d.clear();
                for (int i5 = 0; i5 < this.f12670e.size(); i5++) {
                    ((k) this.f12670e.valueAt(i5)).b(exc);
                }
                this.f12670e.clear();
            } else if (i2 == 3) {
                this.f12667a = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f12667a     // Catch:{ all -> 0x0026 }
            r1 = 2
            if (r0 != r1) goto L_0x003a
            java.util.ArrayDeque r0 = r2.d     // Catch:{ all -> 0x0026 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x003a
            android.util.SparseArray r0 = r2.f12670e     // Catch:{ all -> 0x0026 }
            int r0 = r0.size()     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x003a
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r0 = move-exception
            goto L_0x003c
        L_0x0028:
            r0 = 3
            r2.f12667a = r0     // Catch:{ all -> 0x0026 }
            y1.l r0 = r2.f12671f     // Catch:{ all -> 0x0026 }
            F1.a r1 = F1.a.b()     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.f12678b     // Catch:{ all -> 0x0026 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0026 }
            r1.c(r0, r2)     // Catch:{ all -> 0x0026 }
            monitor-exit(r2)
            return
        L_0x003a:
            monitor-exit(r2)
            return
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.j.c():void");
    }

    public final synchronized boolean d(k kVar) {
        int i2 = this.f12667a;
        if (i2 == 0) {
            this.d.add(kVar);
            if (this.f12667a == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f12667a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!a.b().a((Context) this.f12671f.f12678b, intent, this, 1)) {
                        a(0, "Unable to bind to service");
                    } else {
                        ((ScheduledExecutorService) this.f12671f.f12679c).schedule(new i(this, 1), 30, TimeUnit.SECONDS);
                    }
                } catch (SecurityException e6) {
                    b("Unable to bind to service", e6);
                }
            } else {
                throw new IllegalStateException();
            }
        } else if (i2 == 1) {
            this.d.add(kVar);
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            this.d.add(kVar);
            ((ScheduledExecutorService) this.f12671f.f12679c).execute(new i(this, 0));
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f12671f.f12679c).execute(new j3.g(this, iBinder, 15));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f12671f.f12679c).execute(new i(this, 2));
    }
}
