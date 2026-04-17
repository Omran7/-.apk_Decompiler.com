package com.mtma.criminal.city.activities;

import android.content.Intent;
import com.google.firebase.auth.FirebaseAuth;
import e3.C0498f;

public final /* synthetic */ class c implements C0498f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f7050a;

    public /* synthetic */ c(MainActivity mainActivity) {
        this.f7050a = mainActivity;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        int i2 = MainActivity.L0;
        MainActivity mainActivity = this.f7050a;
        mainActivity.getClass();
        if (firebaseAuth.f6866f == null) {
            FirebaseAuth firebaseAuth2 = mainActivity.f6995V;
            firebaseAuth2.d.remove(mainActivity.f7010k0);
            mainActivity.f6995V = null;
            mainActivity.f7010k0 = null;
            Intent intent = new Intent(mainActivity.f6979I, StartActivity.class);
            intent.addFlags(268468224);
            mainActivity.finish();
            mainActivity.f6979I.startActivity(intent);
        }
    }
}
