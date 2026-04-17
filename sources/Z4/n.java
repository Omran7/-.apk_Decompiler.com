package Z4;

import h0.C0552a;

public class n {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isCurrentPlayerBoss = true;
    public boolean isGangCashEnough = true;
    public boolean isGangRespectEnough = true;
    public boolean isMemberNumberEnough = true;
    public boolean isReachToMaximumLevel = false;
    public long newGangAvailableRespect = 0;
    public long newGangCash = 0;
    public int newLevel = 0;

    public String toString() {
        StringBuilder sb = new StringBuilder("ImproveGangLevelResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isReachToMaximumLevel=");
        sb.append(this.isReachToMaximumLevel);
        sb.append(", isCurrentPlayerBoss=");
        sb.append(this.isCurrentPlayerBoss);
        sb.append(", isMemberNumberEnough=");
        sb.append(this.isMemberNumberEnough);
        sb.append(", isPlayerMoneyChanged=");
        sb.append(this.isGangRespectEnough);
        sb.append(", isPlayerMoneyChanged=");
        sb.append(this.isGangRespectEnough);
        sb.append(", isPlayerMoneyChanged=");
        sb.append(this.isGangRespectEnough);
        sb.append(", isGangCashEnough=");
        sb.append(this.isGangCashEnough);
        sb.append(", newLevel=");
        sb.append(this.newLevel);
        sb.append(", newGangRespect=");
        sb.append(this.newGangAvailableRespect);
        sb.append(", newGangCash=");
        sb.append(this.newGangCash);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
