package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import h0.C0552a;

final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f6718a;

    public /* synthetic */ h(String str, g gVar) {
        this.f6718a = str;
    }

    public final String a() {
        return this.f6718a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
        String str = this.f6718a;
        if (str != null) {
            return str.equals(standardIntegrityTokenRequest.a());
        }
        if (standardIntegrityTokenRequest.a() != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        String str = this.f6718a;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        return i2 ^ 1000003;
    }

    public final String toString() {
        return C0552a.r(new StringBuilder("StandardIntegrityTokenRequest{requestHash="), this.f6718a, "}");
    }
}
