package r4;

import com.google.android.gms.tasks.TaskCompletionSource;
import d5.k;
import i3.C0587c;
import i3.C0588d;
import i3.q;

/* renamed from: r4.b  reason: case insensitive filesystem */
public final class C0952b implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11210a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11211b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f11212c;
    public final /* synthetic */ C0953c d;

    public /* synthetic */ C0952b(C0953c cVar, String str, TaskCompletionSource taskCompletionSource, int i2) {
        this.f11210a = i2;
        this.d = cVar;
        this.f11211b = str;
        this.f11212c = taskCompletionSource;
    }

    public final void B(C0588d dVar) {
        switch (this.f11210a) {
            case 0:
                this.f11212c.setResult(Boolean.FALSE);
                return;
            default:
                this.f11212c.setResult(Boolean.FALSE);
                return;
        }
    }

    public final void u(C0587c cVar) {
        switch (this.f11210a) {
            case 0:
                this.d.f11213a.f11235r0.put(this.f11211b, (k) cVar.f(k.class));
                this.f11212c.setResult(Boolean.TRUE);
                return;
            default:
                this.d.f11213a.s0.put(this.f11211b, (String) cVar.f(String.class));
                this.f11212c.setResult(Boolean.TRUE);
                return;
        }
    }
}
