package b5;

import i3.n;

public class h {
    private String itemName;
    private String playerId;
    private String playerName;
    private Object unixTimeInMilli = n.f8294a;

    public h() {
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getPlayerId() {
        return this.playerId;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public Object getUnixTimeInMilli() {
        return this.unixTimeInMilli;
    }

    public void setItemName(String str) {
        this.itemName = str;
    }

    public void setPlayerId(String str) {
        this.playerId = str;
    }

    public void setPlayerName(String str) {
        this.playerName = str;
    }

    public void setUnixTimeInMilli(Object obj) {
        this.unixTimeInMilli = obj;
    }

    public String toString() {
        return "LuckyWheelWinnerObjectFirebase{playerId='" + this.playerId + "', playerName='" + this.playerName + "', itemName='" + this.itemName + "', unixTimeInMilli=" + this.unixTimeInMilli + '}';
    }

    public h(String str, String str2, String str3) {
        this.playerId = str;
        this.playerName = str2;
        this.itemName = str3;
    }
}
