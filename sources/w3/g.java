package w3;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import k.C0737s0;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedBlockingQueue f12436a;

    /* renamed from: b  reason: collision with root package name */
    public final Random f12437b = new Random();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f12438c = false;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public final C1083d f12439e;

    /* renamed from: f  reason: collision with root package name */
    public WritableByteChannel f12440f;
    public final Thread g;

    public g(C1083d dVar, int i2) {
        Thread newThread = C1083d.f12421n.newThread(new C0737s0(this, 17));
        this.g = newThread;
        C1083d.f12422o.getClass();
        newThread.setName("TubeSockWriter-" + i2);
        this.f12439e = dVar;
        this.f12436a = new LinkedBlockingQueue();
    }

    public final ByteBuffer a(byte b6, byte[] bArr) {
        int i2;
        int length = bArr.length;
        if (length < 126) {
            i2 = 6;
        } else if (length <= 65535) {
            i2 = 8;
        } else {
            i2 = 14;
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + i2);
        allocate.put((byte) (b6 | Byte.MIN_VALUE));
        if (length < 126) {
            allocate.put((byte) (length | 128));
        } else if (length <= 65535) {
            allocate.put((byte) 254);
            allocate.putShort((short) length);
        } else {
            allocate.put((byte) 255);
            allocate.putInt(0);
            allocate.putInt(length);
        }
        byte[] bArr2 = new byte[4];
        this.f12437b.nextBytes(bArr2);
        allocate.put(bArr2);
        for (int i5 = 0; i5 < bArr.length; i5++) {
            allocate.put((byte) (bArr[i5] ^ bArr2[i5 % 4]));
        }
        allocate.flip();
        return allocate;
    }

    public final synchronized void b(byte b6, byte[] bArr) {
        try {
            ByteBuffer a6 = a(b6, bArr);
            if (this.f12438c) {
                if (this.d || b6 != 8) {
                    throw new RuntimeException("Shouldn't be sending");
                }
            }
            if (b6 == 8) {
                this.d = true;
            }
            this.f12436a.add(a6);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }
}
