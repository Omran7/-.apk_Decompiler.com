package com.google.android.gms.common.internal;

import android.os.Bundle;
import z1.C1132b;

public final class O extends C {
    public final /* synthetic */ C0377f g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public O(C0377f fVar, int i2, Bundle bundle) {
        super(fVar, i2, bundle);
        this.g = fVar;
    }

    public final void a(C1132b bVar) {
        C0377f fVar = this.g;
        if (!fVar.enableLocalFallback() || !C0377f.zzo(fVar)) {
            fVar.zzc.c(bVar);
            fVar.onConnectionFailed(bVar);
            return;
        }
        C0377f.zzk(fVar, 16);
    }

    public final boolean b() {
        this.g.zzc.c(C1132b.f12799e);
        return true;
    }
}
