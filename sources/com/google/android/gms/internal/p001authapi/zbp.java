package com.google.android.gms.internal.p001authapi;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: com.google.android.gms.internal.auth-api.zbp  reason: invalid package */
public final class zbp extends a {
    public static final Parcelable.Creator<zbp> CREATOR = new zbq();
    private final Credential zba;

    public zbp(Credential credential) {
        this.zba = credential;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.zba, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
