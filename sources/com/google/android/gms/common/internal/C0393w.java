package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.e;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.internal.w  reason: case insensitive filesystem */
public final class C0393w implements e {

    /* renamed from: b  reason: collision with root package name */
    public static final C0393w f6223b = new C0393w((String) null);

    /* renamed from: a  reason: collision with root package name */
    public final String f6224a;

    public /* synthetic */ C0393w(String str) {
        this.f6224a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0393w)) {
            return false;
        }
        return I.j(this.f6224a, ((C0393w) obj).f6224a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6224a});
    }
}
