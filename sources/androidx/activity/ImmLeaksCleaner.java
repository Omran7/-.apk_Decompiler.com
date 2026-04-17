package androidx.activity;

import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0306q;
import androidx.lifecycle.C0307s;
import com.bumptech.glide.d;

public final class ImmLeaksCleaner implements C0306q {
    static {
        d.N0(r.f4664a);
    }

    public final void a(C0307s sVar, C0302m mVar) {
        if (mVar == C0302m.ON_DESTROY) {
            throw null;
        }
    }
}
