package f3;

import A1.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.I;
import e3.G;
import java.util.ArrayList;

/* renamed from: f3.A  reason: case insensitive filesystem */
public final class C0523A implements c {
    public static final Parcelable.Creator<C0523A> CREATOR = new C0525b(6);

    /* renamed from: a  reason: collision with root package name */
    public C0528e f7909a;

    /* renamed from: b  reason: collision with root package name */
    public z f7910b = null;

    /* renamed from: c  reason: collision with root package name */
    public G f7911c;

    public C0523A(C0528e eVar) {
        I.g(eVar);
        this.f7909a = eVar;
        ArrayList arrayList = eVar.f7923e;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (!TextUtils.isEmpty(((C0526c) arrayList.get(i2)).f7919q)) {
                this.f7910b = new z(((C0526c) arrayList.get(i2)).f7914b, ((C0526c) arrayList.get(i2)).f7919q, eVar.f7928s);
            }
        }
        if (this.f7910b == null) {
            this.f7910b = new z(eVar.f7928s);
        }
        this.f7911c = eVar.f7929t;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.Q0(parcel, 1, this.f7909a, i2, false);
        a.Q0(parcel, 2, this.f7910b, i2, false);
        a.Q0(parcel, 3, this.f7911c, i2, false);
        a.X0(W02, parcel);
    }
}
