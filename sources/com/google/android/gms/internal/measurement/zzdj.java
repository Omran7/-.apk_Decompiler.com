package com.google.android.gms.internal.measurement;

import A1.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public final class zzdj extends a {
    public static final Parcelable.Creator<zzdj> CREATOR = new zzdk();
    public final int zza;
    public final String zzb;
    public final Intent zzc;

    public zzdj(int i2, String str, Intent intent) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = intent;
    }

    public static zzdj zza(Activity activity) {
        return new zzdj(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdj)) {
            return false;
        }
        zzdj zzdj = (zzdj) obj;
        if (this.zza != zzdj.zza || !Objects.equals(this.zzb, zzdj.zzb) || !Objects.equals(this.zzc, zzdj.zzc)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i5 = this.zza;
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(i5);
        android.support.v4.media.session.a.R0(parcel, 2, this.zzb, false);
        android.support.v4.media.session.a.Q0(parcel, 3, this.zzc, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
