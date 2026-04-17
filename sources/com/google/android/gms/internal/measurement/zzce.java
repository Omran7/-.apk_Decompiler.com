package com.google.android.gms.internal.measurement;

import A2.p;
import A2.q;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class zzce implements SharedPreferences.Editor {
    boolean zza = false;
    final Set zzb = new HashSet();
    final Map zzc = new HashMap();
    final /* synthetic */ zzcg zzd;

    public /* synthetic */ zzce(zzcg zzcg, zzcf zzcf) {
        this.zzd = zzcg;
    }

    private final void zza(String str, Object obj) {
        if (obj != null) {
            this.zzc.put(str, obj);
        } else {
            remove(str);
        }
    }

    public final void apply() {
        commit();
    }

    public final SharedPreferences.Editor clear() {
        this.zza = true;
        return this;
    }

    public final boolean commit() {
        if (this.zza) {
            this.zzd.zza.clear();
        }
        zzcg zzcg = this.zzd;
        Set keySet = zzcg.zza.keySet();
        Set set = this.zzb;
        keySet.removeAll(set);
        Map map = this.zzc;
        for (Map.Entry entry : map.entrySet()) {
            zzcg.zza.put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : zzcg.zzb) {
            Set keySet2 = map.keySet();
            if (set == null) {
                throw new NullPointerException("set1");
            } else if (keySet2 != null) {
                p pVar = new p(new q(set, keySet2));
                while (pVar.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(zzcg, (String) pVar.next());
                }
            } else {
                throw new NullPointerException("set2");
            }
        }
        if (this.zza || !set.isEmpty() || !map.isEmpty()) {
            return true;
        }
        return false;
    }

    public final SharedPreferences.Editor putBoolean(String str, boolean z3) {
        zza(str, Boolean.valueOf(z3));
        return this;
    }

    public final SharedPreferences.Editor putFloat(String str, float f6) {
        zza(str, Float.valueOf(f6));
        return this;
    }

    public final SharedPreferences.Editor putInt(String str, int i2) {
        zza(str, Integer.valueOf(i2));
        return this;
    }

    public final SharedPreferences.Editor putLong(String str, long j6) {
        zza(str, Long.valueOf(j6));
        return this;
    }

    public final SharedPreferences.Editor putString(String str, String str2) {
        zza(str, str2);
        return this;
    }

    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        zza(str, set);
        return this;
    }

    public final SharedPreferences.Editor remove(String str) {
        this.zzb.add(str);
        return this;
    }
}
