package j4;

import android.view.View;
import android.widget.ImageView;
import e5.C0505b;
import e5.C0509f;

/* renamed from: j4.f  reason: case insensitive filesystem */
public final class C0622f extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9004a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f9005b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0626h f9006c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0622f(C0626h hVar, ImageView imageView, C0505b bVar, int i2) {
        super(imageView);
        this.f9004a = i2;
        this.f9006c = hVar;
        this.f9005b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f9004a) {
            case 0:
                super.onClick(view);
                this.f9005b.dismiss();
                this.f9006c.f9019c = false;
                return;
            default:
                super.onClick(view);
                this.f9005b.dismiss();
                this.f9006c.f9019c = false;
                return;
        }
    }
}
