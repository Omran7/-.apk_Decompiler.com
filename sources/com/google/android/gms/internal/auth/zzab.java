package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
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
import com.google.android.gms.tasks.TaskCompletionSource;
import o1.C0892b;
import o1.C0894d;
import z1.d;

final class zzab extends l implements zzg {
    private static final h zza;
    private static final a zzb;
    private static final i zzc;
    private static final C1.a zzd = new C1.a("Auth", "GoogleAuthServiceClient");
    private final Context zze;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ? obj = new Object();
        zza = obj;
        zzv zzv = new zzv();
        zzb = zzv;
        zzc = new i("GoogleAuthService.API", zzv, obj);
    }

    public zzab(Context context) {
        super(context, (Activity) null, zzc, e.g, k.f6119c);
        this.zze = context;
    }

    public static void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        boolean z3;
        if (status.v()) {
            z3 = taskCompletionSource.trySetResult(obj);
        } else {
            z3 = taskCompletionSource.trySetException(I.k(status));
        }
        if (!z3) {
            zzd.f("The task is already complete.", new Object[0]);
        }
    }

    public final Task zza(zzbw zzbw) {
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{C0894d.f10436c};
        a6.d = new zzt(this, zzbw);
        a6.f6113b = 1513;
        return doWrite((C0371z) a6.a());
    }

    public final Task zzb(C0892b bVar) {
        I.h(bVar, "request cannot be null.");
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{C0894d.f10435b};
        a6.d = new zzu(this, bVar);
        a6.f6113b = 1515;
        return doWrite((C0371z) a6.a());
    }

    public final Task zzc(Account account, String str, Bundle bundle) {
        I.h(account, "Account name cannot be null!");
        I.e(str, "Scope cannot be null!");
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{C0894d.f10436c};
        a6.d = new zzs(this, account, str, bundle);
        a6.f6113b = 1512;
        return doWrite((C0371z) a6.a());
    }

    public final Task zzd(Account account) {
        I.h(account, "account cannot be null.");
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{C0894d.f10435b};
        a6.d = new zzr(this, account);
        a6.f6113b = 1517;
        return doWrite((C0371z) a6.a());
    }

    public final Task zze(String str) {
        I.h(str, "Client package name cannot be null!");
        C0370y a6 = C0371z.a();
        a6.f6115e = new d[]{C0894d.f10435b};
        a6.d = new zzq(this, str);
        a6.f6113b = 1514;
        return doWrite((C0371z) a6.a());
    }
}
