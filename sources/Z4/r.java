package Z4;

import h0.C0552a;

public class r {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isMaterialCountInStockChanged = false;
    public boolean isMaterialRemovedFromStallCell = false;

    public String toString() {
        StringBuilder sb = new StringBuilder("RemoveMaterialFromStallResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isMaterialRemovedFromStallCell=");
        sb.append(this.isMaterialRemovedFromStallCell);
        sb.append(", isMaterialCountInStockChanged=");
        sb.append(this.isMaterialCountInStockChanged);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
