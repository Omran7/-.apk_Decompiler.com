package S3;

import F3.k;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

public final class D {

    /* renamed from: c  reason: collision with root package name */
    public static WeakReference f2612c;

    /* renamed from: a  reason: collision with root package name */
    public k f2613a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2614b;

    public D(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f2614b = scheduledThreadPoolExecutor;
    }

    public final synchronized C a() {
        String str;
        C c3;
        k kVar = this.f2613a;
        synchronized (((ArrayDeque) kVar.f771e)) {
            str = (String) ((ArrayDeque) kVar.f771e).peek();
        }
        Pattern pattern = C.d;
        c3 = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                c3 = new C(split[0], split[1]);
            }
        }
        return c3;
    }
}
