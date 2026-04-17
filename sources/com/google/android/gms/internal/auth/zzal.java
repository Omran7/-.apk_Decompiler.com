package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.K;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import p1.C0907a;
import z1.C1132b;

public final class zzal {
    /* access modifiers changed from: private */
    public static final Status zza = new Status(13, (String) null, (PendingIntent) null, (C1132b) null);

    public final q addWorkAccount(o oVar, String str) {
        return ((K) oVar).f6046b.doWrite(new zzae(this, C0907a.f10972a, oVar, str));
    }

    public final q removeWorkAccount(o oVar, Account account) {
        return ((K) oVar).f6046b.doWrite(new zzag(this, C0907a.f10972a, oVar, account));
    }

    public final void setWorkAuthenticatorEnabled(o oVar, boolean z3) {
        setWorkAuthenticatorEnabledWithResult(oVar, z3);
    }

    public final q setWorkAuthenticatorEnabledWithResult(o oVar, boolean z3) {
        return ((K) oVar).f6046b.doWrite(new zzac(this, C0907a.f10972a, oVar, z3));
    }
}
