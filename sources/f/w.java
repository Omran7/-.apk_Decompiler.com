package f;

import E2.f;
import I1.b;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import c1.i;
import java.util.Calendar;

public final class w extends f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7807c = 0;
    public final /* synthetic */ z d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f7808e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(z zVar, i iVar) {
        super(zVar);
        this.d = zVar;
        this.f7808e = iVar;
    }

    public final IntentFilter f() {
        switch (this.f7807c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARNING: type inference failed for: r3v13, types: [java.lang.Object, f.F] */
    public final int i() {
        boolean z3;
        Location location;
        long j6;
        Location location2;
        switch (this.f7807c) {
            case 0:
                if (s.a((PowerManager) this.f7808e)) {
                    return 2;
                }
                return 1;
            default:
                i iVar = (i) this.f7808e;
                G g = (G) iVar.d;
                if (g.f7715b > System.currentTimeMillis()) {
                    z3 = g.f7714a;
                } else {
                    Context context = (Context) iVar.f5605b;
                    int n2 = b.n(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) iVar.f5606c;
                    if (n2 == 0) {
                        try {
                            if (locationManager.isProviderEnabled("network")) {
                                location2 = locationManager.getLastKnownLocation("network");
                                location = location2;
                            }
                        } catch (Exception e6) {
                            Log.d("TwilightManager", "Failed to get last known location", e6);
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (b.n(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e7) {
                            Log.d("TwilightManager", "Failed to get last known location", e7);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z3 = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (F.d == null) {
                            F.d = new Object();
                        }
                        F f6 = F.d;
                        F f7 = f6;
                        f7.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        f7.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        if (f6.f7713c == 1) {
                            z3 = true;
                        }
                        long j7 = f6.f7712b;
                        long j8 = f6.f7711a;
                        long j9 = j7;
                        f6.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j10 = f6.f7712b;
                        if (j9 == -1 || j8 == -1) {
                            j6 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j8) {
                                if (currentTimeMillis > j9) {
                                    j10 = j8;
                                } else {
                                    j10 = j9;
                                }
                            }
                            j6 = j10 + 60000;
                        }
                        g.f7714a = z3;
                        g.f7715b = j6;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z3 = true;
                        }
                    }
                }
                if (z3) {
                    return 2;
                }
                return 1;
        }
    }

    public final void m() {
        switch (this.f7807c) {
            case 0:
                this.d.k(true, true);
                return;
            default:
                this.d.k(true, true);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(z zVar, Context context) {
        super(zVar);
        this.d = zVar;
        this.f7808e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
