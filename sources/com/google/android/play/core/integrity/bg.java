package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import y2.k;
import y2.n;
import y2.p;

final class bg extends bm {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6683a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f6684b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f6685c;
    final /* synthetic */ TaskCompletionSource d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ bn f6686e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i2, String str, long j6, long j7, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f6686e = bnVar;
        this.f6683a = str;
        this.f6684b = j6;
        this.f6685c = j7;
        this.d = taskCompletionSource2;
    }

    public final void b() {
        if (!bn.k(this.f6686e)) {
            try {
                bn bnVar = this.f6686e;
                Bundle a6 = bn.a(bnVar, this.f6683a, this.f6684b, this.f6685c, 0);
                bk bkVar = new bk(this.f6686e, this.d, this.f6684b);
                n nVar = (n) ((p) bnVar.f6698a.f12702n);
                nVar.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(nVar.f12686b);
                int i2 = k.f12707a;
                obtain.writeInt(1);
                a6.writeToParcel(obtain, 0);
                obtain.writeStrongBinder(bkVar);
                nVar.a(3, obtain);
            } catch (RemoteException e6) {
                this.f6686e.f6699b.a(e6, "requestExpressIntegrityToken(%s, %s)", this.f6683a, Long.valueOf(this.f6684b));
                this.d.trySetException(new StandardIntegrityException(-100, e6));
            }
        } else {
            a(new StandardIntegrityException(-2, (Throwable) null));
        }
    }
}
