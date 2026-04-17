package S3;

import I3.k;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.api.internal.D;
import com.google.android.gms.common.api.internal.E;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.internal.base.zau;
import com.google.firebase.messaging.FirebaseMessaging;

public final class B extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2606a = 0;

    /* renamed from: b  reason: collision with root package name */
    public Context f2607b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2608c;

    public /* synthetic */ B() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        k kVar = (k) this.f2608c;
        if (kVar != null) {
            Context context = ((FirebaseMessaging) kVar.f1190e).f6906c;
            this.f2607b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        switch (this.f2606a) {
            case 0:
                k kVar = (k) this.f2608c;
                if (kVar != null && kVar.b()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    k kVar2 = (k) this.f2608c;
                    ((FirebaseMessaging) kVar2.f1190e).getClass();
                    FirebaseMessaging.b(kVar2, 0);
                    Context context2 = this.f2607b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f2608c = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                } else {
                    str = null;
                }
                if ("com.google.android.gms".equals(str)) {
                    D d = (D) this.f2608c;
                    E e6 = (E) ((b0) d.f6018b).f6080c;
                    e6.f6020b.set((Object) null);
                    zau zau = e6.f6023f.f6103n;
                    zau.sendMessage(zau.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) d.f6017a;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context3 = this.f2607b;
                            if (context3 != null) {
                                context3.unregisterReceiver(this);
                            }
                            this.f2607b = null;
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }

    public B(D d) {
        this.f2608c = d;
    }
}
