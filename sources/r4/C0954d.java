package r4;

import com.google.android.gms.tasks.TaskCompletionSource;
import d5.k;
import i3.C0587c;
import i3.C0588d;
import i3.q;

/* renamed from: r4.d  reason: case insensitive filesystem */
public final class C0954d implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11214a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11215b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f11216c;
    public final /* synthetic */ C0951a d;

    public /* synthetic */ C0954d(C0951a aVar, String str, TaskCompletionSource taskCompletionSource, int i2) {
        this.f11214a = i2;
        this.d = aVar;
        this.f11215b = str;
        this.f11216c = taskCompletionSource;
    }

    public final void B(C0588d dVar) {
        switch (this.f11214a) {
            case 0:
                this.f11216c.setResult(Boolean.FALSE);
                return;
            default:
                this.f11216c.setResult(Boolean.FALSE);
                return;
        }
    }

    public final void u(C0587c cVar) {
        switch (this.f11214a) {
            case 0:
                this.d.f11209a.f11235r0.put(this.f11215b, (k) cVar.f(k.class));
                this.f11216c.setResult(Boolean.TRUE);
                return;
            default:
                this.d.f11209a.s0.put(this.f11215b, (String) cVar.f(String.class));
                this.f11216c.setResult(Boolean.TRUE);
                return;
        }
    }
}
