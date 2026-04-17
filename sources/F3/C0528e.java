package f3;

import R2.i;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import e3.C0491B;
import e3.G;
import e3.m;
import e3.r;
import e3.w;
import e3.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: f3.e  reason: case insensitive filesystem */
public final class C0528e extends m {
    public static final Parcelable.Creator<C0528e> CREATOR = new C0525b(1);

    /* renamed from: a  reason: collision with root package name */
    public zzahn f7920a;

    /* renamed from: b  reason: collision with root package name */
    public C0526c f7921b;

    /* renamed from: c  reason: collision with root package name */
    public String f7922c;
    public String d = "com.google.firebase.auth.internal.DefaultFirebaseUser";

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f7923e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f7924f;

    /* renamed from: p  reason: collision with root package name */
    public String f7925p = "2";

    /* renamed from: q  reason: collision with root package name */
    public Boolean f7926q;

    /* renamed from: r  reason: collision with root package name */
    public C0529f f7927r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7928s;

    /* renamed from: t  reason: collision with root package name */
    public G f7929t;

    /* renamed from: u  reason: collision with root package name */
    public C0537n f7930u;

    /* renamed from: v  reason: collision with root package name */
    public List f7931v;

    public C0528e(i iVar, ArrayList arrayList) {
        I.g(iVar);
        iVar.b();
        this.f7922c = iVar.f2491b;
        y(arrayList);
    }

    public final String t() {
        return this.f7921b.f7914b;
    }

    public final String v() {
        Map map;
        zzahn zzahn = this.f7920a;
        if (zzahn == null || zzahn.zzc() == null || (map = (Map) C0536m.a(this.f7920a.zzc()).f7650b.get("firebase")) == null) {
            return null;
        }
        return (String) map.get("tenant");
    }

    public final boolean w() {
        String str;
        Boolean bool = this.f7926q;
        if (bool == null || bool.booleanValue()) {
            zzahn zzahn = this.f7920a;
            if (zzahn != null) {
                Map map = (Map) C0536m.a(zzahn.zzc()).f7650b.get("firebase");
                if (map != null) {
                    str = (String) map.get("sign_in_provider");
                } else {
                    str = null;
                }
            } else {
                str = "";
            }
            boolean z3 = true;
            if (this.f7923e.size() > 1 || (str != null && str.equals("custom"))) {
                z3 = false;
            }
            this.f7926q = Boolean.valueOf(z3);
        }
        return this.f7926q.booleanValue();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.Q0(parcel, 1, this.f7920a, i2, false);
        a.Q0(parcel, 2, this.f7921b, i2, false);
        a.R0(parcel, 3, this.f7922c, false);
        a.R0(parcel, 4, this.d, false);
        a.V0(parcel, 5, this.f7923e, false);
        a.T0(parcel, 6, this.f7924f);
        a.R0(parcel, 7, this.f7925p, false);
        a.I0(parcel, 8, Boolean.valueOf(w()));
        a.Q0(parcel, 9, this.f7927r, i2, false);
        boolean z3 = this.f7928s;
        a.Y0(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        a.Q0(parcel, 11, this.f7929t, i2, false);
        a.Q0(parcel, 12, this.f7930u, i2, false);
        a.V0(parcel, 13, this.f7931v, false);
        a.X0(W02, parcel);
    }

    public final synchronized C0528e y(ArrayList arrayList) {
        try {
            I.g(arrayList);
            this.f7923e = new ArrayList(arrayList.size());
            this.f7924f = new ArrayList(arrayList.size());
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                C0491B b6 = (C0491B) arrayList.get(i2);
                if (b6.t().equals("firebase")) {
                    this.f7921b = (C0526c) b6;
                } else {
                    this.f7924f.add(b6.t());
                }
                this.f7923e.add((C0526c) b6);
            }
            if (this.f7921b == null) {
                this.f7921b = (C0526c) this.f7923e.get(0);
            }
        } finally {
            while (true) {
            }
        }
        return this;
    }

    public final void z(ArrayList arrayList) {
        C0537n nVar;
        if (arrayList.isEmpty()) {
            nVar = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                r rVar = (r) it2.next();
                if (rVar instanceof w) {
                    arrayList2.add((w) rVar);
                } else if (rVar instanceof z) {
                    arrayList3.add((z) rVar);
                }
            }
            nVar = new C0537n(arrayList2, arrayList3);
        }
        this.f7930u = nVar;
    }
}
