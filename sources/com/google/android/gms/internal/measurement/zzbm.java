package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzbm implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public zzbm(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    public final Parcel zzb(int i2, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.zza.transact(i2, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e6) {
            throw e6;
        } finally {
            parcel.recycle();
        }
    }

    public final void zzc(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void zzd(int i2, Parcel parcel) {
        try {
            this.zza.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
