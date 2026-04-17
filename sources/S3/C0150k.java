package S3;

import D2.l;
import G1.c;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* renamed from: S3.k  reason: case insensitive filesystem */
public final /* synthetic */ class C0150k implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f2679a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f2680b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f2681c;

    public /* synthetic */ C0150k(Context context, Intent intent, boolean z3) {
        this.f2679a = context;
        this.f2680b = intent;
        this.f2681c = z3;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final Object then(Task task) {
        if (!c.d() || ((Integer) task.getResult()).intValue() != 402) {
            return task;
        }
        return C0151l.a(this.f2679a, this.f2680b, this.f2681c).continueWith(new Object(), new l(17));
    }
}
