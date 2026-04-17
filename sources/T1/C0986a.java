package t1;

import A1.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Arrays;
import s1.b;

/* renamed from: t1.a  reason: case insensitive filesystem */
public final class C0986a extends a {
    public static final Parcelable.Creator<C0986a> CREATOR = new b(6);

    /* renamed from: a  reason: collision with root package name */
    public final String f11699a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11700b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11701c;
    public final ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public final GoogleSignInAccount f11702e;

    /* renamed from: f  reason: collision with root package name */
    public final PendingIntent f11703f;

    public C0986a(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.f11699a = str;
        this.f11700b = str2;
        this.f11701c = str3;
        I.g(arrayList);
        this.d = arrayList;
        this.f11703f = pendingIntent;
        this.f11702e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0986a)) {
            return false;
        }
        C0986a aVar = (C0986a) obj;
        if (!I.j(this.f11699a, aVar.f11699a) || !I.j(this.f11700b, aVar.f11700b) || !I.j(this.f11701c, aVar.f11701c) || !I.j(this.d, aVar.d) || !I.j(this.f11703f, aVar.f11703f) || !I.j(this.f11702e, aVar.f11702e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11699a, this.f11700b, this.f11701c, this.d, this.f11703f, this.f11702e});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.R0(parcel, 1, this.f11699a, false);
        android.support.v4.media.session.a.R0(parcel, 2, this.f11700b, false);
        android.support.v4.media.session.a.R0(parcel, 3, this.f11701c, false);
        android.support.v4.media.session.a.T0(parcel, 4, this.d);
        android.support.v4.media.session.a.Q0(parcel, 5, this.f11702e, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 6, this.f11703f, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
