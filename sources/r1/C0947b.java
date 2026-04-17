package r1;

import E1.a;
import E1.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import com.google.android.material.datepicker.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: r1.b  reason: case insensitive filesystem */
public final class C0947b extends zzbz {
    public static final Parcelable.Creator<C0947b> CREATOR = new n(25);

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f11170f;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f11171a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11172b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f11173c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public d f11174e;

    static {
        HashMap hashMap = new HashMap();
        f11170f = hashMap;
        hashMap.put("authenticatorData", new a(11, true, 11, true, "authenticatorData", 2, e.class));
        hashMap.put("progress", new a(11, false, 11, false, "progress", 4, d.class));
    }

    public C0947b(HashSet hashSet, int i2, ArrayList arrayList, int i5, d dVar) {
        this.f11171a = hashSet;
        this.f11172b = i2;
        this.f11173c = arrayList;
        this.d = i5;
        this.f11174e = dVar;
    }

    public final void addConcreteTypeArrayInternal(a aVar, String str, ArrayList arrayList) {
        int i2 = aVar.f592p;
        if (i2 == 2) {
            this.f11173c = arrayList;
            this.f11171a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[]{Integer.valueOf(i2), arrayList.getClass().getCanonicalName()}));
    }

    public final void addConcreteTypeInternal(a aVar, String str, b bVar) {
        int i2 = aVar.f592p;
        if (i2 == 4) {
            this.f11174e = (d) bVar;
            this.f11171a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i2), bVar.getClass().getCanonicalName()}));
    }

    public final /* synthetic */ Map getFieldMappings() {
        return f11170f;
    }

    public final Object getFieldValue(a aVar) {
        int i2 = aVar.f592p;
        if (i2 == 1) {
            return Integer.valueOf(this.f11172b);
        }
        if (i2 == 2) {
            return this.f11173c;
        }
        if (i2 == 4) {
            return this.f11174e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f592p);
    }

    public final boolean isFieldSet(a aVar) {
        return this.f11171a.contains(Integer.valueOf(aVar.f592p));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        HashSet hashSet = this.f11171a;
        if (hashSet.contains(1)) {
            android.support.v4.media.session.a.Y0(parcel, 1, 4);
            parcel.writeInt(this.f11172b);
        }
        if (hashSet.contains(2)) {
            android.support.v4.media.session.a.V0(parcel, 2, this.f11173c, true);
        }
        if (hashSet.contains(3)) {
            android.support.v4.media.session.a.Y0(parcel, 3, 4);
            parcel.writeInt(this.d);
        }
        if (hashSet.contains(4)) {
            android.support.v4.media.session.a.Q0(parcel, 4, this.f11174e, i2, true);
        }
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
