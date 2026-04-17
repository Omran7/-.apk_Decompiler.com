package com.google.android.gms.internal.p002firebaseauthapi;

import R2.i;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0358l;
import com.google.android.gms.common.api.internal.C0359m;
import com.google.android.gms.common.internal.I;
import e3.C0495c;
import e3.m;
import e3.u;
import f3.C0533j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaex  reason: invalid package */
abstract class zzaex<ResultT, CallbackT> implements zzafi<ResultT> {
    protected final int zza;
    protected final zzaez zzb = new zzaez(this);
    protected i zzc;
    protected m zzd;
    protected CallbackT zze;
    protected C0533j zzf;
    protected zzaey<ResultT> zzg;
    protected final List<u> zzh = new ArrayList();
    protected Executor zzi;
    protected zzahn zzj;
    protected zzahc zzk;
    protected zzagn zzl;
    protected zzahx zzm;
    protected C0495c zzn;
    protected String zzo;
    protected String zzp;
    protected zzaaj zzq;
    protected zzahk zzr;
    protected zzahj zzs;
    protected zzaij zzt;
    /* access modifiers changed from: private */
    public boolean zzu;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaex$zza */
    public static class zza extends C0358l {
        private final List<u> zza;

        private zza(C0359m mVar, List<u> list) {
            super(mVar);
            this.mLifecycleFragment.b("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<u> list) {
            C0359m fragment = C0358l.getFragment(activity);
            if (((zza) fragment.d(zza.class, "PhoneAuthActivityStopCallback")) == null) {
                new zza(fragment, list);
            }
        }

        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaex(int i2) {
        this.zza = i2;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, (Status) null);
    }

    public final zzaex<ResultT, CallbackT> zza(CallbackT callbackt) {
        I.h(callbackt, "external callback cannot be null");
        this.zze = callbackt;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(C0533j jVar) {
        I.h(jVar, "external failure callback cannot be null");
        this.zzf = jVar;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(i iVar) {
        I.h(iVar, "firebaseApp cannot be null");
        this.zzc = iVar;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(m mVar) {
        I.h(mVar, "firebaseUser cannot be null");
        this.zzd = mVar;
        return this;
    }

    public final zzaex<ResultT, CallbackT> zza(u uVar, Activity activity, Executor executor, String str) {
        u zza2 = zzaft.zza(str, uVar, this);
        synchronized (this.zzh) {
            List<u> list = this.zzh;
            I.g(zza2);
            list.add(zza2);
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        I.g(executor);
        this.zzi = executor;
        return this;
    }

    public static /* synthetic */ void zza(zzaex zzaex) {
        zzaex.zzb();
        I.i("no success or failure set on method implementation", zzaex.zzu);
    }

    public static /* synthetic */ void zza(zzaex zzaex, Status status) {
        C0533j jVar = zzaex.zzf;
        if (jVar != null) {
            jVar.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
