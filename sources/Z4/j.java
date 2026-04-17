package Z4;

import d5.C0474g;
import h0.C0552a;

public class j {
    public String errorMessage = "";
    public C0474g gangObject = null;
    public boolean hasError = false;
    public boolean hasRequiredLevel = true;
    public boolean isAllProcessSuccess = false;
    public boolean isCashChanged = true;
    public boolean isCurrentlyInGang = false;
    public boolean isGangDataAlreadyExist = false;
    public boolean isGangDataValid = true;
    public boolean isGangNameTooLong = false;
    public boolean isGangNameTooShort = false;
    public boolean isGangTagEqualToThreeLetters = true;
    public boolean isNameAlreadyExist = false;
    public boolean isPlayerHasRequirements = true;
    public boolean isTagAlreadyExist = false;
    public boolean isTimeAllowToJoinNewGang = true;

    public String toString() {
        StringBuilder sb = new StringBuilder("CreateNewGangResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isGangDataValid=");
        sb.append(this.isGangDataValid);
        sb.append(", isGangNameTooShort=");
        sb.append(this.isGangNameTooShort);
        sb.append(", isGangNameTooLong=");
        sb.append(this.isGangNameTooLong);
        sb.append(", isGangTagEqualToThreeLetters=");
        sb.append(this.isGangTagEqualToThreeLetters);
        sb.append(", isPlayerHasRequirements=");
        sb.append(this.isPlayerHasRequirements);
        sb.append(", hasRequiredLevel=");
        sb.append(this.hasRequiredLevel);
        sb.append(", isTimeAllowToJoinNewGang=");
        sb.append(this.isTimeAllowToJoinNewGang);
        sb.append(", isCurrentlyInGang=");
        sb.append(this.isCurrentlyInGang);
        sb.append(", isGangDataAlreadyExist=");
        sb.append(this.isGangDataAlreadyExist);
        sb.append(", isNameAlreadyExist=");
        sb.append(this.isNameAlreadyExist);
        sb.append(", isTagAlreadyExist=");
        sb.append(this.isTagAlreadyExist);
        sb.append(", isCashChanged=");
        sb.append(this.isCashChanged);
        sb.append(", gangObject=");
        sb.append(this.gangObject);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
