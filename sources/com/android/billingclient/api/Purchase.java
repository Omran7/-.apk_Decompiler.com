package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

public final class Purchase {

    /* renamed from: a  reason: collision with root package name */
    public final String f5721a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5722b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f5723c;

    public Purchase(String str, String str2) {
        this.f5721a = str;
        this.f5722b = str2;
        this.f5723c = new JSONObject(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        if (!TextUtils.equals(this.f5721a, purchase.f5721a) || !TextUtils.equals(this.f5722b, purchase.f5722b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5721a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f5721a));
    }
}
