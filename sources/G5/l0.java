package G5;

import W0.s;
import android.net.Uri;
import android.support.v4.media.session.a;
import com.canhub.cropper.CropImageActivity;
import java.io.File;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import m5.C0849h;
import x5.l;

public final /* synthetic */ class l0 extends i implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f924a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i2, Object obj, Class cls, String str, String str2, int i5, int i6) {
        super(i2, obj, cls, str, str2, i5);
        this.f924a = i6;
    }

    public final Object invoke(Object obj) {
        switch (this.f924a) {
            case 0:
                ((C0030f0) this.receiver).a((Throwable) obj);
                return C0849h.f10203c;
            default:
                s sVar = (s) obj;
                j.e(sVar, "p0");
                CropImageActivity cropImageActivity = (CropImageActivity) this.receiver;
                int i2 = CropImageActivity.f5846P;
                cropImageActivity.getClass();
                int ordinal = sVar.ordinal();
                if (ordinal == 0) {
                    File createTempFile = File.createTempFile("tmp_image_file", ".png", cropImageActivity.getCacheDir());
                    createTempFile.createNewFile();
                    createTempFile.deleteOnExit();
                    Uri h02 = a.h0(cropImageActivity, createTempFile);
                    cropImageActivity.f5851M = h02;
                    cropImageActivity.f5853O.a(h02);
                } else if (ordinal == 1) {
                    cropImageActivity.f5852N.a("image/*");
                } else {
                    throw new RuntimeException();
                }
                return C0849h.f10203c;
        }
    }
}
