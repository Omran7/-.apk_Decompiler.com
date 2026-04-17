package com.mtma.criminal.city.utils;

import Z2.d;
import a5.C0264a;
import d5.k;

/* renamed from: com.mtma.criminal.city.utils.p  reason: case insensitive filesystem */
public final /* synthetic */ class C0446p implements J {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7453a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f7454b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0264a f7455c;
    public final /* synthetic */ long d;

    public /* synthetic */ C0446p(d dVar, C0264a aVar, long j6, int i2) {
        this.f7453a = i2;
        this.f7454b = dVar;
        this.f7455c = aVar;
        this.d = j6;
    }

    public final void h(boolean z3, k kVar) {
        switch (this.f7453a) {
            case 0:
                d dVar = this.f7454b;
                C0264a aVar = this.f7455c;
                long j6 = this.d;
                if (z3) {
                    dVar.a(true, aVar.currentPlace, j6);
                    return;
                } else {
                    dVar.a(false, aVar.currentPlace, j6);
                    return;
                }
            default:
                d dVar2 = this.f7454b;
                C0264a aVar2 = this.f7455c;
                if (z3) {
                    dVar2.a(true, aVar2.currentPlace, this.d);
                    return;
                } else {
                    dVar2.a(false, aVar2.currentPlace, 0);
                    return;
                }
        }
    }
}
