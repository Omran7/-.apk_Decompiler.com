package N5;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class o implements e {

    /* renamed from: a  reason: collision with root package name */
    public final d f1949a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final t f1950b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1951c;

    /* JADX WARNING: type inference failed for: r0v0, types: [N5.d, java.lang.Object] */
    public o(t tVar) {
        this.f1950b = tVar;
    }

    public final w b() {
        return this.f1950b.b();
    }

    public final e c() {
        if (!this.f1951c) {
            d dVar = this.f1949a;
            long j6 = dVar.f1932b;
            long j7 = 0;
            if (j6 != 0) {
                q qVar = dVar.f1931a.g;
                int i2 = qVar.f1957c;
                if (i2 < 8192 && qVar.f1958e) {
                    j6 -= (long) (i2 - qVar.f1956b);
                }
                j7 = j6;
            }
            if (j7 > 0) {
                this.f1950b.f(j7, dVar);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        t tVar = this.f1950b;
        if (!this.f1951c) {
            try {
                d dVar = this.f1949a;
                long j6 = dVar.f1932b;
                if (j6 > 0) {
                    tVar.f(j6, dVar);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                tVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f1951c = true;
            if (th != null) {
                Charset charset = x.f1968a;
                throw th;
            }
        }
    }

    public final e d(byte[] bArr) {
        if (!this.f1951c) {
            this.f1949a.x(bArr);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void f(long j6, d dVar) {
        if (!this.f1951c) {
            this.f1949a.f(j6, dVar);
            c();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() {
        if (!this.f1951c) {
            d dVar = this.f1949a;
            long j6 = dVar.f1932b;
            int i2 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
            t tVar = this.f1950b;
            if (i2 > 0) {
                tVar.f(j6, dVar);
            }
            tVar.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final e g(String str) {
        if (!this.f1951c) {
            this.f1949a.C(0, str.length(), str);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.f1951c;
    }

    public final e j(int i2) {
        if (!this.f1951c) {
            this.f1949a.A(i2);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final e k(int i2) {
        if (!this.f1951c) {
            d dVar = this.f1949a;
            q w6 = dVar.w(4);
            int i5 = w6.f1957c;
            byte[] bArr = w6.f1955a;
            bArr[i5] = (byte) ((i2 >>> 24) & 255);
            bArr[i5 + 1] = (byte) ((i2 >>> 16) & 255);
            bArr[i5 + 2] = (byte) ((i2 >>> 8) & 255);
            bArr[i5 + 3] = (byte) (i2 & 255);
            w6.f1957c = i5 + 4;
            dVar.f1932b += 4;
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        return "buffer(" + this.f1950b + ")";
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.f1951c) {
            int write = this.f1949a.write(byteBuffer);
            c();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
