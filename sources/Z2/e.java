package Z2;

import B.m;
import H3.c;
import R2.i;
import T1.B;
import W2.a;
import android.content.Context;
import b3.C0317a;
import b3.b;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g3.l;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public final i f4488a;

    /* renamed from: b  reason: collision with root package name */
    public final K3.b f4489b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f4490c = new ArrayList();
    public final ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final i f4491e;

    /* renamed from: f  reason: collision with root package name */
    public final k f4492f;
    public final Executor g;
    public final Executor h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f4493i;

    /* renamed from: j  reason: collision with root package name */
    public final Task f4494j;

    /* renamed from: k  reason: collision with root package name */
    public final B f4495k;

    /* renamed from: l  reason: collision with root package name */
    public a f4496l;

    /* renamed from: m  reason: collision with root package name */
    public b f4497m;

    /* renamed from: n  reason: collision with root package name */
    public Task f4498n;

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Object, Z2.i] */
    public e(i iVar, K3.b bVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        I.g(iVar);
        I.g(bVar);
        this.f4488a = iVar;
        this.f4489b = bVar;
        iVar.b();
        String g5 = iVar.g();
        ? obj = new Object();
        Context context = iVar.f2490a;
        I.g(context);
        I.d(g5);
        obj.f4508a = new l(new c(1, context, "com.google.firebase.appcheck.store." + g5));
        this.f4491e = obj;
        iVar.b();
        this.f4492f = new k(context, this, executor2, scheduledExecutorService);
        this.g = executor;
        this.h = executor2;
        this.f4493i = executor3;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor3.execute(new m(this, taskCompletionSource, 5));
        this.f4494j = taskCompletionSource.getTask();
        this.f4495k = new B(28);
    }

    public final void a(C0317a aVar) {
        this.f4490c.add(aVar);
        k kVar = this.f4492f;
        int size = this.d.size() + this.f4490c.size();
        if (kVar.d == 0 && size > 0) {
            kVar.d = size;
            if (kVar.a()) {
                g gVar = kVar.f4511a;
                long j6 = kVar.f4514e;
                kVar.f4512b.getClass();
                gVar.b(j6 - System.currentTimeMillis());
            }
        } else if (kVar.d > 0 && size == 0) {
            kVar.f4511a.a();
        }
        kVar.d = size;
        b bVar = this.f4497m;
        if (bVar != null) {
            this.f4495k.getClass();
            if ((bVar.f4481b + bVar.f4482c) - System.currentTimeMillis() > 300000) {
                aVar.a(c.a(this.f4497m));
            }
        }
    }

    public final Task b(boolean z3) {
        return this.f4494j.continueWithTask(this.h, new d(this, z3, 0));
    }
}
