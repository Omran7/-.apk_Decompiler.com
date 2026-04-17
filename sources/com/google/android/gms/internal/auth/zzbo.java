package com.google.android.gms.internal.auth;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.C0370y;
import com.google.android.gms.common.api.internal.C0371z;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import q1.C0933c;
import q1.C0934d;
import v1.C1040a;
import v1.C1041b;

public final class zzbo extends l {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbo(Activity activity, C0934d dVar) {
        super(activity, activity, C0933c.f11080a, dVar == null ? C0934d.f11081b : dVar, k.f6119c);
    }

    public final Task<String> getSpatulaHeader() {
        C0370y a6 = C0371z.a();
        a6.d = new zzbk(this);
        a6.f6113b = 1520;
        return doRead((C0371z) a6.a());
    }

    public final Task<C1041b> performProxyRequest(C1040a aVar) {
        C0370y a6 = C0371z.a();
        a6.d = new zzbl(this, aVar);
        a6.f6113b = 1518;
        return doWrite((C0371z) a6.a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbo(Context context, C0934d dVar) {
        super(context, (Activity) null, C0933c.f11080a, dVar == null ? C0934d.f11081b : dVar, k.f6119c);
    }
}
