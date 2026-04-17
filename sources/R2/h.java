package R2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import n.d;

public final class h extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f2486b = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    public final Context f2487a;

    public h(Context context) {
        this.f2487a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (i.f2488j) {
            try {
                Iterator it2 = ((d) i.f2489k.values()).iterator();
                while (it2.hasNext()) {
                    ((i) it2.next()).h();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f2487a.unregisterReceiver(this);
    }
}
