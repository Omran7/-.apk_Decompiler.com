package j0;

import G.f;
import G5.C0040l;
import G5.F;
import R2.b;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.internal.j;
import m5.C0849h;
import o5.d;
import p5.a;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public final MeasurementManager f8794a;

    public e(MeasurementManager measurementManager) {
        j.e(measurementManager, "mMeasurementManager");
        this.f8794a = measurementManager;
    }

    public static Object b(e eVar, C0604a aVar, d dVar) {
        new C0040l(1, b.h0(dVar)).s();
        MeasurementManager measurementManager = eVar.f8794a;
        throw null;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, j0.c] */
    public static Object d(e eVar, d dVar) {
        C0040l lVar = new C0040l(1, b.h0(dVar));
        lVar.s();
        eVar.f8794a.getMeasurementApiStatus(new Object(), new f(lVar));
        Object r6 = lVar.r();
        a aVar = a.f11033a;
        return r6;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, j0.c] */
    public static Object g(e eVar, Uri uri, InputEvent inputEvent, d dVar) {
        C0040l lVar = new C0040l(1, b.h0(dVar));
        lVar.s();
        eVar.f8794a.registerSource(uri, inputEvent, new Object(), new f(lVar));
        Object r6 = lVar.r();
        if (r6 == a.f11033a) {
            return r6;
        }
        return C0849h.f10203c;
    }

    public static Object h(e eVar, f fVar, d dVar) {
        Object f6 = F.f(new d(eVar, (d) null), dVar);
        if (f6 == a.f11033a) {
            return f6;
        }
        return C0849h.f10203c;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, j0.c] */
    public static Object j(e eVar, Uri uri, d dVar) {
        C0040l lVar = new C0040l(1, b.h0(dVar));
        lVar.s();
        eVar.f8794a.registerTrigger(uri, new Object(), new f(lVar));
        Object r6 = lVar.r();
        if (r6 == a.f11033a) {
            return r6;
        }
        return C0849h.f10203c;
    }

    public static Object l(e eVar, g gVar, d dVar) {
        new C0040l(1, b.h0(dVar)).s();
        MeasurementManager measurementManager = eVar.f8794a;
        throw null;
    }

    public static Object n(e eVar, h hVar, d dVar) {
        new C0040l(1, b.h0(dVar)).s();
        MeasurementManager measurementManager = eVar.f8794a;
        throw null;
    }

    public Object a(C0604a aVar, d dVar) {
        return b(this, aVar, dVar);
    }

    public Object c(d dVar) {
        return d(this, dVar);
    }

    public Object e(Uri uri, InputEvent inputEvent, d dVar) {
        return g(this, uri, inputEvent, dVar);
    }

    public Object f(f fVar, d dVar) {
        return h(this, fVar, dVar);
    }

    public Object i(Uri uri, d dVar) {
        return j(this, uri, dVar);
    }

    public Object k(g gVar, d dVar) {
        return l(this, gVar, dVar);
    }

    public Object m(h hVar, d dVar) {
        return n(this, hVar, dVar);
    }
}
