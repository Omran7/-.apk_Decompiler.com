package D1;

import E1.d;
import E1.f;
import E1.g;
import E1.h;
import O1.A;
import O1.B;
import O1.C;
import O1.C0088c;
import O1.C0107w;
import O1.C0108x;
import O1.C0109y;
import O1.C0110z;
import O1.E;
import O1.F;
import O1.I;
import O1.J;
import O1.L;
import O1.M;
import O1.N;
import O1.P;
import O1.Q;
import O1.S;
import O1.T;
import O1.V;
import O1.c0;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

public final class c implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f509a;

    public /* synthetic */ c(int i2) {
        this.f509a = i2;
    }

    /* JADX WARNING: type inference failed for: r1v55, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v56, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v57, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v58, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v59, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v63, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v64, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v65, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v66, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v78, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v79, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r15) {
        /*
            r14 = this;
            int r0 = r14.f509a
            switch(r0) {
                case 0: goto L_0x059f;
                case 1: goto L_0x056f;
                case 2: goto L_0x0537;
                case 3: goto L_0x04fb;
                case 4: goto L_0x04c1;
                case 5: goto L_0x0487;
                case 6: goto L_0x0437;
                case 7: goto L_0x03fd;
                case 8: goto L_0x03ed;
                case 9: goto L_0x03c8;
                case 10: goto L_0x03a2;
                case 11: goto L_0x037d;
                case 12: goto L_0x0358;
                case 13: goto L_0x0333;
                case 14: goto L_0x02ef;
                case 15: goto L_0x026f;
                case 16: goto L_0x020a;
                case 17: goto L_0x01d1;
                case 18: goto L_0x019f;
                case 19: goto L_0x013c;
                case 20: goto L_0x0105;
                case 21: goto L_0x00f5;
                case 22: goto L_0x00b5;
                case 23: goto L_0x009f;
                case 24: goto L_0x008f;
                case 25: goto L_0x0061;
                case 26: goto L_0x003c;
                case 27: goto L_0x002c;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r0 = R2.b.c1(r15)
            r1 = 0
        L_0x000a:
            int r2 = r15.dataPosition()
            if (r2 >= r0) goto L_0x0023
            int r2 = r15.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x001c
            R2.b.T0(r2, r15)
            goto L_0x000a
        L_0x001c:
            android.os.Parcelable$Creator<O1.O> r1 = O1.O.CREATOR
            java.util.ArrayList r1 = R2.b.v(r15, r2, r1)
            goto L_0x000a
        L_0x0023:
            R2.b.x(r0, r15)
            O1.N r15 = new O1.N
            r15.<init>(r1)
            return r15
        L_0x002c:
            java.lang.String r15 = r15.readString()
            O1.V r15 = O1.V.a(r15)     // Catch:{ U -> 0x0035 }
            return r15
        L_0x0035:
            r15 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r15)
            throw r0
        L_0x003c:
            int r0 = R2.b.c1(r15)
            r1 = 0
        L_0x0041:
            int r2 = r15.dataPosition()
            if (r2 >= r0) goto L_0x0058
            int r2 = r15.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x0053
            R2.b.T0(r2, r15)
            goto L_0x0041
        L_0x0053:
            boolean r1 = R2.b.w0(r2, r15)
            goto L_0x0041
        L_0x0058:
            R2.b.x(r0, r15)
            O1.M r15 = new O1.M
            r15.<init>(r1)
            return r15
        L_0x0061:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r2 = r1
        L_0x0067:
            int r3 = r15.dataPosition()
            if (r3 >= r0) goto L_0x0086
            int r3 = r15.readInt()
            char r4 = (char) r3
            r5 = 2
            if (r4 == r5) goto L_0x0081
            r5 = 3
            if (r4 == r5) goto L_0x007c
            R2.b.T0(r3, r15)
            goto L_0x0067
        L_0x007c:
            java.lang.String r2 = R2.b.r(r3, r15)
            goto L_0x0067
        L_0x0081:
            java.lang.String r1 = R2.b.r(r3, r15)
            goto L_0x0067
        L_0x0086:
            R2.b.x(r0, r15)
            O1.L r15 = new O1.L
            r15.<init>(r1, r2)
            return r15
        L_0x008f:
            java.lang.String r15 = r15.readString()
            O1.J r15 = O1.J.a(r15)     // Catch:{ K -> 0x0098 }
            return r15
        L_0x0098:
            r15 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r15)
            throw r0
        L_0x009f:
            java.lang.String r15 = r15.readString()
            if (r15 != 0) goto L_0x00aa
            java.lang.String r15 = ""
            goto L_0x00aa
        L_0x00a8:
            r15 = move-exception
            goto L_0x00af
        L_0x00aa:
            O1.I r15 = O1.I.a(r15)     // Catch:{ H -> 0x00a8 }
            return r15
        L_0x00af:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r15)
            throw r0
        L_0x00b5:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L_0x00bd:
            int r5 = r15.dataPosition()
            if (r5 >= r0) goto L_0x00ec
            int r5 = r15.readInt()
            char r6 = (char) r5
            r7 = 2
            if (r6 == r7) goto L_0x00e7
            r7 = 3
            if (r6 == r7) goto L_0x00e2
            r7 = 4
            if (r6 == r7) goto L_0x00dd
            r7 = 5
            if (r6 == r7) goto L_0x00d8
            R2.b.T0(r5, r15)
            goto L_0x00bd
        L_0x00d8:
            java.lang.String r4 = R2.b.r(r5, r15)
            goto L_0x00bd
        L_0x00dd:
            java.lang.String r3 = R2.b.r(r5, r15)
            goto L_0x00bd
        L_0x00e2:
            java.lang.String r2 = R2.b.r(r5, r15)
            goto L_0x00bd
        L_0x00e7:
            byte[] r1 = R2.b.o(r5, r15)
            goto L_0x00bd
        L_0x00ec:
            R2.b.x(r0, r15)
            O1.F r15 = new O1.F
            r15.<init>(r2, r3, r4, r1)
            return r15
        L_0x00f5:
            java.lang.String r15 = r15.readString()
            O1.E r15 = O1.E.a(r15)     // Catch:{ D -> 0x00fe }
            return r15
        L_0x00fe:
            r15 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r15)
            throw r0
        L_0x0105:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x010c:
            int r4 = r15.dataPosition()
            if (r4 >= r0) goto L_0x0133
            int r4 = r15.readInt()
            char r5 = (char) r4
            r6 = 2
            if (r5 == r6) goto L_0x012e
            r6 = 3
            if (r5 == r6) goto L_0x0129
            r6 = 4
            if (r5 == r6) goto L_0x0124
            R2.b.T0(r4, r15)
            goto L_0x010c
        L_0x0124:
            java.lang.String r3 = R2.b.r(r4, r15)
            goto L_0x010c
        L_0x0129:
            java.lang.String r2 = R2.b.r(r4, r15)
            goto L_0x010c
        L_0x012e:
            java.lang.String r1 = R2.b.r(r4, r15)
            goto L_0x010c
        L_0x0133:
            R2.b.x(r0, r15)
            O1.C r15 = new O1.C
            r15.<init>(r1, r2, r3)
            return r15
        L_0x013c:
            int r0 = R2.b.c1(r15)
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
        L_0x014a:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L_0x0195
            int r1 = r15.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 2: goto L_0x0190;
                case 3: goto L_0x018b;
                case 4: goto L_0x0186;
                case 5: goto L_0x017f;
                case 6: goto L_0x017a;
                case 7: goto L_0x0170;
                case 8: goto L_0x016b;
                case 9: goto L_0x0161;
                case 10: goto L_0x015c;
                default: goto L_0x0158;
            }
        L_0x0158:
            R2.b.T0(r1, r15)
            goto L_0x014a
        L_0x015c:
            java.lang.Long r11 = R2.b.D0(r1, r15)
            goto L_0x014a
        L_0x0161:
            android.os.Parcelable$Creator<O1.f> r2 = O1.C0091f.CREATOR
            android.os.Parcelable r1 = R2.b.q(r15, r1, r2)
            r10 = r1
            O1.f r10 = (O1.C0091f) r10
            goto L_0x014a
        L_0x016b:
            java.lang.String r9 = R2.b.r(r1, r15)
            goto L_0x014a
        L_0x0170:
            android.os.Parcelable$Creator<O1.L> r2 = O1.L.CREATOR
            android.os.Parcelable r1 = R2.b.q(r15, r1, r2)
            r8 = r1
            O1.L r8 = (O1.L) r8
            goto L_0x014a
        L_0x017a:
            java.lang.Integer r7 = R2.b.B0(r1, r15)
            goto L_0x014a
        L_0x017f:
            android.os.Parcelable$Creator<O1.z> r2 = O1.C0110z.CREATOR
            java.util.ArrayList r6 = R2.b.v(r15, r1, r2)
            goto L_0x014a
        L_0x0186:
            java.lang.String r5 = R2.b.r(r1, r15)
            goto L_0x014a
        L_0x018b:
            java.lang.Double r4 = R2.b.y0(r1, r15)
            goto L_0x014a
        L_0x0190:
            byte[] r3 = R2.b.o(r1, r15)
            goto L_0x014a
        L_0x0195:
            R2.b.x(r0, r15)
            O1.B r15 = new O1.B
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r15
        L_0x019f:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r2 = r1
        L_0x01a5:
            int r3 = r15.dataPosition()
            if (r3 >= r0) goto L_0x01c4
            int r3 = r15.readInt()
            char r4 = (char) r3
            r5 = 2
            if (r4 == r5) goto L_0x01bf
            r5 = 3
            if (r4 == r5) goto L_0x01ba
            R2.b.T0(r3, r15)
            goto L_0x01a5
        L_0x01ba:
            java.lang.Integer r2 = R2.b.B0(r3, r15)
            goto L_0x01a5
        L_0x01bf:
            java.lang.String r1 = R2.b.r(r3, r15)
            goto L_0x01a5
        L_0x01c4:
            R2.b.x(r0, r15)
            O1.A r15 = new O1.A
            int r0 = r2.intValue()
            r15.<init>(r1, r0)
            return r15
        L_0x01d1:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x01d8:
            int r4 = r15.dataPosition()
            if (r4 >= r0) goto L_0x0201
            int r4 = r15.readInt()
            char r5 = (char) r4
            r6 = 2
            if (r5 == r6) goto L_0x01fc
            r6 = 3
            if (r5 == r6) goto L_0x01f7
            r6 = 4
            if (r5 == r6) goto L_0x01f0
            R2.b.T0(r4, r15)
            goto L_0x01d8
        L_0x01f0:
            android.os.Parcelable$Creator<com.google.android.gms.fido.common.Transport> r3 = com.google.android.gms.fido.common.Transport.CREATOR
            java.util.ArrayList r3 = R2.b.v(r15, r4, r3)
            goto L_0x01d8
        L_0x01f7:
            byte[] r2 = R2.b.o(r4, r15)
            goto L_0x01d8
        L_0x01fc:
            java.lang.String r1 = R2.b.r(r4, r15)
            goto L_0x01d8
        L_0x0201:
            R2.b.x(r0, r15)
            O1.z r15 = new O1.z
            r15.<init>(r1, r2, r3)
            return r15
        L_0x020a:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L_0x0217:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L_0x0265
            int r1 = r15.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 1: goto L_0x0260;
                case 2: goto L_0x025b;
                case 3: goto L_0x0256;
                case 4: goto L_0x024c;
                case 5: goto L_0x0242;
                case 6: goto L_0x0238;
                case 7: goto L_0x022e;
                case 8: goto L_0x0229;
                default: goto L_0x0225;
            }
        L_0x0225:
            R2.b.T0(r1, r15)
            goto L_0x0217
        L_0x0229:
            java.lang.String r10 = R2.b.r(r1, r15)
            goto L_0x0217
        L_0x022e:
            android.os.Parcelable$Creator<O1.g> r2 = O1.C0092g.CREATOR
            android.os.Parcelable r1 = R2.b.q(r15, r1, r2)
            r9 = r1
            O1.g r9 = (O1.C0092g) r9
            goto L_0x0217
        L_0x0238:
            android.os.Parcelable$Creator<O1.k> r2 = O1.C0096k.CREATOR
            android.os.Parcelable r1 = R2.b.q(r15, r1, r2)
            r8 = r1
            O1.k r8 = (O1.C0096k) r8
            goto L_0x0217
        L_0x0242:
            android.os.Parcelable$Creator<O1.i> r2 = O1.C0094i.CREATOR
            android.os.Parcelable r1 = R2.b.q(r15, r1, r2)
            r7 = r1
            O1.i r7 = (O1.C0094i) r7
            goto L_0x0217
        L_0x024c:
            android.os.Parcelable$Creator<O1.j> r2 = O1.C0095j.CREATOR
            android.os.Parcelable r1 = R2.b.q(r15, r1, r2)
            r6 = r1
            O1.j r6 = (O1.C0095j) r6
            goto L_0x0217
        L_0x0256:
            byte[] r5 = R2.b.o(r1, r15)
            goto L_0x0217
        L_0x025b:
            java.lang.String r4 = R2.b.r(r1, r15)
            goto L_0x0217
        L_0x0260:
            java.lang.String r3 = R2.b.r(r1, r15)
            goto L_0x0217
        L_0x0265:
            R2.b.x(r0, r15)
            O1.x r15 = new O1.x
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r15
        L_0x026f:
            int r0 = R2.b.c1(r15)
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
            r12 = r11
            r13 = r12
        L_0x027f:
            int r1 = r15.dataPosition()
            if (r1 >= r0) goto L_0x02e5
            int r1 = r15.readInt()
            char r2 = (char) r1
            switch(r2) {
                case 2: goto L_0x02db;
                case 3: goto L_0x02d1;
                case 4: goto L_0x02cc;
                case 5: goto L_0x02c5;
                case 6: goto L_0x02c0;
                case 7: goto L_0x02b9;
                case 8: goto L_0x02af;
                case 9: goto L_0x02aa;
                case 10: goto L_0x02a0;
                case 11: goto L_0x029b;
                case 12: goto L_0x0291;
                default: goto L_0x028d;
            }
        L_0x028d:
            R2.b.T0(r1, r15)
            goto L_0x027f
        L_0x0291:
            android.os.Parcelable$Creator<O1.f> r2 = O1.C0091f.CREATOR
            android.os.Parcelable r1 = R2.b.q(r15, r1, r2)
            r13 = r1
            O1.f r13 = (O1.C0091f) r13
            goto L_0x027f
        L_0x029b:
            java.lang.String r12 = R2.b.r(r1, r15)
            goto L_0x027f
        L_0x02a0:
            android.os.Parcelable$Creator<O1.L> r2 = O1.L.CREATOR
            android.os.Parcelable r1 = R2.b.q(r15, r1, r2)
            r11 = r1
            O1.L r11 = (O1.L) r11
            goto L_0x027f
        L_0x02aa:
            java.lang.Integer r10 = R2.b.B0(r1, r15)
            goto L_0x027f
        L_0x02af:
            android.os.Parcelable$Creator<O1.m> r2 = O1.C0098m.CREATOR
            android.os.Parcelable r1 = R2.b.q(r15, r1, r2)
            r9 = r1
            O1.m r9 = (O1.C0098m) r9
            goto L_0x027f
        L_0x02b9:
            android.os.Parcelable$Creator<O1.z> r2 = O1.C0110z.CREATOR
            java.util.ArrayList r8 = R2.b.v(r15, r1, r2)
            goto L_0x027f
        L_0x02c0:
            java.lang.Double r7 = R2.b.y0(r1, r15)
            goto L_0x027f
        L_0x02c5:
            android.os.Parcelable$Creator<O1.A> r2 = O1.A.CREATOR
            java.util.ArrayList r6 = R2.b.v(r15, r1, r2)
            goto L_0x027f
        L_0x02cc:
            byte[] r5 = R2.b.o(r1, r15)
            goto L_0x027f
        L_0x02d1:
            android.os.Parcelable$Creator<O1.F> r2 = O1.F.CREATOR
            android.os.Parcelable r1 = R2.b.q(r15, r1, r2)
            r4 = r1
            O1.F r4 = (O1.F) r4
            goto L_0x027f
        L_0x02db:
            android.os.Parcelable$Creator<O1.C> r2 = O1.C.CREATOR
            android.os.Parcelable r1 = R2.b.q(r15, r1, r2)
            r3 = r1
            O1.C r3 = (O1.C) r3
            goto L_0x027f
        L_0x02e5:
            R2.b.x(r0, r15)
            O1.y r15 = new O1.y
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
        L_0x02ef:
            int r0 = R2.b.c1(r15)
            r1 = 0
        L_0x02f4:
            r2 = r1
        L_0x02f5:
            int r3 = r15.dataPosition()
            if (r3 >= r0) goto L_0x032a
            int r3 = r15.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0307
            R2.b.T0(r3, r15)
            goto L_0x02f5
        L_0x0307:
            int r2 = R2.b.E0(r3, r15)
            int r3 = r15.dataPosition()
            if (r2 != 0) goto L_0x0312
            goto L_0x02f4
        L_0x0312:
            int r4 = r15.readInt()
            byte[][] r5 = new byte[r4][]
            r6 = 0
        L_0x0319:
            if (r6 >= r4) goto L_0x0324
            byte[] r7 = r15.createByteArray()
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x0319
        L_0x0324:
            int r3 = r3 + r2
            r15.setDataPosition(r3)
            r2 = r5
            goto L_0x02f5
        L_0x032a:
            R2.b.x(r0, r15)
            O1.T r15 = new O1.T
            r15.<init>(r2)
            return r15
        L_0x0333:
            int r0 = R2.b.c1(r15)
            r1 = 0
        L_0x0338:
            int r2 = r15.dataPosition()
            if (r2 >= r0) goto L_0x034f
            int r2 = r15.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x034a
            R2.b.T0(r2, r15)
            goto L_0x0338
        L_0x034a:
            java.lang.String r1 = R2.b.r(r2, r15)
            goto L_0x0338
        L_0x034f:
            R2.b.x(r0, r15)
            O1.S r15 = new O1.S
            r15.<init>(r1)
            return r15
        L_0x0358:
            int r0 = R2.b.c1(r15)
            r1 = 0
        L_0x035d:
            int r2 = r15.dataPosition()
            if (r2 >= r0) goto L_0x0374
            int r2 = r15.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x036f
            R2.b.T0(r2, r15)
            goto L_0x035d
        L_0x036f:
            boolean r1 = R2.b.w0(r2, r15)
            goto L_0x035d
        L_0x0374:
            R2.b.x(r0, r15)
            O1.w r15 = new O1.w
            r15.<init>(r1)
            return r15
        L_0x037d:
            int r0 = R2.b.c1(r15)
            r1 = 0
        L_0x0382:
            int r2 = r15.dataPosition()
            if (r2 >= r0) goto L_0x0399
            int r2 = r15.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x0394
            R2.b.T0(r2, r15)
            goto L_0x0382
        L_0x0394:
            boolean r1 = R2.b.w0(r2, r15)
            goto L_0x0382
        L_0x0399:
            R2.b.x(r0, r15)
            O1.Q r15 = new O1.Q
            r15.<init>(r1)
            return r15
        L_0x03a2:
            int r0 = R2.b.c1(r15)
            r1 = 0
        L_0x03a8:
            int r3 = r15.dataPosition()
            if (r3 >= r0) goto L_0x03bf
            int r3 = r15.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x03ba
            R2.b.T0(r3, r15)
            goto L_0x03a8
        L_0x03ba:
            long r1 = R2.b.C0(r3, r15)
            goto L_0x03a8
        L_0x03bf:
            R2.b.x(r0, r15)
            O1.P r15 = new O1.P
            r15.<init>(r1)
            return r15
        L_0x03c8:
            int r0 = R2.b.c1(r15)
            r1 = 0
        L_0x03cd:
            int r2 = r15.dataPosition()
            if (r2 >= r0) goto L_0x03e4
            int r2 = r15.readInt()
            char r3 = (char) r2
            r4 = 1
            if (r3 == r4) goto L_0x03df
            R2.b.T0(r2, r15)
            goto L_0x03cd
        L_0x03df:
            boolean r1 = R2.b.w0(r2, r15)
            goto L_0x03cd
        L_0x03e4:
            R2.b.x(r0, r15)
            O1.c0 r15 = new O1.c0
            r15.<init>(r1)
            return r15
        L_0x03ed:
            java.lang.String r15 = r15.readString()
            O1.c r15 = O1.C0088c.a(r15)     // Catch:{ b -> 0x03f6 }
            return r15
        L_0x03f6:
            r15 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r15)
            throw r0
        L_0x03fd:
            java.lang.String r15 = r15.readString()
            com.google.android.gms.fido.common.Transport[] r0 = com.google.android.gms.fido.common.Transport.values()     // Catch:{ a -> 0x0430 }
            int r1 = r0.length     // Catch:{ a -> 0x0430 }
            r2 = 0
        L_0x0407:
            if (r2 >= r1) goto L_0x0417
            r3 = r0[r2]     // Catch:{ a -> 0x0430 }
            java.lang.String r4 = r3.f6234a     // Catch:{ a -> 0x0430 }
            boolean r4 = r15.equals(r4)     // Catch:{ a -> 0x0430 }
            if (r4 == 0) goto L_0x0414
            goto L_0x0421
        L_0x0414:
            int r2 = r2 + 1
            goto L_0x0407
        L_0x0417:
            java.lang.String r0 = "hybrid"
            boolean r0 = r15.equals(r0)     // Catch:{ a -> 0x0430 }
            if (r0 == 0) goto L_0x0422
            com.google.android.gms.fido.common.Transport r3 = com.google.android.gms.fido.common.Transport.HYBRID     // Catch:{ a -> 0x0430 }
        L_0x0421:
            return r3
        L_0x0422:
            M1.a r0 = new M1.a     // Catch:{ a -> 0x0430 }
            java.lang.String r1 = "Transport "
            java.lang.String r2 = " not supported"
            java.lang.String r15 = h0.C0552a.o(r1, r15, r2)     // Catch:{ a -> 0x0430 }
            r0.<init>(r15)     // Catch:{ a -> 0x0430 }
            throw r0     // Catch:{ a -> 0x0430 }
        L_0x0430:
            r15 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r15)
            throw r0
        L_0x0437:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r3
        L_0x043f:
            int r5 = r15.dataPosition()
            if (r5 >= r0) goto L_0x047e
            int r5 = r15.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x0479
            r7 = 2
            if (r6 == r7) goto L_0x0460
            r7 = 3
            if (r6 == r7) goto L_0x0457
            R2.b.T0(r5, r15)
            goto L_0x043f
        L_0x0457:
            android.os.Parcelable$Creator<E1.h> r4 = E1.h.CREATOR
            android.os.Parcelable r4 = R2.b.q(r15, r5, r4)
            E1.h r4 = (E1.h) r4
            goto L_0x043f
        L_0x0460:
            int r3 = R2.b.E0(r5, r15)
            int r5 = r15.dataPosition()
            if (r3 != 0) goto L_0x046c
            r3 = r1
            goto L_0x043f
        L_0x046c:
            android.os.Parcel r6 = android.os.Parcel.obtain()
            r6.appendFrom(r15, r5, r3)
            int r5 = r5 + r3
            r15.setDataPosition(r5)
            r3 = r6
            goto L_0x043f
        L_0x0479:
            int r2 = R2.b.A0(r5, r15)
            goto L_0x043f
        L_0x047e:
            R2.b.x(r0, r15)
            E1.d r15 = new E1.d
            r15.<init>(r2, r3, r4)
            return r15
        L_0x0487:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = r1
        L_0x048f:
            int r4 = r15.dataPosition()
            if (r4 >= r0) goto L_0x04b8
            int r4 = r15.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x04b3
            r6 = 2
            if (r5 == r6) goto L_0x04ae
            r6 = 3
            if (r5 == r6) goto L_0x04a7
            R2.b.T0(r4, r15)
            goto L_0x048f
        L_0x04a7:
            android.os.Parcelable$Creator<E1.g> r2 = E1.g.CREATOR
            java.util.ArrayList r2 = R2.b.v(r15, r4, r2)
            goto L_0x048f
        L_0x04ae:
            java.lang.String r1 = R2.b.r(r4, r15)
            goto L_0x048f
        L_0x04b3:
            int r3 = R2.b.A0(r4, r15)
            goto L_0x048f
        L_0x04b8:
            R2.b.x(r0, r15)
            E1.f r15 = new E1.f
            r15.<init>(r3, r1, r2)
            return r15
        L_0x04c1:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = r1
        L_0x04c9:
            int r4 = r15.dataPosition()
            if (r4 >= r0) goto L_0x04f2
            int r4 = r15.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x04ed
            r6 = 2
            if (r5 == r6) goto L_0x04e6
            r6 = 3
            if (r5 == r6) goto L_0x04e1
            R2.b.T0(r4, r15)
            goto L_0x04c9
        L_0x04e1:
            java.lang.String r2 = R2.b.r(r4, r15)
            goto L_0x04c9
        L_0x04e6:
            android.os.Parcelable$Creator<E1.f> r1 = E1.f.CREATOR
            java.util.ArrayList r1 = R2.b.v(r15, r4, r1)
            goto L_0x04c9
        L_0x04ed:
            int r3 = R2.b.A0(r4, r15)
            goto L_0x04c9
        L_0x04f2:
            R2.b.x(r0, r15)
            E1.h r15 = new E1.h
            r15.<init>(r3, r2, r1)
            return r15
        L_0x04fb:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = r1
        L_0x0503:
            int r4 = r15.dataPosition()
            if (r4 >= r0) goto L_0x052e
            int r4 = r15.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x0529
            r6 = 2
            if (r5 == r6) goto L_0x0524
            r6 = 3
            if (r5 == r6) goto L_0x051b
            R2.b.T0(r4, r15)
            goto L_0x0503
        L_0x051b:
            E1.e r2 = E1.a.CREATOR
            android.os.Parcelable r2 = R2.b.q(r15, r4, r2)
            E1.a r2 = (E1.a) r2
            goto L_0x0503
        L_0x0524:
            java.lang.String r1 = R2.b.r(r4, r15)
            goto L_0x0503
        L_0x0529:
            int r3 = R2.b.A0(r4, r15)
            goto L_0x0503
        L_0x052e:
            R2.b.x(r0, r15)
            E1.g r15 = new E1.g
            r15.<init>(r2, r1, r3)
            return r15
        L_0x0537:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r2 = 0
            r3 = r2
            r2 = r1
        L_0x053f:
            int r4 = r15.dataPosition()
            if (r4 >= r0) goto L_0x0566
            int r4 = r15.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x0561
            r6 = 2
            if (r5 == r6) goto L_0x055c
            r6 = 3
            if (r5 == r6) goto L_0x0557
            R2.b.T0(r4, r15)
            goto L_0x053f
        L_0x0557:
            int r2 = R2.b.A0(r4, r15)
            goto L_0x053f
        L_0x055c:
            java.lang.String r3 = R2.b.r(r4, r15)
            goto L_0x053f
        L_0x0561:
            int r1 = R2.b.A0(r4, r15)
            goto L_0x053f
        L_0x0566:
            R2.b.x(r0, r15)
            D1.d r15 = new D1.d
            r15.<init>(r1, r3, r2)
            return r15
        L_0x056f:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r2 = 0
        L_0x0575:
            int r3 = r15.dataPosition()
            if (r3 >= r0) goto L_0x0596
            int r3 = r15.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0591
            r5 = 2
            if (r4 == r5) goto L_0x058a
            R2.b.T0(r3, r15)
            goto L_0x0575
        L_0x058a:
            android.os.Parcelable$Creator<D1.d> r1 = D1.d.CREATOR
            java.util.ArrayList r1 = R2.b.v(r15, r3, r1)
            goto L_0x0575
        L_0x0591:
            int r2 = R2.b.A0(r3, r15)
            goto L_0x0575
        L_0x0596:
            R2.b.x(r0, r15)
            D1.a r15 = new D1.a
            r15.<init>(r2, r1)
            return r15
        L_0x059f:
            int r0 = R2.b.c1(r15)
            r1 = 0
            r2 = 0
        L_0x05a5:
            int r3 = r15.dataPosition()
            if (r3 >= r0) goto L_0x05c8
            int r3 = r15.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x05c3
            r5 = 2
            if (r4 == r5) goto L_0x05ba
            R2.b.T0(r3, r15)
            goto L_0x05a5
        L_0x05ba:
            android.os.Parcelable$Creator<D1.a> r1 = D1.a.CREATOR
            android.os.Parcelable r1 = R2.b.q(r15, r3, r1)
            D1.a r1 = (D1.a) r1
            goto L_0x05a5
        L_0x05c3:
            int r2 = R2.b.A0(r3, r15)
            goto L_0x05a5
        L_0x05c8:
            R2.b.x(r0, r15)
            D1.b r15 = new D1.b
            r15.<init>(r2, r1)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.c.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f509a) {
            case 0:
                return new b[i2];
            case 1:
                return new a[i2];
            case 2:
                return new d[i2];
            case 3:
                return new g[i2];
            case 4:
                return new h[i2];
            case 5:
                return new f[i2];
            case zzaky.zzf.zzf /*6*/:
                return new d[i2];
            case zzaky.zzf.zzg /*7*/:
                return new Transport[i2];
            case 8:
                return new C0088c[i2];
            case 9:
                return new c0[i2];
            case 10:
                return new P[i2];
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return new Q[i2];
            case 12:
                return new C0107w[i2];
            case 13:
                return new S[i2];
            case 14:
                return new T[i2];
            case 15:
                return new C0109y[i2];
            case 16:
                return new C0108x[i2];
            case 17:
                return new C0110z[i2];
            case 18:
                return new A[i2];
            case 19:
                return new B[i2];
            case 20:
                return new C[i2];
            case 21:
                return new E[i2];
            case 22:
                return new F[i2];
            case 23:
                return new I[i2];
            case 24:
                return new J[i2];
            case 25:
                return new L[i2];
            case 26:
                return new M[i2];
            case 27:
                return new V[i2];
            default:
                return new N[i2];
        }
    }
}
