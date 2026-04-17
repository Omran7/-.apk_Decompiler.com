package y4;

import A2.f;
import b5.h;
import com.bumptech.glide.c;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import k.C0724m;

/* renamed from: y4.a  reason: case insensitive filesystem */
public final class C1114a implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f12711a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12712b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0724m f12713c;

    public C1114a(C0724m mVar, h hVar, int i2) {
        this.f12713c = mVar;
        this.f12711a = hVar;
        this.f12712b = i2;
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        Long valueOf = Long.valueOf(c.f5744o * 1000);
        h hVar = this.f12711a;
        hVar.setUnixTimeInMilli(valueOf);
        C0724m mVar = this.f12713c;
        ((C1118e) ((f) mVar.f9345b).d).f12741w0.add(hVar);
        f fVar = (f) mVar.f9345b;
        if (this.f12712b == ((ArrayList) fVar.f30c).size() - 1) {
            ((C1118e) fVar.d).f12742x0 = true;
        }
    }
}
