package d5;

import java.util.ArrayList;

public class i {
    private ArrayList<Integer> herbIdsList;
    private ArrayList<Integer> herbTypesList;
    private ArrayList<Long> herbUsingStartTimeList;

    public i() {
        this.herbTypesList = new ArrayList<>();
        this.herbIdsList = new ArrayList<>();
        this.herbUsingStartTimeList = new ArrayList<>();
    }

    public ArrayList<Integer> getHerbIdsList() {
        return this.herbIdsList;
    }

    public ArrayList<Integer> getHerbTypesList() {
        return this.herbTypesList;
    }

    public ArrayList<Long> getHerbUsingStartTimeList() {
        return this.herbUsingStartTimeList;
    }

    public void setHerbIdsList(ArrayList<Integer> arrayList) {
        this.herbIdsList = arrayList;
    }

    public void setHerbTypesList(ArrayList<Integer> arrayList) {
        this.herbTypesList = arrayList;
    }

    public void setHerbUsingStartTimeList(ArrayList<Long> arrayList) {
        this.herbUsingStartTimeList = arrayList;
    }

    public String toString() {
        return "HerbObjectFirebase{herbTypesList=" + this.herbTypesList + "herbIdsList=" + this.herbIdsList + ", herbUsingStartTimeList=" + this.herbUsingStartTimeList + '}';
    }

    public i(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2, ArrayList<Long> arrayList3) {
        this.herbTypesList = new ArrayList<>();
        this.herbIdsList = new ArrayList<>();
        new ArrayList();
        this.herbTypesList = arrayList;
        this.herbIdsList = arrayList2;
        this.herbUsingStartTimeList = arrayList3;
    }
}
