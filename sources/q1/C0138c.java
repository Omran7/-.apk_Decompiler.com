package Q1;

import A1.a;
import H4.i;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* renamed from: Q1.c  reason: case insensitive filesystem */
public final class C0138c extends a {
    public static final Parcelable.Creator<C0138c> CREATOR = new w(10);

    /* renamed from: e  reason: collision with root package name */
    public static final i f2406e = new i(1);

    /* renamed from: a  reason: collision with root package name */
    public final List f2407a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2408b;

    /* renamed from: c  reason: collision with root package name */
    public final List f2409c;
    public final String d;

    public C0138c(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
        boolean z3;
        List list;
        I.h(arrayList, "transitions can't be null");
        if (arrayList.size() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("transitions can't be empty.", z3);
        TreeSet treeSet = new TreeSet(f2406e);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0137b bVar = (C0137b) it2.next();
            boolean add = treeSet.add(bVar);
            I.a("Found duplicated transition: " + bVar + ".", add);
        }
        this.f2407a = Collections.unmodifiableList(arrayList);
        this.f2408b = str;
        if (arrayList2 == null) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(arrayList2);
        }
        this.f2409c = list;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0138c.class == obj.getClass()) {
            C0138c cVar = (C0138c) obj;
            if (!I.j(this.f2407a, cVar.f2407a) || !I.j(this.f2408b, cVar.f2408b) || !I.j(this.d, cVar.d) || !I.j(this.f2409c, cVar.f2409c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i5;
        int hashCode = this.f2407a.hashCode() * 31;
        int i6 = 0;
        String str = this.f2408b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (hashCode + i2) * 31;
        List list = this.f2409c;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        int i8 = (i7 + i5) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i8 + i6;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2407a);
        String valueOf2 = String.valueOf(this.f2409c);
        int length = valueOf.length();
        String str = this.f2408b;
        int length2 = String.valueOf(str).length();
        int length3 = valueOf2.length();
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(length + 79 + length2 + length3 + String.valueOf(str2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append("', mClients=");
        sb.append(valueOf2);
        sb.append(", mAttributionTag=");
        sb.append(str2);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        I.g(parcel);
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.V0(parcel, 1, this.f2407a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f2408b, false);
        android.support.v4.media.session.a.V0(parcel, 3, this.f2409c, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
