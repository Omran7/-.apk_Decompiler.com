package l3;

import R2.b;
import X4.d;
import c1.i;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.storage.o;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;
import n3.C0862c;
import n3.m;
import w3.C1083d;
import w3.C1084e;
import w3.g;

/* renamed from: l3.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0784c implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f9672a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f9673b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f9674c;
    public final /* synthetic */ Task d;

    public /* synthetic */ C0784c(o oVar, long j6, Task task, Task task2) {
        this.f9672a = oVar;
        this.f9673b = j6;
        this.f9674c = task;
        this.d = task2;
    }

    public final void onSuccess(Object obj) {
        boolean z3;
        Void voidR = (Void) obj;
        o oVar = this.f9672a;
        int i2 = (this.f9673b > oVar.f9701A ? 1 : (this.f9673b == oVar.f9701A ? 0 : -1));
        i iVar = oVar.f9726x;
        if (i2 == 0) {
            C0792k kVar = oVar.h;
            C0792k kVar2 = C0792k.f9689b;
            if (kVar == kVar2) {
                iVar.d("Successfully fetched token, opening connection", (Throwable) null, new Object[0]);
                String str = (String) this.f9674c.getResult();
                String str2 = (String) this.d.getResult();
                C0792k kVar3 = oVar.h;
                if (kVar3 == kVar2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                b.g0(z3, "Trying to open network connection while in the wrong state: %s", kVar3);
                if (str == null) {
                    m mVar = oVar.f9706a;
                    mVar.getClass();
                    mVar.q(C0862c.f10261c, Boolean.FALSE);
                }
                oVar.f9718p = str;
                oVar.f9720r = str2;
                oVar.h = C0792k.f9690c;
                o oVar2 = new o(oVar.f9722t, oVar.f9707b, oVar.f9708c, oVar, oVar.f9728z, str2);
                oVar.g = oVar2;
                i iVar2 = (i) oVar2.f6950e;
                if (iVar2.y()) {
                    iVar2.d("Opening a connection", (Throwable) null, new Object[0]);
                }
                t tVar = (t) oVar2.f6949c;
                d dVar = tVar.f9737a;
                C1083d dVar2 = (C1083d) dVar.f4209b;
                try {
                    dVar2.c();
                } catch (C1084e e6) {
                    t tVar2 = (t) dVar.f4210c;
                    boolean y6 = tVar2.f9743j.y();
                    i iVar3 = tVar2.f9743j;
                    if (y6) {
                        iVar3.d("Error connecting", e6, new Object[0]);
                    }
                    dVar2.a();
                    try {
                        g gVar = dVar2.g;
                        if (gVar.g.getState() != Thread.State.NEW) {
                            gVar.g.join();
                        }
                        dVar2.f12430k.join();
                    } catch (InterruptedException e7) {
                        iVar3.g("Interrupted while shutting down websocket threads", e7);
                    }
                }
                tVar.h = tVar.f9742i.schedule(new r(tVar, 0), 30000, TimeUnit.MILLISECONDS);
            } else if (kVar == C0792k.f9688a) {
                iVar.d("Not opening connection after token refresh, because connection was set to disconnected", (Throwable) null, new Object[0]);
            }
        } else {
            iVar.d("Ignoring getToken result, because this was not the latest attempt.", (Throwable) null, new Object[0]);
        }
    }
}
