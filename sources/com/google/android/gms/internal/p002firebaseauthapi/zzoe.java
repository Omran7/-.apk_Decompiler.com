package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoe  reason: invalid package */
public final class zzoe extends zzbm {
    private final zzqe zza;
    private final zzaae zzb;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoe$zza */
    public static class zza extends zzce {
        private final String zza;
        private final zzxu zzb;

        public final String toString() {
            String str;
            String str2 = this.zza;
            int i2 = zzog.zza[this.zzb.ordinal()];
            if (i2 == 1) {
                str = "TINK";
            } else if (i2 == 2) {
                str = "LEGACY";
            } else if (i2 == 3) {
                str = "RAW";
            } else if (i2 != 4) {
                str = "UNKNOWN";
            } else {
                str = "CRUNCHY";
            }
            return C0552a.q("(typeUrl=", str2, ", outputPrefixType=", str, ")");
        }

        public final boolean zza() {
            if (this.zzb != zzxu.RAW) {
                return true;
            }
            return false;
        }

        private zza(String str, zzxu zzxu) {
            this.zza = str;
            this.zzb = zzxu;
        }
    }

    public zzoe(zzqe zzqe, zzck zzck) {
        zzaae zzaae;
        zza(zzqe, zzck);
        this.zza = zzqe;
        if (zzqe.zzc().equals(zzxu.RAW)) {
            zzaae = zzaae.zza(new byte[0]);
        } else if (zzqe.zzc().equals(zzxu.TINK)) {
            zzaae = zzpd.zzb(zzqe.zze().intValue());
        } else if (zzqe.zzc().equals(zzxu.LEGACY) || zzqe.zzc().equals(zzxu.CRUNCHY)) {
            zzaae = zzpd.zza(zzqe.zze().intValue());
        } else {
            throw new GeneralSecurityException("Unknown output prefix type");
        }
        this.zzb = zzaae;
    }

    public final zzce zza() {
        return new zza(this.zza.zzf(), this.zza.zzc());
    }

    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzaae zzc() {
        return this.zzb;
    }

    public final zzqe zza(zzck zzck) {
        zza(this.zza, zzck);
        return this.zza;
    }

    private static void zza(zzqe zzqe, zzck zzck) {
        int i2 = zzog.zzb[zzqe.zza().ordinal()];
        if (i2 == 1 || i2 == 2) {
            zzck.zza(zzck);
        }
    }
}
