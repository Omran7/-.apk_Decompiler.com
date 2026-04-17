package com.google.android.gms.common.internal;

import F1.a;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.util.HashMap;

public final class U extends C0384m {
    public final HashMap d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Context f6160e;

    /* renamed from: f  reason: collision with root package name */
    public volatile zzh f6161f;
    public final a g;
    public final long h;

    /* renamed from: i  reason: collision with root package name */
    public final long f6162i;

    public U(Context context, Looper looper) {
        T t6 = new T(this);
        this.f6160e = context.getApplicationContext();
        this.f6161f = new zzh(looper, t6);
        this.g = a.b();
        this.h = 5000;
        this.f6162i = 300000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final z1.C1132b b(com.google.android.gms.common.internal.Q r7, com.google.android.gms.common.internal.M r8, java.lang.String r9, java.util.concurrent.Executor r10) {
        /*
            r6 = this;
            java.lang.String r0 = "Trying to bind a GmsServiceConnection that was already connected before.  config="
            java.util.HashMap r1 = r6.d
            monitor-enter(r1)
            java.util.HashMap r2 = r6.d     // Catch:{ all -> 0x0027 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0027 }
            com.google.android.gms.common.internal.S r2 = (com.google.android.gms.common.internal.S) r2     // Catch:{ all -> 0x0027 }
            r3 = 0
            if (r10 != 0) goto L_0x0011
            r10 = r3
        L_0x0011:
            if (r2 != 0) goto L_0x0029
            com.google.android.gms.common.internal.S r2 = new com.google.android.gms.common.internal.S     // Catch:{ all -> 0x0027 }
            r2.<init>(r6, r7)     // Catch:{ all -> 0x0027 }
            java.util.HashMap r0 = r2.f6154a     // Catch:{ all -> 0x0027 }
            r0.put(r8, r8)     // Catch:{ all -> 0x0027 }
            z1.b r3 = com.google.android.gms.common.internal.S.a(r2, r9, r10)     // Catch:{ all -> 0x0027 }
            java.util.HashMap r8 = r6.d     // Catch:{ all -> 0x0027 }
            r8.put(r7, r2)     // Catch:{ all -> 0x0027 }
            goto L_0x0051
        L_0x0027:
            r7 = move-exception
            goto L_0x0071
        L_0x0029:
            com.google.android.gms.internal.common.zzh r4 = r6.f6161f     // Catch:{ all -> 0x0027 }
            r5 = 0
            r4.removeMessages(r5, r7)     // Catch:{ all -> 0x0027 }
            java.util.HashMap r4 = r2.f6154a     // Catch:{ all -> 0x0027 }
            boolean r4 = r4.containsKey(r8)     // Catch:{ all -> 0x0027 }
            if (r4 != 0) goto L_0x0063
            java.util.HashMap r7 = r2.f6154a     // Catch:{ all -> 0x0027 }
            r7.put(r8, r8)     // Catch:{ all -> 0x0027 }
            int r7 = r2.f6155b     // Catch:{ all -> 0x0027 }
            r0 = 1
            if (r7 == r0) goto L_0x004a
            r8 = 2
            if (r7 == r8) goto L_0x0045
            goto L_0x0051
        L_0x0045:
            z1.b r3 = com.google.android.gms.common.internal.S.a(r2, r9, r10)     // Catch:{ all -> 0x0027 }
            goto L_0x0051
        L_0x004a:
            android.content.ComponentName r7 = r2.f6158f     // Catch:{ all -> 0x0027 }
            android.os.IBinder r9 = r2.d     // Catch:{ all -> 0x0027 }
            r8.onServiceConnected(r7, r9)     // Catch:{ all -> 0x0027 }
        L_0x0051:
            boolean r7 = r2.f6156c     // Catch:{ all -> 0x0027 }
            if (r7 == 0) goto L_0x0059
            z1.b r7 = z1.C1132b.f12799e     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return r7
        L_0x0059:
            if (r3 != 0) goto L_0x0061
            z1.b r3 = new z1.b     // Catch:{ all -> 0x0027 }
            r7 = -1
            r3.<init>(r7)     // Catch:{ all -> 0x0027 }
        L_0x0061:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return r3
        L_0x0063:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0027 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0027 }
            java.lang.String r7 = r0.concat(r7)     // Catch:{ all -> 0x0027 }
            r8.<init>(r7)     // Catch:{ all -> 0x0027 }
            throw r8     // Catch:{ all -> 0x0027 }
        L_0x0071:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.U.b(com.google.android.gms.common.internal.Q, com.google.android.gms.common.internal.M, java.lang.String, java.util.concurrent.Executor):z1.b");
    }
}
