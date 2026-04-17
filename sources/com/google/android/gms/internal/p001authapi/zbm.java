package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.C0350d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import q1.C0932b;

/* renamed from: com.google.android.gms.internal.auth-api.zbm  reason: invalid package */
abstract class zbm extends C0350d {
    public zbm(o oVar) {
        super(C0932b.f11078a, oVar);
    }

    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        zbo zbo = (zbo) bVar;
        zba(zbo.getContext(), (zbt) zbo.getService());
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((s) obj);
    }

    public abstract void zba(Context context, zbt zbt);
}
