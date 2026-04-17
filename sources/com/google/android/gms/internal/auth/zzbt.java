package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.K;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.I;
import v1.C1040a;

public final class zzbt {
    public final q getSpatulaHeader(o oVar) {
        I.g(oVar);
        return ((K) oVar).f6046b.doWrite(new zzbs(this, oVar));
    }

    public final q performProxyRequest(o oVar, C1040a aVar) {
        I.g(oVar);
        I.g(aVar);
        return ((K) oVar).f6046b.doWrite(new zzbq(this, oVar, aVar));
    }
}
