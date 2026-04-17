package y1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;

public final /* synthetic */ class d implements Continuation, SuccessContinuation {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ d f12657b = new d(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ d f12658c = new d(1);
    public static final /* synthetic */ d d = new d(2);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12659a;

    public /* synthetic */ d(int i2) {
        this.f12659a = i2;
    }

    public Task then(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = b.h;
        if (bundle == null || !bundle.containsKey("google.messenger")) {
            return Tasks.forResult(bundle);
        }
        return Tasks.forResult(null);
    }

    public Object then(Task task) {
        switch (this.f12659a) {
            case 0:
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            default:
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new C1108a(intent);
                }
                return null;
        }
    }
}
