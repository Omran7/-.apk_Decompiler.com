package com.mtma.criminal.city.utils;

import com.google.android.gms.tasks.OnSuccessListener;
import i3.q;

public final class O implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7369a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f7370b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f7371c;

    public /* synthetic */ O(q qVar, long j6, int i2) {
        this.f7369a = i2;
        this.f7371c = qVar;
        this.f7370b = j6;
    }

    public final void onSuccess(Object obj) {
        switch (this.f7369a) {
            case 0:
                Void voidR = (Void) obj;
                G g = (G) this.f7371c;
                Q.a(g.d, g.f7356c, this.f7370b);
                return;
            default:
                Void voidR2 = (Void) obj;
                G g5 = (G) this.f7371c;
                Q.a(g5.d, g5.f7356c, this.f7370b);
                return;
        }
    }
}
