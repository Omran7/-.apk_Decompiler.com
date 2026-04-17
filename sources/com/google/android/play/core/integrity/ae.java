package com.google.android.play.core.integrity;

import android.os.IBinder;
import android.os.IInterface;
import y2.C1110a;
import y2.D;
import y2.t;
import y2.u;

public final /* synthetic */ class ae implements D {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ ae f6629a = new ae();

    private /* synthetic */ ae() {
    }

    public final Object a(IBinder iBinder) {
        int i2 = t.h;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        if (queryLocalInterface instanceof u) {
            return (u) queryLocalInterface;
        }
        return new C1110a(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }
}
