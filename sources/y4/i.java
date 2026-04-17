package Y4;

import R2.b;
import com.bumptech.glide.d;
import d5.u;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public String f4366a;

    /* renamed from: b  reason: collision with root package name */
    public String f4367b;

    /* renamed from: c  reason: collision with root package name */
    public String f4368c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public long f4369e;

    /* renamed from: f  reason: collision with root package name */
    public int f4370f;
    public int g;
    public long h;

    /* renamed from: i  reason: collision with root package name */
    public long f4371i;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, Y4.i] */
    public static i a(u uVar) {
        ? obj = new Object();
        obj.f4366a = uVar.getAccountObject().getId();
        obj.f4368c = uVar.getMainStatesObject().getNickName();
        obj.f4367b = uVar.getMainStatesObject().getProfilePicUrl();
        obj.g = uVar.getMainStatesObject().getLevel();
        obj.f4370f = uVar.getMainStatesObject().getGender();
        obj.d = b.k0(uVar.getMainStatesObject().getVipEndTime());
        obj.f4369e = uVar.getMainStatesObject().getLastSeen();
        obj.f4371i = d.h0(uVar.getMainStatesObject(), uVar.getGymObject(), uVar.getSkillsObject(), uVar.getArmingObject(), uVar.getSchoolObject());
        obj.h = d.q0(uVar.getMainStatesObject(), uVar.getGymObject(), uVar.getSkillsObject(), uVar.getArmingObject(), uVar.getSchoolObject());
        return obj;
    }

    public final String toString() {
        return "FightClubObject{playerId='" + this.f4366a + "', profilePicUrl='" + this.f4367b + "', name='" + this.f4368c + "', isHasVip=" + this.d + ", lastSeen=" + this.f4369e + ", gender=" + this.f4370f + ", level=" + this.g + ", totalHealth=" + this.h + ", currentHealth=" + this.f4371i + '}';
    }
}
