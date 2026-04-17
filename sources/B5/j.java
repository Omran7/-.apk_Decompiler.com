package b5;

import i3.n;

public class j {
    private String content;
    private boolean isFromAdmin = false;
    private boolean isFromAdminOrTemporaryAdmin = false;
    private boolean isFromSystem = false;
    private String playerId;
    private Object unixTimeInMilli = n.f8294a;

    public j() {
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

    public boolean isFromAdmin() {
        if (this.isFromAdmin || this.isFromAdminOrTemporaryAdmin) {
            return true;
        }
        return false;
    }

    public boolean isFromAdminOrTemporaryAdmin() {
        return this.isFromAdminOrTemporaryAdmin;
    }

    public boolean isFromSystem() {
        return this.isFromSystem;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setFromAdmin(boolean z3) {
        this.isFromAdmin = z3;
    }

    public void setFromAdminOrTemporaryAdmin(boolean z3) {
        this.isFromAdminOrTemporaryAdmin = z3;
    }

    public void setFromSystem(boolean z3) {
        this.isFromSystem = z3;
    }

    public void setPlayerId(String str) {
        this.playerId = str;
    }

    public void setUnixTimeInMilli(Object obj) {
        this.unixTimeInMilli = obj;
    }

    public String toString() {
        return "MessageObjectFirebase{playerId='" + this.playerId + "', content='" + this.content + "', isFromSystem=" + this.isFromSystem + ", isFromAdmin=" + this.isFromAdmin + ", unixTimeInMilli=" + this.unixTimeInMilli + '}';
    }

    public j(String str, String str2, boolean z3, boolean z4) {
        this.playerId = str;
        this.content = str2;
        this.isFromSystem = z3;
        this.isFromAdmin = z4;
    }
}
