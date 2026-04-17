package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzkn;
import com.google.android.recaptcha.internal.zzko;
import h0.C0552a;
import java.io.IOException;
import java.util.List;

public abstract class zzko<MessageType extends zzko<MessageType, BuilderType>, BuilderType extends zzkn<MessageType, BuilderType>> implements zzoi {
    protected int zza = 0;

    public static void zzc(Iterable iterable, List list) {
        zzkn.zzd(iterable, list);
    }

    public int zza(zzow zzow) {
        throw null;
    }

    public final zzle zzb() {
        try {
            int zzo = zzo();
            zzle zzle = zzle.zzb;
            byte[] bArr = new byte[zzo];
            zzlk zzlk = new zzlk(bArr, 0, zzo);
            zze(zzlk);
            zzlk.zzC();
            return new zzlc(bArr);
        } catch (IOException e6) {
            throw new RuntimeException(C0552a.o("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e6);
        }
    }

    public final byte[] zzd() {
        try {
            int zzo = zzo();
            byte[] bArr = new byte[zzo];
            zzlk zzlk = new zzlk(bArr, 0, zzo);
            zze(zzlk);
            zzlk.zzC();
            return bArr;
        } catch (IOException e6) {
            throw new RuntimeException(C0552a.o("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }
}
