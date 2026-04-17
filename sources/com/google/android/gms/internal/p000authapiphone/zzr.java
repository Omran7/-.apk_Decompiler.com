package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C0370y;
import com.google.android.gms.common.api.internal.C0371z;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import z1.d;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzr  reason: invalid package */
public final class zzr extends l {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ? obj = new Object();
        zza = obj;
        zzn zzn = new zzn();
        zzb = zzn;
        zzc = new i("SmsCodeAutofill.API", zzn, obj);
    }

    public zzr(Activity activity) {
        super(activity, activity, zzc, e.g, k.f6119c);
    }

    public final Task<Integer> checkPermissionState() {
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{zzac.zza};
        a6.d = new zzk(this);
        a6.f6113b = 1564;
        return doRead((C0371z) a6.a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(String str) {
        I.g(str);
        I.a("The package name cannot be empty.", !str.isEmpty());
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{zzac.zza};
        a6.d = new zzl(this, str);
        a6.f6113b = 1565;
        return doRead((C0371z) a6.a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{zzac.zza};
        a6.d = new zzm(this);
        a6.f6113b = 1563;
        return doWrite((C0371z) a6.a());
    }

    public zzr(Context context) {
        super(context, (Activity) null, zzc, e.g, k.f6119c);
    }
}
