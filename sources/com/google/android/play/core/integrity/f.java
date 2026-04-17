package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

final class f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {

    /* renamed from: a  reason: collision with root package name */
    private String f6717a;

    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        return new h(this.f6717a, (g) null);
    }

    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String str) {
        this.f6717a = str;
        return this;
    }
}
