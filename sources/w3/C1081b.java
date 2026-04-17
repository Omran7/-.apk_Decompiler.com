package w3;

import A5.b;
import a3.C0261a;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;

/* renamed from: w3.b  reason: case insensitive filesystem */
public final class C1081b implements C1080a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f12417b = new b(9);

    /* renamed from: a  reason: collision with root package name */
    public StringBuilder f12418a;

    static {
        new b(10);
    }

    public final boolean a(byte[] bArr) {
        String str;
        try {
            str = ((CharsetDecoder) f12417b.get()).decode(ByteBuffer.wrap(bArr)).toString();
        } catch (CharacterCodingException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        this.f12418a.append(str);
        return true;
    }

    public final C0261a b() {
        String sb = this.f12418a.toString();
        C0261a aVar = new C0261a();
        aVar.f4562b = sb;
        return aVar;
    }
}
