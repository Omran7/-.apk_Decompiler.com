package Z2;

import D2.l;
import K1.e;
import R2.b;
import android.support.v4.media.session.a;
import b5.k;
import com.bumptech.glide.c;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.U;
import d5.o;
import u4.f;
import u4.g;

public final /* synthetic */ class d implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4485a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f4486b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4487c;

    public /* synthetic */ d(Object obj, boolean z3, int i2) {
        this.f4485a = i2;
        this.f4487c = obj;
        this.f4486b = z3;
    }

    public void a(boolean z3, int i2, long j6) {
        String str;
        int i5;
        String str2;
        switch (this.f4485a) {
            case 1:
                g gVar = ((f) this.f4487c).f11876b;
                if (z3) {
                    int E6 = e.E(gVar.f11906e1, gVar.f11908f1, 3);
                    if (E6 > 0) {
                        com.bumptech.glide.d.m1(2, -E6, false, (J) null);
                    }
                    if (E6 > o.getMainStatesObject().getNobilityCurrent()) {
                        i5 = o.getMainStatesObject().getNobilityCurrent();
                    } else {
                        i5 = E6;
                    }
                    if (E6 > 0) {
                        str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_cripple_with_nobility_affect_dialog_message, new Object[]{Integer.valueOf(i5)});
                    } else {
                        str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_cripple_dialog_message);
                    }
                    gVar.Z();
                    Q.b(112, o.getAccountObject().getId(), (long) 1);
                    boolean z4 = this.f4486b;
                    String str3 = gVar.f11905e0;
                    if (z4) {
                        c.k0(str3, new k(17, o.getAccountObject().getId(), o.getMainStatesObject().getNickName()));
                    } else {
                        c.k0(str3, new k(17, "player_not_visible", MyApplication.f7090a.getApplicationContext().getString(R.string.unknown)));
                    }
                } else if (i2 == 1) {
                    str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_player_in_hospital);
                } else if (i2 == 3) {
                    str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_player_in_plane);
                } else if (i2 == 2) {
                    str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_player_in_prison);
                } else if (i2 == 4) {
                    str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_player_in_tunnel);
                } else {
                    str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_unknown);
                }
                b.w(false);
                g.X(gVar, str);
                return;
            default:
                g gVar2 = ((f) this.f4487c).f11876b;
                if (z3) {
                    int E7 = e.E(gVar2.f11906e1, gVar2.f11908f1, 1);
                    if (E7 > 0) {
                        com.bumptech.glide.d.m1(2, -E7, false, (J) null);
                    }
                    if (E7 > o.getMainStatesObject().getNobilityCurrent()) {
                        E7 = o.getMainStatesObject().getNobilityCurrent();
                    }
                    if (E7 > 0) {
                        str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_leave_with_nobility_affect_dialog_message, new Object[]{Long.valueOf(j6), Integer.valueOf(E7)});
                    } else {
                        str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_leave_dialog_message, new Object[]{Long.valueOf(j6)});
                    }
                    gVar2.Z();
                    Q.b(110, o.getAccountObject().getId(), (long) 1);
                    boolean z5 = this.f4486b;
                    String str4 = gVar2.f11905e0;
                    if (z5) {
                        c.k0(str4, new k(15, o.getAccountObject().getId(), o.getMainStatesObject().getNickName()));
                    } else {
                        c.k0(str4, new k(15, "player_not_visible", MyApplication.f7090a.getApplicationContext().getString(R.string.unknown)));
                    }
                } else if (i2 == 1) {
                    str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_player_in_hospital);
                } else if (i2 == 3) {
                    str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_player_in_plane);
                } else if (i2 == 2) {
                    str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_player_in_prison);
                } else if (i2 == 4) {
                    str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_player_in_tunnel);
                } else {
                    str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_unknown);
                }
                b.w(false);
                g.X(gVar2, str2);
                return;
        }
    }

    public void b(boolean z3, int i2, String str, long j6) {
        String str2;
        int i5;
        String string;
        int i6 = i2;
        String str3 = str;
        g gVar = ((f) this.f4487c).f11876b;
        if (z3) {
            if (!I1.b.l0(1, c.f5744o)) {
                i5 = e.E(gVar.f11906e1, gVar.f11908f1, 2);
                if (i5 > 0) {
                    com.bumptech.glide.d.m1(2, -i5, false, (J) null);
                }
            } else {
                i5 = 0;
            }
            if (i5 > o.getMainStatesObject().getNobilityCurrent()) {
                i5 = o.getMainStatesObject().getNobilityCurrent();
            }
            if (str3.equals("goldBullion") && j6 > 0) {
                string = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_steal_gold_bullion_dialog_message, new Object[]{U.a(j6)});
            } else if (j6 > 1) {
                if (i5 > 0) {
                    string = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_steal_cash_with_nobility_affect_dialog_message, new Object[]{U.a(j6), Integer.valueOf(i5)});
                } else {
                    string = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_steal_cash_dialog_message, new Object[]{U.a(j6)});
                }
            } else if (i5 > 0) {
                string = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_steal_zero_cash_with_nobility_affect_dialog_message, new Object[]{Integer.valueOf(i5)});
            } else {
                string = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_steal_zero_cash_dialog_message);
            }
            str2 = string;
            gVar.Z();
            Q.b(111, o.getAccountObject().getId(), (long) 1);
            String str4 = gVar.f11905e0;
            a.C0(4, 0, 1, str4);
            boolean equals = str3.equals("goldBullion");
            boolean z4 = this.f4486b;
            if (equals) {
                if (z4) {
                    c.k0(str4, new k(25, o.getAccountObject().getId(), o.getMainStatesObject().getNickName(), j6));
                } else {
                    c.k0(str4, new k(25, "player_not_visible", MyApplication.f7090a.getApplicationContext().getString(R.string.unknown), j6));
                }
            } else if (z4) {
                c.k0(str4, new k(16, o.getAccountObject().getId(), o.getMainStatesObject().getNickName(), j6));
            } else {
                c.k0(str4, new k(16, "player_not_visible", MyApplication.f7090a.getApplicationContext().getString(R.string.unknown), j6));
            }
        } else {
            str2 = i6 == 1 ? MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_player_in_hospital) : i6 == 3 ? MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_player_in_plane) : i6 == 2 ? MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_player_in_prison) : i6 == 4 ? MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_player_in_tunnel) : MyApplication.f7090a.getApplicationContext().getString(R.string.fight_error_message_unknown);
        }
        b.w(false);
        g.X(gVar, str2);
    }

    public Object then(Task task) {
        b bVar;
        boolean z3 = this.f4486b;
        e eVar = (e) this.f4487c;
        if (!z3 && (bVar = eVar.f4497m) != null) {
            eVar.f4495k.getClass();
            if ((bVar.f4481b + bVar.f4482c) - System.currentTimeMillis() > 300000) {
                return Tasks.forResult(c.a(eVar.f4497m));
            }
        }
        if (eVar.f4496l == null) {
            return Tasks.forResult(new c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new R2.k("No AppCheckProvider installed.")));
        }
        Task task2 = eVar.f4498n;
        if (task2 == null || task2.isComplete() || eVar.f4498n.isCanceled()) {
            eVar.f4498n = eVar.f4496l.a().onSuccessTask(eVar.g, new F3.e((Object) eVar, 5));
        }
        return eVar.f4498n.continueWithTask(eVar.h, new l(23));
    }
}
