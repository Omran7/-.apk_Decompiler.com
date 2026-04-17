package com.google.android.gms.common.api;

import A1.a;
import R2.b;
import X4.d;
import a.C0251c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import z1.C1132b;

public final class Status extends a implements s, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C0251c(18);

    /* renamed from: e  reason: collision with root package name */
    public static final Status f6002e = new Status(0, (String) null, (PendingIntent) null, (C1132b) null);

    /* renamed from: f  reason: collision with root package name */
    public static final Status f6003f = new Status(14, (String) null, (PendingIntent) null, (C1132b) null);

    /* renamed from: p  reason: collision with root package name */
    public static final Status f6004p = new Status(8, (String) null, (PendingIntent) null, (C1132b) null);

    /* renamed from: q  reason: collision with root package name */
    public static final Status f6005q = new Status(15, (String) null, (PendingIntent) null, (C1132b) null);

    /* renamed from: r  reason: collision with root package name */
    public static final Status f6006r = new Status(16, (String) null, (PendingIntent) null, (C1132b) null);

    /* renamed from: a  reason: collision with root package name */
    public final int f6007a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6008b;

    /* renamed from: c  reason: collision with root package name */
    public final PendingIntent f6009c;
    public final C1132b d;

    public Status(int i2, String str, PendingIntent pendingIntent, C1132b bVar) {
        this.f6007a = i2;
        this.f6008b = str;
        this.f6009c = pendingIntent;
        this.d = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (com.google.android.gms.common.api.Status) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.api.Status
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            int r0 = r4.f6007a
            int r2 = r3.f6007a
            if (r2 != r0) goto L_0x002e
            java.lang.String r0 = r3.f6008b
            java.lang.String r2 = r4.f6008b
            boolean r0 = com.google.android.gms.common.internal.I.j(r0, r2)
            if (r0 == 0) goto L_0x002e
            android.app.PendingIntent r0 = r3.f6009c
            android.app.PendingIntent r2 = r4.f6009c
            boolean r0 = com.google.android.gms.common.internal.I.j(r0, r2)
            if (r0 == 0) goto L_0x002e
            z1.b r0 = r3.d
            z1.b r4 = r4.d
            boolean r4 = com.google.android.gms.common.internal.I.j(r0, r4)
            if (r4 == 0) goto L_0x002e
            r4 = 1
            return r4
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.Status.equals(java.lang.Object):boolean");
    }

    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6007a), this.f6008b, this.f6009c, this.d});
    }

    public final String toString() {
        d dVar = new d((Object) this);
        String str = this.f6008b;
        if (str == null) {
            str = b.b0(this.f6007a);
        }
        dVar.c(str, "statusCode");
        dVar.c(this.f6009c, "resolution");
        return dVar.toString();
    }

    public final boolean v() {
        return this.f6007a <= 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int W02 = android.support.v4.media.session.a.W0(20293, parcel);
        android.support.v4.media.session.a.Y0(parcel, 1, 4);
        parcel.writeInt(this.f6007a);
        android.support.v4.media.session.a.R0(parcel, 2, this.f6008b, false);
        android.support.v4.media.session.a.Q0(parcel, 3, this.f6009c, i2, false);
        android.support.v4.media.session.a.Q0(parcel, 4, this.d, i2, false);
        android.support.v4.media.session.a.X0(W02, parcel);
    }
}
