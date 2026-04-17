package j4;

import android.view.View;
import e5.C0505b;
import e5.C0509f;

public final class X extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8957a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f8958b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Z f8959c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(Z z3, View view, C0505b bVar, int i2) {
        super(view);
        this.f8957a = i2;
        this.f8959c = z3;
        this.f8958b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f8957a) {
            case 0:
                super.onClick(view);
                this.f8958b.dismiss();
                this.f8959c.f8968f = false;
                return;
            default:
                super.onClick(view);
                this.f8958b.dismiss();
                this.f8959c.f8967e = false;
                return;
        }
    }
}
