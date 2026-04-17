package Z4;

import h0.C0552a;

public class l {
    public static final int DEPOSIT_TYPE_CASH = 0;
    public static final int DEPOSIT_TYPE_GOLD = 1;
    public String errorMessage = "";
    public long gangMoneyAfterChange = 0;
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isCurrentPlayerBoss = true;
    public boolean isGangMoneyChanged = true;
    public boolean isPlayerMoneyChanged = true;

    public String toString() {
        StringBuilder sb = new StringBuilder("GangDonateResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isCurrentPlayerBoss=");
        sb.append(this.isCurrentPlayerBoss);
        sb.append(", isGangMoneyChanged=");
        sb.append(this.isGangMoneyChanged);
        sb.append(", isPlayerMoneyChanged=");
        sb.append(this.isPlayerMoneyChanged);
        sb.append(", gangMoneyAfterChange=");
        sb.append(this.gangMoneyAfterChange);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
