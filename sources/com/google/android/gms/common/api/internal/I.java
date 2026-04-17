package com.google.android.gms.common.api.internal;

import java.util.Arrays;
import z1.d;

public final class I {

    /* renamed from: a  reason: collision with root package name */
    public final C0347a f6039a;

    /* renamed from: b  reason: collision with root package name */
    public final d f6040b;

    public /* synthetic */ I(C0347a aVar, d dVar) {
        this.f6039a = aVar;
        this.f6040b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof I)) {
            I i2 = (I) obj;
            if (!com.google.android.gms.common.internal.I.j(this.f6039a, i2.f6039a) || !com.google.android.gms.common.internal.I.j(this.f6040b, i2.f6040b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6039a, this.f6040b});
    }

    public final String toString() {
        X4.d dVar = new X4.d((Object) this);
        dVar.c(this.f6039a, "key");
        dVar.c(this.f6040b, "feature");
        return dVar.toString();
    }
}
