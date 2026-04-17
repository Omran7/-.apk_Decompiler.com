package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zau;
import z1.C1132b;

public final class T extends zau {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ U f6063a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public T(U u6, Looper looper) {
        super(looper);
        this.f6063a = u6;
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            q qVar = (q) message.obj;
            synchronized (this.f6063a.f6065b) {
                try {
                    U u6 = this.f6063a.f6064a;
                    I.g(u6);
                    if (qVar == null) {
                        u6.a(new Status(13, "Transform returned null", (PendingIntent) null, (C1132b) null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i2 != 1) {
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i2);
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
            throw runtimeException;
        }
    }
}
