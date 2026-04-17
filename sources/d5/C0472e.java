package d5;

/* renamed from: d5.e  reason: case insensitive filesystem */
public class C0472e {
    private double lastOpenedCrimeExecutionNumber = 3.0d;
    private int lastOpenedCrimeItem = 1;
    private int lastOpenedCrimeType = 0;

    public double getLastOpenedCrimeExecutionNumber() {
        return this.lastOpenedCrimeExecutionNumber;
    }

    public int getLastOpenedCrimeItem() {
        return this.lastOpenedCrimeItem;
    }

    public int getLastOpenedCrimeType() {
        return this.lastOpenedCrimeType;
    }

    public void setLastOpenedCrimeExecutionNumber(double d) {
        this.lastOpenedCrimeExecutionNumber = d;
    }

    public void setLastOpenedCrimeItem(int i2) {
        this.lastOpenedCrimeItem = i2;
    }

    public void setLastOpenedCrimeType(int i2) {
        this.lastOpenedCrimeType = i2;
    }

    public String toString() {
        return "CrimeObjectFirebase{lastOpenedCrimeType=" + this.lastOpenedCrimeType + ", lastOpenedCrimeItem=" + this.lastOpenedCrimeItem + ", lastOpenedCrimeExecutionNumber=" + this.lastOpenedCrimeExecutionNumber + '}';
    }
}
