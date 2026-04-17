package r5;

import h0.C0552a;
import java.io.Serializable;
import kotlin.jvm.internal.j;
import n5.C0871c;

public final class b extends C0871c implements a, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Enum[] f11265a;

    public b(Enum[] enumArr) {
        j.e(enumArr, "entries");
        this.f11265a = enumArr;
    }

    public final boolean contains(Object obj) {
        Enum enumR;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum enumR2 = (Enum) obj;
        j.e(enumR2, "element");
        int ordinal = enumR2.ordinal();
        Enum[] enumArr = this.f11265a;
        j.e(enumArr, "<this>");
        if (ordinal < 0 || ordinal >= enumArr.length) {
            enumR = null;
        } else {
            enumR = enumArr[ordinal];
        }
        if (enumR == enumR2) {
            return true;
        }
        return false;
    }

    public final Object get(int i2) {
        Enum[] enumArr = this.f11265a;
        int length = enumArr.length;
        if (i2 >= 0 && i2 < length) {
            return enumArr[i2];
        }
        throw new IndexOutOfBoundsException(C0552a.l("index: ", i2, length, ", size: "));
    }

    public final int indexOf(Object obj) {
        Enum enumR;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum enumR2 = (Enum) obj;
        j.e(enumR2, "element");
        int ordinal = enumR2.ordinal();
        Enum[] enumArr = this.f11265a;
        j.e(enumArr, "<this>");
        if (ordinal < 0 || ordinal >= enumArr.length) {
            enumR = null;
        } else {
            enumR = enumArr[ordinal];
        }
        if (enumR == enumR2) {
            return ordinal;
        }
        return -1;
    }

    public final int k() {
        return this.f11265a.length;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum enumR = (Enum) obj;
        j.e(enumR, "element");
        return indexOf(enumR);
    }
}
