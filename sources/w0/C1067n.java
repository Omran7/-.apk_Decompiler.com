package w0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzau;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzkd;
import java.util.Objects;
import y2.C1111b;
import y2.C1112c;
import y2.C1113d;

/* renamed from: w0.n  reason: case insensitive filesystem */
public final class C1067n implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12385a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12386b;

    public /* synthetic */ C1067n(Object obj, int i2) {
        this.f12385a = i2;
        this.f12386b = obj;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.f12385a) {
            case 0:
                zze.zzk("BillingClientTesting", "Billing Override Service connected.");
                ((C1068o) this.f12386b).f12388B = zzau.zzc(iBinder);
                ((C1068o) this.f12386b).f12387A = 2;
                C1068o oVar = (C1068o) this.f12386b;
                oVar.getClass();
                zzkd d = C1071r.d(26);
                Objects.requireNonNull(d, "ApiSuccess should not be null");
                oVar.g.z(d);
                return;
            default:
                C1113d dVar = (C1113d) this.f12386b;
                dVar.f12693b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                dVar.a().post(new C1111b(this, iBinder));
                return;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f12385a) {
            case 0:
                zze.zzl("BillingClientTesting", "Billing Override Service disconnected.");
                ((C1068o) this.f12386b).f12388B = null;
                ((C1068o) this.f12386b).f12387A = 0;
                return;
            default:
                C1113d dVar = (C1113d) this.f12386b;
                dVar.f12693b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                dVar.a().post(new C1112c(this, 0));
                return;
        }
    }
}
