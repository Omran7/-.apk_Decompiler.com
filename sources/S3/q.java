package S3;

import U3.c;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import y1.C1108a;

public final /* synthetic */ class q implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2691a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f2692b;

    public /* synthetic */ q(FirebaseMessaging firebaseMessaging, int i2) {
        this.f2691a = i2;
        this.f2692b = firebaseMessaging;
    }

    public final void onSuccess(Object obj) {
        boolean z3;
        switch (this.f2691a) {
            case 0:
                F f6 = (F) obj;
                if (this.f2692b.f6908f.n() && f6.h.a() != null) {
                    synchronized (f6) {
                        z3 = f6.g;
                    }
                    if (!z3) {
                        f6.f(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                C1108a aVar = (C1108a) obj;
                c cVar = FirebaseMessaging.f6901l;
                FirebaseMessaging firebaseMessaging = this.f2692b;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    com.bumptech.glide.c.c0(aVar.f12648a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
