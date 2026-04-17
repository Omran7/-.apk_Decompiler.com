package com.mtma.criminal.city.utils;

import A2.f;
import A4.c;
import B.n;
import K.O;
import L.t;
import R2.b;
import Z2.d;
import Z4.r;
import a5.C0264a;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.internal.measurement.a;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import h0.C0552a;
import j4.C;
import j4.D;
import j4.M0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: com.mtma.criminal.city.utils.t  reason: case insensitive filesystem */
public final /* synthetic */ class C0449t implements H, t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7469a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7470b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7471c;

    public /* synthetic */ C0449t(int i2, d dVar) {
        this.f7469a = 0;
        this.f7470b = i2;
        this.f7471c = dVar;
    }

    public void a(C0264a aVar) {
        switch (this.f7469a) {
            case 0:
                d dVar = (d) this.f7471c;
                int i2 = this.f7470b;
                if (i2 > 0) {
                    com.bumptech.glide.d.m1(3, -i2, false, new c((Object) dVar, (Object) aVar, 5));
                    return;
                } else {
                    dVar.a(aVar.isAllProcessSuccess, aVar.currentPlace, 0);
                    return;
                }
            default:
                C c3 = (C) this.f7471c;
                c3.getClass();
                b.w(false);
                boolean z3 = aVar.isAllProcessSuccess;
                int i5 = this.f7470b;
                f fVar = (f) c3.f8851c;
                if (z3) {
                    com.bumptech.glide.c.s0(((D) fVar.d).f8856a, MyApplication.f7090a.getApplicationContext().getString(R.string.crime_failed_go_to_hospital, new Object[]{MyApplication.f7090a.getApplicationContext().getString(((Y4.f) ((D) fVar.d).getItem(i5)).f4346a)}), (String) null);
                    return;
                }
                D.b((D) fVar.d, i5, MyApplication.f7090a.getApplicationContext().getString(R.string.crime_failed, new Object[]{MyApplication.f7090a.getApplicationContext().getString(((Y4.f) ((D) fVar.d).getItem(i5)).f4346a)}));
                return;
        }
    }

    public boolean b(View view) {
        String str;
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f7471c;
        sideSheetBehavior.getClass();
        int i2 = this.f7470b;
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            if (i2 == 1) {
                str = "DRAGGING";
            } else {
                str = "SETTLING";
            }
            throw new IllegalArgumentException(C0552a.r(sb, str, " should not be set externally."));
        }
        WeakReference weakReference = sideSheetBehavior.f6496p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.r(i2);
        } else {
            View view2 = (View) sideSheetBehavior.f6496p.get();
            n nVar = new n(sideSheetBehavior, i2, 1);
            ViewParent parent = view2.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap weakHashMap = O.f1352a;
                if (view2.isAttachedToWindow()) {
                    view2.post(nVar);
                }
            }
            nVar.run();
        }
        return true;
    }

    public void c(r rVar) {
        MyApplication myApplication;
        int i2;
        M0 m02 = (M0) this.f7471c;
        m02.getClass();
        boolean z3 = rVar.isAllProcessSuccess;
        Context context = m02.f8919a;
        if (z3) {
            List list = m02.f8920b;
            int i5 = this.f7470b;
            list.remove(i5);
            list.add(i5, Y4.D.f());
            m02.notifyDataSetChanged();
            b.w(false);
            a.l(MyApplication.f7090a, R.string.toast_successfully, context, R.raw.add_new_item);
            return;
        }
        b.w(false);
        if (!rVar.isMaterialRemovedFromStallCell) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.items_not_exist_in_stall_anymore;
        } else {
            myApplication = MyApplication.f7090a;
            i2 = R.string.unknown_error_try_again;
        }
        a.n(myApplication, i2, context, (String) null);
    }

    public /* synthetic */ C0449t(Object obj, int i2, int i5) {
        this.f7469a = i5;
        this.f7471c = obj;
        this.f7470b = i2;
    }
}
