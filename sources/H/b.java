package H;

import Y4.D;
import Y4.l;
import b5.C0325a;
import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f966a;

    public /* synthetic */ b(int i2) {
        this.f966a = i2;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f966a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b6 = bArr[i2];
                    byte b7 = bArr2[i2];
                    if (b6 != b7) {
                        return b6 - b7;
                    }
                }
                return 0;
            case 1:
                D d = (D) obj;
                D d6 = (D) obj2;
                int i5 = d.f4298i;
                int i6 = d6.f4298i;
                if (i5 == i6) {
                    return Integer.compare(d6.f4293a, d.f4293a);
                }
                return Integer.compare(i6, i5);
            case 2:
                return Integer.compare(((l) obj2).f4388e, ((l) obj).f4388e);
            default:
                return Integer.compare(((C0325a) obj).getState(), ((C0325a) obj2).getState());
        }
    }
}
