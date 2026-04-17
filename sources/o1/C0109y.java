package O1;

import D1.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: O1.y  reason: case insensitive filesystem */
public final class C0109y extends C0097l {
    public static final Parcelable.Creator<C0109y> CREATOR = new c(15);

    /* renamed from: a  reason: collision with root package name */
    public final C f2068a;

    /* renamed from: b  reason: collision with root package name */
    public final F f2069b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2070c;
    public final ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public final Double f2071e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f2072f;

    /* renamed from: p  reason: collision with root package name */
    public final C0098m f2073p;

    /* renamed from: q  reason: collision with root package name */
    public final Integer f2074q;

    /* renamed from: r  reason: collision with root package name */
    public final L f2075r;

    /* renamed from: s  reason: collision with root package name */
    public final C0090e f2076s;

    /* renamed from: t  reason: collision with root package name */
    public final C0091f f2077t;

    public C0109y(C c3, F f6, byte[] bArr, ArrayList arrayList, Double d6, ArrayList arrayList2, C0098m mVar, Integer num, L l6, String str, C0091f fVar) {
        I.g(c3);
        this.f2068a = c3;
        I.g(f6);
        this.f2069b = f6;
        I.g(bArr);
        this.f2070c = bArr;
        I.g(arrayList);
        this.d = arrayList;
        this.f2071e = d6;
        this.f2072f = arrayList2;
        this.f2073p = mVar;
        this.f2074q = num;
        this.f2075r = l6;
        if (str != null) {
            try {
                this.f2076s = C0090e.a(str);
            } catch (C0089d e6) {
                throw new IllegalArgumentException(e6);
            }
        } else {
            this.f2076s = null;
        }
        this.f2077t = fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0109y)) {
            return false;
        }
        C0109y yVar = (C0109y) obj;
        if (I.j(this.f2068a, yVar.f2068a) && I.j(this.f2069b, yVar.f2069b) && Arrays.equals(this.f2070c, yVar.f2070c) && I.j(this.f2071e, yVar.f2071e)) {
            ArrayList arrayList = this.d;
            ArrayList arrayList2 = yVar.d;
            if (arrayList.containsAll(arrayList2) && arrayList2.containsAll(arrayList)) {
                ArrayList arrayList3 = this.f2072f;
                ArrayList arrayList4 = yVar.f2072f;
                if (((arrayList3 != null || arrayList4 != null) && (arrayList3 == null || arrayList4 == null || !arrayList3.containsAll(arrayList4) || !arrayList4.containsAll(arrayList3))) || !I.j(this.f2073p, yVar.f2073p) || !I.j(this.f2074q, yVar.f2074q) || !I.j(this.f2075r, yVar.f2075r) || !I.j(this.f2076s, yVar.f2076s) || !I.j(this.f2077t, yVar.f2077t)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2068a, this.f2069b, Integer.valueOf(Arrays.hashCode(this.f2070c)), this.d, this.f2071e, this.f2072f, this.f2073p, this.f2074q, this.f2075r, this.f2076s, this.f2077t});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        String str;
        int W02 = a.W0(20293, parcel);
        a.Q0(parcel, 2, this.f2068a, i2, false);
        a.Q0(parcel, 3, this.f2069b, i2, false);
        a.K0(parcel, 4, this.f2070c, false);
        a.V0(parcel, 5, this.d, false);
        a.L0(parcel, 6, this.f2071e);
        a.V0(parcel, 7, this.f2072f, false);
        a.Q0(parcel, 8, this.f2073p, i2, false);
        a.O0(parcel, 9, this.f2074q);
        a.Q0(parcel, 10, this.f2075r, i2, false);
        C0090e eVar = this.f2076s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f2021a;
        }
        a.R0(parcel, 11, str, false);
        a.Q0(parcel, 12, this.f2077t, i2, false);
        a.X0(W02, parcel);
    }
}
