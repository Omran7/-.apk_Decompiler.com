package w1;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* renamed from: w1.d  reason: case insensitive filesystem */
public final class C1078d implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12416a;

    public /* synthetic */ C1078d(int i2) {
        this.f12416a = i2;
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            int r2 = r0.f12416a
            switch(r2) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x0047;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r2 = R2.b.c1(r22)
            java.lang.String r3 = ""
            r4 = 0
            r5 = r4
            r4 = r3
        L_0x0012:
            int r6 = r22.dataPosition()
            if (r6 >= r2) goto L_0x003e
            int r6 = r22.readInt()
            char r7 = (char) r6
            r8 = 4
            if (r7 == r8) goto L_0x0039
            r8 = 7
            if (r7 == r8) goto L_0x0030
            r8 = 8
            if (r7 == r8) goto L_0x002b
            R2.b.T0(r6, r1)
            goto L_0x0012
        L_0x002b:
            java.lang.String r4 = R2.b.r(r6, r1)
            goto L_0x0012
        L_0x0030:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r5 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r5 = R2.b.q(r1, r6, r5)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r5 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r5
            goto L_0x0012
        L_0x0039:
            java.lang.String r3 = R2.b.r(r6, r1)
            goto L_0x0012
        L_0x003e:
            R2.b.x(r2, r1)
            com.google.android.gms.auth.api.signin.SignInAccount r1 = new com.google.android.gms.auth.api.signin.SignInAccount
            r1.<init>(r3, r5, r4)
            return r1
        L_0x0047:
            int r2 = R2.b.c1(r22)
            r3 = 0
            r4 = 0
            r7 = r3
            r8 = r7
            r12 = r8
            r13 = r12
            r15 = r13
            r6 = r4
            r9 = r6
            r10 = r9
            r11 = r10
        L_0x0056:
            int r4 = r22.dataPosition()
            if (r4 >= r2) goto L_0x00a3
            int r4 = r22.readInt()
            char r5 = (char) r4
            switch(r5) {
                case 1: goto L_0x009e;
                case 2: goto L_0x0097;
                case 3: goto L_0x008d;
                case 4: goto L_0x0088;
                case 5: goto L_0x0083;
                case 6: goto L_0x007e;
                case 7: goto L_0x0079;
                case 8: goto L_0x0074;
                case 9: goto L_0x006d;
                case 10: goto L_0x0068;
                default: goto L_0x0064;
            }
        L_0x0064:
            R2.b.T0(r4, r1)
            goto L_0x0056
        L_0x0068:
            java.lang.String r15 = R2.b.r(r4, r1)
            goto L_0x0056
        L_0x006d:
            android.os.Parcelable$Creator<x1.a> r3 = x1.C1095a.CREATOR
            java.util.ArrayList r3 = R2.b.v(r1, r4, r3)
            goto L_0x0056
        L_0x0074:
            java.lang.String r13 = R2.b.r(r4, r1)
            goto L_0x0056
        L_0x0079:
            java.lang.String r12 = R2.b.r(r4, r1)
            goto L_0x0056
        L_0x007e:
            boolean r11 = R2.b.w0(r4, r1)
            goto L_0x0056
        L_0x0083:
            boolean r10 = R2.b.w0(r4, r1)
            goto L_0x0056
        L_0x0088:
            boolean r9 = R2.b.w0(r4, r1)
            goto L_0x0056
        L_0x008d:
            android.os.Parcelable$Creator r5 = android.accounts.Account.CREATOR
            android.os.Parcelable r4 = R2.b.q(r1, r4, r5)
            r8 = r4
            android.accounts.Account r8 = (android.accounts.Account) r8
            goto L_0x0056
        L_0x0097:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r5 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r7 = R2.b.v(r1, r4, r5)
            goto L_0x0056
        L_0x009e:
            int r6 = R2.b.A0(r4, r1)
            goto L_0x0056
        L_0x00a3:
            R2.b.x(r2, r1)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions
            java.util.HashMap r14 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.w(r3)
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
        L_0x00b1:
            int r2 = R2.b.c1(r22)
            r3 = 0
            r4 = 0
            r6 = 0
            r9 = r3
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r17 = r14
            r18 = r17
            r19 = r18
            r20 = r19
            r15 = r4
            r8 = r6
        L_0x00c9:
            int r3 = r22.dataPosition()
            if (r3 >= r2) goto L_0x012d
            int r3 = r22.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 1: goto L_0x0127;
                case 2: goto L_0x0121;
                case 3: goto L_0x011b;
                case 4: goto L_0x0115;
                case 5: goto L_0x010f;
                case 6: goto L_0x0105;
                case 7: goto L_0x00ff;
                case 8: goto L_0x00f9;
                case 9: goto L_0x00f2;
                case 10: goto L_0x00e9;
                case 11: goto L_0x00e2;
                case 12: goto L_0x00db;
                default: goto L_0x00d7;
            }
        L_0x00d7:
            R2.b.T0(r3, r1)
            goto L_0x00c9
        L_0x00db:
            java.lang.String r3 = R2.b.r(r3, r1)
            r20 = r3
            goto L_0x00c9
        L_0x00e2:
            java.lang.String r3 = R2.b.r(r3, r1)
            r19 = r3
            goto L_0x00c9
        L_0x00e9:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r4 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r3 = R2.b.v(r1, r3, r4)
            r18 = r3
            goto L_0x00c9
        L_0x00f2:
            java.lang.String r3 = R2.b.r(r3, r1)
            r17 = r3
            goto L_0x00c9
        L_0x00f9:
            long r3 = R2.b.C0(r3, r1)
            r15 = r3
            goto L_0x00c9
        L_0x00ff:
            java.lang.String r3 = R2.b.r(r3, r1)
            r14 = r3
            goto L_0x00c9
        L_0x0105:
            android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
            android.os.Parcelable r3 = R2.b.q(r1, r3, r4)
            android.net.Uri r3 = (android.net.Uri) r3
            r13 = r3
            goto L_0x00c9
        L_0x010f:
            java.lang.String r3 = R2.b.r(r3, r1)
            r12 = r3
            goto L_0x00c9
        L_0x0115:
            java.lang.String r3 = R2.b.r(r3, r1)
            r11 = r3
            goto L_0x00c9
        L_0x011b:
            java.lang.String r3 = R2.b.r(r3, r1)
            r10 = r3
            goto L_0x00c9
        L_0x0121:
            java.lang.String r3 = R2.b.r(r3, r1)
            r9 = r3
            goto L_0x00c9
        L_0x0127:
            int r3 = R2.b.A0(r3, r1)
            r8 = r3
            goto L_0x00c9
        L_0x012d:
            R2.b.x(r2, r1)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.C1078d.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f12416a) {
            case 0:
                return new GoogleSignInAccount[i2];
            case 1:
                return new GoogleSignInOptions[i2];
            default:
                return new SignInAccount[i2];
        }
    }
}
