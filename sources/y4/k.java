package Y4;

import b5.m;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f4375a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4376b;

    /* renamed from: c  reason: collision with root package name */
    public String f4377c;
    public String d = "no_profile_pic";

    /* renamed from: e  reason: collision with root package name */
    public int f4378e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4379f;
    public boolean g;
    public final int h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4380i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4381j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4382k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f4383l;

    /* renamed from: m  reason: collision with root package name */
    public final long f4384m;

    public k(m mVar) {
        this.f4375a = mVar.getGangMarketId();
        this.f4376b = mVar.getPlayerId();
        this.f4380i = mVar.getType();
        this.f4381j = mVar.getId();
        this.f4382k = mVar.getLevel();
        this.f4383l = mVar.getCount();
        this.f4384m = mVar.getCost();
        this.h = mVar.getCellNumber();
    }

    public final String toString() {
        return "GangMarketObject{gangMarketId='" + this.f4375a + "', playerId='" + this.f4376b + "', playerName='" + this.f4377c + "', profilePicUrl='" + this.d + "', gender=" + this.f4378e + ", hasVip=" + this.f4379f + ", isOnline=" + this.g + ", stallCellNumber=" + this.h + ", materialId=" + this.f4381j + ", materialType=" + this.f4380i + ", materialLevel=" + this.f4382k + ", materialCount=" + this.f4383l + ", materialCost=" + this.f4384m + '}';
    }
}
