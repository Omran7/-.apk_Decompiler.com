package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzqw;
import java.security.GeneralSecurityException;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzry  reason: invalid package */
public final class zzry {
    private static final zzaae zza;
    private static final zzpk<zzqw, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzqp, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzb2;
        Class<zzqd> cls = zzqd.class;
        zzb = zzpk.zza(new zzsb(), zzqw.class, cls);
        zzc = zzpg.zza(new zzsa(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zzd = zznw.zza(new zzsd(), zzqp.class, cls2);
        zze = zzns.zza(new zzsc(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzqp zzb(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzsr zza2 = zzsr.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    return zzqp.zzc().zza(zzqw.zzd().zza(zza2.zze().zzb()).zzb(zza2.zzd().zza()).zza(zza(zzqe.zzc())).zza()).zza(zzaaf.zza(zza2.zze().zzd(), zzck.zza(zzck))).zza(zzqe.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
    }

    /* access modifiers changed from: private */
    public static zzqw zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzsu zza2 = zzsu.zza(zzqd.zza().zze(), zzakk.zza());
                return zzqw.zzd().zza(zza2.zza()).zzb(zza2.zzd().zza()).zza(zza(zzqd.zza().zzd())).zza();
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static zzqw.zzb zza(zzxu zzxu) {
        int i2 = zzsf.zza[zzxu.ordinal()];
        if (i2 == 1) {
            return zzqw.zzb.zza;
        }
        if (i2 == 2) {
            return zzqw.zzb.zzb;
        }
        if (i2 == 3) {
            return zzqw.zzb.zzc;
        }
        if (i2 == 4) {
            return zzqw.zzb.zzd;
        }
        throw new GeneralSecurityException(a.f(zzxu.zza(), "Unable to parse OutputPrefixType: "));
    }

    private static zzsx zzb(zzqw zzqw) {
        return (zzsx) ((zzaky) zzsx.zzb().zza(zzqw.zzb()).zze());
    }

    private static zzxu zza(zzqw.zzb zzb2) {
        if (zzqw.zzb.zza.equals(zzb2)) {
            return zzxu.TINK;
        }
        if (zzqw.zzb.zzb.equals(zzb2)) {
            return zzxu.CRUNCHY;
        }
        if (zzqw.zzb.zzd.equals(zzb2)) {
            return zzxu.RAW;
        }
        if (zzqw.zzb.zzc.equals(zzb2)) {
            return zzxu.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzb2)));
    }

    public static void zza() {
        zzpc zza2 = zzpc.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
