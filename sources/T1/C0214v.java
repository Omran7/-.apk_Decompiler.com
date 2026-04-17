package T1;

import A1.a;
import Q1.w;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.I;

/* renamed from: T1.v  reason: case insensitive filesystem */
public final class C0214v extends a {
    public static final Parcelable.Creator<C0214v> CREATOR = new w(17);

    /* renamed from: a  reason: collision with root package name */
    public final String f3508a;

    /* renamed from: b  reason: collision with root package name */
    public final C0211u f3509b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3510c;
    public final long d;

    public C0214v(C0214v vVar, long j6) {
        I.g(vVar);
        this.f3508a = vVar.f3508a;
        this.f3509b = vVar.f3509b;
        this.f3510c = vVar.f3510c;
        this.d = j6;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f3509b);
        return "origin=" + this.f3510c + ",name=" + this.f3508a + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        w.a(this, parcel, i2);
    }

    public C0214v(String str, C0211u uVar, String str2, long j6) {
        this.f3508a = str;
        this.f3509b = uVar;
        this.f3510c = str2;
        this.d = j6;
    }
}
