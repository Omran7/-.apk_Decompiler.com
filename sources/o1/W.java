package O1;

import P1.a;
import P1.c;
import P1.d;
import P1.f;
import P1.g;
import P1.h;
import Q.k;
import Q1.e;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

public final class W implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2007a;

    public /* synthetic */ W(int i2) {
        this.f2007a = i2;
    }

    /* JADX WARNING: type inference failed for: r2v14, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v15, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v16, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v17, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v18, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v19, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v20, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v21, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v22, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v23, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v98, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v99, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v109, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v110, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v27, types: [android.view.View$BaseSavedState, java.lang.Object, Q.k] */
    /* JADX WARNING: type inference failed for: r0v41, types: [com.google.android.gms.location.LocationAvailability, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v42, types: [com.google.android.gms.location.LocationRequest, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            int r2 = r1.f2007a
            switch(r2) {
                case 0: goto L_0x06c0;
                case 1: goto L_0x0670;
                case 2: goto L_0x05e1;
                case 3: goto L_0x05bc;
                case 4: goto L_0x058e;
                case 5: goto L_0x0560;
                case 6: goto L_0x0515;
                case 7: goto L_0x04d5;
                case 8: goto L_0x049d;
                case 9: goto L_0x045d;
                case 10: goto L_0x041e;
                case 11: goto L_0x03df;
                case 12: goto L_0x03ce;
                case 13: goto L_0x0386;
                case 14: goto L_0x035f;
                case 15: goto L_0x033a;
                case 16: goto L_0x0329;
                case 17: goto L_0x0304;
                case 18: goto L_0x02f3;
                case 19: goto L_0x02bb;
                case 20: goto L_0x0278;
                case 21: goto L_0x0267;
                case 22: goto L_0x0226;
                case 23: goto L_0x01cd;
                case 24: goto L_0x0192;
                case 25: goto L_0x013b;
                case 26: goto L_0x012f;
                case 27: goto L_0x00eb;
                case 28: goto L_0x0092;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r2 = R2.b.c1(r18)
            r3 = 102(0x66, float:1.43E-43)
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            r6 = 600000(0x927c0, double:2.964394E-318)
            r8 = 0
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = 0
            r13 = 0
            r14 = r13
            r13 = r12
            r12 = r11
            r10 = r9
            r9 = r8
        L_0x0026:
            int r1 = r18.dataPosition()
            if (r1 >= r2) goto L_0x0073
            int r1 = r18.readInt()
            r16 = r9
            char r9 = (char) r1
            switch(r9) {
                case 1: goto L_0x006d;
                case 2: goto L_0x0068;
                case 3: goto L_0x0063;
                case 4: goto L_0x005d;
                case 5: goto L_0x0057;
                case 6: goto L_0x0051;
                case 7: goto L_0x0047;
                case 8: goto L_0x0042;
                case 9: goto L_0x003c;
                default: goto L_0x0036;
            }
        L_0x0036:
            R2.b.T0(r1, r0)
        L_0x0039:
            r9 = r16
            goto L_0x0026
        L_0x003c:
            boolean r1 = R2.b.w0(r1, r0)
            r9 = r1
            goto L_0x0026
        L_0x0042:
            long r14 = R2.b.C0(r1, r0)
            goto L_0x0039
        L_0x0047:
            r9 = 4
            R2.b.f1(r0, r1, r9)
            float r1 = r18.readFloat()
            r13 = r1
            goto L_0x0039
        L_0x0051:
            int r1 = R2.b.A0(r1, r0)
            r12 = r1
            goto L_0x0039
        L_0x0057:
            long r9 = R2.b.C0(r1, r0)
            r10 = r9
            goto L_0x0039
        L_0x005d:
            boolean r1 = R2.b.w0(r1, r0)
            r8 = r1
            goto L_0x0039
        L_0x0063:
            long r6 = R2.b.C0(r1, r0)
            goto L_0x0039
        L_0x0068:
            long r4 = R2.b.C0(r1, r0)
            goto L_0x0039
        L_0x006d:
            int r1 = R2.b.A0(r1, r0)
            r3 = r1
            goto L_0x0039
        L_0x0073:
            r16 = r9
            R2.b.x(r2, r0)
            com.google.android.gms.location.LocationRequest r0 = new com.google.android.gms.location.LocationRequest
            r0.<init>()
            r0.f6251a = r3
            r0.f6252b = r4
            r0.f6253c = r6
            r0.d = r8
            r0.f6254e = r10
            r0.f6255f = r12
            r0.f6256p = r13
            r0.f6257q = r14
            r8 = r16
            r0.f6258r = r8
            return r0
        L_0x0092:
            int r1 = R2.b.c1(r18)
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 1
            r4 = 0
            r6 = 0
            r7 = r3
            r8 = r7
        L_0x009e:
            int r9 = r18.dataPosition()
            if (r9 >= r1) goto L_0x00d8
            int r9 = r18.readInt()
            char r10 = (char) r9
            if (r10 == r3) goto L_0x00d3
            r11 = 2
            if (r10 == r11) goto L_0x00ce
            r11 = 3
            if (r10 == r11) goto L_0x00c9
            r11 = 4
            if (r10 == r11) goto L_0x00c4
            r11 = 5
            if (r10 == r11) goto L_0x00bb
            R2.b.T0(r9, r0)
            goto L_0x009e
        L_0x00bb:
            android.os.Parcelable$Creator<Q1.z> r6 = Q1.z.CREATOR
            java.lang.Object[] r6 = R2.b.u(r0, r9, r6)
            Q1.z[] r6 = (Q1.z[]) r6
            goto L_0x009e
        L_0x00c4:
            int r2 = R2.b.A0(r9, r0)
            goto L_0x009e
        L_0x00c9:
            long r4 = R2.b.C0(r9, r0)
            goto L_0x009e
        L_0x00ce:
            int r8 = R2.b.A0(r9, r0)
            goto L_0x009e
        L_0x00d3:
            int r7 = R2.b.A0(r9, r0)
            goto L_0x009e
        L_0x00d8:
            R2.b.x(r1, r0)
            com.google.android.gms.location.LocationAvailability r0 = new com.google.android.gms.location.LocationAvailability
            r0.<init>()
            r0.d = r2
            r0.f6247a = r7
            r0.f6248b = r8
            r0.f6249c = r4
            r0.f6250e = r6
            return r0
        L_0x00eb:
            int r1 = R2.b.c1(r18)
            java.lang.String r2 = ""
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = r3
        L_0x00f5:
            int r6 = r18.dataPosition()
            if (r6 >= r1) goto L_0x0126
            int r6 = r18.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x011f
            r8 = 2
            if (r7 == r8) goto L_0x011a
            r8 = 3
            if (r7 == r8) goto L_0x0115
            r8 = 4
            if (r7 == r8) goto L_0x0110
            R2.b.T0(r6, r0)
            goto L_0x00f5
        L_0x0110:
            java.lang.String r4 = R2.b.r(r6, r0)
            goto L_0x00f5
        L_0x0115:
            java.lang.String r2 = R2.b.r(r6, r0)
            goto L_0x00f5
        L_0x011a:
            int r5 = R2.b.A0(r6, r0)
            goto L_0x00f5
        L_0x011f:
            android.os.Parcelable$Creator<com.google.android.gms.internal.location.zzbe> r3 = com.google.android.gms.internal.location.zzbe.CREATOR
            java.util.ArrayList r3 = R2.b.v(r0, r6, r3)
            goto L_0x00f5
        L_0x0126:
            R2.b.x(r1, r0)
            Q1.e r0 = new Q1.e
            r0.<init>(r3, r5, r2, r4)
            return r0
        L_0x012f:
            Q.k r1 = new Q.k
            r1.<init>(r0)
            int r0 = r18.readInt()
            r1.f2332a = r0
            return r1
        L_0x013b:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x0147:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L_0x0188
            int r2 = r18.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 2: goto L_0x0183;
                case 3: goto L_0x017e;
                case 4: goto L_0x0174;
                case 5: goto L_0x016f;
                case 6: goto L_0x0168;
                case 7: goto L_0x015e;
                case 8: goto L_0x0159;
                default: goto L_0x0155;
            }
        L_0x0155:
            R2.b.T0(r2, r0)
            goto L_0x0147
        L_0x0159:
            java.lang.String r10 = R2.b.r(r2, r0)
            goto L_0x0147
        L_0x015e:
            android.os.Parcelable$Creator<P1.c> r3 = P1.c.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r9 = r2
            P1.c r9 = (P1.c) r9
            goto L_0x0147
        L_0x0168:
            android.os.Parcelable$Creator<P1.h> r3 = P1.h.CREATOR
            java.util.ArrayList r8 = R2.b.v(r0, r2, r3)
            goto L_0x0147
        L_0x016f:
            byte[] r7 = R2.b.o(r2, r0)
            goto L_0x0147
        L_0x0174:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r6 = r2
            android.net.Uri r6 = (android.net.Uri) r6
            goto L_0x0147
        L_0x017e:
            java.lang.Double r5 = R2.b.y0(r2, r0)
            goto L_0x0147
        L_0x0183:
            java.lang.Integer r4 = R2.b.B0(r2, r0)
            goto L_0x0147
        L_0x0188:
            R2.b.x(r1, r0)
            com.google.android.gms.fido.u2f.api.common.SignRequestParams r0 = new com.google.android.gms.fido.u2f.api.common.SignRequestParams
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0192:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0199:
            int r5 = r18.dataPosition()
            if (r5 >= r1) goto L_0x01c4
            int r5 = r18.readInt()
            char r6 = (char) r5
            r7 = 2
            if (r6 == r7) goto L_0x01bb
            r7 = 3
            if (r6 == r7) goto L_0x01b6
            r7 = 4
            if (r6 == r7) goto L_0x01b1
            R2.b.T0(r5, r0)
            goto L_0x0199
        L_0x01b1:
            java.lang.String r4 = R2.b.r(r5, r0)
            goto L_0x0199
        L_0x01b6:
            java.lang.String r3 = R2.b.r(r5, r0)
            goto L_0x0199
        L_0x01bb:
            android.os.Parcelable$Creator<P1.d> r2 = P1.d.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r5, r2)
            P1.d r2 = (P1.d) r2
            goto L_0x0199
        L_0x01c4:
            R2.b.x(r1, r0)
            P1.h r0 = new P1.h
            r0.<init>(r2, r3, r4)
            return r0
        L_0x01cd:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x01d9:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L_0x021c
            int r2 = r18.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 2: goto L_0x0217;
                case 3: goto L_0x0212;
                case 4: goto L_0x0208;
                case 5: goto L_0x0201;
                case 6: goto L_0x01fa;
                case 7: goto L_0x01f0;
                case 8: goto L_0x01eb;
                default: goto L_0x01e7;
            }
        L_0x01e7:
            R2.b.T0(r2, r0)
            goto L_0x01d9
        L_0x01eb:
            java.lang.String r10 = R2.b.r(r2, r0)
            goto L_0x01d9
        L_0x01f0:
            android.os.Parcelable$Creator<P1.c> r3 = P1.c.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r9 = r2
            P1.c r9 = (P1.c) r9
            goto L_0x01d9
        L_0x01fa:
            android.os.Parcelable$Creator<P1.h> r3 = P1.h.CREATOR
            java.util.ArrayList r8 = R2.b.v(r0, r2, r3)
            goto L_0x01d9
        L_0x0201:
            android.os.Parcelable$Creator<P1.g> r3 = P1.g.CREATOR
            java.util.ArrayList r7 = R2.b.v(r0, r2, r3)
            goto L_0x01d9
        L_0x0208:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r6 = r2
            android.net.Uri r6 = (android.net.Uri) r6
            goto L_0x01d9
        L_0x0212:
            java.lang.Double r5 = R2.b.y0(r2, r0)
            goto L_0x01d9
        L_0x0217:
            java.lang.Integer r4 = R2.b.B0(r2, r0)
            goto L_0x01d9
        L_0x021c:
            R2.b.x(r1, r0)
            com.google.android.gms.fido.u2f.api.common.RegisterRequestParams r0 = new com.google.android.gms.fido.u2f.api.common.RegisterRequestParams
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0226:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
            r3 = r4
        L_0x022f:
            int r6 = r18.dataPosition()
            if (r6 >= r1) goto L_0x025e
            int r6 = r18.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x0259
            r8 = 2
            if (r7 == r8) goto L_0x0254
            r8 = 3
            if (r7 == r8) goto L_0x024f
            r8 = 4
            if (r7 == r8) goto L_0x024a
            R2.b.T0(r6, r0)
            goto L_0x022f
        L_0x024a:
            java.lang.String r4 = R2.b.r(r6, r0)
            goto L_0x022f
        L_0x024f:
            byte[] r3 = R2.b.o(r6, r0)
            goto L_0x022f
        L_0x0254:
            java.lang.String r2 = R2.b.r(r6, r0)
            goto L_0x022f
        L_0x0259:
            int r5 = R2.b.A0(r6, r0)
            goto L_0x022f
        L_0x025e:
            R2.b.x(r1, r0)
            P1.g r0 = new P1.g
            r0.<init>(r5, r2, r3, r4)
            return r0
        L_0x0267:
            java.lang.String r0 = r18.readString()
            P1.f r0 = P1.f.a(r0)     // Catch:{ e -> 0x0270 }
            return r0
        L_0x0270:
            r0 = move-exception
            r1 = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0278:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r3
            r3 = r4
        L_0x0281:
            int r6 = r18.dataPosition()
            if (r6 >= r1) goto L_0x02b2
            int r6 = r18.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x02ad
            r8 = 2
            if (r7 == r8) goto L_0x02a8
            r8 = 3
            if (r7 == r8) goto L_0x02a3
            r8 = 4
            if (r7 == r8) goto L_0x029c
            R2.b.T0(r6, r0)
            goto L_0x0281
        L_0x029c:
            android.os.Parcelable$Creator<com.google.android.gms.fido.common.Transport> r4 = com.google.android.gms.fido.common.Transport.CREATOR
            java.util.ArrayList r4 = R2.b.v(r0, r6, r4)
            goto L_0x0281
        L_0x02a3:
            java.lang.String r3 = R2.b.r(r6, r0)
            goto L_0x0281
        L_0x02a8:
            byte[] r2 = R2.b.o(r6, r0)
            goto L_0x0281
        L_0x02ad:
            int r5 = R2.b.A0(r6, r0)
            goto L_0x0281
        L_0x02b2:
            R2.b.x(r1, r0)
            P1.d r0 = new P1.d
            r0.<init>(r5, r2, r3, r4)
            return r0
        L_0x02bb:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        L_0x02c3:
            int r5 = r18.dataPosition()
            if (r5 >= r1) goto L_0x02ea
            int r5 = r18.readInt()
            char r6 = (char) r5
            r7 = 2
            if (r6 == r7) goto L_0x02e5
            r7 = 3
            if (r6 == r7) goto L_0x02e0
            r7 = 4
            if (r6 == r7) goto L_0x02db
            R2.b.T0(r5, r0)
            goto L_0x02c3
        L_0x02db:
            java.lang.String r3 = R2.b.r(r5, r0)
            goto L_0x02c3
        L_0x02e0:
            java.lang.String r2 = R2.b.r(r5, r0)
            goto L_0x02c3
        L_0x02e5:
            int r4 = R2.b.A0(r5, r0)
            goto L_0x02c3
        L_0x02ea:
            R2.b.x(r1, r0)
            P1.c r0 = new P1.c
            r0.<init>(r4, r2, r3)
            return r0
        L_0x02f3:
            int r0 = r18.readInt()
            P1.a r0 = P1.c.v(r0)     // Catch:{ b -> 0x02fc }
            return r0
        L_0x02fc:
            r0 = move-exception
            r1 = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0304:
            int r1 = R2.b.c1(r18)
            r2 = 0
        L_0x0309:
            int r3 = r18.dataPosition()
            if (r3 >= r1) goto L_0x0320
            int r3 = r18.readInt()
            char r4 = (char) r3
            r5 = 2
            if (r4 == r5) goto L_0x031b
            R2.b.T0(r3, r0)
            goto L_0x0309
        L_0x031b:
            java.lang.String r2 = R2.b.r(r3, r0)
            goto L_0x0309
        L_0x0320:
            R2.b.x(r1, r0)
            O1.v r0 = new O1.v
            r0.<init>(r2)
            return r0
        L_0x0329:
            int r0 = r18.readInt()
            O1.u r0 = O1.C0105u.a(r0)     // Catch:{ t -> 0x0332 }
            return r0
        L_0x0332:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x033a:
            int r1 = R2.b.c1(r18)
            r2 = 0
        L_0x033f:
            int r3 = r18.dataPosition()
            if (r3 >= r1) goto L_0x0356
            int r3 = r18.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0351
            R2.b.T0(r3, r0)
            goto L_0x033f
        L_0x0351:
            boolean r2 = R2.b.w0(r3, r0)
            goto L_0x033f
        L_0x0356:
            R2.b.x(r1, r0)
            O1.b0 r0 = new O1.b0
            r0.<init>(r2)
            return r0
        L_0x035f:
            int r1 = R2.b.c1(r18)
            r2 = 0
        L_0x0364:
            int r3 = r18.dataPosition()
            if (r3 >= r1) goto L_0x037d
            int r3 = r18.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0376
            R2.b.T0(r3, r0)
            goto L_0x0364
        L_0x0376:
            android.os.Parcelable$Creator<O1.Z> r2 = O1.Z.CREATOR
            java.util.ArrayList r2 = R2.b.v(r0, r3, r2)
            goto L_0x0364
        L_0x037d:
            R2.b.x(r1, r0)
            O1.a0 r0 = new O1.a0
            r0.<init>(r2)
            return r0
        L_0x0386:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = 0
            r8 = r2
            r9 = r8
            r10 = r9
            r6 = r3
        L_0x0391:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L_0x03c4
            int r2 = r18.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x03be
            r4 = 2
            if (r3 == r4) goto L_0x03b8
            r4 = 3
            if (r3 == r4) goto L_0x03b2
            r4 = 4
            if (r3 == r4) goto L_0x03ac
            R2.b.T0(r2, r0)
            goto L_0x0391
        L_0x03ac:
            byte[] r2 = R2.b.o(r2, r0)
            r10 = r2
            goto L_0x0391
        L_0x03b2:
            byte[] r2 = R2.b.o(r2, r0)
            r9 = r2
            goto L_0x0391
        L_0x03b8:
            byte[] r2 = R2.b.o(r2, r0)
            r8 = r2
            goto L_0x0391
        L_0x03be:
            long r2 = R2.b.C0(r2, r0)
            r6 = r2
            goto L_0x0391
        L_0x03c4:
            R2.b.x(r1, r0)
            O1.Z r0 = new O1.Z
            r5 = r0
            r5.<init>(r6, r8, r9, r10)
            return r0
        L_0x03ce:
            int r0 = r18.readInt()
            O1.r r0 = O1.r.a(r0)     // Catch:{ q -> 0x03d7 }
            return r0
        L_0x03d7:
            r0 = move-exception
            r1 = r0
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x03df:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x03e6:
            int r5 = r18.dataPosition()
            if (r5 >= r1) goto L_0x0415
            int r5 = r18.readInt()
            char r6 = (char) r5
            r7 = 2
            if (r6 == r7) goto L_0x040c
            r7 = 3
            if (r6 == r7) goto L_0x0403
            r7 = 4
            if (r6 == r7) goto L_0x03fe
            R2.b.T0(r5, r0)
            goto L_0x03e6
        L_0x03fe:
            byte[] r4 = R2.b.o(r5, r0)
            goto L_0x03e6
        L_0x0403:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r3 = R2.b.q(r0, r5, r3)
            android.net.Uri r3 = (android.net.Uri) r3
            goto L_0x03e6
        L_0x040c:
            android.os.Parcelable$Creator<O1.B> r2 = O1.B.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r5, r2)
            O1.B r2 = (O1.B) r2
            goto L_0x03e6
        L_0x0415:
            R2.b.x(r1, r0)
            O1.o r0 = new O1.o
            r0.<init>(r2, r3, r4)
            return r0
        L_0x041e:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0425:
            int r5 = r18.dataPosition()
            if (r5 >= r1) goto L_0x0454
            int r5 = r18.readInt()
            char r6 = (char) r5
            r7 = 2
            if (r6 == r7) goto L_0x044b
            r7 = 3
            if (r6 == r7) goto L_0x0442
            r7 = 4
            if (r6 == r7) goto L_0x043d
            R2.b.T0(r5, r0)
            goto L_0x0425
        L_0x043d:
            byte[] r4 = R2.b.o(r5, r0)
            goto L_0x0425
        L_0x0442:
            android.os.Parcelable$Creator r3 = android.net.Uri.CREATOR
            android.os.Parcelable r3 = R2.b.q(r0, r5, r3)
            android.net.Uri r3 = (android.net.Uri) r3
            goto L_0x0425
        L_0x044b:
            android.os.Parcelable$Creator<O1.y> r2 = O1.C0109y.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r5, r2)
            O1.y r2 = (O1.C0109y) r2
            goto L_0x0425
        L_0x0454:
            R2.b.x(r1, r0)
            O1.n r0 = new O1.n
            r0.<init>(r2, r3, r4)
            return r0
        L_0x045d:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L_0x0465:
            int r6 = r18.dataPosition()
            if (r6 >= r1) goto L_0x0494
            int r6 = r18.readInt()
            char r7 = (char) r6
            r8 = 2
            if (r7 == r8) goto L_0x048f
            r8 = 3
            if (r7 == r8) goto L_0x048a
            r8 = 4
            if (r7 == r8) goto L_0x0485
            r8 = 5
            if (r7 == r8) goto L_0x0480
            R2.b.T0(r6, r0)
            goto L_0x0465
        L_0x0480:
            java.lang.String r5 = R2.b.r(r6, r0)
            goto L_0x0465
        L_0x0485:
            java.lang.String r4 = R2.b.r(r6, r0)
            goto L_0x0465
        L_0x048a:
            java.lang.Boolean r3 = R2.b.x0(r6, r0)
            goto L_0x0465
        L_0x048f:
            java.lang.String r2 = R2.b.r(r6, r0)
            goto L_0x0465
        L_0x0494:
            R2.b.x(r1, r0)
            O1.m r0 = new O1.m
            r0.<init>(r2, r3, r4, r5)
            return r0
        L_0x049d:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = r2
        L_0x04a5:
            int r5 = r18.dataPosition()
            if (r5 >= r1) goto L_0x04cc
            int r5 = r18.readInt()
            char r6 = (char) r5
            r7 = 2
            if (r6 == r7) goto L_0x04c7
            r7 = 3
            if (r6 == r7) goto L_0x04c2
            r7 = 4
            if (r6 == r7) goto L_0x04bd
            R2.b.T0(r5, r0)
            goto L_0x04a5
        L_0x04bd:
            int r3 = R2.b.A0(r5, r0)
            goto L_0x04a5
        L_0x04c2:
            java.lang.String r4 = R2.b.r(r5, r0)
            goto L_0x04a5
        L_0x04c7:
            int r2 = R2.b.A0(r5, r0)
            goto L_0x04a5
        L_0x04cc:
            R2.b.x(r1, r0)
            O1.k r0 = new O1.k
            r0.<init>(r2, r4, r3)
            return r0
        L_0x04d5:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L_0x04dd:
            int r6 = r18.dataPosition()
            if (r6 >= r1) goto L_0x050c
            int r6 = r18.readInt()
            char r7 = (char) r6
            r8 = 2
            if (r7 == r8) goto L_0x0507
            r8 = 3
            if (r7 == r8) goto L_0x0502
            r8 = 4
            if (r7 == r8) goto L_0x04fd
            r8 = 5
            if (r7 == r8) goto L_0x04f8
            R2.b.T0(r6, r0)
            goto L_0x04dd
        L_0x04f8:
            java.lang.String[] r5 = R2.b.s(r6, r0)
            goto L_0x04dd
        L_0x04fd:
            byte[] r4 = R2.b.o(r6, r0)
            goto L_0x04dd
        L_0x0502:
            byte[] r3 = R2.b.o(r6, r0)
            goto L_0x04dd
        L_0x0507:
            byte[] r2 = R2.b.o(r6, r0)
            goto L_0x04dd
        L_0x050c:
            R2.b.x(r1, r0)
            O1.j r0 = new O1.j
            r0.<init>(r2, r3, r4, r5)
            return r0
        L_0x0515:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
        L_0x051f:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L_0x0556
            int r2 = r18.readInt()
            char r3 = (char) r2
            r9 = 2
            if (r3 == r9) goto L_0x0551
            r9 = 3
            if (r3 == r9) goto L_0x054c
            r9 = 4
            if (r3 == r9) goto L_0x0547
            r9 = 5
            if (r3 == r9) goto L_0x0542
            r9 = 6
            if (r3 == r9) goto L_0x053d
            R2.b.T0(r2, r0)
            goto L_0x051f
        L_0x053d:
            byte[] r8 = R2.b.o(r2, r0)
            goto L_0x051f
        L_0x0542:
            byte[] r7 = R2.b.o(r2, r0)
            goto L_0x051f
        L_0x0547:
            byte[] r6 = R2.b.o(r2, r0)
            goto L_0x051f
        L_0x054c:
            byte[] r5 = R2.b.o(r2, r0)
            goto L_0x051f
        L_0x0551:
            byte[] r4 = R2.b.o(r2, r0)
            goto L_0x051f
        L_0x0556:
            R2.b.x(r1, r0)
            O1.i r0 = new O1.i
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L_0x0560:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = 0
        L_0x0566:
            int r4 = r18.dataPosition()
            if (r4 >= r1) goto L_0x0585
            int r4 = r18.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x0580
            r6 = 2
            if (r5 == r6) goto L_0x057b
            R2.b.T0(r4, r0)
            goto L_0x0566
        L_0x057b:
            byte[] r2 = R2.b.o(r4, r0)
            goto L_0x0566
        L_0x0580:
            boolean r3 = R2.b.w0(r4, r0)
            goto L_0x0566
        L_0x0585:
            R2.b.x(r1, r0)
            O1.Y r0 = new O1.Y
            r0.<init>(r3, r2)
            return r0
        L_0x058e:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = r2
        L_0x0594:
            int r4 = r18.dataPosition()
            if (r4 >= r1) goto L_0x05b3
            int r4 = r18.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x05ae
            r6 = 2
            if (r5 == r6) goto L_0x05a9
            R2.b.T0(r4, r0)
            goto L_0x0594
        L_0x05a9:
            byte[] r3 = R2.b.o(r4, r0)
            goto L_0x0594
        L_0x05ae:
            byte[] r2 = R2.b.o(r4, r0)
            goto L_0x0594
        L_0x05b3:
            R2.b.x(r1, r0)
            O1.X r0 = new O1.X
            r0.<init>(r2, r3)
            return r0
        L_0x05bc:
            int r1 = R2.b.c1(r18)
            r2 = 0
        L_0x05c1:
            int r3 = r18.dataPosition()
            if (r3 >= r1) goto L_0x05d8
            int r3 = r18.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x05d3
            R2.b.T0(r3, r0)
            goto L_0x05c1
        L_0x05d3:
            boolean r2 = R2.b.w0(r3, r0)
            goto L_0x05c1
        L_0x05d8:
            R2.b.x(r1, r0)
            O1.h r0 = new O1.h
            r0.<init>(r2)
            return r0
        L_0x05e1:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
        L_0x05f0:
            int r2 = r18.dataPosition()
            if (r2 >= r1) goto L_0x0666
            int r2 = r18.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 2: goto L_0x065c;
                case 3: goto L_0x0652;
                case 4: goto L_0x0648;
                case 5: goto L_0x063e;
                case 6: goto L_0x0634;
                case 7: goto L_0x062a;
                case 8: goto L_0x0620;
                case 9: goto L_0x0616;
                case 10: goto L_0x060c;
                case 11: goto L_0x0602;
                default: goto L_0x05fe;
            }
        L_0x05fe:
            R2.b.T0(r2, r0)
            goto L_0x05f0
        L_0x0602:
            android.os.Parcelable$Creator<O1.T> r3 = O1.T.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r13 = r2
            O1.T r13 = (O1.T) r13
            goto L_0x05f0
        L_0x060c:
            android.os.Parcelable$Creator<O1.w> r3 = O1.C0107w.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r12 = r2
            O1.w r12 = (O1.C0107w) r12
            goto L_0x05f0
        L_0x0616:
            android.os.Parcelable$Creator<O1.S> r3 = O1.S.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r11 = r2
            O1.S r11 = (O1.S) r11
            goto L_0x05f0
        L_0x0620:
            android.os.Parcelable$Creator<O1.b0> r3 = O1.b0.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r10 = r2
            O1.b0 r10 = (O1.b0) r10
            goto L_0x05f0
        L_0x062a:
            android.os.Parcelable$Creator<O1.Q> r3 = O1.Q.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r9 = r2
            O1.Q r9 = (O1.Q) r9
            goto L_0x05f0
        L_0x0634:
            android.os.Parcelable$Creator<O1.P> r3 = O1.P.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r8 = r2
            O1.P r8 = (O1.P) r8
            goto L_0x05f0
        L_0x063e:
            android.os.Parcelable$Creator<O1.c0> r3 = O1.c0.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r7 = r2
            O1.c0 r7 = (O1.c0) r7
            goto L_0x05f0
        L_0x0648:
            android.os.Parcelable$Creator<O1.M> r3 = O1.M.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r6 = r2
            O1.M r6 = (O1.M) r6
            goto L_0x05f0
        L_0x0652:
            android.os.Parcelable$Creator<O1.a0> r3 = O1.a0.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r5 = r2
            O1.a0 r5 = (O1.a0) r5
            goto L_0x05f0
        L_0x065c:
            android.os.Parcelable$Creator<O1.v> r3 = O1.C0106v.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r2, r3)
            r4 = r2
            O1.v r4 = (O1.C0106v) r4
            goto L_0x05f0
        L_0x0666:
            R2.b.x(r1, r0)
            O1.f r0 = new O1.f
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x0670:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L_0x0678:
            int r6 = r18.dataPosition()
            if (r6 >= r1) goto L_0x06b7
            int r6 = r18.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x06ae
            r8 = 2
            if (r7 == r8) goto L_0x06a5
            r8 = 3
            if (r7 == r8) goto L_0x069c
            r8 = 4
            if (r7 == r8) goto L_0x0693
            R2.b.T0(r6, r0)
            goto L_0x0678
        L_0x0693:
            android.os.Parcelable$Creator<O1.Y> r5 = O1.Y.CREATOR
            android.os.Parcelable r5 = R2.b.q(r0, r6, r5)
            O1.Y r5 = (O1.Y) r5
            goto L_0x0678
        L_0x069c:
            android.os.Parcelable$Creator<O1.h> r4 = O1.C0093h.CREATOR
            android.os.Parcelable r4 = R2.b.q(r0, r6, r4)
            O1.h r4 = (O1.C0093h) r4
            goto L_0x0678
        L_0x06a5:
            android.os.Parcelable$Creator<O1.X> r3 = O1.X.CREATOR
            android.os.Parcelable r3 = R2.b.q(r0, r6, r3)
            O1.X r3 = (O1.X) r3
            goto L_0x0678
        L_0x06ae:
            android.os.Parcelable$Creator<O1.N> r2 = O1.N.CREATOR
            android.os.Parcelable r2 = R2.b.q(r0, r6, r2)
            O1.N r2 = (O1.N) r2
            goto L_0x0678
        L_0x06b7:
            R2.b.x(r1, r0)
            O1.g r0 = new O1.g
            r0.<init>(r2, r3, r4, r5)
            return r0
        L_0x06c0:
            int r1 = R2.b.c1(r18)
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x06c7:
            int r5 = r18.dataPosition()
            if (r5 >= r1) goto L_0x06f7
            int r5 = r18.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x06f2
            r7 = 2
            r8 = 4
            if (r6 == r7) goto L_0x06e9
            r7 = 3
            if (r6 == r7) goto L_0x06e0
            R2.b.T0(r5, r0)
            goto L_0x06c7
        L_0x06e0:
            R2.b.f1(r0, r5, r8)
            int r4 = r18.readInt()
            short r4 = (short) r4
            goto L_0x06c7
        L_0x06e9:
            R2.b.f1(r0, r5, r8)
            int r3 = r18.readInt()
            short r3 = (short) r3
            goto L_0x06c7
        L_0x06f2:
            int r2 = R2.b.A0(r5, r0)
            goto L_0x06c7
        L_0x06f7:
            R2.b.x(r1, r0)
            O1.O r0 = new O1.O
            r0.<init>(r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.W.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final Object[] newArray(int i2) {
        switch (this.f2007a) {
            case 0:
                return new O[i2];
            case 1:
                return new C0092g[i2];
            case 2:
                return new C0091f[i2];
            case 3:
                return new C0093h[i2];
            case 4:
                return new X[i2];
            case 5:
                return new Y[i2];
            case zzaky.zzf.zzf /*6*/:
                return new C0094i[i2];
            case zzaky.zzf.zzg /*7*/:
                return new C0095j[i2];
            case 8:
                return new C0096k[i2];
            case 9:
                return new C0098m[i2];
            case 10:
                return new C0099n[i2];
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return new C0100o[i2];
            case 12:
                return new r[i2];
            case 13:
                return new Z[i2];
            case 14:
                return new a0[i2];
            case 15:
                return new b0[i2];
            case 16:
                return new C0105u[i2];
            case 17:
                return new C0106v[i2];
            case 18:
                return new a[i2];
            case 19:
                return new c[i2];
            case 20:
                return new d[i2];
            case 21:
                return new f[i2];
            case 22:
                return new g[i2];
            case 23:
                return new RegisterRequestParams[i2];
            case 24:
                return new h[i2];
            case 25:
                return new SignRequestParams[i2];
            case 26:
                return new k[i2];
            case 27:
                return new e[i2];
            case 28:
                return new LocationAvailability[i2];
            default:
                return new LocationRequest[i2];
        }
    }
}
