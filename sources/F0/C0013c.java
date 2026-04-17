package F0;

import T0.b;
import java.io.File;
import z0.i;

/* renamed from: F0.c  reason: case insensitive filesystem */
public final class C0013c implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f678a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f679b;

    public /* synthetic */ C0013c(Object obj, int i2) {
        this.f678a = i2;
        this.f679b = obj;
    }

    public final r a(Object obj, int i2, int i5, i iVar) {
        switch (this.f678a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new r(new b(bArr), new n(bArr, (C) this.f679b, 1));
            case 1:
                return new r(new b(obj), new A0.b(1, obj.toString(), (C) this.f679b));
            default:
                File file = (File) obj;
                return new r(new b(file), new A0.b(2, file, (C) this.f679b));
        }
    }

    public final boolean b(Object obj) {
        switch (this.f678a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                File file = (File) obj;
                return true;
        }
    }
}
