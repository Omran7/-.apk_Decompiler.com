package Z2;

import T1.B;
import com.google.android.gms.common.api.internal.C0348b;

public final class j implements C0348b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f4509a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f4510b;

    public j(k kVar, g gVar, B b6) {
        this.f4510b = kVar;
        this.f4509a = gVar;
    }

    public final void a(boolean z3) {
        this.f4510b.f4513c = z3;
        if (z3) {
            this.f4509a.a();
        } else if (this.f4510b.a()) {
            this.f4509a.b(this.f4510b.f4514e - System.currentTimeMillis());
        }
    }
}
