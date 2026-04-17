package z1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l extends zau {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12823a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f12824b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(z1.e r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f12824b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L_0x000d
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L_0x0011
        L_0x000d:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L_0x0011:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f12823a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.l.<init>(z1.e, android.content.Context):void");
    }

    public final void handleMessage(Message message) {
        PendingIntent pendingIntent;
        int i2 = message.what;
        if (i2 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i2);
            return;
        }
        int i5 = f.f12810a;
        e eVar = this.f12824b;
        Context context = this.f12823a;
        int c3 = eVar.c(context, i5);
        AtomicBoolean atomicBoolean = i.f12814a;
        if (c3 == 1 || c3 == 2 || c3 == 3 || c3 == 9) {
            Intent a6 = eVar.a(c3, context, "n");
            if (a6 == null) {
                pendingIntent = null;
            } else {
                pendingIntent = PendingIntent.getActivity(context, 0, a6, 201326592);
            }
            eVar.g(context, c3, pendingIntent);
        }
    }
}
