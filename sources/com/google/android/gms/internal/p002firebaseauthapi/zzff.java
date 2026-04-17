package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzfe;
import java.security.GeneralSecurityException;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzff  reason: invalid package */
public final class zzff {
    private static final zzaae zza;
    private static final zzpk<zzfe, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzfc, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza = zzb2;
        Class<zzqd> cls = zzqd.class;
        zzb = zzpk.zza(new zzfi(), zzfe.class, cls);
        zzc = zzpg.zza(new zzfh(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zzd = zznw.zza(new zzfk(), zzfc.class, cls2);
        zze = zzns.zza(new zzfj(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzfc zzb(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                zzxo zza2 = zzxo.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    return zzfc.zza(zza(zza2.zzd(), zzqe.zzc()), zzqe.zze());
                }
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zza2)));
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
    }

    private static zzfe zza(zzxr zzxr, zzxu zzxu) {
        zzfe.zzc zzc2;
        zzfe.zzb zzb2;
        zzce zza2 = zzcm.zza(((zzww) ((zzaky) zzww.zza().zza(zzxr.zza().zzf()).zza(zzxr.zza().zze()).zza(zzxu.RAW).zze())).zzk());
        if (zza2 instanceof zzdz) {
            zzc2 = zzfe.zzc.zza;
        } else if (zza2 instanceof zzem) {
            zzc2 = zzfe.zzc.zzc;
        } else if (zza2 instanceof zzgg) {
            zzc2 = zzfe.zzc.zzb;
        } else if (zza2 instanceof zzdk) {
            zzc2 = zzfe.zzc.zzd;
        } else if (zza2 instanceof zzdq) {
            zzc2 = zzfe.zzc.zze;
        } else if (zza2 instanceof zzeg) {
            zzc2 = zzfe.zzc.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(String.valueOf(zza2)));
        }
        zzfe.zza zza3 = new zzfe.zza();
        int i2 = zzfm.zza[zzxu.ordinal()];
        if (i2 == 1) {
            zzb2 = zzfe.zzb.zza;
        } else if (i2 == 2) {
            zzb2 = zzfe.zzb.zzb;
        } else {
            throw new GeneralSecurityException(a.f(zzxu.zza(), "Unable to parse OutputPrefixType: "));
        }
        return zza3.zza(zzb2).zza(zzxr.zze()).zza((zzcx) zza2).zza(zzc2).zza();
    }

    /* access modifiers changed from: private */
    public static zzfe zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zza(zzxr.zza(zzqd.zza().zze(), zzakk.zza()), zzqd.zza().zzd());
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static zzxr zzb(zzfe zzfe) {
        try {
            return (zzxr) ((zzaky) zzxr.zzb().zza(zzfe.zzd()).zza(zzww.zza(zzcm.zza((zzce) zzfe.zzb()), zzakk.zza())).zze());
        } catch (zzalf e6) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e6);
        }
    }

    private static zzxu zza(zzfe.zzb zzb2) {
        if (zzfe.zzb.zza.equals(zzb2)) {
            return zzxu.TINK;
        }
        if (zzfe.zzb.zzb.equals(zzb2)) {
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
