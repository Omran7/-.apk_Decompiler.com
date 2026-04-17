package com.google.android.recaptcha.internal;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n5.C0877i;

public final class zzge {
    private final Map zza = new LinkedHashMap();
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        ArrayList arrayList = new ArrayList(C0877i.T0(list));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(zza((zzue) it2.next()));
        }
        return arrayList;
    }

    public final Object zza(zzue zzue) {
        int zzS = zzue.zzS();
        int i2 = zzS - 1;
        if (zzS != 0) {
            switch (i2) {
                case 0:
                    return this.zza.get(Integer.valueOf(zzue.zzi()));
                case 1:
                    return Boolean.valueOf(zzue.zzQ());
                case 2:
                    byte[] zzl = zzue.zzM().zzl();
                    if (zzl.length == 1) {
                        return Byte.valueOf(zzl[0]);
                    }
                    throw new zzce(4, 6, (Throwable) null);
                case 3:
                    String zzO = zzue.zzO();
                    if (zzO.length() == 1) {
                        return Character.valueOf(zzO.charAt(0));
                    }
                    throw new zzce(4, 6, (Throwable) null);
                case 4:
                    int zzj = zzue.zzj();
                    if (zzj >= -32768 && zzj <= 32767) {
                        return Short.valueOf((short) zzj);
                    }
                    throw new zzce(4, 6, (Throwable) null);
                case 5:
                    return Integer.valueOf(zzue.zzk());
                case zzaky.zzf.zzf:
                case 8:
                    throw new zzce(4, 6, (Throwable) null);
                case zzaky.zzf.zzg:
                    return Long.valueOf(zzue.zzl());
                case 9:
                    return Float.valueOf(zzue.zzg());
                case 10:
                    return Double.valueOf(zzue.zzf());
                case ModuleDescriptor.MODULE_VERSION:
                    return zzue.zzP();
                case 12:
                    return null;
                default:
                    throw new zzce(4, 5, (Throwable) null);
            }
        } else {
            throw null;
        }
    }

    public final Object zzb(int i2) {
        return this.zza.remove(Integer.valueOf(i2));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i2, Object obj) {
        zze(173, obj);
        this.zzb.add(173);
    }

    public final void zze(int i2, Object obj) {
        this.zza.put(Integer.valueOf(i2), obj);
    }

    public final Class[] zzf(List list) {
        List<Object> zzh = zzh(list);
        ArrayList arrayList = new ArrayList(C0877i.T0(zzh));
        for (Object zza2 : zzh) {
            arrayList.add(zzgc.zza(zza2));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzg(List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
