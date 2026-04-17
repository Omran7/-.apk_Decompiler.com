package w0;

import A2.f;
import H1.a;
import I5.u;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.emoji2.text.v;
import com.google.android.gms.common.api.internal.J;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzev;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import com.google.android.gms.internal.play_billing.zzlv;
import com.google.android.gms.internal.play_billing.zzlx;
import j3.g;
import j4.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import m0.a0;
import q4.C0937a;
import q4.C0938b;

/* renamed from: w0.a  reason: case insensitive filesystem */
public class C1054a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12334a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public volatile int f12335b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final String f12336c;
    public final Handler d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public volatile J f12337e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f12338f;
    public final a0 g;
    public volatile zzan h;

    /* renamed from: i  reason: collision with root package name */
    public volatile C1063j f12339i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12340j;

    /* renamed from: k  reason: collision with root package name */
    public int f12341k = 0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12342l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12343m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12344n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12345o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12346p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12347q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12348r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12349s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f12350t;

    /* renamed from: u  reason: collision with root package name */
    public final v f12351u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f12352v;

    /* renamed from: w  reason: collision with root package name */
    public ExecutorService f12353w;

    /* renamed from: x  reason: collision with root package name */
    public volatile zzev f12354x;

    /* renamed from: y  reason: collision with root package name */
    public final Long f12355y;

    public C1054a(v vVar, Context context) {
        long nextLong = new Random().nextLong();
        this.f12355y = Long.valueOf(nextLong);
        this.f12336c = i();
        this.f12338f = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(i());
        zzc.zzn(this.f12338f.getPackageName());
        zzc.zzm(nextLong);
        this.g = new a0(this.f12338f, (zzku) zzc.zzf());
        zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f12337e = new J(this.f12338f, (C0937a) null, this.g);
        this.f12351u = vVar;
        this.f12338f.getPackageName();
    }

    public static Future f(Callable callable, long j6, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future submit = executorService.submit(callable);
            handler.postDelayed(new g(submit, runnable, 11), (long) (((double) j6) * 0.95d));
            return submit;
        } catch (Exception e6) {
            zze.zzm("BillingClient", "Async task throws exception!", e6);
            return null;
        }
    }

    public static String i() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get((Object) null);
        } catch (Exception unused) {
            return "7.1.1";
        }
    }

    public void a(u uVar, a0 a0Var) {
        if (!b()) {
            C1056c cVar = C1073t.f12398i;
            t(2, 4, cVar);
            a0Var.p(cVar);
        } else if (f(new C1061h(this, uVar, a0Var, 0), 30000, new g((Object) this, (Object) a0Var, (Object) uVar, 12), r(), j()) == null) {
            C1056c g5 = g();
            t(25, 4, g5);
            a0Var.p(g5);
        }
    }

    public final boolean b() {
        boolean z3;
        synchronized (this.f12334a) {
            try {
                z3 = false;
                if (!(this.f12335b != 2 || this.h == null || this.f12339i == null)) {
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [java.util.function.Predicate, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x056d A[SYNTHETIC, Splitter:B:203:0x056d] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0582 A[Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0600  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0607  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w0.C1056c c(android.app.Activity r27, S3.r r28) {
        /*
            r26 = this;
            r8 = r26
            r0 = r27
            r6 = r28
            java.lang.String r9 = "BUY_INTENT"
            java.lang.String r1 = "proxyPackageVersion"
            com.google.android.gms.common.api.internal.J r2 = r8.f12337e
            r10 = 2
            if (r2 == 0) goto L_0x0682
            com.google.android.gms.common.api.internal.J r2 = r8.f12337e
            java.lang.Object r2 = r2.f6043c
            q4.a r2 = (q4.C0937a) r2
            if (r2 == 0) goto L_0x0682
            boolean r2 = r26.b()
            if (r2 != 0) goto L_0x0026
            w0.c r0 = w0.C1073t.f12398i
            r8.t(r10, r10, r0)
            r8.v(r0)
            return r0
        L_0x0026:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r3 = r6.d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r2.addAll(r3)
            java.lang.Object r3 = r6.f2695c
            com.google.android.gms.internal.play_billing.zzco r3 = (com.google.android.gms.internal.play_billing.zzco) r3
            r11 = 0
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzcx.zza(r2, r11)
            if (r4 != 0) goto L_0x067c
            java.lang.Object r4 = com.google.android.gms.internal.play_billing.zzcx.zza(r3, r11)
            w0.b r4 = (w0.C1055b) r4
            w0.f r5 = r4.f12356a
            java.lang.String r7 = r5.f12365c
            java.lang.String r5 = r5.d
            java.lang.String r12 = "subs"
            boolean r12 = r5.equals(r12)
            r13 = 9
            java.lang.String r14 = "BillingClient"
            if (r12 == 0) goto L_0x0068
            boolean r12 = r8.f12340j
            if (r12 == 0) goto L_0x005a
            goto L_0x0068
        L_0x005a:
            java.lang.String r0 = "Current client doesn't support subscriptions."
            com.google.android.gms.internal.play_billing.zze.zzl(r14, r0)
            w0.c r0 = w0.C1073t.f12400k
            r8.t(r13, r10, r0)
            r8.v(r0)
            return r0
        L_0x0068:
            java.lang.Object r12 = r6.f2694b
            androidx.fragment.app.D r12 = (androidx.fragment.app.D) r12
            r12.getClass()
            java.lang.Object r12 = r6.f2695c
            com.google.android.gms.internal.play_billing.zzco r12 = (com.google.android.gms.internal.play_billing.zzco) r12
            java.util.stream.Stream r12 = r12.stream()
            w0.p r15 = new w0.p
            r15.<init>()
            boolean r12 = r12.anyMatch(r15)
            if (r12 != 0) goto L_0x0087
            boolean r12 = r6.f2693a
            if (r12 != 0) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            boolean r12 = r8.f12342l
            if (r12 == 0) goto L_0x066a
        L_0x008b:
            int r12 = r2.size()
            r15 = 1
            if (r12 <= r15) goto L_0x00a7
            boolean r12 = r8.f12346p
            if (r12 == 0) goto L_0x0097
            goto L_0x00a7
        L_0x0097:
            java.lang.String r0 = "Current client doesn't support multi-item purchases."
            com.google.android.gms.internal.play_billing.zze.zzl(r14, r0)
            w0.c r0 = w0.C1073t.f12401l
            r1 = 19
            r8.t(r1, r10, r0)
            r8.v(r0)
            return r0
        L_0x00a7:
            boolean r12 = r3.isEmpty()
            if (r12 != 0) goto L_0x00c2
            boolean r12 = r8.f12347q
            if (r12 == 0) goto L_0x00b2
            goto L_0x00c2
        L_0x00b2:
            java.lang.String r0 = "Current client doesn't support purchases with ProductDetails."
            com.google.android.gms.internal.play_billing.zze.zzl(r14, r0)
            w0.c r0 = w0.C1073t.f12403n
            r1 = 20
            r8.t(r1, r10, r0)
            r8.v(r0)
            return r0
        L_0x00c2:
            java.lang.Object r12 = r6.f2695c
            com.google.android.gms.internal.play_billing.zzco r12 = (com.google.android.gms.internal.play_billing.zzco) r12
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x00d6
            w0.c r12 = w0.C1073t.h
            r18 = r5
            r17 = r7
            r19 = r9
            goto L_0x022b
        L_0x00d6:
            java.lang.Object r12 = r6.f2695c
            com.google.android.gms.internal.play_billing.zzco r12 = (com.google.android.gms.internal.play_billing.zzco) r12
            r13 = 0
            java.lang.Object r12 = r12.get(r13)
            w0.b r12 = (w0.C1055b) r12
            r16 = 1
            r13 = r16
        L_0x00e5:
            java.lang.Object r15 = r6.f2695c
            com.google.android.gms.internal.play_billing.zzco r15 = (com.google.android.gms.internal.play_billing.zzco) r15
            int r15 = r15.size()
            java.lang.String r11 = "play_pass_subs"
            if (r13 >= r15) goto L_0x0136
            java.lang.Object r15 = r6.f2695c
            com.google.android.gms.internal.play_billing.zzco r15 = (com.google.android.gms.internal.play_billing.zzco) r15
            java.lang.Object r15 = r15.get(r13)
            w0.b r15 = (w0.C1055b) r15
            w0.f r18 = r15.a()
            java.lang.String r10 = r18.c()
            w0.f r18 = r12.a()
            r19 = r9
            java.lang.String r9 = r18.c()
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x012f
            w0.f r9 = r15.a()
            java.lang.String r9 = r9.c()
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x0122
            goto L_0x012f
        L_0x0122:
            java.lang.String r9 = "All products should have same ProductType."
            r10 = 5
            w0.c r12 = w0.C1073t.a(r10, r9)
            r18 = r5
            r17 = r7
            goto L_0x022b
        L_0x012f:
            int r13 = r13 + 1
            r9 = r19
            r10 = 2
            r11 = 0
            goto L_0x00e5
        L_0x0136:
            r19 = r9
            w0.f r9 = r12.a()
            java.lang.String r9 = r9.d()
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.lang.Object r15 = r6.f2695c
            com.google.android.gms.internal.play_billing.zzco r15 = (com.google.android.gms.internal.play_billing.zzco) r15
            int r0 = r15.size()
            r18 = r5
            r17 = r7
            r5 = 0
        L_0x0157:
            java.lang.String r7 = "."
            if (r5 >= r0) goto L_0x01e6
            java.lang.Object r20 = r15.get(r5)
            w0.b r20 = (w0.C1055b) r20
            w0.f r21 = r20.a()
            r22 = r0
            java.lang.String r0 = r21.c()
            r21 = r15
            java.lang.String r15 = "subs"
            r0.equals(r15)
            w0.f r0 = r20.a()
            java.lang.String r0 = r0.b()
            boolean r0 = r10.contains(r0)
            if (r0 == 0) goto L_0x01a0
            w0.f r0 = r20.a()
            java.lang.String r0 = r0.b()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "ProductId can not be duplicated. Invalid product id: "
            r5.<init>(r9)
            r5.append(r0)
            r5.append(r7)
            java.lang.String r0 = r5.toString()
            r5 = 5
            w0.c r12 = w0.C1073t.a(r5, r0)
            goto L_0x022b
        L_0x01a0:
            w0.f r0 = r20.a()
            java.lang.String r0 = r0.b()
            r10.add(r0)
            w0.f r0 = r12.a()
            java.lang.String r0 = r0.c()
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x01de
            w0.f r0 = r20.a()
            java.lang.String r0 = r0.c()
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x01de
            w0.f r0 = r20.a()
            java.lang.String r0 = r0.d()
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x01d6
            goto L_0x01de
        L_0x01d6:
            java.lang.String r0 = "All products must have the same package name."
            r5 = 5
            w0.c r12 = w0.C1073t.a(r5, r0)
            goto L_0x022b
        L_0x01de:
            int r5 = r5 + 1
            r15 = r21
            r0 = r22
            goto L_0x0157
        L_0x01e6:
            java.util.Iterator r0 = r13.iterator()
        L_0x01ea:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0213
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r9 = r10.contains(r5)
            if (r9 == 0) goto L_0x01ea
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r9 = "OldProductId must not be one of the products to be purchased. Invalid old product id: "
            r0.<init>(r9)
            r0.append(r5)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r5 = 5
            w0.c r12 = w0.C1073t.a(r5, r0)
            goto L_0x022b
        L_0x0213:
            r5 = 5
            w0.f r0 = r12.a()
            w0.e r0 = r0.a()
            if (r0 == 0) goto L_0x0229
            w0.u r0 = r0.d
            if (r0 == 0) goto L_0x0229
            java.lang.String r0 = "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay."
            w0.c r12 = w0.C1073t.a(r5, r0)
            goto L_0x022b
        L_0x0229:
            w0.c r12 = w0.C1073t.h
        L_0x022b:
            w0.c r0 = w0.C1073t.h
            if (r12 == r0) goto L_0x0239
            r0 = 120(0x78, float:1.68E-43)
            r1 = 2
            r8.t(r0, r1, r12)
            r8.v(r12)
            return r12
        L_0x0239:
            boolean r0 = r8.f12342l
            if (r0 == 0) goto L_0x0552
            boolean r0 = r8.f12343m
            androidx.emoji2.text.v r5 = r8.f12351u
            r5.getClass()
            androidx.emoji2.text.v r5 = r8.f12351u
            r5.getClass()
            boolean r5 = r8.f12352v
            java.lang.String r7 = r8.f12336c
            java.lang.Long r9 = r8.f12355y
            long r9 = r9.longValue()
            android.content.Context r11 = r8.f12338f
            java.lang.String r11 = r11.getPackageName()
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            com.google.android.gms.internal.play_billing.zze.zzc(r12, r7, r9)
            java.lang.Object r7 = r6.f2694b
            androidx.fragment.app.D r7 = (androidx.fragment.app.D) r7
            r7.getClass()
            r7 = 0
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x0274
            java.lang.String r9 = "accountId"
            r12.putString(r9, r7)
        L_0x0274:
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x027f
            java.lang.String r9 = "obfuscatedProfileId"
            r12.putString(r9, r7)
        L_0x027f:
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x0297
            java.util.ArrayList r9 = new java.util.ArrayList
            java.lang.String[] r10 = new java.lang.String[]{r7}
            java.util.List r7 = java.util.Arrays.asList(r10)
            r9.<init>(r7)
            java.lang.String r7 = "skusToReplace"
            r12.putStringArrayList(r7, r9)
        L_0x0297:
            java.lang.Object r7 = r6.f2694b
            androidx.fragment.app.D r7 = (androidx.fragment.app.D) r7
            r7.getClass()
            r7 = 0
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x02b1
            java.lang.Object r9 = r6.f2694b
            androidx.fragment.app.D r9 = (androidx.fragment.app.D) r9
            r9.getClass()
            java.lang.String r9 = "oldSkuPurchaseToken"
            r12.putString(r9, r7)
        L_0x02b1:
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x02bc
            java.lang.String r9 = "oldSkuPurchaseId"
            r12.putString(r9, r7)
        L_0x02bc:
            java.lang.Object r9 = r6.f2694b
            androidx.fragment.app.D r9 = (androidx.fragment.app.D) r9
            r9.getClass()
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x02d5
            java.lang.Object r9 = r6.f2694b
            androidx.fragment.app.D r9 = (androidx.fragment.app.D) r9
            r9.getClass()
            java.lang.String r9 = "originalExternalTransactionId"
            r12.putString(r9, r7)
        L_0x02d5:
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x02e0
            java.lang.String r9 = "paymentsPurchaseParams"
            r12.putString(r9, r7)
        L_0x02e0:
            if (r0 == 0) goto L_0x02e9
            java.lang.String r0 = "enablePendingPurchases"
            r7 = 1
            r12.putBoolean(r0, r7)
            goto L_0x02ea
        L_0x02e9:
            r7 = 1
        L_0x02ea:
            if (r5 == 0) goto L_0x02f1
            java.lang.String r0 = "enableAlternativeBilling"
            r12.putBoolean(r0, r7)
        L_0x02f1:
            java.lang.Object r0 = r6.f2695c
            com.google.android.gms.internal.play_billing.zzco r0 = (com.google.android.gms.internal.play_billing.zzco) r0
            java.util.stream.Stream r0 = r0.stream()
            com.google.android.gms.internal.play_billing.zza r5 = new com.google.android.gms.internal.play_billing.zza
            r5.<init>()
            boolean r0 = r0.anyMatch(r5)
            if (r0 == 0) goto L_0x033e
            com.google.android.gms.internal.play_billing.zzfm r0 = com.google.android.gms.internal.play_billing.zzfn.zza()
            java.lang.Object r5 = r6.f2695c
            com.google.android.gms.internal.play_billing.zzco r5 = (com.google.android.gms.internal.play_billing.zzco) r5
            java.util.stream.Stream r5 = r5.stream()
            com.google.android.gms.internal.play_billing.zzb r7 = new com.google.android.gms.internal.play_billing.zzb
            r7.<init>()
            java.util.stream.Stream r5 = r5.filter(r7)
            com.google.android.gms.internal.play_billing.zzc r7 = new com.google.android.gms.internal.play_billing.zzc
            r7.<init>(r11)
            java.util.stream.Stream r5 = r5.map(r7)
            java.util.stream.Collector r7 = com.google.android.gms.internal.play_billing.zzco.zzo()
            java.lang.Object r5 = r5.collect(r7)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0.zza(r5)
            com.google.android.gms.internal.play_billing.zzhk r0 = r0.zzf()
            com.google.android.gms.internal.play_billing.zzfn r0 = (com.google.android.gms.internal.play_billing.zzfn) r0
            byte[] r0 = r0.zzh()
            java.lang.String r5 = "subscriptionProductReplacementParamsList"
            r12.putByteArray(r5, r0)
        L_0x033e:
            boolean r0 = r2.isEmpty()
            java.lang.String r5 = "SKU_OFFER_ID_TOKEN_LIST"
            java.lang.String r7 = "additionalSkuTypes"
            java.lang.String r9 = "additionalSkus"
            java.lang.String r10 = "skuDetailsTokens"
            if (r0 != 0) goto L_0x03bb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r13 = r2.iterator()
            boolean r15 = r13.hasNext()
            if (r15 != 0) goto L_0x03b6
            boolean r13 = r0.isEmpty()
            if (r13 != 0) goto L_0x0378
            r12.putStringArrayList(r10, r0)
        L_0x0378:
            int r0 = r2.size()
            r10 = 1
            if (r0 <= r10) goto L_0x03a1
            java.util.ArrayList r0 = new java.util.ArrayList
            int r13 = r2.size()
            int r13 = r13 + -1
            r0.<init>(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r15 = r2.size()
            int r15 = r15 + -1
            r13.<init>(r15)
            int r15 = r2.size()
            if (r10 < r15) goto L_0x03a9
            r12.putStringArrayList(r9, r0)
            r12.putStringArrayList(r7, r13)
        L_0x03a1:
            r20 = r1
            r22 = r4
            r21 = r14
            goto L_0x0490
        L_0x03a9:
            java.lang.Object r0 = r2.get(r10)
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L_0x03b6:
            java.lang.ClassCastException r0 = o3.d.e(r13)
            throw r0
        L_0x03bb:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r3.size()
            int r2 = r2 + -1
            r0.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r13 = r3.size()
            int r13 = r13 + -1
            r2.<init>(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r20 = r1
            r21 = r14
            r1 = 0
        L_0x03ea:
            int r14 = r3.size()
            if (r1 >= r14) goto L_0x0466
            java.lang.Object r14 = r3.get(r1)
            w0.b r14 = (w0.C1055b) r14
            r22 = r4
            w0.f r4 = r14.f12356a
            java.lang.String r8 = r4.f12367f
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0407
            java.lang.String r8 = r4.f12367f
            r13.add(r8)
        L_0x0407:
            java.lang.String r8 = r14.f12357b
            r15.add(r8)
            java.lang.String r8 = r4.g
            java.util.ArrayList r14 = r4.f12368i
            if (r14 == 0) goto L_0x043a
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x043a
            java.util.ArrayList r4 = r4.f12368i
            java.util.Iterator r4 = r4.iterator()
        L_0x041e:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L_0x043a
            java.lang.Object r14 = r4.next()
            w0.e r14 = (w0.C1058e) r14
            r23 = r4
            java.lang.String r4 = r14.f12362c
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0437
            java.lang.String r8 = r14.f12362c
            goto L_0x043a
        L_0x0437:
            r4 = r23
            goto L_0x041e
        L_0x043a:
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 != 0) goto L_0x0443
            r11.add(r8)
        L_0x0443:
            if (r1 <= 0) goto L_0x045f
            java.lang.Object r4 = r3.get(r1)
            w0.b r4 = (w0.C1055b) r4
            w0.f r4 = r4.f12356a
            java.lang.String r4 = r4.f12365c
            r0.add(r4)
            java.lang.Object r4 = r3.get(r1)
            w0.b r4 = (w0.C1055b) r4
            w0.f r4 = r4.f12356a
            java.lang.String r4 = r4.d
            r2.add(r4)
        L_0x045f:
            int r1 = r1 + 1
            r8 = r26
            r4 = r22
            goto L_0x03ea
        L_0x0466:
            r22 = r4
            r12.putStringArrayList(r5, r15)
            java.lang.String r1 = "AUTO_PAY_BALANCE_THRESHOLD_LIST"
            r12.putIntegerArrayList(r1, r6)
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L_0x0479
            r12.putStringArrayList(r10, r13)
        L_0x0479:
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x0484
            java.lang.String r1 = "SKU_SERIALIZED_DOCID_LIST"
            r12.putStringArrayList(r1, r11)
        L_0x0484:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0490
            r12.putStringArrayList(r9, r0)
            r12.putStringArrayList(r7, r2)
        L_0x0490:
            boolean r0 = r12.containsKey(r5)
            r8 = r26
            if (r0 == 0) goto L_0x049c
            boolean r0 = r8.f12344n
            if (r0 == 0) goto L_0x049f
        L_0x049c:
            r4 = r22
            goto L_0x04ab
        L_0x049f:
            w0.c r0 = w0.C1073t.f12402m
            r1 = 21
            r2 = 2
            r8.t(r1, r2, r0)
            r8.v(r0)
            return r0
        L_0x04ab:
            w0.f r0 = r4.f12356a
            java.lang.String r0 = r0.d()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04c5
            w0.f r0 = r4.f12356a
            java.lang.String r0 = r0.d()
            java.lang.String r1 = "skuPackageName"
            r12.putString(r1, r0)
            r7 = 1
        L_0x04c3:
            r9 = 0
            goto L_0x04c7
        L_0x04c5:
            r7 = 0
            goto L_0x04c3
        L_0x04c7:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x04d2
            java.lang.String r0 = "accountName"
            r12.putString(r0, r9)
        L_0x04d2:
            android.content.Intent r0 = r27.getIntent()
            if (r0 != 0) goto L_0x04e0
            java.lang.String r0 = "Activity's intent is null."
            r10 = r21
            com.google.android.gms.internal.play_billing.zze.zzl(r10, r0)
            goto L_0x0511
        L_0x04e0:
            r10 = r21
            java.lang.String r1 = "PROXY_PACKAGE"
            java.lang.String r2 = r0.getStringExtra(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0511
            java.lang.String r0 = r0.getStringExtra(r1)
            java.lang.String r1 = "proxyPackage"
            r12.putString(r1, r0)
            android.content.Context r1 = r8.f12338f     // Catch:{ NameNotFoundException -> 0x050a }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x050a }
            r2 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x050a }
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x050a }
            r1 = r20
            r12.putString(r1, r0)     // Catch:{ NameNotFoundException -> 0x050c }
            goto L_0x0511
        L_0x050a:
            r1 = r20
        L_0x050c:
            java.lang.String r0 = "package not found"
            r12.putString(r1, r0)
        L_0x0511:
            boolean r0 = r8.f12347q
            if (r0 == 0) goto L_0x051f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x051f
            r0 = 17
        L_0x051d:
            r3 = r0
            goto L_0x0531
        L_0x051f:
            boolean r0 = r8.f12345o
            if (r0 == 0) goto L_0x0528
            if (r7 == 0) goto L_0x0528
            r0 = 15
            goto L_0x051d
        L_0x0528:
            boolean r0 = r8.f12343m
            if (r0 == 0) goto L_0x052f
            r3 = 9
            goto L_0x0531
        L_0x052f:
            r0 = 6
            goto L_0x051d
        L_0x0531:
            w0.i r20 = new w0.i
            r1 = r20
            r2 = r26
            r4 = r17
            r5 = r18
            r6 = r28
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            android.os.Handler r0 = r8.d
            java.util.concurrent.ExecutorService r25 = r26.j()
            r21 = 5000(0x1388, double:2.4703E-320)
            r23 = 0
            r24 = r0
            java.util.concurrent.Future r0 = f(r20, r21, r23, r24, r25)
            goto L_0x056b
        L_0x0552:
            r10 = r14
            r9 = 0
            w0.h r1 = new w0.h
            r0 = 2
            r2 = r17
            r3 = r18
            r1.<init>(r8, r2, r3, r0)
            android.os.Handler r5 = r8.d
            java.util.concurrent.ExecutorService r6 = r26.j()
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 0
            java.util.concurrent.Future r0 = f(r1, r2, r4, r5, r6)
        L_0x056b:
            if (r0 != 0) goto L_0x0582
            w0.c r0 = w0.C1073t.f12395c     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            r1 = 25
            r2 = 2
            r8.t(r1, r2, r0)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            r8.v(r0)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            return r0
        L_0x0579:
            r0 = move-exception
            goto L_0x0642
        L_0x057c:
            r0 = move-exception
            goto L_0x0656
        L_0x057f:
            r0 = move-exception
            goto L_0x0656
        L_0x0582:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r0 = r0.get(r2, r1)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            r1 = r0
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            int r0 = com.google.android.gms.internal.play_billing.zze.zzb(r1, r10)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            java.lang.String r2 = com.google.android.gms.internal.play_billing.zze.zzh(r1, r10)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            if (r0 == 0) goto L_0x0628
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            r3.<init>()     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            java.lang.String r4 = "Unable to buy item, Error response code: "
            r3.append(r4)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            r3.append(r0)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            java.lang.String r3 = r3.toString()     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            com.google.android.gms.internal.play_billing.zze.zzl(r10, r3)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            w0.c r2 = w0.C1073t.a(r0, r2)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            if (r1 != 0) goto L_0x05b4
        L_0x05b1:
            r3 = 1
            r7 = 1
            goto L_0x05fe
        L_0x05b4:
            java.lang.String r0 = "LOG_REASON"
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x05cd }
            if (r0 != 0) goto L_0x05bd
            goto L_0x05b1
        L_0x05bd:
            boolean r3 = r0 instanceof java.lang.Integer     // Catch:{ all -> 0x05cd }
            if (r3 == 0) goto L_0x05cf
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x05cd }
            int r0 = r0.intValue()     // Catch:{ all -> 0x05cd }
            int r7 = com.google.android.gms.internal.play_billing.zzkg.zza(r0)     // Catch:{ all -> 0x05cd }
            r3 = 1
            goto L_0x05fe
        L_0x05cd:
            r0 = move-exception
            goto L_0x05ec
        L_0x05cf:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x05cd }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x05cd }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x05cd }
            r3.<init>()     // Catch:{ all -> 0x05cd }
            java.lang.String r4 = "Unexpected type for bundle log reason: "
            r3.append(r4)     // Catch:{ all -> 0x05cd }
            r3.append(r0)     // Catch:{ all -> 0x05cd }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x05cd }
            com.google.android.gms.internal.play_billing.zze.zzl(r10, r0)     // Catch:{ all -> 0x05cd }
            goto L_0x05b1
        L_0x05ec:
            java.lang.String r0 = r0.getMessage()     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            java.lang.String r3 = "Failed to get log reason from bundle: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            java.lang.String r0 = r3.concat(r0)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            com.google.android.gms.internal.play_billing.zze.zzl(r10, r0)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            goto L_0x05b1
        L_0x05fe:
            if (r7 != r3) goto L_0x0602
            r7 = 23
        L_0x0602:
            if (r1 != 0) goto L_0x0607
        L_0x0604:
            r11 = r9
        L_0x0605:
            r1 = 2
            goto L_0x0621
        L_0x0607:
            java.lang.String r0 = "ADDITIONAL_LOG_DETAILS"
            java.lang.String r11 = r1.getString(r0)     // Catch:{ all -> 0x060e }
            goto L_0x0605
        L_0x060e:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            java.lang.String r1 = "Failed to get additional log details from bundle: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            java.lang.String r0 = r1.concat(r0)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            com.google.android.gms.internal.play_billing.zze.zzl(r10, r0)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            goto L_0x0604
        L_0x0621:
            r8.u(r7, r1, r2, r11)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            r8.v(r2)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            return r2
        L_0x0628:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            java.lang.Class<com.android.billingclient.api.ProxyBillingActivity> r2 = com.android.billingclient.api.ProxyBillingActivity.class
            r3 = r27
            r0.<init>(r3, r2)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            r2 = r19
            android.os.Parcelable r1 = r1.getParcelable(r2)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            r0.putExtra(r2, r1)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            r3.startActivity(r0)     // Catch:{ TimeoutException -> 0x057f, CancellationException -> 0x057c, Exception -> 0x0579 }
            w0.c r0 = w0.C1073t.h
            return r0
        L_0x0642:
            java.lang.String r1 = "Exception while launching billing flow. Try to reconnect"
            com.google.android.gms.internal.play_billing.zze.zzm(r10, r1, r0)
            w0.c r1 = w0.C1073t.f12398i
            java.lang.String r0 = w0.C1071r.a(r0)
            r2 = 5
            r3 = 2
            r8.u(r2, r3, r1, r0)
            r8.v(r1)
            return r1
        L_0x0656:
            java.lang.String r1 = "Time out while launching billing flow. Try to reconnect"
            com.google.android.gms.internal.play_billing.zze.zzm(r10, r1, r0)
            w0.c r1 = w0.C1073t.f12399j
            java.lang.String r0 = w0.C1071r.a(r0)
            r2 = 4
            r3 = 2
            r8.u(r2, r3, r1, r0)
            r8.v(r1)
            return r1
        L_0x066a:
            r3 = r10
            r10 = r14
            java.lang.String r0 = "Current client doesn't support extra params for buy intent."
            com.google.android.gms.internal.play_billing.zze.zzl(r10, r0)
            w0.c r0 = w0.C1073t.f12397f
            r1 = 18
            r8.t(r1, r3, r0)
            r8.v(r0)
            return r0
        L_0x067c:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L_0x0682:
            r3 = r10
            w0.c r0 = w0.C1073t.f12405p
            r1 = 12
            r8.t(r1, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.C1054a.c(android.app.Activity, S3.r):w0.c");
    }

    public void d(p0 p0Var, C0937a aVar) {
        if (!b()) {
            C1056c cVar = C1073t.f12398i;
            t(2, 7, cVar);
            aVar.a(cVar, new ArrayList());
        } else if (!this.f12347q) {
            zze.zzl("BillingClient", "Querying product details is not supported.");
            C1056c cVar2 = C1073t.f12403n;
            t(20, 7, cVar2);
            aVar.a(cVar2, new ArrayList());
        } else if (f(new C1061h(this, p0Var, aVar, 1), 30000, new g(this, aVar, 13), r(), j()) == null) {
            C1056c g5 = g();
            t(25, 7, g5);
            aVar.a(g5, new ArrayList());
        }
    }

    public void e(C0938b bVar) {
        C1056c cVar;
        synchronized (this.f12334a) {
            try {
                if (b()) {
                    cVar = s();
                } else if (this.f12335b == 1) {
                    zze.zzl("BillingClient", "Client is already in the process of connecting to billing service.");
                    cVar = C1073t.d;
                    t(37, 6, cVar);
                } else if (this.f12335b == 3) {
                    zze.zzl("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    cVar = C1073t.f12398i;
                    t(38, 6, cVar);
                } else {
                    m(1);
                    n();
                    zze.zzk("BillingClient", "Starting in-app billing setup.");
                    this.f12339i = new C1063j(this, bVar);
                    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    List<ResolveInfo> queryIntentServices = this.f12338f.getPackageManager().queryIntentServices(intent, 0);
                    int i2 = 41;
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        i2 = 40;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f12336c);
                                synchronized (this.f12334a) {
                                    try {
                                        if (this.f12335b == 2) {
                                            cVar = s();
                                        } else if (this.f12335b != 1) {
                                            zze.zzl("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            cVar = C1073t.f12398i;
                                            t(117, 6, cVar);
                                        } else {
                                            C1063j jVar = this.f12339i;
                                            if (this.f12338f.bindService(intent2, jVar, 1)) {
                                                zze.zzk("BillingClient", "Service was bonded successfully.");
                                                cVar = null;
                                            } else {
                                                zze.zzl("BillingClient", "Connection to Billing service is blocked.");
                                                i2 = 39;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        while (true) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                        } else {
                            zze.zzl("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    m(0);
                    zze.zzk("BillingClient", "Billing service unavailable on device.");
                    cVar = C1073t.f12394b;
                    t(i2, 6, cVar);
                }
            } finally {
                while (true) {
                }
            }
        }
        if (cVar != null) {
            bVar.a(cVar);
        }
    }

    public final C1056c g() {
        int[] iArr = {0, 3};
        synchronized (this.f12334a) {
            for (int i2 = 0; i2 < 2; i2++) {
                if (this.f12335b == iArr[i2]) {
                    return C1073t.f12398i;
                }
            }
            return C1073t.g;
        }
    }

    public final void h() {
        if (TextUtils.isEmpty((CharSequence) null)) {
            this.f12338f.getPackageName();
        }
    }

    public final synchronized ExecutorService j() {
        try {
            if (this.f12353w == null) {
                this.f12353w = Executors.newFixedThreadPool(zze.zza, new a());
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.f12353w;
    }

    public final void k(zzjz zzjz) {
        try {
            a0 a0Var = this.g;
            int i2 = this.f12341k;
            a0Var.getClass();
            zzks zzks = (zzks) ((zzku) a0Var.f9925b).zzn();
            zzks.zza(i2);
            a0Var.f9925b = (zzku) zzks.zzf();
            a0Var.y(zzjz);
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    public final void l(zzkd zzkd) {
        try {
            a0 a0Var = this.g;
            int i2 = this.f12341k;
            a0Var.getClass();
            zzks zzks = (zzks) ((zzku) a0Var.f9925b).zzn();
            zzks.zza(i2);
            a0Var.f9925b = (zzku) zzks.zzf();
            a0Var.z(zzkd);
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    public final void m(int i2) {
        String str;
        String str2;
        synchronized (this.f12334a) {
            try {
                if (this.f12335b != 3) {
                    int i5 = this.f12335b;
                    if (i5 == 0) {
                        str = "DISCONNECTED";
                    } else if (i5 == 1) {
                        str = "CONNECTING";
                    } else if (i5 != 2) {
                        str = "CLOSED";
                    } else {
                        str = "CONNECTED";
                    }
                    if (i2 == 0) {
                        str2 = "DISCONNECTED";
                    } else if (i2 == 1) {
                        str2 = "CONNECTING";
                    } else if (i2 != 2) {
                        str2 = "CLOSED";
                    } else {
                        str2 = "CONNECTED";
                    }
                    zze.zzk("BillingClient", "Setting clientState from " + str + " to " + str2);
                    this.f12335b = i2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void n() {
        synchronized (this.f12334a) {
            if (this.f12339i != null) {
                try {
                    this.f12338f.unbindService(this.f12339i);
                    this.h = null;
                    this.f12339i = null;
                } catch (Throwable th) {
                    this.h = null;
                    this.f12339i = null;
                    throw th;
                }
            }
        }
    }

    public final f o(C1056c cVar, int i2, String str, Exception exc) {
        zze.zzm("BillingClient", str, exc);
        u(i2, 7, cVar, C1071r.a(exc));
        return new f(cVar.f12358a, cVar.f12359b, new ArrayList());
    }

    public final a0 p(C1056c cVar, int i2, String str, Exception exc) {
        u(i2, 9, cVar, C1071r.a(exc));
        zze.zzm("BillingClient", str, exc);
        return new a0(cVar, (Object) null, 20);
    }

    public final void q(a0 a0Var, C1056c cVar, int i2, String str, Exception exc) {
        zze.zzm("BillingClient", str, exc);
        u(i2, 4, cVar, C1071r.a(exc));
        a0Var.p(cVar);
    }

    public final Handler r() {
        if (Looper.myLooper() == null) {
            return this.d;
        }
        return new Handler(Looper.myLooper());
    }

    public final C1056c s() {
        zze.zzk("BillingClient", "Service connection is valid. No need to re-initialize.");
        zzkb zzc = zzkd.zzc();
        zzc.zzn(6);
        zzlv zzc2 = zzlx.zzc();
        zzc2.zza(true);
        zzc.zzm(zzc2);
        l((zzkd) zzc.zzf());
        return C1073t.h;
    }

    public final void t(int i2, int i5, C1056c cVar) {
        try {
            k(C1071r.b(i2, i5, cVar));
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    public final void u(int i2, int i5, C1056c cVar, String str) {
        try {
            k(C1071r.c(i2, i5, cVar, str));
        } catch (Throwable th) {
            zze.zzm("BillingClient", "Unable to log.", th);
        }
    }

    public final void v(C1056c cVar) {
        if (!Thread.interrupted()) {
            this.d.post(new g(this, cVar, 14));
        }
    }

    public C1054a(v vVar, Context context, C0937a aVar) {
        String i2 = i();
        long nextLong = new Random().nextLong();
        this.f12355y = Long.valueOf(nextLong);
        this.f12336c = i2;
        this.f12338f = context.getApplicationContext();
        zzks zzc = zzku.zzc();
        zzc.zzo(i2);
        zzc.zzn(this.f12338f.getPackageName());
        zzc.zzm(nextLong);
        this.g = new a0(this.f12338f, (zzku) zzc.zzf());
        if (aVar == null) {
            zze.zzl("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f12337e = new J(this.f12338f, aVar, this.g);
        this.f12351u = vVar;
        this.f12352v = false;
        this.f12338f.getPackageName();
    }
}
