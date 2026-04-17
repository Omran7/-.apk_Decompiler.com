package y2;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

public final /* synthetic */ class B implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1113d f12681a;

    public /* synthetic */ B(C1113d dVar) {
        this.f12681a = dVar;
    }

    public final void binderDied() {
        C1113d dVar = this.f12681a;
        dVar.f12693b.b("reportBinderDeath", new Object[0]);
        if (dVar.f12698j.get() == null) {
            dVar.f12693b.b("%s : Binder has died.", dVar.f12694c);
            Iterator it2 = dVar.d.iterator();
            while (it2.hasNext()) {
                ((C1109A) it2.next()).a(new RemoteException(String.valueOf(dVar.f12694c).concat(" : Binder has died.")));
            }
            dVar.d.clear();
            synchronized (dVar.f12696f) {
                dVar.e();
            }
            return;
        }
        throw new ClassCastException();
    }
}
