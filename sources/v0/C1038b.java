package v0;

import android.os.Parcel;
import android.util.SparseIntArray;
import h0.C0552a;
import n.e;
import n.j;

/* renamed from: v0.b  reason: case insensitive filesystem */
public final class C1038b extends C1037a {
    public final SparseIntArray d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f12149e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12150f;
    public final int g;
    public final String h;

    /* renamed from: i  reason: collision with root package name */
    public int f12151i;

    /* renamed from: j  reason: collision with root package name */
    public int f12152j;

    /* renamed from: k  reason: collision with root package name */
    public int f12153k;

    /* JADX WARNING: type inference failed for: r5v0, types: [n.e, n.j] */
    /* JADX WARNING: type inference failed for: r6v0, types: [n.e, n.j] */
    /* JADX WARNING: type inference failed for: r7v0, types: [n.e, n.j] */
    public C1038b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new j(0), new j(0), new j(0));
    }

    public final C1038b a() {
        Parcel parcel = this.f12149e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f12152j;
        if (i2 == this.f12150f) {
            i2 = this.g;
        }
        return new C1038b(parcel, dataPosition, i2, C0552a.r(new StringBuilder(), this.h, "  "), this.f12146a, this.f12147b, this.f12148c);
    }

    public final boolean e(int i2) {
        while (this.f12152j < this.g) {
            int i5 = this.f12153k;
            if (i5 == i2) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i6 = this.f12152j;
            Parcel parcel = this.f12149e;
            parcel.setDataPosition(i6);
            int readInt = parcel.readInt();
            this.f12153k = parcel.readInt();
            this.f12152j += readInt;
        }
        if (this.f12153k == i2) {
            return true;
        }
        return false;
    }

    public final void i(int i2) {
        int i5 = this.f12151i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f12149e;
        if (i5 >= 0) {
            int i6 = sparseIntArray.get(i5);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(dataPosition - i6);
            parcel.setDataPosition(dataPosition);
        }
        this.f12151i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public C1038b(Parcel parcel, int i2, int i5, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.d = new SparseIntArray();
        this.f12151i = -1;
        this.f12153k = -1;
        this.f12149e = parcel;
        this.f12150f = i2;
        this.g = i5;
        this.f12152j = i2;
        this.h = str;
    }
}
