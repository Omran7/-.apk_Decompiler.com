package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzao extends zzar implements zzap {
    public zzao() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    public final boolean zzb(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        zzas.zzb(parcel);
        zza((Bundle) zzas.zza(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
