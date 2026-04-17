package com.google.android.gms.internal.auth;

import R2.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzbx implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int c12 = b.c1(parcel);
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < c12) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i2 = b.A0(readInt, parcel);
            } else if (c3 != 2) {
                b.T0(readInt, parcel);
            } else {
                str = b.r(readInt, parcel);
            }
        }
        b.x(c12, parcel);
        return new zzbw(i2, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbw[i2];
    }
}
