package com.mtma.criminal.city.app;

import R2.i;
import W2.a;
import Z2.e;
import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;
import com.bumptech.glide.d;
import d3.C0467c;
import i3.C0592h;
import n3.C0864e;

public class MyApplication extends Application {

    /* renamed from: a  reason: collision with root package name */
    public static MyApplication f7090a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f7091b = false;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f7092c = false;

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(d.Z0(context, PreferenceManager.getDefaultSharedPreferences(context).getString("Locale.Helper.Selected.Language", "en")));
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [com.google.android.gms.tasks.OnSuccessListener, java.lang.Object] */
    public final void onCreate() {
        super.onCreate();
        f7090a = this;
        i.i(this);
        C0592h b6 = C0592h.b();
        synchronized (b6) {
            try {
                if (b6.f8285c == null) {
                    C0864e eVar = b6.f8284b;
                    synchronized (eVar) {
                        if (eVar.f10271j) {
                            throw new RuntimeException("Modifications to DatabaseConfig objects must occur before they are in use");
                        }
                    }
                } else {
                    throw new RuntimeException("Calls to setPersistenceEnabled() must be made before any other usage of FirebaseDatabase instance.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar2 = (e) i.e().c(e.class);
        eVar2.getClass();
        eVar2.f4496l = (a) eVar2.f4488a.c(C0467c.class);
        eVar2.f4492f.f4515f = true;
        eVar2.b(true).addOnSuccessListener(new Object());
    }
}
