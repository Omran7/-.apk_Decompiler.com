package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.Serializable;
import k.C0724m;
import k0.C0755d;

public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX WARNING: type inference failed for: r7v10, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File file;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                C0755d.t(context, new Object(), new C0724m(this, 2), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        C0724m mVar = new C0724m(this, 2);
                        try {
                            C0755d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            mVar.d(10, (Serializable) null);
                        } catch (PackageManager.NameNotFoundException e6) {
                            mVar.d(7, e6);
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                Process.sendSignal(Process.myPid(), 10);
                Log.d("ProfileInstaller", "");
                setResultCode(12);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                C0724m mVar2 = new C0724m(this, 2);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        file = context.createDeviceProtectedStorageContext().getCacheDir();
                    } else {
                        file = context.createDeviceProtectedStorageContext().getCodeCacheDir();
                    }
                    if (C0755d.c(file)) {
                        mVar2.d(14, (Serializable) null);
                    } else {
                        mVar2.d(15, (Serializable) null);
                    }
                } else {
                    mVar2.d(16, (Serializable) null);
                }
            }
        }
    }
}
