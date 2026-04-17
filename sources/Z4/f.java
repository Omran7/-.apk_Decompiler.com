package Z4;

import h0.C0552a;

public class f {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isCurrentPlayerBoss = true;
    public boolean isGangDataAlreadyExist = false;
    public boolean isGangDataValid = true;
    public boolean isGangNameTooLong = false;
    public boolean isGangNameTooShort = false;
    public boolean isGangTagEqualToThreeLetters = true;
    public boolean isGoldChanged = true;
    public boolean isNameAlreadyExist = false;
    public boolean isTagAlreadyExist = false;

    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeGangDataResultObject{hasError=");
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
        sb.append(", isCurrentPlayerBoss=");
        sb.append(this.isCurrentPlayerBoss);
        sb.append(", isGangDataAlreadyExist=");
        sb.append(this.isGangDataAlreadyExist);
        sb.append(", isNameAlreadyExist=");
        sb.append(this.isNameAlreadyExist);
        sb.append(", isTagAlreadyExist=");
        sb.append(this.isTagAlreadyExist);
        sb.append(", isGoldChanged=");
        sb.append(this.isGoldChanged);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
