package T1;

import B0.C0004c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzgw;
import com.google.android.gms.internal.play_billing.zzjz;
import java.util.List;
import java.util.Objects;
import m0.a0;
import q4.C0937a;
import w0.C1056c;
import w0.C1071r;
import w0.C1073t;

/* renamed from: T1.e0  reason: case insensitive filesystem */
public final class C0165e0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3281a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3282b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3283c;
    public final Object d;

    public C0165e0(T1 t12) {
        I.g(t12);
        this.d = t12;
    }

    public synchronized void a(Context context, IntentFilter intentFilter) {
        int i2;
        try {
            if (!this.f3282b) {
                if (Build.VERSION.SDK_INT >= 33) {
                    if (true != this.f3283c) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    context.registerReceiver(this, intentFilter, i2);
                } else {
                    context.registerReceiver(this, intentFilter);
                }
                this.f3282b = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void b() {
        T1 t12 = (T1) this.d;
        t12.k();
        t12.f().o();
        t12.f().o();
        if (this.f3282b) {
            t12.c().f3180w.a("Unregistering connectivity change receiver");
            this.f3282b = false;
            this.f3283c = false;
            try {
                t12.f3070u.f3489a.unregisterReceiver(this);
            } catch (IllegalArgumentException e6) {
                t12.c().f3172f.b(e6, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public void c(Bundle bundle, C1056c cVar, int i2) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            J j6 = (J) this.d;
            if (byteArray != null) {
                ((a0) j6.d).y(zzjz.zzC(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzgw.zza()));
            } else {
                ((a0) j6.d).y(C1071r.b(23, i2, cVar));
            }
        } catch (Throwable unused) {
            zze.zzl("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final void onReceive(Context context, Intent intent) {
        switch (this.f3281a) {
            case 0:
                T1 t12 = (T1) this.d;
                t12.k();
                String action = intent.getAction();
                t12.c().f3180w.b(action, "NetworkBroadcastReceiver received action");
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    C0162d0 d0Var = t12.f3061b;
                    T1.L(d0Var);
                    boolean N6 = d0Var.N();
                    if (this.f3283c != N6) {
                        this.f3283c = N6;
                        t12.f().y(new C0004c(this, N6));
                        return;
                    }
                    return;
                }
                t12.c().f3175r.b(action, "NetworkBroadcastReceiver received unknown action");
                return;
            default:
                Bundle extras = intent.getExtras();
                int i2 = 1;
                J j6 = (J) this.d;
                if (extras == null) {
                    zze.zzl("BillingBroadcastManager", "Bundle is null.");
                    C1056c cVar = C1073t.g;
                    ((a0) j6.d).y(C1071r.b(11, 1, cVar));
                    C0937a aVar = (C0937a) j6.f6043c;
                    if (aVar != null) {
                        aVar.b(cVar, (List) null);
                        return;
                    }
                    return;
                }
                C1056c zzf = zze.zzf(intent, "BillingBroadcastManager");
                String action2 = intent.getAction();
                if (true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW")) {
                    i2 = 2;
                }
                if (action2.equals("com.android.vending.billing.PURCHASES_UPDATED") || action2.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                    List zzj = zze.zzj(extras);
                    if (zzf.f12358a == 0) {
                        ((a0) j6.d).z(C1071r.d(i2));
                    } else {
                        c(extras, zzf, i2);
                    }
                    ((C0937a) j6.f6043c).b(zzf, zzj);
                    return;
                } else if (!action2.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                    return;
                } else {
                    if (zzf.f12358a != 0) {
                        c(extras, zzf, i2);
                        ((C0937a) j6.f6043c).b(zzf, zzco.zzl());
                        return;
                    }
                    j6.getClass();
                    zze.zzl("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                    C1056c cVar2 = C1073t.g;
                    ((a0) j6.d).y(C1071r.b(77, i2, cVar2));
                    ((C0937a) j6.f6043c).b(cVar2, zzco.zzl());
                    return;
                }
        }
    }

    public C0165e0(J j6, boolean z3) {
        this.d = j6;
        this.f3283c = z3;
    }
}
