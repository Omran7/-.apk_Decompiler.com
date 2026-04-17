package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzem;
import java.security.GeneralSecurityException;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhm  reason: invalid package */
public final class zzhm {
    private static final zzaae zza;
    private static final zzpk<zzem, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzei, zzqe> zzd;
    private static final zzns<zzqe> zze;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza = zzb2;
        Class<zzqd> cls = zzqd.class;
        zzb = zzpk.zza(new zzhl(), zzem.class, cls);
        zzc = zzpg.zza(new zzho(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zzd = zznw.zza(new zzhn(), zzei.class, cls2);
        zze = zzns.zza(new zzhq(), zzb2, cls2);
    }

    /* access modifiers changed from: private */
    public static zzei zzb(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzuq zza2 = zzuq.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    return zzei.zza(zza(zzqe.zzc()), zzaaf.zza(zza2.zzd().zzd(), zzck.zza(zzck)), zzqe.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }

    private static zzem.zza zza(zzxu zzxu) {
        int i2 = zzhp.zza[zzxu.ordinal()];
        if (i2 == 1) {
            return zzem.zza.zza;
        }
        if (i2 == 2 || i2 == 3) {
            return zzem.zza.zzb;
        }
        if (i2 == 4) {
            return zzem.zza.zzc;
        }
        throw new GeneralSecurityException(a.f(zzxu.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* access modifiers changed from: private */
    public static zzem zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzut.zza(zzqd.zza().zze(), zzakk.zza());
                return zzem.zza(zza(zzqd.zza().zzd()));
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static zzxu zza(zzem.zza zza2) {
        if (zzem.zza.zza.equals(zza2)) {
            return zzxu.TINK;
        }
        if (zzem.zza.zzb.equals(zza2)) {
            return zzxu.CRUNCHY;
        }
        if (zzem.zza.zzc.equals(zza2)) {
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
