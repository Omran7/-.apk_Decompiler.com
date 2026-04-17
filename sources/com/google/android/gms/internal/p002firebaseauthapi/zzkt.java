package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzki;
import h0.C0552a;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkt  reason: invalid package */
public final class zzkt extends zzll {
    private final zzki zza;
    private final zzaae zzb;
    private final zzaae zzc;
    private final Integer zzd;

    private zzkt(zzki zzki, zzaae zzaae, zzaae zzaae2, Integer num) {
        this.zza = zzki;
        this.zzb = zzaae;
        this.zzc = zzaae2;
        this.zzd = num;
    }

    public final /* synthetic */ zzce zza() {
        return (zzki) zzc();
    }

    public final Integer zzb() {
        return this.zzd;
    }

    public final /* synthetic */ zzlj zzc() {
        return this.zza;
    }

    public final zzaae zzd() {
        return this.zzc;
    }

    public final zzaae zze() {
        return this.zzb;
    }

    public static zzkt zza(zzki zzki, zzaae zzaae, Integer num) {
        zzaae zzaae2;
        EllipticCurve ellipticCurve;
        zzki.zzf zzf = zzki.zzf();
        zzki.zzf zzf2 = zzki.zzf.zzc;
        if (!zzf.equals(zzf2) && num == null) {
            throw new GeneralSecurityException(C0552a.o("'idRequirement' must be non-null for ", String.valueOf(zzf), " variant."));
        } else if (!zzf.equals(zzf2) || num == null) {
            zzki.zzd zze = zzki.zze();
            int zza2 = zzaae.zza();
            String str = "Encoded public key byte length for " + String.valueOf(zze) + " must be %d, not " + zza2;
            zzki.zzd zzd2 = zzki.zzd.zza;
            if (zze == zzd2) {
                if (zza2 != 65) {
                    throw new GeneralSecurityException(String.format(str, new Object[]{65}));
                }
            } else if (zze == zzki.zzd.zzb) {
                if (zza2 != 97) {
                    throw new GeneralSecurityException(String.format(str, new Object[]{97}));
                }
            } else if (zze == zzki.zzd.zzc) {
                if (zza2 != 133) {
                    throw new GeneralSecurityException(String.format(str, new Object[]{133}));
                }
            } else if (zze != zzki.zzd.zzd) {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(String.valueOf(zze)));
            } else if (zza2 != 32) {
                throw new GeneralSecurityException(String.format(str, new Object[]{32}));
            }
            if (zze == zzd2 || zze == zzki.zzd.zzb || zze == zzki.zzd.zzc) {
                if (zze == zzd2) {
                    ellipticCurve = zzni.zza.getCurve();
                } else if (zze == zzki.zzd.zzb) {
                    ellipticCurve = zzni.zzb.getCurve();
                } else if (zze == zzki.zzd.zzc) {
                    ellipticCurve = zzni.zzc.getCurve();
                } else {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zze)));
                }
                zzni.zza(zzyz.zza(ellipticCurve, zzzb.UNCOMPRESSED, zzaae.zzb()), ellipticCurve);
            }
            zzki.zzf zzf3 = zzki.zzf();
            if (zzf3 == zzf2) {
                zzaae2 = zzpd.zza;
            } else if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(String.valueOf(zzf3)));
            } else if (zzf3 == zzki.zzf.zzb) {
                zzaae2 = zzpd.zza(num.intValue());
            } else if (zzf3 == zzki.zzf.zza) {
                zzaae2 = zzpd.zzb(num.intValue());
            } else {
                throw new IllegalStateException("Unknown HpkeParameters.Variant: ".concat(String.valueOf(zzf3)));
            }
            return new zzkt(zzki, zzaae, zzaae2, num);
        } else {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }
}
