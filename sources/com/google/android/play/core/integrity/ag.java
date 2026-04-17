package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import y2.C1109A;
import y2.k;
import y2.s;
import y2.u;

final class ag extends C1109A {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Bundle f6634a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f6635b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6636c;
    final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ aj f6637e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i2) {
        super(taskCompletionSource);
        this.f6637e = ajVar;
        this.f6634a = bundle;
        this.f6635b = activity;
        this.f6636c = taskCompletionSource2;
        this.d = i2;
    }

    public final void b() {
        try {
            aj ajVar = this.f6637e;
            Bundle bundle = this.f6634a;
            as a6 = ajVar.d.a(this.f6635b, this.f6636c, ajVar.f6642a);
            s sVar = (s) ((u) ajVar.f6642a.f12702n);
            sVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(sVar.f12686b);
            int i2 = k.f12707a;
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(a6);
            sVar.a(3, obtain);
        } catch (RemoteException e6) {
            this.f6637e.f6643b.a(e6, "requestAndShowDialog(%s)", Integer.valueOf(this.d));
            this.f6636c.trySetException(new IntegrityServiceException(-100, e6));
        }
    }
}
