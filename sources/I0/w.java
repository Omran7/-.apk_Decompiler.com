package I0;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public final class w {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f1138e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f1139f;
    public static final File g = new File("/proc/self/fd");
    public static volatile w h;

    /* renamed from: a  reason: collision with root package name */
    public final int f1140a = 20000;

    /* renamed from: b  reason: collision with root package name */
    public int f1141b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1142c = true;
    public final AtomicBoolean d = new AtomicBoolean(false);

    static {
        boolean z3;
        int i2 = Build.VERSION.SDK_INT;
        boolean z4 = false;
        if (i2 < 29) {
            z3 = true;
        } else {
            z3 = false;
        }
        f1138e = z3;
        if (i2 >= 28) {
            z4 = true;
        }
        f1139f = z4;
    }

    public static w a() {
        if (h == null) {
            synchronized (w.class) {
                try {
                    if (h == null) {
                        h = new w();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            for (String startsWith : Arrays.asList(new String[]{"GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013"})) {
                if (Build.MODEL.startsWith(startsWith)) {
                    return 500;
                }
            }
        }
        return this.f1140a;
    }

    public final boolean c(int i2, int i5, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        if (!z3) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!f1139f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else if (f1138e && !this.d.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        } else if (z4) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else if (i2 < 0 || i5 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        } else {
            synchronized (this) {
                try {
                    int i6 = this.f1141b + 1;
                    this.f1141b = i6;
                    if (i6 >= 50) {
                        this.f1141b = 0;
                        int length = g.list().length;
                        long b6 = (long) b();
                        if (((long) length) < b6) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        this.f1142c = z6;
                        if (!z6 && Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + b6);
                        }
                    }
                    z5 = this.f1142c;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (z5) {
                return true;
            }
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
            }
            return false;
        }
    }
}
