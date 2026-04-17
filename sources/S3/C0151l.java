package S3;

import D2.l;
import G1.c;
import P4.a;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import n.j;

/* renamed from: S3.l  reason: case insensitive filesystem */
public final class C0151l {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2682c = new Object();
    public static L d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f2683a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2684b;

    public C0151l(ExecutorService executorService) {
        this.f2684b = new j(0);
        this.f2683a = executorService;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public static Task a(Context context, Intent intent, boolean z3) {
        L l6;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f2682c) {
            try {
                if (d == null) {
                    d = new L(context);
                }
                l6 = d;
            } finally {
                while (true) {
                }
            }
        }
        if (!z3) {
            return l6.b(intent).continueWith(new Object(), new l(18));
        }
        if (z.w().y(context)) {
            synchronized (I.f2636b) {
                try {
                    I.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        I.f2637c.a(I.f2635a);
                    }
                    l6.b(intent).addOnCompleteListener(new a(intent, 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            l6.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public Task b(Intent intent) {
        boolean z3;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z4 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean d6 = c.d();
        Context context = (Context) this.f2683a;
        if (!d6 || context.getApplicationInfo().targetSdkVersion < 26) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z4 = true;
        }
        if (z3 && !z4) {
            return a(context, intent, z4);
        }
        j0.c cVar = (j0.c) this.f2684b;
        return Tasks.call(cVar, new C0149j(context, intent, 0)).continueWithTask(cVar, new C0150k(context, intent, z4));
    }

    public C0151l(Context context) {
        this.f2683a = context;
        this.f2684b = new Object();
    }
}
