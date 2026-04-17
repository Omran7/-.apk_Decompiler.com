package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import t1.C0992g;

/* renamed from: com.google.android.gms.internal.auth-api.zbab  reason: invalid package */
public abstract class zbab extends zbb implements zbac {
    public zbab() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    public final boolean zba(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        zbc.zbb(parcel);
        zbb((Status) zbc.zba(parcel, Status.CREATOR), (C0992g) zbc.zba(parcel, C0992g.CREATOR));
        return true;
    }
}
