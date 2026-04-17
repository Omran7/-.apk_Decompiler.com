package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.C0353g;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0380i;

final class zzv extends a {
    public final /* synthetic */ g buildClient(Context context, Looper looper, C0380i iVar, Object obj, C0353g gVar, r rVar) {
        d dVar = (d) obj;
        return new zzi(context, looper, iVar, gVar, rVar);
    }
}
