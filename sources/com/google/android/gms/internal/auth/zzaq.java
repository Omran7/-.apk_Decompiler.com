package com.google.android.gms.internal.auth;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;

public final class zzaq extends a {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    final int zza;
    public final String zzb;

    public zzaq(int i2, String str) {
        this.zza = 1;
        I.g(str);
        this.zzb = str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        int i5 = this.zza;
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(i5);
        android.support.v4.media.session.a.R0(parcel, 2, this.zzb, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public zzaq(String str) {
        this(1, str);
    }
}
