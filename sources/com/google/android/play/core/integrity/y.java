package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import y2.z;

abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private final z f6737a = new z("IntegrityDialogWrapper");

    /* renamed from: b  reason: collision with root package name */
    private final String f6738b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6739c;
    private final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f6740e;

    public y(String str, long j6) {
        this.f6738b = str;
        this.f6739c = j6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = r8.f6737a;
        r3 = new java.lang.Object[]{java.lang.Integer.valueOf(r10)};
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (android.util.Log.isLoggable("PlayCore", 3) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        android.util.Log.d("PlayCore", y2.z.c(r0.f12710a, "checkAndShowDialog(%s)", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        r0 = new android.os.Bundle();
        r0.putInt("dialog.intent.type", r10);
        r0.putString("package.name", r8.f6738b);
        r0.putInt("playcore.integrity.version.major", 1);
        r0.putInt("playcore.integrity.version.minor", 3);
        r0.putInt("playcore.integrity.version.patch", 0);
        r0.putLong("request.token.sid", r8.f6739c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        return b(r9, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task a(android.app.Activity r9, int r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            monitor-enter(r0)
            boolean r1 = r8.f6740e     // Catch:{ all -> 0x0012 }
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0012 }
            com.google.android.gms.tasks.Task r9 = com.google.android.gms.tasks.Tasks.forResult(r9)     // Catch:{ all -> 0x0012 }
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r9
        L_0x0012:
            r9 = move-exception
            goto L_0x0065
        L_0x0014:
            r1 = 1
            r8.f6740e = r1     // Catch:{ all -> 0x0012 }
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            y2.z r0 = r8.f6737a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "checkAndShowDialog(%s)"
            r0.getClass()
            java.lang.String r5 = "PlayCore"
            r6 = 3
            boolean r7 = android.util.Log.isLoggable(r5, r6)
            if (r7 == 0) goto L_0x0039
            java.lang.String r0 = r0.f12710a
            java.lang.String r0 = y2.z.c(r0, r4, r3)
            android.util.Log.d(r5, r0)
        L_0x0039:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r3 = "dialog.intent.type"
            r0.putInt(r3, r10)
            java.lang.String r10 = r8.f6738b
            java.lang.String r3 = "package.name"
            r0.putString(r3, r10)
            java.lang.String r10 = "playcore.integrity.version.major"
            r0.putInt(r10, r1)
            java.lang.String r10 = "playcore.integrity.version.minor"
            r0.putInt(r10, r6)
            java.lang.String r10 = "playcore.integrity.version.patch"
            r0.putInt(r10, r2)
            long r1 = r8.f6739c
            java.lang.String r10 = "request.token.sid"
            r0.putLong(r10, r1)
            com.google.android.gms.tasks.Task r9 = r8.b(r9, r0)
            return r9
        L_0x0065:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.y.a(android.app.Activity, int):com.google.android.gms.tasks.Task");
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
