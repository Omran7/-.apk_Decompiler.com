package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* renamed from: com.google.android.gms.common.api.internal.i  reason: case insensitive filesystem */
public abstract class C0355i extends zab implements C0356j {
    public C0355i() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.common.api.internal.j, com.google.android.gms.internal.base.zaa] */
    public static C0356j asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
        if (queryLocalInterface instanceof C0356j) {
            return (C0356j) queryLocalInterface;
        }
        return new zaa(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
    }

    public final boolean zaa(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 1) {
            return false;
        }
        zac.zab(parcel);
        onResult((Status) zac.zaa(parcel, Status.CREATOR));
        return true;
    }
}
