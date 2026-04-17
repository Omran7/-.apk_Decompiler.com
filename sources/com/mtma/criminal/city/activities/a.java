package com.mtma.criminal.city.activities;

import android.net.ConnectivityManager;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7047a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f7048b;

    public /* synthetic */ a(MainActivity mainActivity, int i2) {
        this.f7047a = i2;
        this.f7048b = mainActivity;
    }

    public final void run() {
        switch (this.f7047a) {
            case 0:
                MainActivity mainActivity = this.f7048b;
                ConnectivityManager connectivityManager = (ConnectivityManager) mainActivity.f6979I.getSystemService("connectivity");
                if (connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnected()) {
                    mainActivity.v();
                    return;
                }
                return;
            case 1:
                this.f7048b.finish();
                return;
            default:
                MainActivity mainActivity2 = this.f7048b;
                if (mainActivity2.f6988O.isShown()) {
                    mainActivity2.y();
                    return;
                } else {
                    mainActivity2.f6980I0 = false;
                    return;
                }
        }
    }
}
