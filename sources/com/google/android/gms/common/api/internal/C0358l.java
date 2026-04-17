package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0289v;
import com.google.android.gms.common.internal.I;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o3.d;

/* renamed from: com.google.android.gms.common.api.internal.l  reason: case insensitive filesystem */
public abstract class C0358l {
    protected final C0359m mLifecycleFragment;

    public C0358l(C0359m mVar) {
        this.mLifecycleFragment = mVar;
    }

    public static C0359m getFragment(Activity activity) {
        return getFragment(new C0357k(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity g = this.mLifecycleFragment.g();
        I.g(g);
        return g;
    }

    public void onActivityResult(int i2, int i5, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public abstract void onStop();

    public static C0359m getFragment(C0357k kVar) {
        d0 d0Var;
        e0 e0Var;
        Activity activity = kVar.f6105a;
        if (activity instanceof C0289v) {
            C0289v vVar = (C0289v) activity;
            WeakHashMap weakHashMap = e0.f6087e0;
            WeakReference weakReference = (WeakReference) weakHashMap.get(vVar);
            if (weakReference == null || (e0Var = (e0) weakReference.get()) == null) {
                try {
                    e0Var = (e0) vVar.l().A("SLifecycleFragmentImpl");
                    if (e0Var == null || e0Var.f5184u) {
                        e0Var = new e0();
                        androidx.fragment.app.I l6 = vVar.l();
                        C0269a b6 = d.b(l6, l6);
                        b6.f(0, e0Var, "SLifecycleFragmentImpl", 1);
                        b6.e(true);
                    }
                    weakHashMap.put(vVar, new WeakReference(e0Var));
                } catch (ClassCastException e6) {
                    throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e6);
                }
            }
            return e0Var;
        } else if (activity != null) {
            WeakHashMap weakHashMap2 = d0.f6085b;
            WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activity);
            if (weakReference2 == null || (d0Var = (d0) weakReference2.get()) == null) {
                try {
                    d0Var = (d0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (d0Var == null || d0Var.isRemoving()) {
                        d0Var = new d0();
                        activity.getFragmentManager().beginTransaction().add(d0Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap2.put(activity, new WeakReference(d0Var));
                } catch (ClassCastException e7) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e7);
                }
            }
            return d0Var;
        } else {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
    }

    public static C0359m getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
