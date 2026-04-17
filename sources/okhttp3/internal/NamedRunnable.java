package okhttp3.internal;

import java.util.Locale;

public abstract class NamedRunnable implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final String f10682a;

    public NamedRunnable(String str, Object... objArr) {
        byte[] bArr = Util.f10683a;
        this.f10682a = String.format(Locale.US, str, objArr);
    }

    public abstract void a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f10682a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
