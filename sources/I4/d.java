package I4;

import F3.h;
import P4.a;
import R2.b;
import android.view.View;
import android.widget.RelativeLayout;
import com.bumptech.glide.c;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import java.util.HashMap;

public final class d extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1197a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f1198b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f1199c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, RelativeLayout relativeLayout, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f1197a = i2;
        this.f1199c = fVar;
        this.f1198b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f1197a) {
            case 0:
                super.onClick(view);
                int courageCurrent = o.getMainStatesObject().getCourageCurrent();
                f fVar = this.f1199c;
                if (courageCurrent < 20) {
                    c.p(fVar.f1200d0, 2002);
                } else {
                    fVar.getClass();
                    b.w(true);
                    a aVar = new a(fVar, 2);
                    HashMap hashMap = new HashMap();
                    hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                    hashMap.put("playerId", o.getAccountObject().getId());
                    h.b().a("escapeFromPrison").q(hashMap).addOnCompleteListener(new a(aVar, 7));
                }
                this.f1198b.dismiss();
                fVar.s0 = false;
                return;
            default:
                super.onClick(view);
                this.f1198b.dismiss();
                this.f1199c.s0 = false;
                return;
        }
    }
}
