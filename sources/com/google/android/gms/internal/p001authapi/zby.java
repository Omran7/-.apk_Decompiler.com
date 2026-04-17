package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import t1.C0986a;

/* renamed from: com.google.android.gms.internal.auth-api.zby  reason: invalid package */
public abstract class zby extends zbb implements zbz {
    public zby() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    public final boolean zba(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        zbc.zbb(parcel);
        zbb((Status) zbc.zba(parcel, Status.CREATOR), (C0986a) zbc.zba(parcel, C0986a.CREATOR));
        return true;
    }
}
