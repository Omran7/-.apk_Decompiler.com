package com.google.android.gms.common.internal;

import J1.a;
import J1.b;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;

public final class Y extends zza implements D {
    public final int zzc() {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final a zzd() {
        Parcel zzB = zzB(1, zza());
        a a6 = b.a(zzB.readStrongBinder());
        zzB.recycle();
        return a6;
    }
}
