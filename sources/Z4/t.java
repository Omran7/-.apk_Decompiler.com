package Z4;

import h0.C0552a;

public class t {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isCurrentPlayerIsBoss = true;
    public boolean isNewBossSameCurrentPlayer = false;
    public boolean isPlayersDataLoaded = true;

    public String toString() {
        StringBuilder sb = new StringBuilder("TransferBossPositionResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isNewBossSameCurrentPlayer=");
        sb.append(this.isNewBossSameCurrentPlayer);
        sb.append(", isPlayersDataLoaded=");
        sb.append(this.isPlayersDataLoaded);
        sb.append(", isCurrentPlayerIsBoss=");
        sb.append(this.isCurrentPlayerIsBoss);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
