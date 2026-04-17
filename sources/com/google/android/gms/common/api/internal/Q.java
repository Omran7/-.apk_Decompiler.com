package com.google.android.gms.common.api.internal;

import B1.b;
import W1.a;
import W1.c;
import W1.d;
import W1.f;
import W1.g;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.A;
import com.google.android.gms.common.internal.B;
import com.google.android.gms.common.internal.C0377f;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zac;
import java.util.Set;
import x1.C1096b;
import z1.C1132b;

public final class Q extends c implements m, n {

    /* renamed from: i  reason: collision with root package name */
    public static final b f6057i = V1.b.f3760a;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6058a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6059b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6060c = f6057i;
    public final Set d;

    /* renamed from: e  reason: collision with root package name */
    public final C0380i f6061e;

    /* renamed from: f  reason: collision with root package name */
    public a f6062f;
    public J h;

    public Q(Context context, Handler handler, C0380i iVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f6058a = context;
        this.f6059b = handler;
        this.f6061e = iVar;
        this.d = iVar.f6173a;
    }

    public final void a(int i2) {
        J j6 = this.h;
        H h6 = (H) ((C0354h) j6.f6045f).f6099j.get((C0347a) j6.f6043c);
        if (h6 == null) {
            return;
        }
        if (h6.f6034j) {
            h6.q(new C1132b(17));
        } else {
            h6.a(i2);
        }
    }

    public final void b(C1132b bVar) {
        this.h.a(bVar);
    }

    public final void j() {
        GoogleSignInAccount googleSignInAccount;
        a aVar = this.f6062f;
        aVar.getClass();
        try {
            aVar.f4062b.getClass();
            Account account = new Account(C0377f.DEFAULT_ACCOUNT, "com.google");
            if (C0377f.DEFAULT_ACCOUNT.equals(account.name)) {
                googleSignInAccount = C1096b.a(aVar.getContext()).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = aVar.d;
            I.g(num);
            A a6 = new A(2, account, num.intValue(), googleSignInAccount);
            d dVar = (d) aVar.getService();
            f fVar = new f(1, a6);
            Parcel zaa = dVar.zaa();
            zac.zac(zaa, fVar);
            zac.zad(zaa, this);
            dVar.zac(12, zaa);
        } catch (RemoteException e6) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f6059b.post(new b0(this, new g(1, new C1132b(8, (PendingIntent) null), (B) null), 3));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e6);
            }
        }
    }
}
