package Y4;

import R2.b;
import d5.k;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public String f4401a;

    /* renamed from: b  reason: collision with root package name */
    public String f4402b;

    /* renamed from: c  reason: collision with root package name */
    public String f4403c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4404e;

    /* renamed from: f  reason: collision with root package name */
    public int f4405f;
    public int g;
    public long h;

    /* JADX WARNING: type inference failed for: r0v0, types: [Y4.n, java.lang.Object] */
    public static n a(String str, long j6, k kVar) {
        ? obj = new Object();
        obj.f4404e = false;
        obj.f4401a = str;
        obj.h = j6;
        obj.f4402b = kVar.getNickName();
        obj.f4403c = kVar.getProfilePicUrl();
        obj.f4405f = kVar.getGender();
        obj.g = kVar.getLevel();
        obj.d = b.k0(kVar.getVipEndTime());
        obj.f4404e = b.l0(kVar.getLastSeen());
        return obj;
    }

    public final String toString() {
        return "PatientOrPrisonerObject{playerId='" + this.f4401a + "', playerName='" + this.f4402b + "', profilePicUrl='" + this.f4403c + "', hasVip=" + this.d + ", gender=" + this.f4405f + ", level=" + this.g + ", requestSentTimeInMilli=" + this.h + '}';
    }
}
