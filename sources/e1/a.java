package E1;

import D1.b;
import X4.d;
import android.os.Parcel;

public final class a extends A1.a {
    public static final e CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final int f587a;

    /* renamed from: b  reason: collision with root package name */
    public final int f588b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f589c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f590e;

    /* renamed from: f  reason: collision with root package name */
    public final String f591f;

    /* renamed from: p  reason: collision with root package name */
    public final int f592p;

    /* renamed from: q  reason: collision with root package name */
    public final Class f593q;

    /* renamed from: r  reason: collision with root package name */
    public final String f594r;

    /* renamed from: s  reason: collision with root package name */
    public h f595s;

    /* renamed from: t  reason: collision with root package name */
    public final D1.a f596t;

    public a(int i2, int i5, boolean z3, int i6, boolean z4, String str, int i7, String str2, b bVar) {
        this.f587a = i2;
        this.f588b = i5;
        this.f589c = z3;
        this.d = i6;
        this.f590e = z4;
        this.f591f = str;
        this.f592p = i7;
        if (str2 == null) {
            this.f593q = null;
            this.f594r = null;
        } else {
            this.f593q = d.class;
            this.f594r = str2;
        }
        if (bVar == null) {
            this.f596t = null;
            return;
        }
        D1.a aVar = bVar.f508b;
        if (aVar != null) {
            this.f596t = aVar;
            return;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public static a v(int i2, String str) {
        return new a(7, true, 7, true, str, i2, (Class) null);
    }

    public final String toString() {
        d dVar = new d((Object) this);
        dVar.c(Integer.valueOf(this.f587a), "versionCode");
        dVar.c(Integer.valueOf(this.f588b), "typeIn");
        dVar.c(Boolean.valueOf(this.f589c), "typeInArray");
        dVar.c(Integer.valueOf(this.d), "typeOut");
        dVar.c(Boolean.valueOf(this.f590e), "typeOutArray");
        dVar.c(this.f591f, "outputFieldName");
        dVar.c(Integer.valueOf(this.f592p), "safeParcelFieldId");
        String str = this.f594r;
        if (str == null) {
            str = null;
        }
        dVar.c(str, "concreteTypeName");
        Class cls = this.f593q;
        if (cls != null) {
            dVar.c(cls.getCanonicalName(), "concreteType.class");
        }
        D1.a aVar = this.f596t;
        if (aVar != null) {
            dVar.c(aVar.getClass().getCanonicalName(), "converterName");
        }
        return dVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f587a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f588b);
        android.support.v4.media.session.a.Y0(parcel, 3, 4);
        parcel.writeInt(this.f589c ? 1 : 0);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d);
        android.support.v4.media.session.a.Y0(parcel, 5, 4);
        parcel.writeInt(this.f590e ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 6, this.f591f, false);
        android.support.v4.media.session.a.Y0(parcel, 7, 4);
        parcel.writeInt(this.f592p);
        b bVar = null;
        String str = this.f594r;
        if (str == null) {
            str = null;
        }
        android.support.v4.media.session.a.R0(parcel, 8, str, false);
        D1.a aVar = this.f596t;
        if (aVar != null) {
            if (aVar instanceof D1.a) {
                bVar = new b(aVar);
            } else {
                throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
            }
        }
        android.support.v4.media.session.a.Q0(parcel, 9, bVar, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public a(int i2, boolean z3, int i5, boolean z4, String str, int i6, Class cls) {
        this.f587a = 1;
        this.f588b = i2;
        this.f589c = z3;
        this.d = i5;
        this.f590e = z4;
        this.f591f = str;
        this.f592p = i6;
        this.f593q = cls;
        if (cls == null) {
            this.f594r = null;
        } else {
            this.f594r = cls.getCanonicalName();
        }
        this.f596t = null;
    }
}
