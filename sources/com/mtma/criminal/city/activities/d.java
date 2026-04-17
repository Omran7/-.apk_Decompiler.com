package com.mtma.criminal.city.activities;

import e5.C0505b;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7051a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f7052b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0505b f7053c;

    public /* synthetic */ d(e eVar, C0505b bVar, int i2) {
        this.f7051a = i2;
        this.f7052b = eVar;
        this.f7053c = bVar;
    }

    public final void run() {
        switch (this.f7051a) {
            case 0:
                e eVar = this.f7052b;
                C0505b bVar = this.f7053c;
                if (bVar != null) {
                    eVar.getClass();
                    bVar.dismiss();
                }
                eVar.f7055b.finish();
                return;
            default:
                e eVar2 = this.f7052b;
                C0505b bVar2 = this.f7053c;
                if (bVar2 != null) {
                    eVar2.getClass();
                    bVar2.dismiss();
                }
                eVar2.f7055b.finish();
                return;
        }
    }
}
