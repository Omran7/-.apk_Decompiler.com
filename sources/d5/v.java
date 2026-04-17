package d5;

import i3.n;
import java.util.Map;

public class v {
    private Object jobGotSalaryTimeInMilli;
    private Object jobStartTimeInMilli;
    private int jobType = -1;
    private int workType = -1;

    public v() {
        Map map = n.f8294a;
        this.jobGotSalaryTimeInMilli = map;
        this.jobStartTimeInMilli = map;
    }

    public Object getJobGotSalaryTimeInMilli() {
        return this.jobGotSalaryTimeInMilli;
    }

    public Object getJobStartTimeInMilli() {
        return this.jobStartTimeInMilli;
    }

    public int getJobType() {
        return this.jobType;
    }

    public int getWorkType() {
        return this.workType;
    }

    public void setJobGotSalaryTimeInMilli(Object obj) {
        this.jobGotSalaryTimeInMilli = obj;
    }

    public void setJobStartTimeInMilli(Object obj) {
        this.jobStartTimeInMilli = obj;
    }

    public void setJobType(int i2) {
        this.jobType = i2;
    }

    public void setWorkType(int i2) {
        this.workType = i2;
    }

    public String toString() {
        return "WorkObjectFirebase{workType=" + this.workType + ", jobType=" + this.jobType + ", jobGotSalaryTimeInMill=" + this.jobGotSalaryTimeInMilli + ", jobStartTimeInMill=" + this.jobStartTimeInMilli + '}';
    }

    public v(int i2, int i5) {
        Map map = n.f8294a;
        this.jobGotSalaryTimeInMilli = map;
        this.jobStartTimeInMilli = map;
        this.workType = i2;
        this.jobType = i5;
    }
}
