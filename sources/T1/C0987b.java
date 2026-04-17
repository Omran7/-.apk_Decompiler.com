package t1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import s1.b;

/* renamed from: t1.b  reason: case insensitive filesystem */
public final class C0987b extends a {
    public static final Parcelable.Creator<C0987b> CREATOR = new b(11);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11704a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11705b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11706c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11707e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f11708f;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f11709p;

    public C0987b(boolean z3, String str, String str2, boolean z4, String str3, ArrayList arrayList, boolean z5) {
        boolean z6 = true;
        if (z4 && z5) {
            z6 = false;
        }
        I.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z6);
        this.f11704a = z3;
        if (z3) {
            I.h(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f11705b = str;
        this.f11706c = str2;
        this.d = z4;
        ArrayList arrayList2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2 = new ArrayList(arrayList);
            Collections.sort(arrayList2);
        }
        this.f11708f = arrayList2;
        this.f11707e = str3;
        this.f11709p = z5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (t1.C0987b) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof t1.C0987b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            t1.b r4 = (t1.C0987b) r4
            boolean r0 = r4.f11704a
            boolean r2 = r3.f11704a
            if (r2 != r0) goto L_0x0044
            java.lang.String r0 = r3.f11705b
            java.lang.String r2 = r4.f11705b
            boolean r0 = com.google.android.gms.common.internal.I.j(r0, r2)
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r3.f11706c
            java.lang.String r2 = r4.f11706c
            boolean r0 = com.google.android.gms.common.internal.I.j(r0, r2)
            if (r0 == 0) goto L_0x0044
            boolean r0 = r3.d
            boolean r2 = r4.d
            if (r0 != r2) goto L_0x0044
            java.lang.String r0 = r3.f11707e
            java.lang.String r2 = r4.f11707e
            boolean r0 = com.google.android.gms.common.internal.I.j(r0, r2)
            if (r0 == 0) goto L_0x0044
            java.util.ArrayList r0 = r3.f11708f
            java.util.ArrayList r2 = r4.f11708f
            boolean r0 = com.google.android.gms.common.internal.I.j(r0, r2)
            if (r0 == 0) goto L_0x0044
            boolean r0 = r3.f11709p
            boolean r4 = r4.f11709p
            if (r0 != r4) goto L_0x0044
            r4 = 1
            return r4
        L_0x0044:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C0987b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Boolean valueOf = Boolean.valueOf(this.f11704a);
        Boolean valueOf2 = Boolean.valueOf(this.d);
        Boolean valueOf3 = Boolean.valueOf(this.f11709p);
        return Arrays.hashCode(new Object[]{valueOf, this.f11705b, this.f11706c, valueOf2, this.f11707e, this.f11708f, valueOf3});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f11704a ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 2, this.f11705b, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f11706c, false);
        android.support.v4.media.session.a.Y0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 5, this.f11707e, false);
        android.support.v4.media.session.a.T0(parcel, 6, this.f11708f);
        android.support.v4.media.session.a.Y0(parcel, 7, 4);
        parcel.writeInt(this.f11709p ? 1 : 0);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
