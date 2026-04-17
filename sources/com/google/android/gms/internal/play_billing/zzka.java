package com.google.android.gms.internal.play_billing;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

final class zzka implements zzhm {
    static final zzhm zza = new zzka();

    private zzka() {
    }

    public final boolean zza(int i2) {
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
            case 14:
            case 15:
                return true;
            default:
                switch (i2) {
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        return true;
                    default:
                        return false;
                }
        }
    }
}
