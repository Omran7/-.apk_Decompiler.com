package f3;

import B2.a;
import R2.i;
import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.api.internal.C0349c;
import com.google.android.gms.common.api.internal.G;
import com.google.android.gms.internal.p002firebaseauthapi.zze;

/* renamed from: f3.r  reason: case insensitive filesystem */
public final class C0541r {

    /* renamed from: a  reason: collision with root package name */
    public volatile int f7953a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final C0531h f7954b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f7955c = false;

    /* JADX WARNING: type inference failed for: r1v0, types: [f3.h, java.lang.Object] */
    public C0541r(i iVar) {
        iVar.b();
        Context context = iVar.f2490a;
        ? obj = new Object();
        C0531h.f7938f.e("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        obj.d = new zze(handlerThread.getLooper());
        iVar.b();
        obj.f7942e = new a(obj, iVar.f2491b);
        obj.f7941c = 300000;
        this.f7954b = obj;
        C0349c.b((Application) context.getApplicationContext());
        C0349c.f6081e.a(new G(this, 1));
    }
}
