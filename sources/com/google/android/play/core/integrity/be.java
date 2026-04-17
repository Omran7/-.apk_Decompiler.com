package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;
import y2.C1109A;
import y2.f;
import y2.z;

final class be extends C1109A {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f6678a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ bn f6679b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f6679b = bnVar;
        this.f6678a = context;
    }

    public final void b() {
        int i2;
        Context context = this.f6678a;
        TaskCompletionSource f6 = this.f6679b.d;
        z zVar = f.f12703a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled && f.a(packageInfo.signatures)) {
                i2 = packageInfo.versionCode;
                f6.trySetResult(Integer.valueOf(i2));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        i2 = 0;
        f6.trySetResult(Integer.valueOf(i2));
    }
}
