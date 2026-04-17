package m0;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public int f9953a;

    /* renamed from: b  reason: collision with root package name */
    public int f9954b;

    /* renamed from: c  reason: collision with root package name */
    public int f9955c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f9956e;

    public final boolean a() {
        int i2;
        int i5;
        int i6;
        int i7 = this.f9953a;
        int i8 = 2;
        if ((i7 & 7) != 0) {
            int i9 = this.d;
            int i10 = this.f9954b;
            if (i9 > i10) {
                i6 = 1;
            } else if (i9 == i10) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            if ((i6 & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 112) != 0) {
            int i11 = this.d;
            int i12 = this.f9955c;
            if (i11 > i12) {
                i5 = 1;
            } else if (i11 == i12) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            if (((i5 << 4) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 1792) != 0) {
            int i13 = this.f9956e;
            int i14 = this.f9954b;
            if (i13 > i14) {
                i2 = 1;
            } else if (i13 == i14) {
                i2 = 2;
            } else {
                i2 = 4;
            }
            if (((i2 << 8) & i7) == 0) {
                return false;
            }
        }
        if ((i7 & 28672) != 0) {
            int i15 = this.f9956e;
            int i16 = this.f9955c;
            if (i15 > i16) {
                i8 = 1;
            } else if (i15 != i16) {
                i8 = 4;
            }
            if ((i7 & (i8 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
