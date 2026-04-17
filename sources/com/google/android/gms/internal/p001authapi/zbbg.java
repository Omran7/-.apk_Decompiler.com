package com.google.android.gms.internal.p001authapi;

import A1.c;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C0354h;
import com.google.android.gms.common.api.internal.C0370y;
import com.google.android.gms.common.api.internal.C0371z;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;
import t1.C0987b;
import t1.C0988c;
import t1.C0989d;
import t1.C0990e;
import t1.C0991f;
import t1.C0992g;
import t1.C0994i;
import t1.C0995j;
import t1.C0999n;
import t1.C1000o;
import t1.C1004s;
import z1.d;

/* renamed from: com.google.android.gms.internal.auth-api.zbbg  reason: invalid package */
public final class zbbg extends l implements C0999n {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd = zbbj.zba();

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ? obj = new Object();
        zba = obj;
        zbbb zbbb = new zbbb();
        zbb = zbbb;
        zbc = new i("Auth.Api.Identity.SignIn.API", zbbb, obj);
    }

    public zbbg(Activity activity, C1004s sVar) {
        super(activity, activity, zbc, sVar, k.f6119c);
    }

    public final Task<C0992g> beginSignIn(C0991f fVar) {
        I.g(fVar);
        C0987b bVar = fVar.f11717b;
        I.g(bVar);
        C0990e eVar = fVar.f11716a;
        I.g(eVar);
        C0989d dVar = fVar.f11720f;
        I.g(dVar);
        C0988c cVar = fVar.f11721p;
        I.g(cVar);
        C0991f fVar2 = new C0991f(eVar, bVar, this.zbd, fVar.d, fVar.f11719e, dVar, cVar);
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{zbbi.zba};
        a6.d = new zbax(this, fVar2);
        a6.f6114c = false;
        a6.f6113b = 1553;
        return doRead((C0371z) a6.a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) {
        c cVar;
        Status status = Status.f6004p;
        if (intent != null) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("status");
            if (byteArrayExtra == null) {
                cVar = null;
            } else {
                cVar = com.bumptech.glide.c.n(byteArrayExtra, creator);
            }
            Status status2 = (Status) cVar;
            if (status2 == null) {
                throw new j(Status.f6006r);
            } else if (status2.v()) {
                String stringExtra = intent.getStringExtra("phone_number_hint_result");
                if (stringExtra != null) {
                    return stringExtra;
                }
                throw new j(status);
            } else {
                throw new j(status2);
            }
        } else {
            throw new j(status);
        }
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(C0994i iVar) {
        I.g(iVar);
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{zbbi.zbh};
        a6.d = new zbba(this, iVar);
        a6.f6113b = 1653;
        return doRead((C0371z) a6.a());
    }

    public final C1000o getSignInCredentialFromIntent(Intent intent) {
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
                Parcelable.Creator<C1000o> creator2 = C1000o.CREATOR;
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
                if (byteArrayExtra2 != null) {
                    cVar2 = com.bumptech.glide.c.n(byteArrayExtra2, creator2);
                }
                C1000o oVar = (C1000o) cVar2;
                if (oVar != null) {
                    return oVar;
                }
                throw new j(status);
            } else {
                throw new j(status2);
            }
        } else {
            throw new j(status);
        }
    }

    public final Task<PendingIntent> getSignInIntent(C0995j jVar) {
        I.g(jVar);
        String str = jVar.f11724a;
        I.g(str);
        C0995j jVar2 = new C0995j(str, jVar.f11725b, this.zbd, jVar.d, jVar.f11727e, jVar.f11728f);
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{zbbi.zbf};
        a6.d = new zbay(this, jVar2);
        a6.f6113b = 1555;
        return doRead((C0371z) a6.a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = o.f6122a;
        synchronized (set) {
        }
        Iterator it2 = set.iterator();
        if (!it2.hasNext()) {
            C0354h.a();
            C0370y a6 = C0371z.a();
            a6.f6115e = new d[]{zbbi.zbb};
            a6.d = new zbaz(this);
            a6.f6114c = false;
            a6.f6113b = 1554;
            return doWrite((C0371z) a6.a());
        }
        ((o) it2.next()).getClass();
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void zba(C0994i iVar, zbbh zbbh, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbh.getService()).zbd(new zbbf(this, taskCompletionSource), iVar, this.zbd);
    }

    public final /* synthetic */ void zbb(zbbh zbbh, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbh.getService()).zbf(new zbbd(this, taskCompletionSource), this.zbd);
    }

    public zbbg(Context context, C1004s sVar) {
        super(context, (Activity) null, zbc, sVar, k.f6119c);
    }
}
