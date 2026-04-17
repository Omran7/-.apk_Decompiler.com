package U0;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f3697a = "0123456789abcdef".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f3698b = new char[64];

    /* renamed from: c  reason: collision with root package name */
    public static volatile Handler f3699c;

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static int c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    public static int d(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i2 = n.f3696a[config.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2 || i2 == 3) {
            return 2;
        }
        if (i2 != 4) {
            return 4;
        }
        return 8;
    }

    public static ArrayList e(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (f3699c == null) {
            synchronized (o.class) {
                try {
                    if (f3699c == null) {
                        f3699c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3699c;
    }

    public static int g(int i2, int i5) {
        return (i5 * 31) + i2;
    }

    public static int h(int i2, Object obj) {
        int i5;
        if (obj == null) {
            i5 = 0;
        } else {
            i5 = obj.hashCode();
        }
        return g(i5, i2);
    }

    public static boolean i(int i2, int i5) {
        if ((i2 > 0 || i2 == Integer.MIN_VALUE) && (i5 > 0 || i5 == Integer.MIN_VALUE)) {
            return true;
        }
        return false;
    }

    public static void j(Runnable runnable) {
        f().post(runnable);
    }
}
