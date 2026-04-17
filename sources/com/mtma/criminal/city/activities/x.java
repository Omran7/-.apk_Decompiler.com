package com.mtma.criminal.city.activities;

import X4.j;
import com.google.firebase.auth.FirebaseAuth;
import e3.C0498f;
import e3.m;

public final class x implements C0498f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StartActivity f7089a;

    public x(StartActivity startActivity) {
        this.f7089a = startActivity;
    }

    public final void a(FirebaseAuth firebaseAuth) {
        m mVar = firebaseAuth.f6866f;
        StartActivity startActivity = this.f7089a;
        if (mVar == null) {
            startActivity.s(new j(startActivity.f7028I));
        } else {
            startActivity.f7036Q = true;
        }
        FirebaseAuth firebaseAuth2 = startActivity.f7044Y;
        firebaseAuth2.d.remove(startActivity.f7045Z);
        startActivity.f7044Y = null;
        startActivity.f7045Z = null;
    }
}
