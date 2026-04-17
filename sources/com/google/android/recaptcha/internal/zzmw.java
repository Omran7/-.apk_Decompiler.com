package com.google.android.recaptcha.internal;

final class zzmw implements zzog {
    private static final zzmw zza = new zzmw();

    private zzmw() {
    }

    public static zzmw zza() {
        return zza;
    }

    public final zzof zzb(Class cls) {
        Class<zznd> cls2 = zznd.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzof) zznd.zzu(cls.asSubclass(cls2)).zzh(3, (Object) null, (Object) null);
            } catch (Exception e6) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
    }

    public final boolean zzc(Class cls) {
        return zznd.class.isAssignableFrom(cls);
    }
}
