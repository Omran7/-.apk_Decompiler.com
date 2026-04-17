package I3;

import J2.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.Registrar;
import g3.d;

public final /* synthetic */ class f implements d, Continuation {

    /* renamed from: b  reason: collision with root package name */
    public static final f f1174b = new f(0);

    /* renamed from: c  reason: collision with root package name */
    public static final f f1175c = new f(1);
    public static final f d = new f(2);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1176a;

    public /* synthetic */ f(int i2) {
        this.f1176a = i2;
    }

    public Object f(o oVar) {
        switch (this.f1176a) {
            case 0:
                return Registrar.lambda$getComponents$0$Registrar(oVar);
            default:
                return Registrar.lambda$getComponents$1$Registrar(oVar);
        }
    }

    public Object then(Task task) {
        return ((d) task.getResult()).f1168a;
    }
}
