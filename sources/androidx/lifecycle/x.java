package androidx.lifecycle;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public final z f5283a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5284b;

    /* renamed from: c  reason: collision with root package name */
    public int f5285c = -1;
    public final /* synthetic */ y d;

    public x(y yVar, z zVar) {
        this.d = yVar;
        this.f5283a = zVar;
    }

    public final void b(boolean z3) {
        int i2;
        boolean z4;
        boolean z5;
        if (z3 != this.f5284b) {
            this.f5284b = z3;
            if (z3) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            y yVar = this.d;
            int i5 = yVar.f5289c;
            yVar.f5289c = i2 + i5;
            if (!yVar.d) {
                yVar.d = true;
                while (true) {
                    try {
                        int i6 = yVar.f5289c;
                        if (i5 == i6) {
                            break;
                        }
                        if (i5 != 0 || i6 <= 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (i5 <= 0 || i6 != 0) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z4) {
                            yVar.f();
                        } else if (z5) {
                            yVar.g();
                        }
                        i5 = i6;
                    } catch (Throwable th) {
                        yVar.d = false;
                        throw th;
                    }
                }
                yVar.d = false;
            }
            if (this.f5284b) {
                yVar.c(this);
            }
        }
    }

    public void d() {
    }

    public boolean e(C0307s sVar) {
        return false;
    }

    public abstract boolean f();
}
