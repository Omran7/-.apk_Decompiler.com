package w1;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: w1.c  reason: case insensitive filesystem */
public final /* synthetic */ class C1077c implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ C1077c f12414b = new C1077c(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12415a;

    public /* synthetic */ C1077c(int i2) {
        this.f12415a = i2;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.f12415a) {
            case 0:
                return ((Scope) obj).f6001b.compareTo(((Scope) obj2).f6001b);
            default:
                return ((Scope) obj).f6001b.compareTo(((Scope) obj2).f6001b);
        }
    }
}
