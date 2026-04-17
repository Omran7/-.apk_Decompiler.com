package d5;

import i3.n;
import java.util.ArrayList;
import java.util.Arrays;

public class q {
    private ArrayList<Integer> gymLessons = new ArrayList<>(Arrays.asList(new Integer[]{null, null, null, null, null, null, null, null, 0}));
    private ArrayList<Integer> historyLessons = new ArrayList<>(Arrays.asList(new Integer[]{0, 0, 0, 0, 0}));
    private boolean isStudying = false;
    private ArrayList<Integer> lawLessons = new ArrayList<>(Arrays.asList(new Integer[]{null, null, null, null, null, null, null}));
    private ArrayList<Integer> militaryLessons = new ArrayList<>(Arrays.asList(new Integer[]{null, null, null, null, null, null, null}));
    private ArrayList<Integer> scienceLessons = new ArrayList<>(Arrays.asList(new Integer[]{null, null, null, null, null, null, null}));
    private Object startStudyingTimeInMilli = n.f8294a;

    public ArrayList<Integer> getGymLessons() {
        return this.gymLessons;
    }

    public ArrayList<Integer> getHistoryLessons() {
        return this.historyLessons;
    }

    public ArrayList<Integer> getLawLessons() {
        return this.lawLessons;
    }

    public ArrayList<Integer> getMilitaryLessons() {
        return this.militaryLessons;
    }

    public ArrayList<Integer> getScienceLessons() {
        return this.scienceLessons;
    }

    public Object getStartStudyingTimeInMilli() {
        return this.startStudyingTimeInMilli;
    }

    public boolean isStudying() {
        return this.isStudying;
    }

    public void setGymLessons(ArrayList<Integer> arrayList) {
        this.gymLessons = arrayList;
    }

    public void setHistoryLessons(ArrayList<Integer> arrayList) {
        this.historyLessons = arrayList;
    }

    public void setLawLessons(ArrayList<Integer> arrayList) {
        this.lawLessons = arrayList;
    }

    public void setMilitaryLessons(ArrayList<Integer> arrayList) {
        this.militaryLessons = arrayList;
    }

    public void setScienceLessons(ArrayList<Integer> arrayList) {
        this.scienceLessons = arrayList;
    }

    public void setStartStudyingTimeInMilli(Object obj) {
        this.startStudyingTimeInMilli = obj;
    }

    public void setStudying(boolean z3) {
        this.isStudying = z3;
    }
}
