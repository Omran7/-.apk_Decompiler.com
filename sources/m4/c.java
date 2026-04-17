package M4;

import B4.a;
import G4.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import d5.o;
import i3.C0592h;
import j4.C0645v;
import java.util.ArrayList;
import java.util.Collection;
import o3.d;

public final class c extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f1843d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f1844e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f1845f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f1846g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f1847h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f1848i0 = new ArrayList();

    /* renamed from: j0  reason: collision with root package name */
    public ArrayList f1849j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public C0645v f1850k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f1851l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f1852m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f1853n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f1854o0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f1855p0 = false;

    public c(Context context, int i2) {
        this.f1843d0 = context;
        this.f1844e0 = i2;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_contacts_details, viewGroup, false);
        this.f1845f0 = inflate;
        this.f1846g0 = (ListView) inflate.findViewById(R.id.fragment_contacts_details_list_view);
        this.f1847h0 = (TextView) this.f1845f0.findViewById(R.id.fragment_contacts_details_empty_view);
        ArrayList arrayList = this.f1848i0;
        Context context = this.f1843d0;
        int i2 = this.f1844e0;
        C0645v vVar = new C0645v(context, arrayList, i2);
        this.f1850k0 = vVar;
        this.f1846g0.setAdapter(vVar);
        this.f1846g0.setOnScrollListener(new a(this, 5));
        this.f1846g0.setOnTouchListener(new b(this, 2));
        if (i2 == 1) {
            this.f1847h0.setText(R.string.empty_contacts_friends);
            this.f1849j0 = new ArrayList(o.getContactsObject().getFriendsMap().keySet());
            V();
        } else if (i2 == 2) {
            this.f1847h0.setText(R.string.empty_contacts_blocked);
            this.f1849j0 = new ArrayList(o.getContactsObject().getBlockedMap().keySet());
            V();
        } else if (i2 == 0) {
            this.f1847h0.setText(R.string.empty_contacts_requests);
            this.f1849j0 = new ArrayList(o.getContactsObject().getRequestsMap().keySet());
            W();
        }
        if (o.getNotificationObject().isHasUnSeenMedal()) {
            com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "notificationObject", "hasUnSeenContactRequest").I(Boolean.FALSE);
        }
        return this.f1845f0;
    }

    public final void V() {
        int size = this.f1849j0.size();
        ArrayList arrayList = this.f1848i0;
        if (size > arrayList.size()) {
            R2.b.w(true);
            int i2 = 10;
            if (this.f1849j0.size() - arrayList.size() < 10) {
                i2 = this.f1849j0.size() - arrayList.size();
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i5 = 0; i5 < i2; i5++) {
                String str = (String) this.f1849j0.get(this.f1854o0 + i5);
                arrayList3.add(str);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                d.c(C0592h.b().e(), "players", str, "mainStatesObject").d(new E4.a(taskCompletionSource, 1));
                arrayList2.add(taskCompletionSource.getTask());
            }
            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList2).addOnCompleteListener(new b(this, arrayList3, i2));
            return;
        }
        this.f1855p0 = false;
        this.f1846g0.setEmptyView(this.f1847h0);
    }

    public final void W() {
        int size = this.f1849j0.size();
        ArrayList arrayList = this.f1848i0;
        if (size > arrayList.size()) {
            R2.b.w(true);
            int i2 = 10;
            if (this.f1849j0.size() - arrayList.size() < 10) {
                i2 = this.f1849j0.size() - arrayList.size();
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (int i5 = 0; i5 < i2; i5++) {
                String str = (String) this.f1849j0.get(this.f1854o0 + i5);
                String str2 = str.split("-")[0];
                Integer num = o.getContactsObject().getRequestsMap().get(str);
                int intValue = num.intValue();
                arrayList3.add(str2);
                arrayList4.add(num);
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                if (intValue == 0 || intValue == 1) {
                    d.c(C0592h.b().e(), "players", str2, "mainStatesObject").d(new B4.c(taskCompletionSource, 5));
                } else if (intValue == 2) {
                    d.c(C0592h.b().e(), "gangs", "gangsData", str2).d(new E4.a(taskCompletionSource, 2));
                }
                arrayList2.add(taskCompletionSource.getTask());
            }
            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList2).addOnCompleteListener(new a(this, arrayList4, arrayList3, i2));
            return;
        }
        this.f1855p0 = false;
        this.f1846g0.setEmptyView(this.f1847h0);
    }
}
