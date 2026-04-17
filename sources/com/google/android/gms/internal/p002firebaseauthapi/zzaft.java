package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import e3.u;
import java.util.Map;
import java.util.concurrent.Executor;
import n.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaft  reason: invalid package */
public final class zzaft {
    private static final Map<String, zzafv> zza = new j(0);

    public static u zza(String str, u uVar, zzaex zzaex) {
        zza(str, zzaex);
        return new zzafs(uVar, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaex zzaex) {
        zza.put(str, new zzafv(zzaex, System.currentTimeMillis()));
    }

    public static boolean zza(String str, u uVar, Activity activity, Executor executor) {
        Map<String, zzafv> map = zza;
        if (map.containsKey(str)) {
            zzafv zzafv = map.get(str);
            if (System.currentTimeMillis() - zzafv.zzb < 120000) {
                zzaex zzaex = zzafv.zza;
                if (zzaex == null) {
                    return true;
                }
                zzaex.zza(uVar, activity, executor, str);
                return true;
            }
            zza(str, (zzaex) null);
            return false;
        }
        zza(str, (zzaex) null);
        return false;
    }
}
