package d5;

public class j {
    private int currentCity = 0;
    private int currentPlace = 0;
    private boolean isNeedFreeBag = false;
    private long placeEndTimeInMilli = -1;
    private String reason = "place_not_need_reason";
    private String sortByCityPlaceLastSeen;
    private String sortByCityPlaceLevelLastSeen;

    public int getCurrentCity() {
        return this.currentCity;
    }

    public int getCurrentPlace() {
        return this.currentPlace;
    }

    public long getPlaceEndTimeInMilli() {
        return this.placeEndTimeInMilli;
    }

    public String getReason() {
        return this.reason;
    }

    public String getSortByCityPlaceLastSeen() {
        return this.sortByCityPlaceLastSeen;
    }

    public String getSortByCityPlaceLevelLastSeen() {
        return this.sortByCityPlaceLevelLastSeen;
    }

    public boolean isNeedFreeBag() {
        return this.isNeedFreeBag;
    }

    public void setCurrentCity(int i2) {
        this.currentCity = i2;
    }

    public void setCurrentPlace(int i2) {
        this.currentPlace = i2;
    }

    public void setNeedFreeBag(boolean z3) {
        this.isNeedFreeBag = z3;
    }

    public void setPlaceEndTimeInMilli(long j6) {
        this.placeEndTimeInMilli = j6;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setSortByCityPlaceLastSeen(String str) {
        this.sortByCityPlaceLastSeen = str;
    }

    public void setSortByCityPlaceLevelLastSeen(String str) {
        this.sortByCityPlaceLevelLastSeen = str;
    }

    public String toString() {
        return "LocationObjectFirebase{currentCity=" + this.currentCity + ", currentPlace=" + this.currentPlace + ", placeEndTimeInMilli=" + this.placeEndTimeInMilli + ", reason='" + this.reason + "', sortByCityPlaceLevelLastSeen='" + this.sortByCityPlaceLevelLastSeen + "', sortByCityPlaceLastSeen='" + this.sortByCityPlaceLastSeen + "', isNeedFreeBag=" + this.isNeedFreeBag + '}';
    }
}
