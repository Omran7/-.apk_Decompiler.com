package com.mtma.criminal.city.utils;

import K1.e;
import android.support.v4.media.session.a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d5.C0469b;
import d5.o;
import d5.q;
import d5.r;
import i3.C0587c;
import java.util.List;
import java.util.Map;

public final class m0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f7436a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p0 f7437b;

    public m0(String str, p0 p0Var) {
        this.f7436a = str;
        this.f7437b = p0Var;
    }

    public final void onComplete(Task task) {
        int Y3 = e.Y(0, (r) ((C0587c) ((Task) ((List) task.getResult()).get(0)).getResult()).f(r.class), (C0469b) ((C0587c) ((Task) ((List) task.getResult()).get(1)).getResult()).f(C0469b.class), (q) null) - a.g0((Map) ((C0587c) ((Task) ((List) task.getResult()).get(2)).getResult()).e(new StoreUtil$5$1(this)))[1];
        if (this.f7436a.equals(o.getAccountObject().getId())) {
            o.getStockObject().setBagFreeSpace(Y3);
        }
        this.f7437b.o(Y3);
    }
}
