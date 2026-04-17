package z1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.I;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: z1.a  reason: case insensitive filesystem */
public final class C1131a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12797a = false;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedBlockingQueue f12798b = new LinkedBlockingQueue();

    public final IBinder a(TimeUnit timeUnit) {
        I.f("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f12797a) {
            this.f12797a = true;
            IBinder iBinder = (IBinder) this.f12798b.poll(10000, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f12798b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
