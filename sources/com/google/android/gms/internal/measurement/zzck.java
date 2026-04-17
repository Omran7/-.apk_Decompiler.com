package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

public final class zzck {
    private static final Method zza;
    private static final Method zzb;

    static {
        Method method;
        Class<String> cls = String.class;
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            method = null;
        }
        zza = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", (Class[]) null);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        zzb = method2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a A[SYNTHETIC, Splitter:B:18:0x004a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(android.content.Context r3, android.app.job.JobInfo r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r5 = r3.getSystemService(r5)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            r5.getClass()
            java.lang.reflect.Method r6 = zza
            if (r6 == 0) goto L_0x006c
            java.lang.String r6 = "android.permission.UPDATE_DEVICE_STATS"
            int r3 = r3.checkSelfPermission(r6)
            if (r3 == 0) goto L_0x0018
            goto L_0x006c
        L_0x0018:
            java.lang.reflect.Method r3 = zzb
            r6 = 0
            if (r3 == 0) goto L_0x0031
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 0
            java.lang.Object r3 = r3.invoke(r0, r1)     // Catch:{ IllegalAccessException -> 0x002f, InvocationTargetException -> 0x002d }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IllegalAccessException -> 0x002f, InvocationTargetException -> 0x002d }
            if (r3 == 0) goto L_0x0031
            int r3 = r3.intValue()     // Catch:{ IllegalAccessException -> 0x002f, InvocationTargetException -> 0x002d }
            goto L_0x0042
        L_0x002d:
            r3 = move-exception
            goto L_0x0033
        L_0x002f:
            r3 = move-exception
            goto L_0x0033
        L_0x0031:
            r3 = r6
            goto L_0x0042
        L_0x0033:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r3)
            goto L_0x0031
        L_0x0042:
            java.lang.String r0 = "UploadAlarm"
            java.lang.String r1 = "com.google.android.gms"
            java.lang.reflect.Method r2 = zza
            if (r2 == 0) goto L_0x0067
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalAccessException -> 0x0061, InvocationTargetException -> 0x005f }
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r1, r3, r0}     // Catch:{ IllegalAccessException -> 0x0061, InvocationTargetException -> 0x005f }
            java.lang.Object r3 = r2.invoke(r5, r3)     // Catch:{ IllegalAccessException -> 0x0061, InvocationTargetException -> 0x005f }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IllegalAccessException -> 0x0061, InvocationTargetException -> 0x005f }
            if (r3 == 0) goto L_0x006b
            int r6 = r3.intValue()     // Catch:{ IllegalAccessException -> 0x0061, InvocationTargetException -> 0x005f }
            goto L_0x006b
        L_0x005f:
            r3 = move-exception
            goto L_0x0062
        L_0x0061:
            r3 = move-exception
        L_0x0062:
            java.lang.String r6 = "error calling scheduleAsPackage"
            android.util.Log.e(r0, r6, r3)
        L_0x0067:
            int r6 = r5.schedule(r4)
        L_0x006b:
            return r6
        L_0x006c:
            int r3 = r5.schedule(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzck.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
