package com.google.android.gms.common.api.internal;

import z1.d;

/* renamed from: com.google.android.gms.common.api.internal.z  reason: case insensitive filesystem */
public abstract class C0371z {

    /* renamed from: a  reason: collision with root package name */
    public final d[] f6116a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6117b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6118c;

    public C0371z(d[] dVarArr, boolean z3, int i2) {
        this.f6116a = dVarArr;
        boolean z4 = false;
        if (dVarArr != null && z3) {
            z4 = true;
        }
        this.f6117b = z4;
        this.f6118c = i2;
    }

    public static C0370y a() {
        C0370y yVar = new C0370y();
        yVar.f6114c = true;
        yVar.f6113b = 0;
        return yVar;
    }
}
