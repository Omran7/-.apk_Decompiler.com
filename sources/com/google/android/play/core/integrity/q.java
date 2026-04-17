package com.google.android.play.core.integrity;

import android.content.Context;

final class q implements x {

    /* renamed from: a  reason: collision with root package name */
    private Context f6725a;

    private q() {
    }

    public final q a(Context context) {
        context.getClass();
        this.f6725a = context;
        return this;
    }

    public final s b() {
        Context context = this.f6725a;
        if (context != null) {
            return new s(context, (r) null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }

    public /* synthetic */ q(p pVar) {
    }
}
