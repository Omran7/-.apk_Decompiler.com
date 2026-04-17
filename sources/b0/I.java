package B0;

import F0.r;
import I3.h;
import android.util.Log;
import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.util.ArrayList;
import z0.C1130f;

public final class I implements j, C0010i {

    /* renamed from: a  reason: collision with root package name */
    public final k f202a;

    /* renamed from: b  reason: collision with root package name */
    public final n f203b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f204c;
    public volatile C0007f d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f205e;

    /* renamed from: f  reason: collision with root package name */
    public volatile r f206f;

    /* renamed from: p  reason: collision with root package name */
    public volatile C0008g f207p;

    public I(k kVar, n nVar) {
        this.f202a = kVar;
        this.f203b = nVar;
    }

    public final void a(C1130f fVar, Object obj, e eVar, int i2, C1130f fVar2) {
        this.f203b.a(fVar, obj, eVar, this.f206f.f706c.e(), fVar);
    }

    public final boolean b() {
        if (this.f205e != null) {
            Object obj = this.f205e;
            this.f205e = null;
            try {
                if (!c(obj)) {
                    return true;
                }
            } catch (IOException e6) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e6);
                }
            }
        }
        if (this.d != null && this.d.b()) {
            return true;
        }
        this.d = null;
        this.f206f = null;
        boolean z3 = false;
        while (!z3 && this.f204c < this.f202a.b().size()) {
            ArrayList b6 = this.f202a.b();
            int i2 = this.f204c;
            this.f204c = i2 + 1;
            this.f206f = (r) b6.get(i2);
            if (this.f206f != null && (this.f202a.f242p.a(this.f206f.f706c.e()) || this.f202a.c(this.f206f.f706c.b()) != null)) {
                this.f206f.f706c.f(this.f202a.f241o, new h((Object) this, (Object) this.f206f, 2));
                z3 = true;
            }
        }
        return z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            java.lang.String r1 = "SourceGenerator"
            java.lang.String r2 = "Attempt to write: "
            java.lang.String r3 = "Finished encoding source to cache, key: "
            int r4 = U0.i.f3686b
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            B0.k r6 = r13.f202a     // Catch:{ all -> 0x0075 }
            com.bumptech.glide.e r6 = r6.f232c     // Catch:{ all -> 0x0075 }
            com.bumptech.glide.h r6 = r6.a()     // Catch:{ all -> 0x0075 }
            com.bumptech.glide.load.data.g r6 = r6.g(r14)     // Catch:{ all -> 0x0075 }
            java.lang.Object r7 = r6.d()     // Catch:{ all -> 0x0075 }
            B0.k r8 = r13.f202a     // Catch:{ all -> 0x0075 }
            z0.b r8 = r8.d(r7)     // Catch:{ all -> 0x0075 }
            B0.h r9 = new B0.h     // Catch:{ all -> 0x0075 }
            B0.k r10 = r13.f202a     // Catch:{ all -> 0x0075 }
            z0.i r10 = r10.f235i     // Catch:{ all -> 0x0075 }
            r9.<init>((java.lang.Object) r8, (java.lang.Object) r7, (java.lang.Object) r10, (int) r0)     // Catch:{ all -> 0x0075 }
            B0.g r7 = new B0.g     // Catch:{ all -> 0x0075 }
            F0.r r10 = r13.f206f     // Catch:{ all -> 0x0075 }
            z0.f r10 = r10.f704a     // Catch:{ all -> 0x0075 }
            B0.k r11 = r13.f202a     // Catch:{ all -> 0x0075 }
            z0.f r12 = r11.f240n     // Catch:{ all -> 0x0075 }
            r7.<init>(r10, r12)     // Catch:{ all -> 0x0075 }
            z1.j r10 = r11.h     // Catch:{ all -> 0x0075 }
            D0.a r10 = r10.a()     // Catch:{ all -> 0x0075 }
            r10.i(r7, r9)     // Catch:{ all -> 0x0075 }
            r9 = 2
            boolean r9 = android.util.Log.isLoggable(r1, r9)     // Catch:{ all -> 0x0075 }
            java.lang.String r11 = ", data: "
            if (r9 == 0) goto L_0x0077
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r9.<init>(r3)     // Catch:{ all -> 0x0075 }
            r9.append(r7)     // Catch:{ all -> 0x0075 }
            r9.append(r11)     // Catch:{ all -> 0x0075 }
            r9.append(r14)     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = ", encoder: "
            r9.append(r3)     // Catch:{ all -> 0x0075 }
            r9.append(r8)     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = ", duration: "
            r9.append(r3)     // Catch:{ all -> 0x0075 }
            double r3 = U0.i.a(r4)     // Catch:{ all -> 0x0075 }
            r9.append(r3)     // Catch:{ all -> 0x0075 }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x0075 }
            android.util.Log.v(r1, r3)     // Catch:{ all -> 0x0075 }
            goto L_0x0077
        L_0x0075:
            r14 = move-exception
            goto L_0x00dd
        L_0x0077:
            java.io.File r3 = r10.a(r7)     // Catch:{ all -> 0x0075 }
            r4 = 1
            if (r3 == 0) goto L_0x0099
            r13.f207p = r7     // Catch:{ all -> 0x0075 }
            B0.f r14 = new B0.f     // Catch:{ all -> 0x0075 }
            F0.r r1 = r13.f206f     // Catch:{ all -> 0x0075 }
            z0.f r1 = r1.f704a     // Catch:{ all -> 0x0075 }
            java.util.List r1 = java.util.Collections.singletonList(r1)     // Catch:{ all -> 0x0075 }
            B0.k r2 = r13.f202a     // Catch:{ all -> 0x0075 }
            r14.<init>(r1, r2, r13)     // Catch:{ all -> 0x0075 }
            r13.d = r14     // Catch:{ all -> 0x0075 }
            F0.r r14 = r13.f206f
            com.bumptech.glide.load.data.e r14 = r14.f706c
            r14.c()
            return r4
        L_0x0099:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r1, r3)     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x00bc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r3.<init>(r2)     // Catch:{ all -> 0x0075 }
            B0.g r2 = r13.f207p     // Catch:{ all -> 0x0075 }
            r3.append(r2)     // Catch:{ all -> 0x0075 }
            r3.append(r11)     // Catch:{ all -> 0x0075 }
            r3.append(r14)     // Catch:{ all -> 0x0075 }
            java.lang.String r14 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r3.append(r14)     // Catch:{ all -> 0x0075 }
            java.lang.String r14 = r3.toString()     // Catch:{ all -> 0x0075 }
            android.util.Log.d(r1, r14)     // Catch:{ all -> 0x0075 }
        L_0x00bc:
            B0.n r5 = r13.f203b     // Catch:{ all -> 0x00db }
            F0.r r14 = r13.f206f     // Catch:{ all -> 0x00db }
            z0.f r14 = r14.f704a     // Catch:{ all -> 0x00db }
            java.lang.Object r7 = r6.d()     // Catch:{ all -> 0x00db }
            F0.r r1 = r13.f206f     // Catch:{ all -> 0x00db }
            com.bumptech.glide.load.data.e r8 = r1.f706c     // Catch:{ all -> 0x00db }
            F0.r r1 = r13.f206f     // Catch:{ all -> 0x00db }
            com.bumptech.glide.load.data.e r1 = r1.f706c     // Catch:{ all -> 0x00db }
            int r9 = r1.e()     // Catch:{ all -> 0x00db }
            F0.r r1 = r13.f206f     // Catch:{ all -> 0x00db }
            z0.f r10 = r1.f704a     // Catch:{ all -> 0x00db }
            r6 = r14
            r5.a(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00db }
            return r0
        L_0x00db:
            r14 = move-exception
            r0 = r4
        L_0x00dd:
            if (r0 != 0) goto L_0x00e6
            F0.r r0 = r13.f206f
            com.bumptech.glide.load.data.e r0 = r0.f706c
            r0.c()
        L_0x00e6:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.I.c(java.lang.Object):boolean");
    }

    public final void cancel() {
        r rVar = this.f206f;
        if (rVar != null) {
            rVar.f706c.cancel();
        }
    }

    public final void e(C1130f fVar, Exception exc, e eVar, int i2) {
        this.f203b.e(fVar, exc, eVar, this.f206f.f706c.e());
    }
}
