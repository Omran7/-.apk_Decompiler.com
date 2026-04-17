package d5;

/* renamed from: d5.b  reason: case insensitive filesystem */
public class C0469b {
    private int armorId = -1;
    private int armorLevel = 0;
    private int bioChemicalId = -1;
    private int gunId = -1;
    private int gunLevel = 0;
    private int specialEquipmentId = -1;

    public int getArmorId() {
        return this.armorId;
    }

    public int getArmorLevel() {
        return this.armorLevel;
    }

    public int getBioChemicalId() {
        return this.bioChemicalId;
    }

    public int getGunId() {
        return this.gunId;
    }

    public int getGunLevel() {
        return this.gunLevel;
    }

    public int getSpecialEquipmentId() {
        return this.specialEquipmentId;
    }

    public void setArmorId(int i2) {
        this.armorId = i2;
    }

    public void setArmorLevel(int i2) {
        this.armorLevel = i2;
    }

    public void setBioChemicalId(int i2) {
        this.bioChemicalId = i2;
    }

    public void setGunId(int i2) {
        this.gunId = i2;
    }

    public void setGunLevel(int i2) {
        this.gunLevel = i2;
    }

    public void setSpecialEquipmentId(int i2) {
        this.specialEquipmentId = i2;
    }

    public String toString() {
        return "ArmingObjectFirebase{gunId=" + this.gunId + ", gunLevel=" + this.gunLevel + ", armorId=" + this.armorId + ", armorLevel=" + this.armorLevel + ", specialEquipmentId=" + this.specialEquipmentId + ", bioChemicalId=" + this.bioChemicalId + '}';
    }
}
