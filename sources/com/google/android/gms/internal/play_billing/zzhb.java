package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzhb {
    private static final zzhb zzb = new zzhb(true);
    final zzjf zza = new zzja();
    private boolean zzc;
    private boolean zzd;

    private zzhb() {
    }

    public static int zza(zzju zzju, int i2, Object obj) {
        zzgr.zzz(i2 << 3);
        if (zzju.GROUP == null) {
            byte[] bArr = zzhp.zzb;
            if (((zzim) obj) instanceof zzfw) {
                throw null;
            }
        }
        zzjv zzjv = zzjv.INT;
        throw null;
    }

    public static int zzb(zzha zzha, Object obj) {
        zzju zzb2 = zzha.zzb();
        int zza2 = zzha.zza();
        if (!zzha.zze()) {
            return zza(zzb2, zza2, obj);
        }
        List list = (List) obj;
        int size = list.size();
        if (!zzha.zzd()) {
            int i2 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                i2 += zza(zzb2, zza2, list.get(i5));
            }
            return i2;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            if (size <= 0) {
                return zzgr.zzz(0) + zzgr.zzz(zza2 << 3);
            }
            list.get(0);
            zzju zzju = zzju.DOUBLE;
            zzjv zzjv = zzjv.INT;
            throw null;
        }
    }

    public static zzhb zzd() {
        return zzb;
    }

    private static boolean zzi(Map.Entry entry) {
        zzha zzha = (zzha) entry.getKey();
        if (zzha.zzc() != zzjv.MESSAGE) {
            return true;
        }
        if (!zzha.zze()) {
            return zzj(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!zzj(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzj(Object obj) {
        if (obj instanceof zzin) {
            return ((zzin) obj).zzl();
        }
        if (obj instanceof zzhw) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzk(Map.Entry entry) {
        int i2;
        int zzz;
        int u6;
        zzha zzha = (zzha) entry.getKey();
        Object value = entry.getValue();
        if (zzha.zzc() != zzjv.MESSAGE || zzha.zze() || zzha.zzd()) {
            return zzb(zzha, value);
        }
        if (value instanceof zzhw) {
            int zza2 = ((zzha) entry.getKey()).zza();
            int zzz2 = zzgr.zzz(8);
            i2 = zzz2 + zzz2;
            zzz = zzgr.zzz(zza2) + zzgr.zzz(16);
            int zzz3 = zzgr.zzz(24);
            int zza3 = ((zzhw) value).zza();
            u6 = a.u(zza3, zza3, zzz3);
        } else {
            int zza4 = ((zzha) entry.getKey()).zza();
            int zzz4 = zzgr.zzz(8);
            i2 = zzz4 + zzz4;
            zzz = zzgr.zzz(zza4) + zzgr.zzz(16);
            int zzz5 = zzgr.zzz(24);
            int zzk = ((zzim) value).zzk();
            u6 = a.u(zzk, zzk, zzz5);
        }
        return i2 + zzz + u6;
    }

    private static final void zzl(zzha zzha, Object obj) {
        boolean z3;
        zzju zzb2 = zzha.zzb();
        byte[] bArr = zzhp.zzb;
        obj.getClass();
        zzju zzju = zzju.DOUBLE;
        zzjv zzjv = zzjv.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z3 = obj instanceof Integer;
                break;
            case 1:
                z3 = obj instanceof Long;
                break;
            case 2:
                z3 = obj instanceof Float;
                break;
            case 3:
                z3 = obj instanceof Double;
                break;
            case 4:
                z3 = obj instanceof Boolean;
                break;
            case 5:
                z3 = obj instanceof String;
                break;
            case zzaky.zzf.zzf:
                if ((obj instanceof zzgk) || (obj instanceof byte[])) {
                    return;
                }
            case zzaky.zzf.zzg:
                if ((obj instanceof Integer) || (obj instanceof zzkn)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzim) || (obj instanceof zzhw)) {
                    return;
                }
        }
        if (z3) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzha.zza()), zzha.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzhb zzhb = new zzhb();
        int zzc2 = this.zza.zzc();
        for (int i2 = 0; i2 < zzc2; i2++) {
            Map.Entry zzg = this.zza.zzg(i2);
            zzhb.zzg((zzha) ((zzjb) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzhb.zzg((zzha) entry.getKey(), entry.getValue());
        }
        zzhb.zzd = this.zzd;
        return zzhb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhb)) {
            return false;
        }
        return this.zza.equals(((zzhb) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int zzc2 = this.zza.zzc();
        int i2 = 0;
        for (int i5 = 0; i5 < zzc2; i5++) {
            i2 += zzk(this.zza.zzg(i5));
        }
        for (Map.Entry zzk : this.zza.zzd()) {
            i2 += zzk(zzk);
        }
        return i2;
    }

    public final Iterator zze() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzhu(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzf() {
        if (!this.zzc) {
            int zzc2 = this.zza.zzc();
            for (int i2 = 0; i2 < zzc2; i2++) {
                Object value = this.zza.zzg(i2).getValue();
                if (value instanceof zzhk) {
                    ((zzhk) value).zzv();
                }
            }
            for (Map.Entry value2 : this.zza.zzd()) {
                Object value3 = value2.getValue();
                if (value3 instanceof zzhk) {
                    ((zzhk) value3).zzv();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzg(zzha zzha, Object obj) {
        if (!zzha.zze()) {
            zzl(zzha, obj);
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                Object obj2 = list.get(i2);
                zzl(zzha, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzhw) {
            this.zzd = true;
        }
        this.zza.put(zzha, obj);
    }

    public final boolean zzh() {
        int zzc2 = this.zza.zzc();
        for (int i2 = 0; i2 < zzc2; i2++) {
            if (!zzi(this.zza.zzg(i2))) {
                return false;
            }
        }
        for (Map.Entry zzi : this.zza.zzd()) {
            if (!zzi(zzi)) {
                return false;
            }
        }
        return true;
    }

    private zzhb(boolean z3) {
        zzf();
        zzf();
    }
}
