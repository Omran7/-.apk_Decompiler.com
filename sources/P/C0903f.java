package p;

import android.support.v4.media.session.a;

/* renamed from: p.f  reason: case insensitive filesystem */
public final class C0903f extends a {
    public final boolean d(h hVar, C0901d dVar, C0901d dVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f10960b != dVar) {
                    return false;
                }
                hVar.f10960b = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f10959a != obj) {
                    return false;
                }
                hVar.f10959a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(h hVar, C0904g gVar, C0904g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f10961c != gVar) {
                    return false;
                }
                hVar.f10961c = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r0(C0904g gVar, C0904g gVar2) {
        gVar.f10955b = gVar2;
    }

    public final void s0(C0904g gVar, Thread thread) {
        gVar.f10954a = thread;
    }
}
