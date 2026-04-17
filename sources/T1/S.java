package T1;

import android.os.Bundle;
import com.google.android.gms.common.internal.I;
import h0.C0552a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class S {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f3030b = new AtomicReference();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference f3031c = new AtomicReference();
    public static final AtomicReference d = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    public final C0180j0 f3032a;

    public S(C0180j0 j0Var) {
        this.f3032a = j0Var;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z3;
        String str2;
        I.g(atomicReference);
        if (strArr.length == strArr2.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.b(z3);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (Objects.equals(str, strArr[i2])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i2];
                        if (str2 == null) {
                            str2 = strArr2[i2] + "(" + strArr[i2] + ")";
                            strArr3[i2] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = b(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String b(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f3032a.a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String next : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(e(next));
            sb.append("=");
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                str = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = a(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String c(C0214v vVar) {
        String str;
        C0180j0 j0Var = this.f3032a;
        if (!j0Var.a()) {
            return vVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(vVar.f3510c);
        sb.append(",name=");
        sb.append(d(vVar.f3508a));
        sb.append(",params=");
        C0211u uVar = vVar.f3509b;
        if (uVar == null) {
            str = null;
        } else if (!j0Var.a()) {
            str = uVar.f3472a.toString();
        } else {
            str = b(uVar.v());
        }
        sb.append(str);
        return sb.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f3032a.a()) {
            return str;
        }
        return g(str, K0.f2976c, K0.f2974a, f3030b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f3032a.a()) {
            return str;
        }
        return g(str, K0.f2978f, K0.f2977e, f3031c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f3032a.a()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return C0552a.o("experiment_id(", str, ")");
        }
        return g(str, K0.f2980j, K0.f2979i, d);
    }
}
