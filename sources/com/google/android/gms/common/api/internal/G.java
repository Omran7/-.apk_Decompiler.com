package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zau;
import f3.C0531h;
import f3.C0541r;

public final class G implements C0348b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6026a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f6027b;

    public /* synthetic */ G(Object obj, int i2) {
        this.f6026a = i2;
        this.f6027b = obj;
    }

    public final void a(boolean z3) {
        switch (this.f6026a) {
            case 0:
                zau zau = ((C0354h) this.f6027b).f6103n;
                zau.sendMessage(zau.obtainMessage(1, Boolean.valueOf(z3)));
                return;
            default:
                if (z3) {
                    ((C0541r) this.f6027b).f7955c = true;
                    C0531h hVar = ((C0541r) this.f6027b).f7954b;
                    hVar.d.removeCallbacks(hVar.f7942e);
                    return;
                }
                ((C0541r) this.f6027b).f7955c = false;
                C0541r rVar = (C0541r) this.f6027b;
                if (rVar.f7953a > 0 && !rVar.f7955c) {
                    ((C0541r) this.f6027b).f7954b.a();
                    return;
                }
                return;
        }
    }
}
