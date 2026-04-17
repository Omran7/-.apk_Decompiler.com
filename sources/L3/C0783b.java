package l3;

import A4.c;
import E4.a;
import R2.b;
import c1.i;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j3.e;
import java.util.concurrent.Executor;
import m0.a0;

/* renamed from: l3.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0783b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f9669a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f9670b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f9671c;

    public /* synthetic */ C0783b(o oVar, boolean z3, boolean z4) {
        this.f9669a = oVar;
        this.f9670b = z3;
        this.f9671c = z4;
    }

    public final void run() {
        boolean z3;
        o oVar = this.f9669a;
        C0792k kVar = oVar.h;
        if (kVar == C0792k.f9688a) {
            z3 = true;
        } else {
            z3 = false;
        }
        b.g0(z3, "Not in disconnected state: %s", kVar);
        oVar.h = C0792k.f9689b;
        long j6 = oVar.f9701A + 1;
        oVar.f9701A = j6;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i iVar = oVar.f9726x;
        iVar.d("Trying to fetch auth token", (Throwable) null, new Object[0]);
        a aVar = new a(taskCompletionSource, 9);
        c cVar = oVar.f9723u;
        ((e) cVar.f69c).b(this.f9670b, new a0((q3.b) cVar.f68b, aVar, 4));
        Task task = taskCompletionSource.getTask();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        iVar.d("Trying to fetch app check token", (Throwable) null, new Object[0]);
        B4.c cVar2 = new B4.c(taskCompletionSource2, 10);
        c cVar3 = oVar.f9724v;
        ((e) cVar3.f69c).b(this.f9671c, new a0((q3.b) cVar3.f68b, cVar2, 4));
        Task task2 = taskCompletionSource2.getTask();
        Task<Void> whenAll = Tasks.whenAll((Task<?>[]) new Task[]{task, task2});
        C0784c cVar4 = new C0784c(oVar, j6, task, task2);
        q3.b bVar = oVar.f9725w;
        whenAll.addOnSuccessListener((Executor) bVar, (OnSuccessListener<? super Void>) cVar4).addOnFailureListener((Executor) bVar, (OnFailureListener) new C0785d(oVar, j6));
    }
}
