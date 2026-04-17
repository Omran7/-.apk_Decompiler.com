package W0;

import G5.C;
import G5.F;
import I1.b;
import android.graphics.Bitmap;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import kotlin.jvm.internal.j;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

/* renamed from: W0.b  reason: case insensitive filesystem */
public final class C0230b extends h implements p {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f3914a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0233e f3915b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0229a f3916c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0230b(C0233e eVar, C0229a aVar, d dVar) {
        super(2, dVar);
        this.f3915b = eVar;
        this.f3916c = aVar;
    }

    public final d create(Object obj, d dVar) {
        C0230b bVar = new C0230b(this.f3915b, this.f3916c, dVar);
        bVar.f3914a = obj;
        return bVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        C0849h hVar = C0849h.f10203c;
        ((C0230b) create((C) obj, (d) obj2)).invokeSuspend(hVar);
        return hVar;
    }

    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        CropImageView cropImageView;
        a aVar = a.f11033a;
        b.I0(obj);
        boolean m6 = F.m((C) this.f3914a);
        C0229a aVar2 = this.f3916c;
        boolean z3 = false;
        if (m6 && (cropImageView = (CropImageView) this.f3915b.f3927b.get()) != null) {
            j.e(aVar2, "result");
            cropImageView.f5873U = null;
            cropImageView.h();
            B b6 = cropImageView.f5863K;
            if (b6 != null) {
                float[] cropPoints = cropImageView.getCropPoints();
                cropImageView.getCropRect();
                cropImageView.getWholeImageRect();
                cropImageView.getRotatedDegrees();
                j.e(cropPoints, "cropPoints");
                ((CropImageActivity) b6).q(aVar2.f3912b, aVar2.f3913c, aVar2.d);
            }
            z3 = true;
        }
        if (!z3 && (bitmap = aVar2.f3911a) != null) {
            bitmap.recycle();
        }
        return C0849h.f10203c;
    }
}
