package C0;

import H3.f;
import U0.o;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class i implements b {

    /* renamed from: s  reason: collision with root package name */
    public static final Bitmap.Config f412s = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final m f413a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f414b;

    /* renamed from: c  reason: collision with root package name */
    public final f f415c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public long f416e;

    /* renamed from: f  reason: collision with root package name */
    public int f417f;

    /* renamed from: p  reason: collision with root package name */
    public int f418p;

    /* renamed from: q  reason: collision with root package name */
    public int f419q;

    /* renamed from: r  reason: collision with root package name */
    public int f420r;

    public i(long j6) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i2 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j6;
        this.f413a = mVar;
        this.f414b = unmodifiableSet;
        this.f415c = new f(4);
    }

    public final void a() {
        Log.v("LruBitmapPool", "Hits=" + this.f417f + ", misses=" + this.f418p + ", puts=" + this.f419q + ", evictions=" + this.f420r + ", currentSize=" + this.f416e + ", maxSize=" + this.d + "\nStrategy=" + this.f413a);
    }

    public final synchronized Bitmap b(int i2, int i5, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap b6;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (config == Bitmap.Config.HARDWARE) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            m mVar = this.f413a;
            if (config != null) {
                config2 = config;
            } else {
                config2 = f412s;
            }
            b6 = mVar.b(i2, i5, config2);
            if (b6 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder("Missing bitmap=");
                    this.f413a.getClass();
                    sb.append(m.c(o.d(config) * i2 * i5, config));
                    Log.d("LruBitmapPool", sb.toString());
                }
                this.f418p++;
            } else {
                this.f417f++;
                long j6 = this.f416e;
                this.f413a.getClass();
                this.f416e = j6 - ((long) o.c(b6));
                this.f415c.getClass();
                b6.setHasAlpha(true);
                b6.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb2 = new StringBuilder("Get bitmap=");
                this.f413a.getClass();
                sb2.append(m.c(o.d(config) * i2 * i5, config));
                Log.v("LruBitmapPool", sb2.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b6;
    }

    public final Bitmap c(int i2, int i5, Bitmap.Config config) {
        Bitmap b6 = b(i2, i5, config);
        if (b6 != null) {
            return b6;
        }
        if (config == null) {
            config = f412s;
        }
        return Bitmap.createBitmap(i2, i5, config);
    }

    public final Bitmap d(int i2, int i5, Bitmap.Config config) {
        Bitmap b6 = b(i2, i5, config);
        if (b6 != null) {
            b6.eraseColor(0);
            return b6;
        }
        if (config == null) {
            config = f412s;
        }
        return Bitmap.createBitmap(i2, i5, config);
    }

    public final synchronized void e(long j6) {
        while (this.f416e > j6) {
            try {
                m mVar = this.f413a;
                Bitmap bitmap = (Bitmap) mVar.f428b.K();
                if (bitmap != null) {
                    mVar.a(Integer.valueOf(o.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        a();
                    }
                    this.f416e = 0;
                    return;
                }
                this.f415c.getClass();
                long j7 = this.f416e;
                this.f413a.getClass();
                this.f416e = j7 - ((long) o.c(bitmap));
                this.f420r++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.f413a.getClass();
                    sb.append(m.c(o.c(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    a();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final synchronized void f(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        this.f413a.getClass();
                        if (((long) o.c(bitmap)) <= this.d) {
                            if (this.f414b.contains(bitmap.getConfig())) {
                                this.f413a.getClass();
                                int c3 = o.c(bitmap);
                                this.f413a.e(bitmap);
                                this.f415c.getClass();
                                this.f419q++;
                                this.f416e += (long) c3;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    StringBuilder sb = new StringBuilder("Put bitmap in pool=");
                                    this.f413a.getClass();
                                    sb.append(m.c(o.c(bitmap), bitmap.getConfig()));
                                    Log.v("LruBitmapPool", sb.toString());
                                }
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    a();
                                }
                                e(this.d);
                                return;
                            }
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                        this.f413a.getClass();
                        sb2.append(m.c(o.c(bitmap), bitmap.getConfig()));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f414b.contains(bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public final void h(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i2);
        }
        if (i2 >= 40 || i2 >= 20) {
            l();
        } else if (i2 >= 20 || i2 == 15) {
            e(this.d / 2);
        }
    }

    public final void l() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        e(0);
    }
}
