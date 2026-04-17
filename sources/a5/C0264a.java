package a5;

import h0.C0552a;

/* renamed from: a5.a  reason: case insensitive filesystem */
public class C0264a {
    public int currentPlace = -1;
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public boolean isMaterialCountChanged = false;
    public long placeEndTimeInMilli = -1;

    public String toString() {
        StringBuilder sb = new StringBuilder("UpdateLocationPlaceTimeResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", isMaterialCountChanged=");
        sb.append(this.isMaterialCountChanged);
        sb.append(", currentPlace=");
        sb.append(this.currentPlace);
        sb.append(", placeEndTimeInMilli=");
        sb.append(this.placeEndTimeInMilli);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
