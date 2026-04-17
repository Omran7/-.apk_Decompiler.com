package P;

import F3.e;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import x1.i;

public final class d extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f2123a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(InputConnection inputConnection, e eVar) {
        super(inputConnection, false);
        this.f2123a = eVar;
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        i iVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            iVar = new i((Object) new f(inputContentInfo), 25);
        }
        if (this.f2123a.k(iVar, i2, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }
}
