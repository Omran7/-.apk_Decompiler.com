package com.google.android.gms.internal.auth;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzbw extends a {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    final int zza;
    String zzb;

    public zzbw() {
        this.zza = 1;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        int i5 = this.zza;
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(i5);
        android.support.v4.media.session.a.R0(parcel, 2, this.zzb, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }

    public zzbw(int i2, String str) {
        this.zza = i2;
        this.zzb = str;
    }
}
