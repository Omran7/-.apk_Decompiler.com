package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import h0.C0552a;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznt  reason: invalid package */
public final class zznt {
    private static final Logger zza = Logger.getLogger(zznt.class.getName());
    private static final zznt zzb = new zznt();
    private ConcurrentMap<String, zzbl<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    private final synchronized zzbl<?> zzc(String str) {
        if (this.zzc.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return this.zzc.get(str);
    }

    public final <P> zzbl<P> zza(String str, Class<P> cls) {
        zzbl<?> zzc2 = zzc(str);
        if (zzc2.zza().equals(cls)) {
            return zzc2;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzc2.getClass());
        String valueOf2 = String.valueOf(zzc2.zza());
        StringBuilder u6 = C0552a.u("Primitive type ", name, " not supported by key manager of type ", valueOf, ", which only supports: ");
        u6.append(valueOf2);
        throw new GeneralSecurityException(u6.toString());
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }

    public final zzbl<?> zza(String str) {
        return zzc(str);
    }

    public static zznt zza() {
        return zzb;
    }

    private final synchronized void zza(zzbl<?> zzbl, boolean z3, boolean z4) {
        try {
            String zzb2 = zzbl.zzb();
            if (z4 && this.zzd.containsKey(zzb2)) {
                if (!this.zzd.get(zzb2).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + zzb2);
                }
            }
            zzbl zzbl2 = this.zzc.get(zzb2);
            if (zzbl2 != null) {
                if (!zzbl2.getClass().equals(zzbl.getClass())) {
                    Logger logger = zza;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + zzb2);
                    String name = zzbl2.getClass().getName();
                    String name2 = zzbl.getClass().getName();
                    throw new GeneralSecurityException("typeUrl (" + zzb2 + ") is already registered with " + name + ", cannot be re-registered with " + name2);
                }
            }
            this.zzc.putIfAbsent(zzb2, zzbl);
            this.zzd.put(zzb2, Boolean.valueOf(z4));
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized <P> void zza(zzbl<P> zzbl, boolean z3) {
        zza(zzbl, zzix.zza.ALGORITHM_NOT_FIPS, z3);
    }

    public final synchronized <P> void zza(zzbl<P> zzbl, zzix.zza zza2, boolean z3) {
        if (zza2.zza()) {
            zza((zzbl<?>) zzbl, false, z3);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
