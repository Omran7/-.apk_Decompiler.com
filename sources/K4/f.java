package K4;

import R2.b;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import e5.C0505b;
import e5.C0509f;
import i3.C0592h;
import java.util.ArrayList;
import java.util.Collection;
import o3.d;

public final class f extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckBox f1513a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CheckBox f1514b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CheckBox f1515c;
    public final /* synthetic */ CheckBox d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0505b f1516e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f1517f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(k kVar, RelativeLayout relativeLayout, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, C0505b bVar) {
        super(relativeLayout);
        this.f1517f = kVar;
        this.f1513a = checkBox;
        this.f1514b = checkBox2;
        this.f1515c = checkBox3;
        this.d = checkBox4;
        this.f1516e = bVar;
    }

    public final void onClick(View view) {
        super.onClick(view);
        boolean isChecked = this.f1513a.isChecked();
        boolean isChecked2 = this.f1514b.isChecked();
        boolean isChecked3 = this.f1515c.isChecked();
        boolean isChecked4 = this.d.isChecked();
        k kVar = this.f1517f;
        if (isChecked == kVar.f1552Z0.getAccountObject().isBannedFromChat() && isChecked2 == kVar.f1552Z0.getAccountObject().isBannedFromPrivateMessages() && isChecked3 == kVar.f1552Z0.getAccountObject().isBannedFromNews() && (!isChecked4 || kVar.f1552Z0.getMainStatesObject().getProfilePicUrl().equals("no_profile_pic"))) {
            v0.e(kVar.f1553d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_no_change_happened));
        } else {
            b.w(true);
            ArrayList arrayList = new ArrayList();
            boolean isBannedFromChat = kVar.f1552Z0.getAccountObject().isBannedFromChat();
            String str = kVar.f1554e0;
            if (isChecked != isBannedFromChat) {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                d.d(C0592h.b().e(), "players", str, "accountObject", "bannedFromChat").I(Boolean.valueOf(isChecked)).addOnCompleteListener(new g(kVar, isChecked, taskCompletionSource, 0));
                arrayList.add(taskCompletionSource.getTask());
            }
            if (isChecked2 != kVar.f1552Z0.getAccountObject().isBannedFromPrivateMessages()) {
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                d.d(C0592h.b().e(), "players", str, "accountObject", "bannedFromPrivateMessages").I(Boolean.valueOf(isChecked2)).addOnCompleteListener(new g(kVar, isChecked2, taskCompletionSource2, 1));
                arrayList.add(taskCompletionSource2.getTask());
            }
            if (isChecked3 != kVar.f1552Z0.getAccountObject().isBannedFromNews()) {
                TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                d.d(C0592h.b().e(), "players", str, "accountObject", "bannedFromNews").I(Boolean.valueOf(isChecked3)).addOnCompleteListener(new g(kVar, isChecked3, taskCompletionSource3, 2));
                arrayList.add(taskCompletionSource3.getTask());
            }
            if (isChecked4 && !kVar.f1552Z0.getMainStatesObject().getProfilePicUrl().equals("no_profile_pic")) {
                TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                d.d(C0592h.b().e(), "players", str, "mainStatesObject", "profilePicUrl").I("no_profile_pic").addOnCompleteListener(new h(kVar, taskCompletionSource4, 0));
                arrayList.add(taskCompletionSource4.getTask());
            }
            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new i(kVar, isChecked4));
        }
        this.f1516e.dismiss();
        kVar.f1551Y0 = false;
    }
}
