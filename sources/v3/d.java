package V3;

import android.util.Log;
import java.io.ByteArrayInputStream;

public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final Runtime f3769f = Runtime.getRuntime();

    /* renamed from: a  reason: collision with root package name */
    public final ByteArrayInputStream f3770a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f3771b = new byte[262144];

    /* renamed from: c  reason: collision with root package name */
    public int f3772c = 0;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3773e = true;

    public d(ByteArrayInputStream byteArrayInputStream) {
        this.f3770a = byteArrayInputStream;
    }

    public final int a(int i2) {
        int i5 = this.f3772c;
        int i6 = 0;
        if (i2 <= i5) {
            int i7 = i5 - i2;
            this.f3772c = i7;
            byte[] bArr = this.f3771b;
            System.arraycopy(bArr, i2, bArr, 0, i7);
            return i2;
        }
        this.f3772c = 0;
        while (i6 < i2) {
            ByteArrayInputStream byteArrayInputStream = this.f3770a;
            int skip = (int) byteArrayInputStream.skip((long) (i2 - i6));
            if (skip > 0) {
                i6 += skip;
            } else if (skip != 0) {
                continue;
            } else if (byteArrayInputStream.read() == -1) {
                break;
            } else {
                i6++;
            }
        }
        return i6;
    }

    public final void b(int i2) {
        byte[] bArr = this.f3771b;
        if (i2 > bArr.length) {
            int max = Math.max(bArr.length * 2, i2);
            Runtime runtime = f3769f;
            long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
            if (!this.f3773e || ((long) max) >= maxMemory) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
            } else {
                try {
                    byte[] bArr2 = new byte[max];
                    System.arraycopy(this.f3771b, 0, bArr2, 0, this.f3772c);
                    this.f3771b = bArr2;
                } catch (OutOfMemoryError unused) {
                    Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                    this.f3773e = false;
                }
            }
            i2 = Math.min(i2, this.f3771b.length);
        }
        while (true) {
            int i5 = this.f3772c;
            if (i5 < i2) {
                int read = this.f3770a.read(this.f3771b, i5, i2 - i5);
                if (read == -1) {
                    this.d = true;
                    return;
                }
                this.f3772c += read;
            } else {
                return;
            }
        }
    }
}
