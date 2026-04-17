package com.mtma.criminal.city.utils;

import B0.H;
import R2.b;
import d5.C0475h;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0595k;
import i3.p;
import j4.p0;

/* renamed from: com.mtma.criminal.city.utils.z  reason: case insensitive filesystem */
public final class C0455z implements p {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7488a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7489b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7490c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f7491e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p0 f7492f;

    public C0455z(int i2, int i5, int i6, int i7, p0 p0Var) {
        this.f7489b = i2;
        this.f7490c = i5;
        this.d = i6;
        this.f7491e = i7;
        this.f7492f = p0Var;
    }

    public final H f(C0595k kVar) {
        C0475h hVar = (C0475h) kVar.c(C0475h.class);
        if (hVar == null) {
            return b.W0(kVar);
        }
        int i2 = this.f7489b;
        int i5 = this.f7490c;
        int i6 = this.d;
        int i7 = this.f7491e;
        if (I1.b.s0(hVar, i2, i5, i6, i7)) {
            this.f7488a = true;
            return b.a();
        }
        if (i2 > 0) {
            hVar.setStrength(I1.b.i0(1, i2, hVar.getSelectedGymLesson()) + hVar.getStrength());
        }
        if (i5 > 0) {
            hVar.setDefense(I1.b.i0(2, i5, hVar.getSelectedGymLesson()) + hVar.getDefense());
        }
        if (i6 > 0) {
            hVar.setSpeed(I1.b.i0(3, i6, hVar.getSelectedGymLesson()) + hVar.getSpeed());
        }
        if (i7 > 0) {
            hVar.setDexterity(I1.b.i0(4, i7, hVar.getSelectedGymLesson()) + hVar.getDexterity());
        }
        if (hVar.getGymLessonsProgressList().get(hVar.getSelectedGymLesson()).intValue() < I1.b.a0(hVar.getSelectedGymLesson()).intValue()) {
            int i8 = i2 + i5 + i6 + i7;
            hVar.getGymLessonsProgressList().set(hVar.getSelectedGymLesson(), Integer.valueOf(hVar.getGymLessonsProgressList().get(hVar.getSelectedGymLesson()).intValue() + i8));
        }
        kVar.d(hVar);
        return b.W0(kVar);
    }

    public final void l(C0588d dVar, boolean z3, C0587c cVar) {
        C0475h hVar = new C0475h(o.getGymObject().getStrength(), o.getGymObject().getDefense(), o.getGymObject().getSpeed(), o.getGymObject().getDexterity());
        C0475h hVar2 = (C0475h) cVar.f(C0475h.class);
        p0 p0Var = this.f7492f;
        if (dVar != null || !z3 || !cVar.b()) {
            p0Var.L(false, this.f7488a, hVar, hVar2);
            return;
        }
        o.setGymObject(hVar2);
        p0Var.L(true, this.f7488a, hVar, hVar2);
        int i2 = this.f7489b;
        if (i2 > 0) {
            Q.b(95, o.getAccountObject().getId(), (long) i2);
        }
        int i5 = this.f7490c;
        if (i5 > 0) {
            Q.b(96, o.getAccountObject().getId(), (long) i5);
        }
        int i6 = this.d;
        if (i6 > 0) {
            Q.b(97, o.getAccountObject().getId(), (long) i6);
        }
        int i7 = this.f7491e;
        if (i7 > 0) {
            Q.b(98, o.getAccountObject().getId(), (long) i7);
        }
        Q.b(99, o.getAccountObject().getId(), (long) (hVar2.getDexterity() + hVar2.getSpeed() + hVar2.getDefense() + hVar2.getStrength()));
        long j6 = (long) (i2 + i5 + i6 + i7);
        if (hVar2.getSelectedGymLesson() == 1) {
            Q.b(100, o.getAccountObject().getId(), j6);
        }
        if (hVar2.getSelectedGymLesson() == 2) {
            Q.b(101, o.getAccountObject().getId(), j6);
        }
        if (hVar2.getSelectedGymLesson() == 3) {
            Q.b(102, o.getAccountObject().getId(), j6);
        }
        if (hVar2.getSelectedGymLesson() == 4) {
            Q.b(103, o.getAccountObject().getId(), j6);
        }
    }
}
