package com.google.android.gms.internal.p001authapi;

import A1.c;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C0370y;
import com.google.android.gms.common.api.internal.C0371z;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import t1.C0993h;
import t1.C0996k;
import t1.C0997l;
import t1.C0998m;
import t1.C1003r;
import z1.d;

/* renamed from: com.google.android.gms.internal.auth-api.zbaw  reason: invalid package */
public final class zbaw extends l implements C0993h {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd = zbbj.zba();

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ? obj = new Object();
        zba = obj;
        zbat zbat = new zbat();
        zbb = zbat;
        zbc = new i("Auth.Api.Identity.CredentialSaving.API", zbat, obj);
    }

    public zbaw(Activity activity, C1003r rVar) {
        super(activity, activity, zbc, rVar, k.f6119c);
    }

    public final Status getStatusFromIntent(Intent intent) {
        c cVar;
        Status status = Status.f6004p;
        if (intent == null) {
            return status;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        if (byteArrayExtra == null) {
            cVar = null;
        } else {
            cVar = com.bumptech.glide.c.n(byteArrayExtra, creator);
        }
        Status status2 = (Status) cVar;
        if (status2 == null) {
            return status;
        }
        return status2;
    }

    public final Task<C0996k> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        boolean z3;
        I.g(saveAccountLinkingTokenRequest);
        new ArrayList();
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.f5959e);
        String str = this.zbd;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.f5956a;
        boolean z4 = true;
        if (pendingIntent != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("Consent PendingIntent cannot be null", z3);
        String str2 = saveAccountLinkingTokenRequest.f5957b;
        I.a("Invalid tokenType", "auth_code".equals(str2));
        String str3 = saveAccountLinkingTokenRequest.f5958c;
        I.a("serviceId cannot be null or empty", !TextUtils.isEmpty(str3));
        ArrayList arrayList = saveAccountLinkingTokenRequest.d;
        if (arrayList == null) {
            z4 = false;
        }
        I.a("scopes cannot be null", z4);
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str3, arrayList, str, saveAccountLinkingTokenRequest.f5960f);
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{zbbi.zbg};
        a6.d = new zbar(this, saveAccountLinkingTokenRequest2);
        a6.f6114c = false;
        a6.f6113b = 1535;
        return doRead((C0371z) a6.a());
    }

    public final Task<C0998m> savePassword(C0997l lVar) {
        I.g(lVar);
        C0997l lVar2 = new C0997l(lVar.f11730a, this.zbd, lVar.f11732c);
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{zbbi.zbe};
        a6.d = new zbas(this, lVar2);
        a6.f6114c = false;
        a6.f6113b = 1536;
        return doRead((C0371z) a6.a());
    }

    public zbaw(Context context, C1003r rVar) {
        super(context, (Activity) null, zbc, rVar, k.f6119c);
    }
}
