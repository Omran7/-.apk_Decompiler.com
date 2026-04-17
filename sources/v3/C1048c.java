package v3;

import h0.C0552a;
import q3.l;

/* renamed from: v3.c  reason: case insensitive filesystem */
public class C1048c implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final C1048c f12278b = new C1048c("[MIN_NAME]");

    /* renamed from: c  reason: collision with root package name */
    public static final C1048c f12279c = new C1048c("[MAX_KEY]");
    public static final C1048c d = new C1048c(".priority");

    /* renamed from: a  reason: collision with root package name */
    public final String f12280a;

    public C1048c(String str) {
        this.f12280a = str;
    }

    public static C1048c e(String str) {
        Integer g = l.g(str);
        if (g != null) {
            return new C1047b(str, g.intValue());
        }
        if (str.equals(".priority")) {
            return d;
        }
        l.c(!str.contains("/"));
        return new C1048c(str);
    }

    /* renamed from: a */
    public final int compareTo(C1048c cVar) {
        int i2;
        int i5 = 0;
        if (this == cVar) {
            return 0;
        }
        String str = this.f12280a;
        if (str.equals("[MIN_NAME]") || cVar.f12280a.equals("[MAX_KEY]")) {
            return -1;
        }
        String str2 = cVar.f12280a;
        if (str2.equals("[MIN_NAME]") || str.equals("[MAX_KEY]")) {
            return 1;
        }
        if (this instanceof C1047b) {
            if (!(cVar instanceof C1047b)) {
                return -1;
            }
            int j6 = cVar.j();
            char[] cArr = l.f11100a;
            int i6 = ((C1047b) this).f12277e;
            if (i6 < j6) {
                i2 = -1;
            } else if (i6 == j6) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i2 != 0) {
                return i2;
            }
            int length = str.length();
            int length2 = str2.length();
            if (length < length2) {
                i5 = -1;
            } else if (length != length2) {
                i5 = 1;
            }
            return i5;
        } else if (cVar instanceof C1047b) {
            return 1;
        } else {
            return str.compareTo(str2);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1048c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.f12280a.equals(((C1048c) obj).f12280a);
    }

    public final int hashCode() {
        return this.f12280a.hashCode();
    }

    public int j() {
        return 0;
    }

    public String toString() {
        return C0552a.r(new StringBuilder("ChildKey(\""), this.f12280a, "\")");
    }
}
