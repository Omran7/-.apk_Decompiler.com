package W0;

import G5.l0;
import android.content.DialogInterface;
import com.canhub.cropper.CropImageActivity;

public final /* synthetic */ class r implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l0 f3969a;

    public /* synthetic */ r(l0 l0Var) {
        this.f3969a = l0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        s sVar;
        int i5 = CropImageActivity.f5846P;
        l0 l0Var = this.f3969a;
        if (i2 == 0) {
            sVar = s.f3970a;
        } else {
            sVar = s.f3971b;
        }
        l0Var.invoke(sVar);
    }
}
