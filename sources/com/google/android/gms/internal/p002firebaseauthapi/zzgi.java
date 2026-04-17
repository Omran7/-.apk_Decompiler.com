package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzdk;
import com.google.android.gms.internal.p002firebaseauthapi.zzvy;
import java.security.GeneralSecurityException;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgi  reason: invalid package */
public final class zzgi {
    private static final zzaae zza;
    private static final zzpk<zzdk, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzdd, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza = zzb2;
        Class<zzqd> cls = zzqd.class;
        zzb = zzpk.zza(new zzgh(), zzdk.class, cls);
        zzc = zzpg.zza(new zzgk(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zzd = zznw.zza(new zzgj(), zzdd.class, cls2);
        zze = zzns.zza(new zzgm(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzdd zzb(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzta zza2 = zzta.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } else if (zza2.zzd().zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                } else if (zza2.zze().zza() == 0) {
                    return zzdd.zze().zza(zzdk.zzf().zza(zza2.zzd().zzf().zzb()).zzb(zza2.zze().zzf().zzb()).zzc(zza2.zzd().zze().zza()).zzd(zza2.zze().zze().zza()).zza(zza(zza2.zze().zze().zzb())).zza(zza(zzqe.zzc())).zza()).zza(zzaaf.zza(zza2.zzd().zzf().zzd(), zzck.zza(zzck))).zzb(zzaaf.zza(zza2.zze().zzf().zzd(), zzck.zza(zzck))).zza(zzqe.zze()).zza();
                } else {
                    throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                }
            } catch (zzalf unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
    }

    private static zzdk.zzc zza(zzvt zzvt) {
        int i2 = zzgl.zzb[zzvt.ordinal()];
        if (i2 == 1) {
            return zzdk.zzc.zza;
        }
        if (i2 == 2) {
            return zzdk.zzc.zzb;
        }
        if (i2 == 3) {
            return zzdk.zzc.zzc;
        }
        if (i2 == 4) {
            return zzdk.zzc.zzd;
        }
        if (i2 == 5) {
            return zzdk.zzc.zze;
        }
        throw new GeneralSecurityException(a.f(zzvt.zza(), "Unable to parse HashType: "));
    }

    private static zzdk.zzb zza(zzxu zzxu) {
        int i2 = zzgl.zza[zzxu.ordinal()];
        if (i2 == 1) {
            return zzdk.zzb.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzdk.zzb.zzb;
        }
        if (i2 == 4) {
            return zzdk.zzb.zzc;
        }
        throw new GeneralSecurityException(a.f(zzxu.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* access modifiers changed from: private */
    public static zzdk zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zztd zza2 = zztd.zza(zzqd.zza().zze(), zzakk.zza());
                if (zza2.zzd().zzb() == 0) {
                    return zzdk.zzf().zza(zza2.zzc().zza()).zzb(zza2.zzd().zza()).zzc(zza2.zzc().zze().zza()).zzd(zza2.zzd().zzf().zza()).zza(zza(zza2.zzd().zzf().zzb())).zza(zza(zzqd.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static zzvy zzb(zzdk zzdk) {
        zzvt zzvt;
        zzvy.zza zza2 = zzvy.zzc().zza(zzdk.zze());
        zzdk.zzc zzg = zzdk.zzg();
        if (zzdk.zzc.zza.equals(zzg)) {
            zzvt = zzvt.SHA1;
        } else if (zzdk.zzc.zzb.equals(zzg)) {
            zzvt = zzvt.SHA224;
        } else if (zzdk.zzc.zzc.equals(zzg)) {
            zzvt = zzvt.SHA256;
        } else if (zzdk.zzc.zzd.equals(zzg)) {
            zzvt = zzvt.SHA384;
        } else if (zzdk.zzc.zze.equals(zzg)) {
            zzvt = zzvt.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzg)));
        }
        return (zzvy) ((zzaky) zza2.zza(zzvt).zze());
    }

    private static zzxu zza(zzdk.zzb zzb2) {
        if (zzdk.zzb.zza.equals(zzb2)) {
            return zzxu.TINK;
        }
        if (zzdk.zzb.zzb.equals(zzb2)) {
            return zzxu.CRUNCHY;
        }
        if (zzdk.zzb.zzc.equals(zzb2)) {
            return zzxu.RAW;
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
