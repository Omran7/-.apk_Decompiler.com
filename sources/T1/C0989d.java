package t1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import s1.b;

/* renamed from: t1.d  reason: case insensitive filesystem */
public final class C0989d extends a {
    public static final Parcelable.Creator<C0989d> CREATOR = new b(13);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11712a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f11713b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11714c;

    public C0989d(boolean z3, byte[] bArr, String str) {
        if (z3) {
            I.g(bArr);
            I.g(str);
        }
        this.f11712a = z3;
        this.f11713b = bArr;
        this.f11714c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (t1.C0989d) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof t1.C0989d
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            t1.d r5 = (t1.C0989d) r5
            boolean r1 = r5.f11712a
            boolean r3 = r4.f11712a
            if (r3 != r1) goto L_0x002b
            byte[] r1 = r4.f11713b
            byte[] r3 = r5.f11713b
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = r4.f11714c
            java.lang.String r5 = r5.f11714c
            if (r1 == r5) goto L_0x002a
            if (r1 == 0) goto L_0x002b
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x002b
        L_0x002a:
            return r0
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C0989d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11713b) + (Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11712a), this.f11714c}) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f11712a ? 1 : 0);
        android.support.v4.media.session.a.K0(parcel, 2, this.f11713b, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f11714c, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
