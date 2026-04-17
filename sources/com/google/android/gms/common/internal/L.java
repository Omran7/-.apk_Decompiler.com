package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public final class L extends zzb {

    /* renamed from: a  reason: collision with root package name */
    public C0377f f6144a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6145b;

    public L(C0377f fVar, int i2) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f6144a = fVar;
        this.f6145b = i2;
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        int i6 = this.f6145b;
        if (i2 == 1) {
            zzc.zzb(parcel);
            I.h(this.f6144a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f6144a.onPostInitHandler(parcel.readInt(), parcel.readStrongBinder(), (Bundle) zzc.zza(parcel, Bundle.CREATOR), i6);
            this.f6144a = null;
        } else if (i2 == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i2 != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            P p6 = (P) zzc.zza(parcel, P.CREATOR);
            zzc.zzb(parcel);
            C0377f fVar = this.f6144a;
            I.h(fVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            I.g(p6);
            C0377f.zzj(fVar, p6);
            Bundle bundle2 = p6.f6148a;
            I.h(this.f6144a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f6144a.onPostInitHandler(readInt, readStrongBinder, bundle2, i6);
            this.f6144a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
