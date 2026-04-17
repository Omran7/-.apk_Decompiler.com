package androidx.emoji2.text;

import B0.C0009h;
import R2.b;
import S3.z;
import T1.B;
import android.os.Build;
import android.support.v4.media.session.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class e extends b {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ f f4925t;

    public e(f fVar) {
        this.f4925t = fVar;
    }

    public final void o0(Throwable th) {
        ((j) this.f4925t.f4927b).d(th);
    }

    /* JADX INFO: finally extract failed */
    public final void p0(z zVar) {
        Set<int[]> set;
        f fVar = this.f4925t;
        fVar.f4928c = zVar;
        z zVar2 = (z) fVar.f4928c;
        j jVar = (j) fVar.f4927b;
        B b6 = jVar.g;
        d dVar = jVar.f4939i;
        if (Build.VERSION.SDK_INT >= 34) {
            set = l.a();
        } else {
            set = a.J();
        }
        fVar.f4926a = new C0009h(zVar2, b6, dVar, (Set) set);
        j jVar2 = (j) fVar.f4927b;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f4934a.writeLock().lock();
        try {
            jVar2.f4936c = 1;
            arrayList.addAll(jVar2.f4935b);
            jVar2.f4935b.clear();
            jVar2.f4934a.writeLock().unlock();
            jVar2.d.post(new H.a((List) arrayList, jVar2.f4936c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f4934a.writeLock().unlock();
            throw th;
        }
    }
}
