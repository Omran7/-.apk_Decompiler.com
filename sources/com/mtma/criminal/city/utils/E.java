package com.mtma.criminal.city.utils;

import F3.r;
import Q4.a;
import R2.b;
import Z3.d;
import a5.C0265b;
import android.content.Context;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import f.C0518i;
import java.util.Map;

public final /* synthetic */ class E implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f7348a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f7349b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7350c;

    public /* synthetic */ E(Context context, String str, boolean z3) {
        this.f7348a = context;
        this.f7349b = z3;
        this.f7350c = str;
    }

    public final void onComplete(Task task) {
        MyApplication myApplication;
        MyApplication myApplication2;
        int i2;
        boolean isSuccessful = task.isSuccessful();
        Context context = this.f7348a;
        if (!isSuccessful) {
            b.w(false);
            myApplication = MyApplication.f7090a;
        } else if (task.getResult() != null) {
            d dVar = new d();
            C0265b bVar = (C0265b) dVar.b(C0265b.class, dVar.e((Map) ((r) task.getResult()).f784a));
            if (bVar != null) {
                boolean z3 = bVar.isAllProcessSuccess;
                boolean z4 = this.f7349b;
                if (z3) {
                    b.w(false);
                    v0.e(context, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_use_health_tank_successfully));
                    b.M0(R.raw.use_health_tank);
                    long j6 = (long) 1;
                    Q.b(32, o.getAccountObject().getId(), j6);
                    Q.b(31, o.getAccountObject().getId(), j6);
                    if (z4) {
                        C0518i iVar = (C0518i) context;
                        for (C0286s sVar : iVar.l().f5000c.v()) {
                            if ((sVar instanceof Q4.b) || (sVar instanceof a)) {
                                I l6 = iVar.l();
                                l6.getClass();
                                C0269a aVar = new C0269a(l6);
                                aVar.h(sVar);
                                aVar.e(false);
                            }
                        }
                        return;
                    }
                    return;
                }
                b.w(false);
                if (z4 || bVar.isMaterialCountChanged) {
                    String str = this.f7350c;
                    if (z4 && !bVar.isMoneyChanged && str.equals("gold")) {
                        c.y0(context);
                        return;
                    } else if (!z4 || bVar.isMoneyChanged || !str.equals("check")) {
                        myApplication = MyApplication.f7090a;
                    } else {
                        myApplication2 = MyApplication.f7090a;
                        i2 = R.string.do_not_have_enough_check;
                    }
                } else {
                    myApplication2 = MyApplication.f7090a;
                    i2 = R.string.toast_not_enough_items;
                }
                com.google.android.gms.internal.measurement.a.n(myApplication2, i2, context, (String) null);
                return;
            }
            b.w(false);
            myApplication = MyApplication.f7090a;
        } else {
            b.w(false);
            myApplication = MyApplication.f7090a;
        }
        com.google.android.gms.internal.measurement.a.n(myApplication, R.string.unknown_error_try_again, context, (String) null);
    }
}
