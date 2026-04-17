package com.mtma.criminal.city.utils;

import Z2.d;
import a5.C0264a;
import d5.u;

/* renamed from: com.mtma.criminal.city.utils.q  reason: case insensitive filesystem */
public final /* synthetic */ class C0447q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7456a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f7457b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f7458c;
    public final /* synthetic */ C0264a d;

    public /* synthetic */ C0447q(u uVar, d dVar, C0264a aVar, int i2) {
        this.f7456a = i2;
        this.f7457b = uVar;
        this.f7458c = dVar;
        this.d = aVar;
    }

    public final void a(long j6, String str, boolean z3) {
        switch (this.f7456a) {
            case 0:
                d dVar = this.f7458c;
                C0264a aVar = this.d;
                if (!z3 || j6 <= 0 || !str.equals("cash")) {
                    dVar.b(true, aVar.currentPlace, str, j6);
                    return;
                }
                U.g(this.f7457b.getAccountObject().getId(), "cash", j6, new r(dVar, aVar, str, j6, 1));
                return;
            default:
                d dVar2 = this.f7458c;
                C0264a aVar2 = this.d;
                if (!z3 || j6 <= 0 || !str.equals("cash")) {
                    dVar2.b(true, aVar2.currentPlace, str, j6);
                    return;
                }
                U.g(this.f7457b.getAccountObject().getId(), "cash", j6, new r(dVar2, aVar2, str, j6, 0));
                return;
        }
    }
}
