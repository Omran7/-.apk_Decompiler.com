package d5;

import com.bumptech.glide.c;
import i3.C0591g;

public class k {
    private String bio = "بدون بايو !";
    private Object courageChangeTimeInMilli = -101L;
    private int courageCurrent = 20;
    private long courageDoubleEffectEndTime = -1;
    private int gender = 0;
    private Object healthChangeTimeInMilli = -101L;
    private long healthCurrent = 110;
    private long healthDoubleEffectEndTime = -1;
    private long lastSeen = -111;
    private int level = 1;
    private long levelCurrentExperience = 0;
    private String nickName = "";
    private Object nobilityChangeTimeInMilli = -101L;
    private int nobilityCurrent = 100;
    private Object powerChangeTimeInMilli = -101L;
    private int powerCurrent = 100;
    private String profilePicUrl = "no_profile_pic";
    private long vipEndTime = -1;

    public k() {
    }

    public String getBio() {
        return this.bio;
    }

    public Object getCourageChangeTimeInMilli() {
        return this.courageChangeTimeInMilli;
    }

    @C0591g
    public long getCourageChangeTimeInSeconds() {
        return c.W(this.courageChangeTimeInMilli);
    }

    public int getCourageCurrent() {
        return this.courageCurrent;
    }

    public long getCourageDoubleEffectEndTime() {
        return this.courageDoubleEffectEndTime;
    }

    public int getGender() {
        return this.gender;
    }

    public Object getHealthChangeTimeInMilli() {
        return this.healthChangeTimeInMilli;
    }

    @C0591g
    public long getHealthChangeTimeInSeconds() {
        return c.W(this.healthChangeTimeInMilli);
    }

    public long getHealthCurrent() {
        return this.healthCurrent;
    }

    public long getHealthDoubleEffectEndTime() {
        return this.healthDoubleEffectEndTime;
    }

    public long getLastSeen() {
        return this.lastSeen;
    }

    @C0591g
    public long getLastSeenInSeconds() {
        if (String.valueOf(this.lastSeen).length() > 10) {
            return this.lastSeen / 1000;
        }
        return this.lastSeen;
    }

    public int getLevel() {
        return this.level;
    }

    public long getLevelCurrentExperience() {
        return this.levelCurrentExperience;
    }

    public String getNickName() {
        return this.nickName;
    }

    public Object getNobilityChangeTimeInMilli() {
        return this.nobilityChangeTimeInMilli;
    }

    @C0591g
    public long getNobilityChangeTimeInSeconds() {
        return c.W(this.nobilityChangeTimeInMilli);
    }

    public int getNobilityCurrent() {
        return this.nobilityCurrent;
    }

    public Object getPowerChangeTimeInMilli() {
        return this.powerChangeTimeInMilli;
    }

    @C0591g
    public long getPowerChangeTimeInSeconds() {
        return c.W(this.powerChangeTimeInMilli);
    }

    public int getPowerCurrent() {
        return this.powerCurrent;
    }

    public String getProfilePicUrl() {
        return this.profilePicUrl;
    }

    public long getVipEndTime() {
        return this.vipEndTime;
    }

    public void setBio(String str) {
        this.bio = str;
    }

    public void setCourageChangeTimeInMilli(Object obj) {
        this.courageChangeTimeInMilli = obj;
    }

    public void setCourageCurrent(int i2) {
        this.courageCurrent = i2;
    }

    public void setCourageDoubleEffectEndTime(long j6) {
        this.courageDoubleEffectEndTime = j6;
    }

    public void setGender(int i2) {
        this.gender = i2;
    }

    public void setHealthChangeTimeInMilli(Object obj) {
        this.healthChangeTimeInMilli = obj;
    }

    public void setHealthCurrent(long j6) {
        this.healthCurrent = j6;
    }

    public void setHealthDoubleEffectEndTime(long j6) {
        this.healthDoubleEffectEndTime = j6;
    }

    public void setLastSeen(long j6) {
        this.lastSeen = j6;
    }

    public void setLevel(int i2) {
        this.level = i2;
    }

    public void setLevelCurrentExperience(long j6) {
        this.levelCurrentExperience = j6;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setNobilityChangeTimeInMilli(Object obj) {
        this.nobilityChangeTimeInMilli = obj;
    }

    public void setNobilityCurrent(int i2) {
        this.nobilityCurrent = i2;
    }

    public void setPowerChangeTimeInMilli(Object obj) {
        this.powerChangeTimeInMilli = obj;
    }

    public void setPowerCurrent(int i2) {
        this.powerCurrent = i2;
    }

    public void setProfilePicUrl(String str) {
        this.profilePicUrl = str;
    }

    public void setVipEndTime(long j6) {
        this.vipEndTime = j6;
    }

    public String toString() {
        return "MainStatesObjectFirebase{nickName='" + this.nickName + "', profilePicUrl='" + this.profilePicUrl + "', bio='" + this.bio + "', gender=" + this.gender + ", vipEndTime=" + this.vipEndTime + ", lastSeen=" + this.lastSeen + ", level=" + this.level + ", levelCurrentExperience=" + this.levelCurrentExperience + ", powerCurrent=" + this.powerCurrent + ", powerChangeTimeInMilli=" + this.powerChangeTimeInMilli + ", courageCurrent=" + this.courageCurrent + ", courageChangeTimeInMilli=" + this.courageChangeTimeInMilli + ", courageDoubleEffectEndTime=" + this.courageDoubleEffectEndTime + ", nobilityCurrent=" + this.nobilityCurrent + ", nobilityChangeTimeInMilli=" + this.nobilityChangeTimeInMilli + ", healthCurrent=" + this.healthCurrent + ", healthChangeTimeInMilli=" + this.healthChangeTimeInMilli + ", healthDoubleEffectEndTime=" + this.healthDoubleEffectEndTime + '}';
    }

    public k(String str, long j6) {
        this.nickName = str;
        this.lastSeen = j6;
    }
}
