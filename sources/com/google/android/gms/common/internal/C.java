package com.google.android.gms.common.internal;

import android.os.Bundle;
import z1.C1132b;

public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f6132a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6133b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0377f f6134c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f6135e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0377f f6136f;

    public C(C0377f fVar, int i2, Bundle bundle) {
        this.f6136f = fVar;
        Boolean bool = Boolean.TRUE;
        this.f6134c = fVar;
        this.f6132a = bool;
        this.d = i2;
        this.f6135e = bundle;
    }

    public abstract void a(C1132b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f6132a = null;
        }
        synchronized (this.f6134c.zzt) {
            this.f6134c.zzt.remove(this);
        }
    }
}
