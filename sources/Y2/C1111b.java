package y2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import w0.C1067n;

/* renamed from: y2.b  reason: case insensitive filesystem */
public final class C1111b extends C1109A {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ IBinder f12687p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C1067n f12688q;

    public C1111b(C1067n nVar, IBinder iBinder) {
        this.f12688q = nVar;
        this.f12687p = iBinder;
    }

    public final void b() {
        C1067n nVar = this.f12688q;
        C1113d dVar = (C1113d) nVar.f12386b;
        dVar.f12702n = (IInterface) ((C1113d) nVar.f12386b).f12697i.a(this.f12687p);
        z zVar = dVar.f12693b;
        zVar.b("linkToDeath", new Object[0]);
        try {
            dVar.f12702n.asBinder().linkToDeath(dVar.f12699k, 0);
        } catch (RemoteException e6) {
            zVar.a(e6, "linkToDeath failed", new Object[0]);
        }
        dVar.g = false;
        Iterator it2 = dVar.d.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        dVar.d.clear();
    }
}
