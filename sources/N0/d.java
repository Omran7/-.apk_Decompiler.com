package N0;

import B0.D;
import I0.B;
import M0.c;
import M0.h;
import U0.b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import z0.i;

public final class d implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final d f1894b = new d(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1895a;

    public /* synthetic */ d(int i2) {
        this.f1895a = i2;
    }

    public final D i(D d, i iVar) {
        b bVar;
        byte[] bArr;
        switch (this.f1895a) {
            case 0:
                return d;
            default:
                ByteBuffer asReadOnlyBuffer = ((h) ((c) d.get()).f1783a.f1782b).f1801a.d.asReadOnlyBuffer();
                AtomicReference atomicReference = U0.c.f3676a;
                if (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) {
                    bVar = null;
                } else {
                    bVar = new b((Object) asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit(), 0);
                }
                if (bVar != null && bVar.f3674b == 0 && bVar.f3675c == ((byte[]) bVar.d).length) {
                    bArr = asReadOnlyBuffer.array();
                } else {
                    ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
                    ByteBuffer byteBuffer = (ByteBuffer) asReadOnlyBuffer2.position(0);
                    asReadOnlyBuffer2.get(bArr2);
                    bArr = bArr2;
                }
                return new B(bArr);
        }
    }
}
