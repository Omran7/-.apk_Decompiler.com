package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

final class am extends IntegrityTokenRequest.Builder {

    /* renamed from: a  reason: collision with root package name */
    private String f6650a;

    /* renamed from: b  reason: collision with root package name */
    private Long f6651b;

    public final IntegrityTokenRequest build() {
        String str = this.f6650a;
        if (str != null) {
            return new ao(str, this.f6651b, (Object) null, (an) null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j6) {
        this.f6651b = Long.valueOf(j6);
        return this;
    }

    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.f6650a = str;
            return this;
        }
        throw new NullPointerException("Null nonce");
    }
}
