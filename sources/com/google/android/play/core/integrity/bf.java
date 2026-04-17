package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import y2.k;
import y2.n;
import y2.p;

final class bf extends bm {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f6680a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6681b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ bn f6682c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i2, long j6, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f6682c = bnVar;
        this.f6680a = j6;
        this.f6681b = taskCompletionSource2;
    }

    public final void b() {
        if (!bn.k(this.f6682c)) {
            try {
                bn bnVar = this.f6682c;
                Bundle b6 = bn.b(bnVar, this.f6680a, 0);
                bl blVar = new bl(this.f6682c, this.f6681b);
                n nVar = (n) ((p) bnVar.f6698a.f12702n);
                nVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(nVar.f12686b);
                int i2 = k.f12707a;
                obtain.writeInt(1);
                b6.writeToParcel(obtain, 0);
                obtain.writeStrongBinder(blVar);
                nVar.a(2, obtain);
            } catch (RemoteException e6) {
                this.f6682c.f6699b.a(e6, "warmUpIntegrityToken(%s)", Long.valueOf(this.f6680a));
                this.f6681b.trySetException(new StandardIntegrityException(-100, e6));
            }
        } else {
            a(new StandardIntegrityException(-2, (Throwable) null));
        }
    }
}
