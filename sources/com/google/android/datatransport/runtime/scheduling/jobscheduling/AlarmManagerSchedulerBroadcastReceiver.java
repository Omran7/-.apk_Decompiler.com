package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import c1.i;
import c1.j;
import c1.p;
import i1.f;
import m1.C0834a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f5928a = 0;

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, java.lang.Runnable] */
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        p.b(context);
        i a6 = j.a();
        a6.H(queryParameter);
        a6.d = C0834a.b(intValue);
        if (queryParameter2 != null) {
            a6.f5606c = Base64.decode(queryParameter2, 0);
        }
        i1.i iVar = p.a().d;
        j c3 = a6.c();
        ? obj = new Object();
        iVar.getClass();
        iVar.f8270e.execute(new f(iVar, c3, i2, obj));
    }
}
