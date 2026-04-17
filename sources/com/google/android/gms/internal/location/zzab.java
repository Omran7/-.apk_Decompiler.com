package com.google.android.gms.internal.location;

import R2.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

public final class zzab implements Parcelable.Creator<zzaa> {
    public final Object createFromParcel(Parcel parcel) {
        int c12 = b.c1(parcel);
        Status status = null;
        while (parcel.dataPosition() < c12) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.T0(readInt, parcel);
            } else {
                status = (Status) b.q(parcel, readInt, Status.CREATOR);
            }
        }
        b.x(c12, parcel);
        return new zzaa(status);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new zzaa[i2];
    }
}
