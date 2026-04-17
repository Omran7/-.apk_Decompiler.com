package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.K;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.I;
import q1.C0932b;
import s1.C0961a;

/* renamed from: com.google.android.gms.internal.auth-api.zbl  reason: invalid package */
public final class zbl {
    public final q delete(o oVar, Credential credential) {
        I.h(oVar, "client must not be null");
        I.h(credential, "credential must not be null");
        return ((K) oVar).f6046b.doWrite(new zbi(this, oVar, credential));
    }

    public final q disableAutoSignIn(o oVar) {
        I.h(oVar, "client must not be null");
        return ((K) oVar).f6046b.doWrite(new zbj(this, oVar));
    }

    public final PendingIntent getHintPickerIntent(o oVar, HintRequest hintRequest) {
        I.h(oVar, "client must not be null");
        I.h(hintRequest, "request must not be null");
        i iVar = C0932b.f11078a;
        throw new UnsupportedOperationException();
    }

    public final q request(o oVar, C0961a aVar) {
        I.h(oVar, "client must not be null");
        I.h(aVar, "request must not be null");
        return ((K) oVar).f6046b.doRead(new zbg(this, oVar, aVar));
    }

    public final q save(o oVar, Credential credential) {
        I.h(oVar, "client must not be null");
        I.h(credential, "credential must not be null");
        return ((K) oVar).f6046b.doWrite(new zbh(this, oVar, credential));
    }
}
