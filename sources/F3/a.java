package F3;

import K3.b;
import R2.k;
import Z2.c;
import Z2.e;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import kotlin.jvm.internal.j;

public final /* synthetic */ class a implements K3.a, SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f731a;

    public /* synthetic */ a(d dVar) {
        this.f731a = dVar;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [b3.a, java.lang.Object] */
    public void g(b bVar) {
        d dVar = this.f731a;
        j.e(dVar, "this$0");
        j.e(bVar, "p");
        b3.b bVar2 = (b3.b) bVar.get();
        dVar.d.set(bVar2);
        ((e) bVar2).a(new Object());
    }

    public Task then(Object obj) {
        c cVar = (c) obj;
        j.e(this.f731a, "this$0");
        j.e(cVar, "result");
        k kVar = cVar.f4484b;
        if (kVar != null) {
            Log.w("FirebaseContextProvider", "Error getting App Check token. Error: " + kVar);
        }
        return Tasks.forResult(cVar.f4483a);
    }
}
