package N5;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1955a;

    /* renamed from: b  reason: collision with root package name */
    public int f1956b;

    /* renamed from: c  reason: collision with root package name */
    public int f1957c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1958e;

    /* renamed from: f  reason: collision with root package name */
    public q f1959f;
    public q g;

    public q() {
        this.f1955a = new byte[8192];
        this.f1958e = true;
        this.d = false;
    }

    public final q a() {
        q qVar;
        q qVar2 = this.f1959f;
        if (qVar2 != this) {
            qVar = qVar2;
        } else {
            qVar = null;
        }
        q qVar3 = this.g;
        qVar3.f1959f = qVar2;
        this.f1959f.g = qVar3;
        this.f1959f = null;
        this.g = null;
        return qVar;
    }

    public final void b(q qVar) {
        qVar.g = this;
        qVar.f1959f = this.f1959f;
        this.f1959f.g = qVar;
        this.f1959f = qVar;
    }

    public final q c() {
        this.d = true;
        return new q(this.f1955a, this.f1956b, this.f1957c, true, false);
    }

    public final void d(q qVar, int i2) {
        if (qVar.f1958e) {
            int i5 = qVar.f1957c;
            int i6 = i5 + i2;
            byte[] bArr = qVar.f1955a;
            if (i6 > 8192) {
                if (!qVar.d) {
                    int i7 = qVar.f1956b;
                    if (i6 - i7 <= 8192) {
                        System.arraycopy(bArr, i7, bArr, 0, i5 - i7);
                        qVar.f1957c -= qVar.f1956b;
                        qVar.f1956b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f1955a, this.f1956b, bArr, qVar.f1957c, i2);
            qVar.f1957c += i2;
            this.f1956b += i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public q(byte[] bArr, int i2, int i5, boolean z3, boolean z4) {
        this.f1955a = bArr;
        this.f1956b = i2;
        this.f1957c = i5;
        this.d = z3;
        this.f1958e = z4;
    }
}
