package com.mtma.criminal.city.fragments.gangBase;

import R2.b;
import W0.A;
import W0.v;
import W0.w;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e5.C0509f;

/* renamed from: com.mtma.criminal.city.fragments.gangBase.b  reason: case insensitive filesystem */
public final class C0422b extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7160a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0423c f7161b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0422b(C0423c cVar, View view, int i2) {
        super(view);
        this.f7160a = i2;
        this.f7161b = cVar;
    }

    public final void onClick(View view) {
        switch (this.f7160a) {
            case 0:
                super.onClick(view);
                w wVar = new w();
                wVar.f3985C = true;
                wVar.f4030q = A.f3874b;
                wVar.f4008a = true;
                wVar.f4010b = true;
                wVar.f4041w = true;
                this.f7161b.f7172n0.a(new v(wVar));
                return;
            case 1:
                super.onClick(view);
                int level = o.getMainStatesObject().getLevel();
                C0423c cVar = this.f7161b;
                if (level < 25) {
                    a.n(MyApplication.f7090a, R.string.level_lower_requirements, cVar.f7162d0, (String) null);
                    return;
                } else if (o.getMoneyObject().getCash() < 10000000) {
                    c.x0(cVar.f7162d0);
                    return;
                } else if (o.getGangObject().getLeaveGangTimeInSeconds() + 7200 < c.f5744o) {
                    String trim = cVar.f7166h0.getText().toString().trim();
                    String trim2 = cVar.f7167i0.getText().toString().trim();
                    boolean isEmpty = trim.isEmpty();
                    Context context = cVar.f7162d0;
                    if (isEmpty) {
                        a.k(MyApplication.f7090a, R.string.enter_gang_name_first, context);
                        return;
                    } else if (trim.length() < 4) {
                        v0.e(context, MyApplication.f7090a.getApplicationContext().getString(R.string.gang_name_can_not_be_less_than_number_of_letters, new Object[]{4}));
                        return;
                    } else if (trim.length() > 15) {
                        v0.e(context, MyApplication.f7090a.getApplicationContext().getString(R.string.gang_name_can_not_be_more_than_number_of_letters, new Object[]{15}));
                        return;
                    } else if (trim2.isEmpty()) {
                        a.k(MyApplication.f7090a, R.string.enter_gang_tag_first, context);
                        return;
                    } else if (trim2.length() != 3) {
                        a.k(MyApplication.f7090a, R.string.gang_tag_must_be_three_letters, context);
                        return;
                    } else {
                        b.w(true);
                        android.support.v4.media.session.a.i0(new C0421a(cVar, trim, trim2, 0));
                        return;
                    }
                } else {
                    a.n(MyApplication.f7090a, R.string.dialog_wait_two_hours_before_creating_new_gang, cVar.f7162d0, (String) null);
                    return;
                }
            default:
                super.onClick(view);
                C0423c cVar2 = this.f7161b;
                C0269a aVar = new C0269a(cVar2.p());
                aVar.h(cVar2);
                aVar.e(false);
                return;
        }
    }
}
