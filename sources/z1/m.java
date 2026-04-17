package z1;

import java.io.InputStream;
import java.io.OutputStream;

public abstract class m {
    public static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    public static int b(int i2) {
        int[] iArr = {1, 2, 3};
        int i5 = 0;
        while (i5 < 3) {
            int i6 = iArr[i5];
            int i7 = i6 - 1;
            if (i6 == 0) {
                throw null;
            } else if (i7 == i2) {
                return i6;
            } else {
                i5++;
            }
        }
        return 1;
    }
}
