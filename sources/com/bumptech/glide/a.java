package com.bumptech.glide;

import U0.o;

public final class a implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public S0.a f5724a;

    /* renamed from: a */
    public final a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final boolean b(Object obj) {
        if (obj instanceof a) {
            return o.b(this.f5724a, ((a) obj).f5724a);
        }
        return false;
    }

    public final int c() {
        S0.a aVar = this.f5724a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a) || !b(obj)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return c();
    }
}
