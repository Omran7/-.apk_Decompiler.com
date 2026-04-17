package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

final class aa implements IntegrityManager {

    /* renamed from: a  reason: collision with root package name */
    private final aj f6626a;

    public aa(aj ajVar) {
        this.f6626a = ajVar;
    }

    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f6626a.c(integrityTokenRequest);
    }
}
