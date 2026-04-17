package Z4;

import h0.C0552a;

public class h {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isCurrentPlayerPlaceNotAllowed = false;
    public boolean isDestinationWrong = false;
    public boolean isMoneyChanged = true;
    public boolean isPlayerAlreadyInPlane = false;

    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeLocationResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isDestinationWrong=");
        sb.append(this.isDestinationWrong);
        sb.append(", isMoneyChanged=");
        sb.append(this.isMoneyChanged);
        sb.append(", isPlayerAlreadyInPlane=");
        sb.append(this.isPlayerAlreadyInPlane);
        sb.append(", isCurrentPlayerPlaceNotAllowed=");
        sb.append(this.isCurrentPlayerPlaceNotAllowed);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
