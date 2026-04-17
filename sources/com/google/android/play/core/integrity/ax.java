package com.google.android.play.core.integrity;

import android.content.Context;

final class ax {

    /* renamed from: a  reason: collision with root package name */
    private static aw f6667a;

    public static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            try {
                if (f6667a == null) {
                    u uVar = new u((t) null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    uVar.a(context);
                    f6667a = uVar.b();
                }
                awVar = f6667a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return awVar;
    }
}
