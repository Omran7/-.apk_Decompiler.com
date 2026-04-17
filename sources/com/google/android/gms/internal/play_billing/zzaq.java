package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzaq implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public zzaq(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zzu() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    public final Parcel zzv(int i2, Parcel parcel) {
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

    public final void zzw(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void zzx(int i2, Parcel parcel) {
        try {
            this.zza.transact(i2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
