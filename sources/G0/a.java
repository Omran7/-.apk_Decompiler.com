package G0;

import F0.p;
import F0.q;
import F0.r;
import F0.s;
import U3.c;
import com.bumptech.glide.load.data.k;
import java.util.ArrayDeque;
import z0.h;
import z0.i;

public final class a implements s {

    /* renamed from: b  reason: collision with root package name */
    public static final h f808b = h.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a  reason: collision with root package name */
    public final c f809a;

    public a(c cVar) {
        this.f809a = cVar;
    }

    public final r a(Object obj, int i2, int i5, i iVar) {
        F0.i iVar2 = (F0.i) obj;
        c cVar = this.f809a;
        if (cVar != null) {
            q a6 = q.a(iVar2);
            p pVar = (p) cVar.f3713b;
            Object a7 = pVar.a(a6);
            ArrayDeque arrayDeque = q.f702b;
            synchronized (arrayDeque) {
                arrayDeque.offer(a6);
            }
            F0.i iVar3 = (F0.i) a7;
            if (iVar3 == null) {
                pVar.d(q.a(iVar2), iVar2);
            } else {
                iVar2 = iVar3;
            }
        }
        return new r(iVar2, new k(iVar2, ((Integer) iVar.c(f808b)).intValue()));
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        F0.i iVar = (F0.i) obj;
        return true;
    }
}
