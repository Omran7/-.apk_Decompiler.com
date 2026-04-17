package j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.mtma.criminal.city.R;
import java.util.ArrayList;

public final class f extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public int f8707a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f8708b;

    public f(g gVar) {
        this.f8708b = gVar;
        a();
    }

    public final void a() {
        k kVar = this.f8708b.f8711c;
        m mVar = kVar.f8724E;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f8734s;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((m) arrayList.get(i2)) == mVar) {
                    this.f8707a = i2;
                    return;
                }
            }
        }
        this.f8707a = -1;
    }

    /* renamed from: b */
    public final m getItem(int i2) {
        g gVar = this.f8708b;
        k kVar = gVar.f8711c;
        kVar.i();
        ArrayList arrayList = kVar.f8734s;
        gVar.getClass();
        int i5 = this.f8707a;
        if (i5 >= 0 && i2 >= i5) {
            i2++;
        }
        return (m) arrayList.get(i2);
    }

    public final int getCount() {
        g gVar = this.f8708b;
        k kVar = gVar.f8711c;
        kVar.i();
        int size = kVar.f8734s.size();
        gVar.getClass();
        if (this.f8707a < 0) {
            return size;
        }
        return size - 1;
    }

    public final long getItemId(int i2) {
        return (long) i2;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f8708b.f8710b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((x) view).b(getItem(i2));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
