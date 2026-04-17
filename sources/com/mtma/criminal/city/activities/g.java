package com.mtma.criminal.city.activities;

import H4.h;
import K1.e;
import android.os.Handler;
import android.support.v4.media.session.a;
import android.util.Log;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import d5.o;
import d5.u;
import i3.C0585a;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.q;
import r4.C0956f;
import r4.j;

public final class g implements C0585a, q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f7060b;

    public /* synthetic */ g(MainActivity mainActivity, int i2) {
        this.f7059a = i2;
        this.f7060b = mainActivity;
    }

    public void i(C0587c cVar) {
        int i2 = this.f7059a;
    }

    public void k(C0587c cVar) {
        Integer num;
        char c3 = 65535;
        Class<Boolean> cls = Boolean.class;
        MainActivity mainActivity = this.f7060b;
        switch (this.f7059a) {
            case 0:
                try {
                    String F = cVar.f8279b.F();
                    if (F != null) {
                        switch (F.hashCode()) {
                            case -1881162338:
                                if (F.equals("gotFirstPurchaseGifts")) {
                                    c3 = 11;
                                    break;
                                }
                                break;
                            case -1880197401:
                                if (F.equals("bannedFromPrivateMessages")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                            case -1686246476:
                                if (F.equals("bannedFromNewsFromSystem")) {
                                    c3 = 8;
                                    break;
                                }
                                break;
                            case -1642081799:
                                if (F.equals("bannedFromChatFromSystem")) {
                                    c3 = 6;
                                    break;
                                }
                                break;
                            case -1375198322:
                                if (F.equals("needReview")) {
                                    c3 = 10;
                                    break;
                                }
                                break;
                            case -1159091008:
                                if (F.equals("bannedFromPrivateMessagesFromSystem")) {
                                    c3 = 7;
                                    break;
                                }
                                break;
                            case -547062190:
                                if (F.equals("bannedFromChangeProfilePicFromSystem")) {
                                    c3 = 9;
                                    break;
                                }
                                break;
                            case 431561783:
                                if (F.equals("bannedFromSystem")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 455390969:
                                if (F.equals("bannedFromChangeProfilePic")) {
                                    c3 = 5;
                                    break;
                                }
                                break;
                            case 612245344:
                                if (F.equals("bannedFromChat")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case 612570843:
                                if (F.equals("bannedFromNews")) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case 1109191185:
                                if (F.equals("deviceId")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                        }
                        switch (c3) {
                            case 0:
                                if (!e.u().equals((String) cVar.f(String.class))) {
                                    new Handler().postDelayed(new f(this, c.q0(mainActivity.f6979I), 0), 15000);
                                    return;
                                }
                                return;
                            case 1:
                                Boolean bool = (Boolean) cVar.f(cls);
                                if (bool != null && bool.booleanValue()) {
                                    c.r0(mainActivity.f6979I);
                                    return;
                                }
                                return;
                            case 2:
                                Boolean bool2 = (Boolean) cVar.f(cls);
                                if (bool2 != null) {
                                    o.getAccountObject().setBannedFromChat(bool2.booleanValue());
                                    return;
                                }
                                return;
                            case 3:
                                Boolean bool3 = (Boolean) cVar.f(cls);
                                if (bool3 != null) {
                                    o.getAccountObject().setBannedFromPrivateMessages(bool3.booleanValue());
                                    return;
                                }
                                return;
                            case 4:
                                Boolean bool4 = (Boolean) cVar.f(cls);
                                if (bool4 != null) {
                                    o.getAccountObject().setBannedFromNews(bool4.booleanValue());
                                    return;
                                }
                                return;
                            case 5:
                                Boolean bool5 = (Boolean) cVar.f(cls);
                                if (bool5 != null) {
                                    o.getAccountObject().setBannedFromChangeProfilePic(bool5.booleanValue());
                                    return;
                                }
                                return;
                            case zzaky.zzf.zzf:
                                Boolean bool6 = (Boolean) cVar.f(cls);
                                if (bool6 != null) {
                                    o.getAccountObject().setBannedFromChatFromSystem(bool6.booleanValue());
                                    return;
                                }
                                return;
                            case zzaky.zzf.zzg:
                                Boolean bool7 = (Boolean) cVar.f(cls);
                                if (bool7 != null) {
                                    o.getAccountObject().setBannedFromPrivateMessagesFromSystem(bool7.booleanValue());
                                    return;
                                }
                                return;
                            case 8:
                                Boolean bool8 = (Boolean) cVar.f(cls);
                                if (bool8 != null) {
                                    o.getAccountObject().setBannedFromNewsFromSystem(bool8.booleanValue());
                                    return;
                                }
                                return;
                            case 9:
                                Boolean bool9 = (Boolean) cVar.f(cls);
                                if (bool9 != null) {
                                    o.getAccountObject().setBannedFromChangeProfilePicFromSystem(bool9.booleanValue());
                                    return;
                                }
                                return;
                            case 10:
                                Boolean bool10 = (Boolean) cVar.f(cls);
                                if (bool10 != null && bool10.booleanValue()) {
                                    c.w0(mainActivity.f6979I);
                                    return;
                                }
                                return;
                            case ModuleDescriptor.MODULE_VERSION:
                                Boolean bool11 = (Boolean) cVar.f(cls);
                                if (bool11 == null) {
                                    return;
                                }
                                if (bool11.booleanValue()) {
                                    mainActivity.f6986M.setVisibility(8);
                                    return;
                                } else {
                                    mainActivity.f6986M.setVisibility(0);
                                    return;
                                }
                            default:
                                return;
                        }
                    } else {
                        return;
                    }
                } catch (Exception e6) {
                    int i2 = MainActivity.L0;
                    Log.e("MainActivity", "Exception from try-catch inside MainActivity class in addListenerToAccount method.", e6);
                    return;
                }
            case 2:
                try {
                    String F6 = cVar.f8279b.F();
                    Boolean bool12 = (Boolean) cVar.f(cls);
                    if (F6 != null && bool12 != null) {
                        switch (F6.hashCode()) {
                            case -1425521751:
                                if (F6.equals("hasUnSeenMedal")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case -1252271108:
                                if (F6.equals("hasUnCollectedPrize")) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case -935177055:
                                if (F6.equals("hasUnReadSupportMessage")) {
                                    c3 = 5;
                                    break;
                                }
                                break;
                            case -717938028:
                                if (F6.equals("hasUnReadNotification")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case 558618077:
                                if (F6.equals("hasUnSeenContactRequest")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 1425251437:
                                if (F6.equals("hasUnReadPrivateMessage")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                        }
                        if (c3 == 0) {
                            o.getNotificationObject().setHasUnSeenMedal(bool12.booleanValue());
                            mainActivity.f6971A0.Y();
                        } else if (c3 == 1) {
                            o.getNotificationObject().setHasUnSeenContactRequest(bool12.booleanValue());
                            mainActivity.f6971A0.Y();
                        } else if (c3 == 2) {
                            o.getNotificationObject().setHasUnReadNotification(bool12.booleanValue());
                            mainActivity.w();
                        } else if (c3 == 3) {
                            o.getNotificationObject().setHasUnReadPrivateMessage(bool12.booleanValue());
                            mainActivity.w();
                        } else if (c3 == 4) {
                            o.getNotificationObject().setHasUnCollectedPrize(bool12.booleanValue());
                            mainActivity.w();
                        } else if (c3 == 5) {
                            o.getNotificationObject().setHasUnReadSupportMessage(bool12.booleanValue());
                            mainActivity.w();
                        }
                        c.f();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                C0590f fVar = cVar.f8279b;
                try {
                    if (fVar.F() != null && fVar.F().equals("maximumLevel") && (num = (Integer) cVar.f(Integer.class)) != null && num.intValue() != d.v0(80, "server_maximum_level")) {
                        d.Y0(num.intValue());
                        mainActivity.f7024z0.Z();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    int i5 = MainActivity.L0;
                    Log.e("MainActivity", "Exception from try-catch inside MainActivity class in addListenerToServerBasicData method.", e7);
                    return;
                }
        }
    }

    public void q(C0587c cVar) {
        Integer num;
        char c3 = 65535;
        Class<Boolean> cls = Boolean.class;
        MainActivity mainActivity = this.f7060b;
        switch (this.f7059a) {
            case 0:
                try {
                    String F = cVar.f8279b.F();
                    if (F != null) {
                        switch (F.hashCode()) {
                            case -1881162338:
                                if (F.equals("gotFirstPurchaseGifts")) {
                                    c3 = 11;
                                    break;
                                }
                                break;
                            case -1880197401:
                                if (F.equals("bannedFromPrivateMessages")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                            case -1686246476:
                                if (F.equals("bannedFromNewsFromSystem")) {
                                    c3 = 8;
                                    break;
                                }
                                break;
                            case -1642081799:
                                if (F.equals("bannedFromChatFromSystem")) {
                                    c3 = 6;
                                    break;
                                }
                                break;
                            case -1375198322:
                                if (F.equals("needReview")) {
                                    c3 = 10;
                                    break;
                                }
                                break;
                            case -1159091008:
                                if (F.equals("bannedFromPrivateMessagesFromSystem")) {
                                    c3 = 7;
                                    break;
                                }
                                break;
                            case -547062190:
                                if (F.equals("bannedFromChangeProfilePicFromSystem")) {
                                    c3 = 9;
                                    break;
                                }
                                break;
                            case 94756344:
                                if (F.equals("close")) {
                                    c3 = 12;
                                    break;
                                }
                                break;
                            case 431561783:
                                if (F.equals("bannedFromSystem")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 455390969:
                                if (F.equals("bannedFromChangeProfilePic")) {
                                    c3 = 5;
                                    break;
                                }
                                break;
                            case 612245344:
                                if (F.equals("bannedFromChat")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case 612570843:
                                if (F.equals("bannedFromNews")) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case 1109191185:
                                if (F.equals("deviceId")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                        }
                        switch (c3) {
                            case 0:
                                if (!e.u().equals((String) cVar.f(String.class))) {
                                    new Handler().postDelayed(new f(this, c.q0(mainActivity.f6979I), 1), 15000);
                                    return;
                                }
                                return;
                            case 1:
                                Boolean bool = (Boolean) cVar.f(cls);
                                if (bool != null && bool.booleanValue()) {
                                    c.r0(mainActivity.f6979I);
                                    return;
                                }
                                return;
                            case 2:
                                Boolean bool2 = (Boolean) cVar.f(cls);
                                if (bool2 != null) {
                                    o.getAccountObject().setBannedFromChat(bool2.booleanValue());
                                    return;
                                }
                                return;
                            case 3:
                                Boolean bool3 = (Boolean) cVar.f(cls);
                                if (bool3 != null) {
                                    o.getAccountObject().setBannedFromPrivateMessages(bool3.booleanValue());
                                    return;
                                }
                                return;
                            case 4:
                                Boolean bool4 = (Boolean) cVar.f(cls);
                                if (bool4 != null) {
                                    o.getAccountObject().setBannedFromNews(bool4.booleanValue());
                                    return;
                                }
                                return;
                            case 5:
                                Boolean bool5 = (Boolean) cVar.f(cls);
                                if (bool5 != null) {
                                    o.getAccountObject().setBannedFromChangeProfilePic(bool5.booleanValue());
                                    return;
                                }
                                return;
                            case zzaky.zzf.zzf:
                                Boolean bool6 = (Boolean) cVar.f(cls);
                                if (bool6 != null) {
                                    o.getAccountObject().setBannedFromChatFromSystem(bool6.booleanValue());
                                    return;
                                }
                                return;
                            case zzaky.zzf.zzg:
                                Boolean bool7 = (Boolean) cVar.f(cls);
                                if (bool7 != null) {
                                    o.getAccountObject().setBannedFromPrivateMessagesFromSystem(bool7.booleanValue());
                                    return;
                                }
                                return;
                            case 8:
                                Boolean bool8 = (Boolean) cVar.f(cls);
                                if (bool8 != null) {
                                    o.getAccountObject().setBannedFromNewsFromSystem(bool8.booleanValue());
                                    return;
                                }
                                return;
                            case 9:
                                Boolean bool9 = (Boolean) cVar.f(cls);
                                if (bool9 != null) {
                                    o.getAccountObject().setBannedFromChangeProfilePicFromSystem(bool9.booleanValue());
                                    return;
                                }
                                return;
                            case 10:
                                Boolean bool10 = (Boolean) cVar.f(cls);
                                if (bool10 != null && bool10.booleanValue()) {
                                    c.w0(mainActivity.f6979I);
                                    return;
                                }
                                return;
                            case ModuleDescriptor.MODULE_VERSION:
                                Boolean bool11 = (Boolean) cVar.f(cls);
                                if (bool11 == null) {
                                    return;
                                }
                                if (bool11.booleanValue()) {
                                    mainActivity.f6986M.setVisibility(8);
                                    return;
                                } else {
                                    mainActivity.f6986M.setVisibility(0);
                                    return;
                                }
                            case 12:
                                Boolean bool12 = (Boolean) cVar.f(cls);
                                if (bool12 != null && bool12.booleanValue()) {
                                    mainActivity.finish();
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    } else {
                        return;
                    }
                } catch (Exception e6) {
                    int i2 = MainActivity.L0;
                    Log.e("MainActivity", "Exception from try-catch inside MainActivity class in addListenerToAccount method.", e6);
                    return;
                }
            case 2:
                try {
                    String F6 = cVar.f8279b.F();
                    Boolean bool13 = (Boolean) cVar.f(cls);
                    if (F6 != null && bool13 != null) {
                        switch (F6.hashCode()) {
                            case -1425521751:
                                if (F6.equals("hasUnSeenMedal")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case -1252271108:
                                if (F6.equals("hasUnCollectedPrize")) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case -935177055:
                                if (F6.equals("hasUnReadSupportMessage")) {
                                    c3 = 5;
                                    break;
                                }
                                break;
                            case -717938028:
                                if (F6.equals("hasUnReadNotification")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case 558618077:
                                if (F6.equals("hasUnSeenContactRequest")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 1425251437:
                                if (F6.equals("hasUnReadPrivateMessage")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                        }
                        if (c3 == 0) {
                            o.getNotificationObject().setHasUnSeenMedal(bool13.booleanValue());
                            mainActivity.f6971A0.Y();
                        } else if (c3 == 1) {
                            o.getNotificationObject().setHasUnSeenContactRequest(bool13.booleanValue());
                            mainActivity.f6971A0.Y();
                        } else if (c3 == 2) {
                            o.getNotificationObject().setHasUnReadNotification(bool13.booleanValue());
                            mainActivity.w();
                        } else if (c3 == 3) {
                            o.getNotificationObject().setHasUnReadPrivateMessage(bool13.booleanValue());
                            mainActivity.w();
                        } else if (c3 == 4) {
                            o.getNotificationObject().setHasUnCollectedPrize(bool13.booleanValue());
                            mainActivity.w();
                        } else if (c3 == 5) {
                            o.getNotificationObject().setHasUnReadSupportMessage(bool13.booleanValue());
                            mainActivity.w();
                        }
                        c.f();
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                C0590f fVar = cVar.f8279b;
                try {
                    if (fVar.F() != null && fVar.F().equals("maximumLevel") && (num = (Integer) cVar.f(Integer.class)) != null && num.intValue() != d.v0(80, "server_maximum_level")) {
                        d.Y0(num.intValue());
                        mainActivity.f7024z0.Z();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    int i5 = MainActivity.L0;
                    Log.e("MainActivity", "Exception from try-catch inside MainActivity class in addListenerToServerBasicData method.", e7);
                    return;
                }
        }
    }

    public void u(C0587c cVar) {
        u uVar = (u) cVar.f(u.class);
        if (uVar != null) {
            o.setPlayerObject(uVar);
            int i2 = MainActivity.L0;
            MainActivity mainActivity = this.f7060b;
            mainActivity.t();
            mainActivity.q();
            mainActivity.w();
            mainActivity.f6971A0.Y();
            a.t0();
            MainActivity.p(mainActivity);
            MainActivity.s();
            for (C0286s sVar : mainActivity.l().f5000c.v()) {
                if (sVar instanceof h) {
                    h hVar = (h) sVar;
                    hVar.a0();
                    hVar.Z();
                } else if (sVar instanceof j) {
                    j jVar = (j) sVar;
                    if (jVar.f11261u0.equals("worldwide")) {
                        for (C0286s sVar2 : jVar.m().f5000c.v()) {
                            if (sVar2 instanceof C0956f) {
                                C0956f fVar = (C0956f) sVar2;
                                fVar.getClass();
                                fVar.f11229l0 = com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "chats").E(fVar.f11222e0);
                                fVar.Y();
                            }
                        }
                    } else {
                        I l6 = mainActivity.l();
                        l6.getClass();
                        C0269a aVar = new C0269a(l6);
                        aVar.h(sVar);
                        aVar.e(false);
                    }
                }
            }
        }
    }

    private final void a(C0587c cVar) {
    }

    private final void b(C0587c cVar) {
    }

    private final void c(C0587c cVar) {
    }

    public void B(C0588d dVar) {
    }
}
