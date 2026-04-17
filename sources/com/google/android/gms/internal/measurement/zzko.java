package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzko;
import h0.C0552a;
import java.io.IOException;
import java.util.List;

public abstract class zzko<MessageType extends zzko<MessageType, BuilderType>, BuilderType extends zzkn<MessageType, BuilderType>> implements zznh {
    protected int zza = 0;

    public static void zzcc(Iterable iterable, List list) {
        zzkn.zzaW(iterable, list);
    }

    public int zzca(zzns zzns) {
        throw null;
    }

    public final zzld zzcb() {
        try {
            int zzcf = zzcf();
            zzld zzld = zzld.zzb;
            byte[] bArr = new byte[zzcf];
            int i2 = zzlk.zzb;
            zzlh zzlh = new zzlh(bArr, 0, zzcf);
            zzcB(zzlh);
            zzlh.zzB();
            return new zzlb(bArr);
        } catch (IOException e6) {
            throw new RuntimeException(C0552a.o("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e6);
        }
    }

    public final byte[] zzcd() {
        try {
            int zzcf = zzcf();
            byte[] bArr = new byte[zzcf];
            int i2 = zzlk.zzb;
            zzlh zzlh = new zzlh(bArr, 0, zzcf);
            zzcB(zzlh);
            zzlh.zzB();
            return bArr;
        } catch (IOException e6) {
            throw new RuntimeException(C0552a.o("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }
}
