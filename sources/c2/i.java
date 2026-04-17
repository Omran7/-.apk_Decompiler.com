package C2;

import I2.c;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import o3.d;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList f443a = new CopyOnWriteArrayList();

    public static c a(String str) {
        boolean startsWith;
        Iterator it2 = f443a.iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            synchronized (cVar) {
                startsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (startsWith) {
                return cVar;
            }
        }
        throw new GeneralSecurityException(d.i("No KMS client does support: ", str));
    }
}
