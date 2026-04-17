package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.C0289v;
import androidx.fragment.app.I;
import androidx.lifecycle.C0302m;
import androidx.lifecycle.H;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import n0.C0852b;

public final /* synthetic */ class f implements C0852b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4620a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4621b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f4620a = i2;
        this.f4621b = obj;
    }

    public final Bundle a() {
        switch (this.f4620a) {
            case 0:
                Bundle bundle = new Bundle();
                m mVar = ((o) this.f4621b).f4649r;
                mVar.getClass();
                LinkedHashMap linkedHashMap = mVar.f4635b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(mVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(mVar.g));
                return bundle;
            case 1:
                C0289v vVar = (C0289v) this.f4621b;
                do {
                } while (C0289v.m(vVar.l()));
                vVar.f5198D.d(C0302m.ON_STOP);
                return new Bundle();
            case 2:
                return ((I) this.f4621b).R();
            default:
                return H.a((H) this.f4621b);
        }
    }
}
