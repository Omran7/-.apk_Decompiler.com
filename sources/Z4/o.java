package Z4;

import h0.C0552a;

public class o {
    public int crystalId = 0;
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isPlayerAlreadyJoined = false;
    public boolean isPlayerMainStatesChanged = true;
    public String membersIdsJoinedMilitia = "";

    public String toString() {
        StringBuilder sb = new StringBuilder("JoinGangMilitiaResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isPlayerMainStatesChanged=");
        sb.append(this.isPlayerMainStatesChanged);
        sb.append(", isPlayerAlreadyJoined=");
        sb.append(this.isPlayerAlreadyJoined);
        sb.append(", crystalId=");
        sb.append(this.crystalId);
        sb.append(", membersIdsJoinedMilitia=");
        sb.append(this.membersIdsJoinedMilitia);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
