package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzjh;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjr  reason: invalid package */
public final class zzjr {
    private static final zzaae zza;
    private static final zzpk<zzjh, zzqd> zzb;
    private static final zzpg<zzqd> zzc;
    private static final zznw<zzja, zzqe> zzd;
    private static final zzns<zzqe> zze;
    private static final Map<zzjh.zzb, zzxu> zzf;
    private static final Map<zzxu, zzjh.zzb> zzg;

    static {
        zzaae zzb2 = zzqq.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzb2;
        Class<zzqd> cls = zzqd.class;
        zzb = zzpk.zza(new zzju(), zzjh.class, cls);
        zzc = zzpg.zza(new zzjt(), zzb2, cls);
        Class<zzqe> cls2 = zzqe.class;
        zzd = zznw.zza(new zzjw(), zzja.class, cls2);
        zze = zzns.zza(new zzjv(), zzb2, cls2);
        HashMap hashMap = new HashMap();
        zzjh.zzb zzb3 = zzjh.zzb.zzc;
        zzxu zzxu = zzxu.RAW;
        hashMap.put(zzb3, zzxu);
        zzjh.zzb zzb4 = zzjh.zzb.zza;
        zzxu zzxu2 = zzxu.TINK;
        hashMap.put(zzb4, zzxu2);
        zzjh.zzb zzb5 = zzjh.zzb.zzb;
        zzxu zzxu3 = zzxu.CRUNCHY;
        hashMap.put(zzb5, zzxu3);
        zzf = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(zzxu.class);
        enumMap.put(zzxu, zzb3);
        enumMap.put(zzxu2, zzb4);
        enumMap.put(zzxu3, zzb5);
        enumMap.put(zzxu.LEGACY, zzb5);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    /* access modifiers changed from: private */
    public static zzja zzb(zzqe zzqe, zzck zzck) {
        if (zzqe.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zzuk zza2 = zzuk.zza(zzqe.zzd(), zzakk.zza());
                if (zza2.zza() == 0) {
                    return zzja.zzc().zza(zzjh.zzc().zza(zza2.zzd().zzb()).zza(zza(zzqe.zzc())).zza()).zza(zzaaf.zza(zza2.zzd().zzd(), zzck.zza(zzck))).zza(zzqe.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf unused) {
                throw new GeneralSecurityException("Parsing AesSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
    }

    private static zzjh.zzb zza(zzxu zzxu) {
        Map<zzxu, zzjh.zzb> map = zzg;
        if (map.containsKey(zzxu)) {
            return map.get(zzxu);
        }
        throw new GeneralSecurityException(a.f(zzxu.zza(), "Unable to parse OutputPrefixType: "));
    }

    /* access modifiers changed from: private */
    public static zzjh zzb(zzqd zzqd) {
        if (zzqd.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            try {
                zzun zza2 = zzun.zza(zzqd.zza().zze(), zzakk.zza());
                if (zza2.zzb() == 0) {
                    return zzjh.zzc().zza(zza2.zza()).zza(zza(zzqd.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzalf e6) {
                throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e6);
            }
        } else {
            throw new IllegalArgumentException(d.i("Wrong type URL in call to AesSivParameters.parseParameters: ", zzqd.zza().zzf()));
        }
    }

    private static zzxu zza(zzjh.zzb zzb2) {
        Map<zzjh.zzb, zzxu> map = zzf;
        if (map.containsKey(zzb2)) {
            return map.get(zzb2);
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
