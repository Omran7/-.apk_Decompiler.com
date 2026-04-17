package com.google.android.play.core.integrity;

import android.os.IBinder;
import android.os.IInterface;
import y2.C1110a;
import y2.D;
import y2.o;
import y2.p;

public final /* synthetic */ class bd implements D {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ bd f6677a = new bd();

    private /* synthetic */ bd() {
    }

    public final Object a(IBinder iBinder) {
        int i2 = o.h;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        if (queryLocalInterface instanceof p) {
            return (p) queryLocalInterface;
        }
        return new C1110a(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }
}
