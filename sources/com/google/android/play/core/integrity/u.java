package com.google.android.play.core.integrity;

import android.content.Context;

final class u implements av {

    /* renamed from: a  reason: collision with root package name */
    private Context f6731a;

    private u() {
    }

    public final u a(Context context) {
        context.getClass();
        this.f6731a = context;
        return this;
    }

    public final aw b() {
        Context context = this.f6731a;
        if (context != null) {
            return new w(context, (v) null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }

    public /* synthetic */ u(t tVar) {
    }
}
