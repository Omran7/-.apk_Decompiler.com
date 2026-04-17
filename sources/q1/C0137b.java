package Q1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

/* renamed from: Q1.b  reason: case insensitive filesystem */
public final class C0137b extends a {
    public static final Parcelable.Creator<C0137b> CREATOR = new w(9);

    /* renamed from: a  reason: collision with root package name */
    public final int f2404a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2405b;

    public C0137b(int i2, int i5) {
        this.f2404a = i2;
        this.f2405b = i5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (Q1.C0137b) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof Q1.C0137b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            Q1.b r5 = (Q1.C0137b) r5
            int r1 = r5.f2404a
            int r3 = r4.f2404a
            if (r3 != r1) goto L_0x0019
            int r1 = r4.f2405b
            int r5 = r5.f2405b
            if (r1 != r5) goto L_0x0019
            return r0
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.C0137b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2404a), Integer.valueOf(this.f2405b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(this.f2404a);
        sb.append(", mTransitionType=");
        sb.append(this.f2405b);
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        I.g(parcel);
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f2404a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f2405b);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
