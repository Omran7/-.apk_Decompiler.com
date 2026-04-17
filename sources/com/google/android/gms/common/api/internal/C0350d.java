package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.I;
import z1.C1132b;

/* renamed from: com.google.android.gms.common.api.internal.d  reason: case insensitive filesystem */
public abstract class C0350d extends BasePendingResult implements C0351e {
    private final i api;
    private final c clientKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0350d(i iVar, o oVar) {
        super(oVar);
        I.h(oVar, "GoogleApiClient must not be null");
        I.h(iVar, "Api must not be null");
        this.clientKey = iVar.f6011b;
        this.api = iVar;
    }

    public abstract void doExecute(b bVar);

    public final i getApi() {
        return this.api;
    }

    public final c getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(s sVar) {
    }

    public final void run(b bVar) {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e6) {
            setFailedResult(new Status(8, e6.getLocalizedMessage(), (PendingIntent) null, (C1132b) null));
            throw e6;
        } catch (RemoteException e7) {
            setFailedResult(new Status(8, e7.getLocalizedMessage(), (PendingIntent) null, (C1132b) null));
        }
    }

    public final void setFailedResult(Status status) {
        I.a("Failed result must not be success", !status.v());
        s createFailedResult = createFailedResult(status);
        setResult(createFailedResult);
        onSetFailedResult(createFailedResult);
    }
}
