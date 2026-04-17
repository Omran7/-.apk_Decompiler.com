package com.google.android.gms.internal.location;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;

public final class zzaa extends a implements s {
    public static final Parcelable.Creator<zzaa> CREATOR = new zzab();
    public static final zzaa zza = new zzaa(Status.f6002e);
    private final Status zzb;

    public zzaa(Status status) {
        this.zzb = status;
    }

    public final Status getStatus() {
        return this.zzb;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Q0(parcel, 1, this.zzb, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
