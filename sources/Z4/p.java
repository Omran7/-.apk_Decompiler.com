package Z4;

import h0.C0552a;

public class p {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isCurrentPlayerBoss = true;

    public String toString() {
        StringBuilder sb = new StringBuilder("LeaveGangResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isCurrentPlayerBoss=");
        sb.append(this.isCurrentPlayerBoss);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
