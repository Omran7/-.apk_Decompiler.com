package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import y2.C1113d;
import y2.i;

final class at {

    /* renamed from: a  reason: collision with root package name */
    private final i f6663a;

    /* renamed from: b  reason: collision with root package name */
    private final i f6664b;

    public at(i iVar, i iVar2) {
        this.f6663a = iVar;
        this.f6664b = iVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, C1113d dVar) {
        Object a6 = this.f6663a.a();
        a6.getClass();
        k kVar = (k) this.f6664b.a();
        kVar.getClass();
        activity.getClass();
        dVar.getClass();
        return new as((Context) a6, kVar, activity, taskCompletionSource, dVar);
    }
}
