package com.google.android.gms.internal.p001authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import t1.C0996k;

/* renamed from: com.google.android.gms.internal.auth-api.zbai  reason: invalid package */
public abstract class zbai extends zbb implements zbaj {
    public zbai() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    public final boolean zba(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        zbc.zbb(parcel);
        zbb((Status) zbc.zba(parcel, Status.CREATOR), (C0996k) zbc.zba(parcel, C0996k.CREATOR));
        return true;
    }
}
