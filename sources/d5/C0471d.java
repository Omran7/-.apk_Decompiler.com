package d5;

import java.util.HashMap;
import java.util.Map;

/* renamed from: d5.d  reason: case insensitive filesystem */
public class C0471d {
    private Map<String, String> blockedMap = new HashMap();
    private Map<String, String> friendsMap = new HashMap();
    private Map<String, String> othersBlockedMap = new HashMap();
    private Map<String, Integer> requestsMap = new HashMap();

    public Map<String, String> getBlockedMap() {
        return this.blockedMap;
    }

    public Map<String, String> getFriendsMap() {
        return this.friendsMap;
    }

    public Map<String, String> getOthersBlockedMap() {
        return this.othersBlockedMap;
    }

    public Map<String, Integer> getRequestsMap() {
        return this.requestsMap;
    }

    public void setBlockedMap(Map<String, String> map) {
        this.blockedMap = map;
    }

    public void setFriendsMap(Map<String, String> map) {
        this.friendsMap = map;
    }

    public void setOthersBlockedMap(Map<String, String> map) {
        this.othersBlockedMap = map;
    }

    public void setRequestsMap(Map<String, Integer> map) {
        this.requestsMap = map;
    }

    public String toString() {
        return "ContactsObjectFirebase{friendsMap=" + this.friendsMap + ", blockedMap=" + this.blockedMap + ", othersBlockedMap=" + this.othersBlockedMap + ", requestsMap=" + this.requestsMap + '}';
    }
}
