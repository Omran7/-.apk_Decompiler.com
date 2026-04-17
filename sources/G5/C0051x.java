package G5;

import kotlin.jvm.internal.k;
import o5.g;
import o5.i;
import x5.p;

/* renamed from: G5.x  reason: case insensitive filesystem */
public final class C0051x extends k implements p {

    /* renamed from: b  reason: collision with root package name */
    public static final C0051x f956b = new C0051x(2, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final C0051x f957c = new C0051x(2, 1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f958a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0051x(int i2, int i5) {
        super(i2);
        this.f958a = i5;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.f958a) {
            case 0:
                return ((i) obj).plus((g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                g gVar = (g) obj2;
                return bool;
            default:
                return ((i) obj).plus((g) obj2);
        }
    }
}
