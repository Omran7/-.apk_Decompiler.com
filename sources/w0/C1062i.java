package w0;

import S3.r;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zze;
import java.util.concurrent.Callable;

/* renamed from: w0.i  reason: case insensitive filesystem */
public final /* synthetic */ class C1062i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1054a f12374a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12375b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f12376c;
    public final /* synthetic */ String d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Bundle f12377e;

    public /* synthetic */ C1062i(C1054a aVar, int i2, String str, String str2, r rVar, Bundle bundle) {
        this.f12374a = aVar;
        this.f12375b = i2;
        this.f12376c = str;
        this.d = str2;
        this.f12377e = bundle;
    }

    public final Object call() {
        zzan zzan;
        C1054a aVar = this.f12374a;
        int i2 = this.f12375b;
        String str = this.f12376c;
        String str2 = this.d;
        Bundle bundle = this.f12377e;
        try {
            synchronized (aVar.f12334a) {
                zzan = aVar.h;
            }
            if (zzan == null) {
                return zze.zzn(C1073t.f12398i, 119);
            }
            return zzan.zzg(i2, aVar.f12338f.getPackageName(), str, str2, (String) null, bundle);
        } catch (DeadObjectException e6) {
            return zze.zzo(C1073t.f12398i, 5, C1071r.a(e6));
        } catch (Exception e7) {
            return zze.zzo(C1073t.g, 5, C1071r.a(e7));
        }
    }
}
