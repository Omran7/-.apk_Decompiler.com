package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.internal.measurement.a;

/* renamed from: com.google.android.gms.common.api.internal.f  reason: case insensitive filesystem */
public final class C0352f extends zau {
    public final void a(t tVar, s sVar) {
        int i2 = BasePendingResult.zad;
        I.g(tVar);
        sendMessage(obtainMessage(1, new Pair(tVar, sVar)));
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            Pair pair = (Pair) message.obj;
            t tVar = (t) pair.first;
            s sVar = (s) pair.second;
            try {
                U u6 = (U) tVar;
                synchronized (u6.f6065b) {
                    if (sVar.getStatus().v()) {
                        o oVar = (o) u6.f6066c.get();
                    } else {
                        u6.a(sVar.getStatus());
                    }
                }
            } catch (RuntimeException e6) {
                BasePendingResult.zal(sVar);
                throw e6;
            }
        } else if (i2 != 2) {
            Log.wtf("BasePendingResult", a.f(i2, "Don't know how to handle message: "), new Exception());
        } else {
            ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f6005q);
        }
    }
}
