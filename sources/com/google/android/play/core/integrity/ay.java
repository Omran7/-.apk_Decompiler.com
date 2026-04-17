package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final /* synthetic */ class ay implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ az f6668a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ StandardIntegrityManager.PrepareIntegrityTokenRequest f6669b;

    public /* synthetic */ ay(az azVar, StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        this.f6668a = azVar;
        this.f6669b = prepareIntegrityTokenRequest;
    }

    public final Task then(Object obj) {
        return this.f6668a.a(this.f6669b, (Long) obj);
    }
}
