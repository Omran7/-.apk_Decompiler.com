package j3;

import B.m;
import Z2.c;
import b3.C0317a;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import n3.C0856A;

public final /* synthetic */ class b implements C0317a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScheduledThreadPoolExecutor f8821a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0856A f8822b;

    public /* synthetic */ b(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, C0856A a6) {
        this.f8821a = scheduledThreadPoolExecutor;
        this.f8822b = a6;
    }

    public final void a(c cVar) {
        this.f8821a.execute(new m(this.f8822b, cVar, 16));
    }
}
