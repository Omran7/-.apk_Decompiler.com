package j4;

import android.view.View;
import e5.C0505b;
import e5.C0509f;

/* renamed from: j4.k  reason: case insensitive filesystem */
public final class C0632k extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9037a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f9038b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0639o f9039c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0632k(C0639o oVar, View view, C0505b bVar, int i2) {
        super(view);
        this.f9037a = i2;
        this.f9039c = oVar;
        this.f9038b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f9037a) {
            case 0:
                super.onClick(view);
                this.f9038b.dismiss();
                this.f9039c.f9067c = false;
                return;
            default:
                super.onClick(view);
                this.f9038b.dismiss();
                this.f9039c.d = false;
                return;
        }
    }
}
