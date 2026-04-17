package M5;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import j0.e;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import m5.C0849h;
import n5.C0871c;
import x5.l;

public final class g extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1876a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1877b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, int i2) {
        super(1);
        this.f1876a = i2;
        this.f1877b = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.f1876a) {
            case 0:
                Throwable th = (Throwable) obj;
                ((i) this.f1877b).b();
                return C0849h.f10203c;
            case 1:
                j.e((Context) obj, "it");
                Context context = (Context) this.f1877b;
                j.e(context, "context");
                MeasurementManager a6 = MeasurementManager.get(context);
                j.d(a6, "get(context)");
                return new e(a6);
            default:
                if (obj == ((C0871c) this.f1877b)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
        }
    }
}
