package com.google.android.gms.internal.p002firebaseauthapi;

import R2.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n.j;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagd  reason: invalid package */
public final class zzagd {
    private static final Map<String, zzagc> zza = new j(0);
    private static final Map<String, List<WeakReference<zzagf>>> zzb = new j(0);

    private static String zza(String str, int i2, boolean z3) {
        if (z3) {
            return "http://[" + str + "]:" + i2 + "/";
        }
        return "http://" + str + ":" + i2 + "/";
    }

    public static String zzb(String str) {
        zzagc zzagc;
        String str2;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagc = map.get(str);
        }
        if (zzagc != null) {
            str2 = d.i("", zza(zzagc.zzb(), zzagc.zza(), zzagc.zzb().contains(":")));
        } else {
            str2 = "https://";
        }
        return d.f(str2, "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzagc zzagc;
        String str2;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagc = map.get(str);
        }
        if (zzagc != null) {
            str2 = d.i("", zza(zzagc.zzb(), zzagc.zza(), zzagc.zzb().contains(":")));
        } else {
            str2 = "https://";
        }
        return d.f(str2, "identitytoolkit.googleapis.com/v2");
    }

    public static String zzd(String str) {
        zzagc zzagc;
        String str2;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagc = map.get(str);
        }
        if (zzagc != null) {
            str2 = d.i("", zza(zzagc.zzb(), zzagc.zza(), zzagc.zzb().contains(":")));
        } else {
            str2 = "https://";
        }
        return d.f(str2, "securetoken.googleapis.com/v1");
    }

    public static String zza(String str) {
        zzagc zzagc;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            zzagc = map.get(str);
        }
        if (zzagc != null) {
            return d.f(zza(zzagc.zzb(), zzagc.zza(), zzagc.zzb().contains(":")), "emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static void zza(String str, zzagf zzagf) {
        Map<String, List<WeakReference<zzagf>>> map = zzb;
        synchronized (map) {
            try {
                if (map.containsKey(str)) {
                    map.get(str).add(new WeakReference(zzagf));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new WeakReference(zzagf));
                    map.put(str, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zza(i iVar) {
        Map<String, zzagc> map = zza;
        iVar.b();
        return map.containsKey(iVar.f2492c.f2500a);
    }

    public static void zza(i iVar, String str, int i2) {
        iVar.b();
        String str2 = iVar.f2492c.f2500a;
        Map<String, zzagc> map = zza;
        synchronized (map) {
            map.put(str2, new zzagc(str, i2));
        }
        Map<String, List<WeakReference<zzagf>>> map2 = zzb;
        synchronized (map2) {
            try {
                if (map2.containsKey(str2)) {
                    boolean z3 = false;
                    for (WeakReference weakReference : map2.get(str2)) {
                        zzagf zzagf = (zzagf) weakReference.get();
                        if (zzagf != null) {
                            zzagf.zza();
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        zza.remove(str2);
                    }
                }
            } finally {
            }
        }
    }
}
