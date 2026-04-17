package Z4;

import h0.C0552a;

public class b {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isCountOverMaximumValue = false;
    public boolean isMaterialAddedToGangMarketNode = false;
    public boolean isMaterialAddedToStallCell = false;
    public boolean isMaterialCountInStockChanged = false;
    public int maximumItemsForEachCell = 10;

    public String toString() {
        StringBuilder sb = new StringBuilder("AddMaterialToStallResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isCountOverMaximumValue=");
        sb.append(this.isCountOverMaximumValue);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isMaterialCountInStockChanged=");
        sb.append(this.isMaterialCountInStockChanged);
        sb.append(", isMaterialAddedToStallCell=");
        sb.append(this.isMaterialAddedToStallCell);
        sb.append(", isMaterialAddedToGangMarketNode=");
        sb.append(this.isMaterialAddedToGangMarketNode);
        sb.append(", maximumItemsForEachCell=");
        sb.append(this.maximumItemsForEachCell);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
