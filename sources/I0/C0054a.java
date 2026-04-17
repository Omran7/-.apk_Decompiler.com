package I0;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;
import z0.i;
import z0.k;

/* renamed from: I0.a  reason: case insensitive filesystem */
public final class C0054a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1100a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1101b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1102c;

    public /* synthetic */ C0054a(Object obj, Object obj2, int i2) {
        this.f1100a = i2;
        this.f1101b = obj;
        this.f1102c = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final B0.D a(java.lang.Object r16, int r17, int r18, z0.i r19) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            int r2 = r1.f1100a
            switch(r2) {
                case 0: goto L_0x00a8;
                case 1: goto L_0x0089;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.io.InputStream r0 = (java.io.InputStream) r0
            boolean r2 = r0 instanceof I0.y
            if (r2 == 0) goto L_0x001a
            I0.y r0 = (I0.y) r0
            r2 = 0
            r8 = r0
            r9 = r2
            goto L_0x0026
        L_0x001a:
            I0.y r2 = new I0.y
            java.lang.Object r3 = r1.f1102c
            C0.g r3 = (C0.g) r3
            r2.<init>(r0, r3)
            r0 = 1
            r9 = r0
            r8 = r2
        L_0x0026:
            java.util.ArrayDeque r10 = U0.f.f3680c
            monitor-enter(r10)
            java.lang.Object r0 = r10.poll()     // Catch:{ all -> 0x0086 }
            U0.f r0 = (U0.f) r0     // Catch:{ all -> 0x0086 }
            monitor-exit(r10)     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x0037
            U0.f r0 = new U0.f
            r0.<init>()
        L_0x0037:
            r11 = r0
            r11.f3681a = r8
            U0.l r0 = new U0.l
            r0.<init>(r11)
            I3.h r7 = new I3.h
            r2 = 10
            r3 = 0
            r7.<init>(r8, r11, r2, r3)
            r12 = 0
            java.lang.Object r2 = r1.f1101b     // Catch:{ all -> 0x0071 }
            I0.q r2 = (I0.q) r2     // Catch:{ all -> 0x0071 }
            B0.h r3 = new B0.h     // Catch:{ all -> 0x0071 }
            java.util.ArrayList r13 = r2.d     // Catch:{ all -> 0x0071 }
            C0.g r14 = r2.f1132c     // Catch:{ all -> 0x0071 }
            r3.<init>((U0.l) r0, (java.util.ArrayList) r13, (C0.g) r14)     // Catch:{ all -> 0x0071 }
            r4 = r17
            r5 = r18
            r6 = r19
            I0.d r0 = r2.a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0071 }
            r11.f3682b = r12
            r11.f3681a = r12
            monitor-enter(r10)
            r10.offer(r11)     // Catch:{ all -> 0x006e }
            monitor-exit(r10)     // Catch:{ all -> 0x006e }
            if (r9 == 0) goto L_0x006d
            r8.d()
        L_0x006d:
            return r0
        L_0x006e:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x006e }
            throw r0
        L_0x0071:
            r0 = move-exception
            r11.f3682b = r12
            r11.f3681a = r12
            java.util.ArrayDeque r2 = U0.f.f3680c
            monitor-enter(r2)
            r2.offer(r11)     // Catch:{ all -> 0x0083 }
            monitor-exit(r2)     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x0082
            r8.d()
        L_0x0082:
            throw r0
        L_0x0083:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0083 }
            throw r0
        L_0x0086:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0086 }
            throw r0
        L_0x0089:
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r2 = r1.f1101b
            K0.d r2 = (K0.d) r2
            B0.D r0 = r2.c(r0, r6)
            if (r0 != 0) goto L_0x0097
            r0 = 0
            goto L_0x00a7
        L_0x0097:
            K0.c r0 = (K0.c) r0
            java.lang.Object r0 = r0.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            java.lang.Object r2 = r1.f1102c
            C0.b r2 = (C0.b) r2
            I0.d r0 = I0.s.a(r2, r0, r4, r5)
        L_0x00a7:
            return r0
        L_0x00a8:
            java.lang.Object r2 = r1.f1101b
            z0.k r2 = (z0.k) r2
            B0.D r0 = r2.a(r0, r4, r5, r6)
            if (r0 != 0) goto L_0x00b4
            r0 = 0
            goto L_0x00be
        L_0x00b4:
            I0.d r2 = new I0.d
            java.lang.Object r3 = r1.f1102c
            android.content.res.Resources r3 = (android.content.res.Resources) r3
            r2.<init>((android.content.res.Resources) r3, (B0.D) r0)
            r0 = r2
        L_0x00be:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.C0054a.a(java.lang.Object, int, int, z0.i):B0.D");
    }

    public final boolean b(Object obj, i iVar) {
        switch (this.f1100a) {
            case 0:
                return ((k) this.f1101b).b(obj, iVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                InputStream inputStream = (InputStream) obj;
                ((q) this.f1101b).getClass();
                return true;
        }
    }

    public C0054a(Resources resources, k kVar) {
        this.f1100a = 0;
        this.f1102c = resources;
        this.f1101b = kVar;
    }
}
