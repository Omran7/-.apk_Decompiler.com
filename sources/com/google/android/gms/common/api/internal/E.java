package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;
import n.f;
import z1.C1132b;
import z1.e;

public final class E extends C0358l implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f6019a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f6020b = new AtomicReference((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public final zau f6021c = new zau(Looper.getMainLooper());
    public final e d;

    /* renamed from: e  reason: collision with root package name */
    public final f f6022e;

    /* renamed from: f  reason: collision with root package name */
    public final C0354h f6023f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E(C0359m mVar, C0354h hVar) {
        super(mVar);
        e eVar = e.d;
        this.d = eVar;
        this.f6022e = new f(0);
        this.f6023f = hVar;
        this.mLifecycleFragment.b("ConnectionlessLifecycleHelper", this);
    }

    public final void onActivityResult(int i2, int i5, Intent intent) {
        AtomicReference atomicReference = this.f6020b;
        a0 a0Var = (a0) atomicReference.get();
        C0354h hVar = this.f6023f;
        if (i2 != 1) {
            if (i2 == 2) {
                int c3 = this.d.c(getActivity(), z1.f.f12810a);
                if (c3 == 0) {
                    atomicReference.set((Object) null);
                    zau zau = hVar.f6103n;
                    zau.sendMessage(zau.obtainMessage(3));
                    return;
                } else if (a0Var == null) {
                    return;
                } else {
                    if (a0Var.f6077b.f12801b == 18 && c3 == 18) {
                        return;
                    }
                }
            }
        } else if (i5 == -1) {
            atomicReference.set((Object) null);
            zau zau2 = hVar.f6103n;
            zau2.sendMessage(zau2.obtainMessage(3));
            return;
        } else if (i5 == 0) {
            if (a0Var != null) {
                int i6 = 13;
                if (intent != null) {
                    i6 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                C1132b bVar = new C1132b(1, i6, (PendingIntent) null, a0Var.f6077b.toString());
                atomicReference.set((Object) null);
                hVar.i(bVar, a0Var.f6076a);
                return;
            }
            return;
        }
        if (a0Var != null) {
            atomicReference.set((Object) null);
            hVar.i(a0Var.f6077b, a0Var.f6076a);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        int i2;
        C1132b bVar = new C1132b(13, (PendingIntent) null);
        AtomicReference atomicReference = this.f6020b;
        a0 a0Var = (a0) atomicReference.get();
        if (a0Var == null) {
            i2 = -1;
        } else {
            i2 = a0Var.f6076a;
        }
        atomicReference.set((Object) null);
        this.f6023f.i(bVar, i2);
    }

    public final void onCreate(Bundle bundle) {
        a0 a0Var;
        super.onCreate(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f6020b;
            if (bundle.getBoolean("resolving_error", false)) {
                a0Var = new a0(new C1132b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                a0Var = null;
            }
            atomicReference.set(a0Var);
        }
    }

    public final void onResume() {
        super.onResume();
        if (!this.f6022e.isEmpty()) {
            this.f6023f.b(this);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        a0 a0Var = (a0) this.f6020b.get();
        if (a0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", a0Var.f6076a);
            C1132b bVar = a0Var.f6077b;
            bundle.putInt("failed_status", bVar.f12801b);
            bundle.putParcelable("failed_resolution", bVar.f12802c);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f6019a = true;
        if (!this.f6022e.isEmpty()) {
            this.f6023f.b(this);
        }
    }

    public final void onStop() {
        this.f6019a = false;
        C0354h hVar = this.f6023f;
        hVar.getClass();
        synchronized (C0354h.f6091r) {
            try {
                if (hVar.f6100k == this) {
                    hVar.f6100k = null;
                    hVar.f6101l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
