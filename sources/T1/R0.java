package T1;

import android.os.Bundle;
import com.google.android.gms.common.internal.I;
import java.util.Iterator;
import java.util.TreeSet;

public final /* synthetic */ class R0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3025a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f3026b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0157b1 f3027c;

    public /* synthetic */ R0(C0157b1 b1Var, Bundle bundle, int i2) {
        this.f3025a = i2;
        this.f3027c = b1Var;
        this.f3026b = bundle;
    }

    public final void run() {
        Bundle bundle;
        int i2;
        switch (this.f3025a) {
            case 0:
                Bundle bundle2 = this.f3026b;
                boolean isEmpty = bundle2.isEmpty();
                C0157b1 b1Var = this.f3027c;
                if (isEmpty) {
                    bundle = bundle2;
                } else {
                    C0212u0 u0Var = (C0212u0) b1Var.f398a;
                    C0174h0 h0Var = u0Var.f3495q;
                    C0212u0.i(h0Var);
                    bundle = new Bundle(h0Var.f3318I.J());
                    Iterator<String> it2 = bundle2.keySet().iterator();
                    while (true) {
                        boolean hasNext = it2.hasNext();
                        A a6 = b1Var.F;
                        C0170g gVar = u0Var.f3494p;
                        Z z3 = u0Var.f3496r;
                        Y1 y12 = u0Var.f3499u;
                        if (hasNext) {
                            String next = it2.next();
                            Object obj = bundle2.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                C0212u0.i(y12);
                                if (Y1.f0(obj)) {
                                    Y1.I(a6, (String) null, 27, (String) null, (String) null, 0);
                                }
                                C0212u0.k(z3);
                                z3.f3177t.c("Invalid default event parameter type. Name, value", next, obj);
                            } else if (Y1.i0(next)) {
                                C0212u0.k(z3);
                                z3.f3177t.b(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                bundle.remove(next);
                            } else {
                                C0212u0.i(y12);
                                gVar.getClass();
                                if (y12.a0(500, obj, "param", next)) {
                                    y12.J(bundle, next, obj);
                                }
                            }
                        } else {
                            C0212u0.i(y12);
                            Y1 y13 = ((C0212u0) gVar.f398a).f3499u;
                            C0212u0.i(y13);
                            if (y13.h0(201500000)) {
                                i2 = 100;
                            } else {
                                i2 = 25;
                            }
                            if (bundle.size() > i2) {
                                Iterator it3 = new TreeSet(bundle.keySet()).iterator();
                                int i5 = 0;
                                while (it3.hasNext()) {
                                    String str = (String) it3.next();
                                    i5++;
                                    if (i5 > i2) {
                                        bundle.remove(str);
                                    }
                                }
                                C0212u0.i(y12);
                                Y1.I(a6, (String) null, 26, (String) null, (String) null, 0);
                                C0212u0.k(z3);
                                z3.f3177t.a("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                        }
                    }
                }
                C0212u0 u0Var2 = (C0212u0) b1Var.f398a;
                C0174h0 h0Var2 = u0Var2.f3495q;
                C0212u0.i(h0Var2);
                h0Var2.f3318I.N(bundle);
                if (bundle2.isEmpty()) {
                    if (!u0Var2.f3494p.B((String) null, H.f2902d1)) {
                        return;
                    }
                }
                ((C0212u0) b1Var.f398a).r().x(bundle);
                return;
            case 1:
                C0157b1 b1Var2 = this.f3027c;
                b1Var2.o();
                b1Var2.p();
                Bundle bundle3 = this.f3026b;
                String string = bundle3.getString("name");
                String string2 = bundle3.getString("origin");
                I.d(string);
                I.d(string2);
                I.g(bundle3.get("value"));
                C0212u0 u0Var3 = (C0212u0) b1Var2.f398a;
                if (!u0Var3.a()) {
                    Z z4 = u0Var3.f3496r;
                    C0212u0.k(z4);
                    z4.f3180w.a("Conditional property not set since app measurement is disabled");
                    return;
                }
                W1 w12 = new W1(bundle3.getLong("triggered_timestamp"), bundle3.get("value"), string, string2);
                try {
                    Y1 y14 = u0Var3.f3499u;
                    C0212u0.i(y14);
                    bundle3.getString("app_id");
                    C0214v u6 = y14.u(bundle3.getString("triggered_event_name"), bundle3.getBundle("triggered_event_params"), string2, 0, true);
                    C0212u0.i(y14);
                    bundle3.getString("app_id");
                    C0214v u7 = y14.u(bundle3.getString("timed_out_event_name"), bundle3.getBundle("timed_out_event_params"), string2, 0, true);
                    bundle3.getString("app_id");
                    C0214v u8 = y14.u(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), string2, 0, true);
                    String str2 = string2;
                    W1 w13 = w12;
                    u0Var3.r().w(new C0164e(bundle3.getString("app_id"), str2, w13, bundle3.getLong("creation_timestamp"), false, bundle3.getString("trigger_event_name"), u7, bundle3.getLong("trigger_timeout"), u6, bundle3.getLong("time_to_live"), u8));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                C0157b1 b1Var3 = this.f3027c;
                b1Var3.o();
                b1Var3.p();
                Bundle bundle4 = this.f3026b;
                String string3 = bundle4.getString("name");
                I.d(string3);
                C0212u0 u0Var4 = (C0212u0) b1Var3.f398a;
                if (!u0Var4.a()) {
                    Z z5 = u0Var4.f3496r;
                    C0212u0.k(z5);
                    z5.f3180w.a("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                W1 w14 = new W1(0, (Object) null, string3, "");
                try {
                    Y1 y15 = u0Var4.f3499u;
                    C0212u0.i(y15);
                    bundle4.getString("app_id");
                    C0164e eVar = r4;
                    C0164e eVar2 = new C0164e(bundle4.getString("app_id"), "", w14, bundle4.getLong("creation_timestamp"), bundle4.getBoolean("active"), bundle4.getString("trigger_event_name"), (C0214v) null, bundle4.getLong("trigger_timeout"), (C0214v) null, bundle4.getLong("time_to_live"), y15.u(bundle4.getString("expired_event_name"), bundle4.getBundle("expired_event_params"), "", bundle4.getLong("creation_timestamp"), true));
                    u0Var4.r().w(eVar);
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
        }
    }
}
