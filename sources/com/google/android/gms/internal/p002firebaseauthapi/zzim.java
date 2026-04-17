package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzgg;
import java.security.GeneralSecurityException;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzim  reason: invalid package */
public final class zzim {
    private static final zzaae zza;
    private static final zzpk<zzgg, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzgb, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza = zzb2;
        Class<zzqd> cls = zzqd.class;
        zzb = zzpk.zza(new zzil(), zzgg.class, cls);
        zzc = zzpg.zza(new zzio(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zzd = zznw.zza(new zzin(), zzgb.class, cls2);
        zze = zzns.zza(new zziq(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzgb zzb(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzyf zza2 = zzyf.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    return zzgb.zza(zza(zzqe.zzc()), zzaaf.zza(zza2.zzd().zzd(), zzck.zza(zzck)), zzqe.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }

    private static zzgg.zza zza(zzxu zzxu) {
        int i2 = zzip.zza[zzxu.ordinal()];
        if (i2 == 1) {
            return zzgg.zza.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzgg.zza.zzb;
        }
        if (i2 == 4) {
            return zzgg.zza.zzc;
        }
        throw new GeneralSecurityException(a.f(zzxu.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* access modifiers changed from: private */
    public static zzgg zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzyi.zza(zzqd.zza().zze(), zzakk.zza()).zza() == 0) {
                    return zzgg.zza(zza(zzqd.zza().zzd()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static zzxu zza(zzgg.zza zza2) {
        if (zzgg.zza.zza.equals(zza2)) {
            return zzxu.TINK;
        }
        if (zzgg.zza.zzb.equals(zza2)) {
            return zzxu.CRUNCHY;
        }
        if (zzgg.zza.zzc.equals(zza2)) {
            return zzxu.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zza2)));
    }

    public static void zza() {
        zzpc zza2 = zzpc.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
