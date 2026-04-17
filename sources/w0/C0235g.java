package W0;

import G5.C;
import G5.F;
import I1.b;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import kotlin.jvm.internal.j;
import m5.C0849h;
import o5.d;
import p5.a;
import q5.h;
import x5.p;

/* renamed from: W0.g  reason: case insensitive filesystem */
public final class C0235g extends h implements p {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f3947a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0237i f3948b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0234f f3949c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0235g(C0237i iVar, C0234f fVar, d dVar) {
        super(2, dVar);
        this.f3948b = iVar;
        this.f3949c = fVar;
    }

    public final d create(Object obj, d dVar) {
        C0235g gVar = new C0235g(this.f3948b, this.f3949c, dVar);
        gVar.f3947a = obj;
        return gVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        C0849h hVar = C0849h.f10203c;
        ((C0235g) create((C) obj, (d) obj2)).invokeSuspend(hVar);
        return hVar;
    }

    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        CropImageView cropImageView;
        CropImageView cropImageView2;
        CropImageView cropImageView3;
        a aVar = a.f11033a;
        b.I0(obj);
        boolean m6 = F.m((C) this.f3947a);
        C0234f fVar = this.f3949c;
        boolean z3 = false;
        if (m6 && (cropImageView = (CropImageView) this.f3948b.f3956e.get()) != null) {
            j.e(fVar, "result");
            cropImageView.f5872T = null;
            cropImageView.h();
            Exception exc = fVar.g;
            if (exc == null) {
                int i2 = fVar.d;
                cropImageView.f5883s = i2;
                cropImageView.f5885u = fVar.f3945e;
                cropImageView.f5886v = fVar.f3946f;
                cropImageView.f(fVar.f3943b, 0, fVar.f3942a, fVar.f3944c, i2);
            }
            F f6 = cropImageView.f5862J;
            if (f6 != null) {
                CropImageActivity cropImageActivity = (CropImageActivity) f6;
                j.e(fVar.f3942a, "uri");
                if (exc == null) {
                    w wVar = cropImageActivity.f5848J;
                    if (wVar != null) {
                        Rect rect = wVar.f4018f0;
                        if (!(rect == null || (cropImageView3 = cropImageActivity.f5849K) == null)) {
                            cropImageView3.setCropRect(rect);
                        }
                        w wVar2 = cropImageActivity.f5848J;
                        if (wVar2 != null) {
                            int i5 = wVar2.f4019g0;
                            if (i5 > 0 && (cropImageView2 = cropImageActivity.f5849K) != null) {
                                cropImageView2.setRotatedDegrees(i5);
                            }
                            w wVar3 = cropImageActivity.f5848J;
                            if (wVar3 == null) {
                                j.g("cropImageOptions");
                                throw null;
                            } else if (wVar3.f4029p0) {
                                cropImageActivity.p();
                            }
                        } else {
                            j.g("cropImageOptions");
                            throw null;
                        }
                    } else {
                        j.g("cropImageOptions");
                        throw null;
                    }
                } else {
                    cropImageActivity.q((Uri) null, exc, 1);
                }
            }
            z3 = true;
        }
        if (!z3 && (bitmap = fVar.f3943b) != null) {
            bitmap.recycle();
        }
        return C0849h.f10203c;
    }
}
