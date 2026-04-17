package b5;

import java.util.ArrayList;

public class n {
    private long cost = 0;
    private int count = 0;
    private int countInBag = 0;
    private int id;
    private boolean isLocked = false;
    private boolean isUsedInArming = false;
    private boolean isUsedInMuseum = false;
    private int level = 0;
    private ArrayList<Integer> museumPositions = new ArrayList<>();
    private int type;

    public n() {
    }

    public long getCost() {
        return this.cost;
    }

    public int getCount() {
        return this.count;
    }

    public int getCountInBag() {
        return this.countInBag;
    }

    public int getId() {
        return this.id;
    }

    public int getLevel() {
        return this.level;
    }

    public ArrayList<Integer> getMuseumPositions() {
        return this.museumPositions;
    }

    public int getType() {
        return this.type;
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    public boolean isUsedInArming() {
        return this.isUsedInArming;
    }

    public boolean isUsedInMuseum() {
        return this.isUsedInMuseum;
    }

    public void setCost(long j6) {
        this.cost = j6;
    }

    public void setCount(int i2) {
        this.count = i2;
    }

    public void setCountInBag(int i2) {
        this.countInBag = i2;
    }

    public void setId(int i2) {
        this.id = i2;
    }

    public void setLevel(int i2) {
        this.level = i2;
    }

    public void setLocked(boolean z3) {
        this.isLocked = z3;
    }

    public void setMuseumPositions(ArrayList<Integer> arrayList) {
        this.museumPositions = arrayList;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public void setUsedInArming(boolean z3) {
        this.isUsedInArming = z3;
    }

    public void setUsedInMuseum(boolean z3) {
        this.isUsedInMuseum = z3;
    }

    public String toString() {
        return "StockItemObjectFirebase{id=" + this.id + ", type=" + this.type + ", count=" + this.count + ", countInBag=" + this.countInBag + ", level=" + this.level + ", cost=" + this.cost + ", isLocked=" + this.isLocked + ", isUsedInArming=" + this.isUsedInArming + ", isUsedInMuseum=" + this.isUsedInMuseum + ", museumPositions=" + this.museumPositions + '}';
    }

    public n(int i2, int i5) {
        this.id = i2;
        this.type = i5;
    }

    public n(int i2, int i5, int i6) {
        this.id = i2;
        this.type = i5;
        this.count = i6;
    }

    public n(int i2, int i5, int i6, int i7) {
        this.id = i2;
        this.type = i5;
        this.level = i6;
        this.count = i7;
    }

    public n(int i2, int i5, int i6, boolean z3) {
        this.id = i2;
        this.type = i5;
        this.count = i6;
        this.isLocked = z3;
    }

    public n(int i2, int i5, boolean z3, int i6) {
        this.id = i2;
        this.type = i5;
        this.isLocked = z3;
        this.level = i6;
    }

    public n(int i2, int i5, int i6, boolean z3, int i7) {
        this.id = i2;
        this.type = i5;
        this.count = i6;
        this.isLocked = z3;
        this.level = i7;
    }
}
