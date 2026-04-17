package Z4;

import h0.C0552a;

public class g {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isPlayersDataLoaded = true;
    public boolean isPositionAllowedChangeOtherPlayerPosition = true;
    public boolean isPositionAvailable = true;

    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeGangMemberPositionResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isPlayersDataLoaded=");
        sb.append(this.isPlayersDataLoaded);
        sb.append(", isPositionAllowedChangeOtherPlayerPosition=");
        sb.append(this.isPositionAllowedChangeOtherPlayerPosition);
        sb.append(", isPositionAvailable=");
        sb.append(this.isPositionAvailable);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
