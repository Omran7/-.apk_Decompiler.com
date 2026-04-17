package I0;

import B0.C0009h;
import B0.D;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import z0.i;
import z0.k;

/* renamed from: I0.f  reason: case insensitive filesystem */
public final class C0059f implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1111a;

    /* renamed from: b  reason: collision with root package name */
    public final q f1112b;

    public /* synthetic */ C0059f(q qVar, int i2) {
        this.f1111a = i2;
        this.f1112b = qVar;
    }

    public final D a(Object obj, int i2, int i5, i iVar) {
        switch (this.f1111a) {
            case 0:
                q qVar = this.f1112b;
                return qVar.a(new C0009h((Object) (ByteBuffer) obj, (Object) qVar.d, (Object) qVar.f1132c, 10), i2, i5, iVar, q.f1128j);
            default:
                q qVar2 = this.f1112b;
                return qVar2.a(new C0009h((ParcelFileDescriptor) obj, qVar2.d, qVar2.f1132c), i2, i5, iVar, q.f1128j);
        }
    }

    public final boolean b(Object obj, i iVar) {
        switch (this.f1111a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                this.f1112b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) || "robolectric".equals(Build.FINGERPRINT)) {
                    return false;
                }
                return true;
        }
    }
}
