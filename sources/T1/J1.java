package T1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzcj;

public final class J1 extends O1 {
    public final AlarmManager d = ((AlarmManager) ((C0212u0) this.f398a).f3489a.getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    public C1 f2972e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f2973f;

    public J1(T1 t12) {
        super(t12);
    }

    public final void r() {
        C0212u0 u0Var = (C0212u0) this.f398a;
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            Context context = u0Var.f3489a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcj.zza));
        }
        JobScheduler jobScheduler = (JobScheduler) u0Var.f3489a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(t());
        }
    }

    public final void s() {
        p();
        C0212u0 u0Var = (C0212u0) this.f398a;
        Z z3 = u0Var.f3496r;
        C0212u0.k(z3);
        z3.f3180w.a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            Context context = u0Var.f3489a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcj.zza));
        }
        u().a();
        JobScheduler jobScheduler = (JobScheduler) u0Var.f3489a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(t());
        }
    }

    public final int t() {
        if (this.f2973f == null) {
            this.f2973f = Integer.valueOf("measurement".concat(String.valueOf(((C0212u0) this.f398a).f3489a.getPackageName())).hashCode());
        }
        return this.f2973f.intValue();
    }

    public final C0194o u() {
        if (this.f2972e == null) {
            this.f2972e = new C1(this, this.f2982b.f3070u, 1);
        }
        return this.f2972e;
    }
}
