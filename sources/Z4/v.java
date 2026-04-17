package Z4;

import h0.C0552a;

public class v {
    public int emblemAfterChange = -1;
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isCashChanged = false;
    public boolean isEmblemsChanged = false;
    public boolean isLuckyLineChanged = false;
    public boolean isLuckyLinerReset = false;
    public boolean isNewWeaponAdded = false;
    public boolean isPalladiumChanged = false;
    public boolean isWeaponExist = true;
    public int luckyLineAfterChange = -1;
    public int palladiumCountAfterChange = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder("UpgradeResultObject{isWeaponExist=");
        sb.append(this.isWeaponExist);
        sb.append(", hasError=");
        sb.append(this.hasError);
        sb.append(", isNewWeaponAdded=");
        sb.append(this.isNewWeaponAdded);
        sb.append(", isLuckyLinerReset=");
        sb.append(this.isLuckyLinerReset);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isPalladiumChanged=");
        sb.append(this.isPalladiumChanged);
        sb.append(", isEmblemsChanged=");
        sb.append(this.isEmblemsChanged);
        sb.append(", isCashChanged=");
        sb.append(this.isCashChanged);
        sb.append(", isLuckyLineChanged=");
        sb.append(this.isLuckyLineChanged);
        sb.append(", emblemAfterChange=");
        sb.append(this.emblemAfterChange);
        sb.append(", luckyLineAfterChange=");
        sb.append(this.luckyLineAfterChange);
        sb.append(", palladiumCountAfterChange=");
        sb.append(this.palladiumCountAfterChange);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
