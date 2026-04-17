package com.mtma.criminal.city.utils;

import Z2.d;
import a5.C0264a;

public final /* synthetic */ class r implements T {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7459a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f7460b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0264a f7461c;
    public final /* synthetic */ String d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f7462e;

    public /* synthetic */ r(d dVar, C0264a aVar, String str, long j6, int i2) {
        this.f7459a = i2;
        this.f7460b = dVar;
        this.f7461c = aVar;
        this.d = str;
        this.f7462e = j6;
    }

    public final void c(boolean z3) {
        switch (this.f7459a) {
            case 0:
                d dVar = this.f7460b;
                String str = this.d;
                C0264a aVar = this.f7461c;
                if (z3) {
                    dVar.b(true, aVar.currentPlace, str, this.f7462e);
                    return;
                } else {
                    dVar.b(true, aVar.currentPlace, str, 0);
                    return;
                }
            default:
                d dVar2 = this.f7460b;
                String str2 = this.d;
                C0264a aVar2 = this.f7461c;
                if (z3) {
                    dVar2.b(true, aVar2.currentPlace, str2, this.f7462e);
                    return;
                } else {
                    dVar2.b(true, aVar2.currentPlace, str2, 0);
                    return;
                }
        }
    }
}
