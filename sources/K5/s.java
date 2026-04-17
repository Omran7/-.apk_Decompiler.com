package k5;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public final class s implements WrapperListAdapter, Filterable {

    /* renamed from: f  reason: collision with root package name */
    public static final ArrayList f9623f = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final ListAdapter f9624a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f9625b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f9626c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9627e;

    public s(ArrayList arrayList, ArrayList arrayList2, ListAdapter listAdapter) {
        this.f9624a = listAdapter;
        this.f9627e = listAdapter instanceof Filterable;
        ArrayList arrayList3 = f9623f;
        if (arrayList == null) {
            this.f9625b = arrayList3;
        } else {
            this.f9625b = arrayList;
        }
        if (arrayList2 == null) {
            this.f9626c = arrayList3;
        } else {
            this.f9626c = arrayList2;
        }
        ArrayList arrayList4 = this.f9625b;
        if (arrayList4 != null) {
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                ((q) it2.next()).getClass();
            }
        }
        ArrayList arrayList5 = this.f9626c;
        if (arrayList5 != null) {
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                ((q) it3.next()).getClass();
            }
        }
        this.d = true;
    }

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f9624a;
        if (listAdapter == null) {
            return true;
        }
        if (!this.d || !listAdapter.areAllItemsEnabled()) {
            return false;
        }
        return true;
    }

    public final int getCount() {
        ArrayList arrayList = this.f9625b;
        ArrayList arrayList2 = this.f9626c;
        ListAdapter listAdapter = this.f9624a;
        if (listAdapter != null) {
            return listAdapter.getCount() + arrayList.size() + arrayList2.size();
        }
        return arrayList.size() + arrayList2.size();
    }

    public final Filter getFilter() {
        if (this.f9627e) {
            return ((Filterable) this.f9624a).getFilter();
        }
        return null;
    }

    public final Object getItem(int i2) {
        int i5;
        ArrayList arrayList = this.f9625b;
        int size = arrayList.size();
        if (i2 < size) {
            ((q) arrayList.get(i2)).getClass();
            return null;
        }
        int i6 = i2 - size;
        ListAdapter listAdapter = this.f9624a;
        if (listAdapter != null) {
            i5 = listAdapter.getCount();
            if (i6 < i5) {
                return listAdapter.getItem(i6);
            }
        } else {
            i5 = 0;
        }
        ((q) this.f9626c.get(i6 - i5)).getClass();
        return null;
    }

    public final long getItemId(int i2) {
        int i5;
        int size = this.f9625b.size();
        ListAdapter listAdapter = this.f9624a;
        if (listAdapter == null || i2 < size || (i5 = i2 - size) >= listAdapter.getCount()) {
            return -1;
        }
        return listAdapter.getItemId(i5);
    }

    public final int getItemViewType(int i2) {
        int i5;
        int size = this.f9625b.size();
        ListAdapter listAdapter = this.f9624a;
        if (listAdapter == null || i2 < size || (i5 = i2 - size) >= listAdapter.getCount()) {
            return -2;
        }
        return listAdapter.getItemViewType(i5);
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        int i5;
        ArrayList arrayList = this.f9625b;
        int size = arrayList.size();
        if (i2 < size) {
            return ((q) arrayList.get(i2)).f9619a;
        }
        int i6 = i2 - size;
        ListAdapter listAdapter = this.f9624a;
        if (listAdapter != null) {
            i5 = listAdapter.getCount();
            if (i6 < i5) {
                return listAdapter.getView(i6, view, viewGroup);
            }
        } else {
            i5 = 0;
        }
        return ((q) this.f9626c.get(i6 - i5)).f9619a;
    }

    public final int getViewTypeCount() {
        ListAdapter listAdapter = this.f9624a;
        if (listAdapter != null) {
            return listAdapter.getViewTypeCount();
        }
        return 1;
    }

    public final ListAdapter getWrappedAdapter() {
        return this.f9624a;
    }

    public final boolean hasStableIds() {
        ListAdapter listAdapter = this.f9624a;
        if (listAdapter != null) {
            return listAdapter.hasStableIds();
        }
        return false;
    }

    public final boolean isEmpty() {
        ListAdapter listAdapter = this.f9624a;
        if (listAdapter == null || listAdapter.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled(int i2) {
        int i5;
        ArrayList arrayList = this.f9625b;
        int size = arrayList.size();
        if (i2 < size) {
            ((q) arrayList.get(i2)).getClass();
            return true;
        }
        int i6 = i2 - size;
        ListAdapter listAdapter = this.f9624a;
        if (listAdapter != null) {
            i5 = listAdapter.getCount();
            if (i6 < i5) {
                return listAdapter.isEnabled(i6);
            }
        } else {
            i5 = 0;
        }
        ((q) this.f9626c.get(i6 - i5)).getClass();
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        ListAdapter listAdapter = this.f9624a;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        ListAdapter listAdapter = this.f9624a;
        if (listAdapter != null) {
            listAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
