package f;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import k.C0738t;
import kotlin.jvm.internal.j;
import n0.C0852b;

/* renamed from: f.g  reason: case insensitive filesystem */
public final class C0516g implements C0852b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7782a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7783b;

    public C0516g(C0738t tVar) {
        j.e(tVar, "registry");
        this.f7783b = new LinkedHashSet();
        tVar.f("androidx.savedstate.Restarter", this);
    }

    public final Bundle a() {
        switch (this.f7782a) {
            case 0:
                Bundle bundle = new Bundle();
                ((C0518i) this.f7783b).n().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList((LinkedHashSet) this.f7783b));
                return bundle2;
        }
    }

    public C0516g(C0518i iVar) {
        this.f7783b = iVar;
    }
}
