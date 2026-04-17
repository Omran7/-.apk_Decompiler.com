package androidx.fragment.app;

import a.C0251c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new C0251c(14);

    /* renamed from: a  reason: collision with root package name */
    public final String f5032a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5033b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5034c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5035e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5036f;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f5037p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f5038q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f5039r;

    /* renamed from: s  reason: collision with root package name */
    public final Bundle f5040s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f5041t;

    /* renamed from: u  reason: collision with root package name */
    public final int f5042u;

    /* renamed from: v  reason: collision with root package name */
    public Bundle f5043v;

    public M(C0286s sVar) {
        this.f5032a = sVar.getClass().getName();
        this.f5033b = sVar.f5177e;
        this.f5034c = sVar.f5185v;
        this.d = sVar.f5151E;
        this.f5035e = sVar.F;
        this.f5036f = sVar.f5152G;
        this.f5037p = sVar.f5155J;
        this.f5038q = sVar.f5184u;
        this.f5039r = sVar.f5154I;
        this.f5040s = sVar.f5178f;
        this.f5041t = sVar.f5153H;
        this.f5042u = sVar.f5166U.ordinal();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f5032a);
        sb.append(" (");
        sb.append(this.f5033b);
        sb.append(")}:");
        if (this.f5034c) {
            sb.append(" fromLayout");
        }
        int i2 = this.f5035e;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f5036f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f5037p) {
            sb.append(" retainInstance");
        }
        if (this.f5038q) {
            sb.append(" removing");
        }
        if (this.f5039r) {
            sb.append(" detached");
        }
        if (this.f5041t) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f5032a);
        parcel.writeString(this.f5033b);
        parcel.writeInt(this.f5034c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f5035e);
        parcel.writeString(this.f5036f);
        parcel.writeInt(this.f5037p ? 1 : 0);
        parcel.writeInt(this.f5038q ? 1 : 0);
        parcel.writeInt(this.f5039r ? 1 : 0);
        parcel.writeBundle(this.f5040s);
        parcel.writeInt(this.f5041t ? 1 : 0);
        parcel.writeBundle(this.f5043v);
        parcel.writeInt(this.f5042u);
    }

    public M(Parcel parcel) {
        this.f5032a = parcel.readString();
        this.f5033b = parcel.readString();
        boolean z3 = false;
        this.f5034c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.f5035e = parcel.readInt();
        this.f5036f = parcel.readString();
        this.f5037p = parcel.readInt() != 0;
        this.f5038q = parcel.readInt() != 0;
        this.f5039r = parcel.readInt() != 0;
        this.f5040s = parcel.readBundle();
        this.f5041t = parcel.readInt() != 0 ? true : z3;
        this.f5043v = parcel.readBundle();
        this.f5042u = parcel.readInt();
    }
}
