package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.C0358l;
import com.google.android.gms.common.api.internal.C0359m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

final class zzv extends C0358l {
    private final List zza = new ArrayList();

    private zzv(C0359m mVar) {
        super(mVar);
        this.mLifecycleFragment.b("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzv;
        C0359m fragment = C0358l.getFragment(activity);
        synchronized (fragment) {
            try {
                zzv = (zzv) fragment.d(zzv.class, "TaskOnStopCallback");
                if (zzv == null) {
                    zzv = new zzv(fragment);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzv;
    }

    public final void onStop() {
        synchronized (this.zza) {
            try {
                for (WeakReference weakReference : this.zza) {
                    zzq zzq = (zzq) weakReference.get();
                    if (zzq != null) {
                        zzq.zzc();
                    }
                }
                this.zza.clear();
            } finally {
            }
        }
    }

    public final void zzb(zzq zzq) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzq));
        }
    }
}
