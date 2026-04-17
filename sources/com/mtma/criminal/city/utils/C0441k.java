package com.mtma.criminal.city.utils;

import b5.k;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.tasks.OnSuccessListener;
import d5.o;
import java.util.ArrayList;

/* renamed from: com.mtma.criminal.city.utils.k  reason: case insensitive filesystem */
public final class C0441k implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7428a;

    public C0441k(int i2) {
        this.f7428a = i2;
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        ArrayList<Long> servantContractsStartTimeInMilliList = o.getEstateObject().getServantContractsStartTimeInMilliList();
        int i2 = this.f7428a;
        servantContractsStartTimeInMilliList.set(i2, -1L);
        c.k0(o.getAccountObject().getId(), new k(1, o.getEstateObject().getId(), i2));
        d.i1();
    }
}
