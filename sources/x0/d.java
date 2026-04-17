package x0;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

public final class d extends ByteArrayOutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f12524a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar, int i2) {
        super(i2);
        this.f12524a = eVar;
    }

    public final String toString() {
        int i2 = this.count;
        if (i2 > 0 && this.buf[i2 - 1] == 13) {
            i2--;
        }
        try {
            return new String(this.buf, 0, i2, this.f12524a.f12526b.name());
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }
}
