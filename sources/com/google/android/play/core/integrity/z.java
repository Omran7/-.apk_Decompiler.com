package com.google.android.play.core.integrity;

import android.content.Context;

final class z {

    /* renamed from: a  reason: collision with root package name */
    private static s f6741a;

    public static synchronized s a(Context context) {
        s sVar;
        synchronized (z.class) {
            try {
                if (f6741a == null) {
                    q qVar = new q((p) null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    qVar.a(context);
                    f6741a = qVar.b();
                }
                sVar = f6741a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return sVar;
    }
}
