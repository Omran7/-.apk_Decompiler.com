package w1;

import K1.d;
import android.content.Context;
import com.google.android.gms.common.api.l;
import z1.e;

/* renamed from: w1.a  reason: case insensitive filesystem */
public final class C1075a extends l {

    /* renamed from: a  reason: collision with root package name */
    public static int f12407a = 1;

    public final synchronized int c() {
        int i2;
        try {
            i2 = f12407a;
            if (i2 == 1) {
                Context applicationContext = getApplicationContext();
                e eVar = e.d;
                int c3 = eVar.c(applicationContext, 12451000);
                if (c3 == 0) {
                    i2 = 4;
                    f12407a = 4;
                } else if (eVar.a(c3, applicationContext, (String) null) != null || d.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i2 = 2;
                    f12407a = 2;
                } else {
                    i2 = 3;
                    f12407a = 3;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return i2;
    }
}
