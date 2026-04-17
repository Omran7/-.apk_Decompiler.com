package androidx.lifecycle;

import android.os.Bundle;
import androidx.activity.u;
import com.bumptech.glide.d;
import java.util.Map;
import k.C0738t;
import kotlin.jvm.internal.j;
import m5.C0848g;
import n0.C0852b;

public final class K implements C0852b {

    /* renamed from: a  reason: collision with root package name */
    public final C0738t f5232a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5233b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f5234c;
    public final C0848g d;

    public K(C0738t tVar, U u6) {
        j.e(tVar, "savedStateRegistry");
        this.f5232a = tVar;
        this.d = d.N0(new u(u6, 3));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5234c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((L) this.d.a()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a6 = ((H) entry.getValue()).f5227e.a();
            if (!j.a(a6, Bundle.EMPTY)) {
                bundle.putBundle(str, a6);
            }
        }
        this.f5233b = false;
        return bundle;
    }

    public final void b() {
        if (!this.f5233b) {
            Bundle c3 = this.f5232a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.f5234c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (c3 != null) {
                bundle.putAll(c3);
            }
            this.f5234c = bundle;
            this.f5233b = true;
            L l6 = (L) this.d.a();
        }
    }
}
