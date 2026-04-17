package h0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q.C0928e;

/* renamed from: h0.a  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0552a {
    public static /* synthetic */ String A(int i2) {
        if (i2 == 1) {
            return "NONE";
        }
        if (i2 != 2) {
            return i2 != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    public static /* synthetic */ String B(int i2) {
        if (i2 == 1) {
            return "REMOVED";
        }
        if (i2 == 2) {
            return "VISIBLE";
        }
        if (i2 != 3) {
            return i2 != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static final void a(View view, int i2) {
        int c3 = C0928e.c(i2);
        if (c3 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
            }
        } else if (c3 == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
        } else if (c3 == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
        } else if (c3 == 3) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
            }
            view.setVisibility(4);
        }
    }

    public static int b(int i2) {
        if (i2 == 0) {
            return 2;
        }
        if (i2 == 4) {
            return 4;
        }
        if (i2 == 8) {
            return 3;
        }
        throw new IllegalArgumentException(a.f(i2, "Unknown visibility "));
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static final boolean d(int i2) {
        return !G2.a.f836b.get();
    }

    public static final boolean e(int i2) {
        Boolean bool;
        if (G2.a.f836b.get()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", (Class[]) null).invoke((Object) null, (Object[]) null);
            } catch (Exception unused) {
                G2.a.f835a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ boolean f(int i2) {
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return false;
        }
        if (i2 == 4 || i2 == 5) {
            return true;
        }
        throw null;
    }

    public static int g(int i2, int i5, int i6) {
        return (Integer.hashCode(i2) + i5) * i6;
    }

    public static int h(int i2, int i5, int i6, int i7) {
        return ((i2 * i5) / i6) + i7;
    }

    public static int i(int i2, int i5, int i6, int i7, int i8) {
        return Math.max(((i2 * i5) / i6) + i7, i8);
    }

    public static Object j(zzbl zzbl, int i2, List list, int i5) {
        zzh.zzh(zzbl.name(), i2, list);
        return list.get(i5);
    }

    public static String k(int i2, String str, String str2) {
        return str + i2 + str2;
    }

    public static String l(String str, int i2, int i5, String str2) {
        return str + i2 + str2 + i5;
    }

    public static String m(String str, long j6) {
        return str + j6;
    }

    public static String n(String str, C0286s sVar, String str2) {
        return str + sVar + str2;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String q(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String r(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder s(int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder t(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder u(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static HashMap v(Class cls, D3.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map w(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void x(Exception exc, String str, String str2) {
        Log.e(str2, str + exc);
    }

    public static /* synthetic */ void y(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String z(int i2) {
        switch (i2) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case zzaky.zzf.zzf:
                return "FINISHED";
            default:
                return "null";
        }
    }
}
