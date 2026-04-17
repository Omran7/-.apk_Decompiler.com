package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B.m;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import c1.i;
import c1.j;
import c1.p;
import i1.f;
import m1.C0834a;

public class JobInfoSchedulerService extends JobService {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f5929a = 0;

    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i5 = jobParameters.getExtras().getInt("attemptNumber");
        p.b(getApplicationContext());
        i a6 = j.a();
        a6.H(string);
        a6.d = C0834a.b(i2);
        if (string2 != null) {
            a6.f5606c = Base64.decode(string2, 0);
        }
        i1.i iVar = p.a().d;
        j c3 = a6.c();
        m mVar = new m(this, jobParameters, 15);
        iVar.getClass();
        iVar.f8270e.execute(new f(iVar, c3, i5, mVar));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
