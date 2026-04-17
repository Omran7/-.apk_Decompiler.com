package Z4;

import h0.C0552a;

public class a {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean hasRequiredLevel = true;
    public boolean isAllProcessSuccess = false;
    public boolean isCurrentlyInGang = false;
    public boolean isGangMembersNumberAllowed = true;
    public boolean isGangObjectUpdated = false;
    public boolean isPlayerHasRequirements = true;
    public boolean isTimeAllowToJoinNewGang = true;

    public String toString() {
        StringBuilder sb = new StringBuilder("AcceptGangRequestResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isPlayerHasRequirements=");
        sb.append(this.isPlayerHasRequirements);
        sb.append(", hasRequiredLevel=");
        sb.append(this.hasRequiredLevel);
        sb.append(", isTimeAllowToJoinNewGang=");
        sb.append(this.isTimeAllowToJoinNewGang);
        sb.append(", isCurrentlyInGang=");
        sb.append(this.isCurrentlyInGang);
        sb.append(", isGangMembersNumberAllowed=");
        sb.append(this.isGangMembersNumberAllowed);
        sb.append(", isGangObjectUpdated=");
        sb.append(this.isGangObjectUpdated);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
