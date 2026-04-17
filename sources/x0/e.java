package x0;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public final class e implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final FileInputStream f12525a;

    /* renamed from: b  reason: collision with root package name */
    public final Charset f12526b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f12527c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f12528e;

    public e(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(f.f12529a)) {
            this.f12525a = fileInputStream;
            this.f12526b = charset;
            this.f12527c = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final String c() {
        int i2;
        synchronized (this.f12525a) {
            try {
                byte[] bArr = this.f12527c;
                if (bArr != null) {
                    if (this.d >= this.f12528e) {
                        int read = this.f12525a.read(bArr, 0, bArr.length);
                        if (read != -1) {
                            this.d = 0;
                            this.f12528e = read;
                        } else {
                            throw new EOFException();
                        }
                    }
                    for (int i5 = this.d; i5 != this.f12528e; i5++) {
                        byte[] bArr2 = this.f12527c;
                        if (bArr2[i5] == 10) {
                            int i6 = this.d;
                            if (i5 != i6) {
                                i2 = i5 - 1;
                                if (bArr2[i2] == 13) {
                                    String str = new String(bArr2, i6, i2 - i6, this.f12526b.name());
                                    this.d = i5 + 1;
                                    return str;
                                }
                            }
                            i2 = i5;
                            String str2 = new String(bArr2, i6, i2 - i6, this.f12526b.name());
                            this.d = i5 + 1;
                            return str2;
                        }
                    }
                    d dVar = new d(this, (this.f12528e - this.d) + 80);
                    while (true) {
                        byte[] bArr3 = this.f12527c;
                        int i7 = this.d;
                        dVar.write(bArr3, i7, this.f12528e - i7);
                        this.f12528e = -1;
                        byte[] bArr4 = this.f12527c;
                        int read2 = this.f12525a.read(bArr4, 0, bArr4.length);
                        if (read2 != -1) {
                            this.d = 0;
                            this.f12528e = read2;
                            int i8 = 0;
                            while (true) {
                                if (i8 != this.f12528e) {
                                    byte[] bArr5 = this.f12527c;
                                    if (bArr5[i8] == 10) {
                                        int i9 = this.d;
                                        if (i8 != i9) {
                                            dVar.write(bArr5, i9, i8 - i9);
                                        }
                                        this.d = i8 + 1;
                                        String dVar2 = dVar.toString();
                                        return dVar2;
                                    }
                                    i8++;
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                } else {
                    throw new IOException("LineReader is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void close() {
        synchronized (this.f12525a) {
            try {
                if (this.f12527c != null) {
                    this.f12527c = null;
                    this.f12525a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
