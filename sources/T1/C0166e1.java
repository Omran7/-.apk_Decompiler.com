package T1;

import S3.t;
import android.app.Service;
import android.content.Intent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.measurement.zzdh;
import java.io.IOException;
import java.util.Map;
import k.C0737s0;
import k5.C0773j;
import k5.u;

/* renamed from: T1.e1  reason: case insensitive filesystem */
public final /* synthetic */ class C0166e1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3284a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f3285b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3286c;
    public final Object d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3287e;

    public /* synthetic */ C0166e1(t tVar, int i2, Z z3, Intent intent) {
        this.f3286c = tVar;
        this.f3285b = i2;
        this.d = z3;
        this.f3287e = intent;
    }

    public void a() {
        C0773j jVar = (C0773j) this.f3287e;
        jVar.f9558l0 = -1;
        jVar.removeCallbacks(this);
        jVar.removeCallbacks((C0737s0) this.d);
        jVar.t();
        u uVar = (u) this.f3286c;
        k5.t tVar = uVar.f9645b;
        tVar.f9632b = tVar.f9633c;
        tVar.f9638k = true;
        k5.t tVar2 = uVar.f9646c;
        tVar2.f9632b = tVar2.f9633c;
        tVar2.f9638k = true;
        jVar.overScrollBy(0, 0, 0, 0, 0, 0, 0, 0, false);
    }

    public void b(int i2) {
        int i5;
        if (i2 < 0) {
            i5 = f.API_PRIORITY_OTHER;
        } else {
            i5 = 0;
        }
        int i6 = i5;
        this.f3285b = i6;
        u uVar = (u) this.f3286c;
        uVar.d = null;
        uVar.b(i6, i2, 0, f.API_PRIORITY_OTHER, 0);
        C0773j jVar = (C0773j) this.f3287e;
        jVar.f9558l0 = 4;
        jVar.f9513H.p(this);
    }

    public void c() {
        C0773j jVar = (C0773j) this.f3287e;
        int scrollX = jVar.getScrollX();
        u uVar = (u) this.f3286c;
        uVar.f9644a = 1;
        boolean e6 = uVar.f9645b.e(scrollX);
        boolean e7 = uVar.f9646c.e(0);
        if (e6 || e7) {
            jVar.f9558l0 = 6;
            jVar.invalidate();
            jVar.f9513H.p(this);
            return;
        }
        jVar.f9558l0 = -1;
    }

    public final void run() {
        int i2;
        int i5;
        boolean z3;
        boolean z4;
        switch (this.f3284a) {
            case 0:
                ((C0163d1) ((C0159c0) this.f3286c).f3265e).a(this.f3285b, (IOException) this.d, (byte[]) this.f3287e);
                return;
            case 1:
                Service service = (Service) ((t) this.f3286c).f2700b;
                C0228z1 z1Var = (C0228z1) service;
                int i6 = this.f3285b;
                if (z1Var.b(i6)) {
                    ((Z) this.d).f3180w.b(Integer.valueOf(i6), "Local AppMeasurementService processed last upload request. StartId");
                    Z z5 = C0212u0.q(service, (zzdh) null, (Long) null).f3496r;
                    C0212u0.k(z5);
                    z5.f3180w.a("Completed wakeful intent.");
                    z1Var.a((Intent) this.f3287e);
                    return;
                }
                return;
            default:
                C0773j jVar = (C0773j) this.f3287e;
                int i7 = jVar.f9558l0;
                u uVar = (u) this.f3286c;
                boolean z6 = false;
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 6) {
                            a();
                            return;
                        } else if (uVar.a()) {
                            int scrollX = jVar.getScrollX();
                            k5.t tVar = uVar.f9645b;
                            int i8 = tVar.f9632b;
                            if (jVar.overScrollBy(i8 - scrollX, 0, scrollX, 0, 0, 0, jVar.O0, 0, false)) {
                                if (scrollX > 0 || i8 <= 0) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (scrollX >= 0 && i8 < 0) {
                                    z6 = true;
                                }
                                if (z4 || z6) {
                                    int c3 = (int) uVar.c();
                                    if (z6) {
                                        c3 = -c3;
                                    }
                                    tVar.f9632b = tVar.f9633c;
                                    tVar.f9638k = true;
                                    k5.t tVar2 = uVar.f9646c;
                                    tVar2.f9632b = tVar2.f9633c;
                                    tVar2.f9638k = true;
                                    b(c3);
                                    return;
                                }
                                c();
                                return;
                            }
                            jVar.invalidate();
                            jVar.f9513H.p(this);
                            return;
                        } else {
                            a();
                            return;
                        }
                    }
                } else if (uVar.d()) {
                    return;
                }
                if (jVar.f9586s) {
                    jVar.A();
                }
                if (jVar.f9592y == 0 || jVar.getChildCount() == 0) {
                    a();
                    return;
                }
                boolean a6 = uVar.a();
                k5.t tVar3 = uVar.f9645b;
                int i9 = tVar3.f9632b;
                int i10 = this.f3285b - i9;
                if (i10 > 0) {
                    jVar.f9555i0 = jVar.f9578a;
                    jVar.getChildAt(0).getLeft();
                    i2 = Math.min(((jVar.getWidth() - jVar.getPaddingRight()) - jVar.getPaddingLeft()) - 1, i10);
                } else {
                    int childCount = jVar.getChildCount() - 1;
                    jVar.f9555i0 = jVar.f9578a + childCount;
                    jVar.getChildAt(childCount).getLeft();
                    i2 = Math.max(-(((jVar.getWidth() - jVar.getPaddingRight()) - jVar.getPaddingLeft()) - 1), i10);
                }
                View childAt = jVar.getChildAt(jVar.f9555i0 - jVar.f9578a);
                if (childAt != null) {
                    i5 = childAt.getLeft();
                } else {
                    i5 = 0;
                }
                boolean Q5 = jVar.Q(i2, i2);
                if (!Q5 || i2 == 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    if (childAt != null) {
                        jVar.overScrollBy(-(i2 - (childAt.getLeft() - i5)), 0, jVar.getScrollX(), 0, 0, 0, jVar.O0, 0, false);
                    }
                    if (a6) {
                        int scrollX2 = jVar.getScrollX();
                        int i11 = jVar.O0;
                        if (tVar3.f9641n == 0) {
                            tVar3.f9639l = i11;
                            tVar3.g = AnimationUtils.currentAnimationTimeMillis();
                            tVar3.f(scrollX2, 0, 0, (int) tVar3.f9634e);
                        }
                        int overScrollMode = jVar.getOverScrollMode();
                        if (overScrollMode == 0 || (overScrollMode == 1 && !jVar.u())) {
                            jVar.f9558l0 = 6;
                            int c6 = (int) uVar.c();
                            if (i2 > 0) {
                                jVar.f9528P0.d(c6);
                            } else {
                                jVar.f9530Q0.d(c6);
                            }
                        } else {
                            jVar.f9558l0 = -1;
                        }
                        jVar.invalidate();
                        jVar.f9513H.p(this);
                        return;
                    }
                    return;
                } else if (!a6 || z3) {
                    a();
                    return;
                } else {
                    if (Q5) {
                        jVar.invalidate();
                    }
                    this.f3285b = i9;
                    jVar.f9513H.p(this);
                    return;
                }
        }
    }

    public /* synthetic */ C0166e1(C0159c0 c0Var, int i2, IOException iOException, byte[] bArr, Map map) {
        this.f3286c = c0Var;
        this.f3285b = i2;
        this.d = iOException;
        this.f3287e = bArr;
    }

    public C0166e1(C0773j jVar) {
        this.f3287e = jVar;
        this.d = new C0737s0(this, 3);
        this.f3286c = new u(jVar.getContext());
    }
}
