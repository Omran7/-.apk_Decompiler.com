package com.mtma.criminal.city.activities;

import h0.C0552a;
import i3.C0587c;
import i3.C0588d;
import i3.q;
import java.util.Map;

public final class o implements q {
    public final void u(C0587c cVar) {
        try {
            String F = cVar.f8279b.F();
            if (F != null && F.equals("allMedalsDetails")) {
                d5.o.getMedalsObject().setAllMedalsDetails((Map) cVar.e(new MainActivity$3$1(this)));
            }
        } catch (Exception e6) {
            int i2 = MainActivity.L0;
            C0552a.x(e6, "Exception from try-catch block inside MainActivity in addListenerToMedalsDetails method.", "MainActivity");
        }
    }

    public final void B(C0588d dVar) {
    }
}
