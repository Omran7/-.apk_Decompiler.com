package com.bumptech.glide.manager;

import R2.b;
import T1.W0;
import U0.o;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import com.bumptech.glide.c;
import com.mtma.criminal.city.activities.MainActivity;
import e5.C0505b;

public final class n extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5839a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5840b;

    public /* synthetic */ n(Object obj, int i2) {
        this.f5839a = i2;
        this.f5840b = obj;
    }

    public final void onAvailable(Network network) {
        C0505b bVar;
        switch (this.f5839a) {
            case 0:
                o.f().post(new W0(this, true, 1));
                return;
            default:
                super.onAvailable(network);
                MainActivity mainActivity = (MainActivity) this.f5840b;
                if (mainActivity.f6982J0 && (bVar = mainActivity.f6973C0) != null && bVar.isShowing()) {
                    mainActivity.f6973C0.dismiss();
                    mainActivity.f6974D0 = false;
                    new Handler(mainActivity.f6979I.getMainLooper()).post(new com.mtma.criminal.city.activities.n(this, 0));
                    return;
                }
                return;
        }
    }

    public final void onLost(Network network) {
        switch (this.f5839a) {
            case 0:
                o.f().post(new W0(this, false, 1));
                return;
            default:
                super.onLost(network);
                MainActivity mainActivity = (MainActivity) this.f5840b;
                if (mainActivity.f6982J0) {
                    b.w(true);
                    c.B0();
                    mainActivity.t();
                    mainActivity.v();
                    return;
                }
                return;
        }
    }
}
