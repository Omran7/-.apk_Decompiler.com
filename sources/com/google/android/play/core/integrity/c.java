package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a  reason: collision with root package name */
    private long f6714a;

    /* renamed from: b  reason: collision with root package name */
    private byte f6715b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i2) {
        this.f6715b = (byte) (this.f6715b | 2);
        return this;
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f6715b == 3) {
            return new e(this.f6714a, 0, (d) null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f6715b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.f6715b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j6) {
        this.f6714a = j6;
        this.f6715b = (byte) (this.f6715b | 1);
        return this;
    }
}
