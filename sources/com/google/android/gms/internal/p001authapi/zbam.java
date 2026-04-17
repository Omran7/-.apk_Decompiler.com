package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C0356j;
import t1.C0991f;
import t1.C0994i;
import t1.C0995j;

/* renamed from: com.google.android.gms.internal.auth-api.zbam  reason: invalid package */
public final class zbam extends zba implements IInterface {
    public zbam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbac zbac, C0991f fVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbac);
        zbc.zbc(zba, fVar);
        zbb(1, zba);
    }

    public final void zbd(zbaf zbaf, C0994i iVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, zbaf);
        zbc.zbc(zba, iVar);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbah zbah, C0995j jVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbah);
        zbc.zbc(zba, jVar);
        zbb(3, zba);
    }

    public final void zbf(C0356j jVar, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, jVar);
        zba.writeString(str);
        zbb(2, zba);
    }
}
