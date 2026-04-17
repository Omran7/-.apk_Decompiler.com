package Z4;

import h0.C0552a;

public class e {
    public long costAfterDeductionTaxes = -1;
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isCashChangedForBuyerChanged = false;
    public boolean isCashChangedForSellerChanged = false;
    public boolean isStallCountForSellerChanged = false;
    public boolean isStockCountForBuyerChanged = false;
    public int stallCountAfterChange = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder("BuyFromStallResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isStallCountForSellerChanged=");
        sb.append(this.isStallCountForSellerChanged);
        sb.append(", isCashChangedForBuyerChanged=");
        sb.append(this.isCashChangedForBuyerChanged);
        sb.append(", isCashChangedForSellerChanged=");
        sb.append(this.isCashChangedForSellerChanged);
        sb.append(", isStockCountForBuyerChanged=");
        sb.append(this.isStockCountForBuyerChanged);
        sb.append(", stallCountAfterChange=");
        sb.append(this.stallCountAfterChange);
        sb.append(", costAfterDeductionTaxes=");
        sb.append(this.costAfterDeductionTaxes);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
