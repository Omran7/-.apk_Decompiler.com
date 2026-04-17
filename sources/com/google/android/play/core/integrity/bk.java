package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import y2.z;

final class bk extends bi {

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ bn f6694c;
    private final z d = new z("OnRequestIntegrityTokenCallback");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final long f6695e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j6) {
        super(bnVar, taskCompletionSource);
        this.f6694c = bnVar;
        this.f6695e = j6;
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        this.d.b("onRequestExpressIntegrityToken", new Object[0]);
        j a6 = this.f6694c.f6702f.a(bundle);
        if (a6 != null) {
            this.f6691a.trySetException(a6);
            return;
        }
        bj bjVar = new bj(this, this.f6694c.f6700c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f6691a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
