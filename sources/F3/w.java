package f3;

import android.content.Context;
import android.content.SharedPreferences;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f7959a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static w f7960b;

    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences("com.google.firebase.auth.internal.browserSignInSessionStore." + str, 0);
    }

    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : sharedPreferences.getAll().keySet()) {
            edit.remove(remove);
        }
        edit.apply();
    }
}
