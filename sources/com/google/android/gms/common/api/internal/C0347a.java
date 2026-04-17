package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.api.internal.a  reason: case insensitive filesystem */
public final class C0347a {

    /* renamed from: a  reason: collision with root package name */
    public final int f6073a;

    /* renamed from: b  reason: collision with root package name */
    public final i f6074b;

    /* renamed from: c  reason: collision with root package name */
    public final e f6075c;
    public final String d;

    public C0347a(i iVar, e eVar, String str) {
        this.f6074b = iVar;
        this.f6075c = eVar;
        this.d = str;
        this.f6073a = Arrays.hashCode(new Object[]{iVar, eVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0347a)) {
            return false;
        }
        C0347a aVar = (C0347a) obj;
        if (!I.j(this.f6074b, aVar.f6074b) || !I.j(this.f6075c, aVar.f6075c) || !I.j(this.d, aVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6073a;
    }
}
