package q1;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import m0.a0;

/* renamed from: q1.a  reason: case insensitive filesystem */
public final class C0931a implements e {

    /* renamed from: c  reason: collision with root package name */
    public static final C0931a f11075c;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11076a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11077b;

    static {
        a0 a0Var = new a0(9);
        a0Var.f9925b = Boolean.FALSE;
        f11075c = new C0931a(a0Var);
    }

    public C0931a(a0 a0Var) {
        this.f11076a = ((Boolean) a0Var.f9925b).booleanValue();
        this.f11077b = (String) a0Var.f9926c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0931a)) {
            return false;
        }
        C0931a aVar = (C0931a) obj;
        aVar.getClass();
        if (!I.j((Object) null, (Object) null) || this.f11076a != aVar.f11076a || !I.j(this.f11077b, aVar.f11077b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f11076a), this.f11077b});
    }
}
