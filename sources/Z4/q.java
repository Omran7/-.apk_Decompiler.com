package Z4;

import h0.C0552a;

public class q {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isGotFirstPurchaseGifts = false;
    public String type;
    public long value;

    public String toString() {
        StringBuilder sb = new StringBuilder("PurchaseResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isGotFirstPurchaseGifts=");
        sb.append(this.isGotFirstPurchaseGifts);
        sb.append(", type='");
        sb.append(this.type);
        sb.append("', value=");
        sb.append(this.value);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
