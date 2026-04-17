package com.google.android.gms.internal.measurement;

import R2.b;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzdk implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int c12 = b.c1(parcel);
        String str = null;
        int i2 = 0;
        Intent intent = null;
        while (parcel.dataPosition() < c12) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 1) {
                i2 = b.A0(readInt, parcel);
            } else if (c3 == 2) {
                str = b.r(readInt, parcel);
            } else if (c3 != 3) {
                b.T0(readInt, parcel);
            } else {
                intent = (Intent) b.q(parcel, readInt, Intent.CREATOR);
            }
        }
        b.x(c12, parcel);
        return new zzdj(i2, str, intent);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzdj[i2];
    }
}
