package b5;

import i3.n;

public class b {
    private String content;
    private String playerId;
    private Object unixTimeInMilli = n.f8294a;

    public b() {
    }

    public String getContent() {
        return this.content;
    }

    public String getPlayerId() {
        return this.playerId;
    }

    public Object getUnixTimeInMilli() {
        return this.unixTimeInMilli;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setPlayerId(String str) {
        this.playerId = str;
    }

    public void setUnixTimeInMilli(Object obj) {
        this.unixTimeInMilli = obj;
    }

    public String toString() {
        return "AdPlayerObjectFirebase{playerId='" + this.playerId + "', content='" + this.content + "', unixTimeInMilli=" + this.unixTimeInMilli + '}';
    }

    public b(String str, String str2) {
        this.playerId = str;
        this.content = str2;
    }
}
