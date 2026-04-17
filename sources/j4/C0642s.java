package j4;

import H4.e;
import R2.b;
import Y4.C0248e;
import android.view.View;
import android.widget.RelativeLayout;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0451v;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import i3.C0592h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: j4.s  reason: case insensitive filesystem */
public final class C0642s extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9088a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0248e f9089b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0505b f9090c;
    public final /* synthetic */ C0645v d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0642s(C0645v vVar, RelativeLayout relativeLayout, C0248e eVar, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f9088a = i2;
        this.d = vVar;
        this.f9089b = eVar;
        this.f9090c = bVar;
    }

    public final void onClick(View view) {
        switch (this.f9088a) {
            case 0:
                super.onClick(view);
                b.w(true);
                a.d(a.x(C0592h.d().e(), "players"), "contactsObject", "requestsMap").E(this.f9089b.h).I((Object) null).addOnCompleteListener(new C0451v(this, 14));
                this.f9090c.dismiss();
                this.d.f9113f = false;
                return;
            case 1:
                C0505b bVar = this.f9090c;
                C0248e eVar = this.f9089b;
                C0645v vVar = this.d;
                super.onClick(view);
                try {
                    b.w(true);
                    int i2 = eVar.f4345i;
                    if (i2 == 0) {
                        C0645v.a(vVar, eVar);
                    } else if (i2 != 1) {
                        if (i2 == 2) {
                            vVar.getClass();
                            d.a(o.getAccountObject().getId(), o.getMainStatesObject().getNickName(), eVar.f4340a, eVar.f4341b, new X4.d(vVar, eVar, 23));
                        }
                    }
                    bVar.dismiss();
                    vVar.g = false;
                    return;
                } catch (Exception unused) {
                    bVar.dismiss();
                    vVar.g = false;
                    b.w(false);
                    c.s0(vVar.f9109a, MyApplication.f7090a.getApplicationContext().getString(R.string.request_not_exist_anymore), (String) null);
                    vVar.remove(eVar);
                    return;
                }
            case 2:
                super.onClick(view);
                Map<String, String> friendsMap = o.getContactsObject().getFriendsMap();
                C0248e eVar2 = this.f9089b;
                boolean containsKey = friendsMap.containsKey(eVar2.f4340a);
                C0505b bVar2 = this.f9090c;
                C0645v vVar2 = this.d;
                if (containsKey) {
                    b.w(true);
                    HashMap hashMap = new HashMap();
                    hashMap.put(o.getAccountObject().getId() + "/contactsObject/friendsMap/" + eVar2.f4340a, (Object) null);
                    hashMap.put(eVar2.f4340a + "/contactsObject/friendsMap/" + o.getAccountObject().getId(), (Object) null);
                    C0592h.d().e().E(b.a0()).E("players").J(hashMap).addOnSuccessListener(new e(this, 20));
                } else {
                    vVar2.remove(eVar2);
                    vVar2.notifyDataSetChanged();
                    v0.e(vVar2.f9109a, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully));
                    b.M0(R.raw.add_new_item);
                    bVar2.dismiss();
                    vVar2.d = false;
                }
                bVar2.dismiss();
                vVar2.d = false;
                return;
            default:
                super.onClick(view);
                b.w(true);
                HashMap hashMap2 = new HashMap();
                StringBuilder sb = new StringBuilder();
                sb.append(o.getAccountObject().getId());
                sb.append("/contactsObject/blockedMap/");
                C0248e eVar3 = this.f9089b;
                sb.append(eVar3.f4340a);
                hashMap2.put(sb.toString(), (Object) null);
                hashMap2.put(eVar3.f4340a + "/contactsObject/othersBlockedMap/" + o.getAccountObject().getId(), (Object) null);
                C0592h.d().e().E(b.a0()).E("players").J(hashMap2).addOnSuccessListener(new e(this, 21));
                this.f9090c.dismiss();
                this.d.f9112e = false;
                return;
        }
    }
}
