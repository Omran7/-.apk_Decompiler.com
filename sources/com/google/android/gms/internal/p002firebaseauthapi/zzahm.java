package com.google.android.gms.internal.p002firebaseauthapi;

import R2.b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahm  reason: invalid package */
public final class zzahm implements Parcelable.Creator<zzahn> {
    public final Object createFromParcel(Parcel parcel) {
        int c12 = b.c1(parcel);
        String str = null;
        String str2 = null;
        Long l6 = null;
        String str3 = null;
        Long l7 = null;
        while (parcel.dataPosition() < c12) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 == 2) {
                str = b.r(readInt, parcel);
            } else if (c3 == 3) {
                str2 = b.r(readInt, parcel);
            } else if (c3 == 4) {
                l6 = b.D0(readInt, parcel);
            } else if (c3 == 5) {
                str3 = b.r(readInt, parcel);
            } else if (c3 != 6) {
                b.T0(readInt, parcel);
            } else {
                l7 = b.D0(readInt, parcel);
            }
        }
        b.x(c12, parcel);
        return new zzahn(str, str2, l6, str3, l7);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzahn[i2];
    }
}
