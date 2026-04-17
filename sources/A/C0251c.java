package a;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import androidx.fragment.app.C0270b;
import androidx.fragment.app.C0271c;
import androidx.fragment.app.F;
import androidx.fragment.app.J;
import androidx.fragment.app.M;
import c.C0326a;
import c.C0334i;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.A;
import com.google.android.gms.common.internal.B;
import com.google.android.gms.common.internal.C0378g;
import com.google.android.gms.common.internal.C0381j;
import com.google.android.gms.common.internal.C0382k;
import com.google.android.gms.common.internal.C0389s;
import com.google.android.gms.common.internal.C0391u;
import com.google.android.gms.common.internal.C0392v;
import com.google.android.gms.common.internal.P;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.material.datepicker.b;
import com.google.android.material.datepicker.d;

/* renamed from: a.c  reason: case insensitive filesystem */
public final class C0251c implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4533a;

    public /* synthetic */ C0251c(int i2) {
        this.f4533a = i2;
    }

    public static void a(C0382k kVar, Parcel parcel, int i2) {
        int W02 = a.W0(20293, parcel);
        int i5 = kVar.f6185a;
        a.Y0(parcel, 1, 4);
        parcel.writeInt(i5);
        a.Y0(parcel, 2, 4);
        parcel.writeInt(kVar.f6186b);
        a.Y0(parcel, 3, 4);
        parcel.writeInt(kVar.f6187c);
        a.R0(parcel, 4, kVar.d, false);
        a.M0(parcel, 5, kVar.f6188e);
        a.U0(parcel, 6, kVar.f6189f, i2);
        a.J0(parcel, 7, kVar.f6190p, false);
        a.Q0(parcel, 8, kVar.f6191q, i2, false);
        a.U0(parcel, 10, kVar.f6192r, i2);
        a.U0(parcel, 11, kVar.f6193s, i2);
        a.Y0(parcel, 12, 4);
        parcel.writeInt(kVar.f6194t ? 1 : 0);
        a.Y0(parcel, 13, 4);
        parcel.writeInt(kVar.f6195u);
        boolean z3 = kVar.f6196v;
        a.Y0(parcel, 14, 4);
        parcel.writeInt(z3 ? 1 : 0);
        a.R0(parcel, 15, kVar.f6197w, false);
        a.X0(W02, parcel);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [a.e, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v1, types: [a.b] */
    /* JADX WARNING: type inference failed for: r7v2, types: [a.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v10, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v12, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v16, types: [java.lang.Object, androidx.fragment.app.F] */
    /* JADX WARNING: type inference failed for: r1v17, types: [java.lang.Object, androidx.fragment.app.J] */
    /* JADX WARNING: type inference failed for: r7v6, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r7v18, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r6v19, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r0v20, types: [com.google.android.gms.common.internal.P, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v50, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v54, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v55, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v56, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r2v57, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r7v31 */
    /* JADX WARNING: type inference failed for: r7v32 */
    /* JADX WARNING: type inference failed for: r7v33 */
    /* JADX WARNING: type inference failed for: r7v36 */
    /* JADX WARNING: type inference failed for: r7v42 */
    /* JADX WARNING: type inference failed for: r7v46 */
    /* JADX WARNING: type inference failed for: r7v50 */
    /* JADX WARNING: type inference failed for: r7v56 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04f8  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x04fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            r24 = this;
            r0 = r25
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = r24
            int r9 = r8.f4533a
            switch(r9) {
                case 0: goto L_0x0510;
                case 1: goto L_0x050a;
                case 2: goto L_0x049f;
                case 3: goto L_0x0499;
                case 4: goto L_0x048b;
                case 5: goto L_0x0485;
                case 6: goto L_0x0475;
                case 7: goto L_0x046b;
                case 8: goto L_0x0447;
                case 9: goto L_0x0441;
                case 10: goto L_0x043b;
                case 11: goto L_0x0435;
                case 12: goto L_0x0423;
                case 13: goto L_0x03d5;
                case 14: goto L_0x03cf;
                case 15: goto L_0x03b0;
                case 16: goto L_0x0382;
                case 17: goto L_0x0358;
                case 18: goto L_0x0316;
                case 19: goto L_0x02ec;
                case 20: goto L_0x02c0;
                case 21: goto L_0x0256;
                case 22: goto L_0x0213;
                case 23: goto L_0x01c9;
                case 24: goto L_0x0184;
                case 25: goto L_0x013a;
                case 26: goto L_0x00f1;
                case 27: goto L_0x0055;
                case 28: goto L_0x001a;
                default: goto L_0x0010;
            }
        L_0x0010:
            com.google.android.material.datepicker.d r1 = new com.google.android.material.datepicker.d
            long r2 = r25.readLong()
            r1.<init>(r2)
            return r1
        L_0x001a:
            java.lang.Class<com.google.android.material.datepicker.o> r1 = com.google.android.material.datepicker.o.class
            java.lang.ClassLoader r2 = r1.getClassLoader()
            android.os.Parcelable r2 = r0.readParcelable(r2)
            r10 = r2
            com.google.android.material.datepicker.o r10 = (com.google.android.material.datepicker.o) r10
            java.lang.ClassLoader r2 = r1.getClassLoader()
            android.os.Parcelable r2 = r0.readParcelable(r2)
            r11 = r2
            com.google.android.material.datepicker.o r11 = (com.google.android.material.datepicker.o) r11
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r0.readParcelable(r1)
            r13 = r1
            com.google.android.material.datepicker.o r13 = (com.google.android.material.datepicker.o) r13
            java.lang.Class<com.google.android.material.datepicker.d> r1 = com.google.android.material.datepicker.d.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r0.readParcelable(r1)
            r12 = r1
            com.google.android.material.datepicker.d r12 = (com.google.android.material.datepicker.d) r12
            int r14 = r25.readInt()
            com.google.android.material.datepicker.b r0 = new com.google.android.material.datepicker.b
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        L_0x0055:
            int r1 = R2.b.c1(r25)
            com.google.android.gms.common.api.Scope[] r2 = com.google.android.gms.common.internal.C0382k.f6183x
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            z1.d[] r4 = com.google.android.gms.common.internal.C0382k.f6184y
            r15 = r2
            r16 = r3
            r18 = r4
            r19 = r18
            r10 = r6
            r11 = r10
            r12 = r11
            r20 = r12
            r21 = r20
            r22 = r21
            r13 = r7
            r14 = r13
            r17 = r14
            r23 = r17
        L_0x0078:
            int r2 = r25.dataPosition()
            if (r2 >= r1) goto L_0x00e7
            int r2 = r25.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x00e2;
                case 2: goto L_0x00dd;
                case 3: goto L_0x00d8;
                case 4: goto L_0x00d3;
                case 5: goto L_0x00ce;
                case 6: goto L_0x00c4;
                case 7: goto L_0x00bf;
                case 8: goto L_0x00b4;
                case 9: goto L_0x0086;
                case 10: goto L_0x00a9;
                case 11: goto L_0x009e;
                case 12: goto L_0x0099;
                case 13: goto L_0x0094;
                case 14: goto L_0x008f;
                case 15: goto L_0x008a;
                default: goto L_0x0086;
            }
        L_0x0086:
            R2.b.T0(r2, r0)
            goto L_0x0078
        L_0x008a:
            java.lang.String r23 = R2.b.r(r2, r0)
            goto L_0x0078
        L_0x008f:
            boolean r22 = R2.b.w0(r2, r0)
            goto L_0x0078
        L_0x0094:
            int r21 = R2.b.A0(r2, r0)
            goto L_0x0078
        L_0x0099:
            boolean r20 = R2.b.w0(r2, r0)
            goto L_0x0078
        L_0x009e:
            android.os.Parcelable$Creator<z1.d> r3 = z1.d.CREATOR
            java.lang.Object[] r2 = R2.b.u(r0, r2, r3)
            r19 = r2
            z1.d[] r19 = (z1.d[]) r19
            goto L_0x0078
        L_0x00a9:
            android.os.Parcelable$Creator<z1.d> r3 = z1.d.CREATOR
            java.lang.Object[] r2 = R2.b.u(r0, r2, r3)
            r18 = r2
            z1.d[] r18 = (z1.d[]) r18
            goto L_0x0078
        L_0x00b4:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r17 = r2
            android.accounts.Account r17 = (android.accounts.Account) r17
            goto L_0x0078
        L_0x00bf:
            android.os.Bundle r16 = R2.b.n(r2, r0)
            goto L_0x0078
        L_0x00c4:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Scope> r3 = com.google.android.gms.common.api.Scope.CREATOR
            java.lang.Object[] r2 = R2.b.u(r0, r2, r3)
            r15 = r2
            com.google.android.gms.common.api.Scope[] r15 = (com.google.android.gms.common.api.Scope[]) r15
            goto L_0x0078
        L_0x00ce:
            android.os.IBinder r14 = R2.b.z0(r2, r0)
            goto L_0x0078
        L_0x00d3:
            java.lang.String r13 = R2.b.r(r2, r0)
            goto L_0x0078
        L_0x00d8:
            int r12 = R2.b.A0(r2, r0)
            goto L_0x0078
        L_0x00dd:
            int r11 = R2.b.A0(r2, r0)
            goto L_0x0078
        L_0x00e2:
            int r10 = R2.b.A0(r2, r0)
            goto L_0x0078
        L_0x00e7:
            R2.b.x(r1, r0)
            com.google.android.gms.common.internal.k r0 = new com.google.android.gms.common.internal.k
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        L_0x00f1:
            int r1 = R2.b.c1(r25)
            r11 = r6
            r12 = r11
            r14 = r12
            r10 = r7
            r13 = r10
            r15 = r13
        L_0x00fb:
            int r2 = r25.dataPosition()
            if (r2 >= r1) goto L_0x0130
            int r2 = r25.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0126;
                case 2: goto L_0x0121;
                case 3: goto L_0x011c;
                case 4: goto L_0x0117;
                case 5: goto L_0x0112;
                case 6: goto L_0x010d;
                default: goto L_0x0109;
            }
        L_0x0109:
            R2.b.T0(r2, r0)
            goto L_0x00fb
        L_0x010d:
            int[] r15 = R2.b.p(r2, r0)
            goto L_0x00fb
        L_0x0112:
            int r14 = R2.b.A0(r2, r0)
            goto L_0x00fb
        L_0x0117:
            int[] r13 = R2.b.p(r2, r0)
            goto L_0x00fb
        L_0x011c:
            boolean r12 = R2.b.w0(r2, r0)
            goto L_0x00fb
        L_0x0121:
            boolean r11 = R2.b.w0(r2, r0)
            goto L_0x00fb
        L_0x0126:
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.u> r3 = com.google.android.gms.common.internal.C0391u.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r10 = r2
            com.google.android.gms.common.internal.u r10 = (com.google.android.gms.common.internal.C0391u) r10
            goto L_0x00fb
        L_0x0130:
            R2.b.x(r1, r0)
            com.google.android.gms.common.internal.j r0 = new com.google.android.gms.common.internal.j
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r0
        L_0x013a:
            int r1 = R2.b.c1(r25)
            r9 = r7
            r10 = r9
        L_0x0140:
            int r11 = r25.dataPosition()
            if (r11 >= r1) goto L_0x0173
            int r11 = r25.readInt()
            char r12 = (char) r11
            if (r12 == r4) goto L_0x016e
            if (r12 == r5) goto L_0x0165
            if (r12 == r3) goto L_0x0160
            if (r12 == r2) goto L_0x0157
            R2.b.T0(r11, r0)
            goto L_0x0140
        L_0x0157:
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.j> r10 = com.google.android.gms.common.internal.C0381j.CREATOR
            android.os.Parcelable r10 = R2.b.q(r0, r11, r10)
            com.google.android.gms.common.internal.j r10 = (com.google.android.gms.common.internal.C0381j) r10
            goto L_0x0140
        L_0x0160:
            int r6 = R2.b.A0(r11, r0)
            goto L_0x0140
        L_0x0165:
            android.os.Parcelable$Creator<z1.d> r9 = z1.d.CREATOR
            java.lang.Object[] r9 = R2.b.u(r0, r11, r9)
            z1.d[] r9 = (z1.d[]) r9
            goto L_0x0140
        L_0x016e:
            android.os.Bundle r7 = R2.b.n(r11, r0)
            goto L_0x0140
        L_0x0173:
            R2.b.x(r1, r0)
            com.google.android.gms.common.internal.P r0 = new com.google.android.gms.common.internal.P
            r0.<init>()
            r0.f6148a = r7
            r0.f6149b = r9
            r0.f6150c = r6
            r0.d = r10
            return r0
        L_0x0184:
            int r7 = R2.b.c1(r25)
            r10 = r6
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
        L_0x018d:
            int r6 = r25.dataPosition()
            if (r6 >= r7) goto L_0x01bf
            int r6 = r25.readInt()
            char r9 = (char) r6
            if (r9 == r4) goto L_0x01ba
            if (r9 == r5) goto L_0x01b5
            if (r9 == r3) goto L_0x01b0
            if (r9 == r2) goto L_0x01ab
            if (r9 == r1) goto L_0x01a6
            R2.b.T0(r6, r0)
            goto L_0x018d
        L_0x01a6:
            int r12 = R2.b.A0(r6, r0)
            goto L_0x018d
        L_0x01ab:
            int r11 = R2.b.A0(r6, r0)
            goto L_0x018d
        L_0x01b0:
            boolean r14 = R2.b.w0(r6, r0)
            goto L_0x018d
        L_0x01b5:
            boolean r13 = R2.b.w0(r6, r0)
            goto L_0x018d
        L_0x01ba:
            int r10 = R2.b.A0(r6, r0)
            goto L_0x018d
        L_0x01bf:
            R2.b.x(r7, r0)
            com.google.android.gms.common.internal.u r0 = new com.google.android.gms.common.internal.u
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        L_0x01c9:
            int r9 = R2.b.c1(r25)
            r11 = r6
            r14 = r11
            r15 = r14
            r12 = r7
            r13 = r12
        L_0x01d2:
            int r6 = r25.dataPosition()
            if (r6 >= r9) goto L_0x0209
            int r6 = r25.readInt()
            char r7 = (char) r6
            if (r7 == r4) goto L_0x0204
            if (r7 == r5) goto L_0x01ff
            if (r7 == r3) goto L_0x01f5
            if (r7 == r2) goto L_0x01f0
            if (r7 == r1) goto L_0x01eb
            R2.b.T0(r6, r0)
            goto L_0x01d2
        L_0x01eb:
            boolean r15 = R2.b.w0(r6, r0)
            goto L_0x01d2
        L_0x01f0:
            boolean r14 = R2.b.w0(r6, r0)
            goto L_0x01d2
        L_0x01f5:
            android.os.Parcelable$Creator<z1.b> r7 = z1.C1132b.CREATOR
            android.os.Parcelable r6 = R2.b.q(r0, r6, r7)
            r13 = r6
            z1.b r13 = (z1.C1132b) r13
            goto L_0x01d2
        L_0x01ff:
            android.os.IBinder r12 = R2.b.z0(r6, r0)
            goto L_0x01d2
        L_0x0204:
            int r11 = R2.b.A0(r6, r0)
            goto L_0x01d2
        L_0x0209:
            R2.b.x(r9, r0)
            com.google.android.gms.common.internal.B r0 = new com.google.android.gms.common.internal.B
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x0213:
            int r1 = R2.b.c1(r25)
            r9 = r7
            r10 = r9
            r7 = r6
        L_0x021a:
            int r11 = r25.dataPosition()
            if (r11 >= r1) goto L_0x024d
            int r11 = r25.readInt()
            char r12 = (char) r11
            if (r12 == r4) goto L_0x0248
            if (r12 == r5) goto L_0x023f
            if (r12 == r3) goto L_0x023a
            if (r12 == r2) goto L_0x0231
            R2.b.T0(r11, r0)
            goto L_0x021a
        L_0x0231:
            android.os.Parcelable$Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> r10 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            android.os.Parcelable r10 = R2.b.q(r0, r11, r10)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r10 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r10
            goto L_0x021a
        L_0x023a:
            int r7 = R2.b.A0(r11, r0)
            goto L_0x021a
        L_0x023f:
            android.os.Parcelable$Creator r9 = android.accounts.Account.CREATOR
            android.os.Parcelable r9 = R2.b.q(r0, r11, r9)
            android.accounts.Account r9 = (android.accounts.Account) r9
            goto L_0x021a
        L_0x0248:
            int r6 = R2.b.A0(r11, r0)
            goto L_0x021a
        L_0x024d:
            R2.b.x(r1, r0)
            com.google.android.gms.common.internal.A r0 = new com.google.android.gms.common.internal.A
            r0.<init>(r6, r9, r7, r10)
            return r0
        L_0x0256:
            int r1 = R2.b.c1(r25)
            r2 = -1
            r3 = 0
            r20 = r2
            r13 = r3
            r15 = r13
            r10 = r6
            r11 = r10
            r12 = r11
            r19 = r12
            r17 = r7
            r18 = r17
        L_0x026a:
            int r2 = r25.dataPosition()
            if (r2 >= r1) goto L_0x02b6
            int r2 = r25.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x02b0;
                case 2: goto L_0x02aa;
                case 3: goto L_0x02a4;
                case 4: goto L_0x029e;
                case 5: goto L_0x0298;
                case 6: goto L_0x0291;
                case 7: goto L_0x028a;
                case 8: goto L_0x0283;
                case 9: goto L_0x027c;
                default: goto L_0x0278;
            }
        L_0x0278:
            R2.b.T0(r2, r0)
            goto L_0x026a
        L_0x027c:
            int r2 = R2.b.A0(r2, r0)
            r20 = r2
            goto L_0x026a
        L_0x0283:
            int r2 = R2.b.A0(r2, r0)
            r19 = r2
            goto L_0x026a
        L_0x028a:
            java.lang.String r2 = R2.b.r(r2, r0)
            r18 = r2
            goto L_0x026a
        L_0x0291:
            java.lang.String r2 = R2.b.r(r2, r0)
            r17 = r2
            goto L_0x026a
        L_0x0298:
            long r2 = R2.b.C0(r2, r0)
            r15 = r2
            goto L_0x026a
        L_0x029e:
            long r2 = R2.b.C0(r2, r0)
            r13 = r2
            goto L_0x026a
        L_0x02a4:
            int r2 = R2.b.A0(r2, r0)
            r12 = r2
            goto L_0x026a
        L_0x02aa:
            int r2 = R2.b.A0(r2, r0)
            r11 = r2
            goto L_0x026a
        L_0x02b0:
            int r2 = R2.b.A0(r2, r0)
            r10 = r2
            goto L_0x026a
        L_0x02b6:
            R2.b.x(r1, r0)
            com.google.android.gms.common.internal.s r0 = new com.google.android.gms.common.internal.s
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r15, r17, r18, r19, r20)
            return r0
        L_0x02c0:
            int r1 = R2.b.c1(r25)
        L_0x02c4:
            int r2 = r25.dataPosition()
            if (r2 >= r1) goto L_0x02e3
            int r2 = r25.readInt()
            char r3 = (char) r2
            if (r3 == r4) goto L_0x02de
            if (r3 == r5) goto L_0x02d7
            R2.b.T0(r2, r0)
            goto L_0x02c4
        L_0x02d7:
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.s> r3 = com.google.android.gms.common.internal.C0389s.CREATOR
            java.util.ArrayList r7 = R2.b.v(r0, r2, r3)
            goto L_0x02c4
        L_0x02de:
            int r6 = R2.b.A0(r2, r0)
            goto L_0x02c4
        L_0x02e3:
            R2.b.x(r1, r0)
            com.google.android.gms.common.internal.v r0 = new com.google.android.gms.common.internal.v
            r0.<init>(r6, r7)
            return r0
        L_0x02ec:
            int r1 = R2.b.c1(r25)
        L_0x02f0:
            int r2 = r25.dataPosition()
            if (r2 >= r1) goto L_0x030d
            int r2 = r25.readInt()
            char r3 = (char) r2
            if (r3 == r4) goto L_0x0308
            if (r3 == r5) goto L_0x0303
            R2.b.T0(r2, r0)
            goto L_0x02f0
        L_0x0303:
            java.lang.String r7 = R2.b.r(r2, r0)
            goto L_0x02f0
        L_0x0308:
            int r6 = R2.b.A0(r2, r0)
            goto L_0x02f0
        L_0x030d:
            R2.b.x(r1, r0)
            com.google.android.gms.common.internal.g r0 = new com.google.android.gms.common.internal.g
            r0.<init>(r6, r7)
            return r0
        L_0x0316:
            int r1 = R2.b.c1(r25)
            r9 = r7
            r10 = r9
        L_0x031c:
            int r11 = r25.dataPosition()
            if (r11 >= r1) goto L_0x034f
            int r11 = r25.readInt()
            char r12 = (char) r11
            if (r12 == r4) goto L_0x034a
            if (r12 == r5) goto L_0x0345
            if (r12 == r3) goto L_0x033c
            if (r12 == r2) goto L_0x0333
            R2.b.T0(r11, r0)
            goto L_0x031c
        L_0x0333:
            android.os.Parcelable$Creator<z1.b> r10 = z1.C1132b.CREATOR
            android.os.Parcelable r10 = R2.b.q(r0, r11, r10)
            z1.b r10 = (z1.C1132b) r10
            goto L_0x031c
        L_0x033c:
            android.os.Parcelable$Creator r9 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r9 = R2.b.q(r0, r11, r9)
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            goto L_0x031c
        L_0x0345:
            java.lang.String r7 = R2.b.r(r11, r0)
            goto L_0x031c
        L_0x034a:
            int r6 = R2.b.A0(r11, r0)
            goto L_0x031c
        L_0x034f:
            R2.b.x(r1, r0)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r6, r7, r9, r10)
            return r0
        L_0x0358:
            int r1 = R2.b.c1(r25)
        L_0x035c:
            int r2 = r25.dataPosition()
            if (r2 >= r1) goto L_0x0379
            int r2 = r25.readInt()
            char r3 = (char) r2
            if (r3 == r4) goto L_0x0374
            if (r3 == r5) goto L_0x036f
            R2.b.T0(r2, r0)
            goto L_0x035c
        L_0x036f:
            java.lang.String r7 = R2.b.r(r2, r0)
            goto L_0x035c
        L_0x0374:
            int r6 = R2.b.A0(r2, r0)
            goto L_0x035c
        L_0x0379:
            R2.b.x(r1, r0)
            com.google.android.gms.common.api.Scope r0 = new com.google.android.gms.common.api.Scope
            r0.<init>(r6, r7)
            return r0
        L_0x0382:
            java.lang.String r1 = "inParcel"
            kotlin.jvm.internal.j.e(r0, r1)
            c.i r1 = new c.i
            java.lang.Class<android.content.IntentSender> r2 = android.content.IntentSender.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r0.readParcelable(r2)
            kotlin.jvm.internal.j.b(r2)
            android.content.IntentSender r2 = (android.content.IntentSender) r2
            java.lang.Class<android.content.Intent> r3 = android.content.Intent.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            android.os.Parcelable r3 = r0.readParcelable(r3)
            android.content.Intent r3 = (android.content.Intent) r3
            int r4 = r25.readInt()
            int r0 = r25.readInt()
            r1.<init>(r2, r3, r4, r0)
            return r1
        L_0x03b0:
            java.lang.String r1 = "parcel"
            kotlin.jvm.internal.j.e(r0, r1)
            c.a r1 = new c.a
            int r2 = r25.readInt()
            int r3 = r25.readInt()
            if (r3 != 0) goto L_0x03c2
            goto L_0x03cb
        L_0x03c2:
            android.os.Parcelable$Creator r3 = android.content.Intent.CREATOR
            java.lang.Object r0 = r3.createFromParcel(r0)
            r7 = r0
            android.content.Intent r7 = (android.content.Intent) r7
        L_0x03cb:
            r1.<init>(r7, r2)
            return r1
        L_0x03cf:
            androidx.fragment.app.M r1 = new androidx.fragment.app.M
            r1.<init>((android.os.Parcel) r0)
            return r1
        L_0x03d5:
            androidx.fragment.app.J r1 = new androidx.fragment.app.J
            r1.<init>()
            r1.f5024e = r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f5025f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f5026p = r2
            java.util.ArrayList r2 = r25.createStringArrayList()
            r1.f5021a = r2
            java.util.ArrayList r2 = r25.createStringArrayList()
            r1.f5022b = r2
            android.os.Parcelable$Creator<androidx.fragment.app.b> r2 = androidx.fragment.app.C0270b.CREATOR
            java.lang.Object[] r2 = r0.createTypedArray(r2)
            androidx.fragment.app.b[] r2 = (androidx.fragment.app.C0270b[]) r2
            r1.f5023c = r2
            int r2 = r25.readInt()
            r1.d = r2
            java.lang.String r2 = r25.readString()
            r1.f5024e = r2
            java.util.ArrayList r2 = r25.createStringArrayList()
            r1.f5025f = r2
            android.os.Parcelable$Creator<androidx.fragment.app.c> r2 = androidx.fragment.app.C0271c.CREATOR
            java.util.ArrayList r2 = r0.createTypedArrayList(r2)
            r1.f5026p = r2
            android.os.Parcelable$Creator<androidx.fragment.app.F> r2 = androidx.fragment.app.F.CREATOR
            java.util.ArrayList r0 = r0.createTypedArrayList(r2)
            r1.f5027q = r0
            return r1
        L_0x0423:
            androidx.fragment.app.F r1 = new androidx.fragment.app.F
            r1.<init>()
            java.lang.String r2 = r25.readString()
            r1.f4978a = r2
            int r0 = r25.readInt()
            r1.f4979b = r0
            return r1
        L_0x0435:
            androidx.fragment.app.c r1 = new androidx.fragment.app.c
            r1.<init>(r0)
            return r1
        L_0x043b:
            androidx.fragment.app.b r1 = new androidx.fragment.app.b
            r1.<init>((android.os.Parcel) r0)
            return r1
        L_0x0441:
            android.support.v4.media.session.PlaybackStateCompat r1 = new android.support.v4.media.session.PlaybackStateCompat
            r1.<init>(r0)
            return r1
        L_0x0447:
            android.support.v4.media.session.ParcelableVolumeInfo r1 = new android.support.v4.media.session.ParcelableVolumeInfo
            r1.<init>()
            int r2 = r25.readInt()
            r1.f4580a = r2
            int r2 = r25.readInt()
            r1.f4582c = r2
            int r2 = r25.readInt()
            r1.d = r2
            int r2 = r25.readInt()
            r1.f4583e = r2
            int r0 = r25.readInt()
            r1.f4581b = r0
            return r1
        L_0x046b:
            android.os.Parcelable r0 = r0.readParcelable(r7)
            android.support.v4.media.session.MediaSessionCompat$Token r1 = new android.support.v4.media.session.MediaSessionCompat$Token
            r1.<init>(r0)
            return r1
        L_0x0475:
            android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r1 = new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
            r1.<init>()
            android.os.Parcelable$Creator r2 = android.os.ResultReceiver.CREATOR
            java.lang.Object r0 = r2.createFromParcel(r0)
            android.os.ResultReceiver r0 = (android.os.ResultReceiver) r0
            r1.f4578a = r0
            return r1
        L_0x0485:
            android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = new android.support.v4.media.session.MediaSessionCompat$QueueItem
            r1.<init>(r0)
            return r1
        L_0x048b:
            android.support.v4.media.RatingCompat r1 = new android.support.v4.media.RatingCompat
            int r2 = r25.readInt()
            float r0 = r25.readFloat()
            r1.<init>(r2, r0)
            return r1
        L_0x0499:
            android.support.v4.media.MediaMetadataCompat r1 = new android.support.v4.media.MediaMetadataCompat
            r1.<init>(r0)
            return r1
        L_0x049f:
            android.os.Parcelable$Creator r1 = android.media.MediaDescription.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            if (r0 == 0) goto L_0x0509
            r1 = r0
            android.media.MediaDescription r1 = (android.media.MediaDescription) r1
            java.lang.String r10 = r1.getMediaId()
            java.lang.CharSequence r11 = r1.getTitle()
            java.lang.CharSequence r12 = r1.getSubtitle()
            java.lang.CharSequence r13 = r1.getDescription()
            android.graphics.Bitmap r14 = r1.getIconBitmap()
            android.net.Uri r15 = r1.getIconUri()
            android.os.Bundle r2 = r1.getExtras()
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x04da
            java.lang.Class<android.support.v4.media.session.a> r4 = android.support.v4.media.session.a.class
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r2.setClassLoader(r4)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x04db
        L_0x04da:
            r4 = r7
        L_0x04db:
            if (r4 == 0) goto L_0x04f4
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r9 = r2.containsKey(r6)
            if (r9 == 0) goto L_0x04ee
            int r9 = r2.size()
            if (r9 != r5) goto L_0x04ee
            r16 = r7
            goto L_0x04f6
        L_0x04ee:
            r2.remove(r3)
            r2.remove(r6)
        L_0x04f4:
            r16 = r2
        L_0x04f6:
            if (r4 == 0) goto L_0x04fb
            r17 = r4
            goto L_0x0501
        L_0x04fb:
            android.net.Uri r1 = r1.getMediaUri()
            r17 = r1
        L_0x0501:
            android.support.v4.media.MediaDescriptionCompat r7 = new android.support.v4.media.MediaDescriptionCompat
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r7.f4572r = r0
        L_0x0509:
            return r7
        L_0x050a:
            android.support.v4.media.MediaBrowserCompat$MediaItem r1 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            r1.<init>(r0)
            return r1
        L_0x0510:
            a.e r1 = new a.e
            r1.<init>()
            android.os.IBinder r0 = r25.readStrongBinder()
            int r2 = a.C0252d.f4534b
            if (r0 != 0) goto L_0x051e
            goto L_0x0535
        L_0x051e:
            java.lang.String r2 = a.C0250b.g
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            if (r2 == 0) goto L_0x052e
            boolean r3 = r2 instanceof a.C0250b
            if (r3 == 0) goto L_0x052e
            r7 = r2
            a.b r7 = (a.C0250b) r7
            goto L_0x0535
        L_0x052e:
            a.a r7 = new a.a
            r7.<init>()
            r7.f4532a = r0
        L_0x0535:
            r1.f4536a = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.C0251c.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final Object[] newArray(int i2) {
        switch (this.f4533a) {
            case 0:
                return new C0253e[i2];
            case 1:
                return new MediaBrowserCompat$MediaItem[i2];
            case 2:
                return new MediaDescriptionCompat[i2];
            case 3:
                return new MediaMetadataCompat[i2];
            case 4:
                return new RatingCompat[i2];
            case 5:
                return new MediaSessionCompat$QueueItem[i2];
            case zzaky.zzf.zzf /*6*/:
                return new MediaSessionCompat$ResultReceiverWrapper[i2];
            case zzaky.zzf.zzg /*7*/:
                return new MediaSessionCompat$Token[i2];
            case 8:
                return new ParcelableVolumeInfo[i2];
            case 9:
                return new PlaybackStateCompat[i2];
            case 10:
                return new C0270b[i2];
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return new C0271c[i2];
            case 12:
                return new F[i2];
            case 13:
                return new J[i2];
            case 14:
                return new M[i2];
            case 15:
                return new C0326a[i2];
            case 16:
                return new C0334i[i2];
            case 17:
                return new Scope[i2];
            case 18:
                return new Status[i2];
            case 19:
                return new C0378g[i2];
            case 20:
                return new C0392v[i2];
            case 21:
                return new C0389s[i2];
            case 22:
                return new A[i2];
            case 23:
                return new B[i2];
            case 24:
                return new C0391u[i2];
            case 25:
                return new P[i2];
            case 26:
                return new C0381j[i2];
            case 27:
                return new C0382k[i2];
            case 28:
                return new b[i2];
            default:
                return new d[i2];
        }
    }
}
