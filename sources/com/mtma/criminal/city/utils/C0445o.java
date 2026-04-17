package com.mtma.criminal.city.utils;

import A2.f;
import B0.l;
import K1.e;
import R2.b;
import X4.d;
import Y4.D;
import android.content.Context;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import b5.k;
import c1.j;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import i1.i;
import i3.C0592h;
import j4.C0626h;
import j4.F0;
import j4.M0;
import k1.C0757b;
import u4.g;

/* renamed from: com.mtma.criminal.city.utils.o  reason: case insensitive filesystem */
public final /* synthetic */ class C0445o implements r0, C0757b, J, p0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7450a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7451b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7452c;

    public /* synthetic */ C0445o(Object obj, int i2, Object obj2) {
        this.f7451b = obj;
        this.f7450a = i2;
        this.f7452c = obj2;
    }

    public void a(boolean z3, boolean z4) {
        Context context;
        MyApplication myApplication;
        int i2;
        f fVar = (f) ((d) this.f7451b).f4210c;
        if (z3) {
            b.w(false);
            v0.e(((M0) fVar.d).f8919a, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
            b.M0(R.raw.add_new_item);
            String id = o.getAccountObject().getId();
            M0 m02 = (M0) fVar.d;
            String str = m02.d;
            D d = (D) this.f7452c;
            int i5 = d.f4293a;
            int i6 = d.f4298i;
            String str2 = m02.f8922e;
            int i7 = this.f7450a;
            c.k0(id, new k(9, str, str2, i5, i6, i7));
            c.k0(m02.d, new k(10, o.getAccountObject().getId(), o.getMainStatesObject().getNickName(), d.f4293a, d.f4298i, i7));
            Q.b(90, o.getAccountObject().getId(), (long) 1);
            return;
        }
        b.w(false);
        if (!z4) {
            context = ((M0) fVar.d).f8919a;
            myApplication = MyApplication.f7090a;
            i2 = R.string.no_enough_items;
        } else {
            context = ((M0) fVar.d).f8919a;
            myApplication = MyApplication.f7090a;
            i2 = R.string.unknown_error_try_again;
        }
        a.n(myApplication, i2, context, (String) null);
    }

    public Object b() {
        ((i) this.f7451b).d.a((j) this.f7452c, this.f7450a + 1, false);
        return null;
    }

    public void h(boolean z3, d5.k kVar) {
        f fVar = (f) ((l) this.f7451b).f247c;
        if (z3) {
            I l6 = ((MainActivity) ((C0626h) fVar.d).f9018b).l();
            C0269a b6 = o3.d.b(l6, l6);
            C0626h hVar = (C0626h) fVar.d;
            b6.f(R.id.activity_main_body_frame_layout, new g((MainActivity) hVar.f9018b, ((Y4.i) this.f7452c).f4366a), (String) null, 1);
            a.j(b6, false);
            hVar.f9019c = false;
            return;
        }
        b.w(false);
        if (kVar.getPowerCurrent() < this.f7450a) {
            c.p((MainActivity) ((C0626h) fVar.d).f9018b, 2001);
        } else {
            a.p(MyApplication.f7090a, R.string.unknown_error_try_again, (MainActivity) ((C0626h) fVar.d).f9018b, (String) null);
        }
        ((C0626h) fVar.d).f9019c = false;
    }

    public void j(long j6) {
        boolean l02 = I1.b.l0(1, j6);
        C0447q qVar = (C0447q) this.f7452c;
        String str = (String) this.f7451b;
        int i2 = this.f7450a;
        if (l02) {
            a.x(C0592h.d().e(), "activitiesTempData").E(I1.b.y(1)).E(str).H(new C0450u(com.bumptech.glide.d.x0("activity_" + null + "_startTimeInMilli"), com.bumptech.glide.d.Y(1), qVar, str, i2));
            return;
        }
        e.r0(str, i2, qVar);
    }

    public void o(int i2) {
        M0 m02 = (M0) this.f7451b;
        m02.getClass();
        int i5 = this.f7450a;
        if (i2 < i5) {
            b.w(false);
            c.s0(m02.f8919a, MyApplication.f7090a.getApplicationContext().getString(R.string.no_enough_space_in_bag), (String) null);
            return;
        }
        D d = (D) this.f7452c;
        android.support.v4.media.session.a.y0(d.f4293a, d.f4294b, d.f4298i, i5, true, new F0(m02, i5));
    }

    public /* synthetic */ C0445o(Object obj, Object obj2, int i2) {
        this.f7451b = obj;
        this.f7452c = obj2;
        this.f7450a = i2;
    }
}
