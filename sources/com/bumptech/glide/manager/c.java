package com.bumptech.glide.manager;

import android.content.Context;
import com.bumptech.glide.k;
import java.util.HashSet;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5827a;

    /* renamed from: b  reason: collision with root package name */
    public final k f5828b;

    public c(Context context, k kVar) {
        this.f5827a = context.getApplicationContext();
        this.f5828b = kVar;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 117 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            android.content.Context r0 = r3.f5827a
            com.bumptech.glide.manager.o r0 = com.bumptech.glide.manager.o.b(r0)
            com.bumptech.glide.k r1 = r3.f5828b
            monitor-enter(r0)
            java.lang.Object r2 = r0.d     // Catch:{ all -> 0x003b }
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch:{ all -> 0x003b }
            r2.remove(r1)     // Catch:{ all -> 0x003b }
            boolean r1 = r0.f5843b     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r0.d     // Catch:{ all -> 0x003b }
            java.util.HashSet r1 = (java.util.HashSet) r1     // Catch:{ all -> 0x003b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x003b }
            if (r1 != 0) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            java.lang.Object r1 = r0.f5844c     // Catch:{ all -> 0x003b }
            S3.r r1 = (S3.r) r1     // Catch:{ all -> 0x003b }
            java.lang.Object r2 = r1.f2695c     // Catch:{ all -> 0x003b }
            z1.j r2 = (z1.j) r2     // Catch:{ all -> 0x003b }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x003b }
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2     // Catch:{ all -> 0x003b }
            java.lang.Object r1 = r1.d     // Catch:{ all -> 0x003b }
            com.bumptech.glide.manager.n r1 = (com.bumptech.glide.manager.n) r1     // Catch:{ all -> 0x003b }
            r2.unregisterNetworkCallback(r1)     // Catch:{ all -> 0x003b }
            r1 = 0
            r0.f5843b = r1     // Catch:{ all -> 0x003b }
        L_0x0037:
            monitor-exit(r0)
            return
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r1
        L_0x003b:
            r1 = move-exception
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.c.c():void");
    }

    public final void j() {
        o b6 = o.b(this.f5827a);
        k kVar = this.f5828b;
        synchronized (b6) {
            ((HashSet) b6.d).add(kVar);
            b6.c();
        }
    }

    public final void k() {
    }
}
