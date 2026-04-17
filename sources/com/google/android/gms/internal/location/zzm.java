package com.google.android.gms.internal.location;

import R2.b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzm implements Parcelable.Creator<zzl> {
    public final Object createFromParcel(Parcel parcel) {
        int c12 = b.c1(parcel);
        zzj zzj = null;
        int i2 = 1;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < c12) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i2 = b.A0(readInt, parcel);
            } else if (c3 == 2) {
                zzj = (zzj) b.q(parcel, readInt, zzj.CREATOR);
            } else if (c3 == 3) {
                iBinder = b.z0(readInt, parcel);
            } else if (c3 != 4) {
                b.T0(readInt, parcel);
            } else {
                iBinder2 = b.z0(readInt, parcel);
            }
        }
        b.x(c12, parcel);
        return new zzl(i2, zzj, iBinder, iBinder2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new zzl[i2];
    }
}
