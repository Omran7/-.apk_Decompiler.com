package H;

import F3.k;
import android.content.Context;
import java.util.concurrent.Callable;

public final class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f968a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f969b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f970c;
    public final /* synthetic */ k d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f971e;

    public /* synthetic */ d(String str, Context context, k kVar, int i2, int i5) {
        this.f968a = i5;
        this.f969b = str;
        this.f970c = context;
        this.d = kVar;
        this.f971e = i2;
    }

    public final Object call() {
        switch (this.f968a) {
            case 0:
                return g.a(this.f969b, this.f970c, this.d, this.f971e);
            default:
                try {
                    return g.a(this.f969b, this.f970c, this.d, this.f971e);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
