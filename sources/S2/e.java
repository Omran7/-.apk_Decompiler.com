package s2;

import B0.C;
import B0.C0009h;
import B0.D;
import C0.b;
import D0.h;
import F0.B;
import F0.i;
import F0.s;
import F0.t;
import F0.y;
import G5.v0;
import H3.f;
import I0.F;
import K1.c;
import P2.k;
import T1.H;
import V0.a;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.internal.measurement.zzql;
import com.google.android.gms.internal.measurement.zzrj;
import com.google.android.gms.internal.measurement.zzrs;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import z0.C1130f;
import z0.l;

public class e implements a, b, D0.a, t, F, c, L5.a, l, k, T1.F {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11440a;

    public /* synthetic */ e(int i2) {
        this.f11440a = i2;
    }

    public static final boolean n() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public File a(C1130f fVar) {
        return null;
    }

    public Object b(String str, Provider provider) {
        switch (this.f11440a) {
            case 14:
                if (provider == null) {
                    return Cipher.getInstance(str);
                }
                return Cipher.getInstance(str, provider);
            case 15:
                if (provider == null) {
                    return KeyFactory.getInstance(str);
                }
                return KeyFactory.getInstance(str, provider);
            case 16:
                if (provider == null) {
                    return Mac.getInstance(str);
                }
                return Mac.getInstance(str, provider);
            default:
                if (provider == null) {
                    return Signature.getInstance(str);
                }
                return Signature.getInstance(str, provider);
        }
    }

    public Bitmap c(int i2, int i5, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i5, config);
    }

    public Bitmap d(int i2, int i5, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i5, config);
    }

    public s e(y yVar) {
        return new B(yVar.a(i.class, InputStream.class), 1);
    }

    public void f(Bitmap bitmap) {
        bitmap.recycle();
    }

    public h g(Context context, String str, K1.b bVar) {
        h hVar = new h();
        hVar.f499a = bVar.e(context, str);
        int i2 = 1;
        int f6 = bVar.f(context, str, true);
        hVar.f500b = f6;
        int i5 = hVar.f499a;
        if (i5 == 0) {
            i5 = 0;
            if (f6 == 0) {
                i2 = 0;
                hVar.f501c = i2;
                return hVar;
            }
        }
        if (i5 >= f6) {
            i2 = -1;
        }
        hVar.f501c = i2;
        return hVar;
    }

    public Object j() {
        return new C();
    }

    public void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    public void m(MediaExtractor mediaExtractor, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    public int o(z0.i iVar) {
        return 1;
    }

    public boolean s(Object obj, File file, z0.i iVar) {
        try {
            U0.c.d(((M0.h) ((M0.c) ((D) obj).get()).f1783a.f1782b).f1801a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e6) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e6);
            }
            return false;
        }
    }

    public Object zza() {
        switch (this.f11440a) {
            case 19:
                List list = H.f2892a;
                return Boolean.valueOf(zzpq.zzd());
            case 20:
                List list2 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzab());
            case 21:
                List list3 = H.f2892a;
                return Boolean.valueOf(zzql.zzb());
            case 22:
                List list4 = H.f2892a;
                return Boolean.valueOf(zzrs.zzb());
            case 23:
                List list5 = H.f2892a;
                return Boolean.valueOf(zzpn.zzc());
            case 24:
                List list6 = H.f2892a;
                return Boolean.valueOf(zzoy.zzc());
            case 25:
                List list7 = H.f2892a;
                return Boolean.valueOf(zzrj.zzh());
            case 26:
                List list8 = H.f2892a;
                return Integer.valueOf((int) zzpb.zzS());
            case 27:
                List list9 = H.f2892a;
                return Boolean.valueOf(zzrj.zzf());
            default:
                List list10 = H.f2892a;
                return Boolean.valueOf(zzrj.zze());
        }
    }

    public e(View view) {
        this.f11440a = 10;
        if (Build.VERSION.SDK_INT >= 30) {
            new f(view);
        } else {
            new f(view);
        }
    }

    public e(v0 v0Var) {
        this.f11440a = 12;
    }

    public void l() {
    }

    public void h(int i2) {
    }

    public void i(C1130f fVar, C0009h hVar) {
    }
}
