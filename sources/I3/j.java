package I3;

import E2.f;
import T1.C0212u0;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

public final class j extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1185a = 0;

    /* renamed from: b  reason: collision with root package name */
    public Object f1186b;

    public /* synthetic */ j() {
    }

    public void a() {
        h hVar = FirebaseInstanceId.f6890j;
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        ((k) this.f1186b).a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r4, android.content.Intent r5) {
        /*
            r3 = this;
            int r4 = r3.f1185a
            switch(r4) {
                case 0: goto L_0x00bc;
                case 1: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r3.f1186b
            E2.f r4 = (E2.f) r4
            r4.m()
            return
        L_0x000d:
            java.lang.Object r4 = r3.f1186b
            T1.u0 r4 = (T1.C0212u0) r4
            if (r5 != 0) goto L_0x0021
            T1.Z r4 = r4.f3496r
            T1.C0212u0.k(r4)
            java.lang.String r5 = "App receiver called with null intent"
            T1.X r4 = r4.f3175r
            r4.a(r5)
            goto L_0x00bb
        L_0x0021:
            java.lang.String r5 = r5.getAction()
            if (r5 != 0) goto L_0x0035
            T1.Z r4 = r4.f3496r
            T1.C0212u0.k(r4)
            java.lang.String r5 = "App receiver called with null action"
            T1.X r4 = r4.f3175r
            r4.a(r5)
            goto L_0x00bb
        L_0x0035:
            int r0 = r5.hashCode()
            r1 = -1928239649(0xffffffff8d1165df, float:-4.4804198E-31)
            r2 = 1
            if (r0 == r1) goto L_0x004f
            r1 = 1279883384(0x4c497878, float:5.2814304E7)
            if (r0 == r1) goto L_0x0045
            goto L_0x0059
        L_0x0045:
            java.lang.String r0 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0059
            r5 = r2
            goto L_0x005a
        L_0x004f:
            java.lang.String r0 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0059
            r5 = 0
            goto L_0x005a
        L_0x0059:
            r5 = -1
        L_0x005a:
            r0 = 0
            if (r5 == 0) goto L_0x0092
            if (r5 == r2) goto L_0x006c
            T1.Z r4 = r4.f3496r
            T1.C0212u0.k(r4)
            java.lang.String r5 = "App receiver called with unknown action"
            T1.X r4 = r4.f3175r
            r4.a(r5)
            goto L_0x00bb
        L_0x006c:
            T1.g r5 = r4.f3494p
            T1.G r1 = T1.H.f2876R0
            boolean r5 = r5.B(r0, r1)
            if (r5 == 0) goto L_0x00bb
            T1.Z r5 = r4.f3496r
            T1.C0212u0.k(r5)
            java.lang.String r0 = "[sgtm] App Receiver notified batches are available"
            T1.X r5 = r5.f3180w
            r5.a(r0)
            T1.r0 r4 = r4.f3497s
            T1.C0212u0.k(r4)
            B0.c r5 = new B0.c
            r0 = 11
            r5.<init>((java.lang.Object) r3, (int) r0)
            r4.y(r5)
            goto L_0x00bb
        L_0x0092:
            com.google.android.gms.internal.measurement.zzqr.zzb()
            T1.g r5 = r4.f3494p
            T1.G r1 = T1.H.f2886W0
            boolean r5 = r5.B(r0, r1)
            if (r5 != 0) goto L_0x00a0
            goto L_0x00bb
        L_0x00a0:
            T1.Z r5 = r4.f3496r
            T1.C0212u0.k(r5)
            java.lang.String r0 = "App receiver notified triggers are available"
            T1.X r5 = r5.f3180w
            r5.a(r0)
            T1.r0 r5 = r4.f3497s
            T1.C0212u0.k(r5)
            B0.c r0 = new B0.c
            r1 = 10
            r0.<init>((java.lang.Object) r4, (int) r1)
            r5.y(r0)
        L_0x00bb:
            return
        L_0x00bc:
            java.lang.Object r4 = r3.f1186b
            I3.k r4 = (I3.k) r4
            if (r4 != 0) goto L_0x00c3
            goto L_0x010b
        L_0x00c3:
            android.content.Context r4 = r4.a()
            java.lang.String r5 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            r5 = 0
            if (r4 == 0) goto L_0x00d7
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()
            goto L_0x00d8
        L_0x00d7:
            r4 = r5
        L_0x00d8:
            if (r4 == 0) goto L_0x010b
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L_0x010b
            r4 = 3
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r4 = android.util.Log.isLoggable(r0, r4)
            if (r4 == 0) goto L_0x00ee
            java.lang.String r4 = "Connectivity changed. Starting background sync."
            android.util.Log.d(r0, r4)
        L_0x00ee:
            java.lang.Object r4 = r3.f1186b
            I3.k r4 = (I3.k) r4
            java.lang.Object r0 = r4.f1190e
            com.google.firebase.iid.FirebaseInstanceId r0 = (com.google.firebase.iid.FirebaseInstanceId) r0
            r0.getClass()
            r0 = 0
            com.google.firebase.iid.FirebaseInstanceId.d(r4, r0)
            java.lang.Object r4 = r3.f1186b
            I3.k r4 = (I3.k) r4
            android.content.Context r4 = r4.a()
            r4.unregisterReceiver(r3)
            r3.f1186b = r5
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.j.onReceive(android.content.Context, android.content.Intent):void");
    }

    public j(C0212u0 u0Var) {
        this.f1186b = u0Var;
    }

    public j(f fVar) {
        this.f1186b = fVar;
    }
}
