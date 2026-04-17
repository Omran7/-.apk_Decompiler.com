package P2;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

public final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2174a;

    /* renamed from: b  reason: collision with root package name */
    public final k f2175b;

    public /* synthetic */ h(k kVar, int i2) {
        this.f2174a = i2;
        this.f2175b = kVar;
    }

    public final Object b(String str) {
        switch (this.f2174a) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < 2; i2++) {
                    Provider provider = Security.getProvider(strArr[i2]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                Iterator it2 = arrayList.iterator();
                Exception exc = null;
                while (true) {
                    boolean hasNext = it2.hasNext();
                    k kVar = this.f2175b;
                    if (!hasNext) {
                        return kVar.b(str, (Provider) null);
                    }
                    try {
                        return kVar.b(str, (Provider) it2.next());
                    } catch (Exception e6) {
                        if (exc == null) {
                            exc = e6;
                        }
                    }
                }
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                for (int i5 = 0; i5 < 3; i5++) {
                    Provider provider2 = Security.getProvider(strArr2[i5]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                Exception exc2 = null;
                while (it3.hasNext()) {
                    try {
                        return this.f2175b.b(str, (Provider) it3.next());
                    } catch (Exception e7) {
                        if (exc2 == null) {
                            exc2 = e7;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc2);
        }
    }
}
