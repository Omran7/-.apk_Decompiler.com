package r4;

import b5.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.k;
import i3.C0587c;
import i3.C0588d;
import i3.q;

/* renamed from: r4.e  reason: case insensitive filesystem */
public final class C0955e implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11217a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f11218b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f11219c;
    public final /* synthetic */ C0956f d;

    public /* synthetic */ C0955e(C0956f fVar, j jVar, TaskCompletionSource taskCompletionSource, int i2) {
        this.f11217a = i2;
        this.d = fVar;
        this.f11218b = jVar;
        this.f11219c = taskCompletionSource;
    }

    public final void B(C0588d dVar) {
        switch (this.f11217a) {
            case 0:
                this.f11219c.setResult(Boolean.FALSE);
                return;
            default:
                this.f11219c.setResult(Boolean.FALSE);
                return;
        }
    }

    public final void u(C0587c cVar) {
        switch (this.f11217a) {
            case 0:
                this.d.f11235r0.put(this.f11218b.getPlayerId(), (k) cVar.f(k.class));
                this.f11219c.setResult(Boolean.TRUE);
                return;
            default:
                this.d.s0.put(this.f11218b.getPlayerId(), (String) cVar.f(String.class));
                this.f11219c.setResult(Boolean.TRUE);
                return;
        }
    }
}
