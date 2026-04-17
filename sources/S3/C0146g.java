package S3;

import R2.b;
import android.content.Intent;
import b5.f;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mtma.criminal.city.fragments.gangBase.A;
import com.mtma.criminal.city.fragments.gangBase.z;
import i3.C0587c;
import java.util.List;

/* renamed from: S3.g  reason: case insensitive filesystem */
public final /* synthetic */ class C0146g implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2666a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2667b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2668c;

    public /* synthetic */ C0146g(Object obj, Object obj2, int i2) {
        this.f2666a = i2;
        this.f2667b = obj;
        this.f2668c = obj2;
    }

    public final void onComplete(Task task) {
        f fVar;
        switch (this.f2666a) {
            case 0:
                ((C0148i) this.f2667b).a((Intent) this.f2668c);
                return;
            default:
                A a6 = ((z) this.f2667b).f7337b;
                int size = a6.f7098i0.size();
                for (Task task2 : (List) task.getResult()) {
                    if (task2.isSuccessful() && (fVar = (f) ((C0587c) task2.getResult()).f(f.class)) != null) {
                        a6.f7098i0.add(size, fVar);
                    }
                }
                a6.f7099j0.notifyDataSetChanged();
                b.w(false);
                if (((C0587c) this.f2668c).d() < 8) {
                    a6.f7101l0 = false;
                    return;
                }
                return;
        }
    }
}
