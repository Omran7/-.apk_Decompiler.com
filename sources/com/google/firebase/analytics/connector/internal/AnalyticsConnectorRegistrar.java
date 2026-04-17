package com.google.firebase.analytics.connector.internal;

import E3.c;
import R2.i;
import T1.B;
import T1.C;
import T2.a;
import T2.b;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzff;
import com.google.firebase.components.ComponentRegistrar;
import g3.C0548a;
import g3.C0549b;
import g3.C0550c;
import g3.h;
import g3.j;
import java.util.Arrays;
import java.util.List;

public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(C0550c cVar) {
        boolean z3;
        i iVar = (i) cVar.a(i.class);
        Context context = (Context) cVar.a(Context.class);
        c cVar2 = (c) cVar.a(c.class);
        I.g(iVar);
        I.g(context);
        I.g(cVar2);
        I.g(context.getApplicationContext());
        if (b.f3557b == null) {
            synchronized (b.class) {
                if (b.f3557b == null) {
                    Bundle bundle = new Bundle(1);
                    iVar.b();
                    if ("[DEFAULT]".equals(iVar.f2491b)) {
                        ((j) cVar2).a(new T2.c(0), new C(21));
                        iVar.b();
                        P3.a aVar = (P3.a) iVar.g.get();
                        synchronized (aVar) {
                            z3 = aVar.f2183a;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z3);
                    }
                    b.f3557b = new b(zzff.zzg(context, (String) null, (String) null, (String) null, bundle).zzd());
                }
            }
        }
        return b.f3557b;
    }

    public List<C0549b> getComponents() {
        C0548a b6 = C0549b.b(a.class);
        b6.a(h.b(i.class));
        b6.a(h.b(Context.class));
        b6.a(h.b(c.class));
        b6.f8012f = new B(23);
        b6.c(2);
        return Arrays.asList(new C0549b[]{b6.b(), android.support.v4.media.session.a.l("fire-analytics", "22.4.0")});
    }
}
