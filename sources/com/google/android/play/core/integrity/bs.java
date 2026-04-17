package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final /* synthetic */ class bs implements StandardIntegrityManager.StandardIntegrityTokenProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ bt f6709a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f6710b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f6711c;

    public /* synthetic */ bs(bt btVar, long j6, long j7, int i2) {
        this.f6709a = btVar;
        this.f6710b = j6;
        this.f6711c = j7;
    }

    public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f6709a.a(this.f6710b, this.f6711c, 0, standardIntegrityTokenRequest);
    }
}
