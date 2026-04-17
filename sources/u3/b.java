package U3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3709a;

    /* renamed from: b  reason: collision with root package name */
    public final c f3710b;

    public b(Set set, c cVar) {
        this.f3709a = b(set);
        this.f3710b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            sb.append(aVar.f3707a);
            sb.append('/');
            sb.append(aVar.f3708b);
            if (it2.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f3710b;
        synchronized (((HashSet) cVar.f3713b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.f3713b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f3709a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) cVar.f3713b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.f3713b);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
