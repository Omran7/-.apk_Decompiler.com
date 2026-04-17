package B4;

import E4.c;
import E4.d;
import H4.j;
import I4.h;
import R2.b;
import android.os.Handler;
import android.widget.AbsListView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.fragments.gangBase.A;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.fragments.gangBase.J;
import com.mtma.criminal.city.fragments.gangBase.s;
import com.mtma.criminal.city.fragments.gangBase.z;
import d5.o;
import i3.C0590f;
import i3.C0592h;
import k.C0655C0;
import k.C0657D0;
import k.C0724m;
import u4.C1033b;
import v4.C1052a;
import x1.i;
import x4.C1101d;

public final class a implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f344a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f345b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f344a = i2;
        this.f345b = obj;
    }

    public final void onScroll(AbsListView absListView, int i2, int i5, int i6) {
        String str;
        switch (this.f344a) {
            case 0:
                int i7 = i2 + i5;
                g gVar = (g) this.f345b;
                if (i7 == i6) {
                    gVar.f368o0 = true;
                    if (gVar.f367n0 != i7) {
                        gVar.f367n0 = i7;
                        if (gVar.f366m0) {
                            b.w(true);
                            C0592h.d().e().E(b.a0()).E("news").E("playerAds").r().h(gVar.f365l0).p(10).d(new e(gVar, 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                gVar.f368o0 = false;
                return;
            case 1:
                int i8 = i2 + i5;
                d dVar = (d) this.f345b;
                if (i8 == i6) {
                    dVar.f643q0 = true;
                    if (dVar.f642p0 != i8) {
                        dVar.f642p0 = i8;
                        if (dVar.f641o0) {
                            b.w(true);
                            dVar.s0.s().h(dVar.f640n0).p(10).d(new c(dVar, 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                dVar.f643q0 = false;
                return;
            case 2:
                int i9 = i2 + i5;
                G4.c cVar = (G4.c) this.f345b;
                if (i9 == i6) {
                    cVar.f853l0 = true;
                    return;
                } else {
                    cVar.f853l0 = false;
                    return;
                }
            case 3:
                int i10 = i2 + i5;
                j jVar = (j) this.f345b;
                if (i10 == i6) {
                    jVar.f1064o0 = true;
                    if (jVar.f1063n0 != i10 && jVar.f1059j0.size() >= 15) {
                        jVar.f1063n0 = i10;
                        if (jVar.f1062m0) {
                            b.w(true);
                            com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "messages").E(o.getAccountObject().getId()).E("chatData").q("lastMessageTimeInMilli").e("[MIN_NAME]", (double) jVar.f1061l0).p(10).d(new U3.c((Object) jVar, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                jVar.f1064o0 = false;
                return;
            case 4:
                int i11 = i2 + i5;
                h hVar = (h) this.f345b;
                if (i11 == i6) {
                    hVar.f1229o0 = true;
                    if (hVar.f1228n0 != i11) {
                        hVar.f1228n0 = i11;
                        if (hVar.f1227m0) {
                            com.google.android.gms.internal.measurement.a.e(true).E(b.Z()).E("players").q("locationObject/sortByCityPlaceLastSeen").w(hVar.f1226l0).o(10).d(new i((Object) hVar, 16));
                            return;
                        }
                        return;
                    }
                    return;
                }
                hVar.f1229o0 = false;
                return;
            case 5:
                int i12 = i2 + i5;
                M4.c cVar2 = (M4.c) this.f345b;
                if (i12 == i6) {
                    cVar2.f1852m0 = true;
                    if (cVar2.f1853n0 != i12) {
                        cVar2.f1853n0 = i12;
                        if (cVar2.f1855p0) {
                            int i13 = cVar2.f1844e0;
                            if (i13 == 1 || i13 == 2) {
                                cVar2.V();
                                return;
                            } else if (i13 == 0) {
                                cVar2.W();
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    cVar2.f1852m0 = false;
                    return;
                }
            case zzaky.zzf.zzf /*6*/:
                int i14 = i2 + i5;
                P4.j jVar2 = (P4.j) this.f345b;
                if (i14 == i6) {
                    jVar2.f2243o0 = true;
                    if (jVar2.f2242n0 != i14 && jVar2.f2237i0.size() >= 10) {
                        jVar2.f2242n0 = i14;
                        if (jVar2.f2241m0) {
                            b.w(true);
                            jVar2.f2245q0.E(o.getAccountObject().getId()).E("accountObject").E("invitedPlayers").r().h(jVar2.f2239k0).p(10).d(new i((Object) jVar2, 27));
                            return;
                        }
                        return;
                    }
                    return;
                }
                jVar2.f2243o0 = false;
                return;
            case zzaky.zzf.zzg /*7*/:
                int i15 = i2 + i5;
                s sVar = (s) this.f345b;
                if (i15 == i6) {
                    sVar.f7271l0 = true;
                    return;
                } else {
                    sVar.f7271l0 = false;
                    return;
                }
            case 8:
                int i16 = i2 + i5;
                A a6 = (A) this.f345b;
                if (i16 == i6) {
                    a6.f7103n0 = true;
                    if (a6.f7102m0 != i16) {
                        a6.f7102m0 = i16;
                        if (a6.f7101l0) {
                            int i17 = a6.f7094e0;
                            if (i17 == 0) {
                                com.google.android.gms.internal.measurement.a.e(true).E(b.Z()).E("gangs").E("gangsData").r().h(a6.f7100k0).p(8).d(new z(a6, 0));
                                return;
                            } else if (i17 == 1) {
                                b.w(true);
                                com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "rank").E(android.support.v4.media.session.a.L(3)).E(android.support.v4.media.session.a.M(3, 0)).s().h(a6.f7100k0).p(8).d(new z(a6, 2));
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    a6.f7103n0 = false;
                    return;
                }
            case 9:
                int i18 = i2 + i5;
                J j6 = (J) this.f345b;
                if (i18 == i6) {
                    j6.f7155o0 = true;
                    if (j6.f7154n0 != i18) {
                        j6.f7154n0 = i18;
                        if (j6.f7153m0) {
                            com.google.android.gms.internal.measurement.a.e(true).E(b.Z()).E("gangs").E("gangRequests").E(o.getGangObject().getId()).s().e("[MIN_NAME]", (double) j6.f7152l0.longValue()).p(10).d(new I(j6, 0));
                            return;
                        }
                        return;
                    }
                    return;
                }
                j6.f7155o0 = false;
                return;
            case 10:
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                int i19 = i2 + i5;
                C1033b bVar = (C1033b) this.f345b;
                if (i19 == i6) {
                    bVar.s0 = true;
                    if (bVar.f11866r0 != i19) {
                        bVar.f11866r0 = i19;
                        if (bVar.f11864p0) {
                            C0590f c3 = com.google.android.gms.internal.measurement.a.c(com.google.android.gms.internal.measurement.a.e(true), "players");
                            if (o.getLocationObject().getCurrentCity() == 0) {
                                str = "locationObject/sortByCityPlaceLevelLastSeen";
                            } else {
                                str = "locationObject/sortByCityPlaceLastSeen";
                            }
                            c3.q(str).h(bVar.f11863o0).p(10).d(new C0724m(bVar, 14));
                            return;
                        }
                        return;
                    }
                    return;
                }
                bVar.s0 = false;
                return;
            case 12:
                int i20 = i2 + i5;
                C1052a aVar = (C1052a) this.f345b;
                if (i20 == i6) {
                    aVar.s0 = true;
                    if (aVar.f12329r0 != i20) {
                        aVar.f12329r0 = i20;
                        if (aVar.f12328q0) {
                            b.w(true);
                            aVar.f12331u0.E("level-0").r().w(aVar.f12327p0).o(10).d(new C0724m(aVar, 16));
                            return;
                        }
                        return;
                    }
                    return;
                }
                aVar.s0 = false;
                return;
            default:
                int i21 = i2 + i5;
                C1101d dVar2 = (C1101d) this.f345b;
                if (i21 == i6) {
                    dVar2.f12574o0 = true;
                    if (dVar2.f12573n0 != i21) {
                        dVar2.f12573n0 = i21;
                        if (dVar2.f12572m0) {
                            com.google.android.gms.internal.measurement.a.e(true).E(b.Z()).E("players").q("locationObject/sortByCityPlaceLastSeen").w(dVar2.f12571l0).o(10).d(new C0724m(dVar2, 21));
                            return;
                        }
                        return;
                    }
                    return;
                }
                dVar2.f12574o0 = false;
                return;
        }
    }

    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        switch (this.f344a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case zzaky.zzf.zzf /*6*/:
            case zzaky.zzf.zzg /*7*/:
            case 8:
            case 9:
                return;
            case 10:
                if (i2 == 1) {
                    C0657D0 d02 = (C0657D0) this.f345b;
                    if (d02.f9161I.getInputMethodMode() != 2 && d02.f9161I.getContentView() != null) {
                        Handler handler = d02.f9158E;
                        C0655C0 c02 = d02.f9154A;
                        handler.removeCallbacks(c02);
                        c02.run();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void b(AbsListView absListView, int i2) {
    }

    private final void c(AbsListView absListView, int i2) {
    }

    private final void d(AbsListView absListView, int i2) {
    }

    private final void e(AbsListView absListView, int i2) {
    }

    private final void f(AbsListView absListView, int i2) {
    }

    private final void g(AbsListView absListView, int i2) {
    }

    private final void h(AbsListView absListView, int i2) {
    }

    private final void i(AbsListView absListView, int i2) {
    }

    private final void j(AbsListView absListView, int i2) {
    }

    private final void k(AbsListView absListView, int i2) {
    }

    private final void l(AbsListView absListView, int i2) {
    }

    private final void m(AbsListView absListView, int i2) {
    }

    private final void n(AbsListView absListView, int i2) {
    }

    private final void a(AbsListView absListView, int i2, int i5, int i6) {
    }
}
