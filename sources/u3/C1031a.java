package u3;

import android.util.Log;
import java.util.HashSet;
import q.C0928e;
import w0.C1056c;

/* renamed from: u3.a  reason: case insensitive filesystem */
public final class C1031a {

    /* renamed from: a  reason: collision with root package name */
    public final int f11848a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11849b;

    public C1031a(C1056c cVar, int i2) {
        this.f11849b = cVar;
        this.f11848a = i2;
    }

    public void a(int i2, String str, String str2) {
        if (C0928e.c(i2) >= C0928e.c(this.f11848a)) {
            HashSet hashSet = (HashSet) this.f11849b;
            if (hashSet == null || C0928e.c(i2) > 0 || hashSet.contains(str)) {
                int c3 = C0928e.c(i2);
                if (c3 == 0) {
                    Log.d(str, str2);
                } else if (c3 == 1) {
                    Log.i(str, str2);
                } else if (c3 == 2) {
                    Log.w(str, str2);
                } else if (c3 == 3) {
                    Log.e(str, str2);
                } else {
                    throw new RuntimeException("Should not reach here!");
                }
            }
        }
    }

    public C1031a(int i2) {
        this.f11849b = null;
        this.f11848a = i2;
    }
}
