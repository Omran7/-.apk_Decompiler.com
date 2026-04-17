package a5;

import h0.C0552a;

/* renamed from: a5.b  reason: case insensitive filesystem */
public class C0265b {
    public int currentPlace = -1;
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isMainStatesChanged = true;
    public boolean isMaterialCountChanged = true;
    public boolean isMoneyChanged = true;
    public long moneyUsed = -1;
    public long placeEndTimeInMilli = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdateLocationPlaceTimeResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isMaterialCountChanged=");
        sb.append(this.isMaterialCountChanged);
        sb.append(", isMoneyChanged=");
        sb.append(this.isMoneyChanged);
        sb.append(", isMainStatesChanged=");
        sb.append(this.isMainStatesChanged);
        sb.append(", currentPlace=");
        sb.append(this.currentPlace);
        sb.append(", placeEndTimeInMilli=");
        sb.append(this.placeEndTimeInMilli);
        sb.append(", moneyUsed=");
        sb.append(this.moneyUsed);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
