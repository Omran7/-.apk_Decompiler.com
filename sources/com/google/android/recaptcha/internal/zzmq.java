package com.google.android.recaptcha.internal;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.Map;

final class zzmq extends zzmp {
    public final void zza(Object obj) {
        ((zzna) obj).zzb.zzg();
    }

    public final void zzb(zzpy zzpy, Map.Entry entry) {
        zznb zznb = (zznb) entry.getKey();
        zzpw zzpw = zzpw.DOUBLE;
        switch (zznb.zzb.ordinal()) {
            case 0:
                zzpy.zzf(zznb.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzpy.zzo(zznb.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzpy.zzt(zznb.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzpy.zzK(zznb.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzpy.zzr(zznb.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzpy.zzm(zznb.zza, ((Long) entry.getValue()).longValue());
                return;
            case zzaky.zzf.zzf:
                zzpy.zzk(zznb.zza, ((Integer) entry.getValue()).intValue());
                return;
            case zzaky.zzf.zzg:
                zzpy.zzb(zznb.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzpy.zzG(zznb.zza, (String) entry.getValue());
                return;
            case 9:
                zzpy.zzq(zznb.zza, entry.getValue(), zzos.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzpy.zzv(zznb.zza, entry.getValue(), zzos.zza().zzb(entry.getValue().getClass()));
                return;
            case ModuleDescriptor.MODULE_VERSION:
                zzpy.zzd(zznb.zza, (zzle) entry.getValue());
                return;
            case 12:
                zzpy.zzI(zznb.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzpy.zzr(zznb.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzpy.zzx(zznb.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzpy.zzz(zznb.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzpy.zzB(zznb.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzpy.zzD(zznb.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
