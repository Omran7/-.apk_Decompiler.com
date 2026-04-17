package c;

import K1.e;
import android.os.Bundle;
import android.support.v4.media.session.a;
import androidx.activity.m;
import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0306q;
import androidx.lifecycle.C0307s;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.j;

/* renamed from: c.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0329d implements C0306q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f5562a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f5563b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0327b f5564c;
    public final /* synthetic */ a d;

    public /* synthetic */ C0329d(m mVar, String str, C0327b bVar, a aVar) {
        this.f5562a = mVar;
        this.f5563b = str;
        this.f5564c = bVar;
        this.d = aVar;
    }

    public final void a(C0307s sVar, C0302m mVar) {
        m mVar2 = this.f5562a;
        j.e(mVar2, "this$0");
        String str = this.f5563b;
        j.e(str, "$key");
        C0327b bVar = this.f5564c;
        a aVar = this.d;
        C0302m mVar3 = C0302m.ON_START;
        LinkedHashMap linkedHashMap = mVar2.f4637e;
        if (mVar3 == mVar) {
            linkedHashMap.put(str, new C0330e(aVar, bVar));
            LinkedHashMap linkedHashMap2 = mVar2.f4638f;
            if (linkedHashMap2.containsKey(str)) {
                Object obj = linkedHashMap2.get(str);
                linkedHashMap2.remove(str);
                bVar.e(obj);
            }
            Bundle bundle = mVar2.g;
            C0326a aVar2 = (C0326a) e.G(bundle, str);
            if (aVar2 != null) {
                bundle.remove(str);
                bVar.e(aVar.p0(aVar2.f5561b, aVar2.f5560a));
            }
        } else if (C0302m.ON_STOP == mVar) {
            linkedHashMap.remove(str);
        } else if (C0302m.ON_DESTROY == mVar) {
            mVar2.f(str);
        }
    }
}
