package com.google.android.gms.measurement.internal;

import B0.C0009h;
import B2.a;
import I3.h;
import J1.b;
import S3.m;
import T1.A0;
import T1.C0157b1;
import T1.C0159c0;
import T1.C0163d1;
import T1.C0169f1;
import T1.C0170g;
import T1.C0175h1;
import T1.C0181j1;
import T1.C0190m1;
import T1.C0203r0;
import T1.C0211u;
import T1.C0212u0;
import T1.C0214v;
import T1.C0221x0;
import T1.C0226z;
import T1.G;
import T1.H;
import T1.K0;
import T1.L0;
import T1.L1;
import T1.M0;
import T1.N1;
import T1.O;
import T1.P0;
import T1.R0;
import T1.S0;
import T1.V1;
import T1.W0;
import T1.X;
import T1.X0;
import T1.Y1;
import T1.Z;
import T1.Z0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzde;
import com.google.android.gms.internal.measurement.zzdg;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.internal.measurement.zzdj;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import n.e;
import n.j;

public class AppMeasurementDynamiteService extends zzcu {

    /* renamed from: a  reason: collision with root package name */
    public C0212u0 f6266a = null;

    /* renamed from: b  reason: collision with root package name */
    public final e f6267b = new j(0);

    public static void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdb zzdb) {
        try {
            zzdb.zze();
        } catch (RemoteException e6) {
            C0212u0 u0Var = appMeasurementDynamiteService.f6266a;
            I.g(u0Var);
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3175r.b(e6, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    public final void a() {
        if (this.f6266a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void b(String str, zzcy zzcy) {
        a();
        Y1 y12 = this.f6266a.f3499u;
        C0212u0.i(y12);
        y12.Q(str, zzcy);
    }

    public void beginAdUnitExposure(String str, long j6) {
        a();
        C0226z zVar = this.f6266a.f3504z;
        C0212u0.h(zVar);
        zVar.p(str, j6);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        b1Var.u(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        b1Var.p();
        C0203r0 r0Var = ((C0212u0) b1Var.f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new a(b1Var, (Object) null, 14, false));
    }

    public void endAdUnitExposure(String str, long j6) {
        a();
        C0226z zVar = this.f6266a.f3504z;
        C0212u0.h(zVar);
        zVar.q(str, j6);
    }

    public void generateEventId(zzcy zzcy) {
        a();
        Y1 y12 = this.f6266a.f3499u;
        C0212u0.i(y12);
        long y02 = y12.y0();
        a();
        Y1 y13 = this.f6266a.f3499u;
        C0212u0.i(y13);
        y13.P(zzcy, y02);
    }

    public void getAppInstanceId(zzcy zzcy) {
        a();
        C0203r0 r0Var = this.f6266a.f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new A0(this, zzcy, 0));
    }

    public void getCachedAppInstanceId(zzcy zzcy) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        b((String) b1Var.f3247p.get(), zzcy);
    }

    public void getConditionalUserProperties(String str, String str2, zzcy zzcy) {
        a();
        C0203r0 r0Var = this.f6266a.f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new C0221x0((Object) this, (Object) zzcy, (Object) str, (Object) str2, 6));
    }

    public void getCurrentScreenClass(zzcy zzcy) {
        String str;
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        C0190m1 m1Var = ((C0212u0) b1Var.f398a).f3502x;
        C0212u0.j(m1Var);
        C0181j1 j1Var = m1Var.f3380c;
        if (j1Var != null) {
            str = j1Var.f3356b;
        } else {
            str = null;
        }
        b(str, zzcy);
    }

    public void getCurrentScreenName(zzcy zzcy) {
        String str;
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        C0190m1 m1Var = ((C0212u0) b1Var.f398a).f3502x;
        C0212u0.j(m1Var);
        C0181j1 j1Var = m1Var.f3380c;
        if (j1Var != null) {
            str = j1Var.f3355a;
        } else {
            str = null;
        }
        b(str, zzcy);
    }

    public void getGmpAppId(zzcy zzcy) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        C0212u0 u0Var = (C0212u0) b1Var.f398a;
        String str = null;
        if (u0Var.f3494p.B((String) null, H.f2935p1) || u0Var.s() == null) {
            try {
                str = K0.h(u0Var.f3489a, u0Var.f3475B);
            } catch (IllegalStateException e6) {
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3172f.b(e6, "getGoogleAppId failed with exception");
            }
        } else {
            str = u0Var.s();
        }
        b(str, zzcy);
    }

    public void getMaxUserProperties(String str, zzcy zzcy) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        I.d(str);
        ((C0212u0) b1Var.f398a).getClass();
        a();
        Y1 y12 = this.f6266a.f3499u;
        C0212u0.i(y12);
        y12.O(zzcy, 25);
    }

    public void getSessionId(zzcy zzcy) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        C0203r0 r0Var = ((C0212u0) b1Var.f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new a(b1Var, zzcy, 13, false));
    }

    public void getTestFlag(zzcy zzcy, int i2) {
        a();
        if (i2 == 0) {
            Y1 y12 = this.f6266a.f3499u;
            C0212u0.i(y12);
            C0157b1 b1Var = this.f6266a.f3503y;
            C0212u0.j(b1Var);
            AtomicReference atomicReference = new AtomicReference();
            C0203r0 r0Var = ((C0212u0) b1Var.f398a).f3497s;
            C0212u0.k(r0Var);
            y12.Q((String) r0Var.t(atomicReference, 15000, "String test flag value", new P0(b1Var, atomicReference, 3)), zzcy);
        } else if (i2 == 1) {
            Y1 y13 = this.f6266a.f3499u;
            C0212u0.i(y13);
            C0157b1 b1Var2 = this.f6266a.f3503y;
            C0212u0.j(b1Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            C0203r0 r0Var2 = ((C0212u0) b1Var2.f398a).f3497s;
            C0212u0.k(r0Var2);
            y13.P(zzcy, ((Long) r0Var2.t(atomicReference2, 15000, "long test flag value", new P0(b1Var2, atomicReference2, 4))).longValue());
        } else if (i2 == 2) {
            Y1 y14 = this.f6266a.f3499u;
            C0212u0.i(y14);
            C0157b1 b1Var3 = this.f6266a.f3503y;
            C0212u0.j(b1Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            C0203r0 r0Var3 = ((C0212u0) b1Var3.f398a).f3497s;
            C0212u0.k(r0Var3);
            double doubleValue = ((Double) r0Var3.t(atomicReference3, 15000, "double test flag value", new P0(b1Var3, atomicReference3, 6))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zzcy.zze(bundle);
            } catch (RemoteException e6) {
                Z z3 = ((C0212u0) y14.f398a).f3496r;
                C0212u0.k(z3);
                z3.f3175r.b(e6, "Error returning double value to wrapper");
            }
        } else if (i2 == 3) {
            Y1 y15 = this.f6266a.f3499u;
            C0212u0.i(y15);
            C0157b1 b1Var4 = this.f6266a.f3503y;
            C0212u0.j(b1Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            C0203r0 r0Var4 = ((C0212u0) b1Var4.f398a).f3497s;
            C0212u0.k(r0Var4);
            y15.O(zzcy, ((Integer) r0Var4.t(atomicReference4, 15000, "int test flag value", new P0(b1Var4, atomicReference4, 5))).intValue());
        } else if (i2 == 4) {
            Y1 y16 = this.f6266a.f3499u;
            C0212u0.i(y16);
            C0157b1 b1Var5 = this.f6266a.f3503y;
            C0212u0.j(b1Var5);
            AtomicReference atomicReference5 = new AtomicReference();
            C0203r0 r0Var5 = ((C0212u0) b1Var5.f398a).f3497s;
            C0212u0.k(r0Var5);
            y16.K(zzcy, ((Boolean) r0Var5.t(atomicReference5, 15000, "boolean test flag value", new P0(b1Var5, atomicReference5, 2))).booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z3, zzcy zzcy) {
        a();
        C0203r0 r0Var = this.f6266a.f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new Z0(this, zzcy, str, str2, z3, 0));
    }

    public void initForTests(Map map) {
        a();
    }

    public void initialize(J1.a aVar, zzdh zzdh, long j6) {
        C0212u0 u0Var = this.f6266a;
        if (u0Var == null) {
            Context context = (Context) b.b(aVar);
            I.g(context);
            this.f6266a = C0212u0.q(context, zzdh, Long.valueOf(j6));
            return;
        }
        Z z3 = u0Var.f3496r;
        C0212u0.k(z3);
        z3.f3175r.a("Attempting to initialize multiple times");
    }

    public void isDataCollectionEnabled(zzcy zzcy) {
        a();
        C0203r0 r0Var = this.f6266a.f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new A0(this, zzcy, 1));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z4, long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        b1Var.y(str, str2, bundle, z3, z4, j6);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, zzcy zzcy, long j6) {
        Bundle bundle2;
        a();
        I.d(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        C0214v vVar = new C0214v(str2, new C0211u(bundle), "app", j6);
        C0203r0 r0Var = this.f6266a.f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new C0221x0(this, zzcy, vVar, str));
    }

    public void logHealthData(int i2, String str, J1.a aVar, J1.a aVar2, J1.a aVar3) {
        Object obj;
        Object obj2;
        a();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = b.b(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = b.b(aVar2);
        }
        if (aVar3 != null) {
            obj3 = b.b(aVar3);
        }
        Object obj4 = obj3;
        Z z3 = this.f6266a.f3496r;
        C0212u0.k(z3);
        z3.A(i2, true, false, str, obj, obj2, obj4);
    }

    public void onActivityCreated(J1.a aVar, Bundle bundle, long j6) {
        a();
        Activity activity = (Activity) b.b(aVar);
        I.g(activity);
        onActivityCreatedByScionActivityInfo(zzdj.zza(activity), bundle, j6);
    }

    public void onActivityCreatedByScionActivityInfo(zzdj zzdj, Bundle bundle, long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        m mVar = b1Var.f3244c;
        if (mVar != null) {
            C0157b1 b1Var2 = this.f6266a.f3503y;
            C0212u0.j(b1Var2);
            b1Var2.v();
            mVar.j(zzdj, bundle);
        }
    }

    public void onActivityDestroyed(J1.a aVar, long j6) {
        a();
        Activity activity = (Activity) b.b(aVar);
        I.g(activity);
        onActivityDestroyedByScionActivityInfo(zzdj.zza(activity), j6);
    }

    public void onActivityDestroyedByScionActivityInfo(zzdj zzdj, long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        m mVar = b1Var.f3244c;
        if (mVar != null) {
            C0157b1 b1Var2 = this.f6266a.f3503y;
            C0212u0.j(b1Var2);
            b1Var2.v();
            mVar.k(zzdj);
        }
    }

    public void onActivityPaused(J1.a aVar, long j6) {
        a();
        Activity activity = (Activity) b.b(aVar);
        I.g(activity);
        onActivityPausedByScionActivityInfo(zzdj.zza(activity), j6);
    }

    public void onActivityPausedByScionActivityInfo(zzdj zzdj, long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        m mVar = b1Var.f3244c;
        if (mVar != null) {
            C0157b1 b1Var2 = this.f6266a.f3503y;
            C0212u0.j(b1Var2);
            b1Var2.v();
            mVar.l(zzdj);
        }
    }

    public void onActivityResumed(J1.a aVar, long j6) {
        a();
        Activity activity = (Activity) b.b(aVar);
        I.g(activity);
        onActivityResumedByScionActivityInfo(zzdj.zza(activity), j6);
    }

    public void onActivityResumedByScionActivityInfo(zzdj zzdj, long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        m mVar = b1Var.f3244c;
        if (mVar != null) {
            C0157b1 b1Var2 = this.f6266a.f3503y;
            C0212u0.j(b1Var2);
            b1Var2.v();
            mVar.m(zzdj);
        }
    }

    public void onActivitySaveInstanceState(J1.a aVar, zzcy zzcy, long j6) {
        a();
        Activity activity = (Activity) b.b(aVar);
        I.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(zzdj.zza(activity), zzcy, j6);
    }

    public void onActivitySaveInstanceStateByScionActivityInfo(zzdj zzdj, zzcy zzcy, long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        m mVar = b1Var.f3244c;
        Bundle bundle = new Bundle();
        if (mVar != null) {
            C0157b1 b1Var2 = this.f6266a.f3503y;
            C0212u0.j(b1Var2);
            b1Var2.v();
            mVar.n(zzdj, bundle);
        }
        try {
            zzcy.zze(bundle);
        } catch (RemoteException e6) {
            Z z3 = this.f6266a.f3496r;
            C0212u0.k(z3);
            z3.f3175r.b(e6, "Error returning bundle value to wrapper");
        }
    }

    public void onActivityStarted(J1.a aVar, long j6) {
        a();
        Activity activity = (Activity) b.b(aVar);
        I.g(activity);
        onActivityStartedByScionActivityInfo(zzdj.zza(activity), j6);
    }

    public void onActivityStartedByScionActivityInfo(zzdj zzdj, long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        if (b1Var.f3244c != null) {
            C0157b1 b1Var2 = this.f6266a.f3503y;
            C0212u0.j(b1Var2);
            b1Var2.v();
        }
    }

    public void onActivityStopped(J1.a aVar, long j6) {
        a();
        Activity activity = (Activity) b.b(aVar);
        I.g(activity);
        onActivityStoppedByScionActivityInfo(zzdj.zza(activity), j6);
    }

    public void onActivityStoppedByScionActivityInfo(zzdj zzdj, long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        if (b1Var.f3244c != null) {
            C0157b1 b1Var2 = this.f6266a.f3503y;
            C0212u0.j(b1Var2);
            b1Var2.v();
        }
    }

    public void performAction(Bundle bundle, zzcy zzcy, long j6) {
        a();
        zzcy.zze((Bundle) null);
    }

    public void registerOnMeasurementEventListener(zzde zzde) {
        Object obj;
        a();
        e eVar = this.f6267b;
        synchronized (eVar) {
            try {
                obj = (M0) eVar.get(Integer.valueOf(zzde.zze()));
                if (obj == null) {
                    obj = new V1(this, zzde);
                    eVar.put(Integer.valueOf(zzde.zze()), obj);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        b1Var.p();
        if (!b1Var.f3245e.add(obj)) {
            Z z3 = ((C0212u0) b1Var.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3175r.a("OnEventListener already registered");
        }
    }

    public void resetAnalyticsData(long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        b1Var.f3247p.set((Object) null);
        C0203r0 r0Var = ((C0212u0) b1Var.f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new X0(b1Var, j6, 1));
    }

    public void retrieveAndUploadBatches(zzdb zzdb) {
        C0175h1 h1Var;
        a();
        C0170g gVar = this.f6266a.f3494p;
        G g = H.f2876R0;
        if (gVar.B((String) null, g)) {
            C0157b1 b1Var = this.f6266a.f3503y;
            C0212u0.j(b1Var);
            C0212u0 u0Var = (C0212u0) b1Var.f398a;
            if (u0Var.f3494p.B((String) null, g)) {
                b1Var.p();
                C0203r0 r0Var = u0Var.f3497s;
                C0212u0.k(r0Var);
                if (!r0Var.A()) {
                    C0203r0 r0Var2 = u0Var.f3497s;
                    C0212u0.k(r0Var2);
                    if (Thread.currentThread() == r0Var2.d) {
                        Z z3 = u0Var.f3496r;
                        C0212u0.k(z3);
                        z3.f3172f.a("Cannot retrieve and upload batches from analytics network thread");
                    } else if (!s2.e.n()) {
                        Z z4 = u0Var.f3496r;
                        C0212u0.k(z4);
                        z4.f3180w.a("[sgtm] Started client-side batch upload work.");
                        boolean z5 = false;
                        int i2 = 0;
                        int i5 = 0;
                        while (!z5) {
                            Z z6 = u0Var.f3496r;
                            C0212u0.k(z6);
                            z6.f3180w.a("[sgtm] Getting upload batches from service (FE)");
                            AtomicReference atomicReference = new AtomicReference();
                            C0203r0 r0Var3 = u0Var.f3497s;
                            C0212u0.k(r0Var3);
                            r0Var3.t(atomicReference, 10000, "[sgtm] Getting upload batches", new P0(b1Var, atomicReference, 1));
                            N1 n12 = (N1) atomicReference.get();
                            if (n12 == null) {
                                break;
                            }
                            List list = n12.f2997a;
                            if (!list.isEmpty()) {
                                Z z7 = u0Var.f3496r;
                                C0212u0.k(z7);
                                z7.f3180w.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
                                i2 += list.size();
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z5 = false;
                                        break;
                                    }
                                    L1 l12 = (L1) it2.next();
                                    try {
                                        URL url = new URI(l12.f2985c).toURL();
                                        AtomicReference atomicReference2 = new AtomicReference();
                                        O n2 = ((C0212u0) b1Var.f398a).n();
                                        n2.p();
                                        I.g(n2.f3002p);
                                        String str = n2.f3002p;
                                        C0212u0 u0Var2 = (C0212u0) b1Var.f398a;
                                        Z z8 = u0Var2.f3496r;
                                        C0212u0.k(z8);
                                        X x6 = z8.f3180w;
                                        Long valueOf = Long.valueOf(l12.f2983a);
                                        x6.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, l12.f2985c, Integer.valueOf(l12.f2984b.length));
                                        if (!TextUtils.isEmpty(l12.f2988p)) {
                                            Z z9 = u0Var2.f3496r;
                                            C0212u0.k(z9);
                                            z9.f3180w.c("[sgtm] Uploading data from app. row_id", valueOf, l12.f2988p);
                                        }
                                        HashMap hashMap = new HashMap();
                                        Bundle bundle = l12.d;
                                        for (String next : bundle.keySet()) {
                                            String string = bundle.getString(next);
                                            if (!TextUtils.isEmpty(string)) {
                                                hashMap.put(next, string);
                                            }
                                        }
                                        C0169f1 f1Var = u0Var2.f3474A;
                                        C0212u0.k(f1Var);
                                        byte[] bArr = l12.f2984b;
                                        C0009h hVar = new C0009h((Object) b1Var, (Object) atomicReference2, (Object) l12, 23);
                                        f1Var.q();
                                        I.g(url);
                                        I.g(bArr);
                                        C0203r0 r0Var4 = ((C0212u0) f1Var.f398a).f3497s;
                                        C0212u0.k(r0Var4);
                                        C0159c0 c0Var = r10;
                                        C0159c0 c0Var2 = new C0159c0(f1Var, str, url, bArr, hashMap, (C0163d1) hVar);
                                        r0Var4.x(c0Var);
                                        try {
                                            Y1 y12 = u0Var2.f3499u;
                                            C0212u0.i(y12);
                                            C0212u0 u0Var3 = (C0212u0) y12.f398a;
                                            u0Var3.f3501w.getClass();
                                            long j6 = 60000;
                                            long currentTimeMillis = System.currentTimeMillis() + 60000;
                                            synchronized (atomicReference2) {
                                                while (atomicReference2.get() == null && j6 > 0) {
                                                    atomicReference2.wait(j6);
                                                    u0Var3.f3501w.getClass();
                                                    j6 = currentTimeMillis - System.currentTimeMillis();
                                                }
                                            }
                                        } catch (InterruptedException unused) {
                                            Z z10 = ((C0212u0) b1Var.f398a).f3496r;
                                            C0212u0.k(z10);
                                            z10.f3175r.a("[sgtm] Interrupted waiting for uploading batch");
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        if (atomicReference2.get() == null) {
                                            h1Var = C0175h1.UNKNOWN;
                                        } else {
                                            h1Var = (C0175h1) atomicReference2.get();
                                        }
                                    } catch (MalformedURLException | URISyntaxException e6) {
                                        Z z11 = ((C0212u0) b1Var.f398a).f3496r;
                                        C0212u0.k(z11);
                                        z11.f3172f.d("[sgtm] Bad upload url for row_id", l12.f2985c, Long.valueOf(l12.f2983a), e6);
                                        h1Var = C0175h1.FAILURE;
                                    }
                                    if (h1Var == C0175h1.SUCCESS) {
                                        i5++;
                                    } else if (h1Var == C0175h1.BACKOFF) {
                                        z5 = true;
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        Z z12 = u0Var.f3496r;
                        C0212u0.k(z12);
                        z12.f3180w.c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i2), Integer.valueOf(i5));
                        $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(this, zzdb);
                    } else {
                        Z z13 = u0Var.f3496r;
                        C0212u0.k(z13);
                        z13.f3172f.a("Cannot retrieve and upload batches from main thread");
                    }
                } else {
                    Z z14 = u0Var.f3496r;
                    C0212u0.k(z14);
                    z14.f3172f.a("Cannot retrieve and upload batches from analytics worker thread");
                }
            }
        }
    }

    public void setConditionalUserProperty(Bundle bundle, long j6) {
        a();
        if (bundle == null) {
            Z z3 = this.f6266a.f3496r;
            C0212u0.k(z3);
            z3.f3172f.a("Conditional user property must not be null");
            return;
        }
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        b1Var.D(bundle, j6);
    }

    public void setConsent(Bundle bundle, long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        C0203r0 r0Var = ((C0212u0) b1Var.f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.z(new S0(b1Var, bundle, j6));
    }

    public void setConsentThirdParty(Bundle bundle, long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        b1Var.E(bundle, -20, j6);
    }

    public void setCurrentScreen(J1.a aVar, String str, String str2, long j6) {
        a();
        Activity activity = (Activity) b.b(aVar);
        I.g(activity);
        setCurrentScreenByScionActivityInfo(zzdj.zza(activity), str, str2, j6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008c, code lost:
        if (r3 <= 500) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b5, code lost:
        if (r3 <= 500) goto L_0x00cd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj r6, java.lang.String r7, java.lang.String r8, long r9) {
        /*
            r5 = this;
            r5.a()
            T1.u0 r9 = r5.f6266a
            T1.m1 r9 = r9.f3502x
            T1.C0212u0.j(r9)
            java.lang.Object r10 = r9.f398a
            T1.u0 r10 = (T1.C0212u0) r10
            T1.g r0 = r10.f3494p
            boolean r0 = r0.C()
            if (r0 != 0) goto L_0x0024
            T1.Z r6 = r10.f3496r
            T1.C0212u0.k(r6)
            T1.X r6 = r6.f3177t
            java.lang.String r7 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r6.a(r7)
            goto L_0x00f6
        L_0x0024:
            T1.j1 r0 = r9.f3380c
            if (r0 != 0) goto L_0x0036
            T1.Z r6 = r10.f3496r
            T1.C0212u0.k(r6)
            T1.X r6 = r6.f3177t
            java.lang.String r7 = "setCurrentScreen cannot be called while no activity active"
            r6.a(r7)
            goto L_0x00f6
        L_0x0036:
            java.util.concurrent.ConcurrentHashMap r1 = r9.f3382f
            int r2 = r6.zza
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r1.get(r2)
            if (r3 != 0) goto L_0x0052
            T1.Z r6 = r10.f3496r
            T1.C0212u0.k(r6)
            T1.X r6 = r6.f3177t
            java.lang.String r7 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r6.a(r7)
            goto L_0x00f6
        L_0x0052:
            if (r8 != 0) goto L_0x005a
            java.lang.String r8 = r6.zzb
            java.lang.String r8 = r9.w(r8)
        L_0x005a:
            java.lang.String r3 = r0.f3356b
            java.lang.String r0 = r0.f3355a
            boolean r3 = java.util.Objects.equals(r3, r8)
            boolean r0 = java.util.Objects.equals(r0, r7)
            if (r3 == 0) goto L_0x0079
            if (r0 != 0) goto L_0x006b
            goto L_0x0079
        L_0x006b:
            T1.Z r6 = r10.f3496r
            T1.C0212u0.k(r6)
            T1.X r6 = r6.f3177t
            java.lang.String r7 = "setCurrentScreen cannot be called with the same class and name"
            r6.a(r7)
            goto L_0x00f6
        L_0x0079:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r7 == 0) goto L_0x00a4
            int r3 = r7.length()
            if (r3 <= 0) goto L_0x008f
            int r3 = r7.length()
            T1.g r4 = r10.f3494p
            r4.getClass()
            if (r3 > r0) goto L_0x008f
            goto L_0x00a4
        L_0x008f:
            T1.Z r6 = r10.f3496r
            T1.C0212u0.k(r6)
            T1.X r6 = r6.f3177t
            int r7 = r7.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "Invalid screen name length in setCurrentScreen. Length"
            r6.b(r7, r8)
            goto L_0x00f6
        L_0x00a4:
            if (r8 == 0) goto L_0x00cd
            int r3 = r8.length()
            if (r3 <= 0) goto L_0x00b8
            int r3 = r8.length()
            T1.g r4 = r10.f3494p
            r4.getClass()
            if (r3 > r0) goto L_0x00b8
            goto L_0x00cd
        L_0x00b8:
            T1.Z r6 = r10.f3496r
            T1.C0212u0.k(r6)
            T1.X r6 = r6.f3177t
            int r7 = r8.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "Invalid class name length in setCurrentScreen. Length"
            r6.b(r7, r8)
            goto L_0x00f6
        L_0x00cd:
            T1.Z r0 = r10.f3496r
            T1.C0212u0.k(r0)
            T1.X r0 = r0.f3180w
            if (r7 != 0) goto L_0x00d9
            java.lang.String r3 = "null"
            goto L_0x00da
        L_0x00d9:
            r3 = r7
        L_0x00da:
            java.lang.String r4 = "Setting current screen to name, class"
            r0.c(r4, r3, r8)
            T1.j1 r0 = new T1.j1
            T1.Y1 r10 = r10.f3499u
            T1.C0212u0.i(r10)
            long r3 = r10.y0()
            r0.<init>(r3, r7, r8)
            r1.put(r2, r0)
            java.lang.String r6 = r6.zzb
            r7 = 1
            r9.s(r6, r0, r7)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdj, java.lang.String, java.lang.String, long):void");
    }

    public void setDataCollectionEnabled(boolean z3) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        b1Var.p();
        C0203r0 r0Var = ((C0212u0) b1Var.f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new W0(b1Var, z3, 0));
    }

    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        C0203r0 r0Var = ((C0212u0) b1Var.f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new R0(b1Var, bundle2, 0));
    }

    public void setEventInterceptor(zzde zzde) {
        boolean z3;
        a();
        h hVar = new h((Object) this, (Object) zzde, 26);
        C0203r0 r0Var = this.f6266a.f3497s;
        C0212u0.k(r0Var);
        if (r0Var.A()) {
            C0157b1 b1Var = this.f6266a.f3503y;
            C0212u0.j(b1Var);
            b1Var.o();
            b1Var.p();
            L0 l02 = b1Var.d;
            if (hVar != l02) {
                if (l02 == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                I.i("EventInterceptor already set.", z3);
            }
            b1Var.d = hVar;
            return;
        }
        C0203r0 r0Var2 = this.f6266a.f3497s;
        C0212u0.k(r0Var2);
        r0Var2.y(new a(this, hVar, 16, false));
    }

    public void setInstanceIdProvider(zzdg zzdg) {
        a();
    }

    public void setMeasurementEnabled(boolean z3, long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        Boolean valueOf = Boolean.valueOf(z3);
        b1Var.p();
        C0203r0 r0Var = ((C0212u0) b1Var.f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new a(b1Var, valueOf, 14, false));
    }

    public void setMinimumSessionDuration(long j6) {
        a();
    }

    public void setSessionTimeoutDuration(long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        C0203r0 r0Var = ((C0212u0) b1Var.f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.y(new X0(b1Var, j6, 0));
    }

    public void setSgtmDebugInfo(Intent intent) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        Uri data = intent.getData();
        C0212u0 u0Var = (C0212u0) b1Var.f398a;
        if (data == null) {
            Z z3 = u0Var.f3496r;
            C0212u0.k(z3);
            z3.f3178u.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            Z z4 = u0Var.f3496r;
            C0212u0.k(z4);
            z4.f3178u.a("[sgtm] Preview Mode was not enabled.");
            u0Var.f3494p.f3293c = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (!TextUtils.isEmpty(queryParameter2)) {
            Z z5 = u0Var.f3496r;
            C0212u0.k(z5);
            z5.f3178u.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
            u0Var.f3494p.f3293c = queryParameter2;
        }
    }

    public void setUserId(String str, long j6) {
        a();
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        C0212u0 u0Var = (C0212u0) b1Var.f398a;
        if (str == null || !TextUtils.isEmpty(str)) {
            C0203r0 r0Var = u0Var.f3497s;
            C0212u0.k(r0Var);
            r0Var.y(new a((Object) b1Var, (Object) str, 11));
            b1Var.I((String) null, "_id", str, true, j6);
            return;
        }
        Z z3 = u0Var.f3496r;
        C0212u0.k(z3);
        z3.f3175r.a("User ID must be non-empty or null");
    }

    public void setUserProperty(String str, String str2, J1.a aVar, boolean z3, long j6) {
        a();
        Object b6 = b.b(aVar);
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        b1Var.I(str, str2, b6, z3, j6);
    }

    public void unregisterOnMeasurementEventListener(zzde zzde) {
        Object obj;
        a();
        e eVar = this.f6267b;
        synchronized (eVar) {
            obj = (M0) eVar.remove(Integer.valueOf(zzde.zze()));
        }
        if (obj == null) {
            obj = new V1(this, zzde);
        }
        C0157b1 b1Var = this.f6266a.f3503y;
        C0212u0.j(b1Var);
        b1Var.p();
        if (!b1Var.f3245e.remove(obj)) {
            Z z3 = ((C0212u0) b1Var.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3175r.a("OnEventListener had not been registered");
        }
    }
}
