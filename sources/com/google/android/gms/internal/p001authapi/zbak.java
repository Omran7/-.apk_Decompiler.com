package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import t1.C0998m;

/* renamed from: com.google.android.gms.internal.auth-api.zbak  reason: invalid package */
public abstract class zbak extends zbb implements zbal {
    public zbak() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    public final boolean zba(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        zbc.zbb(parcel);
        zbb((Status) zbc.zba(parcel, Status.CREATOR), (C0998m) zbc.zba(parcel, C0998m.CREATOR));
        return true;
    }
}
