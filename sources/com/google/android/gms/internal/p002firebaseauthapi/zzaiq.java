package com.google.android.gms.internal.p002firebaseauthapi;

import R2.b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaiq  reason: invalid package */
public final class zzaiq implements Parcelable.Creator<zzair> {
    public final Object createFromParcel(Parcel parcel) {
        int c12 = b.c1(parcel);
        while (parcel.dataPosition() < c12) {
            b.T0(parcel.readInt(), parcel);
        }
        b.x(c12, parcel);
        return new zzair();
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzair[i2];
    }
}
