package v5;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.j;

public final class b extends ByteArrayOutputStream {
    public final byte[] c() {
        byte[] bArr = this.buf;
        j.d(bArr, "buf");
        return bArr;
    }
}
