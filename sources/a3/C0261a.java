package a3;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import androidx.emoji2.text.m;
import androidx.emoji2.text.t;
import b5.i;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.utils.L;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.q;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import r3.b;

/* renamed from: a3.a  reason: case insensitive filesystem */
public final class C0261a implements m, b4.m, q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4561a;

    /* renamed from: b  reason: collision with root package name */
    public String f4562b;

    public /* synthetic */ C0261a() {
        this.f4561a = 5;
    }

    public boolean b(CharSequence charSequence, int i2, int i5, t tVar) {
        if (!TextUtils.equals(charSequence.subSequence(i2, i5), this.f4562b)) {
            return true;
        }
        tVar.f4962c = (tVar.f4962c & 3) | 4;
        return false;
    }

    public Object n() {
        throw new RuntimeException(this.f4562b);
    }

    public String toString() {
        boolean z3;
        switch (this.f4561a) {
            case 4:
                StringBuilder sb = new StringBuilder("MasterKey{keyAlias=");
                String str = this.f4562b;
                sb.append(str);
                sb.append(", isKeyStoreBacked=");
                try {
                    KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                    instance.load((KeyStore.LoadStoreParameter) null);
                    z3 = instance.containsAlias(str);
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    z3 = false;
                }
                sb.append(z3);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(C0587c cVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0586b c3 = cVar.c();
        int i2 = 0;
        while (true) {
            Iterator it2 = c3.f8276a;
            if (it2.hasNext()) {
                v3.q qVar = (v3.q) it2.next();
                c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                i iVar = (i) b.c(i.class, v3.m.t(qVar.f12305b).f12296a.getValue());
                if (iVar != null) {
                    if (arrayList.contains(Integer.valueOf(iVar.getId()))) {
                        i2 -= ((Integer) arrayList2.get(arrayList.indexOf(Integer.valueOf(iVar.getId())))).intValue();
                    }
                    int level = iVar.getLevel() + i2;
                    arrayList.add(Integer.valueOf(iVar.getId()));
                    arrayList2.add(Integer.valueOf(iVar.getLevel()));
                    i2 = level;
                }
            } else {
                C0590f c6 = a.c(C0592h.b().e(), "players");
                String str = this.f4562b;
                c6.E(str).E("skillsObject").E("meritsFromMedals").I(Integer.valueOf(i2)).addOnSuccessListener(new L(this, i2, 1));
                android.support.v4.media.session.a.C0(2, 2, (long) i2, str);
                return;
            }
        }
    }

    public /* synthetic */ C0261a(String str, int i2) {
        this.f4561a = i2;
        this.f4562b = str;
    }

    public C0261a(Object obj, String str) {
        this.f4561a = 4;
        this.f4562b = str;
        KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) obj;
    }

    public Object a() {
        return this;
    }

    public void B(C0588d dVar) {
    }
}
