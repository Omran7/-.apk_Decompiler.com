package t1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;
import s1.b;

/* renamed from: t1.c  reason: case insensitive filesystem */
public final class C0988c extends a {
    public static final Parcelable.Creator<C0988c> CREATOR = new b(12);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11710a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11711b;

    public C0988c(String str, boolean z3) {
        if (z3) {
            I.g(str);
        }
        this.f11710a = z3;
        this.f11711b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (t1.C0988c) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof t1.C0988c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            t1.c r5 = (t1.C0988c) r5
            boolean r1 = r5.f11710a
            boolean r3 = r4.f11710a
            if (r3 != r1) goto L_0x001d
            java.lang.String r1 = r4.f11711b
            java.lang.String r5 = r5.f11711b
            boolean r5 = com.google.android.gms.common.internal.I.j(r1, r5)
            if (r5 == 0) goto L_0x001d
            return r0
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C0988c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f11710a), this.f11711b});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f11710a ? 1 : 0);
        android.support.v4.media.session.a.R0(parcel, 2, this.f11711b, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
