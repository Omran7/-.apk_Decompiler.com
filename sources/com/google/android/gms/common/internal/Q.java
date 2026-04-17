package com.google.android.gms.common.internal;

import android.net.Uri;
import java.util.Arrays;

public final class Q {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f6151a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6152b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6153c;

    public Q(String str, String str2, boolean z3) {
        I.d(str);
        this.f6151a = str;
        I.d(str2);
        this.f6152b = str2;
        this.f6153c = z3;
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089 A[PHI: r1 
      PHI: (r1v3 android.content.Intent) = (r1v0 android.content.Intent), (r1v5 android.content.Intent), (r1v5 android.content.Intent) binds: [B:26:0x004e, B:28:0x0059, B:30:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent a(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            r1 = 0
            java.lang.String r2 = r5.f6151a
            if (r2 == 0) goto L_0x00a2
            boolean r3 = r5.f6153c
            if (r3 == 0) goto L_0x0094
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "serviceActionBundleKey"
            r3.putString(r4, r2)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ RemoteException -> 0x0036, IllegalArgumentException -> 0x0034 }
            android.net.Uri r4 = d     // Catch:{ RemoteException -> 0x0036, IllegalArgumentException -> 0x0034 }
            android.content.ContentProviderClient r6 = r6.acquireUnstableContentProviderClient(r4)     // Catch:{ RemoteException -> 0x0036, IllegalArgumentException -> 0x0034 }
            if (r6 == 0) goto L_0x0038
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r3 = r6.call(r4, r1, r3)     // Catch:{ all -> 0x002f }
            r6.release()     // Catch:{ RemoteException -> 0x002d, IllegalArgumentException -> 0x002b }
            goto L_0x004e
        L_0x002b:
            r6 = move-exception
            goto L_0x0041
        L_0x002d:
            r6 = move-exception
            goto L_0x0041
        L_0x002f:
            r3 = move-exception
            r6.release()     // Catch:{ RemoteException -> 0x0036, IllegalArgumentException -> 0x0034 }
            throw r3     // Catch:{ RemoteException -> 0x0036, IllegalArgumentException -> 0x0034 }
        L_0x0034:
            r6 = move-exception
            goto L_0x0040
        L_0x0036:
            r6 = move-exception
            goto L_0x0040
        L_0x0038:
            android.os.RemoteException r6 = new android.os.RemoteException     // Catch:{ RemoteException -> 0x0036, IllegalArgumentException -> 0x0034 }
            java.lang.String r3 = "Failed to acquire ContentProviderClient"
            r6.<init>(r3)     // Catch:{ RemoteException -> 0x0036, IllegalArgumentException -> 0x0034 }
            throw r6     // Catch:{ RemoteException -> 0x0036, IllegalArgumentException -> 0x0034 }
        L_0x0040:
            r3 = r1
        L_0x0041:
            java.lang.String r4 = "Dynamic intent resolution failed: "
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r4.concat(r6)
            android.util.Log.w(r0, r6)
        L_0x004e:
            if (r3 == 0) goto L_0x0089
            java.lang.String r6 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r3.getParcelable(r6)
            r1 = r6
            android.content.Intent r1 = (android.content.Intent) r1
            if (r1 != 0) goto L_0x0089
            java.lang.String r6 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r6 = r3.getParcelable(r6)
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            if (r6 != 0) goto L_0x0066
            goto L_0x0089
        L_0x0066:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Dynamic lookup for intent failed for action "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = " but has possible resolution"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r0, r1)
            com.google.android.gms.common.internal.J r0 = new com.google.android.gms.common.internal.J
            z1.b r1 = new z1.b
            r2 = 25
            r1.<init>(r2, r6)
            r0.<init>(r1)
            throw r0
        L_0x0089:
            if (r1 != 0) goto L_0x0094
            java.lang.String r6 = "Dynamic lookup for intent failed for action: "
            java.lang.String r6 = r6.concat(r2)
            android.util.Log.w(r0, r6)
        L_0x0094:
            if (r1 != 0) goto L_0x00ab
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r2)
            java.lang.String r0 = r5.f6152b
            android.content.Intent r6 = r6.setPackage(r0)
            return r6
        L_0x00a2:
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.Intent r1 = r6.setComponent(r1)
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.Q.a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q6 = (Q) obj;
        if (!I.j(this.f6151a, q6.f6151a) || !I.j(this.f6152b, q6.f6152b) || !I.j((Object) null, (Object) null) || this.f6153c != q6.f6153c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6151a, this.f6152b, null, 4225, Boolean.valueOf(this.f6153c)});
    }

    public final String toString() {
        String str = this.f6151a;
        if (str != null) {
            return str;
        }
        I.g((Object) null);
        throw null;
    }
}
