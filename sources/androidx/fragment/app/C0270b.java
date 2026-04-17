package androidx.fragment.app;

import a.C0251c;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b  reason: case insensitive filesystem */
public final class C0270b implements Parcelable {
    public static final Parcelable.Creator<C0270b> CREATOR = new C0251c(10);

    /* renamed from: a  reason: collision with root package name */
    public final int[] f5085a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5086b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f5087c;
    public final int[] d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5088e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5089f;

    /* renamed from: p  reason: collision with root package name */
    public final int f5090p;

    /* renamed from: q  reason: collision with root package name */
    public final int f5091q;

    /* renamed from: r  reason: collision with root package name */
    public final CharSequence f5092r;

    /* renamed from: s  reason: collision with root package name */
    public final int f5093s;

    /* renamed from: t  reason: collision with root package name */
    public final CharSequence f5094t;

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f5095u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f5096v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f5097w;

    public C0270b(C0269a aVar) {
        int size = aVar.f5069a.size();
        this.f5085a = new int[(size * 6)];
        if (aVar.g) {
            this.f5086b = new ArrayList(size);
            this.f5087c = new int[size];
            this.d = new int[size];
            int i2 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                P p6 = (P) aVar.f5069a.get(i5);
                int i6 = i2 + 1;
                this.f5085a[i2] = p6.f5050a;
                ArrayList arrayList = this.f5086b;
                C0286s sVar = p6.f5051b;
                arrayList.add(sVar != null ? sVar.f5177e : null);
                int[] iArr = this.f5085a;
                iArr[i6] = p6.f5052c;
                iArr[i2 + 2] = p6.d;
                iArr[i2 + 3] = p6.f5053e;
                int i7 = i2 + 5;
                iArr[i2 + 4] = p6.f5054f;
                i2 += 6;
                iArr[i7] = p6.g;
                this.f5087c[i5] = p6.h.ordinal();
                this.d[i5] = p6.f5055i.ordinal();
            }
            this.f5088e = aVar.f5073f;
            this.f5089f = aVar.f5074i;
            this.f5090p = aVar.f5084s;
            this.f5091q = aVar.f5075j;
            this.f5092r = aVar.f5076k;
            this.f5093s = aVar.f5077l;
            this.f5094t = aVar.f5078m;
            this.f5095u = aVar.f5079n;
            this.f5096v = aVar.f5080o;
            this.f5097w = aVar.f5081p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f5085a);
        parcel.writeStringList(this.f5086b);
        parcel.writeIntArray(this.f5087c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f5088e);
        parcel.writeString(this.f5089f);
        parcel.writeInt(this.f5090p);
        parcel.writeInt(this.f5091q);
        TextUtils.writeToParcel(this.f5092r, parcel, 0);
        parcel.writeInt(this.f5093s);
        TextUtils.writeToParcel(this.f5094t, parcel, 0);
        parcel.writeStringList(this.f5095u);
        parcel.writeStringList(this.f5096v);
        parcel.writeInt(this.f5097w ? 1 : 0);
    }

    public C0270b(Parcel parcel) {
        this.f5085a = parcel.createIntArray();
        this.f5086b = parcel.createStringArrayList();
        this.f5087c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f5088e = parcel.readInt();
        this.f5089f = parcel.readString();
        this.f5090p = parcel.readInt();
        this.f5091q = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f5092r = (CharSequence) creator.createFromParcel(parcel);
        this.f5093s = parcel.readInt();
        this.f5094t = (CharSequence) creator.createFromParcel(parcel);
        this.f5095u = parcel.createStringArrayList();
        this.f5096v = parcel.createStringArrayList();
        this.f5097w = parcel.readInt() != 0;
    }
}
