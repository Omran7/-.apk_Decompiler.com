package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import z1.C1132b;

public final class N extends C {
    public final IBinder g;
    public final /* synthetic */ C0377f h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public N(C0377f fVar, int i2, IBinder iBinder, Bundle bundle) {
        super(fVar, i2, bundle);
        this.h = fVar;
        this.g = iBinder;
    }

    public final void a(C1132b bVar) {
        C0377f fVar = this.h;
        if (fVar.zzx != null) {
            fVar.zzx.b(bVar);
        }
        fVar.onConnectionFailed(bVar);
    }

    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            I.g(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            C0377f fVar = this.h;
            if (!fVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = fVar.getServiceDescriptor();
                Log.w("GmsClient", "service descriptor mismatch: " + serviceDescriptor + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface createServiceInterface = fVar.createServiceInterface(iBinder);
            if (createServiceInterface == null || (!C0377f.zzn(fVar, 2, 4, createServiceInterface) && !C0377f.zzn(fVar, 3, 4, createServiceInterface))) {
                return false;
            }
            fVar.zzC = null;
            Bundle connectionHint = fVar.getConnectionHint();
            if (fVar.zzw == null) {
                return true;
            }
            fVar.zzw.d(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
