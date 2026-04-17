package Z4;

import h0.C0552a;

public class k {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isPlayersDataLoaded = true;
    public boolean isPositionAllowedFireOtherPlayer = true;

    public String toString() {
        StringBuilder sb = new StringBuilder("FireGangMemberResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isPlayersDataLoaded=");
        sb.append(this.isPlayersDataLoaded);
        sb.append(", isPositionAllowedFireOtherPlayer=");
        sb.append(this.isPositionAllowedFireOtherPlayer);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
