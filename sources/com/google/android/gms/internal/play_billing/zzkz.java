package com.google.android.gms.internal.play_billing;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

final class zzkz implements zzhm {
    static final zzhm zza = new zzkz();

    private zzkz() {
    }

    public final boolean zza(int i2) {
        if (i2 == 17 || i2 == 18) {
            return true;
        }
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case zzaky.zzf.zzf:
            case zzaky.zzf.zzg:
            case 8:
            case 9:
            case 10:
            case ModuleDescriptor.MODULE_VERSION:
            case 12:
            case 13:
                return true;
            default:
                return false;
        }
    }
}
