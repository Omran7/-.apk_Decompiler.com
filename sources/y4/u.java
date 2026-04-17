package Y4;

import R2.b;
import d5.j;
import d5.k;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public String f4434a;

    /* renamed from: b  reason: collision with root package name */
    public String f4435b;

    /* renamed from: c  reason: collision with root package name */
    public String f4436c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public int f4437e;

    /* renamed from: f  reason: collision with root package name */
    public int f4438f;
    public long g;
    public String h;

    /* renamed from: i  reason: collision with root package name */
    public long f4439i;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, Y4.u] */
    public static u a(String str, k kVar, j jVar) {
        ? obj = new Object();
        obj.f4434a = str;
        obj.f4435b = kVar.getNickName();
        obj.f4436c = kVar.getProfilePicUrl();
        obj.f4438f = kVar.getLevel();
        obj.f4437e = kVar.getGender();
        obj.d = b.k0(kVar.getVipEndTime());
        obj.g = kVar.getLastSeen();
        obj.h = jVar.getReason();
        obj.f4439i = jVar.getPlaceEndTimeInMilli();
        return obj;
    }

    public final String toString() {
        return "PatientOrPrisonerObject{playerId='" + this.f4434a + "', playerName='" + this.f4435b + "', profilePicUrl='" + this.f4436c + "', hasVip=" + this.d + ", gender=" + this.f4437e + ", level=" + this.f4438f + ", lastSeen=" + this.g + ", reason='" + this.h + "', endTimeInMilli=" + this.f4439i + '}';
    }
}
