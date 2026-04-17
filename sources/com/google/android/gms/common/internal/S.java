package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;

public final class S implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6154a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f6155b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6156c;
    public IBinder d;

    /* renamed from: e  reason: collision with root package name */
    public final Q f6157e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f6158f;
    public final /* synthetic */ U g;

    public S(U u6, Q q6) {
        this.g = u6;
        this.f6157e = q6;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static z1.C1132b a(com.google.android.gms.common.internal.S r9, java.lang.String r10, java.util.concurrent.Executor r11) {
        /*
            com.google.android.gms.common.internal.Q r0 = r9.f6157e     // Catch:{ J -> 0x0070 }
            com.google.android.gms.common.internal.U r1 = r9.g     // Catch:{ J -> 0x0070 }
            android.content.Context r1 = r1.f6160e     // Catch:{ J -> 0x0070 }
            android.content.Intent r5 = r0.a(r1)     // Catch:{ J -> 0x0070 }
            r0 = 3
            r9.f6155b = r0
            android.os.StrictMode$VmPolicy r0 = android.os.StrictMode.getVmPolicy()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L_0x0027
            android.os.StrictMode$VmPolicy$Builder r1 = new android.os.StrictMode$VmPolicy$Builder
            r1.<init>(r0)
            android.os.StrictMode$VmPolicy$Builder r1 = G1.i.a(r1)
            android.os.StrictMode$VmPolicy r1 = r1.build()
            android.os.StrictMode.setVmPolicy(r1)
        L_0x0027:
            com.google.android.gms.common.internal.U r1 = r9.g     // Catch:{ all -> 0x0056 }
            F1.a r2 = r1.g     // Catch:{ all -> 0x0056 }
            android.content.Context r3 = r1.f6160e     // Catch:{ all -> 0x0056 }
            r7 = 4225(0x1081, float:5.92E-42)
            r4 = r10
            r6 = r9
            r8 = r11
            boolean r10 = r2.d(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0056 }
            r9.f6156c = r10     // Catch:{ all -> 0x0056 }
            if (r10 == 0) goto L_0x0058
            com.google.android.gms.common.internal.U r10 = r9.g     // Catch:{ all -> 0x0056 }
            com.google.android.gms.internal.common.zzh r10 = r10.f6161f     // Catch:{ all -> 0x0056 }
            com.google.android.gms.common.internal.Q r11 = r9.f6157e     // Catch:{ all -> 0x0056 }
            r1 = 1
            android.os.Message r10 = r10.obtainMessage(r1, r11)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.common.internal.U r11 = r9.g     // Catch:{ all -> 0x0056 }
            com.google.android.gms.internal.common.zzh r11 = r11.f6161f     // Catch:{ all -> 0x0056 }
            com.google.android.gms.common.internal.U r9 = r9.g     // Catch:{ all -> 0x0056 }
            long r1 = r9.f6162i     // Catch:{ all -> 0x0056 }
            r11.sendMessageDelayed(r10, r1)     // Catch:{ all -> 0x0056 }
            z1.b r9 = z1.C1132b.f12799e     // Catch:{ all -> 0x0056 }
        L_0x0052:
            android.os.StrictMode.setVmPolicy(r0)
            goto L_0x0073
        L_0x0056:
            r9 = move-exception
            goto L_0x006c
        L_0x0058:
            r10 = 2
            r9.f6155b = r10     // Catch:{ all -> 0x0056 }
            com.google.android.gms.common.internal.U r10 = r9.g     // Catch:{ IllegalArgumentException -> 0x0064 }
            F1.a r11 = r10.g     // Catch:{ IllegalArgumentException -> 0x0064 }
            android.content.Context r10 = r10.f6160e     // Catch:{ IllegalArgumentException -> 0x0064 }
            r11.c(r10, r9)     // Catch:{ IllegalArgumentException -> 0x0064 }
        L_0x0064:
            z1.b r9 = new z1.b     // Catch:{ all -> 0x0056 }
            r10 = 16
            r9.<init>(r10)     // Catch:{ all -> 0x0056 }
            goto L_0x0052
        L_0x006c:
            android.os.StrictMode.setVmPolicy(r0)
            throw r9
        L_0x0070:
            r9 = move-exception
            z1.b r9 = r9.f6142a
        L_0x0073:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.S.a(com.google.android.gms.common.internal.S, java.lang.String, java.util.concurrent.Executor):z1.b");
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.d) {
            try {
                this.g.f6161f.removeMessages(1, this.f6157e);
                this.d = iBinder;
                this.f6158f = componentName;
                for (ServiceConnection onServiceConnected : this.f6154a.values()) {
                    onServiceConnected.onServiceConnected(componentName, iBinder);
                }
                this.f6155b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.d) {
            try {
                this.g.f6161f.removeMessages(1, this.f6157e);
                this.d = null;
                this.f6158f = componentName;
                for (ServiceConnection onServiceDisconnected : this.f6154a.values()) {
                    onServiceDisconnected.onServiceDisconnected(componentName);
                }
                this.f6155b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
