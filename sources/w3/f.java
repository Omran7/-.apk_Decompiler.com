package w3;

import X4.d;
import a3.C0261a;
import j3.g;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import l3.t;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public DataInputStream f12431a;

    /* renamed from: b  reason: collision with root package name */
    public C1083d f12432b;

    /* renamed from: c  reason: collision with root package name */
    public d f12433c;
    public byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public C1080a f12434e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f12435f;

    public static long b(byte[] bArr) {
        return (((long) bArr[2]) << 56) + (((long) (bArr[3] & 255)) << 48) + (((long) (bArr[4] & 255)) << 40) + (((long) (bArr[5] & 255)) << 32) + (((long) (bArr[6] & 255)) << 24) + ((long) ((bArr[7] & 255) << 16)) + ((long) ((bArr[8] & 255) << 8)) + ((long) (bArr[9] & 255));
    }

    /* JADX WARNING: type inference failed for: r6v7, types: [w3.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v8, types: [n3.C, java.lang.Object] */
    public final void a(boolean z3, byte b6, byte[] bArr) {
        C1080a aVar;
        if (b6 != 9) {
            C1080a aVar2 = this.f12434e;
            if (aVar2 != null && b6 != 0) {
                throw new RuntimeException("Failed to continue outstanding frame");
            } else if (aVar2 == null && b6 == 0) {
                throw new RuntimeException("Received continuing frame, but there's nothing to continue");
            } else {
                if (aVar2 == null) {
                    if (b6 == 2) {
                        ? obj = new Object();
                        obj.f10244b = 0;
                        obj.f10243a = new ArrayList();
                        aVar = obj;
                    } else {
                        ? obj2 = new Object();
                        obj2.f12418a = new StringBuilder();
                        aVar = obj2;
                    }
                    this.f12434e = aVar;
                }
                if (!this.f12434e.a(bArr)) {
                    throw new RuntimeException("Failed to decode frame");
                } else if (z3) {
                    C0261a b7 = this.f12434e.b();
                    this.f12434e = null;
                    d dVar = this.f12433c;
                    dVar.getClass();
                    String str = b7.f4562b;
                    t tVar = (t) dVar.f4210c;
                    if (tVar.f9743j.y()) {
                        tVar.f9743j.d(o3.d.i("ws message: ", str), (Throwable) null, new Object[0]);
                    }
                    tVar.f9742i.execute(new g((Object) dVar, (Object) str, 1, false));
                }
            }
        } else if (!z3) {
            throw new RuntimeException("PING must not fragment across frames");
        } else if (bArr.length <= 125) {
            C1083d dVar2 = this.f12432b;
            synchronized (dVar2) {
                dVar2.e((byte) 10, bArr);
            }
        } else {
            throw new RuntimeException("PING frame too long");
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [w3.e, java.lang.RuntimeException] */
    public final void c() {
        boolean z3;
        long j6;
        this.f12433c = this.f12432b.f12425c;
        while (!this.f12435f) {
            try {
                this.f12431a.readFully(this.d, 0, 1);
                byte[] bArr = this.d;
                byte b6 = bArr[0];
                if ((b6 & 128) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((b6 & 112) == 0) {
                    byte b7 = (byte) (b6 & 15);
                    this.f12431a.readFully(bArr, 1, 1);
                    byte[] bArr2 = this.d;
                    byte b8 = bArr2[1];
                    if (b8 < 126) {
                        j6 = (long) b8;
                    } else if (b8 == 126) {
                        this.f12431a.readFully(bArr2, 2, 2);
                        byte[] bArr3 = this.d;
                        j6 = (((long) (bArr3[2] & 255)) << 8) | ((long) (bArr3[3] & 255));
                    } else if (b8 == Byte.MAX_VALUE) {
                        this.f12431a.readFully(bArr2, 2, 8);
                        j6 = b(this.d);
                    } else {
                        j6 = 0;
                    }
                    int i2 = (int) j6;
                    byte[] bArr4 = new byte[i2];
                    this.f12431a.readFully(bArr4, 0, i2);
                    if (b7 == 8) {
                        this.f12432b.b();
                    } else if (b7 != 10) {
                        if (!(b7 == 1 || b7 == 2 || b7 == 9)) {
                            if (b7 != 0) {
                                throw new RuntimeException("Unsupported opcode: " + b7);
                            }
                        }
                        a(z3, b7, bArr4);
                    }
                } else {
                    throw new RuntimeException("Invalid frame received");
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException e6) {
                ? runtimeException = new RuntimeException("IO Error", e6);
                this.f12435f = true;
                C1083d dVar = this.f12432b;
                dVar.f12425c.K(runtimeException);
                if (dVar.f12423a == 3) {
                    dVar.a();
                }
                dVar.b();
            } catch (C1084e e7) {
                this.f12435f = true;
                C1083d dVar2 = this.f12432b;
                dVar2.f12425c.K(e7);
                if (dVar2.f12423a == 3) {
                    dVar2.a();
                }
                dVar2.b();
            }
        }
    }
}
