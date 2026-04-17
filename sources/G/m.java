package G;

import android.content.Context;
import android.os.UserManager;

public abstract class m {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
