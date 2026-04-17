package d5;

import java.util.ArrayList;

/* renamed from: d5.a  reason: case insensitive filesystem */
public class C0468a {
    private int adminRequestsNumber = 0;
    private int currentOpenedServer = 1;
    private String deviceId;
    private String email;
    private String firebaseId;
    private boolean hasAdminRequestNotReviewed = false;
    private String id;
    private String invitedBy = "not_invited_by_any_players";
    private ArrayList<String> invitedPlayers = new ArrayList<>();
    private boolean isAdmin = false;
    private boolean isBannedFromChangeProfilePic = false;
    private boolean isBannedFromChangeProfilePicFromSystem = false;
    private boolean isBannedFromChat = false;
    private boolean isBannedFromChatFromSystem = false;
    private boolean isBannedFromNews = false;
    private boolean isBannedFromNewsFromSystem = false;
    private boolean isBannedFromPrivateMessages = false;
    private boolean isBannedFromPrivateMessagesFromSystem = false;
    private boolean isBannedFromSystem = false;
    private boolean isBannedFromSystemBefore = false;
    private boolean isCanChangeEmail = true;
    private boolean isDisable = false;
    private boolean isEmailVerified = false;
    private boolean isGotFirstBuyGoldGifts = false;
    private boolean isGotVerifiedReward = false;
    private boolean isNeedReview = false;
    private boolean isTemporaryAdmin = false;
    private long joinTimeInMilli;
    private String userName;

    public int getAdminRequestsNumber() {
        return this.adminRequestsNumber;
    }

    public int getCurrentOpenedServer() {
        return this.currentOpenedServer;
    }

    public String getDeviceId() {
        return this.deviceId;
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

    public String getInvitedBy() {
        return this.invitedBy;
    }

    public ArrayList<String> getInvitedPlayers() {
        return this.invitedPlayers;
    }

    public long getJoinTimeInMilli() {
        return this.joinTimeInMilli;
    }

    public String getUserName() {
        return this.userName;
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }

    public boolean isBannedFromChangeProfilePic() {
        return this.isBannedFromChangeProfilePic;
    }

    public boolean isBannedFromChangeProfilePicFromSystem() {
        return this.isBannedFromChangeProfilePicFromSystem;
    }

    public boolean isBannedFromChat() {
        return this.isBannedFromChat;
    }

    public boolean isBannedFromChatFromSystem() {
        return this.isBannedFromChatFromSystem;
    }

    public boolean isBannedFromNews() {
        return this.isBannedFromNews;
    }

    public boolean isBannedFromNewsFromSystem() {
        return this.isBannedFromNewsFromSystem;
    }

    public boolean isBannedFromPrivateMessages() {
        return this.isBannedFromPrivateMessages;
    }

    public boolean isBannedFromPrivateMessagesFromSystem() {
        return this.isBannedFromPrivateMessagesFromSystem;
    }

    public boolean isBannedFromSystem() {
        return this.isBannedFromSystem;
    }

    public boolean isBannedFromSystemBefore() {
        return this.isBannedFromSystemBefore;
    }

    public boolean isCanChangeEmail() {
        return this.isCanChangeEmail;
    }

    public boolean isDisable() {
        return this.isDisable;
    }

    public boolean isEmailVerified() {
        return this.isEmailVerified;
    }

    public boolean isGotFirstBuyGoldGifts() {
        return this.isGotFirstBuyGoldGifts;
    }

    public boolean isGotVerifiedReward() {
        return this.isGotVerifiedReward;
    }

    public boolean isHasAdminRequestNotReviewed() {
        return this.hasAdminRequestNotReviewed;
    }

    public boolean isNeedReview() {
        return this.isNeedReview;
    }

    public boolean isTemporaryAdmin() {
        return this.isTemporaryAdmin;
    }

    public void setAdmin(boolean z3) {
        this.isAdmin = z3;
    }

    public void setAdminRequestsNumber(int i2) {
        this.adminRequestsNumber = i2;
    }

    public void setBannedFromChangeProfilePic(boolean z3) {
        this.isBannedFromChangeProfilePic = z3;
    }

    public void setBannedFromChangeProfilePicFromSystem(boolean z3) {
        this.isBannedFromChangeProfilePicFromSystem = z3;
    }

    public void setBannedFromChat(boolean z3) {
        this.isBannedFromChat = z3;
    }

    public void setBannedFromChatFromSystem(boolean z3) {
        this.isBannedFromChatFromSystem = z3;
    }

    public void setBannedFromNews(boolean z3) {
        this.isBannedFromNews = z3;
    }

    public void setBannedFromNewsFromSystem(boolean z3) {
        this.isBannedFromNewsFromSystem = z3;
    }

    public void setBannedFromPrivateMessages(boolean z3) {
        this.isBannedFromPrivateMessages = z3;
    }

    public void setBannedFromPrivateMessagesFromSystem(boolean z3) {
        this.isBannedFromPrivateMessagesFromSystem = z3;
    }

    public void setBannedFromSystem(boolean z3) {
        this.isBannedFromSystem = z3;
    }

    public void setBannedFromSystemBefore(boolean z3) {
        this.isBannedFromSystemBefore = z3;
    }

    public void setCanChangeEmail(boolean z3) {
        this.isCanChangeEmail = z3;
    }

    public void setCurrentOpenedServer(int i2) {
        this.currentOpenedServer = i2;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDisable(boolean z3) {
        this.isDisable = z3;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setEmailVerified(boolean z3) {
        this.isEmailVerified = z3;
    }

    public void setFirebaseId(String str) {
        this.firebaseId = str;
    }

    public void setGotFirstBuyGoldGifts(boolean z3) {
        this.isGotFirstBuyGoldGifts = z3;
    }

    public void setGotVerifiedReward(boolean z3) {
        this.isGotVerifiedReward = z3;
    }

    public void setHasAdminRequestNotReviewed(boolean z3) {
        this.hasAdminRequestNotReviewed = z3;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setInvitedBy(String str) {
        this.invitedBy = str;
    }

    public void setInvitedPlayers(ArrayList<String> arrayList) {
        this.invitedPlayers = arrayList;
    }

    public void setJoinTimeInMilli(long j6) {
        this.joinTimeInMilli = j6;
    }

    public void setNeedReview(boolean z3) {
        this.isNeedReview = z3;
    }

    public void setTemporaryAdmin(boolean z3) {
        this.isTemporaryAdmin = z3;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        return "AccountObjectFirebase{id='" + this.id + "', firebaseId='" + this.firebaseId + "', deviceId='" + this.deviceId + "', email='" + this.email + "', userName='" + this.userName + "', currentOpenedServer=" + this.currentOpenedServer + ", joinTimeInMilli=" + this.joinTimeInMilli + ", invitedBy='" + this.invitedBy + "', isCanChangeEmail=" + this.isCanChangeEmail + ", isEmailVerified=" + this.isEmailVerified + ", isGotVerifiedReward=" + this.isGotVerifiedReward + ", isAdmin=" + this.isAdmin + ", isTemporaryAdmin=" + this.isTemporaryAdmin + ", isNeedReview=" + this.isNeedReview + ", hasAdminRequestNotReviewed=" + this.hasAdminRequestNotReviewed + ", isDisable=" + this.isDisable + ", isBannedFromSystem=" + this.isBannedFromSystem + ", isBannedFromSystemBefore=" + this.isBannedFromSystemBefore + ", isGotFirstBuyGoldGifts=" + this.isGotFirstBuyGoldGifts + ", isBannedFromChat=" + this.isBannedFromChat + ", isBannedFromPrivateMessages=" + this.isBannedFromPrivateMessages + ", isBannedFromNews=" + this.isBannedFromNews + ", isBannedFromChangeProfilePic=" + this.isBannedFromChangeProfilePic + ", isBannedFromChatFromSystem=" + this.isBannedFromChatFromSystem + ", isBannedFromPrivateMessagesFromSystem=" + this.isBannedFromPrivateMessagesFromSystem + ", isBannedFromNewsFromSystem=" + this.isBannedFromNewsFromSystem + ", isBannedFromChangeProfilePicFromSystem=" + this.isBannedFromChangeProfilePicFromSystem + ", adminRequestsNumber=" + this.adminRequestsNumber + ", invitedPlayers=" + this.invitedPlayers + '}';
    }
}
