package y1;

import S3.y;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f12672a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource f12673b = new TaskCompletionSource();

    /* renamed from: c  reason: collision with root package name */
    public final int f12674c;
    public final Bundle d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f12675e;

    public k(int i2, int i5, Bundle bundle, int i6) {
        this.f12675e = i6;
        this.f12672a = i2;
        this.f12674c = i5;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.f12675e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(y yVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String obj = yVar.toString();
            Log.d("MessengerIpcClient", "Failing " + kVar + " with " + obj);
        }
        this.f12673b.setException(yVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String kVar = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", "Finishing " + kVar + " with " + valueOf);
        }
        this.f12673b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f12674c + " id=" + this.f12672a + " oneWay=" + a() + "}";
    }
}
