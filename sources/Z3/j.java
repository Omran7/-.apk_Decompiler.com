package Z3;

import b4.h;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public final class j extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Serializable f4529a;

    public j(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f4529a = bool;
    }

    public static boolean v(j jVar) {
        Serializable serializable = jVar.f4529a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        Serializable serializable = this.f4529a;
        Serializable serializable2 = jVar.f4529a;
        if (serializable == null) {
            if (serializable2 == null) {
                return true;
            }
            return false;
        } else if (!v(this) || !v(jVar)) {
            if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
                return serializable.equals(serializable2);
            }
            double doubleValue = k().doubleValue();
            double doubleValue2 = jVar.k().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (k().longValue() == jVar.k().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f4529a;
        if (serializable == null) {
            return 31;
        }
        if (v(this)) {
            doubleToLongBits = k().longValue();
        } else if (!(serializable instanceof Number)) {
            return serializable.hashCode();
        } else {
            doubleToLongBits = Double.doubleToLongBits(k().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final Number k() {
        Serializable serializable = this.f4529a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final String t() {
        Serializable serializable = this.f4529a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return k().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public j(Number number) {
        Objects.requireNonNull(number);
        this.f4529a = number;
    }

    public j(String str) {
        Objects.requireNonNull(str);
        this.f4529a = str;
    }
}
