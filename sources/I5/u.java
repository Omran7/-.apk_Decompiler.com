package I5;

import b4.m;

public final class u implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1279a;

    /* renamed from: b  reason: collision with root package name */
    public String f1280b;

    public /* synthetic */ u() {
        this.f1279a = 4;
    }

    public Object n() {
        throw new RuntimeException(this.f1280b);
    }

    public String toString() {
        switch (this.f1279a) {
            case 0:
                return "<" + this.f1280b + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u(String str, int i2) {
        this.f1279a = i2;
        this.f1280b = str;
    }
}
