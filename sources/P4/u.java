package P4;

import R2.b;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;

public final class u implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2286a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f2287b;

    public /* synthetic */ u(w wVar, int i2) {
        this.f2286a = i2;
        this.f2287b = wVar;
    }

    public final void onComplete(Task task) {
        switch (this.f2286a) {
            case 0:
                b.w(false);
                boolean isSuccessful = task.isSuccessful();
                w wVar = this.f2287b;
                if (isSuccessful) {
                    c.s0(wVar.f2290d0, MyApplication.f7090a.getApplicationContext().getString(R.string.verify_email_link_sent_successfully), (String) null);
                    b.M0(R.raw.add_new_item);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.unknown_error, wVar.f2290d0, (String) null);
                return;
            default:
                b.w(false);
                boolean isSuccessful2 = task.isSuccessful();
                w wVar2 = this.f2287b;
                if (isSuccessful2) {
                    c.s0(wVar2.f2290d0, MyApplication.f7090a.getApplicationContext().getString(R.string.reset_password_link_sent_successfully), (String) null);
                    b.M0(R.raw.add_new_item);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.unknown_error, wVar2.f2290d0, (String) null);
                return;
        }
    }
}
