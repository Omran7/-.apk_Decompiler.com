package K;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.mtma.criminal.city.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class N {
    public static final ArrayList d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f1349a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f1350b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f1351c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f1349a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a6 = a(viewGroup.getChildAt(childCount));
                    if (a6 != null) {
                        return a6;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }
}
