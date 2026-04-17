package com.bumptech.glide.load.data;

import C0.g;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final FileOutputStream f5809a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f5810b;

    /* renamed from: c  reason: collision with root package name */
    public final g f5811c;
    public int d;

    public c(FileOutputStream fileOutputStream, g gVar) {
        this.f5809a = fileOutputStream;
        this.f5811c = gVar;
        this.f5810b = (byte[]) gVar.c(65536, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        FileOutputStream fileOutputStream = this.f5809a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f5810b;
            if (bArr != null) {
                this.f5811c.g(bArr);
                this.f5810b = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    public final void flush() {
        int i2 = this.d;
        FileOutputStream fileOutputStream = this.f5809a;
        if (i2 > 0) {
            fileOutputStream.write(this.f5810b, 0, i2);
            this.d = 0;
        }
        fileOutputStream.flush();
    }

    public final void write(int i2) {
        byte[] bArr = this.f5810b;
        int i5 = this.d;
        int i6 = i5 + 1;
        this.d = i6;
        bArr[i5] = (byte) i2;
        if (i6 == bArr.length && i6 > 0) {
            this.f5809a.write(bArr, 0, i6);
            this.d = 0;
        }
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i2, int i5) {
        int i6 = 0;
        do {
            int i7 = i5 - i6;
            int i8 = i2 + i6;
            int i9 = this.d;
            FileOutputStream fileOutputStream = this.f5809a;
            if (i9 != 0 || i7 < this.f5810b.length) {
                int min = Math.min(i7, this.f5810b.length - i9);
                System.arraycopy(bArr, i8, this.f5810b, this.d, min);
                int i10 = this.d + min;
                this.d = i10;
                i6 += min;
                byte[] bArr2 = this.f5810b;
                if (i10 == bArr2.length && i10 > 0) {
                    fileOutputStream.write(bArr2, 0, i10);
                    this.d = 0;
                    continue;
                }
            } else {
                fileOutputStream.write(bArr, i8, i7);
                return;
            }
        } while (i6 < i5);
    }
}
