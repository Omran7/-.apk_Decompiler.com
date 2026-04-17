package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.a;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.C0347a;
import com.google.android.gms.common.api.internal.C0350d;
import com.google.android.gms.common.api.internal.C0354h;
import com.google.android.gms.common.api.internal.C0358l;
import com.google.android.gms.common.api.internal.C0359m;
import com.google.android.gms.common.api.internal.C0360n;
import com.google.android.gms.common.api.internal.C0362p;
import com.google.android.gms.common.api.internal.C0363q;
import com.google.android.gms.common.api.internal.C0364s;
import com.google.android.gms.common.api.internal.C0365t;
import com.google.android.gms.common.api.internal.C0368w;
import com.google.android.gms.common.api.internal.C0371z;
import com.google.android.gms.common.api.internal.E;
import com.google.android.gms.common.api.internal.F;
import com.google.android.gms.common.api.internal.H;
import com.google.android.gms.common.api.internal.K;
import com.google.android.gms.common.api.internal.P;
import com.google.android.gms.common.api.internal.Q;
import com.google.android.gms.common.api.internal.W;
import com.google.android.gms.common.api.internal.X;
import com.google.android.gms.common.api.internal.Y;
import com.google.android.gms.common.internal.C0377f;
import com.google.android.gms.common.internal.C0379h;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import h0.C0552a;
import java.util.Collections;
import java.util.Set;
import n.f;
import z1.e;

public abstract class l {
    protected final C0354h zaa;
    private final Context zab;
    private final String zac;
    private final i zad;
    private final e zae;
    private final C0347a zaf;
    private final Looper zag;
    private final int zah;
    private final o zai;
    private final C0368w zaj;

    public l(Context context, Activity activity, i iVar, e eVar, k kVar) {
        String str;
        I.h(context, "Null context is not permitted.");
        I.h(iVar, "Api must not be null.");
        I.h(kVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        I.h(applicationContext, "The provided context did not have an application context.");
        this.zab = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = getApiFallbackAttributionTag(context);
        }
        this.zac = str;
        this.zad = iVar;
        this.zae = eVar;
        this.zag = kVar.f6121b;
        C0347a aVar = new C0347a(iVar, eVar, str);
        this.zaf = aVar;
        this.zai = new K(this);
        C0354h h = C0354h.h(applicationContext);
        this.zaa = h;
        this.zah = h.h.getAndIncrement();
        this.zaj = kVar.f6120a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C0359m fragment = C0358l.getFragment(activity);
            E e6 = (E) fragment.d(E.class, "ConnectionlessLifecycleHelper");
            if (e6 == null) {
                Object obj = e.f12809c;
                e6 = new E(fragment, h);
            }
            e6.f6022e.add(aVar);
            h.b(e6);
        }
        zau zau = h.f6103n;
        zau.sendMessage(zau.obtainMessage(7, this));
    }

    public final void a(int i2, C0350d dVar) {
        dVar.zak();
        C0354h hVar = this.zaa;
        hVar.getClass();
        P p6 = new P(new W(i2, dVar), hVar.f6098i.get(), this);
        zau zau = hVar.f6103n;
        zau.sendMessage(zau.obtainMessage(4, p6));
    }

    public o asGoogleApiClient() {
        return this.zai;
    }

    public final Task b(int i2, C0371z zVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C0368w wVar = this.zaj;
        C0354h hVar = this.zaa;
        hVar.getClass();
        hVar.g(taskCompletionSource, zVar.f6118c, this);
        P p6 = new P(new X(i2, zVar, taskCompletionSource, wVar), hVar.f6098i.get(), this);
        zau zau = hVar.f6103n;
        zau.sendMessage(zau.obtainMessage(4, p6));
        return taskCompletionSource.getTask();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.common.internal.h, java.lang.Object] */
    public C0379h createClientSettingsBuilder() {
        ? obj = new Object();
        Set emptySet = Collections.emptySet();
        if (obj.f6170a == null) {
            obj.f6170a = new f(0);
        }
        obj.f6170a.addAll(emptySet);
        obj.f6172c = this.zab.getClass().getName();
        obj.f6171b = this.zab.getPackageName();
        return obj;
    }

    public Task<Boolean> disconnectService() {
        C0354h hVar = this.zaa;
        hVar.getClass();
        F f6 = new F(getApiKey());
        zau zau = hVar.f6103n;
        zau.sendMessage(zau.obtainMessage(14, f6));
        return f6.f6025b.getTask();
    }

    public <A extends b, T extends C0350d> T doBestEffortWrite(T t6) {
        a(2, t6);
        return t6;
    }

    public <A extends b, T extends C0350d> T doRead(T t6) {
        a(0, t6);
        return t6;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends b, T extends C0364s, U extends A> Task<Void> doRegisterEventListener(T t6, U u6) {
        I.g(t6);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C0360n nVar) {
        return doUnregisterEventListener(nVar, 0);
    }

    public <A extends b, T extends C0350d> T doWrite(T t6) {
        a(1, t6);
        return t6;
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final C0347a getApiKey() {
        return this.zaf;
    }

    public e getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> C0362p registerListener(L l6, String str) {
        return a.n(this.zag, l6, str);
    }

    public final int zaa() {
        return this.zah;
    }

    public final g zab(Looper looper, H h) {
        C0379h createClientSettingsBuilder = createClientSettingsBuilder();
        C0380i iVar = new C0380i(createClientSettingsBuilder.f6170a, (n.e) null, createClientSettingsBuilder.f6171b, createClientSettingsBuilder.f6172c, V1.a.f3759a);
        a aVar = this.zad.f6010a;
        I.g(aVar);
        g buildClient = aVar.buildClient(this.zab, looper, iVar, (Object) this.zae, (m) h, (n) h);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof C0377f)) {
            ((C0377f) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(buildClient instanceof C0363q)) {
            return buildClient;
        }
        C0552a.y(buildClient);
        throw null;
    }

    public final Q zac(Context context, Handler handler) {
        C0379h createClientSettingsBuilder = createClientSettingsBuilder();
        return new Q(context, handler, new C0380i(createClientSettingsBuilder.f6170a, (n.e) null, createClientSettingsBuilder.f6171b, createClientSettingsBuilder.f6172c, V1.a.f3759a));
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doBestEffortWrite(C0371z zVar) {
        return b(2, zVar);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doRead(C0371z zVar) {
        return b(0, zVar);
    }

    @ResultIgnorabilityUnspecified
    public <A extends b> Task<Void> doRegisterEventListener(C0365t tVar) {
        I.g(tVar);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C0360n nVar, int i2) {
        I.h(nVar, "Listener key cannot be null.");
        C0354h hVar = this.zaa;
        hVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.g(taskCompletionSource, i2, this);
        P p6 = new P(new Y(nVar, taskCompletionSource), hVar.f6098i.get(), this);
        zau zau = hVar.f6103n;
        zau.sendMessage(zau.obtainMessage(13, p6));
        return taskCompletionSource.getTask();
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends b> Task<TResult> doWrite(C0371z zVar) {
        return b(1, zVar);
    }
}
