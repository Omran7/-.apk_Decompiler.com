package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlg  reason: invalid package */
public final class zzlg {
    public static final zzww zza;
    private static final byte[] zzb;

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzvn zzvn = zzvn.NIST_P256;
        zzvt zzvt = zzvt.SHA256;
        zzuw zzuw = zzuw.UNCOMPRESSED;
        zzww zzww = zzcy.zza;
        zzxu zzxu = zzxu.TINK;
        zzvt zzvt2 = zzvt;
        zzww zzww2 = zzww;
        byte[] bArr2 = bArr;
        zza = zza(zzvn, zzvt2, zzuw, zzww2, zzxu, bArr2);
        zzvn zzvn2 = zzvn;
        zza(zzvn2, zzvt2, zzuw.COMPRESSED, zzww2, zzxu.RAW, bArr2);
        zza(zzvn2, zzvt2, zzuw, zzcy.zzc, zzxu, bArr2);
    }

    @Deprecated
    private static zzww zza(zzvn zzvn, zzvt zzvt, zzuw zzuw, zzww zzww, zzxu zzxu, byte[] bArr) {
        return (zzww) ((zzaky) zzww.zza().zza(zzka.zza()).zza(zzxu).zza(((zzuy) ((zzaky) zzuy.zza().zza((zzvb) ((zzaky) zzvb.zzc().zza((zzvk) ((zzaky) zzvk.zza().zza(zzvn).zza(zzvt).zza(zzajp.zza(bArr)).zze())).zza((zzuv) ((zzaky) zzuv.zza().zza(zzww).zze())).zza(zzuw).zze())).zze())).a_()).zze());
    }
}
