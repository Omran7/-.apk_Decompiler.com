package Y4;

import b5.b;
import d5.k;

/* renamed from: Y4.a  reason: case insensitive filesystem */
public final class C0244a {

    /* renamed from: a  reason: collision with root package name */
    public String f4323a;

    /* renamed from: b  reason: collision with root package name */
    public String f4324b;

    /* renamed from: c  reason: collision with root package name */
    public String f4325c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4326e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4327f;
    public int g;
    public Object h;

    /* JADX WARNING: type inference failed for: r0v0, types: [Y4.a, java.lang.Object] */
    public static C0244a a(b bVar, k kVar) {
        ? obj = new Object();
        obj.f4323a = bVar.getPlayerId();
        obj.d = bVar.getContent();
        obj.h = bVar.getUnixTimeInMilli();
        obj.f4324b = kVar.getNickName();
        obj.f4325c = kVar.getProfilePicUrl();
        obj.g = kVar.getGender();
        obj.f4326e = R2.b.k0(kVar.getVipEndTime());
        obj.f4327f = R2.b.l0(kVar.getLastSeen());
        return obj;
    }

    public final String toString() {
        return "AdPlayerObject{playerId='" + this.f4323a + "', name='" + this.f4324b + "', profilePicUrl='" + this.f4325c + "', content='" + this.d + "', hasVip=" + this.f4326e + ", isOnline=" + this.f4327f + ", gender=" + this.g + ", unixTimeInMilli=" + this.h + '}';
    }
}
