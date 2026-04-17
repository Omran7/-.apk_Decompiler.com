package f3;

import android.os.Parcelable;

/* renamed from: f3.b  reason: case insensitive filesystem */
public final class C0525b implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7912a;

    public /* synthetic */ C0525b(int i2) {
        this.f7912a = i2;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, f3.e] */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r0v7, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r0v8, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r0v9, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r0v10, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v2, types: [f3.g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, f3.A] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f7912a
            switch(r2) {
                case 0: goto L_0x01f3;
                case 1: goto L_0x0146;
                case 2: goto L_0x0117;
                case 3: goto L_0x00bc;
                case 4: goto L_0x008a;
                case 5: goto L_0x0052;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0010:
            int r6 = r18.dataPosition()
            if (r6 >= r2) goto L_0x0043
            int r6 = r18.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x003a
            r8 = 2
            if (r7 == r8) goto L_0x0031
            r8 = 3
            if (r7 == r8) goto L_0x0028
            R2.b.T0(r6, r1)
            goto L_0x0010
        L_0x0028:
            android.os.Parcelable$Creator<e3.G> r5 = e3.G.CREATOR
            android.os.Parcelable r5 = R2.b.q(r1, r6, r5)
            e3.G r5 = (e3.G) r5
            goto L_0x0010
        L_0x0031:
            android.os.Parcelable$Creator<f3.z> r4 = f3.z.CREATOR
            android.os.Parcelable r4 = R2.b.q(r1, r6, r4)
            f3.z r4 = (f3.z) r4
            goto L_0x0010
        L_0x003a:
            android.os.Parcelable$Creator<f3.e> r3 = f3.C0528e.CREATOR
            android.os.Parcelable r3 = R2.b.q(r1, r6, r3)
            f3.e r3 = (f3.C0528e) r3
            goto L_0x0010
        L_0x0043:
            R2.b.x(r2, r1)
            f3.A r1 = new f3.A
            r1.<init>()
            r1.f7909a = r3
            r1.f7910b = r4
            r1.f7911c = r5
            return r1
        L_0x0052:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
            r5 = r4
            r4 = r3
        L_0x005a:
            int r6 = r18.dataPosition()
            if (r6 >= r2) goto L_0x0081
            int r6 = r18.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x007c
            r8 = 2
            if (r7 == r8) goto L_0x0077
            r8 = 3
            if (r7 == r8) goto L_0x0072
            R2.b.T0(r6, r1)
            goto L_0x005a
        L_0x0072:
            boolean r5 = R2.b.w0(r6, r1)
            goto L_0x005a
        L_0x0077:
            java.lang.String r4 = R2.b.r(r6, r1)
            goto L_0x005a
        L_0x007c:
            java.lang.String r3 = R2.b.r(r6, r1)
            goto L_0x005a
        L_0x0081:
            R2.b.x(r2, r1)
            f3.z r1 = new f3.z
            r1.<init>(r3, r4, r5)
            return r1
        L_0x008a:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = r3
        L_0x0090:
            int r5 = r18.dataPosition()
            if (r5 >= r2) goto L_0x00b3
            int r5 = r18.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x00ac
            r7 = 2
            if (r6 == r7) goto L_0x00a5
            R2.b.T0(r5, r1)
            goto L_0x0090
        L_0x00a5:
            android.os.Parcelable$Creator<e3.z> r4 = e3.z.CREATOR
            java.util.ArrayList r4 = R2.b.v(r1, r5, r4)
            goto L_0x0090
        L_0x00ac:
            android.os.Parcelable$Creator<e3.w> r3 = e3.w.CREATOR
            java.util.ArrayList r3 = R2.b.v(r1, r5, r3)
            goto L_0x0090
        L_0x00b3:
            R2.b.x(r2, r1)
            f3.n r1 = new f3.n
            r1.<init>(r3, r4)
            return r1
        L_0x00bc:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x00c5:
            int r8 = r18.dataPosition()
            if (r8 >= r2) goto L_0x0104
            int r8 = r18.readInt()
            char r9 = (char) r8
            r10 = 1
            if (r9 == r10) goto L_0x00ff
            r10 = 2
            if (r9 == r10) goto L_0x00fa
            r10 = 3
            if (r9 == r10) goto L_0x00f3
            r10 = 4
            if (r9 == r10) goto L_0x00ec
            r10 = 5
            if (r9 == r10) goto L_0x00e3
            R2.b.T0(r8, r1)
            goto L_0x00c5
        L_0x00e3:
            android.os.Parcelable$Creator<f3.e> r7 = f3.C0528e.CREATOR
            android.os.Parcelable r7 = R2.b.q(r1, r8, r7)
            f3.e r7 = (f3.C0528e) r7
            goto L_0x00c5
        L_0x00ec:
            android.os.Parcelable$Creator<e3.z> r6 = e3.z.CREATOR
            java.util.ArrayList r6 = R2.b.v(r1, r8, r6)
            goto L_0x00c5
        L_0x00f3:
            android.os.Parcelable$Creator<e3.w> r5 = e3.w.CREATOR
            java.util.ArrayList r5 = R2.b.v(r1, r8, r5)
            goto L_0x00c5
        L_0x00fa:
            java.lang.String r4 = R2.b.r(r8, r1)
            goto L_0x00c5
        L_0x00ff:
            java.lang.String r3 = R2.b.r(r8, r1)
            goto L_0x00c5
        L_0x0104:
            R2.b.x(r2, r1)
            f3.g r1 = new f3.g
            r1.<init>()
            r1.f7934a = r3
            r1.f7935b = r4
            r1.f7936c = r5
            r1.d = r6
            r1.f7937e = r7
            return r1
        L_0x0117:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r5 = r3
        L_0x011e:
            int r7 = r18.dataPosition()
            if (r7 >= r2) goto L_0x013d
            int r7 = r18.readInt()
            char r8 = (char) r7
            r9 = 1
            if (r8 == r9) goto L_0x0138
            r9 = 2
            if (r8 == r9) goto L_0x0133
            R2.b.T0(r7, r1)
            goto L_0x011e
        L_0x0133:
            long r5 = R2.b.C0(r7, r1)
            goto L_0x011e
        L_0x0138:
            long r3 = R2.b.C0(r7, r1)
            goto L_0x011e
        L_0x013d:
            R2.b.x(r2, r1)
            f3.f r1 = new f3.f
            r1.<init>(r3, r5)
            return r1
        L_0x0146:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r4
            r4 = r14
        L_0x0158:
            int r0 = r18.dataPosition()
            if (r0 >= r2) goto L_0x01cc
            int r0 = r18.readInt()
            r16 = r14
            char r14 = (char) r0
            switch(r14) {
                case 1: goto L_0x01c2;
                case 2: goto L_0x01b8;
                case 3: goto L_0x01b3;
                case 4: goto L_0x01ae;
                case 5: goto L_0x01a7;
                case 6: goto L_0x01a2;
                case 7: goto L_0x019d;
                case 8: goto L_0x0198;
                case 9: goto L_0x018e;
                case 10: goto L_0x0189;
                case 11: goto L_0x017f;
                case 12: goto L_0x0175;
                case 13: goto L_0x016e;
                default: goto L_0x0168;
            }
        L_0x0168:
            R2.b.T0(r0, r1)
        L_0x016b:
            r14 = r16
            goto L_0x0158
        L_0x016e:
            android.os.Parcelable$Creator<e3.F> r14 = e3.F.CREATOR
            java.util.ArrayList r14 = R2.b.v(r1, r0, r14)
            goto L_0x0158
        L_0x0175:
            android.os.Parcelable$Creator<f3.n> r13 = f3.C0537n.CREATOR
            android.os.Parcelable r0 = R2.b.q(r1, r0, r13)
            r13 = r0
            f3.n r13 = (f3.C0537n) r13
            goto L_0x016b
        L_0x017f:
            android.os.Parcelable$Creator<e3.G> r12 = e3.G.CREATOR
            android.os.Parcelable r0 = R2.b.q(r1, r0, r12)
            r12 = r0
            e3.G r12 = (e3.G) r12
            goto L_0x016b
        L_0x0189:
            boolean r15 = R2.b.w0(r0, r1)
            goto L_0x016b
        L_0x018e:
            android.os.Parcelable$Creator<f3.f> r11 = f3.C0529f.CREATOR
            android.os.Parcelable r0 = R2.b.q(r1, r0, r11)
            r11 = r0
            f3.f r11 = (f3.C0529f) r11
            goto L_0x016b
        L_0x0198:
            java.lang.Boolean r10 = R2.b.x0(r0, r1)
            goto L_0x016b
        L_0x019d:
            java.lang.String r9 = R2.b.r(r0, r1)
            goto L_0x016b
        L_0x01a2:
            java.util.ArrayList r8 = R2.b.t(r0, r1)
            goto L_0x016b
        L_0x01a7:
            android.os.Parcelable$Creator<f3.c> r7 = f3.C0526c.CREATOR
            java.util.ArrayList r7 = R2.b.v(r1, r0, r7)
            goto L_0x016b
        L_0x01ae:
            java.lang.String r6 = R2.b.r(r0, r1)
            goto L_0x016b
        L_0x01b3:
            java.lang.String r5 = R2.b.r(r0, r1)
            goto L_0x016b
        L_0x01b8:
            android.os.Parcelable$Creator<f3.c> r4 = f3.C0526c.CREATOR
            android.os.Parcelable r0 = R2.b.q(r1, r0, r4)
            r4 = r0
            f3.c r4 = (f3.C0526c) r4
            goto L_0x016b
        L_0x01c2:
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.zzahn> r3 = com.google.android.gms.internal.p002firebaseauthapi.zzahn.CREATOR
            android.os.Parcelable r0 = R2.b.q(r1, r0, r3)
            r3 = r0
            com.google.android.gms.internal.firebase-auth-api.zzahn r3 = (com.google.android.gms.internal.p002firebaseauthapi.zzahn) r3
            goto L_0x016b
        L_0x01cc:
            r16 = r14
            R2.b.x(r2, r1)
            f3.e r0 = new f3.e
            r0.<init>()
            r0.f7920a = r3
            r0.f7921b = r4
            r0.f7922c = r5
            r0.d = r6
            r0.f7923e = r7
            r0.f7924f = r8
            r0.f7925p = r9
            r0.f7926q = r10
            r0.f7927r = r11
            r0.f7928s = r15
            r0.f7929t = r12
            r0.f7930u = r13
            r14 = r16
            r0.f7931v = r14
            return r0
        L_0x01f3:
            int r0 = R2.b.c1(r18)
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r12 = r10
            r11 = r3
        L_0x0201:
            int r2 = r18.dataPosition()
            if (r2 >= r0) goto L_0x023b
            int r2 = r18.readInt()
            char r3 = (char) r2
            switch(r3) {
                case 1: goto L_0x0236;
                case 2: goto L_0x0231;
                case 3: goto L_0x022c;
                case 4: goto L_0x0227;
                case 5: goto L_0x0222;
                case 6: goto L_0x021d;
                case 7: goto L_0x0218;
                case 8: goto L_0x0213;
                default: goto L_0x020f;
            }
        L_0x020f:
            R2.b.T0(r2, r1)
            goto L_0x0201
        L_0x0213:
            java.lang.String r12 = R2.b.r(r2, r1)
            goto L_0x0201
        L_0x0218:
            boolean r11 = R2.b.w0(r2, r1)
            goto L_0x0201
        L_0x021d:
            java.lang.String r10 = R2.b.r(r2, r1)
            goto L_0x0201
        L_0x0222:
            java.lang.String r7 = R2.b.r(r2, r1)
            goto L_0x0201
        L_0x0227:
            java.lang.String r8 = R2.b.r(r2, r1)
            goto L_0x0201
        L_0x022c:
            java.lang.String r9 = R2.b.r(r2, r1)
            goto L_0x0201
        L_0x0231:
            java.lang.String r6 = R2.b.r(r2, r1)
            goto L_0x0201
        L_0x0236:
            java.lang.String r5 = R2.b.r(r2, r1)
            goto L_0x0201
        L_0x023b:
            R2.b.x(r0, r1)
            f3.c r0 = new f3.c
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.C0525b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        switch (this.f7912a) {
            case 0:
                return new C0526c[i2];
            case 1:
                return new C0528e[i2];
            case 2:
                return new C0529f[i2];
            case 3:
                return new C0530g[i2];
            case 4:
                return new C0537n[i2];
            case 5:
                return new z[i2];
            default:
                return new C0523A[i2];
        }
    }
}
