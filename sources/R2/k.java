package R2;

import com.google.android.gms.common.internal.I;

public class k extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        I.e(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(String str, Exception exc) {
        super(str, exc);
        I.e(str, "Detail message must not be empty");
    }
}
