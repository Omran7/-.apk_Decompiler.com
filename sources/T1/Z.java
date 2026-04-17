package T1;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.I;

public final class Z extends E0 {

    /* renamed from: c  reason: collision with root package name */
    public char f3170c = 0;
    public long d = -1;

    /* renamed from: e  reason: collision with root package name */
    public String f3171e;

    /* renamed from: f  reason: collision with root package name */
    public final X f3172f = new X(6, this, false, false);

    /* renamed from: p  reason: collision with root package name */
    public final X f3173p = new X(6, this, true, false);

    /* renamed from: q  reason: collision with root package name */
    public final X f3174q = new X(6, this, false, true);

    /* renamed from: r  reason: collision with root package name */
    public final X f3175r = new X(5, this, false, false);

    /* renamed from: s  reason: collision with root package name */
    public final X f3176s = new X(5, this, true, false);

    /* renamed from: t  reason: collision with root package name */
    public final X f3177t = new X(5, this, false, true);

    /* renamed from: u  reason: collision with root package name */
    public final X f3178u = new X(4, this, false, false);

    /* renamed from: v  reason: collision with root package name */
    public final X f3179v = new X(3, this, false, false);

    /* renamed from: w  reason: collision with root package name */
    public final X f3180w = new X(2, this, false, false);

    public Z(C0212u0 u0Var) {
        super(u0Var);
    }

    public static Y w(String str) {
        if (str == null) {
            return null;
        }
        return new Y(str);
    }

    public static String x(boolean z3, String str, Object obj, Object obj2, Object obj3) {
        String y6 = y(obj, z3);
        String y7 = y(obj2, z3);
        String y8 = y(obj3, z3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(y6)) {
            sb.append(str2);
            sb.append(y6);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(y7)) {
            sb.append(str2);
            sb.append(y7);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(y8)) {
            sb.append(str3);
            sb.append(y8);
        }
        return sb.toString();
    }

    public static String y(Object obj, boolean z3) {
        String str;
        String str2;
        String className;
        String str3;
        int lastIndexOf;
        int lastIndexOf2;
        String str4 = "";
        if (obj == null) {
            return str4;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z3) {
                return obj.toString();
            }
            Long l6 = (Long) obj;
            if (Math.abs(l6.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l6.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 4.0d);
            StringBuilder sb = new StringBuilder();
            if (charAt == '-') {
                str4 = "-";
            }
            sb.append(str4);
            sb.append(round);
            sb.append("...");
            sb.append(str4);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                if (z3) {
                    str = th.getClass().getName();
                } else {
                    str = th.toString();
                }
                StringBuilder sb2 = new StringBuilder(str);
                String canonicalName = C0212u0.class.getCanonicalName();
                if (!TextUtils.isEmpty(canonicalName) && (lastIndexOf2 = canonicalName.lastIndexOf(46)) != -1) {
                    str2 = canonicalName.substring(0, lastIndexOf2);
                } else {
                    str2 = str4;
                }
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                        if (!TextUtils.isEmpty(className) && (lastIndexOf = className.lastIndexOf(46)) != -1) {
                            str3 = className.substring(0, lastIndexOf);
                        } else {
                            str3 = str4;
                        }
                        if (str3.equals(str2)) {
                            sb2.append(": ");
                            sb2.append(stackTraceElement);
                            break;
                        }
                    }
                    i2++;
                }
                return sb2.toString();
            } else if (obj instanceof Y) {
                return ((Y) obj).f3155a;
            } else {
                if (z3) {
                    return "-";
                }
                return obj.toString();
            }
        }
    }

    public final void A(int i2, boolean z3, boolean z4, String str, Object obj, Object obj2, Object obj3) {
        if (!z3 && Log.isLoggable(z(), i2)) {
            Log.println(i2, z(), x(false, str, obj, obj2, obj3));
        }
        if (!z4 && i2 >= 5) {
            I.g(str);
            C0203r0 r0Var = ((C0212u0) this.f398a).f3497s;
            if (r0Var == null) {
                Log.println(6, z(), "Scheduler not set. Not logging error/warn");
            } else if (!r0Var.f2825b) {
                Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i2 >= 9) {
                    i2 = 8;
                }
                r0Var.y(new W(this, i2, str, obj, obj2, obj3));
            }
        }
    }

    public final boolean p() {
        return false;
    }

    public final X s() {
        return this.f3179v;
    }

    public final X t() {
        return this.f3172f;
    }

    public final X u() {
        return this.f3180w;
    }

    public final X v() {
        return this.f3175r;
    }

    public final String z() {
        String str;
        synchronized (this) {
            try {
                if (this.f3171e == null) {
                    C0212u0 u0Var = (C0212u0) this.f398a;
                    String str2 = u0Var.d;
                    if (str2 != null) {
                        this.f3171e = str2;
                    } else {
                        ((C0212u0) u0Var.f3494p.f398a).getClass();
                        this.f3171e = "FA";
                    }
                }
                I.g(this.f3171e);
                str = this.f3171e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
