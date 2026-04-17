package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaje;
import com.google.android.gms.internal.p002firebaseauthapi.zzajf;
import h0.C0552a;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajf  reason: invalid package */
public abstract class zzajf<MessageType extends zzajf<MessageType, BuilderType>, BuilderType extends zzaje<MessageType, BuilderType>> implements zzamc {
    protected int zza = 0;

    public final zzajp a_() {
        try {
            zzaju zzc = zzajp.zzc(zzl());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e6) {
            throw new RuntimeException(C0552a.o("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e6);
        }
    }

    public int zza(zzamv zzamv) {
        int zzi = zzi();
        if (zzi != -1) {
            return zzi;
        }
        int zza2 = zzamv.zza(this);
        zzb(zza2);
        return zza2;
    }

    public void zzb(int i2) {
        throw new UnsupportedOperationException();
    }

    public int zzi() {
        throw new UnsupportedOperationException();
    }

    public final byte[] zzk() {
        try {
            byte[] bArr = new byte[zzl()];
            zzakg zzb = zzakg.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e6) {
            throw new RuntimeException(C0552a.o("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }

    public final void zza(OutputStream outputStream) {
        zzakg zza2 = zzakg.zza(outputStream, zzakg.zzf(zzl()));
        zza(zza2);
        zza2.zzc();
    }
}
