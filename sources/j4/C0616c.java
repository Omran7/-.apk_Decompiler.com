package j4;

import H4.e;
import R2.b;
import Y4.C0245b;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import b5.l;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import i3.C0590f;
import i3.C0592h;
import i3.n;
import java.util.HashMap;

/* renamed from: j4.c  reason: case insensitive filesystem */
public final class C0616c extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8980a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f8981b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0505b f8982c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0626h f8983e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0616c(C0626h hVar, RelativeLayout relativeLayout, EditText editText, C0505b bVar, int i2, int i5) {
        super(relativeLayout);
        this.f8980a = i5;
        this.f8983e = hVar;
        this.f8981b = editText;
        this.f8982c = bVar;
        this.d = i2;
    }

    public final void onClick(View view) {
        switch (this.f8980a) {
            case 0:
                super.onClick(view);
                String g = a.g(this.f8981b);
                boolean isEmpty = g.isEmpty();
                C0626h hVar = this.f8983e;
                if (isEmpty) {
                    a.n(MyApplication.f7090a, R.string.can_not_send_empty_message, hVar.f9018b, (String) null);
                    return;
                }
                this.f8982c.dismiss();
                hVar.f9019c = false;
                b.w(true);
                HashMap hashMap = new HashMap();
                hashMap.put("playerId", o.getAccountObject().getId());
                hashMap.put("playerNickName", o.getMainStatesObject().getNickName());
                int i2 = this.d;
                hashMap.put("adminId", ((C0245b) hVar.getItem(i2)).f4328a);
                hashMap.put("adminNickName", ((C0245b) hVar.getItem(i2)).f4329b);
                hashMap.put("message", g);
                hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                hashMap.put("unixTime", n.f8294a);
                String F = C0592h.b().e().E("Admins").E("reports").G().F();
                C0592h.b().e().E("Admins").E("reports").E(c.f5744o + F).I(hashMap).addOnSuccessListener(new e(hVar, 17));
                return;
            default:
                super.onClick(view);
                String g5 = a.g(this.f8981b);
                boolean isEmpty2 = g5.isEmpty();
                C0626h hVar2 = this.f8983e;
                if (isEmpty2) {
                    a.n(MyApplication.f7090a, R.string.can_not_send_empty_message, hVar2.f9018b, (String) null);
                    return;
                }
                this.f8982c.dismiss();
                hVar2.f9019c = false;
                b.w(true);
                int i5 = this.d;
                String str = ((C0245b) hVar2.getItem(i5)).f4328a;
                String str2 = ((C0245b) hVar2.getItem(i5)).f4329b;
                C0590f E6 = a.x(C0592h.d().e(), "messages").E(o.getAccountObject().getId());
                E6.E("chatData").E(str).I(new l(str, str2, true)).addOnSuccessListener(new C0624g(hVar2, g5, E6, str));
                return;
        }
    }
}
