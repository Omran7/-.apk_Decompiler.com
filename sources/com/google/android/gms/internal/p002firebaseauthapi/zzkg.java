package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzke;
import h0.C0552a;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkg  reason: invalid package */
public final class zzkg extends zzll {
    private final zzke zza;
    private final ECPoint zzb;
    private final zzaae zzc;
    private final zzaae zzd;
    private final Integer zze;

    private zzkg(zzke zzke, ECPoint eCPoint, zzaae zzaae, zzaae zzaae2, Integer num) {
        this.zza = zzke;
        this.zzb = eCPoint;
        this.zzc = zzaae;
        this.zzd = zzaae2;
        this.zze = num;
    }

    public final /* synthetic */ zzce zza() {
        return (zzke) zzc();
    }

    public final Integer zzb() {
        return this.zze;
    }

    public final /* synthetic */ zzlj zzc() {
        return this.zza;
    }

    public final zzaae zzd() {
        return this.zzd;
    }

    public final zzaae zze() {
        return this.zzc;
    }

    public final ECPoint zzf() {
        return this.zzb;
    }

    public static zzkg zza(zzke zzke, zzaae zzaae, Integer num) {
        if (zzke.zzd().equals(zzke.zza.zzd)) {
            zzb(zzke.zzg(), num);
            if (zzaae.zza() == 32) {
                return new zzkg(zzke, (ECPoint) null, zzaae, zza(zzke.zzg(), num), num);
            }
            throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
        }
        throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
    }

    private static void zzb(zzke.zze zze2, Integer num) {
        zzke.zze zze3 = zzke.zze.zzc;
        if (!zze2.equals(zze3) && num == null) {
            throw new GeneralSecurityException(C0552a.o("'idRequirement' must be non-null for ", String.valueOf(zze2), " variant."));
        } else if (zze2.equals(zze3) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    public static zzkg zza(zzke zzke, ECPoint eCPoint, Integer num) {
        EllipticCurve ellipticCurve;
        if (!zzke.zzd().equals(zzke.zza.zzd)) {
            zzb(zzke.zzg(), num);
            zzke.zza zzd2 = zzke.zzd();
            if (zzd2 == zzke.zza.zza) {
                ellipticCurve = zzni.zza.getCurve();
            } else if (zzd2 == zzke.zza.zzb) {
                ellipticCurve = zzni.zzb.getCurve();
            } else if (zzd2 == zzke.zza.zzc) {
                ellipticCurve = zzni.zzc.getCurve();
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(zzd2)));
            }
            zzni.zza(eCPoint, ellipticCurve);
            return new zzkg(zzke, eCPoint, (zzaae) null, zza(zzke.zzg(), num), num);
        }
        throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
    }

    private static zzaae zza(zzke.zze zze2, Integer num) {
        if (zze2 == zzke.zze.zzc) {
            return zzpd.zza;
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(zze2)));
        } else if (zze2 == zzke.zze.zzb) {
            return zzpd.zza(num.intValue());
        } else {
            if (zze2 == zzke.zze.zza) {
                return zzpd.zzb(num.intValue());
            }
            throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(zze2)));
        }
    }
}
