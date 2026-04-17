package Z4;

import h0.C0552a;

public class c {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean hasGotResults = false;
    public boolean isAllProcessSuccess = false;
    public boolean isMaterialCountsEnough = false;

    public String toString() {
        StringBuilder sb = new StringBuilder("BlackMarketConvertingResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isMaterialCountsEnough=");
        sb.append(this.isMaterialCountsEnough);
        sb.append(", hasGotResults=");
        sb.append(this.hasGotResults);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
