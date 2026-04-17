package d5;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: d5.h  reason: case insensitive filesystem */
public class C0475h {
    private double defense = 10.0d;
    private double dexterity = 10.0d;
    private ArrayList<Boolean> gymLessonsOpenedStatesList;
    private ArrayList<Integer> gymLessonsProgressList = new ArrayList<>(Arrays.asList(new Integer[]{0, 0, 0, 0, 0}));
    private int selectedGymLesson = 0;
    private double speed = 10.0d;
    private double strength = 10.0d;

    public C0475h() {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        this.gymLessonsOpenedStatesList = new ArrayList<>(Arrays.asList(new Boolean[]{bool, bool2, bool2, bool2, bool2, bool2}));
    }

    public double getDefense() {
        return this.defense;
    }

    public double getDexterity() {
        return this.dexterity;
    }

    public ArrayList<Boolean> getGymLessonsOpenedStatesList() {
        return this.gymLessonsOpenedStatesList;
    }

    public ArrayList<Integer> getGymLessonsProgressList() {
        return this.gymLessonsProgressList;
    }

    public int getSelectedGymLesson() {
        return this.selectedGymLesson;
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getStrength() {
        return this.strength;
    }

    public void setDefense(double d) {
        this.defense = d;
    }

    public void setDexterity(double d) {
        this.dexterity = d;
    }

    public void setGymLessonsOpenedStatesList(ArrayList<Boolean> arrayList) {
        this.gymLessonsOpenedStatesList = arrayList;
    }

    public void setGymLessonsProgressList(ArrayList<Integer> arrayList) {
        this.gymLessonsProgressList = arrayList;
    }

    public void setSelectedGymLesson(int i2) {
        this.selectedGymLesson = i2;
    }

    public void setSpeed(double d) {
        this.speed = d;
    }

    public void setStrength(double d) {
        this.strength = d;
    }

    public String toString() {
        return "GymObjectFirebase{strength=" + this.strength + ", defense=" + this.defense + ", speed=" + this.speed + ", dexterity=" + this.dexterity + ", selectedGymLesson=" + this.selectedGymLesson + ", gymLessonsProgressList=" + this.gymLessonsProgressList + ", gymLessonsOpenedStatesList=" + this.gymLessonsOpenedStatesList + '}';
    }

    public C0475h(double d, double d6, double d7, double d8) {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        this.gymLessonsOpenedStatesList = new ArrayList<>(Arrays.asList(new Boolean[]{bool, bool2, bool2, bool2, bool2, bool2}));
        this.strength = d;
        this.defense = d6;
        this.speed = d7;
        this.dexterity = d8;
    }
}
