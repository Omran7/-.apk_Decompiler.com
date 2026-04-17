package b5;

import i3.n;

public class k {
    private int count;
    private int idInteger;
    private String idString;
    private int level;
    private long money;
    private String name;
    private int type;
    private Object unixTimeInMilli = n.f8294a;

    public k() {
    }

    public int getCount() {
        return this.count;
    }

    public int getIdInteger() {
        return this.idInteger;
    }

    public String getIdString() {
        return this.idString;
    }

    public int getLevel() {
        return this.level;
    }

    public long getMoney() {
        return this.money;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public Object getUnixTimeInMilli() {
        return this.unixTimeInMilli;
    }

    public void setCount(int i2) {
        this.count = i2;
    }

    public void setIdInteger(int i2) {
        this.idInteger = i2;
    }

    public void setIdString(String str) {
        this.idString = str;
    }

    public void setLevel(int i2) {
        this.level = i2;
    }

    public void setMoney(long j6) {
        this.money = j6;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(int i2) {
        this.type = i2;
    }

    public void setUnixTimeInMilli(Object obj) {
        this.unixTimeInMilli = obj;
    }

    public k(int i2, String str) {
        this.type = i2;
        this.name = str;
    }

    public k(int i2, long j6) {
        this.type = i2;
        this.money = j6;
    }

    public k(int i2, int i5, int i6) {
        this.idInteger = i5;
        this.type = i2;
        this.level = i6;
    }

    public k(int i2, String str, long j6) {
        this.type = i2;
        this.name = str;
        this.money = j6;
    }

    public k(int i2, String str, String str2) {
        this.type = i2;
        this.idString = str;
        this.name = str2;
    }

    public k(int i2, String str, String str2, long j6) {
        this.type = i2;
        this.idString = str;
        this.name = str2;
        this.money = j6;
    }

    public k(int i2, int i5, String str, String str2, long j6, int i6) {
        this.type = i2;
        this.idString = str;
        this.name = str2;
        this.idInteger = i5;
        this.money = j6;
        this.count = i6;
    }

    public k(int i2, String str, String str2, int i5, int i6, int i7) {
        this.type = i2;
        this.idString = str;
        this.name = str2;
        this.idInteger = i5;
        this.level = i6;
        this.count = i7;
    }
}
