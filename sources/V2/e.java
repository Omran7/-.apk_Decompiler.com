package v2;

import R2.b;
import android.view.View;
import com.google.android.material.internal.CheckableImageButton;

public final class e extends m {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f12177e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(l lVar, int i2) {
        super(lVar);
        this.f12177e = i2;
    }

    public void r() {
        switch (this.f12177e) {
            case 0:
                l lVar = this.f12218b;
                lVar.f12214x = null;
                CheckableImageButton checkableImageButton = lVar.f12206p;
                checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
                b.P0(checkableImageButton, (View.OnLongClickListener) null);
                return;
            default:
                return;
        }
    }
}
