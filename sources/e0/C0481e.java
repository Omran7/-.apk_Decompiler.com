package e0;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
import x1.d;

/* renamed from: e0.e  reason: case insensitive filesystem */
public final class C0481e extends Handler {
    public final void handleMessage(Message message) {
        C0480d dVar = (C0480d) message.obj;
        int i2 = message.what;
        if (i2 == 1) {
            C0477a aVar = dVar.f7567a;
            Object obj = dVar.f7568b[0];
            if (aVar.d.get()) {
                CountDownLatch countDownLatch = aVar.f7562f;
                try {
                    d dVar2 = aVar.f7563p;
                    if (dVar2.h == aVar) {
                        SystemClock.uptimeMillis();
                        dVar2.h = null;
                        dVar2.c();
                    }
                } finally {
                    countDownLatch.countDown();
                }
            } else {
                CountDownLatch countDownLatch2 = aVar.f7562f;
                try {
                    aVar.f7563p.b(aVar, obj);
                } finally {
                    countDownLatch2.countDown();
                }
            }
            aVar.f7560c = 3;
        } else if (i2 == 2) {
            dVar.f7567a.getClass();
        }
    }
}
