package d1;

import android.content.Context;
import androidx.emoji2.text.v;
import androidx.fragment.app.D;
import e1.C0483b;
import e1.C0484c;
import j1.i;

public final class e implements C0483b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7510a;

    /* renamed from: b  reason: collision with root package name */
    public final C0484c f7511b;

    public /* synthetic */ e(C0484c cVar, int i2) {
        this.f7510a = i2;
        this.f7511b = cVar;
    }

    public final Object get() {
        switch (this.f7510a) {
            case 0:
                return new C0461d((Context) this.f7511b.f7573a, new D(21), new v(21));
            default:
                return new i(Integer.valueOf(i.d).intValue(), (Context) this.f7511b.f7573a, "com.google.android.datatransport.events");
        }
    }
}
