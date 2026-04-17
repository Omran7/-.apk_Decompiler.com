package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzaf extends zzar implements zzag {
    public zzaf() {
        super("com.android.vending.billing.IInAppBillingGetExternalPaymentDialogIntentCallback");
    }

    public final boolean zzb(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        zzas.zzb(parcel);
        zza((Bundle) zzas.zza(parcel, Bundle.CREATOR));
        return true;
    }
}
