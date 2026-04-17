package com.mtma.criminal.city.activities;

import A2.f;
import K1.e;
import android.util.Log;
import c1.i;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import h0.C0552a;
import i3.C0587c;
import i3.C0588d;
import i3.C0592h;
import i3.q;

public final class t implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7080a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ StartActivity f7081b;

    public /* synthetic */ t(StartActivity startActivity, int i2) {
        this.f7080a = i2;
        this.f7081b = startActivity;
    }

    public final void B(C0588d dVar) {
        switch (this.f7080a) {
            case 0:
                c.s0(this.f7081b.f7028I, (String) null, (String) null);
                return;
            default:
                boolean z3 = StartActivity.f7025b0;
                Log.e("StartActivity", "database error : " + dVar);
                return;
        }
    }

    public final void u(C0587c cVar) {
        boolean z3 = false;
        StartActivity startActivity = this.f7081b;
        switch (this.f7080a) {
            case 0:
                try {
                    z3 = ((Boolean) cVar.a("disabled").f(Boolean.class)).booleanValue();
                } catch (Exception e6) {
                    boolean z4 = StartActivity.f7025b0;
                    C0552a.x(e6, "Exception from try-catch block StartActivity when get current server number (ignore it, default value added by sharedPreference).", "StartActivity");
                }
                if (z3) {
                    c.t0(startActivity.f7028I);
                    return;
                }
                int v02 = d.v0(1, "server_number");
                try {
                    v02 = ((Integer) cVar.a("currentOpenedServer").f(Integer.class)).intValue();
                } catch (Exception e7) {
                    boolean z5 = StartActivity.f7025b0;
                    C0552a.x(e7, "Exception from try-catch block StartActivity when get current server number (ignore it, default value is server 1).", "StartActivity");
                }
                String valueOf = String.valueOf(v02);
                String str = (String) cVar.a("serverIds").a(valueOf).f(String.class);
                if (str != null) {
                    C0592h.b().e().E("Servers").E(valueOf).E("players").E(str).d(new i(this, valueOf, str));
                    return;
                } else {
                    c.s0(startActivity.f7028I, (String) null, (String) null);
                    return;
                }
            default:
                try {
                    if (cVar.b()) {
                        try {
                            String str2 = startActivity.f7028I.getPackageManager().getPackageInfo(e.F(), 0).packageName;
                            String str3 = startActivity.f7028I.getPackageManager().getPackageInfo(e.F(), 0).versionName;
                            int i2 = startActivity.f7028I.getPackageManager().getPackageInfo(e.F(), 0).versionCode;
                            startActivity.f7029J.setText(str3);
                            C0592h.b().f("AppInfo").d(new f((Object) this, (Object) str2, i2, 5));
                            return;
                        } catch (Exception e8) {
                            boolean z6 = StartActivity.f7025b0;
                            Log.e("StartActivity", "Exception from try-catch block inside StartActivity in checkAppVersion method when getting app version from the app (not firebase)." + e8);
                            return;
                        }
                    } else {
                        C0592h.b().e().E("BetaVersion").E("banned_devices").E(e.u()).d(new S3.t(this, 21));
                        return;
                    }
                } catch (Exception e9) {
                    boolean z7 = StartActivity.f7025b0;
                    C0552a.x(e9, "Exception from try-catch block inside StartActivity in checkAppVersion method when getting app version from the app (not firebase).", "StartActivity");
                    return;
                }
        }
    }
}
