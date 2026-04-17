package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import y2.v;
import y2.z;

final class ai extends v {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ aj f6639a;

    /* renamed from: b  reason: collision with root package name */
    private final z f6640b = new z("OnRequestIntegrityTokenCallback");

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource f6641c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f6639a = ajVar;
        this.f6641c = taskCompletionSource;
    }

    public final void b(Bundle bundle) {
        this.f6639a.f6642a.d(this.f6641c);
        this.f6640b.b("onRequestIntegrityToken", new Object[0]);
        j a6 = this.f6639a.f6645e.a(bundle);
        if (a6 != null) {
            this.f6641c.trySetException(a6);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f6641c.trySetException(new IntegrityServiceException(-100, (Throwable) null));
            return;
        }
        ah ahVar = new ah(this, this.f6639a.f6644c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f6641c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
