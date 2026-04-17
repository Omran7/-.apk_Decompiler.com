package m5;

import kotlin.jvm.internal.j;

/* renamed from: m5.b  reason: case insensitive filesystem */
public final class C0843b implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final C0843b f10193b = new C0843b();

    /* renamed from: a  reason: collision with root package name */
    public final int f10194a = 131072;

    public final int compareTo(Object obj) {
        C0843b bVar = (C0843b) obj;
        j.e(bVar, "other");
        return this.f10194a - bVar.f10194a;
    }

    public final boolean equals(Object obj) {
        C0843b bVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0843b) {
            bVar = (C0843b) obj;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return false;
        }
        if (this.f10194a == bVar.f10194a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10194a;
    }

    public final String toString() {
        return "2.0.0";
    }
}
