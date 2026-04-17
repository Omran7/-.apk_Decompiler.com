package k;

import j.C0598A;

/* renamed from: k.I  reason: case insensitive filesystem */
public final class C0666I extends C0745w0 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0676N f9188s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ C0682Q f9189t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0666I(C0682Q q6, C0682Q q7, C0676N n2) {
        super(q7);
        this.f9189t = q6;
        this.f9188s = n2;
    }

    public final C0598A b() {
        return this.f9188s;
    }

    public final boolean c() {
        C0682Q q6 = this.f9189t;
        if (q6.getInternalPopup().b()) {
            return true;
        }
        q6.f9225f.m(q6.getTextDirection(), q6.getTextAlignment());
        return true;
    }
}
