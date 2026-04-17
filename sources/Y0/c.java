package y0;

import android.util.Log;
import com.google.android.gms.internal.measurement.a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12628a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f12629b;

    /* renamed from: c  reason: collision with root package name */
    public b f12630c;
    public int d = 0;

    public final boolean a() {
        if (this.f12630c.f12621b != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, y0.a] */
    /* JADX WARNING: type inference failed for: r6v32, types: [java.lang.Object, y0.a] */
    public final b b() {
        boolean z3;
        byte[] bArr;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this.f12629b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.f12630c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 6; i2++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f12630c.f12621b = 1;
            } else {
                this.f12630c.f12624f = this.f12629b.getShort();
                this.f12630c.g = this.f12629b.getShort();
                int c3 = c();
                b bVar = this.f12630c;
                if ((c3 & 128) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                bVar.h = z6;
                bVar.f12625i = (int) Math.pow(2.0d, (double) ((c3 & 7) + 1));
                this.f12630c.f12626j = c();
                b bVar2 = this.f12630c;
                c();
                bVar2.getClass();
                if (this.f12630c.h && !a()) {
                    b bVar3 = this.f12630c;
                    bVar3.f12620a = e(bVar3.f12625i);
                    b bVar4 = this.f12630c;
                    bVar4.f12627k = bVar4.f12620a[bVar4.f12626j];
                }
            }
            if (!a()) {
                boolean z7 = false;
                while (!z7 && !a() && this.f12630c.f12622c <= Integer.MAX_VALUE) {
                    int c6 = c();
                    if (c6 == 33) {
                        int c7 = c();
                        if (c7 == 1) {
                            f();
                        } else if (c7 == 249) {
                            this.f12630c.d = new Object();
                            c();
                            int c8 = c();
                            C1107a aVar = this.f12630c.d;
                            int i5 = (c8 & 28) >> 2;
                            aVar.g = i5;
                            if (i5 == 0) {
                                aVar.g = 1;
                            }
                            if ((c8 & 1) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            aVar.f12616f = z3;
                            short s6 = this.f12629b.getShort();
                            if (s6 < 2) {
                                s6 = 10;
                            }
                            C1107a aVar2 = this.f12630c.d;
                            aVar2.f12617i = s6 * 10;
                            aVar2.h = c();
                            c();
                        } else if (c7 == 254) {
                            f();
                        } else if (c7 != 255) {
                            f();
                        } else {
                            d();
                            StringBuilder sb2 = new StringBuilder();
                            int i6 = 0;
                            while (true) {
                                bArr = this.f12628a;
                                if (i6 >= 11) {
                                    break;
                                }
                                sb2.append((char) bArr[i6]);
                                i6++;
                            }
                            if (sb2.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    if (bArr[0] == 1) {
                                        byte b6 = bArr[1];
                                        byte b7 = bArr[2];
                                        this.f12630c.getClass();
                                    }
                                    if (this.d <= 0) {
                                        break;
                                    }
                                } while (a());
                            } else {
                                f();
                            }
                        }
                    } else if (c6 == 44) {
                        b bVar5 = this.f12630c;
                        if (bVar5.d == null) {
                            bVar5.d = new Object();
                        }
                        bVar5.d.f12612a = this.f12629b.getShort();
                        this.f12630c.d.f12613b = this.f12629b.getShort();
                        this.f12630c.d.f12614c = this.f12629b.getShort();
                        this.f12630c.d.d = this.f12629b.getShort();
                        int c9 = c();
                        if ((c9 & 128) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int pow = (int) Math.pow(2.0d, (double) ((c9 & 7) + 1));
                        C1107a aVar3 = this.f12630c.d;
                        if ((c9 & 64) != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        aVar3.f12615e = z5;
                        if (z4) {
                            aVar3.f12619k = e(pow);
                        } else {
                            aVar3.f12619k = null;
                        }
                        this.f12630c.d.f12618j = this.f12629b.position();
                        c();
                        f();
                        if (!a()) {
                            b bVar6 = this.f12630c;
                            bVar6.f12622c++;
                            bVar6.f12623e.add(bVar6.d);
                        }
                    } else if (c6 != 59) {
                        this.f12630c.f12621b = 1;
                    } else {
                        z7 = true;
                    }
                }
                b bVar7 = this.f12630c;
                if (bVar7.f12622c < 0) {
                    bVar7.f12621b = 1;
                }
            }
            return this.f12630c;
        }
    }

    public final int c() {
        try {
            return this.f12629b.get() & 255;
        } catch (Exception unused) {
            this.f12630c.f12621b = 1;
            return 0;
        }
    }

    public final void d() {
        int c3 = c();
        this.d = c3;
        if (c3 > 0) {
            int i2 = 0;
            int i5 = 0;
            while (true) {
                try {
                    int i6 = this.d;
                    if (i2 < i6) {
                        i5 = i6 - i2;
                        this.f12629b.get(this.f12628a, i2, i5);
                        i2 += i5;
                    } else {
                        return;
                    }
                } catch (Exception e6) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder h = a.h("Error Reading Block n: ", i2, " count: ", i5, " blockSize: ");
                        h.append(this.d);
                        Log.d("GifHeaderParser", h.toString(), e6);
                    }
                    this.f12630c.f12621b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i2) {
        byte[] bArr = new byte[(i2 * 3)];
        int[] iArr = null;
        try {
            this.f12629b.get(bArr);
            iArr = new int[256];
            int i5 = 0;
            int i6 = 0;
            while (i5 < i2) {
                int i7 = i6 + 2;
                i6 += 3;
                int i8 = i5 + 1;
                iArr[i5] = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16) | -16777216 | (bArr[i7] & 255);
                i5 = i8;
            }
        } catch (BufferUnderflowException e6) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e6);
            }
            this.f12630c.f12621b = 1;
        }
        return iArr;
    }

    public final void f() {
        int c3;
        do {
            c3 = c();
            this.f12629b.position(Math.min(this.f12629b.position() + c3, this.f12629b.limit()));
        } while (c3 > 0);
    }
}
