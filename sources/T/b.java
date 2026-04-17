package T;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import d2.C0464c;
import e2.C0486b;
import k.C0698Y0;
import m0.M;
import m2.C0835a;
import t2.C1006b;
import v2.x;
import x.C1093e;

public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2790a;

    public /* synthetic */ b(int i2) {
        this.f2790a = i2;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f2790a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f2791b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0464c(parcel, classLoader);
            case 2:
                return new C0486b(parcel, classLoader);
            case 3:
                return new C0698Y0(parcel, classLoader);
            case 4:
                return new M(parcel, classLoader);
            case 5:
                return new C0835a(parcel, classLoader);
            case zzaky.zzf.zzf /*6*/:
                return new C1006b(parcel, classLoader);
            case zzaky.zzf.zzg /*7*/:
                return new x(parcel, classLoader);
            default:
                return new C1093e(parcel, classLoader);
        }
    }

    public final Object[] newArray(int i2) {
        switch (this.f2790a) {
            case 0:
                return new c[i2];
            case 1:
                return new C0464c[i2];
            case 2:
                return new C0486b[i2];
            case 3:
                return new C0698Y0[i2];
            case 4:
                return new M[i2];
            case 5:
                return new C0835a[i2];
            case zzaky.zzf.zzf /*6*/:
                return new C1006b[i2];
            case zzaky.zzf.zzg /*7*/:
                return new x[i2];
            default:
                return new C1093e[i2];
        }
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2790a) {
            case 0:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return c.f2791b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0464c(parcel, (ClassLoader) null);
            case 2:
                return new C0486b(parcel, (ClassLoader) null);
            case 3:
                return new C0698Y0(parcel, (ClassLoader) null);
            case 4:
                return new M(parcel, (ClassLoader) null);
            case 5:
                return new C0835a(parcel, (ClassLoader) null);
            case zzaky.zzf.zzf /*6*/:
                return new C1006b(parcel, (ClassLoader) null);
            case zzaky.zzf.zzg /*7*/:
                return new x(parcel, (ClassLoader) null);
            default:
                return new C1093e(parcel, (ClassLoader) null);
        }
    }
}
