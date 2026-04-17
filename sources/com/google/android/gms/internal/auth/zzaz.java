package com.google.android.gms.internal.auth;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;

public final class zzaz extends a {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    public zzaz(int i2, String str, byte[] bArr) {
        this.zza = 1;
        I.g(str);
        this.zzb = str;
        I.g(bArr);
        this.zzc = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        int i5 = this.zza;
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(i5);
        android.support.v4.media.session.a.R0(parcel, 2, this.zzb, false);
        android.support.v4.media.session.a.K0(parcel, 3, this.zzc, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }
}
