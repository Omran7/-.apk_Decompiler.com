package y1;

import F3.e;
import N2.a;
import P2.m;
import R2.b;
import android.content.Context;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.internal.play_billing.zzej;
import com.google.android.gms.tasks.Task;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.utils.T;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import javax.crypto.Mac;
import w0.C1056c;
import w0.C1068o;
import w0.C1073t;

public final class l implements a, T, zzej {

    /* renamed from: e  reason: collision with root package name */
    public static l f12676e;

    /* renamed from: a  reason: collision with root package name */
    public int f12677a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12678b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f12679c;
    public Object d;

    public l(C1068o oVar, int i2, Consumer consumer, Runnable runnable) {
        this.f12677a = i2;
        this.f12678b = consumer;
        this.f12679c = runnable;
        this.d = oVar;
    }

    public static synchronized l a(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (f12676e == null) {
                    zze.zza();
                    f12676e = new l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new H1.a("MessengerIpcClient"))));
                }
                lVar = f12676e;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return lVar;
    }

    public synchronized Task b(k kVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(kVar.toString()));
            }
            if (!((j) this.d).d(kVar)) {
                j jVar = new j(this);
                this.d = jVar;
                jVar.d(kVar);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return kVar.f12673b.getTask();
    }

    public void c(boolean z3) {
        if (z3) {
            d.n1(this.f12677a, new I(this, 8));
            return;
        }
        b.w(false);
        String str = (String) this.d;
        boolean equals = str.equals("gold");
        Context context = (Context) this.f12678b;
        if (equals) {
            c.y0(context);
        } else if (str.equals("check")) {
            com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.do_not_have_enough_check, context, (String) null);
        }
    }

    public byte[] h(byte[] bArr, int i2) {
        if (i2 <= this.f12677a) {
            m mVar = (m) this.f12678b;
            ((Mac) mVar.get()).update(bArr);
            return Arrays.copyOf(((Mac) mVar.get()).doFinal(), i2);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }

    public void zza(Throwable th) {
        boolean z3 = th instanceof TimeoutException;
        C1068o oVar = (C1068o) this.d;
        if (z3) {
            oVar.A(114, 28, C1073t.f12406q);
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            oVar.A(107, 28, C1073t.f12406q);
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.f12679c).run();
    }

    public void zzb(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() > 0) {
            int intValue = num.intValue();
            C1068o oVar = (C1068o) this.d;
            oVar.getClass();
            C1056c a6 = C1073t.a(intValue, "Billing override value was set by a license tester.");
            oVar.A(105, this.f12677a, a6);
            ((Consumer) this.f12678b).accept(a6);
            return;
        }
        ((Runnable) this.f12679c).run();
    }

    public l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new j(this);
        this.f12677a = 1;
        this.f12679c = scheduledExecutorService;
        this.f12678b = context.getApplicationContext();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r4.equals("HMACSHA256") == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(java.lang.String r4, javax.crypto.spec.SecretKeySpec r5) {
        /*
            r3 = this;
            r3.<init>()
            P2.m r0 = new P2.m
            r0.<init>(r3)
            r3.f12678b = r0
            r1 = 2
            boolean r2 = h0.C0552a.e(r1)
            if (r2 == 0) goto L_0x008f
            r3.f12679c = r4
            r3.d = r5
            byte[] r5 = r5.getEncoded()
            int r5 = r5.length
            r2 = 16
            if (r5 < r2) goto L_0x0087
            r5 = -1
            int r2 = r4.hashCode()
            switch(r2) {
                case -1823053428: goto L_0x0052;
                case 392315023: goto L_0x0047;
                case 392315118: goto L_0x003e;
                case 392316170: goto L_0x0033;
                case 392317873: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            r1 = r5
            goto L_0x005c
        L_0x0028:
            java.lang.String r1 = "HMACSHA512"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0031
            goto L_0x0026
        L_0x0031:
            r1 = 4
            goto L_0x005c
        L_0x0033:
            java.lang.String r1 = "HMACSHA384"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x003c
            goto L_0x0026
        L_0x003c:
            r1 = 3
            goto L_0x005c
        L_0x003e:
            java.lang.String r2 = "HMACSHA256"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x005c
            goto L_0x0026
        L_0x0047:
            java.lang.String r1 = "HMACSHA224"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0050
            goto L_0x0026
        L_0x0050:
            r1 = 1
            goto L_0x005c
        L_0x0052:
            java.lang.String r1 = "HMACSHA1"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x005b
            goto L_0x0026
        L_0x005b:
            r1 = 0
        L_0x005c:
            switch(r1) {
                case 0: goto L_0x007f;
                case 1: goto L_0x007a;
                case 2: goto L_0x0075;
                case 3: goto L_0x0070;
                case 4: goto L_0x006b;
                default: goto L_0x005f;
            }
        L_0x005f:
            java.security.NoSuchAlgorithmException r5 = new java.security.NoSuchAlgorithmException
            java.lang.String r0 = "unknown Hmac algorithm: "
            java.lang.String r4 = r0.concat(r4)
            r5.<init>(r4)
            throw r5
        L_0x006b:
            r4 = 64
            r3.f12677a = r4
            goto L_0x0083
        L_0x0070:
            r4 = 48
            r3.f12677a = r4
            goto L_0x0083
        L_0x0075:
            r4 = 32
            r3.f12677a = r4
            goto L_0x0083
        L_0x007a:
            r4 = 28
            r3.f12677a = r4
            goto L_0x0083
        L_0x007f:
            r4 = 20
            r3.f12677a = r4
        L_0x0083:
            r0.get()
            return
        L_0x0087:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r5 = "key size too small, need at least 16 bytes"
            r4.<init>(r5)
            throw r4
        L_0x008f:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.l.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }

    public l(int i2, Context context, e eVar, String str) {
        this.f12677a = i2;
        this.f12678b = context;
        this.f12679c = eVar;
        this.d = str;
    }
}
