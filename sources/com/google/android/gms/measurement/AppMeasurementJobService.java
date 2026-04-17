package com.google.android.gms.measurement;

import B2.a;
import H.j;
import S3.t;
import T1.C0228z1;
import T1.H;
import T1.T1;
import T1.Z;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzff;
import java.util.Objects;
import s2.e;

public final class AppMeasurementJobService extends JobService implements C0228z1 {

    /* renamed from: a  reason: collision with root package name */
    public t f6263a;

    public final void a(Intent intent) {
    }

    public final boolean b(int i2) {
        throw new UnsupportedOperationException();
    }

    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final t d() {
        if (this.f6263a == null) {
            this.f6263a = new t(this, 3);
        }
        return this.f6263a;
    }

    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().f2700b).getClass().getSimpleName().concat(" is starting up."));
    }

    public final void onDestroy() {
        Log.v("FA", ((Service) d().f2700b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        t d = d();
        d.getClass();
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        boolean equals = Objects.equals(string, "com.google.android.gms.measurement.UPLOAD");
        Service service = (Service) d.f2700b;
        if (equals) {
            I.g(string);
            T1 o02 = T1.o0(service);
            Z c3 = o02.c();
            e eVar = o02.f3070u.f3493f;
            c3.f3180w.b(string, "Local AppMeasurementJobService called. action");
            o02.f().y(new a((Object) o02, (Object) new j((Object) d, (Object) c3, (Object) jobParameters, 10), 21));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        I.g(string);
        zzff zzg = zzff.zzg(service, (String) null, (String) null, (String) null, (Bundle) null);
        if (!((Boolean) H.f2880T0.a((Object) null)).booleanValue()) {
            return true;
        }
        zzg.zzE(new a((Object) d, (Object) jobParameters, 20));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
