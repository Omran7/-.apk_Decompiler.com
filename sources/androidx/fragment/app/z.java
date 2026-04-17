package androidx.fragment.app;

import J.a;
import android.content.res.Configuration;
import z.C1120B;
import z.j;

public final /* synthetic */ class z implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ I f5209b;

    public /* synthetic */ z(I i2, int i5) {
        this.f5208a = i5;
        this.f5209b = i2;
    }

    public final void accept(Object obj) {
        switch (this.f5208a) {
            case 0:
                Configuration configuration = (Configuration) obj;
                I i2 = this.f5209b;
                if (i2.G()) {
                    i2.h(false);
                    return;
                }
                return;
            case 1:
                Integer num = (Integer) obj;
                I i5 = this.f5209b;
                if (i5.G() && num.intValue() == 80) {
                    i5.l(false);
                    return;
                }
                return;
            case 2:
                j jVar = (j) obj;
                I i6 = this.f5209b;
                if (i6.G()) {
                    i6.m(jVar.f12759a, false);
                    return;
                }
                return;
            default:
                C1120B b6 = (C1120B) obj;
                I i7 = this.f5209b;
                if (i7.G()) {
                    i7.r(b6.f12746a, false);
                    return;
                }
                return;
        }
    }
}
