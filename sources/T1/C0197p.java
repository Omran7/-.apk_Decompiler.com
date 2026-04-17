package T1;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* renamed from: T1.p  reason: case insensitive filesystem */
public final class C0197p {

    /* renamed from: f  reason: collision with root package name */
    public static final C0197p f3424f = new C0197p((Boolean) null, 100, (Boolean) null, (String) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f3425a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3426b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f3427c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final EnumMap f3428e;

    public C0197p(Boolean bool, int i2, Boolean bool2, String str) {
        G0 g02;
        EnumMap enumMap = new EnumMap(I0.class);
        this.f3428e = enumMap;
        I0 i02 = I0.AD_USER_DATA;
        if (bool == null) {
            g02 = G0.UNINITIALIZED;
        } else if (bool.booleanValue()) {
            g02 = G0.GRANTED;
        } else {
            g02 = G0.DENIED;
        }
        enumMap.put(i02, g02);
        this.f3425a = i2;
        this.f3426b = e();
        this.f3427c = bool2;
        this.d = str;
    }

    public static C0197p a(int i2, Bundle bundle) {
        Boolean bool = null;
        if (bundle == null) {
            return new C0197p((Boolean) null, i2, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(I0.class);
        for (I0 i02 : H0.DMA.f2959a) {
            enumMap.put(i02, J0.b(bundle.getString(i02.f2965a)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new C0197p(enumMap, i2, bool, bundle.getString("cps_display_str"));
    }

    public static C0197p b(String str) {
        if (str == null || str.length() <= 0) {
            return f3424f;
        }
        String[] split = str.split(":");
        int parseInt = Integer.parseInt(split[0]);
        EnumMap enumMap = new EnumMap(I0.class);
        I0[] i0Arr = H0.DMA.f2959a;
        int length = i0Arr.length;
        int i2 = 1;
        int i5 = 0;
        while (i5 < length) {
            enumMap.put(i0Arr[i5], J0.c(split[i2].charAt(0)));
            i5++;
            i2++;
        }
        return new C0197p(enumMap, parseInt, (Boolean) null, (String) null);
    }

    public static Boolean d(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int ordinal = J0.b(bundle.getString("ad_personalization")).ordinal();
        if (ordinal == 2) {
            return Boolean.FALSE;
        }
        if (ordinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final G0 c() {
        G0 g02 = (G0) this.f3428e.get(I0.AD_USER_DATA);
        if (g02 == null) {
            return G0.UNINITIALIZED;
        }
        return g02;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3425a);
        for (I0 i02 : H0.DMA.f2959a) {
            sb.append(":");
            sb.append(J0.a((G0) this.f3428e.get(i02)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0197p)) {
            return false;
        }
        C0197p pVar = (C0197p) obj;
        if (!this.f3426b.equalsIgnoreCase(pVar.f3426b) || !Objects.equals(this.f3427c, pVar.f3427c)) {
            return false;
        }
        return Objects.equals(this.d, pVar.d);
    }

    public final int hashCode() {
        int i2;
        int i5;
        Boolean bool = this.f3427c;
        if (bool == null) {
            i2 = 3;
        } else if (true != bool.booleanValue()) {
            i2 = 13;
        } else {
            i2 = 7;
        }
        String str = this.d;
        if (str == null) {
            i5 = 17;
        } else {
            i5 = str.hashCode();
        }
        return (i5 * 137) + this.f3426b.hashCode() + (i2 * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(J0.h(this.f3425a));
        for (I0 i02 : H0.DMA.f2959a) {
            sb.append(",");
            sb.append(i02.f2965a);
            sb.append("=");
            G0 g02 = (G0) this.f3428e.get(i02);
            if (g02 == null) {
                sb.append("uninitialized");
            } else {
                int ordinal = g02.ordinal();
                if (ordinal == 0) {
                    sb.append("uninitialized");
                } else if (ordinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (ordinal == 2) {
                    sb.append("denied");
                } else if (ordinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f3427c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public C0197p(EnumMap enumMap, int i2, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(I0.class);
        this.f3428e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f3425a = i2;
        this.f3426b = e();
        this.f3427c = bool;
        this.d = str;
    }
}
