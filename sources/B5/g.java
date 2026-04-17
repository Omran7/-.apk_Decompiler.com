package b5;

public class g {
    private String classNameHackHappenIn;
    private long currentServerTime;
    private long differenceValueBetweenGameAndServer;
    private String hackMessage;
    private String hackSubType;
    private String hackType;
    private String playerId;
    private int serverNumber;

    public g() {
    }

    public String getClassNameHackHappenIn() {
        return this.classNameHackHappenIn;
    }

    public long getCurrentServerTime() {
        return this.currentServerTime;
    }

    public long getDifferenceValueBetweenGameAndServer() {
        return this.differenceValueBetweenGameAndServer;
    }

    public String getHackMessage() {
        return this.hackMessage;
    }

    public String getHackSubType() {
        return this.hackSubType;
    }

    public String getHackType() {
        return this.hackType;
    }

    public String getPlayerId() {
        return this.playerId;
    }

    public int getServerNumber() {
        return this.serverNumber;
    }

    public void setClassNameHackHappenIn(String str) {
        this.classNameHackHappenIn = str;
    }

    public void setCurrentServerTime(long j6) {
        this.currentServerTime = j6;
    }

    public void setDifferenceValueBetweenGameAndServer(long j6) {
        this.differenceValueBetweenGameAndServer = j6;
    }

    public void setHackMessage(String str) {
        this.hackMessage = str;
    }

    public void setHackSubType(String str) {
        this.hackSubType = str;
    }

    public void setHackType(String str) {
        this.hackType = str;
    }

    public void setPlayerId(String str) {
        this.playerId = str;
    }

    public void setServerNumber(int i2) {
        this.serverNumber = i2;
    }

    public g(String str, int i2, String str2, long j6, String str3) {
        this.playerId = str;
        this.serverNumber = i2;
        this.hackType = str2;
        this.currentServerTime = j6;
        this.hackMessage = str3;
    }
}
