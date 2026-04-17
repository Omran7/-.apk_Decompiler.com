package I5;

import G5.C0;
import kotlin.jvm.internal.k;
import o5.g;
import x5.p;

public final class w extends k implements p {

    /* renamed from: b  reason: collision with root package name */
    public static final w f1282b = new w(2, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final w f1283c = new w(2, 1);
    public static final w d = new w(2, 2);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1284a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i2, int i5) {
        super(i2);
        this.f1284a = i5;
    }

    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i2;
        switch (this.f1284a) {
            case 0:
                g gVar = (g) obj2;
                if (!(gVar instanceof C0)) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 1;
                }
                if (i2 == 0) {
                    return gVar;
                }
                return Integer.valueOf(i2 + 1);
            case 1:
                C0 c02 = (C0) obj;
                g gVar2 = (g) obj2;
                if (c02 != null) {
                    return c02;
                }
                if (gVar2 instanceof C0) {
                    return (C0) gVar2;
                }
                return null;
            default:
                g gVar3 = (g) obj2;
                return (y) obj;
        }
    }
}
