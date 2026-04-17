package T1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzih;

/* renamed from: T1.g1  reason: case insensitive filesystem */
public final class C0172g1 extends E {

    /* renamed from: c  reason: collision with root package name */
    public JobScheduler f3299c;

    public final boolean r() {
        return true;
    }

    public final zzih s() {
        boolean z3;
        p();
        o();
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (!u0Var.f3494p.B((String) null, H.f2876R0)) {
            return zzih.CLIENT_FLAG_OFF;
        }
        if (this.f3299c == null) {
            return zzih.MISSING_JOB_SCHEDULER;
        }
        Boolean z4 = u0Var.f3494p.z("google_analytics_sgtm_upload_enabled");
        if (z4 == null) {
            z3 = false;
        } else {
            z3 = z4.booleanValue();
        }
        if (!z3) {
            return zzih.NOT_ENABLED_IN_MANIFEST;
        }
        if (u0Var.n().f3005s < 119000) {
            return zzih.SDK_TOO_OLD;
        }
        if (!Y1.l0(u0Var.f3489a)) {
            return zzih.MEASUREMENT_SERVICE_NOT_ENABLED;
        }
        if (!u0Var.r().B()) {
            return zzih.NON_PLAY_MODE;
        }
        return zzih.CLIENT_UPLOAD_ELIGIBLE;
    }

    public final void t(long j6) {
        String str;
        p();
        o();
        JobScheduler jobScheduler = this.f3299c;
        C0212u0 u0Var = (C0212u0) this.f398a;
        if (jobScheduler == null || jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(u0Var.f3489a.getPackageName())).hashCode()) == null) {
            zzih s6 = s();
            if (s6 == zzih.CLIENT_UPLOAD_ELIGIBLE) {
                Z z3 = u0Var.f3496r;
                C0212u0.k(z3);
                z3.f3180w.b(Long.valueOf(j6), "[sgtm] Scheduling Scion upload, millis");
                PersistableBundle persistableBundle = new PersistableBundle();
                persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
                JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(u0Var.f3489a.getPackageName())).hashCode(), new ComponentName(u0Var.f3489a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j6).setOverrideDeadline(j6 + j6).setExtras(persistableBundle).build();
                JobScheduler jobScheduler2 = this.f3299c;
                I.g(jobScheduler2);
                int schedule = jobScheduler2.schedule(build);
                Z z4 = u0Var.f3496r;
                C0212u0.k(z4);
                if (schedule == 1) {
                    str = "SUCCESS";
                } else {
                    str = "FAILURE";
                }
                z4.f3180w.b(str, "[sgtm] Scion upload job scheduled with result");
                return;
            }
            Z z5 = u0Var.f3496r;
            C0212u0.k(z5);
            z5.f3180w.b(s6.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        Z z6 = u0Var.f3496r;
        C0212u0.k(z6);
        z6.f3180w.a("[sgtm] There's an existing pending job, skip this schedule.");
    }
}
