package e3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import com.google.android.material.datepicker.n;

public final class G extends C0495c {
    public static final Parcelable.Creator<G> CREATOR = new n(12);

    /* renamed from: a  reason: collision with root package name */
    public final String f7617a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7618b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7619c;
    public final zzait d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7620e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7621f;

    /* renamed from: p  reason: collision with root package name */
    public final String f7622p;

    public G(String str, String str2, String str3, zzait zzait, String str4, String str5, String str6) {
        this.f7617a = zzae.zzb(str);
        this.f7618b = str2;
        this.f7619c = str3;
        this.d = zzait;
        this.f7620e = str4;
        this.f7621f = str5;
        this.f7622p = str6;
    }

    public static G x(zzait zzait) {
        I.h(zzait, "Must specify a non-null webSignInCredential");
        return new G((String) null, (String) null, (String) null, zzait, (String) null, (String) null, (String) null);
    }

    public final String v() {
        return this.f7617a;
    }

    public final C0495c w() {
        return new G(this.f7617a, this.f7618b, this.f7619c, this.d, this.f7620e, this.f7621f, this.f7622p);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        a.R0(parcel, 1, this.f7617a, false);
        a.R0(parcel, 2, this.f7618b, false);
        a.R0(parcel, 3, this.f7619c, false);
        a.Q0(parcel, 4, this.d, i2, false);
        a.R0(parcel, 5, this.f7620e, false);
        a.R0(parcel, 6, this.f7621f, false);
        a.R0(parcel, 7, this.f7622p, false);
        a.X0(W02, parcel);
    }
}
