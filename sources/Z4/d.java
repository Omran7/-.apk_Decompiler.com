package Z4;

import h0.C0552a;

public class d {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean hasProblemInCityOrPlace = false;
    public boolean isAllProcessSuccess = false;
    public boolean isCashChanged = false;
    public boolean isMarketCountChanged = false;
    public boolean isStockCountChanged = false;
    public int materialCountInMarket = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder("BuyFromMarketResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", hasProblemInCityOrPlace=");
        sb.append(this.hasProblemInCityOrPlace);
        sb.append(", isMarketCountChanged=");
        sb.append(this.isMarketCountChanged);
        sb.append(", isCashChanged=");
        sb.append(this.isCashChanged);
        sb.append(", isStockCountChanged=");
        sb.append(this.isStockCountChanged);
        sb.append(", materialCountInMarket=");
        sb.append(this.materialCountInMarket);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
