package I0;

import C0.g;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class y extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public volatile byte[] f1143a;

    /* renamed from: b  reason: collision with root package name */
    public int f1144b;

    /* renamed from: c  reason: collision with root package name */
    public int f1145c;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f1146e;

    /* renamed from: f  reason: collision with root package name */
    public final g f1147f;

    public y(InputStream inputStream, g gVar) {
        super(inputStream);
        this.f1147f = gVar;
        this.f1143a = (byte[]) gVar.c(65536, byte[].class);
    }

    public static void j() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f1143a == null || inputStream == null) {
            j();
            throw null;
        }
        return (this.f1144b - this.f1146e) + inputStream.available();
    }

    public final int c(InputStream inputStream, byte[] bArr) {
        int i2;
        int i5 = this.d;
        if (i5 == -1 || this.f1146e - i5 >= (i2 = this.f1145c)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.d = -1;
                this.f1146e = 0;
                this.f1144b = read;
            }
            return read;
        }
        if (i5 == 0 && i2 > bArr.length && this.f1144b == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i2) {
                i2 = length;
            }
            byte[] bArr2 = (byte[]) this.f1147f.c(i2, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f1143a = bArr2;
            this.f1147f.g(bArr);
            bArr = bArr2;
        } else if (i5 > 0) {
            System.arraycopy(bArr, i5, bArr, 0, bArr.length - i5);
        }
        int i6 = this.f1146e - this.d;
        this.f1146e = i6;
        this.d = 0;
        this.f1144b = 0;
        int read2 = inputStream.read(bArr, i6, bArr.length - i6);
        int i7 = this.f1146e;
        if (read2 > 0) {
            i7 += read2;
        }
        this.f1144b = i7;
        return read2;
    }

    public final void close() {
        if (this.f1143a != null) {
            this.f1147f.g(this.f1143a);
            this.f1143a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void d() {
        if (this.f1143a != null) {
            this.f1147f.g(this.f1143a);
            this.f1143a = null;
        }
    }

    public final synchronized void mark(int i2) {
        this.f1145c = Math.max(this.f1145c, i2);
        this.d = this.f1146e;
    }

    public final boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x001b=Splitter:B:12:0x001b, B:28:0x003b=Splitter:B:28:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f1143a     // Catch:{ all -> 0x0019 }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x0019 }
            r2 = 0
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r3 = r6.f1146e     // Catch:{ all -> 0x0019 }
            int r4 = r6.f1144b     // Catch:{ all -> 0x0019 }
            r5 = -1
            if (r3 < r4) goto L_0x001b
            int r1 = r6.c(r1, r0)     // Catch:{ all -> 0x0019 }
            if (r1 != r5) goto L_0x001b
            monitor-exit(r6)
            return r5
        L_0x0019:
            r0 = move-exception
            goto L_0x003f
        L_0x001b:
            byte[] r1 = r6.f1143a     // Catch:{ all -> 0x0019 }
            if (r0 == r1) goto L_0x0028
            byte[] r0 = r6.f1143a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0024
            goto L_0x0028
        L_0x0024:
            j()     // Catch:{ all -> 0x0019 }
            throw r2     // Catch:{ all -> 0x0019 }
        L_0x0028:
            int r1 = r6.f1144b     // Catch:{ all -> 0x0019 }
            int r2 = r6.f1146e     // Catch:{ all -> 0x0019 }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r2 + 1
            r6.f1146e = r1     // Catch:{ all -> 0x0019 }
            byte r0 = r0[r2]     // Catch:{ all -> 0x0019 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0039:
            monitor-exit(r6)
            return r5
        L_0x003b:
            j()     // Catch:{ all -> 0x0019 }
            throw r2     // Catch:{ all -> 0x0019 }
        L_0x003f:
            monitor-exit(r6)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.y.read():int");
    }

    public final synchronized void reset() {
        if (this.f1143a != null) {
            int i2 = this.d;
            if (-1 != i2) {
                this.f1146e = i2;
            } else {
                throw new IOException("Mark has been invalidated, pos: " + this.f1146e + " markLimit: " + this.f1145c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public final synchronized long skip(long j6) {
        if (j6 < 1) {
            return 0;
        }
        byte[] bArr = this.f1143a;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i2 = this.f1144b;
                int i5 = this.f1146e;
                if (((long) (i2 - i5)) >= j6) {
                    this.f1146e = (int) (((long) i5) + j6);
                    return j6;
                }
                long j7 = ((long) i2) - ((long) i5);
                this.f1146e = i2;
                if (this.d == -1 || j6 > ((long) this.f1145c)) {
                    long skip = inputStream.skip(j6 - j7);
                    if (skip > 0) {
                        this.d = -1;
                    }
                    return j7 + skip;
                } else if (c(inputStream, bArr) == -1) {
                    return j7;
                } else {
                    int i6 = this.f1144b;
                    int i7 = this.f1146e;
                    if (((long) (i6 - i7)) >= j6 - j7) {
                        this.f1146e = (int) ((((long) i7) + j6) - j7);
                        return j6;
                    }
                    long j8 = (j7 + ((long) i6)) - ((long) i7);
                    this.f1146e = i6;
                    return j8;
                }
            } else {
                j();
                throw null;
            }
        } else {
            j();
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0047, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0054, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f1143a     // Catch:{ all -> 0x002e }
            r1 = 0
            if (r0 == 0) goto L_0x0086
            if (r9 != 0) goto L_0x000b
            monitor-exit(r6)
            r7 = 0
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0082
            int r3 = r6.f1146e     // Catch:{ all -> 0x002e }
            int r4 = r6.f1144b     // Catch:{ all -> 0x002e }
            if (r3 >= r4) goto L_0x0032
            int r4 = r4 - r3
            if (r4 < r9) goto L_0x0019
            r4 = r9
        L_0x0019:
            java.lang.System.arraycopy(r0, r3, r7, r8, r4)     // Catch:{ all -> 0x002e }
            int r3 = r6.f1146e     // Catch:{ all -> 0x002e }
            int r3 = r3 + r4
            r6.f1146e = r3     // Catch:{ all -> 0x002e }
            if (r4 == r9) goto L_0x0030
            int r3 = r2.available()     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x002a
            goto L_0x0030
        L_0x002a:
            int r8 = r8 + r4
            int r3 = r9 - r4
            goto L_0x0033
        L_0x002e:
            r7 = move-exception
            goto L_0x008a
        L_0x0030:
            monitor-exit(r6)
            return r4
        L_0x0032:
            r3 = r9
        L_0x0033:
            int r4 = r6.d     // Catch:{ all -> 0x002e }
            r5 = -1
            if (r4 != r5) goto L_0x0048
            int r4 = r0.length     // Catch:{ all -> 0x002e }
            if (r3 < r4) goto L_0x0048
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x002e }
            if (r4 != r5) goto L_0x0072
            if (r3 != r9) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            int r5 = r9 - r3
        L_0x0046:
            monitor-exit(r6)
            return r5
        L_0x0048:
            int r4 = r6.c(r2, r0)     // Catch:{ all -> 0x002e }
            if (r4 != r5) goto L_0x0055
            if (r3 != r9) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            int r5 = r9 - r3
        L_0x0053:
            monitor-exit(r6)
            return r5
        L_0x0055:
            byte[] r4 = r6.f1143a     // Catch:{ all -> 0x002e }
            if (r0 == r4) goto L_0x0062
            byte[] r0 = r6.f1143a     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            j()     // Catch:{ all -> 0x002e }
            throw r1     // Catch:{ all -> 0x002e }
        L_0x0062:
            int r4 = r6.f1144b     // Catch:{ all -> 0x002e }
            int r5 = r6.f1146e     // Catch:{ all -> 0x002e }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x006a
            r4 = r3
        L_0x006a:
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x002e }
            int r5 = r6.f1146e     // Catch:{ all -> 0x002e }
            int r5 = r5 + r4
            r6.f1146e = r5     // Catch:{ all -> 0x002e }
        L_0x0072:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0077
            monitor-exit(r6)
            return r9
        L_0x0077:
            int r5 = r2.available()     // Catch:{ all -> 0x002e }
            if (r5 != 0) goto L_0x0080
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x0080:
            int r8 = r8 + r4
            goto L_0x0033
        L_0x0082:
            j()     // Catch:{ all -> 0x002e }
            throw r1     // Catch:{ all -> 0x002e }
        L_0x0086:
            j()     // Catch:{ all -> 0x002e }
            throw r1     // Catch:{ all -> 0x002e }
        L_0x008a:
            monitor-exit(r6)     // Catch:{ all -> 0x002e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.y.read(byte[], int, int):int");
    }
}
