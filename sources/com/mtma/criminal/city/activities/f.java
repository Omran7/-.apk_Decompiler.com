package com.mtma.criminal.city.activities;

import e5.C0505b;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7056a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f7057b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0505b f7058c;

    public /* synthetic */ f(g gVar, C0505b bVar, int i2) {
        this.f7056a = i2;
        this.f7057b = gVar;
        this.f7058c = bVar;
    }

    public final void run() {
        switch (this.f7056a) {
            case 0:
                g gVar = this.f7057b;
                gVar.getClass();
                this.f7058c.dismiss();
                gVar.f7060b.finish();
                return;
            default:
                g gVar2 = this.f7057b;
                gVar2.getClass();
                this.f7058c.dismiss();
                gVar2.f7060b.finish();
                return;
        }
    }
}
