package W0;

import android.net.Uri;
import c.C0327b;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import kotlin.jvm.internal.j;

/* renamed from: W0.o  reason: case insensitive filesystem */
public final /* synthetic */ class C0243o implements C0327b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3965a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CropImageActivity f3966b;

    public /* synthetic */ C0243o(CropImageActivity cropImageActivity, int i2) {
        this.f3965a = i2;
        this.f3966b = cropImageActivity;
    }

    public final void e(Object obj) {
        CropImageActivity cropImageActivity = this.f3966b;
        switch (this.f3965a) {
            case 0:
                Uri uri = (Uri) obj;
                int i2 = CropImageActivity.f5846P;
                j.e(cropImageActivity, "this$0");
                if (uri == null) {
                    cropImageActivity.r();
                    return;
                }
                cropImageActivity.f5847I = uri;
                CropImageView cropImageView = cropImageActivity.f5849K;
                if (cropImageView != null) {
                    cropImageView.setImageUriAsync(uri);
                    return;
                }
                return;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i5 = CropImageActivity.f5846P;
                j.e(cropImageActivity, "this$0");
                if (booleanValue) {
                    Uri uri2 = cropImageActivity.f5851M;
                    if (uri2 == null) {
                        cropImageActivity.r();
                        return;
                    }
                    cropImageActivity.f5847I = uri2;
                    CropImageView cropImageView2 = cropImageActivity.f5849K;
                    if (cropImageView2 != null) {
                        cropImageView2.setImageUriAsync(uri2);
                        return;
                    }
                    return;
                }
                cropImageActivity.r();
                return;
        }
    }
}
