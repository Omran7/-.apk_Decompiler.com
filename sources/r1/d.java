package r1;

import E1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.material.datepicker.n;
import java.util.ArrayList;
import java.util.Map;
import n.e;
import n.j;

public final class d extends zzbz {
    public static final Parcelable.Creator<d> CREATOR = new n(26);

    /* renamed from: p  reason: collision with root package name */
    public static final e f11175p;

    /* renamed from: a  reason: collision with root package name */
    public final int f11176a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f11177b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f11178c;
    public ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f11179e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f11180f;

    /* JADX WARNING: type inference failed for: r0v1, types: [n.e, n.j] */
    static {
        ? jVar = new j(0);
        f11175p = jVar;
        jVar.put("registered", a.v(2, "registered"));
        jVar.put("in_progress", a.v(3, "in_progress"));
        jVar.put("success", a.v(4, "success"));
        jVar.put("failed", a.v(5, "failed"));
        jVar.put("escrowed", a.v(6, "escrowed"));
    }

    public d(int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f11176a = i2;
        this.f11177b = arrayList;
        this.f11178c = arrayList2;
        this.d = arrayList3;
        this.f11179e = arrayList4;
        this.f11180f = arrayList5;
    }

    public final Map getFieldMappings() {
        return f11175p;
    }

    public final Object getFieldValue(a aVar) {
        switch (aVar.f592p) {
            case 1:
                return Integer.valueOf(this.f11176a);
            case 2:
                return this.f11177b;
            case 3:
                return this.f11178c;
            case 4:
                return this.d;
            case 5:
                return this.f11179e;
            case zzaky.zzf.zzf:
                return this.f11180f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f592p);
        }
    }

    public final boolean isFieldSet(a aVar) {
        return true;
    }

    public final void setStringsInternal(a aVar, String str, ArrayList arrayList) {
        int i2 = aVar.f592p;
        if (i2 == 2) {
            this.f11177b = arrayList;
        } else if (i2 == 3) {
            this.f11178c = arrayList;
        } else if (i2 == 4) {
            this.d = arrayList;
        } else if (i2 == 5) {
            this.f11179e = arrayList;
        } else if (i2 == 6) {
            this.f11180f = arrayList;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(i2)}));
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f11176a);
        android.support.v4.media.session.a.T0(parcel, 2, this.f11177b);
        android.support.v4.media.session.a.T0(parcel, 3, this.f11178c);
        android.support.v4.media.session.a.T0(parcel, 4, this.d);
        android.support.v4.media.session.a.T0(parcel, 5, this.f11179e);
        android.support.v4.media.session.a.T0(parcel, 6, this.f11180f);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
