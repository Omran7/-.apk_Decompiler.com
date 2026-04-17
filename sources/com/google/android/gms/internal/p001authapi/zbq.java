package com.google.android.gms.internal.p001authapi;

import R2.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: com.google.android.gms.internal.auth-api.zbq  reason: invalid package */
public final class zbq implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int c12 = b.c1(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < c12) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.T0(readInt, parcel);
            } else {
                credential = (Credential) b.q(parcel, readInt, Credential.CREATOR);
            }
        }
        b.x(c12, parcel);
        return new zbp(credential);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zbp[i2];
    }
}
