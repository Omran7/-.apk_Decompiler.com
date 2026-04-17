package z1;

import A1.a;
import X4.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import h0.C0552a;
import java.util.Arrays;
import s1.b;

/* renamed from: z1.b  reason: case insensitive filesystem */
public final class C1132b extends a {
    public static final Parcelable.Creator<C1132b> CREATOR = new b(26);

    /* renamed from: e  reason: collision with root package name */
    public static final C1132b f12799e = new C1132b(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f12800a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12801b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f12802c;
    public final String d;

    public C1132b(int i2, int i5, PendingIntent pendingIntent, String str) {
        this.f12800a = i2;
        this.f12801b = i5;
        this.f12802c = pendingIntent;
        this.d = str;
    }

    public static String v(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case zzaky.zzf.zzf:
                return "RESOLUTION_REQUIRED";
            case zzaky.zzf.zzg:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case ModuleDescriptor.MODULE_VERSION:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return C0552a.k(i2, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (z1.C1132b) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof z1.C1132b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            z1.b r5 = (z1.C1132b) r5
            int r1 = r5.f12801b
            int r3 = r4.f12801b
            if (r3 != r1) goto L_0x0027
            android.app.PendingIntent r1 = r4.f12802c
            android.app.PendingIntent r3 = r5.f12802c
            boolean r1 = com.google.android.gms.common.internal.I.j(r1, r3)
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = r4.d
            java.lang.String r5 = r5.d
            boolean r5 = com.google.android.gms.common.internal.I.j(r1, r5)
            if (r5 == 0) goto L_0x0027
            return r0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C1132b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12801b), this.f12802c, this.d});
    }

    public final String toString() {
        d dVar = new d((Object) this);
        dVar.c(v(this.f12801b), "statusCode");
        dVar.c(this.f12802c, "resolution");
        dVar.c(this.d, "message");
        return dVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f12800a);
        android.support.v4.media.session.a.Y0(parcel, 2, 4);
        parcel.writeInt(this.f12801b);
        android.support.v4.media.session.a.Q0(parcel, 3, this.f12802c, i2, false);
        android.support.v4.media.session.a.R0(parcel, 4, this.d, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }

    public C1132b(int i2) {
        this(1, i2, (PendingIntent) null, (String) null);
    }

    public C1132b(int i2, PendingIntent pendingIntent) {
        this(1, i2, pendingIntent, (String) null);
    }
}
