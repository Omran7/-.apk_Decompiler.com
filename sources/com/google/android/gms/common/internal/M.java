package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class M implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f6146a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0377f f6147b;

    public M(C0377f fVar, int i2) {
        this.f6147b = fVar;
        this.f6146a = i2;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0388q qVar;
        C0377f fVar = this.f6147b;
        if (iBinder == null) {
            C0377f.zzk(fVar, 16);
            return;
        }
        synchronized (fVar.zzq) {
            try {
                C0377f fVar2 = this.f6147b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof C0388q)) {
                    qVar = new E(iBinder);
                } else {
                    qVar = (C0388q) queryLocalInterface;
                }
                fVar2.zzr = qVar;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f6147b.zzl(0, (Bundle) null, this.f6146a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6147b.zzq) {
            this.f6147b.zzr = null;
        }
        C0377f fVar = this.f6147b;
        int i2 = this.f6146a;
        Handler handler = fVar.zzb;
        handler.sendMessage(handler.obtainMessage(6, i2, 1));
    }
}
