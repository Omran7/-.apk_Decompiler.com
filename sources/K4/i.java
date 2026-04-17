package K4;

import I1.b;
import android.content.Context;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;

public final class i implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f1524a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f1525b;

    public i(k kVar, boolean z3) {
        this.f1525b = kVar;
        this.f1524a = z3;
    }

    public final void onComplete(Task task) {
        boolean z3 = this.f1524a;
        k kVar = this.f1525b;
        if (z3) {
            b.v(kVar.f1560k0, kVar.f1552Z0.getMainStatesObject().getProfilePicUrl());
        }
        TextView textView = (TextView) kVar.f1565p0.getRootView().findViewWithTag("STATE_TAG");
        boolean isBannedFromChat = kVar.f1552Z0.getAccountObject().isBannedFromChat();
        Context context = kVar.f1553d0;
        if (isBannedFromChat || kVar.f1552Z0.getAccountObject().isBannedFromPrivateMessages() || kVar.f1552Z0.getAccountObject().isBannedFromNews()) {
            a.o(MyApplication.f7090a, R.string.account_state_banned_chat, textView);
            a.i(context, MyApplication.f7090a.getApplicationContext().getResources(), R.color.maximum_word_color, textView);
        } else {
            a.o(MyApplication.f7090a, R.string.account_state_normal, textView);
            a.i(context, MyApplication.f7090a.getApplicationContext().getResources(), R.color.fight_green_text, textView);
        }
        R2.b.w(false);
        a.k(MyApplication.f7090a, R.string.ban_category_successfully_updated, context);
    }
}
