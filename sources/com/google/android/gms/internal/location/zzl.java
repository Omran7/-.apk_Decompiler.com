package com.google.android.gms.internal.location;

import A1.a;
import Q1.n;
import Q1.o;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class zzl extends a {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();
    final int zza;
    final zzj zzb;
    final o zzc;
    final zzai zzd;

    public zzl(int i2, zzj zzj, IBinder iBinder, IBinder iBinder2) {
        o oVar;
        this.zza = i2;
        this.zzb = zzj;
        zzai zzai = null;
        if (iBinder == null) {
            oVar = null;
        } else {
            oVar = n.zzb(iBinder);
        }
        this.zzc = oVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface instanceof zzai) {
                zzai = (zzai) queryLocalInterface;
            } else {
                zzai = new zzag(iBinder2);
            }
        }
        this.zzd = zzai;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        IBinder iBinder;
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        int i5 = this.zza;
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(i5);
        android.support.v4.media.session.a.Q0(parcel, 2, this.zzb, i2, false);
        o oVar = this.zzc;
        IBinder iBinder2 = null;
        if (oVar == null) {
            iBinder = null;
        } else {
            iBinder = oVar.asBinder();
        }
        android.support.v4.media.session.a.M0(parcel, 3, iBinder);
        zzai zzai = this.zzd;
        if (zzai != null) {
            iBinder2 = zzai.asBinder();
        }
        android.support.v4.media.session.a.M0(parcel, 4, iBinder2);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
