package V3;

import G1.b;
import T1.C;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.d;
import f3.C0524a;
import java.util.Random;

public final class e {

    /* renamed from: f  reason: collision with root package name */
    public static final Random f3774f = new Random();
    public static final C g = new C(25);
    public static final b h = b.f823a;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3775a;

    /* renamed from: b  reason: collision with root package name */
    public final C0524a f3776b;

    /* renamed from: c  reason: collision with root package name */
    public final b3.b f3777c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f3778e;

    public e(Context context, C0524a aVar, b3.b bVar, long j6) {
        this.f3775a = context;
        this.f3776b = aVar;
        this.f3777c = bVar;
        this.d = j6;
    }

    public static boolean a(int i2) {
        if ((i2 >= 500 && i2 < 600) || i2 == -2 || i2 == 429 || i2 == 408) {
            return true;
        }
        return false;
    }

    public final void b(W3.b bVar) {
        h.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + this.d;
        bVar.m(this.f3775a, d.g0(this.f3776b), d.f0(this.f3777c));
        int i2 = 1000;
        while (true) {
            h.getClass();
            if (SystemClock.elapsedRealtime() + ((long) i2) <= elapsedRealtime && !bVar.k() && a(bVar.f4079e)) {
                try {
                    g.getClass();
                    Thread.sleep((long) (f3774f.nextInt(250) + i2));
                    if (i2 < 30000) {
                        if (bVar.f4079e != -2) {
                            i2 *= 2;
                            Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                        } else {
                            Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                            i2 = 1000;
                        }
                    }
                    if (!this.f3778e) {
                        bVar.f4076a = null;
                        bVar.f4079e = 0;
                        bVar.m(this.f3775a, d.g0(this.f3776b), d.f0(this.f3777c));
                    } else {
                        return;
                    }
                } catch (InterruptedException unused) {
                    Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                    Thread.currentThread().interrupt();
                    return;
                }
            } else {
                return;
            }
        }
    }
}
