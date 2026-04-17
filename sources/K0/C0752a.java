package k0;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.activity.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* renamed from: k0.a  reason: case insensitive filesystem */
public final class C0752a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f9431a;

    /* renamed from: b  reason: collision with root package name */
    public final C0754c f9432b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f9433c;
    public final File d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9434e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9435f = false;
    public C0753b[] g;
    public byte[] h;

    public C0752a(AssetManager assetManager, Executor executor, C0754c cVar, String str, File file) {
        byte[] bArr;
        this.f9431a = executor;
        this.f9432b = cVar;
        this.f9434e = str;
        this.d = file;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 31) {
            switch (i2) {
                case 24:
                case 25:
                    bArr = C0755d.h;
                    break;
                case 26:
                    bArr = C0755d.g;
                    break;
                case 27:
                    bArr = C0755d.f9446f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = C0755d.f9445e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = C0755d.d;
        }
        this.f9433c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e6) {
            String message = e6.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f9432b.m();
            }
            return null;
        }
    }

    public final void b(int i2, Serializable serializable) {
        this.f9431a.execute(new l(this, i2, serializable, 2));
    }
}
