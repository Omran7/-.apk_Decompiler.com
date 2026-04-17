package d5;

public class n {
    private boolean hasUnCollectedPrize = true;
    private boolean hasUnReadNotification = false;
    private boolean hasUnReadPrivateMessage = false;
    private boolean hasUnReadSupportMessage = false;
    private boolean hasUnSeenContactRequest = false;
    private boolean hasUnSeenMedal = false;

    public boolean isHasUnCollectedPrize() {
        return this.hasUnCollectedPrize;
    }

    public boolean isHasUnReadNotification() {
        return this.hasUnReadNotification;
    }

    public boolean isHasUnReadPrivateMessage() {
        return this.hasUnReadPrivateMessage;
    }

    public boolean isHasUnReadSupportMessage() {
        return this.hasUnReadSupportMessage;
    }

    public boolean isHasUnSeenContactRequest() {
        return this.hasUnSeenContactRequest;
    }

    public boolean isHasUnSeenMedal() {
        return this.hasUnSeenMedal;
    }

    public void setHasUnCollectedPrize(boolean z3) {
        this.hasUnCollectedPrize = z3;
    }

    public void setHasUnReadNotification(boolean z3) {
        this.hasUnReadNotification = z3;
    }

    public void setHasUnReadPrivateMessage(boolean z3) {
        this.hasUnReadPrivateMessage = z3;
    }

    public void setHasUnReadSupportMessage(boolean z3) {
        this.hasUnReadSupportMessage = z3;
    }

    public void setHasUnSeenContactRequest(boolean z3) {
        this.hasUnSeenContactRequest = z3;
    }

    public void setHasUnSeenMedal(boolean z3) {
        this.hasUnSeenMedal = z3;
    }
}
