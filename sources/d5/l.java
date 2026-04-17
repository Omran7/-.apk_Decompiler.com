package d5;

import b5.i;
import java.util.Map;

public class l {
    private Map<String, i> allMedalsDetails;

    public Map<String, i> getAllMedalsDetails() {
        return this.allMedalsDetails;
    }

    public void setAllMedalsDetails(Map<String, i> map) {
        this.allMedalsDetails = map;
    }

    public String toString() {
        return "MedalObjectFirebase{allMedalsDetails=" + this.allMedalsDetails + '}';
    }
}
