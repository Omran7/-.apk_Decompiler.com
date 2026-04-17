package b5;

import i3.C0591g;
import i3.n;
import java.util.HashMap;
import java.util.Map;

public class f {
    private long availableRespect = 0;
    private long cash = 0;
    private long contribution = 0;
    private Object createdTimeInMilli = n.f8294a;
    private long gold = 0;
    private String id;
    private String imageUrl = "no_gang_pic";
    private int level = 1;
    private long loyalty = 0;
    private Map<String, Integer> membersWithPositions = new HashMap();
    private String name;
    private long respect = 0;
    private Map<String, Integer> skillsLevel = new HashMap();
    private String tag;
    private int topChain = 0;

    public long getAvailableRespect() {
        return this.availableRespect;
    }

    public long getCash() {
        return this.cash;
    }

    public long getContribution() {
        return this.contribution;
    }

    public Object getCreatedTimeInMilli() {
        return this.createdTimeInMilli;
    }

    @C0591g
    public long getCreatedTimeInMilliAsLongValue() {
        if (this.createdTimeInMilli.equals(n.f8294a)) {
            return 0;
        }
        return ((Long) this.createdTimeInMilli).longValue();
    }

    public long getGold() {
        return this.gold;
    }

    public String getId() {
        return this.id;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getLevel() {
        return this.level;
    }

    public long getLoyalty() {
        return this.loyalty;
    }

    public Map<String, Integer> getMembersWithPositions() {
        return this.membersWithPositions;
    }

    public String getName() {
        return this.name;
    }

    public long getRespect() {
        return this.respect;
    }

    public Map<String, Integer> getSkillsLevel() {
        return this.skillsLevel;
    }

    public String getTag() {
        return this.tag;
    }

    public int getTopChain() {
        return this.topChain;
    }

    public void setAvailableRespect(long j6) {
        this.availableRespect = j6;
    }

    public void setCash(long j6) {
        this.cash = j6;
    }

    public void setContribution(long j6) {
        this.contribution = j6;
    }

    public void setCreatedTimeInMilli(Object obj) {
        this.createdTimeInMilli = obj;
    }

    public void setGold(long j6) {
        this.gold = j6;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setLevel(int i2) {
        this.level = i2;
    }

    public void setLoyalty(long j6) {
        this.loyalty = j6;
    }

    public void setMembersWithPositions(Map<String, Integer> map) {
        this.membersWithPositions = map;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRespect(long j6) {
        this.respect = j6;
    }

    public void setSkillsLevel(Map<String, Integer> map) {
        this.skillsLevel = map;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTopChain(int i2) {
        this.topChain = i2;
    }

    public String toString() {
        return "GangInfoObjectFirebase{id='" + this.id + "', name='" + this.name + "', tag='" + this.tag + "', imageUrl='" + this.imageUrl + "', level=" + this.level + ", topChain=" + this.topChain + ", gold=" + this.gold + ", cash=" + this.cash + ", respect=" + this.respect + ", availableRespect=" + this.availableRespect + ", loyalty=" + this.loyalty + ", contribution=" + this.contribution + ", membersWithPositions=" + this.membersWithPositions + ", skillsLevel=" + this.skillsLevel + ", createdTimeInMilli=" + this.createdTimeInMilli + '}';
    }
}
