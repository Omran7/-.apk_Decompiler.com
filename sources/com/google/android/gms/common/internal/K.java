package com.google.android.gms.common.internal;

import android.os.Looper;
import com.google.android.gms.internal.common.zzh;

public final class K extends zzh {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0377f f6143a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K(C0377f fVar, Looper looper) {
        super(looper);
        this.f6143a = fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: type inference failed for: r10v8, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r10) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.f r0 = r9.f6143a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.zzd
            int r0 = r0.get()
            int r1 = r10.arg1
            r2 = 7
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0024
            int r0 = r10.what
            if (r0 == r3) goto L_0x0019
            if (r0 == r4) goto L_0x0019
            if (r0 != r2) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.internal.C r10 = (com.google.android.gms.common.internal.C) r10
            r10.getClass()
            r10.c()
            return
        L_0x0024:
            int r0 = r10.what
            r1 = 4
            r5 = 5
            if (r0 == r4) goto L_0x003a
            if (r0 == r2) goto L_0x003a
            if (r0 != r1) goto L_0x0036
            com.google.android.gms.common.internal.f r0 = r9.f6143a
            boolean r0 = r0.enableLocalFallback()
            if (r0 == 0) goto L_0x003a
        L_0x0036:
            int r0 = r10.what
            if (r0 != r5) goto L_0x0042
        L_0x003a:
            com.google.android.gms.common.internal.f r0 = r9.f6143a
            boolean r0 = r0.isConnecting()
            if (r0 == 0) goto L_0x018b
        L_0x0042:
            int r0 = r10.what
            r6 = 0
            r7 = 8
            r8 = 3
            if (r0 != r1) goto L_0x008a
            com.google.android.gms.common.internal.f r0 = r9.f6143a
            z1.b r1 = new z1.b
            int r10 = r10.arg2
            r1.<init>(r10)
            r0.zzC = r1
            com.google.android.gms.common.internal.f r10 = r9.f6143a
            boolean r10 = com.google.android.gms.common.internal.C0377f.zzo(r10)
            if (r10 == 0) goto L_0x006b
            com.google.android.gms.common.internal.f r10 = r9.f6143a
            boolean r0 = r10.zzD
            if (r0 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            r10.a(r8, (android.os.IInterface) null)
            return
        L_0x006b:
            com.google.android.gms.common.internal.f r10 = r9.f6143a
            z1.b r0 = r10.zzC
            if (r0 == 0) goto L_0x0078
            z1.b r10 = r10.zzC
            goto L_0x007d
        L_0x0078:
            z1.b r10 = new z1.b
            r10.<init>(r7)
        L_0x007d:
            com.google.android.gms.common.internal.f r0 = r9.f6143a
            com.google.android.gms.common.internal.d r0 = r0.zzc
            r0.c(r10)
            com.google.android.gms.common.internal.f r0 = r9.f6143a
            r0.onConnectionFailed(r10)
            return
        L_0x008a:
            if (r0 != r5) goto L_0x00ab
            com.google.android.gms.common.internal.f r10 = r9.f6143a
            z1.b r0 = r10.zzC
            if (r0 == 0) goto L_0x0099
            z1.b r10 = r10.zzC
            goto L_0x009e
        L_0x0099:
            z1.b r10 = new z1.b
            r10.<init>(r7)
        L_0x009e:
            com.google.android.gms.common.internal.f r0 = r9.f6143a
            com.google.android.gms.common.internal.d r0 = r0.zzc
            r0.c(r10)
            com.google.android.gms.common.internal.f r0 = r9.f6143a
            r0.onConnectionFailed(r10)
            return
        L_0x00ab:
            if (r0 != r8) goto L_0x00ca
            java.lang.Object r0 = r10.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00b6
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00b6:
            z1.b r0 = new z1.b
            int r10 = r10.arg2
            r0.<init>(r10, r6)
            com.google.android.gms.common.internal.f r10 = r9.f6143a
            com.google.android.gms.common.internal.d r10 = r10.zzc
            r10.c(r0)
            com.google.android.gms.common.internal.f r10 = r9.f6143a
            r10.onConnectionFailed(r0)
            return
        L_0x00ca:
            r1 = 6
            if (r0 != r1) goto L_0x00f0
            com.google.android.gms.common.internal.f r0 = r9.f6143a
            r0.a(r5, (android.os.IInterface) null)
            com.google.android.gms.common.internal.f r0 = r9.f6143a
            com.google.android.gms.common.internal.b r1 = r0.zzw
            if (r1 == 0) goto L_0x00e3
            com.google.android.gms.common.internal.b r0 = r0.zzw
            int r1 = r10.arg2
            r0.a(r1)
        L_0x00e3:
            com.google.android.gms.common.internal.f r0 = r9.f6143a
            int r10 = r10.arg2
            r0.onConnectionSuspended(r10)
            com.google.android.gms.common.internal.f r10 = r9.f6143a
            com.google.android.gms.common.internal.C0377f.zzn(r10, r5, r4, r6)
            return
        L_0x00f0:
            if (r0 != r3) goto L_0x0106
            com.google.android.gms.common.internal.f r0 = r9.f6143a
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x00fb
            goto L_0x0106
        L_0x00fb:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.internal.C r10 = (com.google.android.gms.common.internal.C) r10
            r10.getClass()
            r10.c()
            return
        L_0x0106:
            int r0 = r10.what
            if (r0 == r3) goto L_0x0120
            if (r0 == r4) goto L_0x0120
            if (r0 != r2) goto L_0x010f
            goto L_0x0120
        L_0x010f:
            java.lang.String r10 = "Don't know how to handle message: "
            java.lang.String r10 = com.google.android.gms.internal.measurement.a.f(r0, r10)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r10, r0)
            return
        L_0x0120:
            java.lang.Object r10 = r10.obj
            r0 = r10
            com.google.android.gms.common.internal.C r0 = (com.google.android.gms.common.internal.C) r0
            java.lang.String r10 = "Callback proxy "
            monitor-enter(r0)
            java.lang.Boolean r1 = r0.f6132a     // Catch:{ all -> 0x0149 }
            boolean r2 = r0.f6133b     // Catch:{ all -> 0x0149 }
            if (r2 == 0) goto L_0x014b
            java.lang.String r2 = "GmsClient"
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x0149 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0149 }
            r5.<init>(r10)     // Catch:{ all -> 0x0149 }
            r5.append(r3)     // Catch:{ all -> 0x0149 }
            java.lang.String r10 = " being reused. This is not safe."
            r5.append(r10)     // Catch:{ all -> 0x0149 }
            java.lang.String r10 = r5.toString()     // Catch:{ all -> 0x0149 }
            android.util.Log.w(r2, r10)     // Catch:{ all -> 0x0149 }
            goto L_0x014b
        L_0x0149:
            r10 = move-exception
            goto L_0x0189
        L_0x014b:
            monitor-exit(r0)     // Catch:{ all -> 0x0149 }
            if (r1 == 0) goto L_0x017e
            com.google.android.gms.common.internal.f r10 = r0.f6136f
            int r1 = r0.d
            if (r1 != 0) goto L_0x0166
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x017e
            r10.a(r4, (android.os.IInterface) null)
            z1.b r10 = new z1.b
            r10.<init>(r7, r6)
            r0.a(r10)
            goto L_0x017e
        L_0x0166:
            r10.a(r4, (android.os.IInterface) null)
            android.os.Bundle r10 = r0.f6135e
            if (r10 == 0) goto L_0x0176
            java.lang.String r2 = "pendingIntent"
            android.os.Parcelable r10 = r10.getParcelable(r2)
            r6 = r10
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x0176:
            z1.b r10 = new z1.b
            r10.<init>(r1, r6)
            r0.a(r10)
        L_0x017e:
            monitor-enter(r0)
            r0.f6133b = r4     // Catch:{ all -> 0x0186 }
            monitor-exit(r0)     // Catch:{ all -> 0x0186 }
            r0.c()
            return
        L_0x0186:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0186 }
            throw r10
        L_0x0189:
            monitor-exit(r0)     // Catch:{ all -> 0x0149 }
            throw r10
        L_0x018b:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.common.internal.C r10 = (com.google.android.gms.common.internal.C) r10
            r10.getClass()
            r10.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.K.handleMessage(android.os.Message):void");
    }
}
