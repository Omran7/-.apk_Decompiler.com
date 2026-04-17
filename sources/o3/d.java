package o3;

import R2.b;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import i3.C0590f;
import java.util.ArrayList;
import java.util.Iterator;

public abstract /* synthetic */ class d {
    public static float a(float f6, float f7, float f8, float f9) {
        return ((f6 - f7) * f8) + f9;
    }

    public static C0269a b(I i2, I i5) {
        i2.getClass();
        return new C0269a(i5);
    }

    public static C0590f c(C0590f fVar, String str, String str2, String str3) {
        return fVar.E(b.Z()).E(str).E(str2).E(str3);
    }

    public static C0590f d(C0590f fVar, String str, String str2, String str3, String str4) {
        return fVar.E(b.Z()).E(str).E(str2).E(str3).E(str4);
    }

    public static ClassCastException e(Iterator it2) {
        it2.next().getClass();
        return new ClassCastException();
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void h(int i2, ArrayList arrayList, int i5, int i6, int i7) {
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i5));
        arrayList.add(Integer.valueOf(i6));
        arrayList.add(Integer.valueOf(i7));
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String j(int i2) {
        switch (i2) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case zzaky.zzf.zzf:
                return "BASELINE";
            case zzaky.zzf.zzg:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String k(int i2) {
        if (i2 == 1) {
            return "CHILD_REMOVED";
        }
        if (i2 == 2) {
            return "CHILD_ADDED";
        }
        if (i2 == 3) {
            return "CHILD_MOVED";
        }
        if (i2 != 4) {
            return i2 != 5 ? "null" : "VALUE";
        }
        return "CHILD_CHANGED";
    }

    public static /* synthetic */ String l(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? "null" : "V2";
        }
        return "V1";
    }

    public static /* synthetic */ String m(int i2) {
        if (i2 == 1) {
            return "LOCAL";
        }
        if (i2 == 2) {
            return "REMOTE";
        }
        if (i2 == 3) {
            return "DATA_DISK_CACHE";
        }
        if (i2 != 4) {
            return i2 != 5 ? "null" : "MEMORY_CACHE";
        }
        return "RESOURCE_DISK_CACHE";
    }
}
