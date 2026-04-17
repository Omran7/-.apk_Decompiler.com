package F0;

import U0.c;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import z0.C1126b;
import z0.i;

public final class C implements t, C1126b {

    /* renamed from: b  reason: collision with root package name */
    public static final C f665b = new C(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f666a;

    public /* synthetic */ C(int i2) {
        this.f666a = i2;
    }

    public static ByteArrayInputStream a(String str) {
        if (str.startsWith("data:image")) {
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            } else if (str.substring(0, indexOf).endsWith(";base64")) {
                return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
            } else {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        } else {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
    }

    public Class b() {
        switch (this.f666a) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    public s e(y yVar) {
        switch (this.f666a) {
            case 0:
                return D.f667b;
            case 2:
                return new C0013c(new C(1), 0);
            case 4:
                return new C0013c(new C(3), 0);
            case zzaky.zzf.zzf /*6*/:
                return new D(1);
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                return new B(yVar.a(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new B(yVar.a(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new B(yVar.a(Uri.class, InputStream.class), 0);
            default:
                return new H(yVar.a(i.class, InputStream.class));
        }
    }

    public boolean s(Object obj, File file, i iVar) {
        try {
            c.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e6) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e6);
            }
            return false;
        }
    }
}
