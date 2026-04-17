package Y4;

import h0.C0552a;
import java.util.ArrayList;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public String f4354a;

    /* renamed from: b  reason: collision with root package name */
    public String f4355b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4356c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4357e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4358f;
    public int g;
    public final long h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4359i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4360j = false;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4361k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4362l = false;

    /* renamed from: m  reason: collision with root package name */
    public long f4363m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f4364n;

    /* renamed from: o  reason: collision with root package name */
    public String f4365o = "no_private_domain_image";

    public h(int i2, int i5, int i6, int i7, int i8, long j6) {
        this.f4356c = i2;
        this.d = i5;
        this.f4357e = i6;
        this.f4358f = i7;
        this.g = i8;
        this.h = j6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EstateObject{firebaseKeyNode='");
        sb.append(this.f4354a);
        sb.append("', estateOwnerId='");
        sb.append(this.f4355b);
        sb.append("', estateOwnerName='null', id=");
        sb.append(this.f4356c);
        sb.append(", nameResourceId=");
        sb.append(this.d);
        sb.append(", descriptionResourceId=");
        sb.append(this.f4357e);
        sb.append(", imageResourceId=");
        sb.append(this.f4358f);
        sb.append(", happiness=");
        sb.append(this.g);
        sb.append(", cost=");
        sb.append(this.h);
        sb.append(", hasAirPlaneRoad=");
        sb.append(this.f4359i);
        sb.append(", isUsed=");
        sb.append(this.f4360j);
        sb.append(", isSpouseUsed=");
        sb.append(this.f4361k);
        sb.append(", isDefaultEstate=");
        sb.append(this.f4362l);
        sb.append(", lastTimeDailyTaxPaidInMilli=");
        sb.append(this.f4363m);
        sb.append(", estateModificationList=");
        sb.append(this.f4364n);
        sb.append(", privateDomainPicUrl='");
        return C0552a.r(sb, this.f4365o, "'}");
    }
}
