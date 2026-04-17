package d5;

import K1.e;
import i3.C0591g;
import java.util.HashMap;
import java.util.Map;

public class r {
    private int defenseCards = 0;
    private int dexterityCards = 0;
    private Map<String, Integer> gangSkills = new HashMap();
    private int meritsFromChecksOrItems = 10;
    private int meritsFromMedals = 0;
    private Map<String, Integer> meritsSkills = new HashMap();
    private int speedCards = 0;
    private int strengthCards = 0;

    public int getDefenseCards() {
        return this.defenseCards;
    }

    public int getDexterityCards() {
        return this.dexterityCards;
    }

    public Map<String, Integer> getGangSkills() {
        return this.gangSkills;
    }

    @C0591g
    public int getMeritSkillLevel(int i2) {
        Integer orDefault;
        Map<String, Integer> map = this.meritsSkills;
        if (map == null || (orDefault = map.getOrDefault(e.w(i2), 0)) == null) {
            return 0;
        }
        return orDefault.intValue();
    }

    public int getMeritsFromChecksOrItems() {
        return this.meritsFromChecksOrItems;
    }

    public int getMeritsFromMedals() {
        return this.meritsFromMedals;
    }

    public Map<String, Integer> getMeritsSkills() {
        return this.meritsSkills;
    }

    public int getSpeedCards() {
        return this.speedCards;
    }

    public int getStrengthCards() {
        return this.strengthCards;
    }

    public void setDefenseCards(int i2) {
        this.defenseCards = i2;
    }

    public void setDexterityCards(int i2) {
        this.dexterityCards = i2;
    }

    public void setGangSkills(Map<String, Integer> map) {
        this.gangSkills = map;
    }

    public void setMeritsFromChecksOrItems(int i2) {
        this.meritsFromChecksOrItems = i2;
    }

    public void setMeritsFromMedals(int i2) {
        this.meritsFromMedals = i2;
    }

    public void setMeritsSkills(Map<String, Integer> map) {
        this.meritsSkills = map;
    }

    public void setSpeedCards(int i2) {
        this.speedCards = i2;
    }

    public void setStrengthCards(int i2) {
        this.strengthCards = i2;
    }
}
