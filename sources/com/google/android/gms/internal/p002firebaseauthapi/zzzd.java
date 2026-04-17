package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzzj;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzd  reason: invalid package */
public final class zzzd<T_WRAPPER extends zzzj<JcePrimitiveT>, JcePrimitiveT> {
    public static final zzzd<zzzm, Cipher> zza = new zzzd<>(new zzzm());
    public static final zzzd<zzzq, Mac> zzb = new zzzd<>(new zzzq());
    public static final zzzd<zzzl, KeyAgreement> zzc = new zzzd<>(new zzzl());
    public static final zzzd<zzzn, KeyPairGenerator> zzd = new zzzd<>(new zzzn());
    public static final zzzd<zzzo, KeyFactory> zze = new zzzd<>(new zzzo());
    private final zzzh<JcePrimitiveT> zzf;

    static {
        new zzzd(new zzzs());
        new zzzd(new zzzp());
    }

    private zzzd(T_WRAPPER t_wrapper) {
        if (zzix.zzb()) {
            this.zzf = new zzzi(t_wrapper);
        } else if (zzaaa.zza()) {
            this.zzf = new zzzg(t_wrapper);
        } else {
            this.zzf = new zzzf(t_wrapper);
        }
    }

    public final JcePrimitiveT zza(String str) {
        return this.zzf.zza(str);
    }

    public static List<Provider> zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String provider : strArr) {
            Provider provider2 = Security.getProvider(provider);
            if (provider2 != null) {
                arrayList.add(provider2);
            }
        }
        return arrayList;
    }
}
