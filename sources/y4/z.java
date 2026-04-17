package Y4;

import R2.b;
import d5.k;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public String f4451a;

    /* renamed from: b  reason: collision with root package name */
    public String f4452b;

    /* renamed from: c  reason: collision with root package name */
    public String f4453c;
    public int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f4454e;

    /* renamed from: f  reason: collision with root package name */
    public long f4455f;
    public boolean g = false;
    public boolean h = false;

    public static z a(String str, long j6, k kVar) {
        z zVar = new z();
        zVar.f4451a = str;
        zVar.f4455f = j6;
        zVar.f4452b = kVar.getNickName();
        zVar.f4453c = kVar.getProfilePicUrl();
        zVar.f4454e = kVar.getGender();
        zVar.g = b.k0(kVar.getVipEndTime());
        zVar.h = b.l0(kVar.getLastSeen());
        return zVar;
    }

    public final String toString() {
        return "RankObject{id='" + this.f4451a + "', name='" + this.f4452b + "', profilePicUrl='" + this.f4453c + "', rankValue='" + this.f4455f + "', hasVip=" + this.g + ", isOnline=" + this.h + ", gender=" + this.f4454e + '}';
    }
}
