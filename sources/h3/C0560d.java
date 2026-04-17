package h3;

import com.mtma.criminal.city.utils.K;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: h3.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0560d implements C0564h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8127a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0563g f8128b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f8129c;
    public final /* synthetic */ long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f8130e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f8131f;

    public /* synthetic */ C0560d(C0563g gVar, Runnable runnable, long j6, long j7, TimeUnit timeUnit, int i2) {
        this.f8127a = i2;
        this.f8128b = gVar;
        this.f8129c = runnable;
        this.d = j6;
        this.f8130e = j7;
        this.f8131f = timeUnit;
    }

    public final ScheduledFuture a(K k6) {
        switch (this.f8127a) {
            case 0:
                C0563g gVar = this.f8128b;
                gVar.getClass();
                return gVar.f8139b.scheduleAtFixedRate(new C0561e(gVar, this.f8129c, k6, 0), this.d, this.f8130e, this.f8131f);
            default:
                C0563g gVar2 = this.f8128b;
                gVar2.getClass();
                return gVar2.f8139b.scheduleWithFixedDelay(new C0561e(gVar2, this.f8129c, k6, 2), this.d, this.f8130e, this.f8131f);
        }
    }
}
