package i0;

import B2.b;
import G5.F;
import G5.N;
import android.net.Uri;
import android.view.InputEvent;
import j0.C0604a;
import j0.e;
import j0.f;
import j0.g;
import j0.h;
import kotlin.jvm.internal.j;
import o5.d;

/* renamed from: i0.d  reason: case insensitive filesystem */
public final class C0581d {

    /* renamed from: a  reason: collision with root package name */
    public final e f8246a;

    public C0581d(e eVar) {
        this.f8246a = eVar;
    }

    public b a(C0604a aVar) {
        j.e(aVar, "deletionRequest");
        throw null;
    }

    public b b() {
        return I1.b.j(F.c(F.b(N.f877a), new C0578a(this, (d) null)));
    }

    public b c(Uri uri, InputEvent inputEvent) {
        j.e(uri, "attributionSource");
        return I1.b.j(F.c(F.b(N.f877a), new C0579b(this, uri, inputEvent, (d) null)));
    }

    public b d(f fVar) {
        j.e(fVar, "request");
        throw null;
    }

    public b e(Uri uri) {
        j.e(uri, "trigger");
        return I1.b.j(F.c(F.b(N.f877a), new C0580c(this, uri, (d) null)));
    }

    public b f(g gVar) {
        j.e(gVar, "request");
        throw null;
    }

    public b g(h hVar) {
        j.e(hVar, "request");
        throw null;
    }
}
