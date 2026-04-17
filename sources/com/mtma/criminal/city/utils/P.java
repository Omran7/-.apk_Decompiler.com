package com.mtma.criminal.city.utils;

import com.google.android.gms.tasks.OnSuccessListener;

public final class P implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7372a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f7373b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ G f7374c;

    public P(G g, int i2, long j6) {
        this.f7374c = g;
        this.f7372a = i2;
        this.f7373b = j6;
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        G g = this.f7374c;
        long c3 = (long) Q.c(g.d, this.f7372a);
        if (c3 != -100) {
            long j6 = this.f7373b;
            if (j6 >= c3) {
                Q.a(g.d, g.f7356c, j6);
            }
        }
    }
}
