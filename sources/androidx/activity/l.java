package androidx.activity;

import G3.c;
import android.content.Intent;
import android.content.IntentSender;
import c.C0327b;
import c.C0330e;
import java.io.Serializable;
import k0.C0752a;
import kotlin.jvm.internal.j;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4631a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4632b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4633c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l(Object obj, int i2, Object obj2, int i5) {
        this.f4631a = i5;
        this.f4632b = obj;
        this.f4633c = i2;
        this.d = obj2;
    }

    public final void run() {
        C0327b bVar;
        switch (this.f4631a) {
            case 0:
                m mVar = (m) this.f4632b;
                j.e(mVar, "this$0");
                Object obj = ((c) this.d).f840a;
                String str = (String) mVar.f4634a.get(Integer.valueOf(this.f4633c));
                if (str != null) {
                    C0330e eVar = (C0330e) mVar.f4637e.get(str);
                    if (eVar != null) {
                        bVar = eVar.f5565a;
                    } else {
                        bVar = null;
                    }
                    if (bVar == null) {
                        mVar.g.remove(str);
                        mVar.f4638f.put(str, obj);
                        return;
                    }
                    C0327b bVar2 = eVar.f5565a;
                    if (mVar.d.remove(str)) {
                        bVar2.e(obj);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m mVar2 = (m) this.f4632b;
                j.e(mVar2, "this$0");
                IntentSender.SendIntentException sendIntentException = (IntentSender.SendIntentException) this.d;
                j.e(sendIntentException, "$e");
                mVar2.a(this.f4633c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
                return;
            default:
                ((C0752a) this.f4632b).f9432b.d(this.f4633c, (Serializable) this.d);
                return;
        }
    }
}
