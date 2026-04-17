package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

public abstract class zzab extends zzar implements zzac {
    public zzab() {
        super("com.android.vending.billing.IInAppBillingGetAlternativeBillingOnlyDialogIntentCallback");
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
