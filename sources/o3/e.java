package o3;

import q3.l;
import s3.C0968f;

public final class e {
    public static final e d = new e(1, (C0968f) null, false);

    /* renamed from: e  reason: collision with root package name */
    public static final e f10441e = new e(2, (C0968f) null, false);

    /* renamed from: a  reason: collision with root package name */
    public final int f10442a;

    /* renamed from: b  reason: collision with root package name */
    public final C0968f f10443b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10444c;

    public e(int i2, C0968f fVar, boolean z3) {
        boolean z4;
        this.f10442a = i2;
        this.f10443b = fVar;
        this.f10444c = z3;
        if (!z3 || i2 == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        l.c(z4);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("OperationSource{source=");
        int i2 = this.f10442a;
        if (i2 == 1) {
            str = "User";
        } else if (i2 != 2) {
            str = "null";
        } else {
            str = "Server";
        }
        sb.append(str);
        sb.append(", queryParams=");
        sb.append(this.f10443b);
        sb.append(", tagged=");
        sb.append(this.f10444c);
        sb.append('}');
        return sb.toString();
    }
}
