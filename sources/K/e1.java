package k;

import B0.C0009h;
import C2.f;
import C2.g;
import C2.p;
import I1.b;
import I2.a;
import I2.c;
import O2.M;
import O2.N;
import O2.Z;
import O2.d0;
import O2.f0;
import O2.g0;
import O2.k0;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.emoji2.text.v;
import com.google.crypto.tink.shaded.protobuf.C0403h;
import com.google.crypto.tink.shaded.protobuf.C0404i;
import com.google.crypto.tink.shaded.protobuf.C0411p;
import com.google.crypto.tink.shaded.protobuf.D;
import e1.C0483b;
import e1.C0484c;
import h0.C0552a;
import i1.i;
import j1.C0607c;
import j1.d;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.concurrent.Executor;
import k1.C0758c;
import l5.C0797a;

public final class e1 implements C0483b {

    /* renamed from: a  reason: collision with root package name */
    public Object f9290a = null;

    /* renamed from: b  reason: collision with root package name */
    public Object f9291b = null;

    /* renamed from: c  reason: collision with root package name */
    public Object f9292c = null;
    public Object d = null;

    /* renamed from: e  reason: collision with root package name */
    public Object f9293e = null;

    /* renamed from: f  reason: collision with root package name */
    public Object f9294f = null;

    /* renamed from: p  reason: collision with root package name */
    public Object f9295p;

    public static byte[] c(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
            } else {
                sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
            }
            try {
                String string = sharedPreferences.getString(str, (String) null);
                if (string == null) {
                    return null;
                }
                return b.t(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(C0552a.o("can't read keyset; the pref value ", str, " is not a valid hex string"));
            }
        } else {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    /* JADX INFO: finally extract failed */
    public static f d(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            g0 F = g0.F(byteArrayInputStream, C0411p.a());
            byteArrayInputStream.close();
            return new f((Object) (d0) ((g0) C0009h.u(F).f228b).x(), 3);
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public synchronized a a() {
        a aVar;
        try {
            if (((String) this.f9291b) != null) {
                synchronized (a.f1155b) {
                    byte[] c3 = c((Context) this.f9290a, (String) this.f9291b, (String) this.f9292c);
                    if (c3 == null) {
                        if (((String) this.d) != null) {
                            this.f9293e = f();
                        }
                        this.f9295p = b();
                    } else if (((String) this.d) != null) {
                        this.f9295p = e(c3);
                    } else {
                        this.f9295p = d(c3);
                    }
                    aVar = new a(this);
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            while (true) {
            }
        }
        return aVar;
    }

    public f b() {
        SharedPreferences.Editor editor;
        if (((g) this.f9294f) != null) {
            f fVar = new f((Object) g0.E(), 3);
            g gVar = (g) this.f9294f;
            synchronized (fVar) {
                fVar.a(gVar.f441a);
            }
            int C6 = p.a((g0) fVar.c().f228b).A().C();
            synchronized (fVar) {
                int i2 = 0;
                while (i2 < ((g0) ((d0) fVar.f440b).f6859b).B()) {
                    try {
                        f0 A6 = ((g0) ((d0) fVar.f440b).f6859b).A(i2);
                        if (A6.D() != C6) {
                            i2++;
                        } else if (A6.F().equals(Z.ENABLED)) {
                            d0 d0Var = (d0) fVar.f440b;
                            d0Var.e();
                            g0.y((g0) d0Var.f6859b, C6);
                        } else {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + C6);
                        }
                    } finally {
                    }
                }
                throw new GeneralSecurityException("key not found: " + C6);
            }
            Context context = (Context) this.f9290a;
            String str = (String) this.f9291b;
            String str2 = (String) this.f9292c;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    editor = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                } else {
                    editor = applicationContext.getSharedPreferences(str2, 0).edit();
                }
                if (((I2.b) this.f9293e) != null) {
                    C0009h c3 = fVar.c();
                    I2.b bVar = (I2.b) this.f9293e;
                    byte[] bArr = new byte[0];
                    g0 g0Var = (g0) c3.f228b;
                    byte[] a6 = bVar.a(g0Var.e(), bArr);
                    try {
                        if (g0.G(bVar.b(a6, bArr), C0411p.a()).equals(g0Var)) {
                            M B6 = N.B();
                            C0403h v6 = C0404i.v(a6, 0, a6.length);
                            B6.e();
                            N.y((N) B6.f6859b, v6);
                            k0 a7 = p.a(g0Var);
                            B6.e();
                            N.z((N) B6.f6859b, a7);
                            if (!editor.putString(str, b.w(((N) B6.b()).e())).commit()) {
                                throw new IOException("Failed to write to SharedPreferences");
                            }
                        } else {
                            throw new GeneralSecurityException("cannot encrypt keyset");
                        }
                    } catch (D unused) {
                        throw new GeneralSecurityException("invalid keyset, corrupted key material");
                    }
                } else if (!editor.putString(str, b.w(((g0) fVar.c().f228b).e())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
                return fVar;
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        throw new GeneralSecurityException("cannot read or generate keyset");
    }

    public f e(byte[] bArr) {
        try {
            this.f9293e = new c().c((String) this.d);
            try {
                return new f((Object) (d0) ((g0) C0009h.C(new f((Object) new ByteArrayInputStream(bArr), 1), (I2.b) this.f9293e).f228b).x(), 3);
            } catch (IOException | GeneralSecurityException e6) {
                try {
                    return d(bArr);
                } catch (IOException unused) {
                    throw e6;
                }
            }
        } catch (GeneralSecurityException | ProviderException e7) {
            try {
                f d6 = d(bArr);
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e7);
                return d6;
            } catch (IOException unused2) {
                throw e7;
            }
        }
    }

    public I2.b f() {
        c cVar = new c();
        try {
            boolean a6 = c.a((String) this.d);
            try {
                return cVar.c((String) this.d);
            } catch (GeneralSecurityException | ProviderException e6) {
                if (a6) {
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e6);
                    return null;
                }
                throw new KeyStoreException(C0552a.o("the master key ", (String) this.d, " exists but is unusable"), e6);
            }
        } catch (GeneralSecurityException | ProviderException e7) {
            Log.w("a", "cannot use Android Keystore, it'll be disabled", e7);
            return null;
        }
    }

    public Object get() {
        return new i((Context) ((C0484c) this.f9290a).f7573a, (d1.f) ((C0797a) this.f9291b).get(), (d) ((C0797a) this.f9292c).get(), (i1.d) ((c1.i) this.d).get(), (Executor) ((C0797a) this.f9293e).get(), (C0758c) ((C0797a) this.f9294f).get(), new androidx.fragment.app.D(21), new v(21), (C0607c) ((C0797a) this.f9295p).get());
    }
}
