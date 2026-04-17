package b5;

public class i {
    private long amount;
    private int id;
    private int level;
    private long updatedTimeInMilli;

    public i() {
    }

    public long getAmount() {
        return this.amount;
    }

    public int getId() {
        return this.id;
    }

    public int getLevel() {
        return this.level;
    }

    public long getUpdatedTimeInMilli() {
        return this.updatedTimeInMilli;
    }

    public void setAmount(long j6) {
        this.amount = j6;
    }

    public void setId(int i2) {
        this.id = i2;
    }

    public void setLevel(int i2) {
        this.level = i2;
    }

    public void setUpdatedTimeInMilli(long j6) {
        this.updatedTimeInMilli = j6;
    }

    public String toString() {
        return "MedalDetailsObjectFirebase{id=" + this.id + ", level=" + this.level + ", amount=" + this.amount + ", updatedTimeInMilli=" + this.updatedTimeInMilli + '}';
    }

    public i(int i2) {
        this.id = i2;
    }

    public i(int i2, int i5) {
        this.id = i2;
        this.level = i5;
    }
}
