package r1;

import E1.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import com.google.android.material.datepicker.n;
import h0.C0552a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class f extends zzbz {
    public static final Parcelable.Creator<f> CREATOR = new n(28);

    /* renamed from: q  reason: collision with root package name */
    public static final HashMap f11187q;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f11188a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11189b;

    /* renamed from: c  reason: collision with root package name */
    public String f11190c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f11191e;

    /* renamed from: f  reason: collision with root package name */
    public final PendingIntent f11192f;

    /* renamed from: p  reason: collision with root package name */
    public final C0946a f11193p;

    static {
        HashMap hashMap = new HashMap();
        f11187q = hashMap;
        hashMap.put("accountType", new a(7, false, 7, false, "accountType", 2, (Class) null));
        hashMap.put("status", new a(0, false, 0, false, "status", 3, (Class) null));
        hashMap.put("transferBytes", new a(8, false, 8, false, "transferBytes", 4, (Class) null));
    }

    public f(HashSet hashSet, int i2, String str, int i5, byte[] bArr, PendingIntent pendingIntent, C0946a aVar) {
        this.f11188a = hashSet;
        this.f11189b = i2;
        this.f11190c = str;
        this.d = i5;
        this.f11191e = bArr;
        this.f11192f = pendingIntent;
        this.f11193p = aVar;
    }

    public final /* synthetic */ Map getFieldMappings() {
        return f11187q;
    }

    public final Object getFieldValue(a aVar) {
        int i2 = aVar.f592p;
        if (i2 == 1) {
            return Integer.valueOf(this.f11189b);
        }
        if (i2 == 2) {
            return this.f11190c;
        }
        if (i2 == 3) {
            return Integer.valueOf(this.d);
        }
        if (i2 == 4) {
            return this.f11191e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.f592p);
    }

    public final boolean isFieldSet(a aVar) {
        return this.f11188a.contains(Integer.valueOf(aVar.f592p));
    }

    public final void setDecodedBytesInternal(a aVar, String str, byte[] bArr) {
        int i2 = aVar.f592p;
        if (i2 == 4) {
            this.f11191e = bArr;
            this.f11188a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(C0552a.k(i2, "Field with id=", " is not known to be an byte array."));
    }

    public final void setIntegerInternal(a aVar, String str, int i2) {
        int i5 = aVar.f592p;
        if (i5 == 3) {
            this.d = i2;
            this.f11188a.add(Integer.valueOf(i5));
            return;
        }
        throw new IllegalArgumentException(C0552a.k(i5, "Field with id=", " is not known to be an int."));
    }

    public final void setStringInternal(a aVar, String str, String str2) {
        int i2 = aVar.f592p;
        if (i2 == 2) {
            this.f11190c = str2;
            this.f11188a.add(Integer.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i2)}));
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        HashSet hashSet = this.f11188a;
        if (hashSet.contains(1)) {
            android.support.v4.media.session.a.Y0(parcel, 1, 4);
            parcel.writeInt(this.f11189b);
        }
        if (hashSet.contains(2)) {
            android.support.v4.media.session.a.R0(parcel, 2, this.f11190c, true);
        }
        if (hashSet.contains(3)) {
            int i5 = this.d;
            android.support.v4.media.session.a.Y0(parcel, 3, 4);
            parcel.writeInt(i5);
        }
        if (hashSet.contains(4)) {
            android.support.v4.media.session.a.K0(parcel, 4, this.f11191e, true);
        }
        if (hashSet.contains(5)) {
            android.support.v4.media.session.a.Q0(parcel, 5, this.f11192f, i2, true);
        }
        if (hashSet.contains(6)) {
            android.support.v4.media.session.a.Q0(parcel, 6, this.f11193p, i2, true);
        }
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
