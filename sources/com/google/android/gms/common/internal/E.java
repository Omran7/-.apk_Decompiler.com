package com.google.android.gms.common.internal;

import a.C0251c;
import android.os.IBinder;
import android.os.Parcel;

public final class E implements C0388q {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f6137a;

    public E(IBinder iBinder) {
        this.f6137a = iBinder;
    }

    public final void a(L l6, C0382k kVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(l6.asBinder());
            obtain.writeInt(1);
            C0251c.a(kVar, obtain, 0);
            this.f6137a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f6137a;
    }
}
