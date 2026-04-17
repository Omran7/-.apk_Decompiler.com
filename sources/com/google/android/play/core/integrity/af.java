package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import y2.C1109A;
import y2.e;
import y2.k;
import y2.s;
import y2.u;

final class af extends C1109A {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f6630a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Long f6631b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f6632c;
    final /* synthetic */ IntegrityTokenRequest d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ aj f6633e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l6, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f6633e = ajVar;
        this.f6630a = bArr;
        this.f6631b = l6;
        this.f6632c = taskCompletionSource2;
        this.d = integrityTokenRequest;
    }

    public final void a(Exception exc) {
        if (exc instanceof e) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    public final void b() {
        try {
            aj ajVar = this.f6633e;
            Bundle a6 = aj.a(ajVar, this.f6630a, this.f6631b, (Parcelable) null);
            ai aiVar = new ai(this.f6633e, this.f6632c);
            s sVar = (s) ((u) ajVar.f6642a.f12702n);
            sVar.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(sVar.f12686b);
            int i2 = k.f12707a;
            obtain.writeInt(1);
            a6.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aiVar);
            sVar.a(2, obtain);
        } catch (RemoteException e6) {
            this.f6633e.f6643b.a(e6, "requestIntegrityToken(%s)", this.d);
            this.f6632c.trySetException(new IntegrityServiceException(-100, e6));
        }
    }
}
