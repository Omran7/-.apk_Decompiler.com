package v5;

import com.bumptech.glide.c;
import java.io.Closeable;

public abstract class a {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            c.a(th, th2);
        }
    }

    public static int b(int i2) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        int i5 = 0;
        while (i5 < 6) {
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
