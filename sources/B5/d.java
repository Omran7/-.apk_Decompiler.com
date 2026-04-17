package b5;

public class d {
    private int adminRequestsNumber;
    private String email;
    private String firebaseId;
    private String id;
    private boolean isVerified = true;
    private int level;
    private int playerAge;
    private String reason;
    private int serverAge;
    private int serverNumber;
    private long unixTime;

    public int getAdminRequestsNumber() {
        return this.adminRequestsNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFirebaseId() {
        return this.firebaseId;
    }

    public String getId() {
        return this.id;
    }

    public int getLevel() {
        return this.level;
    }

    public int getPlayerAge() {
        return this.playerAge;
    }

    public String getReason() {
        return this.reason;
    }

    public int getServerAge() {
        return this.serverAge;
    }

    public int getServerNumber() {
        return this.serverNumber;
    }

    public long getUnixTime() {
        return this.unixTime;
    }

    public boolean isVerified() {
        return this.isVerified;
    }

    public void setAdminRequestsNumber(int i2) {
        this.adminRequestsNumber = i2;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setFirebaseId(String str) {
        this.firebaseId = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLevel(int i2) {
        this.level = i2;
    }

    public void setPlayerAge(int i2) {
        this.playerAge = i2;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setServerAge(int i2) {
        this.serverAge = i2;
    }

    public void setServerNumber(int i2) {
        this.serverNumber = i2;
    }

    public void setUnixTime(long j6) {
        this.unixTime = j6;
    }

    public void setVerified(boolean z3) {
        this.isVerified = z3;
    }
}
