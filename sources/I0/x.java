package I0;

import java.io.IOException;

public final class x extends IOException {
    public x(String str, int i2, IOException iOException) {
        super(str + ", status code: " + i2, iOException);
    }

    public x(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public x(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
