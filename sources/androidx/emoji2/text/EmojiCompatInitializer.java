package androidx.emoji2.text;

import D0.e;
import P4.q;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0294e;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.C0309u;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p0.C0905a;
import p0.C0906b;

public class EmojiCompatInitializer implements C0906b {
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.emoji2.text.g, androidx.emoji2.text.p] */
    public final Object b(Context context) {
        Object obj;
        ? gVar = new g((i) new e(context));
        gVar.f4929a = 1;
        if (j.f4933k == null) {
            synchronized (j.f4932j) {
                try {
                    if (j.f4933k == null) {
                        j.f4933k = new j(gVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0905a c3 = C0905a.c(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        c3.getClass();
        synchronized (C0905a.f10968e) {
            try {
                obj = c3.f10969a.get(cls);
                if (obj == null) {
                    obj = c3.b(cls, new HashSet());
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        final C0309u h = ((C0307s) obj).h();
        h.a(new C0294e() {
            public final void c() {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new q(2), 500);
                h.f(this);
            }
        });
        return Boolean.TRUE;
    }
}
