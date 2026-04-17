package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaep  reason: invalid package */
public class zzaep {
    private zzaep() {
    }

    public static Object zza(String str, Type type) {
        if (type == String.class) {
            try {
                zzagl zzagl = (zzagl) new zzagl().zza(str);
                if (zzagl.zzb()) {
                    return zzagl.zza();
                }
                throw new zzaci("No error message: " + str);
            } catch (Exception e6) {
                throw new zzaci(d.i("Json conversion failed! ", e6.getMessage()), e6);
            }
        } else if (type == Void.class) {
            return null;
        } else {
            try {
                try {
                    return ((zzaer) ((Class) type).getConstructor((Class[]) null).newInstance((Object[]) null)).zza(str);
                } catch (Exception e7) {
                    throw new zzaci(d.i("Json conversion failed! ", e7.getMessage()), e7);
                }
            } catch (Exception e8) {
                throw new zzaci("Instantiation of JsonResponse failed! ".concat(String.valueOf(type)), e8);
            }
        }
    }
}
