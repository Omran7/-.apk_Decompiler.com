package d3;

import D2.l;
import F3.k;
import H3.d;
import R2.i;
import W2.a;
import Z2.h;
import androidx.fragment.app.D;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.concurrent.Executor;

/* renamed from: d3.c  reason: case insensitive filesystem */
public final class C0467c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final String f7526a;

    /* renamed from: b  reason: collision with root package name */
    public final IntegrityManager f7527b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7528c;
    public final Executor d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f7529e;

    /* renamed from: f  reason: collision with root package name */
    public final h f7530f;

    public C0467c(i iVar, Executor executor, Executor executor2) {
        iVar.b();
        String str = iVar.f2492c.f2503e;
        iVar.b();
        IntegrityManager create = IntegrityManagerFactory.create(iVar.f2490a);
        k kVar = new k(iVar);
        h hVar = new h();
        this.f7526a = str;
        this.f7527b = create;
        this.f7528c = kVar;
        this.d = executor;
        this.f7529e = executor2;
        this.f7530f = hVar;
    }

    public final Task a() {
        Task call = Tasks.call(this.f7529e, new d(this, new D(16)));
        C0466b bVar = new C0466b(this, 1);
        Executor executor = this.d;
        return call.onSuccessTask(executor, bVar).onSuccessTask(executor, new C0466b(this, 0)).onSuccessTask(executor, new l(27));
    }
}
