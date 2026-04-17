package n4;

import android.view.View;
import androidx.fragment.app.C0269a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import e5.C0509f;

public final class b extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10355a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f10356b;

    public /* synthetic */ b(c cVar, int i2) {
        this.f10355a = i2;
        this.f10356b = cVar;
    }

    public final void onClick(View view) {
        switch (this.f10355a) {
            case 0:
                super.onClick(view);
                c.V(this.f10356b, 9);
                return;
            case 1:
                super.onClick(view);
                c.V(this.f10356b, 10);
                return;
            case 2:
                super.onClick(view);
                c cVar = this.f10356b;
                C0269a aVar = new C0269a(cVar.p());
                aVar.h(cVar);
                aVar.e(false);
                return;
            case 3:
                super.onClick(view);
                c.V(this.f10356b, 0);
                return;
            case 4:
                super.onClick(view);
                c.V(this.f10356b, 1);
                return;
            case 5:
                super.onClick(view);
                c.V(this.f10356b, 2);
                return;
            case zzaky.zzf.zzf:
                super.onClick(view);
                c.V(this.f10356b, 3);
                return;
            case zzaky.zzf.zzg:
                super.onClick(view);
                c.V(this.f10356b, 4);
                return;
            case 8:
                super.onClick(view);
                c.V(this.f10356b, 5);
                return;
            case 9:
                super.onClick(view);
                c.V(this.f10356b, 6);
                return;
            case 10:
                super.onClick(view);
                c.V(this.f10356b, 7);
                return;
            default:
                super.onClick(view);
                c.V(this.f10356b, 8);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar, View view) {
        super(view);
        this.f10355a = 2;
        this.f10356b = cVar;
    }
}
