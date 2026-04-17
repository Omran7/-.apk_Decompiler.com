package com.google.android.gms.internal.p001authapi;

import A1.c;
import android.accounts.Account;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C0370y;
import com.google.android.gms.common.api.internal.C0371z;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import t1.C0986a;
import t1.C1002q;
import z1.d;

/* renamed from: com.google.android.gms.internal.auth-api.zbaq  reason: invalid package */
public final class zbaq extends l {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ? obj = new Object();
        zba = obj;
        zbao zbao = new zbao();
        zbb = zbao;
        zbc = new i("Auth.Api.Identity.Authorization.API", zbao, obj);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zbaq(android.app.Activity r7, t1.C1002q r8) {
        /*
            r6 = this;
            com.google.android.gms.common.api.i r3 = zbc
            java.lang.String r8 = r8.f11744a
            if (r8 == 0) goto L_0x0009
            com.google.android.gms.common.internal.I.d(r8)
        L_0x0009:
            java.lang.String r8 = com.google.android.gms.internal.p001authapi.zbbj.zba()
            com.google.android.gms.common.internal.I.d(r8)
            t1.q r4 = new t1.q
            r4.<init>(r8)
            com.google.android.gms.common.api.k r5 = com.google.android.gms.common.api.k.f6119c
            r0 = r6
            r1 = r7
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001authapi.zbaq.<init>(android.app.Activity, t1.q):void");
    }

    public final Task<C0986a> authorize(AuthorizationRequest authorizationRequest) {
        boolean z3;
        String str;
        Account account;
        boolean z4;
        boolean z5;
        boolean z6;
        String str2;
        boolean z7;
        I.g(authorizationRequest);
        ArrayList arrayList = authorizationRequest.f5949a;
        if (arrayList == null || arrayList.isEmpty()) {
            z3 = false;
        } else {
            z3 = true;
        }
        I.a("requestedScopes cannot be null or empty", z3);
        String str3 = null;
        String str4 = authorizationRequest.f5953f;
        if (str4 != null) {
            I.d(str4);
            str = str4;
        } else {
            str = null;
        }
        Account account2 = authorizationRequest.f5952e;
        if (account2 != null) {
            account = account2;
        } else {
            account = null;
        }
        boolean z8 = authorizationRequest.d;
        String str5 = authorizationRequest.f5950b;
        if (!z8 || str5 == null) {
            z4 = false;
        } else {
            z4 = true;
            str3 = str5;
        }
        if (!authorizationRequest.f5951c || str5 == null) {
            z6 = false;
            z5 = false;
            str2 = str3;
        } else {
            if (str3 == null || str3.equals(str5)) {
                z7 = true;
            } else {
                z7 = false;
            }
            I.a("two different server client ids provided", z7);
            z5 = authorizationRequest.f5955q;
            str2 = str5;
            z6 = true;
        }
        AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(arrayList, str2, z6, z4, account, str, ((C1002q) getApiOptions()).f11744a, z5);
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{zbbi.zbc};
        a6.d = new zban(this, authorizationRequest2);
        a6.f6114c = false;
        a6.f6113b = 1534;
        return doRead((C0371z) a6.a());
    }

    public final C0986a getAuthorizationResultFromIntent(Intent intent) {
        c cVar;
        Status status = Status.f6004p;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            c cVar2 = null;
            if (byteArrayExtra == null) {
                cVar = null;
            } else {
                cVar = com.bumptech.glide.c.n(byteArrayExtra, creator);
            }
            Status status2 = (Status) cVar;
            if (status2 == null) {
                throw new j(Status.f6006r);
            } else if (status2.v()) {
                Parcelable.Creator<C0986a> creator2 = C0986a.CREATOR;
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("authorization_result");
                if (byteArrayExtra2 != null) {
                    cVar2 = com.bumptech.glide.c.n(byteArrayExtra2, creator2);
                }
                C0986a aVar = (C0986a) cVar2;
                if (aVar != null) {
                    return aVar;
                }
                throw new j(status);
            } else {
                throw new j(status2);
            }
        } else {
            throw new j(status);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zbaq(android.content.Context r7, t1.C1002q r8) {
        /*
            r6 = this;
            com.google.android.gms.common.api.i r3 = zbc
            java.lang.String r8 = r8.f11744a
            if (r8 == 0) goto L_0x0009
            com.google.android.gms.common.internal.I.d(r8)
        L_0x0009:
            java.lang.String r8 = com.google.android.gms.internal.p001authapi.zbbj.zba()
            com.google.android.gms.common.internal.I.d(r8)
            t1.q r4 = new t1.q
            r4.<init>(r8)
            com.google.android.gms.common.api.k r5 = com.google.android.gms.common.api.k.f6119c
            r2 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001authapi.zbaq.<init>(android.content.Context, t1.q):void");
    }
}
