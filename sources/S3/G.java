package S3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class G extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public H f2626a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ H f2627b;

    public G(H h, H h6) {
        this.f2627b = h;
        this.f2626a = h6;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f2627b.f2631a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            H h = this.f2626a;
            if (h != null) {
                if (h.d()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    H h6 = this.f2626a;
                    h6.d.f2625f.schedule(h6, 0, TimeUnit.SECONDS);
                    context.unregisterReceiver(this);
                    this.f2626a = null;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
