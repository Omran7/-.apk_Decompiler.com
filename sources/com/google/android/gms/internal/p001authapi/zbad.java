package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import t1.C0997l;

/* renamed from: com.google.android.gms.internal.auth-api.zbad  reason: invalid package */
public final class zbad extends zba implements IInterface {
    public zbad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbaj zbaj, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbaj);
        zbc.zbc(zba, saveAccountLinkingTokenRequest);
        zbb(1, zba);
    }

    public final void zbd(zbal zbal, C0997l lVar) {
        Parcel zba = zba();
        zbc.zbd(zba, zbal);
        zbc.zbc(zba, lVar);
        zbb(2, zba);
    }
}
