package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import com.google.android.gms.internal.p002firebaseauthapi.zzxc;
import com.google.android.gms.internal.p002firebaseauthapi.zzxf;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcl  reason: invalid package */
final class zzcl {
    static {
        Charset.forName("UTF-8");
    }

    public static zzxf zza(zzxc zzxc) {
        zzxf.zzb zza = zzxf.zza().zza(zzxc.zzb());
        for (zzxc.zza next : zzxc.zze()) {
            zza.zza((zzxf.zza) ((zzaky) zzxf.zza.zza().zza(next.zzb().zzf()).zza(next.zzc()).zza(next.zzf()).zza(next.zza()).zze()));
        }
        return (zzxf) ((zzaky) zza.zze());
    }

    public static void zzb(zzxc zzxc) {
        int zzb = zzxc.zzb();
        int i2 = 0;
        boolean z3 = false;
        boolean z4 = true;
        for (zzxc.zza next : zzxc.zze()) {
            if (next.zzc() == zzwt.ENABLED) {
                if (!next.e_()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.zza())}));
                } else if (next.zzf() == zzxu.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.zza())}));
                } else if (next.zzc() != zzwt.UNKNOWN_STATUS) {
                    if (next.zza() == zzb) {
                        if (!z3) {
                            z3 = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (next.zzb().zzb() != zzws.zza.ASYMMETRIC_PUBLIC) {
                        z4 = false;
                    }
                    i2++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.zza())}));
                }
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z3 && !z4) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
