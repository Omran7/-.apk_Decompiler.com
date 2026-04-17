package com.google.android.gms.internal.auth;

import R2.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzba implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int c12 = b.c1(parcel);
        int i2 = 0;
        String str = null;
        byte[] bArr = null;
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
                bArr = b.o(readInt, parcel);
            }
        }
        b.x(c12, parcel);
        return new zzaz(i2, str, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzaz[i2];
    }
}
