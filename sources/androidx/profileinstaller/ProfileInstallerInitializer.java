package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import androidx.emoji2.text.v;
import java.util.Collections;
import java.util.List;
import k0.e;
import p0.C0906b;

public class ProfileInstallerInitializer implements C0906b {
    public final List a() {
        return Collections.emptyList();
    }

    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new e(this, context.getApplicationContext()));
        return new v(20);
    }
}
