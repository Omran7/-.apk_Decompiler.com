package w0;

import H.j;
import I5.u;
import S3.r;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.emoji2.text.v;
import com.google.android.gms.internal.play_billing.zzav;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzel;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzew;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzv;
import j4.p0;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import m0.a0;
import q4.C0937a;
import q4.C0938b;
import y1.l;

/* renamed from: w0.o  reason: case insensitive filesystem */
public final class C1068o extends C1054a {

    /* renamed from: A  reason: collision with root package name */
    public volatile int f12387A = 0;

    /* renamed from: B  reason: collision with root package name */
    public volatile zzav f12388B;

    /* renamed from: C  reason: collision with root package name */
    public volatile C1067n f12389C;

    /* renamed from: D  reason: collision with root package name */
    public volatile zzew f12390D;

    /* renamed from: z  reason: collision with root package name */
    public final Context f12391z;

    public C1068o(v vVar, Context context) {
        super(vVar, context);
        this.f12391z = context;
    }

    public final void A(int i2, int i5, C1056c cVar) {
        zzjz b6 = C1071r.b(i2, i5, cVar);
        Objects.requireNonNull(b6, "ApiFailure should not be null");
        this.g.y(b6);
    }

    public final void B(int i2, Consumer consumer, Runnable runnable) {
        zzew zzew;
        zzev zzev;
        zzeu z3 = z(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.f12390D == null) {
                    this.f12390D = zzfb.zzb(Executors.newSingleThreadScheduledExecutor());
                }
                zzew = this.f12390D;
            } finally {
                while (true) {
                }
            }
        }
        zzeu zzb = zzel.zzb(z3, 28500, timeUnit, zzew);
        l lVar = new l(this, i2, consumer, runnable);
        synchronized (this) {
            try {
                if (this.f12354x == null) {
                    this.f12354x = zzfb.zza(j());
                }
                zzev = this.f12354x;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        zzel.zzc(zzb, lVar, zzev);
    }

    public final void a(u uVar, a0 a0Var) {
        B(4, new C1064k(uVar, a0Var), new j((Object) this, (Object) uVar, (Object) a0Var, 19));
    }

    public final C1056c c(Activity activity, r rVar) {
        int i2 = 0;
        try {
            i2 = ((Integer) z(2).get(28500, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e6) {
            A(114, 28, C1073t.f12406q);
            zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e6);
        } catch (Exception e7) {
            if (e7 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            A(107, 28, C1073t.f12406q);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e7);
        }
        if (i2 > 0) {
            C1056c a6 = C1073t.a(i2, "Billing override value was set by a license tester.");
            A(105, 2, a6);
            v(a6);
            return a6;
        }
        try {
            return super.c(activity, rVar);
        } catch (Exception e8) {
            C1056c cVar = C1073t.g;
            A(115, 2, cVar);
            zze.zzm("BillingClientTesting", "An internal error occurred.", e8);
            return cVar;
        }
    }

    public final void d(p0 p0Var, C0937a aVar) {
        B(7, new C1064k(aVar), new j((Object) this, (Object) p0Var, (Object) aVar, 18));
    }

    public final void e(C0938b bVar) {
        synchronized (this) {
            if (y()) {
                zze.zzk("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                zzkd d = C1071r.d(26);
                Objects.requireNonNull(d, "ApiSuccess should not be null");
                this.g.z(d);
            } else {
                int i2 = 1;
                if (this.f12387A == 1) {
                    zze.zzl("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.f12387A == 3) {
                    zze.zzl("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    A(38, 26, C1073t.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.f12387A = 1;
                    zze.zzk("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.f12389C = new C1067n(this, 0);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> queryIntentServices = this.f12391z.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i2 = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                zze.zzl("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.f12391z.bindService(intent2, this.f12389C, 1)) {
                                    zze.zzk("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    zze.zzl("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i2 = 39;
                        }
                    }
                    this.f12387A = 0;
                    zze.zzk("BillingClientTesting", "Billing Override Service unavailable on device.");
                    A(i2, 26, C1073t.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.e(bVar);
    }

    public final /* synthetic */ void w(u uVar, a0 a0Var) {
        super.a(uVar, a0Var);
    }

    public final /* synthetic */ void x(p0 p0Var, C0937a aVar) {
        super.d(p0Var, aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean y() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f12387A     // Catch:{ all -> 0x0011 }
            r1 = 2
            if (r0 != r1) goto L_0x0013
            com.google.android.gms.internal.play_billing.zzav r0 = r2.f12388B     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x0013
            w0.n r0 = r2.f12389C     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x0013
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x0011:
            r0 = move-exception
            goto L_0x0016
        L_0x0013:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.C1068o.y():boolean");
    }

    public final zzeu z(int i2) {
        if (y()) {
            return zzv.zza(new C1065l(this, i2));
        }
        zze.zzl("BillingClientTesting", "Billing Override Service is not ready.");
        A(106, 28, C1073t.a(-1, "Billing Override Service connection is disconnected."));
        return zzel.zza(0);
    }

    public C1068o(v vVar, Context context, C0937a aVar) {
        super(vVar, context, aVar);
        this.f12391z = context;
    }
}
