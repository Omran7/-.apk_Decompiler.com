package x1;

import C1.a;
import G1.c;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import androidx.emoji2.text.v;
import androidx.fragment.app.D;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.K;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.p001authapi.zbb;
import com.google.android.gms.tasks.TaskCompletionSource;
import h0.C0552a;
import q1.C0932b;
import z1.C1132b;

public final class l extends zbb {

    /* renamed from: a  reason: collision with root package name */
    public final RevocationBoundService f12554a;

    public l(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f12554a = revocationBoundService;
    }

    public final void a() {
        if (!c.e(this.f12554a, Binder.getCallingUid())) {
            throw new SecurityException(C0552a.k(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }

    public final boolean zba(int i2, Parcel parcel, Parcel parcel2, int i5) {
        boolean z3;
        BasePendingResult basePendingResult;
        boolean z4;
        BasePendingResult basePendingResult2;
        RevocationBoundService revocationBoundService = this.f12554a;
        if (i2 == 1) {
            a();
            C1096b a6 = C1096b.a(revocationBoundService);
            GoogleSignInAccount b6 = a6.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f5973t;
            if (b6 != null) {
                googleSignInOptions = a6.c();
            }
            GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
            I.g(googleSignInOptions2);
            com.google.android.gms.common.api.l lVar = new com.google.android.gms.common.api.l(this.f12554a, (Activity) null, C0932b.f11079b, googleSignInOptions2, new k(new D(10), Looper.getMainLooper()));
            if (b6 != null) {
                o asGoogleApiClient = lVar.asGoogleApiClient();
                Context applicationContext = lVar.getApplicationContext();
                if (lVar.c() == 3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h.f12550a.a("Revoking access", new Object[0]);
                String e6 = C1096b.a(applicationContext).e("refreshToken");
                h.a(applicationContext);
                if (!z4) {
                    basePendingResult2 = ((K) asGoogleApiClient).f6046b.doWrite(new g(asGoogleApiClient, 1));
                } else if (e6 == null) {
                    a aVar = c.f12536c;
                    Status status = new Status(4, (String) null, (PendingIntent) null, (C1132b) null);
                    I.a("Status code must not be SUCCESS", !status.v());
                    basePendingResult2 = new x(status);
                    basePendingResult2.setResult(status);
                } else {
                    c cVar = new c(e6);
                    new Thread(cVar).start();
                    basePendingResult2 = cVar.f12538b;
                }
                v vVar = new v(11);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                basePendingResult2.addStatusListener(new z(basePendingResult2, taskCompletionSource, vVar));
                taskCompletionSource.getTask();
            } else {
                o asGoogleApiClient2 = lVar.asGoogleApiClient();
                Context applicationContext2 = lVar.getApplicationContext();
                if (lVar.c() == 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                h.f12550a.a("Signing out", new Object[0]);
                h.a(applicationContext2);
                if (z3) {
                    Status status2 = Status.f6002e;
                    basePendingResult = new BasePendingResult(asGoogleApiClient2);
                    basePendingResult.setResult(status2);
                } else {
                    basePendingResult = ((K) asGoogleApiClient2).f6046b.doWrite(new g(asGoogleApiClient2, 0));
                }
                v vVar2 = new v(11);
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                basePendingResult.addStatusListener(new z(basePendingResult, taskCompletionSource2, vVar2));
                taskCompletionSource2.getTask();
            }
        } else if (i2 != 2) {
            return false;
        } else {
            a();
            i.H(revocationBoundService).I();
        }
        return true;
    }
}
