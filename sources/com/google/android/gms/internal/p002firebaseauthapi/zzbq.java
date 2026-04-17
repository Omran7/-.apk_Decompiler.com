package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import com.google.android.gms.internal.p002firebaseauthapi.zzxc;
import h0.C0552a;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbq  reason: invalid package */
public final class zzbq implements zzoa {
    private final zzxc zza;
    private final List<zzbt> zzb;
    private final zzoj zzc;

    public final String toString() {
        return zzcl.zza(this.zza).toString();
    }

    public final /* synthetic */ zzod zzc() {
        for (zzbt next : this.zzb) {
            if (next != null && next.zzd()) {
                if (next.zzc() == zzbo.zza) {
                    return next;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    public final zzxc zzd() {
        return this.zza;
    }

    private zzbq(zzxc zzxc, List<zzbt> list, zzoj zzoj) {
        this.zza = zzxc;
        this.zzb = list;
        this.zzc = zzoj;
        if (zzit.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzxc.zza next : zzxc.zze()) {
                if (!hashSet.contains(Integer.valueOf(next.zza()))) {
                    hashSet.add(Integer.valueOf(next.zza()));
                } else {
                    throw new GeneralSecurityException(C0552a.k(next.zza(), "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!hashSet.contains(Integer.valueOf(zzxc.zzb()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
    }

    /* access modifiers changed from: private */
    public static void zzd(zzxc zzxc) {
        if (zzxc == null || zzxc.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzbq zzb() {
        zzbt zzbt;
        zzxc.zza zza2;
        if (this.zza != null) {
            zzxc.zzb zzc2 = zzxc.zzc();
            ArrayList arrayList = new ArrayList(this.zzb.size());
            int i2 = 0;
            for (zzbt next : this.zzb) {
                if (next == null || !(next.zzb() instanceof zzcd)) {
                    zzxc.zza zza3 = this.zza.zza(i2);
                    zzws zzb2 = zza3.zzb();
                    if (zzb2.zzb() == zzws.zza.ASYMMETRIC_PRIVATE) {
                        zza2 = (zzxc.zza) ((zzaky) ((zzxc.zza.C0000zza) zza3.zzn()).zza(zzch.zza(zzb2.zzf(), zzb2.zze())).zze());
                        try {
                            zzbm zza4 = zza(zza2);
                            int zza5 = zza2.zza();
                            zzbt = new zzbt(zza4, zza(zza2.zzc()), zza5, zza5 == this.zza.zzb());
                        } catch (GeneralSecurityException unused) {
                            zzbt = null;
                        }
                    } else {
                        throw new GeneralSecurityException("The keyset contains a non-private key");
                    }
                } else {
                    zzbm zzc3 = ((zzcd) next.zzb()).zzc();
                    zzbt = new zzbt(zzc3, next.zzc(), next.zza(), next.zzd());
                    zza2 = zzb(zzc3, next.zzc(), next.zza());
                }
                zzc2.zza(zza2);
                arrayList.add(zzbt);
                i2++;
            }
            zzc2.zza(this.zza.zzb());
            return new zzbq((zzxc) ((zzaky) zzc2.zze()), arrayList, this.zzc);
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    private static zzbm zza(zzxc.zza zza2) {
        zzqe zza3 = zzqe.zza(zza2.zzb().zzf(), zza2.zzb().zze(), zza2.zzb().zzb(), zza2.zzf(), zza2.zzf() == zzxu.RAW ? null : Integer.valueOf(zza2.zza()));
        zzpc zza4 = zzpc.zza();
        zzck zza5 = zzck.zza();
        if (!zza4.zzb(zza3)) {
            return new zzoe(zza3, zza5);
        }
        return zza4.zza(zza3, zza5);
    }

    private static List<zzbt> zzc(zzxc zzxc) {
        ArrayList arrayList = new ArrayList(zzxc.zza());
        for (zzxc.zza next : zzxc.zze()) {
            int zza2 = next.zza();
            try {
                arrayList.add(new zzbt(zza(next), zza(next.zzc()), zza2, zza2 == zzxc.zzb()));
            } catch (GeneralSecurityException e6) {
                if (!zzit.zza.zza()) {
                    arrayList.add((Object) null);
                } else {
                    throw new GeneralSecurityException("Parsing of a single key failed (maybe wrong status?) and Tink is configured via validateKeysetsOnParsing to reject such keysets.", e6);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static zzbo zza(zzwt zzwt) {
        int i2 = zzbp.zza[zzwt.ordinal()];
        if (i2 == 1) {
            return zzbo.zza;
        }
        if (i2 == 2) {
            return zzbo.zzb;
        }
        if (i2 == 3) {
            return zzbo.zzc;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final zzbq zza(zzxc zzxc) {
        zzd(zzxc);
        return new zzbq(zzxc, zzc(zzxc), zzoj.zza);
    }

    public static final zzbq zza(zzbn zzbn) {
        return new zzbs().zza(new zzbr(zzbn.zza()).zzb().zza()).zza();
    }

    @Deprecated
    public static final zzbq zza(zzby zzby, zzbe zzbe, byte[] bArr) {
        zzvq zza2 = zzby.zza();
        if (zza2 != null && zza2.zzc().zzb() != 0) {
            return zza(zza(zza2, zzbe, bArr));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /* access modifiers changed from: private */
    public static zzxc.zza zzb(zzbm zzbm, zzbo zzbo, int i2) {
        zzwt zzwt;
        zzqe zzqe = (zzqe) zzpc.zza().zza(zzbm, zzqe.class, zzck.zza());
        Integer zze = zzqe.zze();
        if (zze == null || zze.intValue() == i2) {
            if (zzbo.zza.equals(zzbo)) {
                zzwt = zzwt.ENABLED;
            } else if (zzbo.zzb.equals(zzbo)) {
                zzwt = zzwt.DISABLED;
            } else if (zzbo.zzc.equals(zzbo)) {
                zzwt = zzwt.DESTROYED;
            } else {
                throw new IllegalStateException("Unknown key status");
            }
            return (zzxc.zza) ((zzaky) zzxc.zza.zzd().zza(zzws.zza().zza(zzqe.zzf()).zza(zzqe.zzd()).zza(zzqe.zza())).zza(zzwt).zza(i2).zza(zzqe.zzc()).zze());
        }
        throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
    }

    public final /* synthetic */ zzod zza(int i2) {
        if (i2 < 0 || i2 >= zza()) {
            throw new IndexOutOfBoundsException(C0552a.l("Invalid index ", i2, zza(), " for keyset of size "));
        } else if (this.zzb.get(i2) != null) {
            return this.zzb.get(i2);
        } else {
            throw new IllegalStateException(C0552a.k(i2, "Keyset-Entry at position ", " has wrong status or key parsing failed"));
        }
    }

    private static zzxc zza(zzvq zzvq, zzbe zzbe, byte[] bArr) {
        try {
            zzxc zza2 = zzxc.zza(zzbe.zza(zzvq.zzc().zzd(), bArr), zzakk.zza());
            zzd(zza2);
            return zza2;
        } catch (zzalf unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final <P> P zza(zzbf zzbf, Class<P> cls) {
        if (zzbf instanceof zzno) {
            zzno zzno = (zzno) zzbf;
            zzcl.zzb(this.zza);
            int i2 = 0;
            while (i2 < zza()) {
                if (this.zzb.get(i2) != null) {
                    i2++;
                } else {
                    String zzf = this.zza.zza(i2).zzb().zzf();
                    throw new GeneralSecurityException("Key parsing of key with index " + i2 + " and type_url " + zzf + " failed, unable to get primitive");
                }
            }
            return zzno.zza(this, this.zzc, cls);
        }
        throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(com.google.android.gms.internal.p002firebaseauthapi.zzbx r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.firebase-auth-api.zzxc r0 = r4.zza
            java.util.List r0 = r0.zze()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.firebase-auth-api.zzxc$zza r1 = (com.google.android.gms.internal.p002firebaseauthapi.zzxc.zza) r1
            com.google.android.gms.internal.firebase-auth-api.zzws r2 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzws$zza r2 = r2.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzws$zza r3 = com.google.android.gms.internal.p002firebaseauthapi.zzws.zza.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L_0x003b
            com.google.android.gms.internal.firebase-auth-api.zzws r2 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzws$zza r2 = r2.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzws$zza r3 = com.google.android.gms.internal.p002firebaseauthapi.zzws.zza.SYMMETRIC
            if (r2 == r3) goto L_0x003b
            com.google.android.gms.internal.firebase-auth-api.zzws r2 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzws$zza r2 = r2.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzws$zza r3 = com.google.android.gms.internal.p002firebaseauthapi.zzws.zza.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L_0x003b
            goto L_0x000a
        L_0x003b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            com.google.android.gms.internal.firebase-auth-api.zzws r0 = r1.zzb()
            com.google.android.gms.internal.firebase-auth-api.zzws$zza r0 = r0.zzb()
            java.lang.String r0 = r0.name()
            com.google.android.gms.internal.firebase-auth-api.zzws r1 = r1.zzb()
            java.lang.String r1 = r1.zzf()
            java.lang.String r2 = "keyset contains key material of type "
            java.lang.String r3 = " for type url "
            java.lang.String r0 = h0.C0552a.p(r2, r0, r3, r1)
            r5.<init>(r0)
            throw r5
        L_0x005d:
            com.google.android.gms.internal.firebase-auth-api.zzxc r0 = r4.zza
            r5.zza((com.google.android.gms.internal.p002firebaseauthapi.zzxc) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzbq.zza(com.google.android.gms.internal.firebase-auth-api.zzbx):void");
    }

    @Deprecated
    public final void zza(zzbx zzbx, zzbe zzbe, byte[] bArr) {
        zzxc zzxc = this.zza;
        zzbx.zza((zzvq) ((zzaky) zzvq.zza().zza(zzajp.zza(zzbe.zzb(zzxc.zzk(), bArr))).zza(zzcl.zza(zzxc)).zze()));
    }
}
