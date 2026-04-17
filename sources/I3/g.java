package I3;

import J3.a;
import R2.i;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final FirebaseInstanceId f1177a;

    public g(FirebaseInstanceId firebaseInstanceId) {
        this.f1177a = firebaseInstanceId;
    }

    public final Task a() {
        FirebaseInstanceId firebaseInstanceId = this.f1177a;
        String f6 = firebaseInstanceId.f();
        if (f6 != null) {
            return Tasks.forResult(f6);
        }
        i iVar = firebaseInstanceId.f6894b;
        FirebaseInstanceId.c(iVar);
        return firebaseInstanceId.e(e.b(iVar)).continueWith(f.d);
    }
}
