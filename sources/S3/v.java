package S3;

import I1.b;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f2702a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f2703b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2704c;

    public /* synthetic */ v(Context context, boolean z3, TaskCompletionSource taskCompletionSource) {
        this.f2702a = context;
        this.f2703b = z3;
        this.f2704c = taskCompletionSource;
    }

    public final void run() {
        boolean z3;
        Context context = this.f2702a;
        TaskCompletionSource taskCompletionSource = this.f2704c;
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
            } else {
                SharedPreferences.Editor edit = b.X(context).edit();
                edit.putBoolean("proxy_notification_initialized", true);
                edit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (this.f2703b) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate((String) null);
                }
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }
}
