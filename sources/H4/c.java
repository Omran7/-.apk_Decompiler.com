package H4;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.C0269a;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0509f;
import o3.d;

public final class c extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1021a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f1022b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(h hVar, View view, int i2) {
        super(view);
        this.f1021a = i2;
        this.f1022b = hVar;
    }

    public final void onClick(View view) {
        switch (this.f1021a) {
            case 0:
                super.onClick(view);
                ((InputMethodManager) MyApplication.f7090a.getApplicationContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                h hVar = this.f1022b;
                boolean equals = hVar.f1046p0.equals("@System");
                Context context = hVar.f1034d0;
                if (!equals) {
                    String str = hVar.f1046p0;
                    if (!str.equals("@System_Administration") && !str.equals("@gang")) {
                        String g = a.g(hVar.f1038h0);
                        if (o.getAccountObject().isBannedFromPrivateMessages() || o.getAccountObject().isBannedFromPrivateMessagesFromSystem()) {
                            a.n(MyApplication.f7090a, R.string.can_not_send_message_cause_banned_from_using_it, context, (String) null);
                            return;
                        } else if (g.isEmpty()) {
                            a.n(MyApplication.f7090a, R.string.can_not_send_empty_message, context, (String) null);
                            return;
                        } else if (o.getContactsObject().getBlockedMap().containsKey(str)) {
                            a.n(MyApplication.f7090a, R.string.can_not_send_private_message_to_player_you_blocked_him, context, (String) null);
                            return;
                        } else if (o.getContactsObject().getOthersBlockedMap().containsKey(str)) {
                            a.n(MyApplication.f7090a, R.string.can_not_send_private_message_to_player_he_blocked_you, context, (String) null);
                            return;
                        } else {
                            d.d(a.e(true), "players", str, "notificationObject", "hasUnReadPrivateMessage").I(Boolean.TRUE).addOnSuccessListener(new g(hVar, g, 1));
                            return;
                        }
                    }
                }
                a.n(MyApplication.f7090a, R.string.can_not_replay_to_system_message, context, (String) null);
                return;
            default:
                super.onClick(view);
                h hVar2 = this.f1022b;
                C0269a aVar = new C0269a(hVar2.p());
                aVar.h(hVar2);
                aVar.e(false);
                return;
        }
    }
}
