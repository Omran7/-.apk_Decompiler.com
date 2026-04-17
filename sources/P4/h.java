package P4;

import R2.b;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e5.C0509f;

public final class h extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2219a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f2220b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, View view, int i2) {
        super(view);
        this.f2219a = i2;
        this.f2220b = iVar;
    }

    public final void onClick(View view) {
        i iVar = this.f2220b;
        switch (this.f2219a) {
            case 0:
                super.onClick(view);
                try {
                    ((ClipboardManager) iVar.f2228h0.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Invite Code", o.getAccountObject().getId()));
                    b.M0(R.raw.add_new_item);
                    v0.e(iVar.f2228h0, MyApplication.f7090a.getApplicationContext().getString(R.string.invited_code_copied_successfully));
                    return;
                } catch (Exception e6) {
                    a.r("Exception from try-catch block inside ", "i", " class in handleClickingOnCopyButton method.", "i", e6);
                    return;
                }
            case 1:
                super.onClick(view);
                try {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TITLE", MyApplication.f7090a.getApplicationContext().getString(R.string.app_name));
                    String string = MyApplication.f7090a.getApplicationContext().getString(R.string.invite_link_description, new Object[]{o.getAccountObject().getId()});
                    intent.putExtra("android.intent.extra.TEXT", string + "https://play.google.com/store/apps/details?id=com.mtma.criminal.city\n");
                    iVar.U(Intent.createChooser(intent, MyApplication.f7090a.getApplicationContext().getString(R.string.share_with)));
                    return;
                } catch (Exception e7) {
                    a.r("Exception from try-catch block inside ", "i", " class in handleClickingOnInviteButton method.", "i", e7);
                    return;
                }
            case 2:
                super.onClick(view);
                j jVar = new j(iVar.f2228h0);
                C0269a aVar = new C0269a(iVar.p());
                aVar.f(R.id.activity_main_body_frame_layout, jVar, (String) null, 1);
                aVar.c();
                aVar.e(false);
                b.N0();
                return;
            default:
                super.onClick(view);
                C0269a aVar2 = new C0269a(iVar.p());
                aVar2.h(iVar);
                aVar2.e(false);
                return;
        }
    }
}
