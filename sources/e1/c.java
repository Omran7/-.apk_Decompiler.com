package E1;

import com.google.android.gms.common.internal.I;

public abstract class c extends b implements A1.c {
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        b bVar = (b) obj;
        for (a next : getFieldMappings().values()) {
            if (isFieldSet(next)) {
                if (!bVar.isFieldSet(next) || !I.j(getFieldValue(next), bVar.getFieldValue(next))) {
                    return false;
                }
            } else if (bVar.isFieldSet(next)) {
                return false;
            }
        }
        return true;
    }

    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int i2 = 0;
        for (a next : getFieldMappings().values()) {
            if (isFieldSet(next)) {
                Object fieldValue = getFieldValue(next);
                I.g(fieldValue);
                i2 = (i2 * 31) + fieldValue.hashCode();
            }
        }
        return i2;
    }

    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
