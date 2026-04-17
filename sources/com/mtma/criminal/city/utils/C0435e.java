package com.mtma.criminal.city.utils;

import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.OnSuccessListener;
import d5.o;
import i3.C0592h;

/* renamed from: com.mtma.criminal.city.utils.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0435e implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7401a;

    public /* synthetic */ C0435e(int i2) {
        this.f7401a = i2;
    }

    public final void onSuccess(Object obj) {
        switch (this.f7401a) {
            case 0:
                a.x(C0592h.d().e(), "players").E(o.getAccountObject().getId()).E("settingsObject").E("notificationToken").I((String) obj).addOnSuccessListener(new C0435e(1));
                return;
            default:
                Void voidR = (Void) obj;
                d.X0("notification_token", false);
                d.X0("notification_token_need_update", false);
                return;
        }
    }
}
