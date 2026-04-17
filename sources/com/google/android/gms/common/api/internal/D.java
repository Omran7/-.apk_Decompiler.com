package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6017a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6018b;

    public D(b0 b0Var, AlertDialog alertDialog) {
        this.f6018b = b0Var;
        this.f6017a = alertDialog;
    }

    public void a(Status status, boolean z3) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f6017a)) {
            hashMap = new HashMap((Map) this.f6017a);
        }
        synchronized (((Map) this.f6018b)) {
            hashMap2 = new HashMap((Map) this.f6018b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new j(status));
            }
        }
    }

    public D() {
        this.f6017a = Collections.synchronizedMap(new WeakHashMap());
        this.f6018b = Collections.synchronizedMap(new WeakHashMap());
    }
}
