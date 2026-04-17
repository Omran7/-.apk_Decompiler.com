package o0;

import B0.C0009h;
import C2.a;
import C2.c;
import C2.n;
import D2.f;
import D2.h;
import O2.F;
import a3.C0261a;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k.e1;
import o3.d;
import q.C0928e;

public final class b implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f10420a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f10421b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final a f10422c;
    public final c d;

    public b(SharedPreferences sharedPreferences, a aVar, c cVar) {
        this.f10420a = sharedPreferences;
        this.f10422c = aVar;
        this.d = cVar;
    }

    public static b a(Context context, C0261a aVar) {
        C0009h c3;
        C0009h c6;
        String str = aVar.f4562b;
        int i2 = H2.a.f996a;
        n.g(H2.c.f1001b);
        if (!G2.a.f836b.get()) {
            n.e(new h(F.class, new f[]{new f(9, c.class)}, 8), true);
        }
        D2.a.a();
        Context applicationContext = context.getApplicationContext();
        e1 e1Var = new e1();
        e1Var.f9294f = C2.b.a("AES256_SIV");
        if (applicationContext != null) {
            e1Var.f9290a = applicationContext;
            e1Var.f9291b = "__androidx_security_crypto_encrypted_prefs_key_keyset__";
            e1Var.f9292c = "s_pref";
            String i5 = d.i("android-keystore://", str);
            if (i5.startsWith("android-keystore://")) {
                e1Var.d = i5;
                I2.a a6 = e1Var.a();
                synchronized (a6) {
                    c3 = a6.f1156a.c();
                }
                e1 e1Var2 = new e1();
                e1Var2.f9294f = C2.b.a("AES256_GCM");
                e1Var2.f9290a = applicationContext;
                e1Var2.f9291b = "__androidx_security_crypto_encrypted_prefs_value_keyset__";
                e1Var2.f9292c = "s_pref";
                String i6 = d.i("android-keystore://", str);
                if (i6.startsWith("android-keystore://")) {
                    e1Var2.d = i6;
                    I2.a a7 = e1Var2.a();
                    synchronized (a7) {
                        c6 = a7.f1156a.c();
                    }
                    a aVar2 = (a) c6.x(a.class);
                    return new b(applicationContext.getSharedPreferences("s_pref", 0), aVar2, (c) c3.x(c.class));
                }
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public static boolean d(String str) {
        if ("__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str)) {
            return true;
        }
        return false;
    }

    public final String b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return new String(P2.f.b(this.d.a(str.getBytes(StandardCharsets.UTF_8), "s_pref".getBytes())), "US-ASCII");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        } catch (GeneralSecurityException e7) {
            throw new SecurityException("Could not encrypt key. " + e7.getMessage(), e7);
        }
    }

    public final Object c(String str) {
        int i2;
        String str2;
        if (!d(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String b6 = b(str);
                String string = this.f10420a.getString(b6, (String) null);
                if (string == null) {
                    return null;
                }
                byte[] a6 = P2.f.a(string);
                a aVar = this.f10422c;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer wrap = ByteBuffer.wrap(aVar.b(a6, b6.getBytes(charset)));
                boolean z3 = false;
                wrap.position(0);
                int i5 = wrap.getInt();
                if (i5 == 0) {
                    i2 = 1;
                } else if (i5 == 1) {
                    i2 = 2;
                } else if (i5 == 2) {
                    i2 = 3;
                } else if (i5 == 3) {
                    i2 = 4;
                } else if (i5 == 4) {
                    i2 = 5;
                } else if (i5 != 5) {
                    i2 = 0;
                } else {
                    i2 = 6;
                }
                if (i2 != 0) {
                    int c3 = C0928e.c(i2);
                    if (c3 == 0) {
                        int i6 = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        wrap.limit(i6);
                        String charBuffer = charset.decode(slice).toString();
                        if (charBuffer.equals("__NULL__")) {
                            return null;
                        }
                        return charBuffer;
                    } else if (c3 == 1) {
                        n.f fVar = new n.f(0);
                        while (wrap.hasRemaining()) {
                            int i7 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            slice2.limit(i7);
                            wrap.position(wrap.position() + i7);
                            fVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                        }
                        if (fVar.f10218c != 1 || !"__NULL__".equals(fVar.f10217b[0])) {
                            return fVar;
                        }
                        return null;
                    } else if (c3 == 2) {
                        return Integer.valueOf(wrap.getInt());
                    } else {
                        if (c3 == 3) {
                            return Long.valueOf(wrap.getLong());
                        }
                        if (c3 == 4) {
                            return Float.valueOf(wrap.getFloat());
                        }
                        if (c3 == 5) {
                            if (wrap.get() != 0) {
                                z3 = true;
                            }
                            return Boolean.valueOf(z3);
                        }
                        switch (i2) {
                            case 1:
                                str2 = "STRING";
                                break;
                            case 2:
                                str2 = "STRING_SET";
                                break;
                            case 3:
                                str2 = "INT";
                                break;
                            case 4:
                                str2 = "LONG";
                                break;
                            case 5:
                                str2 = "FLOAT";
                                break;
                            case zzaky.zzf.zzf:
                                str2 = "BOOLEAN";
                                break;
                            default:
                                str2 = "null";
                                break;
                        }
                        throw new SecurityException("Unhandled type for encrypted pref value: ".concat(str2));
                    }
                } else {
                    throw new SecurityException("Unknown type ID for encrypted pref value: " + i5);
                }
            } catch (GeneralSecurityException e6) {
                throw new SecurityException("Could not decrypt value. " + e6.getMessage(), e6);
            }
        } else {
            throw new SecurityException(d.f(str, " is a reserved key for the encryption keyset."));
        }
    }

    public final boolean contains(String str) {
        if (!d(str)) {
            return this.f10420a.contains(b(str));
        }
        throw new SecurityException(d.f(str, " is a reserved key for the encryption keyset."));
    }

    public final SharedPreferences.Editor edit() {
        return new a(this, this.f10420a.edit());
    }

    public final Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f10420a.getAll().entrySet()) {
            if (!d((String) next.getKey())) {
                try {
                    String str = new String(this.d.b(P2.f.a((String) next.getKey()), "s_pref".getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, c(str));
                } catch (GeneralSecurityException e6) {
                    throw new SecurityException("Could not decrypt key. " + e6.getMessage(), e6);
                }
            }
        }
        return hashMap;
    }

    public final boolean getBoolean(String str, boolean z3) {
        Object c3 = c(str);
        if (c3 instanceof Boolean) {
            return ((Boolean) c3).booleanValue();
        }
        return z3;
    }

    public final float getFloat(String str, float f6) {
        Object c3 = c(str);
        if (c3 instanceof Float) {
            return ((Float) c3).floatValue();
        }
        return f6;
    }

    public final int getInt(String str, int i2) {
        Object c3 = c(str);
        if (c3 instanceof Integer) {
            return ((Integer) c3).intValue();
        }
        return i2;
    }

    public final long getLong(String str, long j6) {
        Object c3 = c(str);
        if (c3 instanceof Long) {
            return ((Long) c3).longValue();
        }
        return j6;
    }

    public final String getString(String str, String str2) {
        Object c3 = c(str);
        if (c3 instanceof String) {
            return (String) c3;
        }
        return str2;
    }

    public final Set getStringSet(String str, Set set) {
        Set set2;
        Object c3 = c(str);
        if (c3 instanceof Set) {
            set2 = (Set) c3;
        } else {
            set2 = new n.f(0);
        }
        if (set2.size() > 0) {
            return set2;
        }
        return set;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f10421b.add(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f10421b.remove(onSharedPreferenceChangeListener);
    }
}
