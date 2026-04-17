package com.google.android.gms.internal.auth;

import R2.b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzbc implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int c12 = b.c1(parcel);
        int i2 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
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
                pendingIntent = (PendingIntent) b.q(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        b.x(c12, parcel);
        return new zzbb(i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbb[i2];
    }
}
