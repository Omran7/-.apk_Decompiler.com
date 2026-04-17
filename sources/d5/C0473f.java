package d5;

import h0.C0552a;
import java.util.ArrayList;

/* renamed from: d5.f  reason: case insensitive filesystem */
public class C0473f {
    private String estateOwnerId;
    private String firebaseKeyNode;
    private ArrayList<Boolean> fixedModificationList = new ArrayList<>();
    private int id;
    private boolean isForRent = false;
    private boolean isForSale = false;
    private boolean isSpouseUsed = false;
    private boolean isUsed = false;
    private Object lastTimeDailyTaxPaidInMilli = -1L;
    private String privateDomainPicUrl = "no_private_domain_image";
    private ArrayList<Long> servantContractsStartTimeInMilliList = new ArrayList<>();

    public C0473f() {
    }

    public String getEstateOwnerId() {
        return this.estateOwnerId;
    }

    public String getFirebaseKeyNode() {
        return this.firebaseKeyNode;
    }

    public ArrayList<Boolean> getFixedModificationList() {
        return this.fixedModificationList;
    }

    public int getId() {
        return this.id;
    }

    public Object getLastTimeDailyTaxPaidInMilli() {
        return this.lastTimeDailyTaxPaidInMilli;
    }

    public String getPrivateDomainPicUrl() {
        return this.privateDomainPicUrl;
    }

    public ArrayList<Long> getServantContractsStartTimeInMilliList() {
        return this.servantContractsStartTimeInMilliList;
    }

    public boolean isForRent() {
        return this.isForRent;
    }

    public boolean isForSale() {
        return this.isForSale;
    }

    public boolean isSpouseUsed() {
        return this.isSpouseUsed;
    }

    public boolean isUsed() {
        return this.isUsed;
    }

    public void setEstateOwnerId(String str) {
        this.estateOwnerId = str;
    }

    public void setFirebaseKeyNode(String str) {
        this.firebaseKeyNode = str;
    }

    public void setFixedModificationList(ArrayList<Boolean> arrayList) {
        this.fixedModificationList = arrayList;
    }

    public void setForRent(boolean z3) {
        this.isForRent = z3;
    }

    public void setForSale(boolean z3) {
        this.isForSale = z3;
    }

    public void setId(int i2) {
        this.id = i2;
    }

    public void setLastTimeDailyTaxPaidInMilli(Object obj) {
        this.lastTimeDailyTaxPaidInMilli = obj;
    }

    public void setPrivateDomainPicUrl(String str) {
        this.privateDomainPicUrl = str;
    }

    public void setServantContractsStartTimeInMilliList(ArrayList<Long> arrayList) {
        this.servantContractsStartTimeInMilliList = arrayList;
    }

    public void setSpouseUsed(boolean z3) {
        this.isSpouseUsed = z3;
    }

    public void setUsed(boolean z3) {
        this.isUsed = z3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EstateObjectFirebase{id=");
        sb.append(this.id);
        sb.append(", firebaseKeyNode='");
        sb.append(this.firebaseKeyNode);
        sb.append("', estateOwnerId='");
        sb.append(this.estateOwnerId);
        sb.append("', isUsed=");
        sb.append(this.isUsed);
        sb.append(", isSpouseUsed=");
        sb.append(this.isSpouseUsed);
        sb.append(", isForSale=");
        sb.append(this.isForSale);
        sb.append(", isForRent=");
        sb.append(this.isForRent);
        sb.append(", fixedModificationList=");
        sb.append(this.fixedModificationList);
        sb.append(", servantContractsStartTimeInMilliList=");
        sb.append(this.servantContractsStartTimeInMilliList);
        sb.append(", lastTimeDailyTaxPaidInMilli=");
        sb.append(this.lastTimeDailyTaxPaidInMilli);
        sb.append(", privateDomainPicUrl='");
        return C0552a.r(sb, this.privateDomainPicUrl, "'}");
    }

    public C0473f(int i2, ArrayList<Boolean> arrayList, ArrayList<Long> arrayList2) {
        this.id = i2;
        this.fixedModificationList = arrayList;
        this.servantContractsStartTimeInMilliList = arrayList2;
    }

    public C0473f(int i2, String str, String str2, boolean z3, boolean z4, ArrayList<Boolean> arrayList, ArrayList<Long> arrayList2, long j6) {
        this.id = i2;
        this.firebaseKeyNode = str;
        this.estateOwnerId = str2;
        this.isUsed = z3;
        this.isSpouseUsed = z4;
        this.fixedModificationList = arrayList;
        this.servantContractsStartTimeInMilliList = arrayList2;
        this.lastTimeDailyTaxPaidInMilli = Long.valueOf(j6);
    }
}
