package d5;

import com.bumptech.glide.c;
import i3.C0591g;
import i3.n;
import java.util.Map;

/* renamed from: d5.g  reason: case insensitive filesystem */
public class C0474g {
    private long contribution = 0;
    private String id = "not_in_gang";
    private Object joinTimeInMilli;
    private Object leaveGangTimeInMilli;
    private long loyalty = 0;
    private String name = "not_in_gang";
    private int position = 5;
    private long respect = 0;
    private String tag = "not_in_gang";

    public C0474g() {
        Map map = n.f8294a;
        this.joinTimeInMilli = map;
        this.leaveGangTimeInMilli = map;
    }

    public long getContribution() {
        return this.contribution;
    }

    public String getId() {
        return this.id;
    }

    public Object getJoinTimeInMilli() {
        return this.joinTimeInMilli;
    }

    public Object getLeaveGangTimeInMilli() {
        return this.leaveGangTimeInMilli;
    }

    @C0591g
    public long getLeaveGangTimeInSeconds() {
        return c.W(this.leaveGangTimeInMilli);
    }

    public long getLoyalty() {
        return this.loyalty;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public long getRespect() {
        return this.respect;
    }

    public String getTag() {
        return this.tag;
    }

    public void setContribution(long j6) {
        this.contribution = j6;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setJoinTimeInMilli(Object obj) {
        this.joinTimeInMilli = obj;
    }

    public void setLeaveGangTimeInMilli(Object obj) {
        this.leaveGangTimeInMilli = obj;
    }

    public void setLoyalty(long j6) {
        this.loyalty = j6;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPosition(int i2) {
        this.position = i2;
    }

    public void setRespect(long j6) {
        this.respect = j6;
    }

    public void setTag(String str) {
        this.tag = str;
    }
}
