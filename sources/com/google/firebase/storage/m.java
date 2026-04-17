package com.google.firebase.storage;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6943a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f6944b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6945c;
    public final /* synthetic */ p d;

    public /* synthetic */ m(o oVar, Object obj, p pVar, int i2) {
        this.f6943a = i2;
        this.f6944b = oVar;
        this.f6945c = obj;
        this.d = pVar;
    }

    public final void run() {
        switch (this.f6943a) {
            case 0:
                ((n) this.f6944b.f6950e).b(this.f6945c, this.d);
                return;
            default:
                ((n) this.f6944b.f6950e).b(this.f6945c, this.d);
                return;
        }
    }
}
