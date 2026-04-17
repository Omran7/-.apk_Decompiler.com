package o0;

import P2.f;
import android.content.SharedPreferences;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import o3.d;

public final class a implements SharedPreferences.Editor {

    /* renamed from: a  reason: collision with root package name */
    public final b f10417a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences.Editor f10418b;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f10419c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    public a(b bVar, SharedPreferences.Editor editor) {
        this.f10417a = bVar;
        this.f10418b = editor;
        this.f10419c = new CopyOnWriteArrayList();
    }

    public final void a() {
        if (this.d.getAndSet(false)) {
            b bVar = this.f10417a;
            for (String str : ((HashMap) bVar.getAll()).keySet()) {
                if (!this.f10419c.contains(str) && !b.d(str)) {
                    this.f10418b.remove(bVar.b(str));
                }
            }
        }
    }

    public final void apply() {
        a();
        this.f10418b.apply();
        b();
        this.f10419c.clear();
    }

    public final void b() {
        b bVar = this.f10417a;
        Iterator it2 = bVar.f10421b.iterator();
        while (it2.hasNext()) {
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it2.next();
            Iterator it3 = this.f10419c.iterator();
            while (it3.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(bVar, (String) it3.next());
            }
        }
    }

    public final void c(String str, byte[] bArr) {
        b bVar = this.f10417a;
        bVar.getClass();
        if (!b.d(str)) {
            this.f10419c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String b6 = bVar.b(str);
                Pair pair = new Pair(b6, new String(f.b(bVar.f10422c.a(bArr, b6.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                this.f10418b.putString((String) pair.first, (String) pair.second);
            } catch (UnsupportedEncodingException e6) {
                throw new AssertionError(e6);
            } catch (GeneralSecurityException e7) {
                throw new SecurityException("Could not encrypt data: " + e7.getMessage(), e7);
            }
        } else {
            throw new SecurityException(d.f(str, " is a reserved key for the encryption keyset."));
        }
    }

    public final SharedPreferences.Editor clear() {
        this.d.set(true);
        return this;
    }

    public final boolean commit() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10419c;
        a();
        try {
            return this.f10418b.commit();
        } finally {
            b();
            copyOnWriteArrayList.clear();
        }
    }

    public final SharedPreferences.Editor putBoolean(String str, boolean z3) {
        ByteBuffer allocate = ByteBuffer.allocate(5);
        allocate.putInt(5);
        allocate.put(z3 ? (byte) 1 : 0);
        c(str, allocate.array());
        return this;
    }

    public final SharedPreferences.Editor putFloat(String str, float f6) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(4);
        allocate.putFloat(f6);
        c(str, allocate.array());
        return this;
    }

    public final SharedPreferences.Editor putInt(String str, int i2) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(2);
        allocate.putInt(i2);
        c(str, allocate.array());
        return this;
    }

    public final SharedPreferences.Editor putLong(String str, long j6) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.putInt(3);
        allocate.putLong(j6);
        c(str, allocate.array());
        return this;
    }

    public final SharedPreferences.Editor putString(String str, String str2) {
        if (str2 == null) {
            str2 = "__NULL__";
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        ByteBuffer allocate = ByteBuffer.allocate(length + 8);
        allocate.putInt(0);
        allocate.putInt(length);
        allocate.put(bytes);
        c(str, allocate.array());
        return this;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.SharedPreferences.Editor putStringSet(java.lang.String r5, java.util.Set<java.lang.String> r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x000d
            n.f r6 = new n.f
            r0 = 0
            r6.<init>(r0)
            java.lang.String r0 = "__NULL__"
            r6.add(r0)
        L_0x000d:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            int r1 = r6.size()
            int r1 = r1 * 4
            java.util.Iterator r6 = r6.iterator()
        L_0x0020:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r3)
            r0.add(r2)
            int r2 = r2.length
            int r1 = r1 + r2
            goto L_0x0020
        L_0x0038:
            int r1 = r1 + 4
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r1)
            r1 = 1
            r6.putInt(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0046:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            byte[] r1 = (byte[]) r1
            int r2 = r1.length
            r6.putInt(r2)
            r6.put(r1)
            goto L_0x0046
        L_0x005a:
            byte[] r6 = r6.array()
            r4.c(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.a.putStringSet(java.lang.String, java.util.Set):android.content.SharedPreferences$Editor");
    }

    public final SharedPreferences.Editor remove(String str) {
        b bVar = this.f10417a;
        bVar.getClass();
        if (!b.d(str)) {
            this.f10418b.remove(bVar.b(str));
            this.f10419c.add(str);
            return this;
        }
        throw new SecurityException(d.f(str, " is a reserved key for the encryption keyset."));
    }
}
