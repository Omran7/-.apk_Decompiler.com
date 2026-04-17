package androidx.emoji2.text;

import T1.C;
import android.content.pm.PackageManager;
import android.content.pm.Signature;

public final class c extends C {
    public final Signature[] a(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
