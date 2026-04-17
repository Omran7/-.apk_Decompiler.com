package M0;

import B0.p;
import C0.b;
import H0.c;
import Q0.a;
import U0.g;
import U0.o;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.e;
import com.bumptech.glide.j;
import com.bumptech.glide.l;
import java.util.ArrayList;
import y0.C1107a;
import y0.d;
import z0.m;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final d f1801a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f1802b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1803c = new ArrayList();
    public final l d;

    /* renamed from: e  reason: collision with root package name */
    public final b f1804e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1805f;
    public boolean g;
    public j h;

    /* renamed from: i  reason: collision with root package name */
    public e f1806i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1807j;

    /* renamed from: k  reason: collision with root package name */
    public e f1808k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f1809l;

    /* renamed from: m  reason: collision with root package name */
    public e f1810m;

    /* renamed from: n  reason: collision with root package name */
    public int f1811n;

    /* renamed from: o  reason: collision with root package name */
    public int f1812o;

    /* renamed from: p  reason: collision with root package name */
    public int f1813p;

    public h(com.bumptech.glide.b bVar, d dVar, int i2, int i5, Bitmap bitmap) {
        c cVar = c.f992b;
        b bVar2 = bVar.f5727a;
        e eVar = bVar.f5729c;
        l c3 = com.bumptech.glide.b.c(eVar.getBaseContext());
        j v6 = com.bumptech.glide.b.c(eVar.getBaseContext()).l().a(((Q0.e) ((Q0.e) ((Q0.e) new a().d(p.f284b)).t()).q()).i(i2, i5));
        this.d = c3;
        Handler handler = new Handler(Looper.getMainLooper(), new g(this, 0));
        this.f1804e = bVar2;
        this.f1802b = handler;
        this.h = v6;
        this.f1801a = dVar;
        c(cVar, bitmap);
    }

    public final void a() {
        int i2;
        int i5;
        if (this.f1805f && !this.g) {
            e eVar = this.f1810m;
            if (eVar != null) {
                this.f1810m = null;
                b(eVar);
                return;
            }
            this.g = true;
            d dVar = this.f1801a;
            y0.b bVar = dVar.f12639l;
            int i6 = bVar.f12622c;
            if (i6 <= 0 || (i5 = dVar.f12638k) < 0) {
                i2 = 0;
            } else if (i5 < 0 || i5 >= i6) {
                i2 = -1;
            } else {
                i2 = ((C1107a) bVar.f12623e.get(i5)).f12617i;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) i2);
            int i7 = (dVar.f12638k + 1) % dVar.f12639l.f12622c;
            dVar.f12638k = i7;
            this.f1808k = new e(this.f1802b, i7, uptimeMillis);
            j C6 = this.h.a((Q0.e) new a().o(new T0.b(Double.valueOf(Math.random())))).C(dVar);
            C6.z(this.f1808k, C6);
        }
    }

    public final void b(e eVar) {
        int i2;
        this.g = false;
        boolean z3 = this.f1807j;
        Handler handler = this.f1802b;
        if (z3) {
            handler.obtainMessage(2, eVar).sendToTarget();
        } else if (!this.f1805f) {
            this.f1810m = eVar;
        } else {
            if (eVar.f1798p != null) {
                Bitmap bitmap = this.f1809l;
                if (bitmap != null) {
                    this.f1804e.f(bitmap);
                    this.f1809l = null;
                }
                e eVar2 = this.f1806i;
                this.f1806i = eVar;
                ArrayList arrayList = this.f1803c;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) ((f) arrayList.get(size));
                    Drawable.Callback callback = cVar.getCallback();
                    while (callback instanceof Drawable) {
                        callback = ((Drawable) callback).getCallback();
                    }
                    if (callback == null) {
                        cVar.stop();
                        cVar.invalidateSelf();
                    } else {
                        cVar.invalidateSelf();
                        h hVar = (h) cVar.f1783a.f1782b;
                        e eVar3 = hVar.f1806i;
                        if (eVar3 != null) {
                            i2 = eVar3.f1796e;
                        } else {
                            i2 = -1;
                        }
                        if (i2 == hVar.f1801a.f12639l.f12622c - 1) {
                            cVar.f1787f++;
                        }
                        int i5 = cVar.f1788p;
                        if (i5 != -1 && cVar.f1787f >= i5) {
                            cVar.stop();
                        }
                    }
                }
                if (eVar2 != null) {
                    handler.obtainMessage(2, eVar2).sendToTarget();
                }
            }
            a();
        }
    }

    public final void c(m mVar, Bitmap bitmap) {
        g.c(mVar, "Argument must not be null");
        g.c(bitmap, "Argument must not be null");
        this.f1809l = bitmap;
        this.h = this.h.a(new a().s(mVar, true));
        this.f1811n = o.c(bitmap);
        this.f1812o = bitmap.getWidth();
        this.f1813p = bitmap.getHeight();
    }
}
