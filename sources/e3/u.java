package e3;

import C1.a;
import R2.k;

public abstract class u {
    private static final a zza = new a("PhoneAuthProvider", new String[0]);

    public abstract void onCodeAutoRetrievalTimeOut(String str);

    public abstract void onCodeSent(String str, t tVar);

    public abstract void onVerificationCompleted(s sVar);

    public abstract void onVerificationFailed(k kVar);
}
