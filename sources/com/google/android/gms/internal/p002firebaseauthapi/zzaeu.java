package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.util.List;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeu  reason: invalid package */
public final class zzaeu {
    private final int zza;

    private zzaeu(String str) {
        this.zza = zza(str);
    }

    private static int zza(String str) {
        try {
            List<String> zza2 = zzv.zza("[.-]").zza((CharSequence) str);
            if (zza2.size() == 1) {
                return Integer.parseInt(str);
            }
            if (zza2.size() < 3) {
                return -1;
            }
            return (Integer.parseInt(zza2.get(1)) * 1000) + (Integer.parseInt(zza2.get(0)) * 1000000) + Integer.parseInt(zza2.get(2));
        } catch (IllegalArgumentException e6) {
            if (!Log.isLoggable("LibraryVersionContainer", 3)) {
                return -1;
            }
            Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e6}));
            return -1;
        }
    }

    public final String zzb() {
        return d.i("X", Integer.toString(this.zza));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090 A[Catch:{ all -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0 A[SYNTHETIC, Splitter:B:40:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d6 A[SYNTHETIC, Splitter:B:61:0x00d6] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.p002firebaseauthapi.zzaeu zza() {
        /*
            java.lang.String r0 = "Failed to get app version for libraryName: firebase-auth"
            java.lang.String r1 = "firebase-auth version is "
            com.google.android.gms.internal.firebase-auth-api.zzaeu r2 = new com.google.android.gms.internal.firebase-auth-api.zzaeu
            com.google.android.gms.common.internal.r r3 = com.google.android.gms.common.internal.r.f6204c
            r3.getClass()
            java.lang.String r4 = "LibraryVersion"
            com.google.android.gms.common.internal.n r5 = com.google.android.gms.common.internal.r.f6203b
            java.lang.String r6 = "firebase-auth"
            java.lang.String r7 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.I.e(r6, r7)
            java.util.concurrent.ConcurrentHashMap r3 = r3.f6205a
            boolean r7 = r3.containsKey(r6)
            java.lang.String r8 = "UNKNOWN"
            if (r7 == 0) goto L_0x0028
            java.lang.Object r0 = r3.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00c2
        L_0x0028:
            java.util.Properties r7 = new java.util.Properties
            r7.<init>()
            r9 = 0
            java.lang.String r10 = "/firebase-auth.properties"
            java.lang.Class<com.google.android.gms.common.internal.r> r11 = com.google.android.gms.common.internal.r.class
            java.io.InputStream r10 = r11.getResourceAsStream(r10)     // Catch:{ IOException -> 0x0082 }
            if (r10 == 0) goto L_0x0069
            r7.load(r10)     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            java.lang.String r11 = "version"
            java.lang.String r9 = r7.getProperty(r11, r9)     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            r7.append(r9)     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            java.lang.String r1 = r7.toString()     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            java.lang.String r7 = r5.f6201a     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            r11 = 2
            boolean r7 = android.util.Log.isLoggable(r7, r11)     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            if (r7 == 0) goto L_0x009e
            java.lang.String r7 = r5.f6202b     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            if (r7 != 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            java.lang.String r1 = r7.concat(r1)     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
        L_0x005f:
            android.util.Log.v(r4, r1)     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            goto L_0x009e
        L_0x0063:
            r0 = move-exception
            goto L_0x0080
        L_0x0065:
            r1 = move-exception
            r7 = r9
            r9 = r10
            goto L_0x0087
        L_0x0069:
            java.lang.String r1 = r5.f6201a     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            r7 = 5
            boolean r1 = android.util.Log.isLoggable(r1, r7)     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            if (r1 == 0) goto L_0x009e
            java.lang.String r1 = r5.f6202b     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            if (r1 != 0) goto L_0x0078
            r1 = r0
            goto L_0x007c
        L_0x0078:
            java.lang.String r1 = r1.concat(r0)     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
        L_0x007c:
            android.util.Log.w(r4, r1)     // Catch:{ IOException -> 0x0065, all -> 0x0063 }
            goto L_0x009e
        L_0x0080:
            r9 = r10
            goto L_0x00d4
        L_0x0082:
            r1 = move-exception
            goto L_0x0086
        L_0x0084:
            r0 = move-exception
            goto L_0x00d4
        L_0x0086:
            r7 = r9
        L_0x0087:
            java.lang.String r10 = r5.f6201a     // Catch:{ all -> 0x0084 }
            r11 = 6
            boolean r10 = android.util.Log.isLoggable(r10, r11)     // Catch:{ all -> 0x0084 }
            if (r10 == 0) goto L_0x009c
            java.lang.String r10 = r5.f6202b     // Catch:{ all -> 0x0084 }
            if (r10 != 0) goto L_0x0095
            goto L_0x0099
        L_0x0095:
            java.lang.String r0 = r10.concat(r0)     // Catch:{ all -> 0x0084 }
        L_0x0099:
            android.util.Log.e(r4, r0, r1)     // Catch:{ all -> 0x0084 }
        L_0x009c:
            r10 = r9
            r9 = r7
        L_0x009e:
            if (r10 == 0) goto L_0x00a3
            r10.close()     // Catch:{ IOException -> 0x00a3 }
        L_0x00a3:
            if (r9 != 0) goto L_0x00be
            java.lang.String r0 = r5.f6201a
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            java.lang.String r1 = r5.f6202b
            if (r1 != 0) goto L_0x00b5
            goto L_0x00b9
        L_0x00b5:
            java.lang.String r0 = r1.concat(r0)
        L_0x00b9:
            android.util.Log.d(r4, r0)
        L_0x00bc:
            r0 = r8
            goto L_0x00bf
        L_0x00be:
            r0 = r9
        L_0x00bf:
            r3.put(r6, r0)
        L_0x00c2:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00ce
            boolean r1 = r0.equals(r8)
            if (r1 == 0) goto L_0x00d0
        L_0x00ce:
            java.lang.String r0 = "-1"
        L_0x00d0:
            r2.<init>(r0)
            return r2
        L_0x00d4:
            if (r9 == 0) goto L_0x00d9
            r9.close()     // Catch:{ IOException -> 0x00d9 }
        L_0x00d9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaeu.zza():com.google.android.gms.internal.firebase-auth-api.zzaeu");
    }
}
