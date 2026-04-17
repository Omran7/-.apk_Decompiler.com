package d5;

public class o {
    private static C0468a accountObject;
    private static C0469b armingObject;
    private static C0470c chatObject;
    private static C0471d contactsObject;
    private static C0472e crimeObject;
    private static C0473f estateObject;
    private static C0474g gangObject;
    private static C0475h gymObject;
    private static i herbObject;
    private static j locationObject;
    private static k mainStatesObject;
    private static l medalsObject;
    private static m moneyObject;
    private static n notificationObject;
    private static p prizeObject;
    private static q schoolObject;
    private static r skillsObject;
    private static s stockObject;
    private static t upgradeObject;
    private static v workObject;

    public static void clearData() {
        mainStatesObject = null;
        moneyObject = null;
        gymObject = null;
        workObject = null;
        skillsObject = null;
        stockObject = null;
        crimeObject = null;
        gangObject = null;
        chatObject = null;
        locationObject = null;
        schoolObject = null;
        notificationObject = null;
        upgradeObject = null;
        armingObject = null;
        estateObject = null;
        prizeObject = null;
        contactsObject = null;
        accountObject = null;
        herbObject = null;
        medalsObject = null;
    }

    public static C0468a getAccountObject() {
        return accountObject;
    }

    public static C0469b getArmingObject() {
        return armingObject;
    }

    public static C0470c getChatObject() {
        return chatObject;
    }

    public static C0471d getContactsObject() {
        return contactsObject;
    }

    public static C0472e getCrimeObject() {
        return crimeObject;
    }

    public static C0473f getEstateObject() {
        return estateObject;
    }

    public static C0474g getGangObject() {
        return gangObject;
    }

    public static C0475h getGymObject() {
        return gymObject;
    }

    public static i getHerbObject() {
        return herbObject;
    }

    public static j getLocationObject() {
        return locationObject;
    }

    public static k getMainStatesObject() {
        return mainStatesObject;
    }

    public static l getMedalsObject() {
        return medalsObject;
    }

    public static m getMoneyObject() {
        return moneyObject;
    }

    public static n getNotificationObject() {
        return notificationObject;
    }

    public static p getPrizeObject() {
        return prizeObject;
    }

    public static q getSchoolObject() {
        return schoolObject;
    }

    public static r getSkillsObject() {
        return skillsObject;
    }

    public static s getStockObject() {
        return stockObject;
    }

    public static t getUpgradeObject() {
        return upgradeObject;
    }

    public static v getWorkObject() {
        return workObject;
    }

    public static void setAccountObject(C0468a aVar) {
        accountObject = aVar;
    }

    public static void setArmingObject(C0469b bVar) {
        armingObject = bVar;
    }

    public static void setChatObject(C0470c cVar) {
        chatObject = cVar;
    }

    public static void setContactsObject(C0471d dVar) {
        contactsObject = dVar;
    }

    public static void setCrimeObject(C0472e eVar) {
        crimeObject = eVar;
    }

    public static void setEstateObject(C0473f fVar) {
        estateObject = fVar;
    }

    public static void setGangObject(C0474g gVar) {
        gangObject = gVar;
    }

    public static void setGymObject(C0475h hVar) {
        gymObject = hVar;
    }

    public static void setHerbObject(i iVar) {
        herbObject = iVar;
    }

    public static void setLocationObject(j jVar) {
        locationObject = jVar;
    }

    public static void setMainStatesObject(k kVar) {
        mainStatesObject = kVar;
    }

    public static void setMedalsObject(l lVar) {
        medalsObject = lVar;
    }

    public static void setMoneyObject(m mVar) {
        moneyObject = mVar;
    }

    public static void setNotificationObject(n nVar) {
        notificationObject = nVar;
    }

    public static void setPlayerObject(u uVar) {
        mainStatesObject = uVar.getMainStatesObject();
        moneyObject = uVar.getMoneyObject();
        gymObject = uVar.getGymObject();
        workObject = uVar.getWorkObject();
        skillsObject = uVar.getSkillsObject();
        stockObject = uVar.getStockObject();
        crimeObject = uVar.getCrimeObject();
        gangObject = uVar.getGangObject();
        chatObject = uVar.getChatObject();
        locationObject = uVar.getLocationObject();
        schoolObject = uVar.getSchoolObject();
        notificationObject = uVar.getNotificationObject();
        upgradeObject = uVar.getUpgradeObject();
        armingObject = uVar.getArmingObject();
        estateObject = uVar.getEstateObject();
        prizeObject = uVar.getPrizeObject();
        contactsObject = uVar.getContactsObject();
        accountObject = uVar.getAccountObject();
        herbObject = uVar.getHerbObject();
        medalsObject = uVar.getMedalsObject();
    }

    public static void setPrizeObject(p pVar) {
        prizeObject = pVar;
    }

    public static void setSchoolObject(q qVar) {
        schoolObject = qVar;
    }

    public static void setSkillsObject(r rVar) {
        skillsObject = rVar;
    }

    public static void setStockObject(s sVar) {
        stockObject = sVar;
    }

    public static void setUpgradeObject(t tVar) {
        upgradeObject = tVar;
    }

    public static void setWorkObject(v vVar) {
        workObject = vVar;
    }

    public String toString() {
        return "UserObject{mainStatesObject=" + mainStatesObject + ", gymObject=" + gymObject + ", moneyObject=" + moneyObject + ", workObject=" + workObject + ", stockObject=" + stockObject + ", crimeObject=" + crimeObject + ", locationObject=" + locationObject + ", chatObject=" + chatObject + ", gangObject=" + gangObject + ", skillsObject=" + skillsObject + ", schoolObject=" + schoolObject + ", notificationObject=" + notificationObject + ", upgradeObject=" + upgradeObject + ", armingObject=" + armingObject + ", estateObject=" + estateObject + ", prizeObject=" + prizeObject + ", contactsObject=" + contactsObject + ", accountObject=" + accountObject + ", herbObject=" + herbObject + ", medalsObject=" + medalsObject + '}';
    }
}
