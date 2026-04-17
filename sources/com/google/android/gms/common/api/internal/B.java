package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import java.util.Map;

public final class B implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f6013a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f6014b;

    public B(D d, BasePendingResult basePendingResult) {
        this.f6014b = d;
        this.f6013a = basePendingResult;
    }

    public final void a(Status status) {
        ((Map) this.f6014b.f6017a).remove(this.f6013a);
    }
}
