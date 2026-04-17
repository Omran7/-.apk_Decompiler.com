package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

final class e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final long f6716a;

    public /* synthetic */ e(long j6, int i2, d dVar) {
        this.f6716a = j6;
    }

    public final int a() {
        return 0;
    }

    public final long b() {
        return this.f6716a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) {
            StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
            if (this.f6716a == prepareIntegrityTokenRequest.b()) {
                prepareIntegrityTokenRequest.a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f6716a;
        return (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f6716a + ", webViewRequestMode=0}";
    }
}
