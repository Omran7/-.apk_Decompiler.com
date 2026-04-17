package Z4;

import h0.C0552a;
import java.util.ArrayList;

public class m {
    public String errorMessage = "";
    public boolean hasError = false;
    public boolean isAllProcessSuccess = false;
    public ArrayList<Long> materialsCostsList = new ArrayList<>();
    public ArrayList<String> materialsIdsList = new ArrayList<>();

    public String toString() {
        StringBuilder sb = new StringBuilder("GetSpecialtiesCostsResultObject{hasError=");
        sb.append(this.hasError);
        sb.append(", isAllProcessSuccess=");
        sb.append(this.isAllProcessSuccess);
        sb.append(", materialsIdsList=");
        sb.append(this.materialsIdsList);
        sb.append(", materialsCostsList=");
        sb.append(this.materialsCostsList);
        sb.append(", errorMessage='");
        return C0552a.r(sb, this.errorMessage, "'}");
    }
}
