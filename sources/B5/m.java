package b5;

import h0.C0552a;

public class m {
    private int cellNumber;
    private long cost;
    private int count;
    private String gangMarketId;
    private int id;
    private int level;
    private String playerId;
    private int type;

    public m() {
        this.level = 0;
    }

    public int getCellNumber() {
        return this.cellNumber;
    }

    public long getCost() {
        return this.cost;
    }

    public int getCount() {
        return this.count;
    }

    public String getGangMarketId() {
        return this.gangMarketId;
    }

    public int getId() {
        return this.id;
    }

    public int getLevel() {
        return this.level;
    }

    public String getPlayerId() {
        return this.playerId;
    }

    public int getType() {
        return this.type;
    }

    public void setCellNumber(int i2) {
        this.cellNumber = i2;
    }

    public void setCost(long j6) {
        this.cost = j6;
    }

    public void setCount(int i2) {
        this.count = i2;
    }

    public void setGangMarketId(String str) {
        this.gangMarketId = str;
    }

    public void setId(int i2) {
        this.id = i2;
    }

    public void setLevel(int i2) {
        this.level = i2;
    }

    public void setPlayerId(String str) {
        this.playerId = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StallObjectFirebase{id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", cost=");
        sb.append(this.cost);
        sb.append(", playerId='");
        return C0552a.r(sb, this.playerId, "'}");
    }

    public m(int i2, int i5, int i6, int i7, long j6) {
        this.id = i2;
        this.type = i5;
        this.level = i6;
        this.count = i7;
        this.cost = j6;
    }

    public m(String str, String str2, int i2, int i5, int i6, int i7, int i8, long j6) {
        this.playerId = str;
        this.gangMarketId = str2;
        this.cellNumber = i2;
        this.id = i5;
        this.type = i6;
        this.level = i7;
        this.count = i8;
        this.cost = j6;
    }
}
