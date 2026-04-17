package r1;

import E1.a;
import E1.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import com.google.android.material.datepicker.n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class e extends zzbz {
    public static final Parcelable.Creator<e> CREATOR = new n(27);

    /* renamed from: p  reason: collision with root package name */
    public static final HashMap f11181p;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f11182a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11183b;

    /* renamed from: c  reason: collision with root package name */
    public f f11184c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public String f11185e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11186f;

    static {
        HashMap hashMap = new HashMap();
        f11181p = hashMap;
        hashMap.put("authenticatorInfo", new a(11, false, 11, false, "authenticatorInfo", 2, f.class));
        hashMap.put("signature", new a(7, false, 7, false, "signature", 3, (Class) null));
        hashMap.put("package", new a(7, false, 7, false, "package", 4, (Class) null));
    }

    public e(HashSet hashSet, int i2, f fVar, String str, String str2, String str3) {
        this.f11182a = hashSet;
        this.f11183b = i2;
        this.f11184c = fVar;
        this.d = str;
        this.f11185e = str2;
        this.f11186f = str3;
    }

    public final void addConcreteTypeInternal(a aVar, String str, b bVar) {
        int i2 = aVar.f592p;
        if (i2 == 2) {
            this.f11184c = (f) bVar;
            this.f11182a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i2), bVar.getClass().getCanonicalName()}));
    }

    public final /* synthetic */ Map getFieldMappings() {
        return f11181p;
    }

    public final Object getFieldValue(a aVar) {
        int i2 = aVar.f592p;
        if (i2 == 1) {
            return Integer.valueOf(this.f11183b);
        }
        if (i2 == 2) {
            return this.f11184c;
        }
        if (i2 == 3) {
            return this.d;
        }
        if (i2 == 4) {
            return this.f11185e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f592p);
    }

    public final boolean isFieldSet(a aVar) {
        return this.f11182a.contains(Integer.valueOf(aVar.f592p));
    }

    public final void setStringInternal(a aVar, String str, String str2) {
        int i2 = aVar.f592p;
        if (i2 == 3) {
            this.d = str2;
        } else if (i2 == 4) {
            this.f11185e = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i2)}));
        }
        this.f11182a.add(Integer.valueOf(i2));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        HashSet hashSet = this.f11182a;
        if (hashSet.contains(1)) {
            android.support.v4.media.session.a.Y0(parcel, 1, 4);
            parcel.writeInt(this.f11183b);
        }
        if (hashSet.contains(2)) {
            android.support.v4.media.session.a.Q0(parcel, 2, this.f11184c, i2, true);
        }
        if (hashSet.contains(3)) {
            android.support.v4.media.session.a.R0(parcel, 3, this.d, true);
        }
        if (hashSet.contains(4)) {
            android.support.v4.media.session.a.R0(parcel, 4, this.f11185e, true);
        }
        if (hashSet.contains(5)) {
            android.support.v4.media.session.a.R0(parcel, 5, this.f11186f, true);
        }
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
