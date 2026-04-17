package androidx.fragment.app;

import java.util.ArrayList;

public final class H implements G {

    /* renamed from: a  reason: collision with root package name */
    public final int f4984a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ I f4985b;

    public H(I i2, int i5) {
        this.f4985b = i2;
        this.f4984a = i5;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i2 = this.f4985b;
        C0286s sVar = i2.f5017w;
        int i5 = this.f4984a;
        if (sVar == null || i5 >= 0 || !sVar.m().M(-1, 0)) {
            return i2.N(i5, 1, arrayList, arrayList2);
        }
        return false;
    }
}
