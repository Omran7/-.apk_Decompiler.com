package androidx.emoji2.text;

import B0.H;
import G.g;
import I.e;
import R2.b;
import Y4.h;
import android.graphics.Path;
import android.os.SystemClock;
import android.util.Log;
import androidx.fragment.app.K;
import androidx.lifecycle.O;
import androidx.lifecycle.S;
import androidx.recyclerview.widget.RecyclerView;
import b4.m;
import b5.k;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.manager.l;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.T;
import d0.C0457b;
import d5.C0473f;
import d5.o;
import e1.C0483b;
import i3.C0585a;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0595k;
import i3.p;
import i3.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import k0.C0754c;
import l1.C0780a;
import q3.C0936a;
import t3.C1007a;

public class v implements S, m, C0483b, l, C0585a, q, T, p, C0754c, C0780a, C0936a, C1007a {

    /* renamed from: b  reason: collision with root package name */
    public static v f4967b;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4968a;

    public /* synthetic */ v(int i2) {
        this.f4968a = i2;
    }

    public static Path j(float f6, float f7, float f8, float f9) {
        Path path = new Path();
        path.moveTo(f6, f7);
        path.lineTo(f8, f9);
        return path;
    }

    public O a(Class cls) {
        switch (this.f4968a) {
            case 1:
                return new K(true);
            default:
                return new C0457b();
        }
    }

    public void c(boolean z3) {
        if (z3) {
            c.k0(o.getAccountObject().getId(), new k(2, o.getEstateObject().getId(), -1));
            Q.b(d.z0(o.getEstateObject().getId()), o.getAccountObject().getId(), (long) 1);
        }
    }

    public long e() {
        return System.currentTimeMillis();
    }

    public H f(C0595k kVar) {
        if (kVar.b() == null) {
            kVar.d(1);
            return b.W0(kVar);
        }
        kVar.d(Integer.valueOf(((Integer) kVar.c(Integer.class)).intValue() + 1));
        return b.W0(kVar);
    }

    public long g() {
        return SystemClock.elapsedRealtime();
    }

    public Object get() {
        return new g(Executors.newSingleThreadExecutor(), 3);
    }

    public v3.q h(v3.l lVar, v3.q qVar, boolean z3) {
        return null;
    }

    public void k(C0587c cVar) {
        Long l6;
        try {
            String F = cVar.f8279b.F();
            if (F != null) {
                Class<Long> cls = Long.class;
                if (F.equals("startTimeInMilli")) {
                    Long l7 = (Long) cVar.f(cls);
                    if (l7 != null) {
                        d.a1("activity_null_startTimeInMilli", l7.longValue());
                    }
                } else if (F.equals("endTimeInMilli") && (l6 = (Long) cVar.f(cls)) != null) {
                    d.a1("activity_null_EndTimeInMilli", l6.longValue());
                }
            }
        } catch (Exception e6) {
            int i2 = MainActivity.L0;
            Log.e("MainActivity", "Exception from try-catch inside MainActivity class in addListenerToAccount method.", e6);
        }
    }

    public Object n() {
        switch (this.f4968a) {
            case 2:
                return new LinkedHashSet();
            case 3:
                return new ArrayList();
            case 4:
                return new ConcurrentHashMap();
            default:
                return new LinkedHashMap();
        }
    }

    public boolean o(CharSequence charSequence) {
        return charSequence instanceof e;
    }

    public void q(C0587c cVar) {
        Long l6;
        try {
            String F = cVar.f8279b.F();
            if (F != null) {
                Class<Long> cls = Long.class;
                if (F.equals("startTimeInMilli")) {
                    Long l7 = (Long) cVar.f(cls);
                    if (l7 != null) {
                        d.a1("activity_null_startTimeInMilli", l7.longValue());
                    }
                } else if (F.equals("endTimeInMilli") && (l6 = (Long) cVar.f(cls)) != null) {
                    d.a1("activity_null_EndTimeInMilli", l6.longValue());
                }
            }
        } catch (Exception e6) {
            int i2 = MainActivity.L0;
            Log.e("MainActivity", "Exception from try-catch inside MainActivity class in addListenerToAccount method.", e6);
        }
    }

    public void u(C0587c cVar) {
        if (cVar.g()) {
            C0586b c3 = cVar.c();
            long j6 = 0;
            while (true) {
                Iterator it2 = c3.f8276a;
                if (it2.hasNext()) {
                    v3.q qVar = (v3.q) it2.next();
                    c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                    C0473f fVar = (C0473f) r3.b.c(C0473f.class, v3.m.t(qVar.f12305b).f12296a.getValue());
                    if (fVar != null && a.t(fVar.getEstateOwnerId())) {
                        j6 += ((h) d.m0().get(fVar.getId())).h;
                        ArrayList l02 = d.l0(fVar.getId());
                        int i2 = 0;
                        for (int i5 = 0; i5 < l02.size(); i5++) {
                            if (((Y4.g) l02.get(i5)).g) {
                                if (d.M0(fVar.getServantContractsStartTimeInMilliList().get(i2).longValue(), c.f5744o)) {
                                    j6 += ((Y4.g) l02.get(i5)).f4352e;
                                }
                                i2++;
                            } else if (fVar.getFixedModificationList().get(i5).booleanValue()) {
                                j6 += ((Y4.g) l02.get(i5)).f4352e;
                            }
                        }
                    }
                } else {
                    android.support.v4.media.session.a.C0(2, 3, j6, o.getAccountObject().getId());
                    return;
                }
            }
        }
    }

    public v(RecyclerView recyclerView) {
        this.f4968a = 22;
    }

    public void m() {
    }

    public void B(C0588d dVar) {
    }

    public void i(C0587c cVar) {
    }

    public void d(int i2, Serializable serializable) {
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
    }
}
