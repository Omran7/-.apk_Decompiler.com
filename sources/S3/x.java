package S3;

import A1.a;
import Q1.w;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import n.e;
import n.j;

public final class x extends a {
    public static final Parcelable.Creator<x> CREATOR = new w(12);

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f2707a;

    /* renamed from: b  reason: collision with root package name */
    public e f2708b;

    public x(Bundle bundle) {
        this.f2707a = bundle;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [n.e, n.j] */
    public final Map v() {
        if (this.f2708b == null) {
            ? jVar = new j(0);
            Bundle bundle = this.f2707a;
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                        jVar.put(next, str);
                    }
                }
            }
            this.f2708b = jVar;
        }
        return this.f2708b;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.J0(parcel, 2, this.f2707a, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
