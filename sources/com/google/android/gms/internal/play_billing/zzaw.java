package com.google.android.gms.internal.play_billing;

import android.os.Parcel;

public abstract class zzaw extends zzar implements zzax {
    public zzaw() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    public final boolean zzb(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        zzas.zzb(parcel);
        zza(readInt);
        return true;
    }
}
