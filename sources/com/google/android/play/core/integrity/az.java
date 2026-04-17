package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

final class az implements StandardIntegrityManager {

    /* renamed from: a  reason: collision with root package name */
    private final bn f6670a;

    /* renamed from: b  reason: collision with root package name */
    private final bt f6671b;

    public az(bn bnVar, bt btVar) {
        this.f6670a = bnVar;
        this.f6671b = btVar;
    }

    public final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l6) {
        long b6 = prepareIntegrityTokenRequest.b();
        long longValue = l6.longValue();
        prepareIntegrityTokenRequest.a();
        return Tasks.forResult(new bs(this.f6671b, b6, longValue, 0));
    }

    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long b6 = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f6670a.e(b6, 0).onSuccessTask(new ay(this, prepareIntegrityTokenRequest));
    }
}
