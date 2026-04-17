package I3;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class c implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1166a;

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f1167b;

    public /* synthetic */ c(CountDownLatch countDownLatch, int i2) {
        this.f1166a = i2;
        this.f1167b = countDownLatch;
    }

    public final void onComplete(Task task) {
        CountDownLatch countDownLatch = this.f1167b;
        switch (this.f1166a) {
            case 0:
                h hVar = FirebaseInstanceId.f6890j;
                countDownLatch.countDown();
                return;
            default:
                countDownLatch.countDown();
                return;
        }
    }
}
