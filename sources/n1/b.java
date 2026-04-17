package N1;

import android.app.PendingIntent;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzq;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class b extends zzq {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f1897a;

    public b(TaskCompletionSource taskCompletionSource) {
        this.f1897a = taskCompletionSource;
    }

    public final void zzb(Status status, PendingIntent pendingIntent) {
        c.n0(status, pendingIntent, this.f1897a);
    }
}
