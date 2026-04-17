package O1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new W(12);

    /* renamed from: a  reason: collision with root package name */
    public final Enum f2054a;

    public r(C0086a aVar) {
        this.f2054a = (Enum) aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: O1.G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: O1.s[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: O1.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: O1.G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: O1.G} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: O1.G} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static O1.r a(int r7) {
        /*
            O1.r r0 = new O1.r
            r1 = -262(0xfffffffffffffefa, float:NaN)
            if (r7 != r1) goto L_0x0009
            O1.G r7 = O1.G.RS1
            goto L_0x002b
        L_0x0009:
            O1.G[] r1 = O1.G.values()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L_0x0010:
            if (r4 >= r2) goto L_0x001d
            r5 = r1[r4]
            int r6 = r5.f1988a
            if (r6 != r7) goto L_0x001a
            r7 = r5
            goto L_0x002b
        L_0x001a:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x001d:
            O1.s[] r1 = O1.C0103s.values()
            int r2 = r1.length
        L_0x0022:
            if (r3 >= r2) goto L_0x0032
            r4 = r1[r3]
            int r5 = r4.f2056a
            if (r5 != r7) goto L_0x002f
            r7 = r4
        L_0x002b:
            r0.<init>(r7)
            return r0
        L_0x002f:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0032:
            O1.q r0 = new O1.q
            java.lang.String r1 = "Algorithm with COSE value "
            java.lang.String r2 = " not supported"
            java.lang.String r7 = h0.C0552a.k(r7, r1, r2)
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.r.a(int):O1.r");
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [O1.a, java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r3v2, types: [O1.a, java.lang.Enum] */
    public final boolean equals(Object obj) {
        if ((obj instanceof r) && this.f2054a.a() == ((r) obj).f2054a.a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2054a});
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [O1.a, java.lang.Enum] */
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2054a.a());
    }
}
