package k0;

import F3.g;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

public final /* synthetic */ class e implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f9449a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f9450b;

    public /* synthetic */ e(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f9449a = profileInstallerInitializer;
        this.f9450b = context;
    }

    public final void doFrame(long j6) {
        Handler handler;
        this.f9449a.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Handler.createAsync(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new g(this.f9450b, 2), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
    }
}
