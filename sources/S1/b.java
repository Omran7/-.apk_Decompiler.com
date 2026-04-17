package s1;

import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import t1.C0986a;
import t1.C0987b;
import t1.C0988c;
import t1.C0989d;
import t1.C0990e;
import t1.C0991f;
import t1.C0992g;
import t1.C0994i;
import t1.C0995j;
import t1.C0996k;
import t1.C0997l;
import t1.C0998m;
import t1.C1000o;
import t1.C1001p;
import v1.C1040a;
import v1.C1041b;
import x1.C1095a;
import z1.C1132b;
import z1.d;
import z1.t;
import z1.u;

public final class b implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11436a;

    public /* synthetic */ b(int i2) {
        this.f11436a = i2;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v10, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v11, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v15, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v23, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v27, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v28, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v32, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v33, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v34, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v35, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v67, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v87, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v88, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r14) {
        /*
            r13 = this;
            int r0 = r13.f11436a
            switch(r0) {
                case 0: goto L_0x074b;
                case 1: goto L_0x06ff;
                case 2: goto L_0x0699;
                case 3: goto L_0x063e;
                case 4: goto L_0x0610;
                case 5: goto L_0x05b7;
                case 6: goto L_0x0568;
                case 7: goto L_0x0508;
                case 8: goto L_0x04df;
                case 9: goto L_0x04ba;
                case 10: goto L_0x0474;
                case 11: goto L_0x0428;
                case 12: goto L_0x03fa;
                case 13: goto L_0x03c2;
                case 14: goto L_0x039d;
                case 15: goto L_0x0352;
                case 16: goto L_0x0329;
                case 17: goto L_0x02ee;
                case 18: goto L_0x02c5;
                case 19: goto L_0x0264;
                case 20: goto L_0x0236;
                case 21: goto L_0x0230;
                case 22: goto L_0x01d2;
                case 23: goto L_0x0172;
                case 24: goto L_0x013b;
                case 25: goto L_0x0109;
                case 26: goto L_0x00c4;
                case 27: goto L_0x008c;
                case 28: goto L_0x0046;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
            r2 = r3
        L_0x000e:
            int r5 = r14.dataPosition()
            if (r5 >= r0) goto L_0x003d
            int r5 = r14.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x0038
            r7 = 2
            if (r6 == r7) goto L_0x0033
            r7 = 3
            if (r6 == r7) goto L_0x002e
            r7 = 4
            if (r6 == r7) goto L_0x0029
            R2.b.T0(r5, r14)
            goto L_0x000e
        L_0x0029:
            int r3 = R2.b.A0(r5, r14)
            goto L_0x000e
        L_0x002e:
            int r2 = R2.b.A0(r5, r14)
            goto L_0x000e
        L_0x0033:
            java.lang.String r4 = R2.b.r(r5, r14)
            goto L_0x000e
        L_0x0038:
            boolean r1 = R2.b.w0(r5, r14)
            goto L_0x000e
        L_0x003d:
            R2.b.x(r0, r14)
            z1.u r14 = new z1.u
            r14.<init>(r2, r3, r4, r1)
            return r14
        L_0x0046:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r8 = r6
            r9 = r8
            r4 = r2
            r7 = r4
        L_0x0052:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x0082
            int r1 = r14.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x007d;
                case 2: goto L_0x0078;
                case 3: goto L_0x0073;
                case 4: goto L_0x006e;
                case 5: goto L_0x0069;
                case 6: goto L_0x0064;
                default: goto L_0x0060;
            }
        L_0x0060:
            R2.b.T0(r1, r14)
            goto L_0x0052
        L_0x0064:
            boolean r9 = R2.b.w0(r1, r14)
            goto L_0x0052
        L_0x0069:
            boolean r8 = R2.b.w0(r1, r14)
            goto L_0x0052
        L_0x006e:
            android.os.IBinder r7 = R2.b.z0(r1, r14)
            goto L_0x0052
        L_0x0073:
            boolean r6 = R2.b.w0(r1, r14)
            goto L_0x0052
        L_0x0078:
            boolean r5 = R2.b.w0(r1, r14)
            goto L_0x0052
        L_0x007d:
            java.lang.String r4 = R2.b.r(r1, r14)
            goto L_0x0052
        L_0x0082:
            R2.b.x(r0, r14)
            z1.t r14 = new z1.t
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r14
        L_0x008c:
            int r0 = R2.b.c1(r14)
            r1 = -1
            r3 = 0
            r4 = 0
        L_0x0094:
            int r5 = r14.dataPosition()
            if (r5 >= r0) goto L_0x00bb
            int r5 = r14.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x00b6
            r7 = 2
            if (r6 == r7) goto L_0x00b1
            r7 = 3
            if (r6 == r7) goto L_0x00ac
            R2.b.T0(r5, r14)
            goto L_0x0094
        L_0x00ac:
            long r1 = R2.b.C0(r5, r14)
            goto L_0x0094
        L_0x00b1:
            int r3 = R2.b.A0(r5, r14)
            goto L_0x0094
        L_0x00b6:
            java.lang.String r4 = R2.b.r(r5, r14)
            goto L_0x0094
        L_0x00bb:
            R2.b.x(r0, r14)
            z1.d r14 = new z1.d
            r14.<init>(r3, r4, r1)
            return r14
        L_0x00c4:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = r3
            r2 = r1
        L_0x00cd:
            int r5 = r14.dataPosition()
            if (r5 >= r0) goto L_0x0100
            int r5 = r14.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x00fb
            r7 = 2
            if (r6 == r7) goto L_0x00f6
            r7 = 3
            if (r6 == r7) goto L_0x00ed
            r7 = 4
            if (r6 == r7) goto L_0x00e8
            R2.b.T0(r5, r14)
            goto L_0x00cd
        L_0x00e8:
            java.lang.String r2 = R2.b.r(r5, r14)
            goto L_0x00cd
        L_0x00ed:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r5, r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            goto L_0x00cd
        L_0x00f6:
            int r4 = R2.b.A0(r5, r14)
            goto L_0x00cd
        L_0x00fb:
            int r3 = R2.b.A0(r5, r14)
            goto L_0x00cd
        L_0x0100:
            R2.b.x(r0, r14)
            z1.b r14 = new z1.b
            r14.<init>(r3, r4, r1, r2)
            return r14
        L_0x0109:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = r1
        L_0x010f:
            int r3 = r14.dataPosition()
            if (r3 >= r0) goto L_0x0132
            int r3 = r14.readInt()
            char r4 = (char) r3
            r5 = 2
            if (r4 == r5) goto L_0x012d
            r5 = 5
            if (r4 == r5) goto L_0x0124
            R2.b.T0(r3, r14)
            goto L_0x010f
        L_0x0124:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r2 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.CREATOR
            android.os.Parcelable r2 = R2.b.q(r14, r3, r2)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r2
            goto L_0x010f
        L_0x012d:
            java.lang.String r1 = R2.b.r(r3, r14)
            goto L_0x010f
        L_0x0132:
            R2.b.x(r0, r14)
            com.google.android.gms.auth.api.signin.internal.SignInConfiguration r14 = new com.google.android.gms.auth.api.signin.internal.SignInConfiguration
            r14.<init>(r1, r2)
            return r14
        L_0x013b:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r3 = r2
        L_0x0142:
            int r4 = r14.dataPosition()
            if (r4 >= r0) goto L_0x0169
            int r4 = r14.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x0164
            r6 = 2
            if (r5 == r6) goto L_0x015f
            r6 = 3
            if (r5 == r6) goto L_0x015a
            R2.b.T0(r4, r14)
            goto L_0x0142
        L_0x015a:
            android.os.Bundle r1 = R2.b.n(r4, r14)
            goto L_0x0142
        L_0x015f:
            int r3 = R2.b.A0(r4, r14)
            goto L_0x0142
        L_0x0164:
            int r2 = R2.b.A0(r4, r14)
            goto L_0x0142
        L_0x0169:
            R2.b.x(r0, r14)
            x1.a r14 = new x1.a
            r14.<init>(r2, r3, r1)
            return r14
        L_0x0172:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
            r7 = r5
            r6 = r2
            r8 = r6
            r9 = r8
        L_0x017e:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x01c8
            int r1 = r14.readInt()
            char r2 = (char) r1
            r3 = 1
            if (r2 == r3) goto L_0x01c2
            r3 = 2
            if (r2 == r3) goto L_0x01b8
            r3 = 3
            if (r2 == r3) goto L_0x01b2
            r3 = 4
            if (r2 == r3) goto L_0x01ac
            r3 = 5
            if (r2 == r3) goto L_0x01a6
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r3) goto L_0x01a0
            R2.b.T0(r1, r14)
            goto L_0x017e
        L_0x01a0:
            int r1 = R2.b.A0(r1, r14)
            r4 = r1
            goto L_0x017e
        L_0x01a6:
            byte[] r1 = R2.b.o(r1, r14)
            r9 = r1
            goto L_0x017e
        L_0x01ac:
            android.os.Bundle r1 = R2.b.n(r1, r14)
            r8 = r1
            goto L_0x017e
        L_0x01b2:
            int r1 = R2.b.A0(r1, r14)
            r7 = r1
            goto L_0x017e
        L_0x01b8:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r6 = r1
            goto L_0x017e
        L_0x01c2:
            int r1 = R2.b.A0(r1, r14)
            r5 = r1
            goto L_0x017e
        L_0x01c8:
            R2.b.x(r0, r14)
            v1.b r14 = new v1.b
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r14
        L_0x01d2:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r3 = 0
            r6 = r1
            r8 = r6
            r7 = r2
            r11 = r7
            r12 = r11
            r9 = r3
        L_0x01e0:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x0226
            int r1 = r14.readInt()
            char r2 = (char) r1
            r3 = 1
            if (r2 == r3) goto L_0x0220
            r3 = 2
            if (r2 == r3) goto L_0x021a
            r3 = 3
            if (r2 == r3) goto L_0x0214
            r3 = 4
            if (r2 == r3) goto L_0x020e
            r3 = 5
            if (r2 == r3) goto L_0x0208
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r3) goto L_0x0202
            R2.b.T0(r1, r14)
            goto L_0x01e0
        L_0x0202:
            int r1 = R2.b.A0(r1, r14)
            r6 = r1
            goto L_0x01e0
        L_0x0208:
            android.os.Bundle r1 = R2.b.n(r1, r14)
            r12 = r1
            goto L_0x01e0
        L_0x020e:
            byte[] r1 = R2.b.o(r1, r14)
            r11 = r1
            goto L_0x01e0
        L_0x0214:
            long r1 = R2.b.C0(r1, r14)
            r9 = r1
            goto L_0x01e0
        L_0x021a:
            int r1 = R2.b.A0(r1, r14)
            r8 = r1
            goto L_0x01e0
        L_0x0220:
            java.lang.String r1 = R2.b.r(r1, r14)
            r7 = r1
            goto L_0x01e0
        L_0x0226:
            R2.b.x(r0, r14)
            v1.a r14 = new v1.a
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r11, r12)
            return r14
        L_0x0230:
            androidx.versionedparcelable.ParcelImpl r0 = new androidx.versionedparcelable.ParcelImpl
            r0.<init>(r14)
            return r0
        L_0x0236:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = r1
        L_0x023c:
            int r3 = r14.dataPosition()
            if (r3 >= r0) goto L_0x025b
            int r3 = r14.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0256
            r5 = 2
            if (r4 == r5) goto L_0x0251
            R2.b.T0(r3, r14)
            goto L_0x023c
        L_0x0251:
            java.lang.String r2 = R2.b.r(r3, r14)
            goto L_0x023c
        L_0x0256:
            java.lang.String r1 = R2.b.r(r3, r14)
            goto L_0x023c
        L_0x025b:
            R2.b.x(r0, r14)
            t1.p r14 = new t1.p
            r14.<init>(r1, r2)
            return r14
        L_0x0264:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
        L_0x0272:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x02bb
            int r1 = r14.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x02b6;
                case 2: goto L_0x02b1;
                case 3: goto L_0x02ac;
                case 4: goto L_0x02a7;
                case 5: goto L_0x029d;
                case 6: goto L_0x0298;
                case 7: goto L_0x0293;
                case 8: goto L_0x028e;
                case 9: goto L_0x0284;
                default: goto L_0x0280;
            }
        L_0x0280:
            R2.b.T0(r1, r14)
            goto L_0x0272
        L_0x0284:
            android.os.Parcelable$Creator<O1.x> r2 = O1.C0108x.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r11 = r1
            O1.x r11 = (O1.C0108x) r11
            goto L_0x0272
        L_0x028e:
            java.lang.String r10 = R2.b.r(r1, r14)
            goto L_0x0272
        L_0x0293:
            java.lang.String r9 = R2.b.r(r1, r14)
            goto L_0x0272
        L_0x0298:
            java.lang.String r8 = R2.b.r(r1, r14)
            goto L_0x0272
        L_0x029d:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r7 = r1
            android.net.Uri r7 = (android.net.Uri) r7
            goto L_0x0272
        L_0x02a7:
            java.lang.String r6 = R2.b.r(r1, r14)
            goto L_0x0272
        L_0x02ac:
            java.lang.String r5 = R2.b.r(r1, r14)
            goto L_0x0272
        L_0x02b1:
            java.lang.String r4 = R2.b.r(r1, r14)
            goto L_0x0272
        L_0x02b6:
            java.lang.String r3 = R2.b.r(r1, r14)
            goto L_0x0272
        L_0x02bb:
            R2.b.x(r0, r14)
            t1.o r14 = new t1.o
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r14
        L_0x02c5:
            int r0 = R2.b.c1(r14)
            r1 = 0
        L_0x02ca:
            int r2 = r14.dataPosition()
            if (r2 >= r0) goto L_0x02e5
            int r2 = r14.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x02dc
            R2.b.T0(r2, r14)
            goto L_0x02ca
        L_0x02dc:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r2, r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            goto L_0x02ca
        L_0x02e5:
            R2.b.x(r0, r14)
            t1.m r14 = new t1.m
            r14.<init>(r1)
            return r14
        L_0x02ee:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r3 = r2
        L_0x02f5:
            int r4 = r14.dataPosition()
            if (r4 >= r0) goto L_0x0320
            int r4 = r14.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x0317
            r6 = 2
            if (r5 == r6) goto L_0x0312
            r6 = 3
            if (r5 == r6) goto L_0x030d
            R2.b.T0(r4, r14)
            goto L_0x02f5
        L_0x030d:
            int r1 = R2.b.A0(r4, r14)
            goto L_0x02f5
        L_0x0312:
            java.lang.String r3 = R2.b.r(r4, r14)
            goto L_0x02f5
        L_0x0317:
            android.os.Parcelable$Creator<t1.p> r2 = t1.C1001p.CREATOR
            android.os.Parcelable r2 = R2.b.q(r14, r4, r2)
            t1.p r2 = (t1.C1001p) r2
            goto L_0x02f5
        L_0x0320:
            R2.b.x(r0, r14)
            t1.l r14 = new t1.l
            r14.<init>(r2, r3, r1)
            return r14
        L_0x0329:
            int r0 = R2.b.c1(r14)
            r1 = 0
        L_0x032e:
            int r2 = r14.dataPosition()
            if (r2 >= r0) goto L_0x0349
            int r2 = r14.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x0340
            R2.b.T0(r2, r14)
            goto L_0x032e
        L_0x0340:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r2, r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            goto L_0x032e
        L_0x0349:
            R2.b.x(r0, r14)
            t1.k r14 = new t1.k
            r14.<init>(r1)
            return r14
        L_0x0352:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r9 = r1
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x035e:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x0393
            int r1 = r14.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x0389;
                case 2: goto L_0x0384;
                case 3: goto L_0x037f;
                case 4: goto L_0x037a;
                case 5: goto L_0x0375;
                case 6: goto L_0x0370;
                default: goto L_0x036c;
            }
        L_0x036c:
            R2.b.T0(r1, r14)
            goto L_0x035e
        L_0x0370:
            int r9 = R2.b.A0(r1, r14)
            goto L_0x035e
        L_0x0375:
            java.lang.String r8 = R2.b.r(r1, r14)
            goto L_0x035e
        L_0x037a:
            java.util.ArrayList r7 = R2.b.t(r1, r14)
            goto L_0x035e
        L_0x037f:
            java.lang.String r6 = R2.b.r(r1, r14)
            goto L_0x035e
        L_0x0384:
            java.lang.String r5 = R2.b.r(r1, r14)
            goto L_0x035e
        L_0x0389:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r4 = r1
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4
            goto L_0x035e
        L_0x0393:
            R2.b.x(r0, r14)
            com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest r14 = new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r14
        L_0x039d:
            int r0 = R2.b.c1(r14)
            r1 = 0
        L_0x03a2:
            int r2 = r14.dataPosition()
            if (r2 >= r0) goto L_0x03b9
            int r2 = r14.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x03b4
            R2.b.T0(r2, r14)
            goto L_0x03a2
        L_0x03b4:
            boolean r1 = R2.b.w0(r2, r14)
            goto L_0x03a2
        L_0x03b9:
            R2.b.x(r0, r14)
            t1.e r14 = new t1.e
            r14.<init>(r1)
            return r14
        L_0x03c2:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = r1
        L_0x03ca:
            int r4 = r14.dataPosition()
            if (r4 >= r0) goto L_0x03f1
            int r4 = r14.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x03ec
            r6 = 2
            if (r5 == r6) goto L_0x03e7
            r6 = 3
            if (r5 == r6) goto L_0x03e2
            R2.b.T0(r4, r14)
            goto L_0x03ca
        L_0x03e2:
            java.lang.String r2 = R2.b.r(r4, r14)
            goto L_0x03ca
        L_0x03e7:
            byte[] r1 = R2.b.o(r4, r14)
            goto L_0x03ca
        L_0x03ec:
            boolean r3 = R2.b.w0(r4, r14)
            goto L_0x03ca
        L_0x03f1:
            R2.b.x(r0, r14)
            t1.d r14 = new t1.d
            r14.<init>(r3, r1, r2)
            return r14
        L_0x03fa:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
        L_0x0400:
            int r3 = r14.dataPosition()
            if (r3 >= r0) goto L_0x041f
            int r3 = r14.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x041a
            r5 = 2
            if (r4 == r5) goto L_0x0415
            R2.b.T0(r3, r14)
            goto L_0x0400
        L_0x0415:
            java.lang.String r1 = R2.b.r(r3, r14)
            goto L_0x0400
        L_0x041a:
            boolean r2 = R2.b.w0(r3, r14)
            goto L_0x0400
        L_0x041f:
            R2.b.x(r0, r14)
            t1.c r14 = new t1.c
            r14.<init>(r1, r2)
            return r14
        L_0x0428:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r10 = r7
            r5 = r2
            r6 = r5
            r8 = r6
            r9 = r8
        L_0x0435:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x046a
            int r1 = r14.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x0465;
                case 2: goto L_0x0460;
                case 3: goto L_0x045b;
                case 4: goto L_0x0456;
                case 5: goto L_0x0451;
                case 6: goto L_0x044c;
                case 7: goto L_0x0447;
                default: goto L_0x0443;
            }
        L_0x0443:
            R2.b.T0(r1, r14)
            goto L_0x0435
        L_0x0447:
            boolean r10 = R2.b.w0(r1, r14)
            goto L_0x0435
        L_0x044c:
            java.util.ArrayList r9 = R2.b.t(r1, r14)
            goto L_0x0435
        L_0x0451:
            java.lang.String r8 = R2.b.r(r1, r14)
            goto L_0x0435
        L_0x0456:
            boolean r7 = R2.b.w0(r1, r14)
            goto L_0x0435
        L_0x045b:
            java.lang.String r6 = R2.b.r(r1, r14)
            goto L_0x0435
        L_0x0460:
            java.lang.String r5 = R2.b.r(r1, r14)
            goto L_0x0435
        L_0x0465:
            boolean r4 = R2.b.w0(r1, r14)
            goto L_0x0435
        L_0x046a:
            R2.b.x(r0, r14)
            t1.b r14 = new t1.b
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r14
        L_0x0474:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r8 = r1
            r9 = r8
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x0480:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x04b0
            int r1 = r14.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x04ab;
                case 2: goto L_0x04a6;
                case 3: goto L_0x04a1;
                case 4: goto L_0x049c;
                case 5: goto L_0x0497;
                case 6: goto L_0x0492;
                default: goto L_0x048e;
            }
        L_0x048e:
            R2.b.T0(r1, r14)
            goto L_0x0480
        L_0x0492:
            int r9 = R2.b.A0(r1, r14)
            goto L_0x0480
        L_0x0497:
            boolean r8 = R2.b.w0(r1, r14)
            goto L_0x0480
        L_0x049c:
            java.lang.String r7 = R2.b.r(r1, r14)
            goto L_0x0480
        L_0x04a1:
            java.lang.String r6 = R2.b.r(r1, r14)
            goto L_0x0480
        L_0x04a6:
            java.lang.String r5 = R2.b.r(r1, r14)
            goto L_0x0480
        L_0x04ab:
            java.lang.String r4 = R2.b.r(r1, r14)
            goto L_0x0480
        L_0x04b0:
            R2.b.x(r0, r14)
            t1.j r14 = new t1.j
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r14
        L_0x04ba:
            int r0 = R2.b.c1(r14)
            r1 = 0
        L_0x04bf:
            int r2 = r14.dataPosition()
            if (r2 >= r0) goto L_0x04d6
            int r2 = r14.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x04d1
            R2.b.T0(r2, r14)
            goto L_0x04bf
        L_0x04d1:
            int r1 = R2.b.A0(r2, r14)
            goto L_0x04bf
        L_0x04d6:
            R2.b.x(r0, r14)
            t1.i r14 = new t1.i
            r14.<init>(r1)
            return r14
        L_0x04df:
            int r0 = R2.b.c1(r14)
            r1 = 0
        L_0x04e4:
            int r2 = r14.dataPosition()
            if (r2 >= r0) goto L_0x04ff
            int r2 = r14.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x04f6
            R2.b.T0(r2, r14)
            goto L_0x04e4
        L_0x04f6:
            android.os.Parcelable$Creator r1 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r2, r1)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            goto L_0x04e4
        L_0x04ff:
            R2.b.x(r0, r14)
            t1.g r14 = new t1.g
            r14.<init>(r1)
            return r14
        L_0x0508:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
            r6 = r5
            r9 = r6
            r10 = r9
            r7 = r2
            r8 = r7
        L_0x0515:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x055e
            int r1 = r14.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x0554;
                case 2: goto L_0x054a;
                case 3: goto L_0x0545;
                case 4: goto L_0x0540;
                case 5: goto L_0x053b;
                case 6: goto L_0x0531;
                case 7: goto L_0x0527;
                default: goto L_0x0523;
            }
        L_0x0523:
            R2.b.T0(r1, r14)
            goto L_0x0515
        L_0x0527:
            android.os.Parcelable$Creator<t1.c> r2 = t1.C0988c.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r10 = r1
            t1.c r10 = (t1.C0988c) r10
            goto L_0x0515
        L_0x0531:
            android.os.Parcelable$Creator<t1.d> r2 = t1.C0989d.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r9 = r1
            t1.d r9 = (t1.C0989d) r9
            goto L_0x0515
        L_0x053b:
            int r8 = R2.b.A0(r1, r14)
            goto L_0x0515
        L_0x0540:
            boolean r7 = R2.b.w0(r1, r14)
            goto L_0x0515
        L_0x0545:
            java.lang.String r6 = R2.b.r(r1, r14)
            goto L_0x0515
        L_0x054a:
            android.os.Parcelable$Creator<t1.b> r2 = t1.C0987b.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r5 = r1
            t1.b r5 = (t1.C0987b) r5
            goto L_0x0515
        L_0x0554:
            android.os.Parcelable$Creator<t1.e> r2 = t1.C0990e.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r4 = r1
            t1.e r4 = (t1.C0990e) r4
            goto L_0x0515
        L_0x055e:
            R2.b.x(r0, r14)
            t1.f r14 = new t1.f
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r14
        L_0x0568:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x0573:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x05ad
            int r1 = r14.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x05a8;
                case 2: goto L_0x05a3;
                case 3: goto L_0x059e;
                case 4: goto L_0x0599;
                case 5: goto L_0x058f;
                case 6: goto L_0x0585;
                default: goto L_0x0581;
            }
        L_0x0581:
            R2.b.T0(r1, r14)
            goto L_0x0573
        L_0x0585:
            android.os.Parcelable$Creator r2 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r8 = r1
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8
            goto L_0x0573
        L_0x058f:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r2 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r7 = r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r7 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r7
            goto L_0x0573
        L_0x0599:
            java.util.ArrayList r6 = R2.b.t(r1, r14)
            goto L_0x0573
        L_0x059e:
            java.lang.String r5 = R2.b.r(r1, r14)
            goto L_0x0573
        L_0x05a3:
            java.lang.String r4 = R2.b.r(r1, r14)
            goto L_0x0573
        L_0x05a8:
            java.lang.String r3 = R2.b.r(r1, r14)
            goto L_0x0573
        L_0x05ad:
            R2.b.x(r0, r14)
            t1.a r14 = new t1.a
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r14
        L_0x05b7:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r6 = r1
            r7 = r6
            r11 = r7
            r4 = r2
            r5 = r4
            r8 = r5
            r9 = r8
            r10 = r9
        L_0x05c5:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x0606
            int r1 = r14.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x05ff;
                case 2: goto L_0x05fa;
                case 3: goto L_0x05f5;
                case 4: goto L_0x05f0;
                case 5: goto L_0x05e6;
                case 6: goto L_0x05e1;
                case 7: goto L_0x05dc;
                case 8: goto L_0x05d7;
                default: goto L_0x05d3;
            }
        L_0x05d3:
            R2.b.T0(r1, r14)
            goto L_0x05c5
        L_0x05d7:
            boolean r11 = R2.b.w0(r1, r14)
            goto L_0x05c5
        L_0x05dc:
            java.lang.String r10 = R2.b.r(r1, r14)
            goto L_0x05c5
        L_0x05e1:
            java.lang.String r9 = R2.b.r(r1, r14)
            goto L_0x05c5
        L_0x05e6:
            android.os.Parcelable$Creator r2 = android.accounts.Account.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r8 = r1
            android.accounts.Account r8 = (android.accounts.Account) r8
            goto L_0x05c5
        L_0x05f0:
            boolean r7 = R2.b.w0(r1, r14)
            goto L_0x05c5
        L_0x05f5:
            boolean r6 = R2.b.w0(r1, r14)
            goto L_0x05c5
        L_0x05fa:
            java.lang.String r5 = R2.b.r(r1, r14)
            goto L_0x05c5
        L_0x05ff:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r2 = com.google.android.gms.common.api.Scope.CREATOR
            java.util.ArrayList r4 = R2.b.v(r14, r1, r2)
            goto L_0x05c5
        L_0x0606:
            R2.b.x(r0, r14)
            com.google.android.gms.auth.api.identity.AuthorizationRequest r14 = new com.google.android.gms.auth.api.identity.AuthorizationRequest
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r14
        L_0x0610:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = r1
        L_0x0616:
            int r3 = r14.dataPosition()
            if (r3 >= r0) goto L_0x0635
            int r3 = r14.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0630
            r5 = 2
            if (r4 == r5) goto L_0x062b
            R2.b.T0(r3, r14)
            goto L_0x0616
        L_0x062b:
            java.lang.String r2 = R2.b.r(r3, r14)
            goto L_0x0616
        L_0x0630:
            java.lang.String r1 = R2.b.r(r3, r14)
            goto L_0x0616
        L_0x0635:
            R2.b.x(r0, r14)
            com.google.android.gms.auth.api.credentials.IdToken r14 = new com.google.android.gms.auth.api.credentials.IdToken
            r14.<init>(r1, r2)
            return r14
        L_0x063e:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r5 = r1
            r8 = r5
            r10 = r8
            r11 = r10
            r4 = r2
            r6 = r4
            r7 = r6
            r9 = r7
        L_0x064c:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x068f
            int r1 = r14.readInt()
            char r2 = (char) r1
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r3) goto L_0x068a
            switch(r2) {
                case 1: goto L_0x0680;
                case 2: goto L_0x067b;
                case 3: goto L_0x0676;
                case 4: goto L_0x0671;
                case 5: goto L_0x066c;
                case 6: goto L_0x0667;
                case 7: goto L_0x0662;
                default: goto L_0x065e;
            }
        L_0x065e:
            R2.b.T0(r1, r14)
            goto L_0x064c
        L_0x0662:
            java.lang.String r11 = R2.b.r(r1, r14)
            goto L_0x064c
        L_0x0667:
            java.lang.String r10 = R2.b.r(r1, r14)
            goto L_0x064c
        L_0x066c:
            boolean r9 = R2.b.w0(r1, r14)
            goto L_0x064c
        L_0x0671:
            java.lang.String[] r8 = R2.b.s(r1, r14)
            goto L_0x064c
        L_0x0676:
            boolean r7 = R2.b.w0(r1, r14)
            goto L_0x064c
        L_0x067b:
            boolean r6 = R2.b.w0(r1, r14)
            goto L_0x064c
        L_0x0680:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.credentials.CredentialPickerConfig> r2 = com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r5 = r1
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r5 = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) r5
            goto L_0x064c
        L_0x068a:
            int r4 = R2.b.A0(r1, r14)
            goto L_0x064c
        L_0x068f:
            R2.b.x(r0, r14)
            com.google.android.gms.auth.api.credentials.HintRequest r14 = new com.google.android.gms.auth.api.credentials.HintRequest
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r14
        L_0x0699:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r2 = 0
            r4 = r1
            r5 = r4
            r9 = r5
            r12 = r9
            r6 = r2
            r7 = r6
            r8 = r7
            r10 = r8
            r11 = r10
        L_0x06a8:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x06f5
            int r1 = r14.readInt()
            char r2 = (char) r1
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r3) goto L_0x06f0
            switch(r2) {
                case 1: goto L_0x06eb;
                case 2: goto L_0x06e6;
                case 3: goto L_0x06dc;
                case 4: goto L_0x06d2;
                case 5: goto L_0x06cd;
                case 6: goto L_0x06c8;
                case 7: goto L_0x06c3;
                case 8: goto L_0x06be;
                default: goto L_0x06ba;
            }
        L_0x06ba:
            R2.b.T0(r1, r14)
            goto L_0x06a8
        L_0x06be:
            boolean r12 = R2.b.w0(r1, r14)
            goto L_0x06a8
        L_0x06c3:
            java.lang.String r11 = R2.b.r(r1, r14)
            goto L_0x06a8
        L_0x06c8:
            java.lang.String r10 = R2.b.r(r1, r14)
            goto L_0x06a8
        L_0x06cd:
            boolean r9 = R2.b.w0(r1, r14)
            goto L_0x06a8
        L_0x06d2:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.credentials.CredentialPickerConfig> r2 = com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r8 = r1
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r8 = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) r8
            goto L_0x06a8
        L_0x06dc:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.credentials.CredentialPickerConfig> r2 = com.google.android.gms.auth.api.credentials.CredentialPickerConfig.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r7 = r1
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r7 = (com.google.android.gms.auth.api.credentials.CredentialPickerConfig) r7
            goto L_0x06a8
        L_0x06e6:
            java.lang.String[] r6 = R2.b.s(r1, r14)
            goto L_0x06a8
        L_0x06eb:
            boolean r5 = R2.b.w0(r1, r14)
            goto L_0x06a8
        L_0x06f0:
            int r4 = R2.b.A0(r1, r14)
            goto L_0x06a8
        L_0x06f5:
            R2.b.x(r0, r14)
            s1.a r14 = new s1.a
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r14
        L_0x06ff:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x0709:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x0741
            int r1 = r14.readInt()
            char r2 = (char) r1
            r8 = 1
            if (r2 == r8) goto L_0x073c
            r8 = 2
            if (r2 == r8) goto L_0x0737
            r8 = 3
            if (r2 == r8) goto L_0x0732
            r8 = 4
            if (r2 == r8) goto L_0x072d
            r8 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r8) goto L_0x0728
            R2.b.T0(r1, r14)
            goto L_0x0709
        L_0x0728:
            int r3 = R2.b.A0(r1, r14)
            goto L_0x0709
        L_0x072d:
            int r7 = R2.b.A0(r1, r14)
            goto L_0x0709
        L_0x0732:
            boolean r6 = R2.b.w0(r1, r14)
            goto L_0x0709
        L_0x0737:
            boolean r5 = R2.b.w0(r1, r14)
            goto L_0x0709
        L_0x073c:
            boolean r4 = R2.b.w0(r1, r14)
            goto L_0x0709
        L_0x0741:
            R2.b.x(r0, r14)
            com.google.android.gms.auth.api.credentials.CredentialPickerConfig r14 = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7)
            return r14
        L_0x074b:
            int r0 = R2.b.c1(r14)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x0758:
            int r1 = r14.dataPosition()
            if (r1 >= r0) goto L_0x0799
            int r1 = r14.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x0794;
                case 2: goto L_0x078f;
                case 3: goto L_0x0785;
                case 4: goto L_0x077e;
                case 5: goto L_0x0779;
                case 6: goto L_0x0774;
                case 7: goto L_0x0766;
                case 8: goto L_0x0766;
                case 9: goto L_0x076f;
                case 10: goto L_0x076a;
                default: goto L_0x0766;
            }
        L_0x0766:
            R2.b.T0(r1, r14)
            goto L_0x0758
        L_0x076a:
            java.lang.String r10 = R2.b.r(r1, r14)
            goto L_0x0758
        L_0x076f:
            java.lang.String r9 = R2.b.r(r1, r14)
            goto L_0x0758
        L_0x0774:
            java.lang.String r8 = R2.b.r(r1, r14)
            goto L_0x0758
        L_0x0779:
            java.lang.String r7 = R2.b.r(r1, r14)
            goto L_0x0758
        L_0x077e:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.credentials.IdToken> r2 = com.google.android.gms.auth.api.credentials.IdToken.CREATOR
            java.util.ArrayList r6 = R2.b.v(r14, r1, r2)
            goto L_0x0758
        L_0x0785:
            android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
            android.os.Parcelable r1 = R2.b.q(r14, r1, r2)
            r5 = r1
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x0758
        L_0x078f:
            java.lang.String r4 = R2.b.r(r1, r14)
            goto L_0x0758
        L_0x0794:
            java.lang.String r3 = R2.b.r(r1, r14)
            goto L_0x0758
        L_0x0799:
            R2.b.x(r0, r14)
            com.google.android.gms.auth.api.credentials.Credential r14 = new com.google.android.gms.auth.api.credentials.Credential
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final Object[] newArray(int i2) {
        switch (this.f11436a) {
            case 0:
                return new Credential[i2];
            case 1:
                return new CredentialPickerConfig[i2];
            case 2:
                return new C0961a[i2];
            case 3:
                return new HintRequest[i2];
            case 4:
                return new IdToken[i2];
            case 5:
                return new AuthorizationRequest[i2];
            case zzaky.zzf.zzf:
                return new C0986a[i2];
            case zzaky.zzf.zzg:
                return new C0991f[i2];
            case 8:
                return new C0992g[i2];
            case 9:
                return new C0994i[i2];
            case 10:
                return new C0995j[i2];
            case ModuleDescriptor.MODULE_VERSION:
                return new C0987b[i2];
            case 12:
                return new C0988c[i2];
            case 13:
                return new C0989d[i2];
            case 14:
                return new C0990e[i2];
            case 15:
                return new SaveAccountLinkingTokenRequest[i2];
            case 16:
                return new C0996k[i2];
            case 17:
                return new C0997l[i2];
            case 18:
                return new C0998m[i2];
            case 19:
                return new C1000o[i2];
            case 20:
                return new C1001p[i2];
            case 21:
                return new ParcelImpl[i2];
            case 22:
                return new C1040a[i2];
            case 23:
                return new C1041b[i2];
            case 24:
                return new C1095a[i2];
            case 25:
                return new SignInConfiguration[i2];
            case 26:
                return new C1132b[i2];
            case 27:
                return new d[i2];
            case 28:
                return new t[i2];
            default:
                return new u[i2];
        }
    }
}
