package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import y2.C1113d;
import y2.k;
import y2.n;
import y2.p;

final class bh extends bm {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Bundle f6687a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f6688b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6689c;
    final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ bn f6690e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i2) {
        super(bnVar, taskCompletionSource);
        this.f6690e = bnVar;
        this.f6687a = bundle;
        this.f6688b = activity;
        this.f6689c = taskCompletionSource2;
        this.d = i2;
    }

    public final void b() {
        if (bn.k(this.f6690e)) {
            a(new StandardIntegrityException(-2, (Throwable) null));
            return;
        }
        try {
            bn bnVar = this.f6690e;
            C1113d dVar = bnVar.f6698a;
            Bundle bundle = this.f6687a;
            as a6 = bnVar.f6701e.a(this.f6688b, this.f6689c, dVar);
            n nVar = (n) ((p) dVar.f12702n);
            nVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(nVar.f12686b);
            int i2 = k.f12707a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a6);
            nVar.a(6, obtain);
        } catch (RemoteException e6) {
            this.f6690e.f6699b.a(e6, "requestAndShowDialog(%s)", Integer.valueOf(this.d));
            this.f6689c.trySetException(new StandardIntegrityException(-100, e6));
        }
    }
}
