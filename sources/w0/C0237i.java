package W0;

import G5.C;
import G5.C0034h0;
import G5.N;
import G5.k0;
import G5.v0;
import I5.o;
import K5.e;
import R2.b;
import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.canhub.cropper.CropImageView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.j;
import o5.i;

/* renamed from: W0.i  reason: case insensitive filesystem */
public final class C0237i implements C {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3953a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f3954b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3955c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f3956e;

    /* renamed from: f  reason: collision with root package name */
    public v0 f3957f = new k0((C0034h0) null);

    public C0237i(Context context, CropImageView cropImageView, Uri uri) {
        j.e(cropImageView, "cropImageView");
        j.e(uri, "uri");
        this.f3953a = context;
        this.f3954b = uri;
        this.f3956e = new WeakReference(cropImageView);
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f6 = displayMetrics.density;
        double d6 = f6 > 1.0f ? 1.0d / ((double) f6) : 1.0d;
        this.f3955c = (int) (((double) displayMetrics.widthPixels) * d6);
        this.d = (int) (((double) displayMetrics.heightPixels) * d6);
    }

    public final i b() {
        e eVar = N.f877a;
        H5.e eVar2 = o.f1276a;
        v0 v0Var = this.f3957f;
        eVar2.getClass();
        return b.v0(eVar2, v0Var);
    }
}
