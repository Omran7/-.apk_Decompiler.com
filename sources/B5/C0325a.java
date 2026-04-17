package b5;

/* renamed from: b5.a  reason: case insensitive filesystem */
public class C0325a {
    private int activityId;
    private long endTimeInMilli;
    private int nameResourceId;
    private long startTimeInMilli;
    private int state;

    public int getActivityId() {
        return this.activityId;
    }

    public long getEndTimeInMilli() {
        return this.endTimeInMilli;
    }

    public int getNameResourceId() {
        return this.nameResourceId;
    }

    public long getStartTimeInMilli() {
        return this.startTimeInMilli;
    }

    public int getState() {
        return this.state;
    }

    public void setActivityId(int i2) {
        this.activityId = i2;
    }

    public void setEndTimeInMilli(long j6) {
        this.endTimeInMilli = j6;
    }

    public void setNameResourceId(int i2) {
        this.nameResourceId = i2;
    }

    public void setStartTimeInMilli(long j6) {
        this.startTimeInMilli = j6;
    }

    public void setState(int i2) {
        this.state = i2;
    }

    public String toString() {
        return "ActivityObjectFirebase{activityId=" + this.activityId + ", nameResourceId=" + this.nameResourceId + ", state=" + this.state + ", startTimeInMilli=" + this.startTimeInMilli + ", endTimeInMilli=" + this.endTimeInMilli + '}';
    }
}
