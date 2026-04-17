package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzxc;
import h0.C0552a;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbs  reason: invalid package */
public final class zzbs {
    private final List<zzbr> zza = new ArrayList();
    private zzoj zzb = zzoj.zza;
    private boolean zzc = false;

    /* access modifiers changed from: private */
    public final void zzb() {
        for (zzbr zza2 : this.zza) {
            zza2.zza = false;
        }
    }

    public final zzbs zza(zzbr zzbr) {
        if (zzbr.zze == null) {
            if (zzbr.zza) {
                zzb();
            }
            zzbr.zze = this;
            this.zza.add(zzbr);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzbq zza() {
        int i2;
        if (!this.zzc) {
            this.zzc = true;
            zzxc.zzb zzc2 = zzxc.zzc();
            ArrayList arrayList = new ArrayList(this.zza.size());
            List<zzbr> list = this.zza;
            int i5 = 0;
            while (i5 < list.size() - 1) {
                if (list.get(i5).zzd != zzbu.zza || list.get(i5 + 1).zzd == zzbu.zza) {
                    i5++;
                } else {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            HashSet hashSet = new HashSet();
            Integer num = null;
            for (zzbr next : this.zza) {
                if (next.zzb == null) {
                    throw new GeneralSecurityException("Key Status not set.");
                } else if (next.zzd != null) {
                    if (next.zzd == zzbu.zza) {
                        i2 = 0;
                        while (true) {
                            if (i2 != 0 && !hashSet.contains(Integer.valueOf(i2))) {
                                break;
                            }
                            i2 = zzqq.zza();
                        }
                    } else {
                        i2 = zzbu.zza(next.zzd);
                    }
                    if (!hashSet.contains(Integer.valueOf(i2))) {
                        hashSet.add(Integer.valueOf(i2));
                        zzbm zza2 = zzos.zza().zza(next.zzc, next.zzc.zza() ? Integer.valueOf(i2) : null);
                        zzbt zzbt = r10;
                        zzbt zzbt2 = new zzbt(zza2, next.zzb, i2, next.zza);
                        zzc2.zza(zzbq.zzb(zza2, next.zzb, i2));
                        if (next.zza) {
                            if (num == null) {
                                num = Integer.valueOf(i2);
                                if (next.zzb != zzbo.zza) {
                                    throw new GeneralSecurityException("Primary key is not enabled");
                                }
                            } else {
                                throw new GeneralSecurityException("Two primaries were set");
                            }
                        }
                        arrayList.add(zzbt);
                    } else {
                        throw new GeneralSecurityException(C0552a.k(i2, "Id ", " is used twice in the keyset"));
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num != null) {
                zzc2.zza(num.intValue());
                zzxc zzxc = (zzxc) ((zzaky) zzc2.zze());
                zzbq.zzd(zzxc);
                return new zzbq(zzxc, arrayList, this.zzb);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
