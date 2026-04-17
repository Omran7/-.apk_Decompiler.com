package com.google.android.material.datepicker;

import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import e3.C0490A;
import e3.C0492C;
import e3.C0493a;
import e3.C0496d;
import e3.C0497e;
import e3.F;
import e3.G;
import e3.o;
import e3.p;
import e3.s;
import e3.t;
import e3.w;
import e3.x;
import e3.z;
import g2.b;
import k.C0678O;
import k5.C0772i;
import m0.C0826s;
import m0.Z;
import m0.b0;
import o1.C0891a;
import o1.C0892b;
import o1.C0893c;
import r0.k;
import r1.C0946a;
import r1.C0947b;
import r1.d;
import r1.e;
import r1.f;

public final class n implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6447a;

    public /* synthetic */ n(int i2) {
        this.f6447a = i2;
    }

    /* JADX WARNING: type inference failed for: r3v25, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Object, e3.C] */
    /* JADX WARNING: type inference failed for: r3v41, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v17, types: [android.view.View$BaseSavedState, g2.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v18, types: [android.view.View$BaseSavedState, java.lang.Object, k.O] */
    /* JADX WARNING: type inference failed for: r2v19, types: [android.view.View$BaseSavedState, k5.i, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v20, types: [java.lang.Object, m0.s] */
    /* JADX WARNING: type inference failed for: r2v21, types: [java.lang.Object, m0.Z] */
    /* JADX WARNING: type inference failed for: r2v22, types: [java.lang.Object, m0.b0] */
    /* JADX WARNING: type inference failed for: r3v121, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r3v139, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r3v158, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r3v161, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object createFromParcel(android.os.Parcel r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f6447a
            switch(r2) {
                case 0: goto L_0x079e;
                case 1: goto L_0x0779;
                case 2: goto L_0x074b;
                case 3: goto L_0x0714;
                case 4: goto L_0x06c8;
                case 5: goto L_0x0684;
                case 6: goto L_0x065f;
                case 7: goto L_0x0616;
                case 8: goto L_0x05e8;
                case 9: goto L_0x0592;
                case 10: goto L_0x052d;
                case 11: goto L_0x0512;
                case 12: goto L_0x04c2;
                case 13: goto L_0x0476;
                case 14: goto L_0x0451;
                case 15: goto L_0x0439;
                case 16: goto L_0x0428;
                case 17: goto L_0x03a0;
                case 18: goto L_0x0383;
                case 19: goto L_0x0359;
                case 20: goto L_0x02fc;
                case 21: goto L_0x02ae;
                case 22: goto L_0x0269;
                case 23: goto L_0x0239;
                case 24: goto L_0x0233;
                case 25: goto L_0x01b9;
                case 26: goto L_0x016d;
                case 27: goto L_0x00e5;
                case 28: goto L_0x0051;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
            r7 = r3
            r8 = r7
            r11 = r8
            r9 = r4
        L_0x0014:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x0047
            int r3 = r18.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0041
            r5 = 2
            if (r4 == r5) goto L_0x003b
            r5 = 3
            if (r4 == r5) goto L_0x0035
            r5 = 4
            if (r4 == r5) goto L_0x002f
            R2.b.T0(r3, r1)
            goto L_0x0014
        L_0x002f:
            boolean r3 = R2.b.w0(r3, r1)
            r11 = r3
            goto L_0x0014
        L_0x0035:
            long r3 = R2.b.C0(r3, r1)
            r9 = r3
            goto L_0x0014
        L_0x003b:
            boolean r3 = R2.b.w0(r3, r1)
            r8 = r3
            goto L_0x0014
        L_0x0041:
            int r3 = R2.b.A0(r3, r1)
            r7 = r3
            goto L_0x0014
        L_0x0047:
            R2.b.x(r2, r1)
            r1.a r1 = new r1.a
            r6 = r1
            r6.<init>(r7, r8, r9, r11)
            return r1
        L_0x0051:
            int r2 = R2.b.c1(r18)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3 = 0
            r5 = 0
            r7 = r3
            r6 = r5
            r8 = r6
            r9 = r8
            r10 = r9
            r5 = r7
        L_0x0062:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x00cc
            int r3 = r18.readInt()
            char r11 = (char) r3
            switch(r11) {
                case 1: goto L_0x00bf;
                case 2: goto L_0x00b2;
                case 3: goto L_0x00a5;
                case 4: goto L_0x0098;
                case 5: goto L_0x0086;
                case 6: goto L_0x0074;
                default: goto L_0x0070;
            }
        L_0x0070:
            R2.b.T0(r3, r1)
            goto L_0x0062
        L_0x0074:
            android.os.Parcelable$Creator<r1.a> r10 = r1.C0946a.CREATOR
            android.os.Parcelable r3 = R2.b.q(r1, r3, r10)
            r10 = r3
            r1.a r10 = (r1.C0946a) r10
            r3 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.add(r3)
            goto L_0x0062
        L_0x0086:
            android.os.Parcelable$Creator r9 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r3 = R2.b.q(r1, r3, r9)
            r9 = r3
            android.app.PendingIntent r9 = (android.app.PendingIntent) r9
            r3 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.add(r3)
            goto L_0x0062
        L_0x0098:
            byte[] r8 = R2.b.o(r3, r1)
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.add(r3)
            goto L_0x0062
        L_0x00a5:
            int r7 = R2.b.A0(r3, r1)
            r3 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.add(r3)
            goto L_0x0062
        L_0x00b2:
            java.lang.String r6 = R2.b.r(r3, r1)
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.add(r3)
            goto L_0x0062
        L_0x00bf:
            int r5 = R2.b.A0(r3, r1)
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.add(r3)
            goto L_0x0062
        L_0x00cc:
            int r3 = r18.dataPosition()
            if (r3 != r2) goto L_0x00d9
            r1.f r1 = new r1.f
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r1
        L_0x00d9:
            A1.b r3 = new A1.b
            java.lang.String r4 = "Overread allowed size end="
            java.lang.String r2 = com.google.android.gms.internal.measurement.a.f(r2, r4)
            r3.<init>(r2, r1)
            throw r3
        L_0x00e5:
            int r2 = R2.b.c1(r18)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3 = 0
            r5 = 0
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r5 = r3
        L_0x00f5:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x0154
            int r3 = r18.readInt()
            char r10 = (char) r3
            r11 = 1
            if (r10 == r11) goto L_0x0148
            r11 = 2
            if (r10 == r11) goto L_0x0137
            r11 = 3
            if (r10 == r11) goto L_0x012b
            r11 = 4
            if (r10 == r11) goto L_0x011f
            r11 = 5
            if (r10 == r11) goto L_0x0113
            R2.b.T0(r3, r1)
            goto L_0x00f5
        L_0x0113:
            java.lang.String r9 = R2.b.r(r3, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r4.add(r3)
            goto L_0x00f5
        L_0x011f:
            java.lang.String r8 = R2.b.r(r3, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r4.add(r3)
            goto L_0x00f5
        L_0x012b:
            java.lang.String r7 = R2.b.r(r3, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r4.add(r3)
            goto L_0x00f5
        L_0x0137:
            android.os.Parcelable$Creator<r1.f> r6 = r1.f.CREATOR
            android.os.Parcelable r3 = R2.b.q(r1, r3, r6)
            r6 = r3
            r1.f r6 = (r1.f) r6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r4.add(r3)
            goto L_0x00f5
        L_0x0148:
            int r5 = R2.b.A0(r3, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r4.add(r3)
            goto L_0x00f5
        L_0x0154:
            int r3 = r18.dataPosition()
            if (r3 != r2) goto L_0x0161
            r1.e r1 = new r1.e
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r1
        L_0x0161:
            A1.b r3 = new A1.b
            java.lang.String r4 = "Overread allowed size end="
            java.lang.String r2 = com.google.android.gms.internal.measurement.a.f(r2, r4)
            r3.<init>(r2, r1)
            throw r3
        L_0x016d:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
            r6 = r3
            r7 = r4
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
        L_0x0179:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x01af
            int r3 = r18.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 1: goto L_0x01a9;
                case 2: goto L_0x01a3;
                case 3: goto L_0x019d;
                case 4: goto L_0x0197;
                case 5: goto L_0x0191;
                case 6: goto L_0x018b;
                default: goto L_0x0187;
            }
        L_0x0187:
            R2.b.T0(r3, r1)
            goto L_0x0179
        L_0x018b:
            java.util.ArrayList r3 = R2.b.t(r3, r1)
            r11 = r3
            goto L_0x0179
        L_0x0191:
            java.util.ArrayList r3 = R2.b.t(r3, r1)
            r10 = r3
            goto L_0x0179
        L_0x0197:
            java.util.ArrayList r3 = R2.b.t(r3, r1)
            r9 = r3
            goto L_0x0179
        L_0x019d:
            java.util.ArrayList r3 = R2.b.t(r3, r1)
            r8 = r3
            goto L_0x0179
        L_0x01a3:
            java.util.ArrayList r3 = R2.b.t(r3, r1)
            r7 = r3
            goto L_0x0179
        L_0x01a9:
            int r3 = R2.b.A0(r3, r1)
            r6 = r3
            goto L_0x0179
        L_0x01af:
            R2.b.x(r2, r1)
            r1.d r1 = new r1.d
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r1
        L_0x01b9:
            int r2 = R2.b.c1(r18)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3 = 0
            r5 = 0
            r7 = r3
            r6 = r5
            r8 = r6
            r5 = r7
        L_0x01c8:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x021a
            int r3 = r18.readInt()
            char r9 = (char) r3
            r10 = 1
            if (r9 == r10) goto L_0x020e
            r10 = 2
            if (r9 == r10) goto L_0x0200
            r10 = 3
            if (r9 == r10) goto L_0x01f4
            r10 = 4
            if (r9 == r10) goto L_0x01e3
            R2.b.T0(r3, r1)
            goto L_0x01c8
        L_0x01e3:
            android.os.Parcelable$Creator<r1.d> r8 = r1.d.CREATOR
            android.os.Parcelable r3 = R2.b.q(r1, r3, r8)
            r8 = r3
            r1.d r8 = (r1.d) r8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r4.add(r3)
            goto L_0x01c8
        L_0x01f4:
            int r7 = R2.b.A0(r3, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r4.add(r3)
            goto L_0x01c8
        L_0x0200:
            android.os.Parcelable$Creator<r1.e> r6 = r1.e.CREATOR
            java.util.ArrayList r6 = R2.b.v(r1, r3, r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r4.add(r3)
            goto L_0x01c8
        L_0x020e:
            int r5 = R2.b.A0(r3, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r4.add(r3)
            goto L_0x01c8
        L_0x021a:
            int r3 = r18.dataPosition()
            if (r3 != r2) goto L_0x0227
            r1.b r1 = new r1.b
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        L_0x0227:
            A1.b r3 = new A1.b
            java.lang.String r4 = "Overread allowed size end="
            java.lang.String r2 = com.google.android.gms.internal.measurement.a.f(r2, r4)
            r3.<init>(r2, r1)
            throw r3
        L_0x0233:
            r0.k r2 = new r0.k
            r2.<init>(r1)
            return r2
        L_0x0239:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
        L_0x023f:
            int r5 = r18.dataPosition()
            if (r5 >= r2) goto L_0x0260
            int r5 = r18.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x025b
            r7 = 2
            if (r6 == r7) goto L_0x0254
            R2.b.T0(r5, r1)
            goto L_0x023f
        L_0x0254:
            android.os.Parcelable$Creator<o1.a> r4 = o1.C0891a.CREATOR
            java.util.ArrayList r4 = R2.b.v(r1, r5, r4)
            goto L_0x023f
        L_0x025b:
            int r3 = R2.b.A0(r5, r1)
            goto L_0x023f
        L_0x0260:
            R2.b.x(r2, r1)
            o1.c r1 = new o1.c
            r1.<init>(r3, r4)
            return r1
        L_0x0269:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
            r5 = r4
            r6 = r5
            r4 = r3
        L_0x0272:
            int r7 = r18.dataPosition()
            if (r7 >= r2) goto L_0x02a5
            int r7 = r18.readInt()
            char r8 = (char) r7
            r9 = 1
            if (r8 == r9) goto L_0x02a0
            r9 = 2
            if (r8 == r9) goto L_0x029b
            r9 = 3
            if (r8 == r9) goto L_0x0296
            r9 = 4
            if (r8 == r9) goto L_0x028d
            R2.b.T0(r7, r1)
            goto L_0x0272
        L_0x028d:
            android.os.Parcelable$Creator r6 = android.accounts.Account.CREATOR
            android.os.Parcelable r6 = R2.b.q(r1, r7, r6)
            android.accounts.Account r6 = (android.accounts.Account) r6
            goto L_0x0272
        L_0x0296:
            java.lang.String r5 = R2.b.r(r7, r1)
            goto L_0x0272
        L_0x029b:
            int r4 = R2.b.A0(r7, r1)
            goto L_0x0272
        L_0x02a0:
            int r3 = R2.b.A0(r7, r1)
            goto L_0x0272
        L_0x02a5:
            R2.b.x(r2, r1)
            o1.b r1 = new o1.b
            r1.<init>(r3, r4, r5, r6)
            return r1
        L_0x02ae:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
            r6 = 0
            r8 = r3
            r9 = r8
            r14 = r9
            r12 = r4
            r10 = r6
            r11 = r10
        L_0x02bc:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x02f2
            int r3 = r18.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 1: goto L_0x02ec;
                case 2: goto L_0x02e6;
                case 3: goto L_0x02e0;
                case 4: goto L_0x02da;
                case 5: goto L_0x02d4;
                case 6: goto L_0x02ce;
                default: goto L_0x02ca;
            }
        L_0x02ca:
            R2.b.T0(r3, r1)
            goto L_0x02bc
        L_0x02ce:
            java.lang.String r3 = R2.b.r(r3, r1)
            r11 = r3
            goto L_0x02bc
        L_0x02d4:
            int r3 = R2.b.A0(r3, r1)
            r14 = r3
            goto L_0x02bc
        L_0x02da:
            int r3 = R2.b.A0(r3, r1)
            r9 = r3
            goto L_0x02bc
        L_0x02e0:
            java.lang.String r3 = R2.b.r(r3, r1)
            r10 = r3
            goto L_0x02bc
        L_0x02e6:
            long r3 = R2.b.C0(r3, r1)
            r12 = r3
            goto L_0x02bc
        L_0x02ec:
            int r3 = R2.b.A0(r3, r1)
            r8 = r3
            goto L_0x02bc
        L_0x02f2:
            R2.b.x(r2, r1)
            o1.a r1 = new o1.a
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12, r14)
            return r1
        L_0x02fc:
            m0.b0 r2 = new m0.b0
            r2.<init>()
            int r3 = r18.readInt()
            r2.f9930a = r3
            int r3 = r18.readInt()
            r2.f9931b = r3
            int r3 = r18.readInt()
            r2.f9932c = r3
            if (r3 <= 0) goto L_0x031c
            int[] r3 = new int[r3]
            r2.d = r3
            r1.readIntArray(r3)
        L_0x031c:
            int r3 = r18.readInt()
            r2.f9933e = r3
            if (r3 <= 0) goto L_0x032b
            int[] r3 = new int[r3]
            r2.f9934f = r3
            r1.readIntArray(r3)
        L_0x032b:
            int r3 = r18.readInt()
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L_0x0335
            r3 = r5
            goto L_0x0336
        L_0x0335:
            r3 = r4
        L_0x0336:
            r2.f9936q = r3
            int r3 = r18.readInt()
            if (r3 != r5) goto L_0x0340
            r3 = r5
            goto L_0x0341
        L_0x0340:
            r3 = r4
        L_0x0341:
            r2.f9937r = r3
            int r3 = r18.readInt()
            if (r3 != r5) goto L_0x034a
            r4 = r5
        L_0x034a:
            r2.f9938s = r4
            java.lang.Class<m0.Z> r3 = m0.Z.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.util.ArrayList r1 = r1.readArrayList(r3)
            r2.f9935p = r1
            return r2
        L_0x0359:
            m0.Z r2 = new m0.Z
            r2.<init>()
            int r3 = r18.readInt()
            r2.f9918a = r3
            int r3 = r18.readInt()
            r2.f9919b = r3
            int r3 = r18.readInt()
            r4 = 1
            if (r3 != r4) goto L_0x0372
            goto L_0x0373
        L_0x0372:
            r4 = 0
        L_0x0373:
            r2.d = r4
            int r3 = r18.readInt()
            if (r3 <= 0) goto L_0x0382
            int[] r3 = new int[r3]
            r2.f9920c = r3
            r1.readIntArray(r3)
        L_0x0382:
            return r2
        L_0x0383:
            m0.s r2 = new m0.s
            r2.<init>()
            int r3 = r18.readInt()
            r2.f10047a = r3
            int r3 = r18.readInt()
            r2.f10048b = r3
            int r1 = r18.readInt()
            r3 = 1
            if (r1 != r3) goto L_0x039c
            goto L_0x039d
        L_0x039c:
            r3 = 0
        L_0x039d:
            r2.f10049c = r3
            return r2
        L_0x03a0:
            k5.i r2 = new k5.i
            r2.<init>(r1)
            long r3 = r18.readLong()
            r2.f9496a = r3
            long r3 = r18.readLong()
            r2.f9497b = r3
            int r3 = r18.readInt()
            r2.f9498c = r3
            int r3 = r18.readInt()
            r2.d = r3
            int r3 = r18.readInt()
            r2.f9499e = r3
            java.lang.String r3 = r18.readString()
            r2.f9500f = r3
            byte r3 = r18.readByte()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x03d3
            r3 = r5
            goto L_0x03d4
        L_0x03d3:
            r3 = r4
        L_0x03d4:
            r2.f9501p = r3
            int r3 = r18.readInt()
            r2.f9502q = r3
            int r3 = r18.readInt()
            r6 = 0
            if (r3 >= 0) goto L_0x03e5
            r7 = r6
            goto L_0x0403
        L_0x03e5:
            n.k r7 = new n.k
            r7.<init>(r3)
        L_0x03ea:
            if (r3 <= 0) goto L_0x0403
            int r8 = r18.readInt()
            byte r9 = r18.readByte()
            if (r9 != r5) goto L_0x03f8
            r9 = r5
            goto L_0x03f9
        L_0x03f8:
            r9 = r4
        L_0x03f9:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r7.a(r8, r9)
            int r3 = r3 + -1
            goto L_0x03ea
        L_0x0403:
            r2.f9503r = r7
            int r3 = r18.readInt()
            if (r3 > 0) goto L_0x040c
            goto L_0x0425
        L_0x040c:
            n.g r6 = new n.g
            r6.<init>(r3)
        L_0x0411:
            if (r3 <= 0) goto L_0x0425
            long r4 = r18.readLong()
            int r7 = r18.readInt()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.d(r7, r4)
            int r3 = r3 + -1
            goto L_0x0411
        L_0x0425:
            r2.f9504s = r6
            return r2
        L_0x0428:
            k.O r2 = new k.O
            r2.<init>(r1)
            byte r1 = r18.readByte()
            if (r1 == 0) goto L_0x0435
            r1 = 1
            goto L_0x0436
        L_0x0435:
            r1 = 0
        L_0x0436:
            r2.f9214a = r1
            return r2
        L_0x0439:
            g2.b r2 = new g2.b
            r2.<init>(r1)
            java.lang.Class<g2.b> r3 = g2.b.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.lang.Object r1 = r1.readValue(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.f7984a = r1
            return r2
        L_0x0451:
            int r2 = R2.b.c1(r18)
            r3 = 0
        L_0x0456:
            int r4 = r18.dataPosition()
            if (r4 >= r2) goto L_0x046d
            int r4 = r18.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x0468
            R2.b.T0(r4, r1)
            goto L_0x0456
        L_0x0468:
            java.lang.String r3 = R2.b.r(r4, r1)
            goto L_0x0456
        L_0x046d:
            R2.b.x(r2, r1)
            e3.e r1 = new e3.e
            r1.<init>(r3)
            return r1
        L_0x0476:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r4
        L_0x0481:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x04b8
            int r3 = r18.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x04b3
            r5 = 2
            if (r4 == r5) goto L_0x04ae
            r5 = 3
            if (r4 == r5) goto L_0x04a9
            r5 = 4
            if (r4 == r5) goto L_0x04a4
            r5 = 5
            if (r4 == r5) goto L_0x049f
            R2.b.T0(r3, r1)
            goto L_0x0481
        L_0x049f:
            boolean r10 = R2.b.w0(r3, r1)
            goto L_0x0481
        L_0x04a4:
            java.lang.String r9 = R2.b.r(r3, r1)
            goto L_0x0481
        L_0x04a9:
            java.lang.String r8 = R2.b.r(r3, r1)
            goto L_0x0481
        L_0x04ae:
            java.lang.String r7 = R2.b.r(r3, r1)
            goto L_0x0481
        L_0x04b3:
            java.lang.String r6 = R2.b.r(r3, r1)
            goto L_0x0481
        L_0x04b8:
            R2.b.x(r2, r1)
            e3.d r1 = new e3.d
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return r1
        L_0x04c2:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
        L_0x04ce:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x0508
            int r3 = r18.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 1: goto L_0x0503;
                case 2: goto L_0x04fe;
                case 3: goto L_0x04f9;
                case 4: goto L_0x04ef;
                case 5: goto L_0x04ea;
                case 6: goto L_0x04e5;
                case 7: goto L_0x04e0;
                default: goto L_0x04dc;
            }
        L_0x04dc:
            R2.b.T0(r3, r1)
            goto L_0x04ce
        L_0x04e0:
            java.lang.String r11 = R2.b.r(r3, r1)
            goto L_0x04ce
        L_0x04e5:
            java.lang.String r10 = R2.b.r(r3, r1)
            goto L_0x04ce
        L_0x04ea:
            java.lang.String r9 = R2.b.r(r3, r1)
            goto L_0x04ce
        L_0x04ef:
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.zzait> r4 = com.google.android.gms.internal.p002firebaseauthapi.zzait.CREATOR
            android.os.Parcelable r3 = R2.b.q(r1, r3, r4)
            r8 = r3
            com.google.android.gms.internal.firebase-auth-api.zzait r8 = (com.google.android.gms.internal.p002firebaseauthapi.zzait) r8
            goto L_0x04ce
        L_0x04f9:
            java.lang.String r7 = R2.b.r(r3, r1)
            goto L_0x04ce
        L_0x04fe:
            java.lang.String r6 = R2.b.r(r3, r1)
            goto L_0x04ce
        L_0x0503:
            java.lang.String r5 = R2.b.r(r3, r1)
            goto L_0x04ce
        L_0x0508:
            R2.b.x(r2, r1)
            e3.G r1 = new e3.G
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r1
        L_0x0512:
            int r2 = R2.b.c1(r18)
        L_0x0516:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x0524
            int r3 = r18.readInt()
            R2.b.T0(r3, r1)
            goto L_0x0516
        L_0x0524:
            R2.b.x(r2, r1)
            e3.t r1 = new e3.t
            r1.<init>()
            return r1
        L_0x052d:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r11 = r9
            r13 = r11
            r15 = r13
            r16 = r15
            r10 = r4
            r12 = r10
            r14 = r12
        L_0x053f:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x0588
            int r3 = r18.readInt()
            char r4 = (char) r3
            switch(r4) {
                case 1: goto L_0x0583;
                case 2: goto L_0x057e;
                case 3: goto L_0x0579;
                case 4: goto L_0x0574;
                case 5: goto L_0x056f;
                case 6: goto L_0x056a;
                case 7: goto L_0x0565;
                case 8: goto L_0x0560;
                case 9: goto L_0x055b;
                case 10: goto L_0x0556;
                case 11: goto L_0x0551;
                default: goto L_0x054d;
            }
        L_0x054d:
            R2.b.T0(r3, r1)
            goto L_0x053f
        L_0x0551:
            java.lang.String r16 = R2.b.r(r3, r1)
            goto L_0x053f
        L_0x0556:
            java.lang.String r15 = R2.b.r(r3, r1)
            goto L_0x053f
        L_0x055b:
            int r14 = R2.b.A0(r3, r1)
            goto L_0x053f
        L_0x0560:
            java.lang.String r13 = R2.b.r(r3, r1)
            goto L_0x053f
        L_0x0565:
            boolean r12 = R2.b.w0(r3, r1)
            goto L_0x053f
        L_0x056a:
            java.lang.String r11 = R2.b.r(r3, r1)
            goto L_0x053f
        L_0x056f:
            boolean r10 = R2.b.w0(r3, r1)
            goto L_0x053f
        L_0x0574:
            java.lang.String r9 = R2.b.r(r3, r1)
            goto L_0x053f
        L_0x0579:
            java.lang.String r8 = R2.b.r(r3, r1)
            goto L_0x053f
        L_0x057e:
            java.lang.String r7 = R2.b.r(r3, r1)
            goto L_0x053f
        L_0x0583:
            java.lang.String r6 = R2.b.r(r3, r1)
            goto L_0x053f
        L_0x0588:
            R2.b.x(r2, r1)
            e3.a r1 = new e3.a
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x0592:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
            r6 = r3
            r7 = r6
            r5 = r4
        L_0x059b:
            int r8 = r18.dataPosition()
            if (r8 >= r2) goto L_0x05ca
            int r8 = r18.readInt()
            char r9 = (char) r8
            r10 = 2
            if (r9 == r10) goto L_0x05c5
            r10 = 3
            if (r9 == r10) goto L_0x05c0
            r10 = 4
            if (r9 == r10) goto L_0x05bb
            r10 = 5
            if (r9 == r10) goto L_0x05b6
            R2.b.T0(r8, r1)
            goto L_0x059b
        L_0x05b6:
            boolean r5 = R2.b.w0(r8, r1)
            goto L_0x059b
        L_0x05bb:
            boolean r4 = R2.b.w0(r8, r1)
            goto L_0x059b
        L_0x05c0:
            java.lang.String r7 = R2.b.r(r8, r1)
            goto L_0x059b
        L_0x05c5:
            java.lang.String r6 = R2.b.r(r8, r1)
            goto L_0x059b
        L_0x05ca:
            R2.b.x(r2, r1)
            e3.C r1 = new e3.C
            r1.<init>()
            r1.f7599a = r6
            r1.f7600b = r7
            r1.f7601c = r4
            r1.d = r5
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 == 0) goto L_0x05e1
            goto L_0x05e5
        L_0x05e1:
            android.net.Uri r3 = android.net.Uri.parse(r7)
        L_0x05e5:
            r1.f7602e = r3
            return r1
        L_0x05e8:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = r3
        L_0x05ee:
            int r5 = r18.dataPosition()
            if (r5 >= r2) goto L_0x060d
            int r5 = r18.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x0608
            r7 = 2
            if (r6 == r7) goto L_0x0603
            R2.b.T0(r5, r1)
            goto L_0x05ee
        L_0x0603:
            java.lang.String r4 = R2.b.r(r5, r1)
            goto L_0x05ee
        L_0x0608:
            java.lang.String r3 = R2.b.r(r5, r1)
            goto L_0x05ee
        L_0x060d:
            R2.b.x(r2, r1)
            e3.A r1 = new e3.A
            r1.<init>(r3, r4)
            return r1
        L_0x0616:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
            r7 = r3
            r8 = r7
            r11 = r8
            r9 = r4
        L_0x0621:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x0655
            int r3 = r18.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0650
            r5 = 2
            if (r4 == r5) goto L_0x064b
            r5 = 3
            if (r4 == r5) goto L_0x0646
            r5 = 4
            if (r4 == r5) goto L_0x063c
            R2.b.T0(r3, r1)
            goto L_0x0621
        L_0x063c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.firebase-auth-api.zzair> r4 = com.google.android.gms.internal.p002firebaseauthapi.zzair.CREATOR
            android.os.Parcelable r3 = R2.b.q(r1, r3, r4)
            r11 = r3
            com.google.android.gms.internal.firebase-auth-api.zzair r11 = (com.google.android.gms.internal.p002firebaseauthapi.zzair) r11
            goto L_0x0621
        L_0x0646:
            long r9 = R2.b.C0(r3, r1)
            goto L_0x0621
        L_0x064b:
            java.lang.String r8 = R2.b.r(r3, r1)
            goto L_0x0621
        L_0x0650:
            java.lang.String r7 = R2.b.r(r3, r1)
            goto L_0x0621
        L_0x0655:
            R2.b.x(r2, r1)
            e3.z r1 = new e3.z
            r6 = r1
            r6.<init>(r7, r8, r9, r11)
            return r1
        L_0x065f:
            int r2 = R2.b.c1(r18)
            r3 = 0
        L_0x0664:
            int r4 = r18.dataPosition()
            if (r4 >= r2) goto L_0x067b
            int r4 = r18.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x0676
            R2.b.T0(r4, r1)
            goto L_0x0664
        L_0x0676:
            java.lang.String r3 = R2.b.r(r4, r1)
            goto L_0x0664
        L_0x067b:
            R2.b.x(r2, r1)
            e3.x r1 = new e3.x
            r1.<init>(r3)
            return r1
        L_0x0684:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
            r9 = r3
            r10 = r9
            r11 = r10
            r7 = r4
        L_0x068f:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x06be
            int r3 = r18.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x06b9
            r5 = 2
            if (r4 == r5) goto L_0x06b4
            r5 = 3
            if (r4 == r5) goto L_0x06af
            r5 = 4
            if (r4 == r5) goto L_0x06aa
            R2.b.T0(r3, r1)
            goto L_0x068f
        L_0x06aa:
            java.lang.String r11 = R2.b.r(r3, r1)
            goto L_0x068f
        L_0x06af:
            long r7 = R2.b.C0(r3, r1)
            goto L_0x068f
        L_0x06b4:
            java.lang.String r10 = R2.b.r(r3, r1)
            goto L_0x068f
        L_0x06b9:
            java.lang.String r9 = R2.b.r(r3, r1)
            goto L_0x068f
        L_0x06be:
            R2.b.x(r2, r1)
            e3.w r1 = new e3.w
            r6 = r1
            r6.<init>(r7, r9, r10, r11)
            return r1
        L_0x06c8:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = 0
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r4
        L_0x06d3:
            int r3 = r18.dataPosition()
            if (r3 >= r2) goto L_0x070a
            int r3 = r18.readInt()
            char r4 = (char) r3
            r5 = 1
            if (r4 == r5) goto L_0x0705
            r5 = 2
            if (r4 == r5) goto L_0x0700
            r5 = 4
            if (r4 == r5) goto L_0x06fb
            r5 = 5
            if (r4 == r5) goto L_0x06f6
            r5 = 6
            if (r4 == r5) goto L_0x06f1
            R2.b.T0(r3, r1)
            goto L_0x06d3
        L_0x06f1:
            java.lang.String r9 = R2.b.r(r3, r1)
            goto L_0x06d3
        L_0x06f6:
            boolean r10 = R2.b.w0(r3, r1)
            goto L_0x06d3
        L_0x06fb:
            java.lang.String r8 = R2.b.r(r3, r1)
            goto L_0x06d3
        L_0x0700:
            java.lang.String r7 = R2.b.r(r3, r1)
            goto L_0x06d3
        L_0x0705:
            java.lang.String r6 = R2.b.r(r3, r1)
            goto L_0x06d3
        L_0x070a:
            R2.b.x(r2, r1)
            e3.s r1 = new e3.s
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return r1
        L_0x0714:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x071b:
            int r6 = r18.dataPosition()
            if (r6 >= r2) goto L_0x0742
            int r6 = r18.readInt()
            char r7 = (char) r6
            r8 = 1
            if (r7 == r8) goto L_0x073d
            r8 = 2
            if (r7 == r8) goto L_0x0738
            r8 = 3
            if (r7 == r8) goto L_0x0733
            R2.b.T0(r6, r1)
            goto L_0x071b
        L_0x0733:
            java.lang.String r5 = R2.b.r(r6, r1)
            goto L_0x071b
        L_0x0738:
            java.lang.String r4 = R2.b.r(r6, r1)
            goto L_0x071b
        L_0x073d:
            java.lang.String r3 = R2.b.r(r6, r1)
            goto L_0x071b
        L_0x0742:
            R2.b.x(r2, r1)
            e3.F r1 = new e3.F
            r1.<init>(r3, r4, r5)
            return r1
        L_0x074b:
            int r2 = R2.b.c1(r18)
            r3 = 0
            r4 = r3
        L_0x0751:
            int r5 = r18.dataPosition()
            if (r5 >= r2) goto L_0x0770
            int r5 = r18.readInt()
            char r6 = (char) r5
            r7 = 1
            if (r6 == r7) goto L_0x076b
            r7 = 2
            if (r6 == r7) goto L_0x0766
            R2.b.T0(r5, r1)
            goto L_0x0751
        L_0x0766:
            java.lang.String r4 = R2.b.r(r5, r1)
            goto L_0x0751
        L_0x076b:
            java.lang.String r3 = R2.b.r(r5, r1)
            goto L_0x0751
        L_0x0770:
            R2.b.x(r2, r1)
            e3.p r1 = new e3.p
            r1.<init>(r3, r4)
            return r1
        L_0x0779:
            int r2 = R2.b.c1(r18)
            r3 = 0
        L_0x077e:
            int r4 = r18.dataPosition()
            if (r4 >= r2) goto L_0x0795
            int r4 = r18.readInt()
            char r5 = (char) r4
            r6 = 1
            if (r5 == r6) goto L_0x0790
            R2.b.T0(r4, r1)
            goto L_0x077e
        L_0x0790:
            java.lang.String r3 = R2.b.r(r4, r1)
            goto L_0x077e
        L_0x0795:
            R2.b.x(r2, r1)
            e3.o r1 = new e3.o
            r1.<init>(r3)
            return r1
        L_0x079e:
            int r2 = r18.readInt()
            int r1 = r18.readInt()
            com.google.android.material.datepicker.o r1 = com.google.android.material.datepicker.o.a(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final Object[] newArray(int i2) {
        switch (this.f6447a) {
            case 0:
                return new o[i2];
            case 1:
                return new o[i2];
            case 2:
                return new p[i2];
            case 3:
                return new F[i2];
            case 4:
                return new s[i2];
            case 5:
                return new w[i2];
            case zzaky.zzf.zzf:
                return new x[i2];
            case zzaky.zzf.zzg:
                return new z[i2];
            case 8:
                return new C0490A[i2];
            case 9:
                return new C0492C[i2];
            case 10:
                return new C0493a[i2];
            case ModuleDescriptor.MODULE_VERSION:
                return new t[i2];
            case 12:
                return new G[i2];
            case 13:
                return new C0496d[i2];
            case 14:
                return new C0497e[i2];
            case 15:
                return new b[i2];
            case 16:
                return new C0678O[i2];
            case 17:
                return new C0772i[i2];
            case 18:
                return new C0826s[i2];
            case 19:
                return new Z[i2];
            case 20:
                return new b0[i2];
            case 21:
                return new C0891a[i2];
            case 22:
                return new C0892b[i2];
            case 23:
                return new C0893c[i2];
            case 24:
                return new k[i2];
            case 25:
                return new C0947b[i2];
            case 26:
                return new d[i2];
            case 27:
                return new e[i2];
            case 28:
                return new f[i2];
            default:
                return new C0946a[i2];
        }
    }
}
