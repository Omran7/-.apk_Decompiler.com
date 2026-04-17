package com.google.android.gms.internal.measurement;

import A1.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzdh extends a {
    public static final Parcelable.Creator<zzdh> CREATOR = new zzdi();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzdh(long j6, long j7, boolean z3, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j6;
        this.zzb = j7;
        this.zzc = z3;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        long j6 = this.zza;
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 8);
        parcel.writeLong(j6);
        long j7 = this.zzb;
        android.support.v4.media.session.a.Y0(parcel, 2, 8);
        parcel.writeLong(j7);
        boolean z3 = this.zzc;
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(z3 ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 4, this.zzd, false);
        android.support.v4.media.session.a.R0(parcel, 5, this.zze, false);
        android.support.v4.media.session.a.R0(parcel, 6, this.zzf, false);
        android.support.v4.media.session.a.J0(parcel, 7, this.zzg, false);
        android.support.v4.media.session.a.R0(parcel, 8, this.zzh, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
