package com.mtma.criminal.city.activities;

import android.os.Handler;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7073a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.manager.n f7074b;

    public /* synthetic */ n(com.bumptech.glide.manager.n nVar, int i2) {
        this.f7073a = i2;
        this.f7074b = nVar;
    }

    public final void run() {
        switch (this.f7073a) {
            case 0:
                com.bumptech.glide.manager.n nVar = this.f7074b;
                nVar.getClass();
                new Handler().postDelayed(new n(nVar, 1), 2000);
                return;
            case 1:
                com.bumptech.glide.manager.n nVar2 = this.f7074b;
                ((MainActivity) nVar2.f5840b).onResume();
                new Handler().postDelayed(new n(nVar2, 2), 1000);
                return;
            default:
                v0.e(((MainActivity) this.f7074b.f5840b).f6979I, MyApplication.f7090a.getApplicationContext().getString(R.string.internet_connection_come_backed));
                return;
        }
    }
}
