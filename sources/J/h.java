package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

public final class h extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final k f8714a;

    /* renamed from: b  reason: collision with root package name */
    public int f8715b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8716c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final LayoutInflater f8717e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8718f;

    public h(k kVar, LayoutInflater layoutInflater, boolean z3, int i2) {
        this.d = z3;
        this.f8717e = layoutInflater;
        this.f8714a = kVar;
        this.f8718f = i2;
        a();
    }

    public final void a() {
        k kVar = this.f8714a;
        m mVar = kVar.f8724E;
        if (mVar != null) {
            kVar.i();
            ArrayList arrayList = kVar.f8734s;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((m) arrayList.get(i2)) == mVar) {
                    this.f8715b = i2;
                    return;
                }
            }
        }
        this.f8715b = -1;
    }

    /* renamed from: b */
    public final m getItem(int i2) {
        ArrayList arrayList;
        k kVar = this.f8714a;
        if (this.d) {
            kVar.i();
            arrayList = kVar.f8734s;
        } else {
            arrayList = kVar.l();
        }
        int i5 = this.f8715b;
        if (i5 >= 0 && i2 >= i5) {
            i2++;
        }
        return (m) arrayList.get(i2);
    }

    public final int getCount() {
        ArrayList arrayList;
        k kVar = this.f8714a;
        if (this.d) {
            kVar.i();
            arrayList = kVar.f8734s;
        } else {
            arrayList = kVar.l();
        }
        if (this.f8715b < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public final long getItemId(int i2) {
        return (long) i2;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        int i5;
        boolean z3 = false;
        if (view == null) {
            view = this.f8717e.inflate(this.f8718f, viewGroup, false);
        }
        int i6 = getItem(i2).f8757b;
        int i7 = i2 - 1;
        if (i7 >= 0) {
            i5 = getItem(i7).f8757b;
        } else {
            i5 = i6;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f8714a.m() && i6 != i5) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        x xVar = (x) view;
        if (this.f8716c) {
            listMenuItemView.setForceShowIcon(true);
        }
        xVar.b(getItem(i2));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
