package h3;

import B.m;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: h3.a  reason: case insensitive filesystem */
public final class C0557a implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadFactory f8116e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f8117a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public final String f8118b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8119c;
    public final StrictMode.ThreadPolicy d;

    public C0557a(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        this.f8118b = str;
        this.f8119c = i2;
        this.d = threadPolicy;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = f8116e.newThread(new m(this, runnable, 12));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f8117a.getAndIncrement();
        newThread.setName(this.f8118b + " Thread #" + andIncrement);
        return newThread;
    }
}
