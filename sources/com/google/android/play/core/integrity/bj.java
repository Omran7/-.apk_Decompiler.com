package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

final class bj extends y {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bk f6693a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j6) {
        super(str, j6);
        this.f6693a = bkVar;
    }

    public final Task b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f6693a.f6695e);
        return this.f6693a.f6694c.c(activity, bundle);
    }
}
