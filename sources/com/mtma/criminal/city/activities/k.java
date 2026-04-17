package com.mtma.criminal.city.activities;

import X4.d;
import e5.C0505b;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7065a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f7066b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0505b f7067c;

    public /* synthetic */ k(d dVar, C0505b bVar, int i2) {
        this.f7065a = i2;
        this.f7066b = dVar;
        this.f7067c = bVar;
    }

    public final void run() {
        switch (this.f7065a) {
            case 0:
                d dVar = this.f7066b;
                dVar.getClass();
                this.f7067c.dismiss();
                ((e) dVar.f4210c).f7055b.finish();
                return;
            default:
                d dVar2 = this.f7066b;
                dVar2.getClass();
                this.f7067c.dismiss();
                ((e) dVar2.f4210c).f7055b.finish();
                return;
        }
    }
}
