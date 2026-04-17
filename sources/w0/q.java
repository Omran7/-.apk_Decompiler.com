package W0;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.canhub.cropper.CropImageActivity;
import kotlin.jvm.internal.j;

public final /* synthetic */ class q implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CropImageActivity f3968a;

    public /* synthetic */ q(CropImageActivity cropImageActivity) {
        this.f3968a = cropImageActivity;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        int i5 = CropImageActivity.f5846P;
        CropImageActivity cropImageActivity = this.f3968a;
        j.e(cropImageActivity, "this$0");
        if (i2 == 4 && keyEvent.getAction() == 1) {
            cropImageActivity.r();
            cropImageActivity.finish();
        }
        return true;
    }
}
