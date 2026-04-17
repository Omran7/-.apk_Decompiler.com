package com.mtma.criminal.city.utils;

import J.a;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final /* synthetic */ class W implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7380a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f7381b;

    public /* synthetic */ W(a aVar, int i2) {
        this.f7380a = i2;
        this.f7381b = aVar;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, java.util.concurrent.Callable] */
    public final void run() {
        boolean z3;
        switch (this.f7380a) {
            case 0:
                boolean k02 = android.support.v4.media.session.a.k0();
                a aVar = this.f7381b;
                if (!k02) {
                    new Handler(Looper.getMainLooper()).post(new W(aVar, 1));
                    return;
                }
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                try {
                    z3 = ((Boolean) newSingleThreadExecutor.submit(new Object()).get()).booleanValue();
                } catch (Exception unused) {
                    z3 = false;
                }
                newSingleThreadExecutor.shutdown();
                new Handler(Looper.getMainLooper()).post(new X(aVar, z3));
                return;
            default:
                this.f7381b.accept(Boolean.FALSE);
                return;
        }
    }
}
