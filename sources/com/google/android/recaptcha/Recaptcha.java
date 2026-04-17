package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import o5.d;

public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzcq.zze(application, str);
    }

    /* renamed from: getClient-BWLJW6A$default  reason: not valid java name */
    public static /* synthetic */ Object m10getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j6, d dVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j6 = 10000;
        }
        return recaptcha.m11getClientBWLJW6A(application, str, j6, dVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzcq.zzc(application, str, 10000);
    }

    public final Object fetchClient(Application application, String str, d dVar) {
        return zzcq.zzd(application, str, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: getClient-BWLJW6A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m11getClientBWLJW6A(android.app.Application r5, java.lang.String r6, long r7, o5.d r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.zzc = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.zza
            p5.a r1 = p5.a.f11033a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            I1.b.I0(r9)     // Catch:{ all -> 0x0027 }
            goto L_0x003d
        L_0x0027:
            r5 = move-exception
            goto L_0x0040
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            I1.b.I0(r9)
            r0.zzc = r3     // Catch:{ all -> 0x0027 }
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzcq.zzb(r5, r6, r7, r0)     // Catch:{ all -> 0x0027 }
            if (r9 != r1) goto L_0x003d
            return r1
        L_0x003d:
            com.google.android.recaptcha.internal.zzdc r9 = (com.google.android.recaptcha.internal.zzdc) r9     // Catch:{ all -> 0x0027 }
            goto L_0x0044
        L_0x0040:
            m5.e r9 = I1.b.r(r5)
        L_0x0044:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m11getClientBWLJW6A(android.app.Application, java.lang.String, long, o5.d):java.lang.Object");
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j6) {
        return zzcq.zzc(application, str, j6);
    }
}
