package com.google.android.gms.common.internal;

import B0.C0004c;
import I1.a;
import R2.b;
import T1.A;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.H;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import z1.C1132b;
import z1.d;
import z1.f;

/* renamed from: com.google.android.gms.common.internal.f  reason: case insensitive filesystem */
public abstract class C0377f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private static final d[] zze = new d[0];
    private volatile String zzA;
    private volatile a zzB;
    /* access modifiers changed from: private */
    public C1132b zzC = null;
    /* access modifiers changed from: private */
    public boolean zzD = false;
    private volatile P zzE = null;
    W zza;
    final Handler zzb;
    protected C0375d zzc;
    protected AtomicInteger zzd = new AtomicInteger(0);
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk = null;
    private final Context zzl;
    private final Looper zzm;
    private final C0384m zzn;
    private final f zzo;
    private final Object zzp = new Object();
    /* access modifiers changed from: private */
    public final Object zzq = new Object();
    /* access modifiers changed from: private */
    public C0388q zzr;
    private IInterface zzs;
    /* access modifiers changed from: private */
    public final ArrayList zzt = new ArrayList();
    private M zzu;
    private int zzv = 1;
    /* access modifiers changed from: private */
    public final C0373b zzw;
    /* access modifiers changed from: private */
    public final C0374c zzx;
    private final int zzy;
    private final String zzz;

    public C0377f(Context context, Looper looper, U u6, f fVar, int i2, C0373b bVar, C0374c cVar, String str) {
        I.h(context, "Context must not be null");
        this.zzl = context;
        I.h(looper, "Looper must not be null");
        this.zzm = looper;
        I.h(u6, "Supervisor must not be null");
        this.zzn = u6;
        I.h(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzb = new K(this, looper);
        this.zzy = i2;
        this.zzw = bVar;
        this.zzx = cVar;
        this.zzz = str;
    }

    public static void zzj(C0377f fVar, P p6) {
        C0391u uVar;
        fVar.zzE = p6;
        if (fVar.usesClientTelemetry()) {
            C0381j jVar = p6.d;
            C0390t e6 = C0390t.e();
            if (jVar == null) {
                uVar = null;
            } else {
                uVar = jVar.f6178a;
            }
            synchronized (e6) {
                if (uVar == null) {
                    uVar = C0390t.f6215c;
                } else {
                    C0391u uVar2 = (C0391u) e6.f6216a;
                    if (uVar2 != null) {
                        if (uVar2.f6217a < uVar.f6217a) {
                        }
                    }
                }
                e6.f6216a = uVar;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(C0377f fVar, int i2) {
        int i5;
        int i6;
        synchronized (fVar.zzp) {
            i5 = fVar.zzv;
        }
        if (i5 == 3) {
            fVar.zzD = true;
            i6 = 5;
        } else {
            i6 = 4;
        }
        Handler handler = fVar.zzb;
        handler.sendMessage(handler.obtainMessage(i6, fVar.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(C0377f fVar, int i2, int i5, IInterface iInterface) {
        synchronized (fVar.zzp) {
            try {
                if (fVar.zzv != i2) {
                    return false;
                }
                fVar.a(i5, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(C0377f fVar) {
        if (fVar.zzD || TextUtils.isEmpty(fVar.getServiceDescriptor()) || TextUtils.isEmpty(fVar.getLocalStartServiceAction())) {
            return false;
        }
        try {
            Class.forName(fVar.getServiceDescriptor());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void a(int i2, IInterface iInterface) {
        boolean z3;
        boolean z4;
        boolean z5;
        W w6;
        W w7;
        boolean z6 = false;
        if (i2 != 4) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (iInterface == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 == z4) {
            z5 = true;
        } else {
            z5 = false;
        }
        I.b(z5);
        synchronized (this.zzp) {
            try {
                this.zzv = i2;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i2 == 1) {
                    M m6 = this.zzu;
                    if (m6 != null) {
                        C0384m mVar = this.zzn;
                        String str = this.zza.f6164a;
                        I.g(str);
                        String str2 = this.zza.f6165b;
                        zze();
                        mVar.c(str, str2, m6, this.zza.f6166c);
                        this.zzu = null;
                    }
                } else if (i2 == 2 || i2 == 3) {
                    M m7 = this.zzu;
                    if (!(m7 == null || (w7 = this.zza) == null)) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + w7.f6164a + " on " + w7.f6165b);
                        C0384m mVar2 = this.zzn;
                        String str3 = this.zza.f6164a;
                        I.g(str3);
                        String str4 = this.zza.f6165b;
                        zze();
                        mVar2.c(str3, str4, m7, this.zza.f6166c);
                        this.zzd.incrementAndGet();
                    }
                    M m8 = new M(this, this.zzd.get());
                    this.zzu = m8;
                    if (this.zzv != 3 || getLocalStartServiceAction() == null) {
                        w6 = new W(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup());
                    } else {
                        w6 = new W(getContext().getPackageName(), getLocalStartServiceAction(), false);
                    }
                    this.zza = w6;
                    if (w6.f6166c) {
                        if (getMinApkVersion() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f6164a)));
                        }
                    }
                    C0384m mVar3 = this.zzn;
                    String str5 = this.zza.f6164a;
                    I.g(str5);
                    String str6 = this.zza.f6165b;
                    C1132b b6 = mVar3.b(new Q(str5, str6, this.zza.f6166c), m8, zze(), getBindServiceExecutor());
                    if (b6.f12801b == 0) {
                        z6 = true;
                    }
                    if (!z6) {
                        W w8 = this.zza;
                        Log.w("GmsClient", "unable to connect to service: " + w8.f6164a + " on " + w8.f6165b);
                        int i5 = b6.f12801b;
                        if (i5 == -1) {
                            i5 = 16;
                        }
                        if (b6.f12802c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable(KEY_PENDING_INTENT, b6.f12802c);
                        }
                        zzl(i5, bundle, this.zzd.get());
                    }
                } else if (i2 == 4) {
                    I.g(iInterface);
                    onConnectedLocked(iInterface);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int c3 = this.zzo.c(this.zzl, getMinApkVersion());
        if (c3 != 0) {
            a(1, (IInterface) null);
            triggerNotAvailable(new C0390t(this), c3, (PendingIntent) null);
            return;
        }
        connect(new C0390t(this));
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(C0375d dVar) {
        I.h(dVar, "Connection progress callbacks cannot be null.");
        this.zzc = dVar;
        a(2, (IInterface) null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C c3 = (C) this.zzt.get(i2);
                    synchronized (c3) {
                        c3.f6132a = null;
                    }
                }
                this.zzt.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        a(1, (IInterface) null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2;
        IInterface iInterface;
        C0388q qVar;
        synchronized (this.zzp) {
            i2 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            qVar = this.zzr;
        }
        printWriter.append(str).append("mConnectState=");
        if (i2 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i2 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i2 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i2 == 4) {
            printWriter.print("CONNECTED");
        } else if (i2 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (qVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((E) qVar).asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j6 = this.zzh;
            String format = simpleDateFormat.format(new Date(j6));
            append.println(j6 + " " + format);
        }
        if (this.zzg > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i5 = this.zzf;
            if (i5 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i5 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i5 != 3) {
                printWriter.append(String.valueOf(i5));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j7 = this.zzg;
            String format2 = simpleDateFormat.format(new Date(j7));
            append2.println(j7 + " " + format2);
        }
        if (this.zzj > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(b.b0(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j8 = this.zzj;
            String format3 = simpleDateFormat.format(new Date(j8));
            append3.println(j8 + " " + format3);
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public d[] getApiFeatures() {
        return zze;
    }

    public a getAttributionSourceWrapper() {
        return null;
    }

    public final d[] getAvailableFeatures() {
        P p6 = this.zzE;
        if (p6 == null) {
            return null;
        }
        return p6.f6149b;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        W w6;
        if (isConnected() && (w6 = this.zza) != null) {
            return w6.f6165b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(C0386o oVar, Set<Scope> set) {
        String str;
        Set<Scope> set2 = set;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        if (Build.VERSION.SDK_INT < 31) {
            str = this.zzA;
        } else {
            str = this.zzA;
        }
        String str2 = str;
        int i2 = this.zzy;
        int i5 = f.f12810a;
        Scope[] scopeArr = C0382k.f6183x;
        Bundle bundle = new Bundle();
        d[] dVarArr = C0382k.f6184y;
        C0382k kVar = r3;
        C0382k kVar2 = new C0382k(6, i2, i5, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, dVarArr, dVarArr, true, 0, false, str2);
        C0382k kVar3 = kVar;
        kVar3.d = this.zzl.getPackageName();
        kVar3.f6190p = getServiceRequestExtraArgs;
        if (set2 != null) {
            kVar3.f6189f = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            kVar3.f6191q = account;
            if (oVar != null) {
                kVar3.f6188e = oVar.asBinder();
            }
        } else if (requiresAccount()) {
            kVar3.f6191q = getAccount();
        }
        kVar3.f6192r = zze;
        kVar3.f6193s = getApiFeatures();
        if (usesClientTelemetry()) {
            kVar3.f6196v = true;
        }
        try {
            synchronized (this.zzq) {
                C0388q qVar = this.zzr;
                if (qVar != null) {
                    ((E) qVar).a(new L(this, this.zzd.get()), kVar3);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e6) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e6);
            triggerConnectionSuspended(3);
        } catch (SecurityException e7) {
            throw e7;
        } catch (RemoteException | RuntimeException e8) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e8);
            onPostInitHandler(8, (IBinder) null, (Bundle) null, this.zzd.get());
        } catch (Throwable th) {
            throw th;
        }
    }

    public Set getScopes() {
        return Collections.emptySet();
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv != 5) {
                    checkConnected();
                    iInterface = this.zzs;
                    I.h(iInterface, "Client is connected but service is null");
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                C0388q qVar = this.zzr;
                if (qVar == null) {
                    return null;
                }
                IBinder asBinder = ((E) qVar).asBinder();
                return asBinder;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C0381j getTelemetryConfiguration() {
        P p6 = this.zzE;
        if (p6 == null) {
            return null;
        }
        return p6.d;
    }

    public boolean getUseDynamicLookup() {
        if (getMinApkVersion() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean hasConnectionInfo() {
        return this.zzE != null;
    }

    public boolean isConnected() {
        boolean z3;
        synchronized (this.zzp) {
            if (this.zzv == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public boolean isConnecting() {
        boolean z3;
        synchronized (this.zzp) {
            int i2 = this.zzv;
            z3 = true;
            if (i2 != 2) {
                if (i2 != 3) {
                    z3 = false;
                }
            }
        }
        return z3;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(C1132b bVar) {
        this.zzi = bVar.f12801b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i2) {
        this.zzf = i2;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i2, IBinder iBinder, Bundle bundle, int i5) {
        this.zzb.sendMessage(this.zzb.obtainMessage(1, i5, -1, new N(this, i2, iBinder, bundle)));
    }

    public void onUserSignOut(C0376e eVar) {
        A a6 = (A) eVar;
        ((H) a6.f2796b).f6038n.f6103n.post(new C0004c((Object) a6, 22));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i2) {
        this.zzb.sendMessage(this.zzb.obtainMessage(6, this.zzd.get(), i2));
    }

    public void triggerNotAvailable(C0375d dVar, int i2, PendingIntent pendingIntent) {
        I.h(dVar, "Connection progress callbacks cannot be null.");
        this.zzc = dVar;
        this.zzb.sendMessage(this.zzb.obtainMessage(3, this.zzd.get(), i2, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        if (str == null) {
            return this.zzl.getClass().getName();
        }
        return str;
    }

    public final void zzl(int i2, Bundle bundle, int i5) {
        this.zzb.sendMessage(this.zzb.obtainMessage(7, i5, -1, new O(this, i2, bundle)));
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void setAttributionSourceWrapper(a aVar) {
    }
}
