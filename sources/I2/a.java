package I2;

import C2.f;
import android.content.Context;
import android.preference.PreferenceManager;
import k.e1;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f1155b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final f f1156a;

    public a(e1 e1Var) {
        Context context = (Context) e1Var.f9290a;
        String str = (String) e1Var.f9291b;
        String str2 = (String) e1Var.f9292c;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.f1156a = (f) e1Var.f9295p;
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }
}
