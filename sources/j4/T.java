package j4;

import F3.h;
import H4.d;
import R2.b;
import android.view.View;
import android.widget.RelativeLayout;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import java.util.HashMap;

public final class T extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8946a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8947b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0505b f8948c;
    public final /* synthetic */ H d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public T(H h, RelativeLayout relativeLayout, int i2, int i5, C0505b bVar) {
        super(relativeLayout);
        this.d = h;
        this.f8946a = i2;
        this.f8947b = i5;
        this.f8948c = bVar;
    }

    public final void onClick(View view) {
        super.onClick(view);
        H h = this.d;
        h.getClass();
        b.w(true);
        int i2 = this.f8946a;
        int i5 = this.f8947b;
        S s6 = new S(h, i2, i5);
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("playerId", o.getAccountObject().getId());
        hashMap.put("gangId", o.getGangObject().getId());
        hashMap.put("militiaId", Integer.valueOf(i5));
        h.b().a("joinToGangMilitia").q(hashMap).addOnCompleteListener(new d((Object) s6, 20));
        this.f8948c.dismiss();
        h.d = false;
    }
}
