package b5;

import i3.n;

public class l {
    private boolean isRead = false;
    private Object lastMessageTimeInMilli = n.f8294a;
    private String playerId;
    private String playerName;

    public l() {
    }

    public Object getLastMessageTimeInMilli() {
        return this.lastMessageTimeInMilli;
    }

    public String getPlayerId() {
        return this.playerId;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public boolean isRead() {
        return this.isRead;
    }

    public void setLastMessageTimeInMilli(Object obj) {
        this.lastMessageTimeInMilli = obj;
    }

    public void setPlayerId(String str) {
        this.playerId = str;
    }

    public void setPlayerName(String str) {
        this.playerName = str;
    }

    public void setRead(boolean z3) {
        this.isRead = z3;
    }

    public String toString() {
        return "PrivateChatObjectFirebase{playerId='" + this.playerId + "', playerName='" + this.playerName + "', isRead=" + this.isRead + ", lastMessageTimeInMilli=" + this.lastMessageTimeInMilli + '}';
    }

    public void updateObjectData(l lVar) {
        this.playerId = lVar.getPlayerId();
        this.playerName = lVar.getPlayerName();
        this.isRead = lVar.isRead();
        this.lastMessageTimeInMilli = lVar.getLastMessageTimeInMilli();
    }

    public l(String str, String str2) {
        this.playerId = str;
        this.playerName = str2;
    }

    public l(String str, String str2, boolean z3) {
        this.playerId = str;
        this.playerName = str2;
        this.isRead = z3;
    }
}
