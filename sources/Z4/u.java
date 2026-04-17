package Z4;

import d5.C0469b;
import h0.C0552a;

public class u {
    public C0469b armingObject;
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isArmingObjectDataUpdated = false;
    public boolean isMaterialDataUpdated = false;

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdateArmingResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isMaterialDataUpdated=");
        sb.append(this.isMaterialDataUpdated);
        sb.append(", isArmingObjectDataUpdated=");
        sb.append(this.isArmingObjectDataUpdated);
        sb.append(", armingObject=");
        sb.append(this.armingObject);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
