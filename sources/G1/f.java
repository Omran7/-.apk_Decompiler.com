package G1;

import android.text.TextUtils;
import java.util.regex.Pattern;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f831a = 0;

    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }
}
