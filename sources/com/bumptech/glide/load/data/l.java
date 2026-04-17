package com.bumptech.glide.load.data;

import C0.g;
import java.io.InputStream;

public final class l implements f {

    /* renamed from: a  reason: collision with root package name */
    public final g f5823a;

    public l(g gVar) {
        this.f5823a = gVar;
    }

    public final g a(Object obj) {
        return new h((InputStream) obj, this.f5823a);
    }

    public final Class b() {
        return InputStream.class;
    }
}
