package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzfu;
import com.google.android.gms.internal.play_billing.zzfv;
import h0.C0552a;
import java.io.IOException;
import java.util.List;

public abstract class zzfv<MessageType extends zzfv<MessageType, BuilderType>, BuilderType extends zzfu<MessageType, BuilderType>> implements zzim {
    protected int zza = 0;

    public static void zzg(Iterable iterable, List list) {
        zzfu.zzc(iterable, list);
    }

    public int zze(zzix zzix) {
        throw null;
    }

    public final zzgk zzf() {
        try {
            int zzk = zzk();
            zzgk zzgk = zzgk.zzb;
            byte[] bArr = new byte[zzk];
            zzgo zzgo = new zzgo(bArr, 0, zzk);
            zzJ(zzgo);
            zzgo.zzB();
            return new zzgi(bArr);
        } catch (IOException e6) {
            throw new RuntimeException(C0552a.o("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e6);
        }
    }

    public final byte[] zzh() {
        try {
            int zzk = zzk();
            byte[] bArr = new byte[zzk];
            zzgo zzgo = new zzgo(bArr, 0, zzk);
            zzJ(zzgo);
            zzgo.zzB();
            return bArr;
        } catch (IOException e6) {
            throw new RuntimeException(C0552a.o("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }
}
