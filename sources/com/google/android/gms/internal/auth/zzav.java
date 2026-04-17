package com.google.android.gms.internal.auth;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;

public final class zzav extends a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i2, String str, int i5) {
        this.zza = 1;
        I.g(str);
        this.zzb = str;
        this.zzc = i5;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        int i5 = this.zza;
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(i5);
        android.support.v4.media.session.a.R0(parcel, 2, this.zzb, false);
        int i6 = this.zzc;
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(i6);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public zzav(String str, int i2) {
        this(1, str, i2);
    }
}
