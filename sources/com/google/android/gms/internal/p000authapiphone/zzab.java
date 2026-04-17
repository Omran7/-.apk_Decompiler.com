package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.C0370y;
import com.google.android.gms.common.api.internal.C0371z;
import com.google.android.gms.tasks.Task;
import u1.C1029a;
import z1.d;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzab  reason: invalid package */
public final class zzab extends C1029a {
    public zzab(Activity activity) {
        super(activity);
    }

    public final Task<Void> startSmsRetriever() {
        C0370y a6 = C0371z.a();
        a6.d = new zzx(this);
        a6.f6115e = new d[]{zzac.zzc};
        a6.f6113b = 1567;
        return doWrite((C0371z) a6.a());
    }

    public final Task<Void> startSmsUserConsent(String str) {
        C0370y a6 = C0371z.a();
        a6.d = new zzy(this, str);
        a6.f6115e = new d[]{zzac.zzd};
        a6.f6113b = 1568;
        return doWrite((C0371z) a6.a());
    }

    public zzab(Context context) {
        super(context);
    }
}
