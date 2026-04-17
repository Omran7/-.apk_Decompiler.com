package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import y2.z;

final class bl extends bi {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ bn f6696c;
    private final z d = new z("OnWarmUpIntegrityTokenCallback");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f6696c = bnVar;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        j a6 = this.f6696c.f6702f.a(bundle);
        if (a6 != null) {
            this.f6691a.trySetException(a6);
        } else {
            this.f6691a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
